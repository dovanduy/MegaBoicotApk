package com.startapp.android.publish.adsCommon.p182f;

import com.startapp.android.publish.adsCommon.Utils.C5307i;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.adsCommon.f.a */
/* compiled from: StartAppSDK */
public class C5372a implements Serializable {

    /* renamed from: a */
    private static final String f17204a = new String("https://infoevent.startappservice.com/tracking/infoEvent");
    private static final long serialVersionUID = 1;
    public boolean dns = false;
    public String hostPeriodic = f17204a;
    public String hostSecured = f17204a;
    private int retryNum = 3;
    private int retryTime = 10;
    private boolean sendHopsOnFirstSucceededSmartRedirect = false;
    private float succeededSmartRedirectInfoProbability = 0.01f;

    /* renamed from: a */
    public String mo19869a() {
        return this.hostSecured;
    }

    /* renamed from: b */
    public String mo19870b() {
        return this.hostPeriodic != null ? this.hostPeriodic : f17204a;
    }

    /* renamed from: c */
    public boolean mo19871c() {
        return this.dns;
    }

    /* renamed from: d */
    public int mo19872d() {
        return this.retryNum;
    }

    /* renamed from: e */
    public long mo19873e() {
        return TimeUnit.SECONDS.toMillis((long) this.retryTime);
    }

    /* renamed from: f */
    public float mo19875f() {
        return this.succeededSmartRedirectInfoProbability;
    }

    /* renamed from: g */
    public boolean mo19876g() {
        return this.sendHopsOnFirstSucceededSmartRedirect;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5372a aVar = (C5372a) obj;
        if (!(this.dns == aVar.dns && this.retryNum == aVar.retryNum && this.retryTime == aVar.retryTime && Float.compare(aVar.succeededSmartRedirectInfoProbability, this.succeededSmartRedirectInfoProbability) == 0 && this.sendHopsOnFirstSucceededSmartRedirect == aVar.sendHopsOnFirstSucceededSmartRedirect && C5307i.m22682b(this.hostSecured, aVar.hostSecured) && C5307i.m22682b(this.hostPeriodic, aVar.hostPeriodic))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(this.hostSecured, this.hostPeriodic, Boolean.valueOf(this.dns), Integer.valueOf(this.retryNum), Integer.valueOf(this.retryTime), Float.valueOf(this.succeededSmartRedirectInfoProbability), Boolean.valueOf(this.sendHopsOnFirstSucceededSmartRedirect));
    }
}
