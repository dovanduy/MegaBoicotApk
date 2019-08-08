package com.startapp.common.p193a;

import android.content.Context;
import android.widget.Toast;

/* renamed from: com.startapp.common.a.i */
/* compiled from: StartAppSDK */
public class C5522i {

    /* renamed from: a */
    private static C5522i f17572a = new C5522i();

    /* renamed from: b */
    private Toast f17573b;

    private C5522i() {
    }

    /* renamed from: a */
    public void mo20502a(Context context, String str) {
        if (this.f17573b == null) {
            this.f17573b = Toast.makeText(context, str, 0);
        } else {
            this.f17573b.setText(str);
            this.f17573b.setDuration(0);
        }
        this.f17573b.show();
    }

    /* renamed from: a */
    public static C5522i m23586a() {
        return f17572a;
    }
}
