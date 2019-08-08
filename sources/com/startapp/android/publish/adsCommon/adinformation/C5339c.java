package com.startapp.android.publish.adsCommon.adinformation;

import com.startapp.android.publish.adsCommon.adinformation.AdInformationPositions.Position;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.adsCommon.adinformation.c */
/* compiled from: StartAppSDK */
public class C5339c implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean enable = true;
    private boolean enableOverride = false;
    @C5548f(mo20535b = Position.class)
    private Position position = Position.getByName(AdInformationPositions.f17089a);
    private boolean positionOverride = false;

    private C5339c() {
    }

    /* renamed from: a */
    public static C5339c m22758a() {
        return new C5339c();
    }

    /* renamed from: b */
    public boolean mo19727b() {
        return this.enable;
    }

    /* renamed from: a */
    public void mo19726a(boolean z) {
        this.enable = z;
        this.enableOverride = true;
    }

    /* renamed from: c */
    public Position mo19728c() {
        return this.position;
    }

    /* renamed from: a */
    public void mo19725a(Position position2) {
        this.position = position2;
        if (position2 != null) {
            this.positionOverride = true;
        } else {
            this.positionOverride = false;
        }
    }

    /* renamed from: d */
    public boolean mo19729d() {
        return this.positionOverride;
    }

    /* renamed from: e */
    public boolean mo19730e() {
        return this.enableOverride;
    }
}
