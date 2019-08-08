package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager.BadTokenException;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.List;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.kh */
public final class C3930kh {

    /* renamed from: a */
    private final Context f13431a;

    /* renamed from: b */
    private String f13432b;

    /* renamed from: c */
    private String f13433c;

    /* renamed from: d */
    private String f13434d;

    /* renamed from: e */
    private String f13435e;

    /* renamed from: f */
    private final float f13436f;

    /* renamed from: g */
    private float f13437g;

    /* renamed from: h */
    private float f13438h;

    /* renamed from: i */
    private float f13439i;

    /* renamed from: j */
    private int f13440j;

    /* renamed from: k */
    private int f13441k;

    /* renamed from: l */
    private float f13442l;

    /* renamed from: m */
    private float f13443m;

    /* renamed from: n */
    private float f13444n;

    /* renamed from: o */
    private float f13445o;

    /* renamed from: p */
    private Handler f13446p;

    /* renamed from: q */
    private Runnable f13447q;

    public C3930kh(Context context) {
        this.f13440j = 0;
        this.f13447q = new C3931ki(this);
        this.f13431a = context;
        this.f13436f = context.getResources().getDisplayMetrics().density;
        this.f13441k = ViewConfiguration.get(this.f13431a).getScaledTouchSlop();
        C3025aw.m10932t().mo15603a();
        this.f13446p = C3025aw.m10932t().mo15604b();
    }

    public C3930kh(Context context, String str) {
        this(context);
        this.f13432b = str;
    }

