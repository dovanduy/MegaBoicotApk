package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.facebook.C2649m;
import java.util.Locale;

/* renamed from: com.facebook.internal.p */
/* compiled from: ImageRequest */
public class C2553p {

    /* renamed from: a */
    private Context f7992a;

    /* renamed from: b */
    private Uri f7993b;

    /* renamed from: c */
    private C2556b f7994c;

    /* renamed from: d */
    private boolean f7995d;

    /* renamed from: e */
    private Object f7996e;

    /* renamed from: com.facebook.internal.p$a */
    /* compiled from: ImageRequest */
    public static class C2555a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Context f7997a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Uri f7998b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C2556b f7999c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f8000d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Object f8001e;

        public C2555a(Context context, Uri uri) {
            C2484ae.m9489a((Object) uri, "imageUri");
            this.f7997a = context;
            this.f7998b = uri;
        }

        /* renamed from: a */
        public C2555a mo9059a(C2556b bVar) {
            this.f7999c = bVar;
            return this;
        }

        /* renamed from: a */
        public C2555a mo9060a(Object obj) {
            this.f8001e = obj;
            return this;
        }

        /* renamed from: a */
        public C2555a mo9061a(boolean z) {
            this.f8000d = z;
            return this;
        }

        /* renamed from: a */
        public C2553p mo9062a() {
            return new C2553p(this);
        }
    }

    /* renamed from: com.facebook.internal.p$b */
    /* compiled from: ImageRequest */
    public interface C2556b {
        /* renamed from: a */
        void mo9063a(C2557q qVar);
    }

    /* renamed from: a */
    public static Uri m9689a(String str, int i, int i2) {
        C2484ae.m9490a(str, "userId");
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (max == 0 && max2 == 0) {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        Builder path = Uri.parse(C2476aa.m9411b()).buildUpon().path(String.format(Locale.US, "%s/%s/picture", new Object[]{C2649m.m10134g(), str}));
        if (max2 != 0) {
            path.appendQueryParameter("height", String.valueOf(max2));
        }
        if (max != 0) {
            path.appendQueryParameter("width", String.valueOf(max));
        }
        path.appendQueryParameter("migration_overrides", "{october_2012:true}");
        return path.build();
    }

    private C2553p(C2555a aVar) {
        this.f7992a = aVar.f7997a;
        this.f7993b = aVar.f7998b;
        this.f7994c = aVar.f7999c;
        this.f7995d = aVar.f8000d;
        this.f7996e = aVar.f8001e == null ? new Object() : aVar.f8001e;
    }

    /* renamed from: a */
    public Context mo9054a() {
        return this.f7992a;
    }

    /* renamed from: b */
    public Uri mo9055b() {
        return this.f7993b;
    }

    /* renamed from: c */
    public C2556b mo9056c() {
        return this.f7994c;
    }

    /* renamed from: d */
    public boolean mo9057d() {
        return this.f7995d;
    }

    /* renamed from: e */
    public Object mo9058e() {
        return this.f7996e;
    }
}
