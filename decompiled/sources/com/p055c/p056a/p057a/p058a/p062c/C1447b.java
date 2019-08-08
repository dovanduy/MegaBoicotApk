package com.p055c.p056a.p057a.p058a.p062c;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.p055c.p056a.p057a.p058a.p060b.C1444i;

/* renamed from: com.c.a.a.a.c.b */
public class C1447b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static C1447b f4412a = new C1447b();

    /* renamed from: b */
    private Context f4413b;

    /* renamed from: c */
    private BroadcastReceiver f4414c;

    /* renamed from: d */
    private boolean f4415d;

    /* renamed from: e */
    private boolean f4416e;

    /* renamed from: f */
    private C1449a f4417f;

    /* renamed from: com.c.a.a.a.c.b$a */
    public interface C1449a {
        /* renamed from: a */
        void mo6533a(boolean z);
    }

    private C1447b() {
    }

    /* renamed from: a */
    public static C1447b m5991a() {
        return f4412a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5993a(boolean z) {
        if (this.f4416e != z) {
            this.f4416e = z;
            if (this.f4415d) {
                m5996g();
                if (this.f4417f != null) {
                    this.f4417f.mo6533a(mo6531d());
                }
            }
        }
    }

    /* renamed from: e */
    private void m5994e() {
        this.f4414c = new BroadcastReceiver() {
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
                if (r3.inKeyguardRestrictedInputMode() == false) goto L_0x0023;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onReceive(android.content.Context r3, android.content.Intent r4) {
                /*
                    r2 = this;
                    if (r4 != 0) goto L_0x0003
                    return
                L_0x0003:
                    java.lang.String r0 = "android.intent.action.SCREEN_OFF"
                    java.lang.String r1 = r4.getAction()
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0016
                    com.c.a.a.a.c.b r3 = com.p055c.p056a.p057a.p058a.p062c.C1447b.this
                    r4 = 1
                    r3.m5993a(r4)
                    return
                L_0x0016:
                    java.lang.String r0 = "android.intent.action.USER_PRESENT"
                    java.lang.String r1 = r4.getAction()
                    boolean r0 = r0.equals(r1)
                    r1 = 0
                    if (r0 == 0) goto L_0x0029
                L_0x0023:
                    com.c.a.a.a.c.b r3 = com.p055c.p056a.p057a.p058a.p062c.C1447b.this
                    r3.m5993a(r1)
                    return
                L_0x0029:
                    java.lang.String r0 = "android.intent.action.SCREEN_ON"
                    java.lang.String r4 = r4.getAction()
                    boolean r4 = r0.equals(r4)
                    if (r4 == 0) goto L_0x0046
                    java.lang.String r4 = "keyguard"
                    java.lang.Object r3 = r3.getSystemService(r4)
                    android.app.KeyguardManager r3 = (android.app.KeyguardManager) r3
                    if (r3 == 0) goto L_0x0046
                    boolean r3 = r3.inKeyguardRestrictedInputMode()
                    if (r3 != 0) goto L_0x0046
                    goto L_0x0023
                L_0x0046:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p055c.p056a.p057a.p058a.p062c.C1447b.C14481.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f4413b.registerReceiver(this.f4414c, intentFilter);
    }

    /* renamed from: f */
    private void m5995f() {
        if (this.f4413b != null && this.f4414c != null) {
            this.f4413b.unregisterReceiver(this.f4414c);
            this.f4414c = null;
        }
    }

    /* renamed from: g */
    private void m5996g() {
        boolean z = !this.f4416e;
        for (C1444i f : C1446a.m5984a().mo6522b()) {
            f.mo6507f().mo6569a(z);
        }
    }

    /* renamed from: a */
    public void mo6527a(Context context) {
        this.f4413b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo6528a(C1449a aVar) {
        this.f4417f = aVar;
    }

    /* renamed from: b */
    public void mo6529b() {
        m5994e();
        this.f4415d = true;
        m5996g();
    }

    /* renamed from: c */
    public void mo6530c() {
        m5995f();
        this.f4415d = false;
        this.f4416e = false;
        this.f4417f = null;
    }

    /* renamed from: d */
    public boolean mo6531d() {
        return !this.f4416e;
    }
}
