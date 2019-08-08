package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.C2575y;

@Deprecated
/* renamed from: com.facebook.share.internal.e */
/* compiled from: LikeStatusClient */
final class C2706e extends C2575y {

    /* renamed from: a */
    private String f8405a;

    C2706e(Context context, String str, String str2) {
        super(context, 65542, 65543, 20141001, str);
        this.f8405a = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9082a(Bundle bundle) {
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", this.f8405a);
    }
}
