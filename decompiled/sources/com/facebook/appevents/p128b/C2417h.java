package com.facebook.appevents.p128b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.C2649m;
import java.util.UUID;

/* renamed from: com.facebook.appevents.b.h */
/* compiled from: SessionInfo */
class C2417h {

    /* renamed from: a */
    private Long f7664a;

    /* renamed from: b */
    private Long f7665b;

    /* renamed from: c */
    private int f7666c;

    /* renamed from: d */
    private Long f7667d;

    /* renamed from: e */
    private C2419j f7668e;

    /* renamed from: f */
    private UUID f7669f;

    public C2417h(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    public C2417h(Long l, Long l2, UUID uuid) {
        this.f7664a = l;
        this.f7665b = l2;
        this.f7669f = uuid;
    }

    /* renamed from: a */
    public static C2417h m9262a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2649m.m10133f());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        C2417h hVar = new C2417h(Long.valueOf(j), Long.valueOf(j2));
        hVar.f7666c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        hVar.f7668e = C2419j.m9278a();
        hVar.f7667d = Long.valueOf(System.currentTimeMillis());
        hVar.f7669f = UUID.fromString(string);
        return hVar;
    }

    /* renamed from: b */
    public static void m9263b() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C2649m.m10133f()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        C2419j.m9279b();
    }

    /* renamed from: c */
    public Long mo8827c() {
        return this.f7665b;
    }

    /* renamed from: a */
    public void mo8826a(Long l) {
        this.f7665b = l;
    }

    /* renamed from: d */
    public int mo8828d() {
        return this.f7666c;
    }

    /* renamed from: e */
    public void mo8829e() {
        this.f7666c++;
    }

    /* renamed from: f */
    public long mo8830f() {
        if (this.f7667d == null) {
            return 0;
        }
        return this.f7667d.longValue();
    }

    /* renamed from: g */
    public UUID mo8831g() {
        return this.f7669f;
    }

    /* renamed from: h */
    public long mo8832h() {
        if (this.f7664a == null || this.f7665b == null) {
            return 0;
        }
        return this.f7665b.longValue() - this.f7664a.longValue();
    }

    /* renamed from: i */
    public C2419j mo8833i() {
        return this.f7668e;
    }

    /* renamed from: a */
    public void mo8825a(C2419j jVar) {
        this.f7668e = jVar;
    }

    /* renamed from: j */
    public void mo8834j() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C2649m.m10133f()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f7664a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f7665b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f7666c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f7669f.toString());
        edit.apply();
        if (this.f7668e != null) {
            this.f7668e.mo8835c();
        }
    }
}
