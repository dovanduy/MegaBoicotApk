package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.C3415h;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class ars {

    /* renamed from: a */
    private final Object f11742a = new Object();

    /* renamed from: b */
    private final ConditionVariable f11743b = new ConditionVariable();

    /* renamed from: c */
    private volatile boolean f11744c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SharedPreferences f11745d = null;

    /* renamed from: e */
    private Context f11746e;

    /* renamed from: a */
    public final <T> T mo14695a(ark<T> ark) {
        if (!this.f11743b.block(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS)) {
            throw new IllegalStateException("Flags.initialize() was not called!");
        }
        if (!this.f11744c || this.f11745d == null) {
            synchronized (this.f11742a) {
                if (this.f11744c) {
                    if (this.f11745d == null) {
                    }
                }
                T b = ark.mo14687b();
                return b;
            }
        }
        return C3966lq.m17350a(this.f11746e, new art(this, ark));
    }

    /* renamed from: a */
    public final void mo14696a(Context context) {
        if (!this.f11744c) {
            synchronized (this.f11742a) {
                if (!this.f11744c) {
                    this.f11746e = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        Context e = C3415h.m12287e(context);
                        if (e == null && context != null) {
                            e = context.getApplicationContext();
                            if (e == null) {
                                e = context;
                            }
                        }
                        if (e != null) {
                            aoq.m14618d();
                            this.f11745d = e.getSharedPreferences("google_ads_flags", 0);
                            this.f11744c = true;
                            this.f11743b.open();
                        }
                    } finally {
                        this.f11743b.open();
                    }
                }
            }
        }
    }
}
