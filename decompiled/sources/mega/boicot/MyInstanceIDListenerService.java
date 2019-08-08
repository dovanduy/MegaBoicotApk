package mega.boicot;

import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyInstanceIDListenerService extends FirebaseInstanceIdService {
    /* renamed from: a */
    public void mo17902a() {
        startService(new Intent(this, RegistrationIntentService.class));
    }
}
