package com.appnext.nativeads;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.appnext.core.C1326f;
import com.appnext.p050d.C1378a;
import com.appnext.p050d.C1380b;
import java.io.File;

public class MediaView extends RelativeLayout {
    private boolean clickEnabled = true;
    /* access modifiers changed from: private */
    public boolean finished = false;
    /* access modifiers changed from: private */

    /* renamed from: mA */
    public C1394a f4307mA;
    /* access modifiers changed from: private */

    /* renamed from: mB */
    public boolean f4308mB = false;
    /* access modifiers changed from: private */
    public Handler mHandler;
    /* access modifiers changed from: private */
    public MediaPlayer mediaPlayer;

    /* renamed from: mt */
    private boolean f4309mt = true;
    /* access modifiers changed from: private */

    /* renamed from: mu */
    public NativeAd f4310mu;
    private boolean mute = false;

    /* renamed from: mv */
    private MediaType f4311mv;

    /* renamed from: mw */
    private NativeAdData f4312mw;
    /* access modifiers changed from: private */

    /* renamed from: mx */
    public C1378a f4313mx;

    /* renamed from: my */
    private C1380b f4314my;
    /* access modifiers changed from: private */

    /* renamed from: mz */
    public View f4315mz;
    /* access modifiers changed from: private */
    public int position = 0;
    /* access modifiers changed from: private */
    public Runnable tick = new Runnable() {
        public final void run() {
            try {
                if (MediaView.this.mediaPlayer != null && MediaView.this.mediaPlayer.isPlaying()) {
                    MediaView.this.position = MediaView.this.mediaPlayer.getCurrentPosition();
                }
            } catch (Throwable unused) {
            }
            if (MediaView.this.mHandler != null) {
                MediaView.this.mHandler.postDelayed(MediaView.this.tick, 500);
            }
        }
    };

    protected enum MediaType {
        VIDEO,
        STATIC
    }

