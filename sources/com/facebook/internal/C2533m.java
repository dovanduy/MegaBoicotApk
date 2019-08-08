package com.facebook.internal;

import com.appnext.base.p046b.C1245d;
import com.facebook.C2649m;
import com.facebook.C2757u;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.m */
/* compiled from: FileLruCache */
public final class C2533m {

    /* renamed from: a */
    static final String f7945a = "m";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicLong f7946b = new AtomicLong();

    /* renamed from: c */
    private final String f7947c;

    /* renamed from: d */
    private final C2542d f7948d;

    /* renamed from: e */
    private final File f7949e;

    /* renamed from: f */
    private boolean f7950f;

    /* renamed from: g */
    private boolean f7951g;

    /* renamed from: h */
    private final Object f7952h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AtomicLong f7953i = new AtomicLong(0);

    /* renamed from: com.facebook.internal.m$a */
    /* compiled from: FileLruCache */
    private static class C2537a {

        /* renamed from: a */
        private static final FilenameFilter f7961a = new FilenameFilter() {
            public boolean accept(File file, String str) {
                return !str.startsWith("buffer");
            }
        };

        /* renamed from: b */
        private static final FilenameFilter f7962b = new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.startsWith("buffer");
            }
        };

        /* renamed from: a */
        static void m9662a(File file) {
            File[] listFiles = file.listFiles(m9664b());
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        /* renamed from: a */
        static FilenameFilter m9661a() {
            return f7961a;
        }

        /* renamed from: b */
        static FilenameFilter m9664b() {
            return f7962b;
        }

        /* renamed from: b */
        static File m9663b(File file) {
            StringBuilder sb = new StringBuilder();
            sb.append("buffer");
            sb.append(Long.valueOf(C2533m.f7946b.incrementAndGet()).toString());
            return new File(file, sb.toString());
        }
    }

    /* renamed from: com.facebook.internal.m$b */
    /* compiled from: FileLruCache */
    private static class C2540b extends OutputStream {

        /* renamed from: a */
        final OutputStream f7963a;

        /* renamed from: b */
        final C2544f f7964b;

        C2540b(OutputStream outputStream, C2544f fVar) {
            this.f7963a = outputStream;
            this.f7964b = fVar;
        }

        public void close() throws IOException {
            try {
                this.f7963a.close();
            } finally {
                this.f7964b.mo9018a();
            }
        }

        public void flush() throws IOException {
            this.f7963a.flush();
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f7963a.write(bArr, i, i2);
        }

        public void write(byte[] bArr) throws IOException {
            this.f7963a.write(bArr);
        }

        public void write(int i) throws IOException {
            this.f7963a.write(i);
        }
    }

    /* renamed from: com.facebook.internal.m$c */
    /* compiled from: FileLruCache */
    private static final class C2541c extends InputStream {

        /* renamed from: a */
        final InputStream f7965a;

        /* renamed from: b */
        final OutputStream f7966b;

        public boolean markSupported() {
            return false;
        }

        C2541c(InputStream inputStream, OutputStream outputStream) {
            this.f7965a = inputStream;
            this.f7966b = outputStream;
        }

        public int available() throws IOException {
            return this.f7965a.available();
        }

        public void close() throws IOException {
            try {
                this.f7965a.close();
            } finally {
                this.f7966b.close();
            }
        }

        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        public int read(byte[] bArr) throws IOException {
            int read = this.f7965a.read(bArr);
            if (read > 0) {
                this.f7966b.write(bArr, 0, read);
            }
            return read;
        }

        public int read() throws IOException {
            int read = this.f7965a.read();
            if (read >= 0) {
                this.f7966b.write(read);
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f7965a.read(bArr, i, i2);
            if (read > 0) {
                this.f7966b.write(bArr, i, read);
            }
            return read;
        }

        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        public long skip(long j) throws IOException {
            byte[] bArr = new byte[C1245d.f3947iP];
            long j2 = 0;
            while (j2 < j) {
                int read = read(bArr, 0, (int) Math.min(j - j2, (long) bArr.length));
                if (read < 0) {
                    return j2;
                }
                j2 += (long) read;
            }
            return j2;
        }
    }

    /* renamed from: com.facebook.internal.m$d */
    /* compiled from: FileLruCache */
    public static final class C2542d {

        /* renamed from: a */
        private int f7967a = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;

        /* renamed from: b */
        private int f7968b = C1245d.f3947iP;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo9037a() {
            return this.f7967a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo9038b() {
            return this.f7968b;
        }
    }

    /* renamed from: com.facebook.internal.m$e */
    /* compiled from: FileLruCache */
    private static final class C2543e implements Comparable<C2543e> {

        /* renamed from: a */
        private final File f7969a;

        /* renamed from: b */
        private final long f7970b;

        C2543e(File file) {
            this.f7969a = file;
            this.f7970b = file.lastModified();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public File mo9040a() {
            return this.f7969a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public long mo9041b() {
            return this.f7970b;
        }

        /* renamed from: a */
        public int compareTo(C2543e eVar) {
            if (mo9041b() < eVar.mo9041b()) {
                return -1;
            }
            if (mo9041b() > eVar.mo9041b()) {
                return 1;
            }
            return mo9040a().compareTo(eVar.mo9040a());
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2543e) && compareTo((C2543e) obj) == 0;
        }

        public int hashCode() {
            return ((1073 + this.f7969a.hashCode()) * 37) + ((int) (this.f7970b % 2147483647L));
        }
    }

    /* renamed from: com.facebook.internal.m$f */
    /* compiled from: FileLruCache */
    private interface C2544f {
        /* renamed from: a */
        void mo9018a();
    }

    /* renamed from: com.facebook.internal.m$g */
    /* compiled from: FileLruCache */
    private static final class C2545g {
        /* renamed from: a */
        static void m9672a(OutputStream outputStream, JSONObject jSONObject) throws IOException {
            byte[] bytes = jSONObject.toString().getBytes();
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & 255);
            outputStream.write((bytes.length >> 8) & 255);
            outputStream.write((bytes.length >> 0) & 255);
            outputStream.write(bytes);
        }

        /* renamed from: a */
        static JSONObject m9671a(InputStream inputStream) throws IOException {
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    C2563u.m9721a(C2757u.CACHE, C2533m.f7945a, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < bArr.length) {
                int read2 = inputStream.read(bArr, i, bArr.length - i);
                if (read2 < 1) {
                    C2757u uVar = C2757u.CACHE;
                    String str = C2533m.f7945a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("readHeader: stream.read stopped at ");
                    sb.append(Integer.valueOf(i));
                    sb.append(" when expected ");
                    sb.append(bArr.length);
                    C2563u.m9721a(uVar, str, sb.toString());
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                C2757u uVar2 = C2757u.CACHE;
                String str2 = C2533m.f7945a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("readHeader: expected JSONObject, got ");
                sb2.append(nextValue.getClass().getCanonicalName());
                C2563u.m9721a(uVar2, str2, sb2.toString());
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    public C2533m(String str, C2542d dVar) {
        this.f7947c = str;
        this.f7948d = dVar;
        this.f7949e = new File(C2649m.m10140m(), str);
        this.f7952h = new Object();
        if (this.f7949e.mkdirs() || this.f7949e.isDirectory()) {
            C2537a.m9662a(this.f7949e);
        }
    }

    /* renamed from: a */
    public InputStream mo9011a(String str) throws IOException {
        return mo9013a(str, (String) null);
    }

    /* renamed from: a */
    public InputStream mo9013a(String str, String str2) throws IOException {
        File file = new File(this.f7949e, C2479ad.m9459b(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject a = C2545g.m9671a(bufferedInputStream);
                if (a == null) {
                    return null;
                }
                String optString = a.optString("key");
                if (optString != null) {
                    if (optString.equals(str)) {
                        String optString2 = a.optString("tag", null);
                        if ((str2 != null || optString2 == null) && (str2 == null || str2.equals(optString2))) {
                            long time = new Date().getTime();
                            C2757u uVar = C2757u.CACHE;
                            String str3 = f7945a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Setting lastModified to ");
                            sb.append(Long.valueOf(time));
                            sb.append(" for ");
                            sb.append(file.getName());
                            C2563u.m9721a(uVar, str3, sb.toString());
                            file.setLastModified(time);
                            return bufferedInputStream;
                        }
                        bufferedInputStream.close();
                        return null;
                    }
                }
                bufferedInputStream.close();
                return null;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public OutputStream mo9015b(String str) throws IOException {
        return mo9016b(str, null);
    }

    /* renamed from: b */
    public OutputStream mo9016b(String str, String str2) throws IOException {
        final File b = C2537a.m9663b(this.f7949e);
        b.delete();
        if (!b.createNewFile()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create file at ");
            sb.append(b.getAbsolutePath());
            throw new IOException(sb.toString());
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(b);
            final long currentTimeMillis = System.currentTimeMillis();
            final String str3 = str;
            C25341 r1 = new C2544f() {
                /* renamed from: a */
                public void mo9018a() {
                    if (currentTimeMillis < C2533m.this.f7953i.get()) {
                        b.delete();
                    } else {
                        C2533m.this.m9649a(str3, b);
                    }
                }
            };
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C2540b(fileOutputStream, r1), 8192);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", str);
                if (!C2479ad.m9456a(str2)) {
                    jSONObject.put("tag", str2);
                }
                C2545g.m9672a(bufferedOutputStream, jSONObject);
                return bufferedOutputStream;
            } catch (JSONException e) {
                C2757u uVar = C2757u.CACHE;
                String str4 = f7945a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error creating JSON header for cache file: ");
                sb2.append(e);
                C2563u.m9719a(uVar, 5, str4, sb2.toString());
                throw new IOException(e.getMessage());
            } catch (Throwable th) {
                bufferedOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e2) {
            C2757u uVar2 = C2757u.CACHE;
            String str5 = f7945a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error creating buffer output stream: ");
            sb3.append(e2);
            C2563u.m9719a(uVar2, 5, str5, sb3.toString());
            throw new IOException(e2.getMessage());
        }
    }

    /* renamed from: a */
    public void mo9014a() {
        final File[] listFiles = this.f7949e.listFiles(C2537a.m9661a());
        this.f7953i.set(System.currentTimeMillis());
        if (listFiles != null) {
            C2649m.m10131d().execute(new Runnable() {
                public void run() {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9649a(String str, File file) {
        if (!file.renameTo(new File(this.f7949e, C2479ad.m9459b(str)))) {
            file.delete();
        }
        m9652c();
    }

    /* renamed from: a */
    public InputStream mo9012a(String str, InputStream inputStream) throws IOException {
        return new C2541c(inputStream, mo9015b(str));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{FileLruCache: tag:");
        sb.append(this.f7947c);
        sb.append(" file:");
        sb.append(this.f7949e.getName());
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: c */
    private void m9652c() {
        synchronized (this.f7952h) {
            if (!this.f7950f) {
                this.f7950f = true;
                C2649m.m10131d().execute(new Runnable() {
                    public void run() {
                        C2533m.this.m9653d();
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f2  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m9653d() {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r2 = r1.f7952h
            monitor-enter(r2)
            r3 = 0
            r1.f7950f = r3     // Catch:{ all -> 0x0100 }
            r4 = 1
            r1.f7951g = r4     // Catch:{ all -> 0x0100 }
            monitor-exit(r2)     // Catch:{ all -> 0x0100 }
            com.facebook.u r2 = com.facebook.C2757u.CACHE     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = f7945a     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = "trim started"
            com.facebook.internal.C2563u.m9721a(r2, r4, r5)     // Catch:{ all -> 0x00ed }
            java.util.PriorityQueue r2 = new java.util.PriorityQueue     // Catch:{ all -> 0x00ed }
            r2.<init>()     // Catch:{ all -> 0x00ed }
            java.io.File r4 = r1.f7949e     // Catch:{ all -> 0x00ed }
            java.io.FilenameFilter r5 = com.facebook.internal.C2533m.C2537a.m9661a()     // Catch:{ all -> 0x00ed }
            java.io.File[] r4 = r4.listFiles(r5)     // Catch:{ all -> 0x00ed }
            r7 = 0
            if (r4 == 0) goto L_0x0088
            int r9 = r4.length     // Catch:{ all -> 0x00ed }
            r10 = r7
            r12 = r10
            r7 = r3
        L_0x002c:
            if (r7 >= r9) goto L_0x0084
            r8 = r4[r7]     // Catch:{ all -> 0x00ed }
            com.facebook.internal.m$e r14 = new com.facebook.internal.m$e     // Catch:{ all -> 0x00ed }
            r14.<init>(r8)     // Catch:{ all -> 0x00ed }
            r2.add(r14)     // Catch:{ all -> 0x00ed }
            com.facebook.u r15 = com.facebook.C2757u.CACHE     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = f7945a     // Catch:{ all -> 0x00ed }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r5.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r6 = "  trim considering time="
            r5.append(r6)     // Catch:{ all -> 0x00ed }
            r16 = r2
            long r1 = r14.mo9041b()     // Catch:{ all -> 0x007e }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x007e }
            r5.append(r1)     // Catch:{ all -> 0x007e }
            java.lang.String r1 = " name="
            r5.append(r1)     // Catch:{ all -> 0x007e }
            java.io.File r1 = r14.mo9040a()     // Catch:{ all -> 0x007e }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x007e }
            r5.append(r1)     // Catch:{ all -> 0x007e }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x007e }
            com.facebook.internal.C2563u.m9721a(r15, r3, r1)     // Catch:{ all -> 0x007e }
            long r1 = r8.length()     // Catch:{ all -> 0x007e }
            long r5 = r10 + r1
            r1 = 1
            long r10 = r12 + r1
            int r7 = r7 + 1
            r12 = r10
            r2 = r16
            r1 = r17
            r3 = 0
            r10 = r5
            goto L_0x002c
        L_0x007e:
            r0 = move-exception
            r2 = r0
            r1 = r17
            goto L_0x00ef
        L_0x0084:
            r16 = r2
            r7 = r10
            goto L_0x008b
        L_0x0088:
            r16 = r2
            r12 = r7
        L_0x008b:
            com.facebook.internal.m$d r2 = r1.f7948d     // Catch:{ all -> 0x00ed }
            int r2 = r2.mo9037a()     // Catch:{ all -> 0x00ed }
            long r2 = (long) r2     // Catch:{ all -> 0x00ed }
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x00b3
            com.facebook.internal.m$d r2 = r1.f7948d     // Catch:{ all -> 0x00ed }
            int r2 = r2.mo9038b()     // Catch:{ all -> 0x00ed }
            long r2 = (long) r2
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a2
            goto L_0x00b3
        L_0x00a2:
            java.lang.Object r2 = r1.f7952h
            monitor-enter(r2)
            r3 = 0
            r1.f7951g = r3     // Catch:{ all -> 0x00af }
            java.lang.Object r3 = r1.f7952h     // Catch:{ all -> 0x00af }
            r3.notifyAll()     // Catch:{ all -> 0x00af }
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            return
        L_0x00af:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            throw r3
        L_0x00b3:
            r2 = r16
            java.lang.Object r3 = r2.remove()     // Catch:{ all -> 0x00ed }
            com.facebook.internal.m$e r3 = (com.facebook.internal.C2533m.C2543e) r3     // Catch:{ all -> 0x00ed }
            java.io.File r3 = r3.mo9040a()     // Catch:{ all -> 0x00ed }
            com.facebook.u r4 = com.facebook.C2757u.CACHE     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = f7945a     // Catch:{ all -> 0x00ed }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r6.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r9 = "  trim removing "
            r6.append(r9)     // Catch:{ all -> 0x00ed }
            java.lang.String r9 = r3.getName()     // Catch:{ all -> 0x00ed }
            r6.append(r9)     // Catch:{ all -> 0x00ed }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ed }
            com.facebook.internal.C2563u.m9721a(r4, r5, r6)     // Catch:{ all -> 0x00ed }
            long r4 = r3.length()     // Catch:{ all -> 0x00ed }
            long r9 = r7 - r4
            r4 = 1
            long r6 = r12 - r4
            r3.delete()     // Catch:{ all -> 0x00ed }
            r16 = r2
            r12 = r6
            r7 = r9
            goto L_0x008b
        L_0x00ed:
            r0 = move-exception
            r2 = r0
        L_0x00ef:
            java.lang.Object r3 = r1.f7952h
            monitor-enter(r3)
            r4 = 0
            r1.f7951g = r4     // Catch:{ all -> 0x00fc }
            java.lang.Object r4 = r1.f7952h     // Catch:{ all -> 0x00fc }
            r4.notifyAll()     // Catch:{ all -> 0x00fc }
            monitor-exit(r3)     // Catch:{ all -> 0x00fc }
            throw r2
        L_0x00fc:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x00fc }
            throw r2
        L_0x0100:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x0100 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2533m.m9653d():void");
    }
}
