package com.facebook.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1577a;
import com.facebook.ads.internal.adapters.C1616d;
import com.facebook.ads.internal.adapters.C1621f;
import com.facebook.ads.internal.adapters.C1648n;
import com.facebook.ads.internal.p074b.C1659a;
import com.facebook.ads.internal.p074b.C1667d;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.protocol.C1787e;
import com.facebook.ads.internal.view.p101c.C1978c;
import com.facebook.ads.p069a.C1557a;
import java.util.EnumSet;

public class InstreamVideoAdView extends RelativeLayout implements C1514Ad {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f4666a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f4667b;

    /* renamed from: c */
    private final AdSize f4668c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1667d f4669d;

    /* renamed from: e */
    private C1621f f4670e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f4671f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public InstreamVideoAdListener f4672g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public View f4673h;

    /* renamed from: i */
    private Bundle f4674i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1978c f4675j;

    public InstreamVideoAdView(Context context, Bundle bundle) {
        this(context, bundle.getString("placementID"), (AdSize) bundle.get("adSize"));
        this.f4674i = bundle;
    }

    public InstreamVideoAdView(Context context, String str, AdSize adSize) {
        super(context);
        this.f4671f = false;
        this.f4666a = context;
        this.f4667b = str;
        this.f4668c = adSize;
        this.f4669d = getController();
    }

    /* renamed from: a */
    private void m6368a(String str) {
        if (this.f4674i != null) {
            this.f4670e = (C1621f) new C1616d().mo7246a(AdPlacementType.INSTREAM);
            this.f4670e.mo7252a(getContext(), (C1557a) new C1557a() {
                /* renamed from: a */
                public void mo6821a(C1648n nVar) {
                    InstreamVideoAdView.this.f4671f = true;
                    if (InstreamVideoAdView.this.f4672g != null) {
                        InstreamVideoAdView.this.f4672g.onAdLoaded(InstreamVideoAdView.this);
                    }
                }

                /* renamed from: a */
                public void mo6822a(C1648n nVar, View view) {
                    if (view == null) {
                        throw new IllegalStateException("Cannot present null view");
                    }
                    InstreamVideoAdView.this.f4673h = view;
                    InstreamVideoAdView.this.removeAllViews();
                    InstreamVideoAdView.this.f4673h.setLayoutParams(new LayoutParams(-1, -1));
                    InstreamVideoAdView.this.addView(InstreamVideoAdView.this.f4673h);
                }

                /* renamed from: a */
                public void mo6823a(C1648n nVar, AdError adError) {
                    if (InstreamVideoAdView.this.f4672g != null) {
                        InstreamVideoAdView.this.f4672g.onError(InstreamVideoAdView.this, adError);
                    }
                }

                /* renamed from: b */
                public void mo6824b(C1648n nVar) {
                    if (InstreamVideoAdView.this.f4672g != null) {
                        InstreamVideoAdView.this.f4672g.onAdClicked(InstreamVideoAdView.this);
                    }
                }

                /* renamed from: c */
                public void mo6825c(C1648n nVar) {
                }

                /* renamed from: d */
                public void mo6826d(C1648n nVar) {
                    if (InstreamVideoAdView.this.f4672g != null) {
                        InstreamVideoAdView.this.f4672g.onAdVideoComplete(InstreamVideoAdView.this);
                    }
                }
            }, this.f4669d.f5222g, this.f4674i.getBundle("adapter"), EnumSet.of(CacheFlag.NONE));
            return;
        }
        this.f4669d.mo7378b(str);
    }

