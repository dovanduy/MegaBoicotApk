package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p017v4.p023d.C0376a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.Map;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Creator<RemoteMessage> CREATOR = new C5022f();

    /* renamed from: a */
    Bundle f16294a;

    /* renamed from: b */
    private Map<String, String> f16295b;

    public RemoteMessage(Bundle bundle) {
        this.f16294a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12601a(parcel, 2, this.f16294a, false);
        C3511b.m12596a(parcel, a);
    }

    /* renamed from: a */
    public final Map<String, String> mo17994a() {
        if (this.f16295b == null) {
            Bundle bundle = this.f16294a;
            C0376a aVar = new C0376a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            this.f16295b = aVar;
        }
        return this.f16295b;
    }
}
