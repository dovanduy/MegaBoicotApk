package com.facebook.ads.internal.p070a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p120e.C2361g;
import com.google.android.exoplayer2.C2793C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.a.f */
public class C1568f extends C1570h {

    /* renamed from: e */
    private static final String f4813e = "f";

    /* renamed from: f */
    private final Uri f4814f;

    /* renamed from: g */
    private final Map<String, String> f4815g;

    /* renamed from: h */
    private final boolean f4816h;

    public C1568f(Context context, C1802c cVar, String str, Uri uri, Map<String, String> map, C1575m mVar, boolean z) {
        super(context, cVar, str, mVar);
        this.f4814f = uri;
        this.f4815g = map;
        this.f4816h = z;
    }

    /* renamed from: a */
    private Intent m6502a(C1569g gVar) {
        if (TextUtils.isEmpty(gVar.mo7066a()) || !C1566e.m6499a(this.f4805a, gVar.mo7066a())) {
            return null;
        }
        String c = gVar.mo7068c();
        if (!TextUtils.isEmpty(c) && (c.startsWith("tel:") || c.startsWith("telprompt:"))) {
            return new Intent("android.intent.action.CALL", Uri.parse(c));
        }
        PackageManager packageManager = this.f4805a.getPackageManager();
        if (TextUtils.isEmpty(gVar.mo7067b()) && TextUtils.isEmpty(c)) {
            return packageManager.getLaunchIntentForPackage(gVar.mo7066a());
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(gVar.mo7066a()) && !TextUtils.isEmpty(gVar.mo7067b())) {
            intent.setComponent(new ComponentName(gVar.mo7066a(), gVar.mo7067b()));
        }
        if (!TextUtils.isEmpty(gVar.mo7068c())) {
            intent.setData(Uri.parse(gVar.mo7068c()));
        }
        List queryIntentActivities = packageManager.queryIntentActivities(intent, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (intent.getComponent() == null) {
            Iterator it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo resolveInfo = (ResolveInfo) it.next();
                if (resolveInfo.activityInfo.packageName.equals(gVar.mo7066a())) {
                    intent.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                    break;
                }
            }
        }
        if (queryIntentActivities.isEmpty() || intent.getComponent() == null) {
            return null;
        }
        return intent;
    }

    /* renamed from: f */
    private List<C1569g> m6503f() {
        String queryParameter = this.f4814f.getQueryParameter("appsite_data");
        if (TextUtils.isEmpty(queryParameter) || "[]".equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new JSONObject(queryParameter).optJSONArray("android");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C1569g a = C1569g.m6510a(optJSONArray.optJSONObject(i));
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
        } catch (JSONException e) {
            Log.w(f4813e, "Error parsing appsite_data", e);
        }
        return arrayList;
    }

    /* renamed from: g */
    private boolean m6504g() {
        List<Intent> d = mo7064d();
        if (d == null) {
            return false;
        }
        for (Intent startActivity : d) {
            try {
                this.f4805a.startActivity(startActivity);
                return true;
            } catch (Exception e) {
                Log.d(f4813e, "Failed to open app intent, falling back", e);
            }
        }
        return false;
    }

    /* renamed from: h */
    private boolean m6505h() {
        C2361g gVar = new C2361g();
        try {
            C2361g.m9129a(gVar, this.f4805a, mo7063c(), this.f4807c);
            return true;
        } catch (Exception e) {
            String str = f4813e;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to open market url: ");
            sb.append(this.f4814f.toString());
            Log.d(str, sb.toString(), e);
            String queryParameter = this.f4814f.getQueryParameter("store_url_web_fallback");
            if (queryParameter != null && queryParameter.length() > 0) {
                C2361g.m9129a(gVar, this.f4805a, Uri.parse(queryParameter), this.f4807c);
            }
            return false;
        }
    }

    /* renamed from: b */
    public C1562a mo7059b() {
        String str = "opened_deeplink";
        C1562a aVar = null;
        if (!m6504g()) {
            try {
                str = m6505h() ? "opened_store_url" : "opened_store_fallback_url";
            } catch (Exception unused) {
                Log.d(f4813e, "Failed to open all options including fallback url, can't open anything");
                aVar = C1562a.CANNOT_OPEN;
            }
        }
        this.f4815g.put(str, String.valueOf(true));
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Uri mo7063c() {
        String queryParameter = this.f4814f.getQueryParameter("store_url");
        if (!TextUtils.isEmpty(queryParameter)) {
            return Uri.parse(queryParameter);
        }
        return Uri.parse(String.format(Locale.US, "market://details?id=%s", new Object[]{this.f4814f.getQueryParameter("store_id")}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List<Intent> mo7064d() {
        List<C1569g> f = m6503f();
        ArrayList arrayList = new ArrayList();
        if (f != null) {
            for (C1569g a : f) {
                Intent a2 = m6502a(a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo7065e() {
        C1562a aVar;
        if (!this.f4816h) {
            aVar = mo7059b();
        } else {
            this.f4815g.put("opened_store_url", String.valueOf(true));
            aVar = null;
        }
        mo7069a(this.f4815g, aVar);
    }
}
