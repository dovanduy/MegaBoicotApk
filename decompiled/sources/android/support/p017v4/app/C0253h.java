package android.support.p017v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p017v4.p023d.C0397l;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.h */
/* compiled from: FragmentHostCallback */
public abstract class C0253h<E> extends C0251f {

    /* renamed from: a */
    private final Activity f527a;

    /* renamed from: b */
    final C0257j f528b;

    /* renamed from: c */
    private final Context f529c;

    /* renamed from: d */
    private final Handler f530d;

    /* renamed from: e */
    private final int f531e;

    /* renamed from: a */
    public View mo649a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo702a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo650a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo703a(Fragment fragment) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo705b(Fragment fragment) {
    }

    /* renamed from: c */
    public void mo706c() {
    }

    /* renamed from: d */
    public boolean mo707d() {
        return true;
    }

    C0253h(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.f399a, 0);
    }

    C0253h(Activity activity, Context context, Handler handler, int i) {
        this.f528b = new C0257j();
        this.f527a = activity;
        this.f529c = (Context) C0397l.m1470a(context, "context == null");
        this.f530d = (Handler) C0397l.m1470a(handler, "handler == null");
        this.f531e = i;
    }

    /* renamed from: b */
    public LayoutInflater mo704b() {
        return LayoutInflater.from(this.f529c);
    }

    /* renamed from: a */
    public void mo701a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f529c.startActivity(intent);
    }

    /* renamed from: e */
    public int mo708e() {
        return this.f531e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Activity mo861f() {
        return this.f527a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Context mo862g() {
        return this.f529c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Handler mo863h() {
        return this.f530d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C0257j mo864i() {
        return this.f528b;
    }
}