    /* renamed from: com.appnext.nativeads.MediaView$a */
    class C1394a extends ImageView {
        public C1394a(Context context) {
            super(context);
        }
    }

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|(2:8|(1:10)(7:11|(1:13)|14|(1:16)(1:17)|18|(1:20)(1:21)|22))|23) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6339a(com.appnext.nativeads.NativeAd r4, com.appnext.nativeads.NativeAdData r5, com.appnext.nativeads.MediaView.MediaType r6) {
        /*
            r3 = this;
            r3.f4310mu = r4
            r3.f4312mw = r5
            r3.f4311mv = r6
            com.appnext.nativeads.MediaView$MediaType r4 = com.appnext.nativeads.MediaView.MediaType.VIDEO
            if (r6 != r4) goto L_0x0185
            com.appnext.d.a r4 = new com.appnext.d.a     // Catch:{ Throwable -> 0x001a }
            android.content.Context r5 = r3.getContext()     // Catch:{ Throwable -> 0x001a }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ Throwable -> 0x001a }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x001a }
            r3.f4313mx = r4     // Catch:{ Throwable -> 0x001a }
            goto L_0x0025
        L_0x001a:
            com.appnext.d.a r4 = new com.appnext.d.a     // Catch:{ Throwable -> 0x0188 }
            android.content.Context r5 = r3.getContext()     // Catch:{ Throwable -> 0x0188 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0188 }
            r3.f4313mx = r4     // Catch:{ Throwable -> 0x0188 }
        L_0x0025:
            android.os.Handler r4 = new android.os.Handler     // Catch:{ Throwable -> 0x0188 }
            r4.<init>()     // Catch:{ Throwable -> 0x0188 }
            r3.mHandler = r4     // Catch:{ Throwable -> 0x0188 }
            com.appnext.d.a r4 = r3.f4313mx     // Catch:{ Throwable -> 0x0188 }
            com.appnext.nativeads.MediaView$1 r5 = new com.appnext.nativeads.MediaView$1     // Catch:{ Throwable -> 0x0188 }
            r5.<init>()     // Catch:{ Throwable -> 0x0188 }
            r4.mo6334a(r5)     // Catch:{ Throwable -> 0x0188 }
            com.appnext.d.a r4 = r3.f4313mx     // Catch:{ Throwable -> 0x0188 }
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Throwable -> 0x0188 }
            com.appnext.nativeads.MediaView$2 r5 = new com.appnext.nativeads.MediaView$2     // Catch:{ Throwable -> 0x0188 }
            r5.<init>()     // Catch:{ Throwable -> 0x0188 }
            r4.addOnGlobalLayoutListener(r5)     // Catch:{ Throwable -> 0x0188 }
            com.appnext.d.a r4 = r3.f4313mx     // Catch:{ Throwable -> 0x0188 }
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Throwable -> 0x0188 }
            r6 = 1
            r0 = -1
            r5.<init>(r0, r6)     // Catch:{ Throwable -> 0x0188 }
            r4.setLayoutParams(r5)     // Catch:{ Throwable -> 0x0188 }
            com.appnext.d.a r4 = r3.f4313mx     // Catch:{ Throwable -> 0x0188 }
            r3.addView(r4)     // Catch:{ Throwable -> 0x0188 }
            com.appnext.d.a r4 = r3.f4313mx     // Catch:{ Throwable -> 0x0188 }
            com.appnext.nativeads.MediaView$3 r5 = new com.appnext.nativeads.MediaView$3     // Catch:{ Throwable -> 0x0188 }
            r5.<init>()     // Catch:{ Throwable -> 0x0188 }
            r4.setOnPreparedListener(r5)     // Catch:{ Throwable -> 0x0188 }
            com.appnext.d.a r4 = r3.f4313mx     // Catch:{ Throwable -> 0x0188 }
            com.appnext.nativeads.MediaView$4 r5 = new com.appnext.nativeads.MediaView$4     // Catch:{ Throwable -> 0x0188 }
            r5.<init>()     // Catch:{ Throwable -> 0x0188 }
            r4.setOnErrorListener(r5)     // Catch:{ Throwable -> 0x0188 }
            com.appnext.d.a r4 = r3.f4313mx     // Catch:{ Throwable -> 0x0188 }
            com.appnext.nativeads.MediaView$5 r5 = new com.appnext.nativeads.MediaView$5     // Catch:{ Throwable -> 0x0188 }
            r5.<init>()     // Catch:{ Throwable -> 0x0188 }
            r4.setOnCompletionListener(r5)     // Catch:{ Throwable -> 0x0188 }
            com.appnext.nativeads.NativeAdData r4 = r3.f4312mw     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r4 = r4.getSelectedVideo()     // Catch:{ Throwable -> 0x0188 }
            if (r4 == 0) goto L_0x0179
            java.lang.String r5 = ""
            boolean r5 = r4.equals(r5)     // Catch:{ Throwable -> 0x0188 }
            if (r5 == 0) goto L_0x0085
            goto L_0x0179
        L_0x0085:
            com.appnext.nativeads.MediaView$a r5 = new com.appnext.nativeads.MediaView$a     // Catch:{ Throwable -> 0x0188 }
            android.content.Context r6 = r3.getContext()     // Catch:{ Throwable -> 0x0188 }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0188 }
            r3.f4315mz = r5     // Catch:{ Throwable -> 0x0188 }
            android.view.View r5 = r3.f4315mz     // Catch:{ Throwable -> 0x0188 }
            r3.addView(r5)     // Catch:{ Throwable -> 0x0188 }
            android.view.View r5 = r3.f4315mz     // Catch:{ Throwable -> 0x0188 }
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()     // Catch:{ Throwable -> 0x0188 }
            r5.height = r0     // Catch:{ Throwable -> 0x0188 }
            android.view.View r5 = r3.f4315mz     // Catch:{ Throwable -> 0x0188 }
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()     // Catch:{ Throwable -> 0x0188 }
            r5.width = r0     // Catch:{ Throwable -> 0x0188 }
            android.view.View r5 = r3.f4315mz     // Catch:{ Throwable -> 0x0188 }
            android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Throwable -> 0x0188 }
            int r6 = com.appnext.nativeads.C1412R.C1413drawable.apnxt_na_play     // Catch:{ Throwable -> 0x0188 }
            r5.setImageResource(r6)     // Catch:{ Throwable -> 0x0188 }
            android.view.View r5 = r3.f4315mz     // Catch:{ Throwable -> 0x0188 }
            android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Throwable -> 0x0188 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ Throwable -> 0x0188 }
            r5.setScaleType(r6)     // Catch:{ Throwable -> 0x0188 }
            android.view.View r5 = r3.f4315mz     // Catch:{ Throwable -> 0x0188 }
            com.appnext.nativeads.MediaView$6 r6 = new com.appnext.nativeads.MediaView$6     // Catch:{ Throwable -> 0x0188 }
            r6.<init>()     // Catch:{ Throwable -> 0x0188 }
            r5.setOnClickListener(r6)     // Catch:{ Throwable -> 0x0188 }
            boolean r5 = r3.isAutoPLay()     // Catch:{ Throwable -> 0x0188 }
            if (r5 == 0) goto L_0x00cf
            android.view.View r5 = r3.f4315mz     // Catch:{ Throwable -> 0x0188 }
            android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Throwable -> 0x0188 }
            r6 = 0
            r5.setImageResource(r6)     // Catch:{ Throwable -> 0x0188 }
        L_0x00cf:
            com.appnext.nativeads.MediaView$a r5 = new com.appnext.nativeads.MediaView$a     // Catch:{ Throwable -> 0x0188 }
            android.content.Context r6 = r3.getContext()     // Catch:{ Throwable -> 0x0188 }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0188 }
            r3.f4307mA = r5     // Catch:{ Throwable -> 0x0188 }
            com.appnext.nativeads.MediaView$a r5 = r3.f4307mA     // Catch:{ Throwable -> 0x0188 }
            r3.addView(r5)     // Catch:{ Throwable -> 0x0188 }
            com.appnext.nativeads.MediaView$a r5 = r3.f4307mA     // Catch:{ Throwable -> 0x0188 }
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()     // Catch:{ Throwable -> 0x0188 }
            android.content.Context r6 = r3.getContext()     // Catch:{ Throwable -> 0x0188 }
            r0 = 1106247680(0x41f00000, float:30.0)
            int r6 = com.appnext.core.C1326f.m5657a(r6, r0)     // Catch:{ Throwable -> 0x0188 }
            r5.height = r6     // Catch:{ Throwable -> 0x0188 }
            com.appnext.nativeads.MediaView$a r5 = r3.f4307mA     // Catch:{ Throwable -> 0x0188 }
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()     // Catch:{ Throwable -> 0x0188 }
            android.content.Context r6 = r3.getContext()     // Catch:{ Throwable -> 0x0188 }
            int r6 = com.appnext.core.C1326f.m5657a(r6, r0)     // Catch:{ Throwable -> 0x0188 }
            r5.width = r6     // Catch:{ Throwable -> 0x0188 }
            boolean r5 = r3.isMute()     // Catch:{ Throwable -> 0x0188 }
            if (r5 == 0) goto L_0x010f
            com.appnext.nativeads.MediaView$a r5 = r3.f4307mA     // Catch:{ Throwable -> 0x0188 }
            int r6 = com.appnext.nativeads.C1412R.C1413drawable.apnxt_na_mute     // Catch:{ Throwable -> 0x0188 }
            r5.setImageResource(r6)     // Catch:{ Throwable -> 0x0188 }
            goto L_0x0116
        L_0x010f:
            com.appnext.nativeads.MediaView$a r5 = r3.f4307mA     // Catch:{ Throwable -> 0x0188 }
            int r6 = com.appnext.nativeads.C1412R.C1413drawable.apnxt_na_unmute     // Catch:{ Throwable -> 0x0188 }
            r5.setImageResource(r6)     // Catch:{ Throwable -> 0x0188 }
        L_0x0116:
            com.appnext.nativeads.MediaView$a r5 = r3.f4307mA     // Catch:{ Throwable -> 0x0188 }
            com.appnext.nativeads.MediaView$7 r6 = new com.appnext.nativeads.MediaView$7     // Catch:{ Throwable -> 0x0188 }
            r6.<init>()     // Catch:{ Throwable -> 0x0188 }
            r5.setOnClickListener(r6)     // Catch:{ Throwable -> 0x0188 }
            com.appnext.d.a r5 = r3.f4313mx     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r6 = com.appnext.core.C1326f.m5655N(r4)     // Catch:{ Throwable -> 0x0188 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0188 }
            r0.<init>()     // Catch:{ Throwable -> 0x0188 }
            android.content.Context r1 = r3.getContext()     // Catch:{ Throwable -> 0x0188 }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Throwable -> 0x0188 }
            r0.append(r1)     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r1 = "/data/appnext/videos/"
            r0.append(r1)     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0188 }
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x0188 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0188 }
            r2.<init>()     // Catch:{ Throwable -> 0x0188 }
            r2.append(r0)     // Catch:{ Throwable -> 0x0188 }
            r2.append(r6)     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0188 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0188 }
            boolean r1 = r1.exists()     // Catch:{ Throwable -> 0x0188 }
            if (r1 == 0) goto L_0x0171
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0188 }
            r4.<init>()     // Catch:{ Throwable -> 0x0188 }
            r4.append(r0)     // Catch:{ Throwable -> 0x0188 }
            r4.append(r6)     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0188 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Throwable -> 0x0188 }
            goto L_0x0175
        L_0x0171:
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Throwable -> 0x0188 }
        L_0x0175:
            r5.setVideoURI(r4)     // Catch:{ Throwable -> 0x0188 }
            goto L_0x0188
        L_0x0179:
            com.appnext.d.a r4 = r3.f4313mx     // Catch:{ Throwable -> 0x0188 }
            r3.removeView(r4)     // Catch:{ Throwable -> 0x0188 }
            r4 = 0
            r3.f4313mx = r4     // Catch:{ Throwable -> 0x0188 }
            r3.m5835cS()     // Catch:{ Throwable -> 0x0188 }
            goto L_0x0188
        L_0x0185:
            r3.m5835cS()
        L_0x0188:
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto L_0x0193
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setBackgroundColor(r4)
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.nativeads.MediaView.mo6339a(com.appnext.nativeads.NativeAd, com.appnext.nativeads.NativeAdData, com.appnext.nativeads.MediaView$MediaType):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|(2:6|(1:8)(6:9|(1:11)|12|(1:14)(1:15)|16|17))|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x012c, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0010 */
    /* renamed from: cR */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5834cR() {
        /*
            r4 = this;
            com.appnext.d.a r0 = new com.appnext.d.a     // Catch:{ Throwable -> 0x0010 }
            android.content.Context r1 = r4.getContext()     // Catch:{ Throwable -> 0x0010 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ Throwable -> 0x0010 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0010 }
            r4.f4313mx = r0     // Catch:{ Throwable -> 0x0010 }
            goto L_0x001b
        L_0x0010:
            com.appnext.d.a r0 = new com.appnext.d.a     // Catch:{ Throwable -> 0x012c }
            android.content.Context r1 = r4.getContext()     // Catch:{ Throwable -> 0x012c }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x012c }
            r4.f4313mx = r0     // Catch:{ Throwable -> 0x012c }
        L_0x001b:
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Throwable -> 0x012c }
            r0.<init>()     // Catch:{ Throwable -> 0x012c }
            r4.mHandler = r0     // Catch:{ Throwable -> 0x012c }
            com.appnext.d.a r0 = r4.f4313mx     // Catch:{ Throwable -> 0x012c }
            com.appnext.nativeads.MediaView$1 r1 = new com.appnext.nativeads.MediaView$1     // Catch:{ Throwable -> 0x012c }
            r1.<init>()     // Catch:{ Throwable -> 0x012c }
            r0.mo6334a(r1)     // Catch:{ Throwable -> 0x012c }
            com.appnext.d.a r0 = r4.f4313mx     // Catch:{ Throwable -> 0x012c }
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ Throwable -> 0x012c }
            com.appnext.nativeads.MediaView$2 r1 = new com.appnext.nativeads.MediaView$2     // Catch:{ Throwable -> 0x012c }
            r1.<init>()     // Catch:{ Throwable -> 0x012c }
            r0.addOnGlobalLayoutListener(r1)     // Catch:{ Throwable -> 0x012c }
            com.appnext.d.a r0 = r4.f4313mx     // Catch:{ Throwable -> 0x012c }
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Throwable -> 0x012c }
            r2 = 1
            r3 = -1
            r1.<init>(r3, r2)     // Catch:{ Throwable -> 0x012c }
            r0.setLayoutParams(r1)     // Catch:{ Throwable -> 0x012c }
            com.appnext.d.a r0 = r4.f4313mx     // Catch:{ Throwable -> 0x012c }
            r4.addView(r0)     // Catch:{ Throwable -> 0x012c }
            com.appnext.d.a r0 = r4.f4313mx     // Catch:{ Throwable -> 0x012c }
            com.appnext.nativeads.MediaView$3 r1 = new com.appnext.nativeads.MediaView$3     // Catch:{ Throwable -> 0x012c }
            r1.<init>()     // Catch:{ Throwable -> 0x012c }
            r0.setOnPreparedListener(r1)     // Catch:{ Throwable -> 0x012c }
            com.appnext.d.a r0 = r4.f4313mx     // Catch:{ Throwable -> 0x012c }
            com.appnext.nativeads.MediaView$4 r1 = new com.appnext.nativeads.MediaView$4     // Catch:{ Throwable -> 0x012c }
            r1.<init>()     // Catch:{ Throwable -> 0x012c }
            r0.setOnErrorListener(r1)     // Catch:{ Throwable -> 0x012c }
            com.appnext.d.a r0 = r4.f4313mx     // Catch:{ Throwable -> 0x012c }
            com.appnext.nativeads.MediaView$5 r1 = new com.appnext.nativeads.MediaView$5     // Catch:{ Throwable -> 0x012c }
            r1.<init>()     // Catch:{ Throwable -> 0x012c }
            r0.setOnCompletionListener(r1)     // Catch:{ Throwable -> 0x012c }
            com.appnext.nativeads.NativeAdData r0 = r4.f4312mw     // Catch:{ Throwable -> 0x012c }
            java.lang.String r0 = r0.getSelectedVideo()     // Catch:{ Throwable -> 0x012c }
            if (r0 == 0) goto L_0x0120
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)     // Catch:{ Throwable -> 0x012c }
            if (r1 == 0) goto L_0x007b
            goto L_0x0120
        L_0x007b:
            com.appnext.nativeads.MediaView$a r1 = new com.appnext.nativeads.MediaView$a     // Catch:{ Throwable -> 0x012c }
            android.content.Context r2 = r4.getContext()     // Catch:{ Throwable -> 0x012c }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x012c }
            r4.f4315mz = r1     // Catch:{ Throwable -> 0x012c }
            android.view.View r1 = r4.f4315mz     // Catch:{ Throwable -> 0x012c }
            r4.addView(r1)     // Catch:{ Throwable -> 0x012c }
            android.view.View r1 = r4.f4315mz     // Catch:{ Throwable -> 0x012c }
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch:{ Throwable -> 0x012c }
            r1.height = r3     // Catch:{ Throwable -> 0x012c }
            android.view.View r1 = r4.f4315mz     // Catch:{ Throwable -> 0x012c }
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch:{ Throwable -> 0x012c }
            r1.width = r3     // Catch:{ Throwable -> 0x012c }
            android.view.View r1 = r4.f4315mz     // Catch:{ Throwable -> 0x012c }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Throwable -> 0x012c }
            int r2 = com.appnext.nativeads.C1412R.C1413drawable.apnxt_na_play     // Catch:{ Throwable -> 0x012c }
            r1.setImageResource(r2)     // Catch:{ Throwable -> 0x012c }
            android.view.View r1 = r4.f4315mz     // Catch:{ Throwable -> 0x012c }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Throwable -> 0x012c }
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ Throwable -> 0x012c }
            r1.setScaleType(r2)     // Catch:{ Throwable -> 0x012c }
            android.view.View r1 = r4.f4315mz     // Catch:{ Throwable -> 0x012c }
            com.appnext.nativeads.MediaView$6 r2 = new com.appnext.nativeads.MediaView$6     // Catch:{ Throwable -> 0x012c }
            r2.<init>()     // Catch:{ Throwable -> 0x012c }
            r1.setOnClickListener(r2)     // Catch:{ Throwable -> 0x012c }
            boolean r1 = r4.isAutoPLay()     // Catch:{ Throwable -> 0x012c }
            if (r1 == 0) goto L_0x00c5
            android.view.View r1 = r4.f4315mz     // Catch:{ Throwable -> 0x012c }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Throwable -> 0x012c }
            r2 = 0
            r1.setImageResource(r2)     // Catch:{ Throwable -> 0x012c }
        L_0x00c5:
            com.appnext.nativeads.MediaView$a r1 = new com.appnext.nativeads.MediaView$a     // Catch:{ Throwable -> 0x012c }
            android.content.Context r2 = r4.getContext()     // Catch:{ Throwable -> 0x012c }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x012c }
            r4.f4307mA = r1     // Catch:{ Throwable -> 0x012c }
            com.appnext.nativeads.MediaView$a r1 = r4.f4307mA     // Catch:{ Throwable -> 0x012c }
            r4.addView(r1)     // Catch:{ Throwable -> 0x012c }
            com.appnext.nativeads.MediaView$a r1 = r4.f4307mA     // Catch:{ Throwable -> 0x012c }
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch:{ Throwable -> 0x012c }
            android.content.Context r2 = r4.getContext()     // Catch:{ Throwable -> 0x012c }
            r3 = 1106247680(0x41f00000, float:30.0)
            int r2 = com.appnext.core.C1326f.m5657a(r2, r3)     // Catch:{ Throwable -> 0x012c }
            r1.height = r2     // Catch:{ Throwable -> 0x012c }
            com.appnext.nativeads.MediaView$a r1 = r4.f4307mA     // Catch:{ Throwable -> 0x012c }
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch:{ Throwable -> 0x012c }
            android.content.Context r2 = r4.getContext()     // Catch:{ Throwable -> 0x012c }
            int r2 = com.appnext.core.C1326f.m5657a(r2, r3)     // Catch:{ Throwable -> 0x012c }
            r1.width = r2     // Catch:{ Throwable -> 0x012c }
            boolean r1 = r4.isMute()     // Catch:{ Throwable -> 0x012c }
            if (r1 == 0) goto L_0x0105
            com.appnext.nativeads.MediaView$a r1 = r4.f4307mA     // Catch:{ Throwable -> 0x012c }
            int r2 = com.appnext.nativeads.C1412R.C1413drawable.apnxt_na_mute     // Catch:{ Throwable -> 0x012c }
            r1.setImageResource(r2)     // Catch:{ Throwable -> 0x012c }
            goto L_0x010c
        L_0x0105:
            com.appnext.nativeads.MediaView$a r1 = r4.f4307mA     // Catch:{ Throwable -> 0x012c }
            int r2 = com.appnext.nativeads.C1412R.C1413drawable.apnxt_na_unmute     // Catch:{ Throwable -> 0x012c }
            r1.setImageResource(r2)     // Catch:{ Throwable -> 0x012c }
        L_0x010c:
            com.appnext.nativeads.MediaView$a r1 = r4.f4307mA     // Catch:{ Throwable -> 0x012c }
            com.appnext.nativeads.MediaView$7 r2 = new com.appnext.nativeads.MediaView$7     // Catch:{ Throwable -> 0x012c }
            r2.<init>()     // Catch:{ Throwable -> 0x012c }
            r1.setOnClickListener(r2)     // Catch:{ Throwable -> 0x012c }
            com.appnext.d.a r1 = r4.f4313mx     // Catch:{ Throwable -> 0x012c }
            android.net.Uri r0 = r4.m5830aW(r0)     // Catch:{ Throwable -> 0x012c }
            r1.setVideoURI(r0)     // Catch:{ Throwable -> 0x012c }
            return
        L_0x0120:
            com.appnext.d.a r0 = r4.f4313mx     // Catch:{ Throwable -> 0x012c }
            r4.removeView(r0)     // Catch:{ Throwable -> 0x012c }
            r0 = 0
            r4.f4313mx = r0     // Catch:{ Throwable -> 0x012c }
            r4.m5835cS()     // Catch:{ Throwable -> 0x012c }
            return
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.nativeads.MediaView.m5834cR():void");
    }

    /* renamed from: aW */
    private Uri m5830aW(String str) {
        String N = C1326f.m5655N(str);
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getFilesDir().getAbsolutePath());
        sb.append("/data/appnext/videos/");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(N);
        if (!new File(sb3.toString()).exists()) {
            return Uri.parse(str);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb2);
        sb4.append(N);
        return Uri.parse(sb4.toString());
    }

    /* renamed from: cS */
    private void m5835cS() {
        this.f4314my = new C1380b(getContext());
        this.f4310mu.downloadAndDisplayImage(this.f4314my, this.f4312mw.getWideImageURL());
        addView(this.f4314my);
        ((LayoutParams) this.f4314my.getLayoutParams()).addRule(13);
        this.f4314my.getLayoutParams().width = -1;
        this.f4314my.getLayoutParams().height = -2;
        this.f4314my.setAdjustViewBounds(true);
    }

    public void setAutoPLay(boolean z) {
        this.f4309mt = z;
    }

    public void setMute(boolean z) {
        this.mute = z;
        try {
            if (this.mediaPlayer != null) {
                if (isMute()) {
                    this.mediaPlayer.setVolume(0.0f, 0.0f);
                    return;
                }
                this.mediaPlayer.setVolume(1.0f, 1.0f);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean isMute() {
        return this.mute;
    }

    public boolean isAutoPLay() {
        return this.f4309mt;
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    public void setClickEnabled(boolean z) {
        this.clickEnabled = z;
    }

    public void play() {
        try {
            if (this.mediaPlayer != null && !this.mediaPlayer.isPlaying()) {
                this.mediaPlayer.start();
                ((ImageView) this.f4315mz).setImageResource(0);
            }
        } catch (Throwable unused) {
        }
    }

    public void pause() {
        try {
            if (this.mediaPlayer != null && this.mediaPlayer.isPlaying()) {
                this.mediaPlayer.pause();
                ((ImageView) this.f4315mz).setImageResource(C1412R.C1413drawable.apnxt_na_play);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001e */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022 A[Catch:{ Throwable -> 0x0029 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void destroy() {
        /*
            r2 = this;
            r2.removeAllViews()
            r0 = 0
            com.appnext.d.a r1 = r2.f4313mx     // Catch:{ Throwable -> 0x001e }
            if (r1 == 0) goto L_0x001e
            com.appnext.d.a r1 = r2.f4313mx     // Catch:{ Throwable -> 0x001e }
            r1.setOnCompletionListener(r0)     // Catch:{ Throwable -> 0x001e }
            com.appnext.d.a r1 = r2.f4313mx     // Catch:{ Throwable -> 0x001e }
            r1.setOnErrorListener(r0)     // Catch:{ Throwable -> 0x001e }
            com.appnext.d.a r1 = r2.f4313mx     // Catch:{ Throwable -> 0x001e }
            r1.setOnPreparedListener(r0)     // Catch:{ Throwable -> 0x001e }
            com.appnext.d.a r1 = r2.f4313mx     // Catch:{ Throwable -> 0x001e }
            r1.suspend()     // Catch:{ Throwable -> 0x001e }
            r2.f4313mx = r0     // Catch:{ Throwable -> 0x001e }
        L_0x001e:
            com.appnext.d.b r1 = r2.f4314my     // Catch:{ Throwable -> 0x0029 }
            if (r1 == 0) goto L_0x0029
            com.appnext.d.b r1 = r2.f4314my     // Catch:{ Throwable -> 0x0029 }
            r1.setImageBitmap(r0)     // Catch:{ Throwable -> 0x0029 }
            r2.f4314my = r0     // Catch:{ Throwable -> 0x0029 }
        L_0x0029:
            android.os.Handler r1 = r2.mHandler
            r1.removeCallbacksAndMessages(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.nativeads.MediaView.destroy():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo6344k(int i) {
        if (this.f4311mv == MediaType.VIDEO) {
            if (i < 90) {
                pause();
            } else if (!this.f4308mB && isAutoPLay() && !this.finished) {
                play();
            }
        }
    }
}
