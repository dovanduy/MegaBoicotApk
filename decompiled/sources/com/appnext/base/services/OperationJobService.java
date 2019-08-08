package com.appnext.base.services;

import android.app.job.JobParameters;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.appnext.base.C1222a;
import com.appnext.base.operations.AppnextOperationJobService;
import com.appnext.base.operations.C1265a.C1266a;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1244c;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1251i;
import com.appnext.base.services.p047a.C1283c;
import com.appnext.base.services.p048b.C1285a;

public class OperationJobService extends AppnextOperationJobService {
    public static final String SCHEDULE = "schedule";

    public int onRunJob(final JobParameters jobParameters) {
        C1231c cVar;
        try {
            C1247e.init(getApplicationContext());
            C1251i.m5302ck().init(getApplicationContext());
            PersistableBundle extras = jobParameters.getExtras();
            Bundle bundle = null;
            if (extras == null) {
                cVar = null;
            } else {
                String string = extras.getString("key", "");
                String string2 = extras.getString(C1244c.f3933iC, "");
                String string3 = extras.getString(C1244c.f3934iD, "");
                cVar = new C1231c(extras.getString(C1244c.STATUS, ""), extras.getString(C1244c.f3935iE, ""), extras.getString(C1244c.f3936iF, ""), string2, string3, string, extras.getString("service_key", ""), extras.getString("data", null));
            }
            if (cVar == null) {
                m5522b(jobParameters);
                return 0;
            } else if (m5521a(extras)) {
                m5522b(jobParameters);
                C1285a.m5550g(getApplicationContext()).mo6051a(cVar, true);
                return 0;
            } else {
                if (extras != null) {
                    PersistableBundle persistableBundle = extras.getPersistableBundle(C1283c.f4087iv);
                    if (persistableBundle != null) {
                        bundle = new Bundle();
                        bundle.putAll(persistableBundle);
                    }
                }
                new C1284b().mo6050a(getApplicationContext(), cVar.getKey(), null, bundle, null, new C1266a() {
                    /* renamed from: bC */
                    public final void mo6017bC() {
                        OperationJobService.this.m5522b(jobParameters);
                    }

                    /* renamed from: b */
                    public final void mo6016b(C1222a aVar) {
                        OperationJobService.this.m5522b(jobParameters);
                    }
                });
                return 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static boolean m5521a(PersistableBundle persistableBundle) {
        if (persistableBundle == null) {
            return false;
        }
        try {
            return Boolean.valueOf(persistableBundle.getString(SCHEDULE, "false")).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5522b(JobParameters jobParameters) {
        try {
            mo5987a(jobParameters);
        } catch (Throwable unused) {
        }
    }
}
