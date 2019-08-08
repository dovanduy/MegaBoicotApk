package mega.boicot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.appnext.base.p046b.C1245d;
import java.io.IOException;
import java.util.HashMap;

public class FullscreenVideoView extends RelativeLayout implements OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, OnVideoSizeChangedListener, Callback {

    /* renamed from: A */
    protected ViewGroup f19488A;

    /* renamed from: B */
    protected LayoutParams f19489B;

    /* renamed from: C */
    protected boolean f19490C;

    /* renamed from: D */
    protected boolean f19491D;

    /* renamed from: E */
    protected int f19492E;

    /* renamed from: F */
    protected int f19493F;

    /* renamed from: G */
    protected OnErrorListener f19494G;

    /* renamed from: H */
    protected OnPreparedListener f19495H;

    /* renamed from: I */
    protected Uri f19496I;

    /* renamed from: p */
    config f19497p;

    /* renamed from: q */
    protected Context f19498q;

    /* renamed from: r */
    protected MediaPlayer f19499r;

    /* renamed from: s */
    protected SurfaceHolder f19500s;

    /* renamed from: t */
    protected SurfaceView f19501t;

    /* renamed from: u */
    protected boolean f19502u;

    /* renamed from: v */
    protected boolean f19503v;

    /* renamed from: w */
    protected boolean f19504w;

    /* renamed from: x */
    protected C5926a f19505x;

    /* renamed from: y */
    protected C5926a f19506y;

    /* renamed from: z */
    protected View f19507z;

    /* renamed from: mega.boicot.FullscreenVideoView$a */
    public enum C5926a {
        IDLE,
        INITIALIZED,
        PREPARED,
        PREPARING,
        STARTED,
        STOPPED,
        PAUSED,
        PLAYBACKCOMPLETED,
        ERROR,
        END
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    public FullscreenVideoView(Context context) {
        super(context);
        this.f19498q = context;
        mo21480a();
    }

    public FullscreenVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19498q = context;
        mo21480a();
    }

