package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4625gk;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.e.gl */
public final class C4626gl<M extends C4625gk<M>, T> {

    /* renamed from: a */
    protected final Class<T> f15062a;

    /* renamed from: b */
    public final int f15063b;

    /* renamed from: c */
    protected final boolean f15064c;

    /* renamed from: d */
    private final int f15065d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4626gl)) {
            return false;
        }
        C4626gl glVar = (C4626gl) obj;
        return this.f15065d == glVar.f15065d && this.f15062a == glVar.f15062a && this.f15063b == glVar.f15063b && this.f15064c == glVar.f15064c;
    }

    public final int hashCode() {
        return ((((((1147 + this.f15065d) * 31) + this.f15062a.hashCode()) * 31) + this.f15063b) * 31) + (this.f15064c ? 1 : 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final T mo16848a(List<C4633gs> list) {
        if (list == null) {
            return null;
        }
        if (this.f15064c) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C4633gs gsVar = (C4633gs) list.get(i);
                if (gsVar.f15079b.length != 0) {
                    arrayList.add(m20076a(C4622gh.m20017a(gsVar.f15079b)));
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return null;
            }
            T cast = this.f15062a.cast(Array.newInstance(this.f15062a.getComponentType(), size));
            for (int i2 = 0; i2 < size; i2++) {
                Array.set(cast, i2, arrayList.get(i2));
            }
            return cast;
        } else if (list.isEmpty()) {
            return null;
        } else {
            return this.f15062a.cast(m20076a(C4622gh.m20017a(((C4633gs) list.get(list.size() - 1)).f15079b)));
        }
    }

    /* renamed from: a */
    private final Object m20076a(C4622gh ghVar) {
        Class<T> componentType = this.f15064c ? this.f15062a.getComponentType() : this.f15062a;
        try {
            switch (this.f15065d) {
                case 10:
                    C4631gq gqVar = (C4631gq) componentType.newInstance();
                    ghVar.mo16815a(gqVar, this.f15063b >>> 3);
                    return gqVar;
                case 11:
                    C4631gq gqVar2 = (C4631gq) componentType.newInstance();
                    ghVar.mo16814a(gqVar2);
                    return gqVar2;
                default:
                    int i = this.f15065d;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(componentType);
            StringBuilder sb2 = new StringBuilder(33 + String.valueOf(valueOf).length());
            sb2.append("Error creating instance of class ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString(), e);
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(componentType);
            StringBuilder sb3 = new StringBuilder(33 + String.valueOf(valueOf2).length());
            sb3.append("Error creating instance of class ");
            sb3.append(valueOf2);
            throw new IllegalArgumentException(sb3.toString(), e2);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Error reading extension field", e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16849a(Object obj, C4623gi giVar) {
        try {
            giVar.mo16842c(this.f15063b);
            switch (this.f15065d) {
                case 10:
                    int i = this.f15063b >>> 3;
                    ((C4631gq) obj).mo16327a(giVar);
                    giVar.mo16843c(i, 4);
                    return;
                case 11:
                    giVar.mo16839a((C4631gq) obj);
                    return;
                default:
                    int i2 = this.f15065d;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo16847a(Object obj) {
        int i = this.f15063b >>> 3;
        switch (this.f15065d) {
            case 10:
                return (C4623gi.m20049b(i) << 1) + ((C4631gq) obj).mo16867e();
            case 11:
                return C4623gi.m20051b(i, (C4631gq) obj);
            default:
                int i2 = this.f15065d;
                StringBuilder sb = new StringBuilder(24);
                sb.append("Unknown type ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
