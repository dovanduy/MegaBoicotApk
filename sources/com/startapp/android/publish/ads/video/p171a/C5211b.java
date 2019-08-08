package com.startapp.android.publish.ads.video.p171a;

import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.startapp.android.publish.ads.video.p173c.p174a.C5234a;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingLink;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingLink.TrackingSource;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingParams;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.common.p193a.C5503a;
import com.startapp.common.p193a.C5518g;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.ads.video.a.b */
/* compiled from: StartAppSDK */
public class C5211b {

    /* renamed from: a */
    private VideoTrackingLink[] f16726a;

    /* renamed from: b */
    private VideoTrackingParams f16727b;

    /* renamed from: c */
    private String f16728c;

    /* renamed from: d */
    private int f16729d;

    /* renamed from: e */
    private String f16730e = "";

    /* renamed from: f */
    private C5234a f16731f;

    public C5211b(VideoTrackingLink[] videoTrackingLinkArr, VideoTrackingParams videoTrackingParams, String str, int i) {
        this.f16726a = videoTrackingLinkArr;
        this.f16727b = videoTrackingParams;
        this.f16728c = str;
        this.f16729d = i;
    }

    /* renamed from: a */
    public C5211b mo19250a(C5234a aVar) {
        this.f16731f = aVar;
        return this;
    }

    /* renamed from: a */
    public C5211b mo19251a(String str) {
        this.f16730e = str;
        return this;
    }

    /* renamed from: a */
    public C5210a mo19249a() {
        VideoTrackingLink[] videoTrackingLinkArr;
        if (!m22304b()) {
            C5518g.m23563a("VideoEventBuilder", 3, "Some fields have illegal values");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoTrackingLink videoTrackingLink : this.f16726a) {
            if (videoTrackingLink.getTrackingUrl() == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring tracking link - tracking url is null: tracking link = ");
                sb.append(videoTrackingLink);
                C5518g.m23563a("VideoEventBuilder", 5, sb.toString());
            } else if (this.f16727b.getOffset() <= 0 || videoTrackingLink.shouldAppendReplay()) {
                arrayList.add(m22301a(videoTrackingLink));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignoring tracking link - external replay event: tracking link = ");
                sb2.append(videoTrackingLink);
                C5518g.m23563a("VideoEventBuilder", 3, sb2.toString());
            }
        }
        return new C5210a(arrayList, this.f16730e);
    }

    /* renamed from: b */
    private boolean m22304b() {
        return (this.f16726a == null || this.f16727b == null) ? false : true;
    }

    /* renamed from: a */
    private String m22301a(VideoTrackingLink videoTrackingLink) {
        StringBuilder sb = new StringBuilder();
        VideoTrackingParams b = m22302b(videoTrackingLink);
        String trackingUrl = videoTrackingLink.getTrackingUrl();
        sb.append(m22303b(trackingUrl));
        sb.append(b.getQueryString());
        if (b.getInternalTrackingParamsIndicator()) {
            sb.append(C5503a.m23472a(C5349c.m22885e(trackingUrl)));
        }
        return sb.toString();
    }

    /* renamed from: b */
    private VideoTrackingParams m22302b(VideoTrackingLink videoTrackingLink) {
        TrackingSource trackingSource = videoTrackingLink.getTrackingSource();
        return this.f16727b.setInternalTrackingParamsIndicator(trackingSource != null && trackingSource == TrackingSource.STARTAPP).setShouldAppendOffset(videoTrackingLink.shouldAppendReplay()).setReplayParameter(videoTrackingLink.getReplayParameter());
    }

    /* renamed from: b */
    private String m22303b(String str) {
        String replace = str.replace("[ASSETURI]", this.f16728c != null ? TextUtils.htmlEncode(this.f16728c) : "").replace("[CONTENTPLAYHEAD]", TextUtils.htmlEncode(m22300a(this.f16729d))).replace("[CACHEBUSTING]", TextUtils.htmlEncode(m22305c())).replace("[TIMESTAMP]", TextUtils.htmlEncode(m22306d()));
        return this.f16731f != null ? replace.replace("[ERRORCODE]", String.valueOf(this.f16731f.mo19291a())) : replace;
    }

    /* renamed from: c */
    private static String m22305c() {
        return String.valueOf(10000000 + new SecureRandom().nextInt(90000000));
    }

    /* renamed from: a */
    private static String m22300a(int i) {
        long convert = TimeUnit.SECONDS.convert((long) i, TimeUnit.MILLISECONDS);
        long j = convert % 60;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(convert / 3600), Long.valueOf((convert % 3600) / 60), Long.valueOf(j), Long.valueOf((long) (i % AdError.NETWORK_ERROR_CODE))});
    }

    /* renamed from: d */
    private static String m22306d() {
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(new Date());
        int length = format.length() - 2;
        StringBuilder sb = new StringBuilder();
        sb.append(format.substring(0, length));
        sb.append(":");
        sb.append(format.substring(length));
        return sb.toString();
    }
}
