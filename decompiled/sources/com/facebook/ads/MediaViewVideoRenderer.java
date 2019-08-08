package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2322j;
import com.facebook.ads.internal.view.C2267p;
import com.facebook.ads.internal.view.C2271q;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2137e;
import com.facebook.ads.internal.view.p110i.p112b.C2138f;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2142j;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2144l;
import com.facebook.ads.internal.view.p110i.p112b.C2145m;
import com.facebook.ads.internal.view.p110i.p112b.C2146n;
import com.facebook.ads.internal.view.p110i.p112b.C2149q;
import com.facebook.ads.internal.view.p110i.p112b.C2150r;
import com.facebook.ads.internal.view.p110i.p112b.C2155w;
import com.facebook.ads.internal.view.p110i.p112b.C2156x;
import com.facebook.ads.internal.view.p110i.p114d.C2240d;

public abstract class MediaViewVideoRenderer extends FrameLayout {

    /* renamed from: d */
    private static final String f4700d = "MediaViewVideoRenderer";

    /* renamed from: a */
    protected NativeAd f4701a;

    /* renamed from: b */
    protected VideoAutoplayBehavior f4702b;

    /* renamed from: c */
    final C2267p f4703c;

    /* renamed from: e */
    private final C2146n f4704e = new C2146n() {
        /* renamed from: a */
        public void mo6895a(C2145m mVar) {
            MediaViewVideoRenderer.this.onPrepared();
        }
    };

    /* renamed from: f */
    private final C2144l f4705f = new C2144l() {
        /* renamed from: a */
        public void mo6895a(C2143k kVar) {
            if (MediaViewVideoRenderer.this.f4701a != null) {
                MediaViewVideoRenderer.this.f4701a.mo6927f().mo7744a(true, true);
            }
            MediaViewVideoRenderer.this.onPlayed();
        }
    };

    /* renamed from: g */
    private final C2142j f4706g = new C2142j() {
        /* renamed from: a */
        public void mo6895a(C2141i iVar) {
            MediaViewVideoRenderer.this.onPaused();
        }
    };

    /* renamed from: h */
    private final C2150r f4707h = new C2150r() {
        /* renamed from: a */
        public void mo6895a(C2149q qVar) {
            MediaViewVideoRenderer.this.onSeek();
        }
    };

