package com.facebook.share.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.C2579j;
import com.facebook.C2581l;
import com.facebook.C2662s;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1503b;
import com.facebook.GraphRequest.ParcelableResourceWithMimeType;
import com.facebook.internal.C2475a;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2565w;
import com.facebook.internal.C2566x;
import com.facebook.share.internal.C2707f.C2708a;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.widget.LikeView.C2753e;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.h */
/* compiled from: ShareInternalUtility */
public final class C2710h {
    /* renamed from: a */
    public static boolean m10350a(int i, int i2, Intent intent, C2709g gVar) {
        C2475a a = m10345a(i, i2, intent);
        if (a == null) {
            return false;
        }
        C2565w.m9735a(a.mo8920b());
        if (gVar == null) {
            return true;
        }
        C2579j a2 = C2566x.m9746a(C2566x.m9764g(intent));
        if (a2 == null) {
            gVar.mo9412a(a, C2566x.m9760e(intent));
        } else if (a2 instanceof C2581l) {
            gVar.mo9411a(a);
        } else {
            gVar.mo9413a(a, a2);
        }
        return true;
    }

    /* renamed from: a */
    private static C2475a m10345a(int i, int i2, Intent intent) {
        UUID b = C2566x.m9753b(intent);
        if (b == null) {
            return null;
        }
        return C2475a.m9406a(b, i);
    }

    /* renamed from: a */
    public static JSONObject m10348a(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        return C2707f.m10336a(shareOpenGraphContent.mo9525c(), (C2708a) new C2708a() {
            /* renamed from: a */
            public JSONObject mo9429a(SharePhoto sharePhoto) {
                Uri c = sharePhoto.mo9542c();
                if (!C2479ad.m9452a(c)) {
                    throw new C2579j("Only web images may be used in OG objects shared via the web dialog");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", c.toString());
                    return jSONObject;
                } catch (JSONException e) {
                    throw new C2579j("Unable to attach images", (Throwable) e);
                }
            }
        });
    }

    /* renamed from: a */
    public static JSONArray m10347a(JSONArray jSONArray, boolean z) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m10347a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = m10349a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONObject m10349a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = m10349a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = m10347a((JSONArray) obj, true);
                }
                Pair a = m10342a(string);
                String str = (String) a.first;
                String str2 = (String) a.second;
                if (z) {
                    if (str == null || !str.equals("fbsdk")) {
                        if (str != null) {
                            if (!str.equals("og")) {
                                jSONObject3.put(str2, obj);
                            }
                        }
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, obj);
                } else {
                    jSONObject2.put(string, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new C2579j("Failed to create json object from share content");
        }
    }

    /* renamed from: a */
    public static Pair<String, String> m10342a(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            int i = indexOf + 1;
            if (str.length() > i) {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
                return new Pair<>(str2, str);
            }
        }
        str2 = null;
        return new Pair<>(str2, str);
    }

    /* renamed from: a */
    public static GraphRequest m10344a(AccessToken accessToken, File file, C1503b bVar) throws FileNotFoundException {
        ParcelableResourceWithMimeType parcelableResourceWithMimeType = new ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        GraphRequest graphRequest = new GraphRequest(accessToken, "me/staging_resources", bundle, C2662s.POST, bVar);
        return graphRequest;
    }

    /* renamed from: a */
    public static GraphRequest m10343a(AccessToken accessToken, Uri uri, C1503b bVar) throws FileNotFoundException {
        if (C2479ad.m9470c(uri)) {
            return m10344a(accessToken, new File(uri.getPath()), bVar);
        }
        if (!C2479ad.m9464b(uri)) {
            throw new C2579j("The image Uri must be either a file:// or content:// Uri");
        }
        ParcelableResourceWithMimeType parcelableResourceWithMimeType = new ParcelableResourceWithMimeType(uri, "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        GraphRequest graphRequest = new GraphRequest(accessToken, "me/staging_resources", bundle, C2662s.POST, bVar);
        return graphRequest;
    }

    /* renamed from: a */
    public static C2753e m10346a(C2753e eVar, C2753e eVar2) {
        if (eVar == eVar2) {
            return eVar;
        }
        if (eVar == C2753e.UNKNOWN) {
            return eVar2;
        }
        if (eVar2 == C2753e.UNKNOWN) {
            return eVar;
        }
        return null;
    }
}
