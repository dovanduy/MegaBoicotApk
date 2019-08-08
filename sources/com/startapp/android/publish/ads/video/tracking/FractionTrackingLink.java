package com.startapp.android.publish.ads.video.tracking;

import com.startapp.common.p196c.C5547e;
import java.io.Serializable;

@C5547e(mo20533c = true)
/* compiled from: StartAppSDK */
public class FractionTrackingLink extends VideoTrackingLink implements Serializable {
    private static final long serialVersionUID = 1;
    private int fraction;

    public int getFraction() {
        return this.fraction;
    }

    public void setFraction(int i) {
        this.fraction = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", fraction=");
        sb.append(this.fraction);
        return sb.toString();
    }
}
