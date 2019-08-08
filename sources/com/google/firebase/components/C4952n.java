package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.n */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
final class C4952n {

    /* renamed from: a */
    private final C4937a<?> f16132a;

    /* renamed from: b */
    private final Set<C4952n> f16133b = new HashSet();

    /* renamed from: c */
    private final Set<C4952n> f16134c = new HashSet();

    C4952n(C4937a<?> aVar) {
        this.f16132a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17872a(C4952n nVar) {
        this.f16133b.add(nVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo17874b(C4952n nVar) {
        this.f16134c.add(nVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Set<C4952n> mo17871a() {
        return this.f16133b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo17875c(C4952n nVar) {
        this.f16134c.remove(nVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C4937a<?> mo17873b() {
        return this.f16132a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo17876c() {
        return this.f16134c.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo17877d() {
        return this.f16133b.isEmpty();
    }
}
