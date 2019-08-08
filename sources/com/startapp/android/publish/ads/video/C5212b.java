package com.startapp.android.publish.ads.video;

import android.content.Context;
import com.facebook.ads.AudienceNetworkActivity;
import com.startapp.android.publish.ads.video.C5229c.C5232a;
import com.startapp.android.publish.ads.video.C5281g.C5283a;
import com.startapp.android.publish.ads.video.C5284h.C5285a;
import com.startapp.android.publish.ads.video.p171a.C5211b;
import com.startapp.android.publish.ads.video.p173c.p174a.C5234a;
import com.startapp.android.publish.ads.video.p173c.p174a.C5241c;
import com.startapp.android.publish.ads.video.p173c.p174a.C5244d;
import com.startapp.android.publish.ads.video.p173c.p176b.C5248b;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingLink;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingParams;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.C5286Ad.AdType;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5364e;
import com.startapp.android.publish.adsCommon.C5382g;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.cache.C5436a;
import com.startapp.android.publish.cache.C5445c;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.common.model.GetAdRequest;
import com.startapp.android.publish.html.C5489a;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p193a.C5519h.C5520a;
import com.startapp.common.p196c.C5544b;
import java.net.URL;
import java.util.ArrayList;

/* renamed from: com.startapp.android.publish.ads.video.b */
/* compiled from: StartAppSDK */
public class C5212b extends C5489a {

    /* renamed from: i */
    private long f16732i = System.currentTimeMillis();

    /* renamed from: j */
    private volatile C5445c f16733j;

    /* renamed from: k */
    private C5241c f16734k;

    /* renamed from: l */
    private int f16735l = 0;

