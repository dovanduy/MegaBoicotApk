package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p017v4.p023d.C0378b;
import com.appnext.base.p046b.C1244c;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class zzt extends zzaz {
    public static final Creator<zzt> CREATOR = new C3178d();

    /* renamed from: a */
    private static final HashMap<String, Field<?, ?>> f9275a;

    /* renamed from: b */
    private final Set<Integer> f9276b;

    /* renamed from: c */
    private final int f9277c;

    /* renamed from: d */
    private String f9278d;

    /* renamed from: e */
    private int f9279e;

    /* renamed from: f */
    private byte[] f9280f;

    /* renamed from: g */
    private PendingIntent f9281g;

    /* renamed from: h */
    private DeviceMetaData f9282h;

    zzt(Set<Integer> set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f9276b = set;
        this.f9277c = i;
        this.f9278d = str;
        this.f9279e = i2;
        this.f9280f = bArr;
        this.f9281g = pendingIntent;
        this.f9282h = deviceMetaData;
    }

    public zzt() {
        this.f9276b = new C0378b(3);
        this.f9277c = 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        Set<Integer> set = this.f9276b;
        if (set.contains(Integer.valueOf(1))) {
            C3511b.m12599a(parcel, 1, this.f9277c);
        }
        if (set.contains(Integer.valueOf(2))) {
            C3511b.m12609a(parcel, 2, this.f9278d, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C3511b.m12599a(parcel, 3, this.f9279e);
        }
        if (set.contains(Integer.valueOf(4))) {
            C3511b.m12613a(parcel, 4, this.f9280f, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C3511b.m12604a(parcel, 5, (Parcelable) this.f9281g, i, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            C3511b.m12604a(parcel, 6, (Parcelable) this.f9282h, i, true);
        }
        C3511b.m12596a(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12887a(Field field) {
        return this.f9276b.contains(Integer.valueOf(field.mo13651a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo12888b(Field field) {
        switch (field.mo13651a()) {
            case 1:
                return Integer.valueOf(this.f9277c);
            case 2:
                return this.f9278d;
            case 3:
                return Integer.valueOf(this.f9279e);
            case 4:
                return this.f9280f;
            default:
                int a = field.mo13651a();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public /* synthetic */ Map mo12886a() {
        return f9275a;
    }

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f9275a = hashMap;
        hashMap.put("accountType", Field.m12679b("accountType", 2));
        f9275a.put(C1244c.STATUS, Field.m12676a(C1244c.STATUS, 3));
        f9275a.put("transferBytes", Field.m12682d("transferBytes", 4));
    }
}
