package com.facebook.ads.internal.view.p100b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;
import com.google.android.exoplayer2.C2793C;
import java.util.List;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.b.a */
public class C1951a extends LinearLayout {

    /* renamed from: a */
    private static final int f6128a = Color.rgb(224, 224, 224);

    /* renamed from: b */
    private static final Uri f6129b = Uri.parse("http://www.facebook.com");

    /* renamed from: c */
    private static final OnTouchListener f6130c = new OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    C2342x.m9082a(view, C1951a.f6131d);
                    return false;
                case 1:
                    C2342x.m9082a(view, 0);
                    return false;
                default:
                    return false;
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int f6131d = Color.argb(34, 0, 0, 0);

    /* renamed from: e */
    private ImageView f6132e;

    /* renamed from: f */
    private C1961e f6133f;

    /* renamed from: g */
    private ImageView f6134g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1955a f6135h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f6136i;

    /* renamed from: com.facebook.ads.internal.view.b.a$a */
    public interface C1955a {
        /* renamed from: a */
        void mo8013a();
    }

    public C1951a(Context context) {
        super(context);
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (50.0f * f);
        int i2 = (int) (4.0f * f);
        C2342x.m9082a((View) this, -1);
        setGravity(16);
        this.f6132e = new ImageView(context);
        this.f6132e.setContentDescription("Close");
        LayoutParams layoutParams = new LayoutParams(i, i);
        this.f6132e.setScaleType(ScaleType.CENTER);
        this.f6132e.setImageBitmap(C2348c.m9100a(C2347b.BROWSER_CLOSE));
        this.f6132e.setOnTouchListener(f6130c);
        this.f6132e.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C1951a.this.f6135h != null) {
                    C1951a.this.f6135h.mo8013a();
                }
            }
        });
        addView(this.f6132e, layoutParams);
        this.f6133f = new C1961e(context);
        LayoutParams layoutParams2 = new LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.f6133f.setPadding(0, i2, 0, i2);
        addView(this.f6133f, layoutParams2);
        this.f6134g = new ImageView(context);
        LayoutParams layoutParams3 = new LayoutParams(i, i);
        this.f6134g.setContentDescription("Open native browser");
        this.f6134g.setScaleType(ScaleType.CENTER);
        this.f6134g.setOnTouchListener(f6130c);
        this.f6134g.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!TextUtils.isEmpty(C1951a.this.f6136i) && !"about:blank".equals(C1951a.this.f6136i)) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C1951a.this.f6136i));
                    intent.addFlags(268435456);
                    C1951a.this.getContext().startActivity(intent);
                }
            }
        });
        addView(this.f6134g, layoutParams3);
        setupDefaultNativeBrowser(context);
    }

    private void setupDefaultNativeBrowser(Context context) {
        Bitmap bitmap;
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", f6129b), C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (queryIntentActivities.size() == 0) {
            this.f6134g.setVisibility(8);
            bitmap = null;
        } else {
            bitmap = C2348c.m9100a((queryIntentActivities.size() != 1 || !"com.android.chrome".equals(((ResolveInfo) queryIntentActivities.get(0)).activityInfo.packageName)) ? C2347b.BROWSER_LAUNCH_NATIVE : C2347b.BROWSER_LAUNCH_CHROME);
        }
        this.f6134g.setImageBitmap(bitmap);
    }

    public void setListener(C1955a aVar) {
        this.f6135h = aVar;
    }

    public void setTitle(String str) {
        this.f6133f.setTitle(str);
    }

    public void setUrl(String str) {
        this.f6136i = str;
        if (TextUtils.isEmpty(str) || "about:blank".equals(str)) {
            this.f6133f.setSubtitle(null);
            this.f6134g.setEnabled(false);
            this.f6134g.setColorFilter(new PorterDuffColorFilter(f6128a, Mode.SRC_IN));
            return;
        }
        this.f6133f.setSubtitle(str);
        this.f6134g.setEnabled(true);
        this.f6134g.setColorFilter(null);
    }
}
