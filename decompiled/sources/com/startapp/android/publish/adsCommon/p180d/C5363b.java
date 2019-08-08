package com.startapp.android.publish.adsCommon.p180d;

import android.content.Context;
import com.google.android.exoplayer2.C2793C;
import com.startapp.android.publish.adsCommon.C5427m;
import com.startapp.android.publish.adsCommon.Utils.C5305g;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.p193a.C5503a;
import com.startapp.common.p193a.C5517f;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.startapp.android.publish.adsCommon.d.b */
/* compiled from: StartAppSDK */
public class C5363b implements Serializable {
    private static final long serialVersionUID = 1;
    private String adTag;
    private String clientSessionId;
    private String location;
    private String nonImpressionReason;
    private int offset;
    private String profileId;

    public C5363b() {
        this(null);
    }

    public C5363b(String str) {
        this.adTag = str;
        this.clientSessionId = C5305g.m22636d().mo19627a();
        this.profileId = MetaData.getInstance().getProfileId();
        this.offset = 0;
    }

    public String getAdTag() {
        return this.adTag;
    }

    public String getClientSessionId() {
        return this.clientSessionId;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public int getOffset() {
        return this.offset;
    }

    public C5363b setOffset(int i) {
        this.offset = i;
        return this;
    }

    public String getNonImpressionReason() {
        return this.nonImpressionReason;
    }

    public C5363b setNonImpressionReason(String str) {
        this.nonImpressionReason = str;
        return this;
    }

    public void setLocation(Context context) {
        try {
            C5427m.m23145a().mo20014h(context);
            this.location = C5517f.m23558a(C5517f.m23559a(context, MetaData.getInstance().getLocationConfig().isFiEnabled(), MetaData.getInstance().getLocationConfig().isCoEnabled()));
        } catch (Exception unused) {
            this.location = null;
        }
    }

    private String getLocationQuery() {
        if (this.location == null || this.location.equals("")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("&locations=");
        sb.append(encode(C5503a.m23478c(this.location)));
        return sb.toString();
    }

    private String getNonImpressionReasonQuery() {
        if (this.nonImpressionReason == null || this.nonImpressionReason.equals("")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("&isShown=false&reason=");
        sb.append(encode(this.nonImpressionReason));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String getOffsetQuery() {
        if (this.offset <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("&offset=");
        sb.append(this.offset);
        return sb.toString();
    }

    private String getAdTagQuery() {
        if (this.adTag == null || this.adTag.equals("")) {
            return "";
        }
        int i = 200;
        if (this.adTag.length() < 200) {
            i = this.adTag.length();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("&adTag=");
        sb.append(encode(this.adTag.substring(0, i)));
        return sb.toString();
    }

    private String getClientSessionIdQuery() {
        if (this.clientSessionId == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("&clientSessionId=");
        sb.append(encode(this.clientSessionId));
        return sb.toString();
    }

    private String getProfileIdQuery() {
        if (this.profileId == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("&profileId=");
        sb.append(encode(this.profileId));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String encode(String str) {
        try {
            return URLEncoder.encode(str, C2793C.UTF8_NAME);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public String getQueryString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAdTagQuery());
        sb.append(getClientSessionIdQuery());
        sb.append(getProfileIdQuery());
        sb.append(getOffsetQuery());
        sb.append(getNonImpressionReasonQuery());
        sb.append(getLocationQuery());
        return sb.toString();
    }
}
