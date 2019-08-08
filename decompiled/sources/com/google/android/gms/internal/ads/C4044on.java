package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.on */
public abstract class C4044on extends TextureView implements C4066pi {

    /* renamed from: a */
    protected final C4053ow f13669a = new C4053ow();

    /* renamed from: b */
    protected final C4064pg f13670b;

    public C4044on(Context context) {
        super(context);
        this.f13670b = new C4064pg(context, this);
    }

    /* renamed from: a */
    public abstract String mo15701a();

    /* renamed from: a */
    public abstract void mo15702a(float f, float f2);

    /* renamed from: a */
    public abstract void mo15703a(int i);

    /* renamed from: a */
    public abstract void mo15704a(C4043om omVar);

    /* renamed from: b */
    public abstract void mo15705b();

    /* renamed from: c */
    public abstract void mo15707c();

    /* renamed from: d */
    public abstract void mo15708d();

    /* renamed from: e */
    public abstract void mo15709e();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
