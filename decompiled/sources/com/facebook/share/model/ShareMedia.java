package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public abstract class ShareMedia implements ShareModel {

    /* renamed from: a */
    private final Bundle f8447a;

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    public static abstract class C2726a<M extends ShareMedia, B extends C2726a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f8448a = new Bundle();

        @Deprecated
        /* renamed from: a */
        public B mo9485a(Bundle bundle) {
            this.f8448a.putAll(bundle);
            return this;
        }

        /* renamed from: a */
        public B mo9486a(M m) {
            return m == null ? this : mo9485a(m.mo9482a());
        }

        /* renamed from: a */
        static List<ShareMedia> m10391a(Parcel parcel) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
            ArrayList arrayList = new ArrayList(readParcelableArray.length);
            for (Parcelable parcelable : readParcelableArray) {
                arrayList.add((ShareMedia) parcelable);
            }
            return arrayList;
        }
    }

    public int describeContents() {
        return 0;
    }

    protected ShareMedia(C2726a aVar) {
        this.f8447a = new Bundle(aVar.f8448a);
    }

    ShareMedia(Parcel parcel) {
        this.f8447a = parcel.readBundle();
    }

    @Deprecated
    /* renamed from: a */
    public Bundle mo9482a() {
        return new Bundle(this.f8447a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f8447a);
    }
}
