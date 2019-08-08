package com.facebook.internal;

import android.util.Log;
import com.facebook.C2649m;
import com.facebook.C2757u;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.facebook.internal.u */
/* compiled from: Logger */
public class C2563u {

    /* renamed from: a */
    private static final HashMap<String, String> f8014a = new HashMap<>();

    /* renamed from: b */
    private final C2757u f8015b;

    /* renamed from: c */
    private final String f8016c;

    /* renamed from: d */
    private StringBuilder f8017d;

    /* renamed from: e */
    private int f8018e = 3;

    /* renamed from: a */
    public static synchronized void m9724a(String str, String str2) {
        synchronized (C2563u.class) {
            f8014a.put(str, str2);
        }
    }

    /* renamed from: a */
    public static synchronized void m9723a(String str) {
        synchronized (C2563u.class) {
            if (!C2649m.m10125a(C2757u.INCLUDE_ACCESS_TOKENS)) {
                m9724a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    /* renamed from: a */
    public static void m9721a(C2757u uVar, String str, String str2) {
        m9719a(uVar, 3, str, str2);
    }

    /* renamed from: a */
    public static void m9722a(C2757u uVar, String str, String str2, Object... objArr) {
        if (C2649m.m10125a(uVar)) {
            m9719a(uVar, 3, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m9720a(C2757u uVar, int i, String str, String str2, Object... objArr) {
        if (C2649m.m10125a(uVar)) {
            m9719a(uVar, i, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m9719a(C2757u uVar, int i, String str, String str2) {
        if (C2649m.m10125a(uVar)) {
            String d = m9726d(str2);
            if (!str.startsWith("FacebookSDK.")) {
                StringBuilder sb = new StringBuilder();
                sb.append("FacebookSDK.");
                sb.append(str);
                str = sb.toString();
            }
            Log.println(i, str, d);
            if (uVar == C2757u.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private static synchronized String m9726d(String str) {
        synchronized (C2563u.class) {
            for (Entry entry : f8014a.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    public C2563u(C2757u uVar, String str) {
        C2484ae.m9490a(str, "tag");
        this.f8015b = uVar;
        StringBuilder sb = new StringBuilder();
        sb.append("FacebookSDK.");
        sb.append(str);
        this.f8016c = sb.toString();
        this.f8017d = new StringBuilder();
    }

    /* renamed from: a */
    public void mo9072a() {
        mo9075b(this.f8017d.toString());
        this.f8017d = new StringBuilder();
    }

    /* renamed from: b */
    public void mo9075b(String str) {
        m9719a(this.f8015b, this.f8018e, this.f8016c, str);
    }

    /* renamed from: c */
    public void mo9076c(String str) {
        if (m9725b()) {
            this.f8017d.append(str);
        }
    }

    /* renamed from: a */
    public void mo9074a(String str, Object... objArr) {
        if (m9725b()) {
            this.f8017d.append(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public void mo9073a(String str, Object obj) {
        mo9074a("  %s:\t%s\n", str, obj);
    }

    /* renamed from: b */
    private boolean m9725b() {
        return C2649m.m10125a(this.f8015b);
    }
}
