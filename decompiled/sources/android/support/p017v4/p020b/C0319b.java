package android.support.p017v4.p020b;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.support.p017v4.content.p022a.C0342c;
import android.support.p017v4.graphics.C0405c;
import android.support.p017v4.graphics.C0422i;
import android.support.p017v4.p020b.C0327c.C0332a;
import android.support.p017v4.p023d.C0384g;
import android.support.p017v4.p023d.C0397l;
import android.support.p017v4.p023d.C0398m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.b.b */
/* compiled from: FontsContractCompat */
public class C0319b {

    /* renamed from: a */
    static final C0384g<String, Typeface> f799a = new C0384g<>(16);

    /* renamed from: b */
    static final Object f800b = new Object();

    /* renamed from: c */
    static final C0398m<String, ArrayList<C0332a<C0326c>>> f801c = new C0398m<>();

    /* renamed from: d */
    private static final C0327c f802d = new C0327c("fonts", 10, 10000);

    /* renamed from: e */
    private static final Comparator<byte[]> f803e = new Comparator<byte[]>() {
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return bArr[i] - bArr2[i];
                }
            }
            return 0;
        }
    };

    /* renamed from: android.support.v4.b.b$a */
    /* compiled from: FontsContractCompat */
    public static class C0324a {

        /* renamed from: a */
        private final int f811a;

        /* renamed from: b */
        private final C0325b[] f812b;

        public C0324a(int i, C0325b[] bVarArr) {
            this.f811a = i;
            this.f812b = bVarArr;
        }

        /* renamed from: a */
        public int mo1130a() {
            return this.f811a;
        }

        /* renamed from: b */
        public C0325b[] mo1131b() {
            return this.f812b;
        }
    }

    /* renamed from: android.support.v4.b.b$b */
    /* compiled from: FontsContractCompat */
    public static class C0325b {

        /* renamed from: a */
        private final Uri f813a;

        /* renamed from: b */
        private final int f814b;

        /* renamed from: c */
        private final int f815c;

        /* renamed from: d */
        private final boolean f816d;

        /* renamed from: e */
        private final int f817e;

        public C0325b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f813a = (Uri) C0397l.m1469a(uri);
            this.f814b = i;
            this.f815c = i2;
            this.f816d = z;
            this.f817e = i3;
        }

        /* renamed from: a */
        public Uri mo1132a() {
            return this.f813a;
        }

        /* renamed from: b */
        public int mo1133b() {
            return this.f814b;
        }

        /* renamed from: c */
        public int mo1134c() {
            return this.f815c;
        }

        /* renamed from: d */
        public boolean mo1135d() {
            return this.f816d;
        }

        /* renamed from: e */
        public int mo1136e() {
            return this.f817e;
        }
    }

    /* renamed from: android.support.v4.b.b$c */
    /* compiled from: FontsContractCompat */
    private static final class C0326c {

        /* renamed from: a */
        final Typeface f818a;

        /* renamed from: b */
        final int f819b;

        C0326c(Typeface typeface, int i) {
            this.f818a = typeface;
            this.f819b = i;
        }
    }

    /* renamed from: a */
    static C0326c m1187a(Context context, C0318a aVar, int i) {
        try {
            C0324a a = m1186a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.mo1130a() == 0) {
                Typeface a2 = C0405c.m1523a(context, null, a.mo1131b(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C0326c(a2, i2);
            }
            if (a.mo1130a() == 1) {
                i2 = -2;
            }
            return new C0326c(null, i2);
        } catch (NameNotFoundException unused) {
            return new C0326c(null, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        f802d.mo1140a((java.util.concurrent.Callable<T>) r1, (android.support.p017v4.p020b.C0327c.C0332a<T>) new android.support.p017v4.p020b.C0319b.C03223<T>());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m1185a(final android.content.Context r2, final android.support.p017v4.p020b.C0318a r3, final android.support.p017v4.content.p022a.C0350f.C0351a r4, final android.os.Handler r5, boolean r6, int r7, final int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo1121f()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.support.v4.d.g<java.lang.String, android.graphics.Typeface> r1 = f799a
            java.lang.Object r1 = r1.mo1318a(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo1215a(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0045
            r1 = -1
            if (r7 != r1) goto L_0x0045
            android.support.v4.b.b$c r2 = m1187a(r2, r3, r8)
            if (r4 == 0) goto L_0x0042
            int r3 = r2.f819b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f818a
            r4.mo1216a(r3, r5)
            goto L_0x0042
        L_0x003d:
            int r3 = r2.f819b
            r4.mo1214a(r3, r5)
        L_0x0042:
            android.graphics.Typeface r2 = r2.f818a
            return r2
        L_0x0045:
            android.support.v4.b.b$1 r1 = new android.support.v4.b.b$1
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0059
            android.support.v4.b.c r3 = f802d     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Object r3 = r3.mo1137a(r1, r7)     // Catch:{ InterruptedException -> 0x0058 }
            android.support.v4.b.b$c r3 = (android.support.p017v4.p020b.C0319b.C0326c) r3     // Catch:{ InterruptedException -> 0x0058 }
            android.graphics.Typeface r3 = r3.f818a     // Catch:{ InterruptedException -> 0x0058 }
            return r3
        L_0x0058:
            return r2
        L_0x0059:
            if (r4 != 0) goto L_0x005d
            r3 = r2
            goto L_0x0062
        L_0x005d:
            android.support.v4.b.b$2 r3 = new android.support.v4.b.b$2
            r3.<init>(r4, r5)
        L_0x0062:
            java.lang.Object r4 = f800b
            monitor-enter(r4)
            android.support.v4.d.m<java.lang.String, java.util.ArrayList<android.support.v4.b.c$a<android.support.v4.b.b$c>>> r5 = f801c     // Catch:{ all -> 0x0097 }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007a
            android.support.v4.d.m<java.lang.String, java.util.ArrayList<android.support.v4.b.c$a<android.support.v4.b.b$c>>> r5 = f801c     // Catch:{ all -> 0x0097 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0097 }
            r5.add(r3)     // Catch:{ all -> 0x0097 }
        L_0x007a:
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            return r2
        L_0x007c:
            if (r3 == 0) goto L_0x008b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0097 }
            r5.<init>()     // Catch:{ all -> 0x0097 }
            r5.add(r3)     // Catch:{ all -> 0x0097 }
            android.support.v4.d.m<java.lang.String, java.util.ArrayList<android.support.v4.b.c$a<android.support.v4.b.b$c>>> r3 = f801c     // Catch:{ all -> 0x0097 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0097 }
        L_0x008b:
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            android.support.v4.b.c r3 = f802d
            android.support.v4.b.b$3 r4 = new android.support.v4.b.b$3
            r4.<init>(r0)
            r3.mo1140a(r1, r4)
            return r2
        L_0x0097:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.p020b.C0319b.m1185a(android.content.Context, android.support.v4.b.a, android.support.v4.content.a.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m1190a(Context context, C0325b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0325b bVar : bVarArr) {
            if (bVar.mo1136e() == 0) {
                Uri a = bVar.mo1132a();
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, C0422i.m1609a(context, cancellationSignal, a));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static C0324a m1186a(Context context, CancellationSignal cancellationSignal, C0318a aVar) throws NameNotFoundException {
        ProviderInfo a = m1184a(context.getPackageManager(), aVar, context.getResources());
        if (a == null) {
            return new C0324a(1, null);
        }
        return new C0324a(0, m1192a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    public static ProviderInfo m1184a(PackageManager packageManager, C0318a aVar, Resources resources) throws NameNotFoundException {
        String a = aVar.mo1116a();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(a);
            throw new NameNotFoundException(sb.toString());
        } else if (!resolveContentProvider.packageName.equals(aVar.mo1117b())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found content provider ");
            sb2.append(a);
            sb2.append(", but package was not ");
            sb2.append(aVar.mo1117b());
            throw new NameNotFoundException(sb2.toString());
        } else {
            List a2 = m1189a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f803e);
            List a3 = m1188a(aVar, resources);
            for (int i = 0; i < a3.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) a3.get(i));
                Collections.sort(arrayList, f803e);
                if (m1191a(a2, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m1188a(C0318a aVar, Resources resources) {
        if (aVar.mo1119d() != null) {
            return aVar.mo1119d();
        }
        return C0342c.m1270a(resources, aVar.mo1120e());
    }

    /* renamed from: a */
    private static boolean m1191a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static List<byte[]> m1189a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    static C0325b[] m1192a(Context context, C0318a aVar, String str, CancellationSignal cancellationSignal) {
        Cursor query;
        Uri withAppendedId;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Builder().scheme("content").authority(str2).build();
        Uri build2 = new Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i = 0;
            if (VERSION.SDK_INT > 16) {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo1118c()}, null, cancellationSignal);
            } else {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo1118c()}, null);
            }
            Cursor cursor2 = query;
            if (cursor2 != null && cursor2.getCount() > 0) {
                int columnIndex = cursor2.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor2.getColumnIndex("_id");
                int columnIndex3 = cursor2.getColumnIndex("file_id");
                int columnIndex4 = cursor2.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor2.getColumnIndex("font_weight");
                int columnIndex6 = cursor2.getColumnIndex("font_italic");
                while (cursor2.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor2.getInt(columnIndex) : i;
                    int i3 = columnIndex4 != -1 ? cursor2.getInt(columnIndex4) : i;
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, cursor2.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, cursor2.getLong(columnIndex3));
                    }
                    C0325b bVar = new C0325b(withAppendedId, i3, columnIndex5 != -1 ? cursor2.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor2.getInt(columnIndex6) == 1, i2);
                    arrayList2.add(bVar);
                    i = 0;
                }
                arrayList = arrayList2;
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            return (C0325b[]) arrayList.toArray(new C0325b[0]);
        } catch (Throwable th) {
            Throwable th2 = th;
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }
}
