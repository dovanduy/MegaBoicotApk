package com.appnext.base.operations;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.appnext.base.C1222a;
import com.appnext.base.C1222a.C1223a;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p042a.p045c.C1237d;
import com.appnext.base.p046b.C1243b;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1251i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.base.operations.a */
public abstract class C1265a {

    /* renamed from: hg */
    private static final String f4011hg = "collectedData";

    /* renamed from: hh */
    private static final String f4012hh = "collectedDataType";

    /* renamed from: hi */
    private static final String f4013hi = "lastCollectedData";

    /* renamed from: hf */
    private C1266a f4014hf;

    /* renamed from: hj */
    protected C1231c f4015hj;

    /* renamed from: com.appnext.base.operations.a$a */
    public interface C1266a {
        /* renamed from: b */
        void mo6016b(C1222a aVar);

        /* renamed from: bC */
        void mo6017bC();
    }

    /* renamed from: bu */
    protected static boolean m5359bu() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<C1230b> mo5998b(List<C1230b> list) {
        return list;
    }

    /* renamed from: bA */
    public boolean mo5999bA() {
        return true;
    }

    /* renamed from: bx */
    public abstract void mo6007bx();

    /* renamed from: by */
    public abstract void mo6008by();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public HashMap<Pair<String, String>, JSONArray> mo6010c(HashMap<Pair<String, String>, JSONArray> hashMap) {
        return hashMap;
    }

    public void cancel() {
    }

    /* access modifiers changed from: protected */
    public abstract List<C1230b> getData();

    /* access modifiers changed from: protected */
    public abstract String getKey();

    public C1265a(C1231c cVar, Bundle bundle, Object obj) {
        this.f4015hj = cVar;
    }

