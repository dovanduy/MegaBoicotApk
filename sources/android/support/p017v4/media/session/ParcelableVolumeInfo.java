package android.support.p017v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new Creator<ParcelableVolumeInfo>() {
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: a */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    };

    /* renamed from: a */
    public int f1273a;

    /* renamed from: b */
    public int f1274b;

    /* renamed from: c */
    public int f1275c;

    /* renamed from: d */
    public int f1276d;

    /* renamed from: e */
    public int f1277e;

    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1273a = parcel.readInt();
        this.f1275c = parcel.readInt();
        this.f1276d = parcel.readInt();
        this.f1277e = parcel.readInt();
        this.f1274b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1273a);
        parcel.writeInt(this.f1275c);
        parcel.writeInt(this.f1276d);
        parcel.writeInt(this.f1277e);
        parcel.writeInt(this.f1274b);
    }
}
