package com.facebook.ads.internal.view.p110i.p114d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer.TrackInfo;
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
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;

@TargetApi(14)
/* renamed from: com.facebook.ads.internal.view.i.d.b */
public class C2235b extends TextureView implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, OnVideoSizeChangedListener, SurfaceTextureListener, C2239c {

    /* renamed from: t */
    private static final String f7024t = "b";

    /* renamed from: a */
    private Uri f7025a;

    /* renamed from: b */
    private C2241e f7026b;

    /* renamed from: c */
    private Surface f7027c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public MediaPlayer f7028d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public MediaController f7029e;

    /* renamed from: f */
    private C2240d f7030f = C2240d.IDLE;

    /* renamed from: g */
    private C2240d f7031g = C2240d.IDLE;

    /* renamed from: h */
    private C2240d f7032h = C2240d.IDLE;

    /* renamed from: i */
    private boolean f7033i = false;

    /* renamed from: j */
    private View f7034j;

    /* renamed from: k */
    private int f7035k = 0;

    /* renamed from: l */
    private long f7036l;

    /* renamed from: m */
    private int f7037m = 0;

    /* renamed from: n */
    private int f7038n = 0;

    /* renamed from: o */
    private float f7039o = 1.0f;

    /* renamed from: p */
    private boolean f7040p = false;

    /* renamed from: q */
    private int f7041q = 3;

    /* renamed from: r */
    private boolean f7042r = false;

    /* renamed from: s */
    private boolean f7043s = false;

    /* renamed from: u */
    private int f7044u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f7045v = false;

    /* renamed from: w */
    private C2116a f7046w = C2116a.NOT_STARTED;

    /* renamed from: x */
    private final MediaPlayerControl f7047x = new MediaPlayerControl() {
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
            if (C2235b.this.f7028d != null) {
                return C2235b.this.f7028d.getAudioSessionId();
            }
            return 0;
        }

        public int getBufferPercentage() {
            return 0;
        }

        public int getCurrentPosition() {
            return C2235b.this.getCurrentPosition();
        }

        public int getDuration() {
            return C2235b.this.getDuration();
        }

        public boolean isPlaying() {
            return C2235b.this.f7028d != null && C2235b.this.f7028d.isPlaying();
        }

        public void pause() {
            C2235b.this.mo8544a(true);
        }

        public void seekTo(int i) {
            C2235b.this.mo8542a(i);
        }

