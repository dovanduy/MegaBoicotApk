package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.p136b.C2969a.C2970a;
import java.util.Map;

@C3718cm
public final class bec extends C4003n {

    /* renamed from: a */
    private final Map<String, String> f12714a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f12715b;

    /* renamed from: c */
    private String f12716c = m16425d("description");

    /* renamed from: d */
    private long f12717d = m16426e("start_ticks");

    /* renamed from: e */
    private long f12718e = m16426e("end_ticks");

    /* renamed from: f */
    private String f12719f = m16425d("summary");

    /* renamed from: g */
    private String f12720g = m16425d("location");

    public bec(C4089qe qeVar, Map<String, String> map) {
        super(qeVar, "createCalendarEvent");
        this.f12714a = map;
        this.f12715b = qeVar.mo15801d();
    }

    /* renamed from: d */
    private final String m16425d(String str) {
        return TextUtils.isEmpty((CharSequence) this.f12714a.get(str)) ? "" : (String) this.f12714a.get(str);
    }

    /* renamed from: e */
    private final long m16426e(String str) {
        String str2 = (String) this.f12714a.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo15192a() {
        if (this.f12715b == null) {
            mo15652a("Activity context is not available.");
            return;
        }
        C3025aw.m10917e();
        if (!C3909jn.m17168f(this.f12715b).mo14678d()) {
            mo15652a("This feature is not available on the device.");
            return;
        }
        C3025aw.m10917e();
        Builder e = C3909jn.m17164e(this.f12715b);
        Resources h = C3025aw.m10921i().mo15445h();
        e.setTitle(h != null ? h.getString(C2970a.f8686s5) : "Create calendar event");
        e.setMessage(h != null ? h.getString(C2970a.f8687s6) : "Allow Ad to create a calendar event?");
        e.setPositiveButton(h != null ? h.getString(C2970a.f8684s3) : "Accept", new bed(this));
        e.setNegativeButton(h != null ? h.getString(C2970a.f8685s4) : "Decline", new C3705c(this));
        e.create().show();
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(14)
    /* renamed from: b */
    public final Intent mo15193b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", this.f12716c);
        data.putExtra("eventLocation", this.f12720g);
        data.putExtra("description", this.f12719f);
        if (this.f12717d > -1) {
            data.putExtra("beginTime", this.f12717d);
        }
        if (this.f12718e > -1) {
            data.putExtra("endTime", this.f12718e);
        }
        data.setFlags(268435456);
        return data;
    }
}
