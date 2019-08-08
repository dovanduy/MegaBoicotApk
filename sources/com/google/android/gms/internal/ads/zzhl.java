package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.List;

@C3718cm
public final class zzhl extends AbstractSafeParcelable {
    public static final Creator<zzhl> CREATOR = new amd();

    /* renamed from: a */
    public final String f14517a;

    /* renamed from: b */
    private final long f14518b;

    /* renamed from: c */
    private final String f14519c;

    /* renamed from: d */
    private final String f14520d;

    /* renamed from: e */
    private final String f14521e;

    /* renamed from: f */
    private final Bundle f14522f;

    /* renamed from: g */
    private final boolean f14523g;

    /* renamed from: h */
    private long f14524h;

    zzhl(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.f14517a = str;
        this.f14518b = j;
        if (str2 == null) {
            str2 = "";
        }
        this.f14519c = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f14520d = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.f14521e = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f14522f = bundle;
        this.f14523g = z;
        this.f14524h = j2;
    }

    /* renamed from: a */
    public static zzhl m18798a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                C3900je.m17435e(sb.toString());
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : C3025aw.m10919g().mo15539a(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            zzhl zzhl = new zzhl(queryParameter, parseLong, host, str, str2, bundle, equals, 0);
            return zzhl;
        } catch (NullPointerException | NumberFormatException e) {
            C3900je.m17432c("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static zzhl m18799a(String str) {
        return m18798a(Uri.parse(str));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f14517a, false);
        C3511b.m12600a(parcel, 3, this.f14518b);
        C3511b.m12609a(parcel, 4, this.f14519c, false);
        C3511b.m12609a(parcel, 5, this.f14520d, false);
        C3511b.m12609a(parcel, 6, this.f14521e, false);
        C3511b.m12601a(parcel, 7, this.f14522f, false);
        C3511b.m12612a(parcel, 8, this.f14523g);
        C3511b.m12600a(parcel, 9, this.f14524h);
        C3511b.m12596a(parcel, a);
    }
}
