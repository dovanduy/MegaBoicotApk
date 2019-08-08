package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C3025aw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
public final class ajj implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    protected final ajh f11188a;

    /* renamed from: b */
    private final Object f11189b = new Object();

    /* renamed from: c */
    private final WeakReference<C3878ij> f11190c;

    /* renamed from: d */
    private WeakReference<ViewTreeObserver> f11191d;

    /* renamed from: e */
    private final akv f11192e;

    /* renamed from: f */
    private final Context f11193f;

    /* renamed from: g */
    private final WindowManager f11194g;

    /* renamed from: h */
    private final PowerManager f11195h;

    /* renamed from: i */
    private final KeyguardManager f11196i;

    /* renamed from: j */
    private final DisplayMetrics f11197j;

    /* renamed from: k */
    private ajr f11198k;

    /* renamed from: l */
    private boolean f11199l;

    /* renamed from: m */
    private boolean f11200m = false;

    /* renamed from: n */
    private boolean f11201n = false;

    /* renamed from: o */
    private boolean f11202o;

    /* renamed from: p */
    private boolean f11203p;

    /* renamed from: q */
    private boolean f11204q;

    /* renamed from: r */
    private BroadcastReceiver f11205r;

    /* renamed from: s */
    private final HashSet<ajg> f11206s = new HashSet<>();

    /* renamed from: t */
    private C3964lo f11207t;

    /* renamed from: u */
    private final HashSet<akf> f11208u = new HashSet<>();

    /* renamed from: v */
    private final Rect f11209v = new Rect();

    /* renamed from: w */
    private final ajm f11210w;

    /* renamed from: x */
    private float f11211x;

    public ajj(Context context, zzjn zzjn, C3878ij ijVar, zzang zzang, akv akv) {
        this.f11190c = new WeakReference<>(ijVar);
        this.f11192e = akv;
        this.f11191d = new WeakReference<>(null);
        this.f11202o = true;
        this.f11204q = false;
        this.f11207t = new C3964lo(200);
        ajh ajh = new ajh(UUID.randomUUID().toString(), zzang, zzjn.f14543a, ijVar.f13275k, ijVar.mo15412a(), zzjn.f14550h);
        this.f11188a = ajh;
        this.f11194g = (WindowManager) context.getSystemService("window");
        this.f11195h = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f11196i = (KeyguardManager) context.getSystemService("keyguard");
        this.f11193f = context;
        this.f11210w = new ajm(this, new Handler());
        this.f11193f.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.f11210w);
        this.f11197j = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.f11194g.getDefaultDisplay();
        this.f11209v.right = defaultDisplay.getWidth();
        this.f11209v.bottom = defaultDisplay.getHeight();
        mo14383a();
    }

    /* renamed from: a */
    private static int m14253a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    /* renamed from: a */
    private final JSONObject m14254a(View view, Boolean bool) throws JSONException {
        if (view == null) {
            return m14259i().put("isAttachedToWindow", false).put("isScreenOn", m14260j()).put("isVisible", false);
        }
        boolean a = C3025aw.m10919g().mo15544a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e) {
            C3900je.m17430b("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject i = m14259i();
        i.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", m14253a(this.f11209v.top, this.f11197j)).put("bottom", m14253a(this.f11209v.bottom, this.f11197j)).put(TtmlNode.LEFT, m14253a(this.f11209v.left, this.f11197j)).put(TtmlNode.RIGHT, m14253a(this.f11209v.right, this.f11197j))).put("adBox", new JSONObject().put("top", m14253a(rect.top, this.f11197j)).put("bottom", m14253a(rect.bottom, this.f11197j)).put(TtmlNode.LEFT, m14253a(rect.left, this.f11197j)).put(TtmlNode.RIGHT, m14253a(rect.right, this.f11197j))).put("globalVisibleBox", new JSONObject().put("top", m14253a(rect2.top, this.f11197j)).put("bottom", m14253a(rect2.bottom, this.f11197j)).put(TtmlNode.LEFT, m14253a(rect2.left, this.f11197j)).put(TtmlNode.RIGHT, m14253a(rect2.right, this.f11197j))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m14253a(rect3.top, this.f11197j)).put("bottom", m14253a(rect3.bottom, this.f11197j)).put(TtmlNode.LEFT, m14253a(rect3.left, this.f11197j)).put(TtmlNode.RIGHT, m14253a(rect3.right, this.f11197j))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m14253a(rect4.top, this.f11197j)).put("bottom", m14253a(rect4.bottom, this.f11197j)).put(TtmlNode.LEFT, m14253a(rect4.left, this.f11197j)).put(TtmlNode.RIGHT, m14253a(rect4.right, this.f11197j))).put("screenDensity", (double) this.f11197j.density);
        if (bool == null) {
            bool = Boolean.valueOf(C3025aw.m10917e().mo15520a(view, this.f11195h, this.f11196i));
        }
        i.put("isVisible", bool.booleanValue());
        return i;
    }

    /* renamed from: a */
    private static JSONObject m14255a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m14256a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject a = m14255a(jSONObject);
            ArrayList arrayList = new ArrayList(this.f11208u);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((akf) obj).mo14406a(a, z);
            }
        } catch (Throwable th) {
            C3900je.m17430b("Skipping active view message.", th);
        }
    }

    /* renamed from: g */
    private final void m14257g() {
        if (this.f11198k != null) {
            this.f11198k.mo14374a(this);
        }
    }

    /* renamed from: h */
    private final void m14258h() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f11191d.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    /* renamed from: i */
    private final JSONObject m14259i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f11188a.mo14369b()).put("activeViewJSON", this.f11188a.mo14370c()).put("timestamp", C3025aw.m10924l().mo13695b()).put("adFormat", this.f11188a.mo14368a()).put("hashCode", this.f11188a.mo14371d()).put("isMraid", this.f11188a.mo14372e()).put("isStopped", this.f11201n).put("isPaused", this.f11200m).put("isNative", this.f11188a.mo14373f()).put("isScreenOn", m14260j()).put("appMuted", C3025aw.m10910D().mo15559b()).put("appVolume", (double) C3025aw.m10910D().mo15556a()).put("deviceVolume", (double) this.f11211x);
        return jSONObject;
    }

    /* renamed from: j */
    private final boolean m14260j() {
        return VERSION.SDK_INT >= 20 ? this.f11195h.isInteractive() : this.f11195h.isScreenOn();
    }

    /* renamed from: a */
    public final void mo14383a() {
        this.f11211x = C3928kf.m17246a(this.f11193f);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cd, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14384a(int r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f11189b
            monitor-enter(r0)
            java.util.HashSet<com.google.android.gms.internal.ads.akf> r1 = r7.f11208u     // Catch:{ all -> 0x00ce }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ce }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ce }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.akf r2 = (com.google.android.gms.internal.ads.akf) r2     // Catch:{ all -> 0x00ce }
            boolean r2 = r2.mo14407a()     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x0009
            r1 = r4
            goto L_0x0020
        L_0x001f:
            r1 = r3
        L_0x0020:
            if (r1 == 0) goto L_0x00cc
            boolean r1 = r7.f11202o     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x0028
            goto L_0x00cc
        L_0x0028:
            com.google.android.gms.internal.ads.akv r1 = r7.f11192e     // Catch:{ all -> 0x00ce }
            android.view.View r1 = r1.mo14400a()     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.jn r2 = com.google.android.gms.ads.internal.C3025aw.m10917e()     // Catch:{ all -> 0x00ce }
            android.os.PowerManager r5 = r7.f11195h     // Catch:{ all -> 0x00ce }
            android.app.KeyguardManager r6 = r7.f11196i     // Catch:{ all -> 0x00ce }
            boolean r2 = r2.mo15520a(r1, r5, r6)     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x0040
            r2 = r4
            goto L_0x0041
        L_0x0040:
            r2 = r3
        L_0x0041:
            if (r1 == 0) goto L_0x0053
            if (r2 == 0) goto L_0x0053
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ all -> 0x00ce }
            r5.<init>()     // Catch:{ all -> 0x00ce }
            r6 = 0
            boolean r5 = r1.getGlobalVisibleRect(r5, r6)     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x0053
            r5 = r4
            goto L_0x0054
        L_0x0053:
            r5 = r3
        L_0x0054:
            com.google.android.gms.internal.ads.akv r6 = r7.f11192e     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.mo14401b()     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x0061
            r7.mo14389b()     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x0061:
            if (r8 != r4) goto L_0x0071
            com.google.android.gms.internal.ads.lo r6 = r7.f11207t     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.mo15608a()     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x0071
            boolean r6 = r7.f11204q     // Catch:{ all -> 0x00ce }
            if (r5 != r6) goto L_0x0071
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x0071:
            if (r5 != 0) goto L_0x007b
            boolean r6 = r7.f11204q     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x007b
            if (r8 != r4) goto L_0x007b
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x007b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            org.json.JSONObject r8 = r7.m14254a(r1, r8)     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            r7.m14256a(r8, r3)     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            r7.f11204q = r5     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            goto L_0x008f
        L_0x0089:
            r8 = move-exception
            java.lang.String r1 = "Active view update failed."
            com.google.android.gms.internal.ads.C3900je.m17427a(r1, r8)     // Catch:{ all -> 0x00ce }
        L_0x008f:
            com.google.android.gms.internal.ads.akv r8 = r7.f11192e     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.akv r8 = r8.mo14402c()     // Catch:{ all -> 0x00ce }
            android.view.View r8 = r8.mo14400a()     // Catch:{ all -> 0x00ce }
            if (r8 == 0) goto L_0x00c7
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r7.f11191d     // Catch:{ all -> 0x00ce }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00ce }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ all -> 0x00ce }
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()     // Catch:{ all -> 0x00ce }
            if (r8 == r1) goto L_0x00c7
            r7.m14258h()     // Catch:{ all -> 0x00ce }
            boolean r2 = r7.f11199l     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x00b8
            if (r1 == 0) goto L_0x00c0
            boolean r1 = r1.isAlive()     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x00c0
        L_0x00b8:
            r7.f11199l = r4     // Catch:{ all -> 0x00ce }
            r8.addOnScrollChangedListener(r7)     // Catch:{ all -> 0x00ce }
            r8.addOnGlobalLayoutListener(r7)     // Catch:{ all -> 0x00ce }
        L_0x00c0:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00ce }
            r1.<init>(r8)     // Catch:{ all -> 0x00ce }
            r7.f11191d = r1     // Catch:{ all -> 0x00ce }
        L_0x00c7:
            r7.m14257g()     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x00cc:
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x00ce:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ajj.mo14384a(int):void");
    }

    /* renamed from: a */
    public final void mo14385a(ajr ajr) {
        synchronized (this.f11189b) {
            this.f11198k = ajr;
        }
    }

    /* renamed from: a */
    public final void mo14386a(akf akf) {
        if (this.f11208u.isEmpty()) {
            synchronized (this.f11189b) {
                if (this.f11205r == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.f11205r = new ajk(this);
                    C3025aw.m10911E().mo15615a(this.f11193f, this.f11205r, intentFilter);
                }
            }
            mo14384a(3);
        }
        this.f11208u.add(akf);
        try {
            akf.mo14406a(m14255a(m14254a(this.f11192e.mo14400a(), (Boolean) null)), false);
        } catch (JSONException e) {
            C3900je.m17430b("Skipping measurement update for new client.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14387a(akf akf, Map<String, String> map) {
        String str = "Received request to untrack: ";
        String valueOf = String.valueOf(this.f11188a.mo14371d());
        C3900je.m17429b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        mo14390b(akf);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo14388a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f11188a.mo14371d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14389b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f11189b
            monitor-enter(r0)
            boolean r1 = r5.f11202o     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0044
            r1 = 1
            r5.f11203p = r1     // Catch:{ all -> 0x0046 }
            org.json.JSONObject r2 = r5.m14259i()     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            java.lang.String r3 = "doneReasonCode"
            java.lang.String r4 = "u"
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            r5.m14256a(r2, r1)     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            goto L_0x0024
        L_0x0019:
            r1 = move-exception
            java.lang.String r2 = "Failure while processing active view data."
        L_0x001c:
            com.google.android.gms.internal.ads.C3900je.m17430b(r2, r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0024
        L_0x0020:
            r1 = move-exception
            java.lang.String r2 = "JSON failure while processing active view data."
            goto L_0x001c
        L_0x0024:
            java.lang.String r1 = "Untracking ad unit: "
            com.google.android.gms.internal.ads.ajh r2 = r5.f11188a     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = r2.mo14371d()     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0046 }
            int r3 = r2.length()     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x003b
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x0041
        L_0x003b:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0046 }
            r2.<init>(r1)     // Catch:{ all -> 0x0046 }
            r1 = r2
        L_0x0041:
            com.google.android.gms.internal.ads.C3900je.m17429b(r1)     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ajj.mo14389b():void");
    }

    /* renamed from: b */
    public final void mo14390b(akf akf) {
        this.f11208u.remove(akf);
        akf.mo14408b();
        if (this.f11208u.isEmpty()) {
            synchronized (this.f11189b) {
                m14258h();
                synchronized (this.f11189b) {
                    if (this.f11205r != null) {
                        try {
                            C3025aw.m10911E().mo15614a(this.f11193f, this.f11205r);
                        } catch (IllegalStateException e) {
                            C3900je.m17430b("Failed trying to unregister the receiver", e);
                        } catch (Exception e2) {
                            C3025aw.m10921i().mo15436a((Throwable) e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.f11205r = null;
                    }
                }
                this.f11193f.getContentResolver().unregisterContentObserver(this.f11210w);
                int i = 0;
                this.f11202o = false;
                m14257g();
                ArrayList arrayList = new ArrayList(this.f11208u);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    mo14390b((akf) obj);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14391b(Map<String, String> map) {
        mo14384a(3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo14392c(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
            Iterator it = this.f11206s.iterator();
            while (it.hasNext()) {
                ((ajg) it.next()).mo14367a(this, z);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo14393c() {
        boolean z;
        synchronized (this.f11189b) {
            z = this.f11202o;
        }
        return z;
    }

    /* renamed from: d */
    public final void mo14394d() {
        synchronized (this.f11189b) {
            this.f11201n = true;
            mo14384a(3);
        }
    }

    /* renamed from: e */
    public final void mo14395e() {
        synchronized (this.f11189b) {
            this.f11200m = true;
            mo14384a(3);
        }
    }

    /* renamed from: f */
    public final void mo14396f() {
        synchronized (this.f11189b) {
            this.f11200m = false;
            mo14384a(3);
        }
    }

    public final void onGlobalLayout() {
        mo14384a(2);
    }

    public final void onScrollChanged() {
        mo14384a(1);
    }
}
