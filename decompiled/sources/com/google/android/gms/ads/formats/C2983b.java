package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.C3140j;
import com.google.android.gms.internal.ads.C3718cm;

@C3718cm
/* renamed from: com.google.android.gms.ads.formats.b */
public final class C2983b {

    /* renamed from: a */
    private final boolean f8713a;

    /* renamed from: b */
    private final int f8714b;

    /* renamed from: c */
    private final boolean f8715c;

    /* renamed from: d */
    private final int f8716d;

    /* renamed from: e */
    private final C3140j f8717e;

    /* renamed from: com.google.android.gms.ads.formats.b$a */
    public static final class C2984a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f8718a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f8719b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f8720c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C3140j f8721d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f8722e = 1;

        /* renamed from: a */
        public final C2984a mo12334a(int i) {
            this.f8719b = i;
            return this;
        }

        /* renamed from: a */
        public final C2984a mo12335a(C3140j jVar) {
            this.f8721d = jVar;
            return this;
        }

        /* renamed from: a */
        public final C2984a mo12336a(boolean z) {
            this.f8718a = z;
            return this;
        }

        /* renamed from: a */
        public final C2983b mo12337a() {
            return new C2983b(this);
        }

        /* renamed from: b */
        public final C2984a mo12338b(int i) {
            this.f8722e = i;
            return this;
        }

        /* renamed from: b */
        public final C2984a mo12339b(boolean z) {
            this.f8720c = z;
            return this;
        }
    }

    private C2983b(C2984a aVar) {
        this.f8713a = aVar.f8718a;
        this.f8714b = aVar.f8719b;
        this.f8715c = aVar.f8720c;
        this.f8716d = aVar.f8722e;
        this.f8717e = aVar.f8721d;
    }

    /* renamed from: a */
    public final boolean mo12329a() {
        return this.f8713a;
    }

    /* renamed from: b */
    public final int mo12330b() {
        return this.f8714b;
    }

    /* renamed from: c */
    public final boolean mo12331c() {
        return this.f8715c;
    }

    /* renamed from: d */
    public final int mo12332d() {
        return this.f8716d;
    }

    /* renamed from: e */
    public final C3140j mo12333e() {
        return this.f8717e;
    }
}
