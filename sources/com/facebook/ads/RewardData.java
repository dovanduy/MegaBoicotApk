package com.facebook.ads;

import java.io.Serializable;

public class RewardData implements Serializable {
    public static final long serialVersionUID = 1;

    /* renamed from: a */
    private String f4774a;

    /* renamed from: b */
    private String f4775b;

    public RewardData(String str, String str2) {
        this.f4774a = str;
        this.f4775b = str2;
    }

    public String getCurrency() {
        return this.f4775b;
    }

    public String getUserID() {
        return this.f4774a;
    }
}
