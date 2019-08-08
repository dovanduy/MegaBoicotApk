package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener.EventDispatcher;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.drm.DrmSession.DrmSessionException;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@TargetApi(18)
public class DefaultDrmSessionManager<T extends ExoMediaCrypto> implements ProvisioningManager<T>, DrmSessionManager<T> {
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final String TAG = "DefaultDrmSessionMgr";
    private final MediaDrmCallback callback;
    private final EventDispatcher eventDispatcher;
    private final int initialDrmRequestRetryCount;
    private final ExoMediaDrm<T> mediaDrm;
    volatile MediaDrmHandler mediaDrmHandler;
    /* access modifiers changed from: private */
    public int mode;
    private final boolean multiSession;
    private byte[] offlineLicenseKeySetId;
    private final HashMap<String, String> optionalKeyRequestParameters;
    private Looper playbackLooper;
    private final List<DefaultDrmSession<T>> provisioningSessions;
    /* access modifiers changed from: private */
    public final List<DefaultDrmSession<T>> sessions;
    private final UUID uuid;

    @Deprecated
    public interface EventListener extends DefaultDrmSessionEventListener {
    }

    private class MediaDrmEventListener implements OnEventListener<T> {
        private MediaDrmEventListener() {
        }

        public void onEvent(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
            if (DefaultDrmSessionManager.this.mode == 0) {
                DefaultDrmSessionManager.this.mediaDrmHandler.obtainMessage(i, bArr).sendToTarget();
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class MediaDrmHandler extends Handler {
        public MediaDrmHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.sessions) {
                if (defaultDrmSession.hasSessionId(bArr)) {
                    defaultDrmSession.onMediaDrmEvent(message.what);
                    return;
                }
            }
        }
    }

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            StringBuilder sb = new StringBuilder();
            sb.append("Media does not support uuid: ");
            sb.append(uuid);
            super(sb.toString());
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    @Deprecated
    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newWidevineInstance(MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) throws UnsupportedDrmException {
        DefaultDrmSessionManager<FrameworkMediaCrypto> newWidevineInstance = newWidevineInstance(mediaDrmCallback, hashMap);
        if (!(handler == null || defaultDrmSessionEventListener == null)) {
            newWidevineInstance.addListener(handler, defaultDrmSessionEventListener);
        }
        return newWidevineInstance;
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newWidevineInstance(MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap) throws UnsupportedDrmException {
        return newFrameworkInstance(C2793C.WIDEVINE_UUID, mediaDrmCallback, hashMap);
    }

    @Deprecated
    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newPlayReadyInstance(MediaDrmCallback mediaDrmCallback, String str, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) throws UnsupportedDrmException {
        DefaultDrmSessionManager<FrameworkMediaCrypto> newPlayReadyInstance = newPlayReadyInstance(mediaDrmCallback, str);
        if (!(handler == null || defaultDrmSessionEventListener == null)) {
            newPlayReadyInstance.addListener(handler, defaultDrmSessionEventListener);
        }
        return newPlayReadyInstance;
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newPlayReadyInstance(MediaDrmCallback mediaDrmCallback, String str) throws UnsupportedDrmException {
        HashMap hashMap;
        if (!TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
            hashMap.put(PLAYREADY_CUSTOM_DATA_KEY, str);
        } else {
            hashMap = null;
        }
        return newFrameworkInstance(C2793C.PLAYREADY_UUID, mediaDrmCallback, hashMap);
    }

    @Deprecated
    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newFrameworkInstance(UUID uuid2, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) throws UnsupportedDrmException {
        DefaultDrmSessionManager<FrameworkMediaCrypto> newFrameworkInstance = newFrameworkInstance(uuid2, mediaDrmCallback, hashMap);
        if (!(handler == null || defaultDrmSessionEventListener == null)) {
            newFrameworkInstance.addListener(handler, defaultDrmSessionEventListener);
        }
        return newFrameworkInstance;
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newFrameworkInstance(UUID uuid2, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap) throws UnsupportedDrmException {
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(uuid2, (ExoMediaDrm<T>) FrameworkMediaDrm.newInstance(uuid2), mediaDrmCallback, hashMap, false, 3);
        return defaultDrmSessionManager;
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid2, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
        this(uuid2, exoMediaDrm, mediaDrmCallback, hashMap);
        if (handler != null && defaultDrmSessionEventListener != null) {
            addListener(handler, defaultDrmSessionEventListener);
        }
    }

    public DefaultDrmSessionManager(UUID uuid2, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap) {
        this(uuid2, exoMediaDrm, mediaDrmCallback, hashMap, false, 3);
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid2, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener, boolean z) {
        this(uuid2, exoMediaDrm, mediaDrmCallback, hashMap, z);
        if (handler != null && defaultDrmSessionEventListener != null) {
            addListener(handler, defaultDrmSessionEventListener);
        }
    }

    public DefaultDrmSessionManager(UUID uuid2, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, boolean z) {
        this(uuid2, exoMediaDrm, mediaDrmCallback, hashMap, z, 3);
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid2, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener, boolean z, int i) {
        this(uuid2, exoMediaDrm, mediaDrmCallback, hashMap, z, i);
        if (handler != null && defaultDrmSessionEventListener != null) {
            addListener(handler, defaultDrmSessionEventListener);
        }
    }

    public DefaultDrmSessionManager(UUID uuid2, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, boolean z, int i) {
        Assertions.checkNotNull(uuid2);
        Assertions.checkNotNull(exoMediaDrm);
        Assertions.checkArgument(!C2793C.COMMON_PSSH_UUID.equals(uuid2), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid2;
        this.mediaDrm = exoMediaDrm;
        this.callback = mediaDrmCallback;
        this.optionalKeyRequestParameters = hashMap;
        this.eventDispatcher = new EventDispatcher();
        this.multiSession = z;
        this.initialDrmRequestRetryCount = i;
        this.mode = 0;
        this.sessions = new ArrayList();
        this.provisioningSessions = new ArrayList();
        if (z) {
            exoMediaDrm.setPropertyString("sessionSharing", "enable");
        }
        exoMediaDrm.setOnEventListener(new MediaDrmEventListener());
    }

    public final void addListener(Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
        this.eventDispatcher.addListener(handler, defaultDrmSessionEventListener);
    }

    public final void removeListener(DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
        this.eventDispatcher.removeListener(defaultDrmSessionEventListener);
    }

    public final String getPropertyString(String str) {
        return this.mediaDrm.getPropertyString(str);
    }

    public final void setPropertyString(String str, String str2) {
        this.mediaDrm.setPropertyString(str, str2);
    }

    public final byte[] getPropertyByteArray(String str) {
        return this.mediaDrm.getPropertyByteArray(str);
    }

    public final void setPropertyByteArray(String str, byte[] bArr) {
        this.mediaDrm.setPropertyByteArray(str, bArr);
    }

    public void setMode(int i, byte[] bArr) {
        Assertions.checkState(this.sessions.isEmpty());
        if (i == 1 || i == 3) {
            Assertions.checkNotNull(bArr);
        }
        this.mode = i;
        this.offlineLicenseKeySetId = bArr;
    }

    public boolean canAcquireSession(DrmInitData drmInitData) {
        boolean z = true;
        if (this.offlineLicenseKeySetId != null) {
            return true;
        }
        if (getSchemeData(drmInitData, this.uuid, true) == null) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.get(0).matches(C2793C.COMMON_PSSH_UUID)) {
                return false;
            }
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(this.uuid);
            Log.w(str, sb.toString());
        }
        String str2 = drmInitData.schemeType;
        if (str2 == null || C2793C.CENC_TYPE_cenc.equals(str2)) {
            return true;
        }
        if (!C2793C.CENC_TYPE_cbc1.equals(str2) && !C2793C.CENC_TYPE_cbcs.equals(str2) && !C2793C.CENC_TYPE_cens.equals(str2)) {
            return true;
        }
        if (Util.SDK_INT < 25) {
            z = false;
        }
        return z;
    }

    public DrmSession<T> acquireSession(Looper looper, DrmInitData drmInitData) {
        SchemeData schemeData;
        DefaultDrmSession defaultDrmSession;
        Assertions.checkState(this.playbackLooper == null || this.playbackLooper == looper);
        if (this.sessions.isEmpty()) {
            this.playbackLooper = looper;
            if (this.mediaDrmHandler == null) {
                this.mediaDrmHandler = new MediaDrmHandler<>(looper);
            }
        }
        DefaultDrmSession defaultDrmSession2 = null;
        if (this.offlineLicenseKeySetId == null) {
            SchemeData schemeData2 = getSchemeData(drmInitData, this.uuid, false);
            if (schemeData2 == null) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.uuid);
                this.eventDispatcher.drmSessionManagerError(missingSchemeDataException);
                return new ErrorStateDrmSession(new DrmSessionException(missingSchemeDataException));
            }
            schemeData = schemeData2;
        } else {
            schemeData = null;
        }
        if (this.multiSession) {
            byte[] bArr = schemeData != null ? schemeData.data : null;
            Iterator it = this.sessions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession defaultDrmSession3 = (DefaultDrmSession) it.next();
                if (defaultDrmSession3.hasInitData(bArr)) {
                    defaultDrmSession2 = defaultDrmSession3;
                    break;
                }
            }
        } else if (!this.sessions.isEmpty()) {
            defaultDrmSession2 = (DefaultDrmSession) this.sessions.get(0);
        }
        if (defaultDrmSession2 == null) {
            defaultDrmSession = new DefaultDrmSession(this.uuid, this.mediaDrm, this, schemeData, this.mode, this.offlineLicenseKeySetId, this.optionalKeyRequestParameters, this.callback, looper, this.eventDispatcher, this.initialDrmRequestRetryCount);
            this.sessions.add(defaultDrmSession);
        } else {
            defaultDrmSession = defaultDrmSession2;
        }
        defaultDrmSession.acquire();
        return defaultDrmSession;
    }

