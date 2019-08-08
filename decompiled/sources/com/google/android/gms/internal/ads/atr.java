package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.lang.ref.WeakReference;

final class atr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final WeakReference<C4089qe> f12215a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f12216b;

    public atr(C4089qe qeVar) {
        this.f12215a = new WeakReference<>(qeVar);
    }

    /* renamed from: a */
    public final void mo14869a(C3695bq bqVar) {
        bqVar.mo15206a("/loadHtml", (C3067ae<? super T>) new ats<Object>(this, bqVar));
        bqVar.mo15206a("/showOverlay", (C3067ae<? super T>) new atu<Object>(this, bqVar));
        bqVar.mo15206a("/hideOverlay", (C3067ae<? super T>) new atv<Object>(this, bqVar));
        C4089qe qeVar = (C4089qe) this.f12215a.get();
        if (qeVar != null) {
            qeVar.mo15880a("/sendMessageToSdk", (C3067ae<? super C4089qe>) new atw<Object>(this, bqVar));
        }
    }
}
