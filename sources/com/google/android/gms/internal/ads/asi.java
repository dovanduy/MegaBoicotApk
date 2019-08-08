package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.C3057g;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class asi extends asm {

    /* renamed from: a */
    private final C3057g f12089a;

    /* renamed from: b */
    private final String f12090b;

    /* renamed from: c */
    private final String f12091c;

    public asi(C3057g gVar, String str, String str2) {
        this.f12089a = gVar;
        this.f12090b = str;
        this.f12091c = str2;
    }

    /* renamed from: a */
    public final String mo14727a() {
        return this.f12090b;
    }

    /* renamed from: a */
    public final void mo14728a(C3235a aVar) {
        if (aVar != null) {
            this.f12089a.mo12567a_((View) C3238b.m11574a(aVar));
        }
    }

    /* renamed from: b */
    public final String mo14729b() {
        return this.f12091c;
    }

    /* renamed from: c */
    public final void mo14730c() {
        this.f12089a.mo12569h_();
    }

    /* renamed from: d */
    public final void mo14731d() {
        this.f12089a.mo12570i_();
    }
}
