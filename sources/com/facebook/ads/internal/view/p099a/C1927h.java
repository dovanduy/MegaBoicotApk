package com.facebook.ads.internal.view.p099a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p079f.C1711b.C1712a;
import com.facebook.ads.internal.p079f.C1713c;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;

/* renamed from: com.facebook.ads.internal.view.a.h */
public class C1927h extends C1917c {

    /* renamed from: c */
    private static final int f6060c = ((int) (4.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f6061d = ((int) (10.0f * C2342x.f7369b));

    /* renamed from: e */
    private static final int f6062e = ((int) (44.0f * C2342x.f7369b));

    /* renamed from: f */
    private final LinearLayout f6063f;

    /* renamed from: g */
    private final ImageView f6064g = new ImageView(getContext());

    /* renamed from: h */
    private final HorizontalScrollView f6065h;

    /* renamed from: i */
    private final LinearLayout f6066i;

    public C1927h(Context context, C1802c cVar, String str, int i, int i2) {
        super(context, cVar, str);
        this.f6064g.setPadding(f6061d, f6061d, f6061d, f6061d);
        this.f6064g.setScaleType(ScaleType.FIT_CENTER);
        this.f6064g.setColorFilter(-10459280);
        LayoutParams layoutParams = new LayoutParams(f6062e, f6062e);
        layoutParams.gravity = 16;
        this.f6066i = new LinearLayout(getContext());
        this.f6066i.setOrientation(0);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.f6065h = new HorizontalScrollView(getContext());
        this.f6065h.setHorizontalScrollBarEnabled(false);
        this.f6065h.setLayoutParams(layoutParams2);
        this.f6065h.addView(this.f6066i, layoutParams2);
        this.f6063f = new LinearLayout(getContext());
        this.f6063f.setOrientation(0);
        C2342x.m9082a((View) this.f6063f, -218103809);
        this.f6063f.setMotionEventSplittingEnabled(false);
        this.f6063f.addView(this.f6064g, layoutParams);
        this.f6063f.addView(this.f6065h, layoutParams2);
        addView(this.f6063f, new FrameLayout.LayoutParams(i, i2));
    }

    /* renamed from: a */
    public void mo7974a(C1713c cVar, C1712a aVar) {
        C2342x.m9085a((ViewGroup) this.f6063f);
        this.f6064g.setImageBitmap(C2348c.m9100a(C2347b.BACK_ARROW));
        this.f6064g.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1927h.this.f6033b.mo7982a();
            }
        });
        this.f6066i.removeAllViews();
        this.f6065h.fullScroll(17);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(0, f6060c, f6060c, f6060c);
        for (final C1713c cVar2 : cVar.mo7481d()) {
            final C1921f fVar = new C1921f(getContext());
            fVar.mo7990a(cVar2.mo7479b(), null);
            fVar.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    fVar.mo7989a();
                    C1927h.this.f6033b.mo7984a(cVar2);
                }
            });
            this.f6066i.addView(fVar, layoutParams);
        }
    }

    /* renamed from: b */
    public void mo7977b(C1713c cVar, C1712a aVar) {
        this.f6064g.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        C2342x.m9089a(textView, true, 14);
        textView.setText(C1710a.m7141k(getContext()));
        textView.setGravity(17);
        C2342x.m9085a((ViewGroup) this.f6063f);
        this.f6063f.removeAllViews();
        this.f6063f.addView(textView, new LayoutParams(-1, -1));
        textView.setClickable(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo7978c() {
        C2342x.m9092c(this);
        C2342x.m9091b(this);
    }

    /* renamed from: d */
    public void mo7979d() {
        this.f6064g.setImageBitmap(C2348c.m9100a(C2347b.CROSS));
        this.f6064g.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1927h.this.f6033b.mo7982a();
            }
        });
        final C1921f fVar = new C1921f(getContext());
        fVar.mo7990a(C1710a.m7131b(getContext()), C2347b.HIDE_AD);
        fVar.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                fVar.mo7989a();
                C1927h.this.f6033b.mo7983a(C1712a.HIDE);
            }
        });
        final C1921f fVar2 = new C1921f(getContext());
        fVar2.mo7990a(C1710a.m7135e(getContext()), C2347b.REPORT_AD);
        fVar2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                fVar2.mo7989a();
                C1927h.this.f6033b.mo7983a(C1712a.REPORT);
            }
        });
        final C1921f fVar3 = new C1921f(getContext());
        fVar3.mo7990a(C1710a.m7142l(getContext()), C2347b.AD_CHOICES_ICON);
        fVar3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                fVar3.mo7989a();
                C1927h.this.f6033b.mo7988d();
            }
        });
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(0, f6060c, f6060c, f6060c);
        C2342x.m9085a((ViewGroup) this.f6063f);
        this.f6066i.removeAllViews();
        this.f6066i.addView(fVar, layoutParams);
        this.f6066i.addView(fVar2, layoutParams);
        this.f6066i.addView(fVar3, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo7980e() {
        return true;
    }
}
