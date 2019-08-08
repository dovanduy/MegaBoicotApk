package com.appnext.core.result;

import com.appnext.core.AppnextAd;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1345p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.core.result.c */
public interface C1371c {
    /* renamed from: aq */
    String mo5684aq();

    /* renamed from: ar */
    String mo5685ar();

    /* renamed from: as */
    String mo5686as();

    /* renamed from: at */
    C1345p mo5687at();

    /* renamed from: au */
    C1286Ad mo5688au();

    /* renamed from: av */
    C1369a mo5689av();

    JSONObject getConfigParams() throws JSONException;

    String getPlacementId();

    AppnextAd getSelectedAd();
}
