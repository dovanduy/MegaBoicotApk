package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.DefaultLoadControl;

public final class als implements C3641ac {

    /* renamed from: a */
    private int f11376a;

    /* renamed from: b */
    private int f11377b;

    /* renamed from: c */
    private final int f11378c;

    /* renamed from: d */
    private final float f11379d;

    public als() {
        this(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 1, 1.0f);
    }

    private als(int i, int i2, float f) {
        this.f11376a = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        this.f11378c = 1;
        this.f11379d = 1.0f;
    }

    /* renamed from: a */
    public final int mo14041a() {
        return this.f11376a;
    }

    /* renamed from: a */
    public final void mo14042a(C3738df dfVar) throws C3738df {
        boolean z = true;
        this.f11377b++;
        this.f11376a = (int) (((float) this.f11376a) + (((float) this.f11376a) * this.f11379d));
        if (this.f11377b > this.f11378c) {
            z = false;
        }
        if (!z) {
            throw dfVar;
        }
    }

    /* renamed from: b */
    public final int mo14043b() {
        return this.f11377b;
    }
}
