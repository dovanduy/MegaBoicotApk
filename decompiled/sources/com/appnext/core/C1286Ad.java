package com.appnext.core;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.appnext.base.Appnext;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnAdOpened;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.appnext.core.p049a.C1305b;
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.p138c.C3241a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: com.appnext.core.Ad */
public abstract class C1286Ad {
    public static final String ORIENTATION_AUTO = "automatic";
    public static final String ORIENTATION_DEFAULT = "not_set";
    public static final String ORIENTATION_LANDSCAPE = "landscape";
    public static final String ORIENTATION_PORTRAIT = "portrait";
    /* access modifiers changed from: protected */
    public static boolean checked_fq = false;
    /* access modifiers changed from: protected */

    /* renamed from: fq */
    public static boolean f4094fq = false;
    private OnAdOpened adOpenedCallback;
    private C1308c adRequest;
    private String cat = "";
    private OnAdClosed closeCallback;
    private int cnt = 50;
    /* access modifiers changed from: protected */
    public Context context;
    private int maxVideoLength = 0;
    private int minVideoLength = 0;
    private boolean mute = false;
    private OnAdClicked onAdClicked;
    private OnAdError onAdError;
    private OnAdLoaded onAdLoaded;
    private String orientation = ORIENTATION_DEFAULT;
    private String pbk = "";
    private String placementID = "";
    private String sessionId = "";
    protected boolean setMute = false;

    public abstract String getAUID();

    public abstract void getECPM(OnECPMLoaded onECPMLoaded);

    public abstract String getTID();

    public abstract String getVID();

    public abstract boolean isAdLoaded();

    public abstract void loadAd();

    public abstract void showAd();

