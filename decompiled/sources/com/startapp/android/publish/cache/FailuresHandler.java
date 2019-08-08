package com.startapp.android.publish.cache;

import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: StartAppSDK */
public class FailuresHandler implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean infiniteLastRetry = true;
    @C5548f(mo20535b = ArrayList.class, mo20536c = Integer.class)
    private List<Integer> intervals = Arrays.asList(new Integer[]{Integer.valueOf(10), Integer.valueOf(30), Integer.valueOf(60), Integer.valueOf(300)});

    public List<Integer> getIntervals() {
        return this.intervals;
    }

    public boolean isInfiniteLastRetry() {
        return this.infiniteLastRetry;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailuresHandler failuresHandler = (FailuresHandler) obj;
        if (this.infiniteLastRetry != failuresHandler.infiniteLastRetry || !C5307i.m22682b(this.intervals, failuresHandler.intervals)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(this.intervals, Boolean.valueOf(this.infiniteLastRetry));
    }
}