    /* renamed from: i */
    private final C2136d f4708i = new C2136d() {
        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            MediaViewVideoRenderer.this.onCompleted();
        }
    };

    /* renamed from: j */
    private final C2156x f4709j = new C2156x() {
        /* renamed from: a */
        public void mo6895a(C2155w wVar) {
            MediaViewVideoRenderer.this.onVolumeChanged();
        }
    };

    /* renamed from: k */
    private final C2138f f4710k = new C2138f() {
        /* renamed from: a */
        public void mo6895a(C2137e eVar) {
            if (MediaViewVideoRenderer.this.f4701a != null) {
                MediaViewVideoRenderer.this.f4701a.mo6927f().mo7744a(false, true);
            }
            MediaViewVideoRenderer.this.onError();
        }
    };

    /* renamed from: l */
    private boolean f4711l;

    /* renamed from: m */
    private boolean f4712m;

    public MediaViewVideoRenderer(Context context) {
        super(context);
        this.f4703c = new C2267p(context);
        m6404b();
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4703c = new C2267p(context, attributeSet);
        m6404b();
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4703c = new C2267p(context, attributeSet, i);
        m6404b();
    }

    @TargetApi(21)
    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4703c = new C2267p(context, attributeSet, i, i2);
        m6404b();
    }

    /* renamed from: b */
    private void m6404b() {
        this.f4703c.setEnableBackgroundVideo(shouldAllowBackgroundPlayback());
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        this.f4703c.setLayoutParams(layoutParams);
        super.addView(this.f4703c, -1, layoutParams);
        C2322j.m9044a(this.f4703c, C2322j.INTERNAL_AD_MEDIA);
        this.f4703c.getEventBus().mo7626a((T[]) new C1779f[]{this.f4704e, this.f4705f, this.f4706g, this.f4707h, this.f4708i, this.f4709j, this.f4710k});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6800a() {
        pause(false);
        this.f4703c.setClientToken(null);
        this.f4703c.setVideoMPD(null);
        this.f4703c.setVideoURI(null);
        this.f4703c.setVideoCTA(null);
        this.f4703c.setNativeAd(null);
        this.f4702b = VideoAutoplayBehavior.DEFAULT;
        if (this.f4701a != null) {
            this.f4701a.mo6927f().mo7744a(false, false);
        }
        this.f4701a = null;
    }

    public void addView(View view) {
    }

    public void addView(View view, int i) {
    }

    public void addView(View view, int i, int i2) {
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
    }

    public void addView(View view, LayoutParams layoutParams) {
    }

    public void destroy() {
        this.f4703c.mo8407l();
    }

    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (!this.f4711l) {
            Log.w(f4700d, "disengageSeek called without engageSeek.");
            return;
        }
        this.f4711l = false;
        if (this.f4712m) {
            this.f4703c.mo8380a(videoStartReason.mo7045a());
        }
        onSeekDisengaged();
    }

    public final void engageSeek() {
        if (this.f4711l) {
            Log.w(f4700d, "engageSeek called without disengageSeek.");
            return;
        }
        this.f4711l = true;
        this.f4712m = C2240d.STARTED.equals(this.f4703c.getState());
        this.f4703c.mo8383a(false);
        onSeekEngaged();
    }

    public final int getCurrentTimeMs() {
        return this.f4703c.getCurrentPositionInMillis();
    }

    public final int getDuration() {
        return this.f4703c.getDuration();
    }

    /* access modifiers changed from: 0000 */
    public final View getVideoView() {
        return this.f4703c.getVideoView();
    }

    public final float getVolume() {
        return this.f4703c.getVolume();
    }

    public void onCompleted() {
    }

    public void onError() {
    }

    public void onPaused() {
    }

    public void onPlayed() {
    }

    public void onPrepared() {
    }

    public void onSeek() {
    }

    public void onSeekDisengaged() {
    }

    public void onSeekEngaged() {
    }

    public void onVolumeChanged() {
    }

    public final void pause(boolean z) {
        this.f4703c.mo8383a(z);
    }

    public final void play(VideoStartReason videoStartReason) {
        this.f4703c.mo8380a(videoStartReason.mo7045a());
    }

    public final void seekTo(int i) {
        if (!this.f4711l) {
            Log.w(f4700d, "Seeking must be preceded by a call to engageSeek, and followed by a call to disengageSeek.");
        } else {
            this.f4703c.mo8378a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void setAdEventManager(C1802c cVar) {
        this.f4703c.setAdEventManager(cVar);
    }

    /* access modifiers changed from: 0000 */
    public final void setListener(C2271q qVar) {
        this.f4703c.setListener(qVar);
    }

    /* access modifiers changed from: protected */
    public void setNativeAd(NativeAd nativeAd) {
        this.f4701a = nativeAd;
        this.f4703c.setClientToken(nativeAd.mo6948h());
        this.f4703c.setVideoMPD(nativeAd.mo6911b());
        this.f4703c.setVideoURI(nativeAd.mo6909a());
        this.f4703c.setVideoProgressReportIntervalMs(nativeAd.mo6928g().mo7311w());
        this.f4703c.setVideoCTA(nativeAd.getAdCallToAction());
        this.f4703c.setNativeAd(nativeAd);
        this.f4702b = nativeAd.mo6912c();
    }

    public final void setVolume(float f) {
        this.f4703c.setVolume(f);
    }

    public boolean shouldAllowBackgroundPlayback() {
        return false;
    }

    public final boolean shouldAutoplay() {
        boolean z = false;
        if (this.f4703c != null) {
            if (this.f4703c.getState() == C2240d.PLAYBACK_COMPLETED) {
                return false;
            }
            if (this.f4702b == VideoAutoplayBehavior.ON) {
                z = true;
            }
        }
        return z;
    }
}
