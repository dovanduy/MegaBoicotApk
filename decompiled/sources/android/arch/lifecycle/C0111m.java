package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.C0097c.C0098a;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.m */
/* compiled from: ReportFragment */
public class C0111m extends Fragment {

    /* renamed from: a */
    private C0112a f103a;

    /* renamed from: android.arch.lifecycle.m$a */
    /* compiled from: ReportFragment */
    interface C0112a {
        /* renamed from: a */
        void mo152a();

        /* renamed from: b */
        void mo153b();

        /* renamed from: c */
        void mo154c();
    }

    /* renamed from: a */
    public static void m186a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0111m(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m188a(C0112a aVar) {
        if (aVar != null) {
            aVar.mo152a();
        }
    }

    /* renamed from: b */
    private void m189b(C0112a aVar) {
        if (aVar != null) {
            aVar.mo153b();
        }
    }

    /* renamed from: c */
    private void m190c(C0112a aVar) {
        if (aVar != null) {
            aVar.mo154c();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m188a(this.f103a);
        m187a(C0098a.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        m189b(this.f103a);
        m187a(C0098a.ON_START);
    }

    public void onResume() {
        super.onResume();
        m190c(this.f103a);
        m187a(C0098a.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        m187a(C0098a.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        m187a(C0098a.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        m187a(C0098a.ON_DESTROY);
        this.f103a = null;
    }

    /* renamed from: a */
    private void m187a(C0098a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0105g) {
            ((C0105g) activity).mo143b().mo140a(aVar);
            return;
        }
        if (activity instanceof C0101e) {
            C0097c a = ((C0101e) activity).mo139a();
            if (a instanceof C0102f) {
                ((C0102f) a).mo140a(aVar);
            }
        }
    }
}
