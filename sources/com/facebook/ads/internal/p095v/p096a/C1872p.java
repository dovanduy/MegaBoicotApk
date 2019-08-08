package com.facebook.ads.internal.p095v.p096a;

import com.google.android.exoplayer2.C2793C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.v.a.p */
public class C1872p implements Map<String, String> {

    /* renamed from: a */
    private Map<String, String> f5936a = new HashMap();

    /* renamed from: a */
    public C1872p mo7891a(Map<? extends String, ? extends String> map) {
        putAll(map);
        return this;
    }

    /* renamed from: a */
    public String mo7892a() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f5936a.keySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            String str2 = (String) this.f5936a.get(str);
            if (str2 != null) {
                sb.append("=");
                try {
                    sb.append(URLEncoder.encode(str2, C2793C.UTF8_NAME));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String get(Object obj) {
        return (String) this.f5936a.get(obj);
    }

    /* renamed from: a */
    public String put(String str, String str2) {
        return (String) this.f5936a.put(str, str2);
    }

    /* renamed from: b */
    public C1872p mo7895b(String str, String str2) {
        this.f5936a.put(str, str2);
        return this;
    }

    /* renamed from: b */
    public String remove(Object obj) {
        return (String) this.f5936a.remove(obj);
    }

    /* renamed from: b */
    public byte[] mo7897b() {
        try {
            return mo7892a().getBytes(C2793C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void clear() {
        this.f5936a.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f5936a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f5936a.containsValue(obj);
    }

    public Set<Entry<String, String>> entrySet() {
        return this.f5936a.entrySet();
    }

    public boolean isEmpty() {
        return this.f5936a.isEmpty();
    }

    public Set<String> keySet() {
        return this.f5936a.keySet();
    }

    public void putAll(Map<? extends String, ? extends String> map) {
        this.f5936a.putAll(map);
    }

    public int size() {
        return this.f5936a.size();
    }

    public Collection<String> values() {
        return this.f5936a.values();
    }
}
