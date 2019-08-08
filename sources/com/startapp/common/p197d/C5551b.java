package com.startapp.common.p197d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.startapp.common.p196c.C5544b;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.common.d.b */
/* compiled from: StartAppSDK */
public class C5551b implements CookieStore {

    /* renamed from: a */
    private final CookieStore f17627a = new CookieManager().getCookieStore();

    /* renamed from: b */
    private final SharedPreferences f17628b;

    public C5551b(Context context) {
        String[] split;
        this.f17628b = context.getApplicationContext().getSharedPreferences("com.startapp.android.publish.CookiePrefsFile", 0);
        String string = this.f17628b.getString("names", null);
        if (string != null) {
            for (String str : TextUtils.split(string, ";")) {
                SharedPreferences sharedPreferences = this.f17628b;
                StringBuilder sb = new StringBuilder();
                sb.append("cookie_");
                sb.append(str);
                String string2 = sharedPreferences.getString(sb.toString(), null);
                if (string2 != null) {
                    HttpCookie httpCookie = (HttpCookie) C5544b.m23666a(string2, HttpCookie.class);
                    if (httpCookie != null) {
                        if (httpCookie.hasExpired()) {
                            m23692a(httpCookie);
                            m23695b();
                        } else {
                            this.f17627a.add(URI.create(httpCookie.getDomain()), httpCookie);
                        }
                    }
                }
            }
        }
    }

    public void add(URI uri, HttpCookie httpCookie) {
        String b = m23694b(httpCookie);
        this.f17627a.add(uri, httpCookie);
        m23693a(httpCookie, b);
        m23695b();
    }

    public List<HttpCookie> get(URI uri) {
        return this.f17627a.get(uri);
    }

    public List<HttpCookie> getCookies() {
        return this.f17627a.getCookies();
    }

    public List<URI> getURIs() {
        return this.f17627a.getURIs();
    }

    public boolean remove(URI uri, HttpCookie httpCookie) {
        if (!this.f17627a.remove(uri, httpCookie)) {
            return false;
        }
        m23692a(httpCookie);
        m23695b();
        return true;
    }

    public boolean removeAll() {
        if (!this.f17627a.removeAll()) {
            return false;
        }
        m23691a();
        m23695b();
        return true;
    }

    /* renamed from: a */
    private void m23693a(HttpCookie httpCookie, String str) {
        Editor edit = this.f17628b.edit();
        StringBuilder sb = new StringBuilder();
        sb.append("cookie_");
        sb.append(str);
        edit.putString(sb.toString(), C5544b.m23667a(httpCookie));
        edit.commit();
    }

    /* renamed from: a */
    private void m23691a() {
        Editor edit = this.f17628b.edit();
        edit.clear();
        edit.commit();
    }

    /* renamed from: a */
    private void m23692a(HttpCookie httpCookie) {
        Editor edit = this.f17628b.edit();
        StringBuilder sb = new StringBuilder();
        sb.append("cookie_");
        sb.append(m23694b(httpCookie));
        edit.remove(sb.toString());
        edit.commit();
    }

    /* renamed from: b */
    private void m23695b() {
        Editor edit = this.f17628b.edit();
        edit.putString("names", TextUtils.join(";", m23696c()));
        edit.commit();
    }

    /* renamed from: b */
    private String m23694b(HttpCookie httpCookie) {
        StringBuilder sb = new StringBuilder();
        sb.append(httpCookie.getDomain());
        sb.append("_");
        sb.append(httpCookie.getName());
        return sb.toString();
    }

    /* renamed from: c */
    private Set<String> m23696c() {
        HashSet hashSet = new HashSet();
        for (HttpCookie b : this.f17627a.getCookies()) {
            hashSet.add(m23694b(b));
        }
        return hashSet;
    }
}
