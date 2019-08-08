package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.component.j */
public class C2030j extends LinearLayout {

    /* renamed from: a */
    private static final float f6411a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static final int f6412b = ((int) (6.0f * f6411a));

    /* renamed from: c */
    private static final int f6413c = ((int) (8.0f * f6411a));

    /* renamed from: d */
    private final TextView f6414d;

    /* renamed from: e */
    private final TextView f6415e;

    /* renamed from: f */
    private final TextView f6416f;

    public C2030j(Context context, C1597h hVar, boolean z, int i, int i2, int i3) {
        super(context);
        setOrientation(1);
        this.f6414d = new TextView(context);
        C2342x.m9089a(this.f6414d, true, i);
        this.f6414d.setTextColor(hVar.mo7173c(z));
        this.f6414d.setEllipsize(TruncateAt.END);
        this.f6414d.setLineSpacing((float) f6412b, 1.0f);
        this.f6416f = new TextView(context);
        this.f6416f.setTextColor(hVar.mo7170a(z));
        this.f6415e = new TextView(context);
        C2342x.m9089a(this.f6415e, false, i2);
        this.f6415e.setTextColor(hVar.mo7172b(z));
        this.f6415e.setEllipsize(TruncateAt.END);
        this.f6415e.setLineSpacing((float) f6412b, 1.0f);
        addView(this.f6414d, new LayoutParams(-1, -2));
        addView(this.f6416f, new LayoutParams(-1, -2));
        this.f6416f.setVisibility(8);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.setMargins(0, i3, 0, 0);
        addView(this.f6415e, layoutParams);
    }

    public C2030j(Context context, C1597h hVar, boolean z, boolean z2, boolean z3) {
        this(context, hVar, z, z2 ? 18 : 22, z2 ? 14 : 16, z3 ? f6413c / 2 : f6413c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r9 != false) goto L_0x0048;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8234a(java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            r2 = r2 ^ r1
            android.widget.TextView r3 = r4.f6414d
            if (r0 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r5 = r6
        L_0x0011:
            r3.setText(r5)
            if (r7 == 0) goto L_0x001b
            android.widget.TextView r5 = r4.f6416f
            r5.setText(r7)
        L_0x001b:
            android.widget.TextView r5 = r4.f6415e
            if (r0 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            java.lang.String r6 = ""
        L_0x0022:
            r5.setText(r6)
            r5 = 3
            r6 = 2
            if (r0 == 0) goto L_0x003f
            if (r2 != 0) goto L_0x002c
            goto L_0x003f
        L_0x002c:
            android.widget.TextView r7 = r4.f6414d
            if (r8 == 0) goto L_0x0032
            r0 = r1
            goto L_0x0033
        L_0x0032:
            r0 = r6
        L_0x0033:
            r7.setMaxLines(r0)
            android.widget.TextView r7 = r4.f6415e
            if (r8 == 0) goto L_0x003c
            r5 = r1
            goto L_0x0048
        L_0x003c:
            if (r9 == 0) goto L_0x0043
            goto L_0x0048
        L_0x003f:
            android.widget.TextView r7 = r4.f6414d
            if (r8 == 0) goto L_0x0045
        L_0x0043:
            r5 = r6
            goto L_0x0048
        L_0x0045:
            if (r9 == 0) goto L_0x0048
            r5 = 4
        L_0x0048:
            r7.setMaxLines(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.component.C2030j.mo8234a(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* renamed from: a */
    public void mo8235a(boolean z, int i) {
        TextView textView;
        int i2;
        if (z) {
            this.f6416f.setGravity(i);
            textView = this.f6416f;
            i2 = 0;
        } else {
            textView = this.f6416f;
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public TextView getDescriptionTextView() {
        return this.f6415e;
    }

    public TextView getTitleTextView() {
        return this.f6414d;
    }

    public void setAlignment(int i) {
        this.f6414d.setGravity(i);
        this.f6415e.setGravity(i);
    }

    public void setDescriptionGravity(int i) {
        this.f6415e.setGravity(i);
    }

    public void setTitleGravity(int i) {
        this.f6414d.setGravity(i);
    }
}
