package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.common.util.C3554f;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.google.android.gms.measurement.internal.el */
public final class C4862el extends C4788bt {

    /* renamed from: a */
    private static final String[] f15789a = {"firebase_", "google_", "ga_"};

    /* renamed from: b */
    private SecureRandom f15790b;

    /* renamed from: c */
    private final AtomicLong f15791c = new AtomicLong(0);

    /* renamed from: d */
    private int f15792d;

    /* renamed from: e */
    private Integer f15793e = null;

    C4862el(C4764aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo17176e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo17177f() {
        mo17144d();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo17158r().mo17754i().mo17763a("Utils falling back to Random for random id");
            }
        }
        this.f15791c.set(nextLong);
    }

    /* renamed from: g */
    public final long mo17503g() {
        long andIncrement;
        long j;
        if (this.f15791c.get() == 0) {
            synchronized (this.f15791c) {
                long nextLong = new Random(System.nanoTime() ^ mo17153m().mo13694a()).nextLong();
                int i = this.f15792d + 1;
                this.f15792d = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f15791c) {
            this.f15791c.compareAndSet(-1, 1);
            andIncrement = this.f15791c.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final SecureRandom mo17504h() {
        mo17144d();
        if (this.f15790b == null) {
            this.f15790b = new SecureRandom();
        }
        return this.f15790b;
    }

    /* renamed from: a */
    static boolean m20968a(String str) {
        C3513t.m12627a(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo17484a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo17158r().mo17754i().mo17764a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m20966a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17494a(String str, String str2) {
        if (str2 == null) {
            mo17158r().mo17761y_().mo17764a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo17158r().mo17761y_().mo17764a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo17158r().mo17761y_().mo17765a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo17158r().mo17761y_().mo17765a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    private final boolean m20977d(String str, String str2) {
        if (str2 == null) {
            mo17158r().mo17761y_().mo17764a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo17158r().mo17761y_().mo17764a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo17158r().mo17761y_().mo17765a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo17158r().mo17761y_().mo17765a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17495a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            mo17158r().mo17761y_().mo17764a("Name is required and can't be null. Type", str);
            return false;
        }
        C3513t.m12625a(str2);
        String[] strArr2 = f15789a;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo17158r().mo17761y_().mo17765a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            C3513t.m12625a(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (m20976c(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                mo17158r().mo17761y_().mo17765a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17493a(String str, int i, String str2) {
        if (str2 == null) {
            mo17158r().mo17761y_().mo17764a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo17158r().mo17761y_().mo17766a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo17496b(String str) {
        if (!m20977d("event", str)) {
            return 2;
        }
        if (!mo17495a("event", C4790bv.f15566a, str)) {
            return 13;
        }
        if (!mo17493a("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo17499c(String str) {
        if (!m20977d("user property", str)) {
            return 6;
        }
        if (!mo17495a("user property", C4792bx.f15570a, str)) {
            return 15;
        }
        if (!mo17493a("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* renamed from: a */
    private final boolean m20969a(String str, String str2, int i, Object obj, boolean z) {
        Parcelable[] parcelableArr;
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) <= i) {
                return true;
            }
            mo17158r().mo17754i().mo17766a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
            return false;
        } else if ((obj instanceof Bundle) && z) {
            return true;
        } else {
            if ((obj instanceof Parcelable[]) && z) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        mo17158r().mo17754i().mo17765a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof ArrayList) || !z) {
                return false;
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (!(obj2 instanceof Bundle)) {
                        mo17158r().mo17754i().mo17765a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo17498b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!m20979g(str)) {
                if (this.f15564q.mo17251o()) {
                    mo17158r().mo17761y_().mo17764a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C4893r.m21360a(str));
                }
                return false;
            }
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f15564q.mo17251o()) {
                mo17158r().mo17761y_().mo17763a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (!m20979g(str2)) {
            mo17158r().mo17761y_().mo17764a("Invalid admob_app_id. Analytics disabled.", C4893r.m21360a(str2));
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m20970a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: g */
    private static boolean m20979g(String str) {
        C3513t.m12625a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: a */
    private static Object m20962a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m20963a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m20963a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo17488a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return m20962a(256, obj, true);
        }
        if (!m20978e(str)) {
            i = 100;
        }
        return m20962a(i, obj, false);
    }

    /* renamed from: a */
    static Bundle[] m20972a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (mo17493a("event param", 40, r14) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (mo17493a("event param", 40, r14) == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0133  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo17486a(java.lang.String r19, java.lang.String r20, android.os.Bundle r21, java.util.List<java.lang.String> r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r6 = r18
            r7 = r21
            r8 = r22
            r9 = 0
            if (r7 == 0) goto L_0x0171
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r7)
            java.util.Set r0 = r21.keySet()
            java.util.Iterator r11 = r0.iterator()
            r12 = 0
            r13 = r12
        L_0x0018:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0172
            java.lang.Object r0 = r11.next()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            r15 = 40
            r0 = 3
            if (r8 == 0) goto L_0x0033
            boolean r1 = r8.contains(r14)
            if (r1 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r1 = r12
            goto L_0x0074
        L_0x0033:
            r1 = 14
            if (r23 == 0) goto L_0x0054
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo17494a(r2, r14)
            if (r2 != 0) goto L_0x0041
        L_0x003f:
            r2 = r0
            goto L_0x0055
        L_0x0041:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo17495a(r2, r9, r14)
            if (r2 != 0) goto L_0x004b
            r2 = r1
            goto L_0x0055
        L_0x004b:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo17493a(r2, r15, r14)
            if (r2 != 0) goto L_0x0054
            goto L_0x003f
        L_0x0054:
            r2 = r12
        L_0x0055:
            if (r2 != 0) goto L_0x0073
            java.lang.String r2 = "event param"
            boolean r2 = r6.m20977d(r2, r14)
            if (r2 != 0) goto L_0x0061
        L_0x005f:
            r1 = r0
            goto L_0x0074
        L_0x0061:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo17495a(r2, r9, r14)
            if (r2 != 0) goto L_0x006a
            goto L_0x0074
        L_0x006a:
            java.lang.String r1 = "event param"
            boolean r1 = r6.mo17493a(r1, r15, r14)
            if (r1 != 0) goto L_0x0031
            goto L_0x005f
        L_0x0073:
            r1 = r2
        L_0x0074:
            r5 = 1
            if (r1 == 0) goto L_0x0090
            boolean r2 = m20967a(r10, r1)
            if (r2 == 0) goto L_0x008b
            java.lang.String r2 = m20963a(r14, r15, r5)
            java.lang.String r3 = "_ev"
            r10.putString(r3, r2)
            if (r1 != r0) goto L_0x008b
            m20964a(r10, r14)
        L_0x008b:
            r10.remove(r14)
            goto L_0x012a
        L_0x0090:
            java.lang.Object r4 = r7.get(r14)
            r18.mo17144d()
            if (r24 == 0) goto L_0x00cd
            java.lang.String r0 = "param"
            boolean r1 = r4 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x00a4
            r1 = r4
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            int r1 = r1.length
            goto L_0x00af
        L_0x00a4:
            boolean r1 = r4 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x00c6
            r1 = r4
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
        L_0x00af:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r2) goto L_0x00c6
            com.google.android.gms.measurement.internal.r r2 = r18.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17754i()
            java.lang.String r3 = "Parameter array is too long; discarded. Value kind, name, array length"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo17766a(r3, r0, r14, r1)
            r0 = r12
            goto L_0x00c7
        L_0x00c6:
            r0 = r5
        L_0x00c7:
            if (r0 != 0) goto L_0x00cd
            r0 = 17
            r9 = r5
            goto L_0x0107
        L_0x00cd:
            com.google.android.gms.measurement.internal.et r0 = r18.mo17160t()
            r3 = r19
            boolean r0 = r0.mo17648f(r3)
            if (r0 == 0) goto L_0x00df
            boolean r0 = m20978e(r20)
            if (r0 != 0) goto L_0x00e5
        L_0x00df:
            boolean r0 = m20978e(r14)
            if (r0 == 0) goto L_0x00f5
        L_0x00e5:
            java.lang.String r1 = "param"
            r16 = 256(0x100, float:3.59E-43)
            r0 = r6
            r2 = r14
            r3 = r16
            r9 = r5
            r5 = r24
            boolean r0 = r0.m20969a(r1, r2, r3, r4, r5)
            goto L_0x0102
        L_0x00f5:
            r9 = r5
            java.lang.String r1 = "param"
            r3 = 100
            r0 = r6
            r2 = r14
            r5 = r24
            boolean r0 = r0.m20969a(r1, r2, r3, r4, r5)
        L_0x0102:
            if (r0 == 0) goto L_0x0106
            r0 = r12
            goto L_0x0107
        L_0x0106:
            r0 = 4
        L_0x0107:
            if (r0 == 0) goto L_0x012d
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x012d
            boolean r0 = m20967a(r10, r0)
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = m20963a(r14, r15, r9)
            java.lang.String r1 = "_ev"
            r10.putString(r1, r0)
            java.lang.Object r0 = r7.get(r14)
            m20964a(r10, r0)
        L_0x0127:
            r10.remove(r14)
        L_0x012a:
            r9 = 0
            goto L_0x0018
        L_0x012d:
            boolean r0 = m20968a(r14)
            if (r0 == 0) goto L_0x016e
            int r13 = r13 + 1
            r0 = 25
            if (r13 <= r0) goto L_0x016e
            r0 = 48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Event can't contain more than 25 params"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.measurement.internal.r r1 = r18.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()
            com.google.android.gms.measurement.internal.p r2 = r18.mo17155o()
            r3 = r20
            java.lang.String r2 = r2.mo17746a(r3)
            com.google.android.gms.measurement.internal.p r4 = r18.mo17155o()
            java.lang.String r4 = r4.mo17743a(r7)
            r1.mo17765a(r0, r2, r4)
            r0 = 5
            m20967a(r10, r0)
            r10.remove(r14)
            goto L_0x012a
        L_0x016e:
            r3 = r20
            goto L_0x012a
        L_0x0171:
            r10 = 0
        L_0x0172:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4862el.mo17486a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* renamed from: a */
    private static boolean m20967a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: a */
    private static void m20964a(Bundle bundle, Object obj) {
        C3513t.m12625a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    /* renamed from: h */
    private static int m20980h(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo17497b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = m20969a("user property referrer", str, m20980h(str), obj, false);
        } else {
            z = m20969a("user property", str, m20980h(str), obj, false);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Object mo17500c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m20962a(m20980h(str), obj, true);
        }
        return m20962a(m20980h(str), obj, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17491a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                if (str != null) {
                    mo17158r().mo17756k().mo17765a("Not putting event parameter. Invalid value type. name, type", mo17155o().mo17747b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17489a(int i, String str, String str2, int i2) {
        mo17492a((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17492a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m20967a(bundle, i);
        if (mo17160t().mo17645d(str, C4882h.f15898au)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                bundle.putString(str2, str3);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f15564q.mo17161u();
        this.f15564q.mo17246h().mo17318a("auto", "_err", bundle);
    }

    /* renamed from: i */
    static MessageDigest m20981i() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    static long m20961a(byte[] bArr) {
        C3513t.m12625a(bArr);
        int i = 0;
        C3513t.m12631a(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            i += 8;
            length--;
            j += (((long) bArr[length]) & 255) << i;
        }
        return j;
    }

    /* renamed from: a */
    static boolean m20965a(Context context, boolean z) {
        C3513t.m12625a(context);
        if (VERSION.SDK_INT >= 24) {
            return m20974b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m20974b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: b */
    private static boolean m20974b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo17501d(String str) {
        mo17144d();
        if (C3404c.m12230a(mo17154n()).mo13388a(str) == 0) {
            return true;
        }
        mo17158r().mo17758w().mo17764a("Permission not granted", str);
        return false;
    }

    /* renamed from: e */
    static boolean m20978e(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: c */
    static boolean m20976c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo17502f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String v = mo17160t().mo17666v();
        mo17161u();
        return v.equals(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo17485a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = mo17488a(str, bundle.get(str));
                if (a == null) {
                    mo17158r().mo17754i().mo17764a("Param value can't be null", mo17155o().mo17747b(str));
                } else {
                    mo17491a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzag mo17487a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo17496b(str2) != 0) {
            mo17158r().mo17761y_().mo17764a("Invalid conditional property event name", mo17155o().mo17748c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        zzag zzag = new zzag(str2, new zzad(mo17485a(mo17486a(str, str2, bundle2, C3554f.m12735a("_o"), false, false))), str3, j);
        return zzag;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo17483a(Context context, String str) {
        mo17144d();
        C3513t.m12625a(context);
        C3513t.m12627a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest i = m20981i();
        if (i == null) {
            mo17158r().mo17761y_().mo17763a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m20975c(context, str)) {
                    PackageInfo b = C3404c.m12230a(context).mo13395b(mo17154n().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return m20961a(i.digest(b.signatures[0].toByteArray()));
                    }
                    mo17158r().mo17754i().mo17763a("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e) {
                mo17158r().mo17761y_().mo17764a("Package name not found", e);
            }
        }
        return 0;
    }

    /* renamed from: c */
    private final boolean m20975c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = C3404c.m12230a(context).mo13395b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            mo17158r().mo17761y_().mo17764a("Error obtaining certificate", e);
        } catch (NameNotFoundException e2) {
            mo17158r().mo17761y_().mo17764a("Package name not found", e2);
        }
        return true;
    }

    /* renamed from: a */
    static byte[] m20971a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public static Bundle m20973b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: j */
    public final int mo17505j() {
        if (this.f15793e == null) {
            this.f15793e = Integer.valueOf(C3407d.m12253b().mo13418d(mo17154n()) / AdError.NETWORK_ERROR_CODE);
        }
        return this.f15793e.intValue();
    }

    /* renamed from: a */
    public final int mo17482a(int i) {
        return C3407d.m12253b().mo13408b(mo17154n(), (int) C3415h.f9877b);
    }

    /* renamed from: a */
    public static long m20960a(long j, long j2) {
        return (j + (j2 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS)) / 86400000;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final String mo17506k() {
        byte[] bArr = new byte[16];
        mo17504h().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17490a(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            mo17158r().mo17754i().mo17764a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17138a() {
        super.mo17138a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17141b() {
        super.mo17141b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo17143c() {
        super.mo17143c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo17144d() {
        super.mo17144d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4768b mo17152l() {
        return super.mo17152l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3553e mo17153m() {
        return super.mo17153m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo17154n() {
        return super.mo17154n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4891p mo17155o() {
        return super.mo17155o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4862el mo17156p() {
        return super.mo17156p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4759ar mo17157q() {
        return super.mo17157q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4893r mo17158r() {
        return super.mo17158r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4745ad mo17159s() {
        return super.mo17159s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4870et mo17160t() {
        return super.mo17160t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4868er mo17161u() {
        return super.mo17161u();
    }
}
