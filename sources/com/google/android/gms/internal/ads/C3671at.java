package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(19)
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.at */
public final class C3671at extends C3668aq {

    /* renamed from: d */
    private Object f12139d = new Object();
    @GuardedBy("mPopupWindowLock")

    /* renamed from: e */
    private PopupWindow f12140e;
    @GuardedBy("mPopupWindowLock")

    /* renamed from: f */
    private boolean f12141f = false;

    C3671at(Context context, C3879ik ikVar, C4089qe qeVar, C3665ap apVar) {
        super(context, ikVar, qeVar, apVar);
    }

    /* renamed from: e */
    private final void m15132e() {
        synchronized (this.f12139d) {
            this.f12141f = true;
            if ((this.f11120a instanceof Activity) && ((Activity) this.f11120a).isDestroyed()) {
                this.f12140e = null;
            }
            if (this.f12140e != null) {
                if (this.f12140e.isShowing()) {
                    this.f12140e.dismiss();
                }
                this.f12140e = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14342a(int i) {
        m15132e();
        super.mo14342a(i);
    }

    /* renamed from: b */
    public final void mo14343b() {
        m15132e();
        super.mo14343b();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0069 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14563d() {
        /*
            r8 = this;
            android.content.Context r0 = r8.f11120a
            boolean r0 = r0 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L_0x0010
            android.content.Context r0 = r8.f11120a
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 == 0) goto L_0x0070
            android.view.View r2 = r0.getDecorView()
            if (r2 != 0) goto L_0x001a
            return
        L_0x001a:
            android.content.Context r2 = r8.f11120a
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isDestroyed()
            if (r2 == 0) goto L_0x0025
            return
        L_0x0025:
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            android.content.Context r3 = r8.f11120a
            r2.<init>(r3)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.setLayoutParams(r3)
            com.google.android.gms.internal.ads.qe r3 = r8.f11121b
            android.view.View r3 = r3.getView()
            r2.addView(r3, r4, r4)
            java.lang.Object r3 = r8.f12139d
            monitor-enter(r3)
            boolean r5 = r8.f12141f     // Catch:{ all -> 0x006d }
            if (r5 == 0) goto L_0x0047
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            return
        L_0x0047:
            android.widget.PopupWindow r5 = new android.widget.PopupWindow     // Catch:{ all -> 0x006d }
            r6 = 0
            r7 = 1
            r5.<init>(r2, r7, r7, r6)     // Catch:{ all -> 0x006d }
            r8.f12140e = r5     // Catch:{ all -> 0x006d }
            android.widget.PopupWindow r2 = r8.f12140e     // Catch:{ all -> 0x006d }
            r2.setOutsideTouchable(r7)     // Catch:{ all -> 0x006d }
            android.widget.PopupWindow r2 = r8.f12140e     // Catch:{ all -> 0x006d }
            r2.setClippingEnabled(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "Displaying the 1x1 popup off the screen."
            com.google.android.gms.internal.ads.C3900je.m17429b(r2)     // Catch:{ all -> 0x006d }
            android.widget.PopupWindow r2 = r8.f12140e     // Catch:{ Exception -> 0x0069 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x0069 }
            r2.showAtLocation(r0, r6, r4, r4)     // Catch:{ Exception -> 0x0069 }
            goto L_0x006b
        L_0x0069:
            r8.f12140e = r1     // Catch:{ all -> 0x006d }
        L_0x006b:
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            throw r0
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3671at.mo14563d():void");
    }
}
