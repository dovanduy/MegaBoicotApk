package android.support.p017v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.appnext.base.p046b.C1245d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

/* renamed from: android.support.v4.graphics.i */
/* compiled from: TypefaceCompatUtil */
public class C0422i {
    /* renamed from: a */
    public static File m1607a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(".font");
        sb.append(Process.myPid());
        sb.append("-");
        sb.append(Process.myTid());
        sb.append("-");
        String sb2 = sb.toString();
        int i = 0;
        while (i < 100) {
            File cacheDir = context.getCacheDir();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(i);
            File file = new File(cacheDir, sb3.toString());
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static ByteBuffer m1610a(File file) {
        Throwable th;
        Throwable th2;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(MapMode.READ_ONLY, 0, channel.size());
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return map;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th2 = r9;
                th = th4;
            }
            throw th;
            if (fileInputStream != null) {
                if (th2 != null) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th5) {
                        th2.addSuppressed(th5);
                    }
                } else {
                    fileInputStream.close();
                }
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0051, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0052, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0057, code lost:
        r7 = r10;
        r10 = r9;
        r9 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0051 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0013] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m1609a(android.content.Context r8, android.os.CancellationSignal r9, android.net.Uri r10) {
        /*
            android.content.ContentResolver r8 = r8.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r10, r1, r9)     // Catch:{ IOException -> 0x006b }
            if (r8 != 0) goto L_0x0013
            if (r8 == 0) goto L_0x0012
            r8.close()     // Catch:{ IOException -> 0x006b }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            java.io.FileDescriptor r10 = r8.getFileDescriptor()     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            r9.<init>(r10)     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            java.nio.channels.FileChannel r1 = r9.getChannel()     // Catch:{ Throwable -> 0x003a, all -> 0x0037 }
            long r5 = r1.size()     // Catch:{ Throwable -> 0x003a, all -> 0x0037 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Throwable -> 0x003a, all -> 0x0037 }
            r3 = 0
            java.nio.MappedByteBuffer r10 = r1.map(r2, r3, r5)     // Catch:{ Throwable -> 0x003a, all -> 0x0037 }
            if (r9 == 0) goto L_0x0031
            r9.close()     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
        L_0x0031:
            if (r8 == 0) goto L_0x0036
            r8.close()     // Catch:{ IOException -> 0x006b }
        L_0x0036:
            return r10
        L_0x0037:
            r10 = move-exception
            r1 = r0
            goto L_0x0040
        L_0x003a:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            r7 = r1
            r1 = r10
            r10 = r7
        L_0x0040:
            if (r9 == 0) goto L_0x0050
            if (r1 == 0) goto L_0x004d
            r9.close()     // Catch:{ Throwable -> 0x0048, all -> 0x0051 }
            goto L_0x0050
        L_0x0048:
            r9 = move-exception
            r1.addSuppressed(r9)     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            goto L_0x0050
        L_0x004d:
            r9.close()     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
        L_0x0050:
            throw r10     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
        L_0x0051:
            r9 = move-exception
            r10 = r0
            goto L_0x005a
        L_0x0054:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r10 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x005a:
            if (r8 == 0) goto L_0x006a
            if (r10 == 0) goto L_0x0067
            r8.close()     // Catch:{ Throwable -> 0x0062 }
            goto L_0x006a
        L_0x0062:
            r8 = move-exception
            r10.addSuppressed(r8)     // Catch:{ IOException -> 0x006b }
            goto L_0x006a
        L_0x0067:
            r8.close()     // Catch:{ IOException -> 0x006b }
        L_0x006a:
            throw r9     // Catch:{ IOException -> 0x006b }
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.graphics.C0422i.m1609a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    public static ByteBuffer m1608a(Context context, Resources resources, int i) {
        File a = m1607a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!m1612a(a, resources, i)) {
                return null;
            }
            ByteBuffer a2 = m1610a(a);
            a.delete();
            return a2;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public static boolean m1613a(File file, InputStream inputStream) {
        ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[C1245d.f3947iP];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        m1611a((Closeable) fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                String str = "TypefaceCompatUtil";
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error copying resource contents to temp file: ");
                    sb.append(e.getMessage());
                    Log.e(str, sb.toString());
                    m1611a((Closeable) fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m1611a((Closeable) fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                m1611a((Closeable) fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            String str2 = "TypefaceCompatUtil";
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error copying resource contents to temp file: ");
            sb2.append(e.getMessage());
            Log.e(str2, sb2.toString());
            m1611a((Closeable) fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m1612a(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean a = m1613a(file, inputStream);
                m1611a((Closeable) inputStream);
                return a;
            } catch (Throwable th) {
                th = th;
                m1611a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m1611a((Closeable) inputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m1611a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
