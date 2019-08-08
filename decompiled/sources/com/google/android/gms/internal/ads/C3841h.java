package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.C3025aw;

/* renamed from: com.google.android.gms.internal.ads.h */
final class C3841h implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ String f13188a;

    /* renamed from: b */
    private final /* synthetic */ String f13189b;

    /* renamed from: c */
    private final /* synthetic */ C3814g f13190c;

    C3841h(C3814g gVar, String str, String str2) {
        this.f13190c = gVar;
        this.f13188a = str;
        this.f13189b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f13190c.f13139b.getSystemService("download");
        try {
            String str = this.f13188a;
            String str2 = this.f13189b;
            Request request = new Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            C3025aw.m10919g().mo15542a(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f13190c.mo15652a("Could not store picture.");
        }
    }
}
