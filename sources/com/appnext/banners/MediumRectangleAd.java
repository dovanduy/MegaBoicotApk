package com.appnext.banners;

import android.content.Context;
import com.appnext.core.C1286Ad;
import com.appnext.core.callbacks.OnECPMLoaded;

public class MediumRectangleAd extends BannerAd {
    public String getAUID() {
        return "1020";
    }

    public /* bridge */ /* synthetic */ void getECPM(OnECPMLoaded onECPMLoaded) {
        super.getECPM(onECPMLoaded);
    }

    public /* bridge */ /* synthetic */ String getTID() {
        return super.getTID();
    }

    public /* bridge */ /* synthetic */ String getVID() {
        return super.getVID();
    }

    public /* bridge */ /* synthetic */ boolean isAdLoaded() {
        return super.isAdLoaded();
    }

    public /* bridge */ /* synthetic */ void loadAd() {
        super.loadAd();
    }

    public /* bridge */ /* synthetic */ void showAd() {
        super.showAd();
    }

    public MediumRectangleAd(Context context, String str) {
        super(context, str);
    }

    protected MediumRectangleAd(C1286Ad ad) {
        super(ad);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r5.equals("a") != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r5.equals("a") != false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getTemId(com.appnext.banners.BannerAdData r5) {
        /*
            r4 = this;
            java.lang.String r5 = r5.getRevenueType()
            java.lang.String r0 = "cpi"
            boolean r5 = r5.equals(r0)
            r0 = 0
            r1 = 1
            r2 = -1
            if (r5 == 0) goto L_0x005c
            com.appnext.banners.d r5 = com.appnext.banners.C1202d.m5145aI()
            java.lang.String r3 = "MEDIUM_RECTANGLE_cpiActiveFlow"
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
            java.lang.String r5 = "111"
            return r5
        L_0x0053:
            java.lang.String r5 = "108"
            return r5
        L_0x0056:
            java.lang.String r5 = "105"
            return r5
        L_0x0059:
            java.lang.String r5 = "102"
            return r5
        L_0x005c:
            com.appnext.banners.d r5 = com.appnext.banners.C1202d.m5145aI()
            java.lang.String r3 = "MEDIUM_RECTANGLE_cpcActiveFlow"
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
            java.lang.String r5 = "205"
            return r5
        L_0x008b:
            java.lang.String r5 = "202"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.MediumRectangleAd.getTemId(com.appnext.banners.BannerAdData):java.lang.String");
    }
}
