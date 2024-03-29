package com.startapp.android.publish.ads.video.tracking;

/* compiled from: StartAppSDK */
public class VideoClickedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 1;
    private ClickOrigin clickOrigin;

    /* compiled from: StartAppSDK */
    public enum ClickOrigin {
        POSTROLL,
        VIDEO
    }

    public VideoClickedTrackingParams(String str, int i, int i2, ClickOrigin clickOrigin2, String str2) {
        super(str, i, i2, str2);
        this.clickOrigin = clickOrigin2;
    }

    public String getQueryString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCompletedQuery());
        sb.append(getClickOriginQuery());
        sb.append(getVideoPlayingModeQuery());
        return getQueryString(sb.toString());
    }

    private String getClickOriginQuery() {
        StringBuilder sb = new StringBuilder();
        sb.append("&co=");
        sb.append(this.clickOrigin.toString());
        return sb.toString();
    }
}
