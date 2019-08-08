package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import com.google.android.gms.common.internal.safeparcel.C3509a.C3510a;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.util.C3550b;
import com.google.android.gms.common.util.C3551c;
import com.google.android.gms.common.util.C3560l;
import com.google.android.gms.common.util.C3561m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Creator<SafeParcelResponse> CREATOR = new C3540e();

    /* renamed from: a */
    private final int f10126a;

    /* renamed from: b */
    private final Parcel f10127b;

    /* renamed from: c */
    private final int f10128c = 2;

    /* renamed from: d */
    private final zak f10129d;

    /* renamed from: e */
    private final String f10130e;

    /* renamed from: f */
    private int f10131f;

    /* renamed from: g */
    private int f10132g;

    SafeParcelResponse(int i, Parcel parcel, zak zak) {
        this.f10126a = i;
        this.f10127b = (Parcel) C3513t.m12625a(parcel);
        this.f10129d = zak;
        if (this.f10129d == null) {
            this.f10130e = null;
        } else {
            this.f10130e = this.f10129d.mo13674b();
        }
        this.f10131f = 2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zak zak;
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f10126a);
        C3511b.m12603a(parcel, 2, m12696b(), false);
        switch (this.f10128c) {
            case 0:
                zak = null;
                break;
            case 1:
                zak = this.f10129d;
                break;
            case 2:
                zak = this.f10129d;
                break;
            default:
                int i2 = this.f10128c;
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid creation type: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
        C3511b.m12604a(parcel, 3, (Parcelable) zak, i, false);
        C3511b.m12596a(parcel, a);
    }

    /* renamed from: b */
    private final Parcel m12696b() {
        switch (this.f10131f) {
            case 0:
                this.f10132g = C3511b.m12595a(this.f10127b);
                break;
            case 1:
                break;
        }
        C3511b.m12596a(this.f10127b, this.f10132g);
        this.f10131f = 2;
        return this.f10127b;
    }

    /* renamed from: a */
    public Map<String, Field<?, ?>> mo12886a() {
        if (this.f10129d == null) {
            return null;
        }
        return this.f10129d.mo13672a(this.f10130e);
    }

    /* renamed from: a */
    public Object mo13648a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: b */
    public boolean mo13649b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public String toString() {
        C3513t.m12626a(this.f10129d, (Object) "Cannot convert to JSON on client side.");
        Parcel b = m12696b();
        b.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m12695a(sb, this.f10129d.mo13672a(this.f10130e), b);
        return sb.toString();
    }

    /* renamed from: a */
    private final void m12695a(StringBuilder sb, Map<String, Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Entry entry : map.entrySet()) {
            sparseArray.put(((Field) entry.getValue()).mo13651a(), entry);
        }
        sb.append('{');
        int b = C3509a.m12567b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            Entry entry2 = (Entry) sparseArray.get(C3509a.m12561a(a));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                Field field = (Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.mo13654b()) {
                    switch (field.f10117c) {
                        case 0:
                            m12694a(sb, field, m12669a(field, Integer.valueOf(C3509a.m12573e(parcel, a))));
                            break;
                        case 1:
                            m12694a(sb, field, m12669a(field, C3509a.m12577i(parcel, a)));
                            break;
                        case 2:
                            m12694a(sb, field, m12669a(field, Long.valueOf(C3509a.m12575g(parcel, a))));
                            break;
                        case 3:
                            m12694a(sb, field, m12669a(field, Float.valueOf(C3509a.m12578j(parcel, a))));
                            break;
                        case 4:
                            m12694a(sb, field, m12669a(field, Double.valueOf(C3509a.m12580l(parcel, a))));
                            break;
                        case 5:
                            m12694a(sb, field, m12669a(field, C3509a.m12582n(parcel, a)));
                            break;
                        case 6:
                            m12694a(sb, field, m12669a(field, Boolean.valueOf(C3509a.m12571c(parcel, a))));
                            break;
                        case 7:
                            m12694a(sb, field, m12669a(field, C3509a.m12583o(parcel, a)));
                            break;
                        case 8:
                        case 9:
                            m12694a(sb, field, m12669a(field, C3509a.m12586r(parcel, a)));
                            break;
                        case 10:
                            Bundle q = C3509a.m12585q(parcel, a);
                            HashMap hashMap = new HashMap();
                            for (String str2 : q.keySet()) {
                                hashMap.put(str2, q.getString(str2));
                            }
                            m12694a(sb, field, m12669a(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = field.f10117c;
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f10118d) {
                    sb.append("[");
                    switch (field.f10117c) {
                        case 0:
                            C3550b.m12719a(sb, C3509a.m12588t(parcel, a));
                            break;
                        case 1:
                            C3550b.m12721a(sb, (T[]) C3509a.m12590v(parcel, a));
                            break;
                        case 2:
                            C3550b.m12720a(sb, C3509a.m12589u(parcel, a));
                            break;
                        case 3:
                            C3550b.m12718a(sb, C3509a.m12591w(parcel, a));
                            break;
                        case 4:
                            C3550b.m12717a(sb, C3509a.m12592x(parcel, a));
                            break;
                        case 5:
                            C3550b.m12721a(sb, (T[]) C3509a.m12593y(parcel, a));
                            break;
                        case 6:
                            C3550b.m12723a(sb, C3509a.m12587s(parcel, a));
                            break;
                        case 7:
                            C3550b.m12722a(sb, C3509a.m12594z(parcel, a));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] D = C3509a.m12559D(parcel, a);
                            int length = D.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                D[i2].setDataPosition(0);
                                m12695a(sb, field.mo13655c(), D[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f10117c) {
                        case 0:
                            sb.append(C3509a.m12573e(parcel, a));
                            break;
                        case 1:
                            sb.append(C3509a.m12577i(parcel, a));
                            break;
                        case 2:
                            sb.append(C3509a.m12575g(parcel, a));
                            break;
                        case 3:
                            sb.append(C3509a.m12578j(parcel, a));
                            break;
                        case 4:
                            sb.append(C3509a.m12580l(parcel, a));
                            break;
                        case 5:
                            sb.append(C3509a.m12582n(parcel, a));
                            break;
                        case 6:
                            sb.append(C3509a.m12571c(parcel, a));
                            break;
                        case 7:
                            String o = C3509a.m12583o(parcel, a);
                            sb.append("\"");
                            sb.append(C3560l.m12759a(o));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] r = C3509a.m12586r(parcel, a);
                            sb.append("\"");
                            sb.append(C3551c.m12727a(r));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] r2 = C3509a.m12586r(parcel, a);
                            sb.append("\"");
                            sb.append(C3551c.m12728b(r2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle q2 = C3509a.m12585q(parcel, a);
                            Set<String> keySet = q2.keySet();
                            keySet.size();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\"");
                                sb.append(":");
                                sb.append("\"");
                                sb.append(C3560l.m12759a(q2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel C = C3509a.m12558C(parcel, a);
                            C.setDataPosition(0);
                            m12695a(sb, field.mo13655c(), C);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != b) {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("Overread allowed size end=");
            sb3.append(b);
            throw new C3510a(sb3.toString(), parcel);
        }
        sb.append('}');
    }

    /* renamed from: a */
    private final void m12694a(StringBuilder sb, Field<?, ?> field, Object obj) {
        if (field.f10116b) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m12693a(sb, field.f10115a, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m12693a(sb, field.f10115a, obj);
    }

    /* renamed from: a */
    private static void m12693a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C3560l.m12759a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C3551c.m12727a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C3551c.m12728b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C3561m.m12760a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }
}
