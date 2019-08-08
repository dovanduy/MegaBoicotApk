package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: com.facebook.p */
/* compiled from: GraphRequestAsyncTask */
public class C2657p extends AsyncTask<Void, Void, List<C2661r>> {

    /* renamed from: a */
    private static final String f8259a = C2657p.class.getCanonicalName();

    /* renamed from: b */
    private final HttpURLConnection f8260b;

    /* renamed from: c */
    private final C2658q f8261c;

    /* renamed from: d */
    private Exception f8262d;

    public C2657p(C2658q qVar) {
        this(null, qVar);
    }

    public C2657p(HttpURLConnection httpURLConnection, C2658q qVar) {
        this.f8261c = qVar;
        this.f8260b = httpURLConnection;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{RequestAsyncTask: ");
        sb.append(" connection: ");
        sb.append(this.f8260b);
        sb.append(", requests: ");
        sb.append(this.f8261c);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Handler handler;
        super.onPreExecute();
        if (C2649m.m10127b()) {
            Log.d(f8259a, String.format("execute async task: %s", new Object[]{this}));
        }
        if (this.f8261c.mo9356c() == null) {
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.f8261c.mo9348a(handler);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(List<C2661r> list) {
        super.onPostExecute(list);
        if (this.f8262d != null) {
            Log.d(f8259a, String.format("onPostExecute: exception encountered during request: %s", new Object[]{this.f8262d.getMessage()}));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C2661r> doInBackground(Void... voidArr) {
        try {
            if (this.f8260b == null) {
                return this.f8261c.mo9361g();
            }
            return GraphRequest.m6212a(this.f8260b, this.f8261c);
        } catch (Exception e) {
            this.f8262d = e;
            return null;
        }
    }
}
