package com.appnext.base.services.p047a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.services.OperationService;
import java.util.List;

/* renamed from: com.appnext.base.services.a.a */
public final class C1281a extends C1283c {

    /* renamed from: is */
    private AlarmManager f4084is;
    private Context mContext;

    public C1281a(Context context) {
        try {
            this.mContext = context.getApplicationContext();
            this.f4084is = (AlarmManager) context.getSystemService("alarm");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo6044b(C1231c cVar) {
        try {
            this.f4084is.cancel(PendingIntent.getService(this.mContext, cVar.mo5910bg().hashCode(), new Intent(this.mContext, OperationService.class), 268435456));
            this.mContext.stopService(new Intent(this.mContext, OperationService.class));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public final void mo6046h(List<C1231c> list) {
        if (list != null) {
            try {
                for (C1231c b : list) {
                    mo6044b(b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6042a(C1231c cVar, long j, long j2) {
        m5526a(cVar.mo5910bg(), cVar.getKey(), j, j2, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6045b(C1231c cVar, long j, long j2) {
        m5526a(cVar.mo5910bg(), cVar.getKey(), j, 86400000, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6043a(C1231c cVar, long j, Bundle bundle) {
        m5526a(cVar.mo5910bg(), cVar.getKey(), j, 0, bundle);
    }

    /* renamed from: a */
    private void m5526a(String str, String str2, long j, long j2, Bundle bundle) {
        try {
            Intent intent = new Intent(this.mContext, OperationService.class);
            intent.putExtra(C1245d.f3950iS, str2);
            if (bundle != null) {
                intent.putExtra(C1283c.f4087iv, bundle);
            }
            int hashCode = str.hashCode();
            String.valueOf(str);
            PendingIntent service = PendingIntent.getService(this.mContext, hashCode, intent, 134217728);
            if (j2 > 0) {
                this.f4084is.setInexactRepeating(1, j, j2, service);
            } else {
                this.f4084is.set(1, j, service);
            }
        } catch (Throwable unused) {
        }
    }
}
