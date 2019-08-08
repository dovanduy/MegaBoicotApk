package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lb */
final class C3951lb implements bcn {

    /* renamed from: a */
    private final /* synthetic */ String f13492a;

    /* renamed from: b */
    private final /* synthetic */ C3955lf f13493b;

    C3951lb(C3946kx kxVar, String str, C3955lf lfVar) {
        this.f13492a = str;
        this.f13493b = lfVar;
    }

    /* renamed from: a */
    public final void mo15131a(C3738df dfVar) {
        String str = this.f13492a;
        String dfVar2 = dfVar.toString();
        StringBuilder sb = new StringBuilder(21 + String.valueOf(str).length() + String.valueOf(dfVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(dfVar2);
        C3900je.m17435e(sb.toString());
        this.f13493b.mo15176a(null);
    }
}
