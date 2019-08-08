package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.ads.internal.adapters.C1637i;
import com.facebook.ads.internal.p086m.C1765d;
import com.facebook.ads.internal.p093t.C1821d;
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1822e.C1832c;
import com.facebook.ads.internal.p093t.C1834g;
import com.facebook.ads.internal.p093t.C1835h;
import com.facebook.ads.internal.p093t.C1836i;
import com.facebook.ads.internal.p115w.p117b.C2322j;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.protocol.C1787e;
import com.facebook.ads.internal.view.C2243j;
import org.json.JSONObject;

public abstract class NativeAdBase implements C1514Ad {

    /* renamed from: a */
    private final C1822e f4726a;

    public static class Image {

        /* renamed from: a */
        private final C1834g f4729a;

        Image(C1834g gVar) {
            this.f4729a = gVar;
        }

        public Image(String str, int i, int i2) {
            this.f4729a = new C1834g(str, i, i2);
        }

        public static Image fromJSONObject(JSONObject jSONObject) {
            C1834g a = C1834g.m7705a(jSONObject);
            if (a == null) {
                return null;
            }
            return new Image(a);
        }

        public int getHeight() {
            return this.f4729a.mo7782c();
        }

        public int getWidth() {
            return this.f4729a.mo7781b();
        }
    }

    public enum MediaCacheFlag {
        NONE(C1821d.NONE),
        ALL(C1821d.ALL);
        

        /* renamed from: a */
        private final C1821d f4731a;

        private MediaCacheFlag(C1821d dVar) {
            this.f4731a = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1821d mo6967a() {
            return this.f4731a;
        }

        public long getCacheFlagValue() {
            return this.f4731a.mo7730a();
        }
    }

    public enum NativeComponentTag {
        AD_ICON(C2322j.INTERNAL_AD_ICON),
        AD_TITLE(C2322j.INTERNAL_AD_TITLE),
        AD_COVER_IMAGE(C2322j.INTERNAL_AD_COVER_IMAGE),
        AD_SUBTITLE(C2322j.INTERNAL_AD_SUBTITLE),
        AD_BODY(C2322j.INTERNAL_AD_BODY),
        AD_CALL_TO_ACTION(C2322j.INTERNAL_AD_CALL_TO_ACTION),
        AD_SOCIAL_CONTEXT(C2322j.INTERNAL_AD_SOCIAL_CONTEXT),
        AD_CHOICES_ICON(C2322j.INTERNAL_AD_CHOICES_ICON),
        AD_OPTIONS_VIEW(C2322j.INTERNAL_AD_OPTIONS_VIEW),
        AD_MEDIA(C2322j.INTERNAL_AD_MEDIA);
        

        /* renamed from: a */
        private final C2322j f4733a;

        private NativeComponentTag(C2322j jVar) {
            this.f4733a = jVar;
        }

        public static void tagView(View view, NativeComponentTag nativeComponentTag) {
            if (view != null && nativeComponentTag != null) {
                C2322j.m9044a(view, nativeComponentTag.f4733a);
            }
        }
    }

    public static class Rating {

        /* renamed from: a */
        private final C1836i f4734a;

        public Rating(double d, double d2) {
            this.f4734a = new C1836i(d, d2);
        }

        Rating(C1836i iVar) {
            this.f4734a = iVar;
        }

        public static Rating fromJSONObject(JSONObject jSONObject) {
            C1836i a = C1836i.m7710a(jSONObject);
            if (a == null) {
                return null;
            }
            return new Rating(a);
        }

        public double getScale() {
            return this.f4734a.mo7784b();
        }

        public double getValue() {
            return this.f4734a.mo7783a();
        }
    }

    public NativeAdBase(Context context, C1637i iVar, C1765d dVar) {
        this.f4726a = new C1822e(context, iVar, dVar, getViewTraversalPredicate());
    }

    public NativeAdBase(Context context, String str) {
        this.f4726a = new C1822e(context, str, getViewTraversalPredicate());
    }

    NativeAdBase(NativeAdBase nativeAdBase) {
        this.f4726a = new C1822e(nativeAdBase.f4726a);
    }

    NativeAdBase(C1822e eVar) {
        this.f4726a = eVar;
    }

