package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p017v4.graphics.drawable.C0407a;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.util.C3557i;
import com.google.android.gms.p134a.C2955a.C2956a;
import com.google.android.gms.p134a.C2955a.C2957b;
import com.google.android.gms.p134a.C2955a.C2958c;

public final class SignInButtonImpl extends Button {
    public SignInButtonImpl(Context context) {
        this(context, null);
    }

    public SignInButtonImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    /* renamed from: a */
    public final void mo13476a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int a = m12327a(i2, C2957b.common_google_signin_btn_icon_dark, C2957b.common_google_signin_btn_icon_light, C2957b.common_google_signin_btn_icon_light);
        int a2 = m12327a(i2, C2957b.common_google_signin_btn_text_dark, C2957b.common_google_signin_btn_text_light, C2957b.common_google_signin_btn_text_light);
        switch (i) {
            case 0:
            case 1:
                a = a2;
                break;
            case 2:
                break;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown button size: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
        Drawable f = C0407a.m1550f(resources.getDrawable(a));
        C0407a.m1540a(f, resources.getColorStateList(C2956a.common_google_signin_btn_tint));
        C0407a.m1543a(f, Mode.SRC_ATOP);
        setBackgroundDrawable(f);
        setTextColor((ColorStateList) C3513t.m12625a(resources.getColorStateList(m12327a(i2, C2956a.common_google_signin_btn_text_dark, C2956a.common_google_signin_btn_text_light, C2956a.common_google_signin_btn_text_light))));
        switch (i) {
            case 0:
                setText(resources.getString(C2958c.common_signin_button_text));
                break;
            case 1:
                setText(resources.getString(C2958c.common_signin_button_text_long));
                break;
            case 2:
                setText(null);
                break;
            default:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown button size: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod(null);
        if (C3557i.m12750a(getContext())) {
            setGravity(19);
        }
    }

    /* renamed from: a */
    private static int m12327a(int i, int i2, int i3, int i4) {
        switch (i) {
            case 0:
                return i2;
            case 1:
                return i3;
            case 2:
                return i4;
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown color scheme: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
