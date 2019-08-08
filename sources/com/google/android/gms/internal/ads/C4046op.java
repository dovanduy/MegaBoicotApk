package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.internal.C3468c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.op */
public final class C4046op extends FrameLayout implements C4043om {

    /* renamed from: a */
    private final C4061pd f13671a;

    /* renamed from: b */
    private final FrameLayout f13672b;

    /* renamed from: c */
    private final ash f13673c;

    /* renamed from: d */
    private final C4063pf f13674d;

    /* renamed from: e */
    private final long f13675e;

    /* renamed from: f */
    private C4044on f13676f;

    /* renamed from: g */
    private boolean f13677g;

    /* renamed from: h */
    private boolean f13678h;

    /* renamed from: i */
    private boolean f13679i;

    /* renamed from: j */
    private boolean f13680j;

    /* renamed from: k */
    private long f13681k;

    /* renamed from: l */
    private long f13682l;

    /* renamed from: m */
    private String f13683m;

    /* renamed from: n */
    private Bitmap f13684n;

    /* renamed from: o */
    private ImageView f13685o;

    /* renamed from: p */
    private boolean f13686p;

    public C4046op(Context context, C4061pd pdVar, int i, boolean z, ash ash, C4060pc pcVar) {
        Context context2 = context;
        super(context2);
        C4061pd pdVar2 = pdVar;
        this.f13671a = pdVar2;
        ash ash2 = ash;
        this.f13673c = ash2;
        this.f13672b = new FrameLayout(context2);
        addView(this.f13672b, new LayoutParams(-1, -1));
        C3468c.m12393a((Object) pdVar2.mo15802e());
        this.f13676f = pdVar2.mo15802e().f8920b.mo15747a(context2, pdVar2, i, z, ash2, pcVar);
        if (this.f13676f != null) {
            this.f13672b.addView(this.f13676f, new LayoutParams(-1, -1, 17));
            if (((Boolean) aoq.m14620f().mo14695a(aru.f12054w)).booleanValue()) {
                mo15759m();
            }
        }
        this.f13685o = new ImageView(context2);
        this.f13675e = ((Long) aoq.m14620f().mo14695a(aru.f11749A)).longValue();
        this.f13680j = ((Boolean) aoq.m14620f().mo14695a(aru.f12056y)).booleanValue();
        if (this.f13673c != null) {
            this.f13673c.mo14721a("spinner_used", this.f13680j ? "1" : "0");
        }
        this.f13674d = new C4063pf(this);
        if (this.f13676f != null) {
            this.f13676f.mo15704a((C4043om) this);
        }
        if (this.f13676f == null) {
            mo15739a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: a */
    public static void m17544a(C4061pd pdVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        pdVar.mo14986a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public static void m17545a(C4061pd pdVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        pdVar.mo14986a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public static void m17546a(C4061pd pdVar, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        pdVar.mo14986a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17547a(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f13671a.mo14986a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: p */
    private final boolean m17548p() {
        return this.f13685o.getParent() != null;
    }

    /* renamed from: q */
    private final void m17549q() {
        if (this.f13671a.mo15801d() != null && this.f13678h && !this.f13679i) {
            this.f13671a.mo15801d().getWindow().clearFlags(128);
            this.f13678h = false;
        }
    }

    /* renamed from: a */
    public final void mo15737a() {
        this.f13674d.mo15818b();
        C3909jn.f13411a.post(new C4048or(this));
    }

    /* renamed from: a */
    public final void mo15748a(float f, float f2) {
        if (this.f13676f != null) {
            this.f13676f.mo15702a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo15749a(int i) {
        if (this.f13676f != null) {
            this.f13676f.mo15703a(i);
        }
    }

    /* renamed from: a */
    public final void mo15738a(int i, int i2) {
        if (this.f13680j) {
            int max = Math.max(i / ((Integer) aoq.m14620f().mo14695a(aru.f12057z)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) aoq.m14620f().mo14695a(aru.f12057z)).intValue(), 1);
            if (this.f13684n == null || this.f13684n.getWidth() != max || this.f13684n.getHeight() != max2) {
                this.f13684n = Bitmap.createBitmap(max, max2, Config.ARGB_8888);
                this.f13686p = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo15750a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            LayoutParams layoutParams = new LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f13672b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public final void mo15751a(MotionEvent motionEvent) {
        if (this.f13676f != null) {
            this.f13676f.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: a */
    public final void mo15752a(String str) {
        this.f13683m = str;
    }

    /* renamed from: a */
    public final void mo15739a(String str, String str2) {
        m17547a("error", "what", str, "extra", str2);
    }

    /* renamed from: b */
    public final void mo15740b() {
        if (this.f13676f != null && this.f13682l == 0) {
            m17547a("canplaythrough", "duration", String.valueOf(((float) this.f13676f.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f13676f.getVideoWidth()), "videoHeight", String.valueOf(this.f13676f.getVideoHeight()));
        }
    }

    /* renamed from: c */
    public final void mo15741c() {
        if (this.f13671a.mo15801d() != null && !this.f13678h) {
            this.f13679i = (this.f13671a.mo15801d().getWindow().getAttributes().flags & 128) != 0;
            if (!this.f13679i) {
                this.f13671a.mo15801d().getWindow().addFlags(128);
                this.f13678h = true;
            }
        }
        this.f13677g = true;
    }

    /* renamed from: d */
    public final void mo15742d() {
        m17547a("pause", new String[0]);
        m17549q();
        this.f13677g = false;
    }

    /* renamed from: e */
    public final void mo15743e() {
        m17547a("ended", new String[0]);
        m17549q();
    }

    /* renamed from: f */
    public final void mo15744f() {
        if (this.f13686p && this.f13684n != null && !m17548p()) {
            this.f13685o.setImageBitmap(this.f13684n);
            this.f13685o.invalidate();
            this.f13672b.addView(this.f13685o, new LayoutParams(-1, -1));
            this.f13672b.bringChildToFront(this.f13685o);
        }
        this.f13674d.mo15817a();
        this.f13682l = this.f13681k;
        C3909jn.f13411a.post(new C4049os(this));
    }

    public final void finalize() throws Throwable {
        try {
            this.f13674d.mo15817a();
            if (this.f13676f != null) {
                C4044on onVar = this.f13676f;
                Executor executor = C4014nk.f13617a;
                onVar.getClass();
                executor.execute(C4047oq.m17572a(onVar));
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo15745g() {
        if (this.f13677g && m17548p()) {
            this.f13672b.removeView(this.f13685o);
        }
        if (this.f13684n != null) {
            long b = C3025aw.m10924l().mo13695b();
            if (this.f13676f.getBitmap(this.f13684n) != null) {
                this.f13686p = true;
            }
            long b2 = C3025aw.m10924l().mo13695b() - b;
            if (C3900je.m17044a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b2);
                sb.append("ms");
                C3900je.m17043a(sb.toString());
            }
            if (b2 > this.f13675e) {
                C3900je.m17435e("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f13680j = false;
                this.f13684n = null;
                if (this.f13673c != null) {
                    this.f13673c.mo14721a("spinner_jank", Long.toString(b2));
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo15754h() {
        if (this.f13676f != null) {
            if (!TextUtils.isEmpty(this.f13683m)) {
                this.f13676f.setVideoPath(this.f13683m);
            } else {
                m17547a("no_src", new String[0]);
            }
        }
    }

    /* renamed from: i */
    public final void mo15755i() {
        if (this.f13676f != null) {
            this.f13676f.mo15708d();
        }
    }

    /* renamed from: j */
    public final void mo15756j() {
        if (this.f13676f != null) {
            this.f13676f.mo15707c();
        }
    }

    /* renamed from: k */
    public final void mo15757k() {
        if (this.f13676f != null) {
            C4044on onVar = this.f13676f;
            onVar.f13670b.mo15822a(true);
            onVar.mo15709e();
        }
    }

    /* renamed from: l */
    public final void mo15758l() {
        if (this.f13676f != null) {
            C4044on onVar = this.f13676f;
            onVar.f13670b.mo15822a(false);
            onVar.mo15709e();
        }
    }

    @TargetApi(14)
    /* renamed from: m */
    public final void mo15759m() {
        if (this.f13676f != null) {
            TextView textView = new TextView(this.f13676f.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.f13676f.mo15701a());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f13672b.addView(textView, new LayoutParams(-2, -2, 17));
            this.f13672b.bringChildToFront(textView);
        }
    }

    /* renamed from: n */
    public final void mo15760n() {
        this.f13674d.mo15817a();
        if (this.f13676f != null) {
            this.f13676f.mo15705b();
        }
        m17549q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo15761o() {
        if (this.f13676f != null) {
            long currentPosition = (long) this.f13676f.getCurrentPosition();
            if (this.f13681k != currentPosition && currentPosition > 0) {
                m17547a("timeupdate", C1245d.f3955iX, String.valueOf(((float) currentPosition) / 1000.0f));
                this.f13681k = currentPosition;
            }
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        if (i == 0) {
            this.f13674d.mo15818b();
            z = true;
        } else {
            this.f13674d.mo15817a();
            this.f13682l = this.f13681k;
            z = false;
        }
        C3909jn.f13411a.post(new C4050ot(this, z));
    }

    public final void setVolume(float f) {
        if (this.f13676f != null) {
            C4044on onVar = this.f13676f;
            onVar.f13670b.mo15821a(f);
            onVar.mo15709e();
        }
    }
}
