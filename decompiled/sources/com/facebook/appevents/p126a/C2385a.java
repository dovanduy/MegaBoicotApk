package com.facebook.appevents.p126a;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import com.facebook.C2579j;
import com.facebook.C2649m;
import com.facebook.appevents.C2436g;
import com.facebook.appevents.p126a.p127a.C2389a;
import com.facebook.appevents.p126a.p127a.C2389a.C2390a;
import com.facebook.appevents.p126a.p127a.C2395d;
import com.facebook.appevents.p128b.C2408b;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.appevents.a.a */
/* compiled from: CodelessLoggingEventListener */
class C2385a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f7569a = C2385a.class.getCanonicalName();

    /* renamed from: com.facebook.appevents.a.a$a */
    /* compiled from: CodelessLoggingEventListener */
    public static class C2387a extends AccessibilityDelegate {

        /* renamed from: a */
        private C2389a f7571a;

        /* renamed from: b */
        private WeakReference<View> f7572b;

        /* renamed from: c */
        private WeakReference<View> f7573c;

        /* renamed from: d */
        private int f7574d;

        /* renamed from: e */
        private AccessibilityDelegate f7575e;

        public C2387a(C2389a aVar, View view, View view2) {
            if (aVar != null && view != null && view2 != null) {
                this.f7575e = C2395d.m9210c(view2);
                this.f7571a = aVar;
                this.f7572b = new WeakReference<>(view2);
                this.f7573c = new WeakReference<>(view);
                C2390a d = aVar.mo8799d();
                switch (aVar.mo8799d()) {
                    case CLICK:
                        this.f7574d = 1;
                        break;
                    case SELECTED:
                        this.f7574d = 4;
                        break;
                    case TEXT_CHANGED:
                        this.f7574d = 16;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported action type: ");
                        sb.append(d.toString());
                        throw new C2579j(sb.toString());
                }
            }
        }

        public void sendAccessibilityEvent(View view, int i) {
            if (i == -1) {
                Log.e(C2385a.f7569a, "Unsupported action type");
            }
            if (i == this.f7574d) {
                if (this.f7575e != null && !(this.f7575e instanceof C2387a)) {
                    this.f7575e.sendAccessibilityEvent(view, i);
                }
                m9199a();
            }
        }

        /* renamed from: a */
        private void m9199a() {
            final String c = this.f7571a.mo8798c();
            final Bundle a = C2396b.m9211a(this.f7571a, (View) this.f7573c.get(), (View) this.f7572b.get());
            if (a.containsKey("_valueToSum")) {
                a.putDouble("_valueToSum", C2408b.m9248a(a.getString("_valueToSum")));
            }
            a.putString("_is_fb_codeless", "1");
            C2649m.m10131d().execute(new Runnable() {
                public void run() {
                    C2436g.m9318a(C2649m.m10133f()).mo8854a(c, a);
                }
            });
        }
    }

    C2385a() {
    }

    /* renamed from: a */
    public static C2387a m9197a(C2389a aVar, View view, View view2) {
        return new C2387a(aVar, view, view2);
    }
}
