package com.appnext.core;

import android.os.Handler;
import com.appnext.core.C1309d.C1316a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.appnext.core.a */
public final class C1301a {
    private ArrayList<?> ads = null;

    /* renamed from: jQ */
    private Long f4115jQ = Long.valueOf(0);
    /* access modifiers changed from: private */

    /* renamed from: jR */
    public ArrayList<C1316a> f4116jR = new ArrayList<>();

    /* renamed from: jS */
    private String f4117jS = "";
    private String placementID;
    private int state = 0;

    /* renamed from: a */
    public final void mo6184a(C1316a aVar) {
        if (aVar != null) {
            this.f4116jR.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo6183a(C1301a aVar) {
        if (aVar != null && aVar.f4116jR != null) {
            this.f4116jR.addAll(aVar.f4116jR);
        }
    }

    /* renamed from: b */
    public final void mo6190b(C1316a aVar) {
        if (aVar != null) {
            this.f4116jR.remove(aVar);
        }
    }

    /* renamed from: cv */
    public final Long mo6191cv() {
        return this.f4115jQ;
    }

    public final ArrayList<?> getAds() {
        if (this.ads == null) {
            return null;
        }
        ArrayList<?> arrayList = new ArrayList<>();
        Iterator it = this.ads.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public final void setPlacementID(String str) {
        this.placementID = str;
    }

    public final int getState() {
        return this.state;
    }

    public final String getPlacementID() {
        return this.placementID;
    }

    public final void setState(int i) {
        this.state = i;
    }

    /* renamed from: a */
    public final void mo6185a(Long l) {
        this.f4115jQ = l;
    }

    /* renamed from: g */
    public final void mo6192g(ArrayList<?> arrayList) {
        mo6186a(arrayList, true);
    }

    /* renamed from: a */
    public final void mo6186a(ArrayList<?> arrayList, boolean z) {
        this.ads = arrayList;
        if (z) {
            this.f4115jQ = Long.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: ar */
    public final String mo6189ar() {
        return this.f4117jS;
    }

    /* renamed from: aE */
    public final void mo6187aE(String str) {
        this.f4117jS = str;
    }

    /* renamed from: h */
    public final synchronized void mo6196h(final ArrayList<?> arrayList) {
        new Handler().post(new Runnable() {
            public final void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C1301a.this.f4116jR);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1316a aVar = (C1316a) it.next();
                    if (aVar != null) {
                        aVar.mo5540a(arrayList);
                    }
                }
                C1301a.this.f4116jR.clear();
            }
        });
    }

    /* renamed from: aF */
    public final synchronized void mo6188aF(final String str) {
        new Handler().post(new Runnable() {
            public final void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C1301a.this.f4116jR);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1316a aVar = (C1316a) it.next();
                    if (aVar != null) {
                        aVar.error(str);
                    }
                }
                C1301a.this.f4116jR.clear();
            }
        });
    }
}
