package com.google.ads.mediation;

import com.google.ads.mediation.C2784e;

@Deprecated
/* renamed from: com.google.ads.mediation.b */
public interface C2775b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends C2784e> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
