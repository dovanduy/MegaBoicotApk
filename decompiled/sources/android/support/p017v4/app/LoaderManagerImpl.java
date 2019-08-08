package android.support.p017v4.app;

import android.arch.lifecycle.C0101e;
import android.arch.lifecycle.C0108j;
import android.arch.lifecycle.C0109k;
import android.arch.lifecycle.C0113n;
import android.arch.lifecycle.C0114o;
import android.arch.lifecycle.C0114o.C0115a;
import android.arch.lifecycle.C0116p;
import android.os.Bundle;
import android.os.Looper;
import android.support.p017v4.app.C0297r.C0298a;
import android.support.p017v4.content.C0358e;
import android.support.p017v4.content.C0358e.C0361c;
import android.support.p017v4.p023d.C0381d;
import android.support.p017v4.p023d.C0399n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: android.support.v4.app.LoaderManagerImpl */
class LoaderManagerImpl extends C0297r {

    /* renamed from: a */
    static boolean f463a = false;

    /* renamed from: b */
    private final C0101e f464b;

    /* renamed from: c */
    private final LoaderViewModel f465c;

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    static class LoaderViewModel extends C0113n {

        /* renamed from: a */
        private static final C0115a f466a = new C0115a() {
            /* renamed from: a */
            public <T extends C0113n> T mo158a(Class<T> cls) {
                return new LoaderViewModel();
            }
        };

        /* renamed from: b */
        private C0399n<C0234a> f467b = new C0399n<>();

        /* renamed from: c */
        private boolean f468c = false;

        LoaderViewModel() {
        }

        /* renamed from: a */
        static LoaderViewModel m688a(C0116p pVar) {
            return (LoaderViewModel) new C0114o(pVar, f466a).mo156a(LoaderViewModel.class);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo771b() {
            this.f468c = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo772c() {
            return this.f468c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo773d() {
            this.f468c = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo769a(int i, C0234a aVar) {
            this.f467b.mo1418b(i, aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <D> C0234a<D> mo768a(int i) {
            return (C0234a) this.f467b.mo1414a(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo774e() {
            int b = this.f467b.mo1416b();
            for (int i = 0; i < b; i++) {
                ((C0234a) this.f467b.mo1424e(i)).mo780g();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo155a() {
            super.mo155a();
            int b = this.f467b.mo1416b();
            for (int i = 0; i < b; i++) {
                ((C0234a) this.f467b.mo1424e(i)).mo776a(true);
            }
            this.f467b.mo1419c();
        }

        /* renamed from: a */
        public void mo770a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f467b.mo1416b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String sb2 = sb.toString();
                for (int i = 0; i < this.f467b.mo1416b(); i++) {
                    C0234a aVar = (C0234a) this.f467b.mo1424e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f467b.mo1423d(i));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo778a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    public static class C0234a<D> extends C0108j<D> implements C0361c<D> {

        /* renamed from: a */
        private final int f469a;

        /* renamed from: b */
        private final Bundle f470b;

        /* renamed from: c */
        private final C0358e<D> f471c;

        /* renamed from: d */
        private C0101e f472d;

        /* renamed from: e */
        private C0235b<D> f473e;

        /* renamed from: f */
        private C0358e<D> f474f;

        C0234a(int i, Bundle bundle, C0358e<D> eVar, C0358e<D> eVar2) {
            this.f469a = i;
            this.f470b = bundle;
            this.f471c = eVar;
            this.f474f = eVar2;
            this.f471c.mo1227a(i, this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C0358e<D> mo779f() {
            return this.f471c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo119b() {
            if (LoaderManagerImpl.f463a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f471c.mo1235q();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo121c() {
            if (LoaderManagerImpl.f463a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f471c.mo1238t();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0358e<D> mo775a(C0101e eVar, C0298a<D> aVar) {
            C0235b<D> bVar = new C0235b<>(this.f471c, aVar);
            mo116a(eVar, (C0109k<T>) bVar);
            if (this.f473e != null) {
                mo117a((C0109k<? super D>) this.f473e);
            }
            this.f472d = eVar;
            this.f473e = bVar;
            return this.f471c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo780g() {
            C0101e eVar = this.f472d;
            C0235b<D> bVar = this.f473e;
            if (eVar != null && bVar != null) {
                super.mo117a((C0109k<T>) bVar);
                mo116a(eVar, (C0109k<T>) bVar);
            }
        }

        /* renamed from: a */
        public void mo117a(C0109k<? super D> kVar) {
            super.mo117a(kVar);
            this.f472d = null;
            this.f473e = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0358e<D> mo776a(boolean z) {
            if (LoaderManagerImpl.f463a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f471c.mo1236r();
            this.f471c.mo1240u();
            C0235b<D> bVar = this.f473e;
            if (bVar != null) {
                mo117a((C0109k<? super D>) bVar);
                if (z) {
                    bVar.mo784b();
                }
            }
            this.f471c.mo1228a(this);
            if ((bVar == null || bVar.mo783a()) && !z) {
                return this.f471c;
            }
            this.f471c.mo1242w();
            return this.f474f;
        }

        /* renamed from: a */
        public void mo777a(C0358e<D> eVar, D d) {
            if (LoaderManagerImpl.f463a) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo120b(d);
                return;
            }
            if (LoaderManagerImpl.f463a) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo118a(d);
        }

        /* renamed from: b */
        public void mo120b(D d) {
            super.mo120b(d);
            if (this.f474f != null) {
                this.f474f.mo1242w();
                this.f474f = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f469a);
            sb.append(" : ");
            C0381d.m1417a(this.f471c, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* renamed from: a */
        public void mo778a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f469a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f470b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f471c);
            C0358e<D> eVar = this.f471c;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            eVar.mo1183a(sb.toString(), fileDescriptor, printWriter, strArr);
            if (this.f473e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f473e);
                C0235b<D> bVar = this.f473e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("  ");
                bVar.mo782a(sb2.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo779f().mo1229c(mo115a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo122d());
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$b */
    static class C0235b<D> implements C0109k<D> {

        /* renamed from: a */
        private final C0358e<D> f475a;

        /* renamed from: b */
        private final C0298a<D> f476b;

        /* renamed from: c */
        private boolean f477c = false;

        C0235b(C0358e<D> eVar, C0298a<D> aVar) {
            this.f475a = eVar;
            this.f476b = aVar;
        }

        /* renamed from: a */
        public void mo144a(D d) {
            if (LoaderManagerImpl.f463a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f475a);
                sb.append(": ");
                sb.append(this.f475a.mo1229c(d));
                Log.v("LoaderManager", sb.toString());
            }
            this.f476b.mo1041a(this.f475a, d);
            this.f477c = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo783a() {
            return this.f477c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo784b() {
            if (this.f477c) {
                if (LoaderManagerImpl.f463a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f475a);
                    Log.v("LoaderManager", sb.toString());
                }
                this.f476b.mo1040a(this.f475a);
            }
        }

        public String toString() {
            return this.f476b.toString();
        }

        /* renamed from: a */
        public void mo782a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f477c);
        }
    }

    LoaderManagerImpl(C0101e eVar, C0116p pVar) {
        this.f464b = eVar;
        this.f465c = LoaderViewModel.m688a(pVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private <D> C0358e<D> m684a(int i, Bundle bundle, C0298a<D> aVar, C0358e<D> eVar) {
        try {
            this.f465c.mo771b();
            C0358e a = aVar.mo1039a(i, bundle);
            if (a == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            } else if (!a.getClass().isMemberClass() || Modifier.isStatic(a.getClass().getModifiers())) {
                C0234a aVar2 = new C0234a(i, bundle, a, eVar);
                if (f463a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Created new loader ");
                    sb.append(aVar2);
                    Log.v("LoaderManager", sb.toString());
                }
                this.f465c.mo769a(i, aVar2);
                this.f465c.mo773d();
                return aVar2.mo775a(this.f464b, aVar);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                sb2.append(a);
                throw new IllegalArgumentException(sb2.toString());
            }
        } catch (Throwable th) {
            this.f465c.mo773d();
            throw th;
        }
    }

    /* renamed from: a */
    public <D> C0358e<D> mo764a(int i, Bundle bundle, C0298a<D> aVar) {
        if (this.f465c.mo772c()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        } else {
            C0234a a = this.f465c.mo768a(i);
            if (f463a) {
                StringBuilder sb = new StringBuilder();
                sb.append("initLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
                Log.v("LoaderManager", sb.toString());
            }
            if (a == null) {
                return m684a(i, bundle, aVar, null);
            }
            if (f463a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Re-using existing loader ");
                sb2.append(a);
                Log.v("LoaderManager", sb2.toString());
            }
            return a.mo775a(this.f464b, aVar);
        }
    }

    /* renamed from: a */
    public void mo765a() {
        this.f465c.mo774e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0381d.m1417a(this.f464b, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public void mo766a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f465c.mo770a(str, fileDescriptor, printWriter, strArr);
    }
}
