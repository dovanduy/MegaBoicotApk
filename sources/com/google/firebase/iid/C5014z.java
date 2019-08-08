package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.p023d.C0376a;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.z */
final class C5014z {

    /* renamed from: a */
    private final SharedPreferences f16282a;

    /* renamed from: b */
    private final Context f16283b;

    /* renamed from: c */
    private final C4988az f16284c;

    /* renamed from: d */
    private final Map<String, C4990ba> f16285d;

    public C5014z(Context context) {
        this(context, new C4988az());
    }

    private C5014z(Context context, C4988az azVar) {
        this.f16285d = new C0376a();
        this.f16283b = context;
        this.f16282a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f16284c = azVar;
        File file = new File(C0356c.m1320b(this.f16283b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m21748c()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    mo17978b();
                    FirebaseInstanceId.m21578a().mo17894h();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str = "FirebaseInstanceId";
                    String str2 = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized String mo17974a() {
        return this.f16282a.getString("topic_operaion_queue", "");
    }

    /* renamed from: a */
    public final synchronized void mo17975a(String str) {
        this.f16282a.edit().putString("topic_operaion_queue", str).apply();
    }

    /* renamed from: c */
    private final synchronized boolean m21748c() {
        return this.f16282a.getAll().isEmpty();
    }

    /* renamed from: b */
    private static String m21747b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(4 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    static String m21746a(String str, String str2) {
        StringBuilder sb = new StringBuilder(3 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public final synchronized void mo17978b() {
        this.f16285d.clear();
        C4988az.m21667a(this.f16283b);
        this.f16282a.edit().clear().commit();
    }

    /* renamed from: a */
    public final synchronized C4963aa mo17973a(String str, String str2, String str3) {
        return C4963aa.m21618a(this.f16282a.getString(m21747b(str, str2, str3), null));
    }

    /* renamed from: a */
    public final synchronized void mo17976a(String str, String str2, String str3, String str4, String str5) {
        String a = C4963aa.m21620a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            Editor edit = this.f16282a.edit();
            edit.putString(m21747b(str, str2, str3), a);
            edit.commit();
        }
    }

    /* renamed from: b */
    public final synchronized C4990ba mo17977b(String str) {
        C4990ba baVar;
        C4990ba baVar2 = (C4990ba) this.f16285d.get(str);
        if (baVar2 != null) {
            return baVar2;
        }
        try {
            baVar = this.f16284c.mo17937a(this.f16283b, str);
        } catch (C4992d unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.m21578a().mo17894h();
            baVar = this.f16284c.mo17938b(this.f16283b, str);
        }
        this.f16285d.put(str, baVar);
        return baVar;
    }

    /* renamed from: c */
    public final synchronized void mo17979c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        Editor edit = this.f16282a.edit();
        for (String str2 : this.f16282a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