    /* renamed from: a */
    private static int m17254a(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* renamed from: a */
    private final void m17255a(int i, float f, float f2) {
        if (i == 0) {
            this.f13440j = 0;
            this.f13437g = f;
            this.f13438h = f2;
            this.f13439i = f2;
        } else if (this.f13440j != -1) {
            if (i == 2) {
                if (f2 > this.f13438h) {
                    this.f13438h = f2;
                } else if (f2 < this.f13439i) {
                    this.f13439i = f2;
                }
                if (this.f13438h - this.f13439i > 30.0f * this.f13436f) {
                    this.f13440j = -1;
                    return;
                }
                if (this.f13440j == 0 || this.f13440j == 2 ? f - this.f13437g >= 50.0f * this.f13436f : !(!(this.f13440j == 1 || this.f13440j == 3) || f - this.f13437g > -50.0f * this.f13436f)) {
                    this.f13437g = f;
                    this.f13440j++;
                }
                if (this.f13440j == 1 || this.f13440j == 3) {
                    if (f > this.f13437g) {
                        this.f13437g = f;
                    }
                } else if (this.f13440j == 2 && f < this.f13437g) {
                    this.f13437g = f;
                }
            } else if (i == 1 && this.f13440j == 4) {
                mo15560a();
            }
        }
    }

    /* renamed from: a */
    private final boolean m17256a(float f, float f2, float f3, float f4) {
        return Math.abs(this.f13442l - f) < ((float) this.f13441k) && Math.abs(this.f13443m - f2) < ((float) this.f13441k) && Math.abs(this.f13444n - f3) < ((float) this.f13441k) && Math.abs(this.f13445o - f4) < ((float) this.f13441k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006c, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0071;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17257e() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f13431a
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.C3900je.m17433d(r0)
            return
        L_0x000c:
            java.lang.String r0 = r5.f13432b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "\\+"
            java.lang.String r2 = "%20"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            android.net.Uri$Builder r0 = r1.encodedQuery(r0)
            android.net.Uri r0 = r0.build()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.google.android.gms.ads.internal.C3025aw.m10917e()
            java.util.Map r0 = com.google.android.gms.internal.ads.C3909jn.m17133a(r0)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x003d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0060
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r4 = " = "
            r1.append(r4)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r3 = "\n\n"
            r1.append(r3)
            goto L_0x003d
        L_0x0060:
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            java.lang.String r0 = "No debug information"
        L_0x0071:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            android.content.Context r2 = r5.f13431a
            r1.<init>(r2)
            r1.setMessage(r0)
            java.lang.String r2 = "Ad Information"
            r1.setTitle(r2)
            java.lang.String r2 = "Share"
            com.google.android.gms.internal.ads.kk r3 = new com.google.android.gms.internal.ads.kk
            r3.<init>(r5, r0)
            r1.setPositiveButton(r2, r3)
            java.lang.String r0 = "Close"
            android.content.DialogInterface$OnClickListener r2 = com.google.android.gms.internal.ads.C3934kl.f13455a
            r1.setNegativeButton(r0, r2)
            android.app.AlertDialog r0 = r1.create()
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3930kh.m17257e():void");
    }

    /* renamed from: a */
    public final void mo15560a() {
        try {
            if (!((Boolean) aoq.m14620f().mo14695a(aru.f11897cP)).booleanValue()) {
                if (!((Boolean) aoq.m14620f().mo14695a(aru.f11896cO)).booleanValue()) {
                    m17257e();
                    return;
                }
            }
            if (!(this.f13431a instanceof Activity)) {
                C3900je.m17433d("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(C3025aw.m10927o().mo15577a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = C3025aw.m10927o().mo15581b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a = m17254a((List<String>) arrayList, "Ad Information", true);
            int a2 = m17254a((List<String>) arrayList, str, ((Boolean) aoq.m14620f().mo14695a(aru.f11896cO)).booleanValue());
            int a3 = m17254a((List<String>) arrayList, str2, ((Boolean) aoq.m14620f().mo14695a(aru.f11897cP)).booleanValue());
            Builder builder = new Builder(this.f13431a, C3025aw.m10919g().mo15553f());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new C3932kj(this, a, a2, a3));
            builder.create().show();
        } catch (BadTokenException e) {
            String str3 = "";
            if (C3900je.m17044a()) {
                Log.v("Ads", str3, e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo15561a(int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (i4 == i) {
            m17257e();
            return;
        }
        if (i4 == i2) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11896cO)).booleanValue()) {
                C3900je.m17429b("Debug mode [Creative Preview] selected.");
                C3907jl.m17118a((Runnable) new C3935km(this));
                return;
            }
        }
        if (i4 == i3) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11897cP)).booleanValue()) {
                C3900je.m17429b("Debug mode [Troubleshooting] selected.");
                C3907jl.m17118a((Runnable) new C3936kn(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo15562a(MotionEvent motionEvent) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11898cQ)).booleanValue()) {
            int actionMasked = motionEvent.getActionMasked();
            int historySize = motionEvent.getHistorySize();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked == 0) {
                this.f13440j = 0;
                this.f13442l = motionEvent.getX();
                this.f13443m = motionEvent.getY();
                return;
            }
            if (this.f13440j != -1) {
                boolean z = true;
                if (this.f13440j == 0 && actionMasked == 5) {
                    this.f13440j = 5;
                    this.f13444n = motionEvent.getX(1);
                    this.f13445o = motionEvent.getY(1);
                    this.f13446p.postDelayed(this.f13447q, ((Long) aoq.m14620f().mo14695a(aru.f11899cR)).longValue());
                    return;
                } else if (this.f13440j == 5) {
                    if (pointerCount == 2) {
                        if (actionMasked == 2) {
                            boolean z2 = false;
                            for (int i = 0; i < historySize; i++) {
                                if (!m17256a(motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i), motionEvent.getHistoricalX(1, i), motionEvent.getHistoricalY(1, i))) {
                                    z2 = true;
                                }
                            }
                            if (m17256a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                                z = z2;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f13440j = -1;
                        this.f13446p.removeCallbacks(this.f13447q);
                    }
                }
            }
            return;
        }
        int historySize2 = motionEvent.getHistorySize();
        for (int i2 = 0; i2 < historySize2; i2++) {
            m17255a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2));
        }
        m17255a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: a */
    public final void mo15563a(String str) {
        this.f13433c = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo15564a(String str, DialogInterface dialogInterface, int i) {
        C3025aw.m10917e();
        C3909jn.m17136a(this.f13431a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo15565b() {
        C3025aw.m10927o().mo15579a(this.f13431a, this.f13433c, this.f13434d, this.f13435e);
    }

    /* renamed from: b */
    public final void mo15566b(String str) {
        this.f13434d = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo15567c() {
        C3025aw.m10927o().mo15578a(this.f13431a, this.f13433c, this.f13434d);
    }

    /* renamed from: c */
    public final void mo15568c(String str) {
        this.f13432b = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo15569d() {
        this.f13440j = 4;
        mo15560a();
    }

    /* renamed from: d */
    public final void mo15570d(String str) {
        this.f13435e = str;
    }
}
