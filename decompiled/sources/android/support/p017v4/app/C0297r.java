package android.support.p017v4.app;

import android.arch.lifecycle.C0101e;
import android.arch.lifecycle.C0117q;
import android.os.Bundle;
import android.support.p017v4.content.C0358e;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.r */
/* compiled from: LoaderManager */
public abstract class C0297r {

    /* renamed from: android.support.v4.app.r$a */
    /* compiled from: LoaderManager */
    public interface C0298a<D> {
        /* renamed from: a */
        C0358e<D> mo1039a(int i, Bundle bundle);

        /* renamed from: a */
        void mo1040a(C0358e<D> eVar);

        /* renamed from: a */
        void mo1041a(C0358e<D> eVar, D d);
    }

    /* renamed from: a */
    public abstract <D> C0358e<D> mo764a(int i, Bundle bundle, C0298a<D> aVar);

    /* renamed from: a */
    public abstract void mo765a();

    @Deprecated
    /* renamed from: a */
    public abstract void mo766a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public static <T extends C0101e & C0117q> C0297r m1065a(T t) {
        return new LoaderManagerImpl(t, ((C0117q) t).mo162b());
    }
}
