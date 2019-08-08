package com.startapp.android.publish.ads.p167b;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5364e;
import com.startapp.android.publish.adsCommon.C5382g;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.activities.AppWallActivity;
import com.startapp.android.publish.adsCommon.activities.FullScreenActivity;
import com.startapp.android.publish.adsCommon.activities.OverlayActivity;
import com.startapp.android.publish.common.model.AdPreferences.Placement;

/* renamed from: com.startapp.android.publish.ads.b.c */
/* compiled from: StartAppSDK */
public abstract class C5105c extends C5364e implements C5382g {
    private static final long serialVersionUID = 1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18767a() {
        return false;
    }

    public C5105c(Context context, Placement placement) {
        super(context, placement);
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Boolean[], java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v12, types: [java.lang.Boolean[], java.io.Serializable]
      assigns: [java.lang.Boolean[]]
      uses: [java.io.Serializable]
      mth insns count: 131
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18768a(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = com.startapp.android.publish.adsCommon.C5349c.m22873b()
            boolean r1 = r9.mo18767a()
            r2 = 0
            if (r1 == 0) goto L_0x002d
            com.startapp.android.publish.adsCommon.b r1 = com.startapp.android.publish.adsCommon.C5344b.m22784a()
            com.startapp.android.publish.adsCommon.n r1 = r1.mo19756H()
            com.startapp.android.publish.adsCommon.n$a r1 = r1.mo20032a()
            com.startapp.android.publish.adsCommon.n$a r3 = com.startapp.android.publish.adsCommon.C5433n.C5434a.DISABLED
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = "back"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x002d
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r10 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.VIDEO_BACK
            r9.setNotDisplayedReason(r10)
            return r2
        L_0x002d:
            java.lang.Boolean r1 = com.startapp.android.publish.adsCommon.AdsConstants.OVERRIDE_NETWORK
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x003a
            com.startapp.android.publish.adsCommon.Ad$AdState r1 = com.startapp.android.publish.adsCommon.C5286Ad.AdState.UN_INITIALIZED
            r9.setState(r1)
        L_0x003a:
            java.lang.String r1 = r9.mo19847f()
            if (r1 != 0) goto L_0x0046
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r10 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.INTERNAL_ERROR
            r9.setNotDisplayedReason(r10)
            return r2
        L_0x0046:
            boolean r1 = r9.hasAdCacheTtlPassed()
            if (r1 == 0) goto L_0x0052
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r10 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.AD_EXPIRED
            r9.setNotDisplayedReason(r10)
            return r2
        L_0x0052:
            com.startapp.android.publish.adsCommon.a r1 = r9.activityExtra
            if (r1 == 0) goto L_0x005d
            com.startapp.android.publish.adsCommon.a r1 = r9.activityExtra
            boolean r1 = r1.mo19641a()
            goto L_0x005e
        L_0x005d:
            r1 = r2
        L_0x005e:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r4 = r9.context
            java.lang.Class r5 = r9.m22004f(r0)
            r3.<init>(r4, r5)
            java.lang.String r4 = "fileUrl"
            java.lang.String r5 = "exit.html"
            r3.putExtra(r4, r5)
            java.lang.String[] r4 = r9.mo19853l()
            java.lang.String r5 = com.startapp.android.publish.adsCommon.C5349c.m22847a()
            r6 = r2
        L_0x0079:
            int r7 = r4.length
            if (r6 >= r7) goto L_0x00a0
            r7 = r4[r6]
            if (r7 == 0) goto L_0x009d
            java.lang.String r7 = ""
            r8 = r4[r6]
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x009d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r4[r6]
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r4[r6] = r7
        L_0x009d:
            int r6 = r6 + 1
            goto L_0x0079
        L_0x00a0:
            java.lang.String r5 = "tracking"
            r3.putExtra(r5, r4)
            java.lang.String r4 = "trackingClickUrl"
            java.lang.String[] r5 = r9.mo19854m()
            r3.putExtra(r4, r5)
            java.lang.String r4 = "packageNames"
            java.lang.String[] r5 = r9.mo19856o()
            r3.putExtra(r4, r5)
            java.lang.String r4 = "htmlUuid"
            java.lang.String r5 = r9.mo19848g()
            r3.putExtra(r4, r5)
            java.lang.String r4 = "smartRedirect"
            boolean[] r5 = r9.smartRedirect
            r3.putExtra(r4, r5)
            java.lang.String r4 = "browserEnabled"
            boolean[] r5 = r9.mo19852k()
            r3.putExtra(r4, r5)
            java.lang.String r4 = "placement"
            com.startapp.android.publish.common.model.AdPreferences$Placement r5 = r9.placement
            int r5 = r5.getIndex()
            r3.putExtra(r4, r5)
            java.lang.String r4 = "adInfoOverride"
            com.startapp.android.publish.adsCommon.adinformation.c r5 = r9.getAdInfoOverride()
            r3.putExtra(r4, r5)
            java.lang.String r4 = "ad"
            r3.putExtra(r4, r9)
            java.lang.String r4 = "videoAd"
            boolean r5 = r9.mo18767a()
            r3.putExtra(r4, r5)
            java.lang.String r4 = "fullscreen"
            r3.putExtra(r4, r1)
            java.lang.String r1 = "orientation"
            int r4 = r9.mo18770b()
            r3.putExtra(r1, r4)
            java.lang.String r1 = "adTag"
            r3.putExtra(r1, r10)
            java.lang.String r10 = "lastLoadTime"
            java.lang.Long r1 = r9.getLastLoadTime()
            r3.putExtra(r10, r1)
            java.lang.String r10 = "adCacheTtl"
            java.lang.Long r1 = r9.getAdCacheTtl()
            r3.putExtra(r10, r1)
            java.lang.String r10 = "closingUrl"
            java.lang.String[] r1 = r9.mo19850i()
            r3.putExtra(r10, r1)
            java.lang.Long r10 = r9.mo19857p()
            if (r10 == 0) goto L_0x012f
            java.lang.String r10 = "delayImpressionSeconds"
            java.lang.Long r1 = r9.mo19857p()
            r3.putExtra(r10, r1)
        L_0x012f:
            java.lang.String r10 = "sendRedirectHops"
            java.lang.Boolean[] r1 = r9.mo19858q()
            r3.putExtra(r10, r1)
            java.lang.String r10 = "mraidAd"
            boolean r1 = r9.mo19859r()
            r3.putExtra(r10, r1)
            boolean r10 = r9.mo19859r()
            if (r10 == 0) goto L_0x014c
            java.lang.String r10 = "activityShouldLockOrientation"
            r3.putExtra(r10, r2)
        L_0x014c:
            r1 = 8
            boolean r10 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22674a(r1)
            r1 = 1
            if (r10 == 0) goto L_0x015e
            boolean r10 = r9 instanceof com.startapp.android.publish.ads.splash.C5184b
            if (r10 == 0) goto L_0x015e
            java.lang.String r10 = "isSplash"
            r3.putExtra(r10, r1)
        L_0x015e:
            java.lang.String r10 = "position"
            r3.putExtra(r10, r0)
            r10 = 343932928(0x14800000, float:1.2924697E-26)
            r3.addFlags(r10)
            android.content.Context r10 = r9.context
            r10.startActivity(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.ads.p167b.C5105c.mo18768a(java.lang.String):boolean");
    }

    /* renamed from: f */
    private Class<?> m22004f(String str) {
        if (m22005g(str)) {
            return FullScreenActivity.class;
        }
        return C5307i.m22654a(getContext(), OverlayActivity.class, AppWallActivity.class);
    }

    /* renamed from: g */
    private boolean m22005g(String str) {
        return (mo19363d() || mo18767a() || mo19859r() || str.equals("back")) && C5307i.m22676a(getContext(), FullScreenActivity.class);
    }

    /* renamed from: d */
    private boolean mo19363d() {
        return (mo19855n() == 0 || mo19855n() == this.context.getResources().getConfiguration().orientation) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo18770b() {
        return mo19855n() == 0 ? this.context.getResources().getConfiguration().orientation : mo19855n();
    }

    /* renamed from: a_ */
    public String mo18769a_() {
        return super.mo18769a_();
    }

    public Long getLastLoadTime() {
        return super.getLastLoadTime();
    }

    public Long getAdCacheTtl() {
        return super.getAdCacheTtl();
    }

    public boolean hasAdCacheTtlPassed() {
        return super.hasAdCacheTtlPassed();
    }

    public boolean getVideoCancelCallBack() {
        return super.getVideoCancelCallBack();
    }

    public void setVideoCancelCallBack(boolean z) {
        super.setVideoCancelCallBack(z);
    }
}
