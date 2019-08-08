package com.google.android.gms.common.util;

import com.appnext.base.p046b.C1245d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@Deprecated
/* renamed from: com.google.android.gms.common.util.k */
public final class C3559k {
    /* renamed from: a */
    public static void m12757a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    private static long m12755a(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        return m12756a(inputStream, outputStream, z, C1245d.f3947iP);
    }

    @Deprecated
    /* renamed from: a */
    public static long m12756a(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                long j2 = j + ((long) read);
                outputStream.write(bArr, 0, read);
                j = j2;
            } finally {
                if (z) {
                    m12757a(inputStream);
                    m12757a(outputStream);
                }
            }
        }
        return j;
    }

    @Deprecated
    /* renamed from: a */
    public static byte[] m12758a(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m12755a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
