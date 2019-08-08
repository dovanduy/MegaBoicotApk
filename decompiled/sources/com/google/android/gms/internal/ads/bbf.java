package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3078h;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

final class bbf implements C3078h {

    /* renamed from: a */
    private final bad f12539a;

    /* renamed from: b */
    private final C4019np f12540b;

    /* renamed from: c */
    private final /* synthetic */ bbc f12541c;

    public bbf(bbc bbc, bad bad, C4019np npVar) {
        this.f12541c = bbc;
        this.f12539a = bad;
        this.f12540b = npVar;
    }

    /* renamed from: a */
    public final void mo12619a(@Nullable String str) {
        if (str == null) {
            try {
                this.f12540b.mo15685a(new baq());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.f12539a.mo15037c();
                throw th;
            }
        } else {
            this.f12540b.mo15685a(new baq(str));
        }
        this.f12539a.mo15037c();
    }

    /* renamed from: a */
    public final void mo12620a(JSONObject jSONObject) {
        try {
            this.f12540b.mo15686b(this.f12541c.f12529a.mo15046a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f12540b.mo15686b(e);
        } catch (Throwable th) {
            this.f12539a.mo15037c();
            throw th;
        }
        this.f12539a.mo15037c();
    }
}
