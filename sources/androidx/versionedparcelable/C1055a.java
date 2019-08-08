package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.versionedparcelable.a */
/* compiled from: VersionedParcel */
public abstract class C1055a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5379a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5381a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5385a(String str);

    /* renamed from: a */
    public void mo5387a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5388a(byte[] bArr);

    /* renamed from: a */
    public boolean mo5390a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo5395b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo5396b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C1055a mo5398c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo5399c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo5400d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo5401e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract byte[] mo5402f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract <T extends Parcelable> T mo5403g();

    /* renamed from: a */
    public void mo5389a(byte[] bArr, int i) {
        mo5399c(i);
        mo5388a(bArr);
    }

    /* renamed from: a */
    public void mo5380a(int i, int i2) {
        mo5399c(i2);
        mo5379a(i);
    }

    /* renamed from: a */
    public void mo5386a(String str, int i) {
        mo5399c(i);
        mo5385a(str);
    }

    /* renamed from: a */
    public void mo5382a(Parcelable parcelable, int i) {
        mo5399c(i);
        mo5381a(parcelable);
    }

    /* renamed from: b */
    public int mo5391b(int i, int i2) {
        if (!mo5396b(i2)) {
            return i;
        }
        return mo5400d();
    }

    /* renamed from: b */
    public String mo5394b(String str, int i) {
        if (!mo5396b(i)) {
            return str;
        }
        return mo5401e();
    }

    /* renamed from: b */
    public byte[] mo5397b(byte[] bArr, int i) {
        if (!mo5396b(i)) {
            return bArr;
        }
        return mo5402f();
    }

    /* renamed from: b */
    public <T extends Parcelable> T mo5392b(T t, int i) {
        if (!mo5396b(i)) {
            return t;
        }
        return mo5403g();
    }

    /* renamed from: a */
    public void mo5384a(C1057c cVar, int i) {
        mo5399c(i);
        mo5383a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5383a(C1057c cVar) {
        if (cVar == null) {
            mo5385a((String) null);
            return;
        }
        m4875b(cVar);
        C1055a c = mo5398c();
        m4874a((T) cVar, c);
        c.mo5395b();
    }

    /* renamed from: b */
    private void m4875b(C1057c cVar) {
        try {
            mo5385a(m4873a(cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: b */
    public <T extends C1057c> T mo5393b(T t, int i) {
        if (!mo5396b(i)) {
            return t;
        }
        return mo5404h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public <T extends C1057c> T mo5404h() {
        String e = mo5401e();
        if (e == null) {
            return null;
        }
        return m4872a(e, mo5398c());
    }

    /* renamed from: a */
    protected static <T extends C1057c> T m4872a(String str, C1055a aVar) {
        try {
            return (C1057c) Class.forName(str, true, C1055a.class.getClassLoader()).getDeclaredMethod("read", new Class[]{C1055a.class}).invoke(null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    protected static <T extends C1057c> void m4874a(T t, C1055a aVar) {
        try {
            m4876c(t).getDeclaredMethod("write", new Class[]{t.getClass(), C1055a.class}).invoke(null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: c */
    private static <T extends C1057c> Class m4876c(T t) throws ClassNotFoundException {
        return m4873a(t.getClass());
    }

    /* renamed from: a */
    private static Class m4873a(Class<? extends C1057c> cls) throws ClassNotFoundException {
        return Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
    }
}
