package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.ads.internal.p115w.p117b.C2322j;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;

public class AdOptionsView extends LinearLayout {

    /* renamed from: a */
    private static final int f4611a = ((int) (C2342x.f7369b * 23.0f));

    /* renamed from: b */
    private static final int f4612b = ((int) (C2342x.f7369b * 4.0f));

    /* renamed from: c */
    private final ImageView f4613c;

    /* renamed from: d */
    private final ImageView f4614d;

    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout) {
        this(context, nativeAdBase, nativeAdLayout, Orientation.HORIZONTAL, 23);
    }

    public AdOptionsView(Context context, final NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, Orientation orientation, int i) {
        super(context);
        this.f4613c = new ImageView(context);
        this.f4613c.setScaleType(ScaleType.FIT_CENTER);
        this.f4613c.setPadding(f4612b, f4612b, f4612b, f4612b);
        this.f4613c.setImageBitmap(C2348c.m9100a(C2347b.INFO_ICON));
        this.f4614d = new ImageView(context);
        this.f4614d.setScaleType(ScaleType.FIT_CENTER);
        this.f4614d.setPadding(f4612b, f4612b, f4612b, f4612b);
        this.f4614d.setImageBitmap(C2348c.m9100a(C2347b.AD_CHOICES_ICON));
        setOrientation(orientation == Orientation.HORIZONTAL ? 0 : 1);
        setIconColor(-10459280);
        int max = Math.max(f4611a, (int) (C2342x.f7369b * ((float) i)));
        LayoutParams layoutParams = new LayoutParams(max, max);
        addView(this.f4613c, layoutParams);
        addView(this.f4614d, layoutParams);
        nativeAdBase.mo6927f().mo7736a(nativeAdLayout);
        if (!nativeAdBase.isAdLoaded() || nativeAdBase.mo6928g().mo7295g()) {
            setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    nativeAdBase.mo6927f().mo7772y();
                }
            });
            C2322j.m9044a(this, C2322j.INTERNAL_AD_OPTIONS_VIEW);
            return;
        }
        setVisibility(8);
    }

    public void setIconColor(int i) {
        this.f4613c.setColorFilter(i);
        this.f4614d.setColorFilter(i);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }
}
