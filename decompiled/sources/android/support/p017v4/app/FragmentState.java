package android.support.p017v4.app;

import android.arch.lifecycle.C0116p;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

/* renamed from: android.support.v4.app.FragmentState */
final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR = new Creator<FragmentState>() {
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: a */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    };

    /* renamed from: a */
    final String f420a;

    /* renamed from: b */
    final int f421b;

    /* renamed from: c */
    final boolean f422c;

    /* renamed from: d */
    final int f423d;

    /* renamed from: e */
    final int f424e;

    /* renamed from: f */
    final String f425f;

    /* renamed from: g */
    final boolean f426g;

    /* renamed from: h */
    final boolean f427h;

    /* renamed from: i */
    final Bundle f428i;

    /* renamed from: j */
    final boolean f429j;

    /* renamed from: k */
    Bundle f430k;

    /* renamed from: l */
    Fragment f431l;

    public int describeContents() {
        return 0;
    }

    FragmentState(Fragment fragment) {
        this.f420a = fragment.getClass().getName();
        this.f421b = fragment.f364o;
        this.f422c = fragment.f372w;
        this.f423d = fragment.f335H;
        this.f424e = fragment.f336I;
        this.f425f = fragment.f337J;
        this.f426g = fragment.f340M;
        this.f427h = fragment.f339L;
        this.f428i = fragment.f366q;
        this.f429j = fragment.f338K;
    }

    FragmentState(Parcel parcel) {
        this.f420a = parcel.readString();
        this.f421b = parcel.readInt();
        boolean z = false;
        this.f422c = parcel.readInt() != 0;
        this.f423d = parcel.readInt();
        this.f424e = parcel.readInt();
        this.f425f = parcel.readString();
        this.f426g = parcel.readInt() != 0;
        this.f427h = parcel.readInt() != 0;
        this.f428i = parcel.readBundle();
        if (parcel.readInt() != 0) {
            z = true;
        }
        this.f429j = z;
        this.f430k = parcel.readBundle();
    }

    /* renamed from: a */
    public Fragment mo715a(C0253h hVar, C0251f fVar, Fragment fragment, C0274k kVar, C0116p pVar) {
        if (this.f431l == null) {
            Context g = hVar.mo862g();
            if (this.f428i != null) {
                this.f428i.setClassLoader(g.getClassLoader());
            }
            if (fVar != null) {
                this.f431l = fVar.mo648a(g, this.f420a, this.f428i);
            } else {
                this.f431l = Fragment.m499a(g, this.f420a, this.f428i);
            }
            if (this.f430k != null) {
                this.f430k.setClassLoader(g.getClassLoader());
                this.f431l.f361l = this.f430k;
            }
            this.f431l.mo560a(this.f421b, fragment);
            this.f431l.f372w = this.f422c;
            this.f431l.f374y = true;
            this.f431l.f335H = this.f423d;
            this.f431l.f336I = this.f424e;
            this.f431l.f337J = this.f425f;
            this.f431l.f340M = this.f426g;
            this.f431l.f339L = this.f427h;
            this.f431l.f338K = this.f429j;
            this.f431l.f329B = hVar.f528b;
            if (C0257j.f536a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiated fragment ");
                sb.append(this.f431l);
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f431l.f332E = kVar;
        this.f431l.f333F = pVar;
        return this.f431l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f420a);
        parcel.writeInt(this.f421b);
        parcel.writeInt(this.f422c ? 1 : 0);
        parcel.writeInt(this.f423d);
        parcel.writeInt(this.f424e);
        parcel.writeString(this.f425f);
        parcel.writeInt(this.f426g ? 1 : 0);
        parcel.writeInt(this.f427h ? 1 : 0);
        parcel.writeBundle(this.f428i);
        parcel.writeInt(this.f429j ? 1 : 0);
        parcel.writeBundle(this.f430k);
    }
}
