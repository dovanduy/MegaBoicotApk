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
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.appnext.base.p046b.C1245d;
import java.io.IOException;
import java.util.HashMap;

public class FullscreenVideoView_pro extends RelativeLayout implements OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, OnVideoSizeChangedListener, Callback {

    /* renamed from: A */
    protected boolean f19523A;

    /* renamed from: B */
    protected boolean f19524B;

    /* renamed from: C */
    protected boolean f19525C;

    /* renamed from: D */
    protected boolean f19526D;

    /* renamed from: E */
    protected int f19527E;

    /* renamed from: F */
    protected int f19528F;

    /* renamed from: G */
    protected OnErrorListener f19529G;

    /* renamed from: H */
    protected OnPreparedListener f19530H;

    /* renamed from: I */
    protected Uri f19531I;

    /* renamed from: o */
    protected Context f19532o;

    /* renamed from: p */
    protected MediaPlayer f19533p;

    /* renamed from: q */
    protected SurfaceHolder f19534q;

    /* renamed from: r */
    protected SurfaceView f19535r;

    /* renamed from: s */
    protected boolean f19536s;

    /* renamed from: t */
    protected boolean f19537t;

    /* renamed from: u */
    protected boolean f19538u;

    /* renamed from: v */
    protected C5930a f19539v;

    /* renamed from: w */
    protected C5930a f19540w;

    /* renamed from: x */
    protected View f19541x;

    /* renamed from: y */
    protected ViewGroup f19542y;

    /* renamed from: z */
    protected LayoutParams f19543z;

    /* renamed from: mega.boicot.FullscreenVideoView_pro$a */
    public enum C5930a {
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

    public FullscreenVideoView_pro(Context context) {
        super(context);
        this.f19532o = context;
        mo21505a();
    }

    public FullscreenVideoView_pro(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19532o = context;
        mo21505a();
    }

    public FullscreenVideoView_pro(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19532o = context;
        mo21505a();
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
        if (!this.f19538u) {
            if (this.f19533p != null) {
                this.f19533p.setOnPreparedListener(null);
                this.f19533p.setOnErrorListener(null);
                this.f19533p.setOnSeekCompleteListener(null);
                this.f19533p.setOnCompletionListener(null);
                this.f19533p.setOnInfoListener(null);
                if (this.f19533p.isPlaying()) {
                    this.f19533p.stop();
                }
                this.f19533p.release();
                this.f19533p = null;
            }
            this.f19536s = false;
            this.f19537t = false;
            this.f19539v = C5930a.END;
        }
        this.f19538u = false;
    }

    public synchronized void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f19533p.setDisplay(this.f19534q);
        if (!this.f19537t) {
            this.f19537t = true;
            if (!(this.f19539v == C5930a.PREPARED || this.f19539v == C5930a.PAUSED || this.f19539v == C5930a.STARTED || this.f19539v == C5930a.PLAYBACKCOMPLETED)) {
                mo21512g();
            }
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        mo21571s();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f19533p != null && this.f19533p.isPlaying()) {
            this.f19533p.pause();
        }
        this.f19537t = false;
    }

