package com.appnext.core;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import java.net.HttpRetryException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.core.p */
public abstract class C1345p {

    /* renamed from: lA */
    protected static final String f4246lA = "http://cdn.appnext.com/tools/sdk/confign";

    /* renamed from: bm */
    protected HashMap<String, String> f4247bm = null;

    /* renamed from: lB */
    protected HashMap<String, Object> f4248lB = null;

    /* renamed from: lC */
    private ArrayList<C1347a> f4249lC;
    /* access modifiers changed from: private */
    public int state = 0;

    /* renamed from: com.appnext.core.p$a */
    public interface C1347a {
        /* renamed from: a */
        void mo5535a(HashMap<String, Object> hashMap);

        void error(String str);
    }

    /* renamed from: com.appnext.core.p$b */
    private class C1348b extends AsyncTask<Object, Void, String> {
        private C1348b() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m5745a(objArr);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            super.onPostExecute(str);
            if (str == null) {
                C1345p.this.state = 0;
                C1345p.m5729a(C1345p.this, "unknown error");
            } else if (str.startsWith("error:")) {
                C1345p.this.state = 0;
                C1345p.m5729a(C1345p.this, str.substring(7));
            } else {
                try {
                    HashMap<String, Object> n = C1345p.this.mo6284n(str);
                    if (C1345p.this.f4248lB == null) {
                        C1345p.this.f4248lB = n;
                    } else {
                        C1345p.this.f4248lB.putAll(n);
                    }
                    C1345p.this.state = 2;
                    C1345p.m5730a(C1345p.this, (HashMap) C1345p.this.f4248lB);
                } catch (Throwable th) {
                    new StringBuilder("error ").append(th.getMessage());
                    C1345p.this.state = 0;
                    C1345p.m5729a(C1345p.this, "parsing error");
                }
            }
        }

