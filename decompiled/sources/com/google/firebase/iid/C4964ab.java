package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.ab */
final class C4964ab implements Runnable {

    /* renamed from: a */
    private final long f16175a;

    /* renamed from: b */
    private final WakeLock f16176b = ((PowerManager) mo17906a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: c */
    private final FirebaseInstanceId f16177c;

    /* renamed from: d */
    private final C5005q f16178d;

    /* renamed from: e */
    private final C4966ad f16179e;

    C4964ab(FirebaseInstanceId firebaseInstanceId, C5005q qVar, C4966ad adVar, long j) {
        this.f16177c = firebaseInstanceId;
        this.f16178d = qVar;
        this.f16179e = adVar;
        this.f16175a = j;
        this.f16176b.setReferenceCounted(false);
    }

    public final void run() {
        this.f16176b.acquire();
        try {
            this.f16177c.mo17887a(true);
            if (!this.f16177c.mo17895i()) {
                this.f16177c.mo17887a(false);
            } else if (!mo17907b()) {
                new C4965ac(this).mo17909a();
                this.f16176b.release();
            } else {
                if (!m21622c() || !m21623d() || !this.f16179e.mo17912a(this.f16177c)) {
                    this.f16177c.mo17883a(this.f16175a);
                } else {
                    this.f16177c.mo17887a(false);
                }
                this.f16176b.release();
            }
        } finally {
            this.f16176b.release();
        }
    }

    /* renamed from: c */
    private final boolean m21622c() {
        try {
            if (!this.f16177c.mo17896j()) {
                this.f16177c.mo17897k();
            }
            return true;
        } catch (IOException e) {
            String str = "FirebaseInstanceId";
            String str2 = "Build channel failed: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m21623d() {
        C4963aa e = this.f16177c.mo17892e();
        if (e != null && !e.mo17905b(this.f16178d.mo17964b())) {
            return true;
        }
        try {
            String f = this.f16177c.mo17893f();
            if (f == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (e == null || (e != null && !f.equals(e.f16172a))) {
                Context a = mo17906a();
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", f);
                C5013y.m21742b(a, intent);
                C5013y.m21740a(a, new Intent("com.google.firebase.iid.TOKEN_REFRESH"));
            }
            return true;
        } catch (IOException | SecurityException e2) {
            String str = "FirebaseInstanceId";
            String str2 = "Token retrieval failed: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Context mo17906a() {
        return this.f16177c.mo17888b().mo17829a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo17907b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo17906a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
