package com.appnext.nativeads;

import android.content.Context;
import com.appnext.base.p046b.C1244c;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1308c;
import com.appnext.core.C1326f;
import com.appnext.core.callbacks.OnECPMLoaded;
import org.json.JSONObject;

public class NativeAdObject extends C1286Ad {
    protected static final String TID = "301";
    protected static final String VID = "2.4.5.472";
    protected boolean fq_status = false;

    public String getAUID() {
        return "550";
    }

    public void getECPM(OnECPMLoaded onECPMLoaded) {
    }

    public String getTID() {
        return TID;
    }

    public String getVID() {
        return "2.4.5.472";
    }

    public void loadAd() {
    }

    public void showAd() {
    }

    public NativeAdObject(Context context, String str) {
        super(context, str);
        if (!checked_fq) {
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        StringBuilder sb = new StringBuilder("https://admin.appnext.com/AdminService.asmx/checkA?z=");
                        sb.append(NativeAdObject.this.getPlacementID());
                        sb.append("&callback=");
                        String a = C1326f.m5659a(sb.toString(), null);
                        NativeAdObject.f4094fq = new JSONObject(a.substring(a.indexOf("(") + 1, a.lastIndexOf(")"))).getBoolean(C1244c.STATUS);
                        NativeAdObject.this.fq_status = NativeAdObject.f4094fq;
                        new StringBuilder("fq ").append(NativeAdObject.this.fq_status);
                        NativeAdObject.checked_fq = true;
                    } catch (Throwable unused) {
                    }
                }
            }).start();
        } else {
            this.fq_status = C1286Ad.f4094fq;
        }
    }

    protected NativeAdObject(C1286Ad ad) {
        super(ad);
    }

    public boolean isAdLoaded() {
        return C1417c.m5874cU().mo5560a(this);
    }

    /* access modifiers changed from: protected */
    public Context getContext() {
        return this.context;
    }

    /* access modifiers changed from: protected */
    public String getSessionId() {
        return super.getSessionId();
    }

    /* access modifiers changed from: protected */
    public void setAdRequest(C1308c cVar) {
        super.setAdRequest(cVar);
    }

    /* access modifiers changed from: protected */
    public C1308c getAdRequest() {
        return super.getAdRequest();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r5.equals("a") != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r5.equals("a") != false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getTemId(com.appnext.nativeads.NativeAdData r5) {
        /*
            r4 = this;
            java.lang.String r5 = r5.getRevenueType()
            java.lang.String r0 = "cpi"
            boolean r5 = r5.equals(r0)
            r0 = 0
            r1 = 1
            r2 = -1
            if (r5 == 0) goto L_0x005c
            com.appnext.nativeads.b r5 = com.appnext.nativeads.C1416b.m5865cT()
            java.lang.String r3 = "cpiActiveFlow"
            java.lang.String r5 = r5.get(r3)
            java.lang.String r5 = r5.toLowerCase()
            int r3 = r5.hashCode()
            switch(r3) {
                case 97: goto L_0x0043;
                case 98: goto L_0x0039;
                case 99: goto L_0x002f;
                case 100: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x004c
        L_0x0025:
            java.lang.String r0 = "d"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x004c
            r0 = 3
            goto L_0x004d
        L_0x002f:
            java.lang.String r0 = "c"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x004c
            r0 = 2
            goto L_0x004d
        L_0x0039:
            java.lang.String r0 = "b"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x004c
            r0 = r1
            goto L_0x004d
        L_0x0043:
            java.lang.String r1 = "a"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r0 = r2
        L_0x004d:
            switch(r0) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0056;
                case 2: goto L_0x0053;
                default: goto L_0x0050;
            }
        L_0x0050:
            java.lang.String r5 = "503"
            return r5
        L_0x0053:
            java.lang.String r5 = "502"
            return r5
        L_0x0056:
            java.lang.String r5 = "501"
            return r5
        L_0x0059:
            java.lang.String r5 = "500"
            return r5
        L_0x005c:
            com.appnext.nativeads.b r5 = com.appnext.nativeads.C1416b.m5865cT()
            java.lang.String r3 = "cpcActiveFlow"
            java.lang.String r5 = r5.get(r3)
            java.lang.String r5 = r5.toLowerCase()
            int r3 = r5.hashCode()
            switch(r3) {
                case 97: goto L_0x007c;
                case 98: goto L_0x0072;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0085
        L_0x0072:
            java.lang.String r0 = "b"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0085
            r0 = r1
            goto L_0x0086
        L_0x007c:
            java.lang.String r1 = "a"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r0 = r2
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            java.lang.String r5 = "505"
            return r5
        L_0x008b:
            java.lang.String r5 = "504"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.nativeads.NativeAdObject.getTemId(com.appnext.nativeads.NativeAdData):java.lang.String");
    }
}
