package com.facebook.ads.internal.view.p099a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p079f.C1713c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;

/* renamed from: com.facebook.ads.internal.view.a.j */
public class C1935j extends LinearLayout {

    /* renamed from: a */
    private static final int f6085a = ((int) (40.0f * C2342x.f7369b));

    /* renamed from: b */
    private static final int f6086b = ((int) (20.0f * C2342x.f7369b));

    /* renamed from: c */
    private static final int f6087c = ((int) (10.0f * C2342x.f7369b));

    /* renamed from: d */
    private final C1713c f6088d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1920e f6089e;

    C1935j(Context context, C1713c cVar, C1920e eVar, C2347b bVar) {
        this(context, cVar, eVar, null, bVar);
    }

    C1935j(Context context, C1713c cVar, C1920e eVar, String str, C2347b bVar) {
        super(context);
        this.f6088d = cVar;
        this.f6089e = eVar;
        setOrientation(1);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            ImageView imageView = new ImageView(getContext());
            imageView.setColorFilter(-10459280);
            imageView.setImageBitmap(C2348c.m9100a(C2347b.BACK_ARROW));
            imageView.setPadding(0, f6087c, f6087c * 2, f6087c);
            LayoutParams layoutParams2 = new LayoutParams(f6085a, f6085a);
            imageView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C1935j.this.f6089e.mo7982a();
                }
            });
            TextView textView = new TextView(getContext());
            textView.setGravity(17);
            textView.setText(str);
            C2342x.m9089a(textView, true, 16);
            textView.setTextColor(-14934495);
            LayoutParams layoutParams3 = new LayoutParams(-1, -2);
            layoutParams3.setMargins(0, 0, f6085a, 0);
            layoutParams3.gravity = 17;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.addView(imageView, layoutParams2);
            linearLayout.addView(textView, layoutParams3);
            linearLayout.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LayoutParams(-1, 1));
            C2342x.m9082a(view, -10459280);
            addView(linearLayout, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.f6088d.mo7480c())) {
            String c = this.f6088d.mo7480c();
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setColorFilter(-10459280);
            LayoutParams layoutParams4 = new LayoutParams(f6086b, f6086b);
            layoutParams4.gravity = 16;
            imageView2.setImageBitmap(C2348c.m9100a(bVar));
            TextView textView2 = new TextView(getContext());
            C2342x.m9089a(textView2, true, 14);
            textView2.setTextColor(-10459280);
            LayoutParams layoutParams5 = new LayoutParams(-1, -2);
            textView2.setText(c);
            textView2.setPadding(f6087c, 0, 0, 0);
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.addView(imageView2, layoutParams4);
            linearLayout2.addView(textView2, layoutParams5);
            linearLayout2.setPadding(0, f6087c, 0, f6087c);
            addView(linearLayout2, layoutParams);
        }
        View a = m8057a();
        a.setPadding(0, f6087c, 0, 0);
        addView(a, layoutParams);
    }

    /* renamed from: a */
    private View m8057a() {
        C1944l lVar = new C1944l(getContext());
        for (final C1713c cVar : this.f6088d.mo7481d()) {
            final C1921f fVar = new C1921f(getContext());
            fVar.mo7990a(cVar.mo7479b(), null);
            fVar.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    fVar.mo7989a();
                    C1935j.this.f6089e.mo7984a(cVar);
                }
            });
            lVar.addView(fVar);
        }
        return lVar;
    }
}
