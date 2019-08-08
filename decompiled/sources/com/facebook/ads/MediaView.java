package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p028v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p071a.C1578a;
import com.facebook.ads.internal.adapters.p071a.C1578a.C1581a;
import com.facebook.ads.internal.adapters.p071a.C1582b;
import com.facebook.ads.internal.adapters.p071a.C1583c;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p092s.C1803d;
import com.facebook.ads.internal.p093t.C1833f;
import com.facebook.ads.internal.p093t.C1834g;
import com.facebook.ads.internal.p115w.p117b.C2322j;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.view.C2243j;
import com.facebook.ads.internal.view.C2271q;
import com.facebook.ads.internal.view.p101c.C1977b;
import com.facebook.ads.internal.view.p101c.C1980d;
import com.facebook.ads.internal.view.p101c.C1981e;
import java.util.Iterator;

public class MediaView extends C1833f {

    /* renamed from: a */
    private static final String f4681a = "MediaView";

    /* renamed from: b */
    private C2243j f4682b;

    /* renamed from: c */
    private ImageView f4683c;

    /* renamed from: d */
    private C1977b f4684d;

    /* renamed from: e */
    private RecyclerView f4685e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public MediaViewVideoRenderer f4686f;

    /* renamed from: g */
    private View f4687g;

    /* renamed from: h */
    private MediaViewListener f4688h;

    /* renamed from: i */
    private boolean f4689i;

    /* renamed from: j */
    private boolean f4690j;

    /* renamed from: k */
    private boolean f4691k;

