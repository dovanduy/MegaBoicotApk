package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p177a.C5318e;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.metaData.MetaDataStyle;
import com.startapp.common.p193a.C5515e;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.adsCommon.b */
/* compiled from: StartAppSDK */
public class C5344b implements Serializable {

    /* renamed from: a */
    public static final Integer f17135a = Integer.valueOf(18);

    /* renamed from: b */
    public static final Integer f17136b = Integer.valueOf(-1);

    /* renamed from: c */
    public static final Set<String> f17137c = new HashSet(Arrays.asList(new String[]{"BOLD"}));

    /* renamed from: d */
    public static final Integer f17138d = Integer.valueOf(-16777216);

    /* renamed from: e */
    public static final Integer f17139e = Integer.valueOf(-14803426);

    /* renamed from: f */
    public static final Integer f17140f = Integer.valueOf(-1);

    /* renamed from: g */
    private static transient Object f17141g = new Object();

    /* renamed from: h */
    private static C5344b f17142h = new C5344b();
    private static final long serialVersionUID = 1;
    private String acMetadataUpdateVersion = AdsConstants.f17011h;
    @C5548f(mo20534a = true)
    private C5318e adRules = new C5318e();
    private boolean appPresence = true;
    private boolean autoInterstitialEnabled = true;
    private Integer backgroundGradientBottom = Integer.valueOf(-14606047);
    private Integer backgroundGradientTop = Integer.valueOf(-14606047);
    private int defaultActivitiesBetweenAds = 1;
    private int defaultSecondsBetweenAds = 0;
    private boolean disableInAppStore = false;
    private boolean disableReturnAd = false;
    private boolean disableSplashAd = false;
    private boolean disableTwoClicks = false;
    private boolean enableForceExternalBrowser = true;
    private boolean enableSmartRedirect = true;
    private boolean enforceForeground = false;
    private int forceExternalBrowserDaysInterval = 7;
    private Integer fullpageOfferWallProbability = Integer.valueOf(100);
    private Integer fullpageOverlayProbability = Integer.valueOf(0);
    private Integer homeProbability3D = Integer.valueOf(80);
    private Integer itemDescriptionTextColor = MetaDataStyle.DEFAULT_ITEM_DESC_TEXT_COLOR;
    @C5548f(mo20535b = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = MetaDataStyle.DEFAULT_ITEM_DESC_TEXT_DECORATION;
    private Integer itemDescriptionTextSize = MetaDataStyle.DEFAULT_ITEM_DESC_TEXT_SIZE;
    private Integer itemGradientBottom = Integer.valueOf(MetaDataStyle.DEFAULT_ITEM_BOTTOM);
    private Integer itemGradientTop = Integer.valueOf(MetaDataStyle.DEFAULT_ITEM_TOP);
    private Integer itemTitleTextColor = MetaDataStyle.DEFAULT_ITEM_TITLE_TEXT_COLOR;
    @C5548f(mo20535b = HashSet.class)
    private Set<String> itemTitleTextDecoration = MetaDataStyle.DEFAULT_ITEM_TITLE_TEXT_DECORATION;
    private Integer itemTitleTextSize = MetaDataStyle.DEFAULT_ITEM_TITLE_TEXT_SIZE;
    private Integer maxAds = Integer.valueOf(10);
    private Integer poweredByBackgroundColor = f17139e;
    private Integer poweredByTextColor = f17140f;
    private Integer probability3D = Integer.valueOf(0);
    private long returnAdMinBackgroundTime = 300;
    private long smartRedirectLoadedTimeout = 1000;
    private int smartRedirectTimeout = 5;
    @C5548f(mo20535b = HashMap.class, mo20536c = MetaDataStyle.class)
    private HashMap<String, MetaDataStyle> templates = new HashMap<>();
    private Integer titleBackgroundColor = Integer.valueOf(-14803426);
    private String titleContent = "Recommended for you";
    private Integer titleLineColor = f17138d;
    private Integer titleTextColor = f17136b;
    @C5548f(mo20535b = HashSet.class)
    private Set<String> titleTextDecoration = f17137c;
    private Integer titleTextSize = f17135a;
    @C5548f(mo20534a = true)
    private C5433n video = new C5433n();

    /* renamed from: a */
    public static C5344b m22784a() {
        return f17142h;
    }

    /* renamed from: a */
    public static void m22785a(Context context) {
        C5344b bVar = (C5344b) C5515e.m23542a(context, "StartappAdsMetadata", C5344b.class);
        C5344b bVar2 = new C5344b();
        if (bVar != null) {
            boolean a = C5307i.m22678a(bVar, bVar2);
            if (!bVar.m22782O() && a) {
                C5378f.m23016a(context, C5376d.METADATA_NULL, "AdsCommonMetaData", "", "");
            }
            bVar.m22783P();
            f17142h = bVar;
            return;
        }
        f17142h = bVar2;
    }

    /* renamed from: O */
    private boolean m22782O() {
        return !AdsConstants.f17011h.equals(this.acMetadataUpdateVersion);
    }

    /* renamed from: P */
    private void m22783P() {
        this.adRules.mo19657b();
    }

    /* renamed from: b */
    public int mo19764b() {
        return this.fullpageOfferWallProbability.intValue();
    }

    /* renamed from: c */
    public int mo19765c() {
        return this.fullpageOverlayProbability.intValue();
    }

    /* renamed from: d */
    public int mo19766d() {
        return this.probability3D.intValue();
    }

    /* renamed from: e */
    public int mo19767e() {
        return this.backgroundGradientTop.intValue();
    }

    /* renamed from: a */
    public MetaDataStyle mo19763a(String str) {
        return (MetaDataStyle) this.templates.get(str);
    }

    /* renamed from: f */
    public int mo19769f() {
        return this.backgroundGradientBottom.intValue();
    }

    /* renamed from: g */
    public int mo19770g() {
        return this.maxAds.intValue();
    }

    /* renamed from: h */
    public Integer mo19771h() {
        return this.titleBackgroundColor;
    }

    /* renamed from: i */
    public String mo19773i() {
        return this.titleContent;
    }

    /* renamed from: j */
    public Integer mo19774j() {
        return this.titleTextSize;
    }

    /* renamed from: k */
    public Integer mo19775k() {
        return this.titleTextColor;
    }

    /* renamed from: l */
    public Set<String> mo19776l() {
        return this.titleTextDecoration;
    }

    /* renamed from: m */
    public Integer mo19777m() {
        return this.titleLineColor;
    }

    /* renamed from: n */
    public int mo19778n() {
        return this.itemGradientTop.intValue();
    }

    /* renamed from: o */
    public int mo19779o() {
        return this.itemGradientBottom.intValue();
    }

    /* renamed from: p */
    public Integer mo19780p() {
        return this.itemTitleTextSize;
    }

    /* renamed from: q */
    public Integer mo19781q() {
        return this.itemTitleTextColor;
    }

    /* renamed from: r */
    public Set<String> mo19782r() {
        return this.itemTitleTextDecoration;
    }

    /* renamed from: s */
    public Integer mo19783s() {
        return this.itemDescriptionTextSize;
    }

    /* renamed from: t */
    public Integer mo19784t() {
        return this.itemDescriptionTextColor;
    }

    /* renamed from: u */
    public Set<String> mo19785u() {
        return this.itemDescriptionTextDecoration;
    }

    /* renamed from: v */
    public Integer mo19786v() {
        return this.poweredByBackgroundColor;
    }

    /* renamed from: w */
    public Integer mo19787w() {
        return this.poweredByTextColor;
    }

    /* renamed from: x */
    public long mo19788x() {
        return TimeUnit.SECONDS.toMillis(this.returnAdMinBackgroundTime);
    }

    /* renamed from: y */
    public boolean mo19789y() {
        return this.disableReturnAd;
    }

    /* renamed from: z */
    public boolean mo19790z() {
        return this.disableSplashAd;
    }

    /* renamed from: A */
    public long mo19749A() {
        return TimeUnit.SECONDS.toMillis((long) this.smartRedirectTimeout);
    }

    /* renamed from: B */
    public long mo19750B() {
        return this.smartRedirectLoadedTimeout;
    }

    /* renamed from: C */
    public boolean mo19751C() {
        return this.enableSmartRedirect;
    }

    /* renamed from: D */
    public boolean mo19752D() {
        return this.disableTwoClicks;
    }

    /* renamed from: E */
    public boolean mo19753E() {
        return this.appPresence;
    }

    /* renamed from: F */
    public C5318e mo19754F() {
        return this.adRules;
    }

    /* renamed from: G */
    public boolean mo19755G() {
        return this.disableInAppStore;
    }

    /* renamed from: H */
    public C5433n mo19756H() {
        return this.video;
    }

    /* renamed from: I */
    public boolean mo19757I() {
        return this.autoInterstitialEnabled;
    }

    /* renamed from: J */
    public int mo19758J() {
        return this.defaultActivitiesBetweenAds;
    }

    /* renamed from: K */
    public int mo19759K() {
        return this.defaultSecondsBetweenAds;
    }

    /* renamed from: L */
    public int mo19760L() {
        return this.forceExternalBrowserDaysInterval;
    }

    /* renamed from: M */
    public boolean mo19761M() {
        return this.enableForceExternalBrowser;
    }

    /* renamed from: N */
    public boolean mo19762N() {
        return this.enforceForeground;
    }

    /* renamed from: a */
    public static void m22786a(Context context, C5344b bVar) {
        synchronized (f17141g) {
            bVar.acMetadataUpdateVersion = AdsConstants.f17011h;
            f17142h = bVar;
            C5515e.m23546a(context, "StartappAdsMetadata", (Serializable) bVar);
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5344b bVar = (C5344b) obj;
        if (this.returnAdMinBackgroundTime != bVar.returnAdMinBackgroundTime || this.disableReturnAd != bVar.disableReturnAd || this.disableSplashAd != bVar.disableSplashAd || this.smartRedirectTimeout != bVar.smartRedirectTimeout || this.smartRedirectLoadedTimeout != bVar.smartRedirectLoadedTimeout || this.enableSmartRedirect != bVar.enableSmartRedirect || this.autoInterstitialEnabled != bVar.autoInterstitialEnabled || this.defaultActivitiesBetweenAds != bVar.defaultActivitiesBetweenAds || this.defaultSecondsBetweenAds != bVar.defaultSecondsBetweenAds || this.disableTwoClicks != bVar.disableTwoClicks || this.appPresence != bVar.appPresence || this.disableInAppStore != bVar.disableInAppStore || this.forceExternalBrowserDaysInterval != bVar.forceExternalBrowserDaysInterval || this.enableForceExternalBrowser != bVar.enableForceExternalBrowser || this.enforceForeground != bVar.enforceForeground || !C5307i.m22682b(this.acMetadataUpdateVersion, bVar.acMetadataUpdateVersion) || !C5307i.m22682b(this.probability3D, bVar.probability3D) || !C5307i.m22682b(this.homeProbability3D, bVar.homeProbability3D) || !C5307i.m22682b(this.fullpageOfferWallProbability, bVar.fullpageOfferWallProbability) || !C5307i.m22682b(this.fullpageOverlayProbability, bVar.fullpageOverlayProbability) || !C5307i.m22682b(this.backgroundGradientTop, bVar.backgroundGradientTop) || !C5307i.m22682b(this.backgroundGradientBottom, bVar.backgroundGradientBottom) || !C5307i.m22682b(this.maxAds, bVar.maxAds) || !C5307i.m22682b(this.titleBackgroundColor, bVar.titleBackgroundColor) || !C5307i.m22682b(this.titleContent, bVar.titleContent) || !C5307i.m22682b(this.titleTextSize, bVar.titleTextSize) || !C5307i.m22682b(this.titleTextColor, bVar.titleTextColor) || !C5307i.m22682b(this.titleTextDecoration, bVar.titleTextDecoration) || !C5307i.m22682b(this.titleLineColor, bVar.titleLineColor) || !C5307i.m22682b(this.itemGradientTop, bVar.itemGradientTop) || !C5307i.m22682b(this.itemGradientBottom, bVar.itemGradientBottom) || !C5307i.m22682b(this.itemTitleTextSize, bVar.itemTitleTextSize) || !C5307i.m22682b(this.itemTitleTextColor, bVar.itemTitleTextColor) || !C5307i.m22682b(this.itemTitleTextDecoration, bVar.itemTitleTextDecoration) || !C5307i.m22682b(this.itemDescriptionTextSize, bVar.itemDescriptionTextSize) || !C5307i.m22682b(this.itemDescriptionTextColor, bVar.itemDescriptionTextColor) || !C5307i.m22682b(this.itemDescriptionTextDecoration, bVar.itemDescriptionTextDecoration) || !C5307i.m22682b(this.templates, bVar.templates) || !C5307i.m22682b(this.adRules, bVar.adRules) || !C5307i.m22682b(this.poweredByBackgroundColor, bVar.poweredByBackgroundColor) || !C5307i.m22682b(this.poweredByTextColor, bVar.poweredByTextColor) || !C5307i.m22682b(this.video, bVar.video)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(this.acMetadataUpdateVersion, this.probability3D, this.homeProbability3D, this.fullpageOfferWallProbability, this.fullpageOverlayProbability, this.backgroundGradientTop, this.backgroundGradientBottom, this.maxAds, this.titleBackgroundColor, this.titleContent, this.titleTextSize, this.titleTextColor, this.titleTextDecoration, this.titleLineColor, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration, this.templates, this.adRules, this.poweredByBackgroundColor, this.poweredByTextColor, Long.valueOf(this.returnAdMinBackgroundTime), Boolean.valueOf(this.disableReturnAd), Boolean.valueOf(this.disableSplashAd), Integer.valueOf(this.smartRedirectTimeout), Long.valueOf(this.smartRedirectLoadedTimeout), Boolean.valueOf(this.enableSmartRedirect), Boolean.valueOf(this.autoInterstitialEnabled), Integer.valueOf(this.defaultActivitiesBetweenAds), Integer.valueOf(this.defaultSecondsBetweenAds), Boolean.valueOf(this.disableTwoClicks), Boolean.valueOf(this.appPresence), Boolean.valueOf(this.disableInAppStore), this.video, Integer.valueOf(this.forceExternalBrowserDaysInterval), Boolean.valueOf(this.enableForceExternalBrowser), Boolean.valueOf(this.enforceForeground));
    }
}
