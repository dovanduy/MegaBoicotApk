package com.appnext.base.services.p047a;

import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.operations.C1268c;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.p046b.C1251i;
import com.appnext.base.p046b.C1259k;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

/* renamed from: com.appnext.base.services.a.c */
public abstract class C1283c {

    /* renamed from: iv */
    public static final String f4087iv = "more_data";

    /* renamed from: iw */
    private static final long f4088iw = 1000;

    /* renamed from: ix */
    private static final long f4089ix = 60000;

    /* renamed from: iy */
    private static final long f4090iy = 3600000;

    /* renamed from: iz */
    private static final long f4091iz = 86400000;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6042a(C1231c cVar, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6043a(C1231c cVar, long j, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo6044b(C1231c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo6045b(C1231c cVar, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo6046h(List<C1231c> list);

    /* renamed from: a */
    public final void mo6047a(C1231c cVar, boolean z, Bundle bundle) {
        if (cVar != null) {
            try {
                if (!TextUtils.isEmpty(cVar.mo5905bb())) {
                    if (!cVar.mo5905bb().equals(C1245d.f3958ja)) {
                        long j = 0;
                        if (cVar.mo5906bc() != null && cVar.mo5907bd().equals(C1245d.f3955iX)) {
                            if (!z) {
                                j = m5539ap(cVar.mo5906bc());
                            }
                            if (j != -1) {
                                mo6045b(cVar, j + m5538a(-1800000, 1800000), f4091iz);
                            }
                        } else if (cVar.mo5909bf() == null || !cVar.mo5909bf().equals(C1245d.f3957iZ)) {
                            if (cVar.mo5909bf() != null && cVar.mo5909bf().equals(C1245d.f3956iY)) {
                                mo6043a(cVar, System.currentTimeMillis(), (Bundle) null);
                            }
                        } else {
                            long h = (long) C1259k.m5340h(cVar.mo5906bc(), cVar.mo5907bd());
                            if (h != -1) {
                                C1251i ck = C1251i.m5302ck();
                                StringBuilder sb = new StringBuilder();
                                sb.append(cVar.getKey());
                                sb.append(C1251i.f3983jv);
                                long j2 = ck.getLong(sb.toString(), 0);
                                if (j2 != 0) {
                                    if (!z) {
                                        mo6042a(cVar, h + j2, h);
                                    }
                                }
                                mo6042a(cVar, System.currentTimeMillis(), h);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ap */
    private static long m5539ap(String str) {
        try {
            if (str.length() != 4) {
                return -1;
            }
            int parseInt = Integer.parseInt(str.substring(0, 2));
            int parseInt2 = Integer.parseInt(str.substring(2, 4));
            Calendar instance = Calendar.getInstance();
            instance.set(11, parseInt);
            instance.set(12, parseInt2);
            instance.set(13, 0);
            if (new Date().after(instance.getTime())) {
                instance.add(5, 1);
            }
            return instance.getTimeInMillis();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static long m5538a(long j, long j2) {
        try {
            return 1800000 - ((long) new Random().nextInt((int) (Math.abs(-1800000) + 1800000)));
        } catch (Throwable unused) {
            return -1800000;
        }
    }

    /* renamed from: c */
    public final void mo6048c(C1231c cVar) {
        if (cVar != null) {
            try {
                C1268c.m5390bF().mo6022b(cVar.getKey(), cVar, null, null);
                mo6044b(cVar);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: i */
    public final void mo6049i(List<C1231c> list) {
        if (list != null) {
            try {
                for (C1231c cVar : list) {
                    C1268c.m5390bF().mo6022b(cVar.getKey(), cVar, null, null);
                }
                mo6046h(list);
            } catch (Throwable unused) {
            }
        }
    }
}