    public static C1832c getViewTraversalPredicate() {
        return new C1832c() {
            /* renamed from: a */
            public boolean mo6959a(View view) {
                return (view instanceof MediaViewVideoRenderer) || (view instanceof AdChoicesView) || (view instanceof AdOptionsView) || (view instanceof C2243j);
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6922a(MediaView mediaView) {
        if (mediaView != null) {
            this.f4726a.mo7749c(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6923a(C1787e eVar) {
        this.f4726a.mo7738a(eVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6924a(boolean z) {
        this.f4726a.mo7743a(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6925b(MediaView mediaView) {
        if (mediaView != null) {
            this.f4726a.mo7751d(true);
        }
    }

    public void destroy() {
        this.f4726a.mo7750d();
    }

    public void downloadMedia() {
        this.f4726a.mo7748c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C1822e mo6927f() {
        return this.f4726a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C1637i mo6928g() {
        return this.f4726a.mo7731a();
    }

    public String getAdBodyText() {
        return this.f4726a.mo7759l();
    }

    public String getAdCallToAction() {
        return this.f4726a.mo7732a("call_to_action");
    }

    public Image getAdChoicesIcon() {
        if (this.f4726a.mo7762o() == null) {
            return null;
        }
        return new Image(this.f4726a.mo7762o());
    }

    public String getAdChoicesImageUrl() {
        if (this.f4726a.mo7762o() == null) {
            return null;
        }
        return this.f4726a.mo7762o().mo7780a();
    }

    public String getAdChoicesLinkUrl() {
        return this.f4726a.mo7763p();
    }

    public String getAdChoicesText() {
        return this.f4726a.mo7764q();
    }

    public Image getAdCoverImage() {
        if (this.f4726a.mo7757j() == null) {
            return null;
        }
        return new Image(this.f4726a.mo7757j());
    }

    public String getAdHeadline() {
        return this.f4726a.mo7732a("headline");
    }

    public Image getAdIcon() {
        if (this.f4726a.mo7756i() == null) {
            return null;
        }
        return new Image(this.f4726a.mo7756i());
    }

    public String getAdLinkDescription() {
        return this.f4726a.mo7732a("link_description");
    }

    public String getAdSocialContext() {
        return this.f4726a.mo7732a("social_context");
    }

    @Deprecated
    public Rating getAdStarRating() {
        if (this.f4726a.mo7760m() == null) {
            return null;
        }
        return new Rating(this.f4726a.mo7760m());
    }

    public String getAdTranslation() {
        return this.f4726a.mo7732a("ad_translation");
    }

    public String getAdUntrimmedBodyText() {
        return this.f4726a.mo7732a(TtmlNode.TAG_BODY);
    }

    public NativeAdViewAttributes getAdViewAttributes() {
        if (this.f4726a.mo7758k() == null) {
            return null;
        }
        return new NativeAdViewAttributes(this.f4726a.mo7758k());
    }

    public String getAdvertiserName() {
        return this.f4726a.mo7732a("advertiser_name");
    }

    public String getId() {
        return this.f4726a.mo7761n();
    }

    public String getPlacementId() {
        return this.f4726a.mo7752e();
    }

    public String getPromotedTranslation() {
        return this.f4726a.mo7732a("promoted_translation");
    }

    public String getSponsoredTranslation() {
        return this.f4726a.mo7732a("sponsored_translation");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public String mo6948h() {
        return this.f4726a.mo7769v();
    }

    public boolean hasCallToAction() {
        return this.f4726a.mo7755h();
    }

    public boolean isAdInvalidated() {
        return this.f4726a.mo7747b();
    }

    public boolean isAdLoaded() {
        return this.f4726a.mo7753f();
    }

    public boolean isNativeConfigEnabled() {
        return this.f4726a.mo7754g();
    }

    public void loadAd() {
        loadAd(MediaCacheFlag.ALL);
    }

    public void loadAd(MediaCacheFlag mediaCacheFlag) {
        this.f4726a.mo7739a(mediaCacheFlag.mo6967a(), (String) null);
    }

    public void loadAdFromBid(String str) {
        loadAdFromBid(str, MediaCacheFlag.ALL);
    }

    public void loadAdFromBid(String str, MediaCacheFlag mediaCacheFlag) {
        this.f4726a.mo7739a(mediaCacheFlag.mo6967a(), str);
    }

    public void onCtaBroadcast() {
        this.f4726a.mo7770w();
    }

    public void setAdListener(final NativeAdListener nativeAdListener) {
        if (nativeAdListener != null) {
            this.f4726a.mo7740a((C1835h) new C1835h() {
                /* renamed from: a */
                public void mo6960a() {
                    nativeAdListener.onMediaDownloaded(NativeAdBase.this);
                }

                /* renamed from: a */
                public void mo6961a(C1782a aVar) {
                    nativeAdListener.onError(NativeAdBase.this, AdError.getAdErrorFromWrapper(aVar));
                }

                /* renamed from: b */
                public void mo6962b() {
                    nativeAdListener.onAdLoaded(NativeAdBase.this);
                }

                /* renamed from: c */
                public void mo6963c() {
                    nativeAdListener.onAdClicked(NativeAdBase.this);
                }

                /* renamed from: d */
                public void mo6964d() {
                    nativeAdListener.onLoggingImpression(NativeAdBase.this);
                }
            });
        }
    }

    public void setExtraHints(ExtraHints extraHints) {
        if (extraHints != null) {
            this.f4726a.mo7745b(extraHints.getHints());
        }
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f4726a.mo7733a(onTouchListener);
    }

    public void unregisterView() {
        this.f4726a.mo7773z();
    }
}
