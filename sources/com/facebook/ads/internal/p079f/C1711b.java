package com.facebook.ads.internal.p079f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.f.b */
public class C1711b {

    /* renamed from: a */
    private final List<String> f5360a = new ArrayList();

    /* renamed from: b */
    private final List<String> f5361b = new ArrayList();

    /* renamed from: com.facebook.ads.internal.f.b$a */
    public enum C1712a {
        REPORT("report"),
        HIDE("hide"),
        NONE("none");
        

        /* renamed from: d */
        private final String f5366d;

        private C1712a(String str) {
            this.f5366d = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo7476a() {
            return this.f5366d;
        }
    }

    /* renamed from: a */
    public void mo7467a() {
        this.f5360a.add(TtmlNode.START);
    }

    /* renamed from: a */
    public void mo7468a(int i) {
        this.f5361b.add(String.valueOf(i));
    }

    /* renamed from: a */
    public void mo7469a(C1712a aVar) {
        List<String> list = this.f5360a;
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.mo7476a());
        sb.append("_end");
        list.add(sb.toString());
    }

    /* renamed from: a */
    public void mo7470a(C1712a aVar, int i) {
        List<String> list = this.f5360a;
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.mo7476a());
        sb.append("_");
        sb.append(i);
        list.add(sb.toString());
    }

    /* renamed from: b */
    public void mo7471b() {
        this.f5360a.add("why_am_i_seeing_this");
    }

    /* renamed from: c */
    public void mo7472c() {
        this.f5360a.add("manage_ad_preferences");
    }

    /* renamed from: d */
    public Map<String, String> mo7473d() {
        HashMap hashMap = new HashMap();
        hashMap.put("user_journey", new JSONArray(this.f5360a).toString());
        hashMap.put("options_selected", new JSONArray(this.f5361b).toString());
        return hashMap;
    }

    /* renamed from: e */
    public boolean mo7474e() {
        return !this.f5360a.isEmpty() || !this.f5361b.isEmpty();
    }

    /* renamed from: f */
    public void mo7475f() {
        this.f5360a.clear();
        this.f5361b.clear();
    }
}
