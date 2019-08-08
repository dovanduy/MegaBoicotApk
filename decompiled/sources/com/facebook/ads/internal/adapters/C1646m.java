package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p120e.C2354a;
import com.facebook.ads.internal.p125x.C2376a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.m */
public class C1646m extends C1584b {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f5154c = "m";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2354a f5155d;

    /* renamed from: e */
    private final C1802c f5156e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1645l f5157f;

    /* renamed from: g */
    private boolean f5158g;

    public C1646m(Context context, C1802c cVar, C2354a aVar, C2376a aVar2, C1609c cVar2) {
        super(context, cVar2, aVar2);
        this.f5156e = cVar;
        this.f5155d = aVar;
    }

    /* renamed from: a */
    public void mo7327a(C1645l lVar) {
        this.f5157f = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7112a(Map<String, String> map) {
        if (this.f5157f != null && !TextUtils.isEmpty(this.f5157f.getClientToken())) {
            this.f5156e.mo7686a(this.f5157f.getClientToken(), map);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo7328b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f5158g     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0029
            com.facebook.ads.internal.adapters.l r0 = r2.f5157f     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x000a
            goto L_0x0029
        L_0x000a:
            r0 = 1
            r2.f5158g = r0     // Catch:{ all -> 0x002b }
            com.facebook.ads.internal.w.e.a r0 = r2.f5155d     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0027
            com.facebook.ads.internal.adapters.l r0 = r2.f5157f     // Catch:{ all -> 0x002b }
            java.lang.String r0 = r0.mo7322d()     // Catch:{ all -> 0x002b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0027
            com.facebook.ads.internal.w.e.a r0 = r2.f5155d     // Catch:{ all -> 0x002b }
            com.facebook.ads.internal.adapters.m$1 r1 = new com.facebook.ads.internal.adapters.m$1     // Catch:{ all -> 0x002b }
            r1.<init>()     // Catch:{ all -> 0x002b }
            r0.post(r1)     // Catch:{ all -> 0x002b }
        L_0x0027:
            monitor-exit(r2)
            return
        L_0x0029:
            monitor-exit(r2)
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.C1646m.mo7328b():void");
    }
}
