package com.facebook.ads.internal.p094u;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p084k.C1752a;
import com.facebook.ads.internal.p084k.C1755d;
import com.facebook.ads.internal.p084k.C1756e;
import com.facebook.ads.internal.p085l.C1757a;
import com.facebook.ads.internal.p086m.C1764c;
import com.facebook.ads.internal.p089p.C1780a;
import com.facebook.ads.internal.p090q.C1793a;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p095v.p096a.C1855a;
import com.facebook.ads.internal.p095v.p096a.C1858b;
import com.facebook.ads.internal.p095v.p096a.C1869m;
import com.facebook.ads.internal.p095v.p096a.C1870n;
import com.facebook.ads.internal.p115w.p117b.C2321i;
import com.facebook.ads.internal.p115w.p117b.C2326n;
import com.facebook.ads.internal.p115w.p117b.C2337u;
import com.facebook.ads.internal.p115w.p117b.C2337u.C2338a;
import com.facebook.ads.internal.p115w.p122g.C2363a;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.protocol.C1792h;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.io.File;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;

/* renamed from: com.facebook.ads.internal.u.c */
public class C1843c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C1847a f5873a;

    /* renamed from: j */
    private static final C2326n f5874j = new C2326n();

    /* renamed from: k */
    private static final ThreadPoolExecutor f5875k = ((ThreadPoolExecutor) Executors.newCachedThreadPool(f5874j));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f5876b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1850d f5877c = C1850d.m7780a();

    /* renamed from: d */
    private final C1795a f5878d = C1795a.m7440af(this.f5876b);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Map<String, String> f5879e;

    /* renamed from: f */
    private C1848b f5880f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1842b f5881g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1855a f5882h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final String f5883i;

    /* renamed from: com.facebook.ads.internal.u.c$a */
    public interface C1847a {
        /* renamed from: a */
        C1849c mo7826a(C1843c cVar, C1842b bVar);

        /* renamed from: a */
        void mo7827a(C1843c cVar, Map<String, String> map);
    }

    /* renamed from: com.facebook.ads.internal.u.c$b */
    public interface C1848b {
        /* renamed from: a */
        void mo7048a(C1782a aVar);

        /* renamed from: a */
        void mo7049a(C1853f fVar);
    }

    /* renamed from: com.facebook.ads.internal.u.c$c */
    public static class C1849c {

        /* renamed from: a */
        public final C1853f f5889a;

        /* renamed from: b */
        public final C1782a f5890b;
    }

    public C1843c(Context context) {
        String str;
        this.f5876b = context.getApplicationContext();
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        if (TextUtils.isEmpty(urlPrefix)) {
            str = "https://graph.facebook.com/network_ads_common";
        } else {
            str = String.format(Locale.US, "https://graph.%s.facebook.com/network_ads_common", new Object[]{urlPrefix});
        }
        this.f5883i = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7756a(C1782a aVar) {
        if (this.f5880f != null) {
            this.f5880f.mo7048a(aVar);
        }
        mo7818a();
    }

    /* renamed from: a */
    private void m7759a(C1853f fVar) {
        if (this.f5880f != null) {
            this.f5880f.mo7049a(fVar);
        }
        mo7818a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7760a(String str) {
        int i;
        C1782a aVar;
        Context context;
        Exception e;
        String str2;
        int i2;
        Exception e2;
        try {
            C1851e a = this.f5877c.mo7828a(str);
            C1764c a2 = a.mo7829a();
            String str3 = null;
            if (a2 != null) {
                this.f5878d.mo7655a(a2.mo7598b());
                if (AdInternalSettings.f5734d) {
                    boolean z = true;
                    if (C1795a.m7428V(this.f5876b)) {
                        context = this.f5876b;
                        if (context == null) {
                            z = false;
                        }
                        if (z) {
                            try {
                                File file = new File(context.getFilesDir(), "com.facebook.ads.ipc");
                                if (!file.exists()) {
                                    z = file.createNewFile();
                                }
                            } catch (Exception e3) {
                                e = e3;
                            }
                        }
                        e = !z ? new Exception("Can't create ipc marker.") : null;
                        if (e != null) {
                            str2 = "ipc";
                            i2 = C2373b.f7495ac;
                        }
                    } else {
                        context = this.f5876b;
                        if (context == null) {
                            z = false;
                        }
                        if (z) {
                            try {
                                File file2 = new File(context.getFilesDir(), "com.facebook.ads.ipc");
                                if (file2.exists()) {
                                    z = file2.delete();
                                }
                            } catch (Exception e4) {
                                e2 = e4;
                            }
                        }
                        e2 = !z ? new Exception("Can't delete ipc marker.") : null;
                        if (e != null) {
                            str2 = "ipc";
                            i2 = C2373b.f7495ac;
                        }
                    }
                    C2370a.m9146a(context, str2, i2, e);
                }
                C1710a.m7129a(this.f5876b, a2.mo7599c());
                C1840a.m7739a(a2.mo7596a().mo7608d(), this.f5881g);
                C2363a.m9139a(this.f5876b, f5875k, a2);
            }
            switch (a.mo7830b()) {
                case ADS:
                    if (C1795a.m7467z(this.f5876b)) {
                        C1780a.m7379a(this.f5876b, m7763c());
                    }
                    C1853f fVar = (C1853f) a;
                    if (a2 != null) {
                        if (a2.mo7596a().mo7609e()) {
                            C1840a.m7740a(str, this.f5881g);
                        }
                        if (this.f5879e != null) {
                            str3 = (String) this.f5879e.get("CLIENT_REQUEST_ID");
                        }
                        String c = a.mo7831c();
                        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(str3)) {
                            StringBuilder sb = new StringBuilder();
                            for (int i3 = 0; i3 < "73q8p304q6q511r89s8os2801s1o9sq1".length(); i3++) {
                                char charAt = "73q8p304q6q511r89s8os2801s1o9sq1".charAt(i3);
                                if ((charAt < 'a' || charAt > 'm') && (charAt < 'A' || charAt > 'M')) {
                                    if ((charAt >= 'n' && charAt <= 'z') || (charAt >= 'N' && charAt <= 'Z')) {
                                        i = charAt - 13;
                                    }
                                    sb.append(charAt);
                                } else {
                                    i = charAt + 13;
                                }
                                charAt = (char) i;
                                sb.append(charAt);
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str3);
                            sb2.append(c);
                            sb2.append(sb.toString());
                            byte[] bytes = sb2.toString().getBytes("iso-8859-1");
                            MessageDigest instance = MessageDigest.getInstance("SHA-1");
                            instance.update(bytes, 0, bytes.length);
                            if (!a.mo7832d().equals(C2321i.m9042a(instance.digest()))) {
                                C2370a.m9149b(this.f5876b, "network", C2373b.f7518t, new C1792h());
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(c);
                            sb3.append(str3);
                            sb3.append(sb.toString());
                            byte[] bytes2 = sb3.toString().getBytes("iso-8859-1");
                            MessageDigest instance2 = MessageDigest.getInstance("SHA-1");
                            instance2.update(bytes2, 0, bytes2.length);
                            C1756e.m7281a((C1755d) new C1752a(c, C2321i.m9042a(instance2.digest())), this.f5876b);
                        }
                        if (!TextUtils.isEmpty(a.mo7833e()) && !TextUtils.isEmpty(str3)) {
                            new C1793a(this.f5876b, str3, a.mo7833e()).mo7648a();
                        }
                    }
                    m7759a(fVar);
                    return;
                case ERROR:
                    C1854g gVar = (C1854g) a;
                    String f = gVar.mo7834f();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(gVar.mo7835g(), AdErrorType.ERROR_MESSAGE);
                    if (f != null) {
                        str = f;
                    }
                    aVar = C1782a.m7381a(adErrorTypeFromCode, str);
                    break;
                default:
                    aVar = C1782a.m7381a(AdErrorType.UNKNOWN_RESPONSE, str);
                    break;
            }
            m7756a(aVar);
        } catch (Exception e5) {
            m7756a(C1782a.m7381a(AdErrorType.PARSER_FAILURE, e5.getMessage()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C1858b m7763c() {
        return new C1858b() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo7823a(C1869m mVar) {
                C1840a.m7742b(C1843c.this.f5881g);
                C1843c.this.f5882h = null;
                try {
                    C1870n a = mVar.mo7885a();
                    if (a != null) {
                        String e = a.mo7890e();
                        C1851e a2 = C1843c.this.f5877c.mo7828a(e);
                        if (a2.mo7830b() == C1852a.ERROR) {
                            C1854g gVar = (C1854g) a2;
                            String f = gVar.mo7834f();
                            AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(gVar.mo7835g(), AdErrorType.ERROR_MESSAGE);
                            C1843c cVar = C1843c.this;
                            if (f != null) {
                                e = f;
                            }
                            cVar.m7756a(C1782a.m7381a(adErrorTypeFromCode, e));
                            return;
                        }
                    }
                } catch (JSONException unused) {
                }
                C1843c.this.m7756a(C1782a.m7381a(AdErrorType.NETWORK_ERROR, mVar.getMessage()));
            }

            /* renamed from: a */
            public void mo7824a(C1870n nVar) {
                if (nVar != null) {
                    String e = nVar.mo7890e();
                    C1840a.m7742b(C1843c.this.f5881g);
                    C1843c.this.f5882h = null;
                    C1843c.this.m7760a(e);
                }
            }

            /* renamed from: a */
            public void mo7825a(Exception exc) {
                if (C1869m.class.equals(exc.getClass())) {
                    mo7823a((C1869m) exc);
                } else {
                    C1843c.this.m7756a(C1782a.m7381a(AdErrorType.NETWORK_ERROR, exc.getMessage()));
                }
            }
        };
    }

    /* renamed from: a */
    public void mo7818a() {
        if (this.f5882h != null) {
            this.f5882h.mo7858c(1);
            this.f5882h.mo7855b(1);
            this.f5882h = null;
        }
    }

    /* renamed from: a */
    public void mo7819a(C1842b bVar) {
        mo7820a(bVar, false);
    }

    /* renamed from: a */
    public void mo7820a(final C1842b bVar, final boolean z) {
        mo7818a();
        if (!z && f5873a != null) {
            C1849c a = f5873a.mo7826a(this, bVar);
            if (a != null) {
                if (a.f5889a != null) {
                    m7759a(a.f5889a);
                    return;
                } else if (a.f5890b != null) {
                    m7756a(a.f5890b);
                    return;
                }
            }
        }
        if (C2337u.m9066a(this.f5876b) == C2338a.NONE) {
            m7756a(new C1782a(AdErrorType.NETWORK_ERROR, "No network connection"));
            return;
        }
        this.f5881g = bVar;
        C1757a.m7290a(this.f5876b);
        if (C1840a.m7741a(bVar)) {
            String c = C1840a.m7743c(bVar);
            if (c != null) {
                m7760a(c);
            } else {
                m7756a(C1782a.m7381a(AdErrorType.LOAD_TOO_FREQUENTLY, null));
            }
        } else {
            f5875k.submit(new Runnable() {
                /* JADX WARNING: Can't wrap try/catch for region: R(10:8|(1:12)|13|14|15|16|(2:22|(1:24)(3:25|27|28))|26|27|28) */
                /* JADX WARNING: Code restructure failed: missing block: B:29:0x011a, code lost:
                    r0 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:30:0x011b, code lost:
                    com.facebook.ads.internal.p094u.C1843c.m7757a(r6.f5886c, com.facebook.ads.internal.protocol.C1782a.m7381a(com.facebook.ads.internal.protocol.AdErrorType.AD_REQUEST_FAILED, r0.getMessage()));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:31:0x012a, code lost:
                    return;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00b7 */
                /* JADX WARNING: Removed duplicated region for block: B:24:0x00dd A[Catch:{ Exception -> 0x011a }] */
                /* JADX WARNING: Removed duplicated region for block: B:25:0x00de A[Catch:{ Exception -> 0x011a }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r6 = this;
                        com.facebook.ads.internal.u.c r0 = com.facebook.ads.internal.p094u.C1843c.this
                        android.content.Context r0 = r0.f5876b
                        com.facebook.ads.internal.p080g.C1719b.m7171a(r0)
                        com.facebook.ads.internal.u.c r0 = com.facebook.ads.internal.p094u.C1843c.this
                        android.content.Context r0 = r0.f5876b
                        com.facebook.ads.internal.p087n.C1771d.m7351a(r0)
                        com.facebook.ads.internal.u.b r0 = r3
                        com.facebook.ads.internal.protocol.g r0 = r0.mo7816f()
                        boolean r0 = r0.mo7644a()
                        if (r0 == 0) goto L_0x0044
                        com.facebook.ads.internal.u.b r0 = r3     // Catch:{ b -> 0x002a }
                        com.facebook.ads.internal.protocol.g r0 = r0.mo7816f()     // Catch:{ b -> 0x002a }
                        java.lang.String r1 = com.facebook.ads.internal.p080g.C1719b.f5386b     // Catch:{ b -> 0x002a }
                        r0.mo7643a(r1)     // Catch:{ b -> 0x002a }
                        goto L_0x0034
                    L_0x002a:
                        r0 = move-exception
                        com.facebook.ads.internal.u.c r1 = com.facebook.ads.internal.p094u.C1843c.this
                        com.facebook.ads.internal.protocol.a r0 = com.facebook.ads.internal.protocol.C1782a.m7382a(r0)
                        r1.m7756a(r0)
                    L_0x0034:
                        com.facebook.ads.internal.u.c r0 = com.facebook.ads.internal.p094u.C1843c.this
                        com.facebook.ads.internal.u.b r1 = r3
                        com.facebook.ads.internal.protocol.g r1 = r1.mo7816f()
                        java.lang.String r1 = r1.mo7645b()
                        r0.m7760a(r1)
                        return
                    L_0x0044:
                        com.facebook.ads.internal.u.c r0 = com.facebook.ads.internal.p094u.C1843c.this
                        com.facebook.ads.internal.u.b r1 = r3
                        java.util.Map r1 = r1.mo7817g()
                        r0.f5879e = r1
                        boolean r0 = r4
                        if (r0 == 0) goto L_0x0068
                        com.facebook.ads.internal.u.c$a r0 = com.facebook.ads.internal.p094u.C1843c.f5873a
                        if (r0 == 0) goto L_0x0068
                        com.facebook.ads.internal.u.c$a r0 = com.facebook.ads.internal.p094u.C1843c.f5873a
                        com.facebook.ads.internal.u.c r1 = com.facebook.ads.internal.p094u.C1843c.this
                        com.facebook.ads.internal.u.c r2 = com.facebook.ads.internal.p094u.C1843c.this
                        java.util.Map r2 = r2.f5879e
                        r0.mo7827a(r1, r2)
                    L_0x0068:
                        com.facebook.ads.internal.u.c r0 = com.facebook.ads.internal.p094u.C1843c.this     // Catch:{ Exception -> 0x00b7 }
                        java.util.Map r0 = r0.f5879e     // Catch:{ Exception -> 0x00b7 }
                        java.lang.String r1 = "M_BANNER_KEY"
                        java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x00b7 }
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b7 }
                        r3.<init>()     // Catch:{ Exception -> 0x00b7 }
                        com.facebook.ads.internal.u.c r4 = com.facebook.ads.internal.p094u.C1843c.this     // Catch:{ Exception -> 0x00b7 }
                        android.content.Context r4 = r4.f5876b     // Catch:{ Exception -> 0x00b7 }
                        java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x00b7 }
                        r3.append(r4)     // Catch:{ Exception -> 0x00b7 }
                        java.lang.String r4 = " "
                        r3.append(r4)     // Catch:{ Exception -> 0x00b7 }
                        com.facebook.ads.internal.u.c r4 = com.facebook.ads.internal.p094u.C1843c.this     // Catch:{ Exception -> 0x00b7 }
                        android.content.Context r4 = r4.f5876b     // Catch:{ Exception -> 0x00b7 }
                        android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ Exception -> 0x00b7 }
                        com.facebook.ads.internal.u.c r5 = com.facebook.ads.internal.p094u.C1843c.this     // Catch:{ Exception -> 0x00b7 }
                        android.content.Context r5 = r5.f5876b     // Catch:{ Exception -> 0x00b7 }
                        java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x00b7 }
                        java.lang.String r4 = r4.getInstallerPackageName(r5)     // Catch:{ Exception -> 0x00b7 }
                        r3.append(r4)     // Catch:{ Exception -> 0x00b7 }
                        java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00b7 }
                        byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x00b7 }
                        r4 = 2
                        byte[] r3 = android.util.Base64.encode(r3, r4)     // Catch:{ Exception -> 0x00b7 }
                        r2.<init>(r3)     // Catch:{ Exception -> 0x00b7 }
                        r0.put(r1, r2)     // Catch:{ Exception -> 0x00b7 }
                    L_0x00b7:
                        com.facebook.ads.internal.u.b r0 = r3     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.protocol.e r0 = r0.mo7811a()     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.protocol.e r1 = com.facebook.ads.internal.protocol.C1787e.NATIVE_250     // Catch:{ Exception -> 0x011a }
                        if (r0 == r1) goto L_0x00e0
                        com.facebook.ads.internal.u.b r0 = r3     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.protocol.e r0 = r0.mo7811a()     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.protocol.e r1 = com.facebook.ads.internal.protocol.C1787e.NATIVE_UNKNOWN     // Catch:{ Exception -> 0x011a }
                        if (r0 == r1) goto L_0x00e0
                        com.facebook.ads.internal.u.b r0 = r3     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.protocol.e r0 = r0.mo7811a()     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.protocol.e r1 = com.facebook.ads.internal.protocol.C1787e.NATIVE_BANNER     // Catch:{ Exception -> 0x011a }
                        if (r0 == r1) goto L_0x00e0
                        com.facebook.ads.internal.u.b r0 = r3     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.protocol.e r0 = r0.mo7811a()     // Catch:{ Exception -> 0x011a }
                        if (r0 != 0) goto L_0x00de
                        goto L_0x00e0
                    L_0x00de:
                        r0 = 0
                        goto L_0x00e1
                    L_0x00e0:
                        r0 = 1
                    L_0x00e1:
                        com.facebook.ads.internal.u.c r1 = com.facebook.ads.internal.p094u.C1843c.this     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.u.c r2 = com.facebook.ads.internal.p094u.C1843c.this     // Catch:{ Exception -> 0x011a }
                        android.content.Context r2 = r2.f5876b     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.v.a.a r0 = com.facebook.ads.internal.p115w.p120e.C2357d.m9116a(r2, r0)     // Catch:{ Exception -> 0x011a }
                        r1.f5882h = r0     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.u.c r0 = com.facebook.ads.internal.p094u.C1843c.this     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.v.a.a r0 = r0.f5882h     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.u.c r1 = com.facebook.ads.internal.p094u.C1843c.this     // Catch:{ Exception -> 0x011a }
                        java.lang.String r1 = r1.f5883i     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.u.c r2 = com.facebook.ads.internal.p094u.C1843c.this     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.v.a.a r2 = r2.f5882h     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.v.a.p r2 = r2.mo7844a()     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.u.c r3 = com.facebook.ads.internal.p094u.C1843c.this     // Catch:{ Exception -> 0x011a }
                        java.util.Map r3 = r3.f5879e     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.v.a.p r2 = r2.mo7891a(r3)     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.u.c r3 = com.facebook.ads.internal.p094u.C1843c.this     // Catch:{ Exception -> 0x011a }
                        com.facebook.ads.internal.v.a.b r3 = r3.m7763c()     // Catch:{ Exception -> 0x011a }
                        r0.mo7856b(r1, r2, r3)     // Catch:{ Exception -> 0x011a }
                        return
                    L_0x011a:
                        r0 = move-exception
                        com.facebook.ads.internal.u.c r1 = com.facebook.ads.internal.p094u.C1843c.this
                        com.facebook.ads.internal.protocol.AdErrorType r2 = com.facebook.ads.internal.protocol.AdErrorType.AD_REQUEST_FAILED
                        java.lang.String r0 = r0.getMessage()
                        com.facebook.ads.internal.protocol.a r0 = com.facebook.ads.internal.protocol.C1782a.m7381a(r2, r0)
                        r1.m7756a(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p094u.C1843c.C18441.run():void");
                }
            });
        }
    }

    /* renamed from: a */
    public void mo7821a(C1848b bVar) {
        this.f5880f = bVar;
    }
}
