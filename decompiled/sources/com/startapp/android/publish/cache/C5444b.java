package com.startapp.android.publish.cache;

import com.startapp.android.publish.adsCommon.C5427m;
import com.startapp.common.p193a.C5518g;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.cache.b */
/* compiled from: StartAppSDK */
public class C5444b extends C5447e {

    /* renamed from: b */
    private final FailuresHandler f17396b = C5446d.m23293a().mo20103b().getFailuresHandler();

    /* renamed from: c */
    private int f17397c = 0;

    /* renamed from: d */
    private boolean f17398d = false;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo20098e() {
        return "CacheErrorReloadTimer";
    }

    public C5444b(C5450g gVar) {
        super(gVar);
    }

    /* renamed from: a */
    public void mo20094a() {
        super.mo20094a();
        this.f17397c = 0;
        this.f17398d = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20095b() {
        m23285j();
        super.mo20095b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo20096c() {
        if (!C5427m.m23145a().mo20019l() || !m23286k()) {
            return false;
        }
        if (this.f17398d) {
            return this.f17396b.isInfiniteLastRetry();
        }
        return true;
    }

    /* renamed from: j */
    private void m23285j() {
        if (this.f17397c == this.f17396b.getIntervals().size() - 1) {
            this.f17398d = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Reached end index: ");
            sb.append(this.f17397c);
            C5518g.m23563a("CacheErrorReloadTimer", 4, sb.toString());
            return;
        }
        this.f17397c++;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Advanced to index: ");
        sb2.append(this.f17397c);
        C5518g.m23563a("CacheErrorReloadTimer", 4, sb2.toString());
    }

    /* renamed from: k */
    private boolean m23286k() {
        return (this.f17396b == null || this.f17396b.getIntervals() == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo20097d() {
        if (this.f17397c >= this.f17396b.getIntervals().size()) {
            return -1;
        }
        Long i = mo20110i();
        if (i == null) {
            return -1;
        }
        long millis = TimeUnit.SECONDS.toMillis((long) ((Integer) this.f17396b.getIntervals().get(this.f17397c)).intValue()) - (System.currentTimeMillis() - i.longValue());
        long j = 0;
        if (millis >= 0) {
            j = millis;
        }
        return j;
    }
}