    private C1667d getController() {
        C1659a aVar = new C1659a(this.f4667b, C1787e.INSTREAM_VIDEO, AdPlacementType.INSTREAM, this.f4668c.toInternalAdSize(), 1);
        this.f4669d = new C1667d(getContext(), aVar);
        this.f4669d.mo7375a((C1577a) new C1577a() {
            /* renamed from: a */
            public void mo6775a() {
                if (InstreamVideoAdView.this.f4672g != null) {
                    InstreamVideoAdView.this.f4672g.onAdClicked(InstreamVideoAdView.this);
                }
            }

            /* renamed from: a */
            public void mo6776a(View view) {
                if (view == null) {
                    throw new IllegalStateException("Cannot present null view");
                }
                InstreamVideoAdView.this.f4673h = view;
                InstreamVideoAdView.this.removeAllViews();
                InstreamVideoAdView.this.f4673h.setLayoutParams(new LayoutParams(-1, -1));
                InstreamVideoAdView.this.addView(InstreamVideoAdView.this.f4673h);
                if (C1795a.m7442b(InstreamVideoAdView.this.f4666a)) {
                    InstreamVideoAdView.this.f4675j = new C1978c();
                    InstreamVideoAdView.this.f4675j.mo8104a(InstreamVideoAdView.this.f4667b);
                    InstreamVideoAdView.this.f4675j.mo8108b(InstreamVideoAdView.this.f4666a.getPackageName());
                    if (InstreamVideoAdView.this.f4669d.mo7377b() != null) {
                        InstreamVideoAdView.this.f4675j.mo8102a(InstreamVideoAdView.this.f4669d.mo7377b().mo7605a());
                    }
                    InstreamVideoAdView.this.f4673h.getOverlay().add(InstreamVideoAdView.this.f4675j);
                    InstreamVideoAdView.this.f4673h.setOnLongClickListener(new OnLongClickListener() {
                        public boolean onLongClick(View view) {
                            if (InstreamVideoAdView.this.f4673h == null || InstreamVideoAdView.this.f4675j == null) {
                                return false;
                            }
                            InstreamVideoAdView.this.f4675j.setBounds(0, 0, InstreamVideoAdView.this.f4673h.getWidth(), InstreamVideoAdView.this.f4673h.getHeight());
                            InstreamVideoAdView.this.f4675j.mo8105a(!InstreamVideoAdView.this.f4675j.mo8106a());
                            return true;
                        }
                    });
                }
            }

            /* renamed from: a */
            public void mo6777a(AdAdapter adAdapter) {
                if (InstreamVideoAdView.this.f4669d != null) {
                    InstreamVideoAdView.this.f4671f = true;
                    if (InstreamVideoAdView.this.f4672g != null) {
                        InstreamVideoAdView.this.f4672g.onAdLoaded(InstreamVideoAdView.this);
                    }
                }
            }

            /* renamed from: a */
            public void mo6778a(C1782a aVar) {
                if (InstreamVideoAdView.this.f4672g != null) {
                    InstreamVideoAdView.this.f4672g.onError(InstreamVideoAdView.this, AdError.getAdErrorFromWrapper(aVar));
                }
            }

            /* renamed from: b */
            public void mo6779b() {
                if (InstreamVideoAdView.this.f4672g != null) {
                    InstreamVideoAdView.this.f4672g.onLoggingImpression(InstreamVideoAdView.this);
                }
            }

            /* renamed from: c */
            public void mo6819c() {
                if (InstreamVideoAdView.this.f4672g != null) {
                    InstreamVideoAdView.this.f4672g.onAdVideoComplete(InstreamVideoAdView.this);
                }
            }
        });
        return this.f4669d;
    }

    public void destroy() {
        if (this.f4675j != null && C1795a.m7442b(this.f4666a)) {
            this.f4675j.mo8107b();
            if (this.f4673h != null) {
                this.f4673h.getOverlay().remove(this.f4675j);
            }
        }
        if (this.f4669d != null) {
            this.f4669d.mo7376a(true);
            this.f4669d = null;
            this.f4669d = getController();
            this.f4670e = null;
            this.f4671f = false;
            removeAllViews();
        }
    }

    public String getPlacementId() {
        return this.f4667b;
    }

    public Bundle getSaveInstanceState() {
        C1648n nVar = this.f4670e != null ? this.f4670e : (C1648n) this.f4669d.f5221f;
        if (nVar == null) {
            return null;
        }
        Bundle g = nVar.mo7259g();
        if (g == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("adapter", g);
        bundle.putString("placementID", this.f4667b);
        bundle.putSerializable("adSize", this.f4668c);
        return bundle;
    }

    public boolean isAdInvalidated() {
        return this.f4669d == null || this.f4669d.mo7383g();
    }

    public boolean isAdLoaded() {
        return this.f4671f;
    }

    public void loadAd() {
        m6368a((String) null);
    }

    public void loadAdFromBid(String str) {
        m6368a(str);
    }

    public void setAdListener(InstreamVideoAdListener instreamVideoAdListener) {
        this.f4672g = instreamVideoAdListener;
    }

    public boolean show() {
        if (!this.f4671f || (this.f4669d == null && this.f4670e == null)) {
            if (this.f4672g != null) {
                this.f4672g.onError(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        if (this.f4670e != null) {
            this.f4670e.mo7257e();
        } else {
            this.f4669d.mo7381e();
        }
        this.f4671f = false;
        return true;
    }
}
