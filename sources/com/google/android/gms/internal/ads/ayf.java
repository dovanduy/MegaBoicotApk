package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.ads.internal.C3025aw;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class ayf {

    /* renamed from: a */
    private final Map<ayg, ayh> f12381a = new HashMap();

    /* renamed from: b */
    private final LinkedList<ayg> f12382b = new LinkedList<>();

    /* renamed from: c */
    private axa f12383c;

    /* renamed from: a */
    static Set<String> m15701a(zzjj zzjj) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(zzjj.f14527c.keySet());
        Bundle bundle = zzjj.f14537m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    /* renamed from: a */
    private static void m15702a(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m15703a(String str, ayg ayg) {
        if (C3900je.m17428a(2)) {
            C3900je.m17043a(String.format(str, new Object[]{ayg}));
        }
    }

    /* renamed from: a */
    private static String[] m15704a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), C2793C.UTF8_NAME);
            }
            return split;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    /* renamed from: b */
    static zzjj m15705b(zzjj zzjj) {
        zzjj d = m15710d(zzjj);
        String str = "_skipMediation";
        Bundle bundle = d.f14537m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean(str, true);
        }
        d.f14527c.putBoolean(str, true);
        return d;
    }

    /* renamed from: b */
    private final String m15706b() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f12382b.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(((ayg) it.next()).toString().getBytes(C2793C.UTF8_NAME), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static boolean m15707b(String str) {
        try {
            return Pattern.matches((String) aoq.m14620f().mo14695a(aru.f11855ba), str);
        } catch (RuntimeException e) {
            C3025aw.m10921i().mo15436a((Throwable) e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    /* renamed from: c */
    private static zzjj m15708c(zzjj zzjj) {
        String[] split;
        zzjj d = m15710d(zzjj);
        for (String str : ((String) aoq.m14620f().mo14695a(aru.f11798aW)).split(",")) {
            m15702a(d.f14537m, str);
            String str2 = "com.google.ads.mediation.admob.AdMobAdapter/";
            if (str.startsWith(str2)) {
                m15702a(d.f14527c, str.replaceFirst(str2, ""));
            }
        }
        return d;
    }

    /* renamed from: c */
    private static String m15709c(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            if (matcher.matches()) {
                return matcher.group(1);
            }
        } catch (RuntimeException unused) {
        }
        return str;
    }

    /* renamed from: d */
    private static zzjj m15710d(zzjj zzjj) {
        Parcel obtain = Parcel.obtain();
        zzjj.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzjj zzjj2 = (zzjj) zzjj.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return ((Boolean) aoq.m14620f().mo14695a(aru.f11789aN)).booleanValue() ? zzjj2.mo16264a() : zzjj2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ayi mo14956a(zzjj zzjj, String str) {
        if (m15707b(str)) {
            return null;
        }
        int i = new C3791fd(this.f12383c.mo14931a()).mo15287a().f13061n;
        zzjj c = m15708c(zzjj);
        String c2 = m15709c(str);
        ayg ayg = new ayg(c, c2, i);
        ayh ayh = (ayh) this.f12381a.get(ayg);
        if (ayh == null) {
            m15703a("Interstitial pool created at %s.", ayg);
            ayh = new ayh(c, c2, i);
            this.f12381a.put(ayg, ayh);
        }
        this.f12382b.remove(ayg);
        this.f12382b.add(ayg);
        ayh.mo14972g();
        while (true) {
            if (this.f12382b.size() <= ((Integer) aoq.m14620f().mo14695a(aru.f11799aX)).intValue()) {
                break;
            }
            ayg ayg2 = (ayg) this.f12382b.remove();
            ayh ayh2 = (ayh) this.f12381a.get(ayg2);
            m15703a("Evicting interstitial queue for %s.", ayg2);
            while (ayh2.mo14969d() > 0) {
                ayi a = ayh2.mo14963a((zzjj) null);
                if (a.f12394e) {
                    ayk.m15729a().mo14977c();
                }
                a.f12390a.mo12649K();
            }
            this.f12381a.remove(ayg2);
        }
        while (ayh.mo14969d() > 0) {
            ayi a2 = ayh.mo14963a(c);
            if (a2.f12394e) {
                if (C3025aw.m10924l().mo13694a() - a2.f12393d > 1000 * ((long) ((Integer) aoq.m14620f().mo14695a(aru.f11801aZ)).intValue())) {
                    m15703a("Expired interstitial at %s.", ayg);
                    ayk.m15729a().mo14976b();
                }
            }
            String str2 = a2.f12391b != null ? " (inline) " : " ";
            StringBuilder sb = new StringBuilder(34 + String.valueOf(str2).length());
            sb.append("Pooled interstitial");
            sb.append(str2);
            sb.append("returned at %s.");
            m15703a(sb.toString(), ayg);
            return a2;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14957a() {
        if (this.f12383c != null) {
            for (Entry entry : this.f12381a.entrySet()) {
                ayg ayg = (ayg) entry.getKey();
                ayh ayh = (ayh) entry.getValue();
                if (C3900je.m17428a(2)) {
                    int d = ayh.mo14969d();
                    int e = ayh.mo14970e();
                    if (e < d) {
                        C3900je.m17043a(String.format("Loading %s/%s pooled interstitials for %s.", new Object[]{Integer.valueOf(d - e), Integer.valueOf(d), ayg}));
                    }
                }
                int f = 0 + ayh.mo14971f();
                while (true) {
                    if (ayh.mo14969d() >= ((Integer) aoq.m14620f().mo14695a(aru.f11800aY)).intValue()) {
                        break;
                    }
                    m15703a("Pooling and loading one new interstitial for %s.", ayg);
                    if (ayh.mo14966a(this.f12383c)) {
                        f++;
                    }
                }
                ayk.m15729a().mo14975a(f);
            }
            if (this.f12383c != null) {
                Editor edit = this.f12383c.mo14931a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
                edit.clear();
                for (Entry entry2 : this.f12381a.entrySet()) {
                    ayg ayg2 = (ayg) entry2.getKey();
                    ayh ayh2 = (ayh) entry2.getValue();
                    if (ayh2.mo14973h()) {
                        edit.putString(ayg2.toString(), new aym(ayh2).mo14985a());
                        m15703a("Saved interstitial queue for %s.", ayg2);
                    }
                }
                edit.putString("PoolKeys", m15706b());
                edit.apply();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14958a(axa axa) {
        if (this.f12383c == null) {
            this.f12383c = axa.mo14934b();
            if (this.f12383c != null) {
                SharedPreferences sharedPreferences = this.f12383c.mo14931a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.f12382b.size() > 0) {
                    ayg ayg = (ayg) this.f12382b.remove();
                    ayh ayh = (ayh) this.f12381a.get(ayg);
                    m15703a("Flushing interstitial queue for %s.", ayg);
                    while (ayh.mo14969d() > 0) {
                        ayh.mo14963a((zzjj) null).f12390a.mo12649K();
                    }
                    this.f12381a.remove(ayg);
                }
                try {
                    HashMap hashMap = new HashMap();
                    for (Entry entry : sharedPreferences.getAll().entrySet()) {
                        if (!((String) entry.getKey()).equals("PoolKeys")) {
                            aym a = aym.m15774a((String) entry.getValue());
                            ayg ayg2 = new ayg(a.f12413a, a.f12414b, a.f12415c);
                            if (!this.f12381a.containsKey(ayg2)) {
                                this.f12381a.put(ayg2, new ayh(a.f12413a, a.f12414b, a.f12415c));
                                hashMap.put(ayg2.toString(), ayg2);
                                m15703a("Restored interstitial queue for %s.", ayg2);
                            }
                        }
                    }
                    for (String str : m15704a(sharedPreferences.getString("PoolKeys", ""))) {
                        ayg ayg3 = (ayg) hashMap.get(str);
                        if (this.f12381a.containsKey(ayg3)) {
                            this.f12382b.add(ayg3);
                        }
                    }
                } catch (IOException | RuntimeException e) {
                    C3025aw.m10921i().mo15436a(e, "InterstitialAdPool.restore");
                    C3900je.m17432c("Malformed preferences value for InterstitialAdPool.", e);
                    this.f12381a.clear();
                    this.f12382b.clear();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14959b(zzjj zzjj, String str) {
        if (this.f12383c != null) {
            int i = new C3791fd(this.f12383c.mo14931a()).mo15287a().f13061n;
            zzjj c = m15708c(zzjj);
            String c2 = m15709c(str);
            ayg ayg = new ayg(c, c2, i);
            ayh ayh = (ayh) this.f12381a.get(ayg);
            if (ayh == null) {
                m15703a("Interstitial pool created at %s.", ayg);
                ayh = new ayh(c, c2, i);
                this.f12381a.put(ayg, ayh);
            }
            ayh.mo14965a(this.f12383c, zzjj);
            ayh.mo14972g();
            m15703a("Inline entry added to the queue at %s.", ayg);
        }
    }
}
