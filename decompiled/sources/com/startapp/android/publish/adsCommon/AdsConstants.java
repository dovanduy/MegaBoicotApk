package com.startapp.android.publish.adsCommon;

import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences.Placement;

/* compiled from: StartAppSDK */
public class AdsConstants {
    public static final int AD_INFORMATION_EXTENDED_ID = 1475346434;
    public static final int AD_INFORMATION_ID = 1475346433;
    public static final Boolean FORCE_NATIVE_VIDEO_PLAYER = Boolean.valueOf(false);
    public static final int LIST_3D_CLOSE_BUTTON_ID = 1475346435;
    public static final String OVERRIDE_HOST = null;
    public static final Boolean OVERRIDE_NETWORK = Boolean.valueOf(false);
    public static final int SPLASH_NATIVE_MAIN_LAYOUT_ID = 1475346437;
    public static final int STARTAPP_AD_MAIN_LAYOUT_ID = 1475346432;
    public static final Boolean VIDEO_DEBUG = Boolean.valueOf(false);

    /* renamed from: a */
    public static final String f17004a = new String("get");

    /* renamed from: b */
    public static final String f17005b;

    /* renamed from: c */
    public static final String f17006c;

    /* renamed from: d */
    public static final String f17007d = new String("trackdownload");

    /* renamed from: e */
    public static final String f17008e;

    /* renamed from: f */
    public static final String f17009f = new String("https://imp.startappservice.com/tracking/adImpression");

    /* renamed from: g */
    public static final Boolean f17010g = Boolean.valueOf(false);

    /* renamed from: h */
    public static final String f17011h = C5307i.m22679b();

    /* renamed from: i */
    public static final String f17012i = C5307i.m22683c();

    /* renamed from: j */
    public static final String f17013j = C5307i.m22685d();

    /* renamed from: k */
    public static final String[] f17014k = {"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"};

    /* renamed from: l */
    public static final String[] f17015l = {"empty_star", "filled_star", "half_star"};

    /* compiled from: StartAppSDK */
    public enum AdApiType {
        HTML,
        JSON
    }

    /* compiled from: StartAppSDK */
    public enum ServiceApiType {
        METADATA,
        DOWNLOAD
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f17004a);
        sb.append(new String("ads"));
        f17005b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f17004a);
        sb2.append(new String("htmlad"));
        f17006c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f17004a);
        sb3.append(new String("adsmetadata"));
        f17008e = sb3.toString();
    }

    /* renamed from: a */
    public static String m22606a(ServiceApiType serviceApiType) {
        String str;
        String str2 = null;
        switch (serviceApiType) {
            case METADATA:
                str2 = f17008e;
                str = MetaData.getInstance().getMetaDataHost();
                break;
            case DOWNLOAD:
                str2 = f17007d;
                str = MetaData.getInstance().getAdPlatformHost();
                break;
            default:
                str = null;
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m22605a(AdApiType adApiType, Placement placement) {
        String str;
        String str2 = null;
        switch (adApiType) {
            case HTML:
                str2 = f17006c;
                str = MetaData.getInstance().getAdPlatformHost(placement);
                break;
            case JSON:
                str2 = f17005b;
                str = MetaData.getInstance().getAdPlatformHost(placement);
                break;
            default:
                str = null;
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static Boolean m22604a() {
        return VIDEO_DEBUG;
    }
}
