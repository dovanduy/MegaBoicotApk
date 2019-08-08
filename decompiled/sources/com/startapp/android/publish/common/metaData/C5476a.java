package com.startapp.android.publish.common.metaData;

import com.startapp.android.publish.adsCommon.Utils.C5307i;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.common.metaData.a */
/* compiled from: StartAppSDK */
public class C5476a implements Serializable {
    private static final long serialVersionUID = 1;
    private int delay = 3;
    private boolean enabled = true;
    private int minApiLevel = 18;

    public C5476a() {
    }

    public C5476a(int i) {
        this.minApiLevel = i;
    }

    /* renamed from: a */
    public int mo20262a() {
        return this.delay;
    }

    /* renamed from: b */
    public int mo20263b() {
        return this.minApiLevel;
    }

    /* renamed from: c */
    public boolean mo20264c() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5476a aVar = (C5476a) obj;
        if (!(this.delay == aVar.delay && this.minApiLevel == aVar.minApiLevel && this.enabled == aVar.enabled)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(Integer.valueOf(this.delay), Integer.valueOf(this.minApiLevel), Boolean.valueOf(this.enabled));
    }
}