        public void start() {
            C2235b.this.mo8543a(C2116a.USER_STARTED);
        }
    };

    public C2235b(Context context) {
        super(context);
    }

    public C2235b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C2235b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public C2235b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private boolean m8822a(Surface surface) {
        if (this.f7028d == null) {
            return false;
        }
        try {
            this.f7028d.setSurface(surface);
            return true;
        } catch (IllegalStateException e) {
            C2370a.m9149b(getContext(), "player", C2373b.f7474I, e);
            Log.d(f7024t, "The MediaPlayer failed", e);
            return false;
        }
    }

    /* renamed from: f */
    private boolean m8825f() {
        return this.f7030f == C2240d.PREPARED || this.f7030f == C2240d.STARTED || this.f7030f == C2240d.PAUSED || this.f7030f == C2240d.PLAYBACK_COMPLETED;
    }

    /* renamed from: g */
    private boolean m8826g() {
        if (this.f7028d == null) {
            return false;
        }
        try {
            this.f7028d.reset();
            return true;
        } catch (IllegalStateException e) {
            C2370a.m9149b(getContext(), "player", C2373b.f7475J, e);
            Log.d(f7024t, "The MediaPlayer failed", e);
            return false;
        }
    }

    private void setVideoState(C2240d dVar) {
        if (dVar != this.f7030f) {
            this.f7030f = dVar;
            if (this.f7026b != null) {
                this.f7026b.mo8382a(dVar);
            }
        }
    }

    /* renamed from: a */
    public void mo8541a() {
        if (!this.f7042r) {
            mo8544a(false);
        }
    }

    /* renamed from: a */
    public void mo8542a(int i) {
        if (this.f7028d == null || !m8825f()) {
            this.f7035k = i;
        } else if (i < getDuration() && i > 0) {
            this.f7044u = getCurrentPosition();
            this.f7035k = i;
            this.f7028d.seekTo(i);
        }
    }

    /* renamed from: a */
    public void mo8543a(C2116a aVar) {
        this.f7031g = C2240d.STARTED;
        this.f7046w = aVar;
        if (this.f7030f == C2240d.STARTED || this.f7030f == C2240d.PREPARED || this.f7030f == C2240d.IDLE || this.f7030f == C2240d.PAUSED || this.f7030f == C2240d.PLAYBACK_COMPLETED) {
            if (this.f7028d == null) {
                setup(this.f7025a);
            } else {
                if (this.f7035k > 0) {
                    this.f7028d.seekTo(this.f7035k);
                }
                this.f7028d.start();
                if (this.f7030f != C2240d.PREPARED || this.f7043s) {
                    setVideoState(C2240d.STARTED);
                }
            }
        }
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    /* renamed from: a */
    public void mo8544a(boolean z) {
        C2240d dVar;
        this.f7031g = C2240d.PAUSED;
        if (this.f7028d != null) {
            if ((this.f7030f == C2240d.PREPARING || this.f7030f == C2240d.PREPARED) ? false : true) {
                if (z) {
                    this.f7032h = C2240d.PAUSED;
                    this.f7033i = true;
                }
                this.f7028d.pause();
                if (this.f7030f != C2240d.PLAYBACK_COMPLETED) {
                    dVar = C2240d.PAUSED;
                }
            }
            return;
        }
        dVar = C2240d.IDLE;
        setVideoState(dVar);
    }

    /* renamed from: b */
    public void mo8545b() {
        setVideoState(C2240d.PLAYBACK_COMPLETED);
        mo8546c();
        this.f7035k = 0;
    }

    /* renamed from: c */
    public void mo8546c() {
        this.f7031g = C2240d.IDLE;
        if (this.f7028d != null) {
            int currentPosition = this.f7028d.getCurrentPosition();
            if (currentPosition > 0) {
                this.f7035k = currentPosition;
            }
            this.f7028d.stop();
            m8826g();
            this.f7028d.release();
            this.f7028d = null;
            if (this.f7029e != null) {
                this.f7029e.hide();
                this.f7029e.setEnabled(false);
            }
        }
        setVideoState(C2240d.IDLE);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public boolean mo8547d() {
        if (this.f7028d == null || VERSION.SDK_INT < 16) {
            return false;
        }
        try {
            for (TrackInfo trackType : this.f7028d.getTrackInfo()) {
                if (trackType.getTrackType() == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e(f7024t, "Couldn't retrieve video information", e);
            return true;
        }
    }

    /* renamed from: e */
    public void mo8548e() {
        if (this.f7028d != null) {
            m8822a((Surface) null);
            this.f7028d.setOnBufferingUpdateListener(null);
            this.f7028d.setOnCompletionListener(null);
            this.f7028d.setOnErrorListener(null);
            this.f7028d.setOnInfoListener(null);
            this.f7028d.setOnPreparedListener(null);
            this.f7028d.setOnVideoSizeChangedListener(null);
            this.f7028d.setOnSeekCompleteListener(null);
            m8826g();
            this.f7028d = null;
            setVideoState(C2240d.IDLE);
        }
    }

    public int getCurrentPosition() {
        if (this.f7028d == null || !m8825f()) {
            return 0;
        }
        return this.f7028d.getCurrentPosition();
    }

    public int getDuration() {
        if (this.f7028d == null || !m8825f()) {
            return 0;
        }
        return this.f7028d.getDuration();
    }

    public long getInitialBufferTime() {
        return this.f7036l;
    }

    public C2116a getStartReason() {
        return this.f7046w;
    }

    public C2240d getState() {
        return this.f7030f;
    }

    public C2240d getTargetState() {
        return this.f7031g;
    }

    public int getVideoHeight() {
        return this.f7038n;
    }

    public int getVideoWidth() {
        return this.f7037m;
    }

    public View getView() {
        return this;
    }

    public float getVolume() {
        return this.f7039o;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f7028d != null) {
            this.f7028d.pause();
        }
        setVideoState(C2240d.PLAYBACK_COMPLETED);
        mo8542a(0);
        this.f7035k = 0;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f7041q <= 0 || getState() != C2240d.STARTED) {
            setVideoState(C2240d.ERROR);
            mo8546c();
            return true;
        }
        this.f7041q--;
        mo8546c();
        mo8543a(this.f7046w);
        return true;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInfo(android.media.MediaPlayer r2, int r3, int r4) {
        /*
            r1 = this;
            r2 = 3
            r4 = 1
            if (r3 == r2) goto L_0x0022
            r2 = 0
            switch(r3) {
                case 701: goto L_0x001c;
                case 702: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r2
        L_0x0009:
            com.facebook.ads.internal.view.i.d.d r3 = r1.f7030f
            com.facebook.ads.internal.view.i.d.d r0 = com.facebook.ads.internal.view.p110i.p114d.C2240d.PREPARING
            if (r3 == r0) goto L_0x0016
            com.facebook.ads.internal.view.i.d.d r3 = r1.f7030f
            com.facebook.ads.internal.view.i.d.d r0 = com.facebook.ads.internal.view.p110i.p114d.C2240d.PREPARED
            if (r3 == r0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r4 = r2
        L_0x0017:
            if (r4 == 0) goto L_0x0021
            com.facebook.ads.internal.view.i.d.d r3 = com.facebook.ads.internal.view.p110i.p114d.C2240d.STARTED
            goto L_0x001e
        L_0x001c:
            com.facebook.ads.internal.view.i.d.d r3 = com.facebook.ads.internal.view.p110i.p114d.C2240d.BUFFERING
        L_0x001e:
            r1.setVideoState(r3)
        L_0x0021:
            return r2
        L_0x0022:
            r1.f7043s = r4
            com.facebook.ads.internal.view.i.d.d r2 = r1.f7031g
            com.facebook.ads.internal.view.i.d.d r3 = com.facebook.ads.internal.view.p110i.p114d.C2240d.STARTED
            if (r2 != r3) goto L_0x002f
            com.facebook.ads.internal.view.i.d.d r2 = com.facebook.ads.internal.view.p110i.p114d.C2240d.STARTED
            r1.setVideoState(r2)
        L_0x002f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.p110i.p114d.C2235b.onInfo(android.media.MediaPlayer, int, int):boolean");
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        setVideoState(C2240d.PREPARED);
        if (this.f7040p && !this.f7045v) {
            this.f7029e = new MediaController(getContext());
            this.f7029e.setAnchorView(this.f7034j == null ? this : this.f7034j);
            this.f7029e.setMediaPlayer(this.f7047x);
            this.f7029e.setEnabled(true);
        }
        setRequestedVolume(this.f7039o);
        this.f7037m = mediaPlayer.getVideoWidth();
        this.f7038n = mediaPlayer.getVideoHeight();
        if (this.f7035k > 0) {
            if (this.f7035k >= this.f7028d.getDuration()) {
                this.f7035k = 0;
            }
            this.f7028d.seekTo(this.f7035k);
            this.f7035k = 0;
        }
        if (this.f7031g == C2240d.STARTED) {
            mo8543a(this.f7046w);
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.f7026b != null) {
            this.f7026b.mo8379a(this.f7044u, this.f7035k);
            this.f7035k = 0;
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f7027c == null) {
            this.f7027c = new Surface(surfaceTexture);
        }
        if (!m8822a(this.f7027c)) {
            setVideoState(C2240d.ERROR);
            mo8548e();
            return;
        }
        this.f7033i = false;
        if (this.f7030f == C2240d.PAUSED && this.f7032h != C2240d.PAUSED) {
            mo8543a(this.f7046w);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m8822a((Surface) null);
        if (this.f7027c != null) {
            this.f7027c.release();
            this.f7027c = null;
        }
        if (!this.f7033i) {
            this.f7032h = this.f7040p ? C2240d.STARTED : this.f7030f;
            this.f7033i = true;
        }
        if (this.f7030f != C2240d.PAUSED) {
            mo8544a(false);
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.f7037m = mediaPlayer.getVideoWidth();
        this.f7038n = mediaPlayer.getVideoHeight();
        if (this.f7037m != 0 && this.f7038n != 0) {
            requestLayout();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f7028d != null) {
            if (this.f7029e == null || !this.f7029e.isShowing()) {
                if (!z) {
                    if (!this.f7033i) {
                        this.f7032h = this.f7040p ? C2240d.STARTED : this.f7030f;
                        this.f7033i = true;
                    }
                    if (this.f7030f != C2240d.PAUSED) {
                        mo8541a();
                    }
                } else {
                    this.f7033i = false;
                    if (this.f7030f == C2240d.PAUSED && this.f7032h != C2240d.PAUSED) {
                        mo8543a(this.f7046w);
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
            Log.w(f7024t, "Google always throw an exception with setBackgroundDrawable on Nougat above. so we silently ignore it.");
        }
    }

    public void setBackgroundPlaybackEnabled(boolean z) {
        this.f7042r = z;
    }

    public void setControlsAnchorView(View view) {
        this.f7034j = view;
        view.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!C2235b.this.f7045v && C2235b.this.f7029e != null && motionEvent.getAction() == 1) {
                    if (C2235b.this.f7029e.isShowing()) {
                        C2235b.this.f7029e.hide();
                        return true;
                    }
                    C2235b.this.f7029e.show();
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
            Log.w(f7024t, "Google always throw an exception with setForeground on Nougat above. so we silently ignore it.");
        }
    }

    public void setFullScreen(boolean z) {
        this.f7040p = z;
        if (this.f7040p && !this.f7045v) {
            setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!C2235b.this.f7045v && C2235b.this.f7029e != null && motionEvent.getAction() == 1) {
                        if (C2235b.this.f7029e.isShowing()) {
                            C2235b.this.f7029e.hide();
                            return true;
                        }
                        C2235b.this.f7029e.show();
                    }
                    return true;
                }
            });
        }
    }

    public void setRequestedVolume(float f) {
        this.f7039o = f;
        if (this.f7028d != null && this.f7030f != C2240d.PREPARING && this.f7030f != C2240d.IDLE) {
            this.f7028d.setVolume(f, f);
        }
    }

    public void setVideoMPD(String str) {
    }

    public void setVideoStateChangeListener(C2241e eVar) {
        this.f7026b = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098 A[SYNTHETIC, Splitter:B:27:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3 A[SYNTHETIC, Splitter:B:33:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setup(android.net.Uri r11) {
        /*
            r10 = this;
            r0 = 0
            r10.f7043s = r0
            r10.f7025a = r11
            android.media.MediaPlayer r1 = r10.f7028d
            r2 = 0
            if (r1 == 0) goto L_0x0018
            r10.m8826g()
            r10.m8822a(r2)
            android.media.MediaPlayer r1 = r10.f7028d
            com.facebook.ads.internal.view.i.d.d r3 = com.facebook.ads.internal.view.p110i.p114d.C2240d.IDLE
            r10.setVideoState(r3)
            goto L_0x001d
        L_0x0018:
            android.media.MediaPlayer r1 = new android.media.MediaPlayer
            r1.<init>()
        L_0x001d:
            java.lang.String r3 = r11.getScheme()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r4 = "asset"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x00f9 }
            if (r3 == 0) goto L_0x00cf
            android.content.Context r3 = r10.getContext()     // Catch:{ IOException | SecurityException -> 0x007a }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException | SecurityException -> 0x007a }
            java.lang.String r11 = r11.getPath()     // Catch:{ IOException | SecurityException -> 0x007a }
            r4 = 1
            java.lang.String r11 = r11.substring(r4)     // Catch:{ IOException | SecurityException -> 0x007a }
            android.content.res.AssetFileDescriptor r11 = r3.openFd(r11)     // Catch:{ IOException | SecurityException -> 0x007a }
            long r5 = r11.getStartOffset()     // Catch:{ IOException | SecurityException -> 0x0073, all -> 0x006e }
            long r7 = r11.getLength()     // Catch:{ IOException | SecurityException -> 0x0073, all -> 0x006e }
            java.io.FileDescriptor r4 = r11.getFileDescriptor()     // Catch:{ IOException | SecurityException -> 0x0073, all -> 0x006e }
            r3 = r1
            r3.setDataSource(r4, r5, r7)     // Catch:{ IOException | SecurityException -> 0x0073, all -> 0x006e }
            if (r11 == 0) goto L_0x00d6
            r11.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x00d6
        L_0x0055:
            r11 = move-exception
            java.lang.String r2 = f7024t     // Catch:{ Exception -> 0x00f9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f9 }
            r3.<init>()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r4 = "Unable to close"
            r3.append(r4)     // Catch:{ Exception -> 0x00f9 }
            r3.append(r11)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r11 = r3.toString()     // Catch:{ Exception -> 0x00f9 }
        L_0x0069:
            android.util.Log.w(r2, r11)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x00d6
        L_0x006e:
            r2 = move-exception
            r9 = r2
            r2 = r11
            r11 = r9
            goto L_0x00b1
        L_0x0073:
            r2 = move-exception
            r9 = r2
            r2 = r11
            r11 = r9
            goto L_0x007b
        L_0x0078:
            r11 = move-exception
            goto L_0x00b1
        L_0x007a:
            r11 = move-exception
        L_0x007b:
            java.lang.String r3 = f7024t     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r4.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Failed to open assets "
            r4.append(r5)     // Catch:{ all -> 0x0078 }
            r4.append(r11)     // Catch:{ all -> 0x0078 }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x0078 }
            android.util.Log.w(r3, r11)     // Catch:{ all -> 0x0078 }
            com.facebook.ads.internal.view.i.d.d r11 = com.facebook.ads.internal.view.p110i.p114d.C2240d.ERROR     // Catch:{ all -> 0x0078 }
            r10.setVideoState(r11)     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x00d6
            r2.close()     // Catch:{ IOException -> 0x009c }
            goto L_0x00d6
        L_0x009c:
            r11 = move-exception
            java.lang.String r2 = f7024t     // Catch:{ Exception -> 0x00f9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f9 }
            r3.<init>()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r4 = "Unable to close"
            r3.append(r4)     // Catch:{ Exception -> 0x00f9 }
            r3.append(r11)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r11 = r3.toString()     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0069
        L_0x00b1:
            if (r2 == 0) goto L_0x00ce
            r2.close()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00ce
        L_0x00b7:
            r2 = move-exception
            java.lang.String r3 = f7024t     // Catch:{ Exception -> 0x00f9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f9 }
            r4.<init>()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r5 = "Unable to close"
            r4.append(r5)     // Catch:{ Exception -> 0x00f9 }
            r4.append(r2)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x00f9 }
            android.util.Log.w(r3, r2)     // Catch:{ Exception -> 0x00f9 }
        L_0x00ce:
            throw r11     // Catch:{ Exception -> 0x00f9 }
        L_0x00cf:
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00f9 }
            r1.setDataSource(r11)     // Catch:{ Exception -> 0x00f9 }
        L_0x00d6:
            r1.setLooping(r0)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnBufferingUpdateListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnCompletionListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnErrorListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnInfoListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnPreparedListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnVideoSizeChangedListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnSeekCompleteListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.prepareAsync()     // Catch:{ Exception -> 0x00f9 }
            r10.f7028d = r1     // Catch:{ Exception -> 0x00f9 }
            com.facebook.ads.internal.view.i.d.d r11 = com.facebook.ads.internal.view.p110i.p114d.C2240d.PREPARING     // Catch:{ Exception -> 0x00f9 }
            r10.setVideoState(r11)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0118
        L_0x00f9:
            r11 = move-exception
            com.facebook.ads.internal.view.i.d.d r2 = com.facebook.ads.internal.view.p110i.p114d.C2240d.ERROR
            r10.setVideoState(r2)
            r1.release()
            java.lang.String r1 = f7024t
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot prepare media player with SurfaceTexture: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            android.util.Log.e(r1, r11)
        L_0x0118:
            r10.setSurfaceTextureListener(r10)
            boolean r11 = r10.isAvailable()
            if (r11 == 0) goto L_0x0128
            android.graphics.SurfaceTexture r11 = r10.getSurfaceTexture()
            r10.onSurfaceTextureAvailable(r11, r0, r0)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.p110i.p114d.C2235b.setup(android.net.Uri):void");
    }
}
