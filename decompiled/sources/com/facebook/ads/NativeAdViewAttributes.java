package com.facebook.ads;

import android.graphics.Typeface;
import com.facebook.ads.internal.p088o.C1774a;
import com.facebook.ads.internal.p088o.C1775b;
import com.facebook.ads.internal.p093t.C1837j;
import org.json.JSONObject;

public class NativeAdViewAttributes {

    /* renamed from: a */
    private final C1837j f4750a;

    public NativeAdViewAttributes() {
        this.f4750a = new C1837j();
    }

    NativeAdViewAttributes(C1837j jVar) {
        this.f4750a = jVar;
    }

    public NativeAdViewAttributes(JSONObject jSONObject) {
        C1837j jVar;
        try {
            jVar = new C1837j(jSONObject);
        } catch (Exception e) {
            jVar = new C1837j();
            C1775b.m7365a(C1774a.m7362a(e, "Error retrieving native ui configuration data"));
        }
        this.f4750a = jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1837j mo6985a() {
        return this.f4750a;
    }

    public boolean getAutoplay() {
        return this.f4750a.mo7806j();
    }

    public boolean getAutoplayOnMobile() {
        return this.f4750a.mo7807k();
    }

    public int getBackgroundColor() {
        return this.f4750a.mo7790b();
    }

    public int getButtonBorderColor() {
        return this.f4750a.mo7803g();
    }

    public int getButtonColor() {
        return this.f4750a.mo7799e();
    }

    public int getButtonTextColor() {
        return this.f4750a.mo7801f();
    }

    public int getDescriptionTextColor() {
        return this.f4750a.mo7797d();
    }

    public int getDescriptionTextSize() {
        return this.f4750a.mo7805i();
    }

    public int getTitleTextColor() {
        return this.f4750a.mo7794c();
    }

    public int getTitleTextSize() {
        return this.f4750a.mo7804h();
    }

    public Typeface getTypeface() {
        return this.f4750a.mo7785a();
    }

    public NativeAdViewAttributes setAutoplay(boolean z) {
        this.f4750a.mo7793b(z);
        return this;
    }

    public NativeAdViewAttributes setAutoplayOnMobile(boolean z) {
        this.f4750a.mo7789a(z);
        return this;
    }

    public NativeAdViewAttributes setBackgroundColor(int i) {
        this.f4750a.mo7786a(i);
        return this;
    }

    public NativeAdViewAttributes setButtonBorderColor(int i) {
        this.f4750a.mo7802f(i);
        return this;
    }

    public NativeAdViewAttributes setButtonColor(int i) {
        this.f4750a.mo7798d(i);
        return this;
    }

    public NativeAdViewAttributes setButtonTextColor(int i) {
        this.f4750a.mo7800e(i);
        return this;
    }

    public NativeAdViewAttributes setDescriptionTextColor(int i) {
        this.f4750a.mo7795c(i);
        return this;
    }

    public NativeAdViewAttributes setTitleTextColor(int i) {
        this.f4750a.mo7791b(i);
        return this;
    }

    public NativeAdViewAttributes setTypeface(Typeface typeface) {
        this.f4750a.mo7787a(typeface);
        return this;
    }
}
