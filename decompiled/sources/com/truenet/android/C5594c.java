package com.truenet.android;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0075j;
import p000a.p001a.p002a.C0007g;
import p000a.p001a.p003b.p004a.C0022a;
import p000a.p001a.p003b.p004a.C0023b;
import p000a.p001a.p003b.p005b.C0032h;
import p000a.p001a.p003b.p005b.C0033i;

/* renamed from: com.truenet.android.c */
public final class C5594c {

    /* renamed from: a */
    public static final C5595a f17712a = new C5595a(null);

    /* renamed from: b */
    private final ExecutorService f17713b;
    @NotNull

    /* renamed from: c */
    private C0022a<C0075j> f17714c = C5597c.f17724a;

    /* renamed from: d */
    private int f17715d;

    /* renamed from: e */
    private final Context f17716e;

    /* renamed from: f */
    private final List<String> f17717f;

    /* renamed from: g */
    private final long f17718g;

    /* renamed from: h */
    private final int f17719h;

    /* renamed from: com.truenet.android.c$a */
    public static final class C5595a {
        private C5595a() {
        }

        public /* synthetic */ C5595a(C0029e eVar) {
            this();
        }
    }

    /* renamed from: com.truenet.android.c$b */
    static final class C5596b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5585b f17720a;

        /* renamed from: b */
        final /* synthetic */ int f17721b;

        /* renamed from: c */
        final /* synthetic */ C5594c f17722c;

        /* renamed from: d */
        final /* synthetic */ C0023b f17723d;

        C5596b(C5585b bVar, int i, C5594c cVar, C0023b bVar2) {
            this.f17720a = bVar;
            this.f17721b = i;
            this.f17722c = cVar;
            this.f17723d = bVar2;
        }

        public final void run() {
            this.f17720a.mo20693g();
            this.f17723d.mo46a(this.f17720a, Integer.valueOf(this.f17721b));
            this.f17722c.m23798b();
        }
    }

    /* renamed from: com.truenet.android.c$c */
    static final class C5597c extends C0033i implements C0022a<C0075j> {

        /* renamed from: a */
        public static final C5597c f17724a = new C5597c();

        C5597c() {
            super(0);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo45a() {
            mo20716b();
            return C0075j.f30a;
        }

        /* renamed from: b */
        public final void mo20716b() {
        }
    }

    public C5594c(@NotNull Context context, @NotNull List<String> list, @NotNull ThreadFactory threadFactory, long j, int i, int i2) {
        C0032h.m45b(context, "context");
        C0032h.m45b(list, "links");
        C0032h.m45b(threadFactory, "threadFactory");
        this.f17716e = context;
        this.f17717f = list;
        this.f17718g = j;
        this.f17719h = i;
        this.f17713b = Executors.newFixedThreadPool(i2, threadFactory);
    }

    /* renamed from: a */
    private final int m23796a() {
        int i;
        synchronized (this) {
            this.f17715d++;
            i = this.f17715d;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23798b() {
        synchronized (this) {
            this.f17715d--;
            if (this.f17715d <= 0) {
                this.f17714c.mo45a();
            }
            C0075j jVar = C0075j.f30a;
        }
    }

    /* renamed from: a */
    public final void mo20713a(@NotNull C0022a<C0075j> aVar) {
        C0032h.m45b(aVar, "<set-?>");
        this.f17714c = aVar;
    }

    /* renamed from: a */
    public final void mo20714a(@NotNull C0023b<? super C5585b, ? super Integer, C0075j> bVar) {
        C0032h.m45b(bVar, "block");
        int i = 0;
        for (Object next : this.f17717f) {
            int i2 = i + 1;
            if (i < 0) {
                C0007g.m8b();
            }
            String str = (String) next;
            m23796a();
            C5585b bVar2 = new C5585b(this.f17716e, str, this.f17719h, this.f17718g);
            this.f17713b.execute(new C5596b(bVar2, i, this, bVar));
            i = i2;
        }
    }
}
