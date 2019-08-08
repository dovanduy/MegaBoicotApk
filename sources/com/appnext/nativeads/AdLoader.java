package com.appnext.nativeads;

import android.content.Context;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C1309d.C1316a;
import com.appnext.core.C1334j;
import com.appnext.core.C1345p.C1347a;
import com.appnext.nativeads.NativeAdRequest.VideoLength;
import com.appnext.nativeads.NativeAdRequest.VideoQuality;
import java.util.ArrayList;
import java.util.HashMap;

public class AdLoader {
    /* access modifiers changed from: private */
    public int count;
    /* access modifiers changed from: private */

    /* renamed from: mp */
    public NativeAdListener f4303mp;
    /* access modifiers changed from: private */

    /* renamed from: mq */
    public NativeAdRequest f4304mq;
    /* access modifiers changed from: private */
    public NativeAdObject nativeAdObject;

    private AdLoader(Context context, String str) {
        this.nativeAdObject = new NativeAdObject(context, str);
    }

    public static void load(Context context, String str, NativeAdRequest nativeAdRequest, NativeAdListener nativeAdListener, int i) {
        if (nativeAdRequest == null) {
            throw new IllegalArgumentException("Ad request cannot be null");
        } else if (nativeAdListener == null) {
            throw new IllegalArgumentException("Ad listener cannot be null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Count must be > 0");
        } else {
            AdLoader adLoader = new AdLoader(context, str);
            adLoader.f4304mq = new NativeAdRequest(nativeAdRequest);
            adLoader.count = i;
            adLoader.f4303mp = nativeAdListener;
            C1416b.m5865cT().mo6276a(context, (C1347a) new C1347a(adLoader) {

                /* renamed from: mr */
                final /* synthetic */ AdLoader f4305mr;

                {
                    this.f4305mr = r1;
                }

                /* renamed from: a */
                public final void mo5535a(HashMap<String, Object> hashMap) {
                    AdLoader.m5818a(this.f4305mr);
                }

                public final void error(String str) {
                    AdLoader.m5818a(this.f4305mr);
                }
            });
        }
    }

    private void load() {
        this.nativeAdObject.setCategories(this.f4304mq.getCategories());
        this.nativeAdObject.setPostback(this.f4304mq.getPostback());
        this.nativeAdObject.setMinVideoLength(this.f4304mq.getMinVideoLength());
        this.nativeAdObject.setMaxVideoLength(this.f4304mq.getMaxVideoLength());
        C1334j.m5708cI().mo6263e(Integer.parseInt(C1416b.m5865cT().get("banner_expiration_time")));
        C1417c.m5874cU().mo6454a(this.nativeAdObject.getContext(), this.nativeAdObject, this.nativeAdObject.getPlacementID(), new C1316a() {
            /* renamed from: a */
            public final <T> void mo5540a(T t) {
                if (t == null) {
                    AdLoader.this.f4303mp.onError(null, new AppnextError(AppnextError.NO_ADS));
                    return;
                }
                if (AdLoader.this.f4304mq.getVideoLength() == VideoLength.DEFAULT) {
                    AdLoader.this.f4304mq.setVideoLength(VideoLength.fromInt(Integer.parseInt(C1416b.m5865cT().get("default_video_length"))));
                }
                if (AdLoader.this.f4304mq.getVideoQuality() == VideoQuality.DEFAULT) {
                    AdLoader.this.f4304mq.setVideoQuality(VideoQuality.fromInt(Integer.parseInt(C1416b.m5865cT().get("default_video_quality"))));
                }
                ArrayList a = C1417c.m5874cU().mo6453a(AdLoader.this.nativeAdObject.getPlacementID(), AdLoader.this.f4304mq, (ArrayList) t);
                if (a.size() == 0) {
                    AdLoader.this.f4303mp.onError(null, new AppnextError(AppnextError.NO_ADS));
                    return;
                }
                for (int i = 0; i < Math.min(a.size(), AdLoader.this.count); i++) {
                    NativeAd nativeAd = new NativeAd(AdLoader.this.nativeAdObject.getContext(), AdLoader.this.nativeAdObject.getPlacementID());
                    nativeAd.setLoadedAd(new NativeAdData((AppnextAd) a.get(i)), AdLoader.this.f4304mq);
                    AdLoader.this.f4303mp.onAdLoaded(nativeAd);
                }
                AdLoader.m5823f(AdLoader.this);
            }

            public final void error(String str) {
                if (str == null || str.equals(AppnextError.NO_ADS) || str.equals(AppnextError.INTERNAL_ERROR)) {
                    AdLoader.this.f4303mp.onError(null, new AppnextError(AppnextError.NO_ADS));
                } else {
                    AdLoader.this.f4303mp.onError(null, new AppnextError(str));
                }
                AdLoader.m5823f(AdLoader.this);
            }
        }, this.f4304mq);
    }

