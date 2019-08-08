package com.facebook.ads.internal.view.p110i.p114d;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import com.facebook.ads.internal.p088o.C1774a;
import com.facebook.ads.internal.p088o.C1775b;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer.EventListener;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.SimpleExoPlayer.VideoListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection.Factory;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;

@TargetApi(14)
/* renamed from: com.facebook.ads.internal.view.i.d.a */
public class C2231a extends TextureView implements SurfaceTextureListener, C2239c, EventListener, VideoListener {

    /* renamed from: a */
    private static final String f6996a = "a";

    /* renamed from: b */
    private Uri f6997b;

    /* renamed from: c */
    private String f6998c;

    /* renamed from: d */
    private C2241e f6999d;

    /* renamed from: e */
    private Surface f7000e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SimpleExoPlayer f7001f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MediaController f7002g;

    /* renamed from: h */
    private C2240d f7003h = C2240d.IDLE;

    /* renamed from: i */
    private C2240d f7004i = C2240d.IDLE;

    /* renamed from: j */
    private C2240d f7005j = C2240d.IDLE;

    /* renamed from: k */
    private boolean f7006k = false;

    /* renamed from: l */
    private View f7007l;

    /* renamed from: m */
    private boolean f7008m = false;

    /* renamed from: n */
    private boolean f7009n = false;

    /* renamed from: o */
    private long f7010o;

    /* renamed from: p */
    private long f7011p;

    /* renamed from: q */
    private long f7012q;

    /* renamed from: r */
    private int f7013r;

    /* renamed from: s */
    private int f7014s;

    /* renamed from: t */
    private float f7015t = 1.0f;

    /* renamed from: u */
    private int f7016u = -1;

    /* renamed from: v */
    private boolean f7017v = false;

    /* renamed from: w */
    private boolean f7018w = false;

    /* renamed from: x */
    private C2116a f7019x = C2116a.NOT_STARTED;

    /* renamed from: y */
    private boolean f7020y = false;

    public C2231a(Context context) {
        super(context);
    }

    public C2231a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C2231a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public C2231a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: f */
    private void m8812f() {
        if (this.f7000e != null) {
            this.f7000e.release();
            this.f7000e = null;
        }
        if (this.f7001f != null) {
            this.f7001f.release();
            this.f7001f = null;
        }
        this.f7002g = null;
        this.f7008m = false;
        setVideoState(C2240d.IDLE);
    }

    private void setVideoState(C2240d dVar) {
        if (dVar != this.f7003h) {
            this.f7003h = dVar;
            if (this.f7003h == C2240d.STARTED) {
                this.f7008m = true;
            }
            if (this.f6999d != null) {
                this.f6999d.mo8382a(dVar);
            }
        }
    }

    /* renamed from: a */
    public void mo8541a() {
        if (!this.f7018w) {
            mo8544a(false);
        }
    }

    /* renamed from: a */
    public void mo8542a(int i) {
        if (this.f7001f != null) {
            this.f7016u = getCurrentPosition();
            this.f7001f.seekTo((long) i);
            return;
        }
        this.f7012q = (long) i;
    }

    /* renamed from: a */
    public void mo8543a(C2116a aVar) {
        this.f7004i = C2240d.STARTED;
        this.f7019x = aVar;
        if (this.f7001f == null) {
            setup(this.f6997b);
            return;
        }
        if (this.f7003h == C2240d.PREPARED || this.f7003h == C2240d.PAUSED || this.f7003h == C2240d.PLAYBACK_COMPLETED) {
            this.f7001f.setPlayWhenReady(true);
            setVideoState(C2240d.STARTED);
        }
    }

    /* renamed from: a */
    public void mo8544a(boolean z) {
        if (this.f7001f != null) {
            this.f7001f.setPlayWhenReady(false);
        } else {
            setVideoState(C2240d.IDLE);
        }
    }

