package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.h */
public interface C3368h {
    /* renamed from: a */
    <T extends LifecycleCallback> T mo13296a(String str, Class<T> cls);

    /* renamed from: a */
    void mo13297a(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: o_ */
    Activity mo13299o_();

    void startActivityForResult(Intent intent, int i);
}
