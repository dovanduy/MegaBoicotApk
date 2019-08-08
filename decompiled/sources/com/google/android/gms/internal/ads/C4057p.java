package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C3606a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.p */
public final class C4057p {

    /* renamed from: a */
    private static final Object f13708a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f13709b = false;
    @GuardedBy("sLock")

    /* renamed from: c */
    private static boolean f13710c = false;

    /* renamed from: d */
    private C4161sw f13711d;

    /* renamed from: c */
    private final void m17586c(Context context) {
        synchronized (f13708a) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11967dg)).booleanValue() && !f13710c) {
                try {
                    f13710c = true;
                    this.f13711d = C4162sx.m18143a(DynamiteModule.m12874a(context, DynamiteModule.f10249a, ModuleDescriptor.MODULE_ID).mo13744a("com.google.android.gms.ads.omid.DynamiteOmid"));
                } catch (C3606a e) {
                    C3987mk.m17434d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final C3235a mo15782a(String str, WebView webView, String str2, String str3, String str4) {
        synchronized (f13708a) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11967dg)).booleanValue()) {
                if (f13709b) {
                    try {
                        return this.f13711d.mo16059a(str, C3238b.m11573a(webView), str2, str3, str4);
                    } catch (RemoteException | NullPointerException e) {
                        C3987mk.m17434d("#007 Could not call remote method.", e);
                        return null;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo15783a(C3235a aVar) {
        synchronized (f13708a) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11967dg)).booleanValue()) {
                if (f13709b) {
                    try {
                        this.f13711d.mo16063b(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        C3987mk.m17434d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo15784a(C3235a aVar, View view) {
        synchronized (f13708a) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11967dg)).booleanValue()) {
                if (f13709b) {
                    try {
                        this.f13711d.mo16061a(aVar, C3238b.m11573a(view));
                    } catch (RemoteException | NullPointerException e) {
                        C3987mk.m17434d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo15785a(Context context) {
        synchronized (f13708a) {
            if (!((Boolean) aoq.m14620f().mo14695a(aru.f11967dg)).booleanValue()) {
                return false;
            }
            if (f13709b) {
                return true;
            }
            try {
                m17586c(context);
                boolean a = this.f13711d.mo16062a(C3238b.m11573a(context));
                f13709b = a;
                return a;
            } catch (RemoteException | NullPointerException e) {
                C3987mk.m17434d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    /* renamed from: b */
    public final String mo15786b(Context context) {
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11967dg)).booleanValue()) {
            return null;
        }
        try {
            m17586c(context);
            String str = "a.";
            String valueOf = String.valueOf(this.f13711d.mo16060a());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } catch (RemoteException | NullPointerException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo15787b(C3235a aVar) {
        synchronized (f13708a) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11967dg)).booleanValue()) {
                if (f13709b) {
                    try {
                        this.f13711d.mo16064c(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        C3987mk.m17434d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }
}
