package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.C3025aw;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ob */
public final class C4032ob extends C4044on implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {

    /* renamed from: c */
    private static final Map<Integer, String> f13639c = new HashMap();

    /* renamed from: d */
    private final C4062pe f13640d;

    /* renamed from: e */
    private final boolean f13641e;

    /* renamed from: f */
    private int f13642f = 0;

    /* renamed from: g */
    private int f13643g = 0;

    /* renamed from: h */
    private MediaPlayer f13644h;

    /* renamed from: i */
    private Uri f13645i;

    /* renamed from: j */
    private int f13646j;

    /* renamed from: k */
    private int f13647k;

    /* renamed from: l */
    private int f13648l;

    /* renamed from: m */
    private int f13649m;

    /* renamed from: n */
    private int f13650n;

    /* renamed from: o */
    private C4059pb f13651o;

    /* renamed from: p */
    private boolean f13652p;

    /* renamed from: q */
    private int f13653q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C4043om f13654r;

    static {
        if (VERSION.SDK_INT >= 17) {
            f13639c.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
            f13639c.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
            f13639c.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
            f13639c.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
            f13639c.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f13639c.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        f13639c.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        f13639c.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        f13639c.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f13639c.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        f13639c.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        f13639c.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        f13639c.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        f13639c.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            f13639c.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f13639c.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public C4032ob(Context context, boolean z, boolean z2, C4060pc pcVar, C4062pe peVar) {
        super(context);
        setSurfaceTextureListener(this);
        this.f13640d = peVar;
        this.f13652p = z;
        this.f13641e = z2;
        this.f13640d.mo15812a(this);
    }

    /* renamed from: a */
    private final void m17506a(float f) {
        if (this.f13644h != null) {
            try {
                this.f13644h.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            C3900je.m17435e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* renamed from: a */
    private final void m17507a(boolean z) {
        C3900je.m17043a("AdMediaPlayerView release");
        if (this.f13651o != null) {
            this.f13651o.mo15792b();
            this.f13651o = null;
        }
        if (this.f13644h != null) {
            this.f13644h.reset();
            this.f13644h.release();
            this.f13644h = null;
            m17508c(0);
            if (z) {
                this.f13643g = 0;
                this.f13643g = 0;
            }
        }
    }

    /* renamed from: c */
    private final void m17508c(int i) {
        if (i == 3) {
            this.f13640d.mo15815c();
            this.f13670b.mo15823b();
        } else if (this.f13642f == 3) {
            this.f13640d.mo15816d();
            this.f13670b.mo15824c();
        }
        this.f13642f = i;
    }

    /* renamed from: f */
    private final void m17509f() {
        C3900je.m17043a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f13645i != null && surfaceTexture != null) {
            m17507a(false);
            try {
                C3025aw.m10934v();
                this.f13644h = new MediaPlayer();
                this.f13644h.setOnBufferingUpdateListener(this);
                this.f13644h.setOnCompletionListener(this);
                this.f13644h.setOnErrorListener(this);
                this.f13644h.setOnInfoListener(this);
                this.f13644h.setOnPreparedListener(this);
                this.f13644h.setOnVideoSizeChangedListener(this);
                this.f13648l = 0;
                if (this.f13652p) {
                    this.f13651o = new C4059pb(getContext());
                    this.f13651o.mo15791a(surfaceTexture, getWidth(), getHeight());
                    this.f13651o.start();
                    SurfaceTexture c = this.f13651o.mo15793c();
                    if (c != null) {
                        surfaceTexture = c;
                    } else {
                        this.f13651o.mo15792b();
                        this.f13651o = null;
                    }
                }
                this.f13644h.setDataSource(getContext(), this.f13645i);
                C3025aw.m10935w();
                this.f13644h.setSurface(new Surface(surfaceTexture));
                this.f13644h.setAudioStreamType(3);
                this.f13644h.setScreenOnWhilePlaying(true);
                this.f13644h.prepareAsync();
                m17508c(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(this.f13645i);
                StringBuilder sb = new StringBuilder(36 + String.valueOf(valueOf).length());
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                C3900je.m17432c(sb.toString(), e);
                onError(this.f13644h, 1, 0);
            }
        }
    }

    /* renamed from: g */
    private final void m17510g() {
        if (this.f13641e && m17511h() && this.f13644h.getCurrentPosition() > 0 && this.f13643g != 3) {
            C3900je.m17043a("AdMediaPlayerView nudging MediaPlayer");
            m17506a(0.0f);
            this.f13644h.start();
            int currentPosition = this.f13644h.getCurrentPosition();
            long a = C3025aw.m10924l().mo13694a();
            while (m17511h() && this.f13644h.getCurrentPosition() == currentPosition) {
                if (C3025aw.m10924l().mo13694a() - a > 250) {
                    break;
                }
            }
            this.f13644h.pause();
            mo15709e();
        }
    }

    /* renamed from: h */
    private final boolean m17511h() {
        return (this.f13644h == null || this.f13642f == -1 || this.f13642f == 0 || this.f13642f == 1) ? false : true;
    }

    /* renamed from: a */
    public final String mo15701a() {
        String str = "MediaPlayer";
        String valueOf = String.valueOf(this.f13652p ? " spherical" : "");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    /* renamed from: a */
    public final void mo15702a(float f, float f2) {
        if (this.f13651o != null) {
            this.f13651o.mo15789a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo15703a(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        C3900je.m17043a(sb.toString());
        if (m17511h()) {
            this.f13644h.seekTo(i);
            this.f13653q = 0;
            return;
        }
        this.f13653q = i;
    }

    /* renamed from: a */
    public final void mo15704a(C4043om omVar) {
        this.f13654r = omVar;
    }

    /* renamed from: b */
    public final void mo15705b() {
        C3900je.m17043a("AdMediaPlayerView stop");
        if (this.f13644h != null) {
            this.f13644h.stop();
            this.f13644h.release();
            this.f13644h = null;
            m17508c(0);
            this.f13643g = 0;
        }
        this.f13640d.mo15813b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo15706b(int i) {
        if (this.f13654r != null) {
            this.f13654r.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: c */
    public final void mo15707c() {
        C3900je.m17043a("AdMediaPlayerView play");
        if (m17511h()) {
            this.f13644h.start();
            m17508c(3);
            this.f13669a.mo15772a();
            C3909jn.f13411a.post(new C4041ok(this));
        }
        this.f13643g = 3;
    }

    /* renamed from: d */
    public final void mo15708d() {
        C3900je.m17043a("AdMediaPlayerView pause");
        if (m17511h() && this.f13644h.isPlaying()) {
            this.f13644h.pause();
            m17508c(4);
            C3909jn.f13411a.post(new C4042ol(this));
        }
        this.f13643g = 4;
    }

    /* renamed from: e */
    public final void mo15709e() {
        m17506a(this.f13670b.mo15820a());
    }

    public final int getCurrentPosition() {
        if (m17511h()) {
            return this.f13644h.getCurrentPosition();
        }
        return 0;
    }

    public final int getDuration() {
        if (m17511h()) {
            return this.f13644h.getDuration();
        }
        return -1;
    }

    public final int getVideoHeight() {
        if (this.f13644h != null) {
            return this.f13644h.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoWidth() {
        if (this.f13644h != null) {
            return this.f13644h.getVideoWidth();
        }
        return 0;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f13648l = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C3900je.m17043a("AdMediaPlayerView completion");
        m17508c(5);
        this.f13643g = 5;
        C3909jn.f13411a.post(new C4035oe(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f13639c.get(Integer.valueOf(i));
        String str2 = (String) f13639c.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(38 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C3900je.m17435e(sb.toString());
        m17508c(-1);
        this.f13643g = -1;
        C3909jn.f13411a.post(new C4036of(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f13639c.get(Integer.valueOf(i));
        String str2 = (String) f13639c.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(37 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C3900je.m17043a(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if ((r5.f13646j * r7) > (r5.f13647k * r6)) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r1 > r6) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r1 > r6) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f13646j
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.f13647k
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.f13646j
            if (r2 <= 0) goto L_0x0085
            int r2 = r5.f13647k
            if (r2 <= 0) goto L_0x0085
            com.google.android.gms.internal.ads.pb r2 = r5.f13651o
            if (r2 != 0) goto L_0x0085
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x004f
            if (r1 != r2) goto L_0x004f
            int r0 = r5.f13646j
            int r0 = r0 * r7
            int r1 = r5.f13647k
            int r1 = r1 * r6
            if (r0 >= r1) goto L_0x003f
            int r6 = r5.f13646j
            int r6 = r6 * r7
            int r0 = r5.f13647k
            int r0 = r6 / r0
            r6 = r0
            goto L_0x0087
        L_0x003f:
            int r0 = r5.f13646j
            int r0 = r0 * r7
            int r1 = r5.f13647k
            int r1 = r1 * r6
            if (r0 <= r1) goto L_0x0087
        L_0x0047:
            int r7 = r5.f13647k
            int r7 = r7 * r6
            int r0 = r5.f13646j
            int r1 = r7 / r0
            goto L_0x0086
        L_0x004f:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0060
            int r0 = r5.f13647k
            int r0 = r0 * r6
            int r2 = r5.f13646j
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x005e
            if (r0 <= r7) goto L_0x005e
            goto L_0x0087
        L_0x005e:
            r7 = r0
            goto L_0x0087
        L_0x0060:
            if (r1 != r2) goto L_0x006f
            int r1 = r5.f13646j
            int r1 = r1 * r7
            int r2 = r5.f13647k
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x006d
            if (r1 <= r6) goto L_0x006d
            goto L_0x0087
        L_0x006d:
            r6 = r1
            goto L_0x0087
        L_0x006f:
            int r2 = r5.f13646j
            int r4 = r5.f13647k
            if (r1 != r3) goto L_0x007e
            if (r4 <= r7) goto L_0x007e
            int r1 = r5.f13646j
            int r1 = r1 * r7
            int r2 = r5.f13647k
            int r1 = r1 / r2
            goto L_0x0080
        L_0x007e:
            r1 = r2
            r7 = r4
        L_0x0080:
            if (r0 != r3) goto L_0x006d
            if (r1 <= r6) goto L_0x006d
            goto L_0x0047
        L_0x0085:
            r6 = r0
        L_0x0086:
            r7 = r1
        L_0x0087:
            r5.setMeasuredDimension(r6, r7)
            com.google.android.gms.internal.ads.pb r0 = r5.f13651o
            if (r0 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.pb r0 = r5.f13651o
            r0.mo15790a(r6, r7)
        L_0x0093:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 != r1) goto L_0x00b0
            int r0 = r5.f13649m
            if (r0 <= 0) goto L_0x00a1
            int r0 = r5.f13649m
            if (r0 != r6) goto L_0x00a9
        L_0x00a1:
            int r0 = r5.f13650n
            if (r0 <= 0) goto L_0x00ac
            int r0 = r5.f13650n
            if (r0 == r7) goto L_0x00ac
        L_0x00a9:
            r5.m17510g()
        L_0x00ac:
            r5.f13649m = r6
            r5.f13650n = r7
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4032ob.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C3900je.m17043a("AdMediaPlayerView prepared");
        m17508c(2);
        this.f13640d.mo15811a();
        C3909jn.f13411a.post(new C4034od(this));
        this.f13646j = mediaPlayer.getVideoWidth();
        this.f13647k = mediaPlayer.getVideoHeight();
        if (this.f13653q != 0) {
            mo15703a(this.f13653q);
        }
        m17510g();
        int i = this.f13646j;
        int i2 = this.f13647k;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        C3900je.m17433d(sb.toString());
        if (this.f13643g == 3) {
            mo15707c();
        }
        mo15709e();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C3900je.m17043a("AdMediaPlayerView surface created");
        m17509f();
        C3909jn.f13411a.post(new C4038oh(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C3900je.m17043a("AdMediaPlayerView surface destroyed");
        if (this.f13644h != null && this.f13653q == 0) {
            this.f13653q = this.f13644h.getCurrentPosition();
        }
        if (this.f13651o != null) {
            this.f13651o.mo15792b();
        }
        C3909jn.f13411a.post(new C4040oj(this));
        m17507a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C3900je.m17043a("AdMediaPlayerView surface changed");
        boolean z = false;
        boolean z2 = this.f13643g == 3;
        if (this.f13646j == i && this.f13647k == i2) {
            z = true;
        }
        if (this.f13644h != null && z2 && z) {
            if (this.f13653q != 0) {
                mo15703a(this.f13653q);
            }
            mo15707c();
        }
        if (this.f13651o != null) {
            this.f13651o.mo15790a(i, i2);
        }
        C3909jn.f13411a.post(new C4039oi(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f13640d.mo15814b(this);
        this.f13669a.mo15773a(surfaceTexture, this.f13654r);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        C3900je.m17043a(sb.toString());
        this.f13646j = mediaPlayer.getVideoWidth();
        this.f13647k = mediaPlayer.getVideoHeight();
        if (this.f13646j != 0 && this.f13647k != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        C3900je.m17043a(sb.toString());
        C3909jn.f13411a.post(new C4033oc(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzhl a = zzhl.m18798a(parse);
        if (a != null) {
            parse = Uri.parse(a.f14517a);
        }
        this.f13645i = parse;
        this.f13653q = 0;
        m17509f();
        requestLayout();
        invalidate();
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(1 + String.valueOf(name).length() + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }
}
