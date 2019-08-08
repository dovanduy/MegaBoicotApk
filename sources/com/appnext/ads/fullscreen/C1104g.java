package com.appnext.ads.fullscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import com.appnext.C1062R;
import com.appnext.ads.C1066a;

/* renamed from: com.appnext.ads.fullscreen.g */
public final class C1104g extends Fragment {
    private final int TICK = 330;
    /* access modifiers changed from: private */
    public int currentPosition = 0;
    /* access modifiers changed from: private */

    /* renamed from: du */
    public Circle f3669du;
    /* access modifiers changed from: private */

    /* renamed from: ep */
    public ImageView f3670ep;
    /* access modifiers changed from: private */

    /* renamed from: eq */
    public Button f3671eq;
    /* access modifiers changed from: private */

    /* renamed from: er */
    public TextView f3672er;
    /* access modifiers changed from: private */

    /* renamed from: es */
    public ImageView f3673es;
    /* access modifiers changed from: private */

    /* renamed from: et */
    public Animation f3674et;
    /* access modifiers changed from: private */

    /* renamed from: eu */
    public ImageView f3675eu;
    /* access modifiers changed from: private */

    /* renamed from: ev */
    public boolean f3676ev = false;
    /* access modifiers changed from: private */

    /* renamed from: ew */
    public C1122j f3677ew;

