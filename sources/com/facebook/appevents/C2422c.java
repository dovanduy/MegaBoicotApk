package com.facebook.appevents;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.facebook.C2579j;
import com.facebook.C2757u;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2563u;
import com.google.android.exoplayer2.C2793C;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.c */
/* compiled from: AppEvent */
class C2422c implements Serializable {

    /* renamed from: a */
    private static final HashSet<String> f7674a = new HashSet<>();

    /* renamed from: b */
    private final JSONObject f7675b;

    /* renamed from: c */
    private final boolean f7676c;

    /* renamed from: d */
    private final String f7677d;

    /* renamed from: e */
    private final String f7678e;

    /* renamed from: com.facebook.appevents.c$a */
    /* compiled from: AppEvent */
    static class C2424a implements Serializable {

        /* renamed from: a */
        private final String f7679a;

        /* renamed from: b */
        private final boolean f7680b;

        private Object readResolve() throws JSONException {
            return new C2422c(this.f7679a, this.f7680b, null);
        }
    }

    /* renamed from: com.facebook.appevents.c$b */
    /* compiled from: AppEvent */
    static class C2425b implements Serializable {

        /* renamed from: a */
        private final String f7681a;

        /* renamed from: b */
        private final boolean f7682b;

        /* renamed from: c */
        private final String f7683c;

        private C2425b(String str, boolean z, String str2) {
            this.f7681a = str;
            this.f7682b = z;
            this.f7683c = str2;
        }

        private Object readResolve() throws JSONException {
            return new C2422c(this.f7681a, this.f7682b, this.f7683c);
        }
    }

    public C2422c(String str, String str2, Double d, Bundle bundle, boolean z, UUID uuid) throws JSONException, C2579j {
        this.f7675b = m9283a(str, str2, d, bundle, z, uuid);
        this.f7676c = z;
        this.f7677d = str2;
        this.f7678e = m9286e();
    }

    /* renamed from: a */
    public String mo8837a() {
        return this.f7677d;
    }

    private C2422c(String str, boolean z, String str2) throws JSONException {
        this.f7675b = new JSONObject(str);
        this.f7676c = z;
        this.f7677d = this.f7675b.optString("_eventName");
        this.f7678e = str2;
    }

    /* renamed from: b */
    public boolean mo8838b() {
        return this.f7676c;
    }

    /* renamed from: c */
    public JSONObject mo8839c() {
        return this.f7675b;
    }

    /* renamed from: d */
    public boolean mo8840d() {
        if (this.f7678e == null) {
            return true;
        }
        return m9286e().equals(this.f7678e);
    }

    /* renamed from: a */
    private static void m9284a(String str) throws C2579j {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new C2579j(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, Integer.valueOf(40)}));
        }
        synchronized (f7674a) {
            contains = f7674a.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (f7674a) {
                f7674a.add(str);
            }
            return;
        }
        throw new C2579j(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
    }

    /* renamed from: a */
    private static JSONObject m9283a(String str, String str2, Double d, Bundle bundle, boolean z, UUID uuid) throws C2579j, JSONException {
        m9284a(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", m9285b(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (z) {
            jSONObject.put("_implicitlyLogged", "1");
        }
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                m9284a(str3);
                Object obj = bundle.get(str3);
                if ((obj instanceof String) || (obj instanceof Number)) {
                    jSONObject.put(str3, obj.toString());
                } else {
                    throw new C2579j(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str3}));
                }
            }
        }
        if (!z) {
            C2563u.m9722a(C2757u.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    private Object writeReplace() {
        return new C2425b(this.f7675b.toString(), this.f7676c, this.f7678e);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.f7675b.optString("_eventName"), Boolean.valueOf(this.f7676c), this.f7675b.toString()});
    }

    /* renamed from: e */
    private String m9286e() {
        if (VERSION.SDK_INT > 19) {
            return m9285b(this.f7675b.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator keys = this.f7675b.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.f7675b.optString(str));
            sb.append(10);
        }
        return m9285b(sb.toString());
    }

    /* renamed from: b */
    private static String m9285b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(C2793C.UTF8_NAME);
            instance.update(bytes, 0, bytes.length);
            return m9282a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C2479ad.m9447a("Failed to generate checksum: ", (Exception) e);
            return "0";
        } catch (UnsupportedEncodingException e2) {
            C2479ad.m9447a("Failed to generate checksum: ", (Exception) e2);
            return "1";
        }
    }

    /* renamed from: a */
    private static String m9282a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte valueOf : bArr) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
        }
        return stringBuffer.toString();
    }
}
