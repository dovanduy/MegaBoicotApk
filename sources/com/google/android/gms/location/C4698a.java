package com.google.android.gms.location;

import android.content.Context;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3256g;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.internal.C3332c.C3333a;
import com.google.android.gms.internal.location.C4660af;
import com.google.android.gms.internal.location.C4689t;

/* renamed from: com.google.android.gms.location.a */
public class C4698a {

    /* renamed from: a */
    public static final C3244a<Object> f15335a = new C3244a<>("ActivityRecognition.API", f15338d, f15337c);
    @Deprecated

    /* renamed from: b */
    public static final C4713b f15336b = new C4660af();

    /* renamed from: c */
    private static final C3256g<C4689t> f15337c = new C3256g<>();

    /* renamed from: d */
    private static final C3245a<C4689t, Object> f15338d = new C4722j();

    /* renamed from: com.google.android.gms.location.a$a */
    public static abstract class C4699a<R extends C3391k> extends C3333a<R, C4689t> {
        public C4699a(C3266f fVar) {
            super(C4698a.f15335a, fVar);
        }
    }

    /* renamed from: a */
    public static C4714c m20291a(Context context) {
        return new C4714c(context);
    }
}
