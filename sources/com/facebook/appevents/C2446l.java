package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.ads.AdError;
import com.facebook.appevents.p128b.C2409c;
import com.facebook.appevents.p128b.C2409c.C2411a;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2499b;
import com.google.android.exoplayer2.C2793C;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.l */
/* compiled from: SessionEventsState */
class C2446l {

    /* renamed from: a */
    private List<C2422c> f7729a = new ArrayList();

    /* renamed from: b */
    private List<C2422c> f7730b = new ArrayList();

    /* renamed from: c */
    private int f7731c;

    /* renamed from: d */
    private C2499b f7732d;

    /* renamed from: e */
    private String f7733e;

    /* renamed from: f */
    private final int f7734f = AdError.NETWORK_ERROR_CODE;

    public C2446l(C2499b bVar, String str) {
        this.f7732d = bVar;
        this.f7733e = str;
    }

    /* renamed from: a */
    public synchronized void mo8866a(C2422c cVar) {
        if (this.f7729a.size() + this.f7730b.size() >= 1000) {
            this.f7731c++;
        } else {
            this.f7729a.add(cVar);
        }
    }

    /* renamed from: a */
    public synchronized int mo8864a() {
        return this.f7729a.size();
    }

    /* renamed from: a */
    public synchronized void mo8867a(boolean z) {
        if (z) {
            try {
                this.f7729a.addAll(this.f7730b);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7730b.clear();
        this.f7731c = 0;
    }

    /* renamed from: a */
    public int mo8865a(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.f7731c;
            this.f7730b.addAll(this.f7729a);
            this.f7729a.clear();
            JSONArray jSONArray = new JSONArray();
            for (C2422c cVar : this.f7730b) {
                if (!cVar.mo8840d()) {
                    C2479ad.m9463b("Event with invalid checksum: %s", cVar.toString());
                } else if (z || !cVar.mo8838b()) {
                    jSONArray.put(cVar.mo8839c());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            m9342a(graphRequest, context, i, jSONArray, z2);
            return jSONArray.length();
        }
    }

    /* renamed from: b */
    public synchronized List<C2422c> mo8868b() {
        List<C2422c> list;
        list = this.f7729a;
        this.f7729a = new ArrayList();
        return list;
    }

    /* renamed from: a */
    private void m9342a(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = C2409c.m9251a(C2411a.CUSTOM_APP_EVENTS, this.f7732d, this.f7733e, z, context);
            if (this.f7731c > 0) {
                jSONObject.put("num_skipped_events", i);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        graphRequest.mo6677a(jSONObject);
        Bundle e = graphRequest.mo6682e();
        if (e == null) {
            e = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            e.putByteArray("custom_events_file", m9343a(jSONArray2));
            graphRequest.mo6675a((Object) jSONArray2);
        }
        graphRequest.mo6672a(e);
    }

    /* renamed from: a */
    private byte[] m9343a(String str) {
        try {
            return str.getBytes(C2793C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            C2479ad.m9447a("Encoding exception: ", (Exception) e);
            return null;
        }
    }
}
