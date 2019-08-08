package com.facebook.ads.internal.p075c;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.p075c.C1679a.C1681a;
import com.facebook.ads.internal.p075c.p076a.C1684c;
import com.facebook.ads.internal.p087n.C1767a;
import com.facebook.ads.internal.p087n.C1770c;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p119d.C2353a;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.UUID;

/* renamed from: com.facebook.ads.internal.c.b */
public abstract class C1686b implements C1684c {

    /* renamed from: a */
    final Context f5269a;

    /* renamed from: b */
    final C1699h f5270b;

    /* renamed from: c */
    final String f5271c = UUID.randomUUID().toString();

    /* renamed from: d */
    final C1679a f5272d;

    /* renamed from: e */
    private final Handler f5273e;

    C1686b(Context context) {
        this.f5269a = context;
        C1767a.m7338b(this.f5269a);
        this.f5272d = new C1679a(context, this);
        this.f5270b = new C1699h(context, this);
        this.f5273e = new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Message mo7396a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7397a(int i, Bundle bundle) {
        try {
            Messenger messenger = this.f5270b.f5304a;
            if (messenger != null) {
                this.f5270b.mo7425a(messenger, i, bundle);
            }
        } catch (RemoteException unused) {
            this.f5270b.mo7427b();
            this.f5270b.mo7426a("Error during sending command!");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7398a(int i, AdErrorType adErrorType, String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("STR_ERROR_MESSAGE_KEY", str);
        } else {
            bundle.putString("STR_ERROR_MESSAGE_KEY", adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt("INT_ERROR_CODE_KEY", adErrorType.getErrorCode());
        mo7395a(i, this.f5271c, bundle);
    }

    /* renamed from: a */
    public void mo7395a(int i, String str, Bundle bundle) {
        final Message obtain = Message.obtain(null, i);
        obtain.getData().putString("STR_AD_ID_KEY", str);
        if (bundle != null) {
            obtain.getData().putBundle("BUNDLE_EXTRAS_KEY", bundle);
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f5273e.post(new Runnable() {
                public void run() {
                    C1686b.this.mo7399a(obtain);
                }
            });
        } else {
            mo7399a(obtain);
        }
    }

    /* renamed from: a */
    public abstract void mo7399a(Message message);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7400a(Context context) {
        if (AdInternalSettings.f5732b) {
            return true;
        }
        if (AdInternalSettings.f5733c) {
            C2370a.m9146a(this.f5269a, "ipc", C2373b.f7499ag, new Exception("Multiprocess support is off"));
            return false;
        } else if (!C1795a.m7428V(context)) {
            return false;
        } else {
            int i = AdInternalSettings.f5735e;
            AdInternalSettings.f5735e = i + 1;
            if (i <= 0 && C1795a.m7429W(context)) {
                return false;
            }
            if (!C2353a.m9109a(this.f5269a)) {
                int i2 = AdInternalSettings.f5736f;
                AdInternalSettings.f5736f = i2 + 1;
                if (i2 > 0) {
                    if (AdInternalSettings.f5736f == 3) {
                        C2370a.m9146a(this.f5269a, "ipc", C2373b.f7498af, new Exception("Marker file not created after 3 requests."));
                    }
                    return false;
                }
            }
            return C1770c.m7346b(this.f5269a);
        }
    }

    /* renamed from: b */
    public void mo7401b() {
        try {
            if (this.f5270b.f5304a != null) {
                this.f5270b.f5304a.send(mo7396a());
            }
        } catch (RemoteException unused) {
            this.f5270b.mo7427b();
            mo7402c();
            this.f5270b.mo7426a("Error during sending load command!");
        }
    }

    /* renamed from: c */
    public abstract void mo7402c();

    /* renamed from: d */
    public abstract void mo7403d();

    /* renamed from: e */
    public void mo7404e() {
        if (C1795a.m7432Z(this.f5269a) && this.f5272d.f5252a != C1681a.DESTROYED) {
            C2370a.m9146a(this.f5269a, "api", C2373b.f7517s, new Exception("Destroy was not called."));
            Log.e(AudienceNetworkAds.TAG, "You didn't call destroy() for Ad Object. This may lead to leaking memory. Please, always call destroy() when you don't need this Ad Object any more.");
            mo7403d();
        }
    }
}
