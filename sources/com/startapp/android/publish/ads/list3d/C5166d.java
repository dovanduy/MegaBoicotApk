package com.startapp.android.publish.ads.list3d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.common.metaData.MetaDataStyle;
import com.startapp.android.publish.p165a.C5079b;
import com.startapp.common.p193a.C5509c;

/* renamed from: com.startapp.android.publish.ads.list3d.d */
/* compiled from: StartAppSDK */
public class C5166d {

    /* renamed from: a */
    private RelativeLayout f16632a;

    /* renamed from: b */
    private ImageView f16633b;

    /* renamed from: c */
    private TextView f16634c;

    /* renamed from: d */
    private TextView f16635d;

    /* renamed from: e */
    private TextView f16636e;

    /* renamed from: f */
    private C5079b f16637f;

    /* renamed from: g */
    private MetaDataStyle f16638g = null;

    public C5166d(Context context) {
        Context context2 = context;
        context2.setTheme(16973829);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        this.f16632a = new RelativeLayout(context2);
        this.f16632a.setBackgroundDrawable(new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{C5344b.m22784a().mo19778n(), C5344b.m22784a().mo19779o()}));
        this.f16632a.setLayoutParams(layoutParams);
        int a = C5306h.m22641a(context2, 3);
        int a2 = C5306h.m22641a(context2, 4);
        int a3 = C5306h.m22641a(context2, 5);
        int a4 = C5306h.m22641a(context2, 6);
        int a5 = C5306h.m22641a(context2, 10);
        int a6 = C5306h.m22641a(context2, 84);
        this.f16632a.setPadding(a5, a, a5, a);
        this.f16632a.setTag(this);
        this.f16633b = new ImageView(context2);
        this.f16633b.setId(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a6, a6);
        layoutParams2.addRule(15);
        this.f16633b.setLayoutParams(layoutParams2);
        this.f16633b.setPadding(0, 0, a4, 0);
        this.f16634c = new TextView(context2);
        this.f16634c.setId(2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(C5509c.m23496a(17), 1);
        layoutParams3.addRule(6, 1);
        this.f16634c.setLayoutParams(layoutParams3);
        this.f16634c.setPadding(0, 0, 0, a3);
        this.f16634c.setTextColor(C5344b.m22784a().mo19781q().intValue());
        this.f16634c.setTextSize((float) C5344b.m22784a().mo19780p().intValue());
        this.f16634c.setSingleLine(true);
        this.f16634c.setEllipsize(TruncateAt.END);
        C5306h.m22649a(this.f16634c, C5344b.m22784a().mo19782r());
        this.f16635d = new TextView(context2);
        this.f16635d.setId(3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(C5509c.m23496a(17), 1);
        layoutParams4.addRule(3, 2);
        layoutParams4.setMargins(0, 0, 0, a3);
        this.f16635d.setLayoutParams(layoutParams4);
        this.f16635d.setTextColor(C5344b.m22784a().mo19784t().intValue());
        this.f16635d.setTextSize((float) C5344b.m22784a().mo19783s().intValue());
        this.f16635d.setSingleLine(true);
        this.f16635d.setEllipsize(TruncateAt.END);
        C5306h.m22649a(this.f16635d, C5344b.m22784a().mo19785u());
        this.f16637f = new C5079b(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(C5509c.m23496a(17), 1);
        layoutParams5.addRule(8, 1);
        layoutParams5.setMargins(0, 0, 0, -a3);
        this.f16637f.setLayoutParams(layoutParams5);
        this.f16637f.setPadding(0, 0, 0, a2);
        this.f16637f.setId(5);
        this.f16636e = new TextView(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(C5509c.m23496a(21));
        layoutParams6.addRule(8, 1);
        this.f16636e.setLayoutParams(layoutParams6);
        mo19061a(false);
        this.f16636e.setTextColor(-1);
        this.f16636e.setTextSize(12.0f);
        this.f16636e.setTypeface(null, 1);
        this.f16636e.setPadding(a5, a4, a5, a4);
        this.f16636e.setId(4);
        this.f16636e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f16636e.setBackgroundDrawable(new ShapeDrawable(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)) {
            /* access modifiers changed from: protected */
            public void onDraw(Shape shape, Canvas canvas, Paint paint) {
                paint.setColor(-11363070);
                paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
                super.onDraw(shape, canvas, paint);
            }
        });
        this.f16632a.addView(this.f16633b);
        this.f16632a.addView(this.f16634c);
        this.f16632a.addView(this.f16635d);
        this.f16632a.addView(this.f16637f);
        this.f16632a.addView(this.f16636e);
    }

    /* renamed from: a */
    public RelativeLayout mo19059a() {
        return this.f16632a;
    }

    /* renamed from: b */
    public ImageView mo19062b() {
        return this.f16633b;
    }

    /* renamed from: c */
    public TextView mo19063c() {
        return this.f16634c;
    }

    /* renamed from: d */
    public TextView mo19064d() {
        return this.f16635d;
    }

    /* renamed from: e */
    public C5079b mo19065e() {
        return this.f16637f;
    }

    /* renamed from: a */
    public void mo19061a(boolean z) {
        if (z) {
            this.f16636e.setText("Open");
        } else {
            this.f16636e.setText("Download");
        }
    }

    /* renamed from: a */
    public void mo19060a(MetaDataStyle metaDataStyle) {
        if (this.f16638g != metaDataStyle) {
            this.f16638g = metaDataStyle;
            this.f16632a.setBackgroundDrawable(new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{metaDataStyle.getItemGradientTop().intValue(), metaDataStyle.getItemGradientBottom().intValue()}));
            this.f16634c.setTextSize((float) metaDataStyle.getItemTitleTextSize().intValue());
            this.f16634c.setTextColor(metaDataStyle.getItemTitleTextColor().intValue());
            C5306h.m22649a(this.f16634c, metaDataStyle.getItemTitleTextDecoration());
            this.f16635d.setTextSize((float) metaDataStyle.getItemDescriptionTextSize().intValue());
            this.f16635d.setTextColor(metaDataStyle.getItemDescriptionTextColor().intValue());
            C5306h.m22649a(this.f16635d, metaDataStyle.getItemDescriptionTextDecoration());
        }
    }
}
