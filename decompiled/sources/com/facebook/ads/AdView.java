package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1577a;
import com.facebook.ads.internal.p074b.C1659a;
import com.facebook.ads.internal.p074b.C1660b;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.protocol.C1786d;
import com.facebook.ads.internal.protocol.C1788f;
import com.facebook.ads.internal.view.p101c.C1967a;
import com.facebook.ads.internal.view.p101c.C1978c;

public class AdView extends RelativeLayout implements C1514Ad {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final DisplayMetrics f4625a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1786d f4626b;

    /* renamed from: c */
    private final String f4627c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1660b f4628d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AdListener f4629e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public View f4630f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1978c f4631g;

    /* renamed from: h */
    private String f4632h;

    public AdView(Context context, final String str, AdSize adSize) {
        super(context);
        if (adSize == null || adSize == AdSize.INTERSTITIAL) {
            throw new IllegalArgumentException("adSize");
        }
        this.f4625a = getContext().getResources().getDisplayMetrics();
        this.f4626b = adSize.toInternalAdSize();
        this.f4627c = str;
        C1659a aVar = new C1659a(str, C1788f.m7394a(this.f4626b), AdPlacementType.BANNER, adSize.toInternalAdSize(), 1);
        aVar.mo7368a(this.f4632h);
        this.f4628d = new C1660b(context, aVar);
        this.f4628d.mo7375a((C1577a) new C1577a() {
            /* renamed from: a */
            public void mo6775a() {
                if (AdView.this.f4629e != null) {
                    AdView.this.f4629e.onAdClicked(AdView.this);
                }
            }

            /* renamed from: a */
            public void mo6776a(View view) {
                if (view == null) {
                    throw new IllegalStateException("Cannot present null view");
                }
                AdView.this.f4630f = view;
                AdView.this.removeAllViews();
                AdView.this.addView(AdView.this.f4630f);
                if (AdView.this.f4630f instanceof C1967a) {
                    C1788f.m7395a(AdView.this.f4625a, AdView.this.f4630f, AdView.this.f4626b);
                }
                if (AdView.this.f4629e != null) {
                    AdView.this.f4629e.onAdLoaded(AdView.this);
                }
                if (C1795a.m7442b(AdView.this.getContext())) {
                    AdView.this.f4631g = new C1978c();
                    AdView.this.f4631g.mo8104a(str);
                    AdView.this.f4631g.mo8108b(AdView.this.getContext().getPackageName());
                    if (AdView.this.f4628d.mo7377b() != null) {
                        AdView.this.f4631g.mo8102a(AdView.this.f4628d.mo7377b().mo7605a());
                    }
                    if (AdView.this.f4630f instanceof C1967a) {
                        AdView.this.f4631g.mo8103a(((C1967a) AdView.this.f4630f).getViewabilityChecker());
                    }
                    AdView.this.f4630f.setOnLongClickListener(new OnLongClickListener() {
                        public boolean onLongClick(View view) {
                            AdView.this.f4631g.setBounds(0, 0, AdView.this.f4630f.getWidth(), AdView.this.f4630f.getHeight());
                            AdView.this.f4631g.mo8105a(!AdView.this.f4631g.mo8106a());
                            return true;
                        }
                    });
                    AdView.this.f4630f.getOverlay().add(AdView.this.f4631g);
                }
            }

            /* renamed from: a */
            public void mo6777a(AdAdapter adAdapter) {
                if (AdView.this.f4628d != null) {
                    AdView.this.f4628d.mo7381e();
                }
            }

            /* renamed from: a */
            public void mo6778a(C1782a aVar) {
                if (AdView.this.f4629e != null) {
                    AdView.this.f4629e.onError(AdView.this, AdError.getAdErrorFromWrapper(aVar));
                }
            }

            /* renamed from: b */
            public void mo6779b() {
                if (AdView.this.f4629e != null) {
                    AdView.this.f4629e.onLoggingImpression(AdView.this);
                }
            }
        });
    }

    /* renamed from: a */
    private void m6319a(String str) {
        this.f4628d.mo7378b(str);
    }

    public void destroy() {
        if (this.f4628d != null) {
            this.f4628d.mo7376a(true);
            this.f4628d = null;
        }
        if (this.f4631g != null && C1795a.m7442b(getContext())) {
            this.f4631g.mo8107b();
            this.f4630f.getOverlay().remove(this.f4631g);
        }
        removeAllViews();
        this.f4630f = null;
        this.f4629e = null;
    }

    @Deprecated
    public void disableAutoRefresh() {
    }

    public String getPlacementId() {
        return this.f4627c;
    }

    public boolean isAdInvalidated() {
        return this.f4628d == null || this.f4628d.mo7383g();
    }

    public void loadAd() {
        m6319a((String) null);
    }

    public void loadAdFromBid(String str) {
        m6319a(str);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f4630f != null) {
            C1788f.m7395a(this.f4625a, this.f4630f, this.f4626b);
        }
    }

    public void setAdListener(AdListener adListener) {
        this.f4629e = adListener;
    }

    public void setExtraHints(ExtraHints extraHints) {
        this.f4632h = extraHints.getHints();
    }
}
