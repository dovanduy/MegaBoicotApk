package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.appnext.base.p046b.C1245d;
import com.facebook.C2658q.C2659a;
import com.facebook.C2658q.C2660b;
import com.facebook.internal.C2476aa;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2484ae;
import com.facebook.internal.C2560s;
import com.facebook.internal.C2563u;
import com.google.android.exoplayer2.C2793C;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GraphRequest {

    /* renamed from: a */
    public static final String f4542a = "GraphRequest";

    /* renamed from: b */
    private static String f4543b;

    /* renamed from: c */
    private static Pattern f4544c = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: q */
    private static volatile String f4545q;

    /* renamed from: d */
    private AccessToken f4546d;

    /* renamed from: e */
    private C2662s f4547e;

    /* renamed from: f */
    private String f4548f;

    /* renamed from: g */
    private JSONObject f4549g;

    /* renamed from: h */
    private String f4550h;

    /* renamed from: i */
    private String f4551i;

    /* renamed from: j */
    private boolean f4552j;

    /* renamed from: k */
    private Bundle f4553k;

    /* renamed from: l */
    private C1503b f4554l;

    /* renamed from: m */
    private String f4555m;

    /* renamed from: n */
    private Object f4556n;

    /* renamed from: o */
    private String f4557o;

    /* renamed from: p */
    private boolean f4558p;

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Creator<ParcelableResourceWithMimeType> CREATOR = new Creator<ParcelableResourceWithMimeType>() {
            /* renamed from: a */
            public ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel);
            }

            /* renamed from: a */
            public ParcelableResourceWithMimeType[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        };

        /* renamed from: a */
        private final String f4566a;

        /* renamed from: b */
        private final RESOURCE f4567b;

        public int describeContents() {
            return 1;
        }

        /* renamed from: a */
        public String mo6694a() {
            return this.f4566a;
        }

        /* renamed from: b */
        public RESOURCE mo6695b() {
            return this.f4567b;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f4566a);
            parcel.writeParcelable(this.f4567b, i);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f4566a = str;
            this.f4567b = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f4566a = parcel.readString();
            this.f4567b = parcel.readParcelable(C2649m.m10133f().getClassLoader());
        }
    }

    /* renamed from: com.facebook.GraphRequest$a */
    private static class C1502a {

        /* renamed from: a */
        private final GraphRequest f4568a;

        /* renamed from: b */
        private final Object f4569b;

        public C1502a(GraphRequest graphRequest, Object obj) {
            this.f4568a = graphRequest;
            this.f4569b = obj;
        }

        /* renamed from: a */
        public GraphRequest mo6702a() {
            return this.f4568a;
        }

        /* renamed from: b */
        public Object mo6703b() {
            return this.f4569b;
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    public interface C1503b {
        /* renamed from: a */
        void mo6691a(C2661r rVar);
    }

    /* renamed from: com.facebook.GraphRequest$c */
    public interface C1504c {
        /* renamed from: a */
        void mo6704a(JSONObject jSONObject, C2661r rVar);
    }

    /* renamed from: com.facebook.GraphRequest$d */
    private interface C1505d {
        /* renamed from: a */
        void mo6693a(String str, String str2) throws IOException;
    }

    /* renamed from: com.facebook.GraphRequest$e */
    public interface C1506e extends C1503b {
        /* renamed from: a */
        void mo6705a(long j, long j2);
    }

    /* renamed from: com.facebook.GraphRequest$f */
    private static class C1507f implements C1505d {

        /* renamed from: a */
        private final OutputStream f4570a;

        /* renamed from: b */
        private final C2563u f4571b;

        /* renamed from: c */
        private boolean f4572c = true;

        /* renamed from: d */
        private boolean f4573d = false;

        public C1507f(OutputStream outputStream, C2563u uVar, boolean z) {
            this.f4570a = outputStream;
            this.f4571b = uVar;
            this.f4573d = z;
        }

        /* renamed from: a */
        public void mo6710a(String str, Object obj, GraphRequest graphRequest) throws IOException {
            if (this.f4570a instanceof C2763z) {
                ((C2763z) this.f4570a).mo9605a(graphRequest);
            }
            if (GraphRequest.m6236e(obj)) {
                mo6693a(str, GraphRequest.m6237f(obj));
            } else if (obj instanceof Bitmap) {
                mo6707a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                mo6713a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                mo6708a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                mo6709a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable b = parcelableResourceWithMimeType.mo6695b();
                String a = parcelableResourceWithMimeType.mo6694a();
                if (b instanceof ParcelFileDescriptor) {
                    mo6709a(str, (ParcelFileDescriptor) b, a);
                } else if (b instanceof Uri) {
                    mo6708a(str, (Uri) b, a);
                } else {
                    throw m6276b();
                }
            } else {
                throw m6276b();
            }
        }

        /* renamed from: b */
        private RuntimeException m6276b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: a */
        public void mo6712a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws IOException, JSONException {
            if (!(this.f4570a instanceof C2763z)) {
                mo6693a(str, jSONArray.toString());
                return;
            }
            C2763z zVar = (C2763z) this.f4570a;
            mo6711a(str, (String) null, (String) null);
            mo6714a("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                zVar.mo9605a(graphRequest);
                if (i > 0) {
                    mo6714a(",%s", jSONObject.toString());
                } else {
                    mo6714a("%s", jSONObject.toString());
                }
                i++;
            }
            mo6714a("]", new Object[0]);
            if (this.f4571b != null) {
                C2563u uVar = this.f4571b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                uVar.mo9073a(sb.toString(), (Object) jSONArray.toString());
            }
        }

        /* renamed from: a */
        public void mo6693a(String str, String str2) throws IOException {
            mo6711a(str, (String) null, (String) null);
            mo6715b("%s", str2);
            mo6706a();
            if (this.f4571b != null) {
                C2563u uVar = this.f4571b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                uVar.mo9073a(sb.toString(), (Object) str2);
            }
        }

        /* renamed from: a */
        public void mo6707a(String str, Bitmap bitmap) throws IOException {
            mo6711a(str, str, "image/png");
            bitmap.compress(CompressFormat.PNG, 100, this.f4570a);
            mo6715b("", new Object[0]);
            mo6706a();
            if (this.f4571b != null) {
                C2563u uVar = this.f4571b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                uVar.mo9073a(sb.toString(), (Object) "<Image>");
            }
        }

        /* renamed from: a */
        public void mo6713a(String str, byte[] bArr) throws IOException {
            mo6711a(str, str, "content/unknown");
            this.f4570a.write(bArr);
            mo6715b("", new Object[0]);
            mo6706a();
            if (this.f4571b != null) {
                C2563u uVar = this.f4571b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                uVar.mo9073a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: a */
        public void mo6708a(String str, Uri uri, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo6711a(str, str, str2);
            if (this.f4570a instanceof C2760x) {
                ((C2760x) this.f4570a).mo9604a(C2479ad.m9471d(uri));
                i = 0;
            } else {
                i = C2479ad.m9419a(C2649m.m10133f().getContentResolver().openInputStream(uri), this.f4570a) + 0;
            }
            mo6715b("", new Object[0]);
            mo6706a();
            if (this.f4571b != null) {
                C2563u uVar = this.f4571b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                uVar.mo9073a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        public void mo6709a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo6711a(str, str, str2);
            if (this.f4570a instanceof C2760x) {
                ((C2760x) this.f4570a).mo9604a(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = C2479ad.m9419a((InputStream) new AutoCloseInputStream(parcelFileDescriptor), this.f4570a) + 0;
            }
            mo6715b("", new Object[0]);
            mo6706a();
            if (this.f4571b != null) {
                C2563u uVar = this.f4571b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                uVar.mo9073a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        public void mo6706a() throws IOException {
            if (!this.f4573d) {
                mo6715b("--%s", "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
                return;
            }
            this.f4570a.write("&".getBytes());
        }

        /* renamed from: a */
        public void mo6711a(String str, String str2, String str3) throws IOException {
            if (!this.f4573d) {
                mo6714a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    mo6714a("; filename=\"%s\"", str2);
                }
                mo6715b("", new Object[0]);
                if (str3 != null) {
                    mo6715b("%s: %s", "Content-Type", str3);
                }
                mo6715b("", new Object[0]);
                return;
            }
            this.f4570a.write(String.format("%s=", new Object[]{str}).getBytes());
        }

        /* renamed from: a */
        public void mo6714a(String str, Object... objArr) throws IOException {
            if (!this.f4573d) {
                if (this.f4572c) {
                    this.f4570a.write("--".getBytes());
                    this.f4570a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
                    this.f4570a.write("\r\n".getBytes());
                    this.f4572c = false;
                }
                this.f4570a.write(String.format(str, objArr).getBytes());
                return;
            }
            this.f4570a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), C2793C.UTF8_NAME).getBytes());
        }

        /* renamed from: b */
        public void mo6715b(String str, Object... objArr) throws IOException {
            mo6714a(str, objArr);
            if (!this.f4573d) {
                mo6714a("\r\n", new Object[0]);
            }
        }
    }

    public GraphRequest() {
        this(null, null, null, null, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C2662s sVar) {
        this(accessToken, str, bundle, sVar, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C2662s sVar, C1503b bVar) {
        this(accessToken, str, bundle, sVar, bVar, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C2662s sVar, C1503b bVar, String str2) {
        this.f4552j = true;
        this.f4558p = false;
        this.f4546d = accessToken;
        this.f4548f = str;
        this.f4557o = str2;
        mo6673a(bVar);
        mo6674a(sVar);
        if (bundle != null) {
            this.f4553k = new Bundle(bundle);
        } else {
            this.f4553k = new Bundle();
        }
        if (this.f4557o == null) {
            this.f4557o = C2649m.m10134g();
        }
    }

    /* renamed from: a */
    public static GraphRequest m6205a(AccessToken accessToken, final C1504c cVar) {
        AccessToken accessToken2 = accessToken;
        GraphRequest graphRequest = new GraphRequest(accessToken2, "me", null, null, new C1503b() {
            /* renamed from: a */
            public void mo6691a(C2661r rVar) {
                if (cVar != null) {
                    cVar.mo6704a(rVar.mo9371b(), rVar);
                }
            }
        });
        return graphRequest;
    }

    /* renamed from: a */
    public static GraphRequest m6207a(AccessToken accessToken, String str, JSONObject jSONObject, C1503b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, C2662s.POST, bVar);
        graphRequest.mo6677a(jSONObject);
        return graphRequest;
    }

    /* renamed from: a */
    public static GraphRequest m6206a(AccessToken accessToken, String str, C1503b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, null, bVar);
        return graphRequest;
    }

    /* renamed from: a */
    public final JSONObject mo6671a() {
        return this.f4549g;
    }

    /* renamed from: a */
    public final void mo6677a(JSONObject jSONObject) {
        this.f4549g = jSONObject;
    }

    /* renamed from: b */
    public final String mo6679b() {
        return this.f4548f;
    }

    /* renamed from: c */
    public final C2662s mo6680c() {
        return this.f4547e;
    }

    /* renamed from: a */
    public final void mo6674a(C2662s sVar) {
        if (this.f4555m == null || sVar == C2662s.GET) {
            if (sVar == null) {
                sVar = C2662s.GET;
            }
            this.f4547e = sVar;
            return;
        }
        throw new C2579j("Can't change HTTP method on request with overridden URL.");
    }

    /* renamed from: d */
    public final String mo6681d() {
        return this.f4557o;
    }

    /* renamed from: a */
    public final void mo6676a(String str) {
        this.f4557o = str;
    }

    /* renamed from: a */
    public final void mo6678a(boolean z) {
        this.f4558p = z;
    }

    /* renamed from: e */
    public final Bundle mo6682e() {
        return this.f4553k;
    }

    /* renamed from: a */
    public final void mo6672a(Bundle bundle) {
        this.f4553k = bundle;
    }

    /* renamed from: f */
    public final AccessToken mo6683f() {
        return this.f4546d;
    }

    /* renamed from: g */
    public final C1503b mo6684g() {
        return this.f4554l;
    }

    /* renamed from: a */
    public final void mo6673a(final C1503b bVar) {
        if (C2649m.m10125a(C2757u.GRAPH_API_DEBUG_INFO) || C2649m.m10125a(C2757u.GRAPH_API_DEBUG_WARNING)) {
            this.f4554l = new C1503b() {
                /* renamed from: a */
                public void mo6691a(C2661r rVar) {
                    JSONObject b = rVar.mo9371b();
                    JSONObject optJSONObject = b != null ? b.optJSONObject("__debug__") : null;
                    JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                            String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                            String optString2 = optJSONObject2 != null ? optJSONObject2.optString(C1245d.f3961jd) : null;
                            String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                            if (!(optString == null || optString2 == null)) {
                                C2757u uVar = C2757u.GRAPH_API_DEBUG_INFO;
                                if (optString2.equals("warning")) {
                                    uVar = C2757u.GRAPH_API_DEBUG_WARNING;
                                }
                                if (!C2479ad.m9456a(optString3)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(optString);
                                    sb.append(" Link: ");
                                    sb.append(optString3);
                                    optString = sb.toString();
                                }
                                C2563u.m9721a(uVar, GraphRequest.f4542a, optString);
                            }
                        }
                    }
                    if (bVar != null) {
                        bVar.mo6691a(rVar);
                    }
                }
            };
        } else {
            this.f4554l = bVar;
        }
    }

    /* renamed from: a */
    public final void mo6675a(Object obj) {
        this.f4556n = obj;
    }

    /* renamed from: h */
    public final Object mo6685h() {
        return this.f4556n;
    }

    /* renamed from: i */
    public final C2661r mo6686i() {
        return m6208a(this);
    }

    /* renamed from: j */
    public final C2657p mo6687j() {
        return m6226b(this);
    }

    /* renamed from: a */
    public static HttpURLConnection m6210a(C2658q qVar) {
        URL url;
        m6233d(qVar);
        try {
            if (qVar.size() == 1) {
                url = new URL(qVar.get(0).mo6689l());
            } else {
                url = new URL(C2476aa.m9411b());
            }
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection a = m6211a(url);
                try {
                    m6218a(qVar, a);
                    return a;
                } catch (IOException | JSONException e) {
                    e = e;
                    httpURLConnection = a;
                    C2479ad.m9449a((URLConnection) httpURLConnection);
                    throw new C2579j("could not construct request body", e);
                }
            } catch (IOException | JSONException e2) {
                e = e2;
                C2479ad.m9449a((URLConnection) httpURLConnection);
                throw new C2579j("could not construct request body", e);
            }
        } catch (MalformedURLException e3) {
            throw new C2579j("could not construct URL for request", (Throwable) e3);
        }
    }

    /* renamed from: a */
    public static C2661r m6208a(GraphRequest graphRequest) {
        List a = m6214a(graphRequest);
        if (a != null && a.size() == 1) {
            return (C2661r) a.get(0);
        }
        throw new C2579j("invalid state: expected a single response");
    }

    /* renamed from: a */
    public static List<C2661r> m6214a(GraphRequest... graphRequestArr) {
        C2484ae.m9489a((Object) graphRequestArr, "requests");
        return m6213a((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* renamed from: a */
    public static List<C2661r> m6213a(Collection<GraphRequest> collection) {
        return m6227b(new C2658q(collection));
    }

    /* renamed from: b */
    public static List<C2661r> m6227b(C2658q qVar) {
        C2484ae.m9497c(qVar, "requests");
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection a = m6210a(qVar);
            try {
                List<C2661r> a2 = m6212a(a, qVar);
                C2479ad.m9449a((URLConnection) a);
                return a2;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = a;
                C2479ad.m9449a((URLConnection) httpURLConnection);
                throw th;
            }
        } catch (Exception e) {
            List<C2661r> a3 = C2661r.m10174a(qVar.mo9358d(), (HttpURLConnection) null, new C2579j((Throwable) e));
            m6219a(qVar, a3);
            C2479ad.m9449a((URLConnection) null);
            return a3;
        } catch (Throwable th2) {
            th = th2;
            C2479ad.m9449a((URLConnection) httpURLConnection);
            throw th;
        }
    }

    /* renamed from: b */
    public static C2657p m6226b(GraphRequest... graphRequestArr) {
        C2484ae.m9489a((Object) graphRequestArr, "requests");
        return m6225b((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* renamed from: b */
    public static C2657p m6225b(Collection<GraphRequest> collection) {
        return m6231c(new C2658q(collection));
    }

    /* renamed from: c */
    public static C2657p m6231c(C2658q qVar) {
        C2484ae.m9497c(qVar, "requests");
        C2657p pVar = new C2657p(qVar);
        pVar.executeOnExecutor(C2649m.m10131d(), new Void[0]);
        return pVar;
    }

    /* renamed from: a */
    public static List<C2661r> m6212a(HttpURLConnection httpURLConnection, C2658q qVar) {
        List<C2661r> a = C2661r.m10172a(httpURLConnection, qVar);
        C2479ad.m9449a((URLConnection) httpURLConnection);
        int size = qVar.size();
        if (size != a.size()) {
            throw new C2579j(String.format(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a.size()), Integer.valueOf(size)}));
        }
        m6219a(qVar, a);
        C2447b.m9350a().mo8874e();
        return a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        sb.append(this.f4546d == null ? "null" : this.f4546d);
        sb.append(", graphPath: ");
        sb.append(this.f4548f);
        sb.append(", graphObject: ");
        sb.append(this.f4549g);
        sb.append(", httpMethod: ");
        sb.append(this.f4547e);
        sb.append(", parameters: ");
        sb.append(this.f4553k);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static void m6219a(final C2658q qVar, List<C2661r> list) {
        int size = qVar.size();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest a = qVar.get(i);
            if (a.f4554l != null) {
                arrayList.add(new Pair(a.f4554l, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            C14993 r7 = new Runnable() {
                public void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((C1503b) pair.first).mo6691a((C2661r) pair.second);
                    }
                    for (C2659a a : qVar.mo9359e()) {
                        a.mo8876a(qVar);
                    }
                }
            };
            Handler c = qVar.mo9356c();
            if (c == null) {
                r7.run();
            } else {
                c.post(r7);
            }
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m6211a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", m6243p());
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* renamed from: m */
    private void m6240m() {
        if (this.f4546d != null) {
            if (!this.f4553k.containsKey("access_token")) {
                String d = this.f4546d.mo6614d();
                C2563u.m9723a(d);
                this.f4553k.putString("access_token", d);
            }
        } else if (!this.f4558p && !this.f4553k.containsKey("access_token")) {
            String j = C2649m.m10137j();
            String k = C2649m.m10138k();
            if (C2479ad.m9456a(j) || C2479ad.m9456a(k)) {
                Log.d(f4542a, "Warning: Request without access token missing application ID or client token.");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append("|");
                sb.append(k);
                this.f4553k.putString("access_token", sb.toString());
            }
        }
        this.f4553k.putString("sdk", "android");
        this.f4553k.putString("format", "json");
        if (C2649m.m10125a(C2757u.GRAPH_API_DEBUG_INFO)) {
            this.f4553k.putString("debug", "info");
        } else if (C2649m.m10125a(C2757u.GRAPH_API_DEBUG_WARNING)) {
            this.f4553k.putString("debug", "warning");
        }
    }

    /* renamed from: a */
    private String m6209a(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f4547e == C2662s.POST) {
            return str;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f4553k.keySet()) {
            Object obj = this.f4553k.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (m6236e(obj)) {
                buildUpon.appendQueryParameter(str2, m6237f(obj).toString());
            } else if (this.f4547e == C2662s.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final String mo6688k() {
        if (this.f4555m != null) {
            throw new C2579j("Can't override URL for a batch request");
        }
        String format = String.format("%s/%s", new Object[]{C2476aa.m9411b(), m6241n()});
        m6240m();
        Uri parse = Uri.parse(m6209a(format, Boolean.valueOf(true)));
        return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final String mo6689l() {
        String str;
        if (this.f4555m != null) {
            return this.f4555m.toString();
        }
        if (mo6680c() != C2662s.POST || this.f4548f == null || !this.f4548f.endsWith("/videos")) {
            str = C2476aa.m9411b();
        } else {
            str = C2476aa.m9412c();
        }
        String format = String.format("%s/%s", new Object[]{str, m6241n()});
        m6240m();
        return m6209a(format, Boolean.valueOf(false));
    }

    /* renamed from: n */
    private String m6241n() {
        if (f4544c.matcher(this.f4548f).matches()) {
            return this.f4548f;
        }
        return String.format("%s/%s", new Object[]{this.f4557o, this.f4548f});
    }

    /* renamed from: a */
    private void m6223a(JSONArray jSONArray, Map<String, C1502a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        if (this.f4550h != null) {
            jSONObject.put("name", this.f4550h);
            jSONObject.put("omit_response_on_success", this.f4552j);
        }
        if (this.f4551i != null) {
            jSONObject.put("depends_on", this.f4551i);
        }
        String k = mo6688k();
        jSONObject.put("relative_url", k);
        jSONObject.put("method", this.f4547e);
        if (this.f4546d != null) {
            C2563u.m9723a(this.f4546d.mo6614d());
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f4553k.keySet()) {
            Object obj = this.f4553k.get(str);
            if (m6234d(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new C1502a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f4549g != null) {
            final ArrayList arrayList2 = new ArrayList();
            m6224a(this.f4549g, k, (C1505d) new C1505d() {
                /* renamed from: a */
                public void mo6693a(String str, String str2) throws IOException {
                    arrayList2.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, C2793C.UTF8_NAME)}));
                }
            });
            jSONObject.put(TtmlNode.TAG_BODY, TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: e */
    private static boolean m6235e(C2658q qVar) {
        for (C2659a aVar : qVar.mo9359e()) {
            if (aVar instanceof C2660b) {
                return true;
            }
        }
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            if (((GraphRequest) it.next()).mo6684g() instanceof C1506e) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m6221a(HttpURLConnection httpURLConnection, boolean z) {
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            return;
        }
        httpURLConnection.setRequestProperty("Content-Type", m6242o());
    }

    /* renamed from: f */
    private static boolean m6238f(C2658q qVar) {
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            Iterator it2 = graphRequest.f4553k.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m6234d(graphRequest.f4553k.get((String) it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    static final boolean m6228b(GraphRequest graphRequest) {
        String d = graphRequest.mo6681d();
        if (C2479ad.m9456a(d)) {
            return true;
        }
        if (d.startsWith("v")) {
            d = d.substring(1);
        }
        String[] split = d.split("\\.");
        boolean z = false;
        if ((split.length >= 2 && Integer.parseInt(split[0]) > 2) || (Integer.parseInt(split[0]) >= 2 && Integer.parseInt(split[1]) >= 4)) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    static final void m6233d(C2658q qVar) {
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            if (C2662s.GET.equals(graphRequest.mo6680c()) && m6228b(graphRequest)) {
                Bundle e = graphRequest.mo6682e();
                if (!e.containsKey("fields") || C2479ad.m9456a(e.getString("fields"))) {
                    C2563u.m9720a(C2757u.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", graphRequest.mo6679b());
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r14v9, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARNING: type inference failed for: r14v10 */
    /* JADX WARNING: type inference failed for: r14v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void m6218a(com.facebook.C2658q r13, java.net.HttpURLConnection r14) throws java.io.IOException, org.json.JSONException {
        /*
            com.facebook.internal.u r6 = new com.facebook.internal.u
            com.facebook.u r0 = com.facebook.C2757u.REQUESTS
            java.lang.String r1 = "Request"
            r6.<init>(r0, r1)
            int r2 = r13.size()
            boolean r5 = m6238f(r13)
            r0 = 0
            r1 = 1
            if (r2 != r1) goto L_0x001c
            com.facebook.GraphRequest r3 = r13.get(r0)
            com.facebook.s r3 = r3.f4547e
            goto L_0x001e
        L_0x001c:
            com.facebook.s r3 = com.facebook.C2662s.POST
        L_0x001e:
            java.lang.String r4 = r3.name()
            r14.setRequestMethod(r4)
            m6221a(r14, r5)
            java.net.URL r4 = r14.getURL()
            java.lang.String r7 = "Request:\n"
            r6.mo9076c(r7)
            java.lang.String r7 = "Id"
            java.lang.String r8 = r13.mo9355b()
            r6.mo9073a(r7, r8)
            java.lang.String r7 = "URL"
            r6.mo9073a(r7, r4)
            java.lang.String r7 = "Method"
            java.lang.String r8 = r14.getRequestMethod()
            r6.mo9073a(r7, r8)
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = "User-Agent"
            java.lang.String r8 = r14.getRequestProperty(r8)
            r6.mo9073a(r7, r8)
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = "Content-Type"
            java.lang.String r8 = r14.getRequestProperty(r8)
            r6.mo9073a(r7, r8)
            int r7 = r13.mo9345a()
            r14.setConnectTimeout(r7)
            int r7 = r13.mo9345a()
            r14.setReadTimeout(r7)
            com.facebook.s r7 = com.facebook.C2662s.POST
            if (r3 != r7) goto L_0x0071
            r0 = r1
        L_0x0071:
            if (r0 != 0) goto L_0x0077
            r6.mo9072a()
            return
        L_0x0077:
            r14.setDoOutput(r1)
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00cc }
            java.io.OutputStream r14 = r14.getOutputStream()     // Catch:{ all -> 0x00cc }
            r1.<init>(r14)     // Catch:{ all -> 0x00cc }
            if (r5 == 0) goto L_0x008f
            java.util.zip.GZIPOutputStream r14 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x008c }
            r14.<init>(r1)     // Catch:{ all -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r13 = move-exception
            r14 = r1
            goto L_0x00ce
        L_0x008f:
            r14 = r1
        L_0x0090:
            boolean r0 = m6235e(r13)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00ba
            com.facebook.x r0 = new com.facebook.x     // Catch:{ all -> 0x00ca }
            android.os.Handler r1 = r13.mo9356c()     // Catch:{ all -> 0x00ca }
            r0.<init>(r1)     // Catch:{ all -> 0x00ca }
            r8 = 0
            r7 = r13
            r9 = r2
            r10 = r4
            r11 = r0
            r12 = r5
            m6217a(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00ca }
            int r1 = r0.mo9603a()     // Catch:{ all -> 0x00ca }
            java.util.Map r10 = r0.mo9606b()     // Catch:{ all -> 0x00ca }
            com.facebook.y r0 = new com.facebook.y     // Catch:{ all -> 0x00ca }
            long r11 = (long) r1     // Catch:{ all -> 0x00ca }
            r7 = r0
            r8 = r14
            r9 = r13
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x00ca }
            r14 = r0
        L_0x00ba:
            r0 = r13
            r1 = r6
            r3 = r4
            r4 = r14
            m6217a(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00ca }
            if (r14 == 0) goto L_0x00c6
            r14.close()
        L_0x00c6:
            r6.mo9072a()
            return
        L_0x00ca:
            r13 = move-exception
            goto L_0x00ce
        L_0x00cc:
            r13 = move-exception
            r14 = r0
        L_0x00ce:
            if (r14 == 0) goto L_0x00d3
            r14.close()
        L_0x00d3:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m6218a(com.facebook.q, java.net.HttpURLConnection):void");
    }

    /* renamed from: a */
    private static void m6217a(C2658q qVar, C2563u uVar, int i, URL url, OutputStream outputStream, boolean z) throws IOException, JSONException {
        C1507f fVar = new C1507f(outputStream, uVar, z);
        if (i == 1) {
            GraphRequest a = qVar.get(0);
            HashMap hashMap = new HashMap();
            for (String str : a.f4553k.keySet()) {
                Object obj = a.f4553k.get(str);
                if (m6234d(obj)) {
                    hashMap.put(str, new C1502a(a, obj));
                }
            }
            if (uVar != null) {
                uVar.mo9076c("  Parameters:\n");
            }
            m6215a(a.f4553k, fVar, a);
            if (uVar != null) {
                uVar.mo9076c("  Attachments:\n");
            }
            m6222a((Map<String, C1502a>) hashMap, fVar);
            if (a.f4549g != null) {
                m6224a(a.f4549g, url.getPath(), (C1505d) fVar);
                return;
            }
            return;
        }
        String g = m6239g(qVar);
        if (C2479ad.m9456a(g)) {
            throw new C2579j("App ID was not specified at the request or Settings.");
        }
        fVar.mo6693a("batch_app_id", g);
        HashMap hashMap2 = new HashMap();
        m6216a(fVar, (Collection<GraphRequest>) qVar, (Map<String, C1502a>) hashMap2);
        if (uVar != null) {
            uVar.mo9076c("  Attachments:\n");
        }
        m6222a((Map<String, C1502a>) hashMap2, fVar);
    }

    /* renamed from: b */
    private static boolean m6230b(String str) {
        Matcher matcher = f4544c.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        if (str.startsWith("me/") || str.startsWith("/me/")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m6224a(org.json.JSONObject r6, java.lang.String r7, com.facebook.GraphRequest.C1505d r8) throws java.io.IOException {
        /*
            boolean r0 = m6230b(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r3 = "?"
            int r7 = r7.indexOf(r3)
            r3 = 3
            if (r0 <= r3) goto L_0x001e
            r3 = -1
            if (r7 == r3) goto L_0x001c
            if (r0 >= r7) goto L_0x001e
        L_0x001c:
            r7 = r1
            goto L_0x001f
        L_0x001e:
            r7 = r2
        L_0x001f:
            java.util.Iterator r0 = r6.keys()
        L_0x0023:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.opt(r3)
            if (r7 == 0) goto L_0x003f
            java.lang.String r5 = "image"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x003f
            r5 = r1
            goto L_0x0040
        L_0x003f:
            r5 = r2
        L_0x0040:
            m6220a(r3, r4, r8, r5)
            goto L_0x0023
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m6224a(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$d):void");
    }

    /* renamed from: a */
    private static void m6220a(String str, Object obj, C1505d dVar, boolean z) throws IOException {
        Class cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    m6220a(String.format("%s[%s]", new Object[]{str, str2}), jSONObject.opt(str2), dVar, z);
                }
            } else if (jSONObject.has(TtmlNode.ATTR_ID)) {
                m6220a(str, (Object) jSONObject.optString(TtmlNode.ATTR_ID), dVar, z);
            } else if (jSONObject.has("url")) {
                m6220a(str, (Object) jSONObject.optString("url"), dVar, z);
            } else if (jSONObject.has("fbsdk:create_object")) {
                m6220a(str, (Object) jSONObject.toString(), dVar, z);
            }
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m6220a(String.format(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), dVar, z);
            }
        } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            dVar.mo6693a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            dVar.mo6693a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    /* renamed from: a */
    private static void m6215a(Bundle bundle, C1507f fVar, GraphRequest graphRequest) throws IOException {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (m6236e(obj)) {
                fVar.mo6710a(str, obj, graphRequest);
            }
        }
    }

    /* renamed from: a */
    private static void m6222a(Map<String, C1502a> map, C1507f fVar) throws IOException {
        for (String str : map.keySet()) {
            C1502a aVar = (C1502a) map.get(str);
            if (m6234d(aVar.mo6703b())) {
                fVar.mo6710a(str, aVar.mo6703b(), aVar.mo6702a());
            }
        }
    }

    /* renamed from: a */
    private static void m6216a(C1507f fVar, Collection<GraphRequest> collection, Map<String, C1502a> map) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest a : collection) {
            a.m6223a(jSONArray, map);
        }
        fVar.mo6712a("batch", jSONArray, collection);
    }

    /* renamed from: o */
    private static String m6242o() {
        return String.format("multipart/form-data; boundary=%s", new Object[]{"3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"});
    }

    /* renamed from: p */
    private static String m6243p() {
        if (f4545q == null) {
            f4545q = String.format("%s.%s", new Object[]{"FBAndroidSDK", "4.34.0"});
            String a = C2560s.m9713a();
            if (!C2479ad.m9456a(a)) {
                f4545q = String.format(Locale.ROOT, "%s/%s", new Object[]{f4545q, a});
            }
        }
        return f4545q;
    }

    /* renamed from: g */
    private static String m6239g(C2658q qVar) {
        if (!C2479ad.m9456a(qVar.mo9360f())) {
            return qVar.mo9360f();
        }
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f4546d;
            if (accessToken != null) {
                String j = accessToken.mo6623j();
                if (j != null) {
                    return j;
                }
            }
        }
        if (!C2479ad.m9456a(f4543b)) {
            return f4543b;
        }
        return C2649m.m10137j();
    }

    /* renamed from: d */
    private static boolean m6234d(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m6236e(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m6237f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }
}
