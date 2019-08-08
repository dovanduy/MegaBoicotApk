package com.startapp.android.publish.adsCommon.p188h;

import android.content.Context;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.p179c.C5357b;
import com.startapp.android.publish.adsCommon.p182f.C5373b;
import com.startapp.android.publish.common.metaData.MetaData;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.adsCommon.h.b */
/* compiled from: StartAppSDK */
public class C5398b extends C5396a {
    public C5398b(Context context, Runnable runnable, C5373b bVar) {
        super(context, runnable, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19944b() {
        try {
            long millis = TimeUnit.SECONDS.toMillis((long) MetaData.getInstance().getBluetoothConfig().mo20267a());
            final C5357b bVar = new C5357b(this.f17267a, this);
            mo19943a(new Runnable() {
                public void run() {
                    bVar.mo19815a();
                    C5398b.this.mo19942a(bVar.mo19817b());
                }
            }, millis);
            bVar.mo19816a(m23061c());
        } catch (Exception unused) {
            mo19942a(null);
        }
    }

    /* renamed from: c */
    private boolean m23061c() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = currentTimeMillis - C5414k.m23095a(this.f17267a, "lastBtDiscoveringTime", Long.valueOf(0)).longValue() >= ((long) MetaData.getInstance().getBluetoothConfig().mo20269c()) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        if (z) {
            C5414k.m23102b(this.f17267a, "lastBtDiscoveringTime", Long.valueOf(currentTimeMillis));
        }
        return z;
    }

    /* renamed from: a */
    public void mo19942a(Object obj) {
        if (obj != null) {
            this.f17269c.mo19882b(obj.toString());
        }
        super.mo19942a(obj);
    }
}
