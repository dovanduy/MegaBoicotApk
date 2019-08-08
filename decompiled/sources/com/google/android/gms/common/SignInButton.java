package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3514u;
import com.google.android.gms.common.internal.SignInButtonImpl;
import com.google.android.gms.p134a.C2955a.C2959d;
import com.google.android.gms.p137b.C3239c.C3240a;

public final class SignInButton extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    private int f9442a;

    /* renamed from: b */
    private int f9443b;

    /* renamed from: c */
    private View f9444c;

    /* renamed from: d */
    private OnClickListener f9445d;

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9445d = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2959d.SignInButton, 0, 0);
        try {
            this.f9442a = obtainStyledAttributes.getInt(C2959d.SignInButton_buttonSize, 0);
            this.f9443b = obtainStyledAttributes.getInt(C2959d.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            mo13056a(this.f9442a, this.f9443b);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setSize(int i) {
        mo13056a(i, this.f9443b);
    }

    public final void setColorScheme(int i) {
        mo13056a(this.f9442a, i);
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        mo13056a(this.f9442a, this.f9443b);
    }

    /* renamed from: a */
    public final void mo13056a(int i, int i2) {
        this.f9442a = i;
        this.f9443b = i2;
        Context context = getContext();
        if (this.f9444c != null) {
            removeView(this.f9444c);
        }
        try {
            this.f9444c = C3514u.m12639a(context, this.f9442a, this.f9443b);
        } catch (C3240a unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.f9442a;
            int i4 = this.f9443b;
            SignInButtonImpl signInButtonImpl = new SignInButtonImpl(context);
            signInButtonImpl.mo13476a(context.getResources(), i3, i4);
            this.f9444c = signInButtonImpl;
        }
        addView(this.f9444c);
        this.f9444c.setEnabled(isEnabled());
        this.f9444c.setOnClickListener(this);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f9445d = onClickListener;
        if (this.f9444c != null) {
            this.f9444c.setOnClickListener(this);
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f9444c.setEnabled(z);
    }

    public final void onClick(View view) {
        if (this.f9445d != null && view == this.f9444c) {
            this.f9445d.onClick(this);
        }
    }
}
