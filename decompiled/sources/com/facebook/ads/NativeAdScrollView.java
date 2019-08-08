package com.facebook.ads;

import android.content.Context;
import android.support.p017v4.view.C0593p;
import android.support.p017v4.view.ViewPager;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.ads.NativeAdView.Type;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import java.util.ArrayList;
import java.util.List;

public class NativeAdScrollView extends LinearLayout {
    public static final int DEFAULT_INSET = 20;
    public static final int DEFAULT_MAX_ADS = 10;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f4738a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final NativeAdsManager f4739b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AdViewProvider f4740c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Type f4741d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f4742e;

    /* renamed from: f */
    private final C1550b f4743f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final NativeAdViewAttributes f4744g;

    public interface AdViewProvider {
        View createView(NativeAd nativeAd, int i);

        void destroyView(NativeAd nativeAd, View view);
    }

    /* renamed from: com.facebook.ads.NativeAdScrollView$a */
    private class C1549a extends C0593p {

        /* renamed from: b */
        private List<NativeAd> f4746b = new ArrayList();

        public C1549a() {
        }

        /* renamed from: a */
        public void mo6980a() {
            this.f4746b.clear();
            int min = Math.min(NativeAdScrollView.this.f4742e, NativeAdScrollView.this.f4739b.getUniqueNativeAdCount());
            for (int i = 0; i < min; i++) {
                NativeAd nextNativeAd = NativeAdScrollView.this.f4739b.nextNativeAd();
                nextNativeAd.mo6924a(true);
                this.f4746b.add(nextNativeAd);
            }
            notifyDataSetChanged();
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (i < this.f4746b.size()) {
                if (NativeAdScrollView.this.f4741d != null) {
                    ((NativeAd) this.f4746b.get(i)).unregisterView();
                } else {
                    NativeAdScrollView.this.f4740c.destroyView((NativeAd) this.f4746b.get(i), (View) obj);
                }
            }
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return this.f4746b.size();
        }

        public int getItemPosition(Object obj) {
            int indexOf = this.f4746b.indexOf(obj);
            if (indexOf >= 0) {
                return indexOf;
            }
            return -2;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View render = NativeAdScrollView.this.f4741d != null ? NativeAdView.render(NativeAdScrollView.this.f4738a, (NativeAd) this.f4746b.get(i), NativeAdScrollView.this.f4741d, NativeAdScrollView.this.f4744g) : NativeAdScrollView.this.f4740c.createView((NativeAd) this.f4746b.get(i), i);
            viewGroup.addView(render);
            return render;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* renamed from: com.facebook.ads.NativeAdScrollView$b */
    private class C1550b extends ViewPager {
        public C1550b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider) {
        this(context, nativeAdsManager, adViewProvider, null, null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i) {
        this(context, nativeAdsManager, adViewProvider, null, null, i);
    }

    private NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, Type type, NativeAdViewAttributes nativeAdViewAttributes, int i) {
        super(context);
        if (!nativeAdsManager.isLoaded()) {
            throw new IllegalStateException("NativeAdsManager not loaded");
        } else if (type == null && adViewProvider == null) {
            throw new IllegalArgumentException("Must provide a NativeAdView.Type or AdViewProvider");
        } else {
            this.f4738a = context;
            this.f4739b = nativeAdsManager;
            this.f4744g = nativeAdViewAttributes;
            this.f4740c = adViewProvider;
            this.f4741d = type;
            this.f4742e = i;
            C1549a aVar = new C1549a();
            this.f4743f = new C1550b(context);
            this.f4743f.setAdapter(aVar);
            setInset(20);
            aVar.mo6980a();
            addView(this.f4743f);
        }
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, Type type) {
        this(context, nativeAdsManager, null, type, new NativeAdViewAttributes(), 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, type, nativeAdViewAttributes, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, Type type, NativeAdViewAttributes nativeAdViewAttributes, int i) {
        this(context, nativeAdsManager, null, type, nativeAdViewAttributes, i);
    }

    public void setInset(int i) {
        if (i > 0) {
            float f = C2342x.f7369b;
            int round = Math.round(((float) i) * f);
            this.f4743f.setPadding(round, 0, round, 0);
            this.f4743f.setPageMargin(Math.round(((float) (i / 2)) * f));
            this.f4743f.setClipToPadding(false);
        }
    }
}