    /* renamed from: b */
    public void mo8545b() {
        setVideoState(C2240d.PLAYBACK_COMPLETED);
        mo8546c();
        this.f7012q = 0;
    }

    /* renamed from: c */
    public void mo8546c() {
        this.f7004i = C2240d.IDLE;
        if (this.f7001f != null) {
            this.f7001f.stop();
            this.f7001f.release();
            this.f7001f = null;
        }
        setVideoState(C2240d.IDLE);
    }

    /* renamed from: d */
    public boolean mo8547d() {
        return (this.f7001f == null || this.f7001f.getAudioFormat() == null) ? false : true;
    }

    /* renamed from: e */
    public void mo8548e() {
        m8812f();
    }

    public int getCurrentPosition() {
        if (this.f7001f != null) {
            return (int) this.f7001f.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (this.f7001f == null) {
            return 0;
        }
        return (int) this.f7001f.getDuration();
    }

    public long getInitialBufferTime() {
        return this.f7011p;
    }

    public C2116a getStartReason() {
        return this.f7019x;
    }

    public C2240d getState() {
        return this.f7003h;
    }

    public C2240d getTargetState() {
        return this.f7004i;
    }

    public int getVideoHeight() {
        return this.f7014s;
    }

    public int getVideoWidth() {
        return this.f7013r;
    }

    public View getView() {
        return this;
    }

    public float getVolume() {
        return this.f7015t;
    }

    public void onLoadingChanged(boolean z) {
    }

    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        setVideoState(C2240d.ERROR);
        exoPlaybackException.printStackTrace();
        C1775b.m7365a(C1774a.m7362a(exoPlaybackException, "[ExoPlayer] Error during playback of ExoPlayer"));
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPlayerStateChanged(boolean r9, int r10) {
        /*
            r8 = this;
            switch(r10) {
                case 1: goto L_0x0094;
                case 2: goto L_0x0081;
                case 3: goto L_0x001f;
                case 4: goto L_0x0004;
                default: goto L_0x0003;
            }
        L_0x0003:
            return
        L_0x0004:
            if (r9 == 0) goto L_0x000b
            com.facebook.ads.internal.view.i.d.d r10 = com.facebook.ads.internal.view.p110i.p114d.C2240d.PLAYBACK_COMPLETED
            r8.setVideoState(r10)
        L_0x000b:
            com.google.android.exoplayer2.SimpleExoPlayer r10 = r8.f7001f
            r0 = 0
            if (r10 == 0) goto L_0x001c
            com.google.android.exoplayer2.SimpleExoPlayer r10 = r8.f7001f
            r10.setPlayWhenReady(r0)
            if (r9 != 0) goto L_0x001c
            com.google.android.exoplayer2.SimpleExoPlayer r9 = r8.f7001f
            r9.seekToDefaultPosition()
        L_0x001c:
            r8.f7008m = r0
            return
        L_0x001f:
            long r0 = r8.f7010o
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x0031
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r8.f7010o
            long r6 = r0 - r4
            r8.f7011p = r6
        L_0x0031:
            float r10 = r8.f7015t
            r8.setRequestedVolume(r10)
            long r0 = r8.f7012q
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x0051
            long r0 = r8.f7012q
            com.google.android.exoplayer2.SimpleExoPlayer r10 = r8.f7001f
            long r4 = r10.getDuration()
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0051
            com.google.android.exoplayer2.SimpleExoPlayer r10 = r8.f7001f
            long r0 = r8.f7012q
            r10.seekTo(r0)
            r8.f7012q = r2
        L_0x0051:
            com.google.android.exoplayer2.SimpleExoPlayer r10 = r8.f7001f
            long r0 = r10.getCurrentPosition()
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x0064
            if (r9 != 0) goto L_0x0064
            boolean r10 = r8.f7008m
            if (r10 == 0) goto L_0x0064
            com.facebook.ads.internal.view.i.d.d r9 = com.facebook.ads.internal.view.p110i.p114d.C2240d.PAUSED
            goto L_0x0096
        L_0x0064:
            if (r9 != 0) goto L_0x0099
            com.facebook.ads.internal.view.i.d.d r9 = r8.f7003h
            com.facebook.ads.internal.view.i.d.d r10 = com.facebook.ads.internal.view.p110i.p114d.C2240d.PLAYBACK_COMPLETED
            if (r9 == r10) goto L_0x0099
            com.facebook.ads.internal.view.i.d.d r9 = com.facebook.ads.internal.view.p110i.p114d.C2240d.PREPARED
            r8.setVideoState(r9)
            com.facebook.ads.internal.view.i.d.d r9 = r8.f7004i
            com.facebook.ads.internal.view.i.d.d r10 = com.facebook.ads.internal.view.p110i.p114d.C2240d.STARTED
            if (r9 != r10) goto L_0x0099
            com.facebook.ads.internal.view.i.a.a r9 = r8.f7019x
            r8.mo8543a(r9)
            com.facebook.ads.internal.view.i.d.d r9 = com.facebook.ads.internal.view.p110i.p114d.C2240d.IDLE
            r8.f7004i = r9
            return
        L_0x0081:
            int r9 = r8.f7016u
            if (r9 < 0) goto L_0x0099
            int r9 = r8.f7016u
            r10 = -1
            r8.f7016u = r10
            com.facebook.ads.internal.view.i.d.e r10 = r8.f6999d
            int r0 = r8.getCurrentPosition()
            r10.mo8379a(r9, r0)
            return
        L_0x0094:
            com.facebook.ads.internal.view.i.d.d r9 = com.facebook.ads.internal.view.p110i.p114d.C2240d.IDLE
        L_0x0096:
            r8.setVideoState(r9)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.p110i.p114d.C2231a.onPlayerStateChanged(boolean, int):void");
    }

    public void onPositionDiscontinuity() {
    }

    public void onRenderedFirstFrame() {
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f7000e != null) {
            this.f7000e.release();
        }
        this.f7000e = new Surface(surfaceTexture);
        if (this.f7001f != null) {
            this.f7001f.setVideoSurface(this.f7000e);
            this.f7006k = false;
            if (this.f7003h == C2240d.PAUSED && this.f7005j != C2240d.PAUSED) {
                mo8543a(this.f7019x);
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.f7000e != null) {
            this.f7000e.release();
            this.f7000e = null;
            if (this.f7001f != null) {
                this.f7001f.setVideoSurface(null);
            }
        }
        if (!this.f7006k) {
            this.f7005j = this.f7009n ? C2240d.STARTED : this.f7003h;
            this.f7006k = true;
        }
        if (this.f7003h != C2240d.PAUSED) {
            mo8544a(false);
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onTimelineChanged(Timeline timeline, Object obj) {
    }

    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        this.f7013r = i;
        this.f7014s = i2;
        if (this.f7013r != 0 && this.f7014s != 0) {
            requestLayout();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f7001f != null) {
            if (this.f7002g == null || !this.f7002g.isShowing()) {
                if (!z) {
                    if (!this.f7006k) {
                        this.f7005j = this.f7009n ? C2240d.STARTED : this.f7003h;
                        this.f7006k = true;
                    }
                    if (this.f7003h != C2240d.PAUSED) {
                        mo8541a();
                    }
                } else {
                    this.f7006k = false;
                    if (this.f7003h == C2240d.PAUSED && this.f7005j != C2240d.PAUSED) {
                        mo8543a(this.f7019x);
                    }
                }
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(f6996a, "Google always throw an exception with setBackgroundDrawable on Nougat above. so we silently ignore it.");
        }
    }

    public void setBackgroundPlaybackEnabled(boolean z) {
        this.f7018w = z;
    }

    public void setControlsAnchorView(View view) {
        this.f7007l = view;
        view.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (C2231a.this.f7002g != null && motionEvent.getAction() == 1) {
                    if (C2231a.this.f7002g.isShowing()) {
                        C2231a.this.f7002g.hide();
                        return true;
                    }
                    C2231a.this.f7002g.show();
                }
                return true;
            }
        });
    }

    public void setForeground(Drawable drawable) {
        if (VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
            return;
        }
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(f6996a, "Google always throw an exception with setForeground on Nougat above. so we silently ignore it.");
        }
    }

    public void setFullScreen(boolean z) {
        this.f7009n = z;
        if (z && !this.f7017v) {
            setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (C2231a.this.f7002g != null && motionEvent.getAction() == 1) {
                        if (C2231a.this.f7002g.isShowing()) {
                            C2231a.this.f7002g.hide();
                            return true;
                        }
                        C2231a.this.f7002g.show();
                    }
                    return true;
                }
            });
        }
    }

    public void setRequestedVolume(float f) {
        this.f7015t = f;
        if (this.f7001f != null && this.f7003h != C2240d.PREPARING && this.f7003h != C2240d.IDLE) {
            this.f7001f.setVolume(f);
        }
    }

    public void setTestMode(boolean z) {
        this.f7020y = z;
    }

    public void setVideoMPD(String str) {
        this.f6998c = str;
    }

    public void setVideoStateChangeListener(C2241e eVar) {
        this.f6999d = eVar;
    }

    public void setup(Uri uri) {
        if (this.f7001f != null) {
            m8812f();
        }
        this.f6997b = uri;
        setSurfaceTextureListener(this);
        DefaultBandwidthMeter defaultBandwidthMeter = new DefaultBandwidthMeter();
        this.f7001f = ExoPlayerFactory.newSimpleInstance(getContext(), (TrackSelector) new DefaultTrackSelector((Factory) new AdaptiveTrackSelection.Factory(defaultBandwidthMeter)), (LoadControl) new DefaultLoadControl());
        this.f7001f.setVideoListener(this);
        this.f7001f.addListener(this);
        this.f7001f.setPlayWhenReady(false);
        if (this.f7009n && !this.f7017v) {
            this.f7002g = new MediaController(getContext());
            this.f7002g.setAnchorView(this.f7007l == null ? this : this.f7007l);
            this.f7002g.setMediaPlayer(new MediaPlayerControl() {
                public boolean canPause() {
                    return true;
                }

                public boolean canSeekBackward() {
                    return true;
                }

                public boolean canSeekForward() {
                    return true;
                }

                public int getAudioSessionId() {
                    if (C2231a.this.f7001f != null) {
                        return C2231a.this.f7001f.getAudioSessionId();
                    }
                    return 0;
                }

                public int getBufferPercentage() {
                    if (C2231a.this.f7001f != null) {
                        return C2231a.this.f7001f.getBufferedPercentage();
                    }
                    return 0;
                }

                public int getCurrentPosition() {
                    return C2231a.this.getCurrentPosition();
                }

                public int getDuration() {
                    return C2231a.this.getDuration();
                }

                public boolean isPlaying() {
                    return C2231a.this.f7001f != null && C2231a.this.f7001f.getPlayWhenReady();
                }

                public void pause() {
                    C2231a.this.mo8544a(true);
                }

                public void seekTo(int i) {
                    C2231a.this.mo8542a(i);
                }

                public void start() {
                    C2231a.this.mo8543a(C2116a.USER_STARTED);
                }
            });
            this.f7002g.setEnabled(true);
        }
        if (this.f6998c == null || this.f6998c.length() == 0 || this.f7020y) {
            ExtractorMediaSource extractorMediaSource = new ExtractorMediaSource(this.f6997b, new DefaultDataSourceFactory(getContext(), Util.getUserAgent(getContext(), "ads"), (TransferListener<? super DataSource>) defaultBandwidthMeter), new DefaultExtractorsFactory(), null, null);
            this.f7001f.prepare(extractorMediaSource);
        }
        setVideoState(C2240d.PREPARING);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }
}
