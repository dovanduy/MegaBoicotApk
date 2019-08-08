package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.C2579j;
import com.facebook.internal.C2479ad;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.i */
/* compiled from: WebDialogParameters */
public class C2712i {
    /* renamed from: a */
    public static Bundle m10353a(ShareLinkContent shareLinkContent) {
        Bundle a = m10352a((ShareContent) shareLinkContent);
        C2479ad.m9441a(a, "href", shareLinkContent.mo9464a());
        C2479ad.m9442a(a, "quote", shareLinkContent.mo9477c());
        return a;
    }

    /* renamed from: a */
    public static Bundle m10354a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a = m10352a((ShareContent) shareOpenGraphContent);
        C2479ad.m9442a(a, "action_type", shareOpenGraphContent.mo9525c().mo9515a());
        try {
            JSONObject a2 = C2710h.m10349a(C2710h.m10348a(shareOpenGraphContent), false);
            if (a2 != null) {
                C2479ad.m9442a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new C2579j("Unable to serialize the ShareOpenGraphContent to JSON", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static Bundle m10352a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag b = shareContent.mo9465b();
        if (b != null) {
            C2479ad.m9442a(bundle, "hashtag", b.mo9466a());
        }
        return bundle;
    }
}