    public FullscreenVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19498q = context;
        mo21480a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo21546s();
    }

    public Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f19504w) {
            if (this.f19499r != null) {
                this.f19499r.setOnPreparedListener(null);
                this.f19499r.setOnErrorListener(null);
                this.f19499r.setOnSeekCompleteListener(null);
                this.f19499r.setOnCompletionListener(null);
                this.f19499r.setOnInfoListener(null);
                if (this.f19499r.isPlaying()) {
                    this.f19499r.stop();
                }
                this.f19499r.release();
                this.f19499r = null;
            }
            this.f19502u = false;
            this.f19503v = false;
            this.f19505x = C5926a.END;
        }
        this.f19504w = false;
    }

    public synchronized void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f19499r.setDisplay(this.f19500s);
        if (!this.f19503v) {
            this.f19503v = true;
            if (!(this.f19505x == C5926a.PREPARED || this.f19505x == C5926a.PAUSED || this.f19505x == C5926a.STARTED || this.f19505x == C5926a.PLAYBACKCOMPLETED)) {
                mo21487g();
            }
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        mo21546s();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f19499r != null && this.f19499r.isPlaying()) {
            this.f19499r.pause();
        }
        this.f19503v = false;
    }

    public synchronized void onPrepared(MediaPlayer mediaPlayer) {
        this.f19502u = true;
        mo21487g();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        mo21544q();
        if (this.f19506y != null) {
            switch (this.f19506y) {
                case STARTED:
                    mo21488h();
                    return;
                case PLAYBACKCOMPLETED:
                    this.f19505x = C5926a.PLAYBACKCOMPLETED;
                    return;
                case PREPARED:
                    this.f19505x = C5926a.PREPARED;
                    return;
                default:
                    return;
            }
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f19499r != null && this.f19505x != C5926a.ERROR) {
            if (!this.f19499r.isLooping()) {
                this.f19505x = C5926a.PLAYBACKCOMPLETED;
            } else {
                mo21488h();
            }
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        mo21544q();
        this.f19505x = C5926a.ERROR;
        if (this.f19494G != null) {
            return this.f19494G.onError(mediaPlayer, i, i2);
        }
        return false;
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f19492E == 0 && this.f19493F == 0) {
            this.f19492E = i;
            this.f19493F = i2;
            mo21546s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21480a() {
        if (!isInEditMode()) {
            this.f19497p = (config) this.f19498q.getApplicationContext();
            this.f19491D = true;
            this.f19505x = C5926a.IDLE;
            this.f19490C = false;
            setBackgroundColor(-16777216);
            mo21482b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21482b() {
        this.f19499r = new MediaPlayer();
        this.f19501t = new SurfaceView(this.f19498q);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f19501t.setLayoutParams(layoutParams);
        addView(this.f19501t);
        this.f19500s = this.f19501t.getHolder();
        this.f19500s.setType(3);
        this.f19500s.addCallback(this);
        if (this.f19507z == null) {
            this.f19507z = new ProgressBar(this.f19498q);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        this.f19507z.setLayoutParams(layoutParams2);
        if (VERSION.SDK_INT > 20) {
            config.m23838a((ProgressBar) this.f19507z, this.f19497p.f17890aW);
        }
        addView(this.f19507z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo21483c() {
        if (this.f19500s != null) {
            this.f19500s.removeCallback(this);
            this.f19500s = null;
        }
        if (this.f19499r != null) {
            this.f19499r.release();
            this.f19499r = null;
        }
        if (this.f19501t != null) {
            removeView(this.f19501t);
        }
        if (this.f19507z != null) {
            removeView(this.f19507z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo21535o() throws IllegalStateException {
        mo21543p();
        this.f19502u = false;
        this.f19493F = -1;
        this.f19492E = -1;
        this.f19499r.setOnPreparedListener(this);
        this.f19499r.setOnErrorListener(this);
        this.f19499r.setOnSeekCompleteListener(this);
        this.f19499r.setOnInfoListener(this);
        this.f19499r.setOnVideoSizeChangedListener(this);
        this.f19499r.setAudioStreamType(3);
        this.f19505x = C5926a.PREPARING;
        this.f19499r.prepareAsync();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo21487g() {
        if (this.f19503v && this.f19502u) {
            if (this.f19499r != null) {
                this.f19492E = this.f19499r.getVideoWidth();
                this.f19493F = this.f19499r.getVideoHeight();
            }
            mo21546s();
            mo21544q();
            this.f19505x = C5926a.PREPARED;
            if (this.f19491D) {
                mo21488h();
            }
            if (this.f19495H != null) {
                this.f19495H.onPrepared(this.f19499r);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo21543p() {
        if (this.f19507z != null) {
            this.f19507z.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo21544q() {
        if (this.f19507z != null) {
            this.f19507z.setVisibility(8);
        }
    }

    public synchronized C5926a getCurrentState() {
        return this.f19505x;
    }

    /* renamed from: r */
    public boolean mo21545r() {
        return this.f19490C;
    }

    @TargetApi(16)
    public void setFullscreen(boolean z) throws RuntimeException {
        if (this.f19499r == null) {
            throw new RuntimeException("Media Player is not initialized");
        }
        if (this.f19505x != C5926a.ERROR) {
            boolean z2 = false;
            if (!(VERSION.SDK_INT >= 16 ? ViewConfiguration.get(getContext()).hasPermanentMenuKey() : true)) {
                ((Activity) getContext()).getWindow().getDecorView().setSystemUiVisibility(z ? 6 : 0);
            } else if (z) {
                ((Activity) getContext()).getWindow().setFlags(C1245d.f3947iP, C1245d.f3947iP);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(C1245d.f3947iP);
            }
            if (this.f19490C != z) {
                this.f19490C = z;
                final boolean isPlaying = this.f19499r.isPlaying();
                if (isPlaying) {
                    mo21489i();
                }
                if (this.f19490C) {
                    View findViewById = getRootView().findViewById(16908290);
                    ViewParent parent = getParent();
                    if (parent instanceof ViewGroup) {
                        if (this.f19488A == null) {
                            this.f19488A = (ViewGroup) parent;
                        }
                        this.f19504w = true;
                        this.f19489B = getLayoutParams();
                        this.f19488A.removeView(this);
                    }
                    if (findViewById instanceof ViewGroup) {
                        ((ViewGroup) findViewById).addView(this);
                    }
                } else {
                    ViewParent parent2 = getParent();
                    if (parent2 instanceof ViewGroup) {
                        if (!(this.f19488A == null || this.f19488A.getParent() == null)) {
                            this.f19504w = true;
                            z2 = true;
                        }
                        ((ViewGroup) parent2).removeView(this);
                        if (z2) {
                            this.f19488A.addView(this);
                            setLayoutParams(this.f19489B);
                        }
                    }
                }
                mo21546s();
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        if (isPlaying && FullscreenVideoView.this.f19499r != null) {
                            FullscreenVideoView.this.mo21488h();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: s */
    public void mo21546s() {
        if (this.f19493F != -1 && this.f19492E != -1 && this.f19501t != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    View view = (View) FullscreenVideoView.this.getParent();
                    if (view != null) {
                        float f = ((float) FullscreenVideoView.this.f19492E) / ((float) FullscreenVideoView.this.f19493F);
                        int width = view.getWidth();
                        int height = view.getHeight();
                        float f2 = (float) width;
                        float f3 = (float) height;
                        if (f > f2 / f3) {
                            height = (int) (f2 / f);
                        } else {
                            width = (int) (f * f3);
                        }
                        LayoutParams layoutParams = FullscreenVideoView.this.f19501t.getLayoutParams();
                        layoutParams.width = width;
                        layoutParams.height = height;
                        FullscreenVideoView.this.f19501t.setLayoutParams(layoutParams);
                        try {
                            ((LinearLayout) FullscreenVideoView.this.findViewById(R.id.ll_btns)).setLayoutParams(layoutParams);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public int getCurrentPosition() {
        if (this.f19499r != null) {
            return this.f19499r.getCurrentPosition();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public int getDuration() {
        if (this.f19499r != null) {
            return this.f19499r.getDuration();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: t */
    public boolean mo21553t() throws IllegalStateException {
        if (this.f19499r != null) {
            return this.f19499r.isPlaying();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: i */
    public void mo21489i() throws IllegalStateException {
        if (this.f19499r != null) {
            this.f19505x = C5926a.PAUSED;
            this.f19499r.pause();
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: j */
    public void mo21490j() {
        if (this.f19499r != null) {
            this.f19505x = C5926a.IDLE;
            mo21483c();
            mo21482b();
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: h */
    public void mo21488h() throws IllegalStateException {
        if (this.f19499r != null) {
            C5926a aVar = this.f19505x;
            this.f19505x = C5926a.STARTED;
            this.f19499r.setOnCompletionListener(this);
            this.f19499r.start();
            if (aVar == C5926a.PREPARED) {
                ((config) this.f19498q.getApplicationContext()).mo20770a(this.f19498q, false, false);
                return;
            }
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: a */
    public void mo21530a(int i) throws IllegalStateException {
        if (this.f19499r == null) {
            throw new RuntimeException("Media Player is not initialized");
        } else if (this.f19499r.getDuration() > -1 && i <= this.f19499r.getDuration()) {
            this.f19506y = this.f19505x;
            mo21489i();
            this.f19499r.seekTo(i);
            mo21543p();
        }
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.f19499r != null) {
            this.f19494G = onErrorListener;
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        if (this.f19499r != null) {
            this.f19495H = onPreparedListener;
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: a */
    public void mo21531a(Uri uri, String str) throws IOException, IllegalStateException, SecurityException, IllegalArgumentException, RuntimeException {
        if (this.f19499r == null) {
            throw new RuntimeException("Media Player is not initialized");
        } else if (this.f19505x != C5926a.IDLE) {
            StringBuilder sb = new StringBuilder();
            sb.append("FullscreenVideoView Invalid State: ");
            sb.append(this.f19505x);
            throw new IllegalStateException(sb.toString());
        } else {
            if (str == null || str.isEmpty()) {
                this.f19499r.setDataSource(this.f19498q, uri);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", str);
                this.f19499r.setDataSource(this.f19498q, uri, hashMap);
            }
            this.f19496I = uri;
            this.f19505x = C5926a.INITIALIZED;
            mo21535o();
        }
    }
}
