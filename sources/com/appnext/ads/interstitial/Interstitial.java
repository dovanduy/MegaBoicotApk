package com.appnext.ads.interstitial;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.appnext.base.p046b.C1244c;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1309d.C1316a;
import com.appnext.core.C1326f;
import com.appnext.core.C1334j;
import com.appnext.core.C1345p;
import com.appnext.core.C1345p.C1347a;
import com.appnext.core.ECPM;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.appnext.core.webview.AppnextWebView;
import com.appnext.core.webview.AppnextWebView.C1376c;
import com.appnext.core.webview.C1377a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public class Interstitial extends C1286Ad {
    private static final String JS_URL = "http://cdn.appnext.com/tools/sdk/interstitial/v75/script.min.js";
    protected static final String TID = "301";
    public static final String TYPE_MANAGED = "managed";
    public static final String TYPE_STATIC = "static";
    public static final String TYPE_VIDEO = "video";
    protected static final String VID = "2.4.5.472";
    protected static Interstitial currentAd;
    private boolean autoPlay;
    private String buttonColor;
    /* access modifiers changed from: private */
    public boolean calledShow;
    private Boolean canClose;
    /* access modifiers changed from: private */
    public boolean configLoaded;
    private String creativeType;
    protected boolean fq_status;
    private String language;
    private boolean setAutoPlay;
    private boolean setCanClose;
    private String skipText;
    private String titleText;
    /* access modifiers changed from: private */
    public OnAdError userOnAdError;

    public String getAUID() {
        return "600";
    }

    /* access modifiers changed from: protected */
    public String getPageUrl() {
        return JS_URL;
    }

    public String getTID() {
        return TID;
    }

    public String getVID() {
        return "2.4.5.472";
    }

    @Deprecated
    public void setOrientation(String str) {
    }

    public Interstitial(Context context, String str) {
        super(context, str);
        this.creativeType = TYPE_MANAGED;
        this.titleText = "";
        this.skipText = "";
        this.autoPlay = true;
        this.setAutoPlay = false;
        this.setCanClose = false;
        this.configLoaded = false;
        this.calledShow = false;
        this.buttonColor = "";
        this.fq_status = false;
        this.language = "";
        init();
    }

    public Interstitial(Context context, String str, InterstitialConfig interstitialConfig) {
        super(context, str);
        this.creativeType = TYPE_MANAGED;
        this.titleText = "";
        this.skipText = "";
        boolean z = true;
        this.autoPlay = true;
        this.setAutoPlay = false;
        this.setCanClose = false;
        this.configLoaded = false;
        this.calledShow = false;
        this.buttonColor = "";
        this.fq_status = false;
        this.language = "";
        init();
        if (interstitialConfig != null) {
            setPostback(interstitialConfig.getPostback());
            setCategories(interstitialConfig.getCategories());
            setButtonColor(interstitialConfig.getButtonColor());
            if (interstitialConfig.backButtonCanClose != null) {
                setBackButtonCanClose(interstitialConfig.isBackButtonCanClose());
            }
            setSkipText(interstitialConfig.getSkipText());
            if (interstitialConfig.autoPlay != null) {
                setAutoPlay(interstitialConfig.isAutoPlay());
            }
            setCreativeType(interstitialConfig.getCreativeType());
            setOrientation(interstitialConfig.getOrientation());
            if (interstitialConfig.mute == null) {
                z = false;
            }
            if (z) {
                setMute(interstitialConfig.getMute());
            }
            setMinVideoLength(interstitialConfig.getMinVideoLength());
            setMaxVideoLength(interstitialConfig.getMaxVideoLength());
            setLanguage(interstitialConfig.getLanguage());
        }
    }

    protected Interstitial(Interstitial interstitial) {
        super(interstitial);
        this.creativeType = TYPE_MANAGED;
        this.titleText = "";
        this.skipText = "";
        this.autoPlay = true;
        this.setAutoPlay = false;
        this.setCanClose = false;
        this.configLoaded = false;
        this.calledShow = false;
        this.buttonColor = "";
        this.fq_status = false;
        this.language = "";
        this.creativeType = interstitial.creativeType;
        this.titleText = interstitial.titleText;
        this.skipText = interstitial.skipText;
        this.autoPlay = interstitial.autoPlay;
        this.setAutoPlay = interstitial.setAutoPlay;
        this.setCanClose = interstitial.setCanClose;
        this.configLoaded = interstitial.configLoaded;
        this.calledShow = interstitial.calledShow;
        this.canClose = interstitial.canClose;
        this.buttonColor = interstitial.buttonColor;
        this.fq_status = interstitial.fq_status;
        this.language = interstitial.language;
        this.userOnAdError = interstitial.userOnAdError;
    }

    private void init() {
        loadConfig();
        AppnextWebView.m5797B(this.context).mo6321a(getPageUrl(), (C1376c) null);
        if (!checked_fq) {
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        StringBuilder sb = new StringBuilder("https://admin.appnext.com/AdminService.asmx/checkA?z=");
                        sb.append(Interstitial.this.getPlacementID());
                        sb.append("&callback=");
                        String a = C1326f.m5659a(sb.toString(), null);
                        Interstitial.f4094fq = new JSONObject(a.substring(a.indexOf("(") + 1, a.lastIndexOf(")"))).getBoolean(C1244c.STATUS);
                        Interstitial.this.fq_status = Interstitial.f4094fq;
                        new StringBuilder("fq ").append(Interstitial.this.fq_status);
                        Interstitial.checked_fq = true;
                    } catch (Throwable unused) {
                    }
                }
            }).start();
        } else {
            this.fq_status = C1286Ad.f4094fq;
        }
        super.setOnAdErrorCallback(new OnAdError() {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void adError(java.lang.String r11) {
                /*
                    r10 = this;
                    java.lang.String r0 = ""
                    int r1 = r11.hashCode()
                    switch(r1) {
                        case -2026653947: goto L_0x0046;
                        case -1958363695: goto L_0x003c;
                        case -1477010874: goto L_0x0032;
                        case -507110949: goto L_0x0028;
                        case 297538105: goto L_0x001e;
                        case 350741825: goto L_0x0014;
                        case 844170097: goto L_0x000a;
                        default: goto L_0x0009;
                    }
                L_0x0009:
                    goto L_0x0050
                L_0x000a:
                    java.lang.String r1 = "Too Slow Connection"
                    boolean r1 = r11.equals(r1)
                    if (r1 == 0) goto L_0x0050
                    r1 = 4
                    goto L_0x0051
                L_0x0014:
                    java.lang.String r1 = "Timeout"
                    boolean r1 = r11.equals(r1)
                    if (r1 == 0) goto L_0x0050
                    r1 = 5
                    goto L_0x0051
                L_0x001e:
                    java.lang.String r1 = "Ad Not Ready"
                    boolean r1 = r11.equals(r1)
                    if (r1 == 0) goto L_0x0050
                    r1 = 6
                    goto L_0x0051
                L_0x0028:
                    java.lang.String r1 = "No market installed on the device"
                    boolean r1 = r11.equals(r1)
                    if (r1 == 0) goto L_0x0050
                    r1 = 3
                    goto L_0x0051
                L_0x0032:
                    java.lang.String r1 = "Connection Error"
                    boolean r1 = r11.equals(r1)
                    if (r1 == 0) goto L_0x0050
                    r1 = 0
                    goto L_0x0051
                L_0x003c:
                    java.lang.String r1 = "No Ads"
                    boolean r1 = r11.equals(r1)
                    if (r1 == 0) goto L_0x0050
                    r1 = 2
                    goto L_0x0051
                L_0x0046:
                    java.lang.String r1 = "Internal error"
                    boolean r1 = r11.equals(r1)
                    if (r1 == 0) goto L_0x0050
                    r1 = 1
                    goto L_0x0051
                L_0x0050:
                    r1 = -1
                L_0x0051:
                    switch(r1) {
                        case 0: goto L_0x0068;
                        case 1: goto L_0x0065;
                        case 2: goto L_0x0062;
                        case 3: goto L_0x005f;
                        case 4: goto L_0x005c;
                        case 5: goto L_0x0059;
                        case 6: goto L_0x0056;
                        default: goto L_0x0054;
                    }
                L_0x0054:
                    r6 = r0
                    goto L_0x006b
                L_0x0056:
                    java.lang.String r0 = "error_ad_not_ready"
                    goto L_0x0054
                L_0x0059:
                    java.lang.String r0 = "error_timeout"
                    goto L_0x0054
                L_0x005c:
                    java.lang.String r0 = "error_slow_connection"
                    goto L_0x0054
                L_0x005f:
                    java.lang.String r0 = "error_no_market"
                    goto L_0x0054
                L_0x0062:
                    java.lang.String r0 = "error_no_ads"
                    goto L_0x0054
                L_0x0065:
                    java.lang.String r0 = "error_internal_error"
                    goto L_0x0054
                L_0x0068:
                    java.lang.String r0 = "error_connection_error"
                    goto L_0x0054
                L_0x006b:
                    com.appnext.ads.interstitial.Interstitial r0 = com.appnext.ads.interstitial.Interstitial.this
                    java.lang.String r1 = r0.getTID()
                    com.appnext.ads.interstitial.Interstitial r0 = com.appnext.ads.interstitial.Interstitial.this
                    java.lang.String r2 = r0.getVID()
                    com.appnext.ads.interstitial.Interstitial r0 = com.appnext.ads.interstitial.Interstitial.this
                    java.lang.String r3 = r0.getAUID()
                    com.appnext.ads.interstitial.Interstitial r0 = com.appnext.ads.interstitial.Interstitial.this
                    java.lang.String r4 = r0.getPlacementID()
                    com.appnext.ads.interstitial.Interstitial r0 = com.appnext.ads.interstitial.Interstitial.this
                    java.lang.String r5 = r0.getSessionId()
                    java.lang.String r7 = "current_interstitial"
                    java.lang.String r8 = ""
                    java.lang.String r9 = ""
                    com.appnext.core.C1326f.m5665a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    com.appnext.ads.interstitial.Interstitial r0 = com.appnext.ads.interstitial.Interstitial.this
                    com.appnext.core.callbacks.OnAdError r0 = r0.userOnAdError
                    if (r0 == 0) goto L_0x00a3
                    com.appnext.ads.interstitial.Interstitial r0 = com.appnext.ads.interstitial.Interstitial.this
                    com.appnext.core.callbacks.OnAdError r0 = r0.userOnAdError
                    r0.adError(r11)
                L_0x00a3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.interstitial.Interstitial.C11242.adError(java.lang.String):void");
            }
        });
    }

    public void loadAd() {
        if (getPlacementID().equals("")) {
            throw new IllegalArgumentException("Placement ID cannot be empty");
        } else if (!C1326f.m5692g(this.context, "android.permission.INTERNET")) {
            if (getOnAdErrorCallback() != null) {
                getOnAdErrorCallback().adError(AppnextError.CONNECTION_ERROR);
            }
        } else {
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        if (Interstitial.this.context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
                            C1326f.m5659a("http://www.appnext.com/myid.html", null);
                        } else {
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) Interstitial.this.context.getSystemService("connectivity")).getActiveNetworkInfo();
                            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                                throw new IOException();
                            }
                        }
                        Interstitial.this.getConfig().mo6276a(Interstitial.this.context, (C1347a) new C1347a() {
                            /* renamed from: a */
                            public final void mo5535a(HashMap<String, Object> hashMap) {
                                Interstitial.this.load();
                            }

                            public final void error(String str) {
                                Interstitial.this.load();
                            }
                        });
                    } catch (Throwable unused) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public final void run() {
                                if (Interstitial.this.getOnAdErrorCallback() != null) {
                                    Interstitial.this.getOnAdErrorCallback().adError(AppnextError.CONNECTION_ERROR);
                                }
                            }
                        });
                    }
                }
            }).start();
        }
    }

    /* access modifiers changed from: private */
    public void load() {
        C1153a.m5095ax().mo5720a(this.context, this, getPlacementID(), new C1316a() {
            /* renamed from: a */
            public final <T> void mo5540a(T t) {
                AppnextAd appnextAd;
                try {
                    appnextAd = C1153a.m5095ax().mo5719a(Interstitial.this.context, (ArrayList) t, Interstitial.this.getCreative(), (C1286Ad) Interstitial.this);
                } catch (Throwable unused) {
                    if (Interstitial.this.getOnAdErrorCallback() != null) {
                        Interstitial.this.getOnAdErrorCallback().adError(AppnextError.NO_ADS);
                    }
                    appnextAd = null;
                }
                if (appnextAd != null) {
                    if (Interstitial.this.getOnAdLoadedCallback() != null) {
                        Interstitial.this.getOnAdLoadedCallback().adLoaded(appnextAd.getBannerID());
                    }
                } else if (Interstitial.this.getOnAdErrorCallback() != null) {
                    Interstitial.this.getOnAdErrorCallback().adError(AppnextError.NO_ADS);
                }
            }

            public final void error(String str) {
                if (Interstitial.this.getOnAdErrorCallback() != null) {
                    Interstitial.this.getOnAdErrorCallback().adError(str);
                }
            }
        }, getCreative());
    }

    public void showAd() {
        if (getPlacementID().equals("")) {
            throw new IllegalArgumentException("Placement ID cannot be empty");
        } else if (!C1326f.m5692g(this.context, "android.permission.INTERNET")) {
            if (getOnAdErrorCallback() != null) {
                getOnAdErrorCallback().adError(AppnextError.CONNECTION_ERROR);
            }
        } else {
            int aM = C1326f.m5672aM(getConfig().get("min_internet_connection"));
            int aM2 = C1326f.m5672aM(C1326f.m5699v(this.context));
            if (aM2 == -1) {
                if (getOnAdErrorCallback() != null) {
                    getOnAdErrorCallback().adError(AppnextError.CONNECTION_ERROR);
                }
            } else if (aM2 < aM) {
                if (getOnAdErrorCallback() != null) {
                    getOnAdErrorCallback().adError(AppnextError.SLOW_CONNECTION);
                }
            } else {
                currentAd = this;
                if (C1153a.m5095ax().mo5723e(this)) {
                    startInterstitialActivity();
                    return;
                }
                C1153a.m5095ax().mo5720a(this.context, this, getPlacementID(), new C1316a() {
                    /* renamed from: a */
                    public final <T> void mo5540a(T t) {
                        Interstitial.this.startInterstitialActivity();
                    }

                    public final void error(final String str) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public final void run() {
                                if (Interstitial.this.getOnAdErrorCallback() != null) {
                                    Interstitial.this.getOnAdErrorCallback().adError(str);
                                }
                            }
                        });
                    }
                }, getCreative());
            }
        }
    }

    /* access modifiers changed from: private */
    public void startInterstitialActivity() {
        Intent activityIntent = getActivityIntent();
        if (activityIntent == null) {
            throw new IllegalArgumentException("null intent");
        }
        this.context.startActivity(activityIntent);
    }

    public void getECPM(final OnECPMLoaded onECPMLoaded) {
        if (onECPMLoaded == null) {
            throw new IllegalArgumentException("Callback cannot be null");
        }
        C1153a.m5095ax().mo6218a(this.context, this, getPlacementID(), new C1316a() {
            /* renamed from: a */
            public final <T> void mo5540a(T t) {
                AppnextAd a = C1153a.m5095ax().mo5719a(Interstitial.this.context, (ArrayList) t, Interstitial.this.getCreative(), (C1286Ad) Interstitial.this);
                if (a != null) {
                    onECPMLoaded.ecpm(new ECPM(a.getECPM(), a.getPPR(), a.getBannerID()));
                } else {
                    onECPMLoaded.error(AppnextError.NO_ADS);
                }
            }

            public final void error(String str) {
                onECPMLoaded.error(str);
            }
        }, false);
    }

    /* access modifiers changed from: private */
    public String getCreative() {
        int aM = C1326f.m5672aM(getConfig().get("min_internet_connection"));
        int aM2 = C1326f.m5672aM(getConfig().get("min_internet_connection_video"));
        int aM3 = C1326f.m5672aM(C1326f.m5699v(this.context));
        if (aM3 < aM || aM3 >= aM2) {
            return getCreativeType();
        }
        return "static";
    }

    /* access modifiers changed from: protected */
    public Intent getActivityIntent() {
        Intent intent = new Intent(this.context, InterstitialActivity.class);
        intent.setFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra(TtmlNode.ATTR_ID, getPlacementID());
        if (this.setAutoPlay) {
            intent.putExtra("auto_play", this.autoPlay);
        }
        if (this.setCanClose) {
            intent.putExtra("can_close", isBackButtonCanClose());
        }
        if (this.setMute) {
            intent.putExtra("mute", getMute());
        }
        intent.putExtra("cat", getCategories());
        intent.putExtra("pbk", getPostback());
        intent.putExtra("b_color", getButtonColor());
        intent.putExtra("skip_title", getSkipText());
        intent.putExtra("creative", getCreative());
        return intent;
    }

    public boolean isAdLoaded() {
        return !getPlacementID().equals("") && C1153a.m5095ax().mo5723e(this);
    }

    /* access modifiers changed from: protected */
    public C1345p getConfig() {
        return C1155c.m5113aA();
    }

    private void loadConfig() {
        getConfig().mo6285r("tid", getTID());
        getConfig().mo6276a(this.context, (C1347a) new C1347a() {
            /* renamed from: a */
            public final void mo5535a(HashMap<String, Object> hashMap) {
                Interstitial.this.configLoaded = true;
                C1334j.m5708cI().mo6263e(Integer.parseInt(Interstitial.this.getConfig().get("banner_expiration_time")));
                if (Interstitial.this.calledShow) {
                    Interstitial.this.showAd();
                }
            }

            public final void error(String str) {
                Interstitial.this.configLoaded = true;
                C1334j.m5708cI().mo6263e(Integer.parseInt(Interstitial.this.getConfig().get("banner_expiration_time")));
                if (Interstitial.this.calledShow) {
                    Interstitial.this.showAd();
                }
            }
        });
    }

    public void setOnAdErrorCallback(OnAdError onAdError) {
        this.userOnAdError = onAdError;
    }

    public OnAdError getOnAdErrorCallback() {
        return super.getOnAdErrorCallback();
    }

    public void setCreativeType(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Wrong creative type");
        } else if (str.equals(TYPE_MANAGED) || str.equals("static") || str.equals("video")) {
            this.creativeType = str;
        } else {
            throw new IllegalArgumentException("Wrong creative type");
        }
    }

    public String getCreativeType() {
        return this.creativeType;
    }

    @Deprecated
    public void setBackButtonCanClose(boolean z) {
        this.setCanClose = true;
        this.canClose = Boolean.valueOf(z);
    }

    @Deprecated
    public boolean isBackButtonCanClose() {
        if (this.canClose == null) {
            return false;
        }
        return this.canClose.booleanValue();
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    public void setAutoPlay(boolean z) {
        this.setAutoPlay = true;
        this.autoPlay = z;
    }

    public void setSkipText(String str) {
        if (str == null) {
            str = "";
        }
        this.skipText = str;
    }

    public String getSkipText() {
        return this.skipText;
    }

    public String getButtonColor() {
        return this.buttonColor;
    }

    public void setButtonColor(String str) {
        if (str == null || str.equals("")) {
            this.buttonColor = "";
            return;
        }
        if (!str.startsWith("#")) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(str);
            str = sb.toString();
        }
        try {
            Color.parseColor(str);
            this.buttonColor = str;
        } catch (Throwable unused) {
            throw new IllegalArgumentException("Unknown color");
        }
    }

    private boolean hasVideo(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrl().equals("") || !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrl30Sec().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    public void setParams(String str, String str2) {
        getConfig().mo6278a(str, str2);
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    /* access modifiers changed from: protected */
    public String getSessionId() {
        return super.getSessionId();
    }

    /* access modifiers changed from: protected */
    public C1377a getFallback() {
        return new C1154b();
    }

    public void destroy() {
        super.destroy();
        currentAd = null;
    }
}
