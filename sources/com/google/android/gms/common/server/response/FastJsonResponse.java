package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3504r.C3505a;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.C3551c;
import com.google.android.gms.common.util.C3560l;
import com.google.android.gms.common.util.C3561m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C3536a CREATOR = new C3536a();

        /* renamed from: a */
        protected final int f10115a;

        /* renamed from: b */
        protected final boolean f10116b;

        /* renamed from: c */
        protected final int f10117c;

        /* renamed from: d */
        protected final boolean f10118d;

        /* renamed from: e */
        protected final String f10119e;

        /* renamed from: f */
        protected final int f10120f;

        /* renamed from: g */
        protected final Class<? extends FastJsonResponse> f10121g;

        /* renamed from: h */
        private final int f10122h;

        /* renamed from: i */
        private final String f10123i;

        /* renamed from: j */
        private zak f10124j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C3535a<I, O> f10125k;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaa) {
            this.f10122h = i;
            this.f10115a = i2;
            this.f10116b = z;
            this.f10117c = i3;
            this.f10118d = z2;
            this.f10119e = str;
            this.f10120f = i4;
            if (str2 == null) {
                this.f10121g = null;
                this.f10123i = null;
            } else {
                this.f10121g = SafeParcelResponse.class;
                this.f10123i = str2;
            }
            if (zaa == null) {
                this.f10125k = null;
            } else {
                this.f10125k = zaa.mo13646a();
            }
        }

        private Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, C3535a<I, O> aVar) {
            this.f10122h = 1;
            this.f10115a = i;
            this.f10116b = z;
            this.f10117c = i2;
            this.f10118d = z2;
            this.f10119e = str;
            this.f10120f = i3;
            this.f10121g = cls;
            if (cls == null) {
                this.f10123i = null;
            } else {
                this.f10123i = cls.getCanonicalName();
            }
            this.f10125k = aVar;
        }

        /* renamed from: a */
        public int mo13651a() {
            return this.f10120f;
        }

        /* renamed from: d */
        private final String m12683d() {
            if (this.f10123i == null) {
                return null;
            }
            return this.f10123i;
        }

        /* renamed from: b */
        public final boolean mo13654b() {
            return this.f10125k != null;
        }

        /* renamed from: a */
        public final void mo13653a(zak zak) {
            this.f10124j = zak;
        }

        /* renamed from: e */
        private final zaa m12684e() {
            if (this.f10125k == null) {
                return null;
            }
            return zaa.m12667a(this.f10125k);
        }

        /* renamed from: c */
        public final Map<String, Field<?, ?>> mo13655c() {
            C3513t.m12625a(this.f10123i);
            C3513t.m12625a(this.f10124j);
            return this.f10124j.mo13672a(this.f10123i);
        }

        /* renamed from: a */
        public final I mo13652a(O o) {
            return this.f10125k.mo13637a(o);
        }

        /* renamed from: a */
        public static Field<Integer, Integer> m12676a(String str, int i) {
            Field field = new Field(0, false, 0, false, str, i, null, null);
            return field;
        }

        /* renamed from: b */
        public static Field<String, String> m12679b(String str, int i) {
            Field field = new Field(7, false, 7, false, str, i, null, null);
            return field;
        }

        /* renamed from: c */
        public static Field<ArrayList<String>, ArrayList<String>> m12681c(String str, int i) {
            Field field = new Field(7, true, 7, true, str, i, null, null);
            return field;
        }

        /* renamed from: d */
        public static Field<byte[], byte[]> m12682d(String str, int i) {
            Field field = new Field(8, false, 8, false, str, i, null, null);
            return field;
        }

        /* renamed from: a */
        public static <T extends FastJsonResponse> Field<T, T> m12677a(String str, int i, Class<T> cls) {
            Field field = new Field(11, false, 11, false, str, i, cls, null);
            return field;
        }

        /* renamed from: b */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m12680b(String str, int i, Class<T> cls) {
            Field field = new Field(11, true, 11, true, str, i, cls, null);
            return field;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C3511b.m12595a(parcel);
            C3511b.m12599a(parcel, 1, this.f10122h);
            C3511b.m12599a(parcel, 2, this.f10115a);
            C3511b.m12612a(parcel, 3, this.f10116b);
            C3511b.m12599a(parcel, 4, this.f10117c);
            C3511b.m12612a(parcel, 5, this.f10118d);
            C3511b.m12609a(parcel, 6, this.f10119e, false);
            C3511b.m12599a(parcel, 7, mo13651a());
            C3511b.m12609a(parcel, 8, m12683d(), false);
            C3511b.m12604a(parcel, 9, (Parcelable) m12684e(), i, false);
            C3511b.m12596a(parcel, a);
        }

        public String toString() {
            C3505a a = C3504r.m12549a((Object) this).mo13613a("versionCode", Integer.valueOf(this.f10122h)).mo13613a("typeIn", Integer.valueOf(this.f10115a)).mo13613a("typeInArray", Boolean.valueOf(this.f10116b)).mo13613a("typeOut", Integer.valueOf(this.f10117c)).mo13613a("typeOutArray", Boolean.valueOf(this.f10118d)).mo13613a("outputFieldName", this.f10119e).mo13613a("safeParcelFieldId", Integer.valueOf(this.f10120f)).mo13613a("concreteTypeName", m12683d());
            Class<? extends FastJsonResponse> cls = this.f10121g;
            if (cls != null) {
                a.mo13613a("concreteType.class", cls.getCanonicalName());
            }
            if (this.f10125k != null) {
                a.mo13613a("converterName", this.f10125k.getClass().getCanonicalName());
            }
            return a.toString();
        }
    }

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    public interface C3535a<I, O> {
        /* renamed from: a */
        I mo13637a(O o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo13648a(String str);

    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo12886a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo13649b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12887a(Field field) {
        if (field.f10117c != 11) {
            return mo13649b(field.f10119e);
        }
        if (field.f10118d) {
            String str = field.f10119e;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        String str2 = field.f10119e;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* renamed from: a */
    protected static <O, I> I m12669a(Field<I, O> field, Object obj) {
        return field.f10125k != null ? field.mo13652a(obj) : obj;
    }

    public String toString() {
        Map a = mo12886a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a.keySet()) {
            Field field = (Field) a.get(str);
            if (mo12887a(field)) {
                Object a2 = m12669a(field, mo12888b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (a2 != null) {
                    switch (field.f10117c) {
                        case 8:
                            sb.append("\"");
                            sb.append(C3551c.m12727a((byte[]) a2));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(C3551c.m12728b((byte[]) a2));
                            sb.append("\"");
                            break;
                        case 10:
                            C3561m.m12760a(sb, (HashMap) a2);
                            break;
                        default:
                            if (!field.f10116b) {
                                m12670a(sb, field, a2);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) a2;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m12670a(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo12888b(Field field) {
        String str = field.f10119e;
        if (field.f10121g == null) {
            return mo13648a(field.f10119e);
        }
        C3513t.m12633a(mo13648a(field.f10119e) == null, "Concrete field shouldn't be value object: %s", field.f10119e);
        boolean z = field.f10118d;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(4 + String.valueOf(substring).length());
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m12670a(StringBuilder sb, Field field, Object obj) {
        if (field.f10115a == 11) {
            sb.append(((FastJsonResponse) field.f10121g.cast(obj)).toString());
        } else if (field.f10115a == 7) {
            sb.append("\"");
            sb.append(C3560l.m12759a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }
}
