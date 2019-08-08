package android.support.p017v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.BackStackState */
/* compiled from: BackStackRecord */
final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new Creator<BackStackState>() {
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: a */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    };

    /* renamed from: a */
    final int[] f314a;

    /* renamed from: b */
    final int f315b;

    /* renamed from: c */
    final int f316c;

    /* renamed from: d */
    final String f317d;

    /* renamed from: e */
    final int f318e;

    /* renamed from: f */
    final int f319f;

    /* renamed from: g */
    final CharSequence f320g;

    /* renamed from: h */
    final int f321h;

    /* renamed from: i */
    final CharSequence f322i;

    /* renamed from: j */
    final ArrayList<String> f323j;

    /* renamed from: k */
    final ArrayList<String> f324k;

    /* renamed from: l */
    final boolean f325l;

    public int describeContents() {
        return 0;
    }

    public BackStackState(C0246c cVar) {
        int size = cVar.f487b.size();
        this.f314a = new int[(size * 6)];
        if (!cVar.f494i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C0247a aVar = (C0247a) cVar.f487b.get(i);
            int i3 = i2 + 1;
            this.f314a[i2] = aVar.f507a;
            int i4 = i3 + 1;
            this.f314a[i3] = aVar.f508b != null ? aVar.f508b.f364o : -1;
            int i5 = i4 + 1;
            this.f314a[i4] = aVar.f509c;
            int i6 = i5 + 1;
            this.f314a[i5] = aVar.f510d;
            int i7 = i6 + 1;
            this.f314a[i6] = aVar.f511e;
            int i8 = i7 + 1;
            this.f314a[i7] = aVar.f512f;
            i++;
            i2 = i8;
        }
        this.f315b = cVar.f492g;
        this.f316c = cVar.f493h;
        this.f317d = cVar.f496k;
        this.f318e = cVar.f498m;
        this.f319f = cVar.f499n;
        this.f320g = cVar.f500o;
        this.f321h = cVar.f501p;
        this.f322i = cVar.f502q;
        this.f323j = cVar.f503r;
        this.f324k = cVar.f504s;
        this.f325l = cVar.f505t;
    }

    public BackStackState(Parcel parcel) {
        this.f314a = parcel.createIntArray();
        this.f315b = parcel.readInt();
        this.f316c = parcel.readInt();
        this.f317d = parcel.readString();
        this.f318e = parcel.readInt();
        this.f319f = parcel.readInt();
        this.f320g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f321h = parcel.readInt();
        this.f322i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f323j = parcel.createStringArrayList();
        this.f324k = parcel.createStringArrayList();
        this.f325l = parcel.readInt() != 0;
    }

    /* renamed from: a */
    public C0246c mo515a(C0257j jVar) {
        C0246c cVar = new C0246c(jVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f314a.length) {
            C0247a aVar = new C0247a();
            int i3 = i + 1;
            aVar.f507a = this.f314a[i];
            if (C0257j.f536a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(cVar);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f314a[i3]);
                Log.v("FragmentManager", sb.toString());
            }
            int i4 = i3 + 1;
            int i5 = this.f314a[i3];
            if (i5 >= 0) {
                aVar.f508b = (Fragment) jVar.f548f.get(i5);
            } else {
                aVar.f508b = null;
            }
            int i6 = i4 + 1;
            aVar.f509c = this.f314a[i4];
            int i7 = i6 + 1;
            aVar.f510d = this.f314a[i6];
            int i8 = i7 + 1;
            aVar.f511e = this.f314a[i7];
            int i9 = i8 + 1;
            aVar.f512f = this.f314a[i8];
            cVar.f488c = aVar.f509c;
            cVar.f489d = aVar.f510d;
            cVar.f490e = aVar.f511e;
            cVar.f491f = aVar.f512f;
            cVar.mo810a(aVar);
            i2++;
            i = i9;
        }
        cVar.f492g = this.f315b;
        cVar.f493h = this.f316c;
        cVar.f496k = this.f317d;
        cVar.f498m = this.f318e;
        cVar.f494i = true;
        cVar.f499n = this.f319f;
        cVar.f500o = this.f320g;
        cVar.f501p = this.f321h;
        cVar.f502q = this.f322i;
        cVar.f503r = this.f323j;
        cVar.f504s = this.f324k;
        cVar.f505t = this.f325l;
        cVar.mo808a(1);
        return cVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f314a);
        parcel.writeInt(this.f315b);
        parcel.writeInt(this.f316c);
        parcel.writeString(this.f317d);
        parcel.writeInt(this.f318e);
        parcel.writeInt(this.f319f);
        TextUtils.writeToParcel(this.f320g, parcel, 0);
        parcel.writeInt(this.f321h);
        TextUtils.writeToParcel(this.f322i, parcel, 0);
        parcel.writeStringList(this.f323j);
        parcel.writeStringList(this.f324k);
        parcel.writeInt(this.f325l ? 1 : 0);
    }
}
