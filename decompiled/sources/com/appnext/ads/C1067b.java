package com.appnext.ads;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.appnext.core.AdsService;
import com.appnext.core.C1343o;

/* renamed from: com.appnext.ads.b */
public final class C1067b extends C1343o {

    /* renamed from: bf */
    String f3576bf;

    /* renamed from: bg */
    String f3577bg;

    /* renamed from: bh */
    String f3578bh;

    /* renamed from: bi */
    String f3579bi;

    /* renamed from: bj */
    String f3580bj;

    /* renamed from: bk */
    ResultReceiver f3581bk;

    /* renamed from: do */
    String f3582do;

    /* renamed from: dp */
    String f3583dp;
    String guid;

    public C1067b() {
    }

    public C1067b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f3576bf = str;
        this.f3577bg = str2;
        this.guid = str3;
        this.f3578bh = str4;
        this.f3579bi = str5;
        this.f3581bk = resultReceiver;
        this.f3580bj = str6;
        this.f3582do = str7;
        this.f3583dp = str8;
    }

    /* renamed from: a */
    public final void mo5409a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f3576bf = str;
        this.f3577bg = str2;
        this.guid = str3;
        this.f3578bh = str4;
        this.f3579bi = str5;
        this.f3581bk = resultReceiver;
        this.f3580bj = str6;
        this.f3582do = str7;
        this.f3583dp = str8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5408a(Intent intent) {
        intent.putExtra("added_info", AdsService.ADD_PACK);
        intent.putExtra("package", this.f3576bf);
        intent.putExtra("link", this.f3577bg);
        intent.putExtra("guid", this.guid);
        intent.putExtra("bannerid", this.f3578bh);
        intent.putExtra("placementid", this.f3579bi);
        intent.putExtra("receiver", this.f3581bk);
        intent.putExtra("vid", this.f3580bj);
        intent.putExtra("tid", this.f3582do);
        intent.putExtra("auid", this.f3583dp);
    }

    /* renamed from: d */
    public final void mo5410d(Context context) {
        super.mo5410d(context);
        this.f3581bk = null;
    }
}
