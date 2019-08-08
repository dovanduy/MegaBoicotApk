package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@C3718cm
public final class arq {

    /* renamed from: a */
    private final Collection<ark<?>> f11739a = new ArrayList();

    /* renamed from: b */
    private final Collection<ark<String>> f11740b = new ArrayList();

    /* renamed from: c */
    private final Collection<ark<String>> f11741c = new ArrayList();

    /* renamed from: a */
    public final List<String> mo14689a() {
        ArrayList arrayList = new ArrayList();
        for (ark a : this.f11740b) {
            String str = (String) aoq.m14620f().mo14695a(a);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo14690a(Editor editor, int i, JSONObject jSONObject) {
        for (ark ark : this.f11739a) {
            if (ark.mo14688c() == 1) {
                ark.mo14686a(editor, ark.mo14684a(jSONObject));
            }
        }
    }

    /* renamed from: a */
    public final void mo14691a(ark ark) {
        this.f11739a.add(ark);
    }

    /* renamed from: b */
    public final List<String> mo14692b() {
        List<String> a = mo14689a();
        for (ark a2 : this.f11741c) {
            String str = (String) aoq.m14620f().mo14695a(a2);
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }

    /* renamed from: b */
    public final void mo14693b(ark<String> ark) {
        this.f11740b.add(ark);
    }

    /* renamed from: c */
    public final void mo14694c(ark<String> ark) {
        this.f11741c.add(ark);
    }
}
