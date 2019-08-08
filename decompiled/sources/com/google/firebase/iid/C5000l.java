package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.firebase.iid.l */
final class C5000l {

    /* renamed from: a */
    private final Messenger f16250a;

    /* renamed from: b */
    private final zzl f16251b;

    C5000l(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f16250a = new Messenger(iBinder);
            this.f16251b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f16251b = new zzl(iBinder);
            this.f16250a = null;
        } else {
            String str = "MessengerIpcClient";
            String str2 = "Invalid interface descriptor: ";
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17956a(Message message) throws RemoteException {
        if (this.f16250a != null) {
            this.f16250a.send(message);
        } else if (this.f16251b != null) {
            this.f16251b.mo17983a(message);
        } else {
            throw new IllegalStateException("Both messengers are null");
        }
    }
}