    public C1286Ad(final Context context2, String str) {
        if (context2 == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (str == null) {
            throw new IllegalArgumentException("placementID cannot be null");
        } else {
            this.context = context2;
            setPlacementID(str);
            C1334j.m5708cI().mo6264j(context2, str);
            if (C1326f.m5683cD().equals("")) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C1326f.m5697t(context2);
                    }
                });
            }
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        if (VERSION.SDK_INT <= 19) {
                            C3241a.m11577a(context2.getApplicationContext());
                        }
                    } catch (Throwable unused) {
                    }
                    C1286Ad.this.setSessionId(C1326f.m5701x(context2));
                }
            }).start();
            C1305b.m5595cN();
            new Thread(new Runnable() {
                public final void run() {
                    Appnext.init(context2);
                }
            }).start();
        }
    }

    protected C1286Ad(C1286Ad ad) {
        this.context = ad.context;
        setPlacementID(ad.getPlacementID());
        setCategories(ad.cat);
        setPostback(ad.getPostback());
        setCount(ad.getCount());
        setMinVideoLength(ad.getMinVideoLength());
        setMaxVideoLength(ad.getMaxVideoLength());
        setSessionId(ad.getSessionId());
        this.onAdClicked = ad.onAdClicked;
        this.onAdError = ad.onAdError;
        this.onAdLoaded = ad.onAdLoaded;
        this.closeCallback = ad.closeCallback;
        this.adOpenedCallback = ad.adOpenedCallback;
    }

    public String getPlacementID() {
        return this.placementID;
    }

    /* access modifiers changed from: protected */
    public void setPlacementID(String str) {
        this.placementID = str;
    }

    public OnAdClicked getOnAdClickedCallback() {
        return this.onAdClicked;
    }

    public OnAdError getOnAdErrorCallback() {
        return this.onAdError;
    }

    public OnAdLoaded getOnAdLoadedCallback() {
        return this.onAdLoaded;
    }

    public OnAdClosed getOnAdClosedCallback() {
        return this.closeCallback;
    }

    public void setOnAdClickedCallback(OnAdClicked onAdClicked2) {
        this.onAdClicked = onAdClicked2;
    }

    public void setOnAdErrorCallback(OnAdError onAdError2) {
        this.onAdError = onAdError2;
    }

    public void setOnAdLoadedCallback(OnAdLoaded onAdLoaded2) {
        this.onAdLoaded = onAdLoaded2;
    }

    public void setOnAdClosedCallback(OnAdClosed onAdClosed) {
        this.closeCallback = onAdClosed;
    }

    public OnAdOpened getOnAdOpenedCallback() {
        return this.adOpenedCallback;
    }

    public void setOnAdOpenedCallback(OnAdOpened onAdOpened) {
        this.adOpenedCallback = onAdOpened;
    }

    public void setCategories(String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(URLDecoder.decode(str, C2793C.UTF8_NAME))) {
                str = URLEncoder.encode(str, C2793C.UTF8_NAME);
            }
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        this.cat = str;
    }

    public void setPostback(String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(URLDecoder.decode(str, C2793C.UTF8_NAME))) {
                str = URLEncoder.encode(str, C2793C.UTF8_NAME);
            }
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        this.pbk = str;
    }

    public void setMute(boolean z) {
        this.setMute = true;
        this.mute = z;
    }

    public String getCategories() {
        return this.cat;
    }

    public String getPostback() {
        return this.pbk;
    }

    public boolean getMute() {
        return this.mute;
    }

    /* access modifiers changed from: protected */
    public int getCount() {
        return this.cnt;
    }

    /* access modifiers changed from: protected */
    public void setCount(int i) {
        this.cnt = i;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public void setOrientation(String str) {
        if (str == null) {
            throw new IllegalArgumentException("orientation type");
        } else if (str.equals(ORIENTATION_AUTO) || str.equals(ORIENTATION_DEFAULT) || str.equals(ORIENTATION_LANDSCAPE) || str.equals(ORIENTATION_PORTRAIT)) {
            this.orientation = str;
        } else {
            throw new IllegalArgumentException("Wrong orientation type");
        }
    }

    public int getMaxVideoLength() {
        return this.maxVideoLength;
    }

    public void setMaxVideoLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Max Length must be higher than 0");
        } else if (i <= 0 || getMinVideoLength() <= 0 || i >= getMinVideoLength()) {
            this.maxVideoLength = i;
        } else {
            throw new IllegalArgumentException("Max Length cannot be lower than min length");
        }
    }

    public int getMinVideoLength() {
        return this.minVideoLength;
    }

    public void setMinVideoLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Min Length must be higher than 0");
        } else if (i <= 0 || getMaxVideoLength() <= 0 || i <= getMaxVideoLength()) {
            this.minVideoLength = i;
        } else {
            throw new IllegalArgumentException("Min Length cannot be higher than max length");
        }
    }

    /* access modifiers changed from: protected */
    public Context getContext() {
        return this.context;
    }

    /* access modifiers changed from: protected */
    public C1308c getAdRequest() {
        return this.adRequest;
    }

    /* access modifiers changed from: protected */
    public void setAdRequest(C1308c cVar) {
        this.adRequest = cVar;
    }

    /* access modifiers changed from: protected */
    public String getSessionId() {
        return this.sessionId;
    }

    /* access modifiers changed from: protected */
    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!getClass().isInstance(obj) && !obj.getClass().isInstance(this)) {
            return false;
        }
        if (!(obj instanceof C1286Ad)) {
            return super.equals(obj);
        }
        C1286Ad ad = (C1286Ad) obj;
        return ad.getPlacementID().equals(getPlacementID()) && ad.getCategories().equals(getCategories()) && ad.getPostback().equals(getPostback()) && ad.getMinVideoLength() == getMinVideoLength() && ad.getMaxVideoLength() == getMaxVideoLength() && ad.getCount() == getCount();
    }

    public int hashCode() {
        return (31 * ((((((((getPlacementID().hashCode() * 31) + getCategories().hashCode()) * 31) + getPostback().hashCode()) * 31) + getCount()) * 31) + getMinVideoLength())) + getMaxVideoLength();
    }

    public void destroy() {
        this.context = null;
        this.onAdClicked = null;
        this.onAdError = null;
        this.onAdLoaded = null;
        this.closeCallback = null;
        this.adOpenedCallback = null;
    }
}
