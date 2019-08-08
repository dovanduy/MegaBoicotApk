package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.p */
/* compiled from: ViewModelStore */
public class C0116p {

    /* renamed from: a */
    private final HashMap<String, C0113n> f106a = new HashMap<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo161a(String str, C0113n nVar) {
        C0113n nVar2 = (C0113n) this.f106a.put(str, nVar);
        if (nVar2 != null) {
            nVar2.mo155a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0113n mo159a(String str) {
        return (C0113n) this.f106a.get(str);
    }

    /* renamed from: a */
    public final void mo160a() {
        for (C0113n a : this.f106a.values()) {
            a.mo155a();
        }
        this.f106a.clear();
    }
}
