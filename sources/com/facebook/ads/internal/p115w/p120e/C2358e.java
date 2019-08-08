package com.facebook.ads.internal.p115w.p120e;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p085l.C1757a;
import com.facebook.ads.internal.p095v.p096a.C1855a;
import com.facebook.ads.internal.p095v.p096a.C1870n;
import com.facebook.ads.internal.p095v.p096a.C1872p;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.w.e.e */
public class C2358e extends AsyncTask<String, Void, C2360f> {

    /* renamed from: a */
    private static final String f7427a = "e";

    /* renamed from: b */
    private static final Set<String> f7428b = new HashSet();

    /* renamed from: c */
    private Context f7429c;

    /* renamed from: d */
    private Map<String, String> f7430d;

    /* renamed from: e */
    private Map<String, String> f7431e;

    /* renamed from: f */
    private C1870n f7432f;

    /* renamed from: g */
    private C2359a f7433g;

    /* renamed from: com.facebook.ads.internal.w.e.e$a */
    public interface C2359a {
        /* renamed from: a */
        void mo8347a();

        /* renamed from: a */
        void mo8348a(C2360f fVar);
    }

    static {
        f7428b.add("#");
        f7428b.add("null");
    }

    public C2358e(Context context) {
        this(context, null, null);
    }

    public C2358e(Context context, Map<String, String> map) {
        this(context, map, null);
    }

    public C2358e(Context context, Map<String, String> map, Map<String, String> map2) {
        this.f7429c = context;
        HashMap hashMap = null;
        this.f7430d = map != null ? new HashMap<>(map) : null;
        if (map2 != null) {
            hashMap = new HashMap(map2);
        }
        this.f7431e = hashMap;
    }

    /* renamed from: a */
    private String m9120a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str3)) {
                return str;
            }
            String str4 = str.contains("?") ? "&" : "?";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str4);
            sb.append(str2);
            sb.append("=");
            sb.append(URLEncoder.encode(str3));
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    private boolean m9121a(String str) {
        C1870n a;
        C1855a a2 = C2357d.m9115a(this.f7429c);
        boolean z = false;
        try {
            if (this.f7431e != null) {
                if (this.f7431e.size() != 0) {
                    C1872p pVar = new C1872p();
                    pVar.mo7891a(this.f7431e);
                    a = a2.mo7852b(str, pVar);
                    this.f7432f = a;
                    if (this.f7432f != null && this.f7432f.mo7886a() == 200) {
                        z = true;
                    }
                    return z;
                }
            }
            a = a2.mo7841a(str, (C1872p) null);
            this.f7432f = a;
            z = true;
            return z;
        } catch (Exception e) {
            String str2 = f7427a;
            StringBuilder sb = new StringBuilder();
            sb.append("Error opening url: ");
            sb.append(str);
            Log.e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    private String m9122b(String str) {
        try {
            return m9120a(str, "analog", C2323k.m9046a(C1757a.m7289a()));
        } catch (Exception unused) {
            return str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2360f doInBackground(String... strArr) {
        String str = strArr[0];
        if (TextUtils.isEmpty(str) || f7428b.contains(str)) {
            return null;
        }
        String b = m9122b(str);
        if (this.f7430d != null && !this.f7430d.isEmpty()) {
            for (Entry entry : this.f7430d.entrySet()) {
                b = m9120a(b, (String) entry.getKey(), (String) entry.getValue());
            }
        }
        int i = 1;
        while (true) {
            int i2 = i + 1;
            if (i > 2) {
                break;
            } else if (m9121a(b)) {
                return new C2360f(this.f7432f);
            } else {
                i = i2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo8761a(C2359a aVar) {
        this.f7433g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(C2360f fVar) {
        if (this.f7433g != null) {
            this.f7433g.mo8348a(fVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        if (this.f7433g != null) {
            this.f7433g.mo8347a();
        }
    }
}
