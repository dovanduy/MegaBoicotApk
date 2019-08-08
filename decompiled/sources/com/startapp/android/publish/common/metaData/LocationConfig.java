package com.startapp.android.publish.common.metaData;

import com.startapp.android.publish.adsCommon.Utils.C5307i;
import java.io.Serializable;

/* compiled from: StartAppSDK */
public class LocationConfig implements Serializable {
    private static final boolean DEFAULT_CO_ENABLED = false;
    private static final boolean DEFAULT_FI_ENABLED = false;
    private static final long serialVersionUID = 1;
    private boolean coEnabled = false;
    private boolean fiEnabled = false;

    public boolean isFiEnabled() {
        return this.fiEnabled;
    }

    public boolean isCoEnabled() {
        return this.coEnabled;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationConfig locationConfig = (LocationConfig) obj;
        if (!(this.fiEnabled == locationConfig.fiEnabled && this.coEnabled == locationConfig.coEnabled)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(Boolean.valueOf(this.fiEnabled), Boolean.valueOf(this.coEnabled));
    }
}
