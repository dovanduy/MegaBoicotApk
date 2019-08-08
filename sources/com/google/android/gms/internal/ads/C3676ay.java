package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.ads.internal.C3006ad;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ay */
public final class C3676ay implements Callable<C3878ij> {

    /* renamed from: a */
    private static long f12356a = 10;

    /* renamed from: b */
    private final Context f12357b;

    /* renamed from: c */
    private final C3946kx f12358c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3006ad f12359d;

    /* renamed from: e */
    private final agw f12360e;

    /* renamed from: f */
    private final C3695bq f12361f;

    /* renamed from: g */
    private final Object f12362g = new Object();

    /* renamed from: h */
    private final C3879ik f12363h;

    /* renamed from: i */
    private final ash f12364i;

    /* renamed from: j */
    private boolean f12365j;

    /* renamed from: k */
    private int f12366k;

    /* renamed from: l */
    private List<String> f12367l;

    /* renamed from: m */
    private JSONObject f12368m;

    /* renamed from: n */
    private String f12369n;

    /* renamed from: o */
    private String f12370o;

    public C3676ay(Context context, C3006ad adVar, C3946kx kxVar, agw agw, C3879ik ikVar, ash ash) {
        this.f12357b = context;
        this.f12359d = adVar;
        this.f12358c = kxVar;
        this.f12363h = ikVar;
        this.f12360e = agw;
        this.f12364i = ash;
        this.f12361f = adVar.mo12457J();
        this.f12365j = false;
        this.f12366k = -2;
        this.f12367l = null;
        this.f12369n = null;
        this.f12370o = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r3.length() != 0) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0157 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0158 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c2 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C3878ij call() {
        /*
            r15 = this;
            r0 = 0
            r1 = 0
            com.google.android.gms.ads.internal.ad r2 = r15.f12359d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r11 = r2.mo12481l_()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r2 = r15.m15684b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r2 != 0) goto L_0x006e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ik r3 = r15.f12363h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaej r3 = r3.f13292b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r3 = r3.f14453b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r2.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ik r4 = r15.f12363h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaej r4 = r4.f13292b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r4 = r4.f14453b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3.<init>(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            int r4 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r4 == 0) goto L_0x0040
            java.lang.String r4 = "ads"
            org.json.JSONArray r3 = r3.optJSONArray(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 == 0) goto L_0x0037
            org.json.JSONObject r3 = r3.optJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x0038
        L_0x0037:
            r3 = r1
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            int r3 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 != 0) goto L_0x0044
        L_0x0040:
            r3 = 3
            r15.m15678a(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
        L_0x0044:
            com.google.android.gms.internal.ads.bq r3 = r15.f12361f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ne r2 = r3.mo15204a(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            long r3 = f12356a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.Object r2 = r2.get(r3, r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r3 = "success"
            boolean r3 = r2.optBoolean(r3, r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = "json"
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r3 = "ads"
            org.json.JSONArray r2 = r2.optJSONArray(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            org.json.JSONObject r2 = r2.getJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r8 = r2
            goto L_0x006f
        L_0x006e:
            r8 = r1
        L_0x006f:
            java.lang.String r2 = "enable_omid"
            boolean r2 = r8.optBoolean(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r2 != 0) goto L_0x007d
        L_0x0077:
            com.google.android.gms.internal.ads.nd r3 = com.google.android.gms.internal.ads.C3996mt.m17448a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r12 = r3
            goto L_0x00a3
        L_0x007d:
            java.lang.String r3 = "omid_settings"
            org.json.JSONObject r3 = r8.optJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 != 0) goto L_0x0086
            goto L_0x0077
        L_0x0086:
            java.lang.String r4 = "omid_html"
            java.lang.String r3 = r3.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r4 == 0) goto L_0x0093
            goto L_0x0077
        L_0x0093:
            com.google.android.gms.internal.ads.np r4 = new com.google.android.gms.internal.ads.np     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r4.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.util.concurrent.Executor r5 = com.google.android.gms.internal.ads.C4014nk.f13617a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.az r6 = new com.google.android.gms.internal.ads.az     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r6.<init>(r15, r4, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r5.execute(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r12 = r4
        L_0x00a3:
            boolean r3 = r15.m15684b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 != 0) goto L_0x014c
            if (r8 != 0) goto L_0x00ad
            goto L_0x014c
        L_0x00ad:
            java.lang.String r3 = "template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ik r4 = r15.f12363h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaef r4 = r4.f13291a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzpl r4 = r4.f14426y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r4 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.ik r4 = r15.f12363h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaef r4 = r4.f13291a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzpl r4 = r4.f14426y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r4 = r4.f14561b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x00c5
        L_0x00c4:
            r4 = r0
        L_0x00c5:
            com.google.android.gms.internal.ads.ik r5 = r15.f12363h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaef r5 = r5.f13291a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzpl r5 = r5.f14426y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r5 == 0) goto L_0x00d6
            com.google.android.gms.internal.ads.ik r5 = r15.f12363h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaef r5 = r5.f13291a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzpl r5 = r5.f14426y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r5 = r5.f14563d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x00d7
        L_0x00d6:
            r5 = r0
        L_0x00d7:
            java.lang.String r6 = "2"
            boolean r6 = r6.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r6 == 0) goto L_0x00e9
            com.google.android.gms.internal.ads.br r3 = new com.google.android.gms.internal.ads.br     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ik r6 = r15.f12363h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r6 = r6.f13300j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3.<init>(r4, r5, r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x014d
        L_0x00e9:
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r6 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.bs r3 = new com.google.android.gms.internal.ads.bs     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ik r6 = r15.f12363h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r6 = r6.f13300j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3.<init>(r4, r5, r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x014d
        L_0x00fb:
            java.lang.String r5 = "3"
            boolean r3 = r5.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 == 0) goto L_0x0149
            java.lang.String r3 = "custom_template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.np r5 = new com.google.android.gms.internal.ads.np     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r5.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            android.os.Handler r6 = com.google.android.gms.internal.ads.C3909jn.f13411a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.bb r7 = new com.google.android.gms.internal.ads.bb     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r7.<init>(r15, r5, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r6.post(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            long r6 = f12356a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.Object r3 = r5.get(r6, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 == 0) goto L_0x0128
            com.google.android.gms.internal.ads.bt r3 = new com.google.android.gms.internal.ads.bt     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3.<init>(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x014d
        L_0x0128:
            java.lang.String r3 = "No handler for custom template: "
            java.lang.String r4 = "custom_template_id"
            java.lang.String r4 = r8.getString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            int r5 = r4.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r5 == 0) goto L_0x013f
            java.lang.String r3 = r3.concat(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x0145
        L_0x013f:
            java.lang.String r4 = new java.lang.String     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r4.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3 = r4
        L_0x0145:
            com.google.android.gms.internal.ads.C3900je.m17431c(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x014c
        L_0x0149:
            r15.m15678a(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
        L_0x014c:
            r3 = r1
        L_0x014d:
            boolean r4 = r15.m15684b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r4 != 0) goto L_0x01bd
            if (r3 == 0) goto L_0x01bd
            if (r8 != 0) goto L_0x0158
            goto L_0x01bd
        L_0x0158:
            java.lang.String r4 = "tracking_urls_and_actions"
            org.json.JSONObject r4 = r8.getJSONObject(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r5 = "impression_tracking_urls"
            org.json.JSONArray r5 = r4.optJSONArray(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r5 != 0) goto L_0x0168
            r6 = r1
            goto L_0x017e
        L_0x0168:
            int r6 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r7 = r0
        L_0x016f:
            int r9 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r7 >= r9) goto L_0x017e
            java.lang.String r9 = r5.getString(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r6[r7] = r9     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            int r7 = r7 + 1
            goto L_0x016f
        L_0x017e:
            if (r6 != 0) goto L_0x0182
            r5 = r1
            goto L_0x0186
        L_0x0182:
            java.util.List r5 = java.util.Arrays.asList(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
        L_0x0186:
            r15.f12367l = r5     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r5 = "active_view"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r15.f12368m = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r4 = "debug_signals"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r15.f12369n = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r4 = "omid_settings"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r15.f12370o = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.atn r13 = r3.mo15198a(r15, r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.atp r14 = new com.google.android.gms.internal.ads.atp     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            android.content.Context r4 = r15.f12357b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.ads.internal.ad r5 = r15.f12359d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.bq r6 = r15.f12361f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.agw r7 = r15.f12360e     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ik r3 = r15.f12363h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaef r3 = r3.f13291a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzang r10 = r3.f14412k     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3 = r14
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r13.mo14758a(r14)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x01be
        L_0x01bd:
            r13 = r1
        L_0x01be:
            boolean r3 = r13 instanceof com.google.android.gms.internal.ads.atd     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 == 0) goto L_0x01d1
            r3 = r13
            com.google.android.gms.internal.ads.atd r3 = (com.google.android.gms.internal.ads.atd) r3     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.bc r4 = new com.google.android.gms.internal.ads.bc     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r4.<init>(r15, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.bq r3 = r15.f12361f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r5 = "/nativeAdCustomClick"
            r3.mo15206a(r5, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
        L_0x01d1:
            com.google.android.gms.internal.ads.ij r2 = r15.m15674a(r13, r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.ads.internal.ad r3 = r15.f12359d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.qe r4 = m15681b(r12)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3.mo12479b(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            return r2
        L_0x01df:
            r2 = move-exception
            java.lang.String r3 = "Error occured while doing native ads initialization."
            goto L_0x01ea
        L_0x01e3:
            r2 = move-exception
            java.lang.String r3 = "Timeout when loading native ad."
            goto L_0x01ea
        L_0x01e7:
            r2 = move-exception
            java.lang.String r3 = "Malformed native JSON response."
        L_0x01ea:
            com.google.android.gms.internal.ads.C3900je.m17432c(r3, r2)
            boolean r2 = r15.f12365j
            if (r2 != 0) goto L_0x01f4
            r15.m15678a(r0)
        L_0x01f4:
            com.google.android.gms.internal.ads.ij r0 = r15.m15674a(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3676ay.call():com.google.android.gms.internal.ads.ij");
    }

    /* renamed from: a */
    private final C3878ij m15674a(atn atn, boolean z) {
        int i;
        synchronized (this.f12362g) {
            try {
                int i2 = this.f12366k;
                if (atn == null && this.f12366k == -2) {
                    i2 = 0;
                }
            } finally {
                while (true) {
                    i = th;
                }
            }
        }
        atn atn2 = i != -2 ? null : atn;
        zzjj zzjj = this.f12363h.f13291a.f14404c;
        List<String> list = this.f12363h.f13292b.f14454c;
        List<String> list2 = this.f12363h.f13292b.f14456e;
        List<String> list3 = this.f12367l;
        int i3 = this.f12363h.f13292b.f14462k;
        long j = this.f12363h.f13292b.f14461j;
        String str = this.f12363h.f13291a.f14410i;
        zzjn zzjn = this.f12363h.f13294d;
        long j2 = this.f12363h.f13292b.f14457f;
        List<String> list4 = list;
        long j3 = this.f12363h.f13296f;
        long j4 = j2;
        long j5 = this.f12363h.f13297g;
        String str2 = this.f12363h.f13292b.f14465n;
        JSONObject jSONObject = this.f12368m;
        boolean z2 = this.f12363h.f13292b.f14431D;
        zzael zzael = this.f12363h.f13292b.f14432E;
        List<String> list5 = this.f12363h.f13292b.f14435H;
        long j6 = j3;
        String str3 = this.f12369n;
        amj amj = this.f12363h.f13299i;
        List<String> list6 = list5;
        boolean z3 = this.f12363h.f13292b.f14442O;
        boolean z4 = this.f12363h.f13300j;
        long j7 = j6;
        String str4 = str3;
        amj amj2 = amj;
        List<String> list7 = list4;
        zzjn zzjn2 = zzjn;
        String str5 = str2;
        boolean z5 = z;
        C3878ij ijVar = new C3878ij(zzjj, null, list7, i, list2, list3, i3, j, str, false, null, null, null, null, null, 0, zzjn2, j4, j7, j5, str5, jSONObject, atn2, null, null, null, z2, zzael, null, list6, str4, amj2, z3, z4, z5, this.f12363h.f13292b.f14445R, this.f12363h.f13292b.f14446S, this.f12370o);
        return ijVar;
    }

    /* renamed from: a */
    private final C4008ne<asy> m15675a(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(string)) {
            mo14950a(0, z);
            return C3996mt.m17448a(null);
        } else if (z2) {
            return C3996mt.m17448a(new asy(null, Uri.parse(string), optDouble));
        } else {
            C3946kx kxVar = this.f12358c;
            C3684bf bfVar = new C3684bf(this, z, optDouble, optBoolean, string);
            return kxVar.mo15592a(string, (C3953ld<T>) bfVar);
        }
    }

