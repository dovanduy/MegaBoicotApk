package com.appnext.ads.fullscreen;

import android.content.Context;
import android.content.Intent;
import com.appnext.ads.AdsError;
import com.appnext.ads.C1066a;
import com.appnext.base.p046b.C1244c;
import com.appnext.base.p046b.C1245d;
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
import com.appnext.core.callbacks.OnVideoEnded;
import java.io.File;
import java.util.HashMap;
import java.util.Random;
import org.json.JSONObject;

public abstract class Video extends C1286Ad {
    protected static final int FULL_SCREEN_VIDEO = 1;
    protected static final int REWARDED_VIDEO = 2;
    protected static final String TID = "301";
    protected static final String VID = "2.4.5.472";
    public static final String VIDEO_LENGTH_LONG = "30";
    public static final String VIDEO_LENGTH_SHORT = "15";
    private static boolean cacheVideo = true;
    protected static Video currentAd = null;
    /* access modifiers changed from: private */
    public static boolean init = false;
    private static boolean streamingEnable = false;
    protected boolean fq_status;
    private String language;
    protected long rnd;
    private int rollCaptionTime;
    private boolean showCta;
    /* access modifiers changed from: private */
    public int type;
    /* access modifiers changed from: private */
    public OnAdError userOnAdError;
    private OnVideoEnded videoEnded;
    private String videoLength;

    public String getTID() {
        return TID;
    }

    public String getVID() {
        return "2.4.5.472";
    }

    public Video(Context context, int i, String str) {
        super(context, str);
        this.videoLength = "15";
        this.showCta = true;
        this.rollCaptionTime = -2;
        this.fq_status = false;
        this.language = "";
        this.type = i;
        this.rnd = (long) new Random(System.currentTimeMillis()).nextInt(Integer.MAX_VALUE);
        init();
    }

    public Video(Context context, int i, String str, VideoConfig videoConfig) {
        super(context, str);
        this.videoLength = "15";
        boolean z = true;
        this.showCta = true;
        this.rollCaptionTime = -2;
        this.fq_status = false;
        this.language = "";
        this.type = i;
        this.rnd = (long) new Random(System.currentTimeMillis()).nextInt(Integer.MAX_VALUE);
        init();
        if (videoConfig != null) {
            setPostback(videoConfig.getPostback());
            setCategories(videoConfig.getCategories());
            setOrientation(videoConfig.getOrientation());
            if (videoConfig.showCta != null) {
                setShowCta(videoConfig.isShowCta());
            }
            setRollCaptionTime(videoConfig.getRollCaptionTime());
            setVideoLength(videoConfig.getVideoLength());
            if (videoConfig.mute == null) {
                z = false;
            }
            if (z) {
                setMute(videoConfig.getMute());
            }
            setMinVideoLength(videoConfig.getMinVideoLength());
            setMaxVideoLength(videoConfig.getMaxVideoLength());
            setLanguage(videoConfig.getLanguage());
        }
    }

    protected Video(Context context, Video video) {
        super(context, video.getPlacementID());
        this.videoLength = "15";
        this.showCta = true;
        this.rollCaptionTime = -2;
        this.fq_status = false;
        this.language = "";
        this.type = video.type;
        this.rnd = video.rnd;
        setPostback(video.getPostback());
        setCategories(video.getCategories());
        setOrientation(video.getOrientation());
        setVideoLength(video.getVideoLength());
        setMute(video.getMute());
        setMinVideoLength(video.getMinVideoLength());
        setMaxVideoLength(video.getMaxVideoLength());
        setRollCaptionTime(video.getRollCaptionTime());
        setShowCta(video.isShowCta());
        setLanguage(video.getLanguage());
        setOnVideoEndedCallback(video.getOnVideoEndedCallback());
        setOnAdClosedCallback(video.getOnAdClosedCallback());
        setOnAdErrorCallback(video.getOnAdErrorCallback());
        setOnAdClickedCallback(video.getOnAdClickedCallback());
        setOnAdOpenedCallback(video.getOnAdOpenedCallback());
        setOnAdLoadedCallback(video.getOnAdLoadedCallback());
        setSessionId(video.getSessionId());
        this.fq_status = video.fq_status;
    }

