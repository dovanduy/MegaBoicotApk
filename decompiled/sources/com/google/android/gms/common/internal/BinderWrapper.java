package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Creator<BinderWrapper> CREATOR = new C3450ak();

    /* renamed from: a */
    private IBinder f9920a;

    public BinderWrapper() {
        this.f9920a = null;
    }

    public final int describeContents() {
        return 0;
    }

    private BinderWrapper(Parcel parcel) {
        this.f9920a = null;
        this.f9920a = parcel.readStrongBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f9920a);
    }

    /* synthetic */ BinderWrapper(Parcel parcel, C3450ak akVar) {
        this(parcel);
    }
}
