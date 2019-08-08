package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class zzaey extends AbstractSafeParcelable {
    public static final Creator<zzaey> CREATOR = new C3760ea();

    /* renamed from: a */
    private final Bundle f14483a;

    /* renamed from: b */
    private final zzang f14484b;

    /* renamed from: c */
    private final ApplicationInfo f14485c;

    /* renamed from: d */
    private final String f14486d;

    /* renamed from: e */
    private final List<String> f14487e;
    @Nullable

    /* renamed from: f */
    private final PackageInfo f14488f;

    /* renamed from: g */
    private final String f14489g;

    /* renamed from: h */
    private final boolean f14490h;

    /* renamed from: i */
    private final String f14491i;

    public zzaey(Bundle bundle, zzang zzang, ApplicationInfo applicationInfo, String str, List<String> list, @Nullable PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.f14483a = bundle;
        this.f14484b = zzang;
        this.f14486d = str;
        this.f14485c = applicationInfo;
        this.f14487e = list;
        this.f14488f = packageInfo;
        this.f14489g = str2;
        this.f14490h = z;
        this.f14491i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12601a(parcel, 1, this.f14483a, false);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f14484b, i, false);
        C3511b.m12604a(parcel, 3, (Parcelable) this.f14485c, i, false);
        C3511b.m12609a(parcel, 4, this.f14486d, false);
        C3511b.m12619b(parcel, 5, this.f14487e, false);
        C3511b.m12604a(parcel, 6, (Parcelable) this.f14488f, i, false);
        C3511b.m12609a(parcel, 7, this.f14489g, false);
        C3511b.m12612a(parcel, 8, this.f14490h);
        C3511b.m12609a(parcel, 9, this.f14491i, false);
        C3511b.m12596a(parcel, a);
    }
}
