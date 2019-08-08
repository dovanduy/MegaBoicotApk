package com.startapp.android.publish.ads.video;

import android.content.Context;
import android.util.Base64;
import com.startapp.android.publish.ads.video.C5229c.C5232a;
import com.startapp.android.publish.ads.video.C5281g.C5283a;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.cache.C5456h;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import com.startapp.common.p193a.C5515e;
import com.startapp.common.p193a.C5518g;
import java.io.File;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.startapp.android.publish.ads.video.d */
/* compiled from: StartAppSDK */
public class C5249d {

    /* renamed from: a */
    private static C5249d f16894a = new C5249d();

    /* renamed from: b */
    private LinkedList<C5456h> f16895b = new LinkedList<>();

    private C5249d() {
    }

    /* renamed from: a */
    public void mo19358a(Context context, String str, C5283a aVar, C5232a aVar2) {
        C5558a aVar3 = C5558a.HIGH;
        final Context context2 = context;
        final String str2 = str;
        final C5283a aVar4 = aVar;
        final C5232a aVar5 = aVar2;
        C52501 r1 = new Runnable() {
            public void run() {
                C5249d.this.m22480b(context2, str2, aVar4, aVar5);
            }
        };
        C5554g.m23702a(aVar3, (Runnable) r1);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m22480b(final Context context, String str, final C5283a aVar, final C5232a aVar2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Full cache: ");
        sb.append(str);
        C5518g.m23563a("VideoAdCacheManager", 3, sb.toString());
        m22477a(context);
        try {
            URL url = new URL(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(url.getHost());
            sb2.append(url.getPath().replace("/", "_"));
            String sb3 = sb2.toString();
            try {
                String substring = sb3.substring(0, sb3.lastIndexOf(46));
                String substring2 = sb3.substring(sb3.lastIndexOf(46));
                StringBuilder sb4 = new StringBuilder();
                sb4.append(new String(Base64.encodeToString(MessageDigest.getInstance("MD5").digest(substring.getBytes()), 0)).replaceAll("[^a-zA-Z0-9]+", "_"));
                sb4.append(substring2);
                str2 = sb4.toString();
            } catch (NoSuchAlgorithmException e) {
                String str3 = "VideoAdCacheManager";
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Error applying MD5 digest to filename ");
                sb5.append(sb3);
                C5518g.m23564a(str3, 6, sb5.toString(), e);
                str2 = sb3;
            }
            final C5456h hVar = new C5456h(str2);
            C5281g gVar = new C5281g(context, url, str2, new C5283a() {
                /* renamed from: a */
                public void mo19255a(String str) {
                    if (aVar != null) {
                        aVar.mo19255a(str);
                    }
                    if (str != null) {
                        hVar.mo20135a(System.currentTimeMillis());
                        hVar.mo20136a(str);
                        C5249d.this.mo19357a(context, hVar);
                    }
                }
            }, new C5232a() {
                /* renamed from: a */
                public void mo19256a(String str) {
                    if (aVar2 != null) {
                        aVar2.mo19256a(str);
                    }
                }
            });
            gVar.mo19408a();
        } catch (MalformedURLException e2) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Malformed url ");
            sb6.append(str);
            C5518g.m23564a("VideoAdCacheManager", 6, sb6.toString(), e2);
            if (aVar != null) {
                aVar.mo19255a(null);
            }
        }
    }

    /* renamed from: a */
    public boolean mo19359a(int i) {
        Iterator it = this.f16895b.iterator();
        boolean z = false;
        while (it.hasNext() && this.f16895b.size() > i) {
            C5456h hVar = (C5456h) it.next();
            if (!C5284h.m22597a(hVar.mo20137b())) {
                z = true;
                it.remove();
                if (hVar.mo20137b() != null) {
                    new File(hVar.mo20137b()).delete();
                    StringBuilder sb = new StringBuilder();
                    sb.append("cachedVideoAds reached the maximum of ");
                    sb.append(i);
                    sb.append(" videos - removed ");
                    sb.append(hVar.mo20134a());
                    sb.append(" Size = ");
                    sb.append(this.f16895b.size());
                    C5518g.m23563a("VideoAdCacheManager", 3, sb.toString());
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19357a(Context context, C5456h hVar) {
        if (this.f16895b.contains(hVar)) {
            this.f16895b.remove(hVar);
            StringBuilder sb = new StringBuilder();
            sb.append("cachedVideoAds already contained ");
            sb.append(hVar.mo20134a());
            sb.append(" - removed. Size = ");
            sb.append(this.f16895b.size());
            C5518g.m23563a("VideoAdCacheManager", 3, sb.toString());
        }
        mo19359a(C5344b.m22784a().mo19756H().mo20033b() - 1);
        this.f16895b.add(hVar);
        m22479b(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Added ");
        sb2.append(hVar.mo20134a());
        sb2.append(" to cachedVideoAds. Size = ");
        sb2.append(this.f16895b.size());
        C5518g.m23563a("VideoAdCacheManager", 3, sb2.toString());
    }

    /* renamed from: a */
    private void m22477a(Context context) {
        if (this.f16895b == null) {
            this.f16895b = (LinkedList) C5515e.m23542a(context, "CachedAds", LinkedList.class);
            if (this.f16895b == null) {
                this.f16895b = new LinkedList<>();
            }
            if (mo19359a(C5344b.m22784a().mo19756H().mo20033b())) {
                m22479b(context);
            }
        }
    }

    /* renamed from: b */
    private void m22479b(Context context) {
        C5515e.m23555b(context, "CachedAds", (Serializable) this.f16895b);
    }

    /* renamed from: a */
    public static C5249d m22476a() {
        return f16894a;
    }
}
