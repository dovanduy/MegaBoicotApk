package com.startapp.android.publish.cache;

import com.appnext.base.p046b.C1245d;
import com.startapp.android.publish.adsCommon.C5286Ad.AdType;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import java.io.Serializable;
import java.util.Set;

/* renamed from: com.startapp.android.publish.cache.c */
/* compiled from: StartAppSDK */
public class C5445c implements Serializable {
    private static final long serialVersionUID = 1;
    private String advertiserId = null;
    private Set<String> categories;
    private Set<String> categoriesExclude;
    private String country = null;
    private boolean forceFullpage = false;
    private boolean forceOfferWall2D = false;
    private boolean forceOfferWall3D = false;
    private boolean forceOverlay = false;
    private Double minCpm;
    private Placement placement;
    private String template = null;
    private boolean testMode = false;
    private AdType type = null;
    private boolean videoMuted = false;

    public C5445c(Placement placement2, AdPreferences adPreferences) {
        this.placement = placement2;
        this.categories = adPreferences.getCategories();
        this.categoriesExclude = adPreferences.getCategoriesExclude();
        this.videoMuted = adPreferences.isVideoMuted();
        this.minCpm = adPreferences.getMinCpm();
        this.forceOfferWall3D = C5307i.m22677a(adPreferences, "forceOfferWall3D");
        this.forceOfferWall2D = C5307i.m22677a(adPreferences, "forceOfferWall2D");
        this.forceFullpage = C5307i.m22677a(adPreferences, "forceFullpage");
        this.forceOverlay = C5307i.m22677a(adPreferences, "forceOverlay");
        this.testMode = C5307i.m22677a(adPreferences, "testMode");
        this.country = C5307i.m22681b(adPreferences, "country");
        this.advertiserId = C5307i.m22681b(adPreferences, "advertiserId");
        this.template = C5307i.m22681b(adPreferences, "template");
        this.type = C5349c.m22846a(adPreferences, C1245d.f3961jd);
    }

    /* renamed from: a */
    public Placement mo20099a() {
        return this.placement;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1237;
        int hashCode = ((((((((((((((((((((((this.advertiserId == null ? 0 : this.advertiserId.hashCode()) + 31) * 31) + (this.categories == null ? 0 : this.categories.hashCode())) * 31) + (this.categoriesExclude == null ? 0 : this.categoriesExclude.hashCode())) * 31) + (this.country == null ? 0 : this.country.hashCode())) * 31) + (this.minCpm == null ? 0 : this.minCpm.hashCode())) * 31) + (this.forceFullpage ? 1231 : 1237)) * 31) + (this.forceOfferWall2D ? 1231 : 1237)) * 31) + (this.forceOfferWall3D ? 1231 : 1237)) * 31) + (this.forceOverlay ? 1231 : 1237)) * 31) + (this.placement == null ? 0 : this.placement.hashCode())) * 31) + (this.template == null ? 0 : this.template.hashCode())) * 31;
        if (this.testMode) {
            i2 = 1231;
        }
        int i3 = 31 * (hashCode + i2);
        if (this.type != null) {
            i = this.type.hashCode();
        }
        return i3 + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5445c cVar = (C5445c) obj;
        if (this.advertiserId == null) {
            if (cVar.advertiserId != null) {
                return false;
            }
        } else if (!this.advertiserId.equals(cVar.advertiserId)) {
            return false;
        }
        if (this.categories == null) {
            if (cVar.categories != null) {
                return false;
            }
        } else if (!this.categories.equals(cVar.categories)) {
            return false;
        }
        if (this.categoriesExclude == null) {
            if (cVar.categoriesExclude != null) {
                return false;
            }
        } else if (!this.categoriesExclude.equals(cVar.categoriesExclude)) {
            return false;
        }
        if (this.country == null) {
            if (cVar.country != null) {
                return false;
            }
        } else if (!this.country.equals(cVar.country)) {
            return false;
        }
        if (this.forceFullpage != cVar.forceFullpage || this.forceOfferWall2D != cVar.forceOfferWall2D || this.forceOfferWall3D != cVar.forceOfferWall3D || this.forceOverlay != cVar.forceOverlay || this.placement != cVar.placement) {
            return false;
        }
        if (this.template == null) {
            if (cVar.template != null) {
                return false;
            }
        } else if (!this.template.equals(cVar.template)) {
            return false;
        }
        if (this.testMode != cVar.testMode || this.videoMuted != cVar.videoMuted) {
            return false;
        }
        if (this.type == null) {
            if (cVar.type != null) {
                return false;
            }
        } else if (!this.type.equals(cVar.type)) {
            return false;
        }
        if (this.minCpm == null) {
            if (cVar.minCpm != null) {
                return false;
            }
        } else if (this.minCpm != cVar.minCpm) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CacheKey [placement=");
        sb.append(this.placement);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", categoriesExclude=");
        sb.append(this.categoriesExclude);
        sb.append(", forceOfferWall3D=");
        sb.append(this.forceOfferWall3D);
        sb.append(", forceOfferWall2D=");
        sb.append(this.forceOfferWall2D);
        sb.append(", forceFullpage=");
        sb.append(this.forceFullpage);
        sb.append(", forceOverlay=");
        sb.append(this.forceOverlay);
        sb.append(", testMode=");
        sb.append(this.testMode);
        sb.append(", minCpm=");
        sb.append(this.minCpm);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", advertiserId=");
        sb.append(this.advertiserId);
        sb.append(", template=");
        sb.append(this.template);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", videoMuted=");
        sb.append(this.videoMuted);
        sb.append("]");
        return sb.toString();
    }
}
