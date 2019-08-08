package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Keep;
import com.google.firebase.C4928b;
import com.google.firebase.analytics.connector.C4922a;
import com.google.firebase.components.C4937a;
import com.google.firebase.components.C4942d;
import com.google.firebase.components.C4943e;
import com.google.firebase.p149a.C4921d;
import java.util.Collections;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar implements C4942d {
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C4937a<?>> getComponents() {
        return Collections.singletonList(C4937a.m21518a(C4922a.class).mo17858a(C4943e.m21542a(C4928b.class)).mo17858a(C4943e.m21542a(Context.class)).mo17858a(C4943e.m21542a(C4921d.class)).mo17857a(C4926a.f16073a).mo17859b().mo17860c());
    }
}
