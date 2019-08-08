package com.appnext.core;

/* renamed from: com.appnext.core.b */
public final class C1307b {
    private String cat = "";
    private int cnt;

    /* renamed from: jV */
    private String f4131jV = "";

    /* renamed from: jW */
    private int f4132jW;

    /* renamed from: jX */
    private int f4133jX;
    private String pbk = "";

    public C1307b(C1286Ad ad) {
        this.f4131jV = ad.getPlacementID();
        this.cat = ad.getCategories();
        this.pbk = ad.getPostback();
        this.f4132jW = ad.getMinVideoLength();
        this.f4133jX = ad.getMaxVideoLength();
        this.cnt = ad.getCount();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!getClass().isInstance(obj) && !obj.getClass().isInstance(this)) {
            return false;
        }
        if (!(obj instanceof C1307b)) {
            return super.equals(obj);
        }
        C1307b bVar = (C1307b) obj;
        return bVar.f4131jV.equals(this.f4131jV) && bVar.cat.equals(this.cat) && bVar.pbk.equals(this.pbk) && bVar.f4132jW == this.f4132jW && bVar.f4133jX == this.f4133jX && bVar.cnt == this.cnt;
    }

    public final int hashCode() {
        return (31 * ((((((((this.f4131jV.hashCode() * 31) + this.cat.hashCode()) * 31) + this.pbk.hashCode()) * 31) + this.f4132jW) * 31) + this.f4133jX)) + this.cnt;
    }
}
