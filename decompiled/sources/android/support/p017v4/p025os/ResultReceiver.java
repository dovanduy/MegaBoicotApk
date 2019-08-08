package android.support.p017v4.p025os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.p017v4.p025os.C0537b.C0538a;

/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new Creator<ResultReceiver>() {
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: a */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    };

    /* renamed from: a */
    final boolean f1298a = false;

    /* renamed from: b */
    final Handler f1299b = null;

    /* renamed from: c */
    C0537b f1300c;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C0533a extends C0538a {
        C0533a() {
        }

        /* renamed from: a */
        public void mo1835a(int i, Bundle bundle) {
            if (ResultReceiver.this.f1299b != null) {
                ResultReceiver.this.f1299b.post(new C0534b(i, bundle));
            } else {
                ResultReceiver.this.mo1499a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0534b implements Runnable {

        /* renamed from: a */
        final int f1302a;

        /* renamed from: b */
        final Bundle f1303b;

        C0534b(int i, Bundle bundle) {
            this.f1302a = i;
            this.f1303b = bundle;
        }

        public void run() {
            ResultReceiver.this.mo1499a(this.f1302a, this.f1303b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1499a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public void mo1828b(int i, Bundle bundle) {
        if (this.f1298a) {
            if (this.f1299b != null) {
                this.f1299b.post(new C0534b(i, bundle));
            } else {
                mo1499a(i, bundle);
            }
            return;
        }
        if (this.f1300c != null) {
            try {
                this.f1300c.mo1835a(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f1300c == null) {
                this.f1300c = new C0533a();
            }
            parcel.writeStrongBinder(this.f1300c.asBinder());
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f1300c = C0538a.m2064a(parcel.readStrongBinder());
    }
}
