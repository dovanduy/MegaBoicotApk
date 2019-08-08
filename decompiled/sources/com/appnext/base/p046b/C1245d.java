package com.appnext.base.p046b;

import com.appnext.core.C1333i;

/* renamed from: com.appnext.base.b.d */
public final class C1245d {

    /* renamed from: iG */
    public static final String f3938iG = "service_key";

    /* renamed from: iH */
    public static final String f3939iH = "4.7.2";

    /* renamed from: iI */
    public static final String f3940iI = "config.json";

    /* renamed from: iJ */
    public static final String f3941iJ = "plist.json";

    /* renamed from: iK */
    public static final String f3942iK = "/data/appnext/";

    /* renamed from: iL */
    public static final String f3943iL = "videos/";

    /* renamed from: iM */
    public static final String f3944iM = ".tmp";

    /* renamed from: iN */
    public static final String f3945iN = "http://cdn.appnext.com/tools/services/4.7.2/config.json";

    /* renamed from: iO */
    public static final String f3946iO = "http://cdn.appnext.com/tools/services/4.7.2/plist.json";

    /* renamed from: iP */
    public static final int f3947iP = 1024;

    /* renamed from: iQ */
    public static final long f3948iQ = 1048576;

    /* renamed from: iR */
    public static final int f3949iR = 15000;

    /* renamed from: iS */
    public static final String f3950iS = "config_data_obj";

    /* renamed from: iT */
    public static final String f3951iT = "second";

    /* renamed from: iU */
    public static final String f3952iU = "minute";

    /* renamed from: iV */
    public static final String f3953iV = "hour";

    /* renamed from: iW */
    public static final String f3954iW = "day";

    /* renamed from: iX */
    public static final String f3955iX = "time";

    /* renamed from: iY */
    public static final String f3956iY = "once";

    /* renamed from: iZ */
    public static final String f3957iZ = "interval";

    /* renamed from: ja */
    public static final String f3958ja = "off";

    /* renamed from: jb */
    public static final String f3959jb = "action";

    /* renamed from: jc */
    public static final String f3960jc = "before_time_remove_data";

    /* renamed from: jd */
    public static final String f3961jd = "type";

    /* renamed from: je */
    public static final String f3962je = "isAidDisabled";

    /* renamed from: jf */
    public static final int f3963jf = 6;

    /* renamed from: jg */
    public static final int f3964jg = 70;

    /* renamed from: jh */
    public static final int f3965jh = 50;

    /* renamed from: ji */
    public static final int f3966ji = 25;

    /* renamed from: jj */
    public static final int f3967jj = 100;

    /* renamed from: jk */
    public static final int f3968jk = 150;

    /* renamed from: jl */
    public static final String f3969jl = "aidForSend";
    public static final long serialVersionUID = 3596288679259847957L;

    /* renamed from: com.appnext.base.b.d$a */
    public enum C1246a {
        String("String"),
        Long("Long"),
        Double("Double"),
        Integer("Integer"),
        HashMap("HashMap"),
        ArrayList("ArrayList"),
        Boolean("Boolean"),
        JSONArray("JSONArray"),
        JSONObject("JSONObject"),
        Set("Set");
        
        private String mDataType;

        private C1246a(String str) {
            this.mDataType = str;
        }

        public final String getType() {
            return this.mDataType;
        }
    }

    /* renamed from: cc */
    public static final String m5270cc() {
        return C1333i.f4228lk;
    }

    /* renamed from: cd */
    public static final String m5271cd() {
        return C1333i.f4229ll;
    }
}
