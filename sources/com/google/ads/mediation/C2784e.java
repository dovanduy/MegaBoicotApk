package com.google.ads.mediation;

import com.google.android.gms.internal.ads.C3987mk;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
/* renamed from: com.google.ads.mediation.e */
public class C2784e {

    /* renamed from: com.google.ads.mediation.e$a */
    public static final class C2785a extends Exception {
        public C2785a(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.google.ads.mediation.e$b */
    public @interface C2786b {
        /* renamed from: a */
        String mo9669a();

        /* renamed from: b */
        boolean mo9670b() default true;
    }

    /* renamed from: a */
    public void mo9668a(Map<String, String> map) throws C2785a {
        Field[] fields;
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C2786b bVar = (C2786b) field.getAnnotation(C2786b.class);
            if (bVar != null) {
                hashMap.put(bVar.mo9669a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            C3987mk.m17435e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException unused) {
                    String str2 = (String) entry.getKey();
                    sb = new StringBuilder(49 + String.valueOf(str2).length());
                    sb.append("Server option \"");
                    sb.append(str2);
                    str = "\" could not be set: Illegal Access";
                } catch (IllegalArgumentException unused2) {
                    String str3 = (String) entry.getKey();
                    sb = new StringBuilder(43 + String.valueOf(str3).length());
                    sb.append("Server option \"");
                    sb.append(str3);
                    str = "\" could not be set: Bad Type";
                }
            } else {
                String str4 = (String) entry.getKey();
                String str5 = (String) entry.getValue();
                StringBuilder sb2 = new StringBuilder(31 + String.valueOf(str4).length() + String.valueOf(str5).length());
                sb2.append("Unexpected server option: ");
                sb2.append(str4);
                sb2.append(" = \"");
                sb2.append(str5);
                sb2.append("\"");
                C3987mk.m17429b(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((C2786b) field3.getAnnotation(C2786b.class)).mo9670b()) {
                String str6 = "Required server option missing: ";
                String valueOf = String.valueOf(((C2786b) field3.getAnnotation(C2786b.class)).mo9669a());
                C3987mk.m17435e(valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6));
                if (sb3.length() > 0) {
                    sb3.append(", ");
                }
                sb3.append(((C2786b) field3.getAnnotation(C2786b.class)).mo9669a());
            }
        }
        if (sb3.length() > 0) {
            String str7 = "Required server option(s) missing: ";
            String valueOf2 = String.valueOf(sb3.toString());
            throw new C2785a(valueOf2.length() != 0 ? str7.concat(valueOf2) : new String(str7));
        }
        return;
        sb.append(str);
        C3987mk.m17435e(sb.toString());
    }
}
