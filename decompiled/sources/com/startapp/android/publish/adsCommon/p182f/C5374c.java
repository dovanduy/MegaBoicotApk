package com.startapp.android.publish.adsCommon.p182f;

import android.content.Context;
import com.startapp.android.publish.adsCommon.p188h.C5396a;
import com.startapp.android.publish.adsCommon.p188h.C5398b;
import com.startapp.android.publish.adsCommon.p188h.C5400c;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.C5549d;
import com.startapp.common.p193a.C5518g;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.startapp.android.publish.adsCommon.f.c */
/* compiled from: StartAppSDK */
public class C5374c {

    /* renamed from: f */
    static AtomicBoolean f17209f = new AtomicBoolean(false);

    /* renamed from: a */
    Context f17210a;

    /* renamed from: b */
    C5549d f17211b;

    /* renamed from: c */
    ArrayList<C5396a> f17212c;

    /* renamed from: d */
    int f17213d;

    /* renamed from: e */
    C5373b f17214e;

    /* renamed from: g */
    private Runnable f17215g;

    public C5374c(Context context, boolean z) {
        this(context, z, null);
    }

    public C5374c(Context context, boolean z, C5549d dVar) {
        this.f17215g = new Runnable() {
            public void run() {
                synchronized (this) {
                    C5374c cVar = C5374c.this;
                    int i = cVar.f17213d - 1;
                    cVar.f17213d = i;
                    if (i == 0) {
                        C5518g.m23563a("DataEventTask", 3, "sending DataEvent");
                        C5378f.m23018a(C5374c.this.f17210a, C5374c.this.f17214e, "");
                        C5374c.f17209f.set(false);
                        C5374c.this.mo19887b();
                    }
                }
            }
        };
        this.f17210a = context;
        this.f17211b = dVar;
        this.f17212c = new ArrayList<>();
        this.f17214e = new C5373b(C5376d.PERIODIC);
        this.f17214e.mo19880a(z);
        if (MetaData.getInstance().getSensorsConfig().mo20279b()) {
            this.f17212c.add(new C5400c(context, this.f17215g, this.f17214e));
        }
        if (MetaData.getInstance().getBluetoothConfig().mo20268b()) {
            this.f17212c.add(new C5398b(context, this.f17215g, this.f17214e));
        }
        this.f17213d = this.f17212c.size();
    }

    /* renamed from: a */
    public void mo19886a() {
        if (this.f17213d > 0) {
            if (f17209f.compareAndSet(false, true)) {
                for (int i = 0; i < this.f17213d; i++) {
                    ((C5396a) this.f17212c.get(i)).mo19941a();
                }
                return;
            }
        }
        mo19887b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo19887b() {
        if (this.f17211b != null) {
            this.f17211b.mo19942a(null);
        }
    }

    /* renamed from: c */
    public C5373b mo19888c() {
        return this.f17214e;
    }
}
