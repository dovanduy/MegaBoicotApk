package android.support.p017v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;
import java.util.Set;

/* renamed from: android.support.v4.app.z */
/* compiled from: RemoteInput */
public final class C0317z {

    /* renamed from: a */
    private final String f787a;

    /* renamed from: b */
    private final CharSequence f788b;

    /* renamed from: c */
    private final CharSequence[] f789c;

    /* renamed from: d */
    private final boolean f790d;

    /* renamed from: e */
    private final Bundle f791e;

    /* renamed from: f */
    private final Set<String> f792f;

    /* renamed from: a */
    public String mo1109a() {
        return this.f787a;
    }

    /* renamed from: b */
    public CharSequence mo1110b() {
        return this.f788b;
    }

    /* renamed from: c */
    public CharSequence[] mo1111c() {
        return this.f789c;
    }

    /* renamed from: d */
    public Set<String> mo1112d() {
        return this.f792f;
    }

    /* renamed from: e */
    public boolean mo1113e() {
        return !mo1114f() && (mo1111c() == null || mo1111c().length == 0) && mo1112d() != null && !mo1112d().isEmpty();
    }

    /* renamed from: f */
    public boolean mo1114f() {
        return this.f790d;
    }

    /* renamed from: g */
    public Bundle mo1115g() {
        return this.f791e;
    }

    /* renamed from: a */
    static RemoteInput[] m1170a(C0317z[] zVarArr) {
        if (zVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[zVarArr.length];
        for (int i = 0; i < zVarArr.length; i++) {
            remoteInputArr[i] = m1169a(zVarArr[i]);
        }
        return remoteInputArr;
    }

    /* renamed from: a */
    static RemoteInput m1169a(C0317z zVar) {
        return new Builder(zVar.mo1109a()).setLabel(zVar.mo1110b()).setChoices(zVar.mo1111c()).setAllowFreeFormInput(zVar.mo1114f()).addExtras(zVar.mo1115g()).build();
    }
}
