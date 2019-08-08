package com.p055c.p056a.p057a.p058a.p067h.p068a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.h.a.b */
public abstract class C1480b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C1481a f4475a;

    /* renamed from: d */
    protected final C1482b f4476d;

    /* renamed from: com.c.a.a.a.h.a.b$a */
    public interface C1481a {
        /* renamed from: a */
        void mo6593a(C1480b bVar);
    }

    /* renamed from: com.c.a.a.a.h.a.b$b */
    public interface C1482b {
        /* renamed from: a */
        JSONObject mo6594a();

        /* renamed from: a */
        void mo6595a(JSONObject jSONObject);
    }

    public C1480b(C1482b bVar) {
        this.f4476d = bVar;
    }

    /* renamed from: a */
    public void mo6589a(C1481a aVar) {
        this.f4475a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (this.f4475a != null) {
            this.f4475a.mo6593a(this);
        }
    }

    /* renamed from: a */
    public void mo6591a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
