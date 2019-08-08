package com.startapp.android.publish.adsCommon.p181e;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.adsCommon.p182f.C5379g.C5381a;
import com.startapp.common.p194b.C5527a;
import com.startapp.common.p194b.p195a.C5532a;
import com.startapp.common.p194b.p195a.C5533b;
import com.startapp.common.p194b.p195a.C5533b.C5534a;
import com.startapp.common.p194b.p195a.C5533b.C5535b;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* renamed from: com.startapp.android.publish.adsCommon.e.a */
/* compiled from: StartAppSDK */
public class C5365a implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final UncaughtExceptionHandler f17193a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: com.startapp.android.publish.adsCommon.e.a$a */
    /* compiled from: StartAppSDK */
    public static final class C5366a implements C5532a {
        public C5533b create(int i) {
            if (i != 868418937) {
                return null;
            }
            return new C5533b() {
                /* renamed from: a */
                public void mo19861a(Context context, int i, Map<String, String> map, final C5535b bVar) {
                    String str = (String) map.get("KEY_STACK_TRACE");
                    if (!TextUtils.isEmpty(str)) {
                        if (str.length() > 1000) {
                            str = str.substring(0, AdError.NETWORK_ERROR_CODE);
                        }
                        Context context2 = context;
                        C5378f.m23017a(context2, C5376d.EXCEPTION, "uncaughtException", str, "", new C5381a() {
                            /* renamed from: a */
                            public void mo19862a(boolean z) {
                                bVar.mo20155a(C5534a.SUCCESS);
                            }
                        });
                    }
                }
            };
        }
    }

    /* renamed from: a */
    public static synchronized void m22955a(Context context) {
        synchronized (C5365a.class) {
            new C5365a(context);
        }
    }

    private C5365a(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(this);
        C5527a.m23595a(context);
        C5527a.m23603a((C5532a) new C5366a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r1 = m22962e(r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.PrintStream r1 = new java.io.PrintStream     // Catch:{ Throwable -> 0x001c }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x001c }
            m22956a(r6, r1)     // Catch:{ Throwable -> 0x001c }
            java.lang.String r1 = new java.lang.String     // Catch:{ Throwable -> 0x001c }
            byte[] r2 = r0.toByteArray()     // Catch:{ Throwable -> 0x001c }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x001c }
        L_0x0016:
            r0.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0021
        L_0x001a:
            r5 = move-exception
            goto L_0x005c
        L_0x001c:
            java.lang.String r1 = m22962e(r6)     // Catch:{ all -> 0x001a }
            goto L_0x0016
        L_0x0021:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = "startapp"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "truenet"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0056
        L_0x0037:
            java.lang.String r0 = m22954a(r1)
            com.startapp.common.b.b$a r1 = new com.startapp.common.b.b$a
            r2 = 868418937(0x33c30579, float:9.0813906E-8)
            r1.<init>(r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            com.startapp.common.b.b$a r1 = r1.mo20518a(r2)
            java.lang.String r2 = "KEY_STACK_TRACE"
            com.startapp.common.b.b$a r0 = r1.mo20519a(r2, r0)
            com.startapp.common.b.b r0 = r0.mo20522a()
            com.startapp.common.p194b.C5527a.m23608a(r0)
        L_0x0056:
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.f17193a
            r0.uncaughtException(r5, r6)
            return
        L_0x005c:
            r0.close()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.adsCommon.p181e.C5365a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: a */
    private static String m22954a(String str) {
        char[] charArray;
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            if (c >= ' ' && c <= '~') {
                sb.append(c);
            } else if (sb.length() == 0 || sb.charAt(sb.length() - 1) != '#') {
                sb.append('#');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m22956a(Throwable th, PrintStream printStream) {
        if (th != null) {
            for (String println : m22958a(th)) {
                printStream.println(println);
            }
            printStream.flush();
        }
    }

    /* renamed from: a */
    private static String[] m22958a(Throwable th) {
        List list;
        Throwable[] b = m22959b(th);
        int length = b.length;
        ArrayList arrayList = new ArrayList();
        int i = length - 1;
        List d = m22961d(b[i]);
        while (true) {
            length--;
            if (length < 0) {
                return (String[]) arrayList.toArray(new String[0]);
            }
            if (length != 0) {
                list = m22961d(b[length - 1]);
                m22957a(d, list);
            } else {
                list = d;
            }
            if (length == i) {
                arrayList.add(b[length].toString());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" [wrapped] ");
                sb.append(b[length].toString());
                arrayList.add(sb.toString());
            }
            arrayList.addAll(d);
            d = list;
        }
    }

    /* renamed from: b */
    private static Throwable[] m22959b(Throwable th) {
        return (Throwable[]) m22960c(th).toArray(new Throwable[0]);
    }

    /* renamed from: c */
    private static List<Throwable> m22960c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        return arrayList;
    }

    /* renamed from: d */
    private static List<String> m22961d(Throwable th) {
        String str;
        String e = m22962e(th);
        try {
            str = System.getProperty("line.separator");
        } catch (Exception unused) {
            str = "\r\n";
        }
        StringTokenizer stringTokenizer = new StringTokenizer(e, str);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("at");
            if (indexOf != -1 && nextToken.substring(0, indexOf).trim().length() == 0) {
                z = true;
                arrayList.add(nextToken);
            } else if (z) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private static String m22962e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    /* renamed from: a */
    private static void m22957a(List<String> list, List<String> list2) {
        if (list == null || list2 == null) {
            throw new IllegalArgumentException("The List must not be null");
        }
        int size = list.size() - 1;
        int size2 = list2.size() - 1;
        while (size >= 0 && size2 >= 0) {
            if (((String) list.get(size)).equals((String) list2.get(size2))) {
                list.remove(size);
            }
            size--;
            size2--;
        }
    }
}
