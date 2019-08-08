package com.appnext.base.operations.imp;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import com.appnext.base.C1222a;
import com.appnext.base.C1222a.C1223a;
import com.appnext.base.operations.C1267b;
import com.appnext.base.operations.C1268c;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import com.appnext.base.p046b.C1249g;
import com.appnext.base.p046b.C1252j;
import com.appnext.base.p046b.C1252j.C1258c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class geo extends C1267b implements C1258c {
    /* access modifiers changed from: private */
    public static final String KEY = "geo";

    /* renamed from: hJ */
    private C1252j f4041hJ;
    /* access modifiers changed from: private */

    /* renamed from: hK */
    public List<C1230b> f4042hK;

    /* access modifiers changed from: protected */
    /* renamed from: bE */
    public final boolean mo6019bE() {
        return false;
    }

    public geo(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return m5382bD() && (C1248f.m5280g(C1247e.getContext(), "android.permission.ACCESS_FINE_LOCATION") || C1248f.m5280g(C1247e.getContext(), "android.permission.ACCESS_COARSE_LOCATION"));
    }

    /* renamed from: bx */
    public final void mo6007bx() {
        try {
            if (!mo5999bA()) {
                mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                return;
            }
            synchronized (this) {
                this.f4041hJ = new C1252j();
                this.f4041hJ.mo5974a((C1258c) this);
                this.f4041hJ.init();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aY */
    public final String mo6018aY() {
        return geo.class.getSimpleName();
    }

    /* renamed from: by */
    public final void mo6008by() {
        synchronized (this) {
            if (this.f4041hJ != null) {
                this.f4041hJ.mo5974a((C1258c) null);
                this.f4041hJ.mo5975cl();
                this.f4041hJ = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        return this.f4042hK;
    }

    /* renamed from: a */
    public final void mo5985a(final Location location) {
        this.f4041hJ.mo5974a((C1258c) null);
        C1249g.m5286ch().mo5955b(new Runnable() {
            public void run() {
                try {
                    if (location != null) {
                        List fromLocation = new Geocoder(C1247e.getContext(), Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                        if (fromLocation != null && fromLocation.size() > 0) {
                            geo.this.f4042hK = new ArrayList();
                            List a = geo.this.f4042hK;
                            String bK = geo.KEY;
                            StringBuilder sb = new StringBuilder();
                            sb.append(geo.class.getSimpleName());
                            sb.append("ci");
                            a.add(new C1230b(bK, sb.toString(), ((Address) fromLocation.get(0)).getLocality(), C1246a.String.getType()));
                            List a2 = geo.this.f4042hK;
                            String bK2 = geo.KEY;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(geo.class.getSimpleName());
                            sb2.append("co");
                            a2.add(new C1230b(bK2, sb2.toString(), ((Address) fromLocation.get(0)).getCountryCode(), C1246a.String.getType()));
                        }
                    }
                } catch (Throwable unused) {
                }
                geo.this.mo6001bq();
            }
        });
    }

    public final void onError(String str) {
        if (this.f4041hJ != null) {
            this.f4041hJ.mo5974a((C1258c) null);
        }
        C1268c.m5390bF().mo6020a(this);
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return geo.class.getSimpleName();
    }
}
