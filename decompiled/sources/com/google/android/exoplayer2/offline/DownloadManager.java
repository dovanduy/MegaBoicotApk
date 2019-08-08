package com.google.android.exoplayer2.offline;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.offline.DownloadAction.Deserializer;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class DownloadManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_MAX_SIMULTANEOUS_DOWNLOADS = 1;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    private static final String TAG = "DownloadManager";
    /* access modifiers changed from: private */
    public final ActionFile actionFile;
    private final ArrayList<Task> activeDownloadTasks;
    /* access modifiers changed from: private */
    public final Deserializer[] deserializers;
    /* access modifiers changed from: private */
    public final DownloaderConstructorHelper downloaderConstructorHelper;
    private boolean downloadsStopped;
    private final Handler fileIOHandler;
    private final HandlerThread fileIOThread;
    /* access modifiers changed from: private */
    public final Handler handler;
    /* access modifiers changed from: private */
    public boolean initialized;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<Listener> listeners;
    private final int maxActiveDownloadTasks;
    private final int minRetryCount;
    private int nextTaskId;
    /* access modifiers changed from: private */
    public boolean released;
    /* access modifiers changed from: private */
    public final ArrayList<Task> tasks;

    public interface Listener {
        void onIdle(DownloadManager downloadManager);

        void onInitialized(DownloadManager downloadManager);

        void onTaskStateChanged(DownloadManager downloadManager, TaskState taskState);
    }

    private static final class Task implements Runnable {
        public static final int STATE_QUEUED_CANCELING = 5;
        public static final int STATE_STARTED_CANCELING = 6;
        public static final int STATE_STARTED_STOPPING = 7;
        /* access modifiers changed from: private */
        public final DownloadAction action;
        /* access modifiers changed from: private */
        public volatile int currentState;
        private final DownloadManager downloadManager;
        private volatile Downloader downloader;
        private Throwable error;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public final int f8642id;
        private final int minRetryCount;
        private Thread thread;

        @Retention(RetentionPolicy.SOURCE)
        public @interface InternalState {
        }

        private Task(int i, DownloadManager downloadManager2, DownloadAction downloadAction, int i2) {
            this.f8642id = i;
            this.downloadManager = downloadManager2;
            this.action = downloadAction;
            this.currentState = 0;
            this.minRetryCount = i2;
        }

        public TaskState getDownloadState() {
            TaskState taskState = new TaskState(this.f8642id, this.action, getExternalState(), getDownloadPercentage(), getDownloadedBytes(), this.error);
            return taskState;
        }

        public boolean isFinished() {
            return this.currentState == 4 || this.currentState == 2 || this.currentState == 3;
        }

        public boolean isActive() {
            return this.currentState == 5 || this.currentState == 1 || this.currentState == 7 || this.currentState == 6;
        }

        public float getDownloadPercentage() {
            if (this.downloader != null) {
                return this.downloader.getDownloadPercentage();
            }
            return -1.0f;
        }

        public long getDownloadedBytes() {
            if (this.downloader != null) {
                return this.downloader.getDownloadedBytes();
            }
            return 0;
        }

        public String toString() {
            return super.toString();
        }

        private static String toString(byte[] bArr) {
            if (bArr.length > 100) {
                return "<data is too long>";
            }
            StringBuilder sb = new StringBuilder();
            sb.append('\'');
            sb.append(Util.fromUtf8Bytes(bArr));
            sb.append('\'');
            return sb.toString();
        }

        private String getStateString() {
            switch (this.currentState) {
                case 5:
                case 6:
                    return "CANCELING";
                case 7:
                    return "STOPPING";
                default:
                    return TaskState.getStateString(this.currentState);
            }
        }

        private int getExternalState() {
            switch (this.currentState) {
                case 5:
                    return 0;
                case 6:
                case 7:
                    return 1;
                default:
                    return this.currentState;
            }
        }

        /* access modifiers changed from: private */
        public void start() {
            if (changeStateAndNotify(0, 1)) {
                this.thread = new Thread(this);
                this.thread.start();
            }
        }

        /* access modifiers changed from: private */
        public boolean canStart() {
            return this.currentState == 0;
        }

        /* access modifiers changed from: private */
        public void cancel() {
            if (changeStateAndNotify(0, 5)) {
                this.downloadManager.handler.post(new Runnable() {
                    public void run() {
                        Task.this.changeStateAndNotify(5, 3);
                    }
                });
            } else if (changeStateAndNotify(1, 6)) {
                cancelDownload();
            }
        }

        /* access modifiers changed from: private */
        public void stop() {
            if (changeStateAndNotify(1, 7)) {
                DownloadManager.logd("Stopping", this);
                this.thread.interrupt();
            }
        }

        /* access modifiers changed from: private */
        public boolean changeStateAndNotify(int i, int i2) {
            return changeStateAndNotify(i, i2, null);
        }

        /* access modifiers changed from: private */
        public boolean changeStateAndNotify(int i, int i2, Throwable th) {
            boolean z = false;
            if (this.currentState != i) {
                return false;
            }
            this.currentState = i2;
            this.error = th;
            if (this.currentState != getExternalState()) {
                z = true;
            }
            if (!z) {
                this.downloadManager.onTaskStateChange(this);
            }
            return true;
        }

        private void cancelDownload() {
            if (this.downloader != null) {
                this.downloader.cancel();
            }
            this.thread.interrupt();
        }

        public void run() {
            long j;
            int i;
            DownloadManager.logd("Task is started", this);
            try {
                this.downloader = this.action.createDownloader(this.downloadManager.downloaderConstructorHelper);
                if (this.action.isRemoveAction) {
                    this.downloader.remove();
                } else {
                    j = -1;
                    i = 0;
                    while (!Thread.interrupted()) {
                        this.downloader.download();
                    }
                }
                th = null;
            } catch (IOException e) {
                long downloadedBytes = this.downloader.getDownloadedBytes();
                if (downloadedBytes != j) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Reset error count. downloadedBytes = ");
                    sb.append(downloadedBytes);
                    DownloadManager.logd(sb.toString(), this);
                    i = 0;
                    j = downloadedBytes;
                }
                if (this.currentState == 1) {
                    i++;
                    if (i <= this.minRetryCount) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Download error. Retry ");
                        sb2.append(i);
                        DownloadManager.logd(sb2.toString(), this);
                        Thread.sleep((long) getRetryDelayMillis(i));
                    }
                }
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            this.downloadManager.handler.post(new Runnable() {
                public void run() {
                    if (!Task.this.changeStateAndNotify(1, th != null ? 4 : 2, th) && !Task.this.changeStateAndNotify(6, 3) && !Task.this.changeStateAndNotify(7, 0)) {
                        throw new IllegalStateException();
                    }
                }
            });
        }

        private int getRetryDelayMillis(int i) {
            return Math.min((i - 1) * AdError.NETWORK_ERROR_CODE, 5000);
        }
    }

    public static final class TaskState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 2;
        public static final int STATE_FAILED = 4;
        public static final int STATE_QUEUED = 0;
        public static final int STATE_STARTED = 1;
        public final DownloadAction action;
        public final float downloadPercentage;
        public final long downloadedBytes;
        public final Throwable error;
        public final int state;
        public final int taskId;

        @Retention(RetentionPolicy.SOURCE)
        public @interface State {
        }

        public static String getStateString(int i) {
            switch (i) {
                case 0:
                    return "QUEUED";
                case 1:
                    return "STARTED";
                case 2:
                    return "COMPLETED";
                case 3:
                    return "CANCELED";
                case 4:
                    return "FAILED";
                default:
                    throw new IllegalStateException();
            }
        }

        private TaskState(int i, DownloadAction downloadAction, int i2, float f, long j, Throwable th) {
            this.taskId = i;
            this.action = downloadAction;
            this.state = i2;
            this.downloadPercentage = f;
            this.downloadedBytes = j;
            this.error = th;
        }
    }

    /* access modifiers changed from: private */
    public static void logd(String str) {
    }

    public DownloadManager(Cache cache, Factory factory, File file, Deserializer... deserializerArr) {
        this(new DownloaderConstructorHelper(cache, factory), file, deserializerArr);
    }

    public DownloadManager(DownloaderConstructorHelper downloaderConstructorHelper2, File file, Deserializer... deserializerArr) {
        this(downloaderConstructorHelper2, 1, 5, file, deserializerArr);
    }

    public DownloadManager(DownloaderConstructorHelper downloaderConstructorHelper2, int i, int i2, File file, Deserializer... deserializerArr) {
        Assertions.checkArgument(deserializerArr.length > 0, "At least one Deserializer is required.");
        this.downloaderConstructorHelper = downloaderConstructorHelper2;
        this.maxActiveDownloadTasks = i;
        this.minRetryCount = i2;
        this.actionFile = new ActionFile(file);
        this.deserializers = deserializerArr;
        this.downloadsStopped = true;
        this.tasks = new ArrayList<>();
        this.activeDownloadTasks = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        this.handler = new Handler(myLooper);
        this.fileIOThread = new HandlerThread("DownloadManager file i/o");
        this.fileIOThread.start();
        this.fileIOHandler = new Handler(this.fileIOThread.getLooper());
        this.listeners = new CopyOnWriteArraySet<>();
        loadActions();
        logd("Created");
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void startDownloads() {
        Assertions.checkState(!this.released);
        if (this.downloadsStopped) {
            this.downloadsStopped = false;
            maybeStartTasks();
            logd("Downloads are started");
        }
    }

    public void stopDownloads() {
        Assertions.checkState(!this.released);
        if (!this.downloadsStopped) {
            this.downloadsStopped = true;
            for (int i = 0; i < this.activeDownloadTasks.size(); i++) {
                ((Task) this.activeDownloadTasks.get(i)).stop();
            }
            logd("Downloads are stopping");
        }
    }

    public int handleAction(byte[] bArr) throws IOException {
        Assertions.checkState(!this.released);
        return handleAction(DownloadAction.deserializeFromStream(this.deserializers, new ByteArrayInputStream(bArr)));
    }

    public int handleAction(DownloadAction downloadAction) {
        Assertions.checkState(!this.released);
        Task addTaskForAction = addTaskForAction(downloadAction);
        if (this.initialized) {
            saveActions();
            maybeStartTasks();
            if (addTaskForAction.currentState == 0) {
                notifyListenersTaskStateChange(addTaskForAction);
            }
        }
        return addTaskForAction.f8642id;
    }

    public int getTaskCount() {
        Assertions.checkState(!this.released);
        return this.tasks.size();
    }

    public int getDownloadCount() {
        int i = 0;
        for (int i2 = 0; i2 < this.tasks.size(); i2++) {
            if (!((Task) this.tasks.get(i2)).action.isRemoveAction) {
                i++;
            }
        }
        return i;
    }

    public TaskState getTaskState(int i) {
        Assertions.checkState(!this.released);
        for (int i2 = 0; i2 < this.tasks.size(); i2++) {
            Task task = (Task) this.tasks.get(i2);
            if (task.f8642id == i) {
                return task.getDownloadState();
            }
        }
        return null;
    }

    public TaskState[] getAllTaskStates() {
        Assertions.checkState(!this.released);
        TaskState[] taskStateArr = new TaskState[this.tasks.size()];
        for (int i = 0; i < taskStateArr.length; i++) {
            taskStateArr[i] = ((Task) this.tasks.get(i)).getDownloadState();
        }
        return taskStateArr;
    }

    public boolean isInitialized() {
        Assertions.checkState(!this.released);
        return this.initialized;
    }

    public boolean isIdle() {
        Assertions.checkState(!this.released);
        if (!this.initialized) {
            return false;
        }
        for (int i = 0; i < this.tasks.size(); i++) {
            if (((Task) this.tasks.get(i)).isActive()) {
                return false;
            }
        }
        return true;
    }

    public void release() {
        if (!this.released) {
            this.released = true;
            for (int i = 0; i < this.tasks.size(); i++) {
                ((Task) this.tasks.get(i)).stop();
            }
            final ConditionVariable conditionVariable = new ConditionVariable();
            this.fileIOHandler.post(new Runnable() {
                public void run() {
                    conditionVariable.open();
                }
            });
            conditionVariable.block();
            this.fileIOThread.quit();
            logd("Released");
        }
    }

    /* access modifiers changed from: private */
    public Task addTaskForAction(DownloadAction downloadAction) {
        int i = this.nextTaskId;
        this.nextTaskId = i + 1;
        Task task = new Task(i, this, downloadAction, this.minRetryCount);
        this.tasks.add(task);
        logd("Task is added", task);
        return task;
    }

    /* access modifiers changed from: private */
    public void maybeStartTasks() {
        if (this.initialized && !this.released) {
            boolean z = this.downloadsStopped || this.activeDownloadTasks.size() == this.maxActiveDownloadTasks;
            for (int i = 0; i < this.tasks.size(); i++) {
                Task task = (Task) this.tasks.get(i);
                if (task.canStart()) {
                    DownloadAction access$300 = task.action;
                    boolean z2 = access$300.isRemoveAction;
                    if (z2 || !z) {
                        boolean z3 = true;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= i) {
                                break;
                            }
                            Task task2 = (Task) this.tasks.get(i2);
                            if (task2.action.isSameMedia(access$300)) {
                                if (z2) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(task);
                                    sb.append(" clashes with ");
                                    sb.append(task2);
                                    logd(sb.toString());
                                    task2.cancel();
                                    z3 = false;
                                } else if (task2.action.isRemoveAction) {
                                    z = true;
                                    z3 = false;
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (z3) {
                            task.start();
                            if (!z2) {
                                this.activeDownloadTasks.add(task);
                                z = this.activeDownloadTasks.size() == this.maxActiveDownloadTasks;
                            }
                        }
                    }
                }
            }
        }
    }

    private void maybeNotifyListenersIdle() {
        if (isIdle()) {
            logd("Notify idle state");
            Iterator it = this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onIdle(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void onTaskStateChange(Task task) {
        if (!this.released) {
            boolean z = !task.isActive();
            if (z) {
                this.activeDownloadTasks.remove(task);
            }
            notifyListenersTaskStateChange(task);
            if (task.isFinished()) {
                this.tasks.remove(task);
                saveActions();
            }
            if (z) {
                maybeStartTasks();
                maybeNotifyListenersIdle();
            }
        }
    }

    /* access modifiers changed from: private */
    public void notifyListenersTaskStateChange(Task task) {
        logd("Task state is changed", task);
        TaskState downloadState = task.getDownloadState();
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onTaskStateChanged(this, downloadState);
        }
    }

    private void loadActions() {
        this.fileIOHandler.post(new Runnable() {
            public void run() {
                final DownloadAction[] downloadActionArr;
                try {
                    downloadActionArr = DownloadManager.this.actionFile.load(DownloadManager.this.deserializers);
                    DownloadManager.logd("Action file is loaded.");
                } catch (Throwable th) {
                    Log.e(DownloadManager.TAG, "Action file loading failed.", th);
                    downloadActionArr = new DownloadAction[0];
                }
                DownloadManager.this.handler.post(new Runnable() {
                    public void run() {
                        if (!DownloadManager.this.released) {
                            ArrayList arrayList = new ArrayList(DownloadManager.this.tasks);
                            DownloadManager.this.tasks.clear();
                            for (DownloadAction access$1300 : downloadActionArr) {
                                DownloadManager.this.addTaskForAction(access$1300);
                            }
                            DownloadManager.logd("Tasks are created.");
                            DownloadManager.this.initialized = true;
                            Iterator it = DownloadManager.this.listeners.iterator();
                            while (it.hasNext()) {
                                ((Listener) it.next()).onInitialized(DownloadManager.this);
                            }
                            if (!arrayList.isEmpty()) {
                                DownloadManager.this.tasks.addAll(arrayList);
                                DownloadManager.this.saveActions();
                            }
                            DownloadManager.this.maybeStartTasks();
                            for (int i = 0; i < DownloadManager.this.tasks.size(); i++) {
                                Task task = (Task) DownloadManager.this.tasks.get(i);
                                if (task.currentState == 0) {
                                    DownloadManager.this.notifyListenersTaskStateChange(task);
                                }
                            }
                        }
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    public void saveActions() {
        if (!this.released) {
            final DownloadAction[] downloadActionArr = new DownloadAction[this.tasks.size()];
            for (int i = 0; i < this.tasks.size(); i++) {
                downloadActionArr[i] = ((Task) this.tasks.get(i)).action;
            }
            this.fileIOHandler.post(new Runnable() {
                public void run() {
                    try {
                        DownloadManager.this.actionFile.store(downloadActionArr);
                        DownloadManager.logd("Actions persisted.");
                    } catch (IOException e) {
                        Log.e(DownloadManager.TAG, "Persisting actions failed.", e);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static void logd(String str, Task task) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(task);
        logd(sb.toString());
    }
}
