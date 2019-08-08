package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.InterstitialAdActivity;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.adapters.C1658v;
import com.facebook.ads.internal.p088o.C1774a;
import com.facebook.ads.internal.p088o.C1775b;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1783b;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.C1810a.C1811a;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.C2119b;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2142j;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2144l;
import java.util.UUID;

/* renamed from: com.facebook.ads.internal.view.p */
public class C2267p extends C2110a {

    /* renamed from: b */
    private static final String f7133b = "p";

    /* renamed from: c */
    private final String f7134c = UUID.randomUUID().toString();

    /* renamed from: d */
    private final C2144l f7135d = new C2144l() {
        /* renamed from: a */
        public void mo6895a(C2143k kVar) {
            if (C2267p.this.f7145n != null) {
                C2267p.this.f7145n.mo6853c();
            }
        }
    };

    /* renamed from: e */
    private final C2142j f7136e = new C2142j() {
        /* renamed from: a */
        public void mo6895a(C2141i iVar) {
            if (C2267p.this.f7145n != null) {
                C2267p.this.f7145n.mo6852b();
            }
        }
    };

    /* renamed from: f */
    private final C2136d f7137f = new C2136d() {
        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            if (C2267p.this.f7145n != null) {
                C2267p.this.f7145n.mo6858h();
            }
        }
    };

    /* renamed from: g */
    private final C1658v f7138g;

    /* renamed from: h */
    private C1802c f7139h;

    /* renamed from: i */
    private C2119b f7140i;

    /* renamed from: j */
    private Uri f7141j;

    /* renamed from: k */
    private String f7142k;

    /* renamed from: l */
    private String f7143l;

    /* renamed from: m */
    private String f7144m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C2271q f7145n;

    /* renamed from: o */
    private NativeAd f7146o;

    public C2267p(Context context) {
        super(context);
        this.f7138g = new C1658v(this, context);
        m8914t();
    }

    public C2267p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7138g = new C1658v(this, context);
        m8914t();
    }

    public C2267p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7138g = new C1658v(this, context);
        m8914t();
    }

    @TargetApi(21)
    public C2267p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7138g = new C1658v(this, context);
        m8914t();
    }

    /* renamed from: a */
    private void m8913a(String str) {
        C2370a.m9149b(getContext(), "parsing", C2373b.f7478M, new C1783b(AdErrorType.PARSER_FAILURE, str));
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(f7133b, str);
        }
    }

    /* renamed from: t */
    private void m8914t() {
        getEventBus().mo7626a((T[]) new C1779f[]{this.f7135d, this.f7136e, this.f7137f});
    }

    /* renamed from: a */
    public void mo8650a() {
        String str;
        Context context = getContext();
        Intent intent = new Intent(context, AudienceNetworkActivity.getAdActivity());
        if (this.f7140i == null) {
            str = "Must setClientToken first";
        } else if (this.f7141j == null && this.f7143l == null) {
            str = "Must setVideoURI or setVideoMPD first";
        } else {
            intent.putExtra("useNativeCtaButton", this.f7144m);
            intent.putExtra(AudienceNetworkActivity.VIEW_TYPE, C1811a.FULL_SCREEN_VIDEO);
            intent.putExtra(AudienceNetworkActivity.VIDEO_URL, this.f7141j.toString());
            intent.putExtra(AudienceNetworkActivity.CLIENT_TOKEN, this.f7142k == null ? "" : this.f7142k);
            intent.putExtra(AudienceNetworkActivity.VIDEO_MPD, this.f7143l);
            intent.putExtra(AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY, 13);
            intent.putExtra(AudienceNetworkActivity.VIDEO_SEEK_TIME, getCurrentPositionInMillis());
            intent.putExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.f7134c);
            intent.putExtra(AudienceNetworkActivity.VIDEO_LOGGER, this.f7140i.mo7259g());
            intent.putExtra("video_time_polling_interval", getVideoProgressReportIntervalMs());
            intent.addFlags(268435456);
            mo8383a(false);
            setVisibility(8);
            context.startActivity(intent);
        }
        m8913a(str);
        try {
            mo8383a(false);
            setVisibility(8);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            try {
                intent.setClass(context, InterstitialAdActivity.class);
                context.startActivity(intent);
            } catch (Exception e) {
                C1775b.m7365a(C1774a.m7362a(e, "Error occurred while loading fullscreen video activity."));
            }
        }
    }

    /* renamed from: b */
    public void mo8651b() {
        if (this.f7146o != null) {
            this.f7146o.onCtaBroadcast();
        }
    }

    public C2271q getListener() {
        return this.f7145n;
    }

    public String getUniqueId() {
        return this.f7134c;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7138g.mo7361a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f7138g.mo7362b();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(C1802c cVar) {
        this.f7139h = cVar;
    }

    public void setClientToken(String str) {
        if (this.f7140i != null) {
            this.f7140i.mo8428a();
        }
        this.f7142k = str;
        this.f7140i = str != null ? new C2119b(getContext(), this.f7139h, this, str) : null;
    }

    public void setEnableBackgroundVideo(boolean z) {
        this.f6745a.setBackgroundPlaybackEnabled(z);
    }

    public void setListener(C2271q qVar) {
        this.f7145n = qVar;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.f7146o = nativeAd;
    }

    public void setVideoCTA(String str) {
        this.f7144m = str;
    }

    public void setVideoMPD(String str) {
        if (str == null || this.f7140i != null) {
            this.f7143l = str;
            super.setVideoMPD(str);
            return;
        }
        m8913a("Must setClientToken first");
    }

    public void setVideoURI(Uri uri) {
        if (uri == null || this.f7140i != null) {
            this.f7141j = uri;
            super.setVideoURI(uri);
            return;
        }
        m8913a("Must setClientToken first");
    }
}
