package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.widget.TextView;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.view.p110i.p111a.C2118c;
import com.facebook.ads.internal.view.p110i.p112b.C2147o;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.internal.view.i.c.c */
public class C2178c extends C2118c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TextView f6870a;

    /* renamed from: b */
    private final String f6871b;

    /* renamed from: c */
    private final C1779f<C2147o> f6872c = new C1779f<C2147o>() {
        /* renamed from: a */
        public Class<C2147o> mo7260a() {
            return C2147o.class;
        }

        /* renamed from: a */
        public void mo6895a(C2147o oVar) {
            if (C2178c.this.getVideoView() != null) {
                C2178c.this.f6870a.setText(C2178c.m8666a(C2178c.this, (long) (C2178c.this.getVideoView().getDuration() - C2178c.this.getVideoView().getCurrentPositionInMillis())));
            }
        }
    };

    public C2178c(Context context, String str) {
        super(context);
        this.f6870a = new TextView(context);
        this.f6871b = str;
        addView(this.f6870a);
    }

    /* renamed from: a */
    static /* synthetic */ String m8666a(C2178c cVar, long j) {
        if (j <= 0) {
            return "00:00";
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        if (cVar.f6871b.isEmpty()) {
            return String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)});
        }
        return cVar.f6871b.replace("{{REMAINING_TIME}}", String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8425a() {
        super.mo8425a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7627a(this.f6872c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8426b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7629b(this.f6872c);
        }
        super.mo8426b();
    }

    public void setCountdownTextColor(int i) {
        this.f6870a.setTextColor(i);
    }
}
