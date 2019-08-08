package com.facebook.ads.internal.view.p100b;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.b.e */
public class C1961e extends LinearLayout {

    /* renamed from: a */
    private TextView f6161a = new TextView(getContext());

    /* renamed from: b */
    private TextView f6162b;

    /* renamed from: c */
    private Drawable f6163c;

    public C1961e(Context context) {
        super(context);
        float f = getResources().getDisplayMetrics().density;
        setOrientation(1);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        this.f6161a.setTextColor(-16777216);
        this.f6161a.setTextSize(2, 20.0f);
        this.f6161a.setEllipsize(TruncateAt.END);
        this.f6161a.setSingleLine(true);
        this.f6161a.setVisibility(8);
        addView(this.f6161a, layoutParams);
        this.f6162b = new TextView(getContext());
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        this.f6162b.setAlpha(0.5f);
        this.f6162b.setTextColor(-16777216);
        this.f6162b.setTextSize(2, 15.0f);
        this.f6162b.setCompoundDrawablePadding((int) (5.0f * f));
        this.f6162b.setEllipsize(TruncateAt.END);
        this.f6162b.setSingleLine(true);
        this.f6162b.setVisibility(8);
        addView(this.f6162b, layoutParams2);
    }

    private Drawable getPadlockDrawable() {
        if (this.f6163c == null) {
            this.f6163c = new BitmapDrawable(getContext().getResources(), C2348c.m9100a(C2347b.BROWSER_PADLOCK));
        }
        return this.f6163c;
    }

    public void setSubtitle(String str) {
        TextView textView;
        int i;
        if (TextUtils.isEmpty(str)) {
            this.f6162b.setText(null);
            textView = this.f6162b;
            i = 8;
        } else {
            Uri parse = Uri.parse(str);
            this.f6162b.setText(parse.getHost());
            this.f6162b.setCompoundDrawablesRelativeWithIntrinsicBounds("https".equals(parse.getScheme()) ? getPadlockDrawable() : null, null, null, null);
            textView = this.f6162b;
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setTitle(String str) {
        TextView textView;
        int i;
        if (TextUtils.isEmpty(str)) {
            this.f6161a.setText(null);
            textView = this.f6161a;
            i = 8;
        } else {
            this.f6161a.setText(str);
            textView = this.f6161a;
            i = 0;
        }
        textView.setVisibility(i);
    }
}
