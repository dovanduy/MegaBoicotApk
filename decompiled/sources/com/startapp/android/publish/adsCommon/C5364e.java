package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.p055c.p056a.p057a.p058a.C1434b;
import com.startapp.android.publish.ads.splash.SplashConfig.Orientation;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationPositions.Position;
import com.startapp.android.publish.adsCommon.p178b.C5345a;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.adsCommon.p183g.p187d.C5393a;
import com.startapp.android.publish.cache.C5436a;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.omsdk.C5498b;
import com.startapp.common.p193a.C5518g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.adsCommon.e */
/* compiled from: StartAppSDK */
public abstract class C5364e extends C5286Ad {

    /* renamed from: a */
    protected static String f17192a = null;
    private static final long serialVersionUID = 1;
    private String adId = null;
    private List<C5345a> apps;
    private String[] closingUrl = {""};
    private Long delayImpressionInSeconds;
    private int height;
    private String htmlUuid = "";
    public boolean[] inAppBrowserEnabled = {true};
    private boolean isMraidAd = false;
    private int orientation = 0;
    private String[] packageNames = {""};
    private Boolean[] sendRedirectHops = null;
    public boolean[] smartRedirect = {false};
    private String[] trackingClickUrls = {""};
    public String[] trackingUrls = {""};
    private int width;

    /* renamed from: f */
    public String mo19847f() {
        return C5436a.m23246a().mo20081b(this.htmlUuid);
    }

    /* renamed from: g */
    public String mo19848g() {
        return this.htmlUuid;
    }

    /* renamed from: b */
    public void mo19838b(int i) {
        this.width = i;
    }

    /* renamed from: h */
    public int mo19849h() {
        return this.width;
    }

    /* renamed from: c */
    public void mo19840c(int i) {
        this.height = i;
    }

    /* renamed from: c */
    public void mo19841c(String str) {
        this.closingUrl = str.split(",");
    }

    /* renamed from: i */
    public String[] mo19850i() {
        return this.closingUrl;
    }

    /* renamed from: j */
    public int mo19851j() {
        return this.height;
    }

    /* renamed from: a */
    public void mo19835a(int i, int i2) {
        mo19838b(i);
        mo19840c(i2);
    }

    public C5364e(Context context, Placement placement) {
        super(context, placement);
        if (f17192a == null) {
            mo18767a();
        }
    }

    /* renamed from: a */
    private void mo18767a() {
        f17192a = C5307i.m22684c(getContext());
    }

    /* renamed from: f */
    private String m22916f(String str) {
        try {
            return C1434b.m5916a(C5498b.m23467a(), str);
        } catch (Exception e) {
            C5518g.m23561a(6, e.getMessage());
            C5378f.m23016a(this.context, C5376d.EXCEPTION, "OMSDK: Failed to inject js to html ad.", e.getMessage(), "");
            return str;
        }
    }

    /* renamed from: b */
    public void mo19362b(String str) {
        if (C5393a.m23049b(str)) {
            str = C5393a.m23046a(str);
            mo19839b(true);
        }
        if (MetaData.getInstance().isOmsdkEnabled()) {
            str = m22916f(str);
        }
        if (C5307i.m22674a(512)) {
            this.htmlUuid = C5436a.m23246a().mo20074a(str);
        }
        String a = mo19834a(str, "@smartRedirect@");
        if (a != null) {
            m22919i(a);
        }
        String a2 = mo19834a(str, "@trackingClickUrl@");
        if (a2 != null) {
            m22921k(a2);
        }
        String a3 = mo19834a(str, "@closeUrl@");
        if (a3 != null) {
            mo19841c(a3);
        }
        String a4 = mo19834a(str, "@tracking@");
        if (a4 != null) {
            m22920j(a4);
        }
        String a5 = mo19834a(str, "@packageName@");
        if (a5 != null) {
            m22922l(a5);
        }
        String a6 = mo19834a(str, "@startappBrowserEnabled@");
        if (a6 != null) {
            m22918h(a6);
        }
        String a7 = mo19834a(str, "@orientation@");
        if (a7 != null && C5307i.m22674a(8)) {
            mo19836a(Orientation.getByName(a7));
        }
        String a8 = mo19834a(str, "@adInfoEnable@");
        if (a8 != null) {
            m22923m(a8);
        }
        String a9 = mo19834a(str, "@adInfoPosition@");
        if (a9 != null) {
            m22924n(a9);
        }
        String a10 = mo19834a(str, "@ttl@");
        if (a10 != null) {
            mo19842d(a10);
        }
        String a11 = mo19834a(str, "@belowMinCPM@");
        if (a11 != null) {
            m22917g(a11);
        }
        String a12 = mo19834a(str, "@delayImpressionInSeconds@");
        if (a12 != null) {
            m22925o(a12);
        }
        String a13 = mo19834a(str, "@sendRedirectHops@");
        if (a13 != null) {
            mo19844e(a13);
        }
        if (this.smartRedirect.length < this.trackingUrls.length) {
            C5518g.m23561a(6, "Error in smartRedirect array in HTML");
            boolean[] zArr = new boolean[this.trackingUrls.length];
            int i = 0;
            while (i < this.smartRedirect.length) {
                zArr[i] = this.smartRedirect[i];
                i++;
            }
            while (i < this.trackingUrls.length) {
                zArr[i] = false;
                i++;
            }
            this.smartRedirect = zArr;
        }
    }

