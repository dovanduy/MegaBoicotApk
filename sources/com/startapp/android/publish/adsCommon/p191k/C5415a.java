package com.startapp.android.publish.adsCommon.p191k;

import android.content.Context;
import com.google.android.exoplayer2.C2793C;
import com.startapp.android.publish.adsCommon.BaseRequest;
import com.startapp.android.publish.adsCommon.BaseResponse;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.C5552e;
import com.startapp.common.p193a.C5504b;
import com.startapp.common.p193a.C5504b.C5507b;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p193a.C5519h;
import com.startapp.common.p193a.C5519h.C5520a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.startapp.android.publish.adsCommon.k.a */
/* compiled from: StartAppSDK */
public class C5415a {
    /* renamed from: a */
    public static <T extends BaseResponse> T m23104a(Context context, String str, BaseRequest baseRequest, Map<String, String> map, Class<T> cls) {
        return (BaseResponse) C5307i.m22656a(m23111b(context, str, baseRequest, map, 3, 0).mo20491a(), cls);
    }

    /* renamed from: a */
    public static C5520a m23105a(Context context, String str, BaseRequest baseRequest, Map<String, String> map) {
        return m23111b(context, str, baseRequest, map, 3, 0);
    }

    /* renamed from: a */
    public static boolean m23108a(Context context, String str, Map<String, String> map) {
        m23111b(context, str, null, map, 3, 0);
        return true;
    }

    /* renamed from: a */
    public static boolean m23107a(Context context, String str, BaseRequest baseRequest, Map<String, String> map, int i, long j) {
        m23112c(context, str, baseRequest, map, i, j);
        return true;
    }

