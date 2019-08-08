package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.exoplayer2.util.MimeTypes;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.kf */
public final class C3928kf {

    /* renamed from: a */
    private boolean f13429a = false;

    /* renamed from: b */
    private float f13430b = 1.0f;

    /* renamed from: a */
    public static float m17246a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    /* renamed from: c */
    private final synchronized boolean m17247c() {
        return this.f13430b >= 0.0f;
    }

    /* renamed from: a */
    public final synchronized float mo15556a() {
        if (!m17247c()) {
            return 1.0f;
        }
        return this.f13430b;
    }

    /* renamed from: a */
    public final synchronized void mo15557a(float f) {
        this.f13430b = f;
    }

    /* renamed from: a */
    public final synchronized void mo15558a(boolean z) {
        this.f13429a = z;
    }

    /* renamed from: b */
    public final synchronized boolean mo15559b() {
        return this.f13429a;
    }
}
