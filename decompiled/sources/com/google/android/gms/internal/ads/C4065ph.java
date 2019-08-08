package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ph */
public final class C4065ph {

    /* renamed from: a */
    private final int f13774a;

    /* renamed from: b */
    private final List<C3667app> f13775b;

    /* renamed from: c */
    private final int f13776c;

    /* renamed from: d */
    private final InputStream f13777d;

    public C4065ph(int i, List<C3667app> list) {
        this(i, list, -1, null);
    }

    public C4065ph(int i, List<C3667app> list, int i2, InputStream inputStream) {
        this.f13774a = i;
        this.f13775b = list;
        this.f13776c = i2;
        this.f13777d = inputStream;
    }

    /* renamed from: a */
    public final int mo15826a() {
        return this.f13774a;
    }

    /* renamed from: b */
    public final List<C3667app> mo15827b() {
        return Collections.unmodifiableList(this.f13775b);
    }

    /* renamed from: c */
    public final int mo15828c() {
        return this.f13776c;
    }

    /* renamed from: d */
    public final InputStream mo15829d() {
        return this.f13777d;
    }
}
