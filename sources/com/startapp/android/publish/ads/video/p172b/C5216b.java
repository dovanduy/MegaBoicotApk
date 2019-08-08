package com.startapp.android.publish.ads.video.p172b;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.widget.VideoView;
import com.startapp.android.publish.ads.video.C5229c;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5223c;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5227g;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5228h;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.ads.video.b.b */
/* compiled from: StartAppSDK */
public class C5216b extends C5215a implements OnCompletionListener, OnErrorListener, OnPreparedListener {

    /* renamed from: h */
    private MediaPlayer f16746h;

    /* renamed from: i */
    private VideoView f16747i;

    /* renamed from: com.startapp.android.publish.ads.video.b.b$a */
    /* compiled from: StartAppSDK */
    public enum C5218a {
        MEDIA_ERROR_IO,
        MEDIA_ERROR_MALFORMED,
        MEDIA_ERROR_UNSUPPORTED,
        MEDIA_ERROR_TIMED_OUT;

        /* renamed from: a */
        public static C5218a m22348a(int i) {
            if (i == -1010) {
                return MEDIA_ERROR_UNSUPPORTED;
            }
            if (i == -1007) {
                return MEDIA_ERROR_MALFORMED;
            }
            if (i == -1004) {
                return MEDIA_ERROR_IO;
            }
            if (i != -110) {
                return MEDIA_ERROR_IO;
            }
            return MEDIA_ERROR_TIMED_OUT;
        }
    }

    /* renamed from: com.startapp.android.publish.ads.video.b.b$b */
    /* compiled from: StartAppSDK */
    public enum C5219b {
        MEDIA_ERROR_UNKNOWN,
        MEDIA_ERROR_SERVER_DIED;

        /* renamed from: a */
        public static C5219b m22349a(int i) {
            if (i == 100) {
                return MEDIA_ERROR_SERVER_DIED;
            }
            return MEDIA_ERROR_UNKNOWN;
        }
    }

    public C5216b(VideoView videoView) {
        C5518g.m23563a("NativeVideoPlayer", 4, "Ctor");
        this.f16747i = videoView;
        this.f16747i.setOnPreparedListener(this);
        this.f16747i.setOnCompletionListener(this);
        this.f16747i.setOnErrorListener(this);
    }

    /* renamed from: a */
    public void mo19264a() {
        C5518g.m23563a("NativeVideoPlayer", 4, TtmlNode.START);
        this.f16747i.start();
    }

    /* renamed from: a */
    public void mo19265a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("seekTo(");
        sb.append(i);
        sb.append(")");
        C5518g.m23563a("NativeVideoPlayer", 4, sb.toString());
        this.f16747i.seekTo(i);
    }

    /* renamed from: b */
    public void mo19267b() {
        C5518g.m23563a("NativeVideoPlayer", 4, "pause");
        this.f16747i.pause();
    }

    /* renamed from: c */
    public void mo19268c() {
        C5518g.m23563a("NativeVideoPlayer", 4, "stop");
        this.f16747i.stopPlayback();
    }

    /* renamed from: a */
    public void mo19266a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setMute(");
        sb.append(z);
        sb.append(")");
        C5518g.m23563a("NativeVideoPlayer", 4, sb.toString());
        if (this.f16746h == null) {
            return;
        }
        if (z) {
            this.f16746h.setVolume(0.0f, 0.0f);
        } else {
            this.f16746h.setVolume(1.0f, 1.0f);
        }
    }

    /* renamed from: d */
    public int mo19269d() {
        return this.f16747i.getCurrentPosition();
    }

    /* renamed from: e */
    public int mo19270e() {
        return this.f16747i.getDuration();
    }

    /* renamed from: f */
    public boolean mo19271f() {
        return this.f16746h != null;
    }

    /* renamed from: a */
    public void mo19263a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("setVideoLocation(");
        sb.append(str);
        sb.append(")");
        C5518g.m23563a("NativeVideoPlayer", 4, sb.toString());
        super.mo19263a(str);
        this.f16747i.setVideoPath(this.f16739a);
    }

    /* renamed from: g */
    public void mo19272g() {
        if (this.f16746h != null) {
            this.f16746h = null;
        }
        C5229c.m22374a().mo19285a((C5223c) null);
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        C5518g.m23563a("NativeVideoPlayer", 4, "onPrepared");
        this.f16746h = mediaPlayer;
        if (this.f16740b != null) {
            C5518g.m23563a("NativeVideoPlayer", 3, "Dispatching onPrepared");
            this.f16740b.mo19280a();
        }
        if (C5349c.m22884d(this.f16739a) && this.f16746h != null) {
            this.f16746h.setOnBufferingUpdateListener(new OnBufferingUpdateListener() {
                public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                    if (C5216b.this.f16744f != null) {
                        C5518g.m23563a("NativeVideoPlayer", 4, "onBufferingUpdate");
                        C5216b.this.f16744f.mo19277a(i);
                    }
                }
            });
        } else if (!C5349c.m22884d(this.f16739a)) {
            C5229c.m22374a().mo19285a(this.f16744f);
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        C5518g.m23563a("NativeVideoPlayer", 4, "onCompletion");
        if (this.f16742d != null) {
            C5518g.m23563a("NativeVideoPlayer", 3, "Dispatching onCompletion");
            this.f16742d.mo19278a();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onError(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        C5518g.m23563a("NativeVideoPlayer", 6, sb.toString());
        if (this.f16741c == null) {
            return false;
        }
        C5518g.m23563a("NativeVideoPlayer", 3, "Dispatching onError");
        return this.f16741c.mo19279a(m22337a(i, i2, mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1));
    }

    /* renamed from: a */
    private C5227g m22337a(int i, int i2, int i3) {
        return new C5227g(C5219b.m22349a(i) == C5219b.MEDIA_ERROR_SERVER_DIED ? C5228h.SERVER_DIED : C5228h.UNKNOWN, C5218a.m22348a(i2).toString(), i3);
    }
}
