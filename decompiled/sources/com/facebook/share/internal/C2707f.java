package com.facebook.share.internal;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.f */
/* compiled from: OpenGraphJSONUtility */
public final class C2707f {

    /* renamed from: com.facebook.share.internal.f$a */
    /* compiled from: OpenGraphJSONUtility */
    public interface C2708a {
        /* renamed from: a */
        JSONObject mo9429a(SharePhoto sharePhoto);
    }

    /* renamed from: a */
    public static JSONObject m10336a(ShareOpenGraphAction shareOpenGraphAction, C2708a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphAction.mo9537c()) {
            jSONObject.put(str, m10334a(shareOpenGraphAction.mo9534a(str), aVar));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m10337a(ShareOpenGraphObject shareOpenGraphObject, C2708a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphObject.mo9537c()) {
            jSONObject.put(str, m10334a(shareOpenGraphObject.mo9534a(str), aVar));
        }
        return jSONObject;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r2v0, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONArray m10335a(java.util.List<java.lang.Object> r2, com.facebook.share.internal.C2707f.C2708a r3) throws org.json.JSONException {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = m10334a(r1, r3)
            r0.put(r1)
            goto L_0x0009
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C2707f.m10335a(java.util.List, com.facebook.share.internal.f$a):org.json.JSONArray");
    }

    /* renamed from: a */
    public static Object m10334a(Object obj, C2708a aVar) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            if (aVar != null) {
                return aVar.mo9429a((SharePhoto) obj);
            }
            return null;
        } else if (obj instanceof ShareOpenGraphObject) {
            return m10337a((ShareOpenGraphObject) obj, aVar);
        } else {
            if (obj instanceof List) {
                return m10335a((List) obj, aVar);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid object found for JSON serialization: ");
            sb.append(obj.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
