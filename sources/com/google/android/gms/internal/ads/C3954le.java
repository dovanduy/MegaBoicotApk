package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.exoplayer2.C2793C;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.le */
public final class C3954le implements C4377zn {

    /* renamed from: a */
    private final Map<String, C3982mf> f13497a;

    /* renamed from: b */
    private long f13498b;

    /* renamed from: c */
    private final File f13499c;

    /* renamed from: d */
    private final int f13500d;

    public C3954le(File file) {
        this(file, 5242880);
    }

    private C3954le(File file, int i) {
        this.f13497a = new LinkedHashMap(16, 0.75f, true);
        this.f13498b = 0;
        this.f13499c = file;
        this.f13500d = 5242880;
    }

    /* renamed from: a */
    static int m17317a(InputStream inputStream) throws IOException {
        return (m17328c(inputStream) << 24) | m17328c(inputStream) | 0 | (m17328c(inputStream) << 8) | (m17328c(inputStream) << 16);
    }

    /* renamed from: a */
    private static InputStream m17318a(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* renamed from: a */
    static String m17319a(C4009nf nfVar) throws IOException {
        return new String(m17324a(nfVar, m17325b((InputStream) nfVar)), C2793C.UTF8_NAME);
    }

    /* renamed from: a */
    static void m17320a(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    /* renamed from: a */
    static void m17321a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m17322a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(C2793C.UTF8_NAME);
        m17321a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private final void m17323a(String str, C3982mf mfVar) {
        if (!this.f13497a.containsKey(str)) {
            this.f13498b += mfVar.f13570a;
        } else {
            this.f13498b += mfVar.f13570a - ((C3982mf) this.f13497a.get(str)).f13570a;
        }
        this.f13497a.put(str, mfVar);
    }

    /* renamed from: a */
    private static byte[] m17324a(C4009nf nfVar, long j) throws IOException {
        long a = nfVar.mo15669a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(nfVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a);
        throw new IOException(sb.toString());
    }

    /* renamed from: b */
    static long m17325b(InputStream inputStream) throws IOException {
        return 0 | (((long) m17328c(inputStream)) & 255) | ((((long) m17328c(inputStream)) & 255) << 8) | ((((long) m17328c(inputStream)) & 255) << 16) | ((((long) m17328c(inputStream)) & 255) << 24) | ((((long) m17328c(inputStream)) & 255) << 32) | ((((long) m17328c(inputStream)) & 255) << 40) | ((((long) m17328c(inputStream)) & 255) << 48) | ((((long) m17328c(inputStream)) & 255) << 56);
    }

    /* renamed from: b */
    static List<C3667app> m17326b(C4009nf nfVar) throws IOException {
        int a = m17317a((InputStream) nfVar);
        List<C3667app> emptyList = a == 0 ? Collections.emptyList() : new ArrayList<>(a);
        for (int i = 0; i < a; i++) {
            emptyList.add(new C3667app(m17319a(nfVar).intern(), m17319a(nfVar).intern()));
        }
        return emptyList;
    }

    /* renamed from: b */
    private final synchronized void m17327b(String str) {
        boolean delete = m17330d(str).delete();
        m17331e(str);
        if (!delete) {
            C3761eb.m16554b("Could not delete cache entry for key=%s, filename=%s", str, m17329c(str));
        }
    }

    /* renamed from: c */
    private static int m17328c(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    private static String m17329c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: d */
    private final File m17330d(String str) {
        return new File(this.f13499c, m17329c(str));
    }

    /* renamed from: e */
    private final void m17331e(String str) {
        C3982mf mfVar = (C3982mf) this.f13497a.remove(str);
        if (mfVar != null) {
            this.f13498b -= mfVar.f13570a;
        }
    }

    /* renamed from: a */
    public final synchronized agn mo15600a(String str) {
        C4009nf nfVar;
        C3982mf mfVar = (C3982mf) this.f13497a.get(str);
        if (mfVar == null) {
            return null;
        }
        File d = m17330d(str);
        try {
            nfVar = new C4009nf(new BufferedInputStream(m17318a(d)), d.length());
            C3982mf a = C3982mf.m17420a(nfVar);
            if (!TextUtils.equals(str, a.f13571b)) {
                C3761eb.m16554b("%s: key=%s, found=%s", d.getAbsolutePath(), str, a.f13571b);
                m17331e(str);
                nfVar.close();
                return null;
            }
            byte[] a2 = m17324a(nfVar, nfVar.mo15669a());
            agn agn = new agn();
            agn.f10982a = a2;
            agn.f10983b = mfVar.f13572c;
            agn.f10984c = mfVar.f13573d;
            agn.f10985d = mfVar.f13574e;
            agn.f10986e = mfVar.f13575f;
            agn.f10987f = mfVar.f13576g;
            List<C3667app> list = mfVar.f13577h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (C3667app app : list) {
                treeMap.put(app.mo14558a(), app.mo14559b());
            }
            agn.f10988g = treeMap;
            agn.f10989h = Collections.unmodifiableList(mfVar.f13577h);
            nfVar.close();
            return agn;
        } catch (IOException e) {
            C3761eb.m16554b("%s: %s", d.getAbsolutePath(), e.toString());
            m17327b(str);
            return null;
        } catch (Throwable th) {
            nfVar.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo15601a() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.io.File r0 = r9.f13499c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r0 != 0) goto L_0x0024
            java.io.File r0 = r9.f13499c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Unable to create cache dir %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            java.io.File r3 = r9.f13499c     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            r2[r1] = r3     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.C3761eb.m16555c(r0, r2)     // Catch:{ all -> 0x0061 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File r0 = r9.f13499c     // Catch:{ all -> 0x0061 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r2 = r0.length     // Catch:{ all -> 0x0061 }
        L_0x002f:
            if (r1 >= r2) goto L_0x005f
            r3 = r0[r1]     // Catch:{ all -> 0x0061 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.nf r6 = new com.google.android.gms.internal.ads.nf     // Catch:{ IOException -> 0x0059 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0059 }
            java.io.InputStream r8 = m17318a(r3)     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0059 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.mf r7 = com.google.android.gms.internal.ads.C3982mf.m17420a(r6)     // Catch:{ all -> 0x0054 }
            r7.f13570a = r4     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r7.f13571b     // Catch:{ all -> 0x0054 }
            r9.m17323a(r4, r7)     // Catch:{ all -> 0x0054 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005c
        L_0x0054:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0059 }
            throw r4     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r3.delete()     // Catch:{ all -> 0x0061 }
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x005f:
            monitor-exit(r9)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3954le.mo15601a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|(1:36)|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0108, code lost:
        if (r3.delete() == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010a, code lost:
        com.google.android.gms.internal.ads.C3761eb.m16554b("Could not clean up file %s", r3.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011a, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0104 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo15602a(java.lang.String r20, com.google.android.gms.internal.ads.agn r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            monitor-enter(r19)
            byte[] r4 = r3.f10982a     // Catch:{ all -> 0x011b }
            int r4 = r4.length     // Catch:{ all -> 0x011b }
            long r5 = r1.f13498b     // Catch:{ all -> 0x011b }
            long r7 = (long) r4     // Catch:{ all -> 0x011b }
            long r9 = r5 + r7
            int r4 = r1.f13500d     // Catch:{ all -> 0x011b }
            long r4 = (long) r4     // Catch:{ all -> 0x011b }
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r5 = 0
            if (r6 < 0) goto L_0x00c4
            boolean r6 = com.google.android.gms.internal.ads.C3761eb.f12916a     // Catch:{ all -> 0x011b }
            if (r6 == 0) goto L_0x0022
            java.lang.String r6 = "Pruning old cache entries."
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.C3761eb.m16552a(r6, r9)     // Catch:{ all -> 0x011b }
        L_0x0022:
            long r9 = r1.f13498b     // Catch:{ all -> 0x011b }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x011b }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.mf> r6 = r1.f13497a     // Catch:{ all -> 0x011b }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x011b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x011b }
            r13 = r5
        L_0x0033:
            boolean r14 = r6.hasNext()     // Catch:{ all -> 0x011b }
            r15 = 2
            if (r14 == 0) goto L_0x0098
            java.lang.Object r14 = r6.next()     // Catch:{ all -> 0x011b }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ all -> 0x011b }
            java.lang.Object r14 = r14.getValue()     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.mf r14 = (com.google.android.gms.internal.ads.C3982mf) r14     // Catch:{ all -> 0x011b }
            java.lang.String r4 = r14.f13571b     // Catch:{ all -> 0x011b }
            java.io.File r4 = r1.m17330d(r4)     // Catch:{ all -> 0x011b }
            boolean r4 = r4.delete()     // Catch:{ all -> 0x011b }
            if (r4 == 0) goto L_0x0061
            r16 = r6
            long r5 = r1.f13498b     // Catch:{ all -> 0x011b }
            long r3 = r14.f13570a     // Catch:{ all -> 0x011b }
            r17 = r11
            long r11 = r5 - r3
            r1.f13498b = r11     // Catch:{ all -> 0x011b }
        L_0x005e:
            r3 = r16
            goto L_0x007b
        L_0x0061:
            r16 = r6
            r17 = r11
            java.lang.String r3 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ all -> 0x011b }
            java.lang.String r5 = r14.f13571b     // Catch:{ all -> 0x011b }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x011b }
            java.lang.String r5 = r14.f13571b     // Catch:{ all -> 0x011b }
            java.lang.String r5 = m17329c(r5)     // Catch:{ all -> 0x011b }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.C3761eb.m16554b(r3, r4)     // Catch:{ all -> 0x011b }
            goto L_0x005e
        L_0x007b:
            r3.remove()     // Catch:{ all -> 0x011b }
            int r13 = r13 + 1
            long r4 = r1.f13498b     // Catch:{ all -> 0x011b }
            long r11 = r4 + r7
            float r4 = (float) r11     // Catch:{ all -> 0x011b }
            int r5 = r1.f13500d     // Catch:{ all -> 0x011b }
            float r5 = (float) r5     // Catch:{ all -> 0x011b }
            r6 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r6
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0091
            goto L_0x009a
        L_0x0091:
            r6 = r3
            r11 = r17
            r3 = r21
            r5 = 0
            goto L_0x0033
        L_0x0098:
            r17 = r11
        L_0x009a:
            boolean r3 = com.google.android.gms.internal.ads.C3761eb.f12916a     // Catch:{ all -> 0x011b }
            if (r3 == 0) goto L_0x00c4
            java.lang.String r3 = "pruned %d files, %d bytes, %d ms"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x011b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x011b }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x011b }
            long r5 = r1.f13498b     // Catch:{ all -> 0x011b }
            long r7 = r5 - r9
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x011b }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x011b }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x011b }
            long r7 = r5 - r17
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x011b }
            r4[r15] = r5     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.C3761eb.m16552a(r3, r4)     // Catch:{ all -> 0x011b }
        L_0x00c4:
            java.io.File r3 = r19.m17330d(r20)     // Catch:{ all -> 0x011b }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0104 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0104 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0104 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0104 }
            com.google.android.gms.internal.ads.mf r5 = new com.google.android.gms.internal.ads.mf     // Catch:{ IOException -> 0x0104 }
            r6 = r21
            r5.<init>(r2, r6)     // Catch:{ IOException -> 0x0104 }
            boolean r7 = r5.mo15634a(r4)     // Catch:{ IOException -> 0x0104 }
            if (r7 != 0) goto L_0x00f7
            r4.close()     // Catch:{ IOException -> 0x0104 }
            java.lang.String r2 = "Failed to write header for %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0104 }
            java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0104 }
            r6 = 0
            r5[r6] = r4     // Catch:{ IOException -> 0x0104 }
            com.google.android.gms.internal.ads.C3761eb.m16554b(r2, r5)     // Catch:{ IOException -> 0x0104 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0104 }
            r2.<init>()     // Catch:{ IOException -> 0x0104 }
            throw r2     // Catch:{ IOException -> 0x0104 }
        L_0x00f7:
            byte[] r6 = r6.f10982a     // Catch:{ IOException -> 0x0104 }
            r4.write(r6)     // Catch:{ IOException -> 0x0104 }
            r4.close()     // Catch:{ IOException -> 0x0104 }
            r1.m17323a(r2, r5)     // Catch:{ IOException -> 0x0104 }
            monitor-exit(r19)
            return
        L_0x0104:
            boolean r2 = r3.delete()     // Catch:{ all -> 0x011b }
            if (r2 != 0) goto L_0x0119
            java.lang.String r2 = "Could not clean up file %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x011b }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x011b }
            r5 = 0
            r4[r5] = r3     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.C3761eb.m16554b(r2, r4)     // Catch:{ all -> 0x011b }
        L_0x0119:
            monitor-exit(r19)
            return
        L_0x011b:
            r0 = move-exception
            r2 = r0
            monitor-exit(r19)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3954le.mo15602a(java.lang.String, com.google.android.gms.internal.ads.agn):void");
    }
}
