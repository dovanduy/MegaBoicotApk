package org.apache.p199a.p208c.p213e;

import java.util.regex.Pattern;

/* renamed from: org.apache.a.c.e.a */
/* compiled from: InetAddressUtils */
public class C6330a {

    /* renamed from: a */
    private static final Pattern f20868a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final Pattern f20869b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f20870c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* renamed from: a */
    public static boolean m25020a(String str) {
        return f20868a.matcher(str).matches();
    }

    /* renamed from: b */
    public static boolean m25021b(String str) {
        return f20869b.matcher(str).matches();
    }

    /* renamed from: c */
    public static boolean m25022c(String str) {
        return f20870c.matcher(str).matches();
    }

    /* renamed from: d */
    public static boolean m25023d(String str) {
        return m25021b(str) || m25022c(str);
    }
}
