package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.internal.p083j.C1746e;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class arx {

    /* renamed from: a */
    private BlockingQueue<ash> f12063a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    private ExecutorService f12064b;

    /* renamed from: c */
    private LinkedHashMap<String, String> f12065c = new LinkedHashMap<>();

    /* renamed from: d */
    private Map<String, asb> f12066d = new HashMap();

    /* renamed from: e */
    private String f12067e;

    /* renamed from: f */
    private Context f12068f;

    /* renamed from: g */
    private String f12069g;

    /* renamed from: h */
    private AtomicBoolean f12070h;

    /* renamed from: i */
    private File f12071i;

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[SYNTHETIC, Splitter:B:29:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6 A[SYNTHETIC, Splitter:B:34:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0000 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m15031a() {
        /*
            r5 = this;
        L_0x0000:
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.ash> r0 = r5.f12063a     // Catch:{ InterruptedException -> 0x00c4 }
            java.lang.Object r0 = r0.take()     // Catch:{ InterruptedException -> 0x00c4 }
            com.google.android.gms.internal.ads.ash r0 = (com.google.android.gms.internal.ads.ash) r0     // Catch:{ InterruptedException -> 0x00c4 }
            java.lang.String r1 = r0.mo14724b()     // Catch:{ InterruptedException -> 0x00c4 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0000
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r2 = r5.f12065c
            java.util.Map r0 = r0.mo14725c()
            java.util.Map r0 = r5.mo14704a(r2, r0)
            java.lang.String r2 = r5.f12067e
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004a
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2.appendQueryParameter(r4, r3)
            goto L_0x002e
        L_0x004a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            android.net.Uri r2 = r2.build()
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            java.lang.String r2 = "&it="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.f12070h
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x00b8
            java.io.File r1 = r5.f12071i
            if (r1 == 0) goto L_0x00b1
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x008f }
            r4 = 1
            r3.<init>(r1, r4)     // Catch:{ IOException -> 0x008f }
            byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x008a, all -> 0x0087 }
            r3.write(r0)     // Catch:{ IOException -> 0x008a, all -> 0x0087 }
            r0 = 10
            r3.write(r0)     // Catch:{ IOException -> 0x008a, all -> 0x0087 }
            r3.close()     // Catch:{ IOException -> 0x009c }
            goto L_0x0000
        L_0x0087:
            r0 = move-exception
            r2 = r3
            goto L_0x00a4
        L_0x008a:
            r0 = move-exception
            r2 = r3
            goto L_0x0090
        L_0x008d:
            r0 = move-exception
            goto L_0x00a4
        L_0x008f:
            r0 = move-exception
        L_0x0090:
            java.lang.String r1 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.C3900je.m17432c(r1, r0)     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0000
            r2.close()     // Catch:{ IOException -> 0x009c }
            goto L_0x0000
        L_0x009c:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.C3900je.m17432c(r1, r0)
            goto L_0x0000
        L_0x00a4:
            if (r2 == 0) goto L_0x00b0
            r2.close()     // Catch:{ IOException -> 0x00aa }
            goto L_0x00b0
        L_0x00aa:
            r1 = move-exception
            java.lang.String r2 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.C3900je.m17432c(r2, r1)
        L_0x00b0:
            throw r0
        L_0x00b1:
            java.lang.String r0 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.C3900je.m17435e(r0)
            goto L_0x0000
        L_0x00b8:
            com.google.android.gms.ads.internal.C3025aw.m10917e()
            android.content.Context r1 = r5.f12068f
            java.lang.String r2 = r5.f12069g
            com.google.android.gms.internal.ads.C3909jn.m17138a(r1, r2, r0)
            goto L_0x0000
        L_0x00c4:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter:reporter interrupted"
            com.google.android.gms.internal.ads.C3900je.m17432c(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.arx.m15031a():void");
    }

    /* renamed from: a */
    public final asb mo14703a(String str) {
        asb asb = (asb) this.f12066d.get(str);
        return asb != null ? asb : asb.f12075a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Map<String, String> mo14704a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, mo14703a(str).mo14710a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo14705a(Context context, String str, String str2, Map<String, String> map) {
        this.f12068f = context;
        this.f12069g = str;
        this.f12067e = str2;
        this.f12070h = new AtomicBoolean(false);
        this.f12070h.set(((Boolean) aoq.m14620f().mo14695a(aru.f11764P)).booleanValue());
        if (this.f12070h.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.f12071i = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.f12065c.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.f12064b = Executors.newSingleThreadExecutor();
        this.f12064b.execute(new ary(this));
        this.f12066d.put(C1245d.f3959jb, asb.f12076b);
        this.f12066d.put("ad_format", asb.f12076b);
        this.f12066d.put(C1746e.f5472a, asb.f12077c);
    }

    /* renamed from: a */
    public final void mo14706a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f12065c.put(C1746e.f5472a, TextUtils.join(",", list));
        }
    }

    /* renamed from: a */
    public final boolean mo14707a(ash ash) {
        return this.f12063a.offer(ash);
    }
}
