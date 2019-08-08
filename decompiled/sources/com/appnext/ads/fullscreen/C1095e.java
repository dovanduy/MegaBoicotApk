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
import com.appnext.base.p046b.C1245d;
import com.appnext.core.AppnextAd;
import com.appnext.core.C1326f;
import com.appnext.core.C1336k;
import java.util.ArrayList;

/* renamed from: com.appnext.ads.fullscreen.e */
public final class C1095e extends Fragment {
    /* access modifiers changed from: private */

    /* renamed from: dX */
    public C1121i f3643dX;
    /* access modifiers changed from: private */

    /* renamed from: dY */
    public TextView f3644dY;
    /* access modifiers changed from: private */

    /* renamed from: dZ */
    public int f3645dZ = 0;
    /* access modifiers changed from: private */

    /* renamed from: ea */
    public ArrayList<AppnextAd> f3646ea;
    /* access modifiers changed from: private */
    public Handler handler;
    Runnable tick = new Runnable() {
        public final void run() {
            C1095e.this.handler.removeCallbacks(this);
            if (C1095e.m4998c(C1095e.this) == 0) {
                C1095e.this.f3643dX.videoSelected((AppnextAd) C1095e.this.f3646ea.get(0));
                C1095e.this.report(C1066a.f3522cH);
                return;
            }
            if (C1095e.this.f3644dY != null) {
                TextView e = C1095e.this.f3644dY;
                StringBuilder sb = new StringBuilder();
                sb.append(C1095e.this.f3645dZ);
                sb.append(" sec");
                e.setText(sb.toString());
            }
            C1095e.this.handler.postDelayed(C1095e.this.tick, 1000);
        }
    };

    /* renamed from: c */
    static /* synthetic */ int m4998c(C1095e eVar) {
        int i = eVar.f3645dZ - 1;
        eVar.f3645dZ = i;
        return i;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null && getArguments().containsKey(C1245d.f3955iX)) {
            this.f3645dZ = getArguments().getInt(C1245d.f3955iX);
        }
        if (bundle != null) {
            this.f3645dZ = bundle.getInt(C1245d.f3955iX);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f3643dX = (C1121i) activity;
        this.handler = new Handler();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f3643dX = (C1121i) context;
        this.handler = new Handler();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(this.f3643dX.getTemplate("S1"), viewGroup, false);
            View findViewById = relativeLayout.findViewById(C1062R.C1064id.item1);
            View findViewById2 = relativeLayout.findViewById(C1062R.C1064id.item2);
            ((TextView) relativeLayout.findViewById(C1062R.C1064id.title)).setText(this.f3643dX.getConfigManager().get("pre_title_string1"));
            ((TextView) relativeLayout.findViewById(C1062R.C1064id.secondTile)).setText(this.f3643dX.getConfigManager().get("pre_title_string2"));
            this.f3644dY = (TextView) relativeLayout.findViewById(C1062R.C1064id.timer);
            this.f3646ea = this.f3643dX.getPreRollAds();
            if (this.f3646ea.size() < 2) {
                this.f3643dX.videoSelected((AppnextAd) this.f3646ea.get(0));
                return null;
            }
            m4995a((ViewGroup) findViewById, (AppnextAd) this.f3646ea.get(0), 0);
            m4995a((ViewGroup) findViewById2, (AppnextAd) this.f3646ea.get(1), 1);
            relativeLayout.findViewById(C1062R.C1064id.privacy).setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C1095e.this.f3643dX.privacyClicked();
                }
            });
            if (C1336k.m5716a((AppnextAd) this.f3646ea.get(0), this.f3643dX.getConfigManager())) {
                C1336k.m5715a((Context) this.f3643dX, (ImageView) relativeLayout.findViewById(C1062R.C1064id.privacy));
            }
            TextView textView = this.f3644dY;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3645dZ);
            sb.append(" sec");
            textView.setText(sb.toString());
            report(C1066a.f3519cE);
            return relativeLayout;
        } catch (Throwable unused) {
            this.f3643dX.closeClicked();
            return null;
        }
    }

    /* renamed from: a */
    private void m4995a(ViewGroup viewGroup, final AppnextAd appnextAd, final int i) {
        TextView textView = (TextView) viewGroup.findViewById(C1062R.C1064id.title);
        final ImageView imageView = (ImageView) viewGroup.findViewById(C1062R.C1064id.icon);
        final ImageView imageView2 = (ImageView) viewGroup.findViewById(C1062R.C1064id.background_image);
        RatingBar ratingBar = (RatingBar) viewGroup.findViewById(C1062R.C1064id.ratingBar);
        if (viewGroup.findViewById(C1062R.C1064id.playGameTextView) != null) {
            ((TextView) viewGroup.findViewById(C1062R.C1064id.playGameTextView)).setText(this.f3643dX.getConfigManager().get("pre_cta_string"));
        }
        textView.setText(appnextAd.getAdTitle());
        ratingBar.setRating(Float.parseFloat(appnextAd.getStoreRating()));
        viewGroup.findViewById(C1062R.C1064id.click).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C1095e.this.f3643dX.videoSelected(appnextAd);
                if (i == 0) {
                    C1095e.this.report(C1066a.f3520cF);
                    return;
                }
                if (i == 1) {
                    C1095e.this.report(C1066a.f3521cG);
                }
            }
        });
        if (imageView2 != null) {
            new Thread(new Runnable() {
                public final void run() {
                    final Bitmap aL = C1326f.m5671aL(appnextAd.getWideImageURL());
                    final Bitmap aL2 = C1326f.m5671aL(appnextAd.getImageURL());
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            imageView2.setImageBitmap(aL);
                            imageView.setImageBitmap(aL2);
                        }
                    });
                }
            }).start();
        }
        new Thread(new Runnable() {
            public final void run() {
                final Bitmap aL = imageView2 != null ? C1326f.m5671aL(appnextAd.getWideImageURL()) : null;
                final Bitmap aL2 = C1326f.m5671aL(appnextAd.getImageURL());
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        if (imageView2 != null) {
                            imageView2.setImageBitmap(aL);
                        }
                        imageView.setImageBitmap(aL2);
                    }
                });
            }
        }).start();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(C1245d.f3955iX, this.f3645dZ);
        super.onSaveInstanceState(bundle);
    }

    public final void onPause() {
        super.onPause();
        this.handler.removeCallbacks(this.tick);
    }

    public final void onResume() {
        super.onResume();
        this.handler.postDelayed(this.tick, 1000);
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        this.f3643dX.report(str, "S1");
    }
}
