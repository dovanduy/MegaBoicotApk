package com.facebook.ads.internal.view.p101c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.ads.internal.p125x.C2376a;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.c.c */
public class C1978c extends Drawable {

    /* renamed from: a */
    private final Paint f6230a = new Paint();

    /* renamed from: b */
    private final Paint f6231b = new Paint();

    /* renamed from: c */
    private final Path f6232c = new Path();

    /* renamed from: d */
    private final TextPaint f6233d = new TextPaint();

    /* renamed from: e */
    private final Paint f6234e = new Paint();

    /* renamed from: f */
    private int f6235f;

    /* renamed from: g */
    private int f6236g;

    /* renamed from: h */
    private String f6237h;

    /* renamed from: i */
    private int f6238i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f6239j;

    /* renamed from: k */
    private String f6240k;

    /* renamed from: l */
    private String f6241l;

    /* renamed from: m */
    private long f6242m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Handler f6243n = new Handler();

    /* renamed from: o */
    private WeakReference<C2376a> f6244o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Runnable f6245p = new Runnable() {
        public void run() {
            C1978c.this.m8137c();
            if (C1978c.this.f6239j) {
                C1978c.this.f6243n.postDelayed(C1978c.this.f6245p, 250);
            }
        }
    };

    public C1978c() {
        this.f6230a.setColor(Color.argb(127, 36, 36, 36));
        this.f6230a.setStyle(Style.FILL_AND_STROKE);
        this.f6231b.setAntiAlias(true);
        this.f6231b.setColor(Color.argb(191, 0, 255, 0));
        this.f6231b.setStrokeWidth(20.0f);
        this.f6231b.setStyle(Style.STROKE);
        this.f6233d.setAntiAlias(true);
        this.f6233d.setColor(-1);
        this.f6233d.setStyle(Style.FILL_AND_STROKE);
        this.f6233d.setTextSize(30.0f);
        this.f6234e.setColor(Color.argb(212, 0, 0, 0));
        this.f6234e.setStyle(Style.FILL_AND_STROKE);
        mo8107b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m8137c() {
        String[] split;
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f6235f <= 0) {
            if (!TextUtils.isEmpty(this.f6240k)) {
                sb.append(this.f6240k);
                sb.append("\n");
            }
            if (!TextUtils.isEmpty(this.f6241l)) {
                sb.append(this.f6241l);
                sb.append("\n");
            }
            sb.append("Sdk ");
            sb.append("5.1.0");
            sb.append(", Loaded ");
            if (this.f6242m > 0) {
                long max = Math.max(0, System.currentTimeMillis() - this.f6242m);
                int i = (int) (max / 3600000);
                long j = max % 3600000;
                int i2 = (int) (j / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                int i3 = (int) ((j % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) / 1000);
                if (i > 0) {
                    sb.append(i);
                    sb.append("h ");
                }
                if (i > 0 || i2 > 0) {
                    sb.append(i2);
                    sb.append("m ");
                }
                sb.append(i3);
                str = "s ago";
            } else {
                str = "Unknown";
            }
            sb.append(str);
        } else {
            sb.append("Card ");
            sb.append(this.f6236g + 1);
            sb.append(" of ");
            sb.append(this.f6235f);
        }
        sb.append("\nView: ");
        sb.append((this.f6244o == null || this.f6244o.get() == null) ? "Viewability Checker not set" : ((C2376a) this.f6244o.get()).mo8783d());
        this.f6237h = sb.toString();
        float f = -2.14748365E9f;
        for (String str2 : this.f6237h.split("\n")) {
            f = Math.max(f, this.f6233d.measureText(str2, 0, str2.length()));
        }
        this.f6238i = (int) (f + 0.5f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo8101a(int i, int i2) {
        this.f6235f = i;
        this.f6236g = i2;
        m8137c();
    }

    /* renamed from: a */
    public void mo8102a(long j) {
        this.f6242m = j;
        m8137c();
    }

    /* renamed from: a */
    public void mo8103a(C2376a aVar) {
        this.f6244o = new WeakReference<>(aVar);
        m8137c();
    }

    /* renamed from: a */
    public void mo8104a(String str) {
        this.f6240k = str;
        m8137c();
    }

    /* renamed from: a */
    public void mo8105a(boolean z) {
        this.f6239j = z;
        if (this.f6239j) {
            this.f6243n.post(this.f6245p);
        } else {
            this.f6243n.removeCallbacks(this.f6245p);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public boolean mo8106a() {
        return this.f6239j;
    }

    /* renamed from: b */
    public void mo8107b() {
        this.f6235f = 0;
        this.f6236g = -1;
        this.f6237h = "Initializing...";
        this.f6238i = 100;
        this.f6240k = null;
        this.f6242m = -1;
        this.f6244o = null;
        mo8105a(false);
    }

    /* renamed from: b */
    public void mo8108b(String str) {
        this.f6241l = str;
        m8137c();
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.f6239j) {
            float width = (float) canvas.getWidth();
            float height = (float) canvas.getHeight();
            canvas2.drawRect(0.0f, 0.0f, width, height, this.f6230a);
            StaticLayout staticLayout = new StaticLayout(this.f6237h, this.f6233d, this.f6238i, Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            float width2 = ((float) staticLayout.getWidth()) / 2.0f;
            float height2 = ((float) staticLayout.getHeight()) / 2.0f;
            float f3 = f - width2;
            float f4 = f2 - height2;
            StaticLayout staticLayout2 = staticLayout;
            canvas2.drawRect(f3 - 40.0f, f4 - 40.0f, f + width2 + 40.0f, f2 + height2 + 40.0f, this.f6234e);
            canvas.save();
            canvas2.translate(f3, f4);
            staticLayout2.draw(canvas2);
            canvas.restore();
            this.f6232c.reset();
            this.f6232c.moveTo(0.0f, 0.0f);
            this.f6232c.lineTo(width, 0.0f);
            this.f6232c.lineTo(width, height);
            this.f6232c.lineTo(0.0f, height);
            this.f6232c.lineTo(0.0f, 0.0f);
            canvas2.drawPath(this.f6232c, this.f6231b);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
