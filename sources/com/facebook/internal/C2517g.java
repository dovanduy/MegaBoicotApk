package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p017v4.app.C0250e;
import android.support.p017v4.app.FragmentActivity;
import com.appnext.base.p046b.C1245d;
import com.facebook.C2579j;
import com.facebook.C2649m;
import com.facebook.internal.C2485af.C2490a;
import com.facebook.internal.C2485af.C2492c;

/* renamed from: com.facebook.internal.g */
/* compiled from: FacebookDialogFragment */
public class C2517g extends C0250e {

    /* renamed from: ag */
    private Dialog f7899ag;

    /* renamed from: a */
    public void mo8991a(Dialog dialog) {
        this.f7899ag = dialog;
    }

    /* renamed from: a */
    public void mo571a(Bundle bundle) {
        C2485af afVar;
        super.mo571a(bundle);
        if (this.f7899ag == null) {
            FragmentActivity m = mo626m();
            Bundle d = C2566x.m9758d(m.getIntent());
            if (!d.getBoolean("is_fallback", false)) {
                String string = d.getString(C1245d.f3959jb);
                Bundle bundle2 = d.getBundle("params");
                if (C2479ad.m9456a(string)) {
                    C2479ad.m9463b("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    m.finish();
                    return;
                }
                afVar = new C2490a(m, string, bundle2).mo8948a(new C2492c() {
                    /* renamed from: a */
                    public void mo8960a(Bundle bundle, C2579j jVar) {
                        C2517g.this.m9594a(bundle, jVar);
                    }
                }).mo8949a();
            } else {
                String string2 = d.getString("url");
                if (C2479ad.m9456a(string2)) {
                    C2479ad.m9463b("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    m.finish();
                    return;
                }
                afVar = C2525j.m9613a(m, string2, String.format("fb%s://bridge/", new Object[]{C2649m.m10137j()}));
                afVar.mo8928a((C2492c) new C2492c() {
                    /* renamed from: a */
                    public void mo8960a(Bundle bundle, C2579j jVar) {
                        C2517g.this.m9597o(bundle);
                    }
                });
            }
            this.f7899ag = afVar;
        }
    }

    /* renamed from: c */
    public Dialog mo831c(Bundle bundle) {
        if (this.f7899ag == null) {
            m9594a((Bundle) null, (C2579j) null);
            mo832c(false);
        }
        return this.f7899ag;
    }

    /* renamed from: z */
    public void mo646z() {
        super.mo646z();
        if (this.f7899ag instanceof C2485af) {
            ((C2485af) this.f7899ag).mo8936e();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f7899ag instanceof C2485af) && mo642v()) {
            ((C2485af) this.f7899ag).mo8936e();
        }
    }

    /* renamed from: h */
    public void mo613h() {
        if (mo830c() != null && mo643w()) {
            mo830c().setDismissMessage(null);
        }
        super.mo613h();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9594a(Bundle bundle, C2579j jVar) {
        FragmentActivity m = mo626m();
        m.setResult(jVar == null ? -1 : 0, C2566x.m9742a(m.getIntent(), bundle, jVar));
        m.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m9597o(Bundle bundle) {
        FragmentActivity m = mo626m();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        m.setResult(-1, intent);
        m.finish();
    }
}
