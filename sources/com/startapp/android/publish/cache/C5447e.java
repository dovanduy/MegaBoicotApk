package com.startapp.android.publish.cache;

import android.os.Handler;
import android.os.Looper;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.cache.e */
/* compiled from: StartAppSDK */
public abstract class C5447e {

    /* renamed from: a */
    protected C5450g f17400a;

    /* renamed from: b */
    private Handler f17401b = null;

    /* renamed from: c */
    private Long f17402c = null;

    /* renamed from: d */
    private boolean f17403d = false;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo20096c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract long mo20097d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo20098e() {
        return "CacheScheduledTask";
    }

    public C5447e(C5450g gVar) {
        this.f17400a = gVar;
    }

    /* renamed from: f */
    public void mo20107f() {
        if (!this.f17403d) {
            if (this.f17402c == null) {
                this.f17402c = Long.valueOf(System.currentTimeMillis());
            }
            if (mo20096c()) {
                if (this.f17401b == null) {
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        myLooper = Looper.getMainLooper();
                    }
                    this.f17401b = new Handler(myLooper);
                }
                long d = mo20097d();
                if (d >= 0) {
                    this.f17403d = true;
                    String e = mo20098e();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Started for ");
                    sb.append(this.f17400a.mo20121c());
                    sb.append(" - scheduled to: ");
                    sb.append(d);
                    C5518g.m23563a(e, 4, sb.toString());
                    this.f17401b.postDelayed(new Runnable() {
                        public void run() {
                            C5447e.this.mo20095b();
                        }
                    }, d);
                    return;
                }
                C5518g.m23563a(mo20098e(), 3, "Can't start, scheduled time < 0");
                return;
            }
            C5518g.m23563a(mo20098e(), 3, "Not allowed");
        }
    }

    /* renamed from: g */
    public void mo20108g() {
        m23299j();
        m23300k();
    }

    /* renamed from: h */
    public void mo20109h() {
        m23299j();
        this.f17403d = false;
    }

    /* renamed from: a */
    public void mo20094a() {
        String e = mo20098e();
        StringBuilder sb = new StringBuilder();
        sb.append("Resetting for ");
        sb.append(this.f17400a.mo20121c());
        C5518g.m23563a(e, 4, sb.toString());
        mo20108g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20095b() {
        String e = mo20098e();
        StringBuilder sb = new StringBuilder();
        sb.append("Time reached, reloading ");
        sb.append(this.f17400a.mo20121c());
        C5518g.m23563a(e, 3, sb.toString());
        m23300k();
        this.f17400a.mo20129k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Long mo20110i() {
        return this.f17402c;
    }

    /* renamed from: j */
    private void m23299j() {
        if (this.f17401b != null) {
            this.f17401b.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: k */
    private void m23300k() {
        this.f17402c = null;
        this.f17403d = false;
    }
}
