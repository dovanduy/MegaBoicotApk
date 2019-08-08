package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.view.p110i.p111a.C2118c;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2142j;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2144l;
import com.google.android.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.i.c.b */
public class C2172b extends C2118c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WeakReference<OnAudioFocusChangeListener> f6860a = null;

    /* renamed from: b */
    private final C2136d f6861b = new C2136d() {
        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            ((AudioManager) C2172b.this.getContext().getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).abandonAudioFocus(C2172b.this.f6860a == null ? null : (OnAudioFocusChangeListener) C2172b.this.f6860a.get());
        }
    };

    /* renamed from: c */
    private final C2142j f6862c = new C2142j() {
        /* renamed from: a */
        public void mo6895a(C2141i iVar) {
            ((AudioManager) C2172b.this.getContext().getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).abandonAudioFocus(C2172b.this.f6860a == null ? null : (OnAudioFocusChangeListener) C2172b.this.f6860a.get());
        }
    };

    /* renamed from: d */
    private final C2144l f6863d = new C2144l() {
        /* renamed from: a */
        public void mo6895a(C2143k kVar) {
            if (C2172b.this.f6860a == null || C2172b.this.f6860a.get() == null) {
                C2172b.this.f6860a = new WeakReference(new OnAudioFocusChangeListener() {
                    public void onAudioFocusChange(final int i) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                if (C2172b.this.getVideoView() != null && i <= 0) {
                                    C2172b.this.getVideoView().mo8383a(false);
                                }
                            }
                        });
                    }
                });
            }
            ((AudioManager) C2172b.this.getContext().getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).requestAudioFocus((OnAudioFocusChangeListener) C2172b.this.f6860a.get(), 3, 1);
        }
    };

    public C2172b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8425a() {
        super.mo8425a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7626a((T[]) new C1779f[]{this.f6863d, this.f6861b, this.f6862c});
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8426b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7628b((T[]) new C1779f[]{this.f6862c, this.f6861b, this.f6863d});
        }
        super.mo8426b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ((AudioManager) getContext().getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).abandonAudioFocus(this.f6860a == null ? null : (OnAudioFocusChangeListener) this.f6860a.get());
        super.onDetachedFromWindow();
    }
}
