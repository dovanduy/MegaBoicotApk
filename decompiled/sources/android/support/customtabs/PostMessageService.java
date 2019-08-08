package android.support.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0176i.C0177a;

public class PostMessageService extends Service {

    /* renamed from: a */
    private C0177a f211a = new C0177a() {
        /* renamed from: a */
        public void mo331a(C0170g gVar, Bundle bundle) throws RemoteException {
            gVar.mo342a(bundle);
        }

        /* renamed from: a */
        public void mo332a(C0170g gVar, String str, Bundle bundle) throws RemoteException {
            gVar.mo344b(str, bundle);
        }
    };

    public IBinder onBind(Intent intent) {
        return this.f211a;
    }
}
