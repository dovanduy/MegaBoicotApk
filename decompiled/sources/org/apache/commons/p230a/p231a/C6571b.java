package org.apache.commons.p230a.p231a;

import com.google.android.exoplayer2.C2793C;
import java.io.UnsupportedEncodingException;

/* renamed from: org.apache.commons.a.a.b */
/* compiled from: StringUtils */
public class C6571b {
    /* renamed from: a */
    private static IllegalStateException m26028a(String str, UnsupportedEncodingException unsupportedEncodingException) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(": ");
        stringBuffer.append(unsupportedEncodingException);
        return new IllegalStateException(stringBuffer.toString());
    }

    /* renamed from: a */
    public static String m26030a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw m26028a(str, e);
        }
    }

    /* renamed from: a */
    public static String m26029a(byte[] bArr) {
        return m26030a(bArr, C2793C.UTF8_NAME);
    }
}
