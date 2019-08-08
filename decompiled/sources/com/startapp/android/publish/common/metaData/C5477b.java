package com.startapp.android.publish.common.metaData;

import com.startapp.android.publish.adsCommon.Utils.C5307i;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.common.metaData.b */
/* compiled from: StartAppSDK */
public class C5477b implements Serializable {
    private static final long serialVersionUID = 1;
    private int discoveryIntervalInMinutes = 1440;
    private boolean enabled = false;
    private int timeoutInSec = 20;

    /* renamed from: a */
    public int mo20267a() {
        return this.timeoutInSec;
    }

    /* renamed from: b */
    public boolean mo20268b() {
        return this.enabled;
    }

    /* renamed from: c */
    public int mo20269c() {
        return this.discoveryIntervalInMinutes;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5477b bVar = (C5477b) obj;
        if (!(this.timeoutInSec == bVar.timeoutInSec && this.enabled == bVar.enabled && this.discoveryIntervalInMinutes == bVar.discoveryIntervalInMinutes)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(Integer.valueOf(this.timeoutInSec), Boolean.valueOf(this.enabled), Integer.valueOf(this.discoveryIntervalInMinutes));
    }
}
