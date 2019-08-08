package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    /* renamed from: a */
    public Object mo13648a(String str) {
        return null;
    }

    /* renamed from: b */
    public boolean mo13649b(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = 0;
        for (Field field : mo12886a().values()) {
            if (mo12887a(field)) {
                i = (i * 31) + mo12888b(field).hashCode();
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (Field field : mo12886a().values()) {
            if (mo12887a(field)) {
                if (!fastJsonResponse.mo12887a(field) || !mo12888b(field).equals(fastJsonResponse.mo12888b(field))) {
                    return false;
                }
            } else if (fastJsonResponse.mo12887a(field)) {
                return false;
            }
        }
        return true;
    }
}
