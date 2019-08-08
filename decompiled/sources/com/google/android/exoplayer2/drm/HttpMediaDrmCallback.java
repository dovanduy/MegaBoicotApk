package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import android.text.TextUtils;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest;
import com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest;
import com.google.android.exoplayer2.upstream.HttpDataSource.Factory;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@TargetApi(18)
public final class HttpMediaDrmCallback implements MediaDrmCallback {
    private static final int MAX_MANUAL_REDIRECTS = 5;
    private final Factory dataSourceFactory;
    private final String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final Map<String, String> keyRequestProperties;

    public HttpMediaDrmCallback(String str, Factory factory) {
        this(str, false, factory);
    }

    public HttpMediaDrmCallback(String str, boolean z, Factory factory) {
        this.dataSourceFactory = factory;
        this.defaultLicenseUrl = str;
        this.forceDefaultLicenseUrl = z;
        this.keyRequestProperties = new HashMap();
    }

    public void setKeyRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.put(str, str2);
        }
    }

    public void clearKeyRequestProperty(String str) {
        Assertions.checkNotNull(str);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.remove(str);
        }
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.clear();
        }
    }

    public byte[] executeProvisionRequest(UUID uuid, ProvisionRequest provisionRequest) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(provisionRequest.getDefaultUrl());
        sb.append("&signedRequest=");
        sb.append(Util.fromUtf8Bytes(provisionRequest.getData()));
        return executePost(this.dataSourceFactory, sb.toString(), new byte[0], null);
    }

    public byte[] executeKeyRequest(UUID uuid, KeyRequest keyRequest, String str) throws Exception {
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!TextUtils.isEmpty(defaultUrl)) {
            str = defaultUrl;
        }
        if (this.forceDefaultLicenseUrl || TextUtils.isEmpty(str)) {
            str = this.defaultLicenseUrl;
        }
        HashMap hashMap = new HashMap();
        String str2 = C2793C.PLAYREADY_UUID.equals(uuid) ? "text/xml" : C2793C.CLEARKEY_UUID.equals(uuid) ? "application/json" : "application/octet-stream";
        hashMap.put("Content-Type", str2);
        if (C2793C.PLAYREADY_UUID.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.keyRequestProperties) {
            hashMap.putAll(this.keyRequestProperties);
        }
        return executePost(this.dataSourceFactory, str, keyRequest.getData(), hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d A[Catch:{ InvalidResponseCodeException -> 0x0053, all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ InvalidResponseCodeException -> 0x0053, all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076 A[LOOP:1: B:7:0x002d->B:31:0x0076, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] executePost(com.google.android.exoplayer2.upstream.HttpDataSource.Factory r17, java.lang.String r18, byte[] r19, java.util.Map<java.lang.String, java.lang.String> r20) throws java.io.IOException {
        /*
            com.google.android.exoplayer2.upstream.HttpDataSource r1 = r17.createDataSource()
            if (r20 == 0) goto L_0x002a
            java.util.Set r2 = r20.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x000e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r1.setRequestProperty(r4, r3)
            goto L_0x000e
        L_0x002a:
            r3 = r18
            r4 = 0
        L_0x002d:
            com.google.android.exoplayer2.upstream.DataSpec r15 = new com.google.android.exoplayer2.upstream.DataSpec
            android.net.Uri r6 = android.net.Uri.parse(r3)
            r8 = 0
            r10 = 0
            r12 = -1
            r14 = 0
            r3 = 1
            r5 = r15
            r7 = r19
            r2 = r15
            r15 = r3
            r5.<init>(r6, r7, r8, r10, r12, r14, r15)
            com.google.android.exoplayer2.upstream.DataSourceInputStream r3 = new com.google.android.exoplayer2.upstream.DataSourceInputStream
            r3.<init>(r1, r2)
            byte[] r2 = com.google.android.exoplayer2.util.Util.toByteArray(r3)     // Catch:{ InvalidResponseCodeException -> 0x0053 }
            com.google.android.exoplayer2.util.Util.closeQuietly(r3)
            return r2
        L_0x0050:
            r0 = move-exception
            r1 = r0
            goto L_0x007c
        L_0x0053:
            r0 = move-exception
            int r2 = r0.responseCode     // Catch:{ all -> 0x0050 }
            r5 = 307(0x133, float:4.3E-43)
            if (r2 == r5) goto L_0x0063
            int r2 = r0.responseCode     // Catch:{ all -> 0x0050 }
            r5 = 308(0x134, float:4.32E-43)
            if (r2 != r5) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r2 = r4
            goto L_0x006a
        L_0x0063:
            int r2 = r4 + 1
            r5 = 5
            if (r4 >= r5) goto L_0x006a
            r4 = 1
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            if (r4 == 0) goto L_0x0072
            java.lang.String r4 = getRedirectUrl(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x0073
        L_0x0072:
            r4 = 0
        L_0x0073:
            if (r4 != 0) goto L_0x0076
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0076:
            com.google.android.exoplayer2.util.Util.closeQuietly(r3)
            r3 = r4
            r4 = r2
            goto L_0x002d
        L_0x007c:
            com.google.android.exoplayer2.util.Util.closeQuietly(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.HttpMediaDrmCallback.executePost(com.google.android.exoplayer2.upstream.HttpDataSource$Factory, java.lang.String, byte[], java.util.Map):byte[]");
    }

    private static String getRedirectUrl(InvalidResponseCodeException invalidResponseCodeException) {
        Map<String, List<String>> map = invalidResponseCodeException.headerFields;
        if (map != null) {
            List list = (List) map.get("Location");
            if (list != null && !list.isEmpty()) {
                return (String) list.get(0);
            }
        }
        return null;
    }
}
