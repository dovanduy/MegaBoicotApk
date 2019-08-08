package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.p135a.C2961a.C2962a;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.eo */
public final class C3775eo extends C3750dr {

    /* renamed from: a */
    private static final Object f12967a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static C3775eo f12968b;

    /* renamed from: c */
    private final Context f12969c;

    /* renamed from: d */
    private final C3774en f12970d;

    /* renamed from: e */
    private final ScheduledExecutorService f12971e = Executors.newSingleThreadScheduledExecutor();

    private C3775eo(Context context, C3774en enVar) {
        this.f12969c = context;
        this.f12970d = enVar;
    }

    /* renamed from: a */
    public static C3775eo m16575a(Context context, C3774en enVar) {
        C3775eo eoVar;
        synchronized (f12967a) {
            if (f12968b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                aru.m15024a(context);
                f12968b = new C3775eo(context, enVar);
                if (context.getApplicationContext() != null) {
                    C3025aw.m10917e().mo15525c(context);
                }
                C3897jb.m17037a(context);
            }
            eoVar = f12968b;
        }
        return eoVar;
    }

    /* renamed from: a */
    private static zzaej m16577a(Context context, C3774en enVar, zzaef zzaef, ScheduledExecutorService scheduledExecutorService) {
        char c;
        Context context2 = context;
        C3774en enVar2 = enVar;
        zzaef zzaef2 = zzaef;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        C3900je.m17429b("Starting ad request from service using: google.afma.request.getAdDictionary");
        ash ash = new ash(((Boolean) aoq.m14620f().mo14695a(aru.f11762N)).booleanValue(), "load_ad", zzaef2.f14405d.f14543a);
        if (zzaef2.f14399a > 10 && zzaef2.f14373A != -1) {
            ash.mo14723a(ash.mo14718a(zzaef2.f14373A), "cts");
        }
        asf a = ash.mo14717a();
        C4008ne a2 = C3996mt.m17449a(enVar2.f12963i.mo16134a(context2), ((Long) aoq.m14620f().mo14695a(aru.f11882cA)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        C4008ne a3 = C3996mt.m17449a(enVar2.f12962h.mo15294a(context2), ((Long) aoq.m14620f().mo14695a(aru.f11876bv)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        C4008ne a4 = enVar2.f12957c.mo15407a(zzaef2.f14408g.packageName);
        C4008ne b = enVar2.f12957c.mo15408b(zzaef2.f14408g.packageName);
        C4008ne a5 = enVar2.f12964j.mo15410a(zzaef2.f14409h, zzaef2.f14408g);
        Future a6 = C3025aw.m10928p().mo15288a(context2);
        C4008ne a7 = C3996mt.m17448a(null);
        Bundle bundle = zzaef2.f14404c.f14527c;
        boolean z = (bundle == null || bundle.getString("_ad") == null) ? false : true;
        if (zzaef2.f14379G && !z) {
            a7 = enVar2.f12960f.mo15050a(zzaef2.f14407f);
        }
        ash ash2 = ash;
        C4008ne a8 = C3996mt.m17449a(a7, ((Long) aoq.m14620f().mo14695a(aru.f11925cr)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        Future a9 = C3996mt.m17448a(null);
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11785aJ)).booleanValue()) {
            a9 = C3996mt.m17449a(enVar2.f12964j.mo15409a(context2), ((Long) aoq.m14620f().mo14695a(aru.f11786aK)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        }
        Bundle bundle2 = (zzaef2.f14399a < 4 || zzaef2.f14416o == null) ? null : zzaef2.f14416o;
        ((Boolean) aoq.m14620f().mo14695a(aru.f11805ad)).booleanValue();
        C3025aw.m10917e();
        if (C3909jn.m17147a(context2, "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            C3900je.m17429b("Device is offline.");
        }
        String uuid = zzaef2.f14399a >= 7 ? zzaef2.f14423v : UUID.randomUUID().toString();
        new C3781eu(context2, uuid, zzaef2.f14407f.packageName);
        if (zzaef2.f14404c.f14527c != null) {
            String string = zzaef2.f14404c.f14527c.getString("_ad");
            if (string != null) {
                return C3780et.m16587a(context2, zzaef2, string);
            }
        }
        List<String> a10 = enVar2.f12958d.mo14680a(zzaef2.f14424w);
        asf asf = a;
        String str = uuid;
        Bundle bundle3 = (Bundle) C3996mt.m17454a((Future<T>) a2, null, ((Long) aoq.m14620f().mo14695a(aru.f11882cA)).longValue(), TimeUnit.MILLISECONDS);
        C3800fm fmVar = (C3800fm) C3996mt.m17453a((Future<T>) a3, null);
        Location location = (Location) C3996mt.m17453a((Future<T>) a8, null);
        C2962a aVar = (C2962a) C3996mt.m17453a(a9, null);
        String str2 = (String) C3996mt.m17453a((Future<T>) a5, null);
        String str3 = (String) C3996mt.m17453a((Future<T>) a4, null);
        String str4 = (String) C3996mt.m17453a((Future<T>) b, null);
        C3790fc fcVar = (C3790fc) C3996mt.m17453a(a6, null);
        if (fcVar == null) {
            C3900je.m17435e("Error fetching device info. This is not recoverable.");
            return new zzaej(0);
        }
        C3773em emVar = new C3773em();
        emVar.f12951j = zzaef2;
        emVar.f12952k = fcVar;
        emVar.f12946e = fmVar;
        emVar.f12945d = location;
        emVar.f12943b = bundle3;
        emVar.f12949h = str2;
        emVar.f12950i = aVar;
        if (a10 == null) {
            emVar.f12944c.clear();
        }
        emVar.f12944c = a10;
        emVar.f12942a = bundle2;
        emVar.f12947f = str3;
        emVar.f12948g = str4;
        Context context3 = context;
        emVar.f12953l = enVar2.f12956b.mo14515a(context3);
        emVar.f12954m = enVar2.f12965k;
        JSONObject a11 = C3780et.m16591a(context3, emVar);
        if (a11 == null) {
            return new zzaej(0);
        }
        if (zzaef2.f14399a < 7) {
            try {
                a11.put("request_id", str);
            } catch (JSONException unused) {
            }
        }
        ash ash3 = ash2;
        asf asf2 = asf;
        ash3.mo14723a(asf2, "arc");
        ash3.mo14717a();
        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService;
        C4008ne a12 = C3996mt.m17449a(C3996mt.m17450a(enVar2.f12966l.mo15270a().mo15044b(a11), C3776ep.f12972a, (Executor) scheduledExecutorService3), 10, TimeUnit.SECONDS, scheduledExecutorService3);
        C4008ne a13 = enVar2.f12959e.mo15290a();
        if (a13 != null) {
            C3994mr.m17444a(a13, "AdRequestServiceImpl.loadAd.flags");
        }
        C3788fa faVar = (C3788fa) C3996mt.m17453a((Future<T>) a12, null);
        if (faVar == null) {
            return new zzaej(0);
        }
        if (faVar.mo15276a() != -2) {
            return new zzaej(faVar.mo15276a());
        }
        ash3.mo14726d();
        zzaej a14 = !TextUtils.isEmpty(faVar.mo15285i()) ? C3780et.m16587a(context3, zzaef2, faVar.mo15285i()) : null;
        if (a14 == null && !TextUtils.isEmpty(faVar.mo15281e())) {
            a14 = m16578a(zzaef2, context3, zzaef2.f14412k.f14505a, faVar.mo15281e(), str3, str4, faVar, ash3, enVar2);
        }
        if (a14 == null) {
            c = 0;
            a14 = new zzaej(0);
        } else {
            c = 0;
        }
        String[] strArr = new String[1];
        strArr[c] = "tts";
        ash3.mo14723a(asf2, strArr);
        a14.f14474w = ash3.mo14724b();
        return a14;
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.ey.a(long, boolean):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e8, code lost:
        r1 = r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r7 = new java.io.InputStreamReader(r12.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        com.google.android.gms.ads.internal.C3025aw.m10917e();
        r11 = com.google.android.gms.internal.ads.C3909jn.m17131a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        com.google.android.gms.common.util.C3559k.m12757a(r7);
        r10.mo15627a(r11);
        m16579a(r1, r14, r11, r4);
        r6.mo15273a(r1, r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0108, code lost:
        if (r2 == null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        r2.mo14723a(r5, "ufe");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0115, code lost:
        r1 = r6.mo15272a(r8, r24.mo15286j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0120, code lost:
        if (r3 == null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0122, code lost:
        r3.f12961g.mo15293b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012c, code lost:
        r1 = r0;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        com.google.android.gms.common.util.C3559k.m12757a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0131, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014c, code lost:
        com.google.android.gms.internal.ads.C3900je.m17435e("No location header to follow redirect.");
        r1 = new com.google.android.gms.internal.ads.zzaej(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015a, code lost:
        if (r3 == null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015c, code lost:
        r3.f12961g.mo15293b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0161, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017b, code lost:
        com.google.android.gms.internal.ads.C3900je.m17435e("Too many redirects.");
        r1 = new com.google.android.gms.internal.ads.zzaej(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0189, code lost:
        if (r3 == null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x018b, code lost:
        r3.f12961g.mo15293b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0190, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a A[Catch:{ all -> 0x00c0, all -> 0x01cb }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaej m16578a(com.google.android.gms.internal.ads.zzaef r18, android.content.Context r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.google.android.gms.internal.ads.C3788fa r24, com.google.android.gms.internal.ads.ash r25, com.google.android.gms.internal.ads.C3774en r26) {
        /*
            r1 = r18
            r2 = r25
            r3 = r26
            if (r2 == 0) goto L_0x000d
            com.google.android.gms.internal.ads.asf r5 = r25.mo14717a()
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            com.google.android.gms.internal.ads.ey r6 = new com.google.android.gms.internal.ads.ey     // Catch:{ IOException -> 0x01d8 }
            java.lang.String r7 = r24.mo15279c()     // Catch:{ IOException -> 0x01d8 }
            r6.<init>(r1, r7)     // Catch:{ IOException -> 0x01d8 }
            java.lang.String r7 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r8 = java.lang.String.valueOf(r21)     // Catch:{ IOException -> 0x01d8 }
            int r9 = r8.length()     // Catch:{ IOException -> 0x01d8 }
            if (r9 == 0) goto L_0x0028
            java.lang.String r7 = r7.concat(r8)     // Catch:{ IOException -> 0x01d8 }
            goto L_0x002e
        L_0x0028:
            java.lang.String r8 = new java.lang.String     // Catch:{ IOException -> 0x01d8 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x01d8 }
            r7 = r8
        L_0x002e:
            com.google.android.gms.internal.ads.C3900je.m17429b(r7)     // Catch:{ IOException -> 0x01d8 }
            java.net.URL r7 = new java.net.URL     // Catch:{ IOException -> 0x01d8 }
            r8 = r21
            r7.<init>(r8)     // Catch:{ IOException -> 0x01d8 }
            com.google.android.gms.common.util.e r8 = com.google.android.gms.ads.internal.C3025aw.m10924l()     // Catch:{ IOException -> 0x01d8 }
            long r8 = r8.mo13695b()     // Catch:{ IOException -> 0x01d8 }
            r10 = 0
            r11 = r10
        L_0x0042:
            if (r3 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.fk r12 = r3.f12961g     // Catch:{ IOException -> 0x01d8 }
            r12.mo15292a()     // Catch:{ IOException -> 0x01d8 }
        L_0x0049:
            java.net.URLConnection r12 = r7.openConnection()     // Catch:{ IOException -> 0x01d8 }
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ IOException -> 0x01d8 }
            com.google.android.gms.internal.ads.jn r13 = com.google.android.gms.ads.internal.C3025aw.m10917e()     // Catch:{ all -> 0x01cb }
            r14 = r19
            r15 = r20
            r13.mo15517a(r14, r15, r10, r12)     // Catch:{ all -> 0x01cb }
            boolean r13 = r24.mo15283g()     // Catch:{ all -> 0x01cb }
            if (r13 == 0) goto L_0x007e
            boolean r13 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x01cb }
            if (r13 != 0) goto L_0x006e
            java.lang.String r13 = "x-afma-drt-cookie"
            r4 = r22
            r12.addRequestProperty(r13, r4)     // Catch:{ all -> 0x01cb }
            goto L_0x0070
        L_0x006e:
            r4 = r22
        L_0x0070:
            boolean r13 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x01cb }
            if (r13 != 0) goto L_0x0080
            java.lang.String r13 = "x-afma-drt-v2-cookie"
            r10 = r23
            r12.addRequestProperty(r13, r10)     // Catch:{ all -> 0x01cb }
            goto L_0x0082
        L_0x007e:
            r4 = r22
        L_0x0080:
            r10 = r23
        L_0x0082:
            java.lang.String r13 = r1.f14380H     // Catch:{ all -> 0x01cb }
            boolean r16 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x01cb }
            if (r16 != 0) goto L_0x0094
            java.lang.String r4 = "Sending webview cookie in ad request header."
            com.google.android.gms.internal.ads.C3900je.m17429b(r4)     // Catch:{ all -> 0x01cb }
            java.lang.String r4 = "Cookie"
            r12.addRequestProperty(r4, r13)     // Catch:{ all -> 0x01cb }
        L_0x0094:
            if (r24 == 0) goto L_0x00ca
            java.lang.String r4 = r24.mo15280d()     // Catch:{ all -> 0x01cb }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x01cb }
            if (r4 != 0) goto L_0x00ca
            r4 = 1
            r12.setDoOutput(r4)     // Catch:{ all -> 0x01cb }
            java.lang.String r4 = r24.mo15280d()     // Catch:{ all -> 0x01cb }
            byte[] r4 = r4.getBytes()     // Catch:{ all -> 0x01cb }
            int r10 = r4.length     // Catch:{ all -> 0x01cb }
            r12.setFixedLengthStreamingMode(r10)     // Catch:{ all -> 0x01cb }
            java.io.BufferedOutputStream r10 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c3 }
            java.io.OutputStream r14 = r12.getOutputStream()     // Catch:{ all -> 0x00c3 }
            r10.<init>(r14)     // Catch:{ all -> 0x00c3 }
            r10.write(r4)     // Catch:{ all -> 0x00c0 }
            com.google.android.gms.common.util.C3559k.m12757a(r10)     // Catch:{ all -> 0x01cb }
            goto L_0x00cb
        L_0x00c0:
            r0 = move-exception
            r1 = r0
            goto L_0x00c6
        L_0x00c3:
            r0 = move-exception
            r1 = r0
            r10 = 0
        L_0x00c6:
            com.google.android.gms.common.util.C3559k.m12757a(r10)     // Catch:{ all -> 0x01cb }
            throw r1     // Catch:{ all -> 0x01cb }
        L_0x00ca:
            r4 = 0
        L_0x00cb:
            com.google.android.gms.internal.ads.md r10 = new com.google.android.gms.internal.ads.md     // Catch:{ all -> 0x01cb }
            java.lang.String r14 = r1.f14423v     // Catch:{ all -> 0x01cb }
            r10.<init>(r14)     // Catch:{ all -> 0x01cb }
            r10.mo15630a(r12, r4)     // Catch:{ all -> 0x01cb }
            int r4 = r12.getResponseCode()     // Catch:{ all -> 0x01cb }
            java.util.Map r14 = r12.getHeaderFields()     // Catch:{ all -> 0x01cb }
            r10.mo15629a(r12, r4)     // Catch:{ all -> 0x01cb }
            r1 = 200(0xc8, float:2.8E-43)
            r15 = 300(0x12c, float:4.2E-43)
            if (r4 < r1) goto L_0x0132
            if (r4 >= r15) goto L_0x0132
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x01cb }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x012b }
            java.io.InputStream r11 = r12.getInputStream()     // Catch:{ all -> 0x012b }
            r7.<init>(r11)     // Catch:{ all -> 0x012b }
            com.google.android.gms.ads.internal.C3025aw.m10917e()     // Catch:{ all -> 0x0128 }
            java.lang.String r11 = com.google.android.gms.internal.ads.C3909jn.m17131a(r7)     // Catch:{ all -> 0x0128 }
            com.google.android.gms.common.util.C3559k.m12757a(r7)     // Catch:{ all -> 0x01cb }
            r10.mo15627a(r11)     // Catch:{ all -> 0x01cb }
            m16579a(r1, r14, r11, r4)     // Catch:{ all -> 0x01cb }
            r6.mo15273a(r1, r14, r11)     // Catch:{ all -> 0x01cb }
            if (r2 == 0) goto L_0x0115
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x01cb }
            java.lang.String r4 = "ufe"
            r7 = 0
            r1[r7] = r4     // Catch:{ all -> 0x01cb }
            r2.mo14723a(r5, r1)     // Catch:{ all -> 0x01cb }
        L_0x0115:
            boolean r1 = r24.mo15286j()     // Catch:{ all -> 0x01cb }
            com.google.android.gms.internal.ads.zzaej r1 = r6.mo15272a(r8, r1)     // Catch:{ all -> 0x01cb }
            r12.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r3 == 0) goto L_0x0127
            com.google.android.gms.internal.ads.fk r2 = r3.f12961g     // Catch:{ IOException -> 0x01d8 }
            r2.mo15293b()     // Catch:{ IOException -> 0x01d8 }
        L_0x0127:
            return r1
        L_0x0128:
            r0 = move-exception
            r1 = r0
            goto L_0x012e
        L_0x012b:
            r0 = move-exception
            r1 = r0
            r7 = 0
        L_0x012e:
            com.google.android.gms.common.util.C3559k.m12757a(r7)     // Catch:{ all -> 0x01cb }
            throw r1     // Catch:{ all -> 0x01cb }
        L_0x0132:
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x01cb }
            r7 = 0
            m16579a(r1, r14, r7, r4)     // Catch:{ all -> 0x01cb }
            if (r4 < r15) goto L_0x01a4
            r1 = 400(0x190, float:5.6E-43)
            if (r4 >= r1) goto L_0x01a4
            java.lang.String r1 = "Location"
            java.lang.String r1 = r12.getHeaderField(r1)     // Catch:{ all -> 0x01cb }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01cb }
            if (r4 == 0) goto L_0x0162
            java.lang.String r1 = "No location header to follow redirect."
            com.google.android.gms.internal.ads.C3900je.m17435e(r1)     // Catch:{ all -> 0x01cb }
            com.google.android.gms.internal.ads.zzaej r1 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x01cb }
            r2 = 0
            r1.<init>(r2)     // Catch:{ all -> 0x01cb }
            r12.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r3 == 0) goto L_0x0161
            com.google.android.gms.internal.ads.fk r2 = r3.f12961g     // Catch:{ IOException -> 0x01d8 }
            r2.mo15293b()     // Catch:{ IOException -> 0x01d8 }
        L_0x0161:
            return r1
        L_0x0162:
            java.net.URL r4 = new java.net.URL     // Catch:{ all -> 0x01cb }
            r4.<init>(r1)     // Catch:{ all -> 0x01cb }
            r1 = 1
            int r11 = r11 + r1
            com.google.android.gms.internal.ads.ark<java.lang.Integer> r1 = com.google.android.gms.internal.ads.aru.f11966df     // Catch:{ all -> 0x01cb }
            com.google.android.gms.internal.ads.ars r10 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x01cb }
            java.lang.Object r1 = r10.mo14695a(r1)     // Catch:{ all -> 0x01cb }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x01cb }
            int r1 = r1.intValue()     // Catch:{ all -> 0x01cb }
            if (r11 <= r1) goto L_0x0191
            java.lang.String r1 = "Too many redirects."
            com.google.android.gms.internal.ads.C3900je.m17435e(r1)     // Catch:{ all -> 0x01cb }
            com.google.android.gms.internal.ads.zzaej r1 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x01cb }
            r2 = 0
            r1.<init>(r2)     // Catch:{ all -> 0x01cb }
            r12.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r3 == 0) goto L_0x0190
            com.google.android.gms.internal.ads.fk r2 = r3.f12961g     // Catch:{ IOException -> 0x01d8 }
            r2.mo15293b()     // Catch:{ IOException -> 0x01d8 }
        L_0x0190:
            return r1
        L_0x0191:
            r6.mo15274a(r14)     // Catch:{ all -> 0x01cb }
            r12.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r3 == 0) goto L_0x019e
            com.google.android.gms.internal.ads.fk r1 = r3.f12961g     // Catch:{ IOException -> 0x01d8 }
            r1.mo15293b()     // Catch:{ IOException -> 0x01d8 }
        L_0x019e:
            r7 = r4
            r1 = r18
            r10 = 0
            goto L_0x0042
        L_0x01a4:
            r1 = 46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cb }
            r2.<init>(r1)     // Catch:{ all -> 0x01cb }
            java.lang.String r1 = "Received error HTTP response code: "
            r2.append(r1)     // Catch:{ all -> 0x01cb }
            r2.append(r4)     // Catch:{ all -> 0x01cb }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01cb }
            com.google.android.gms.internal.ads.C3900je.m17435e(r1)     // Catch:{ all -> 0x01cb }
            com.google.android.gms.internal.ads.zzaej r1 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x01cb }
            r2 = 0
            r1.<init>(r2)     // Catch:{ all -> 0x01cb }
            r12.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r3 == 0) goto L_0x01ca
            com.google.android.gms.internal.ads.fk r2 = r3.f12961g     // Catch:{ IOException -> 0x01d8 }
            r2.mo15293b()     // Catch:{ IOException -> 0x01d8 }
        L_0x01ca:
            return r1
        L_0x01cb:
            r0 = move-exception
            r1 = r0
            r12.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r3 == 0) goto L_0x01d7
            com.google.android.gms.internal.ads.fk r2 = r3.f12961g     // Catch:{ IOException -> 0x01d8 }
            r2.mo15293b()     // Catch:{ IOException -> 0x01d8 }
        L_0x01d7:
            throw r1     // Catch:{ IOException -> 0x01d8 }
        L_0x01d8:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "Error while connecting to ad server: "
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x01ef
            java.lang.String r1 = r2.concat(r1)
            goto L_0x01f4
        L_0x01ef:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x01f4:
            com.google.android.gms.internal.ads.C3900je.m17435e(r1)
            com.google.android.gms.internal.ads.zzaej r1 = new com.google.android.gms.internal.ads.zzaej
            r2 = 2
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3775eo.m16578a(com.google.android.gms.internal.ads.zzaef, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.fa, com.google.android.gms.internal.ads.ash, com.google.android.gms.internal.ads.en):com.google.android.gms.internal.ads.zzaej");
    }

    /* renamed from: a */
    private static void m16579a(String str, Map<String, List<String>> map, String str2, int i) {
        if (C3900je.m17428a(2)) {
            StringBuilder sb = new StringBuilder(39 + String.valueOf(str).length());
            sb.append("Http Response: {\n  URL:\n    ");
            sb.append(str);
            sb.append("\n  Headers:");
            C3900je.m17043a(sb.toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder sb2 = new StringBuilder(5 + String.valueOf(str3).length());
                    sb2.append("    ");
                    sb2.append(str3);
                    sb2.append(":");
                    C3900je.m17043a(sb2.toString());
                    for (String valueOf : (List) map.get(str3)) {
                        String str4 = "      ";
                        String valueOf2 = String.valueOf(valueOf);
                        C3900je.m17043a(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
                    }
                }
            }
            C3900je.m17043a("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), DefaultOggSeeker.MATCH_BYTE_RANGE)) {
                    int i3 = i2 + AdError.NETWORK_ERROR_CODE;
                    C3900je.m17043a(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                C3900je.m17043a("    null");
            }
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("  Response Code:\n    ");
            sb3.append(i);
            sb3.append("\n}");
            C3900je.m17043a(sb3.toString());
        }
    }

    /* renamed from: a */
    public final zzaej mo15250a(zzaef zzaef) {
        return m16577a(this.f12969c, this.f12970d, zzaef, this.f12971e);
    }

    /* renamed from: a */
    public final void mo15251a(zzaef zzaef, C3752dt dtVar) {
        C3025aw.m10921i().mo15433a(this.f12969c, zzaef.f14412k);
        C4008ne a = C3907jl.m17118a((Runnable) new C3777eq(this, zzaef, dtVar));
        C3025aw.m10932t().mo15603a();
        C3025aw.m10932t().mo15604b().postDelayed(new C3778er(this, a), ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    /* renamed from: a */
    public final void mo15252a(zzaey zzaey, C3755dw dwVar) {
        C3900je.m17043a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final void mo15253b(zzaey zzaey, C3755dw dwVar) {
        C3900je.m17043a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }
}
