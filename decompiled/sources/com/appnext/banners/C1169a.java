package com.appnext.banners;

import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.VideoView;
import com.appnext.ads.C1066a;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1309d.C1316a;
import com.appnext.core.C1317e.C1324a;
import com.appnext.core.C1326f;
import com.appnext.core.C1334j;
import com.appnext.core.C1336k;
import com.appnext.core.C1345p;
import com.appnext.core.C1345p.C1347a;
import com.appnext.core.C1349q;
import com.appnext.core.C1349q.C1358a;
import com.appnext.core.ECPM;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.appnext.core.p049a.C1305b;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.appnext.banners.a */
public class C1169a extends C1203e {
    private final int TICK = 330;
    /* access modifiers changed from: private */
    public BannerAdRequest adRequest;
    /* access modifiers changed from: private */
    public ArrayList<AppnextAd> ads;
    /* access modifiers changed from: private */
    public BannerAd bannerAd;
    private boolean clickEnabled = true;
    /* access modifiers changed from: private */
    public BannerAdData currentAd;
    /* access modifiers changed from: private */
    public int currentPosition = 0;
    /* access modifiers changed from: private */
    public boolean finished = false;
    private int lastProgress = 0;
    /* access modifiers changed from: private */
    public boolean loaded = false;
    /* access modifiers changed from: private */
    public Handler mHandler;
    /* access modifiers changed from: private */
    public MediaPlayer mediaPlayer;
    /* access modifiers changed from: private */
    public boolean reportedImpression = false;
    private C1219i serviceHelper;
    /* access modifiers changed from: private */
    public boolean started = false;
    /* access modifiers changed from: private */
    public String template = "";
    /* access modifiers changed from: private */
    public Runnable tick = new Runnable() {
        public final void run() {
            try {
                C1169a.this.checkProgress();
                C1169a.this.currentPosition = C1169a.this.mediaPlayer.getCurrentPosition();
                if (C1169a.this.mediaPlayer.getCurrentPosition() < C1169a.this.mediaPlayer.getDuration() && !C1169a.this.finished) {
                    C1169a.this.mHandler.postDelayed(C1169a.this.tick, 330);
                }
            } catch (Throwable unused) {
            }
        }
    };
    /* access modifiers changed from: private */
    public C1349q userAction;
    /* access modifiers changed from: private */
    public boolean userMute = true;
    private VideoView videoView;

