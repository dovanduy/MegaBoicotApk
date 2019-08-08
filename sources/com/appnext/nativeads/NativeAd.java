package com.appnext.nativeads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appnext.ads.C1066a;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1309d.C1316a;
import com.appnext.core.C1326f;
import com.appnext.core.C1334j;
import com.appnext.core.C1336k;
import com.appnext.core.C1345p;
import com.appnext.core.C1345p.C1347a;
import com.appnext.core.C1349q;
import com.appnext.core.C1349q.C1358a;
import com.appnext.core.p049a.C1305b;
import com.appnext.core.result.C1369a;
import com.appnext.core.result.C1371c;
import com.appnext.core.result.C1372d;
import com.appnext.core.result.ResultPageActivity;
import com.appnext.nativeads.NativeAdRequest.CreativeType;
import com.appnext.nativeads.NativeAdRequest.VideoLength;
import com.appnext.nativeads.NativeAdRequest.VideoQuality;
import com.appnext.p050d.C1378a;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C2793C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NativeAd {
    /* access modifiers changed from: private */
    public NativeAdListener adListener;
    /* access modifiers changed from: private */
    public C1411a adViewActions;
    /* access modifiers changed from: private */
    public boolean clicked = false;
    private List<View> clicksListView;
    /* access modifiers changed from: private */
    public CreativeType creativeType;
    /* access modifiers changed from: private */
    public Handler handler;
    private String language;
    /* access modifiers changed from: private */
    public NativeAdData loadedAd;
    /* access modifiers changed from: private */
    public MediaView mediaView;
    /* access modifiers changed from: private */
    public NativeAdObject nativeAdObject;
    /* access modifiers changed from: private */
    public NativeAdView nativeAdView;
    private int privacyPolicyColor = 0;
    private int privacyPolicyPosition = 1;
    /* access modifiers changed from: private */
    public boolean reportedImpression = false;
    /* access modifiers changed from: private */
    public boolean reportedVTA = false;
    /* access modifiers changed from: private */
    public C1349q userAction;

    /* renamed from: com.appnext.nativeads.NativeAd$a */
    private class C1405a implements OnClickListener {
        private C1405a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a6, code lost:
            r5.f4343mE.click();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
                r5 = this;
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                com.appnext.nativeads.NativeAdData r6 = r6.loadedAd
                if (r6 == 0) goto L_0x00ec
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                java.lang.String r0 = "click_event"
                r6.report(r0)
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                boolean r6 = r6.reportedImpression
                if (r6 != 0) goto L_0x001c
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                r6.impression()
            L_0x001c:
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                com.appnext.nativeads.NativeAdData r6 = r6.loadedAd
                java.lang.String r6 = r6.getWebview()
                java.lang.String r0 = "0"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L_0x0034
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                r6.click()
                return
            L_0x0034:
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                com.appnext.nativeads.NativeAdData r6 = r6.loadedAd
                java.lang.String r6 = r6.getRevenueType()
                java.lang.String r0 = "cpi"
                boolean r6 = r6.equals(r0)
                r0 = -1
                r1 = 0
                r2 = 1
                if (r6 == 0) goto L_0x00ac
                com.appnext.nativeads.b r6 = com.appnext.nativeads.C1416b.m5865cT()
                java.lang.String r3 = "cpiActiveFlow"
                java.lang.String r6 = r6.get(r3)
                java.lang.String r6 = r6.toLowerCase()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "cpiActiveFlow "
                r3.<init>(r4)
                r3.append(r6)
                int r3 = r6.hashCode()
                switch(r3) {
                    case 97: goto L_0x0087;
                    case 98: goto L_0x007d;
                    case 99: goto L_0x0073;
                    case 100: goto L_0x0069;
                    default: goto L_0x0068;
                }
            L_0x0068:
                goto L_0x0090
            L_0x0069:
                java.lang.String r3 = "d"
                boolean r6 = r6.equals(r3)
                if (r6 == 0) goto L_0x0090
                r0 = 3
                goto L_0x0090
            L_0x0073:
                java.lang.String r3 = "c"
                boolean r6 = r6.equals(r3)
                if (r6 == 0) goto L_0x0090
                r0 = 2
                goto L_0x0090
            L_0x007d:
                java.lang.String r3 = "b"
                boolean r6 = r6.equals(r3)
                if (r6 == 0) goto L_0x0090
                r0 = r2
                goto L_0x0090
            L_0x0087:
                java.lang.String r3 = "a"
                boolean r6 = r6.equals(r3)
                if (r6 == 0) goto L_0x0090
                r0 = r1
            L_0x0090:
                switch(r0) {
                    case 0: goto L_0x00a0;
                    case 1: goto L_0x009a;
                    case 2: goto L_0x0094;
                    default: goto L_0x0093;
                }
            L_0x0093:
                goto L_0x00a6
            L_0x0094:
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                r6.openResultPage(r1)
                goto L_0x00ec
            L_0x009a:
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                r6.clicked = r2
                goto L_0x00a6
            L_0x00a0:
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                r6.openResultPage(r2)
                goto L_0x00ec
            L_0x00a6:
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                r6.click()
                return
            L_0x00ac:
                com.appnext.nativeads.b r6 = com.appnext.nativeads.C1416b.m5865cT()
                java.lang.String r3 = "cpcActiveFlow"
                java.lang.String r6 = r6.get(r3)
                java.lang.String r6 = r6.toLowerCase()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "cpcActiveFlow "
                r3.<init>(r4)
                r3.append(r6)
                int r3 = r6.hashCode()
                switch(r3) {
                    case 97: goto L_0x00d6;
                    case 98: goto L_0x00cc;
                    default: goto L_0x00cb;
                }
            L_0x00cb:
                goto L_0x00df
            L_0x00cc:
                java.lang.String r1 = "b"
                boolean r6 = r6.equals(r1)
                if (r6 == 0) goto L_0x00df
                r0 = r2
                goto L_0x00df
            L_0x00d6:
                java.lang.String r3 = "a"
                boolean r6 = r6.equals(r3)
                if (r6 == 0) goto L_0x00df
                r0 = r1
            L_0x00df:
                if (r0 == 0) goto L_0x00e2
                goto L_0x00e7
            L_0x00e2:
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                r6.clicked = r2
            L_0x00e7:
                com.appnext.nativeads.NativeAd r6 = com.appnext.nativeads.NativeAd.this
                r6.click()
            L_0x00ec:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appnext.nativeads.NativeAd.C1405a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.appnext.nativeads.NativeAd$b */
    public @interface C1406b {
    }

    /* renamed from: com.appnext.nativeads.NativeAd$c */
    public @interface C1407c {
    }

    public NativeAd(Context context, String str) {
        this.nativeAdObject = createAd(context, str);
        C1416b.m5865cT().mo6285r("tid", this.nativeAdObject.getTID());
        C1416b.m5865cT().mo6276a(context, (C1347a) null);
        this.clicksListView = new ArrayList();
        this.adViewActions = new C1411a() {
            /* renamed from: k */
            public final void mo6401k(int i) {
                new StringBuilder("percent ").append(i);
                if (!NativeAd.this.reportedImpression && i >= Integer.parseInt(C1416b.m5865cT().get("min_imp_precentage"))) {
                    int parseInt = Integer.parseInt(C1416b.m5865cT().get("postpone_impression_sec"));
                    if (!Boolean.parseBoolean(C1416b.m5865cT().get("repeat_viewable_criteria")) || parseInt <= 0) {
                        if (!NativeAd.this.reportedImpression) {
                            NativeAd.this.reportedImpression = true;
                            NativeAd.this.impression();
                        }
                    } else if (NativeAd.this.handler != null) {
                        NativeAd.this.handler.postDelayed(new Runnable() {
                            public final void run() {
                                if (NativeAd.this.nativeAdView != null && !NativeAd.this.reportedImpression && NativeAd.this.nativeAdView.getVisiblePercent(NativeAd.this.nativeAdView) >= Integer.parseInt(C1416b.m5865cT().get("min_imp_precentage"))) {
                                    NativeAd.this.impression();
                                    NativeAd.this.reportedImpression = true;
                                }
                            }
                        }, (long) (parseInt * AdError.NETWORK_ERROR_CODE));
                    }
                }
                if (!NativeAd.this.reportedVTA && i >= Integer.parseInt(C1416b.m5865cT().get("min_vta_precentage"))) {
                    int parseInt2 = Integer.parseInt(C1416b.m5865cT().get("postpone_vta_sec"));
                    if (!Boolean.parseBoolean(C1416b.m5865cT().get("repeat_vta_viewable_criteria")) || parseInt2 <= 0) {
                        if (!NativeAd.this.reportedVTA) {
                            NativeAd.this.reportedVTA = true;
                            NativeAd.this.userAction.mo6290a(NativeAd.this.loadedAd, NativeAd.this.loadedAd.getAppURL(), null);
                        }
                    } else if (NativeAd.this.handler != null) {
                        NativeAd.this.handler.postDelayed(new Runnable() {
                            public final void run() {
                                if (NativeAd.this.nativeAdView != null && !NativeAd.this.reportedVTA && NativeAd.this.nativeAdView.getVisiblePercent(NativeAd.this.nativeAdView) >= Integer.parseInt(C1416b.m5865cT().get("min_vta_precentage"))) {
                                    NativeAd.this.userAction.mo6290a(NativeAd.this.loadedAd, NativeAd.this.loadedAd.getAppURL(), null);
                                    NativeAd.this.reportedVTA = true;
                                }
                            }
                        }, (long) (parseInt2 * AdError.NETWORK_ERROR_CODE));
                    }
                }
            }
        };
        this.handler = new Handler();
        this.userAction = new C1349q(context, new C1358a() {
            public final void report(String str) {
            }

            /* renamed from: Y */
            public final C1286Ad mo5458Y() {
                return NativeAd.this.nativeAdObject;
            }

            /* renamed from: Z */
            public final AppnextAd mo5459Z() {
                return NativeAd.this.loadedAd;
            }

            /* renamed from: aa */
            public final C1345p mo5460aa() {
                return C1416b.m5865cT();
            }
        });
    }

    public void loadAd(NativeAdRequest nativeAdRequest) {
        if (this.handler != null) {
            final NativeAdRequest nativeAdRequest2 = new NativeAdRequest(nativeAdRequest);
            this.nativeAdObject.setCategories(nativeAdRequest2.getCategories());
            this.nativeAdObject.setPostback(nativeAdRequest2.getPostback());
            this.nativeAdObject.setMinVideoLength(nativeAdRequest2.getMinVideoLength());
            this.nativeAdObject.setMaxVideoLength(nativeAdRequest2.getMaxVideoLength());
            this.creativeType = nativeAdRequest2.getCreativeType();
            StringBuilder sb = new StringBuilder("caching_");
            sb.append(nativeAdRequest2.getCachingPolicy());
            report(sb.toString());
            C1416b.m5865cT().mo6276a(this.nativeAdObject.getContext(), (C1347a) new C1347a() {
                /* renamed from: a */
                public final void mo5535a(HashMap<String, Object> hashMap) {
                    NativeAd.this.load(nativeAdRequest2);
                }

                public final void error(String str) {
                    NativeAd.this.load(nativeAdRequest2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void load(final NativeAdRequest nativeAdRequest) {
        C1334j.m5708cI().mo6263e(Integer.parseInt(C1416b.m5865cT().get("banner_expiration_time")));
        C1417c.m5874cU().mo6454a(this.nativeAdObject.getContext(), this.nativeAdObject, this.nativeAdObject.getPlacementID(), new C1316a() {
            /* renamed from: a */
            public final <T> void mo5540a(T t) {
                if (NativeAd.this.handler != null) {
                    NativeAd.this.reportedImpression = false;
                    NativeAd.this.reportedVTA = false;
                    if (nativeAdRequest.getVideoLength() == VideoLength.DEFAULT) {
                        nativeAdRequest.setVideoLength(VideoLength.fromInt(Integer.parseInt(C1416b.m5865cT().get("default_video_length"))));
                    }
                    if (nativeAdRequest.getVideoQuality() == VideoQuality.DEFAULT) {
                        nativeAdRequest.setVideoQuality(VideoQuality.fromInt(Integer.parseInt(C1416b.m5865cT().get("default_video_quality"))));
                    }
                    AppnextAd appnextAd = null;
                    try {
                        appnextAd = C1417c.m5874cU().mo6451a(NativeAd.this.nativeAdObject.getContext(), (C1286Ad) NativeAd.this.nativeAdObject, nativeAdRequest);
                    } catch (Throwable unused) {
                    }
                    if (appnextAd == null) {
                        if (NativeAd.this.adListener != null) {
                            NativeAd.this.report(C1066a.f3561cz);
                            NativeAd.this.adListener.onError(NativeAd.this, new AppnextError(AppnextError.NO_ADS));
                        }
                        return;
                    }
                    NativeAd.this.setLoadedAd(appnextAd, nativeAdRequest);
                    if (NativeAd.this.mediaView != null) {
                        NativeAd.this.mediaView.mo6339a(NativeAd.this, NativeAd.this.loadedAd, NativeAd.this.creativeToMediaType(NativeAd.this.creativeType));
                    }
                    if (NativeAd.this.nativeAdView != null) {
                        NativeAd.this.nativeAdView.mo6436a(NativeAd.this, NativeAd.this.loadedAd, NativeAd.this.adViewActions);
                    }
                    if (NativeAd.this.adListener != null) {
                        NativeAd.this.adListener.onAdLoaded(NativeAd.this);
                    }
                }
            }

            public final void error(String str) {
                if (NativeAd.this.adListener != null) {
                    if (str == null || str.equals(AppnextError.NO_ADS) || str.equals(AppnextError.INTERNAL_ERROR)) {
                        NativeAd.this.report(C1066a.f3561cz);
                        NativeAd.this.adListener.onError(NativeAd.this, new AppnextError(AppnextError.NO_ADS));
                        return;
                    }
                    NativeAd nativeAd = NativeAd.this;
                    StringBuilder sb = new StringBuilder("error_");
                    sb.append(str.toLowerCase().replace(" ", "_"));
                    nativeAd.report(sb.toString());
                    NativeAd.this.adListener.onError(NativeAd.this, new AppnextError(str));
                }
            }
        }, nativeAdRequest);
    }

    /* access modifiers changed from: protected */
    public void setLoadedAd(AppnextAd appnextAd, NativeAdRequest nativeAdRequest) {
        this.loadedAd = new NativeAdData(appnextAd);
        NativeAdData nativeAdData = this.loadedAd;
        StringBuilder sb = new StringBuilder();
        sb.append(this.loadedAd.getAppURL());
        sb.append("&tem_id=");
        sb.append(this.nativeAdObject.getTemId(this.loadedAd));
        nativeAdData.setAppURL(sb.toString());
        NativeAdData nativeAdData2 = this.loadedAd;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.loadedAd.getImpressionURL());
        sb2.append("&tem_id=");
        sb2.append(this.nativeAdObject.getTemId(this.loadedAd));
        nativeAdData2.setImpressionURL(sb2.toString());
        try {
            C1417c.m5874cU();
            String a = C1417c.m5870a(nativeAdRequest, (AppnextAd) this.loadedAd);
            if (!a.equals("")) {
                this.loadedAd.mo6409aX(a);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    public MediaType creativeToMediaType(CreativeType creativeType2) {
        if (creativeType2 == CreativeType.STATIC_ONLY) {
            return MediaType.STATIC;
        }
        return MediaType.VIDEO;
    }

    /* access modifiers changed from: protected */
    public NativeAdObject createAd(Context context, String str) {
        return new NativeAdObject(context, str);
    }

    public boolean isLoaded() {
        return (this.loadedAd == null || this.nativeAdObject == null || !this.nativeAdObject.isAdLoaded()) ? false : true;
    }

    public void setAdListener(NativeAdListener nativeAdListener) {
        this.adListener = nativeAdListener;
    }

    public String getCategories() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getCategories();
    }

    public String getAdDescription() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getAdDescription();
    }

    public String getAdTitle() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getAdTitle();
    }

    public String getCTAText() {
        if (this.loadedAd == null) {
            return null;
        }
        boolean i = C1326f.m5694i(this.nativeAdObject.getContext(), this.loadedAd.getAdPackage());
        if (!this.loadedAd.getButtonText().equals("")) {
            return C1305b.m5595cN().mo6203c(getLanguage(), i ? C1305b.f4127lU : C1305b.f4126lT, this.loadedAd.getButtonText());
        } else if (i) {
            return C1305b.m5595cN().mo6203c(getLanguage(), C1305b.f4127lU, C1416b.m5865cT().get("existing_button_text"));
        } else {
            return C1305b.m5595cN().mo6203c(getLanguage(), C1305b.f4126lT, C1416b.m5865cT().get("new_button_text"));
        }
    }

    public String getIconURL() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getImageURL();
    }

    public String getWideImageURL() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getWideImageURL();
    }

    public String getVideoUrl() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getSelectedVideo();
    }

    public String getBannerID() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getBannerID();
    }

    public String getCountry() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getCountry();
    }

    public String getSupportedVersion() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getSupportedVersion();
    }

    public String getStoreRating() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getStoreRating();
    }

    public String getStoreDownloads() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getStoreDownloads();
    }

    public String getAppSize() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getAppSize();
    }

    public String getAppPackageName() {
        if (this.loadedAd == null) {
            return null;
        }
        return this.loadedAd.getAdPackage();
    }

    public float getECPM() {
        if (this.loadedAd == null) {
            return 0.0f;
        }
        return this.loadedAd.getECPM();
    }

    public float getPPR() {
        if (this.loadedAd == null) {
            return 0.0f;
        }
        return this.loadedAd.getPPR();
    }

    public boolean isGPRD() {
        return this.loadedAd != null && this.loadedAd.isGdpr();
    }

    public String getPPU() {
        if (this.loadedAd == null) {
            return null;
        }
        return C1326f.m5691f(this.loadedAd);
    }

    public void setMediaView(MediaView mediaView2) {
        this.mediaView = mediaView2;
        if (this.loadedAd != null && mediaView2 != null) {
            mediaView2.mo6339a(this, this.loadedAd, creativeToMediaType(this.creativeType));
        }
    }

    public MediaView getMediaView() {
        return this.mediaView;
    }

    public void setNativeAdView(NativeAdView nativeAdView2) {
        if (this.nativeAdView != null) {
            this.nativeAdView.reset();
        }
        this.nativeAdView = nativeAdView2;
        if (this.nativeAdView != null && this.loadedAd != null) {
            this.nativeAdView.mo6436a(this, this.loadedAd, this.adViewActions);
        }
    }

    public void setParams(String str, String str2) {
        C1416b.m5865cT().mo6278a(str, str2);
    }

    /* access modifiers changed from: private */
    public void impression() {
        if (this.loadedAd != null) {
            this.reportedImpression = true;
            report(C1066a.f3524cJ);
            this.userAction.mo6295e((AppnextAd) this.loadedAd);
            C1334j.m5708cI().mo6265o(this.loadedAd.getBannerID(), this.nativeAdObject.getPlacementID());
            if (this.adListener != null) {
                this.adListener.adImpression(this);
            }
            if (Boolean.parseBoolean(C1416b.m5865cT().get("fq_control")) && this.nativeAdObject != null && this.nativeAdObject.fq_status) {
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            StringBuilder sb = new StringBuilder("https://www.fqtag.com/pixel.cgi?org=TkBXEI5C3FBIr4zXwnmK&p=");
                            sb.append(NativeAd.this.nativeAdObject.getPlacementID());
                            sb.append("&a=");
                            sb.append(NativeAd.this.loadedAd.getBannerID());
                            sb.append("&cmp=");
                            sb.append(NativeAd.this.loadedAd.getCampaignID());
                            sb.append("&fmt=banner&dmn=");
                            sb.append(NativeAd.this.loadedAd.getAdPackage());
                            sb.append("&ad=&rt=displayImg&gid=");
                            sb.append(C1326f.m5675b(NativeAd.this.nativeAdObject.getContext(), true));
                            sb.append("&aid=&applng=");
                            sb.append(Locale.getDefault().toString());
                            sb.append("&app=");
                            sb.append(NativeAd.this.nativeAdObject.getContext().getPackageName());
                            sb.append("&c1=100&c2=");
                            sb.append(NativeAd.this.nativeAdObject.getTID());
                            sb.append("&c3=");
                            sb.append(NativeAd.this.nativeAdObject.getAUID());
                            sb.append("&c4=");
                            sb.append(NativeAd.this.nativeAdObject.getVID());
                            sb.append("&sl=1&fq=1");
                            C1326f.m5659a(sb.toString(), null);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
            }
        }
    }

    public NativeAdView getNativeAdView() {
        return this.nativeAdView;
    }

    public void registerClickableViews(View view) {
        ArrayList arrayList = new ArrayList();
        fillListWithSubviews(arrayList, view);
        registerClickableViews((List<View>) arrayList);
    }

    public void registerClickableViews(List<View> list) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        } else if (list.size() == 0) {
            throw new IllegalArgumentException("List cannot be empty");
        } else {
            C1405a aVar = new C1405a();
            for (View view : list) {
                if (!(view instanceof PrivacyIcon) && !(view instanceof C1378a) && !(view instanceof C1394a)) {
                    this.clicksListView.add(view);
                    view.setOnClickListener(aVar);
                }
            }
        }
    }

    private void fillListWithSubviews(ArrayList<View> arrayList, View view) {
        if (!(view instanceof PrivacyIcon) && !(view instanceof C1378a)) {
            arrayList.add(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    fillListWithSubviews(arrayList, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public void downloadAndDisplayImage(final ImageView imageView, final String str) {
        if (this.handler != null) {
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        Bitmap aL = C1326f.m5671aL(str);
                        if (aL != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(NativeAd.this.nativeAdObject.getContext().getResources(), aL);
                            new Handler(Looper.getMainLooper()).post(new Runnable() {
                                public final void run() {
                                    try {
                                        imageView.setImageDrawable(bitmapDrawable);
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                        }
                    } catch (Throwable unused) {
                    }
                }
            }).start();
        }
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void destroy() {
        try {
            if (this.handler != null) {
                this.handler.removeCallbacksAndMessages(null);
            }
            for (View onClickListener : this.clicksListView) {
                onClickListener.setOnClickListener(null);
            }
            if (this.clicksListView != null) {
                this.clicksListView.clear();
            }
            if (this.userAction != null) {
                this.userAction.destroy();
            }
            if (this.nativeAdObject != null) {
                this.nativeAdObject.destroy();
            }
            if (this.mediaView != null) {
                this.mediaView.destroy();
            }
            this.handler = null;
            this.adViewActions = null;
            this.mediaView = null;
            this.adListener = null;
            this.loadedAd = null;
            this.nativeAdView = null;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public void openResultPage(boolean z) {
        C1372d.m5794cO().mo6317a(new C1371c() {
            /* renamed from: av */
            public final C1369a mo5689av() {
                return null;
            }

            public final JSONObject getConfigParams() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vid", "2.4.5.472");
                jSONObject.put("tid", NativeAd.this.nativeAdObject == null ? "" : NativeAd.this.nativeAdObject.getTID());
                jSONObject.put("auid", NativeAd.this.nativeAdObject == null ? "" : NativeAd.this.nativeAdObject.getAUID());
                jSONObject.put("osid", "100");
                jSONObject.put("tem_id", NativeAd.this.nativeAdObject.getTemId(NativeAd.this.loadedAd));
                jSONObject.put(TtmlNode.ATTR_ID, getPlacementId());
                String str = "b_title";
                NativeAdData access$500 = NativeAd.this.loadedAd;
                String buttonText = new NativeAdData(access$500).getButtonText();
                if (access$500 != null && buttonText.equals("")) {
                    buttonText = C1326f.m5694i(NativeAd.this.nativeAdObject.getContext(), access$500.getAdPackage()) ? C1416b.m5865cT().get("existing_button_text") : C1416b.m5865cT().get("new_button_text");
                }
                jSONObject.put(str, buttonText);
                jSONObject.put("cat", NativeAd.this.loadedAd.getCategories());
                jSONObject.put("pview", C1416b.m5865cT().get("pview"));
                jSONObject.put("devn", C1326f.m5684cE());
                jSONObject.put("dosv", VERSION.SDK_INT);
                jSONObject.put("dds", "0");
                jSONObject.put("ads_type", "banner");
                jSONObject.put("country", NativeAd.this.loadedAd.getCountry());
                jSONObject.put("gdpr", C1336k.m5716a((AppnextAd) NativeAd.this.loadedAd, (C1345p) C1416b.m5865cT()));
                return jSONObject;
            }

            /* access modifiers changed from: protected */
            public final String getButtonText(AppnextAd appnextAd) {
                String buttonText = new NativeAdData(appnextAd).getButtonText();
                if (appnextAd == null || !buttonText.equals("")) {
                    return buttonText;
                }
                if (C1326f.m5694i(NativeAd.this.nativeAdObject.getContext(), appnextAd.getAdPackage())) {
                    return C1416b.m5865cT().get("existing_button_text");
                }
                return C1416b.m5865cT().get("new_button_text");
            }

            public final AppnextAd getSelectedAd() {
                return NativeAd.this.loadedAd;
            }

            public final String getPlacementId() {
                return NativeAd.this.nativeAdObject.getPlacementID();
            }

            /* renamed from: aq */
            public final String mo5684aq() {
                return NativeAd.this.nativeAdObject.getTemId(NativeAd.this.loadedAd);
            }

            /* renamed from: ar */
            public final String mo5685ar() {
                return C1417c.m5874cU().mo6231l(NativeAd.this.nativeAdObject);
            }

            /* renamed from: as */
            public final String mo5686as() {
                try {
                    ArrayList f = C1417c.m5874cU().mo6455f(NativeAd.this.nativeAdObject);
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(new JSONObject(C1417c.m5605d((AppnextAd) it.next())));
                    }
                    return new JSONObject().put("apps", jSONArray).toString();
                } catch (Throwable unused) {
                    return "";
                }
            }

            /* renamed from: at */
            public final C1345p mo5687at() {
                return C1416b.m5865cT();
            }

            /* renamed from: au */
            public final C1286Ad mo5688au() {
                return NativeAd.this.nativeAdObject;
            }
        });
        Intent intent = new Intent(this.nativeAdObject.getContext(), ResultPageActivity.class);
        intent.putExtra("shouldClose", z);
        intent.setFlags(C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.nativeAdObject.getContext().startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void click() {
        this.userAction.mo6291a(this.loadedAd, this.loadedAd.getAppURL(), this.nativeAdObject.getPlacementID(), null);
        if (this.adListener != null) {
            this.adListener.onAdClicked(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (i == 0 && this.clicked) {
            this.clicked = false;
            openResultPage(false);
        }
    }

    public void setPrivacyPolicyPosition(@C1407c int i) {
        this.privacyPolicyPosition = i;
    }

    @C1407c
    public int getPrivacyPolicyPosition() {
        return this.privacyPolicyPosition;
    }

    public void setPrivacyPolicyColor(@C1406b int i) {
        this.privacyPolicyColor = i;
    }

    @C1406b
    public int getPrivacyPolicyColor() {
        return this.privacyPolicyColor;
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        try {
            C1326f.m5665a(this.nativeAdObject.getTID(), this.nativeAdObject.getVID(), this.nativeAdObject.getAUID(), this.nativeAdObject.getPlacementID(), this.nativeAdObject.getSessionId(), str, "pub_control", this.loadedAd != null ? this.loadedAd.getBannerID() : "", this.loadedAd != null ? this.loadedAd.getCampaignID() : "");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    public void mo6386i() {
        StringBuilder sb = new StringBuilder();
        sb.append(Thread.currentThread().getStackTrace()[3].getClassName());
        sb.append(Thread.currentThread().getStackTrace()[3].getMethodName());
        if (sb.toString().hashCode() == -133704518 && !this.reportedImpression) {
            impression();
        }
    }
}
