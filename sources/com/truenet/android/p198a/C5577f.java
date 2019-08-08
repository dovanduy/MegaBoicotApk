package com.truenet.android.p198a;

import android.os.Build.VERSION;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.p002a.C0007g;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: com.truenet.android.a.f */
public final class C5577f {
    /* renamed from: a */
    public static final int m23746a(@NotNull TelephonyManager telephonyManager) {
        C0032h.m45b(telephonyManager, "receiver$0");
        if (VERSION.SDK_INT >= 26) {
            List allCellInfo = telephonyManager.getAllCellInfo();
            CellInfo cellInfo = allCellInfo != null ? (CellInfo) C0007g.m15d(allCellInfo) : null;
            if (cellInfo instanceof CellInfoGsm) {
                CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                C0032h.m42a((Object) cellIdentity, "info.cellIdentity");
                return cellIdentity.getCid();
            } else if (cellInfo instanceof CellInfoCdma) {
                CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                C0032h.m42a((Object) cellIdentity2, "info.cellIdentity");
                return cellIdentity2.getBasestationId();
            }
        }
        return m23748c(telephonyManager);
    }

    /* renamed from: b */
    public static final int m23747b(@NotNull TelephonyManager telephonyManager) {
        C0032h.m45b(telephonyManager, "receiver$0");
        if (VERSION.SDK_INT >= 26) {
            List allCellInfo = telephonyManager.getAllCellInfo();
            CellInfo cellInfo = allCellInfo != null ? (CellInfo) C0007g.m15d(allCellInfo) : null;
            if (cellInfo instanceof CellInfoGsm) {
                CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                C0032h.m42a((Object) cellIdentity, "info.cellIdentity");
                return cellIdentity.getLac();
            }
        }
        return m23749d(telephonyManager);
    }

    /* renamed from: c */
    private static final int m23748c(@NotNull TelephonyManager telephonyManager) {
        CellLocation cellLocation = telephonyManager.getCellLocation();
        if (cellLocation instanceof GsmCellLocation) {
            return ((GsmCellLocation) cellLocation).getCid();
        }
        if (cellLocation instanceof CdmaCellLocation) {
            return ((CdmaCellLocation) cellLocation).getBaseStationId();
        }
        return -1;
    }

    /* renamed from: d */
    private static final int m23749d(@NotNull TelephonyManager telephonyManager) {
        CellLocation cellLocation = telephonyManager.getCellLocation();
        if (cellLocation instanceof GsmCellLocation) {
            return ((GsmCellLocation) cellLocation).getLac();
        }
        return -1;
    }
}
