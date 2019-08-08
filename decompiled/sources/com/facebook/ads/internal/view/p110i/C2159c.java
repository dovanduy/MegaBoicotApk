package com.facebook.ads.internal.view.p110i;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.System;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p077d.C1703a;
import com.facebook.ads.internal.p077d.C1704b;
import com.facebook.ads.internal.p077d.C1705c;
import com.facebook.ads.internal.p077d.C1705c.C1706a;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2331r;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.i.c */
public class C2159c implements C2331r<Bundle> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f6817a;

    /* renamed from: b */
    private boolean f6818b;

    /* renamed from: c */
    private final Context f6819c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1802c f6820d;

    /* renamed from: e */
    private final C2162a f6821e;

    /* renamed from: f */
    private final C1703a f6822f;

    /* renamed from: g */
    private int f6823g;

    /* renamed from: h */
    private int f6824h;

    /* renamed from: i */
    private String f6825i;

    /* renamed from: j */
    private String f6826j;

    /* renamed from: k */
    private final C2242e f6827k;

    /* renamed from: l */
    private final Map<String, String> f6828l;

    /* renamed from: com.facebook.ads.internal.view.i.c$a */
    public interface C2162a {
        int getCurrentPositionInMillis();

        boolean getGlobalVisibleRect(Rect rect);

        long getInitialBufferTime();

        int getMeasuredHeight();

        int getMeasuredWidth();

        C2116a getVideoStartReason();

        View getView();

        float getVolume();

        /* renamed from: h */
        boolean mo8403h();

        /* renamed from: i */
        boolean mo8404i();
    }

    /* renamed from: com.facebook.ads.internal.view.i.c$b */
    protected enum C2163b {
        PLAY(0),
        SKIP(1),
        TIME(2),
        MRC(3),
        PAUSE(4),
        RESUME(5),
        MUTE(6),
        UNMUTE(7),
        VIEWABLE_IMPRESSION(10);
        

        /* renamed from: j */
        public final int f6841j;

        private C2163b(int i) {
            this.f6841j = i;
        }
    }

    public C2159c(Context context, C1802c cVar, C2162a aVar, List<C1704b> list, String str) {
        this(context, cVar, aVar, list, str, null);
    }

    public C2159c(Context context, C1802c cVar, C2162a aVar, List<C1704b> list, String str, Bundle bundle) {
        this(context, cVar, aVar, list, str, bundle, null);
    }

    public C2159c(Context context, C1802c cVar, C2162a aVar, List<C1704b> list, String str, Bundle bundle, Map<String, String> map) {
        List<C1704b> list2 = list;
        Bundle bundle2 = bundle;
        this.f6818b = true;
        this.f6823g = 0;
        this.f6824h = 0;
        this.f6825i = null;
        this.f6826j = null;
        this.f6819c = context;
        this.f6820d = cVar;
        this.f6821e = aVar;
        this.f6817a = str;
        this.f6828l = map;
        C21601 r0 = new C1704b(this, 0.5d, -1.0d, 2.0d, true) {

            /* renamed from: a */
            final /* synthetic */ C2159c f6829a;

            {
                this.f6829a = r10;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo7265a(boolean z, boolean z2, C1705c cVar) {
                if (z2) {
                    this.f6829a.f6820d.mo7692e(this.f6829a.f6817a, this.f6829a.m8625a(C2163b.MRC));
                }
            }
        };
        list2.add(r0);
        C21612 r02 = new C1704b(this, 1.0E-7d, -1.0d, 0.001d, false) {

            /* renamed from: a */
            final /* synthetic */ C2159c f6830a;

            {
                this.f6830a = r10;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo7265a(boolean z, boolean z2, C1705c cVar) {
                if (z2) {
                    this.f6830a.f6820d.mo7692e(this.f6830a.f6817a, this.f6830a.m8625a(C2163b.VIEWABLE_IMPRESSION));
                }
            }
        };
        list2.add(r02);
        if (bundle2 != null) {
            this.f6822f = new C1703a(aVar.getView(), list2, bundle2.getBundle("adQualityManager"));
            this.f6823g = bundle2.getInt("lastProgressTimeMS");
            this.f6824h = bundle2.getInt("lastBoundaryTimeMS");
        } else {
            this.f6822f = new C1703a(aVar.getView(), list2);
        }
        this.f6827k = new C2242e(new Handler(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m8625a(C2163b bVar) {
        return m8626a(bVar, this.f6821e.getCurrentPositionInMillis());
    }

    /* renamed from: a */
    private Map<String, String> m8626a(C2163b bVar, int i) {
        HashMap hashMap = new HashMap();
        boolean z = !this.f6821e.mo8404i();
        hashMap.put(AudienceNetworkActivity.AUTOPLAY, this.f6821e.getVideoStartReason() == C2116a.AUTO_STARTED ? "1" : "0");
        hashMap.put("inline", z ? "1" : "0");
        hashMap.put("exoplayer", String.valueOf(this.f6821e.mo8403h()));
        hashMap.put("prep", Long.toString(this.f6821e.getInitialBufferTime()));
        C1705c c = this.f6822f.mo7441c();
        C1706a c2 = c.mo7446c();
        hashMap.put("vwa", String.valueOf(c2.mo7452d()));
        hashMap.put("vwm", String.valueOf(c2.mo7451c()));
        hashMap.put("vwmax", String.valueOf(c2.mo7453e()));
        hashMap.put("vtime_ms", String.valueOf(c2.mo7455g() * 1000.0d));
        hashMap.put("mcvt_ms", String.valueOf(c2.mo7456h() * 1000.0d));
        if (this.f6825i != null) {
            hashMap.put("vw_d", this.f6825i);
        }
        if (this.f6826j != null) {
            hashMap.put("vw_rsn", this.f6826j);
        }
        C1706a d = c.mo7447d();
        hashMap.put("vla", String.valueOf(d.mo7452d()));
        hashMap.put("vlm", String.valueOf(d.mo7451c()));
        hashMap.put("vlmax", String.valueOf(d.mo7453e()));
        hashMap.put("atime_ms", String.valueOf(d.mo7455g() * 1000.0d));
        hashMap.put("mcat_ms", String.valueOf(d.mo7456h() * 1000.0d));
        hashMap.put("ptime", String.valueOf(((float) this.f6824h) / 1000.0f));
        hashMap.put(C1245d.f3955iX, String.valueOf(((float) i) / 1000.0f));
        Rect rect = new Rect();
        this.f6821e.getGlobalVisibleRect(rect);
        hashMap.put("pt", String.valueOf(rect.top));
        hashMap.put("pl", String.valueOf(rect.left));
        hashMap.put("ph", String.valueOf(this.f6821e.getMeasuredHeight()));
        hashMap.put("pw", String.valueOf(this.f6821e.getMeasuredWidth()));
        WindowManager windowManager = (WindowManager) this.f6819c.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        hashMap.put("vph", String.valueOf(displayMetrics.heightPixels));
        hashMap.put("vpw", String.valueOf(displayMetrics.widthPixels));
        if (this.f6828l != null) {
            hashMap.putAll(this.f6828l);
        }
        hashMap.put(C1245d.f3959jb, String.valueOf(bVar.f6841j));
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8448a(int i) {
        mo8450a(i, false, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8449a(int i, int i2) {
        mo8450a(i, true, false);
        this.f6824h = i2;
        this.f6823g = i2;
        this.f6822f.mo7438a();
        this.f6822f.mo7440b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8450a(int i, boolean z, boolean z2) {
        if (((double) i) > 0.0d && i >= this.f6823g) {
            if (i > this.f6823g) {
                this.f6822f.mo7439a((double) (((float) (i - this.f6823g)) / 1000.0f), (double) mo8454d());
                this.f6823g = i;
                if (z2 || i - this.f6824h >= 5000) {
                    this.f6820d.mo7692e(this.f6817a, m8626a(C2163b.TIME, i));
                    this.f6824h = this.f6823g;
                    this.f6822f.mo7438a();
                    return;
                }
            }
            if (z) {
                this.f6820d.mo7692e(this.f6817a, m8626a(C2163b.TIME, i));
            }
        }
    }

    /* renamed from: b */
    public void mo8451b() {
        this.f6819c.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.f6827k);
    }

    /* renamed from: b */
    public void mo8452b(int i) {
        mo8450a(i, true, false);
        this.f6824h = 0;
        this.f6823g = 0;
        this.f6822f.mo7438a();
        this.f6822f.mo7440b();
    }

    /* renamed from: c */
    public void mo8453c() {
        this.f6819c.getContentResolver().unregisterContentObserver(this.f6827k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float mo8454d() {
        float f;
        AudioManager audioManager = (AudioManager) this.f6819c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null) {
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume > 0) {
                f = (((float) streamVolume) * 1.0f) / ((float) streamMaxVolume);
                return f * this.f6821e.getVolume();
            }
        }
        f = 0.0f;
        return f * this.f6821e.getVolume();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo8455e() {
        boolean z;
        if (((double) mo8454d()) < 0.05d) {
            if (this.f6818b) {
                this.f6820d.mo7692e(this.f6817a, m8625a(C2163b.MUTE));
                z = false;
            }
            return;
        }
        if (!this.f6818b) {
            this.f6820d.mo7692e(this.f6817a, m8625a(C2163b.UNMUTE));
            z = true;
        }
        return;
        this.f6818b = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo8456f() {
        this.f6820d.mo7692e(this.f6817a, m8625a(C2163b.SKIP));
    }

    /* renamed from: g */
    public Bundle mo7259g() {
        mo8449a(mo8459j(), mo8459j());
        Bundle bundle = new Bundle();
        bundle.putInt("lastProgressTimeMS", this.f6823g);
        bundle.putInt("lastBoundaryTimeMS", this.f6824h);
        bundle.putBundle("adQualityManager", this.f6822f.mo7259g());
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo8457h() {
        this.f6820d.mo7692e(this.f6817a, m8625a(C2163b.PAUSE));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo8458i() {
        this.f6820d.mo7692e(this.f6817a, m8625a(C2163b.RESUME));
    }

    /* renamed from: j */
    public int mo8459j() {
        return this.f6823g;
    }
}
