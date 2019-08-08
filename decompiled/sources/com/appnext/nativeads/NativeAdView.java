package com.appnext.nativeads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.appnext.core.AppnextAd;
import com.appnext.core.C1326f;
import com.appnext.core.C1336k;
import com.appnext.core.C1345p;

public class NativeAdView extends FrameLayout {
    private C1411a adViewActions;

    /* renamed from: mP */
    private PrivacyIcon f4348mP;

    /* renamed from: mQ */
    private OnScrollChangedListener f4349mQ = new OnScrollChangedListener() {
        public final void onScrollChanged() {
            NativeAdView.this.m5862l(NativeAdView.this.getVisiblePercent(NativeAdView.this));
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: mu */
    public NativeAd f4350mu;
    /* access modifiers changed from: private */

    /* renamed from: mw */
    public NativeAdData f4351mw;

    /* renamed from: com.appnext.nativeads.NativeAdView$a */
    interface C1411a {
        /* renamed from: k */
        void mo6401k(int i);
    }

    public NativeAdView(Context context) {
        super(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    private void init() {
        int i;
        int i2;
        if (this.f4350mu != null && this.f4351mw != null) {
            int i3 = 0;
            setVisibility(0);
            if (this.f4348mP != null) {
                super.removeView(this.f4348mP);
            }
            this.f4348mP = new PrivacyIcon(getContext());
            int i4 = 3;
            int a = C1326f.m5657a(getContext(), 25.0f);
            switch (this.f4350mu.getPrivacyPolicyPosition()) {
                case 0:
                    i4 = 51;
                    i2 = a;
                    i = i2;
                    a = 0;
                    break;
                case 1:
                    i4 = 53;
                    i2 = 0;
                    i = a;
                    break;
                case 2:
                    i4 = 83;
                    i = 0;
                    i2 = a;
                    i3 = i2;
                    a = 0;
                    break;
                case 3:
                    i4 = 85;
                    i2 = 0;
                    i = 0;
                    i3 = a;
                    break;
                default:
                    i3 = a;
                    i2 = i3;
                    i = i2;
                    break;
            }
            addView(this.f4348mP, new LayoutParams(-2, -2, i4));
            this.f4348mP.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    if (NativeAdView.this.f4350mu != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C1326f.m5691f(NativeAdView.this.f4351mw)));
                            intent.setFlags(268435456);
                            NativeAdView.this.getContext().startActivity(intent);
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
            if (C1336k.m5716a((AppnextAd) this.f4351mw, (C1345p) C1416b.m5865cT())) {
                C1336k.m5715a(getContext(), (ImageView) this.f4348mP);
            } else if (this.f4350mu.getPrivacyPolicyColor() == 0) {
                this.f4348mP.setImageResource(C1412R.C1413drawable.apnxt_na_i_icon_light);
            } else {
                this.f4348mP.setImageResource(C1412R.C1413drawable.apnxt_na_i_icon_dark);
            }
            this.f4348mP.getLayoutParams().width = C1326f.m5657a(getContext(), 40.0f);
            this.f4348mP.getLayoutParams().height = C1326f.m5657a(getContext(), 40.0f);
            this.f4348mP.setPadding(a, i3, i2, i);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f4348mP);
    }

    public void removeView(View view) {
        if (view != this.f4348mP) {
            super.removeView(view);
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f4348mP);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f4348mP != view) {
            super.bringChildToFront(this.f4348mP);
        }
    }

    public void setVisibility(int i) {
        if (this.f4350mu != null && this.f4351mw != null) {
            super.setVisibility(i);
            m5862l(getVisiblePercent(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        try {
            this.f4350mu.onWindowVisibilityChanged(i);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bringToFront();
        getViewTreeObserver().addOnScrollChangedListener(this.f4349mQ);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            getViewTreeObserver().removeOnScrollChangedListener(this.f4349mQ);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6436a(NativeAd nativeAd, NativeAdData nativeAdData, C1411a aVar) {
        int i;
        int i2;
        this.f4350mu = nativeAd;
        this.f4351mw = nativeAdData;
        this.adViewActions = aVar;
        if (this.f4350mu != null && this.f4351mw != null) {
            int i3 = 0;
            setVisibility(0);
            if (this.f4348mP != null) {
                super.removeView(this.f4348mP);
            }
            this.f4348mP = new PrivacyIcon(getContext());
            int i4 = 3;
            int a = C1326f.m5657a(getContext(), 25.0f);
            switch (this.f4350mu.getPrivacyPolicyPosition()) {
                case 0:
                    i4 = 51;
                    i2 = a;
                    i = i2;
                    a = 0;
                    break;
                case 1:
                    i4 = 53;
                    i2 = 0;
                    i = a;
                    break;
                case 2:
                    i4 = 83;
                    i = 0;
                    i2 = a;
                    i3 = i2;
                    a = 0;
                    break;
                case 3:
                    i4 = 85;
                    i2 = 0;
                    i = 0;
                    i3 = a;
                    break;
                default:
                    i3 = a;
                    i2 = i3;
                    i = i2;
                    break;
            }
            addView(this.f4348mP, new LayoutParams(-2, -2, i4));
            this.f4348mP.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    if (NativeAdView.this.f4350mu != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C1326f.m5691f(NativeAdView.this.f4351mw)));
                            intent.setFlags(268435456);
                            NativeAdView.this.getContext().startActivity(intent);
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
            if (C1336k.m5716a((AppnextAd) this.f4351mw, (C1345p) C1416b.m5865cT())) {
                C1336k.m5715a(getContext(), (ImageView) this.f4348mP);
            } else if (this.f4350mu.getPrivacyPolicyColor() == 0) {
                this.f4348mP.setImageResource(C1412R.C1413drawable.apnxt_na_i_icon_light);
            } else {
                this.f4348mP.setImageResource(C1412R.C1413drawable.apnxt_na_i_icon_dark);
            }
            this.f4348mP.getLayoutParams().width = C1326f.m5657a(getContext(), 40.0f);
            this.f4348mP.getLayoutParams().height = C1326f.m5657a(getContext(), 40.0f);
            this.f4348mP.setPadding(a, i3, i2, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void reset() {
        super.removeView(this.f4348mP);
        this.f4350mu = null;
        this.f4351mw = null;
        this.adViewActions = null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4350mu != null && this.f4351mw != null && this.adViewActions != null) {
            m5862l(getVisiblePercent(this));
        }
    }

    private boolean isViewPartiallyVisible(View view) {
        try {
            if (getParent() == null) {
                return false;
            }
            if (VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
                return false;
            }
            Rect rect = new Rect();
            ((ViewGroup) getParent()).getHitRect(rect);
            return view.getGlobalVisibleRect(rect);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final int getVisiblePercent(View view) {
        if (!isViewPartiallyVisible(this) || view == null) {
            return 0;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return (int) ((100.0d * ((double) (rect.width() * rect.height()))) / ((double) (view.getWidth() * view.getHeight())));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m5862l(int i) {
        if (getWindowVisibility() != 8 && getWindowVisibility() != 4 && this.f4350mu != null) {
            if (this.adViewActions != null) {
                this.adViewActions.mo6401k(i);
            }
            if (this.f4350mu.getMediaView() != null) {
                this.f4350mu.getMediaView().mo6344k(getVisiblePercent(this.f4350mu.getMediaView()));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f4350mu != null && this.f4351mw != null && this.adViewActions != null) {
            m5862l(getVisiblePercent(this));
        }
    }
}
