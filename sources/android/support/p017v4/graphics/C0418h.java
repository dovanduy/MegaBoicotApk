package android.support.p017v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.p017v4.content.p022a.C0342c.C0344b;
import android.support.p017v4.content.p022a.C0342c.C0345c;
import android.support.p017v4.p020b.C0319b.C0325b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: android.support.v4.graphics.h */
/* compiled from: TypefaceCompatBaseImpl */
class C0418h {

    /* renamed from: android.support.v4.graphics.h$a */
    /* compiled from: TypefaceCompatBaseImpl */
    private interface C0421a<T> {
        /* renamed from: a */
        boolean mo1488a(T t);

        /* renamed from: b */
        int mo1489b(T t);
    }

    C0418h() {
    }

    /* renamed from: a */
    private static <T> T m1591a(T[] tArr, int i, C0421a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        int i3 = Integer.MAX_VALUE;
        T t = null;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.mo1489b(t2) - i2) * 2) + (aVar.mo1488a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0325b mo1486a(C0325b[] bVarArr, int i) {
        return (C0325b) m1591a(bVarArr, i, new C0421a<C0325b>() {
            /* renamed from: a */
            public int mo1489b(C0325b bVar) {
                return bVar.mo1134c();
            }

            /* renamed from: b */
            public boolean mo1488a(C0325b bVar) {
                return bVar.mo1135d();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo1485a(Context context, InputStream inputStream) {
        File a = C0422i.m1607a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0422i.m1613a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo1428a(Context context, CancellationSignal cancellationSignal, C0325b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo1486a(bVarArr, i).mo1132a());
            try {
                Typeface a = mo1485a(context, inputStream);
                C0422i.m1611a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C0422i.m1611a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0422i.m1611a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0422i.m1611a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0422i.m1611a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    private C0345c m1590a(C0344b bVar, int i) {
        return (C0345c) m1591a(bVar.mo1203a(), i, new C0421a<C0345c>() {
            /* renamed from: a */
            public int mo1489b(C0345c cVar) {
                return cVar.mo1205b();
            }

            /* renamed from: b */
            public boolean mo1488a(C0345c cVar) {
                return cVar.mo1206c();
            }
        });
    }

    /* renamed from: a */
    public Typeface mo1475a(Context context, C0344b bVar, Resources resources, int i) {
        C0345c a = m1590a(bVar, i);
        if (a == null) {
            return null;
        }
        return C0405c.m1522a(context, resources, a.mo1209f(), a.mo1204a(), i);
    }

    /* renamed from: a */
    public Typeface mo1476a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0422i.m1607a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0422i.m1612a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }
}
