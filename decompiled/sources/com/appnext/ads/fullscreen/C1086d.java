package com.appnext.ads.fullscreen;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appnext.C1062R;
import com.appnext.ads.C1066a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C1326f;
import com.appnext.core.C1336k;
import com.appnext.core.p049a.C1305b;
import java.util.ArrayList;

/* renamed from: com.appnext.ads.fullscreen.d */
public final class C1086d extends Fragment {
    /* access modifiers changed from: private */
    public ArrayList<AppnextAd> ads;
    /* access modifiers changed from: private */
    public boolean clicked = false;
    /* access modifiers changed from: private */

    /* renamed from: dN */
    public ImageView f3626dN;

    /* renamed from: dO */
    private TextView f3627dO;
    /* access modifiers changed from: private */

    /* renamed from: dP */
    public C1120h f3628dP;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f3628dP = (C1120h) activity;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f3628dP = (C1120h) context;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(this.f3628dP.getTemplate("S3"), viewGroup, false);
            this.ads = this.f3628dP.getPostRollAds();
            ImageView imageView = (ImageView) relativeLayout.findViewById(C1062R.C1064id.privacy);
            ImageView imageView2 = (ImageView) relativeLayout.findViewById(C1062R.C1064id.close);
            View findViewById = relativeLayout.findViewById(C1062R.C1064id.click);
            this.f3626dN = (ImageView) relativeLayout.findViewById(C1062R.C1064id.media);
            this.f3627dO = (TextView) relativeLayout.findViewById(C1062R.C1064id.install);
            imageView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C1086d.this.f3628dP.privacyClicked();
                }
            });
            if (C1336k.m5716a((AppnextAd) this.ads.get(0), this.f3628dP.getConfigManager())) {
                C1336k.m5715a((Context) this.f3628dP, imageView);
            }
            imageView2.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C1086d.this.f3628dP.closeClicked();
                }
            });
            findViewById.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C1086d.this.f3628dP.installClicked((AppnextAd) C1086d.this.ads.get(0));
                }
            });
            String ctaText = this.f3628dP.getCtaText();
            int parseInt = Integer.parseInt(C1305b.m5595cN().mo6203c(this.f3628dP.getLanguage(), C1305b.f4125lS, "len"));
            if (ctaText.length() > parseInt) {
                ctaText = ctaText.substring(0, parseInt);
            }
            this.f3627dO.setText(ctaText);
            this.f3627dO.setTextSize(2, (float) Integer.parseInt(C1305b.m5595cN().mo6203c(this.f3628dP.getLanguage(), C1305b.f4125lS, "font_size_sp")));
            new Thread(new Runnable() {
                public final void run() {
                    final Bitmap aL = C1326f.m5671aL(((AppnextAd) C1086d.this.ads.get(0)).getWideImageURL());
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C1086d.this.f3626dN.setImageBitmap(aL);
                        }
                    });
                }
            }).start();
            m4989a(relativeLayout, (AppnextAd) this.ads.get(0), true);
            View findViewById2 = relativeLayout.findViewById(C1062R.C1064id.extra);
            if (findViewById2 != null) {
                if (this.ads.size() > 1) {
                    m4989a((RelativeLayout) findViewById2.findViewById(C1062R.C1064id.item1), (AppnextAd) this.ads.get(1), false);
                } else {
                    findViewById2.findViewById(C1062R.C1064id.item1).setVisibility(4);
                }
                if (this.ads.size() > 2) {
                    m4989a((RelativeLayout) findViewById2.findViewById(C1062R.C1064id.item2), (AppnextAd) this.ads.get(2), false);
                } else {
                    findViewById2.findViewById(C1062R.C1064id.item2).setVisibility(4);
                }
                if (findViewById2.findViewById(C1062R.C1064id.item3) != null) {
                    if (this.ads.size() > 3) {
                        m4989a((RelativeLayout) findViewById2.findViewById(C1062R.C1064id.item3), (AppnextAd) this.ads.get(3), false);
                    } else {
                        findViewById2.findViewById(C1062R.C1064id.item3).setVisibility(4);
                    }
                }
            }
            report(C1066a.f3535cU);
            return relativeLayout;
        } catch (Throwable unused) {
            this.f3628dP.closeClicked();
            return null;
        }
    }

    /* renamed from: a */
    private void m4989a(final RelativeLayout relativeLayout, final AppnextAd appnextAd, final boolean z) {
        new Thread(new Runnable() {
            public final void run() {
                final Bitmap aL = C1326f.m5671aL(appnextAd.getImageURL());
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        ((ImageView) relativeLayout.findViewById(C1062R.C1064id.icon)).setImageBitmap(aL);
                    }
                });
            }
        }).start();
        ((TextView) relativeLayout.findViewById(C1062R.C1064id.title)).setText(appnextAd.getAdTitle());
        ((RatingBar) relativeLayout.findViewById(C1062R.C1064id.rating)).setRating(Float.parseFloat(appnextAd.getStoreRating()));
        relativeLayout.findViewById(C1062R.C1064id.click).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
                if (z) {
                    C1086d.this.report(C1066a.f3537cW);
                } else {
                    C1086d.this.report(C1066a.f3538cX);
                    StringBuilder sb = new StringBuilder();
                    sb.append(fullscreenAd.getAppURL());
                    sb.append("&tem_id=");
                    sb.append(C1086d.this.f3628dP.isRewarded() ? "8" : "7");
                    sb.append("05");
                    fullscreenAd.setAppURL(sb.toString());
                }
                C1086d.this.f3628dP.installClicked(fullscreenAd);
                C1086d.this.clicked = true;
            }
        });
    }

    public final void onDestroyView() {
        report(C1066a.f3536cV);
        super.onDestroyView();
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        this.f3628dP.report(str, "S3");
    }
}
