package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.internal.C3513t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.cd */
public class C3338cd extends C3341cf {

    /* renamed from: e */
    private final SparseArray<C3339a> f9661e = new SparseArray<>();

    /* renamed from: com.google.android.gms.common.api.internal.cd$a */
    private class C3339a implements C3269c {

        /* renamed from: a */
        public final int f9662a;

        /* renamed from: b */
        public final C3266f f9663b;

        /* renamed from: c */
        public final C3269c f9664c;

        public C3339a(int i, C3266f fVar, C3269c cVar) {
            this.f9662a = i;
            this.f9663b = fVar;
            this.f9664c = cVar;
            fVar.mo13130a((C3269c) this);
        }

        public final void onConnectionFailed(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(27 + String.valueOf(valueOf).length());
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            Log.d("AutoManageHelper", sb.toString());
            C3338cd.this.mo13282b(connectionResult, this.f9662a);
        }
    }

    /* renamed from: b */
    public static C3338cd m11904b(C3367g gVar) {
        C3368h a = m11706a(gVar);
        C3338cd cdVar = (C3338cd) a.mo13296a("AutoManageHelper", C3338cd.class);
        if (cdVar != null) {
            return cdVar;
        }
        return new C3338cd(a);
    }

    private C3338cd(C3368h hVar) {
        super(hVar);
        this.f9525a.mo13297a("AutoManageHelper", (LifecycleCallback) this);
    }

    /* renamed from: a */
    public final void mo13276a(int i, C3266f fVar, C3269c cVar) {
        C3513t.m12626a(fVar, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.f9661e.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        C3513t.m12632a(z, (Object) sb.toString());
        C3342cg cgVar = (C3342cg) this.f9672c.get();
        boolean z2 = this.f9671b;
        String valueOf = String.valueOf(cgVar);
        StringBuilder sb2 = new StringBuilder(49 + String.valueOf(valueOf).length());
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        this.f9661e.put(i, new C3339a(i, fVar, cVar));
        if (this.f9671b && cgVar == null) {
            String valueOf2 = String.valueOf(fVar);
            StringBuilder sb3 = new StringBuilder(11 + String.valueOf(valueOf2).length());
            sb3.append("connecting ");
            sb3.append(valueOf2);
            Log.d("AutoManageHelper", sb3.toString());
            fVar.mo13140e();
        }
    }

    /* renamed from: a */
    public final void mo13275a(int i) {
        C3339a aVar = (C3339a) this.f9661e.get(i);
        this.f9661e.remove(i);
        if (aVar != null) {
            aVar.f9663b.mo13136b((C3269c) aVar);
            aVar.f9663b.mo13142g();
        }
    }

    /* renamed from: b */
    public void mo13174b() {
        super.mo13174b();
        boolean z = this.f9671b;
        String valueOf = String.valueOf(this.f9661e);
        StringBuilder sb = new StringBuilder(14 + String.valueOf(valueOf).length());
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f9672c.get() == null) {
            for (int i = 0; i < this.f9661e.size(); i++) {
                C3339a b = m11903b(i);
                if (b != null) {
                    b.f9663b.mo13140e();
                }
            }
        }
    }

    /* renamed from: d */
    public void mo13177d() {
        super.mo13177d();
        for (int i = 0; i < this.f9661e.size(); i++) {
            C3339a b = m11903b(i);
            if (b != null) {
                b.f9663b.mo13142g();
            }
        }
    }

    /* renamed from: a */
    public void mo13173a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f9661e.size(); i++) {
            C3339a b = m11903b(i);
            if (b != null) {
                printWriter.append(str).append("GoogleApiClient #").print(b.f9662a);
                printWriter.println(":");
                b.f9663b.mo13132a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13277a(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C3339a aVar = (C3339a) this.f9661e.get(i);
        if (aVar != null) {
            mo13275a(i);
            C3269c cVar = aVar.f9664c;
            if (cVar != null) {
                cVar.onConnectionFailed(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo13278f() {
        for (int i = 0; i < this.f9661e.size(); i++) {
            C3339a b = m11903b(i);
            if (b != null) {
                b.f9663b.mo13140e();
            }
        }
    }

    /* renamed from: b */
    private final C3339a m11903b(int i) {
        if (this.f9661e.size() <= i) {
            return null;
        }
        return (C3339a) this.f9661e.get(this.f9661e.keyAt(i));
    }
}
