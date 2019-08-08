package com.facebook.ads.internal.p095v.p097b.p098a;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.internal.v.b.a.e */
abstract class C1882e implements C1876a {

    /* renamed from: a */
    private final ExecutorService f5940a = Executors.newSingleThreadExecutor();

    /* renamed from: com.facebook.ads.internal.v.b.a.e$a */
    private class C1883a implements Callable<Void> {

        /* renamed from: b */
        private final File f5942b;

        public C1883a(File file) {
            this.f5942b = file;
        }

        /* renamed from: a */
        public Void call() {
            C1882e.m7888a(C1882e.this, this.f5942b);
            return null;
        }
    }

    C1882e() {
    }

    /* renamed from: a */
    static /* synthetic */ void m7888a(C1882e eVar, File file) {
        if (file.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!file.setLastModified(currentTimeMillis)) {
                long length = file.length();
                if (length != 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
                    long j = length - 1;
                    randomAccessFile.seek(j);
                    byte readByte = randomAccessFile.readByte();
                    randomAccessFile.seek(j);
                    randomAccessFile.write(readByte);
                    randomAccessFile.close();
                } else if (!file.delete() || !file.createNewFile()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error recreate zero-size file ");
                    sb.append(file);
                    throw new IOException(sb.toString());
                }
                if (file.lastModified() < currentTimeMillis) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error set last modified date to ");
                    sb2.append(file);
                    throw new IOException(sb2.toString());
                }
            }
        }
        File parentFile = file.getParentFile();
        List linkedList = new LinkedList();
        File[] listFiles = parentFile.listFiles();
        if (listFiles != null) {
            linkedList = Arrays.asList(listFiles);
            Collections.sort(linkedList, new C1881a());
        }
        eVar.m7889a(linkedList);
    }

    /* renamed from: a */
    private void m7889a(List<File> list) {
        long j = 0;
        for (File length : list) {
            j += length.length();
        }
        int size = list.size();
        for (File file : list) {
            if (!mo7920a(file, j, size)) {
                long length2 = file.length();
                if (file.delete()) {
                    size--;
                    long j2 = j - length2;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cache file ");
                    sb.append(file);
                    sb.append(" is deleted because it exceeds cache limit");
                    Log.i("ProxyCache", sb.toString());
                    j = j2;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error deleting file ");
                    sb2.append(file);
                    sb2.append(" for trimming cache");
                    Log.e("ProxyCache", sb2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo7916a(File file) {
        this.f5940a.submit(new C1883a(file));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo7920a(File file, long j, int i);
}
