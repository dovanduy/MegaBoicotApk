package android.support.p017v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.FragmentManagerState */
/* compiled from: FragmentManager */
final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR = new Creator<FragmentManagerState>() {
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: a */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    };

    /* renamed from: a */
    FragmentState[] f415a;

    /* renamed from: b */
    int[] f416b;

    /* renamed from: c */
    BackStackState[] f417c;

    /* renamed from: d */
    int f418d = -1;

    /* renamed from: e */
    int f419e;

    public int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.f415a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f416b = parcel.createIntArray();
        this.f417c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f418d = parcel.readInt();
        this.f419e = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f415a, i);
        parcel.writeIntArray(this.f416b);
        parcel.writeTypedArray(this.f417c, i);
        parcel.writeInt(this.f418d);
        parcel.writeInt(this.f419e);
    }
}
