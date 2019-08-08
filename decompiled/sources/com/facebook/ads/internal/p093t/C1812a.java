package com.facebook.ads.internal.p093t;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.component.C2024d;
import com.facebook.ads.internal.view.component.C2028h;
import com.facebook.ads.internal.view.p109h.C2097c;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.internal.t.a */
public class C1812a extends FrameLayout implements C2097c {

    /* renamed from: a */
    private static final int f5752a = ((int) (C2342x.f7369b * 110.0f));

    /* renamed from: b */
    private final C1837j f5753b;

    /* renamed from: c */
    private final C1822e f5754c;

    /* renamed from: d */
    private final AdOptionsView f5755d;

    /* renamed from: e */
    private ArrayList<View> f5756e = new ArrayList<>();

    public C1812a(Context context, C1822e eVar, AdOptionsView adOptionsView, MediaView mediaView, MediaView mediaView2, C1838k kVar, C1837j jVar) {
        super(context);
        this.f5753b = jVar;
        this.f5754c = eVar;
        this.f5755d = adOptionsView;
        LinearLayout linearLayout = new LinearLayout(context);
        boolean z = true;
        linearLayout.setOrientation(1);
        switch (kVar) {
            case HEIGHT_400:
                C2028h hVar = new C2028h(getContext(), this.f5754c, this.f5753b);
                hVar.setLayoutParams(new LayoutParams(-1, f5752a));
                linearLayout.addView(hVar);
                break;
            case HEIGHT_300:
                break;
        }
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new LayoutParams(-1, (int) (C2342x.f7369b * 180.0f)));
        C2342x.m9082a((View) relativeLayout, this.f5753b.mo7790b());
        relativeLayout.addView(mediaView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (180.0f * C2342x.f7369b));
        layoutParams.addRule(13, -1);
        mediaView.setLayoutParams(layoutParams);
        linearLayout.addView(relativeLayout);
        this.f5756e.add(mediaView);
        Context context2 = getContext();
        C1822e eVar2 = this.f5754c;
        C1837j jVar2 = this.f5753b;
        AdOptionsView adOptionsView2 = this.f5755d;
        if (!(kVar == C1838k.HEIGHT_300 || kVar == C1838k.HEIGHT_120)) {
            z = false;
        }
        C2024d dVar = new C2024d(context2, eVar2, jVar2, mediaView2, adOptionsView2, z, m7580a(kVar));
        dVar.setLayoutParams(new LayoutParams(-1, (int) (((float) m7580a(kVar)) * C2342x.f7369b)));
        linearLayout.addView(dVar);
        this.f5756e.add(dVar.getIconView());
        this.f5756e.add(dVar.getCallToActionView());
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    private static int m7580a(C1838k kVar) {
        switch (kVar) {
            case HEIGHT_400:
                return (kVar.mo7809b() - 180) / 2;
            case HEIGHT_300:
                return kVar.mo7809b() - 180;
            case HEIGHT_50:
            case HEIGHT_100:
            case HEIGHT_120:
                return kVar.mo7809b();
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public void mo7716a() {
        this.f5754c.mo7773z();
    }

    public View getView() {
        return this;
    }

    public ArrayList<View> getViewsForInteraction() {
        return this.f5756e;
    }
}
