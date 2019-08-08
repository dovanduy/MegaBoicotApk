package com.startapp.android.publish.common.model;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5286Ad.AdType;
import com.startapp.android.publish.adsCommon.C5427m;
import com.startapp.android.publish.adsCommon.SDKAdPreferences.Gender;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* compiled from: StartAppSDK */
public class AdPreferences implements Serializable {
    public static final String TYPE_APP_WALL = "APP_WALL";
    public static final String TYPE_BANNER = "BANNER";
    public static final String TYPE_INAPP_EXIT = "INAPP_EXIT";
    public static final String TYPE_SCRINGO_TOOLBAR = "SCRINGO_TOOLBAR";
    public static final String TYPE_TEXT = "TEXT";
    private static final long serialVersionUID = 1;
    protected String advertiserId = null;
    private String age = null;

    /* renamed from: ai */
    private Boolean f17484ai = null;

    /* renamed from: as */
    private Boolean f17485as = null;
    private Set<String> categories = null;
    private Set<String> categoriesExclude = null;
    protected String country = null;
    protected boolean forceFullpage = false;
    protected boolean forceOfferWall2D = false;
    protected boolean forceOfferWall3D = false;
    protected boolean forceOverlay = false;
    private Gender gender = null;
    private boolean hardwareAccelerated = C5427m.m23145a().mo20005d();
    private String keywords = null;
    private Double latitude = null;
    private Double longitude = null;
    protected Double minCpm = null;
    protected Set<String> packageInclude = null;
    private String productId = null;
    private String publisherId = null;
    protected String template = null;
    private boolean testMode = false;
    protected AdType type = null;
    private boolean videoMuted = false;

    /* compiled from: StartAppSDK */
    public enum Placement {
        INAPP_FULL_SCREEN(1),
        INAPP_BANNER(2),
        INAPP_OFFER_WALL(3),
        INAPP_SPLASH(4),
        INAPP_OVERLAY(5),
        INAPP_NATIVE(6),
        DEVICE_SIDEBAR(7),
        INAPP_RETURN(8),
        INAPP_BROWSER(9);
        
        private int index;

        private Placement(int i) {
            this.index = i;
        }

        public int getIndex() {
            return this.index;
        }

        public boolean isInterstitial() {
            return this == INAPP_FULL_SCREEN || this == INAPP_OFFER_WALL || this == INAPP_SPLASH || this == INAPP_OVERLAY;
        }

        public static Placement getByIndex(int i) {
            Placement placement = INAPP_FULL_SCREEN;
            Placement[] values = values();
            for (int i2 = 0; i2 < values.length; i2++) {
                if (values[i2].getIndex() == i) {
                    placement = values[i2];
                }
            }
            return placement;
        }
    }

    public boolean isSimpleToken() {
        return true;
    }

    public AdPreferences() {
    }

    public AdPreferences(AdPreferences adPreferences) {
        this.country = adPreferences.country;
        this.advertiserId = adPreferences.advertiserId;
        this.template = adPreferences.template;
        this.type = adPreferences.type;
        if (adPreferences.packageInclude != null) {
            this.packageInclude = new HashSet(adPreferences.packageInclude);
        }
        this.minCpm = adPreferences.minCpm;
        this.forceOfferWall3D = adPreferences.forceOfferWall3D;
        this.forceOfferWall2D = adPreferences.forceOfferWall2D;
        this.forceFullpage = adPreferences.forceFullpage;
        this.forceOverlay = adPreferences.forceOverlay;
        this.publisherId = adPreferences.publisherId;
        this.productId = adPreferences.productId;
        this.testMode = adPreferences.testMode;
        this.longitude = adPreferences.longitude;
        this.latitude = adPreferences.latitude;
        this.keywords = adPreferences.keywords;
        this.gender = adPreferences.gender;
        this.age = adPreferences.age;
        this.f17484ai = adPreferences.f17484ai;
        this.f17485as = adPreferences.f17485as;
        this.videoMuted = adPreferences.videoMuted;
        this.hardwareAccelerated = adPreferences.hardwareAccelerated;
        if (adPreferences.categories != null) {
            this.categories = new HashSet(adPreferences.categories);
        }
        if (adPreferences.categoriesExclude != null) {
            this.categoriesExclude = new HashSet(adPreferences.categoriesExclude);
        }
    }

