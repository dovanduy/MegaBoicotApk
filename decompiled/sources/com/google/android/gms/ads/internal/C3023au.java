package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.agw;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.ads.internal.au */
final class C3023au extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    private final /* synthetic */ C3019aq f8798a;

    private C3023au(C3019aq aqVar) {
        this.f8798a = aqVar;
    }

    /* synthetic */ C3023au(C3019aq aqVar, C3020ar arVar) {
        this(aqVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            this.f8798a.f8793h = (agw) this.f8798a.f8788c.get(((Long) aoq.m14620f().mo14695a(aru.f11933cz)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C3987mk.m17432c("", e);
        }
        return this.f8798a.mo12507c();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f8798a.f8791f != null && str != null) {
            this.f8798a.f8791f.loadUrl(str);
        }
    }
}