        /* renamed from: a */
        protected static String m5745a(Object... objArr) {
            try {
                return C1326f.m5659a(objArr[0], objArr[1]);
            } catch (HttpRetryException e) {
                StringBuilder sb = new StringBuilder("error: ");
                sb.append(e.getReason());
                return sb.toString();
            } catch (IOException unused) {
                return "error: network problem";
            } catch (Throwable unused2) {
                return "error: Internal error";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: aS */
        public final void mo6287aS(String str) {
            super.onPostExecute(str);
            if (str == null) {
                C1345p.this.state = 0;
                C1345p.m5729a(C1345p.this, "unknown error");
            } else if (str.startsWith("error:")) {
                C1345p.this.state = 0;
                C1345p.m5729a(C1345p.this, str.substring(7));
            } else {
                try {
                    HashMap<String, Object> n = C1345p.this.mo6284n(str);
                    if (C1345p.this.f4248lB == null) {
                        C1345p.this.f4248lB = n;
                    } else {
                        C1345p.this.f4248lB.putAll(n);
                    }
                    C1345p.this.state = 2;
                    C1345p.m5730a(C1345p.this, (HashMap) C1345p.this.f4248lB);
                } catch (Throwable th) {
                    new StringBuilder("error ").append(th.getMessage());
                    C1345p.this.state = 0;
                    C1345p.m5729a(C1345p.this, "parsing error");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract HashMap<String, String> mo5567A();

    /* access modifiers changed from: protected */
    public abstract String getUrl();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract HashMap<String, String> mo5571z();

    /* renamed from: a */
    public final synchronized void mo6277a(C1347a aVar) {
        mo6276a((Context) null, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo6276a(android.content.Context r6, com.appnext.core.C1345p.C1347a r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList<com.appnext.core.p$a> r0 = r5.f4249lC     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x000c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
            r5.f4249lC = r0     // Catch:{ all -> 0x0066 }
        L_0x000c:
            int r0 = r5.state     // Catch:{ all -> 0x0066 }
            r1 = 2
            if (r0 != r1) goto L_0x001a
            if (r7 == 0) goto L_0x0064
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r5.f4248lB     // Catch:{ all -> 0x0066 }
            r7.mo5535a(r6)     // Catch:{ all -> 0x0066 }
            monitor-exit(r5)
            return
        L_0x001a:
            int r0 = r5.state     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005d
            r0 = 1
            r5.state = r0     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = r5.getUrl()     // Catch:{ all -> 0x0066 }
            if (r6 == 0) goto L_0x0030
            java.lang.String r3 = "pck"
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x0066 }
            r5.mo6285r(r3, r6)     // Catch:{ all -> 0x0066 }
        L_0x0030:
            java.lang.String r6 = "vid"
            java.lang.String r3 = com.appnext.core.C1326f.m5687cH()     // Catch:{ all -> 0x0066 }
            r5.mo6285r(r6, r3)     // Catch:{ all -> 0x0066 }
            java.lang.String r6 = r5.m5731aQ(r2)     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = "start loading config from "
            r2.<init>(r3)     // Catch:{ all -> 0x0066 }
            r2.append(r6)     // Catch:{ all -> 0x0066 }
            com.appnext.core.p$b r2 = new com.appnext.core.p$b     // Catch:{ all -> 0x0066 }
            r3 = 0
            r2.<init>()     // Catch:{ all -> 0x0066 }
            java.util.concurrent.Executor r3 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch:{ all -> 0x0066 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0066 }
            r4 = 0
            r1[r4] = r6     // Catch:{ all -> 0x0066 }
            java.util.HashMap r6 = r5.mo5571z()     // Catch:{ all -> 0x0066 }
            r1[r0] = r6     // Catch:{ all -> 0x0066 }
            r2.executeOnExecutor(r3, r1)     // Catch:{ all -> 0x0066 }
        L_0x005d:
            if (r7 == 0) goto L_0x0064
            java.util.ArrayList<com.appnext.core.p$a> r6 = r5.f4249lC     // Catch:{ all -> 0x0066 }
            r6.add(r7)     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r5)
            return
        L_0x0066:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C1345p.mo6276a(android.content.Context, com.appnext.core.p$a):void");
    }

    /* renamed from: aQ */
    private String m5731aQ(String str) {
        if (this.f4247bm == null) {
            return str;
        }
        for (String str2 : this.f4247bm.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str.contains("?") ? "&" : "?");
            sb.append(str2);
            sb.append("=");
            sb.append((String) this.f4247bm.get(str2));
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: b */
    public void mo5568b(HashMap<String, String> hashMap) {
        this.f4247bm = hashMap;
    }

    /* renamed from: r */
    public final void mo6285r(String str, String str2) {
        if (this.f4247bm == null) {
            this.f4247bm = new HashMap<>();
        }
        this.f4247bm.put(str, str2);
    }

    /* renamed from: s */
    public final void mo6286s(String str, String str2) {
        if (this.f4247bm == null) {
            this.f4247bm = new HashMap<>();
        }
        if (!this.f4247bm.containsKey(str)) {
            this.f4247bm.put(str, str2);
        }
    }

    /* renamed from: cL */
    public final HashMap<String, Object> mo6279cL() {
        return this.f4248lB;
    }

    /* renamed from: a */
    public void mo6278a(String str, String str2) {
        if (this.f4248lB == null) {
            this.f4248lB = new HashMap<>();
        }
        this.f4248lB.put(str, str2);
    }

    public final boolean isLoaded() {
        return this.state == 2;
    }

    public final String get(String str) {
        String value = getValue(str);
        if (value != null) {
            return value;
        }
        if (mo5567A().containsKey(str)) {
            return (String) mo5567A().get(str);
        }
        return null;
    }

    public final String get(String str, String str2) {
        return getValue(str) == null ? str2 : getValue(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public HashMap<String, Object> mo6284n(String str) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        JSONObject jSONObject = new JSONObject(str);
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            String string = jSONObject.getString(str2);
            try {
                JSONObject jSONObject2 = new JSONObject(string);
                Iterator keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String str3 = (String) keys2.next();
                    String string2 = jSONObject2.getString(str3);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("_");
                    sb.append(str3);
                    hashMap.put(sb.toString(), string2);
                }
            } catch (Throwable unused) {
                hashMap.put(str2, string);
            }
        }
        return hashMap;
    }

    /* renamed from: aR */
    private void m5732aR(String str) {
        synchronized ("http://cdn.appnext.com/tools/sdk/confign") {
            Iterator it = new ArrayList(this.f4249lC).iterator();
            while (it.hasNext()) {
                C1347a aVar = (C1347a) it.next();
                if (aVar != null) {
                    aVar.error(str);
                }
            }
            this.f4249lC.clear();
        }
    }

    /* renamed from: e */
    private void m5733e(HashMap<String, Object> hashMap) {
        synchronized ("http://cdn.appnext.com/tools/sdk/confign") {
            Iterator it = new ArrayList(this.f4249lC).iterator();
            while (it.hasNext()) {
                ((C1347a) it.next()).mo5535a(hashMap);
            }
            this.f4249lC.clear();
        }
    }

    public final String getValue(String str) {
        if (this.f4248lB != null && this.f4248lB.containsKey(str)) {
            return (String) this.f4248lB.get(str);
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m5729a(C1345p pVar, String str) {
        synchronized ("http://cdn.appnext.com/tools/sdk/confign") {
            Iterator it = new ArrayList(pVar.f4249lC).iterator();
            while (it.hasNext()) {
                C1347a aVar = (C1347a) it.next();
                if (aVar != null) {
                    aVar.error(str);
                }
            }
            pVar.f4249lC.clear();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5730a(C1345p pVar, HashMap hashMap) {
        synchronized ("http://cdn.appnext.com/tools/sdk/confign") {
            Iterator it = new ArrayList(pVar.f4249lC).iterator();
            while (it.hasNext()) {
                ((C1347a) it.next()).mo5535a(hashMap);
            }
            pVar.f4249lC.clear();
        }
    }
}
