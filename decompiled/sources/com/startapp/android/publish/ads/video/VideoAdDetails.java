package com.startapp.android.publish.ads.video;

import com.startapp.android.publish.ads.video.p173c.p174a.C5246e;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingDetails;
import com.startapp.android.publish.omsdk.AdVerification;
import com.startapp.android.publish.omsdk.VerificationDetails;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;

/* compiled from: StartAppSDK */
public class VideoAdDetails implements Serializable {
    private static final long serialVersionUID = 1;
    @C5548f(mo20535b = VerificationDetails.class, mo20539f = "adVerifications")
    private VerificationDetails[] adVerifications;
    private String clickUrl;
    private boolean clickable;
    private boolean closeable;
    private boolean isVideoMuted;
    private String localVideoPath;
    @C5548f(mo20535b = PostRollType.class)
    private PostRollType postRoll;
    private boolean skippable;
    private int skippableAfter;
    @C5548f(mo20534a = true)
    private VideoTrackingDetails videoTrackingDetails;
    private String videoUrl;

    /* compiled from: StartAppSDK */
    public enum PostRollType {
        IMAGE,
        LAST_FRAME,
        NONE
    }

    public VideoAdDetails() {
    }

    public VideoAdDetails(C5246e eVar, boolean z) {
        if (eVar != null) {
            this.videoTrackingDetails = new VideoTrackingDetails(eVar);
            if (eVar.mo19352g() != null) {
                this.videoUrl = eVar.mo19352g().mo19310a();
            }
            boolean z2 = true;
            if (z) {
                this.skippableAfter = eVar.mo19351f();
                this.skippable = this.skippableAfter != Integer.MAX_VALUE;
            } else {
                this.skippable = false;
            }
            this.clickUrl = eVar.mo19348c().mo19332a();
            if (this.clickUrl == null) {
                z2 = false;
            }
            this.clickable = z2;
            this.postRoll = PostRollType.NONE;
            setAdVerifications(eVar.mo19353h());
        }
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public String getLocalVideoPath() {
        return this.localVideoPath;
    }

    public void setLocalVideoPath(String str) {
        this.localVideoPath = str;
    }

    public PostRollType getPostRollType() {
        return this.postRoll;
    }

    public boolean isCloseable() {
        return this.closeable;
    }

    public boolean isSkippable() {
        return this.skippable;
    }

    public int getSkippableAfter() {
        return this.skippableAfter;
    }

    public boolean isClickable() {
        return this.clickable;
    }

    public VideoTrackingDetails getVideoTrackingDetails() {
        return this.videoTrackingDetails;
    }

    public boolean isVideoMuted() {
        return this.isVideoMuted;
    }

    public void setVideoMuted(boolean z) {
        this.isVideoMuted = z;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public AdVerification getAdVerifications() {
        return new AdVerification(this.adVerifications);
    }

    public void setAdVerifications(AdVerification adVerification) {
        if (adVerification != null && adVerification.getAdVerification() != null) {
            this.adVerifications = (VerificationDetails[]) adVerification.getAdVerification().toArray(new VerificationDetails[adVerification.getAdVerification().size()]);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoAdDetails [videoUrl=");
        sb.append(this.videoUrl);
        sb.append(", localVideoPath=");
        sb.append(this.localVideoPath);
        sb.append(", postRoll=");
        sb.append(this.postRoll);
        sb.append(", closeable=");
        sb.append(this.closeable);
        sb.append(", skippable=");
        sb.append(this.skippable);
        sb.append(", skippableAfter=");
        sb.append(this.skippableAfter);
        sb.append(", videoTrackingDetails= ");
        sb.append(this.videoTrackingDetails);
        sb.append(", isVideoMuted= ");
        sb.append(this.isVideoMuted);
        sb.append("]");
        return sb.toString();
    }
}