    /* renamed from: ex */
    Runnable f3678ex = new Runnable() {
        public final void run() {
            C1104g.this.f3672er.setAlpha(1.0f);
            C1104g.this.f3672er.animate().alpha(0.0f).setDuration(1000);
        }
    };
    /* access modifiers changed from: private */
    public boolean finished = false;
    private int lastProgress = 0;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    /* access modifiers changed from: private */
    public MediaPlayer mediaPlayer;
    /* access modifiers changed from: private */
    public boolean started = false;
    @SuppressLint({"SetTextI18n"})
    Runnable tick = new Runnable() {
        public final void run() {
            if (C1104g.this.videoView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C1104g.this.videoView.getCurrentPosition());
                sb.append(" of ");
                sb.append(C1104g.this.videoView.getDuration());
                if (C1104g.this.videoView.getDuration() == -1) {
                    C1104g.m5023l(C1104g.this);
                    return;
                }
                C1104g.m5025n(C1104g.this);
                if (C1104g.this.f3669du.getVisibility() == 0) {
                    C1082a aVar = new C1082a(C1104g.this.f3669du, 360.0f - ((((float) (C1104g.this.videoView.getCurrentPosition() + 1)) / ((float) C1104g.this.videoView.getDuration())) * 360.0f));
                    aVar.setDuration(330);
                    C1104g.this.f3669du.startAnimation(aVar);
                }
                if (C1104g.this.videoView.getCurrentPosition() < C1104g.this.videoView.getDuration() && !C1104g.this.finished) {
                    C1104g.this.mHandler.postDelayed(C1104g.this.tick, 330);
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public VideoView videoView;

    /* renamed from: com.appnext.ads.fullscreen.g$a */
    private class C1119a extends Animation {

        /* renamed from: eC */
        final int f3694eC;

        /* renamed from: eD */
        int f3695eD;
        View view;

        public final boolean willChangeBounds() {
            return true;
        }

        C1119a(View view2, int i, int i2) {
            this.view = view2;
            this.f3694eC = i;
            this.f3695eD = i2;
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f, Transformation transformation) {
            this.view.getLayoutParams().width = (int) (((float) this.f3695eD) + (((float) (this.f3694eC - this.f3695eD)) * f));
            this.view.requestLayout();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f3677ew = (C1122j) activity;
        m5011aj();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f3677ew = (C1122j) context;
        m5011aj();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|(1:3)(1:4)|5|(1:7)|8|(1:10)|11|(1:17)|18|(1:20)|21|22|23|24|25|26|27|29|30|31) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0151 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, final android.os.Bundle r9) {
        /*
            r6 = this;
            com.appnext.ads.fullscreen.j r0 = r6.f3677ew     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r1 = "S2"
            int r0 = r0.getTemplate(r1)     // Catch:{ Throwable -> 0x01a4 }
            r1 = 0
            android.view.View r7 = r7.inflate(r0, r8, r1)     // Catch:{ Throwable -> 0x01a4 }
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7     // Catch:{ Throwable -> 0x01a4 }
            int r8 = com.appnext.C1062R.C1064id.privacy     // Catch:{ Throwable -> 0x01a4 }
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ Throwable -> 0x01a4 }
            android.widget.ImageView r8 = (android.widget.ImageView) r8     // Catch:{ Throwable -> 0x01a4 }
            int r0 = com.appnext.C1062R.C1064id.close     // Catch:{ Throwable -> 0x01a4 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Throwable -> 0x01a4 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Throwable -> 0x01a4 }
            r6.f3675eu = r0     // Catch:{ Throwable -> 0x01a4 }
            int r0 = com.appnext.C1062R.C1064id.v_view     // Catch:{ Throwable -> 0x01a4 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Throwable -> 0x01a4 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Throwable -> 0x01a4 }
            r6.f3670ep = r0     // Catch:{ Throwable -> 0x01a4 }
            int r0 = com.appnext.C1062R.C1064id.install     // Catch:{ Throwable -> 0x01a4 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Throwable -> 0x01a4 }
            android.widget.Button r0 = (android.widget.Button) r0     // Catch:{ Throwable -> 0x01a4 }
            r6.f3671eq = r0     // Catch:{ Throwable -> 0x01a4 }
            int r0 = com.appnext.C1062R.C1064id.circle     // Catch:{ Throwable -> 0x01a4 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.Circle r0 = (com.appnext.ads.fullscreen.Circle) r0     // Catch:{ Throwable -> 0x01a4 }
            r6.f3669du = r0     // Catch:{ Throwable -> 0x01a4 }
            int r0 = com.appnext.C1062R.C1064id.click_txt     // Catch:{ Throwable -> 0x01a4 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Throwable -> 0x01a4 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Throwable -> 0x01a4 }
            r6.f3672er = r0     // Catch:{ Throwable -> 0x01a4 }
            android.widget.TextView r0 = r6.f3672er     // Catch:{ Throwable -> 0x01a4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r3 = "You will be redirected to "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.j r3 = r6.f3677ew     // Catch:{ Throwable -> 0x01a4 }
            boolean r3 = r3.isInstalled()     // Catch:{ Throwable -> 0x01a4 }
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = "app"
            goto L_0x005f
        L_0x005d:
            java.lang.String r3 = "Google Play"
        L_0x005f:
            r2.append(r3)     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r3 = " once the ad will finish"
            r2.append(r3)     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x01a4 }
            r0.setText(r2)     // Catch:{ Throwable -> 0x01a4 }
            int r0 = com.appnext.C1062R.C1064id.loader     // Catch:{ Throwable -> 0x01a4 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Throwable -> 0x01a4 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Throwable -> 0x01a4 }
            r6.f3673es = r0     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.g$1 r0 = new com.appnext.ads.fullscreen.g$1     // Catch:{ Throwable -> 0x01a4 }
            r0.<init>()     // Catch:{ Throwable -> 0x01a4 }
            r8.setOnClickListener(r0)     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.j r0 = r6.f3677ew     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.core.AppnextAd r0 = r0.getSelectedAd()     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.j r2 = r6.f3677ew     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.core.p r2 = r2.getConfigManager()     // Catch:{ Throwable -> 0x01a4 }
            boolean r0 = com.appnext.core.C1336k.m5716a(r0, r2)     // Catch:{ Throwable -> 0x01a4 }
            if (r0 == 0) goto L_0x0099
            com.appnext.ads.fullscreen.j r0 = r6.f3677ew     // Catch:{ Throwable -> 0x01a4 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.core.C1336k.m5715a(r0, r8)     // Catch:{ Throwable -> 0x01a4 }
        L_0x0099:
            android.widget.ImageView r8 = r6.f3675eu     // Catch:{ Throwable -> 0x01a4 }
            r0 = 8
            r8.setVisibility(r0)     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.j r8 = r6.f3677ew     // Catch:{ Throwable -> 0x01a4 }
            boolean r8 = r8.showClose()     // Catch:{ Throwable -> 0x01a4 }
            if (r8 == 0) goto L_0x00b8
            android.os.Handler r8 = r6.mHandler     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.g$4 r2 = new com.appnext.ads.fullscreen.g$4     // Catch:{ Throwable -> 0x01a4 }
            r2.<init>()     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.j r3 = r6.f3677ew     // Catch:{ Throwable -> 0x01a4 }
            long r3 = r3.closeDelay()     // Catch:{ Throwable -> 0x01a4 }
            r8.postDelayed(r2, r3)     // Catch:{ Throwable -> 0x01a4 }
        L_0x00b8:
            android.widget.ImageView r8 = r6.f3675eu     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.g$5 r2 = new com.appnext.ads.fullscreen.g$5     // Catch:{ Throwable -> 0x01a4 }
            r2.<init>()     // Catch:{ Throwable -> 0x01a4 }
            r8.setOnClickListener(r2)     // Catch:{ Throwable -> 0x01a4 }
            android.os.Bundle r8 = r6.getArguments()     // Catch:{ Throwable -> 0x01a4 }
            if (r8 == 0) goto L_0x00e5
            android.os.Bundle r8 = r6.getArguments()     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r2 = "showCta"
            boolean r8 = r8.containsKey(r2)     // Catch:{ Throwable -> 0x01a4 }
            if (r8 == 0) goto L_0x00e5
            android.os.Bundle r8 = r6.getArguments()     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r2 = "showCta"
            boolean r8 = r8.getBoolean(r2)     // Catch:{ Throwable -> 0x01a4 }
            if (r8 != 0) goto L_0x00e5
            android.widget.Button r8 = r6.f3671eq     // Catch:{ Throwable -> 0x01a4 }
            r8.setVisibility(r0)     // Catch:{ Throwable -> 0x01a4 }
        L_0x00e5:
            com.appnext.ads.fullscreen.j r8 = r6.f3677ew     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r8 = r8.getCtaText()     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.core.a.b r0 = com.appnext.core.p049a.C1305b.m5595cN()     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.j r2 = r6.f3677ew     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r2 = r2.getLanguage()     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r3 = "settings"
            java.lang.String r4 = "len"
            java.lang.String r0 = r0.mo6203c(r2, r3, r4)     // Catch:{ Throwable -> 0x01a4 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x01a4 }
            int r2 = r8.length()     // Catch:{ Throwable -> 0x01a4 }
            if (r2 <= r0) goto L_0x010b
            java.lang.String r8 = r8.substring(r1, r0)     // Catch:{ Throwable -> 0x01a4 }
        L_0x010b:
            android.widget.Button r0 = r6.f3671eq     // Catch:{ Throwable -> 0x01a4 }
            r0.setText(r8)     // Catch:{ Throwable -> 0x01a4 }
            android.widget.Button r8 = r6.f3671eq     // Catch:{ Throwable -> 0x01a4 }
            r0 = 2
            com.appnext.core.a.b r2 = com.appnext.core.p049a.C1305b.m5595cN()     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.j r3 = r6.f3677ew     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r3 = r3.getLanguage()     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r4 = "settings"
            java.lang.String r5 = "font_size_sp"
            java.lang.String r2 = r2.mo6203c(r3, r4, r5)     // Catch:{ Throwable -> 0x01a4 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Throwable -> 0x01a4 }
            float r2 = (float) r2     // Catch:{ Throwable -> 0x01a4 }
            r8.setTextSize(r0, r2)     // Catch:{ Throwable -> 0x01a4 }
            android.widget.Button r8 = r6.f3671eq     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.g$6 r0 = new com.appnext.ads.fullscreen.g$6     // Catch:{ Throwable -> 0x01a4 }
            r0.<init>()     // Catch:{ Throwable -> 0x01a4 }
            r8.setOnClickListener(r0)     // Catch:{ Throwable -> 0x01a4 }
            android.widget.ImageView r8 = r6.f3670ep     // Catch:{ Throwable -> 0x01a4 }
            com.appnext.ads.fullscreen.g$7 r0 = new com.appnext.ads.fullscreen.g$7     // Catch:{ Throwable -> 0x01a4 }
            r0.<init>()     // Catch:{ Throwable -> 0x01a4 }
            r8.setOnClickListener(r0)     // Catch:{ Throwable -> 0x01a4 }
            android.widget.VideoView r8 = new android.widget.VideoView     // Catch:{ Throwable -> 0x0151 }
            android.app.Activity r0 = r6.getActivity()     // Catch:{ Throwable -> 0x0151 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Throwable -> 0x0151 }
            r8.<init>(r0)     // Catch:{ Throwable -> 0x0151 }
            r6.videoView = r8     // Catch:{ Throwable -> 0x0151 }
            goto L_0x015c
        L_0x0151:
            android.widget.VideoView r8 = new android.widget.VideoView     // Catch:{ Throwable -> 0x019e }
            android.app.Activity r0 = r6.getActivity()     // Catch:{ Throwable -> 0x019e }
            r8.<init>(r0)     // Catch:{ Throwable -> 0x019e }
            r6.videoView = r8     // Catch:{ Throwable -> 0x019e }
        L_0x015c:
            android.widget.VideoView r8 = r6.videoView     // Catch:{ Throwable -> 0x019e }
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams     // Catch:{ Throwable -> 0x019e }
            r2 = -1
            r3 = -2
            r0.<init>(r2, r3)     // Catch:{ Throwable -> 0x019e }
            r8.setLayoutParams(r0)     // Catch:{ Throwable -> 0x019e }
            int r8 = com.appnext.C1062R.C1064id.media     // Catch:{ Throwable -> 0x019e }
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ Throwable -> 0x019e }
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ Throwable -> 0x019e }
            android.widget.VideoView r0 = r6.videoView     // Catch:{ Throwable -> 0x019e }
            r8.addView(r0, r1)     // Catch:{ Throwable -> 0x019e }
            android.widget.VideoView r8 = r6.videoView     // Catch:{ Throwable -> 0x019e }
            com.appnext.ads.fullscreen.g$8 r0 = new com.appnext.ads.fullscreen.g$8     // Catch:{ Throwable -> 0x019e }
            r0.<init>(r9)     // Catch:{ Throwable -> 0x019e }
            r8.setOnPreparedListener(r0)     // Catch:{ Throwable -> 0x019e }
            android.widget.VideoView r8 = r6.videoView     // Catch:{ Throwable -> 0x019e }
            com.appnext.ads.fullscreen.g$9 r9 = new com.appnext.ads.fullscreen.g$9     // Catch:{ Throwable -> 0x019e }
            r9.<init>()     // Catch:{ Throwable -> 0x019e }
            r8.setOnCompletionListener(r9)     // Catch:{ Throwable -> 0x019e }
            android.widget.VideoView r8 = r6.videoView     // Catch:{ Throwable -> 0x019e }
            com.appnext.ads.fullscreen.g$10 r9 = new com.appnext.ads.fullscreen.g$10     // Catch:{ Throwable -> 0x019e }
            r9.<init>()     // Catch:{ Throwable -> 0x019e }
            r8.setOnErrorListener(r9)     // Catch:{ Throwable -> 0x019e }
            android.widget.VideoView r8 = r6.videoView     // Catch:{ Throwable -> 0x019e }
            com.appnext.ads.fullscreen.j r9 = r6.f3677ew     // Catch:{ Throwable -> 0x019e }
            android.net.Uri r9 = r9.getSelectedVideoUri()     // Catch:{ Throwable -> 0x019e }
            r8.setVideoURI(r9)     // Catch:{ Throwable -> 0x019e }
        L_0x019e:
            java.lang.String r8 = "roll_loaded"
            r6.report(r8)     // Catch:{ Throwable -> 0x01a4 }
            return r7
        L_0x01a4:
            com.appnext.ads.fullscreen.j r7 = r6.f3677ew
            r7.closeClicked()
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.fullscreen.C1104g.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* renamed from: ai */
    private void m5010ai() {
        try {
            if (this.mediaPlayer != null && this.mediaPlayer.getCurrentPosition() != 0 && this.mediaPlayer.getDuration() != 0 && !this.finished) {
                StringBuilder sb = new StringBuilder("onCompletion. ");
                sb.append(this.mediaPlayer.getCurrentPosition());
                sb.append("/");
                sb.append(this.mediaPlayer.getDuration());
                this.finished = true;
                if (this.f3677ew != null) {
                    this.f3677ew.videoEnded();
                }
                report(C1066a.f3530cP);
            }
        } catch (Throwable unused) {
        }
    }

    public final void onPause() {
        super.onPause();
        this.mHandler.removeCallbacks(this.tick);
        if (this.videoView != null) {
            this.videoView.pause();
            this.currentPosition = this.videoView.getCurrentPosition();
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.videoView != null && !this.finished) {
            try {
                this.mediaPlayer.seekTo(this.currentPosition);
                this.mediaPlayer.start();
                this.mHandler.postDelayed(this.tick, 33);
            } catch (Throwable unused) {
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("currentPosition", this.currentPosition);
        bundle.putBoolean("started", this.started);
        super.onSaveInstanceState(bundle);
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.currentPosition = bundle.getInt("currentPosition");
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001e */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022 A[Catch:{ Throwable -> 0x002a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r2 = this;
            super.onDestroyView()
            r0 = 0
            android.widget.VideoView r1 = r2.videoView     // Catch:{ Throwable -> 0x001e }
            if (r1 == 0) goto L_0x001e
            android.widget.VideoView r1 = r2.videoView     // Catch:{ Throwable -> 0x001e }
            r1.setOnCompletionListener(r0)     // Catch:{ Throwable -> 0x001e }
            android.widget.VideoView r1 = r2.videoView     // Catch:{ Throwable -> 0x001e }
            r1.setOnErrorListener(r0)     // Catch:{ Throwable -> 0x001e }
            android.widget.VideoView r1 = r2.videoView     // Catch:{ Throwable -> 0x001e }
            r1.setOnPreparedListener(r0)     // Catch:{ Throwable -> 0x001e }
            android.widget.VideoView r1 = r2.videoView     // Catch:{ Throwable -> 0x001e }
            r1.suspend()     // Catch:{ Throwable -> 0x001e }
            r2.videoView = r0     // Catch:{ Throwable -> 0x001e }
        L_0x001e:
            android.media.MediaPlayer r1 = r2.mediaPlayer     // Catch:{ Throwable -> 0x002a }
            if (r1 == 0) goto L_0x0029
            android.media.MediaPlayer r1 = r2.mediaPlayer     // Catch:{ Throwable -> 0x002a }
            r1.release()     // Catch:{ Throwable -> 0x002a }
            r2.mediaPlayer = r0     // Catch:{ Throwable -> 0x002a }
        L_0x0029:
            return
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.fullscreen.C1104g.onDestroyView():void");
    }

    private void checkProgress() {
        int currentPosition2 = (int) ((((float) this.mediaPlayer.getCurrentPosition()) / ((float) this.mediaPlayer.getDuration())) * 100.0f);
        if (currentPosition2 > 25 && this.lastProgress == 0) {
            this.lastProgress = 25;
            report(C1066a.f3527cM);
        } else if (currentPosition2 <= 50 || this.lastProgress != 25) {
            if (currentPosition2 > 75 && this.lastProgress == 50) {
                this.lastProgress = 75;
                report(C1066a.f3529cO);
            }
        } else {
            this.lastProgress = 50;
            report(C1066a.f3528cN);
        }
    }

    /* renamed from: aj */
    private void m5011aj() {
        this.f3674et = AnimationUtils.loadAnimation(getActivity(), C1062R.anim.apnxt_stream_loader);
        this.f3674et.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (C1104g.this.f3673es.getVisibility() != 8) {
                    C1104g.this.f3673es.startAnimation(C1104g.this.f3674et);
                }
            }
        });
        this.f3674et.setRepeatCount(-1);
        this.f3674et.setRepeatMode(1);
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        this.f3677ew.report(str, "S2");
    }

    /* renamed from: l */
    static /* synthetic */ void m5023l(C1104g gVar) {
        try {
            if (gVar.mediaPlayer != null && gVar.mediaPlayer.getCurrentPosition() != 0 && gVar.mediaPlayer.getDuration() != 0 && !gVar.finished) {
                StringBuilder sb = new StringBuilder("onCompletion. ");
                sb.append(gVar.mediaPlayer.getCurrentPosition());
                sb.append("/");
                sb.append(gVar.mediaPlayer.getDuration());
                gVar.finished = true;
                if (gVar.f3677ew != null) {
                    gVar.f3677ew.videoEnded();
                }
                gVar.report(C1066a.f3530cP);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: n */
    static /* synthetic */ void m5025n(C1104g gVar) {
        int currentPosition2 = (int) ((((float) gVar.mediaPlayer.getCurrentPosition()) / ((float) gVar.mediaPlayer.getDuration())) * 100.0f);
        if (currentPosition2 > 25 && gVar.lastProgress == 0) {
            gVar.lastProgress = 25;
            gVar.report(C1066a.f3527cM);
        } else if (currentPosition2 <= 50 || gVar.lastProgress != 25) {
            if (currentPosition2 > 75 && gVar.lastProgress == 50) {
                gVar.lastProgress = 75;
                gVar.report(C1066a.f3529cO);
            }
        } else {
            gVar.lastProgress = 50;
            gVar.report(C1066a.f3528cN);
        }
    }
}
