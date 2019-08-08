package com.appnext.banners;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.appnext.core.AdsService;
import com.appnext.core.C1343o;

/* renamed from: com.appnext.banners.i */
public final class C1219i extends C1343o {

    /* renamed from: bf */
    String f3868bf;

    /* renamed from: bg */
    String f3869bg;

    /* renamed from: bh */
    String f3870bh;

    /* renamed from: bi */
    String f3871bi;

    /* renamed from: bj */
    String f3872bj;

    /* renamed from: bk */
    ResultReceiver f3873bk;

    /* renamed from: do */
    String f3874do;

    /* renamed from: dp */
    String f3875dp;
    String guid;

    public C1219i() {
    }

    public C1219i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f3868bf = str;
        this.f3869bg = str2;
        this.guid = str3;
        this.f3870bh = str4;
        this.f3871bi = str5;
        this.f3873bk = resultReceiver;
        this.f3872bj = str6;
        this.f3874do = str7;
        this.f3875dp = str8;
    }

    /* renamed from: a */
    public final void mo5883a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f3868bf = str;
        this.f3869bg = str2;
        this.guid = str3;
        this.f3870bh = str4;
        this.f3871bi = str5;
        this.f3873bk = resultReceiver;
        this.f3872bj = str6;
        this.f3874do = str7;
        this.f3875dp = str8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5408a(Intent intent) {
        intent.putExtra("added_info", AdsService.ADD_PACK);
        intent.putExtra("package", this.f3868bf);
        intent.putExtra("link", this.f3869bg);
        intent.putExtra("guid", this.guid);
        intent.putExtra("bannerid", this.f3870bh);
        intent.putExtra("placementid", this.f3871bi);
        intent.putExtra("receiver", this.f3873bk);
        intent.putExtra("vid", this.f3872bj);
        intent.putExtra("tid", this.f3874do);
        intent.putExtra("auid", this.f3875dp);
    }

    /* renamed from: d */
    public final void mo5410d(Context context) {
        super.mo5410d(context);
        this.f3873bk = null;
    }
}