    @Deprecated
    public AdPreferences(String str, String str2) {
        this.publisherId = str;
        this.productId = str2;
    }

    @Deprecated
    public AdPreferences(String str, String str2, String str3) {
        this.publisherId = str;
        this.productId = str2;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    @Deprecated
    public AdPreferences setPublisherId(String str) {
        this.publisherId = str;
        return this;
    }

    public String getProductId() {
        return this.productId;
    }

    @Deprecated
    public AdPreferences setProductId(String str) {
        this.productId = str;
        return this;
    }

    public boolean isTestMode() {
        return this.testMode;
    }

    public AdPreferences setTestMode(boolean z) {
        this.testMode = z;
        return this;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public AdPreferences setLongitude(double d) {
        this.longitude = Double.valueOf(d);
        return this;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public AdPreferences setLatitude(double d) {
        this.latitude = Double.valueOf(d);
        return this;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public AdPreferences setKeywords(String str) {
        this.keywords = str;
        return this;
    }

    public Gender getGender(Context context) {
        if (this.gender == null) {
            return C5427m.m23145a().mo20012g(context).getGender();
        }
        return this.gender;
    }

    public AdPreferences setGender(Gender gender2) {
        this.gender = gender2;
        return this;
    }

    public String getAge(Context context) {
        if (this.age == null) {
            return C5427m.m23145a().mo20012g(context).getAge();
        }
        return this.age;
    }

    public AdPreferences setAge(Integer num) {
        this.age = Integer.toString(num.intValue());
        return this;
    }

    public AdPreferences setAge(String str) {
        this.age = str;
        return this;
    }

    public Boolean getAi() {
        return this.f17484ai;
    }

    public AdPreferences setAi(Boolean bool) {
        this.f17484ai = bool;
        return this;
    }

    public Boolean getAs() {
        return this.f17485as;
    }

    public AdPreferences setAs(Boolean bool) {
        this.f17485as = bool;
        return this;
    }

    public AdPreferences muteVideo() {
        this.videoMuted = true;
        return this;
    }

    public boolean isVideoMuted() {
        return this.videoMuted;
    }

    public Set<String> getCategories() {
        return this.categories;
    }

    public AdPreferences addCategory(String str) {
        if (this.categories == null) {
            this.categories = new HashSet();
        }
        this.categories.add(str);
        return this;
    }

    public Set<String> getCategoriesExclude() {
        return this.categoriesExclude;
    }

    public AdPreferences addCategoryExclude(String str) {
        if (this.categoriesExclude == null) {
            this.categoriesExclude = new HashSet();
        }
        this.categoriesExclude.add(str);
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean isHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public AdType getType() {
        return this.type;
    }

    public void setType(AdType adType) {
        this.type = adType;
    }

    public Double getMinCpm() {
        return this.minCpm;
    }

    public void setMinCpm(Double d) {
        this.minCpm = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPreferences [publisherId=");
        sb.append(this.publisherId);
        sb.append(", productId=");
        sb.append(this.productId);
        sb.append(", testMode=");
        sb.append(this.testMode);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", keywords=");
        sb.append(this.keywords);
        sb.append(", minCPM=");
        sb.append(this.minCpm);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", categoriesExclude=");
        sb.append(this.categoriesExclude);
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdPreferences adPreferences = (AdPreferences) obj;
        if (this.forceOfferWall3D != adPreferences.forceOfferWall3D || this.forceOfferWall2D != adPreferences.forceOfferWall2D || this.forceFullpage != adPreferences.forceFullpage || this.forceOverlay != adPreferences.forceOverlay || this.testMode != adPreferences.testMode || this.videoMuted != adPreferences.videoMuted || this.hardwareAccelerated != adPreferences.hardwareAccelerated) {
            return false;
        }
        if (this.country == null ? adPreferences.country != null : !this.country.equals(adPreferences.country)) {
            return false;
        }
        if (this.advertiserId == null ? adPreferences.advertiserId != null : !this.advertiserId.equals(adPreferences.advertiserId)) {
            return false;
        }
        if (this.template == null ? adPreferences.template != null : !this.template.equals(adPreferences.template)) {
            return false;
        }
        if (this.type != adPreferences.type) {
            return false;
        }
        if (this.packageInclude == null ? adPreferences.packageInclude != null : !this.packageInclude.equals(adPreferences.packageInclude)) {
            return false;
        }
        if (this.minCpm == null ? adPreferences.minCpm != null : !this.minCpm.equals(adPreferences.minCpm)) {
            return false;
        }
        if (this.publisherId == null ? adPreferences.publisherId != null : !this.publisherId.equals(adPreferences.publisherId)) {
            return false;
        }
        if (this.productId == null ? adPreferences.productId != null : !this.productId.equals(adPreferences.productId)) {
            return false;
        }
        if (this.longitude == null ? adPreferences.longitude != null : !this.longitude.equals(adPreferences.longitude)) {
            return false;
        }
        if (this.latitude == null ? adPreferences.latitude != null : !this.latitude.equals(adPreferences.latitude)) {
            return false;
        }
        if (this.keywords == null ? adPreferences.keywords != null : !this.keywords.equals(adPreferences.keywords)) {
            return false;
        }
        if (this.gender != adPreferences.gender) {
            return false;
        }
        if (this.age == null ? adPreferences.age != null : !this.age.equals(adPreferences.age)) {
            return false;
        }
        if (this.f17484ai == null ? adPreferences.f17484ai != null : !this.f17484ai.equals(adPreferences.f17484ai)) {
            return false;
        }
        if (this.f17485as == null ? adPreferences.f17485as != null : !this.f17485as.equals(adPreferences.f17485as)) {
            return false;
        }
        if (this.categories == null ? adPreferences.categories != null : !this.categories.equals(adPreferences.categories)) {
            return false;
        }
        if (this.categoriesExclude != null) {
            z = this.categoriesExclude.equals(adPreferences.categoriesExclude);
        } else if (adPreferences.categoriesExclude != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = 31 * (((((((((((((((((((((((((((((((((((((((((((((this.country != null ? this.country.hashCode() : 0) * 31) + (this.advertiserId != null ? this.advertiserId.hashCode() : 0)) * 31) + (this.template != null ? this.template.hashCode() : 0)) * 31) + (this.type != null ? this.type.hashCode() : 0)) * 31) + (this.packageInclude != null ? this.packageInclude.hashCode() : 0)) * 31) + (this.forceOfferWall3D ? 1 : 0)) * 31) + (this.forceOfferWall2D ? 1 : 0)) * 31) + (this.forceFullpage ? 1 : 0)) * 31) + (this.forceOverlay ? 1 : 0)) * 31) + (this.minCpm != null ? this.minCpm.hashCode() : 0)) * 31) + (this.publisherId != null ? this.publisherId.hashCode() : 0)) * 31) + (this.productId != null ? this.productId.hashCode() : 0)) * 31) + (this.testMode ? 1 : 0)) * 31) + (this.longitude != null ? this.longitude.hashCode() : 0)) * 31) + (this.latitude != null ? this.latitude.hashCode() : 0)) * 31) + (this.keywords != null ? this.keywords.hashCode() : 0)) * 31) + (this.gender != null ? this.gender.hashCode() : 0)) * 31) + (this.age != null ? this.age.hashCode() : 0)) * 31) + (this.f17484ai != null ? this.f17484ai.hashCode() : 0)) * 31) + (this.f17485as != null ? this.f17485as.hashCode() : 0)) * 31) + (this.videoMuted ? 1 : 0)) * 31) + (this.hardwareAccelerated ? 1 : 0)) * 31) + (this.categories != null ? this.categories.hashCode() : 0));
        if (this.categoriesExclude != null) {
            i = this.categoriesExclude.hashCode();
        }
        return hashCode + i;
    }
}
