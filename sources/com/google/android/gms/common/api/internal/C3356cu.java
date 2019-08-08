package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.p017v4.p023d.C0376a;
import com.google.android.gms.internal.p146c.C4421e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.cu */
public final class C3356cu extends Fragment implements C3368h {

    /* renamed from: a */
    private static WeakHashMap<Activity, WeakReference<C3356cu>> f9724a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f9725b = new C0376a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f9726c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Bundle f9727d;

    /* renamed from: a */
    public static C3356cu m12011a(Activity activity) {
        WeakReference weakReference = (WeakReference) f9724a.get(activity);
        if (weakReference != null) {
            C3356cu cuVar = (C3356cu) weakReference.get();
            if (cuVar != null) {
                return cuVar;
            }
        }
        try {
            C3356cu cuVar2 = (C3356cu) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (cuVar2 == null || cuVar2.isRemoving()) {
                cuVar2 = new C3356cu();
                activity.getFragmentManager().beginTransaction().add(cuVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f9724a.put(activity, new WeakReference(cuVar2));
            return cuVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo13296a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f9725b.get(str));
    }

    /* renamed from: a */
    public final void mo13297a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f9725b.containsKey(str)) {
            this.f9725b.put(str, lifecycleCallback);
            if (this.f9726c > 0) {
                new C4421e(Looper.getMainLooper()).post(new C3357cv(this, lifecycleCallback, str));
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

    /* renamed from: o_ */
    public final Activity mo13299o_() {
        return getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9726c = 1;
        this.f9727d = bundle;
        for (Entry entry : this.f9725b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo13172a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f9726c = 2;
        for (LifecycleCallback b : this.f9725b.values()) {
            b.mo13174b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f9726c = 3;
        for (LifecycleCallback c : this.f9725b.values()) {
            c.mo13176c();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f9725b.values()) {
            a.mo13171a(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f9725b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo13175b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.f9726c = 4;
        for (LifecycleCallback d : this.f9725b.values()) {
            d.mo13177d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f9726c = 5;
        for (LifecycleCallback e : this.f9725b.values()) {
            e.mo13178e();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f9725b.values()) {
            a.mo13173a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
