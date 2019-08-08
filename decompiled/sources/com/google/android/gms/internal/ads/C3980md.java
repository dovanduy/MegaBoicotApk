package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.util.JsonWriter;
import com.google.android.gms.common.util.C3551c;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.common.util.C3556h;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.md */
public final class C3980md {

    /* renamed from: a */
    private static Object f13560a = new Object();

    /* renamed from: b */
    private static boolean f13561b = false;

    /* renamed from: c */
    private static boolean f13562c = false;

    /* renamed from: d */
    private static C3553e f13563d = C3556h.m12745d();

    /* renamed from: e */
    private static final Set<String> f13564e = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: f */
    private final List<String> f13565f;

    public C3980md() {
        this(null);
    }

    public C3980md(String str) {
        List<String> list;
        if (!m17412c()) {
            list = new ArrayList<>();
        } else {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String str2 = "network_request_";
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                list = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String str3 = "ad_request_";
                String valueOf2 = String.valueOf(str);
                strArr2[0] = valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3);
                String str4 = "network_request_";
                String valueOf3 = String.valueOf(uuid);
                strArr2[1] = valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4);
                list = Arrays.asList(strArr2);
            }
        }
        this.f13565f = list;
    }

    /* renamed from: a */
    public static void m17398a() {
        synchronized (f13560a) {
            f13561b = false;
            f13562c = false;
            C3987mk.m17435e("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m17399a(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m17400a(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    private static void m17400a(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                if (!f13564e.contains(str)) {
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            C3987mk.m17431c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String str2 : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(str2);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m17401a(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    private final void m17402a(String str, C3986mj mjVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f13563d.mo13694a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f13565f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            mjVar.mo15633a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            C3987mk.m17430b("unable to log", e);
        }
        m17411c(stringWriter.toString());
    }

    /* renamed from: a */
    static final /* synthetic */ void m17403a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m17400a(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name(TtmlNode.TAG_BODY).value(C3551c.m12727a(bArr));
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    public static void m17404a(boolean z) {
        synchronized (f13560a) {
            f13561b = true;
            f13562c = z;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m17405a(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        String str;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a = C3551c.m12727a(bArr);
        if (length < 10000) {
            str = TtmlNode.TAG_BODY;
        } else {
            a = C3975lz.m17372a(a);
            if (a != null) {
                str = "bodydigest";
            }
            jsonWriter.name("bodylength").value((long) length);
            jsonWriter.endObject();
        }
        jsonWriter.name(str).value(a);
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    public static boolean m17406a(Context context) {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11862bh)).booleanValue()) {
            return false;
        }
        try {
            return Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e) {
            C3987mk.m17432c("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: b */
    private final void m17407b(String str) {
        m17402a("onNetworkRequestError", (C3986mj) new C3985mi(str));
    }

    /* renamed from: b */
    private final void m17408b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        m17402a("onNetworkRequest", (C3986mj) new C3981me(str, str2, map, bArr));
    }

    /* renamed from: b */
    private final void m17409b(Map<String, ?> map, int i) {
        m17402a("onNetworkResponse", (C3986mj) new C3983mg(i, map));
    }

    /* renamed from: b */
    public static boolean m17410b() {
        boolean z;
        synchronized (f13560a) {
            z = f13561b;
        }
        return z;
    }

    /* renamed from: c */
    private static synchronized void m17411c(String str) {
        synchronized (C3980md.class) {
            C3987mk.m17433d("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String str2 = "GMA Debug CONTENT ";
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                C3987mk.m17433d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                i = i2;
            }
            C3987mk.m17433d("GMA Debug FINISH");
        }
    }

    /* renamed from: c */
    public static boolean m17412c() {
        boolean z;
        synchronized (f13560a) {
            z = f13561b && f13562c;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo15627a(String str) {
        if (m17412c() && str != null) {
            mo15632a(str.getBytes());
        }
    }

    /* renamed from: a */
    public final void mo15628a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (m17412c()) {
            m17408b(str, str2, map, bArr);
        }
    }

    /* renamed from: a */
    public final void mo15629a(HttpURLConnection httpURLConnection, int i) {
        String str;
        if (m17412c()) {
            m17409b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String str2 = "Can not get error message from error HttpURLConnection\n";
                    String valueOf = String.valueOf(e.getMessage());
                    C3987mk.m17435e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    str = null;
                }
                m17407b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo15630a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (m17412c()) {
            m17408b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* renamed from: a */
    public final void mo15631a(Map<String, ?> map, int i) {
        if (m17412c()) {
            m17409b(map, i);
            if (i < 200 || i >= 300) {
                m17407b(null);
            }
        }
    }

    /* renamed from: a */
    public final void mo15632a(byte[] bArr) {
        m17402a("onNetworkResponseBody", (C3986mj) new C3984mh(bArr));
    }
}
