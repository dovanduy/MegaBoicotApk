package com.facebook.ads.internal.p115w.p117b;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: com.facebook.ads.internal.w.b.j */
public enum C2322j {
    INTERNAL_NO_TAG(0),
    INTERNAL_NO_CLICK(1),
    INTERNAL_API_TOO_LOW(2),
    INTERNAL_WRONG_TAG_CLASS(3),
    INTERNAL_NULL_VIEW(4),
    INTERNAL_AD_ICON(5),
    INTERNAL_AD_TITLE(6),
    INTERNAL_AD_COVER_IMAGE(7),
    INTERNAL_AD_SUBTITLE(8),
    INTERNAL_AD_BODY(9),
    INTERNAL_AD_CALL_TO_ACTION(10),
    INTERNAL_AD_SOCIAL_CONTEXT(11),
    INTERNAL_AD_CHOICES_ICON(12),
    INTERNAL_AD_MEDIA(13),
    INTERNAL_AD_OPTIONS_VIEW(12);
    

    /* renamed from: p */
    public static int f7311p = -1593835521;

    /* renamed from: q */
    private final int f7313q;

    private C2322j(int i) {
        this.f7313q = i;
    }

    /* renamed from: a */
    public static void m9044a(View view, C2322j jVar) {
        if (view != null && jVar != null && VERSION.SDK_INT > 4) {
            view.setTag(f7311p, jVar);
        }
    }

    /* renamed from: a */
    public int mo8724a() {
        return this.f7313q;
    }
}
