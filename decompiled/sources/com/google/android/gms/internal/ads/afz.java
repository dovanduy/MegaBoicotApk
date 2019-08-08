package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class afz implements Runnable {
    private afz() {
    }

    public final void run() {
        try {
            afx.f10773c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            afx.f10771a.countDown();
            throw th;
        }
        afx.f10771a.countDown();
    }
}
