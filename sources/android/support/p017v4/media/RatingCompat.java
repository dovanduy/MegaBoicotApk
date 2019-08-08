package android.support.p017v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new Creator<RatingCompat>() {
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: a */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };

    /* renamed from: a */
    private final int f1218a;

    /* renamed from: b */
    private final float f1219b;

    RatingCompat(int i, float f) {
        this.f1218a = i;
        this.f1219b = f;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f1218a);
        sb.append(" rating=");
        if (this.f1219b < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(this.f1219b);
        }
        sb.append(str);
        return sb.toString();
    }

    public int describeContents() {
        return this.f1218a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1218a);
        parcel.writeFloat(this.f1219b);
    }
}
