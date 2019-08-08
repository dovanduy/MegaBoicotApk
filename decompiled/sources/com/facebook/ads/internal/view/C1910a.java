package com.facebook.ads.internal.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p088o.C1777d;
import com.facebook.ads.internal.view.p099a.C1916b;

/* renamed from: com.facebook.ads.internal.view.a */
public interface C1910a {

    /* renamed from: com.facebook.ads.internal.view.a$a */
    public interface C1911a {
        /* renamed from: a */
        void mo6793a(View view);

        /* renamed from: a */
        void mo6794a(View view, int i);

        /* renamed from: a */
        void mo6795a(String str);

        /* renamed from: a */
        void mo6796a(String str, C1777d dVar);

        /* renamed from: a */
        void mo6797a(String str, boolean z, C1916b bVar);
    }

    /* renamed from: a */
    void mo7268a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity);

    /* renamed from: a */
    void mo7270a(Bundle bundle);

    /* renamed from: a_ */
    void mo7271a_(boolean z);

    /* renamed from: b */
    void mo7272b(boolean z);

    void onDestroy();

    void setListener(C1911a aVar);
}
