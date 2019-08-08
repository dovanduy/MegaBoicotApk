package com.startapp.android.publish.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import com.startapp.android.publish.ads.banner.C5144c;
import com.startapp.android.publish.ads.nativead.StartAppNativeAd.C5179b;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.C5402i;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.adsCommon.p192l.C5423b;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5499a;
import com.startapp.common.C5499a.C5502a;
import com.startapp.common.p193a.C5518g;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: StartAppSDK */
public class NativeAdDetails implements NativeAdInterface {

    /* renamed from: a */
    private AdDetails f16645a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f16646b;

    /* renamed from: c */
    private Bitmap f16647c;

    /* renamed from: d */
    private Bitmap f16648d;

    /* renamed from: e */
    private boolean f16649e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5176a f16650f;

    /* renamed from: g */
    private String f16651g;

    /* renamed from: h */
    private C5423b f16652h;

    /* renamed from: i */
    private WeakReference<View> f16653i = new WeakReference<>(null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public OnAttachStateChangeListener f16654j;

    /* renamed from: com.startapp.android.publish.ads.nativead.NativeAdDetails$a */
    /* compiled from: StartAppSDK */
    protected interface C5176a {
        void onNativeAdDetailsLoaded(int i);
    }

    /* renamed from: com.startapp.android.publish.ads.nativead.NativeAdDetails$b */
    /* compiled from: StartAppSDK */
    private class C5177b implements OnClickListener {
        private C5177b() {
        }

        public void onClick(View view) {
            NativeAdDetails.this.m22209a(view);
        }
    }

    public NativeAdDetails(AdDetails adDetails, NativeAdPreferences nativeAdPreferences, int i, C5176a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Initializiang SingleAd [");
        sb.append(i);
        sb.append("]");
        C5518g.m23563a("StartAppNativeAd", 3, sb.toString());
        this.f16645a = adDetails;
        this.f16646b = i;
        this.f16650f = aVar;
        if (nativeAdPreferences.isAutoBitmapDownload()) {
            new C5499a(getImageUrl(), new C5502a() {
                /* renamed from: a */
                public void mo18881a(Bitmap bitmap, int i) {
                    NativeAdDetails.this.m22208a(bitmap);
                    new C5499a(NativeAdDetails.this.getSecondaryImageUrl(), new C5502a() {
                        /* renamed from: a */
                        public void mo18881a(Bitmap bitmap, int i) {
                            NativeAdDetails.this.m22215b(bitmap);
                            NativeAdDetails.this.m22214b();
                        }
                    }, i).mo20469a();
                }
            }, i).mo20469a();
        } else {
            m22214b();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("         Title: [");
        sb.append(getTitle());
        sb.append("]\n");
        sb.append("         Description: [");
        sb.append(getDescription().substring(0, 30));
        sb.append("]...\n");
        sb.append("         Rating: [");
        sb.append(getRating());
        sb.append("]\n");
        sb.append("         Installs: [");
        sb.append(getInstalls());
        sb.append("]\n");
        sb.append("         Category: [");
        sb.append(getCategory());
        sb.append("]\n");
        sb.append("         PackageName: [");
        sb.append(getPackacgeName());
        sb.append("]\n");
        sb.append("         CampaginAction: [");
        sb.append(getCampaignAction());
        sb.append("]\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        unregisterView();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22208a(Bitmap bitmap) {
        this.f16647c = bitmap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m22215b(Bitmap bitmap) {
        this.f16648d = bitmap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m22214b() {
        new Handler().post(new Runnable() {
            public void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("SingleAd [");
                sb.append(NativeAdDetails.this.f16646b);
                sb.append("] Loaded");
                C5518g.m23563a("StartAppNativeAd", 3, sb.toString());
                if (NativeAdDetails.this.f16650f != null) {
                    NativeAdDetails.this.f16650f.onNativeAdDetailsLoaded(NativeAdDetails.this.f16646b);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19081a(String str) {
        this.f16651g = str;
    }

    public String getTitle() {
        return this.f16645a != null ? this.f16645a.getTitle() : "";
    }

    public String getDescription() {
        return this.f16645a != null ? this.f16645a.getDescription() : "";
    }

    public float getRating() {
        if (this.f16645a != null) {
            return this.f16645a.getRating();
        }
        return 5.0f;
    }

    public String getImageUrl() {
        return this.f16645a != null ? this.f16645a.getImageUrl() : "";
    }

    public String getSecondaryImageUrl() {
        return this.f16645a != null ? this.f16645a.getSecondaryImageUrl() : "";
    }

    public Bitmap getImageBitmap() {
        return this.f16647c;
    }

    public Bitmap getSecondaryImageBitmap() {
        return this.f16648d;
    }

    public String getInstalls() {
        return this.f16645a != null ? this.f16645a.getInstalls() : "";
    }

    public String getCategory() {
        return this.f16645a != null ? this.f16645a.getCategory() : "";
    }

    public String getPackacgeName() {
        return this.f16645a != null ? this.f16645a.getPackageName() : "";
    }

    public C5179b getCampaignAction() {
        C5179b bVar = C5179b.OPEN_MARKET;
        return (this.f16645a == null || !this.f16645a.isCPE()) ? bVar : C5179b.LAUNCH_APP;
    }

    public Boolean isApp() {
        return this.f16645a != null ? Boolean.valueOf(this.f16645a.isApp()) : Boolean.valueOf(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdDetails mo19080a() {
        return this.f16645a;
    }

    public boolean registerViewForInteraction(View view) {
        m22216b(view);
        ((View) this.f16653i.get()).setOnClickListener(new C5177b());
        return true;
    }

    public boolean registerViewForInteraction(View view, List<View> list) {
        if (list == null || list.isEmpty() || this.f16653i.get() != null) {
            registerViewForInteraction(view);
        } else {
            C5177b bVar = new C5177b();
            for (View onClickListener : list) {
                onClickListener.setOnClickListener(bVar);
            }
        }
        return true;
    }

    public void unregisterView() {
        m22222e();
        View view = (View) this.f16653i.get();
        this.f16653i.clear();
        if (!(view == null || VERSION.SDK_INT < 12 || this.f16654j == null)) {
            view.removeOnAttachStateChangeListener(this.f16654j);
        }
        if (this.f16647c != null) {
            this.f16647c.recycle();
            this.f16647c = null;
        }
        if (this.f16648d != null) {
            this.f16648d.recycle();
            this.f16648d = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22209a(View view) {
        m22207a(view.getContext());
    }

    /* renamed from: b */
    private void m22216b(View view) {
        this.f16653i = new WeakReference<>(view);
        if (view.hasWindowFocus()) {
            m22219c();
        } else if (VERSION.SDK_INT >= 12) {
            view.addOnAttachStateChangeListener(m22226g());
        } else {
            m22219c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m22219c() {
        View view = (View) this.f16653i.get();
        if (this.f16652h == null && view != null) {
            WeakReference<View> weakReference = this.f16653i;
            C5402i iVar = new C5402i(view.getContext(), new String[]{mo19080a().getTrackingUrl()}, new C5363b(this.f16651g), m22224f());
            this.f16652h = new C5423b(weakReference, iVar, m22220d());
            this.f16652h.mo19975a();
        }
    }

    /* renamed from: d */
    private int m22220d() {
        return C5144c.m22086a().mo18952b().mo18841q();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m22222e() {
        if (this.f16652h != null) {
            this.f16652h.mo19976b();
            this.f16652h = null;
        }
    }

    /* renamed from: f */
    private long m22224f() {
        if (this.f16645a.getDelayImpressionInSeconds() != null) {
            return TimeUnit.SECONDS.toMillis(this.f16645a.getDelayImpressionInSeconds().longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABDisplayImpressionDelayInSeconds());
    }

    /* renamed from: g */
    private OnAttachStateChangeListener m22226g() {
        if (this.f16654j == null) {
            this.f16654j = new OnAttachStateChangeListener() {
                public void onViewAttachedToWindow(View view) {
                    NativeAdDetails.this.m22219c();
                }

                public void onViewDetachedFromWindow(View view) {
                    NativeAdDetails.this.m22222e();
                    view.removeOnAttachStateChangeListener(NativeAdDetails.this.f16654j);
                }
            };
        }
        return this.f16654j;
    }

    /* renamed from: a */
    private void m22207a(Context context) {
        switch (getCampaignAction()) {
            case OPEN_MARKET:
                boolean a = C5349c.m22870a(context, Placement.INAPP_NATIVE);
                if (!this.f16645a.isSmartRedirect() || a) {
                    C5349c.m22857a(context, this.f16645a.getClickUrl(), this.f16645a.getTrackingClickUrl(), new C5363b(this.f16651g), this.f16645a.isStartappBrowserEnabled() && !a, false);
                    return;
                } else {
                    C5349c.m22859a(context, this.f16645a.getClickUrl(), this.f16645a.getTrackingClickUrl(), this.f16645a.getPackageName(), new C5363b(this.f16651g), C5344b.m22784a().mo19749A(), C5344b.m22784a().mo19750B(), this.f16645a.isStartappBrowserEnabled(), this.f16645a.shouldSendRedirectHops(), false);
                    return;
                }
            case LAUNCH_APP:
                C5349c.m22866a(getPackacgeName(), this.f16645a.getIntentDetails(), this.f16645a.getClickUrl(), context, new C5363b(this.f16651g));
                return;
            default:
                return;
        }
    }

    @Deprecated
    public void sendClick(Context context) {
        if (this.f16645a != null && this.f16653i.get() == null) {
            m22207a(context);
        }
    }

    @Deprecated
    public void sendImpression(Context context) {
        if (this.f16653i.get() == null) {
            if (!this.f16649e) {
                this.f16649e = true;
                if (this.f16645a != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Sending Impression for [");
                    sb.append(this.f16646b);
                    sb.append("]");
                    C5518g.m23563a("StartAppNativeAd", 3, sb.toString());
                    C5349c.m22853a(context, this.f16645a.getTrackingUrl(), new C5363b(this.f16651g));
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Already sent impression for [");
                sb2.append(this.f16646b);
                sb2.append("]");
                C5518g.m23563a("StartAppNativeAd", 3, sb2.toString());
            }
        }
    }
}
