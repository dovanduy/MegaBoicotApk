package com.startapp.android.publish.adsCommon.p180d;

/* renamed from: com.startapp.android.publish.adsCommon.d.a */
/* compiled from: StartAppSDK */
public class C5362a extends C5363b {
    private static final long serialVersionUID = 1;
    private final String DURATION_PARAM_NAME = "&displayDuration=";
    private String duration;

    public C5362a(String str, String str2) {
        super(str2);
        this.duration = str;
    }

    public String getQueryString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getQueryString());
        sb.append("&displayDuration=");
        sb.append(encode(this.duration));
        return sb.toString();
    }
}
