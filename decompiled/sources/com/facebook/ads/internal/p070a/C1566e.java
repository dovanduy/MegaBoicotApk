package com.facebook.ads.internal.p070a;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.a.e */
public class C1566e {

    /* renamed from: com.facebook.ads.internal.a.e$a */
    public interface C1567a {
        /* renamed from: a */
        C1565d mo7060a();

        /* renamed from: b */
        Collection<String> mo7061b();

        String getClientToken();
    }

    /* renamed from: a */
    public static Collection<String> m6497a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    /* renamed from: a */
    public static boolean m6498a(Context context, C1567a aVar, C1802c cVar) {
        boolean z;
        C1565d a = aVar.mo7060a();
        if (a == null || a == C1565d.NONE) {
            return false;
        }
        Collection b = aVar.mo7061b();
        if (b == null || b.isEmpty()) {
            return false;
        }
        Iterator it = b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (m6499a(context, (String) it.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z == (a == C1565d.INSTALLED)) {
            String clientToken = aVar.getClientToken();
            if (!TextUtils.isEmpty(clientToken)) {
                cVar.mo7689b(clientToken, null);
                return true;
            }
            C2370a.m9149b(context, "api", C2373b.f7508j, new Exception("Ad is invalidated without token."));
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m6499a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (NameNotFoundException | RuntimeException unused) {
            return false;
        }
    }
}