    public MediaView(Context context) {
        super(context);
        setIconView(new ImageView(context));
        setImageRenderer(new C1977b(context));
        this.f4682b = new C2243j(context);
        m6390b();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(context));
        m6389a();
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setIconView(new ImageView(context, attributeSet));
        setImageRenderer(new C1977b(context, attributeSet));
        this.f4682b = new C2243j(context, attributeSet);
        m6390b();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(context, attributeSet));
        m6389a();
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setIconView(new ImageView(context, attributeSet, i));
        setImageRenderer(new C1977b(context, attributeSet, i));
        this.f4682b = new C2243j(context, attributeSet, i);
        m6390b();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(context, attributeSet, i));
        m6389a();
    }

    @TargetApi(21)
    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setIconView(new ImageView(context, attributeSet, i, i2));
        setImageRenderer(new C1977b(context, attributeSet, i, i2));
        this.f4682b = new C2243j(context, attributeSet, i);
        m6390b();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(context, attributeSet, i, i2));
        m6389a();
    }

    /* renamed from: a */
    private void m6389a() {
        C2322j.m9044a(this, C2322j.INTERNAL_AD_MEDIA);
        C2322j.m9044a(this.f4684d, C2322j.INTERNAL_AD_MEDIA);
        C2322j.m9044a(this.f4686f, C2322j.INTERNAL_AD_MEDIA);
        C2322j.m9044a(this.f4685e, C2322j.INTERNAL_AD_MEDIA);
        this.f4690j = true;
    }

    /* renamed from: b */
    private void m6390b() {
        if (this.f4689i) {
            throw new IllegalStateException("Carousel renderer must be set before nativeAd.");
        }
        if (this.f4685e != null) {
            C2342x.m9091b(this.f4682b);
        }
        float f = C2342x.f7369b;
        int round = Math.round(4.0f * f);
        int round2 = Math.round(f * 12.0f);
        this.f4682b.setChildSpacing(round);
        this.f4682b.setPadding(0, round2, 0, round2);
        this.f4682b.setVisibility(8);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView((View) this.f4682b, (ViewGroup.LayoutParams) layoutParams);
    }

    private void setIconView(ImageView imageView) {
        if (this.f4689i) {
            throw new IllegalStateException("Image renderer must be set before nativeBannerAd.");
        }
        if (this.f4683c != null) {
            C2342x.m9091b(this.f4683c);
        }
        imageView.setVisibility(8);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView((View) imageView, (ViewGroup.LayoutParams) layoutParams);
        this.f4683c = imageView;
    }

    private void setImageRenderer(C1977b bVar) {
        if (this.f4689i) {
            throw new IllegalStateException("Image renderer must be set before nativeAd.");
        }
        if (this.f4684d != null) {
            removeView(this.f4684d);
        }
        bVar.setVisibility(8);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView((View) bVar, (ViewGroup.LayoutParams) layoutParams);
        this.f4684d = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6835a(View view, ViewGroup.LayoutParams layoutParams) {
        this.f4690j = false;
        addView(view, layoutParams);
        this.f4690j = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6836a(final NativeAdBase nativeAdBase, boolean z) {
        this.f4689i = true;
        nativeAdBase.mo6925b(this);
        this.f4684d.setVisibility(8);
        this.f4684d.mo8098a(null, null);
        this.f4686f.setVisibility(8);
        this.f4686f.mo6800a();
        if (this.f4685e != null) {
            this.f4685e.setVisibility(8);
            this.f4685e.setAdapter(null);
        }
        this.f4683c.setVisibility(0);
        bringChildToFront(this.f4683c);
        this.f4687g = this.f4683c;
        C1980d a = new C1980d(this.f4683c).mo8114a();
        if (z) {
            a.mo8116a((C1981e) new C1981e() {
                /* renamed from: a */
                public void mo6849a(boolean z) {
                    nativeAdBase.mo6927f().mo7744a(z, true);
                }
            });
        }
        C1834g i = nativeAdBase.mo6927f().mo7756i();
        if (i != null) {
            a.mo8118a(i.mo7780a());
            return;
        }
        if (z) {
            nativeAdBase.mo6927f().mo7744a(false, true);
        }
        int i2 = C2373b.f7506h;
        StringBuilder sb = new StringBuilder();
        sb.append("Native Ad Icon is null. Loaded: ");
        sb.append(nativeAdBase.mo6927f().mo7753f());
        C2370a.m9149b(getContext(), "api", i2, new Exception(sb.toString()));
    }

    public void addView(View view) {
        if (!this.f4690j) {
            super.addView(view);
        }
    }

    public void addView(View view, int i) {
        if (!this.f4690j) {
            super.addView(view, i);
        }
    }

    public void addView(View view, int i, int i2) {
        if (!this.f4690j) {
            super.addView(view, i, i2);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!this.f4690j) {
            super.addView(view, i, layoutParams);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (!this.f4690j) {
            super.addView(view, layoutParams);
        }
    }

    public void bringChildToFront(View view) {
        if (view == this.f4685e || view == this.f4686f || view == this.f4684d || view == this.f4683c) {
            super.bringChildToFront(view);
        }
    }

    public void destroy() {
        this.f4686f.pause(false);
        this.f4686f.destroy();
    }

    /* access modifiers changed from: protected */
    public View getAdContentsView() {
        return this.f4687g;
    }

    /* access modifiers changed from: protected */
    public C1802c getAdEventManager() {
        return C1803d.m7531a(getContext());
    }

    public void setListener(final MediaViewListener mediaViewListener) {
        this.f4688h = mediaViewListener;
        if (mediaViewListener == null) {
            this.f4686f.setListener(null);
        } else {
            this.f4686f.setListener(new C2271q() {
                /* renamed from: a */
                public void mo6851a() {
                    mediaViewListener.onVolumeChange(MediaView.this, MediaView.this.f4686f.getVolume());
                }

                /* renamed from: b */
                public void mo6852b() {
                    mediaViewListener.onPause(MediaView.this);
                }

                /* renamed from: c */
                public void mo6853c() {
                    mediaViewListener.onPlay(MediaView.this);
                }

                /* renamed from: d */
                public void mo6854d() {
                    mediaViewListener.onFullscreenBackground(MediaView.this);
                }

                /* renamed from: e */
                public void mo6855e() {
                    mediaViewListener.onFullscreenForeground(MediaView.this);
                }

                /* renamed from: f */
                public void mo6856f() {
                    mediaViewListener.onExitFullscreen(MediaView.this);
                }

                /* renamed from: g */
                public void mo6857g() {
                    mediaViewListener.onEnterFullscreen(MediaView.this);
                }

                /* renamed from: h */
                public void mo6858h() {
                    mediaViewListener.onComplete(MediaView.this);
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    public void setNativeAd(final NativeAd nativeAd) {
        boolean z;
        boolean z2 = true;
        this.f4689i = true;
        nativeAd.mo6922a(this);
        this.f4683c.setVisibility(8);
        this.f4683c.setImageDrawable(null);
        if (nativeAd.mo6913d() != null) {
            Iterator it = nativeAd.mo6913d().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((NativeAd) it.next()).getAdCoverImage() == null) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            boolean q = C1795a.m7458q(getContext());
            this.f4685e = this.f4682b;
            ((C2243j) this.f4685e).setCurrentPosition(0);
            C1578a bVar = q ? new C1582b((C2243j) this.f4685e, nativeAd.mo6927f().mo7768u()) : new C1583c((C2243j) this.f4685e, nativeAd.mo6927f().mo7768u());
            bVar.mo7106a((C1581a) new C1581a() {
                /* renamed from: a */
                public void mo6850a() {
                    nativeAd.mo6927f().mo7744a(true, true);
                }
            });
            this.f4685e.setAdapter(bVar);
            this.f4687g = this.f4685e;
            this.f4684d.setVisibility(8);
            this.f4684d.mo8098a(null, null);
            this.f4686f.setVisibility(8);
            this.f4686f.mo6800a();
            bringChildToFront(this.f4685e);
            this.f4685e.setVisibility(0);
            return;
        }
        if (VERSION.SDK_INT < 14 || TextUtils.isEmpty(nativeAd.mo6909a())) {
            z2 = false;
        }
        if (z2) {
            nativeAd.mo6927f().mo7746b(this.f4691k);
            this.f4687g = this.f4686f.getVideoView();
            this.f4684d.setVisibility(8);
            this.f4684d.mo8098a(null, null);
            if (this.f4685e != null) {
                this.f4685e.setVisibility(8);
                this.f4685e.setAdapter(null);
            }
            bringChildToFront(this.f4686f);
            this.f4686f.setNativeAd(nativeAd);
            this.f4686f.setVisibility(0);
            return;
        }
        if (nativeAd.getAdCoverImage() != null) {
            this.f4687g = this.f4684d.getBodyImageView();
            this.f4686f.setVisibility(8);
            this.f4686f.mo6800a();
            if (this.f4685e != null) {
                this.f4685e.setVisibility(8);
                this.f4685e.setAdapter(null);
            }
            bringChildToFront(this.f4684d);
            this.f4684d.setVisibility(0);
            new C1980d(this.f4684d).mo8115a(getHeight(), getWidth()).mo8117a(C1795a.m7454m(getContext())).mo8116a((C1981e) new C1981e() {
                /* renamed from: a */
                public void mo6849a(boolean z) {
                    nativeAd.mo6927f().mo7744a(z, true);
                }
            }).mo8118a(nativeAd.mo6927f().mo7757j().mo7780a());
        }
    }

    public void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (this.f4689i) {
            throw new IllegalStateException("Video renderer must be set before nativeAd.");
        }
        if (this.f4686f != null) {
            removeView(this.f4686f);
            this.f4686f.destroy();
        }
        mediaViewVideoRenderer.setAdEventManager(getAdEventManager());
        mediaViewVideoRenderer.setVisibility(8);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.addRule(13);
        mo6835a((View) mediaViewVideoRenderer, (ViewGroup.LayoutParams) layoutParams);
        this.f4686f = mediaViewVideoRenderer;
        this.f4691k = !(this.f4686f instanceof DefaultMediaViewVideoRenderer);
    }
}