    public synchronized void onPrepared(MediaPlayer mediaPlayer) {
        this.f19536s = true;
        mo21512g();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        mo21569q();
        if (this.f19540w != null) {
            switch (this.f19540w) {
                case STARTED:
                    mo21513h();
                    return;
                case PLAYBACKCOMPLETED:
                    this.f19539v = C5930a.PLAYBACKCOMPLETED;
                    return;
                case PREPARED:
                    this.f19539v = C5930a.PREPARED;
                    return;
                default:
                    return;
            }
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f19533p != null && this.f19539v != C5930a.ERROR) {
            if (!this.f19533p.isLooping()) {
                this.f19539v = C5930a.PLAYBACKCOMPLETED;
            } else {
                mo21513h();
            }
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        mo21569q();
        this.f19539v = C5930a.ERROR;
        if (this.f19529G != null) {
            return this.f19529G.onError(mediaPlayer, i, i2);
        }
        return false;
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f19527E == 0 && this.f19528F == 0) {
            this.f19527E = i;
            this.f19528F = i2;
            mo21571s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21505a() {
        if (!isInEditMode()) {
            this.f19526D = true;
            this.f19539v = C5930a.IDLE;
            this.f19523A = false;
            setBackgroundColor(-16777216);
            mo21507b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21507b() {
        this.f19533p = new MediaPlayer();
        this.f19535r = new SurfaceView(this.f19532o);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f19535r.setLayoutParams(layoutParams);
        addView(this.f19535r);
        this.f19534q = this.f19535r.getHolder();
        this.f19534q.setType(3);
        this.f19534q.addCallback(this);
        if (this.f19541x == null) {
            this.f19541x = new ProgressBar(this.f19532o);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        this.f19541x.setLayoutParams(layoutParams2);
        addView(this.f19541x);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo21508c() {
        if (this.f19534q != null) {
            this.f19534q.removeCallback(this);
            this.f19534q = null;
        }
        if (this.f19533p != null) {
            this.f19533p.release();
            this.f19533p = null;
        }
        if (this.f19535r != null) {
            removeView(this.f19535r);
        }
        if (this.f19541x != null) {
            removeView(this.f19541x);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo21561o() throws IllegalStateException {
        mo21568p();
        this.f19536s = false;
        this.f19528F = -1;
        this.f19527E = -1;
        this.f19533p.setOnPreparedListener(this);
        this.f19533p.setOnErrorListener(this);
        this.f19533p.setOnSeekCompleteListener(this);
        this.f19533p.setOnInfoListener(this);
        this.f19533p.setOnVideoSizeChangedListener(this);
        this.f19533p.setAudioStreamType(3);
        this.f19539v = C5930a.PREPARING;
        this.f19533p.prepareAsync();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo21512g() {
        if (this.f19537t && this.f19536s) {
            if (this.f19533p != null) {
                this.f19527E = this.f19533p.getVideoWidth();
                this.f19528F = this.f19533p.getVideoHeight();
            }
            mo21571s();
            mo21569q();
            this.f19539v = C5930a.PREPARED;
            if (this.f19526D) {
                mo21513h();
            }
            if (this.f19530H != null) {
                this.f19530H.onPrepared(this.f19533p);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo21568p() {
        if (this.f19541x != null) {
            this.f19541x.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo21569q() {
        if (this.f19541x != null) {
            this.f19541x.setVisibility(8);
        }
    }

    public synchronized C5930a getCurrentState() {
        return this.f19539v;
    }

    /* renamed from: r */
    public boolean mo21570r() {
        return this.f19523A;
    }

    @TargetApi(16)
    public void setFullscreen(boolean z) throws RuntimeException {
        if (this.f19533p == null) {
            throw new RuntimeException("Media Player is not initialized");
        } else if (this.f19539v != C5930a.ERROR) {
            boolean z2 = true;
            if (!(VERSION.SDK_INT >= 16 ? ViewConfiguration.get(getContext()).hasPermanentMenuKey() : true)) {
                ((Activity) getContext()).getWindow().getDecorView().setSystemUiVisibility(z ? 4 : 0);
            } else if (z) {
                ((Activity) getContext()).getWindow().setFlags(C1245d.f3947iP, C1245d.f3947iP);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(C1245d.f3947iP);
            }
            this.f19523A = z;
            final boolean isPlaying = this.f19533p.isPlaying();
            if (isPlaying) {
                mo21514i();
            }
            if (this.f19523A) {
                View findViewById = getRootView().findViewById(16908290);
                ViewParent parent = getParent();
                if (parent instanceof ViewGroup) {
                    if (this.f19542y == null) {
                        this.f19542y = (ViewGroup) parent;
                    }
                    this.f19538u = true;
                    this.f19543z = getLayoutParams();
                    this.f19542y.removeView(this);
                }
                if (findViewById instanceof ViewGroup) {
                    ((ViewGroup) findViewById).addView(this);
                    setClickable(true);
                }
            } else {
                ViewParent parent2 = getParent();
                if (parent2 instanceof ViewGroup) {
                    if (this.f19542y == null || this.f19542y.getParent() == null) {
                        z2 = false;
                    } else {
                        this.f19538u = true;
                    }
                    ((ViewGroup) parent2).removeView(this);
                    if (z2) {
                        this.f19542y.addView(this, 0);
                        setLayoutParams(this.f19543z);
                    }
                }
            }
            mo21571s();
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (FullscreenVideoView_pro.this.f19533p == null) {
                        return;
                    }
                    if (isPlaying) {
                        FullscreenVideoView_pro.this.mo21513h();
                        return;
                    }
                    try {
                        FullscreenVideoView_pro.this.mo21556a(FullscreenVideoView_pro.this.getCurrentPosition());
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* renamed from: s */
    public void mo21571s() {
        if (this.f19528F != 0 && this.f19527E != 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
                /* JADX WARNING: Removed duplicated region for block: B:44:0x011b  */
                /* JADX WARNING: Removed duplicated region for block: B:45:0x011e  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r8 = this;
                        mega.boicot.FullscreenVideoView_pro r0 = mega.boicot.FullscreenVideoView_pro.this
                        android.view.View r0 = r0.getRootView()
                        if (r0 == 0) goto L_0x0125
                        mega.boicot.FullscreenVideoView_pro r1 = mega.boicot.FullscreenVideoView_pro.this
                        android.content.Context r1 = r1.f19532o
                        java.lang.String r2 = "window"
                        java.lang.Object r1 = r1.getSystemService(r2)
                        android.view.WindowManager r1 = (android.view.WindowManager) r1
                        android.view.Display r1 = r1.getDefaultDisplay()
                        android.graphics.Point r2 = new android.graphics.Point
                        r2.<init>()
                        r1.getSize(r2)
                        int r1 = r2.x
                        int r2 = r2.y
                        float r3 = (float) r1
                        float r4 = (float) r2
                        float r3 = r3 / r4
                        mega.boicot.FullscreenVideoView_pro r4 = mega.boicot.FullscreenVideoView_pro.this
                        int r4 = r4.f19528F
                        r5 = -1
                        if (r4 == r5) goto L_0x0034
                        mega.boicot.FullscreenVideoView_pro r4 = mega.boicot.FullscreenVideoView_pro.this
                        int r4 = r4.f19527E
                        if (r4 != r5) goto L_0x0041
                    L_0x0034:
                        mega.boicot.FullscreenVideoView_pro r4 = mega.boicot.FullscreenVideoView_pro.this
                        r5 = 30000(0x7530, float:4.2039E-41)
                        r4.f19527E = r5
                        mega.boicot.FullscreenVideoView_pro r4 = mega.boicot.FullscreenVideoView_pro.this
                        r5 = 40000(0x9c40, float:5.6052E-41)
                        r4.f19528F = r5
                    L_0x0041:
                        mega.boicot.FullscreenVideoView_pro r4 = mega.boicot.FullscreenVideoView_pro.this
                        int r4 = r4.f19527E
                        float r4 = (float) r4
                        mega.boicot.FullscreenVideoView_pro r5 = mega.boicot.FullscreenVideoView_pro.this
                        int r5 = r5.f19528F
                        float r5 = (float) r5
                        float r4 = r4 / r5
                        r5 = 1065353216(0x3f800000, float:1.0)
                        int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                        r6 = 0
                        r7 = 1
                        if (r4 <= 0) goto L_0x0056
                        r4 = r7
                        goto L_0x0057
                    L_0x0056:
                        r4 = r6
                    L_0x0057:
                        int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                        if (r3 <= 0) goto L_0x005c
                        r6 = r7
                    L_0x005c:
                        mega.boicot.FullscreenVideoView_pro r3 = mega.boicot.FullscreenVideoView_pro.this
                        boolean r3 = r3.f19523A
                        if (r3 == 0) goto L_0x0084
                        if (r6 != 0) goto L_0x0074
                        if (r4 == 0) goto L_0x0076
                        mega.boicot.FullscreenVideoView_pro r0 = mega.boicot.FullscreenVideoView_pro.this
                        int r0 = r0.f19528F
                        int r0 = r0 * r1
                        mega.boicot.FullscreenVideoView_pro r3 = mega.boicot.FullscreenVideoView_pro.this
                        int r3 = r3.f19527E
                        int r0 = r0 / r3
                    L_0x0070:
                        r5 = r0
                        r0 = r1
                        goto L_0x00e1
                    L_0x0074:
                        if (r4 == 0) goto L_0x0079
                    L_0x0076:
                        r0 = r1
                    L_0x0077:
                        r5 = r2
                        goto L_0x00e1
                    L_0x0079:
                        mega.boicot.FullscreenVideoView_pro r0 = mega.boicot.FullscreenVideoView_pro.this
                        int r0 = r0.f19527E
                        int r0 = r0 * r2
                        mega.boicot.FullscreenVideoView_pro r3 = mega.boicot.FullscreenVideoView_pro.this
                        int r3 = r3.f19528F
                        int r0 = r0 / r3
                        goto L_0x0077
                    L_0x0084:
                        mega.boicot.FullscreenVideoView_pro r3 = mega.boicot.FullscreenVideoView_pro.this
                        android.content.Context r3 = r3.f19532o
                        r5 = 43
                        int r3 = mega.boicot.config.m23845b(r3, r5)
                        mega.boicot.FullscreenVideoView_pro r5 = mega.boicot.FullscreenVideoView_pro.this
                        boolean r5 = r5.f19524B
                        r6 = 2131231229(0x7f0801fd, float:1.8078533E38)
                        if (r5 == 0) goto L_0x00a3
                        android.view.View r0 = r0.findViewById(r6)
                        int r0 = r0.getHeight()
                        int r0 = r0 / 2
                        r5 = r0
                        goto L_0x00be
                    L_0x00a3:
                        android.view.View r5 = r0.findViewById(r6)
                        int r5 = r5.getHeight()
                        int r5 = r5 - r3
                        mega.boicot.FullscreenVideoView_pro r3 = mega.boicot.FullscreenVideoView_pro.this
                        boolean r3 = r3.f19525C
                        if (r3 == 0) goto L_0x00be
                        r3 = 2131231180(0x7f0801cc, float:1.8078434E38)
                        android.view.View r0 = r0.findViewById(r3)
                        int r0 = r0.getHeight()
                        int r5 = r5 - r0
                    L_0x00be:
                        if (r4 == 0) goto L_0x00d7
                        mega.boicot.FullscreenVideoView_pro r0 = mega.boicot.FullscreenVideoView_pro.this
                        int r0 = r0.f19528F
                        int r0 = r0 * r1
                        mega.boicot.FullscreenVideoView_pro r3 = mega.boicot.FullscreenVideoView_pro.this
                        int r3 = r3.f19527E
                        int r0 = r0 / r3
                        if (r0 <= r5) goto L_0x0070
                        mega.boicot.FullscreenVideoView_pro r0 = mega.boicot.FullscreenVideoView_pro.this
                        int r0 = r0.f19527E
                        int r0 = r0 * r5
                        mega.boicot.FullscreenVideoView_pro r3 = mega.boicot.FullscreenVideoView_pro.this
                        int r3 = r3.f19528F
                        int r0 = r0 / r3
                        goto L_0x00e1
                    L_0x00d7:
                        mega.boicot.FullscreenVideoView_pro r0 = mega.boicot.FullscreenVideoView_pro.this
                        int r0 = r0.f19527E
                        int r0 = r0 * r5
                        mega.boicot.FullscreenVideoView_pro r3 = mega.boicot.FullscreenVideoView_pro.this
                        int r3 = r3.f19528F
                        int r0 = r0 / r3
                    L_0x00e1:
                        mega.boicot.FullscreenVideoView_pro r3 = mega.boicot.FullscreenVideoView_pro.this
                        android.view.SurfaceView r3 = r3.f19535r
                        if (r3 == 0) goto L_0x010d
                        mega.boicot.FullscreenVideoView_pro r3 = mega.boicot.FullscreenVideoView_pro.this
                        android.view.SurfaceView r3 = r3.f19535r
                        android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                        r3.width = r0
                        r3.height = r5
                        mega.boicot.FullscreenVideoView_pro r0 = mega.boicot.FullscreenVideoView_pro.this
                        android.view.SurfaceView r0 = r0.f19535r
                        r0.setLayoutParams(r3)
                        mega.boicot.FullscreenVideoView_pro r0 = mega.boicot.FullscreenVideoView_pro.this     // Catch:{ Exception -> 0x0109 }
                        r4 = 2131231167(0x7f0801bf, float:1.8078407E38)
                        android.view.View r0 = r0.findViewById(r4)     // Catch:{ Exception -> 0x0109 }
                        android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x0109 }
                        r0.setLayoutParams(r3)     // Catch:{ Exception -> 0x0109 }
                        goto L_0x010d
                    L_0x0109:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x010d:
                        mega.boicot.FullscreenVideoView_pro r0 = mega.boicot.FullscreenVideoView_pro.this
                        android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                        r0.width = r1
                        mega.boicot.FullscreenVideoView_pro r1 = mega.boicot.FullscreenVideoView_pro.this
                        boolean r1 = r1.f19523A
                        if (r1 == 0) goto L_0x011e
                        r0.height = r2
                        goto L_0x0120
                    L_0x011e:
                        r0.height = r5
                    L_0x0120:
                        mega.boicot.FullscreenVideoView_pro r1 = mega.boicot.FullscreenVideoView_pro.this
                        r1.setLayoutParams(r0)
                    L_0x0125:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: mega.boicot.FullscreenVideoView_pro.C59282.run():void");
                }
            });
        }
    }

    public int getCurrentPosition() {
        if (this.f19533p != null) {
            return this.f19533p.getCurrentPosition();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public int getDuration() {
        if (this.f19533p != null) {
            return this.f19533p.getDuration();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: t */
    public boolean mo21578t() throws IllegalStateException {
        if (this.f19533p != null) {
            return this.f19533p.isPlaying();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: i */
    public void mo21514i() throws IllegalStateException {
        if (this.f19533p != null) {
            this.f19539v = C5930a.PAUSED;
            this.f19533p.pause();
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: j */
    public void mo21515j() {
        if (this.f19533p != null) {
            this.f19539v = C5930a.IDLE;
            mo21508c();
            mo21507b();
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: h */
    public void mo21513h() throws IllegalStateException {
        if (this.f19533p != null) {
            C5930a aVar = this.f19539v;
            this.f19539v = C5930a.STARTED;
            this.f19533p.setOnCompletionListener(this);
            this.f19533p.start();
            if (aVar == C5930a.PREPARED) {
                ((config) this.f19532o.getApplicationContext()).mo20770a(this.f19532o, false, false);
                return;
            }
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: a */
    public void mo21556a(int i) throws IllegalStateException {
        if (this.f19533p == null) {
            throw new RuntimeException("Media Player is not initialized");
        } else if (this.f19533p.getDuration() > -1 && i <= this.f19533p.getDuration()) {
            this.f19540w = this.f19539v;
            mo21514i();
            this.f19533p.seekTo(i);
            mo21568p();
        }
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.f19533p != null) {
            this.f19529G = onErrorListener;
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        if (this.f19533p != null) {
            this.f19530H = onPreparedListener;
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: a */
    public void mo21557a(Uri uri, String str) throws IOException, IllegalStateException, SecurityException, IllegalArgumentException, RuntimeException {
        if (this.f19533p == null) {
            throw new RuntimeException("Media Player is not initialized");
        } else if (this.f19539v != C5930a.IDLE) {
            StringBuilder sb = new StringBuilder();
            sb.append("FullscreenVideoView Invalid State: ");
            sb.append(this.f19539v);
            throw new IllegalStateException(sb.toString());
        } else {
            if (str == null || str.isEmpty()) {
                this.f19533p.setDataSource(this.f19532o, uri);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", str);
                this.f19533p.setDataSource(this.f19532o, uri, hashMap);
            }
            this.f19531I = uri;
            this.f19539v = C5930a.INITIALIZED;
            mo21561o();
        }
    }
}
