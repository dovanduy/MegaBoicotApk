package com.facebook.ads.internal.p115w.p120e;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p085l.C1761b;
import com.facebook.ads.internal.p087n.C1771d;
import com.facebook.ads.internal.p095v.p096a.C1855a;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.w.e.d */
public class C2357d {

    /* renamed from: a */
    private static String f7424a;

    /* renamed from: b */
    private static final Set<String> f7425b = new HashSet(1);

    /* renamed from: c */
    private static final Set<String> f7426c = new HashSet(2);

    static {
        f7425b.add("1ww8E0AYsR2oX5lndk2hwp2Uosk=\n");
        f7426c.add("toZ2GRnRjC9P5VVUdCpOrFH8lfQ=\n");
        f7426c.add("3lKvjNsfmrn+WmfDhvr2iVh/yRs=\n");
        f7426c.add("B08QtE4yLCdli4rptyqAEczXOeA=\n");
        f7426c.add("XZXI6anZbdKf+taURdnyUH5ipgM=\n");
    }

    /* renamed from: a */
    public static C1855a m9115a(Context context) {
        C1855a aVar = new C1855a();
        m9117a(context, aVar, true);
        return aVar;
    }

    /* renamed from: a */
    public static C1855a m9116a(Context context, boolean z) {
        C1855a aVar = new C1855a();
        m9117a(context, aVar, z);
        if (!m9118a()) {
            aVar.mo7857b(f7426c);
            aVar.mo7849a(f7425b);
        }
        return aVar;
    }

    /* renamed from: a */
    private static void m9117a(Context context, C1855a aVar, boolean z) {
        if (m9118a()) {
            aVar.mo7858c(360000);
            aVar.mo7859d(120000);
        } else {
            aVar.mo7858c(30000);
        }
        aVar.mo7855b(3);
        aVar.mo7838a("user-agent", C1771d.m7349a(new C1761b(context), context, z));
    }

    /* renamed from: a */
    public static boolean m9118a() {
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        return !TextUtils.isEmpty(urlPrefix) && urlPrefix.endsWith(".sb");
    }

    /* renamed from: b */
    public static C1855a m9119b(Context context) {
        return m9116a(context, true);
    }
}
