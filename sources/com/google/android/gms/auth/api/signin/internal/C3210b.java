package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C3513t;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public class C3210b {

    /* renamed from: a */
    private static final Lock f9411a = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: b */
    private static C3210b f9412b;

    /* renamed from: c */
    private final Lock f9413c = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: d */
    private final SharedPreferences f9414d;

    /* renamed from: a */
    public static C3210b m11519a(Context context) {
        C3513t.m12625a(context);
        f9411a.lock();
        try {
            if (f9412b == null) {
                f9412b = new C3210b(context.getApplicationContext());
            }
            return f9412b;
        } finally {
            f9411a.unlock();
        }
    }

    private C3210b(Context context) {
        this.f9414d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public void mo13002a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C3513t.m12625a(googleSignInAccount);
        C3513t.m12625a(googleSignInOptions);
        m11520a("defaultGoogleSignInAccount", googleSignInAccount.mo12958j());
        C3513t.m12625a(googleSignInAccount);
        C3513t.m12625a(googleSignInOptions);
        String j = googleSignInAccount.mo12958j();
        m11520a(m11522b("googleSignInAccount", j), googleSignInAccount.mo12960l());
        m11520a(m11522b("googleSignInOptions", j), googleSignInOptions.mo12970h());
    }

    /* renamed from: a */
    private final void m11520a(String str, String str2) {
        this.f9413c.lock();
        try {
            this.f9414d.edit().putString(str, str2).apply();
        } finally {
            this.f9413c.unlock();
        }
    }

    @Nullable
    /* renamed from: a */
    public GoogleSignInAccount mo13001a() {
        return m11518a(m11523c("defaultGoogleSignInAccount"));
    }

    @Nullable
    /* renamed from: a */
    private final GoogleSignInAccount m11518a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m11523c(m11522b("googleSignInAccount", str));
        if (c == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m11457a(c);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    public GoogleSignInOptions mo13003b() {
        return m11521b(m11523c("defaultGoogleSignInAccount"));
    }

    @Nullable
    /* renamed from: b */
    private final GoogleSignInOptions m11521b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m11523c(m11522b("googleSignInOptions", str));
        if (c == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m11472a(c);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public String mo13004c() {
        return m11523c("refreshToken");
    }

    @Nullable
    /* renamed from: c */
    private final String m11523c(String str) {
        this.f9413c.lock();
        try {
            return this.f9414d.getString(str, null);
        } finally {
            this.f9413c.unlock();
        }
    }

    /* renamed from: d */
    public final void mo13005d() {
        String c = m11523c("defaultGoogleSignInAccount");
        m11524d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c)) {
            m11524d(m11522b("googleSignInAccount", c));
            m11524d(m11522b("googleSignInOptions", c));
        }
    }

    /* renamed from: d */
    private final void m11524d(String str) {
        this.f9413c.lock();
        try {
            this.f9414d.edit().remove(str).apply();
        } finally {
            this.f9413c.unlock();
        }
    }

    /* renamed from: e */
    public void mo13006e() {
        this.f9413c.lock();
        try {
            this.f9414d.edit().clear().apply();
        } finally {
            this.f9413c.unlock();
        }
    }

    /* renamed from: b */
    private static String m11522b(String str, String str2) {
        StringBuilder sb = new StringBuilder(1 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
