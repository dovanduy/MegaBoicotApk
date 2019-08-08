package com.facebook.ads.internal.p093t;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.settings.AdInternalSettings;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.t.j */
public class C1837j {

    /* renamed from: a */
    private Typeface f5833a = Typeface.create(Typeface.SANS_SERIF, 0);

    /* renamed from: b */
    private int f5834b = -1;

    /* renamed from: c */
    private int f5835c = -16777216;

    /* renamed from: d */
    private int f5836d = -11643291;

    /* renamed from: e */
    private int f5837e = 0;

    /* renamed from: f */
    private int f5838f = -12420889;

    /* renamed from: g */
    private int f5839g = -12420889;

    /* renamed from: h */
    private boolean f5840h = AdInternalSettings.isVideoAutoplay();

    /* renamed from: i */
    private boolean f5841i = AdInternalSettings.isVideoAutoplayOnMobile();

    public C1837j() {
    }

    public C1837j(JSONObject jSONObject) {
        this.f5834b = jSONObject.getBoolean("background_transparent") ? 0 : Color.parseColor(jSONObject.getString("background_color"));
        this.f5835c = Color.parseColor(jSONObject.getString("title_text_color"));
        this.f5836d = Color.parseColor(jSONObject.getString("description_text_color"));
        this.f5837e = jSONObject.getBoolean("button_transparent") ? 0 : Color.parseColor(jSONObject.getString("button_color"));
        this.f5839g = jSONObject.getBoolean("button_border_transparent") ? 0 : Color.parseColor(jSONObject.getString("button_border_color"));
        this.f5838f = Color.parseColor(jSONObject.getString("button_text_color"));
        this.f5833a = Typeface.create(jSONObject.getString("android_typeface"), 0);
    }

    /* renamed from: a */
    public Typeface mo7785a() {
        return this.f5833a;
    }

    /* renamed from: a */
    public void mo7786a(int i) {
        this.f5834b = i;
    }

    /* renamed from: a */
    public void mo7787a(Typeface typeface) {
        this.f5833a = typeface;
    }

    /* renamed from: a */
    public void mo7788a(TextView textView) {
        textView.setTextColor(this.f5835c);
        textView.setTextSize(16.0f);
        textView.setTypeface(this.f5833a, 1);
    }

    /* renamed from: a */
    public void mo7789a(boolean z) {
        this.f5841i = z;
    }

    /* renamed from: b */
    public int mo7790b() {
        return this.f5834b;
    }

    /* renamed from: b */
    public void mo7791b(int i) {
        this.f5835c = i;
    }

    /* renamed from: b */
    public void mo7792b(TextView textView) {
        textView.setTextColor(this.f5836d);
        textView.setTextSize(10.0f);
        textView.setTypeface(this.f5833a);
    }

    /* renamed from: b */
    public void mo7793b(boolean z) {
        this.f5840h = z;
    }

    /* renamed from: c */
    public int mo7794c() {
        return this.f5835c;
    }

    /* renamed from: c */
    public void mo7795c(int i) {
        this.f5836d = i;
    }

    /* renamed from: c */
    public void mo7796c(TextView textView) {
        C2342x.m9082a((View) textView, this.f5837e);
        textView.setTextColor(this.f5838f);
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(this.f5833a, 1);
    }

    /* renamed from: d */
    public int mo7797d() {
        return this.f5836d;
    }

    /* renamed from: d */
    public void mo7798d(int i) {
        this.f5837e = i;
    }

    /* renamed from: e */
    public int mo7799e() {
        return this.f5837e;
    }

    /* renamed from: e */
    public void mo7800e(int i) {
        this.f5838f = i;
    }

    /* renamed from: f */
    public int mo7801f() {
        return this.f5838f;
    }

    /* renamed from: f */
    public void mo7802f(int i) {
        this.f5839g = i;
    }

    /* renamed from: g */
    public int mo7803g() {
        return this.f5839g;
    }

    /* renamed from: h */
    public int mo7804h() {
        return 16;
    }

    /* renamed from: i */
    public int mo7805i() {
        return 10;
    }

    /* renamed from: j */
    public boolean mo7806j() {
        return this.f5840h;
    }

    /* renamed from: k */
    public boolean mo7807k() {
        return this.f5841i;
    }
}
