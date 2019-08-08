package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.C2740a;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends C2740a> implements ShareModel {

    /* renamed from: a */
    private final Bundle f8482a;

    /* renamed from: com.facebook.share.model.ShareOpenGraphValueContainer$a */
    public static abstract class C2740a<P extends ShareOpenGraphValueContainer, E extends C2740a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f8483a = new Bundle();

        /* renamed from: a */
        public E mo9540a(String str, String str2) {
            this.f8483a.putString(str, str2);
            return this;
        }

        /* renamed from: a */
        public E mo9524a(P p) {
            if (p != null) {
                this.f8483a.putAll(p.mo9535b());
            }
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    protected ShareOpenGraphValueContainer(C2740a<P, E> aVar) {
        this.f8482a = (Bundle) aVar.f8483a.clone();
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.f8482a = parcel.readBundle(C2740a.class.getClassLoader());
    }

    /* renamed from: a */
    public Object mo9534a(String str) {
        return this.f8482a.get(str);
    }

    /* renamed from: b */
    public String mo9536b(String str) {
        return this.f8482a.getString(str);
    }

    /* renamed from: b */
    public Bundle mo9535b() {
        return (Bundle) this.f8482a.clone();
    }

    /* renamed from: c */
    public Set<String> mo9537c() {
        return this.f8482a.keySet();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f8482a);
    }
}
