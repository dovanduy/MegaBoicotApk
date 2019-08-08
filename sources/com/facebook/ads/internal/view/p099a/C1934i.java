package com.facebook.ads.internal.view.p099a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;

/* renamed from: com.facebook.ads.internal.view.a.i */
public class C1934i extends LinearLayout {

    /* renamed from: a */
    public static final LayoutParams f6078a = new LayoutParams(-1, -2);

    /* renamed from: b */
    private static final int f6079b = ((int) (8.0f * C2342x.f7369b));

    /* renamed from: c */
    private static final int f6080c = ((int) (14.5d * ((double) C2342x.f7369b)));

    /* renamed from: d */
    private static final int f6081d = ((int) (20.0f * C2342x.f7369b));

    /* renamed from: e */
    private final LinearLayout f6082e;

    /* renamed from: f */
    private final ImageView f6083f;

    /* renamed from: g */
    private final TextView f6084g;

    public C1934i(Context context) {
        super(context);
        this.f6083f = new ImageView(context);
        this.f6083f.setColorFilter(-10459280);
        LayoutParams layoutParams = new LayoutParams(f6081d, f6081d);
        layoutParams.gravity = 16;
        this.f6083f.setLayoutParams(layoutParams);
        this.f6082e = new LinearLayout(context);
        this.f6082e.setOrientation(1);
        this.f6082e.setPadding(f6079b * 2, 0, 0, 0);
        this.f6082e.setLayoutParams(f6078a);
        this.f6084g = new TextView(context);
        C2342x.m9089a(this.f6084g, true, 16);
        this.f6084g.setTextColor(-14934495);
        this.f6082e.addView(this.f6084g, f6078a);
        setOrientation(0);
        addView(this.f6083f);
        addView(this.f6082e);
    }

    /* renamed from: a */
    public void mo8002a(C2347b bVar, String str, String str2) {
        int i;
        int i2;
        this.f6083f.setImageBitmap(C2348c.m9100a(bVar));
        this.f6084g.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = new TextView(getContext());
            C2342x.m9089a(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.f6082e.addView(textView, f6078a);
            i = f6079b;
            i2 = f6079b;
        } else {
            i = f6080c;
            i2 = f6080c;
        }
        setPadding(0, i, 0, i2);
    }
}
