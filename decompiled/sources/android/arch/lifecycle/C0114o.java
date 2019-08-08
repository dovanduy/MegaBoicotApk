package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.o */
/* compiled from: ViewModelProvider */
public class C0114o {

    /* renamed from: a */
    private final C0115a f104a;

    /* renamed from: b */
    private final C0116p f105b;

    /* renamed from: android.arch.lifecycle.o$a */
    /* compiled from: ViewModelProvider */
    public interface C0115a {
        /* renamed from: a */
        <T extends C0113n> T mo158a(Class<T> cls);
    }

    public C0114o(C0116p pVar, C0115a aVar) {
        this.f104a = aVar;
        this.f105b = pVar;
    }

    /* renamed from: a */
    public <T extends C0113n> T mo156a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
        sb.append(canonicalName);
        return mo157a(sb.toString(), cls);
    }

    /* renamed from: a */
    public <T extends C0113n> T mo157a(String str, Class<T> cls) {
        T a = this.f105b.mo159a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        T a2 = this.f104a.mo158a(cls);
        this.f105b.mo161a(str, a2);
        return a2;
    }
}
