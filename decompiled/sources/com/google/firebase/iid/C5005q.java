package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C3563o;
import com.google.firebase.C4928b;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.q */
public final class C5005q {

    /* renamed from: a */
    private final Context f16257a;
    @GuardedBy("this")

    /* renamed from: b */
    private String f16258b;
    @GuardedBy("this")

    /* renamed from: c */
    private String f16259c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f16260d;
    @GuardedBy("this")

    /* renamed from: e */
    private int f16261e = 0;

    public C5005q(Context context) {
        this.f16257a = context;
    }

    /* renamed from: a */
    public final synchronized int mo17963a() {
        if (this.f16261e != 0) {
            return this.f16261e;
        }
        PackageManager packageManager = this.f16257a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C3563o.m12773l()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f16261e = 1;
                return this.f16261e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C3563o.m12773l()) {
                this.f16261e = 2;
            } else {
                this.f16261e = 1;
            }
            return this.f16261e;
        }
        this.f16261e = 2;
        return this.f16261e;
    }

    /* renamed from: a */
    public static String m21717a(C4928b bVar) {
        String b = bVar.mo17832c().mo17843b();
        if (b != null) {
            return b;
        }
        String a = bVar.mo17832c().mo17842a();
        if (!a.startsWith("1:")) {
            return a;
        }
        String[] split = a.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static String m21718a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) (112 + (digest[0] & 15));
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized String mo17964b() {
        if (this.f16258b == null) {
            m21719e();
        }
        return this.f16258b;
    }

    /* renamed from: c */
    public final synchronized String mo17965c() {
        if (this.f16259c == null) {
            m21719e();
        }
        return this.f16259c;
    }

    /* renamed from: d */
    public final synchronized int mo17966d() {
        if (this.f16260d == 0) {
            PackageInfo a = m21716a("com.google.android.gms");
            if (a != null) {
                this.f16260d = a.versionCode;
            }
        }
        return this.f16260d;
    }

    /* renamed from: e */
    private final synchronized void m21719e() {
        PackageInfo a = m21716a(this.f16257a.getPackageName());
        if (a != null) {
            this.f16258b = Integer.toString(a.versionCode);
            this.f16259c = a.versionName;
        }
    }

    /* renamed from: a */
    private final PackageInfo m21716a(String str) {
        try {
            return this.f16257a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(23 + String.valueOf(valueOf).length());
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
