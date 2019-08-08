package com.facebook.ads.internal.view.p099a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;

/* renamed from: com.facebook.ads.internal.view.a.a */
public class C1912a extends RelativeLayout {

    /* renamed from: a */
    private static final int f6004a = ((int) (C2342x.f7369b * 16.0f));

    /* renamed from: b */
    private static final int f6005b = ((int) (8.0f * C2342x.f7369b));

    /* renamed from: c */
    private static final int f6006c = ((int) (44.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f6007d = ((int) (10.0f * C2342x.f7369b));

    /* renamed from: e */
    private static final int f6008e = (f6004a - f6007d);

    /* renamed from: f */
    private static final int f6009f = ((int) (75.0f * C2342x.f7369b));

    /* renamed from: g */
    private static final int f6010g = ((int) (25.0f * C2342x.f7369b));

    /* renamed from: h */
    private static final int f6011h = ((int) (45.0f * C2342x.f7369b));

    /* renamed from: i */
    private static final int f6012i = ((int) (15.0f * C2342x.f7369b));

    /* renamed from: j */
    private static final int f6013j = ((int) (16.0f * C2342x.f7369b));
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1920e f6014k;

    /* renamed from: l */
    private final int f6015l;

    /* renamed from: m */
    private final int f6016m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final boolean f6017n;

    /* renamed from: com.facebook.ads.internal.view.a.a$a */
    public static class C1915a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Context f6020a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C1920e f6021b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f6022c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f6023d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f6024e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2347b f6025f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6026g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f6027h = true;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f6028i = true;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f6029j = true;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f6030k = true;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f6031l = true;

        public C1915a(Context context) {
            this.f6020a = context;
        }

        /* renamed from: a */
        public C1915a mo7958a(int i) {
            this.f6026g = i;
            return this;
        }

        /* renamed from: a */
        public C1915a mo7959a(C1920e eVar) {
            this.f6021b = eVar;
            return this;
        }

        /* renamed from: a */
        public C1915a mo7960a(C2347b bVar) {
            this.f6025f = bVar;
            return this;
        }

        /* renamed from: a */
        public C1915a mo7961a(String str) {
            this.f6022c = str;
            return this;
        }

        /* renamed from: a */
        public C1915a mo7962a(boolean z) {
            this.f6027h = z;
            return this;
        }

        /* renamed from: a */
        public C1912a mo7963a() {
            return new C1912a(this);
        }

        /* renamed from: b */
        public C1915a mo7964b(String str) {
            this.f6023d = str;
            return this;
        }

        /* renamed from: b */
        public C1915a mo7965b(boolean z) {
            this.f6028i = z;
            return this;
        }

        /* renamed from: c */
        public C1915a mo7966c(String str) {
            this.f6024e = str;
            return this;
        }

        /* renamed from: c */
        public C1915a mo7967c(boolean z) {
            this.f6029j = z;
            return this;
        }

        /* renamed from: d */
        public C1915a mo7968d(boolean z) {
            this.f6030k = z;
            return this;
        }

        /* renamed from: e */
        public C1915a mo7969e(boolean z) {
            this.f6031l = z;
            return this;
        }
    }

    private C1912a(C1915a aVar) {
        super(aVar.f6020a);
        this.f6014k = aVar.f6021b;
        this.f6015l = aVar.f6028i ? f6009f : f6011h;
        this.f6016m = aVar.f6028i ? f6010g : f6012i;
        this.f6017n = aVar.f6030k;
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        int i = 0;
        linearLayout.setOrientation(0);
        if (aVar.f6027h) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(f6007d, f6007d, f6007d, f6007d);
            imageView.setScaleType(ScaleType.FIT_CENTER);
            imageView.setImageBitmap(C2348c.m9100a(C2347b.CROSS));
            imageView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (C1912a.this.f6014k != null) {
                        if (C1912a.this.f6017n) {
                            C1912a.this.f6014k.mo7986b();
                            return;
                        }
                        C1912a.this.f6014k.mo7985a(true);
                    }
                }
            });
            LayoutParams layoutParams = new LayoutParams(f6006c, f6006c);
            layoutParams.setMargins(f6008e, f6008e, f6008e, f6008e);
            linearLayout.addView(imageView, layoutParams);
        }
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setPadding(this.f6016m, this.f6016m, this.f6016m, this.f6016m);
        imageView2.setImageBitmap(C2348c.m9100a(aVar.f6025f));
        imageView2.setColorFilter(-1);
        LayoutParams layoutParams2 = new LayoutParams(this.f6015l, this.f6015l);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(aVar.f6026g);
        C2342x.m9083a((View) imageView2, (Drawable) gradientDrawable);
        layoutParams2.gravity = 17;
        layoutParams2.setMargins(f6004a, 0, f6004a, f6004a);
        TextView textView = new TextView(getContext());
        C2342x.m9089a(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(aVar.f6022c);
        textView.setGravity(17);
        LayoutParams layoutParams3 = new LayoutParams(-1, -2);
        layoutParams3.setMargins(f6004a, 0, f6004a, f6004a);
        TextView textView2 = new TextView(getContext());
        C2342x.m9089a(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(aVar.f6023d);
        textView2.setGravity(17);
        LayoutParams layoutParams4 = new LayoutParams(-1, -2);
        layoutParams4.setMargins(f6004a, 0, f6004a, f6004a);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        linearLayout2.addView(imageView2, layoutParams2);
        linearLayout2.addView(textView, layoutParams3);
        linearLayout2.addView(textView2, layoutParams4);
        if (aVar.f6029j) {
            C1921f fVar = new C1921f(getContext());
            fVar.mo7990a(aVar.f6024e, C2347b.CHECKMARK);
            fVar.setSelected(true);
            linearLayout2.addView(fVar, new LayoutParams(-2, -2));
        }
        View footerView = getFooterView();
        C2342x.m9081a((View) linearLayout);
        C2342x.m9081a((View) linearLayout2);
        C2342x.m9081a(footerView);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(10);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams6.addRule(13);
        layoutParams6.addRule(3, linearLayout.getId());
        layoutParams6.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams7.addRule(12);
        layoutParams7.setMargins(f6004a, 0, f6004a, f6004a);
        addView(linearLayout, layoutParams5);
        addView(linearLayout2, layoutParams6);
        addView(footerView, layoutParams7);
        if (!aVar.f6031l) {
            i = 8;
        }
        footerView.setVisibility(i);
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(C2348c.m9100a(C2347b.SETTINGS));
        imageView.setColorFilter(-13272859);
        LayoutParams layoutParams = new LayoutParams(f6013j, f6013j);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        C2342x.m9089a(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(f6005b, f6005b, f6005b, f6005b);
        textView.setText(C1710a.m7138h(getContext()));
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C1912a.this.f6014k != null) {
                    C1912a.this.f6014k.mo7987c();
                }
            }
        });
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}
