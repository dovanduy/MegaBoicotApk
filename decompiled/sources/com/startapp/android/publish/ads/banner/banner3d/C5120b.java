package com.startapp.android.publish.ads.banner.banner3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.Point;
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
import com.startapp.android.publish.ads.banner.banner3d.Banner3DSize.Size;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.p165a.C5079b;
import com.startapp.common.p193a.C5509c;

/* renamed from: com.startapp.android.publish.ads.banner.banner3d.b */
/* compiled from: StartAppSDK */
public class C5120b extends RelativeLayout {

    /* renamed from: a */
    private TextView f16495a;

    /* renamed from: b */
    private TextView f16496b;

    /* renamed from: c */
    private ImageView f16497c;

    /* renamed from: d */
    private C5079b f16498d;

    /* renamed from: e */
    private TextView f16499e;

    /* renamed from: f */
    private Point f16500f;

    /* renamed from: com.startapp.android.publish.ads.banner.banner3d.b$a */
    /* compiled from: StartAppSDK */
    private enum C5123a {
        XS,
        S,
        M,
        L,
        XL
    }

    public C5120b(Context context, Point point) {
        super(context);
        this.f16500f = point;
        m22058a();
    }

    /* renamed from: a */
    private void m22058a() {
        int i;
        int i2;
        Context context = getContext();
        C5123a templateBySize = getTemplateBySize();
        setBackgroundDrawable(new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{C5344b.m22784a().mo19778n(), C5344b.m22784a().mo19779o()}));
        setLayoutParams(new LayoutParams(-2, -2));
        int a = C5306h.m22641a(context, 2);
        int a2 = C5306h.m22641a(context, 3);
        C5306h.m22641a(context, 4);
        int a3 = C5306h.m22641a(context, 5);
        int a4 = C5306h.m22641a(context, 6);
        int a5 = C5306h.m22641a(context, 8);
        C5306h.m22641a(context, 10);
        int a6 = C5306h.m22641a(context, 20);
        C5306h.m22641a(context, 84);
        int a7 = C5306h.m22641a(context, 90);
        setPadding(a3, 0, a3, 0);
        setTag(this);
        this.f16497c = new ImageView(context);
        this.f16497c.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a7, a7);
        layoutParams.addRule(15);
        this.f16497c.setLayoutParams(layoutParams);
        this.f16495a = new TextView(context);
        this.f16495a.setId(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(C5509c.m23496a(17), 1);
        layoutParams2.addRule(14);
        this.f16495a.setLayoutParams(layoutParams2);
        this.f16495a.setTextColor(C5344b.m22784a().mo19781q().intValue());
        this.f16495a.setGravity(C5509c.m23496a(8388611));
        this.f16495a.setBackgroundColor(0);
        switch (templateBySize) {
            case XS:
            case S:
                this.f16495a.setTextSize(17.0f);
                this.f16495a.setPadding(a2, 0, 0, a);
                layoutParams2.width = C5306h.m22641a(getContext(), (int) (((double) this.f16500f.x) * 0.55d));
                break;
            case M:
                this.f16495a.setTextSize(17.0f);
                this.f16495a.setPadding(a2, 0, 0, a);
                layoutParams2.width = C5306h.m22641a(getContext(), (int) (((double) this.f16500f.x) * 0.65d));
                break;
            case L:
            case XL:
                this.f16495a.setTextSize(22.0f);
                this.f16495a.setPadding(a2, 0, 0, a3);
                break;
        }
        this.f16495a.setSingleLine(true);
        this.f16495a.setEllipsize(TruncateAt.END);
        C5306h.m22649a(this.f16495a, C5344b.m22784a().mo19782r());
        this.f16496b = new TextView(context);
        this.f16496b.setId(3);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(C5509c.m23496a(17), 1);
        layoutParams3.addRule(3, 2);
        layoutParams3.setMargins(0, 0, 0, a3);
        this.f16496b.setLayoutParams(layoutParams3);
        this.f16496b.setTextColor(C5344b.m22784a().mo19784t().intValue());
        this.f16496b.setTextSize(18.0f);
        this.f16496b.setMaxLines(2);
        this.f16496b.setLines(2);
        this.f16496b.setSingleLine(false);
        this.f16496b.setEllipsize(TruncateAt.MARQUEE);
        this.f16496b.setHorizontallyScrolling(true);
        this.f16496b.setPadding(a2, 0, 0, 0);
        this.f16498d = new C5079b(getContext());
        this.f16498d.setId(5);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        switch (templateBySize) {
            case XS:
            case S:
            case M:
                i2 = a2;
                layoutParams4.addRule(C5509c.m23496a(17), 1);
                layoutParams4.addRule(8, 1);
                break;
            case L:
            case XL:
                layoutParams4.addRule(C5509c.m23496a(17), 2);
                i2 = a2;
                layoutParams3.width = C5306h.m22641a(getContext(), (int) (((double) this.f16500f.x) * 0.6d));
                break;
            default:
                i = a2;
                break;
        }
        i = i2;
        layoutParams4.setMargins(i, a5, i, 0);
        this.f16498d.setLayoutParams(layoutParams4);
        this.f16499e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        switch (templateBySize) {
            case XS:
            case S:
            case M:
                this.f16499e.setTextSize(13.0f);
                layoutParams5.addRule(C5509c.m23496a(17), 2);
                layoutParams5.addRule(15);
                break;
            case L:
                layoutParams5.addRule(C5509c.m23496a(17), 3);
                layoutParams5.addRule(15);
                layoutParams5.setMargins(a6, 0, 0, 0);
                this.f16499e.setTextSize(26.0f);
                break;
            case XL:
                layoutParams5.addRule(C5509c.m23496a(17), 3);
                layoutParams5.addRule(15);
                layoutParams5.setMargins(a6 * 7, 0, 0, 0);
                this.f16499e.setTextSize(26.0f);
                break;
        }
        this.f16499e.setPadding(a4, a4, a4, a4);
        this.f16499e.setLayoutParams(layoutParams5);
        setButtonText(false);
        this.f16499e.setTextColor(-1);
        this.f16499e.setTypeface(null, 1);
        this.f16499e.setId(4);
        this.f16499e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f16499e.setBackgroundDrawable(new ShapeDrawable(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)) {
            /* access modifiers changed from: protected */
            public void onDraw(Shape shape, Canvas canvas, Paint paint) {
                paint.setColor(-11363070);
                paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
                super.onDraw(shape, canvas, paint);
            }
        });
        addView(this.f16497c);
        addView(this.f16495a);
        switch (templateBySize) {
            case XS:
            case S:
            case M:
                addView(this.f16499e);
                break;
            case L:
            case XL:
                addView(this.f16499e);
                addView(this.f16496b);
                break;
        }
        addView(this.f16498d);
    }

    public void setText(String str) {
        this.f16495a.setText(str);
    }

    public void setImage(Bitmap bitmap) {
        this.f16497c.setImageBitmap(bitmap);
    }

    /* renamed from: a */
    public void mo18897a(int i, int i2, int i3) {
        this.f16497c.setImageResource(i);
        LayoutParams layoutParams = this.f16497c.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        this.f16497c.setLayoutParams(layoutParams);
    }

    public void setRating(float f) {
        try {
            this.f16498d.setRating(f);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: a */
    public void mo18898a(Bitmap bitmap, int i, int i2) {
        this.f16497c.setImageBitmap(bitmap);
        LayoutParams layoutParams = this.f16497c.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f16497c.setLayoutParams(layoutParams);
    }

    public void setDescription(String str) {
        if (str != null && str.compareTo("") != 0) {
            String[] a = m22059a(str);
            String str2 = a[0];
            String str3 = "";
            if (a[1] != null) {
                str3 = m22059a(a[1])[0];
            }
            if (str.length() >= 110) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append("...");
                str3 = sb.toString();
            }
            TextView textView = this.f16496b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("\n");
            sb2.append(str3);
            textView.setText(sb2.toString());
        }
    }

    /* renamed from: a */
    private String[] m22059a(String str) {
        boolean z;
        String[] strArr = new String[2];
        int i = 55;
        if (str.length() > 55) {
            char[] charArray = str.substring(0, 55).toCharArray();
            int length = charArray.length - 1;
            int i2 = length - 1;
            while (true) {
                if (i2 <= 0) {
                    z = false;
                    break;
                } else if (charArray[i2] == ' ') {
                    z = true;
                    length = i2;
                    break;
                } else {
                    i2--;
                }
            }
            if (z) {
                i = length;
            }
            strArr[0] = str.substring(0, i);
            strArr[1] = str.substring(i + 1, str.length());
        } else {
            strArr[0] = str;
            strArr[1] = null;
        }
        return strArr;
    }

    private C5123a getTemplateBySize() {
        C5123a aVar = C5123a.S;
        if (this.f16500f.x > Size.SMALL.getSize().mo18956a() || this.f16500f.y > Size.SMALL.getSize().mo18959b()) {
            aVar = C5123a.M;
        }
        if (this.f16500f.x > Size.MEDIUM.getSize().mo18956a() || this.f16500f.y > Size.MEDIUM.getSize().mo18959b()) {
            aVar = C5123a.L;
        }
        return (this.f16500f.x > Size.LARGE.getSize().mo18956a() || this.f16500f.y > Size.LARGE.getSize().mo18959b()) ? C5123a.XL : aVar;
    }

    public void setButtonText(boolean z) {
        if (z) {
            this.f16499e.setText("OPEN");
        } else {
            this.f16499e.setText("DOWNLOAD");
        }
    }
}
