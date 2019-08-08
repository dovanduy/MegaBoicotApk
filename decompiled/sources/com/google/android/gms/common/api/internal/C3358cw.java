package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.p017v4.app.Fragment;
import android.support.p017v4.app.FragmentActivity;
import android.support.p017v4.p023d.C0376a;
import com.google.android.gms.internal.p146c.C4421e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.cw */
public final class C3358cw extends Fragment implements C3368h {

    /* renamed from: a */
    private static WeakHashMap<FragmentActivity, WeakReference<C3358cw>> f9731a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f9732b = new C0376a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f9733c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Bundle f9734d;

    /* renamed from: a */
    public static C3358cw m12017a(FragmentActivity fragmentActivity) {
        WeakReference weakReference = (WeakReference) f9731a.get(fragmentActivity);
        if (weakReference != null) {
            C3358cw cwVar = (C3358cw) weakReference.get();
            if (cwVar != null) {
                return cwVar;
            }
        }
        try {
            C3358cw cwVar2 = (C3358cw) fragmentActivity.mo670f().mo866a("SupportLifecycleFragmentImpl");
            if (cwVar2 == null || cwVar2.mo639t()) {
                cwVar2 = new C3358cw();
                fragmentActivity.mo670f().mo867a().mo806a(cwVar2, "SupportLifecycleFragmentImpl").mo820c();
            }
            f9731a.put(fragmentActivity, new WeakReference(cwVar2));
            return cwVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo13296a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f9732b.get(str));
    }

    /* renamed from: a */
    public final void mo13297a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f9732b.containsKey(str)) {
            this.f9732b.put(str, lifecycleCallback);
            if (this.f9733c > 0) {
                new C4421e(Looper.getMainLooper()).post(new C3359cx(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(59 + String.valueOf(str).length());
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo571a(Bundle bundle) {
        super.mo571a(bundle);
        this.f9733c = 1;
        this.f9734d = bundle;
        for (Entry entry : this.f9732b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo13172a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* renamed from: f */
    public final void mo606f() {
        super.mo606f();
        this.f9733c = 2;
        for (LifecycleCallback b : this.f9732b.values()) {
            b.mo13174b();
        }
    }

    /* renamed from: z */
    public final void mo646z() {
        super.mo646z();
        this.f9733c = 3;
        for (LifecycleCallback c : this.f9732b.values()) {
            c.mo13176c();
        }
    }

    /* renamed from: a */
    public final void mo559a(int i, int i2, Intent intent) {
        super.mo559a(i, i2, intent);
        for (LifecycleCallback a : this.f9732b.values()) {
            a.mo13171a(i, i2, intent);
        }
    }

    /* renamed from: e */
    public final void mo603e(Bundle bundle) {
        super.mo603e(bundle);
        if (bundle != null) {
            for (Entry entry : this.f9732b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo13175b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    /* renamed from: g */
    public final void mo609g() {
        super.mo609g();
        this.f9733c = 4;
        for (LifecycleCallback d : this.f9732b.values()) {
            d.mo13177d();
        }
    }

    /* renamed from: B */
    public final void mo529B() {
        super.mo529B();
        this.f9733c = 5;
        for (LifecycleCallback e : this.f9732b.values()) {
            e.mo13178e();
        }
    }

    /* renamed from: a */
    public final void mo578a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo578a(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f9732b.values()) {
            a.mo13173a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: o_ */
    public final /* synthetic */ Activity mo13299o_() {
        return mo626m();
    }
}