    private void destroy() {
        this.f4303mp = null;
        this.f4304mq = null;
        if (this.nativeAdObject != null) {
            this.nativeAdObject.destroy();
            this.nativeAdObject = null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5818a(AdLoader adLoader) {
        adLoader.nativeAdObject.setCategories(adLoader.f4304mq.getCategories());
        adLoader.nativeAdObject.setPostback(adLoader.f4304mq.getPostback());
        adLoader.nativeAdObject.setMinVideoLength(adLoader.f4304mq.getMinVideoLength());
        adLoader.nativeAdObject.setMaxVideoLength(adLoader.f4304mq.getMaxVideoLength());
        C1334j.m5708cI().mo6263e(Integer.parseInt(C1416b.m5865cT().get("banner_expiration_time")));
        C1417c.m5874cU().mo6454a(adLoader.nativeAdObject.getContext(), adLoader.nativeAdObject, adLoader.nativeAdObject.getPlacementID(), new C1316a() {
            /* renamed from: a */
            public final <T> void mo5540a(T t) {
                if (t == null) {
                    AdLoader.this.f4303mp.onError(null, new AppnextError(AppnextError.NO_ADS));
                    return;
                }
                if (AdLoader.this.f4304mq.getVideoLength() == VideoLength.DEFAULT) {
                    AdLoader.this.f4304mq.setVideoLength(VideoLength.fromInt(Integer.parseInt(C1416b.m5865cT().get("default_video_length"))));
                }
                if (AdLoader.this.f4304mq.getVideoQuality() == VideoQuality.DEFAULT) {
                    AdLoader.this.f4304mq.setVideoQuality(VideoQuality.fromInt(Integer.parseInt(C1416b.m5865cT().get("default_video_quality"))));
                }
                ArrayList a = C1417c.m5874cU().mo6453a(AdLoader.this.nativeAdObject.getPlacementID(), AdLoader.this.f4304mq, (ArrayList) t);
                if (a.size() == 0) {
                    AdLoader.this.f4303mp.onError(null, new AppnextError(AppnextError.NO_ADS));
                    return;
                }
                for (int i = 0; i < Math.min(a.size(), AdLoader.this.count); i++) {
                    NativeAd nativeAd = new NativeAd(AdLoader.this.nativeAdObject.getContext(), AdLoader.this.nativeAdObject.getPlacementID());
                    nativeAd.setLoadedAd(new NativeAdData((AppnextAd) a.get(i)), AdLoader.this.f4304mq);
                    AdLoader.this.f4303mp.onAdLoaded(nativeAd);
                }
                AdLoader.m5823f(AdLoader.this);
            }

            public final void error(String str) {
                if (str == null || str.equals(AppnextError.NO_ADS) || str.equals(AppnextError.INTERNAL_ERROR)) {
                    AdLoader.this.f4303mp.onError(null, new AppnextError(AppnextError.NO_ADS));
                } else {
                    AdLoader.this.f4303mp.onError(null, new AppnextError(str));
                }
                AdLoader.m5823f(AdLoader.this);
            }
        }, adLoader.f4304mq);
    }

    /* renamed from: f */
    static /* synthetic */ void m5823f(AdLoader adLoader) {
        adLoader.f4303mp = null;
        adLoader.f4304mq = null;
        if (adLoader.nativeAdObject != null) {
            adLoader.nativeAdObject.destroy();
            adLoader.nativeAdObject = null;
        }
    }
}
