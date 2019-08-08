package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4513cu.C4518e;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.cc */
final class C4494cc implements C4621gg {

    /* renamed from: a */
    private final C4487ca f14748a;

    /* renamed from: a */
    public static C4494cc m19288a(C4487ca caVar) {
        if (caVar.f14731a != null) {
            return caVar.f14731a;
        }
        return new C4494cc(caVar);
    }

    private C4494cc(C4487ca caVar) {
        this.f14748a = (C4487ca) C4520cw.m19448a(caVar, "output");
    }

    /* renamed from: a */
    public final int mo16520a() {
        return C4518e.f14854j;
    }

    /* renamed from: a */
    public final void mo16524a(int i, int i2) throws IOException {
        this.f14748a.mo16518e(i, i2);
    }

    /* renamed from: a */
    public final void mo16525a(int i, long j) throws IOException {
        this.f14748a.mo16490a(i, j);
    }

    /* renamed from: b */
    public final void mo16537b(int i, long j) throws IOException {
        this.f14748a.mo16513c(i, j);
    }

    /* renamed from: a */
    public final void mo16523a(int i, float f) throws IOException {
        this.f14748a.mo16488a(i, f);
    }

    /* renamed from: a */
    public final void mo16522a(int i, double d) throws IOException {
        this.f14748a.mo16487a(i, d);
    }

    /* renamed from: b */
    public final void mo16536b(int i, int i2) throws IOException {
        this.f14748a.mo16505b(i, i2);
    }

    /* renamed from: c */
    public final void mo16543c(int i, long j) throws IOException {
        this.f14748a.mo16490a(i, j);
    }

    /* renamed from: c */
    public final void mo16542c(int i, int i2) throws IOException {
        this.f14748a.mo16505b(i, i2);
    }

    /* renamed from: d */
    public final void mo16546d(int i, long j) throws IOException {
        this.f14748a.mo16513c(i, j);
    }

    /* renamed from: d */
    public final void mo16545d(int i, int i2) throws IOException {
        this.f14748a.mo16518e(i, i2);
    }

    /* renamed from: a */
    public final void mo16534a(int i, boolean z) throws IOException {
        this.f14748a.mo16495a(i, z);
    }

    /* renamed from: a */
    public final void mo16530a(int i, String str) throws IOException {
        this.f14748a.mo16494a(i, str);
    }

    /* renamed from: a */
    public final void mo16526a(int i, C4469bj bjVar) throws IOException {
        this.f14748a.mo16491a(i, bjVar);
    }

    /* renamed from: e */
    public final void mo16548e(int i, int i2) throws IOException {
        this.f14748a.mo16512c(i, i2);
    }

    /* renamed from: f */
    public final void mo16551f(int i, int i2) throws IOException {
        this.f14748a.mo16517d(i, i2);
    }

    /* renamed from: e */
    public final void mo16549e(int i, long j) throws IOException {
        this.f14748a.mo16506b(i, j);
    }

    /* renamed from: a */
    public final void mo16529a(int i, Object obj, C4571et etVar) throws IOException {
        this.f14748a.mo16493a(i, (C4554ec) obj, etVar);
    }

    /* renamed from: b */
    public final void mo16538b(int i, Object obj, C4571et etVar) throws IOException {
        C4487ca caVar = this.f14748a;
        C4554ec ecVar = (C4554ec) obj;
        caVar.mo16489a(i, 3);
        etVar.mo16687a(ecVar, (C4621gg) caVar.f14731a);
        caVar.mo16489a(i, 4);
    }

    /* renamed from: a */
    public final void mo16521a(int i) throws IOException {
        this.f14748a.mo16489a(i, 3);
    }

    /* renamed from: b */
    public final void mo16535b(int i) throws IOException {
        this.f14748a.mo16489a(i, 4);
    }

    /* renamed from: a */
    public final void mo16528a(int i, Object obj) throws IOException {
        if (obj instanceof C4469bj) {
            this.f14748a.mo16507b(i, (C4469bj) obj);
        } else {
            this.f14748a.mo16508b(i, (C4554ec) obj);
        }
    }

    /* renamed from: a */
    public final void mo16533a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19142f(((Integer) list.get(i4)).intValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16486a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16505b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo16541b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19154i(((Integer) list.get(i4)).intValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16516d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16518e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo16544c(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19138d(((Long) list.get(i4)).longValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16496a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16490a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo16547d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19141e(((Long) list.get(i4)).longValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16496a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16490a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo16550e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19149g(((Long) list.get(i4)).longValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16514c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16513c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo16552f(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19117b(((Float) list.get(i4)).floatValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16485a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16488a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo16553g(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19116b(((Double) list.get(i4)).doubleValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16484a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16487a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo16554h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19159k(((Integer) list.get(i4)).intValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16486a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16505b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo16555i(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19128b(((Boolean) list.get(i4)).booleanValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16502a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16495a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo16531a(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C4536dl) {
            C4536dl dlVar = (C4536dl) list;
            while (i2 < list.size()) {
                Object b = dlVar.mo16648b(i2);
                if (b instanceof String) {
                    this.f14748a.mo16494a(i, (String) b);
                } else {
                    this.f14748a.mo16491a(i, (C4469bj) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16494a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo16539b(int i, List<C4469bj> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f14748a.mo16491a(i, (C4469bj) list.get(i2));
        }
    }

    /* renamed from: j */
    public final void mo16556j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19146g(((Integer) list.get(i4)).intValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16504b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16512c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo16557k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19157j(((Integer) list.get(i4)).intValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16516d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16518e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo16558l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19153h(((Long) list.get(i4)).longValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16514c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16513c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo16559m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19150h(((Integer) list.get(i4)).intValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16511c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16517d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo16560n(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14748a.mo16489a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4487ca.m19145f(((Long) list.get(i4)).longValue());
            }
            this.f14748a.mo16504b(i3);
            while (i2 < list.size()) {
                this.f14748a.mo16509b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14748a.mo16506b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo16532a(int i, List<?> list, C4571et etVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo16529a(i, list.get(i2), etVar);
        }
    }

    /* renamed from: b */
    public final void mo16540b(int i, List<?> list, C4571et etVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo16538b(i, list.get(i2), etVar);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo16527a(int i, C4546dv<K, V> dvVar, Map<K, V> map) throws IOException {
        for (Entry entry : map.entrySet()) {
            this.f14748a.mo16489a(i, 2);
            this.f14748a.mo16504b(C4545du.m19513a(dvVar, entry.getKey(), entry.getValue()));
            C4545du.m19514a(this.f14748a, dvVar, entry.getKey(), entry.getValue());
        }
    }
}