    private void init() {
        getConfig().mo6285r("tid", getTID());
        getConfig().mo6276a(this.context, (C1347a) new C1347a() {
            /* renamed from: a */
            public final void mo5535a(HashMap<String, Object> hashMap) {
                C1334j.m5708cI().mo6263e(Integer.parseInt(Video.this.getConfig().get("banner_expiration_time")));
            }

            public final void error(String str) {
                C1334j.m5708cI().mo6263e(Integer.parseInt(Video.this.getConfig().get("banner_expiration_time")));
            }
        });
        if (!checked_fq) {
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        StringBuilder sb = new StringBuilder("https://admin.appnext.com/AdminService.asmx/checkA?z=");
                        sb.append(Video.this.getPlacementID());
                        sb.append("&callback=");
                        String a = C1326f.m5659a(sb.toString(), null);
                        Video.f4094fq = new JSONObject(a.substring(a.indexOf("(") + 1, a.lastIndexOf(")"))).getBoolean(C1244c.STATUS);
                        Video.this.fq_status = Video.f4094fq;
                        new StringBuilder("fq ").append(Video.this.fq_status);
                        Video.checked_fq = true;
                    } catch (Throwable unused) {
                    }
                }
            }).start();
        } else {
            this.fq_status = C1286Ad.f4094fq;
        }
        new Thread(new Runnable() {
            public final void run() {
                if (!Video.init) {
                    Video.init = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append(Video.this.context.getFilesDir().getAbsolutePath());
                    sb.append("/data/appnext/videos/");
                    sb.append("tmp/");
                    C1326f.m5679b(new File(sb.toString()));
                }
            }
        }).start();
        super.setOnAdErrorCallback(new OnAdError() {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void adError(java.lang.String r13) {
                /*
                    r12 = this;
                    java.lang.String r0 = ""
                    int r1 = r13.hashCode()
                    r2 = 1
                    switch(r1) {
                        case -2026653947: goto L_0x0047;
                        case -1958363695: goto L_0x003d;
                        case -1477010874: goto L_0x0033;
                        case -507110949: goto L_0x0029;
                        case 297538105: goto L_0x001f;
                        case 350741825: goto L_0x0015;
                        case 844170097: goto L_0x000b;
                        default: goto L_0x000a;
                    }
                L_0x000a:
                    goto L_0x0051
                L_0x000b:
                    java.lang.String r1 = "Too Slow Connection"
                    boolean r1 = r13.equals(r1)
                    if (r1 == 0) goto L_0x0051
                    r1 = 4
                    goto L_0x0052
                L_0x0015:
                    java.lang.String r1 = "Timeout"
                    boolean r1 = r13.equals(r1)
                    if (r1 == 0) goto L_0x0051
                    r1 = 5
                    goto L_0x0052
                L_0x001f:
                    java.lang.String r1 = "Ad Not Ready"
                    boolean r1 = r13.equals(r1)
                    if (r1 == 0) goto L_0x0051
                    r1 = 6
                    goto L_0x0052
                L_0x0029:
                    java.lang.String r1 = "No market installed on the device"
                    boolean r1 = r13.equals(r1)
                    if (r1 == 0) goto L_0x0051
                    r1 = 3
                    goto L_0x0052
                L_0x0033:
                    java.lang.String r1 = "Connection Error"
                    boolean r1 = r13.equals(r1)
                    if (r1 == 0) goto L_0x0051
                    r1 = 0
                    goto L_0x0052
                L_0x003d:
                    java.lang.String r1 = "No Ads"
                    boolean r1 = r13.equals(r1)
                    if (r1 == 0) goto L_0x0051
                    r1 = 2
                    goto L_0x0052
                L_0x0047:
                    java.lang.String r1 = "Internal error"
                    boolean r1 = r13.equals(r1)
                    if (r1 == 0) goto L_0x0051
                    r1 = r2
                    goto L_0x0052
                L_0x0051:
                    r1 = -1
                L_0x0052:
                    switch(r1) {
                        case 0: goto L_0x0069;
                        case 1: goto L_0x0066;
                        case 2: goto L_0x0063;
                        case 3: goto L_0x0060;
                        case 4: goto L_0x005d;
                        case 5: goto L_0x005a;
                        case 6: goto L_0x0057;
                        default: goto L_0x0055;
                    }
                L_0x0055:
                    r8 = r0
                    goto L_0x006c
                L_0x0057:
                    java.lang.String r0 = "error_ad_not_ready"
                    goto L_0x0055
                L_0x005a:
                    java.lang.String r0 = "error_timeout"
                    goto L_0x0055
                L_0x005d:
                    java.lang.String r0 = "error_slow_connection"
                    goto L_0x0055
                L_0x0060:
                    java.lang.String r0 = "error_no_market"
                    goto L_0x0055
                L_0x0063:
                    java.lang.String r0 = "error_no_ads"
                    goto L_0x0055
                L_0x0066:
                    java.lang.String r0 = "error_internal_error"
                    goto L_0x0055
                L_0x0069:
                    java.lang.String r0 = "error_connection_error"
                    goto L_0x0055
                L_0x006c:
                    com.appnext.ads.fullscreen.Video r0 = com.appnext.ads.fullscreen.Video.this
                    java.lang.String r3 = r0.getTID()
                    com.appnext.ads.fullscreen.Video r0 = com.appnext.ads.fullscreen.Video.this
                    java.lang.String r4 = r0.getVID()
                    com.appnext.ads.fullscreen.Video r0 = com.appnext.ads.fullscreen.Video.this
                    java.lang.String r5 = r0.getAUID()
                    com.appnext.ads.fullscreen.Video r0 = com.appnext.ads.fullscreen.Video.this
                    java.lang.String r6 = r0.getPlacementID()
                    com.appnext.ads.fullscreen.Video r0 = com.appnext.ads.fullscreen.Video.this
                    java.lang.String r7 = r0.getSessionId()
                    com.appnext.ads.fullscreen.Video r0 = com.appnext.ads.fullscreen.Video.this
                    int r0 = r0.type
                    if (r0 != r2) goto L_0x0096
                    java.lang.String r0 = "fullscreen"
                L_0x0094:
                    r9 = r0
                    goto L_0x0099
                L_0x0096:
                    java.lang.String r0 = "rewarded"
                    goto L_0x0094
                L_0x0099:
                    java.lang.String r10 = ""
                    java.lang.String r11 = ""
                    com.appnext.core.C1326f.m5665a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    com.appnext.ads.fullscreen.Video r0 = com.appnext.ads.fullscreen.Video.this
                    com.appnext.core.callbacks.OnAdError r0 = r0.userOnAdError
                    if (r0 == 0) goto L_0x00b1
                    com.appnext.ads.fullscreen.Video r0 = com.appnext.ads.fullscreen.Video.this
                    com.appnext.core.callbacks.OnAdError r0 = r0.userOnAdError
                    r0.adError(r13)
                L_0x00b1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.fullscreen.Video.C10784.adError(java.lang.String):void");
            }
        });
    }

    public void showAd() {
        if (getPlacementID().equals("")) {
            throw new IllegalArgumentException("Placement ID cannot be empty");
        } else if (!C1326f.m5692g(this.context, "android.permission.INTERNET")) {
            if (getOnAdErrorCallback() != null) {
                getOnAdErrorCallback().adError(AppnextError.CONNECTION_ERROR);
            }
        } else {
            int aM = C1326f.m5672aM(getConfig().get("min_internet_connection_video"));
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
                C1326f.m5665a(getTID(), getVID(), getAUID(), getPlacementID(), getSessionId(), C1066a.f3541cf, this.type == 1 ? "fullscreen" : "rewarded", "", "");
                if (C1083b.m4964ac().mo5565g(this)) {
                    Intent intent = new Intent(this.context, FullscreenActivity.class);
                    intent.setFlags(268435456);
                    intent.putExtra(TtmlNode.ATTR_ID, getPlacementID());
                    intent.putExtra(C1245d.f3961jd, this.type);
                    currentAd = this;
                    this.context.startActivity(intent);
                    return;
                }
                if (getOnAdErrorCallback() != null) {
                    getOnAdErrorCallback().adError(AdsError.AD_NOT_READY);
                }
                C1083b.m4964ac().mo6217a(this.context, (C1286Ad) this, getPlacementID(), (C1316a) null);
                C1326f.m5665a(getTID(), getVID(), getAUID(), getPlacementID(), getSessionId(), C1066a.AD_NOT_READY, this.type == 1 ? "fullscreen" : "rewarded", "", "");
            }
        }
    }

    public void loadAd() {
        if (getPlacementID().equals("")) {
            throw new IllegalArgumentException("Placement ID cannot be empty");
        } else if (!C1326f.m5692g(this.context, "android.permission.INTERNET")) {
            if (getOnAdErrorCallback() != null) {
                getOnAdErrorCallback().adError(AppnextError.CONNECTION_ERROR);
            }
        } else {
            getConfig().mo6276a(this.context, (C1347a) new C1347a() {
                /* renamed from: a */
                public final void mo5535a(HashMap<String, Object> hashMap) {
                    Video.this.load();
                }

                public final void error(String str) {
                    Video.this.load();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void load() {
        C1083b.m4964ac().mo6217a(this.context, (C1286Ad) this, getPlacementID(), (C1316a) new C1316a() {
            /* renamed from: a */
            public final <T> void mo5540a(T t) {
                AppnextAd b = C1083b.m4964ac().mo5561b(Video.this.context, (C1286Ad) Video.this);
                if (Video.this.getOnAdLoadedCallback() != null) {
                    if (b != null) {
                        Video.this.getOnAdLoadedCallback().adLoaded(b.getBannerID());
                    } else if (Video.this.getOnAdErrorCallback() != null) {
                        Video.this.getOnAdErrorCallback().adError(AppnextError.NO_ADS);
                    }
                }
            }

            public final void error(String str) {
                if (Video.this.getOnAdErrorCallback() != null) {
                    Video.this.getOnAdErrorCallback().adError(str);
                }
            }
        });
    }

    public void getECPM(final OnECPMLoaded onECPMLoaded) {
        if (onECPMLoaded == null) {
            throw new IllegalArgumentException("Callback cannot be null");
        }
        C1083b.m4964ac().mo6218a(this.context, this, getPlacementID(), new C1316a() {
            /* renamed from: a */
            public final <T> void mo5540a(T t) {
                AppnextAd b = C1083b.m4964ac().mo5561b(Video.this.context, (C1286Ad) Video.this);
                if (b != null) {
                    onECPMLoaded.ecpm(new ECPM(b.getECPM(), b.getPPR(), b.getBannerID()));
                } else {
                    onECPMLoaded.error(AppnextError.NO_ADS);
                }
            }

            public final void error(String str) {
                onECPMLoaded.error(str);
            }
        }, false);
    }

    /* access modifiers changed from: protected */
    public C1345p getConfig() {
        if (this.type == 2) {
            return C1103f.m5002ah();
        }
        if (this.type == 1) {
            return C1085c.m4984af();
        }
        return null;
    }

    public boolean isAdLoaded() {
        if (getPlacementID().equals("")) {
            return false;
        }
        return C1083b.m4964ac().mo5565g(this);
    }

    public OnVideoEnded getOnVideoEndedCallback() {
        return this.videoEnded;
    }

    public void setOnVideoEndedCallback(OnVideoEnded onVideoEnded) {
        this.videoEnded = onVideoEnded;
    }

    public String getVideoLength() {
        return this.videoLength;
    }

    public void setVideoLength(String str) {
        if (str.equals("15") || str.equals("30")) {
            this.videoLength = str;
            return;
        }
        throw new IllegalArgumentException("Wrong video length");
    }

    public static void setCacheVideo(boolean z) {
        cacheVideo = z;
    }

    public static boolean getCacheVideo() {
        return cacheVideo;
    }

    public static void setStreamingMode(boolean z) {
        streamingEnable = z;
    }

    public static boolean isStreamingModeEnabled() {
        return streamingEnable;
    }

    public void setOnAdErrorCallback(OnAdError onAdError) {
        this.userOnAdError = onAdError;
    }

    public OnAdError getOnAdErrorCallback() {
        return super.getOnAdErrorCallback();
    }

    public int getRollCaptionTime() {
        return this.rollCaptionTime;
    }

    public void setRollCaptionTime(int i) {
        if (i == -1 || (i >= 3 && i <= 10)) {
            this.rollCaptionTime = i;
        }
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

    public boolean isShowCta() {
        return this.showCta;
    }

    public void setShowCta(boolean z) {
        this.showCta = z;
    }

    /* access modifiers changed from: protected */
    public String getSessionId() {
        return super.getSessionId();
    }

    public void destroy() {
        super.destroy();
        this.videoEnded = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.context.getFilesDir().getAbsolutePath());
            sb.append("/data/appnext/videos/");
            sb.append("tmp/vid");
            sb.append(this.rnd);
            sb.append("/");
            C1326f.m5679b(new File(sb.toString()));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            destroy();
        } catch (Throwable unused) {
        } finally {
            super.finalize();
        }
    }
}
