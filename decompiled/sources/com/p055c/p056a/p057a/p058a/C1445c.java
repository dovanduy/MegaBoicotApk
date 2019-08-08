package com.p055c.p056a.p057a.p058a;

import android.content.Context;
import com.p055c.p056a.p057a.p058a.p062c.C1447b;
import com.p055c.p056a.p057a.p058a.p062c.C1450c;
import com.p055c.p056a.p057a.p058a.p062c.C1453e;
import com.p055c.p056a.p057a.p058a.p064e.C1461b;
import com.p055c.p056a.p057a.p058a.p064e.C1465e;

/* renamed from: com.c.a.a.a.c */
public class C1445c {

    /* renamed from: a */
    private boolean f4408a;

    /* renamed from: b */
    private void m5976b(String str, Context context) {
        m5977c(str);
        C1465e.m6070a((Object) context, "Application Context cannot be null");
    }

    /* renamed from: c */
    private void m5977c(String str) {
        C1465e.m6070a((Object) str, "Version cannot be null");
        if (!str.matches("[0-9]+\\.[0-9]+\\.[0-9]+.*")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid version format : ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo6515a() {
        return "1.2.0-Startapp";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6516a(boolean z) {
        this.f4408a = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6517a(String str) {
        return mo6519b(mo6515a()) == mo6519b(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6518a(String str, Context context) {
        m5976b(str, context);
        if (!mo6517a(str)) {
            return false;
        }
        if (!mo6520b()) {
            mo6516a(true);
            C1453e.m6020a().mo6550a(context);
            C1447b.m5991a().mo6527a(context);
            C1461b.m6051a(context);
            C1450c.m6003a().mo6534a(context);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo6519b(String str) {
        m5977c(str);
        return Integer.parseInt(str.split("\\.", 2)[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo6520b() {
        return this.f4408a;
    }
}