    public void releaseSession(DrmSession<T> drmSession) {
        if (!(drmSession instanceof ErrorStateDrmSession)) {
            DefaultDrmSession defaultDrmSession = (DefaultDrmSession) drmSession;
            if (defaultDrmSession.release()) {
                this.sessions.remove(defaultDrmSession);
                if (this.provisioningSessions.size() > 1 && this.provisioningSessions.get(0) == defaultDrmSession) {
                    ((DefaultDrmSession) this.provisioningSessions.get(1)).provision();
                }
                this.provisioningSessions.remove(defaultDrmSession);
            }
        }
    }

    public void provisionRequired(DefaultDrmSession<T> defaultDrmSession) {
        this.provisioningSessions.add(defaultDrmSession);
        if (this.provisioningSessions.size() == 1) {
            defaultDrmSession.provision();
        }
    }

    public void onProvisionCompleted() {
        for (DefaultDrmSession onProvisionCompleted : this.provisioningSessions) {
            onProvisionCompleted.onProvisionCompleted();
        }
        this.provisioningSessions.clear();
    }

    public void onProvisionError(Exception exc) {
        for (DefaultDrmSession onProvisionError : this.provisioningSessions) {
            onProvisionError.onProvisionError(exc);
        }
        this.provisioningSessions.clear();
    }

    private static SchemeData getSchemeData(DrmInitData drmInitData, UUID uuid2, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= drmInitData.schemeDataCount) {
                break;
            }
            SchemeData schemeData = drmInitData.get(i);
            if (!schemeData.matches(uuid2) && (!C2793C.CLEARKEY_UUID.equals(uuid2) || !schemeData.matches(C2793C.COMMON_PSSH_UUID))) {
                z2 = false;
            }
            if (z2 && (schemeData.data != null || z)) {
                arrayList.add(schemeData);
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (C2793C.WIDEVINE_UUID.equals(uuid2)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                SchemeData schemeData2 = (SchemeData) arrayList.get(i2);
                int parseVersion = schemeData2.hasData() ? PsshAtomUtil.parseVersion(schemeData2.data) : -1;
                if (Util.SDK_INT < 23 && parseVersion == 0) {
                    return schemeData2;
                }
                if (Util.SDK_INT >= 23 && parseVersion == 1) {
                    return schemeData2;
                }
            }
        }
        return (SchemeData) arrayList.get(0);
    }
}
