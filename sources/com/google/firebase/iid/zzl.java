package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;

public class zzl implements Parcelable {
    public static final Creator<zzl> CREATOR = new C4976an();

    /* renamed from: a */
    private Messenger f16291a;

    /* renamed from: b */
    private C4985aw f16292b;

    /* renamed from: com.google.firebase.iid.zzl$a */
    public static final class C5015a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (FirebaseInstanceId.m21585g()) {
                Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            }
            return zzl.class;
        }
    }

    public zzl(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f16291a = new Messenger(iBinder);
        } else {
            this.f16292b = new C4986ax(iBinder);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final void mo17983a(Message message) throws RemoteException {
        if (this.f16291a != null) {
            this.f16291a.send(message);
        } else {
            this.f16292b.mo17935a(message);
        }
    }

    /* renamed from: a */
    private final IBinder m21761a() {
        return this.f16291a != null ? this.f16291a.getBinder() : this.f16292b.asBinder();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m21761a().equals(((zzl) obj).m21761a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m21761a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f16291a != null) {
            parcel.writeStrongBinder(this.f16291a.getBinder());
        } else {
            parcel.writeStrongBinder(this.f16292b.asBinder());
        }
    }
}
