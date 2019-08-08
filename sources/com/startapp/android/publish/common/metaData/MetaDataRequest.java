package com.startapp.android.publish.common.metaData;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.startapp.android.publish.adsCommon.BaseRequest;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.C5416l;
import com.startapp.android.publish.adsCommon.C5427m;
import com.startapp.android.publish.adsCommon.Utils.C5301d;
import com.startapp.android.publish.adsCommon.Utils.C5302e;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.common.p193a.C5503a;
import com.startapp.common.p193a.C5509c;

/* compiled from: StartAppSDK */
public class MetaDataRequest extends BaseRequest {
    private String apkHash;
    private int daysSinceFirstSession;
    private long firstInstalledAppTS;
    private Integer ian;
    private float paidAmount;
    private boolean payingUser;
    private String profileId = MetaData.getInstance().getProfileId();
    private C5474a reason;
    private Pair<String, String> simpleToken;
    private int totalSessions;

    /* renamed from: com.startapp.android.publish.common.metaData.MetaDataRequest$a */
    /* compiled from: StartAppSDK */
    public enum C5474a {
        LAUNCH(1),
        APP_IDLE(2),
        IN_APP_PURCHASE(3),
        CUSTOM(4),
        PERIODIC(5),
        PAS(6);
        
        private int index;

        private C5474a(int i) {
            this.index = i;
        }
    }

    public MetaDataRequest(Context context, C5474a aVar) {
        this.totalSessions = C5414k.m23094a(context, "totalSessions", Integer.valueOf(0)).intValue();
        this.daysSinceFirstSession = calcDaysSinceFirstSession(context);
        this.paidAmount = C5414k.m23093a(context, "inAppPurchaseAmount", Float.valueOf(0.0f)).floatValue();
        this.payingUser = C5414k.m23092a(context, "payingUser", Boolean.valueOf(false)).booleanValue();
        this.reason = aVar;
        this.apkHash = calcApkHash(context, C5414k.m23091a(context), C5427m.m23145a().mo20009e(), new C5307i());
        setIan(context);
        this.simpleToken = C5416l.m23123c();
        this.firstInstalledAppTS = C5416l.m23113a();
    }

    private int calcDaysSinceFirstSession(Context context) {
        return millisToDays(System.currentTimeMillis() - C5414k.m23095a(context, "firstSessionTime", Long.valueOf(System.currentTimeMillis())).longValue());
    }

    private int millisToDays(long j) {
        return (int) (j / 86400000);
    }

    public int getTotalSessions() {
        return this.totalSessions;
    }

    public void setTotalSessions(int i) {
        this.totalSessions = i;
    }

    public String getApkHash() {
        return this.apkHash;
    }

    public void setApkHash(String str) {
        this.apkHash = str;
    }

    public int getDaysSinceFirstSession() {
        return this.daysSinceFirstSession;
    }

    public void setDaysSinceFirstSession(int i) {
        this.daysSinceFirstSession = i;
    }

    public boolean isPayingUser() {
        return this.payingUser;
    }

    public void setPayingUser(boolean z) {
        this.payingUser = z;
    }

    public float getPaidAmount() {
        return this.paidAmount;
    }

    public void setPaidAmount(float f) {
        this.paidAmount = f;
    }

    public C5474a getReason() {
        return this.reason;
    }

    public void setReason(C5474a aVar) {
        this.reason = aVar;
    }

    public int getIan() {
        return this.ian.intValue();
    }

    public void setIan(Context context) {
        int f = C5509c.m23530f(context);
        if (f > 0) {
            this.ian = Integer.valueOf(f);
        }
    }

    public String getProfileId() {
        return this.profileId;
    }

    public void setProfileId(String str) {
        this.profileId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MetaDataRequest [totalSessions=");
        sb.append(this.totalSessions);
        sb.append(", daysSinceFirstSession=");
        sb.append(this.daysSinceFirstSession);
        sb.append(", payingUser=");
        sb.append(this.payingUser);
        sb.append(", paidAmount=");
        sb.append(this.paidAmount);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", profileId=");
        sb.append(this.profileId);
        sb.append("]");
        return sb.toString();
    }

    public C5302e getNameValueMap() {
        C5302e nameValueMap = super.getNameValueMap();
        if (nameValueMap == null) {
            nameValueMap = new C5301d();
        }
        addParams(nameValueMap);
        return nameValueMap;
    }

    private void addParams(C5302e eVar) {
        eVar.mo19624a(C5503a.m23471a(), (Object) C5503a.m23479d(), true);
        eVar.mo19624a("totalSessions", (Object) Integer.valueOf(this.totalSessions), true);
        eVar.mo19624a("daysSinceFirstSession", (Object) Integer.valueOf(this.daysSinceFirstSession), true);
        eVar.mo19624a("payingUser", (Object) Boolean.valueOf(this.payingUser), true);
        eVar.mo19624a("profileId", (Object) this.profileId, false);
        eVar.mo19624a("paidAmount", (Object) Float.valueOf(this.paidAmount), true);
        eVar.mo19624a("reason", (Object) this.reason, true);
        if (this.apkHash != null) {
            eVar.mo19624a("apkHash", (Object) this.apkHash, false);
        }
        eVar.mo19624a("ian", (Object) this.ian, false);
        eVar.mo19624a((String) this.simpleToken.first, this.simpleToken.second, false);
        if (this.firstInstalledAppTS > 0 && this.firstInstalledAppTS < Long.MAX_VALUE) {
            eVar.mo19624a("firstInstalledAppTS", (Object) Long.valueOf(this.firstInstalledAppTS), false);
        }
    }

    public static String calcApkHash(Context context, SharedPreferences sharedPreferences, boolean z, C5307i iVar) {
        String string = sharedPreferences.getString("shared_prefs_app_apk_hash", null);
        if (!TextUtils.isEmpty(string) && !z) {
            return string;
        }
        String a = iVar.mo19631a("SHA-256", context);
        sharedPreferences.edit().putString("shared_prefs_app_apk_hash", a).commit();
        return a;
    }
}
