package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.google.android.exoplayer2.util.MimeTypes;

@TargetApi(14)
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.pg */
public final class C4064pg implements OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f13768a;

    /* renamed from: b */
    private final C4066pi f13769b;

    /* renamed from: c */
    private boolean f13770c;

    /* renamed from: d */
    private boolean f13771d;

    /* renamed from: e */
    private boolean f13772e;

    /* renamed from: f */
    private float f13773f = 1.0f;

    public C4064pg(Context context, C4066pi piVar) {
        this.f13768a = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f13769b = piVar;
    }

    /* renamed from: d */
    private final void m17631d() {
        boolean z = false;
        boolean z2 = this.f13771d && !this.f13772e && this.f13773f > 0.0f;
        if (!z2 || this.f13770c) {
            if (!z2 && this.f13770c) {
                if (this.f13768a != null && this.f13770c) {
                    if (this.f13768a.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.f13770c = z;
                }
                this.f13769b.mo15709e();
            }
            return;
        }
        if (this.f13768a != null && !this.f13770c) {
            if (this.f13768a.requestAudioFocus(this, 3, 2) == 1) {
                z = true;
            }
            this.f13770c = z;
        }
        this.f13769b.mo15709e();
    }

    /* renamed from: a */
    public final float mo15820a() {
        float f = this.f13772e ? 0.0f : this.f13773f;
        if (this.f13770c) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void mo15821a(float f) {
        this.f13773f = f;
        m17631d();
    }

    /* renamed from: a */
    public final void mo15822a(boolean z) {
        this.f13772e = z;
        m17631d();
    }

    /* renamed from: b */
    public final void mo15823b() {
        this.f13771d = true;
        m17631d();
    }

    /* renamed from: c */
    public final void mo15824c() {
        this.f13771d = false;
        m17631d();
    }

    public final void onAudioFocusChange(int i) {
        this.f13770c = i > 0;
        this.f13769b.mo15709e();
    }
}
