package com.startapp.android.publish.ads.video.tracking;

import com.startapp.common.p196c.C5547e;
import java.io.Serializable;

@C5547e(mo20533c = true)
/* compiled from: StartAppSDK */
public class AbsoluteTrackingLink extends VideoTrackingLink implements Serializable {
    private static final long serialVersionUID = 1;
    private int videoOffsetMillis;

    public int getVideoOffsetMillis() {
        return this.videoOffsetMillis;
    }

    public void setVideoOffsetMillis(int i) {
        this.videoOffsetMillis = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", videoOffsetMillis=");
        sb.append(this.videoOffsetMillis);
        return sb.toString();
    }
}
