package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.q */
/* compiled from: GraphRequestBatch */
public class C2658q extends AbstractList<GraphRequest> {

    /* renamed from: a */
    private static AtomicInteger f8263a = new AtomicInteger();

    /* renamed from: b */
    private Handler f8264b;

    /* renamed from: c */
    private List<GraphRequest> f8265c;

    /* renamed from: d */
    private int f8266d;

    /* renamed from: e */
    private final String f8267e;

    /* renamed from: f */
    private List<C2659a> f8268f;

    /* renamed from: g */
    private String f8269g;

    /* renamed from: com.facebook.q$a */
    /* compiled from: GraphRequestBatch */
    public interface C2659a {
        /* renamed from: a */
        void mo8876a(C2658q qVar);
    }

    /* renamed from: com.facebook.q$b */
    /* compiled from: GraphRequestBatch */
    public interface C2660b extends C2659a {
        /* renamed from: a */
        void mo9369a(C2658q qVar, long j, long j2);
    }

    public C2658q() {
        this.f8265c = new ArrayList();
        this.f8266d = 0;
        this.f8267e = Integer.valueOf(f8263a.incrementAndGet()).toString();
        this.f8268f = new ArrayList();
        this.f8265c = new ArrayList();
    }

    public C2658q(Collection<GraphRequest> collection) {
        this.f8265c = new ArrayList();
        this.f8266d = 0;
        this.f8267e = Integer.valueOf(f8263a.incrementAndGet()).toString();
        this.f8268f = new ArrayList();
        this.f8265c = new ArrayList(collection);
    }

    public C2658q(GraphRequest... graphRequestArr) {
        this.f8265c = new ArrayList();
        this.f8266d = 0;
        this.f8267e = Integer.valueOf(f8263a.incrementAndGet()).toString();
        this.f8268f = new ArrayList();
        this.f8265c = Arrays.asList(graphRequestArr);
    }

    /* renamed from: a */
    public int mo9345a() {
        return this.f8266d;
    }

    /* renamed from: a */
    public void mo9349a(C2659a aVar) {
        if (!this.f8268f.contains(aVar)) {
            this.f8268f.add(aVar);
        }
    }

    /* renamed from: a */
    public final boolean add(GraphRequest graphRequest) {
        return this.f8265c.add(graphRequest);
    }

    /* renamed from: a */
    public final void add(int i, GraphRequest graphRequest) {
        this.f8265c.add(i, graphRequest);
    }

    public final void clear() {
        this.f8265c.clear();
    }

    /* renamed from: a */
    public final GraphRequest get(int i) {
        return (GraphRequest) this.f8265c.get(i);
    }

    /* renamed from: b */
    public final GraphRequest remove(int i) {
        return (GraphRequest) this.f8265c.remove(i);
    }

    /* renamed from: b */
    public final GraphRequest set(int i, GraphRequest graphRequest) {
        return (GraphRequest) this.f8265c.set(i, graphRequest);
    }

    public final int size() {
        return this.f8265c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo9355b() {
        return this.f8267e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Handler mo9356c() {
        return this.f8264b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9348a(Handler handler) {
        this.f8264b = handler;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final List<GraphRequest> mo9358d() {
        return this.f8265c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final List<C2659a> mo9359e() {
        return this.f8268f;
    }

    /* renamed from: f */
    public final String mo9360f() {
        return this.f8269g;
    }

    /* renamed from: g */
    public final List<C2661r> mo9361g() {
        return mo9364i();
    }

    /* renamed from: h */
    public final C2657p mo9363h() {
        return mo9365j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public List<C2661r> mo9364i() {
        return GraphRequest.m6227b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public C2657p mo9365j() {
        return GraphRequest.m6231c(this);
    }
}