    /* renamed from: a */
    static C4089qe m15676a(C4008ne<C4089qe> neVar) {
        try {
            return (C4089qe) neVar.get((long) ((Integer) aoq.m14620f().mo14695a(aru.f11910cc)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C3900je.m17432c("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            C3900je.m17432c("Exception occurred while waiting for video to load", e2);
            return null;
        }
    }

    /* renamed from: a */
    private final void m15678a(int i) {
        synchronized (this.f12362g) {
            this.f12365j = true;
            this.f12366k = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15679a(ave ave, String str) {
        try {
            avp b = this.f12359d.mo12476b(ave.mo14771l());
            if (b != null) {
                b.mo14914a(ave, str);
            }
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(40 + String.valueOf(str).length());
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            C3900je.m17432c(sb.toString(), e);
        }
    }

    /* renamed from: b */
    private static C4089qe m15681b(C4008ne<C4089qe> neVar) {
        try {
            return (C4089qe) neVar.get((long) ((Integer) aoq.m14620f().mo14695a(aru.f11911cd)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            C3987mk.m17432c("", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            C3987mk.m17432c("", e2);
            return null;
        }
    }

    /* renamed from: b */
    private static Integer m15682b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <V> List<V> m15683b(List<C4008ne<V>> list) throws ExecutionException, InterruptedException {
        ArrayList arrayList = new ArrayList();
        for (C4008ne neVar : list) {
            Object obj = neVar.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private final boolean m15684b() {
        boolean z;
        synchronized (this.f12362g) {
            z = this.f12365j;
        }
        return z;
    }

    /* renamed from: a */
    public final C4008ne<asu> mo14945a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return C3996mt.m17448a(null);
        }
        String optString = optJSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b = m15682b(optJSONObject, "text_color");
        Integer b2 = m15682b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", AdError.NETWORK_ERROR_CODE);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (this.f12363h.f13291a.f14426y == null || this.f12363h.f13291a.f14426y.f14560a < 2) ? 1 : this.f12363h.f13291a.f14426y.f14564e;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List<C4008ne> arrayList = new ArrayList<>();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = mo14948a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(mo14947a(optJSONObject, "image", false, false));
        }
        C4019np npVar = new C4019np();
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (C4008ne a : arrayList) {
            List list = arrayList;
            a.mo15658a(new C3685bg(atomicInteger, size, npVar, arrayList), C3907jl.f13407a);
            arrayList = list;
        }
        C4019np npVar2 = npVar;
        C3683be beVar = new C3683be(this, optString, b2, b, optInt, optInt3, optInt2, i, optBoolean);
        return C3996mt.m17451a((C4008ne<A>) npVar2, (C3992mp<A, B>) beVar, (Executor) C3907jl.f13407a);
    }

    /* renamed from: a */
    public final C4008ne<C4089qe> mo14946a(JSONObject jSONObject, String str) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return C3996mt.m17448a(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            C3900je.m17435e("Required field 'vast_xml' is missing");
            return C3996mt.m17448a(null);
        }
        C3687bi biVar = new C3687bi(this.f12357b, this.f12360e, this.f12363h, this.f12364i, this.f12359d);
        C4019np npVar = new C4019np();
        C4014nk.f13617a.execute(new C3688bj(biVar, optJSONObject, npVar));
        return npVar;
    }

    /* renamed from: a */
    public final C4008ne<asy> mo14947a(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m15675a(jSONObject2, z, z2);
    }

    /* renamed from: a */
    public final List<C4008ne<asy>> mo14948a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            mo14950a(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(m15675a(jSONObject2, false, z2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Future<asy> mo14949a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m15675a(jSONObject2, optBoolean, z);
    }

    /* renamed from: a */
    public final void mo14950a(int i, boolean z) {
        if (z) {
            m15678a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14951a(C4019np npVar, String str) {
        try {
            C3025aw.m10918f();
            C4089qe a = C4096ql.m17760a(this.f12357b, C4130rs.m17977a(), "native-omid", false, false, this.f12360e, this.f12363h.f13291a.f14412k, this.f12364i, null, this.f12359d.mo12436i(), this.f12363h.f13299i);
            a.mo15919v().mo15931a((C4125rn) new C3679ba(npVar, a));
            a.loadData(str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, C2793C.UTF8_NAME);
        } catch (Exception e) {
            npVar.mo15686b(null);
            C3987mk.m17432c("", e);
        }
    }
}
