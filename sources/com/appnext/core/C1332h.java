package com.appnext.core;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;

/* renamed from: com.appnext.core.h */
public final class C1332h extends C1343o {

    /* renamed from: bf */
    String f4215bf;

    /* renamed from: bg */
    String f4216bg;

    /* renamed from: bh */
    String f4217bh;

    /* renamed from: bi */
    String f4218bi;

    /* renamed from: bj */
    String f4219bj;

    /* renamed from: bk */
    ResultReceiver f4220bk;

    /* renamed from: do */
    String f4221do;

    /* renamed from: dp */
    String f4222dp;
    String guid;

    public C1332h() {
    }

    public C1332h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f4215bf = str;
        this.f4216bg = str2;
        this.guid = str3;
        this.f4217bh = str4;
        this.f4218bi = str5;
        this.f4220bk = resultReceiver;
        this.f4219bj = str6;
        this.f4221do = str7;
        this.f4222dp = str8;
    }

    /* renamed from: a */
    public final void mo6261a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f4215bf = str;
        this.f4216bg = str2;
        this.guid = str3;
        this.f4217bh = str4;
        this.f4218bi = str5;
        this.f4220bk = null;
        this.f4219bj = str6;
        this.f4221do = str7;
        this.f4222dp = str8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5408a(Intent intent) {
        intent.putExtra("added_info", AdsService.ADD_PACK);
        intent.putExtra("package", this.f4215bf);
        intent.putExtra("link", this.f4216bg);
        intent.putExtra("guid", this.guid);
        intent.putExtra("bannerid", this.f4217bh);
        intent.putExtra("placementid", this.f4218bi);
        intent.putExtra("receiver", this.f4220bk);
        intent.putExtra("vid", this.f4219bj);
        intent.putExtra("tid", this.f4221do);
        intent.putExtra("auid", this.f4222dp);
    }

    /* renamed from: d */
    public final void mo5410d(Context context) {
        super.mo5410d(context);
        this.f4220bk = null;
    }
}