    /* renamed from: b */
    private static C5520a m23111b(Context context, String str, BaseRequest baseRequest, Map<String, String> map, int i, long j) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Sending get to URL: ");
        sb.append(str);
        C5518g.m23563a("Transport", 3, sb.toString());
        if (baseRequest != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(baseRequest.getRequestString());
            str2 = sb2.toString();
        } else {
            str2 = str;
        }
        Map a = m23106a(context, map);
        String str3 = str2;
        int i2 = 1;
        while (true) {
            if (baseRequest == null || i2 <= 1) {
                break;
            }
            try {
                baseRequest.setRetry(i2 - 1);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(baseRequest.getRequestString());
                str3 = sb3.toString();
                break;
            } catch (C5552e e) {
                if (!e.mo20547b() || i2 >= i || !m23109a(e)) {
                    throw e;
                }
                i2++;
                if (j > 0) {
                    try {
                        Thread.sleep(j);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        return C5519h.m23566a(context, str3, a, C5414k.m23096a(context, "User-Agent", "-1"), MetaData.getInstance().isCompressionEnabled());
    }

    /* renamed from: a */
    private static boolean m23109a(C5552e eVar) {
        if (eVar.mo20546a() != 0) {
            return !MetaData.getInstance().getInvalidForRetry().contains(Integer.valueOf(eVar.mo20546a()));
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        r1 = r0;
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r14 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        throw new com.startapp.common.C5552e("failed compressing json to gzip", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        throw new com.startapp.common.C5552e("failed encoding json to UTF-8", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        if (r20 > 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        java.lang.Thread.sleep(r20);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051 A[ExcHandler: IOException (r0v3 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054 A[ExcHandler: UnsupportedEncodingException (r0v2 'e' java.io.UnsupportedEncodingException A[CUSTOM_DECLARE]), Splitter:B:7:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009e A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m23112c(android.content.Context r15, java.lang.String r16, com.startapp.android.publish.adsCommon.BaseRequest r17, java.util.Map<java.lang.String, java.lang.String> r18, int r19, long r20) {
        /*
            r7 = r15
            r1 = 0
            if (r17 == 0) goto L_0x000a
            com.startapp.android.publish.adsCommon.Utils.e r2 = r17.getNameValueJson()
            r8 = r2
            goto L_0x000b
        L_0x000a:
            r8 = r1
        L_0x000b:
            java.lang.String r2 = "Transport"
            r3 = 3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Sending post to URL: "
            r4.append(r5)
            r9 = r16
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.startapp.common.p193a.C5518g.m23563a(r2, r3, r4)
            r2 = r18
            java.util.Map r10 = m23106a(r7, r2)
            r2 = 0
            r11 = 1
            r12 = r2
            r13 = r11
        L_0x002e:
            if (r12 != 0) goto L_0x009f
            if (r8 == 0) goto L_0x005b
            java.lang.String r2 = r8.toString()     // Catch:{ e -> 0x0057, UnsupportedEncodingException -> 0x0054, IOException -> 0x0051 }
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch:{ e -> 0x0057, UnsupportedEncodingException -> 0x0054, IOException -> 0x0051 }
            com.startapp.android.publish.common.metaData.MetaData r1 = com.startapp.android.publish.common.metaData.MetaData.getInstance()     // Catch:{ e -> 0x004d, UnsupportedEncodingException -> 0x0054, IOException -> 0x0051 }
            boolean r1 = r1.isCompressionEnabled()     // Catch:{ e -> 0x004d, UnsupportedEncodingException -> 0x0054, IOException -> 0x0051 }
            if (r1 == 0) goto L_0x004b
            byte[] r1 = m23110a(r2)     // Catch:{ e -> 0x004d, UnsupportedEncodingException -> 0x0054, IOException -> 0x0051 }
            goto L_0x005b
        L_0x004b:
            r14 = r2
            goto L_0x005c
        L_0x004d:
            r0 = move-exception
            r1 = r0
            r14 = r2
            goto L_0x0087
        L_0x0051:
            r0 = move-exception
            r1 = r0
            goto L_0x0075
        L_0x0054:
            r0 = move-exception
            r1 = r0
            goto L_0x007d
        L_0x0057:
            r0 = move-exception
            r14 = r1
        L_0x0059:
            r1 = r0
            goto L_0x0087
        L_0x005b:
            r14 = r1
        L_0x005c:
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "-1"
            java.lang.String r5 = com.startapp.android.publish.adsCommon.C5414k.m23096a(r7, r1, r2)     // Catch:{ e -> 0x0085, UnsupportedEncodingException -> 0x0054, IOException -> 0x0051 }
            com.startapp.android.publish.common.metaData.MetaData r1 = com.startapp.android.publish.common.metaData.MetaData.getInstance()     // Catch:{ e -> 0x0085, UnsupportedEncodingException -> 0x0054, IOException -> 0x0051 }
            boolean r6 = r1.isCompressionEnabled()     // Catch:{ e -> 0x0085, UnsupportedEncodingException -> 0x0054, IOException -> 0x0051 }
            r1 = r7
            r2 = r9
            r3 = r14
            r4 = r10
            com.startapp.common.p193a.C5519h.m23569a(r1, r2, r3, r4, r5, r6)     // Catch:{ e -> 0x0085, UnsupportedEncodingException -> 0x0054, IOException -> 0x0051 }
            r12 = r11
            goto L_0x009c
        L_0x0075:
            com.startapp.common.e r2 = new com.startapp.common.e
            java.lang.String r3 = "failed compressing json to gzip"
            r2.<init>(r3, r1)
            throw r2
        L_0x007d:
            com.startapp.common.e r2 = new com.startapp.common.e
            java.lang.String r3 = "failed encoding json to UTF-8"
            r2.<init>(r3, r1)
            throw r2
        L_0x0085:
            r0 = move-exception
            goto L_0x0059
        L_0x0087:
            boolean r2 = r1.mo20547b()
            if (r2 == 0) goto L_0x009e
            r2 = r19
            if (r13 >= r2) goto L_0x009e
            int r13 = r13 + 1
            r3 = 0
            int r1 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x009c
            java.lang.Thread.sleep(r20)     // Catch:{ InterruptedException -> 0x009c }
        L_0x009c:
            r1 = r14
            goto L_0x002e
        L_0x009e:
            throw r1
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.adsCommon.p191k.C5415a.m23112c(android.content.Context, java.lang.String, com.startapp.android.publish.adsCommon.BaseRequest, java.util.Map, int, long):void");
    }

    /* renamed from: a */
    private static byte[] m23110a(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.flush();
                gZIPOutputStream2.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                e = e;
                gZIPOutputStream = gZIPOutputStream2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = gZIPOutputStream2;
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            throw e;
        }
    }

    /* renamed from: a */
    private static Map<String, String> m23106a(Context context, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (!MetaData.getInstance().getDisableSendAdvertisingId()) {
            C5507b a = C5504b.m23480a().mo20472a(context);
            String a2 = a.mo20477a();
            if ((a2.equals("0") || a2.equals("")) && !C5414k.m23092a(context, C5376d.NO_ADVERTISING_ID.mo19890a(), Boolean.valueOf(false)).booleanValue()) {
                C5414k.m23099b(context, C5376d.NO_ADVERTISING_ID.mo19890a(), Boolean.valueOf(true));
                C5378f.m23016a(context, C5376d.NO_ADVERTISING_ID, "TransportHttpApache.addAdditionalHeaders", a.mo20480d(), "");
            }
            String a3 = a.mo20477a();
            try {
                a3 = URLEncoder.encode(a3, C2793C.UTF8_NAME);
            } catch (UnsupportedEncodingException unused) {
            }
            map.put("device-id", a3);
        }
        map.put("Accept-Language", Locale.getDefault().toString());
        return map;
    }
}
