package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.pb */
public final class C4059pb extends Thread implements OnFrameAvailableListener, C4058pa {

    /* renamed from: a */
    private static final float[] f13712a = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private volatile boolean f13713A;

    /* renamed from: B */
    private volatile boolean f13714B;

    /* renamed from: b */
    private final C4055oy f13715b;

    /* renamed from: c */
    private final float[] f13716c;

    /* renamed from: d */
    private final float[] f13717d;

    /* renamed from: e */
    private final float[] f13718e;

    /* renamed from: f */
    private final float[] f13719f;

    /* renamed from: g */
    private final float[] f13720g;

    /* renamed from: h */
    private final float[] f13721h;

    /* renamed from: i */
    private final float[] f13722i;

    /* renamed from: j */
    private float f13723j;

    /* renamed from: k */
    private float f13724k;

    /* renamed from: l */
    private float f13725l;

    /* renamed from: m */
    private int f13726m;

    /* renamed from: n */
    private int f13727n;

    /* renamed from: o */
    private SurfaceTexture f13728o;

    /* renamed from: p */
    private SurfaceTexture f13729p;

    /* renamed from: q */
    private int f13730q;

    /* renamed from: r */
    private int f13731r;

    /* renamed from: s */
    private int f13732s;

    /* renamed from: t */
    private FloatBuffer f13733t = ByteBuffer.allocateDirect(f13712a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: u */
    private final CountDownLatch f13734u;

    /* renamed from: v */
    private final Object f13735v;

    /* renamed from: w */
    private EGL10 f13736w;

    /* renamed from: x */
    private EGLDisplay f13737x;

    /* renamed from: y */
    private EGLContext f13738y;

    /* renamed from: z */
    private EGLSurface f13739z;

    public C4059pb(Context context) {
        super("SphericalVideoProcessor");
        this.f13733t.put(f13712a).position(0);
        this.f13716c = new float[9];
        this.f13717d = new float[9];
        this.f13718e = new float[9];
        this.f13719f = new float[9];
        this.f13720g = new float[9];
        this.f13721h = new float[9];
        this.f13722i = new float[9];
        this.f13723j = Float.NaN;
        this.f13715b = new C4055oy(context);
        this.f13715b.mo15776a((C4058pa) this);
        this.f13734u = new CountDownLatch(1);
        this.f13735v = new Object();
    }

    /* renamed from: a */
    private static int m17594a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m17595a("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        m17595a("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        m17595a("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        m17595a("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        m17595a("deleteShader");
        return 0;
    }

    /* renamed from: a */
    private static void m17595a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(21 + String.valueOf(str).length());
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    /* renamed from: a */
    private static void m17596a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: a */
    private static void m17597a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: b */
    private static void m17598b(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: d */
    private final boolean m17599d() {
        boolean z = false;
        if (!(this.f13739z == null || this.f13739z == EGL10.EGL_NO_SURFACE)) {
            z = this.f13736w.eglDestroySurface(this.f13737x, this.f13739z) | this.f13736w.eglMakeCurrent(this.f13737x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | false;
            this.f13739z = null;
        }
        if (this.f13738y != null) {
            z |= this.f13736w.eglDestroyContext(this.f13737x, this.f13738y);
            this.f13738y = null;
        }
        if (this.f13737x == null) {
            return z;
        }
        boolean eglTerminate = z | this.f13736w.eglTerminate(this.f13737x);
        this.f13737x = null;
        return eglTerminate;
    }

    /* renamed from: a */
    public final void mo15788a() {
        synchronized (this.f13735v) {
            this.f13735v.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo15789a(float f, float f2) {
        float f3;
        float f4;
        int i;
        if (this.f13727n > this.f13726m) {
            f3 = (f * 1.7453293f) / ((float) this.f13727n);
            f4 = 1.7453293f * f2;
            i = this.f13727n;
        } else {
            f3 = (f * 1.7453293f) / ((float) this.f13726m);
            f4 = 1.7453293f * f2;
            i = this.f13726m;
        }
        float f5 = f4 / ((float) i);
        this.f13724k -= f3;
        this.f13725l -= f5;
        if (this.f13725l < -1.5707964f) {
            this.f13725l = -1.5707964f;
        }
        if (this.f13725l > 1.5707964f) {
            this.f13725l = 1.5707964f;
        }
    }

    /* renamed from: a */
    public final void mo15790a(int i, int i2) {
        synchronized (this.f13735v) {
            this.f13727n = i;
            this.f13726m = i2;
            this.f13713A = true;
            this.f13735v.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo15791a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f13727n = i;
        this.f13726m = i2;
        this.f13729p = surfaceTexture;
    }

    /* renamed from: b */
    public final void mo15792b() {
        synchronized (this.f13735v) {
            this.f13714B = true;
            this.f13729p = null;
            this.f13735v.notifyAll();
        }
    }

    /* renamed from: c */
    public final SurfaceTexture mo15793c() {
        if (this.f13729p == null) {
            return null;
        }
        try {
            this.f13734u.await();
        } catch (InterruptedException unused) {
        }
        return this.f13728o;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f13732s++;
        synchronized (this.f13735v) {
            this.f13735v.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e5 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            android.graphics.SurfaceTexture r0 = r14.f13729p
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.internal.ads.C3900je.m17431c(r0)
            java.util.concurrent.CountDownLatch r0 = r14.f13734u
            r0.countDown()
            return
        L_0x000f:
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r14.f13736w = r0
            javax.microedition.khronos.egl.EGL10 r0 = r14.f13736w
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r14.f13737x = r0
            javax.microedition.khronos.egl.EGLDisplay r0 = r14.f13737x
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L_0x002f
        L_0x002c:
            r0 = r6
            goto L_0x00a4
        L_0x002f:
            int[] r0 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r1 = r14.f13736w
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.f13737x
            boolean r0 = r1.eglInitialize(r7, r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x002c
        L_0x003c:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.f13736w
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.f13737x
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x005b
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x005b
            r0 = r1[r6]
            goto L_0x005c
        L_0x005b:
            r0 = r4
        L_0x005c:
            if (r0 != 0) goto L_0x005f
            goto L_0x002c
        L_0x005f:
            int[] r1 = new int[r2]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.f13736w
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.f13737x
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r14.f13738y = r1
            javax.microedition.khronos.egl.EGLContext r1 = r14.f13738y
            if (r1 == 0) goto L_0x002c
            javax.microedition.khronos.egl.EGLContext r1 = r14.f13738y
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L_0x007b
            goto L_0x002c
        L_0x007b:
            javax.microedition.khronos.egl.EGL10 r1 = r14.f13736w
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.f13737x
            android.graphics.SurfaceTexture r8 = r14.f13729p
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r14.f13739z = r0
            javax.microedition.khronos.egl.EGLSurface r0 = r14.f13739z
            if (r0 == 0) goto L_0x002c
            javax.microedition.khronos.egl.EGLSurface r0 = r14.f13739z
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x0092
            goto L_0x002c
        L_0x0092:
            javax.microedition.khronos.egl.EGL10 r0 = r14.f13736w
            javax.microedition.khronos.egl.EGLDisplay r1 = r14.f13737x
            javax.microedition.khronos.egl.EGLSurface r7 = r14.f13739z
            javax.microedition.khronos.egl.EGLSurface r8 = r14.f13739z
            javax.microedition.khronos.egl.EGLContext r9 = r14.f13738y
            boolean r0 = r0.eglMakeCurrent(r1, r7, r8, r9)
            if (r0 != 0) goto L_0x00a3
            goto L_0x002c
        L_0x00a3:
            r0 = r5
        L_0x00a4:
            r1 = 35633(0x8b31, float:4.9932E-41)
            com.google.android.gms.internal.ads.ark<java.lang.String> r7 = com.google.android.gms.internal.ads.aru.f11864bj
            com.google.android.gms.internal.ads.ars r8 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r8 = r8.mo14695a(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.mo14687b()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00c8
            com.google.android.gms.internal.ads.ars r8 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r7 = r8.mo14695a(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00ca
        L_0x00c8:
            java.lang.String r7 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00ca:
            int r1 = m17594a(r1, r7)
            if (r1 != 0) goto L_0x00d3
        L_0x00d0:
            r8 = r6
            goto L_0x0155
        L_0x00d3:
            r7 = 35632(0x8b30, float:4.9931E-41)
            com.google.android.gms.internal.ads.ark<java.lang.String> r8 = com.google.android.gms.internal.ads.aru.f11865bk
            com.google.android.gms.internal.ads.ars r9 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r9 = r9.mo14695a(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.mo14687b()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00f7
            com.google.android.gms.internal.ads.ars r9 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r8 = r9.mo14695a(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00f9
        L_0x00f7:
            java.lang.String r8 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00f9:
            int r7 = m17594a(r7, r8)
            if (r7 != 0) goto L_0x0100
            goto L_0x00d0
        L_0x0100:
            int r8 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r9 = "createProgram"
            m17595a(r9)
            if (r8 == 0) goto L_0x0155
            android.opengl.GLES20.glAttachShader(r8, r1)
            java.lang.String r1 = "attachShader"
            m17595a(r1)
            android.opengl.GLES20.glAttachShader(r8, r7)
            java.lang.String r1 = "attachShader"
            m17595a(r1)
            android.opengl.GLES20.glLinkProgram(r8)
            java.lang.String r1 = "linkProgram"
            m17595a(r1)
            int[] r1 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6)
            java.lang.String r7 = "getProgramiv"
            m17595a(r7)
            r1 = r1[r6]
            if (r1 == r5) goto L_0x014d
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r1, r7)
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = android.opengl.GLES20.glGetProgramInfoLog(r8)
            android.util.Log.e(r1, r7)
            android.opengl.GLES20.glDeleteProgram(r8)
            java.lang.String r1 = "deleteProgram"
            m17595a(r1)
            goto L_0x00d0
        L_0x014d:
            android.opengl.GLES20.glValidateProgram(r8)
            java.lang.String r1 = "validateProgram"
            m17595a(r1)
        L_0x0155:
            r14.f13730q = r8
            int r1 = r14.f13730q
            android.opengl.GLES20.glUseProgram(r1)
            java.lang.String r1 = "useProgram"
            m17595a(r1)
            int r1 = r14.f13730q
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r14.f13733t
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            m17595a(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            m17595a(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            m17595a(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            m17595a(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m17595a(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m17595a(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m17595a(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            m17595a(r7)
            int r7 = r14.f13730q
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r14.f13731r = r7
            r7 = 9
            float[] r7 = new float[r7]
            r7 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            int r8 = r14.f13731r
            android.opengl.GLES20.glUniformMatrix3fv(r8, r5, r6, r7, r6)
            int r7 = r14.f13730q
            if (r7 == 0) goto L_0x01e2
            r7 = r5
            goto L_0x01e3
        L_0x01e2:
            r7 = r6
        L_0x01e3:
            if (r0 == 0) goto L_0x0394
            if (r7 != 0) goto L_0x01e9
            goto L_0x0394
        L_0x01e9:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r14.f13728o = r0
            android.graphics.SurfaceTexture r0 = r14.f13728o
            r0.setOnFrameAvailableListener(r14)
            java.util.concurrent.CountDownLatch r0 = r14.f13734u
            r0.countDown()
            com.google.android.gms.internal.ads.oy r0 = r14.f13715b
            r0.mo15775a()
            r14.f13713A = r5     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
        L_0x0201:
            boolean r0 = r14.f13714B     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            if (r0 != 0) goto L_0x033e
        L_0x0205:
            int r0 = r14.f13732s     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            if (r0 <= 0) goto L_0x0214
            android.graphics.SurfaceTexture r0 = r14.f13728o     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            int r0 = r14.f13732s     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            int r0 = r0 - r5
            r14.f13732s = r0     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            goto L_0x0205
        L_0x0214:
            com.google.android.gms.internal.ads.oy r0 = r14.f13715b     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r1 = r14.f13716c     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            boolean r0 = r0.mo15777a(r1)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r1 = 1070141403(0x3fc90fdb, float:1.5707964)
            r7 = 5
            r8 = 4
            if (r0 == 0) goto L_0x028b
            float r0 = r14.f13723j     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            if (r0 == 0) goto L_0x0280
            float[] r0 = r14.f13716c     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r9 = new float[r2]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r9 = {0, 1065353216, 0} // fill-array     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r10 = new float[r2]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r11 = r0[r6]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r11 = r11 * r12
            r12 = r0[r5]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r3]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r11 = r0[r2]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r11 = r11 * r12
            r12 = r0[r8]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r7]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r5] = r11     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r9 = r9[r3]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r3] = r11     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r0 = r10[r5]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r0 = r0 - r1
            float r0 = -r0
            r14.f13723j = r0     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
        L_0x0280:
            float[] r0 = r14.f13721h     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r9 = r14.f13723j     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r10 = r14.f13724k     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r9 = r9 + r10
            m17598b(r0, r9)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            goto L_0x029a
        L_0x028b:
            float[] r0 = r14.f13716c     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r9 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            m17596a(r0, r9)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r0 = r14.f13721h     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r9 = r14.f13724k     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            m17598b(r0, r9)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
        L_0x029a:
            float[] r0 = r14.f13717d     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            m17596a(r0, r1)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r0 = r14.f13718e     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r1 = r14.f13721h     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r9 = r14.f13717d     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            m17597a(r0, r1, r9)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r0 = r14.f13719f     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r1 = r14.f13716c     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r9 = r14.f13718e     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            m17597a(r0, r1, r9)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r0 = r14.f13720g     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r1 = r14.f13725l     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            m17596a(r0, r1)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r0 = r14.f13722i     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r1 = r14.f13720g     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r9 = r14.f13719f     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            m17597a(r0, r1, r9)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            int r0 = r14.f13731r     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float[] r1 = r14.f13722i     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r1, r6)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            android.opengl.GLES20.glDrawArrays(r7, r6, r8)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            java.lang.String r0 = "drawArrays"
            m17595a(r0)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            javax.microedition.khronos.egl.EGL10 r0 = r14.f13736w     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            javax.microedition.khronos.egl.EGLDisplay r1 = r14.f13737x     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            javax.microedition.khronos.egl.EGLSurface r7 = r14.f13739z     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r0.eglSwapBuffers(r1, r7)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            boolean r0 = r14.f13713A     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            if (r0 == 0) goto L_0x0324
            int r0 = r14.f13727n     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            int r1 = r14.f13726m     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            java.lang.String r0 = "viewport"
            m17595a(r0)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            int r0 = r14.f13730q     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            int r1 = r14.f13730q     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            int r7 = r14.f13727n     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            int r8 = r14.f13726m     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L_0x0314
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            int r0 = r14.f13726m     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r9 = r9 * r0
            int r0 = r14.f13727n     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r9 = r9 / r0
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            goto L_0x0322
        L_0x0314:
            int r7 = r14.f13727n     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r7 = r7 * r9
            int r8 = r14.f13726m     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
        L_0x0322:
            r14.f13713A = r6     // Catch:{ IllegalStateException -> 0x036f, Throwable -> 0x0350 }
        L_0x0324:
            java.lang.Object r0 = r14.f13735v     // Catch:{ InterruptedException -> 0x0201 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0201 }
            boolean r1 = r14.f13714B     // Catch:{ all -> 0x033b }
            if (r1 != 0) goto L_0x0338
            boolean r1 = r14.f13713A     // Catch:{ all -> 0x033b }
            if (r1 != 0) goto L_0x0338
            int r1 = r14.f13732s     // Catch:{ all -> 0x033b }
            if (r1 != 0) goto L_0x0338
            java.lang.Object r1 = r14.f13735v     // Catch:{ all -> 0x033b }
            r1.wait()     // Catch:{ all -> 0x033b }
        L_0x0338:
            monitor-exit(r0)     // Catch:{ all -> 0x033b }
            goto L_0x0201
        L_0x033b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x033b }
            throw r1     // Catch:{ InterruptedException -> 0x0201 }
        L_0x033e:
            com.google.android.gms.internal.ads.oy r0 = r14.f13715b
            r0.mo15778b()
            android.graphics.SurfaceTexture r0 = r14.f13728o
            r0.setOnFrameAvailableListener(r4)
            r14.f13728o = r4
            r14.m17599d()
            return
        L_0x034e:
            r0 = move-exception
            goto L_0x0384
        L_0x0350:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.internal.ads.C3900je.m17430b(r1, r0)     // Catch:{ all -> 0x034e }
            com.google.android.gms.internal.ads.io r1 = com.google.android.gms.ads.internal.C3025aw.m10921i()     // Catch:{ all -> 0x034e }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.mo15436a(r0, r2)     // Catch:{ all -> 0x034e }
            com.google.android.gms.internal.ads.oy r0 = r14.f13715b
            r0.mo15778b()
            android.graphics.SurfaceTexture r0 = r14.f13728o
            r0.setOnFrameAvailableListener(r4)
            r14.f13728o = r4
            r14.m17599d()
            return
        L_0x036f:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.internal.ads.C3900je.m17435e(r0)     // Catch:{ all -> 0x034e }
            com.google.android.gms.internal.ads.oy r0 = r14.f13715b
            r0.mo15778b()
            android.graphics.SurfaceTexture r0 = r14.f13728o
            r0.setOnFrameAvailableListener(r4)
            r14.f13728o = r4
            r14.m17599d()
            return
        L_0x0384:
            com.google.android.gms.internal.ads.oy r1 = r14.f13715b
            r1.mo15778b()
            android.graphics.SurfaceTexture r1 = r14.f13728o
            r1.setOnFrameAvailableListener(r4)
            r14.f13728o = r4
            r14.m17599d()
            throw r0
        L_0x0394:
            javax.microedition.khronos.egl.EGL10 r0 = r14.f13736w
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r1 = "EGL initialization failed: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03af
            java.lang.String r0 = r1.concat(r0)
            goto L_0x03b4
        L_0x03af:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x03b4:
            com.google.android.gms.internal.ads.C3900je.m17431c(r0)
            com.google.android.gms.internal.ads.io r1 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.mo15436a(r2, r0)
            r14.m17599d()
            java.util.concurrent.CountDownLatch r0 = r14.f13734u
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4059pb.run():void");
    }
}
