package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p017v4.p023d.C0376a;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;

public class zzo extends zzaz {
    public static final Creator<zzo> CREATOR = new C3176b();

    /* renamed from: a */
    private static final C0376a<String, Field<?, ?>> f9261a;

    /* renamed from: b */
    private final int f9262b;

    /* renamed from: c */
    private List<String> f9263c;

    /* renamed from: d */
    private List<String> f9264d;

    /* renamed from: e */
    private List<String> f9265e;

    /* renamed from: f */
    private List<String> f9266f;

    /* renamed from: g */
    private List<String> f9267g;

    public zzo() {
        this.f9262b = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12887a(Field field) {
        return true;
    }

    zzo(int i, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.f9262b = i;
        this.f9263c = list;
        this.f9264d = list2;
        this.f9265e = list3;
        this.f9266f = list4;
        this.f9267g = list5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9262b);
        C3511b.m12619b(parcel, 2, this.f9263c, false);
        C3511b.m12619b(parcel, 3, this.f9264d, false);
        C3511b.m12619b(parcel, 4, this.f9265e, false);
        C3511b.m12619b(parcel, 5, this.f9266f, false);
        C3511b.m12619b(parcel, 6, this.f9267g, false);
        C3511b.m12596a(parcel, a);
    }

    /* renamed from: a */
    public Map<String, Field<?, ?>> mo12886a() {
        return f9261a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo12888b(Field field) {
        switch (field.mo13651a()) {
            case 1:
                return Integer.valueOf(this.f9262b);
            case 2:
                return this.f9263c;
            case 3:
                return this.f9264d;
            case 4:
                return this.f9265e;
            case 5:
                return this.f9266f;
            case 6:
                return this.f9267g;
            default:
                int a = field.mo13651a();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
        }
    }

    static {
        C0376a<String, Field<?, ?>> aVar = new C0376a<>();
        f9261a = aVar;
        aVar.put("registered", Field.m12681c("registered", 2));
        f9261a.put("in_progress", Field.m12681c("in_progress", 3));
        f9261a.put("success", Field.m12681c("success", 4));
        f9261a.put("failed", Field.m12681c("failed", 5));
        f9261a.put("escrowed", Field.m12681c("escrowed", 6));
    }
}