    public C5212b(Context context, C5286Ad ad, AdPreferences adPreferences, AdEventListener adEventListener) {
        C5241c cVar;
        super(context, ad, adPreferences, adEventListener, Placement.INAPP_OVERLAY, true);
        if (C5344b.m22784a().mo19756H().mo20051r() == 0) {
            cVar = new C5241c(context);
        } else {
            cVar = new C5244d(context, C5344b.m22784a().mo19756H().mo20052s());
        }
        this.f16734k = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18692a(Object obj) {
        boolean z;
        C5520a aVar = (C5520a) obj;
        String str = null;
        if (aVar == null || !aVar.mo20493b().toLowerCase().contains("json")) {
            if (aVar != null) {
                str = aVar.mo20491a();
            }
            if (C5344b.m22784a().mo19756H().mo20040h() && m22320b(str)) {
                m22319b(false);
            }
            return super.mo18692a(obj);
        }
        if (C5344b.m22784a().mo19756H().mo20040h() && !this.f17489h.hasCampaignExclude()) {
            m22319b(true);
        }
        try {
            VASTJson vASTJson = (VASTJson) C5544b.m23666a(aVar.mo20491a(), VASTJson.class);
            if (vASTJson == null || vASTJson.getVastTag() == null) {
                z = m22315a("no VAST wrapper in json", null, true);
            } else {
                C5248b bVar = new C5248b(C5344b.m22784a().mo19756H().mo20047n(), C5344b.m22784a().mo19756H().mo20048o());
                C5234a a = bVar.mo19355a(this.f17183a, vASTJson.getVastTag(), this.f16734k);
                ((C5253e) this.f17184b).mo19361a(bVar.mo19356a(), this.f17184b.getType() != AdType.REWARDED_VIDEO);
                if (vASTJson.getTtlSec() != null) {
                    ((C5253e) this.f17184b).mo19842d(vASTJson.getTtlSec());
                }
                if (a == C5234a.ErrorNone) {
                    m22314a(C5234a.SAProcessSuccess);
                    aVar.mo20492a(vASTJson.getAdmTag());
                    aVar.mo20494b(AudienceNetworkActivity.WEBVIEW_MIME_TYPE);
                    z = super.mo18692a((Object) aVar);
                } else {
                    m22314a(a);
                    if (vASTJson.getCampaignId() != null) {
                        this.f17488g.add(vASTJson.getCampaignId());
                    }
                    this.f16735l++;
                    ((C5253e) this.f17184b).mo19364e();
                    if (System.currentTimeMillis() - this.f16732i >= ((long) C5344b.m22784a().mo19756H().mo20049p())) {
                        z = m22315a("VAST retry timeout", null, false);
                    } else if (this.f16735l > C5344b.m22784a().mo19756H().mo20050q()) {
                        z = m22315a("VAST too many excludes", null, false);
                    } else {
                        z = mo19821d().booleanValue();
                    }
                }
            }
            return z;
        } catch (Exception e) {
            return m22315a("VAST json parsing", e, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18691a(final Boolean bool) {
        super.mo18691a(bool);
        if (!bool.booleanValue() || !m22321h()) {
            mo20436a(bool.booleanValue());
            return;
        }
        if (C5344b.m22784a().mo19756H().mo20042i()) {
            super.mo19254b(bool);
        }
        mo19253b().setVideoMuted(this.f17185c.isVideoMuted());
        C5249d.m22476a().mo19358a(this.f17183a.getApplicationContext(), mo19253b().getVideoUrl(), new C5283a() {
            /* renamed from: a */
            public void mo19255a(String str) {
                if (str != null) {
                    if (!str.equals("downloadInterrupted")) {
                        C5212b.super.mo19254b(bool);
                        C5212b.this.mo19253b().setLocalVideoPath(str);
                    }
                    C5212b.this.mo20436a(bool.booleanValue());
                    return;
                }
                C5212b.this.mo20436a(false);
                C5212b.this.f17186d.onFailedToReceiveAd(C5212b.this.f17184b);
                C5212b.this.m22314a(C5234a.FileNotFound);
            }
        }, new C5232a() {
            /* renamed from: a */
            public void mo19256a(String str) {
                C5212b.this.mo19253b().setLocalVideoPath(str);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo19252a(GetAdRequest getAdRequest) {
        if (!super.mo19252a(getAdRequest)) {
            return false;
        }
        if (getAdRequest.isAdTypeVideo()) {
            C5285a a = C5284h.m22593a(this.f17183a);
            if (a != C5285a.ELIGIBLE) {
                this.f17188f = a.mo19410a();
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GetAdRequest mo18905a() {
        return mo19819b((GetAdRequest) new C5209a());
    }

    /* renamed from: h */
    private boolean m22321h() {
        return mo19253b() != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19254b(Boolean bool) {
        if (!m22321h()) {
            super.mo19254b(bool);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public VideoAdDetails mo19253b() {
        return ((C5253e) this.f17184b).mo19363d();
    }

    /* renamed from: b */
    private void m22319b(boolean z) {
        AdPreferences adPreferences;
        if ((this.f17184b.getType() != AdType.REWARDED_VIDEO && this.f17184b.getType() != AdType.VIDEO) || z) {
            if (this.f17185c == null) {
                adPreferences = new AdPreferences();
            } else {
                adPreferences = new AdPreferences(this.f17185c);
            }
            AdPreferences adPreferences2 = adPreferences;
            adPreferences2.setType((this.f17184b.getType() == AdType.REWARDED_VIDEO || this.f17184b.getType() == AdType.VIDEO) ? AdType.VIDEO_NO_VAST : AdType.NON_VIDEO);
            C5445c a = C5436a.m23246a().mo20069a(this.f17183a, (StartAppAd) null, this.f17187e, adPreferences2, (AdEventListener) null);
            if (z) {
                this.f16733j = a;
            }
        }
    }

    /* renamed from: b */
    private boolean m22320b(String str) {
        return C5307i.m22659a(str, "@videoJson@", "@videoJson@") != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22314a(C5234a aVar) {
        VideoTrackingLink[] videoTrackingLinkArr = null;
        try {
            if (!(mo19253b() == null || mo19253b().getVideoTrackingDetails() == null)) {
                videoTrackingLinkArr = mo19253b().getVideoTrackingDetails().getInlineErrorTrackingUrls();
            }
            if (videoTrackingLinkArr != null && videoTrackingLinkArr.length > 0) {
                if (aVar == C5234a.SAShowBeforeVast || aVar == C5234a.SAProcessSuccess) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        String lowerCase = new URL(MetaData.getInstance().getAdPlatformHost()).getHost().split("\\.")[1].toLowerCase();
                        for (VideoTrackingLink videoTrackingLink : videoTrackingLinkArr) {
                            if (videoTrackingLink.getTrackingUrl() != null && videoTrackingLink.getTrackingUrl().toLowerCase().contains(lowerCase)) {
                                arrayList.add(videoTrackingLink);
                            }
                        }
                        if (arrayList.size() > 0) {
                            videoTrackingLinkArr = (VideoTrackingLink[]) arrayList.toArray(new VideoTrackingLink[arrayList.size()]);
                        } else {
                            return;
                        }
                    } catch (Exception e) {
                        C5378f.m23016a(this.f17183a, C5376d.EXCEPTION, "GetVideoEnabledService.sendVideoErrorEvent filter sa links", e.getMessage(), "");
                    }
                }
                C5284h.m22596a(this.f17183a, new C5211b(videoTrackingLinkArr, new VideoTrackingParams("", 0, 0, "1"), mo19253b().getVideoUrl(), 0).mo19251a("error").mo19250a(aVar).mo19249a());
            }
        } catch (Exception e2) {
            C5378f.m23016a(this.f17183a, C5376d.EXCEPTION, "GetVideoEnabledService.sendVideoErrorEvent", e2.getMessage(), "");
        }
    }

    /* renamed from: a */
    private boolean m22315a(String str, Throwable th, boolean z) {
        C5518g.m23564a("GetVideoEnabledService", 6, str, th);
        if (z) {
            C5378f.m23016a(this.f17183a, C5376d.EXCEPTION, str, th != null ? th.getMessage() : "", "");
        }
        C5382g a = C5436a.m23246a().mo20067a(this.f16733j);
        if (a instanceof C5364e) {
            C5520a aVar = new C5520a();
            aVar.mo20494b(AudienceNetworkActivity.WEBVIEW_MIME_TYPE);
            aVar.mo20492a(((C5364e) a).mo19847f());
            return super.mo18692a((Object) aVar);
        }
        this.f17184b.setErrorMessage(this.f17188f);
        return false;
    }
}
