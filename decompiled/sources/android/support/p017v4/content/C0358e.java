package android.support.p017v4.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.support.p017v4.p023d.C0381d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.content.e */
/* compiled from: Loader */
public class C0358e<D> {

    /* renamed from: n */
    int f902n;

    /* renamed from: o */
    C0361c<D> f903o;

    /* renamed from: p */
    C0360b<D> f904p;

    /* renamed from: q */
    Context f905q;

    /* renamed from: r */
    boolean f906r = false;

    /* renamed from: s */
    boolean f907s = false;

    /* renamed from: t */
    boolean f908t = true;

    /* renamed from: u */
    boolean f909u = false;

    /* renamed from: v */
    boolean f910v = false;

    /* renamed from: android.support.v4.content.e$a */
    /* compiled from: Loader */
    public final class C0359a extends ContentObserver {
        public boolean deliverSelfNotifications() {
            return true;
        }

        public C0359a() {
            super(new Handler());
        }

        public void onChange(boolean z) {
            C0358e.this.mo1226A();
        }
    }

    /* renamed from: android.support.v4.content.e$b */
    /* compiled from: Loader */
    public interface C0360b<D> {
        /* renamed from: a */
        void mo1248a(C0358e<D> eVar);
    }

    /* renamed from: android.support.v4.content.e$c */
    /* compiled from: Loader */
    public interface C0361c<D> {
        /* renamed from: a */
        void mo777a(C0358e<D> eVar, D d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1180a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1185b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo1223i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo1224j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo1225k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo1241v() {
    }

    public C0358e(Context context) {
        this.f905q = context.getApplicationContext();
    }

    /* renamed from: b */
    public void mo1221b(D d) {
        if (this.f903o != null) {
            this.f903o.mo777a(this, d);
        }
    }

    /* renamed from: l */
    public void mo1230l() {
        if (this.f904p != null) {
            this.f904p.mo1248a(this);
        }
    }

    /* renamed from: m */
    public Context mo1231m() {
        return this.f905q;
    }

    /* renamed from: a */
    public void mo1227a(int i, C0361c<D> cVar) {
        if (this.f903o != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f903o = cVar;
        this.f902n = i;
    }

    /* renamed from: a */
    public void mo1228a(C0361c<D> cVar) {
        if (this.f903o == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f903o != cVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f903o = null;
        }
    }

    /* renamed from: n */
    public boolean mo1232n() {
        return this.f906r;
    }

    /* renamed from: o */
    public boolean mo1233o() {
        return this.f907s;
    }

    /* renamed from: p */
    public boolean mo1234p() {
        return this.f908t;
    }

    /* renamed from: q */
    public final void mo1235q() {
        this.f906r = true;
        this.f908t = false;
        this.f907s = false;
        mo1223i();
    }

    /* renamed from: r */
    public boolean mo1236r() {
        return mo1185b();
    }

    /* renamed from: s */
    public void mo1237s() {
        mo1180a();
    }

    /* renamed from: t */
    public void mo1238t() {
        this.f906r = false;
        mo1224j();
    }

    /* renamed from: u */
    public void mo1240u() {
        this.f907s = true;
        mo1241v();
    }

    /* renamed from: w */
    public void mo1242w() {
        mo1225k();
        this.f908t = true;
        this.f906r = false;
        this.f907s = false;
        this.f909u = false;
        this.f910v = false;
    }

    /* renamed from: x */
    public boolean mo1243x() {
        boolean z = this.f909u;
        this.f909u = false;
        this.f910v |= z;
        return z;
    }

    /* renamed from: y */
    public void mo1244y() {
        this.f910v = false;
    }

    /* renamed from: z */
    public void mo1245z() {
        if (this.f910v) {
            mo1226A();
        }
    }

    /* renamed from: A */
    public void mo1226A() {
        if (this.f906r) {
            mo1237s();
        } else {
            this.f909u = true;
        }
    }

    /* renamed from: c */
    public String mo1229c(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0381d.m1417a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0381d.m1417a(this, sb);
        sb.append(" id=");
        sb.append(this.f902n);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public void mo1183a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f902n);
        printWriter.print(" mListener=");
        printWriter.println(this.f903o);
        if (this.f906r || this.f909u || this.f910v) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f906r);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f909u);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f910v);
        }
        if (this.f907s || this.f908t) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f907s);
            printWriter.print(" mReset=");
            printWriter.println(this.f908t);
        }
    }
}
