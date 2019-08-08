package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.r */
public final class C3504r {

    /* renamed from: com.google.android.gms.common.internal.r$a */
    public static final class C3505a {

        /* renamed from: a */
        private final List<String> f10077a;

        /* renamed from: b */
        private final Object f10078b;

        private C3505a(Object obj) {
            this.f10078b = C3513t.m12625a(obj);
            this.f10077a = new ArrayList();
        }

        /* renamed from: a */
        public final C3505a mo13613a(String str, Object obj) {
            List<String> list = this.f10077a;
            String str2 = (String) C3513t.m12625a(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(1 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f10078b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f10077a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f10077a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m12550a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m12548a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C3505a m12549a(Object obj) {
        return new C3505a(obj);
    }
}
