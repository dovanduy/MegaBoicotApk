package com.startapp.android.publish.common.metaData;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5414k;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.common.metaData.h */
/* compiled from: StartAppSDK */
public class C5487h implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean enabled = false;

    /* renamed from: a */
    public boolean mo20292a() {
        return this.enabled;
    }

    /* renamed from: a */
    public boolean mo20293a(Context context) {
        return C5414k.m23092a(context, "userDisabledSimpleToken", Boolean.valueOf(false)).booleanValue();
    }

    /* renamed from: b */
    public boolean mo20294b(Context context) {
        return !mo20293a(context) && mo20292a();
    }

    /* renamed from: a */
    public void mo20291a(Context context, boolean z) {
        C5414k.m23099b(context, "userDisabledSimpleToken", Boolean.valueOf(!z));
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.enabled != ((C5487h) obj).enabled) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Boolean.valueOf(this.enabled).hashCode();
    }
}
