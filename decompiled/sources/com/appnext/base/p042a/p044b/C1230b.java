package com.appnext.base.p042a.p044b;

import java.util.Date;

/* renamed from: com.appnext.base.a.b.b */
public final class C1230b extends C1232d {

    /* renamed from: gu */
    private String f3895gu;

    /* renamed from: gv */
    private String f3896gv;

    /* renamed from: gw */
    private String f3897gw;

    /* renamed from: gx */
    private Date f3898gx;
    private String mDataType;

    public C1230b(String str, String str2, String str3) {
        this(str, str, str2, null, str3);
    }

    public C1230b(String str, String str2, String str3, String str4) {
        this(str, str2, str3, null, str4);
    }

    public C1230b(String str, String str2, String str3, Date date, String str4) {
        this.f3895gu = str;
        this.f3896gv = str2;
        this.f3897gw = str3;
        this.f3898gx = date;
        this.mDataType = str4;
    }

    /* renamed from: aY */
    public final String mo5897aY() {
        return this.f3895gu;
    }

    public final String getType() {
        return this.f3896gv;
    }

    /* renamed from: aZ */
    public final String mo5898aZ() {
        return this.f3897gw;
    }

    /* renamed from: ba */
    public final Date mo5899ba() {
        return this.f3898gx;
    }

    public final String getDataType() {
        return this.mDataType;
    }
}