    /* renamed from: g */
    private void m22917g(String str) {
        if (Arrays.asList(str.split(",")).contains("false")) {
            this.belowMinCPM = false;
        } else {
            this.belowMinCPM = true;
        }
    }

    /* renamed from: h */
    private void m22918h(String str) {
        String[] split = str.split(",");
        this.inAppBrowserEnabled = new boolean[split.length];
        for (int i = 0; i < split.length; i++) {
            if (split[i].compareTo("false") == 0) {
                this.inAppBrowserEnabled[i] = false;
            } else {
                this.inAppBrowserEnabled[i] = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo19834a(String str, String str2) {
        return C5307i.m22659a(str, str2, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19836a(Orientation orientation2) {
        this.orientation = 0;
        boolean a = C5307i.m22674a(8);
        if (orientation2 == null) {
            return;
        }
        if (a && orientation2.equals(Orientation.PORTRAIT)) {
            this.orientation = 1;
        } else if (a && orientation2.equals(Orientation.LANDSCAPE)) {
            this.orientation = 2;
        }
    }

    /* renamed from: i */
    private void m22919i(String str) {
        String[] split = str.split(",");
        this.smartRedirect = new boolean[split.length];
        for (int i = 0; i < split.length; i++) {
            if (split[i].compareTo("true") == 0) {
                this.smartRedirect[i] = true;
            } else {
                this.smartRedirect[i] = false;
            }
        }
    }

    /* renamed from: d */
    public boolean mo19843d(int i) {
        if (i < 0 || i >= this.smartRedirect.length) {
            return false;
        }
        return this.smartRedirect[i];
    }

    /* renamed from: k */
    public boolean[] mo19852k() {
        return this.inAppBrowserEnabled;
    }

    /* renamed from: e */
    public boolean mo19845e(int i) {
        if (this.inAppBrowserEnabled == null || i < 0 || i >= this.inAppBrowserEnabled.length) {
            return true;
        }
        return this.inAppBrowserEnabled[i];
    }

    /* renamed from: j */
    private void m22920j(String str) {
        this.trackingUrls = str.split(",");
    }

    /* renamed from: l */
    public String[] mo19853l() {
        return this.trackingUrls;
    }

    /* renamed from: m */
    public String[] mo19854m() {
        return this.trackingClickUrls;
    }

    /* renamed from: k */
    private void m22921k(String str) {
        this.trackingClickUrls = str.split(",");
    }

    /* renamed from: n */
    public int mo19855n() {
        return this.orientation;
    }

    /* renamed from: l */
    private void m22922l(String str) {
        this.packageNames = str.split(",");
    }

    /* renamed from: o */
    public String[] mo19856o() {
        return this.packageNames;
    }

    /* renamed from: a */
    public void mo19837a(List<C5345a> list) {
        this.apps = list;
    }

    /* renamed from: m */
    private void m22923m(String str) {
        getAdInfoOverride().mo19726a(Boolean.parseBoolean(str));
    }

    /* renamed from: n */
    private void m22924n(String str) {
        getAdInfoOverride().mo19725a(Position.getByName(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a_ */
    public String mo18769a_() {
        return f17192a;
    }

    /* renamed from: d */
    public void mo19842d(String str) {
        String[] split;
        Long l = null;
        for (String str2 : str.split(",")) {
            if (!str2.equals("")) {
                try {
                    long parseLong = Long.parseLong(str2);
                    if (parseLong > 0 && (l == null || parseLong < l.longValue())) {
                        l = Long.valueOf(parseLong);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (l != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l.longValue()));
        }
    }

    /* renamed from: p */
    public Long mo19857p() {
        return this.delayImpressionInSeconds;
    }

    /* renamed from: o */
    private void m22925o(String str) {
        if (str != null && !str.equals("")) {
            try {
                this.delayImpressionInSeconds = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: q */
    public Boolean[] mo19858q() {
        return this.sendRedirectHops;
    }

    /* renamed from: f */
    public Boolean mo19846f(int i) {
        if (this.sendRedirectHops == null || i < 0 || i >= this.sendRedirectHops.length) {
            return null;
        }
        return this.sendRedirectHops[i];
    }

    /* renamed from: e */
    public void mo19844e(String str) {
        if (str != null && !str.equals("")) {
            String[] split = str.split(",");
            this.sendRedirectHops = new Boolean[split.length];
            for (int i = 0; i < split.length; i++) {
                if (split[i].compareTo("true") == 0) {
                    this.sendRedirectHops[i] = Boolean.valueOf(true);
                } else if (split[i].compareTo("false") == 0) {
                    this.sendRedirectHops[i] = Boolean.valueOf(false);
                } else {
                    this.sendRedirectHops[i] = null;
                }
            }
        }
    }

    /* renamed from: r */
    public boolean mo19859r() {
        return this.isMraidAd;
    }

    /* renamed from: b */
    public void mo19839b(boolean z) {
        this.isMraidAd = z;
    }
}
