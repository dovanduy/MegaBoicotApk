package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.ads.mf */
final class C3982mf {

    /* renamed from: a */
    long f13570a;

    /* renamed from: b */
    final String f13571b;

    /* renamed from: c */
    final String f13572c;

    /* renamed from: d */
    final long f13573d;

    /* renamed from: e */
    final long f13574e;

    /* renamed from: f */
    final long f13575f;

    /* renamed from: g */
    final long f13576g;

    /* renamed from: h */
    final List<C3667app> f13577h;

    C3982mf(String str, agn agn) {
        List list;
        agn agn2 = agn;
        String str2 = agn2.f10983b;
        long j = agn2.f10984c;
        long j2 = agn2.f10985d;
        long j3 = agn2.f10986e;
        long j4 = agn2.f10987f;
        if (agn2.f10989h != null) {
            list = agn2.f10989h;
        } else {
            Map<String, String> map = agn2.f10988g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new C3667app((String) entry.getKey(), (String) entry.getValue()));
            }
            list = arrayList;
        }
        this(str, str2, j, j2, j3, j4, list);
        this.f13570a = (long) agn2.f10982a.length;
    }

    private C3982mf(String str, String str2, long j, long j2, long j3, long j4, List<C3667app> list) {
        this.f13571b = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        this.f13572c = str2;
        this.f13573d = j;
        this.f13574e = j2;
        this.f13575f = j3;
        this.f13576g = j4;
        this.f13577h = list;
    }

    /* renamed from: a */
    static C3982mf m17420a(C4009nf nfVar) throws IOException {
        if (C3954le.m17317a((InputStream) nfVar) != 538247942) {
            throw new IOException();
        }
        C3982mf mfVar = new C3982mf(C3954le.m17319a(nfVar), C3954le.m17319a(nfVar), C3954le.m17325b((InputStream) nfVar), C3954le.m17325b((InputStream) nfVar), C3954le.m17325b((InputStream) nfVar), C3954le.m17325b((InputStream) nfVar), C3954le.m17326b(nfVar));
        return mfVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo15634a(OutputStream outputStream) {
        try {
            C3954le.m17320a(outputStream, 538247942);
            C3954le.m17322a(outputStream, this.f13571b);
            C3954le.m17322a(outputStream, this.f13572c == null ? "" : this.f13572c);
            C3954le.m17321a(outputStream, this.f13573d);
            C3954le.m17321a(outputStream, this.f13574e);
            C3954le.m17321a(outputStream, this.f13575f);
            C3954le.m17321a(outputStream, this.f13576g);
            List<C3667app> list = this.f13577h;
            if (list != null) {
                C3954le.m17320a(outputStream, list.size());
                for (C3667app app : list) {
                    C3954le.m17322a(outputStream, app.mo14558a());
                    C3954le.m17322a(outputStream, app.mo14559b());
                }
            } else {
                C3954le.m17320a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            C3761eb.m16554b("%s", e.toString());
            return false;
        }
    }
}
