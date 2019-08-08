package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.util.C3563o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.hk */
public final class C3852hk implements C3862hu {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static List<Future<Void>> f13198a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static ScheduledExecutorService f13199b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public final afg f13200c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private final LinkedHashMap<String, afo> f13201d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private final List<String> f13202e = new ArrayList();
    @GuardedBy("mLock")

    /* renamed from: f */
    private final List<String> f13203f = new ArrayList();

    /* renamed from: g */
    private final Context f13204g;

    /* renamed from: h */
    private final C3864hw f13205h;

    /* renamed from: i */
    private boolean f13206i;

    /* renamed from: j */
    private final zzaiq f13207j;

    /* renamed from: k */
    private final C3865hx f13208k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f13209l = new Object();

    /* renamed from: m */
    private HashSet<String> f13210m = new HashSet<>();

    /* renamed from: n */
    private boolean f13211n = false;

    /* renamed from: o */
    private boolean f13212o = false;

    /* renamed from: p */
    private boolean f13213p = false;

    public C3852hk(Context context, zzang zzang, zzaiq zzaiq, String str, C3864hw hwVar) {
        C3513t.m12626a(zzaiq, (Object) "SafeBrowsing config is not present.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f13204g = context;
        this.f13201d = new LinkedHashMap<>();
        this.f13205h = hwVar;
        this.f13207j = zzaiq;
        for (String lowerCase : this.f13207j.f14501e) {
            this.f13210m.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f13210m.remove("cookie".toLowerCase(Locale.ENGLISH));
        afg afg = new afg();
        afg.f10704a = Integer.valueOf(8);
        afg.f10705b = str;
        afg.f10706c = str;
        afg.f10707d = new afh();
        afg.f10707d.f10722a = this.f13207j.f14497a;
        afp afp = new afp();
        afp.f10756a = zzang.f14505a;
        afp.f10758c = Boolean.valueOf(C3404c.m12230a(this.f13204g).mo13392a());
        long d = (long) C3407d.m12253b().mo13418d(this.f13204g);
        if (d > 0) {
            afp.f10757b = Long.valueOf(d);
        }
        afg.f10711h = afp;
        this.f13200c = afg;
        this.f13208k = new C3865hx(this.f13204g, this.f13207j.f14504h, this);
    }

    /* renamed from: d */
    static final /* synthetic */ Void m16873d(String str) {
        return null;
    }

    /* renamed from: e */
    private final afo m16874e(String str) {
        afo afo;
        synchronized (this.f13209l) {
            afo = (afo) this.f13201d.get(str);
        }
        return afo;
    }

    /* renamed from: f */
    private final C4008ne<Void> m16876f() {
        C4008ne<Void> a;
        afo[] afoArr;
        if (!((this.f13206i && this.f13207j.f14503g) || (this.f13213p && this.f13207j.f14502f) || (!this.f13206i && this.f13207j.f14500d))) {
            return C3996mt.m17448a(null);
        }
        synchronized (this.f13209l) {
            this.f13200c.f10708e = new afo[this.f13201d.size()];
            this.f13201d.values().toArray(this.f13200c.f10708e);
            this.f13200c.f10712i = (String[]) this.f13202e.toArray(new String[0]);
            this.f13200c.f10713j = (String[]) this.f13203f.toArray(new String[0]);
            if (C3861ht.m16895a()) {
                String str = this.f13200c.f10705b;
                String str2 = this.f13200c.f10709f;
                StringBuilder sb = new StringBuilder(53 + String.valueOf(str).length() + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (afo afo : this.f13200c.f10708e) {
                    sb2.append("    [");
                    sb2.append(afo.f10751e.length);
                    sb2.append("] ");
                    sb2.append(afo.f10748b);
                }
                C3861ht.m16894a(sb2.toString());
            }
            C4008ne a2 = new C3946kx(this.f13204g).mo15591a(1, this.f13207j.f14498b, null, afc.m13976a((afc) this.f13200c));
            if (C3861ht.m16895a()) {
                a2.mo15658a(new C3857hp(this), C3907jl.f13407a);
            }
            a = C3996mt.m17451a(a2, C3854hm.f13215a, C4014nk.f13618b);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C4008ne mo15365a(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f13209l) {
                            int length = optJSONArray.length();
                            afo e = m16874e(str);
                            if (e == null) {
                                String str2 = "Cannot find the corresponding resource object for ";
                                String valueOf = String.valueOf(str);
                                C3861ht.m16894a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                            } else {
                                e.f10751e = new String[length];
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    e.f10751e[i] = optJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                boolean z2 = this.f13206i;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f13206i = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                String str3 = "Failed to get SafeBrowsing metadata";
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11883cB)).booleanValue()) {
                    C3900je.m17427a(str3, e2);
                }
                return C3996mt.m17447a((Throwable) new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f13206i) {
            synchronized (this.f13209l) {
                this.f13200c.f10704a = Integer.valueOf(9);
            }
        }
        return m16876f();
    }

    /* renamed from: a */
    public final zzaiq mo15366a() {
        return this.f13207j;
    }

    /* renamed from: a */
    public final void mo15367a(View view) {
        if (this.f13207j.f14499c && !this.f13212o) {
            C3025aw.m10917e();
            Bitmap b = C3909jn.m17152b(view);
            if (b == null) {
                C3861ht.m16894a("Failed to capture the webview bitmap.");
                return;
            }
            this.f13212o = true;
            C3909jn.m17141a((Runnable) new C3855hn(this, b));
        }
    }

    /* renamed from: a */
    public final void mo15368a(String str) {
        synchronized (this.f13209l) {
            this.f13200c.f10709f = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15369a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f13209l
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x000d
            r2 = 1
            r6.f13213p = r2     // Catch:{ all -> 0x000a }
            goto L_0x000d
        L_0x000a:
            r7 = move-exception
            goto L_0x00ca
        L_0x000d:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.afo> r2 = r6.f13201d     // Catch:{ all -> 0x000a }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0027
            if (r9 != r1) goto L_0x0025
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.afo> r8 = r6.f13201d     // Catch:{ all -> 0x000a }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.afo r7 = (com.google.android.gms.internal.ads.afo) r7     // Catch:{ all -> 0x000a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r7.f10750d = r8     // Catch:{ all -> 0x000a }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0027:
            com.google.android.gms.internal.ads.afo r1 = new com.google.android.gms.internal.ads.afo     // Catch:{ all -> 0x000a }
            r1.<init>()     // Catch:{ all -> 0x000a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r1.f10750d = r9     // Catch:{ all -> 0x000a }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.afo> r9 = r6.f13201d     // Catch:{ all -> 0x000a }
            int r9 = r9.size()     // Catch:{ all -> 0x000a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r1.f10747a = r9     // Catch:{ all -> 0x000a }
            r1.f10748b = r7     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.afj r9 = new com.google.android.gms.internal.ads.afj     // Catch:{ all -> 0x000a }
            r9.<init>()     // Catch:{ all -> 0x000a }
            r1.f10749c = r9     // Catch:{ all -> 0x000a }
            java.util.HashSet<java.lang.String> r9 = r6.f13210m     // Catch:{ all -> 0x000a }
            int r9 = r9.size()     // Catch:{ all -> 0x000a }
            if (r9 <= 0) goto L_0x00c3
            if (r8 == 0) goto L_0x00c3
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x000a }
            r9.<init>()     // Catch:{ all -> 0x000a }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x000a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x000a }
        L_0x005e:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x000a }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x000a }
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x0079
        L_0x0077:
            java.lang.String r3 = ""
        L_0x0079:
            java.lang.Object r4 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r2 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x0088
        L_0x0086:
            java.lang.String r2 = ""
        L_0x0088:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.util.HashSet<java.lang.String> r5 = r6.f13210m     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            boolean r4 = r5.contains(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r4 != 0) goto L_0x0097
            goto L_0x005e
        L_0x0097:
            com.google.android.gms.internal.ads.afi r4 = new com.google.android.gms.internal.ads.afi     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.f10724a = r3     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.f10725b = r2     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r9.add(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x005e
        L_0x00b0:
            java.lang.String r2 = "Cannot convert string to bytes, skip header."
            com.google.android.gms.internal.ads.C3861ht.m16894a(r2)     // Catch:{ all -> 0x000a }
            goto L_0x005e
        L_0x00b6:
            int r8 = r9.size()     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.afi[] r8 = new com.google.android.gms.internal.ads.afi[r8]     // Catch:{ all -> 0x000a }
            r9.toArray(r8)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.afj r9 = r1.f10749c     // Catch:{ all -> 0x000a }
            r9.f10726a = r8     // Catch:{ all -> 0x000a }
        L_0x00c3:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.afo> r8 = r6.f13201d     // Catch:{ all -> 0x000a }
            r8.put(r7, r1)     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x00ca:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3852hk.mo15369a(java.lang.String, java.util.Map, int):void");
    }

    /* renamed from: a */
    public final String[] mo15370a(String[] strArr) {
        return (String[]) this.f13208k.mo15382a(strArr).toArray(new String[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo15371b(String str) {
        synchronized (this.f13209l) {
            this.f13202e.add(str);
        }
    }

    /* renamed from: b */
    public final boolean mo15372b() {
        return C3563o.m12768g() && this.f13207j.f14499c && !this.f13212o;
    }

    /* renamed from: c */
    public final void mo15373c() {
        this.f13211n = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo15374c(String str) {
        synchronized (this.f13209l) {
            this.f13203f.add(str);
        }
    }

    /* renamed from: d */
    public final void mo15375d() {
        synchronized (this.f13209l) {
            C4008ne a = C3996mt.m17450a(this.f13205h.mo15379a(this.f13204g, this.f13201d.keySet()), (C3991mo<? super A, ? extends B>) new C3853hl<Object,Object>(this), C4014nk.f13618b);
            C4008ne a2 = C3996mt.m17449a(a, 10, TimeUnit.SECONDS, f13199b);
            C3996mt.m17455a(a, (C3993mq<V>) new C3856ho<V>(this, a2), C4014nk.f13618b);
            f13198a.add(a2);
        }
    }
}
