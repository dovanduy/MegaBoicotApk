package com.startapp.android.publish.ads.list3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.startapp.android.publish.adsCommon.C5402i;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.common.p193a.C5513d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.startapp.android.publish.ads.list3d.a */
/* compiled from: StartAppSDK */
public class C5157a {

    /* renamed from: a */
    HashMap<String, C5402i> f16582a = new HashMap<>();

    /* renamed from: b */
    Hashtable<String, Bitmap> f16583b = new Hashtable<>();

    /* renamed from: c */
    Set<String> f16584c = new HashSet();

    /* renamed from: d */
    C5170g f16585d;

    /* renamed from: e */
    int f16586e = 0;

    /* renamed from: f */
    ConcurrentLinkedQueue<C5159b> f16587f = new ConcurrentLinkedQueue<>();

    /* renamed from: com.startapp.android.publish.ads.list3d.a$a */
    /* compiled from: StartAppSDK */
    private class C5158a extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        int f16588a = -1;

        /* renamed from: b */
        String f16589b;

        /* renamed from: c */
        String f16590c;

        public C5158a(int i, String str, String str2) {
            this.f16588a = i;
            this.f16589b = str;
            this.f16590c = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            return C5513d.m23541b(this.f16590c);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            C5157a.this.f16586e--;
            if (bitmap != null) {
                C5157a.this.f16583b.put(this.f16589b, bitmap);
                if (C5157a.this.f16585d != null) {
                    C5157a.this.f16585d.mo18975a(this.f16588a);
                }
                C5157a.this.mo19026e();
            }
        }
    }

    /* renamed from: com.startapp.android.publish.ads.list3d.a$b */
    /* compiled from: StartAppSDK */
    class C5159b {

        /* renamed from: a */
        int f16592a;

        /* renamed from: b */
        String f16593b;

        /* renamed from: c */
        String f16594c;

        public C5159b(int i, String str, String str2) {
            this.f16592a = i;
            this.f16593b = str;
            this.f16594c = str2;
        }
    }

    /* renamed from: a */
    public void mo19021a(C5170g gVar, boolean z) {
        this.f16585d = gVar;
        if (z) {
            mo19019a();
        }
    }

    /* renamed from: a */
    public void mo19019a() {
        this.f16584c.clear();
        this.f16586e = 0;
        this.f16587f.clear();
        if (this.f16582a != null) {
            for (String str : this.f16582a.keySet()) {
                ((C5402i) this.f16582a.get(str)).mo19950a(false);
            }
            this.f16582a.clear();
        }
    }

    /* renamed from: a */
    public void mo19020a(Context context, String str, String str2, C5363b bVar, long j) {
        if (!this.f16582a.containsKey(str2)) {
            C5402i iVar = new C5402i(context, new String[]{str2}, bVar, j);
            this.f16582a.put(str2, iVar);
            iVar.mo19948a();
        }
    }

    /* renamed from: a */
    public void mo19022a(String str) {
        if (this.f16582a != null && this.f16582a.containsKey(str) && this.f16582a.get(str) != null) {
            ((C5402i) this.f16582a.get(str)).mo19950a(true);
        }
    }

    /* renamed from: b */
    public void mo19023b() {
        for (String str : this.f16582a.keySet()) {
            if (this.f16582a.get(str) != null) {
                ((C5402i) this.f16582a.get(str)).mo19951b();
            }
        }
    }

    /* renamed from: c */
    public void mo19024c() {
        for (String str : this.f16582a.keySet()) {
            if (this.f16582a.get(str) != null) {
                ((C5402i) this.f16582a.get(str)).mo19948a();
            }
        }
    }

    /* renamed from: d */
    public void mo19025d() {
        for (String str : this.f16582a.keySet()) {
            if (this.f16582a.get(str) != null) {
                ((C5402i) this.f16582a.get(str)).mo19950a(false);
            }
        }
    }

    /* renamed from: a */
    public Bitmap mo19018a(int i, String str, String str2) {
        Bitmap bitmap = (Bitmap) this.f16583b.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (!this.f16584c.contains(str)) {
            this.f16584c.add(str);
            if (this.f16586e >= 15) {
                this.f16587f.add(new C5159b(i, str, str2));
            } else {
                this.f16586e++;
                new C5158a(i, str, str2).execute(new Void[0]);
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo19026e() {
        if (!this.f16587f.isEmpty()) {
            C5159b bVar = (C5159b) this.f16587f.poll();
            new C5158a(bVar.f16592a, bVar.f16593b, bVar.f16594c).execute(new Void[0]);
        }
    }
}
