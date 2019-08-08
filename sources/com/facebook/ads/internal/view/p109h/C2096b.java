package com.facebook.ads.internal.view.p109h;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1837j;
import com.facebook.ads.internal.p093t.C1838k;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.internal.view.h.b */
public class C2096b extends LinearLayout implements C2097c {

    /* renamed from: a */
    private static final int f6691a = ((int) (C2342x.f7369b * 6.0f));

    /* renamed from: b */
    private final C1822e f6692b;

    /* renamed from: c */
    private final ArrayList<View> f6693c = new ArrayList<>();

    public C2096b(Context context, C1822e eVar, C1837j jVar, C1838k kVar, MediaView mediaView, AdOptionsView adOptionsView) {
        super(context);
        this.f6692b = eVar;
        setOrientation(0);
        int b = (int) (C2342x.f7369b * ((float) kVar.mo7809b()));
        C2095a aVar = new C2095a(getContext(), this.f6692b, jVar, adOptionsView);
        aVar.setPadding(f6691a, f6691a, f6691a, f6691a);
        Button button = new Button(getContext());
        jVar.mo7796c((TextView) button);
        button.setText(eVar.mo7732a("call_to_action"));
        addView(mediaView, new LayoutParams(b, b));
        LayoutParams layoutParams = new LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 16;
        addView(aVar, layoutParams);
        addView(button, new LayoutParams(b * 2, b));
        this.f6693c.add(mediaView);
        this.f6693c.add(button);
    }

    /* renamed from: a */
    public void mo7716a() {
        this.f6692b.mo7773z();
    }

    public View getView() {
        return this;
    }

    public ArrayList<View> getViewsForInteraction() {
        return this.f6693c;
    }
}
