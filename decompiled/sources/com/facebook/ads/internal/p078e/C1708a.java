package com.facebook.ads.internal.p078e;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.ads.internal.p075c.C1688c;
import com.facebook.ads.internal.p075c.p076a.C1684c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.facebook.ads.internal.e.a */
public class C1708a implements C1684c {

    /* renamed from: a */
    private static final String f5351a = "a";

    /* renamed from: b */
    private static C1708a f5352b;

    /* renamed from: c */
    private final LinkedHashMap<String, C1709a> f5353c = new LinkedHashMap<>();

    /* renamed from: com.facebook.ads.internal.e.a$a */
    public static class C1709a {

        /* renamed from: a */
        public final String f5354a;

        /* renamed from: b */
        public final Messenger f5355b;

        /* renamed from: c */
        public C1688c f5356c;

        C1709a(String str, Messenger messenger) {
            this.f5354a = str;
            this.f5355b = messenger;
        }
    }

    private C1708a() {
    }

    /* renamed from: a */
    public static C1708a m7114a() {
        if (f5352b == null) {
            f5352b = new C1708a();
        }
        return f5352b;
    }

    /* renamed from: f */
    private static void m7115f(String str) {
        Log.d(f5351a, str);
    }

    /* renamed from: a */
    public C1688c mo7459a(String str) {
        C1709a aVar = (C1709a) this.f5353c.get(str);
        if (aVar != null) {
            return aVar.f5356c;
        }
        return null;
    }

    /* renamed from: a */
    public void mo7460a(int i, String str) {
        mo7395a(i, str, null);
    }

    /* renamed from: a */
    public void mo7395a(int i, String str, Bundle bundle) {
        C1709a e = mo7466e(str);
        if (e != null) {
            try {
                Message obtain = Message.obtain(null, i);
                obtain.getData().putString("STR_AD_ID_KEY", str);
                if (bundle != null) {
                    obtain.getData().putBundle("BUNDLE_EXTRAS_KEY", bundle);
                }
                e.f5355b.send(obtain);
            } catch (RemoteException unused) {
                mo7463b(str);
            }
        }
        for (Entry value : this.f5353c.entrySet()) {
            C1709a aVar = (C1709a) value.getValue();
            try {
                aVar.f5355b.send(Message.obtain(null, 3));
            } catch (RemoteException unused2) {
                mo7463b(aVar.f5354a);
            }
        }
    }

    /* renamed from: a */
    public void mo7461a(String str, Messenger messenger) {
        this.f5353c.put(str, new C1709a(str, messenger));
    }

    /* renamed from: b */
    public void mo7462b() {
        Iterator it = this.f5353c.entrySet().iterator();
        while (it.hasNext()) {
            C1688c cVar = ((C1709a) ((Entry) it.next()).getValue()).f5356c;
            if (cVar != null) {
                cVar.mo7406a();
            }
            it.remove();
        }
    }

    /* renamed from: b */
    public void mo7463b(String str) {
        C1709a aVar = (C1709a) this.f5353c.get(str);
        if (aVar != null && aVar.f5356c != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Destroyed Ad ");
            sb.append(str);
            m7115f(sb.toString());
            aVar.f5356c.mo7406a();
            this.f5353c.remove(str);
        }
    }

    /* renamed from: c */
    public void mo7464c(String str) {
        if (((C1709a) this.f5353c.get(str)) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed Ad ");
            sb.append(str);
            m7115f(sb.toString());
            this.f5353c.remove(str);
        }
    }

    /* renamed from: d */
    public void mo7465d(String str) {
        this.f5353c.remove(str);
    }

    /* renamed from: e */
    public C1709a mo7466e(String str) {
        return (C1709a) this.f5353c.get(str);
    }
}
