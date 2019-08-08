package com.facebook.ads.internal.p095v.p096a;

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.internal.v.a.h */
public class C1864h extends AsyncTask<C1868l, Void, C1870n> implements C1859c {

    /* renamed from: a */
    private static Executor f5918a;

    /* renamed from: b */
    private C1855a f5919b;

    /* renamed from: c */
    private C1858b f5920c;

    /* renamed from: d */
    private Exception f5921d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        f5918a = threadPoolExecutor;
    }

    public C1864h(C1855a aVar, C1858b bVar) {
        this.f5919b = aVar;
        this.f5920c = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1870n doInBackground(C1868l... lVarArr) {
        if (lVarArr != null) {
            try {
                if (lVarArr.length > 0) {
                    return this.f5919b.mo7839a(lVarArr[0]);
                }
            } catch (Exception e) {
                this.f5921d = e;
                cancel(true);
                return null;
            }
        }
        throw new IllegalArgumentException("DoHttpRequestTask takes exactly one argument of type HttpRequest");
    }

    /* renamed from: a */
    public void mo7860a(C1868l lVar) {
        super.executeOnExecutor(f5918a, new C1868l[]{lVar});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(C1870n nVar) {
        this.f5920c.mo7824a(nVar);
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        this.f5920c.mo7825a(this.f5921d);
    }
}
