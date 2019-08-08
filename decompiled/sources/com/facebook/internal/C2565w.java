package com.facebook.internal;

import com.google.android.exoplayer2.C2793C;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

/* renamed from: com.facebook.internal.w */
/* compiled from: NativeAppCallAttachmentStore */
public final class C2565w {

    /* renamed from: a */
    private static final String f8022a = "com.facebook.internal.w";

    /* renamed from: b */
    private static File f8023b;

    private C2565w() {
    }

    /* renamed from: a */
    public static void m9735a(UUID uuid) {
        File a = m9734a(uuid, false);
        if (a != null) {
            C2479ad.m9445a(a);
        }
    }

    /* renamed from: a */
    public static File m9732a(UUID uuid, String str) throws FileNotFoundException {
        if (C2479ad.m9456a(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return m9733a(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    /* renamed from: a */
    static File m9734a(UUID uuid, boolean z) {
        if (f8023b == null) {
            return null;
        }
        File file = new File(f8023b, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    static File m9733a(UUID uuid, String str, boolean z) throws IOException {
        File a = m9734a(uuid, z);
        if (a == null) {
            return null;
        }
        try {
            return new File(a, URLEncoder.encode(str, C2793C.UTF8_NAME));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
