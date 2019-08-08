package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.p143d.C3576a;
import com.google.android.gms.p143d.C3583g;
import com.google.android.gms.p143d.C3584h;
import com.google.android.gms.p143d.C3587j;
import com.google.firebase.C4928b;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.as */
final class C4981as implements C4989b {

    /* renamed from: a */
    private final C4928b f16221a;

    /* renamed from: b */
    private final C5005q f16222b;

    /* renamed from: c */
    private final C5011w f16223c;

    /* renamed from: d */
    private final Executor f16224d;

    C4981as(C4928b bVar, C5005q qVar, Executor executor) {
        this(bVar, qVar, executor, new C5011w(bVar.mo17829a(), qVar));
    }

    /* renamed from: a */
    public final boolean mo17931a() {
        return true;
    }

    private C4981as(C4928b bVar, C5005q qVar, Executor executor, C5011w wVar) {
        this.f16221a = bVar;
        this.f16222b = qVar;
        this.f16223c = wVar;
        this.f16224d = executor;
    }

    /* renamed from: b */
    public final boolean mo17933b() {
        return this.f16222b.mo17963a() != 0;
    }

    /* renamed from: a */
    public final C3583g<Void> mo17927a(String str, String str2) {
        return C3587j.m12817a(null);
    }

    /* renamed from: a */
    public final C3583g<String> mo17929a(String str, String str2, String str3, String str4) {
        return m21649b(m21646a(str, str3, str4, new Bundle()));
    }

    /* renamed from: a */
    public final C3583g<Void> mo17928a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String str4 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString(str4, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return m21645a(m21649b(m21646a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    /* renamed from: b */
    public final C3583g<Void> mo17932b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String str4 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString(str4, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        bundle.putString("delete", "1");
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return m21645a(m21649b(m21646a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    /* renamed from: a */
    private final C3583g<Bundle> m21646a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f16221a.mo17832c().mo17842a());
        bundle.putString("gmsv", Integer.toString(this.f16222b.mo17966d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.f16222b.mo17964b());
        bundle.putString("app_ver_name", this.f16222b.mo17965c());
        bundle.putString("cliv", "fiid-12451000");
        C3584h hVar = new C3584h();
        this.f16224d.execute(new C4982at(this, bundle, hVar));
        return hVar.mo13720a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m21647a(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        } else if (string3 != null) {
            throw new IOException(string3);
        } else {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(21 + String.valueOf(valueOf).length());
            sb.append("Unexpected response: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: a */
    private final <T> C3583g<Void> m21645a(C3583g<T> gVar) {
        return gVar.mo13708a(C4973ak.m21639a(), (C3576a<TResult, TContinuationResult>) new C4983au<TResult,TContinuationResult>(this));
    }

    /* renamed from: b */
    private final C3583g<String> m21649b(C3583g<Bundle> gVar) {
        return gVar.mo13708a(this.f16224d, (C3576a<TResult, TContinuationResult>) new C4984av<TResult,TContinuationResult>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo17930a(Bundle bundle, C3584h hVar) {
        try {
            hVar.mo13722a(this.f16223c.mo17969a(bundle));
        } catch (IOException e) {
            hVar.mo13721a((Exception) e);
        }
    }
}
