package org.apache.p199a.p218f.p222d;

import java.lang.ref.SoftReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: org.apache.a.f.d.q */
/* compiled from: DateUtils */
public final class C6464q {

    /* renamed from: a */
    public static final TimeZone f21128a = TimeZone.getTimeZone("GMT");

    /* renamed from: b */
    private static final String[] f21129b = {"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE, dd MMM yyyy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* renamed from: c */
    private static final Date f21130c;

    /* renamed from: org.apache.a.f.d.q$a */
    /* compiled from: DateUtils */
    static final class C6465a {

        /* renamed from: a */
        private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> f21131a = new ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>>() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public SoftReference<Map<String, SimpleDateFormat>> initialValue() {
                return new SoftReference<>(new HashMap());
            }
        };

        /* renamed from: a */
        public static SimpleDateFormat m25617a(String str) {
            Map map = (Map) ((SoftReference) f21131a.get()).get();
            if (map == null) {
                map = new HashMap();
                f21131a.set(new SoftReference(map));
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str);
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put(str, simpleDateFormat2);
            return simpleDateFormat2;
        }
    }

    static {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(f21128a);
        instance.set(2000, 0, 1, 0, 0, 0);
        instance.set(14, 0);
        f21130c = instance.getTime();
    }

    /* renamed from: a */
    public static Date m25615a(String str, String[] strArr) throws C6463p {
        return m25616a(str, strArr, null);
    }

    /* renamed from: a */
    public static Date m25616a(String str, String[] strArr, Date date) throws C6463p {
        if (str == null) {
            throw new IllegalArgumentException("dateValue is null");
        }
        if (strArr == null) {
            strArr = f21129b;
        }
        if (date == null) {
            date = f21130c;
        }
        if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1);
        }
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            SimpleDateFormat a = C6465a.m25617a(strArr[i]);
            a.set2DigitYearStart(date);
            try {
                return a.parse(str);
            } catch (ParseException unused) {
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to parse the date ");
        sb.append(str);
        throw new C6463p(sb.toString());
    }
}
