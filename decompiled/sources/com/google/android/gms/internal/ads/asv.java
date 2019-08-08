package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
public final class asv implements OnClickListener {

    /* renamed from: a */
    String f12111a;

    /* renamed from: b */
    Long f12112b;

    /* renamed from: c */
    WeakReference<View> f12113c;

    /* renamed from: d */
    private final C3695bq f12114d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public awb f12115e;

    /* renamed from: f */
    private C3067ae f12116f;

    public asv(C3695bq bqVar) {
        this.f12114d = bqVar;
    }

    /* renamed from: c */
    private final void m15100c() {
        this.f12111a = null;
        this.f12112b = null;
        if (this.f12113c != null) {
            View view = (View) this.f12113c.get();
            this.f12113c = null;
            if (view != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
            }
        }
    }

    /* renamed from: a */
    public final awb mo14748a() {
        return this.f12115e;
    }

    /* renamed from: a */
    public final void mo14749a(awb awb) {
        this.f12115e = awb;
        if (this.f12116f != null) {
            this.f12114d.mo15209b("/unconfirmedClick", this.f12116f);
        }
        this.f12116f = new asw(this);
        this.f12114d.mo15206a("/unconfirmedClick", this.f12116f);
    }

    /* renamed from: b */
    public final void mo14750b() {
        if (this.f12115e != null && this.f12112b != null) {
            m15100c();
            try {
                this.f12115e.mo14918a();
            } catch (RemoteException e) {
                C3987mk.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onClick(View view) {
        if (this.f12113c != null && this.f12113c.get() == view) {
            if (!(this.f12111a == null || this.f12112b == null)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(TtmlNode.ATTR_ID, this.f12111a);
                    jSONObject.put("time_interval", C3025aw.m10924l().mo13694a() - this.f12112b.longValue());
                    jSONObject.put("messageType", "onePointFiveClick");
                    this.f12114d.mo15207a("sendMessageToNativeJs", jSONObject);
                } catch (JSONException e) {
                    C3900je.m17430b("Unable to dispatch sendMessageToNativeJs event", e);
                }
            }
            m15100c();
        }
    }
}
