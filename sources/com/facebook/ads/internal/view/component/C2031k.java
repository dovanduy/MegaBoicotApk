package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p072b.C1591e.C1593a;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.p099a.C1916b;

/* renamed from: com.facebook.ads.internal.view.component.k */
public class C2031k extends LinearLayout {

    /* renamed from: a */
    private static final int f6417a = ((int) (14.0f * C2342x.f7369b));

    /* renamed from: b */
    private static final int f6418b = ((int) (C2342x.f7369b * 8.0f));

    /* renamed from: c */
    private static final int f6419c = ((int) (10.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f6420d = ((int) (8.0f * C2342x.f7369b));

    /* renamed from: e */
    private static final int f6421e = ((int) (17.0f * C2342x.f7369b));

    /* renamed from: f */
    private TextView f6422f = new TextView(getContext());

    /* renamed from: g */
    private TextView f6423g;

    /* renamed from: h */
    private TextView f6424h;

    /* renamed from: i */
    private TextView f6425i;

    /* renamed from: j */
    private ImageView f6426j;

    /* renamed from: k */
    private ImageView f6427k;

    /* renamed from: l */
    private TextView f6428l;

    /* renamed from: m */
    private TextView f6429m;

    /* renamed from: n */
    private TextView f6430n;

    /* renamed from: o */
    private LinearLayout f6431o;

    /* renamed from: p */
    private final LinearLayout f6432p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final String f6433q;

    /* renamed from: r */
    private final C1593a f6434r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1911a f6435s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C1916b f6436t;

    public C2031k(Context context, String str, C1593a aVar, C1911a aVar2) {
        super(context);
        setOrientation(1);
        this.f6433q = str;
        this.f6434r = aVar;
        this.f6435s = aVar2;
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.topMargin = f6418b;
        this.f6422f.setLayoutParams(layoutParams);
        addView(this.f6422f);
        this.f6432p = new LinearLayout(context);
        this.f6432p.setOrientation(0);
        this.f6432p.setGravity(16);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.topMargin = f6418b / 2;
        addView(this.f6432p, layoutParams2);
        LinearLayout linearLayout = this.f6432p;
        this.f6424h = new TextView(getContext());
        LayoutParams layoutParams3 = new LayoutParams(-2, -2);
        layoutParams3.leftMargin = f6418b / 2;
        this.f6424h.setLayoutParams(layoutParams3);
        this.f6426j = new ImageView(getContext());
        this.f6426j.setScaleType(ScaleType.FIT_CENTER);
        this.f6426j.setColorFilter(-1);
        this.f6426j.setImageBitmap(C2348c.m9100a(C2347b.RATINGS));
        linearLayout.addView(this.f6426j, new LayoutParams(f6417a, f6417a));
        linearLayout.addView(this.f6424h);
        this.f6428l = m8302a();
        this.f6432p.addView(this.f6428l);
        LinearLayout linearLayout2 = this.f6432p;
        this.f6425i = new TextView(getContext());
        this.f6425i.setEllipsize(TruncateAt.END);
        this.f6425i.setMaxLines(1);
        LayoutParams layoutParams4 = new LayoutParams(-2, -2);
        layoutParams4.leftMargin = f6418b / 2;
        this.f6425i.setLayoutParams(layoutParams4);
        this.f6427k = new ImageView(getContext());
        this.f6427k.setScaleType(ScaleType.FIT_CENTER);
        this.f6427k.setColorFilter(-1);
        this.f6427k.setImageBitmap(C2348c.m9100a(this.f6434r.equals(C1593a.CONTEXTUAL_APP) ? C2347b.GOOGLE : C2347b.GLOBE));
        linearLayout2.addView(this.f6427k, new LayoutParams(f6417a, f6417a));
        linearLayout2.addView(this.f6425i);
        this.f6430n = m8302a();
        this.f6432p.addView(this.f6430n);
        LinearLayout linearLayout3 = this.f6432p;
        this.f6423g = new TextView(getContext());
        this.f6423g.setEllipsize(TruncateAt.END);
        this.f6423g.setMaxLines(1);
        this.f6423g.setLayoutParams(new LayoutParams(-2, -2));
        linearLayout3.addView(this.f6423g);
        this.f6429m = m8302a();
        this.f6432p.addView(this.f6429m);
        LinearLayout linearLayout4 = this.f6432p;
        this.f6431o = new LinearLayout(getContext());
        this.f6431o.setOrientation(0);
        this.f6431o.setGravity(16);
        linearLayout4.addView(this.f6431o, new LayoutParams(-2, -1));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(C2348c.m9100a(C2347b.INFO_ICON));
        imageView.setColorFilter(-1);
        this.f6431o.addView(imageView, new LayoutParams(f6417a, f6417a));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageBitmap(C2348c.m9100a(C2347b.AD_CHOICES_ICON));
        imageView2.setColorFilter(-1);
        LayoutParams layoutParams5 = new LayoutParams(f6417a, f6417a);
        layoutParams5.leftMargin = f6419c;
        this.f6431o.addView(imageView2, layoutParams5);
        this.f6431o.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C2031k.this.f6435s.mo6797a(C2031k.this.f6433q, false, C2031k.this.f6436t);
            }
        });
        C2342x.m9084a(this, this.f6431o, f6420d, f6421e);
    }

    /* renamed from: a */
    private TextView m8302a() {
        TextView textView = new TextView(getContext());
        textView.setText("·");
        textView.setTextColor(-1);
        C2342x.m9089a(textView, false, 14);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        layoutParams.leftMargin = f6418b;
        layoutParams.rightMargin = f6418b;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    /* renamed from: a */
    public void mo8241a(String str, boolean z, int i, int i2) {
        this.f6422f.setText(str);
        this.f6422f.setTextColor(i2);
        C2342x.m9089a(this.f6422f, z, i);
        this.f6422f.setMaxLines(2);
        this.f6422f.setEllipsize(TruncateAt.END);
    }

    /* renamed from: a */
    public void mo8242a(boolean z) {
        TextView textView;
        if (z) {
            if (!TextUtils.isEmpty(this.f6424h.getText())) {
                this.f6426j.setVisibility(0);
                this.f6424h.setVisibility(0);
                this.f6428l.setVisibility(0);
            }
            if (!TextUtils.isEmpty(this.f6423g.getText())) {
                this.f6423g.setVisibility(0);
                this.f6429m.setVisibility(0);
            }
            this.f6427k.setVisibility(8);
            this.f6425i.setVisibility(8);
            textView = this.f6430n;
        } else {
            if (!TextUtils.isEmpty(this.f6425i.getText())) {
                this.f6427k.setVisibility(0);
                this.f6425i.setVisibility(0);
                this.f6430n.setVisibility(0);
            }
            this.f6426j.setVisibility(8);
            this.f6424h.setVisibility(8);
            this.f6428l.setVisibility(8);
            this.f6423g.setVisibility(8);
            textView = this.f6429m;
        }
        textView.setVisibility(8);
    }

    /* renamed from: b */
    public void mo8243b(String str, boolean z, int i, int i2) {
        this.f6424h.setText(str);
        this.f6424h.setTextColor(i2);
        C2342x.m9089a(this.f6424h, z, i);
        int i3 = 0;
        this.f6426j.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        this.f6424h.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        TextView textView = this.f6428l;
        if (TextUtils.isEmpty(str)) {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    /* renamed from: c */
    public void mo8244c(String str, boolean z, int i, int i2) {
        this.f6425i.setText(str);
        this.f6425i.setTextColor(i2);
        C2342x.m9089a(this.f6425i, z, i);
        int i3 = 0;
        this.f6427k.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        this.f6425i.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        TextView textView = this.f6430n;
        if (TextUtils.isEmpty(str)) {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    /* renamed from: d */
    public void mo8245d(String str, boolean z, int i, int i2) {
        this.f6423g.setText(str);
        this.f6423g.setTextColor(i2);
        C2342x.m9089a(this.f6423g, z, i);
        int i3 = 0;
        this.f6423g.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        TextView textView = this.f6429m;
        if (TextUtils.isEmpty(str)) {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int size = MeasureSpec.getSize(0);
            this.f6432p.measure(size, size);
            int measuredWidth = this.f6432p.getMeasuredWidth();
            int i5 = measuredWidth - i3;
            if (i5 > 0) {
                this.f6425i.setMaxWidth(this.f6425i.getWidth() - i5);
                this.f6423g.setMaxWidth(this.f6423g.getWidth() - i5);
                return;
            }
            this.f6425i.setMaxWidth(measuredWidth);
            this.f6423g.setMaxWidth(measuredWidth);
        }
    }

    public void setAdReportingFlowListener(C1916b bVar) {
        this.f6436t = bVar;
    }
}
