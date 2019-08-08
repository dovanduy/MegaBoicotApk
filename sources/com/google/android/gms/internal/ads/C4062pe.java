package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.concurrent.TimeUnit;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.pe */
public final class C4062pe {

    /* renamed from: a */
    private final Context f13749a;

    /* renamed from: b */
    private final String f13750b;

    /* renamed from: c */
    private final zzang f13751c;

    /* renamed from: d */
    private final asf f13752d;

    /* renamed from: e */
    private final ash f13753e;

    /* renamed from: f */
    private final C3942kt f13754f = new C3945kw().mo15590a("min_1", Double.MIN_VALUE, 1.0d).mo15590a("1_5", 1.0d, 5.0d).mo15590a("5_10", 5.0d, 10.0d).mo15590a("10_20", 10.0d, 20.0d).mo15590a("20_30", 20.0d, 30.0d).mo15590a("30_max", 30.0d, Double.MAX_VALUE).mo15589a();

    /* renamed from: g */
    private final long[] f13755g;

    /* renamed from: h */
    private final String[] f13756h;

    /* renamed from: i */
    private boolean f13757i;

    /* renamed from: j */
    private boolean f13758j;

    /* renamed from: k */
    private boolean f13759k;

    /* renamed from: l */
    private boolean f13760l;

    /* renamed from: m */
    private boolean f13761m;

    /* renamed from: n */
    private C4044on f13762n;

    /* renamed from: o */
    private boolean f13763o;

    /* renamed from: p */
    private boolean f13764p;

    /* renamed from: q */
    private long f13765q;

    public C4062pe(Context context, zzang zzang, String str, ash ash, asf asf) {
        this.f13757i = false;
        this.f13758j = false;
        this.f13759k = false;
        this.f13760l = false;
        this.f13765q = -1;
        this.f13749a = context;
        this.f13751c = zzang;
        this.f13750b = str;
        this.f13753e = ash;
        this.f13752d = asf;
        String str2 = (String) aoq.m14620f().mo14695a(aru.f12052u);
        if (str2 == null) {
            this.f13756h = new String[0];
            this.f13755g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f13756h = new String[split.length];
        this.f13755g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f13755g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                C3900je.m17432c("Unable to parse frame hash target time number.", e);
                this.f13755g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo15811a() {
        if (this.f13757i && !this.f13758j) {
            asa.m15040a(this.f13753e, this.f13752d, "vfr2");
            this.f13758j = true;
        }
    }

    /* renamed from: a */
    public final void mo15812a(C4044on onVar) {
        asa.m15040a(this.f13753e, this.f13752d, "vpc2");
        this.f13757i = true;
        if (this.f13753e != null) {
            this.f13753e.mo14721a("vpn", onVar.mo15701a());
        }
        this.f13762n = onVar;
    }

    /* renamed from: b */
    public final void mo15813b() {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f12051t)).booleanValue() && !this.f13763o) {
            Bundle bundle = new Bundle();
            bundle.putString(C1245d.f3961jd, "native-player-metrics");
            bundle.putString("request", this.f13750b);
            bundle.putString("player", this.f13762n.mo15701a());
            for (C3944kv kvVar : this.f13754f.mo15584a()) {
                String valueOf = String.valueOf("fps_c_");
                String valueOf2 = String.valueOf(kvVar.f13474a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(kvVar.f13476c));
                String valueOf3 = String.valueOf("fps_p_");
                String valueOf4 = String.valueOf(kvVar.f13474a);
                bundle.putString(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), Double.toString(kvVar.f13475b));
            }
            for (int i = 0; i < this.f13755g.length; i++) {
                String str = this.f13756h[i];
                if (str != null) {
                    String valueOf5 = String.valueOf(Long.valueOf(this.f13755g[i]));
                    StringBuilder sb = new StringBuilder(3 + String.valueOf(valueOf5).length());
                    sb.append("fh_");
                    sb.append(valueOf5);
                    bundle.putString(sb.toString(), str);
                }
            }
            C3025aw.m10917e().mo15516a(this.f13749a, this.f13751c.f14505a, "gmob-apps", bundle, true);
            this.f13763o = true;
        }
    }

    /* renamed from: b */
    public final void mo15814b(C4044on onVar) {
        if (this.f13759k && !this.f13760l) {
            if (C3900je.m17044a() && !this.f13760l) {
                C3900je.m17043a("VideoMetricsMixin first frame");
            }
            asa.m15040a(this.f13753e, this.f13752d, "vff2");
            this.f13760l = true;
        }
        long c = C3025aw.m10924l().mo13696c();
        if (this.f13761m && this.f13764p && this.f13765q != -1) {
            this.f13754f.mo15585a(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c - this.f13765q)));
        }
        this.f13764p = this.f13761m;
        this.f13765q = c;
        long longValue = ((Long) aoq.m14620f().mo14695a(aru.f12053v)).longValue();
        long currentPosition = (long) onVar.getCurrentPosition();
        int i = 0;
        while (i < this.f13756h.length) {
            if (this.f13756h[i] != null || longValue <= Math.abs(currentPosition - this.f13755g[i])) {
                C4044on onVar2 = onVar;
                i++;
            } else {
                String[] strArr = this.f13756h;
                int i2 = 8;
                Bitmap bitmap = onVar.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    long j3 = j;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        long j4 = j2 | (((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j3));
                        i4++;
                        j3--;
                        j2 = j4;
                        i2 = 8;
                    }
                    i3++;
                    j = j3;
                    i2 = 8;
                }
                strArr[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo15815c() {
        this.f13761m = true;
        if (this.f13758j && !this.f13759k) {
            asa.m15040a(this.f13753e, this.f13752d, "vfp2");
            this.f13759k = true;
        }
    }

    /* renamed from: d */
    public final void mo15816d() {
        this.f13761m = false;
    }
}