    /* renamed from: a */
    public final void mo5997a(C1266a aVar) {
        this.f4014hf = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo5995a(List<C1230b> list) {
        try {
            JSONArray a = C1243b.m5256a(list, true);
            if (a == null || a.length() <= 0) {
                return -1;
            }
            return mo6006bw().mo5934a(a);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bq */
    public final void mo6001bq() {
        try {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            String key = this.f4015hj.getKey();
            C1251i ck = C1251i.m5302ck();
            StringBuilder sb = new StringBuilder();
            sb.append(key);
            sb.append(C1251i.f3984jw);
            ck.putLong(sb.toString(), valueOf.longValue());
            List data = getData();
            if (data != null && !data.isEmpty()) {
                mo5995a(data);
            }
            String key2 = getKey();
            if (data != null) {
                JSONArray d = m5361d(data);
                if (d != null) {
                    C1251i.m5302ck().putString(m5358aj(key2), d.toString());
                }
            }
        } catch (Throwable unused) {
            return;
        }
        String key3 = this.f4015hj.getKey();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(key3);
            sb2.append(C1251i.f3983jv);
            C1251i.m5302ck().putLong(sb2.toString(), System.currentTimeMillis());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(key3);
            sb3.append(C1251i.f3985jx);
            String sb4 = sb3.toString();
            C1251i.m5302ck().putInt(sb4, C1251i.m5302ck().getInt(sb4, 0) + 1);
        } catch (Throwable unused2) {
        }
        C1222a aVar = null;
        if (mo6005bv()) {
            Map bs = mo6003bs();
            if (bs != null && !bs.isEmpty()) {
                Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                String key4 = this.f4015hj.getKey();
                C1251i ck2 = C1251i.m5302ck();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(key4);
                sb5.append(C1251i.f3984jw);
                Long.valueOf(ck2.getLong(sb5.toString(), -1));
                C1251i ck3 = C1251i.m5302ck();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(key4);
                sb6.append(C1251i.f3984jw);
                ck3.putLong(sb6.toString(), valueOf2.longValue());
                if (!C1243b.m5258a(key4, bs)) {
                    aVar = new C1222a(C1223a.NoInternet$1d8b5b4a);
                }
            }
        }
        mo5996a(aVar);
    }

    /* renamed from: a */
    private boolean m5357a(Map<String, String> map) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        String key = this.f4015hj.getKey();
        C1251i ck = C1251i.m5302ck();
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        sb.append(C1251i.f3984jw);
        Long.valueOf(ck.getLong(sb.toString(), -1));
        C1251i ck2 = C1251i.m5302ck();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(key);
        sb2.append(C1251i.f3984jw);
        ck2.putLong(sb2.toString(), valueOf.longValue());
        return C1243b.m5258a(key, map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: br */
    public List<C1230b> mo6002br() {
        return mo6006bw().mo5937af(this.f4015hj.getKey());
    }

    /* access modifiers changed from: protected */
    /* renamed from: bs */
    public final Map<String, String> mo6003bs() {
        List br = mo6002br();
        if (br == null || br.isEmpty()) {
            return null;
        }
        List<C1230b> b = mo5998b(br);
        if (b == null || b.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C1230b bVar : b) {
            Pair pair = new Pair(bVar.mo5897aY(), bVar.getType());
            if (hashMap.containsKey(pair)) {
                ((JSONArray) hashMap.get(pair)).put(m5362d(bVar));
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(m5362d(bVar));
                hashMap.put(pair, jSONArray);
            }
        }
        HashMap c = mo6010c(hashMap);
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Entry entry : c.entrySet()) {
            String str = (String) ((Pair) entry.getKey()).second;
            hashMap2.put(str, ((JSONArray) entry.getValue()).toString());
            arrayList.add(str);
        }
        String key = this.f4015hj.getKey();
        if (key != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(key);
                sb.append(C1251i.f3985jx);
                C1251i.m5302ck().putInt(sb.toString(), 0);
            } catch (Throwable unused) {
            }
        }
        m5360c((List<String>) arrayList);
        C1243b.m5260ar(this.f4015hj.getKey());
        return hashMap2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bt */
    public final C1231c mo6004bt() {
        return this.f4015hj;
    }

    /* renamed from: d */
    private static JSONObject m5362d(C1230b bVar) {
        return C1243b.m5257a(bVar.mo5898aZ(), bVar.mo5899ba(), C1246a.valueOf(bVar.getDataType()));
    }

    /* renamed from: a */
    public final void mo5996a(C1222a aVar) {
        C1268c.m5390bF().mo6020a(this);
        if (this.f4014hf != null) {
            if (aVar != null) {
                this.f4014hf.mo6016b(aVar);
                return;
            }
            this.f4014hf.mo6017bC();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bv */
    public boolean mo6005bv() {
        return C1243b.m5264d(this.f4015hj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bw */
    public C1237d mo6006bw() {
        return C1224a.m5161aN().mo5887aQ();
    }

    /* renamed from: c */
    private void m5360c(List<String> list) {
        if (!list.isEmpty()) {
            C1237d bw = mo6006bw();
            for (String ad : list) {
                bw.mo5935ad(ad);
            }
        }
    }

    /* renamed from: bz */
    public final boolean mo6009bz() {
        try {
            String key = this.f4015hj.getKey();
            C1251i ck = C1251i.m5302ck();
            StringBuilder sb = new StringBuilder();
            sb.append(key);
            sb.append(C1251i.f3984jw);
            if (System.currentTimeMillis() - Long.valueOf(ck.getLong(sb.toString(), -1)).longValue() >= 900000) {
                return mo5999bA();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(key);
            sb2.append(" less then interval");
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bB */
    public C1246a mo6000bB() {
        return C1246a.String;
    }

    /* access modifiers changed from: protected */
    public Date getDate() {
        return new Date();
    }

    /* renamed from: a */
    private void m5356a(String str, List<C1230b> list) {
        if (list != null) {
            try {
                JSONArray d = m5361d(list);
                if (d != null) {
                    C1251i.m5302ck().putString(m5358aj(str), d.toString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: aj */
    private static String m5358aj(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f4013hi);
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    private static JSONArray m5361d(List<C1230b> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (C1230b bVar : list) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(f4011hg, bVar.mo5898aZ());
                        jSONObject.put(f4012hh, bVar.getType());
                        jSONArray.put(jSONObject);
                    }
                    return jSONArray;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo6012e(List<C1230b> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    JSONArray d = m5361d(list);
                    if (d != null) {
                        String jSONArray = d.toString();
                        String string = C1251i.m5302ck().getString(m5358aj(getKey()), null);
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(jSONArray) && string.equals(jSONArray)) {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }
}
