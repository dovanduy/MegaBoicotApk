package com.startapp.android.publish.adsCommon.adinformation;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationPositions.Position;
import com.startapp.android.publish.adsCommon.adinformation.C5330b.C5338b;
import com.startapp.android.publish.common.model.AdPreferences.Placement;

/* renamed from: com.startapp.android.publish.adsCommon.adinformation.d */
/* compiled from: StartAppSDK */
public class C5340d extends RelativeLayout {

    /* renamed from: a */
    private ImageView f17122a;

    /* renamed from: b */
    private RelativeLayout f17123b;

    /* renamed from: c */
    private OnClickListener f17124c = null;

    /* renamed from: d */
    private AdInformationConfig f17125d;

    /* renamed from: e */
    private C5342e f17126e;

    /* renamed from: f */
    private Placement f17127f;

    /* renamed from: g */
    private Position f17128g;

    public C5340d(Context context, C5338b bVar, Placement placement, C5339c cVar, final OnClickListener onClickListener) {
        super(context);
        this.f17127f = placement;
        this.f17124c = new OnClickListener() {
            public void onClick(View view) {
                onClickListener.onClick(view);
            }
        };
        mo19731a(bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19731a(C5338b bVar, C5339c cVar) {
        this.f17125d = C5330b.m22743a(getContext());
        if (this.f17125d == null) {
            this.f17125d = AdInformationConfig.m22718a();
        }
        this.f17126e = this.f17125d.mo19682a(bVar.mo19724a());
        if (cVar == null || !cVar.mo19729d()) {
            this.f17128g = this.f17125d.mo19681a(this.f17127f);
        } else {
            this.f17128g = cVar.mo19728c();
        }
        this.f17122a = new ImageView(getContext());
        this.f17122a.setContentDescription("info");
        this.f17122a.setId(AdsConstants.AD_INFORMATION_ID);
        this.f17122a.setImageBitmap(this.f17126e.mo19733a(getContext()));
        this.f17123b = new RelativeLayout(getContext());
        LayoutParams layoutParams = new LayoutParams(C5306h.m22641a(getContext(), (int) (((float) this.f17126e.mo19738b()) * this.f17125d.mo19689e())), C5306h.m22641a(getContext(), (int) (((float) this.f17126e.mo19742c()) * this.f17125d.mo19689e())));
        this.f17123b.setBackgroundColor(0);
        LayoutParams layoutParams2 = new LayoutParams(C5306h.m22641a(getContext(), this.f17126e.mo19738b()), C5306h.m22641a(getContext(), this.f17126e.mo19742c()));
        layoutParams2.setMargins(0, 0, 0, 0);
        this.f17122a.setPadding(0, 0, 0, 0);
        this.f17128g.addRules(layoutParams2);
        this.f17123b.addView(this.f17122a, layoutParams2);
        this.f17123b.setOnClickListener(this.f17124c);
        addView(this.f17123b, layoutParams);
    }
}