    public void init(ViewGroup viewGroup) {
        super.init(viewGroup);
        this.userAction = new C1349q(this.context, new C1358a() {
            public final void report(String str) {
                C1169a.this.report(str);
            }

            /* renamed from: Y */
            public final C1286Ad mo5458Y() {
                return C1169a.this.bannerAd;
            }

            /* renamed from: Z */
            public final AppnextAd mo5459Z() {
                return C1169a.this.getSelectedAd();
            }

            /* renamed from: aa */
            public final C1345p mo5460aa() {
                return C1202d.m5145aI();
            }
        });
        this.mHandler = new Handler();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.appnext.core.C1286Ad createAd(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            com.appnext.banners.BannerSize r0 = r3.getBannerSize()
            java.lang.String r0 = r0.toString()
            int r1 = r0.hashCode()
            r2 = -1966536496(0xffffffff8ac908d0, float:-1.9358911E-32)
            if (r1 == r2) goto L_0x0030
            r2 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
            if (r1 == r2) goto L_0x0026
            r2 = 1951953708(0x7458732c, float:6.859571E31)
            if (r1 == r2) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003a
            r0 = 0
            goto L_0x003b
        L_0x0026:
            java.lang.String r1 = "MEDIUM_RECTANGLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003a
            r0 = 2
            goto L_0x003b
        L_0x0030:
            java.lang.String r1 = "LARGE_BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003a
            r0 = 1
            goto L_0x003b
        L_0x003a:
            r0 = -1
        L_0x003b:
            switch(r0) {
                case 0: goto L_0x0062;
                case 1: goto L_0x005c;
                case 2: goto L_0x0056;
                default: goto L_0x003e;
            }
        L_0x003e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Wrong banner size "
            r5.<init>(r0)
            com.appnext.banners.BannerSize r0 = r3.getBannerSize()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0056:
            com.appnext.banners.MediumRectangleAd r0 = new com.appnext.banners.MediumRectangleAd
            r0.<init>(r4, r5)
            return r0
        L_0x005c:
            com.appnext.banners.LargeBannerAd r0 = new com.appnext.banners.LargeBannerAd
            r0.<init>(r4, r5)
            return r0
        L_0x0062:
            com.appnext.banners.SmallBannerAd r0 = new com.appnext.banners.SmallBannerAd
            r0.<init>(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C1169a.createAd(android.content.Context, java.lang.String):com.appnext.core.Ad");
    }

    public void loadAd(BannerAdRequest bannerAdRequest) {
        if (bannerAdRequest == null) {
            throw new IllegalStateException("BannerAdRequest cannot be null.");
        } else if (getPlacementId() == null) {
            throw new IllegalStateException("Missing placement id.");
        } else if (getBannerSize() == null) {
            throw new IllegalStateException("Missing banner size.");
        } else {
            if (this.bannerAd == null) {
                this.bannerAd = (BannerAd) createAd(this.context, getPlacementId());
            }
            this.bannerAd.setCategories(bannerAdRequest.getCategories());
            this.bannerAd.setPostback(bannerAdRequest.getPostback());
            this.adRequest = new BannerAdRequest(bannerAdRequest);
            setClickEnabled(bannerAdRequest.isClickEnabled());
            this.loaded = false;
            this.reportedImpression = false;
            if (C1326f.m5672aM(C1326f.m5699v(this.context)) == 0) {
                this.adRequest.setCreativeType("static");
            }
            C1202d.m5145aI().mo6276a(this.context, (C1347a) new C1347a() {
                /* renamed from: a */
                public final void mo5535a(HashMap<String, Object> hashMap) {
                    C1169a.this.load();
                }

                public final void error(String str) {
                    C1169a.this.load();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void load() {
        if (this.adRequest != null) {
            C1334j.m5708cI().mo6263e(Integer.parseInt(C1202d.m5145aI().get("banner_expiration_time")));
            C1200b.m5130aH().mo5851a(this.context, (C1286Ad) this.bannerAd, getPlacementId(), (C1316a) new C1316a() {
                /* JADX WARNING: Code restructure failed: missing block: B:54:0x0176, code lost:
                    if (r10.equals("MEDIUM_RECTANGLE") != false) goto L_0x0184;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:39:0x0122  */
                /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
                /* JADX WARNING: Removed duplicated region for block: B:41:0x0128  */
                /* JADX WARNING: Removed duplicated region for block: B:42:0x012b  */
                /* JADX WARNING: Removed duplicated region for block: B:60:0x0188  */
                /* JADX WARNING: Removed duplicated region for block: B:61:0x0190  */
                /* JADX WARNING: Removed duplicated region for block: B:63:0x0198  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final <T> void mo5540a(T r10) {
                    /*
                        r9 = this;
                        com.appnext.banners.a r0 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerAdRequest r0 = r0.adRequest
                        if (r0 != 0) goto L_0x0009
                        return
                    L_0x0009:
                        com.appnext.banners.b r0 = com.appnext.banners.C1200b.m5130aH()
                        com.appnext.banners.a r1 = com.appnext.banners.C1169a.this
                        android.content.Context r1 = r1.context
                        com.appnext.banners.a r2 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerAd r2 = r2.bannerAd
                        r3 = r10
                        java.util.ArrayList r3 = (java.util.ArrayList) r3
                        com.appnext.banners.a r4 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerAdRequest r4 = r4.adRequest
                        java.lang.String r4 = r4.getCreativeType()
                        com.appnext.core.AppnextAd r0 = r0.mo5849a(r1, r2, r3, r4)
                        if (r0 != 0) goto L_0x004a
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        java.lang.String r0 = "error_no_ads"
                        r10.report(r0)
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerListener r10 = r10.getBannerListener()
                        if (r10 == 0) goto L_0x0049
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerListener r10 = r10.getBannerListener()
                        com.appnext.core.AppnextError r0 = new com.appnext.core.AppnextError
                        java.lang.String r1 = "No Ads"
                        r0.<init>(r1)
                        r10.onError(r0)
                    L_0x0049:
                        return
                    L_0x004a:
                        com.appnext.banners.a r1 = com.appnext.banners.C1169a.this
                        android.view.ViewGroup r1 = r1.rootView
                        if (r1 != 0) goto L_0x0051
                        return
                    L_0x0051:
                        com.appnext.banners.a r1 = com.appnext.banners.C1169a.this
                        android.content.Context r1 = r1.context
                        if (r1 != 0) goto L_0x005f
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        android.view.ViewGroup r10 = r10.rootView
                        r10.removeAllViews()
                        return
                    L_0x005f:
                        com.appnext.banners.a r1 = com.appnext.banners.C1169a.this     // Catch:{ Throwable -> 0x0085 }
                        java.util.ArrayList r1 = r1.ads     // Catch:{ Throwable -> 0x0085 }
                        if (r1 != 0) goto L_0x0071
                        com.appnext.banners.a r1 = com.appnext.banners.C1169a.this     // Catch:{ Throwable -> 0x0085 }
                        java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0085 }
                        r2.<init>()     // Catch:{ Throwable -> 0x0085 }
                        r1.ads = r2     // Catch:{ Throwable -> 0x0085 }
                    L_0x0071:
                        com.appnext.banners.a r1 = com.appnext.banners.C1169a.this     // Catch:{ Throwable -> 0x0085 }
                        java.util.ArrayList r1 = r1.ads     // Catch:{ Throwable -> 0x0085 }
                        r1.clear()     // Catch:{ Throwable -> 0x0085 }
                        com.appnext.banners.a r1 = com.appnext.banners.C1169a.this     // Catch:{ Throwable -> 0x0085 }
                        java.util.ArrayList r1 = r1.ads     // Catch:{ Throwable -> 0x0085 }
                        java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ Throwable -> 0x0085 }
                        r1.addAll(r10)     // Catch:{ Throwable -> 0x0085 }
                    L_0x0085:
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerAdData r1 = new com.appnext.banners.BannerAdData
                        r1.<init>(r0)
                        r10.currentAd = r1
                        com.appnext.banners.d r10 = com.appnext.banners.C1202d.m5145aI()
                        com.appnext.banners.a r1 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerSize r1 = r1.getBannerSize()
                        java.lang.String r1 = r1.toString()
                        java.lang.String r10 = r10.get(r1)
                        java.lang.String r10 = com.appnext.banners.C1220j.m5152L(r10)
                        com.appnext.banners.a r1 = com.appnext.banners.C1169a.this
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "apnxt_"
                        r2.<init>(r3)
                        r2.append(r10)
                        java.lang.String r10 = r2.toString()
                        java.lang.String r10 = r10.toLowerCase()
                        r1.template = r10
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        android.view.ViewGroup r10 = r10.rootView
                        android.content.Context r10 = r10.getContext()
                        android.content.res.Resources r10 = r10.getResources()
                        com.appnext.banners.a r1 = com.appnext.banners.C1169a.this
                        java.lang.String r1 = r1.template
                        java.lang.String r2 = "layout"
                        com.appnext.banners.a r3 = com.appnext.banners.C1169a.this
                        android.content.Context r3 = r3.context
                        java.lang.String r3 = r3.getPackageName()
                        int r10 = r10.getIdentifier(r1, r2, r3)
                        r1 = 2
                        r2 = 1951953708(0x7458732c, float:6.859571E31)
                        r3 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
                        r4 = -1966536496(0xffffffff8ac908d0, float:-1.9358911E-32)
                        r5 = -1
                        r6 = 1
                        r7 = 0
                        if (r10 != 0) goto L_0x012d
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerSize r10 = r10.getBannerSize()
                        java.lang.String r10 = r10.toString()
                        int r8 = r10.hashCode()
                        if (r8 == r4) goto L_0x0114
                        if (r8 == r3) goto L_0x010a
                        if (r8 == r2) goto L_0x0100
                        goto L_0x011e
                    L_0x0100:
                        java.lang.String r8 = "BANNER"
                        boolean r10 = r10.equals(r8)
                        if (r10 == 0) goto L_0x011e
                        r10 = r7
                        goto L_0x011f
                    L_0x010a:
                        java.lang.String r8 = "MEDIUM_RECTANGLE"
                        boolean r10 = r10.equals(r8)
                        if (r10 == 0) goto L_0x011e
                        r10 = r1
                        goto L_0x011f
                    L_0x0114:
                        java.lang.String r8 = "LARGE_BANNER"
                        boolean r10 = r10.equals(r8)
                        if (r10 == 0) goto L_0x011e
                        r10 = r6
                        goto L_0x011f
                    L_0x011e:
                        r10 = r5
                    L_0x011f:
                        switch(r10) {
                            case 0: goto L_0x012b;
                            case 1: goto L_0x0128;
                            case 2: goto L_0x0125;
                            default: goto L_0x0122;
                        }
                    L_0x0122:
                        int r10 = com.appnext.banners.C1166R.layout.apnxt_banner_1
                        goto L_0x012d
                    L_0x0125:
                        int r10 = com.appnext.banners.C1166R.layout.apnxt_medium_rectangle_1
                        goto L_0x012d
                    L_0x0128:
                        int r10 = com.appnext.banners.C1166R.layout.apnxt_large_banner_1
                        goto L_0x012d
                    L_0x012b:
                        int r10 = com.appnext.banners.C1166R.layout.apnxt_banner_1
                    L_0x012d:
                        com.appnext.banners.a r8 = com.appnext.banners.C1169a.this
                        r8.loaded = r6
                        com.appnext.banners.a r8 = com.appnext.banners.C1169a.this
                        r8.reportedImpression = r7
                        com.appnext.banners.a r8 = com.appnext.banners.C1169a.this
                        r8.inflateView(r10, r0)
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerListener r10 = r10.getBannerListener()
                        if (r10 == 0) goto L_0x0151
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerListener r10 = r10.getBannerListener()
                        java.lang.String r0 = r0.getBannerID()
                        r10.onAdLoaded(r0)
                    L_0x0151:
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerSize r10 = r10.getBannerSize()
                        java.lang.String r10 = r10.toString()
                        int r0 = r10.hashCode()
                        if (r0 == r4) goto L_0x0179
                        if (r0 == r3) goto L_0x0170
                        if (r0 == r2) goto L_0x0166
                        goto L_0x0183
                    L_0x0166:
                        java.lang.String r0 = "BANNER"
                        boolean r10 = r10.equals(r0)
                        if (r10 == 0) goto L_0x0183
                        r1 = r7
                        goto L_0x0184
                    L_0x0170:
                        java.lang.String r0 = "MEDIUM_RECTANGLE"
                        boolean r10 = r10.equals(r0)
                        if (r10 == 0) goto L_0x0183
                        goto L_0x0184
                    L_0x0179:
                        java.lang.String r0 = "LARGE_BANNER"
                        boolean r10 = r10.equals(r0)
                        if (r10 == 0) goto L_0x0183
                        r1 = r6
                        goto L_0x0184
                    L_0x0183:
                        r1 = r5
                    L_0x0184:
                        switch(r1) {
                            case 0: goto L_0x0198;
                            case 1: goto L_0x0190;
                            case 2: goto L_0x0188;
                            default: goto L_0x0187;
                        }
                    L_0x0187:
                        goto L_0x01a0
                    L_0x0188:
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        java.lang.String r0 = "loaded_medium_rectangle"
                        r10.report(r0)
                        goto L_0x01a0
                    L_0x0190:
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        java.lang.String r0 = "loaded_large_banner"
                        r10.report(r0)
                        return
                    L_0x0198:
                        com.appnext.banners.a r10 = com.appnext.banners.C1169a.this
                        java.lang.String r0 = "loaded_banner"
                        r10.report(r0)
                        return
                    L_0x01a0:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C1169a.C118219.mo5540a(java.lang.Object):void");
                }

                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void error(java.lang.String r3) {
                    /*
                        r2 = this;
                        java.lang.String r0 = ""
                        int r1 = r3.hashCode()
                        switch(r1) {
                            case -2026653947: goto L_0x003c;
                            case -1958363695: goto L_0x0032;
                            case -1477010874: goto L_0x0028;
                            case -507110949: goto L_0x001e;
                            case 350741825: goto L_0x0014;
                            case 844170097: goto L_0x000a;
                            default: goto L_0x0009;
                        }
                    L_0x0009:
                        goto L_0x0046
                    L_0x000a:
                        java.lang.String r1 = "Too Slow Connection"
                        boolean r1 = r3.equals(r1)
                        if (r1 == 0) goto L_0x0046
                        r1 = 4
                        goto L_0x0047
                    L_0x0014:
                        java.lang.String r1 = "Timeout"
                        boolean r1 = r3.equals(r1)
                        if (r1 == 0) goto L_0x0046
                        r1 = 5
                        goto L_0x0047
                    L_0x001e:
                        java.lang.String r1 = "No market installed on the device"
                        boolean r1 = r3.equals(r1)
                        if (r1 == 0) goto L_0x0046
                        r1 = 3
                        goto L_0x0047
                    L_0x0028:
                        java.lang.String r1 = "Connection Error"
                        boolean r1 = r3.equals(r1)
                        if (r1 == 0) goto L_0x0046
                        r1 = 0
                        goto L_0x0047
                    L_0x0032:
                        java.lang.String r1 = "No Ads"
                        boolean r1 = r3.equals(r1)
                        if (r1 == 0) goto L_0x0046
                        r1 = 2
                        goto L_0x0047
                    L_0x003c:
                        java.lang.String r1 = "Internal error"
                        boolean r1 = r3.equals(r1)
                        if (r1 == 0) goto L_0x0046
                        r1 = 1
                        goto L_0x0047
                    L_0x0046:
                        r1 = -1
                    L_0x0047:
                        switch(r1) {
                            case 0: goto L_0x005a;
                            case 1: goto L_0x0057;
                            case 2: goto L_0x0054;
                            case 3: goto L_0x0051;
                            case 4: goto L_0x004e;
                            case 5: goto L_0x004b;
                            default: goto L_0x004a;
                        }
                    L_0x004a:
                        goto L_0x005c
                    L_0x004b:
                        java.lang.String r0 = "error_timeout"
                        goto L_0x005c
                    L_0x004e:
                        java.lang.String r0 = "error_slow_connection"
                        goto L_0x005c
                    L_0x0051:
                        java.lang.String r0 = "error_no_market"
                        goto L_0x005c
                    L_0x0054:
                        java.lang.String r0 = "error_no_ads"
                        goto L_0x005c
                    L_0x0057:
                        java.lang.String r0 = "error_internal_error"
                        goto L_0x005c
                    L_0x005a:
                        java.lang.String r0 = "error_connection_error"
                    L_0x005c:
                        com.appnext.banners.a r1 = com.appnext.banners.C1169a.this
                        r1.report(r0)
                        com.appnext.banners.a r0 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerListener r0 = r0.getBannerListener()
                        if (r0 == 0) goto L_0x0077
                        com.appnext.banners.a r0 = com.appnext.banners.C1169a.this
                        com.appnext.banners.BannerListener r0 = r0.getBannerListener()
                        com.appnext.core.AppnextError r1 = new com.appnext.core.AppnextError
                        r1.<init>(r3)
                        r0.onError(r1)
                    L_0x0077:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C1169a.C118219.error(java.lang.String):void");
                }
            }, this.adRequest);
        }
    }

    public void getECPM(final BannerAdRequest bannerAdRequest, final OnECPMLoaded onECPMLoaded) {
        if (bannerAdRequest == null) {
            throw new IllegalStateException("BannerAdRequest cannot be null.");
        } else if (getPlacementId() == null) {
            throw new IllegalStateException("Missing placement id.");
        } else if (getBannerSize() == null) {
            throw new IllegalStateException("Missing banner size.");
        } else if (onECPMLoaded == null) {
            throw new IllegalStateException("callback cannot be null.");
        } else {
            if (this.bannerAd == null) {
                this.bannerAd = (BannerAd) createAd(this.context, getPlacementId());
            }
            this.bannerAd.setCategories(bannerAdRequest.getCategories());
            this.bannerAd.setPostback(bannerAdRequest.getPostback());
            C1200b.m5130aH().mo5851a(this.context, (C1286Ad) this.bannerAd, getPlacementId(), (C1316a) new C1316a() {
                /* renamed from: a */
                public final <T> void mo5540a(T t) {
                    AppnextAd a = C1200b.m5130aH().mo5848a(C1169a.this.context, (C1286Ad) C1169a.this.bannerAd, bannerAdRequest.getCreativeType());
                    if (a == null) {
                        C1169a.this.report(C1066a.f3561cz);
                        if (onECPMLoaded != null) {
                            onECPMLoaded.error(AppnextError.NO_ADS);
                        }
                        return;
                    }
                    if (onECPMLoaded != null) {
                        onECPMLoaded.ecpm(new ECPM(a.getECPM(), a.getPPR(), a.getBannerID()));
                    }
                }

                public final void error(String str) {
                    if (onECPMLoaded != null) {
                        onECPMLoaded.error(str);
                    }
                }
            }, bannerAdRequest);
        }
    }

    /* access modifiers changed from: protected */
    public void inflateView(int i, final AppnextAd appnextAd) {
        View inflate = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(i, this.rootView, false);
        inflate.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C1169a.this.report(C1066a.f3566de);
                C1169a.this.click();
            }
        });
        final ImageView imageView = (ImageView) inflate.findViewById(C1166R.C1168id.icon);
        if (imageView != null) {
            imageView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C1169a.this.report(C1066a.f3564dc);
                    C1169a.this.click();
                }
            });
            new Thread(new Runnable() {
                public final void run() {
                    final Bitmap aL = C1326f.m5671aL(appnextAd.getImageURL());
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            imageView.setImageBitmap(aL);
                        }
                    });
                }
            }).start();
        }
        TextView textView = (TextView) inflate.findViewById(C1166R.C1168id.title);
        if (textView != null) {
            textView.setText(appnextAd.getAdTitle());
            textView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C1169a.this.report(C1066a.f3566de);
                    C1169a.this.click();
                }
            });
        }
        RatingBar ratingBar = (RatingBar) inflate.findViewById(C1166R.C1168id.ratingBar);
        if (ratingBar != null) {
            try {
                ratingBar.setRating(Float.parseFloat(appnextAd.getStoreRating()));
            } catch (Throwable unused) {
                ratingBar.setVisibility(4);
            }
            ratingBar.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C1169a.this.report(C1066a.f3566de);
                    C1169a.this.click();
                }
            });
        }
        TextView textView2 = (TextView) inflate.findViewById(C1166R.C1168id.description);
        if (textView2 != null) {
            textView2.setText(appnextAd.getAdDescription());
            textView2.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C1169a.this.report(C1066a.f3566de);
                    C1169a.this.click();
                }
            });
        }
        View findViewById = inflate.findViewById(C1166R.C1168id.install);
        ((TextView) findViewById).setText(getButtonText(appnextAd));
        findViewById.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C1169a.this.report(C1066a.f3565dd);
                C1169a.this.click();
            }
        });
        View findViewById2 = inflate.findViewById(C1166R.C1168id.media);
        if (findViewById2 != null) {
            if (getCreativeType(appnextAd) != 0) {
                createWideImage((ImageView) inflate.findViewById(C1166R.C1168id.wide_image));
            } else {
                createVideo((ViewGroup) findViewById2);
            }
        }
        ImageView imageView2 = (ImageView) inflate.findViewById(C1166R.C1168id.privacy);
        imageView2.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C1169a.this.openLink(C1326f.m5691f(appnextAd));
            }
        });
        if (C1336k.m5716a(appnextAd, (C1345p) C1202d.m5145aI())) {
            C1336k.m5715a(this.context, imageView2);
        }
        if (this.rootView.getChildCount() > 0) {
            this.rootView.removeViewAt(0);
        }
        this.rootView.addView(inflate);
    }

    /* access modifiers changed from: protected */
    public String getButtonText(AppnextAd appnextAd) {
        String buttonText = new BannerAdData(appnextAd).getButtonText();
        boolean i = C1326f.m5694i(this.context, getSelectedAd().getAdPackage());
        if (appnextAd == null || !buttonText.equals("")) {
            return C1305b.m5595cN().mo6203c(getLanguage(), i ? C1305b.f4127lU : C1305b.f4126lT, buttonText);
        } else if (i) {
            return C1305b.m5595cN().mo6203c(getLanguage(), C1305b.f4127lU, C1202d.m5145aI().get("existing_button_text"));
        } else {
            return C1305b.m5595cN().mo6203c(getLanguage(), C1305b.f4126lT, C1202d.m5145aI().get("new_button_text"));
        }
    }

    /* access modifiers changed from: protected */
    public int getCreativeType(AppnextAd appnextAd) {
        return this.adRequest.getCreativeType().equals(BannerAdRequest.TYPE_ALL) ? C1200b.hasVideo(appnextAd) ? 0 : 1 : (!this.adRequest.getCreativeType().equals("video") || !C1200b.hasVideo(appnextAd)) ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (getSelectedAd() == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r4.mHandler.postDelayed(new com.appnext.banners.C1169a.C11935(r4), (long) (java.lang.Integer.parseInt(com.appnext.banners.C1202d.m5145aI().get("postpone_impression_sec")) * com.facebook.ads.AdError.NETWORK_ERROR_CODE));
        report(com.appnext.ads.C1066a.f3524cJ);
        com.appnext.core.C1334j.m5708cI().mo6265o(getSelectedAd().getBannerID(), getPlacementId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (java.lang.Boolean.parseBoolean(com.appnext.banners.C1202d.m5145aI().get("pview")) == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        r4.mHandler.postDelayed(new com.appnext.banners.C1169a.C11946(r4), (long) (java.lang.Integer.parseInt(com.appnext.banners.C1202d.m5145aI().get("postpone_vta_sec")) * com.facebook.ads.AdError.NETWORK_ERROR_CODE));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0085, code lost:
        if (getBannerListener() == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        getBannerListener().adImpression();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
        if (java.lang.Boolean.parseBoolean(com.appnext.banners.C1202d.m5145aI().get("fq_control")) == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (r4.bannerAd == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if (r4.bannerAd.fq_status == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        new java.lang.Thread(new com.appnext.banners.C1169a.C11957(r4)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void impression() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.loaded     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r4.reportedImpression     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x00b6
            android.view.ViewGroup r0 = r4.rootView     // Catch:{ all -> 0x00b8 }
            int r0 = r4.getVisiblePercent(r0)     // Catch:{ all -> 0x00b8 }
            r1 = 50
            if (r0 < r1) goto L_0x00b6
            com.appnext.core.q r0 = r4.userAction     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x0019
            goto L_0x00b6
        L_0x0019:
            r0 = 1
            r4.reportedImpression = r0     // Catch:{ all -> 0x00b8 }
            monitor-exit(r4)     // Catch:{ all -> 0x00b8 }
            com.appnext.banners.BannerAdData r0 = r4.getSelectedAd()
            if (r0 == 0) goto L_0x008e
            android.os.Handler r0 = r4.mHandler
            com.appnext.banners.a$5 r1 = new com.appnext.banners.a$5
            r1.<init>()
            com.appnext.banners.d r2 = com.appnext.banners.C1202d.m5145aI()
            java.lang.String r3 = "postpone_impression_sec"
            java.lang.String r2 = r2.get(r3)
            int r2 = java.lang.Integer.parseInt(r2)
            int r2 = r2 * 1000
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
            java.lang.String r0 = "impression_event"
            r4.report(r0)
            com.appnext.core.j r0 = com.appnext.core.C1334j.m5708cI()
            com.appnext.banners.BannerAdData r1 = r4.getSelectedAd()
            java.lang.String r1 = r1.getBannerID()
            java.lang.String r2 = r4.getPlacementId()
            r0.mo6265o(r1, r2)
            com.appnext.banners.d r0 = com.appnext.banners.C1202d.m5145aI()
            java.lang.String r1 = "pview"
            java.lang.String r0 = r0.get(r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x0081
            android.os.Handler r0 = r4.mHandler
            com.appnext.banners.a$6 r1 = new com.appnext.banners.a$6
            r1.<init>()
            com.appnext.banners.d r2 = com.appnext.banners.C1202d.m5145aI()
            java.lang.String r3 = "postpone_vta_sec"
            java.lang.String r2 = r2.get(r3)
            int r2 = java.lang.Integer.parseInt(r2)
            int r2 = r2 * 1000
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
        L_0x0081:
            com.appnext.banners.BannerListener r0 = r4.getBannerListener()
            if (r0 == 0) goto L_0x008e
            com.appnext.banners.BannerListener r0 = r4.getBannerListener()
            r0.adImpression()
        L_0x008e:
            com.appnext.banners.d r0 = com.appnext.banners.C1202d.m5145aI()
            java.lang.String r1 = "fq_control"
            java.lang.String r0 = r0.get(r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x00b5
            com.appnext.banners.BannerAd r0 = r4.bannerAd
            if (r0 == 0) goto L_0x00b5
            com.appnext.banners.BannerAd r0 = r4.bannerAd
            boolean r0 = r0.fq_status
            if (r0 == 0) goto L_0x00b5
            java.lang.Thread r0 = new java.lang.Thread
            com.appnext.banners.a$7 r1 = new com.appnext.banners.a$7
            r1.<init>()
            r0.<init>(r1)
            r0.start()
        L_0x00b5:
            return
        L_0x00b6:
            monitor-exit(r4)     // Catch:{ all -> 0x00b8 }
            return
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C1169a.impression():void");
    }

    public void click() {
        report(C1066a.f3539cY);
        if (getBannerListener() != null) {
            getBannerListener().onAdClicked();
        }
        this.userAction.mo6291a(getSelectedAd(), getSelectedAd().getAppURL(), getPlacementId(), new C1324a() {
            public final void error(String str) {
            }

            public final void onMarket(String str) {
                try {
                    if (C1169a.this.mediaPlayer != null && C1169a.this.mediaPlayer.isPlaying()) {
                        C1169a.this.pause();
                        ((ImageView) C1169a.this.rootView.findViewById(C1166R.C1168id.media).findViewById(C1166R.C1168id.play)).setImageResource(C1166R.C1167drawable.apnxt_banner_pause);
                        C1169a.this.rootView.findViewById(C1166R.C1168id.media).findViewById(C1166R.C1168id.play).setVisibility(0);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openLink(java.lang.String r3) {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.mediaPlayer     // Catch:{ Throwable -> 0x0036 }
            if (r0 == 0) goto L_0x0036
            android.media.MediaPlayer r0 = r2.mediaPlayer     // Catch:{ Throwable -> 0x0036 }
            boolean r0 = r0.isPlaying()     // Catch:{ Throwable -> 0x0036 }
            if (r0 == 0) goto L_0x0036
            r2.pause()     // Catch:{ Throwable -> 0x0036 }
            android.view.ViewGroup r0 = r2.rootView     // Catch:{ Throwable -> 0x0036 }
            int r1 = com.appnext.banners.C1166R.C1168id.media     // Catch:{ Throwable -> 0x0036 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x0036 }
            int r1 = com.appnext.banners.C1166R.C1168id.play     // Catch:{ Throwable -> 0x0036 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x0036 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Throwable -> 0x0036 }
            int r1 = com.appnext.banners.C1166R.C1167drawable.apnxt_banner_pause     // Catch:{ Throwable -> 0x0036 }
            r0.setImageResource(r1)     // Catch:{ Throwable -> 0x0036 }
            android.view.ViewGroup r0 = r2.rootView     // Catch:{ Throwable -> 0x0036 }
            int r1 = com.appnext.banners.C1166R.C1168id.media     // Catch:{ Throwable -> 0x0036 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x0036 }
            int r1 = com.appnext.banners.C1166R.C1168id.play     // Catch:{ Throwable -> 0x0036 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x0036 }
            r1 = 0
            r0.setVisibility(r1)     // Catch:{ Throwable -> 0x0036 }
        L_0x0036:
            super.openLink(r3)     // Catch:{ Throwable -> 0x003a }
            return
        L_0x003a:
            java.lang.String r3 = "error_no_market"
            r2.report(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C1169a.openLink(java.lang.String):void");
    }

    private void createWideImage(final ImageView imageView) {
        report(C1066a.f3567df);
        new Thread(new Runnable() {
            public final void run() {
                final Bitmap aL = C1326f.m5671aL(C1169a.this.getSelectedAd().getWideImageURL());
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        imageView.setImageBitmap(aL);
                        imageView.setVisibility(0);
                        imageView.setOnClickListener(new OnClickListener() {
                            public final void onClick(View view) {
                                C1169a.this.report(C1066a.f3566de);
                                C1169a.this.click();
                            }
                        });
                    }
                });
            }
        }).start();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void createVideo(final android.view.ViewGroup r6) {
        /*
            r5 = this;
            com.appnext.banners.BannerAdRequest r0 = r5.adRequest     // Catch:{ Throwable -> 0x00f2 }
            boolean r0 = r0.isAutoPlay()     // Catch:{ Throwable -> 0x00f2 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "auto_play_on"
            r5.report(r0)     // Catch:{ Throwable -> 0x00f2 }
            goto L_0x0013
        L_0x000e:
            java.lang.String r0 = "auto_play_off"
            r5.report(r0)     // Catch:{ Throwable -> 0x00f2 }
        L_0x0013:
            com.appnext.banners.BannerAdRequest r0 = r5.adRequest     // Catch:{ Throwable -> 0x00f2 }
            boolean r0 = r0.isMute()     // Catch:{ Throwable -> 0x00f2 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "mute_on"
            r5.report(r0)     // Catch:{ Throwable -> 0x00f2 }
            goto L_0x0026
        L_0x0021:
            java.lang.String r0 = "mute_off"
            r5.report(r0)     // Catch:{ Throwable -> 0x00f2 }
        L_0x0026:
            com.appnext.banners.BannerAdRequest r0 = r5.adRequest     // Catch:{ Throwable -> 0x00f2 }
            boolean r0 = r0.isMute()     // Catch:{ Throwable -> 0x00f2 }
            r5.userMute = r0     // Catch:{ Throwable -> 0x00f2 }
            int r0 = com.appnext.banners.C1166R.C1168id.mute     // Catch:{ Throwable -> 0x00f2 }
            android.view.View r0 = r6.findViewById(r0)     // Catch:{ Throwable -> 0x00f2 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Throwable -> 0x00f2 }
            boolean r1 = r5.userMute     // Catch:{ Throwable -> 0x00f2 }
            if (r1 == 0) goto L_0x003d
            int r1 = com.appnext.banners.C1166R.C1167drawable.apnxt_banner_unmute     // Catch:{ Throwable -> 0x00f2 }
            goto L_0x003f
        L_0x003d:
            int r1 = com.appnext.banners.C1166R.C1167drawable.apnxt_banner_mute     // Catch:{ Throwable -> 0x00f2 }
        L_0x003f:
            r0.setImageResource(r1)     // Catch:{ Throwable -> 0x00f2 }
            int r0 = com.appnext.banners.C1166R.C1168id.mute     // Catch:{ Throwable -> 0x00f2 }
            android.view.View r0 = r6.findViewById(r0)     // Catch:{ Throwable -> 0x00f2 }
            r1 = 0
            r0.setVisibility(r1)     // Catch:{ Throwable -> 0x00f2 }
            int r0 = com.appnext.banners.C1166R.C1168id.mute     // Catch:{ Throwable -> 0x00f2 }
            android.view.View r0 = r6.findViewById(r0)     // Catch:{ Throwable -> 0x00f2 }
            com.appnext.banners.a$10 r2 = new com.appnext.banners.a$10     // Catch:{ Throwable -> 0x00f2 }
            r2.<init>(r6)     // Catch:{ Throwable -> 0x00f2 }
            r0.setOnClickListener(r2)     // Catch:{ Throwable -> 0x00f2 }
            android.widget.VideoView r0 = new android.widget.VideoView     // Catch:{ Throwable -> 0x0068 }
            android.content.Context r2 = r5.context     // Catch:{ Throwable -> 0x0068 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Throwable -> 0x0068 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0068 }
            r5.videoView = r0     // Catch:{ Throwable -> 0x0068 }
            goto L_0x0071
        L_0x0068:
            android.widget.VideoView r0 = new android.widget.VideoView     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r2 = r5.context     // Catch:{ Throwable -> 0x00f2 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x00f2 }
            r5.videoView = r0     // Catch:{ Throwable -> 0x00f2 }
        L_0x0071:
            android.widget.VideoView r0 = r5.videoView     // Catch:{ Throwable -> 0x00f2 }
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch:{ Throwable -> 0x00f2 }
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x00f2 }
            r0.setLayoutParams(r2)     // Catch:{ Throwable -> 0x00f2 }
            android.widget.VideoView r0 = r5.videoView     // Catch:{ Throwable -> 0x00f2 }
            r6.addView(r0, r1)     // Catch:{ Throwable -> 0x00f2 }
            int r0 = com.appnext.banners.C1166R.C1168id.click     // Catch:{ Throwable -> 0x00f2 }
            android.view.View r0 = r6.findViewById(r0)     // Catch:{ Throwable -> 0x00f2 }
            com.appnext.banners.a$11 r2 = new com.appnext.banners.a$11     // Catch:{ Throwable -> 0x00f2 }
            r2.<init>(r6)     // Catch:{ Throwable -> 0x00f2 }
            r0.setOnClickListener(r2)     // Catch:{ Throwable -> 0x00f2 }
            android.widget.VideoView r0 = r5.videoView     // Catch:{ Throwable -> 0x00f2 }
            com.appnext.banners.a$13 r2 = new com.appnext.banners.a$13     // Catch:{ Throwable -> 0x00f2 }
            r2.<init>()     // Catch:{ Throwable -> 0x00f2 }
            r0.setOnPreparedListener(r2)     // Catch:{ Throwable -> 0x00f2 }
            android.widget.VideoView r0 = r5.videoView     // Catch:{ Throwable -> 0x00f2 }
            com.appnext.banners.a$14 r2 = new com.appnext.banners.a$14     // Catch:{ Throwable -> 0x00f2 }
            r2.<init>()     // Catch:{ Throwable -> 0x00f2 }
            r0.setOnCompletionListener(r2)     // Catch:{ Throwable -> 0x00f2 }
            android.widget.VideoView r0 = r5.videoView     // Catch:{ Throwable -> 0x00f2 }
            com.appnext.banners.a$15 r2 = new com.appnext.banners.a$15     // Catch:{ Throwable -> 0x00f2 }
            r2.<init>()     // Catch:{ Throwable -> 0x00f2 }
            r0.setOnErrorListener(r2)     // Catch:{ Throwable -> 0x00f2 }
            android.widget.VideoView r0 = r5.videoView     // Catch:{ Throwable -> 0x00f2 }
            com.appnext.banners.BannerAdData r2 = r5.getSelectedAd()     // Catch:{ Throwable -> 0x00f2 }
            com.appnext.banners.BannerAdRequest r3 = r5.adRequest     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r3 = r3.getVideoLength()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r2 = r5.getVideoUrl(r2, r3)     // Catch:{ Throwable -> 0x00f2 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Throwable -> 0x00f2 }
            r0.setVideoURI(r2)     // Catch:{ Throwable -> 0x00f2 }
            int r0 = com.appnext.banners.C1166R.C1168id.play     // Catch:{ Throwable -> 0x00f2 }
            android.view.View r0 = r6.findViewById(r0)     // Catch:{ Throwable -> 0x00f2 }
            com.appnext.banners.a$16 r2 = new com.appnext.banners.a$16     // Catch:{ Throwable -> 0x00f2 }
            r2.<init>(r6)     // Catch:{ Throwable -> 0x00f2 }
            r0.setOnClickListener(r2)     // Catch:{ Throwable -> 0x00f2 }
            com.appnext.banners.BannerAdRequest r0 = r5.adRequest     // Catch:{ Throwable -> 0x00f2 }
            boolean r0 = r0.isAutoPlay()     // Catch:{ Throwable -> 0x00f2 }
            if (r0 != 0) goto L_0x00f1
            int r0 = com.appnext.banners.C1166R.C1168id.play     // Catch:{ Throwable -> 0x00f2 }
            android.view.View r0 = r6.findViewById(r0)     // Catch:{ Throwable -> 0x00f2 }
            r0.setVisibility(r1)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ Throwable -> 0x00f2 }
            com.appnext.banners.a$17 r1 = new com.appnext.banners.a$17     // Catch:{ Throwable -> 0x00f2 }
            r1.<init>(r6)     // Catch:{ Throwable -> 0x00f2 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00f2 }
            r0.start()     // Catch:{ Throwable -> 0x00f2 }
        L_0x00f1:
            return
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C1169a.createVideo(android.view.ViewGroup):void");
    }

    /* access modifiers changed from: protected */
    public String getVideoUrl(AppnextAd appnextAd, String str) {
        if (str.equals("30")) {
            String videoUrl30Sec = appnextAd.getVideoUrl30Sec();
            if (videoUrl30Sec.equals("")) {
                videoUrl30Sec = appnextAd.getVideoUrl();
            }
            if (videoUrl30Sec.equals("")) {
                videoUrl30Sec = appnextAd.getVideoUrlHigh30Sec();
            }
            if (videoUrl30Sec.equals("")) {
                return appnextAd.getVideoUrlHigh();
            }
            return videoUrl30Sec;
        }
        String videoUrl = appnextAd.getVideoUrl();
        if (videoUrl.equals("")) {
            videoUrl = appnextAd.getVideoUrl30Sec();
        }
        if (videoUrl.equals("")) {
            videoUrl = appnextAd.getVideoUrlHigh();
        }
        return videoUrl.equals("") ? appnextAd.getVideoUrlHigh30Sec() : videoUrl;
    }

    /* access modifiers changed from: private */
    public void checkProgress() {
        try {
            if (this.mediaPlayer != null) {
                int currentPosition2 = (int) ((((float) this.mediaPlayer.getCurrentPosition()) / ((float) this.mediaPlayer.getDuration())) * 100.0f);
                if (currentPosition2 > 25 && this.lastProgress == 0) {
                    this.lastProgress = 25;
                    report(C1066a.f3527cM);
                } else if (currentPosition2 > 50 && this.lastProgress == 25) {
                    this.lastProgress = 50;
                    report(C1066a.f3528cN);
                } else if (currentPosition2 > 75 && this.lastProgress == 50) {
                    this.lastProgress = 75;
                    report(C1066a.f3529cO);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0026 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073 A[Catch:{ Throwable -> 0x007c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollChanged(int r4) {
        /*
            r3 = this;
            android.media.MediaPlayer r0 = r3.mediaPlayer     // Catch:{ Throwable -> 0x007c }
            if (r0 == 0) goto L_0x007b
            boolean r0 = r3.finished     // Catch:{ Throwable -> 0x007c }
            if (r0 != 0) goto L_0x007b
            android.media.MediaPlayer r0 = r3.mediaPlayer     // Catch:{ Throwable -> 0x007c }
            boolean r0 = r0.isPlaying()     // Catch:{ Throwable -> 0x007c }
            r1 = 90
            if (r0 == 0) goto L_0x0029
            if (r4 >= r1) goto L_0x0029
            android.view.ViewGroup r0 = r3.rootView     // Catch:{ Throwable -> 0x0026 }
            int r2 = com.appnext.banners.C1166R.C1168id.media     // Catch:{ Throwable -> 0x0026 }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Throwable -> 0x0026 }
            int r2 = com.appnext.banners.C1166R.C1168id.play     // Catch:{ Throwable -> 0x0026 }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Throwable -> 0x0026 }
            r2 = 0
            r0.setVisibility(r2)     // Catch:{ Throwable -> 0x0026 }
        L_0x0026:
            r3.pause()     // Catch:{ Throwable -> 0x007c }
        L_0x0029:
            android.media.MediaPlayer r0 = r3.mediaPlayer     // Catch:{ Throwable -> 0x007c }
            boolean r0 = r0.isPlaying()     // Catch:{ Throwable -> 0x007c }
            if (r0 != 0) goto L_0x007b
            if (r4 <= r1) goto L_0x007b
            com.appnext.banners.BannerAdRequest r4 = r3.adRequest     // Catch:{ Throwable -> 0x007c }
            boolean r4 = r4.isAutoPlay()     // Catch:{ Throwable -> 0x007c }
            if (r4 == 0) goto L_0x007b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x007c }
            java.lang.String r0 = "start. "
            r4.<init>(r0)     // Catch:{ Throwable -> 0x007c }
            android.media.MediaPlayer r0 = r3.mediaPlayer     // Catch:{ Throwable -> 0x007c }
            int r0 = r0.getCurrentPosition()     // Catch:{ Throwable -> 0x007c }
            r4.append(r0)     // Catch:{ Throwable -> 0x007c }
            java.lang.String r0 = "/"
            r4.append(r0)     // Catch:{ Throwable -> 0x007c }
            android.media.MediaPlayer r0 = r3.mediaPlayer     // Catch:{ Throwable -> 0x007c }
            int r0 = r0.getDuration()     // Catch:{ Throwable -> 0x007c }
            r4.append(r0)     // Catch:{ Throwable -> 0x007c }
            r3.play()     // Catch:{ Throwable -> 0x007c }
            android.view.ViewGroup r4 = r3.rootView     // Catch:{ Throwable -> 0x006f }
            int r0 = com.appnext.banners.C1166R.C1168id.media     // Catch:{ Throwable -> 0x006f }
            android.view.View r4 = r4.findViewById(r0)     // Catch:{ Throwable -> 0x006f }
            int r0 = com.appnext.banners.C1166R.C1168id.play     // Catch:{ Throwable -> 0x006f }
            android.view.View r4 = r4.findViewById(r0)     // Catch:{ Throwable -> 0x006f }
            r0 = 8
            r4.setVisibility(r0)     // Catch:{ Throwable -> 0x006f }
        L_0x006f:
            boolean r4 = r3.started     // Catch:{ Throwable -> 0x007c }
            if (r4 != 0) goto L_0x007b
            java.lang.String r4 = "video_started"
            r3.report(r4)     // Catch:{ Throwable -> 0x007c }
            r4 = 1
            r3.started = r4     // Catch:{ Throwable -> 0x007c }
        L_0x007b:
            return
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C1169a.onScrollChanged(int):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|(1:8)|9|10|(1:12)|13|14|15|16|(3:18|19|20)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|5|6|(1:8)|9|10|(1:12)|13|14|15|16|(3:18|19|20)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e A[Catch:{ Throwable -> 0x0037 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void destroy() {
        /*
            r3 = this;
            super.destroy()
            com.appnext.core.q r0 = r3.userAction     // Catch:{ Throwable -> 0x0008 }
            r0.destroy()     // Catch:{ Throwable -> 0x0008 }
        L_0x0008:
            r0 = 0
            android.widget.VideoView r1 = r3.videoView     // Catch:{ Throwable -> 0x002a }
            if (r1 == 0) goto L_0x002a
            android.widget.VideoView r1 = r3.videoView     // Catch:{ Throwable -> 0x002a }
            r1.setOnCompletionListener(r0)     // Catch:{ Throwable -> 0x002a }
            android.widget.VideoView r1 = r3.videoView     // Catch:{ Throwable -> 0x002a }
            r1.setOnErrorListener(r0)     // Catch:{ Throwable -> 0x002a }
            android.widget.VideoView r1 = r3.videoView     // Catch:{ Throwable -> 0x002a }
            r1.setOnPreparedListener(r0)     // Catch:{ Throwable -> 0x002a }
            android.widget.VideoView r1 = r3.videoView     // Catch:{ Throwable -> 0x002a }
            r1.suspend()     // Catch:{ Throwable -> 0x002a }
            r3.videoView = r0     // Catch:{ Throwable -> 0x002a }
            android.media.MediaPlayer r1 = r3.mediaPlayer     // Catch:{ Throwable -> 0x002a }
            r1.release()     // Catch:{ Throwable -> 0x002a }
            r3.mediaPlayer = r0     // Catch:{ Throwable -> 0x002a }
        L_0x002a:
            com.appnext.banners.i r1 = r3.serviceHelper     // Catch:{ Throwable -> 0x0037 }
            if (r1 == 0) goto L_0x0035
            com.appnext.banners.i r1 = r3.serviceHelper     // Catch:{ Throwable -> 0x0037 }
            android.content.Context r2 = r3.context     // Catch:{ Throwable -> 0x0037 }
            r1.mo5410d(r2)     // Catch:{ Throwable -> 0x0037 }
        L_0x0035:
            r3.serviceHelper = r0     // Catch:{ Throwable -> 0x0037 }
        L_0x0037:
            com.appnext.banners.BannerAd r1 = r3.bannerAd     // Catch:{ Throwable -> 0x003e }
            r1.destroy()     // Catch:{ Throwable -> 0x003e }
            r3.bannerAd = r0     // Catch:{ Throwable -> 0x003e }
        L_0x003e:
            r3.adRequest = r0
            android.os.Handler r1 = r3.mHandler     // Catch:{ Throwable -> 0x0046 }
            r1.removeCallbacksAndMessages(r0)     // Catch:{ Throwable -> 0x0046 }
            return
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C1169a.destroy():void");
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    public void play() {
        if (this.mediaPlayer != null && !this.mediaPlayer.isPlaying()) {
            this.mediaPlayer.start();
        }
    }

    public void pause() {
        if (this.mediaPlayer != null && this.mediaPlayer.isPlaying()) {
            this.mediaPlayer.pause();
        }
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        try {
            if (this.bannerAd != null) {
                C1326f.m5665a(this.bannerAd.getTID(), this.bannerAd.getVID(), this.bannerAd.getAUID(), getPlacementId() == null ? "" : getPlacementId(), this.bannerAd.getSessionId(), str, this.template, getSelectedAd() != null ? getSelectedAd().getBannerID() : "", getSelectedAd() != null ? getSelectedAd().getCampaignID() : "");
            }
        } catch (Throwable unused) {
        }
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    public void setClickEnabled(boolean z) {
        this.clickEnabled = z;
    }

    /* access modifiers changed from: protected */
    public BannerAd getBannerAd() {
        return this.bannerAd;
    }

    /* access modifiers changed from: protected */
    public BannerAdData getSelectedAd() {
        return this.currentAd;
    }

    /* access modifiers changed from: protected */
    public void setSelectedAd(BannerAdData bannerAdData) {
        this.currentAd = bannerAdData;
    }

    /* access modifiers changed from: protected */
    public BannerAdRequest getAdRequest() {
        return this.adRequest;
    }

    /* access modifiers changed from: protected */
    public void setReportedImpression(boolean z) {
        this.reportedImpression = z;
    }

    /* access modifiers changed from: protected */
    public boolean isReportedImpression() {
        return this.reportedImpression;
    }

    /* access modifiers changed from: protected */
    public C1349q getUserAction() {
        return this.userAction;
    }

    /* access modifiers changed from: protected */
    public ArrayList<AppnextAd> getAds() {
        return this.ads;
    }
}
