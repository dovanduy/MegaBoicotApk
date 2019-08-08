package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public abstract class avm<T> implements Comparable<avm<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3762a f12288a;

    /* renamed from: b */
    private final int f12289b;

    /* renamed from: c */
    private final String f12290c;

    /* renamed from: d */
    private final int f12291d;

    /* renamed from: e */
    private final Object f12292e;

    /* renamed from: f */
    private bcn f12293f;

    /* renamed from: g */
    private Integer f12294g;

    /* renamed from: h */
    private azk f12295h;

    /* renamed from: i */
    private boolean f12296i;

    /* renamed from: j */
    private boolean f12297j;

    /* renamed from: k */
    private boolean f12298k;

    /* renamed from: l */
    private boolean f12299l;

    /* renamed from: m */
    private C3641ac f12300m;

    /* renamed from: n */
    private agn f12301n;

    /* renamed from: o */
    private axi f12302o;

    public avm(int i, String str, bcn bcn) {
        this.f12288a = C3762a.f12918a ? new C3762a() : null;
        this.f12292e = new Object();
        this.f12296i = true;
        int i2 = 0;
        this.f12297j = false;
        this.f12298k = false;
        this.f12299l = false;
        this.f12301n = null;
        this.f12289b = i;
        this.f12290c = str;
        this.f12293f = bcn;
        this.f12300m = new als();
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    i2 = host.hashCode();
                }
            }
        }
        this.f12291d = i2;
    }

    /* renamed from: a */
    public final avm<?> mo14889a(int i) {
        this.f12294g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final avm<?> mo14890a(agn agn) {
        this.f12301n = agn;
        return this;
    }

    /* renamed from: a */
    public final avm<?> mo14891a(azk azk) {
        this.f12295h = azk;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bbm<T> mo14892a(atl atl);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14893a(axi axi) {
        synchronized (this.f12292e) {
            this.f12302o = axi;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14894a(bbm<?> bbm) {
        axi axi;
        synchronized (this.f12292e) {
            axi = this.f12302o;
        }
        if (axi != null) {
            axi.mo14405a(this, bbm);
        }
    }

    /* renamed from: a */
    public final void mo14895a(C3738df dfVar) {
        bcn bcn;
        synchronized (this.f12292e) {
            bcn = this.f12293f;
        }
        if (bcn != null) {
            bcn.mo15131a(dfVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14896a(T t);

    /* renamed from: a */
    public byte[] mo14897a() throws C3631a {
        return null;
    }

    /* renamed from: b */
    public Map<String, String> mo14898b() throws C3631a {
        return Collections.emptyMap();
    }

    /* renamed from: b */
    public final void mo14899b(String str) {
        if (C3762a.f12918a) {
            this.f12288a.mo15261a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: c */
    public final int mo14900c() {
        return this.f12289b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo14901c(String str) {
        if (this.f12295h != null) {
            this.f12295h.mo15023b(this);
        }
        if (C3762a.f12918a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new awm(this, str, id));
            } else {
                this.f12288a.mo15261a(str, id);
                this.f12288a.mo15260a(toString());
            }
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        avm avm = (avm) obj;
        ayj ayj = ayj.NORMAL;
        ayj ayj2 = ayj.NORMAL;
        return ayj == ayj2 ? this.f12294g.intValue() - avm.f12294g.intValue() : ayj2.ordinal() - ayj.ordinal();
    }

    /* renamed from: d */
    public final int mo14903d() {
        return this.f12291d;
    }

    /* renamed from: e */
    public final String mo14904e() {
        return this.f12290c;
    }

    /* renamed from: f */
    public final agn mo14905f() {
        return this.f12301n;
    }

    /* renamed from: g */
    public final boolean mo14906g() {
        synchronized (this.f12292e) {
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo14907h() {
        return this.f12296i;
    }

    /* renamed from: i */
    public final int mo14908i() {
        return this.f12300m.mo14041a();
    }

    /* renamed from: j */
    public final C3641ac mo14909j() {
        return this.f12300m;
    }

    /* renamed from: k */
    public final void mo14910k() {
        synchronized (this.f12292e) {
            this.f12298k = true;
        }
    }

    /* renamed from: l */
    public final boolean mo14911l() {
        boolean z;
        synchronized (this.f12292e) {
            z = this.f12298k;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final void mo14912m() {
        axi axi;
        synchronized (this.f12292e) {
            axi = this.f12302o;
        }
        if (axi != null) {
            axi.mo14404a(this);
        }
    }

    public String toString() {
        String str = "0x";
        String valueOf = String.valueOf(Integer.toHexString(this.f12291d));
        String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        String str2 = "[ ] ";
        String str3 = this.f12290c;
        String valueOf2 = String.valueOf(ayj.NORMAL);
        String valueOf3 = String.valueOf(this.f12294g);
        StringBuilder sb = new StringBuilder(3 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(str2);
        sb.append(str3);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }
}
