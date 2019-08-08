package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p111a.C2118c;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2142j;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2144l;
import com.facebook.ads.internal.view.p110i.p114d.C2240d;

/* renamed from: com.facebook.ads.internal.view.i.c.l */
public class C2213l extends C2118c {

    /* renamed from: a */
    private final C2142j f6955a;

    /* renamed from: b */
    private final C2144l f6956b;

    /* renamed from: c */
    private final C2136d f6957c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2219m f6958d;

    /* renamed from: e */
    private final Paint f6959e;

    /* renamed from: com.facebook.ads.internal.view.i.c.l$5 */
    static /* synthetic */ class C22185 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6964a = new int[C2240d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.facebook.ads.internal.view.i.d.d[] r0 = com.facebook.ads.internal.view.p110i.p114d.C2240d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6964a = r0
                int[] r0 = f6964a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.ads.internal.view.i.d.d r1 = com.facebook.ads.internal.view.p110i.p114d.C2240d.PREPARED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6964a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.ads.internal.view.i.d.d r1 = com.facebook.ads.internal.view.p110i.p114d.C2240d.IDLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f6964a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.ads.internal.view.i.d.d r1 = com.facebook.ads.internal.view.p110i.p114d.C2240d.PAUSED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f6964a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.facebook.ads.internal.view.i.d.d r1 = com.facebook.ads.internal.view.p110i.p114d.C2240d.PLAYBACK_COMPLETED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f6964a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.facebook.ads.internal.view.i.d.d r1 = com.facebook.ads.internal.view.p110i.p114d.C2240d.STARTED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.p110i.p113c.C2213l.C22185.<clinit>():void");
        }
    }

    public C2213l(Context context) {
        this(context, false);
    }

    public C2213l(Context context, boolean z) {
        super(context);
        this.f6955a = new C2142j() {
            /* renamed from: a */
            public void mo6895a(C2141i iVar) {
                C2213l.this.f6958d.setChecked(true);
            }
        };
        this.f6956b = new C2144l() {
            /* renamed from: a */
            public void mo6895a(C2143k kVar) {
                C2213l.this.f6958d.setChecked(false);
            }
        };
        this.f6957c = new C2136d() {
            /* renamed from: a */
            public void mo6895a(C2135c cVar) {
                C2213l.this.f6958d.setChecked(true);
            }
        };
        this.f6958d = new C2219m(context, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        LayoutParams layoutParams = new LayoutParams((int) (((double) displayMetrics.density) * 23.76d), (int) (23.76d * ((double) displayMetrics.density)));
        layoutParams.addRule(13);
        this.f6958d.setLayoutParams(layoutParams);
        this.f6958d.setChecked(true);
        this.f6958d.setClickable(false);
        this.f6959e = new Paint();
        this.f6959e.setStyle(Style.FILL);
        if (z) {
            this.f6959e.setColor(-1728053248);
        } else {
            this.f6959e.setColor(-1);
            this.f6959e.setAlpha(204);
        }
        C2342x.m9082a((View) this, 0);
        addView(this.f6958d);
        setGravity(17);
        LayoutParams layoutParams2 = new LayoutParams((int) (((double) displayMetrics.density) * 72.0d), (int) (72.0d * ((double) displayMetrics.density)));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8425a() {
        super.mo8425a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7626a((T[]) new C1779f[]{this.f6955a, this.f6956b, this.f6957c});
        }
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C2213l.this.getVideoView() != null) {
                    switch (C22185.f6964a[C2213l.this.getVideoView().getState().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            C2213l.this.getVideoView().mo8380a(C2116a.USER_STARTED);
                            return;
                        case 5:
                            C2213l.this.getVideoView().mo8383a(true);
                            return;
                        default:
                            return;
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8426b() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7628b((T[]) new C1779f[]{this.f6957c, this.f6956b, this.f6955a});
        }
        super.mo8426b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2;
        canvas.drawCircle((float) (getPaddingLeft() + min), (float) (getPaddingTop() + min), (float) min, this.f6959e);
        super.onDraw(canvas);
    }
}
