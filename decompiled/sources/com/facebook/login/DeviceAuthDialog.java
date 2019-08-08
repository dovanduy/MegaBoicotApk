package com.facebook.login;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p017v4.app.C0250e;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.appnext.base.p046b.C1245d;
import com.facebook.AccessToken;
import com.facebook.C2453c;
import com.facebook.C2579j;
import com.facebook.C2649m;
import com.facebook.C2657p;
import com.facebook.C2661r;
import com.facebook.C2662s;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1503b;
import com.facebook.appevents.C2436g;
import com.facebook.common.C2454a.C2458d;
import com.facebook.common.C2454a.C2459e;
import com.facebook.common.C2454a.C2460f;
import com.facebook.common.C2454a.C2461g;
import com.facebook.devicerequests.p129a.C2466a;
import com.facebook.internal.C2477ab;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2479ad.C2483b;
import com.facebook.internal.C2484ae;
import com.facebook.internal.C2529l;
import com.facebook.login.LoginClient.Request;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceAuthDialog extends C0250e {

    /* renamed from: ag */
    private ProgressBar f8048ag;

    /* renamed from: ah */
    private TextView f8049ah;

    /* renamed from: ai */
    private TextView f8050ai;

    /* renamed from: aj */
    private DeviceAuthMethodHandler f8051aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public AtomicBoolean f8052ak = new AtomicBoolean();

    /* renamed from: al */
    private volatile C2657p f8053al;

    /* renamed from: am */
    private volatile ScheduledFuture f8054am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public volatile RequestState f8055an;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public Dialog f8056ao;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public boolean f8057ap = false;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public boolean f8058aq = false;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public Request f8059ar = null;

    private static class RequestState implements Parcelable {
        public static final Creator<RequestState> CREATOR = new Creator<RequestState>() {
            /* renamed from: a */
            public RequestState createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }

            /* renamed from: a */
            public RequestState[] newArray(int i) {
                return new RequestState[i];
            }
        };

        /* renamed from: a */
        private String f8071a;

        /* renamed from: b */
        private String f8072b;

        /* renamed from: c */
        private String f8073c;

        /* renamed from: d */
        private long f8074d;

        /* renamed from: e */
        private long f8075e;

        public int describeContents() {
            return 0;
        }

        RequestState() {
        }

        /* renamed from: a */
        public String mo9108a() {
            return this.f8071a;
        }

        /* renamed from: b */
        public String mo9111b() {
            return this.f8072b;
        }

        /* renamed from: a */
        public void mo9110a(String str) {
            this.f8072b = str;
            this.f8071a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{str});
        }

        /* renamed from: c */
        public String mo9114c() {
            return this.f8073c;
        }

        /* renamed from: b */
        public void mo9113b(String str) {
            this.f8073c = str;
        }

        /* renamed from: d */
        public long mo9115d() {
            return this.f8074d;
        }

        /* renamed from: a */
        public void mo9109a(long j) {
            this.f8074d = j;
        }

        /* renamed from: b */
        public void mo9112b(long j) {
            this.f8075e = j;
        }

        protected RequestState(Parcel parcel) {
            this.f8072b = parcel.readString();
            this.f8073c = parcel.readString();
            this.f8074d = parcel.readLong();
            this.f8075e = parcel.readLong();
        }

        /* renamed from: e */
        public boolean mo9117e() {
            boolean z = false;
            if (this.f8075e == 0) {
                return false;
            }
            if ((new Date().getTime() - this.f8075e) - (this.f8074d * 1000) < 0) {
                z = true;
            }
            return z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f8072b);
            parcel.writeString(this.f8073c);
            parcel.writeLong(this.f8074d);
            parcel.writeLong(this.f8075e);
        }
    }

    /* renamed from: a */
    public View mo555a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo555a(layoutInflater, viewGroup, bundle);
        this.f8051aj = (DeviceAuthMethodHandler) ((C2610e) ((FacebookActivity) mo626m()).mo6644i()).mo9234d().mo9167g();
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                m9810a(requestState);
            }
        }
        return a;
    }

    /* renamed from: c */
    public Dialog mo831c(Bundle bundle) {
        this.f8056ao = new Dialog(mo626m(), C2461g.com_facebook_auth_dialog);
        this.f8056ao.setContentView(m9833k(C2466a.m9378b() && !this.f8058aq));
        return this.f8056ao;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f8057ap) {
            m9822al();
        }
    }

    /* renamed from: e */
    public void mo603e(Bundle bundle) {
        super.mo603e(bundle);
        if (this.f8055an != null) {
            bundle.putParcelable("request_state", this.f8055an);
        }
    }

    /* renamed from: B */
    public void mo529B() {
        this.f8057ap = true;
        this.f8052ak.set(true);
        super.mo529B();
        if (this.f8053al != null) {
            this.f8053al.cancel(true);
        }
        if (this.f8054am != null) {
            this.f8054am.cancel(true);
        }
    }

    /* renamed from: a */
    public void mo9103a(Request request) {
        this.f8059ar = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.mo9178a()));
        String g = request.mo9188g();
        if (g != null) {
            bundle.putString("redirect_uri", g);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C2484ae.m9493b());
        sb.append("|");
        sb.append(C2484ae.m9496c());
        bundle.putString("access_token", sb.toString());
        bundle.putString("device_info", C2466a.m9375a());
        GraphRequest graphRequest = new GraphRequest(null, "device/login", bundle, C2662s.POST, new C1503b() {
            /* renamed from: a */
            public void mo6691a(C2661r rVar) {
                if (!DeviceAuthDialog.this.f8057ap) {
                    if (rVar.mo9370a() != null) {
                        DeviceAuthDialog.this.m9809a(rVar.mo9370a().mo6663g());
                        return;
                    }
                    JSONObject b = rVar.mo9371b();
                    RequestState requestState = new RequestState();
                    try {
                        requestState.mo9110a(b.getString("user_code"));
                        requestState.mo9113b(b.getString("code"));
                        requestState.mo9109a(b.getLong(C1245d.f3957iZ));
                        DeviceAuthDialog.this.m9810a(requestState);
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.m9809a(new C2579j((Throwable) e));
                    }
                }
            }
        });
        graphRequest.mo6687j();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9810a(RequestState requestState) {
        this.f8055an = requestState;
        this.f8049ah.setText(requestState.mo9111b());
        this.f8050ai.setCompoundDrawablesWithIntrinsicBounds(null, new BitmapDrawable(mo628n(), C2466a.m9377b(requestState.mo9108a())), null, null);
        this.f8049ah.setVisibility(0);
        this.f8048ag.setVisibility(8);
        if (!this.f8058aq && C2466a.m9376a(requestState.mo9111b())) {
            C2436g.m9318a(mo622k()).mo8855a("fb_smart_login_service", (Double) null, (Bundle) null);
        }
        if (requestState.mo9117e()) {
            m9820aj();
        } else {
            m9819ai();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public View m9833k(boolean z) {
        View view;
        LayoutInflater layoutInflater = mo626m().getLayoutInflater();
        if (z) {
            view = layoutInflater.inflate(C2459e.com_facebook_smart_device_dialog_fragment, null);
        } else {
            view = layoutInflater.inflate(C2459e.com_facebook_device_auth_dialog_fragment, null);
        }
        this.f8048ag = (ProgressBar) view.findViewById(C2458d.progress_bar);
        this.f8049ah = (TextView) view.findViewById(C2458d.confirmation_code);
        ((Button) view.findViewById(C2458d.cancel_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                DeviceAuthDialog.this.m9822al();
            }
        });
        this.f8050ai = (TextView) view.findViewById(C2458d.com_facebook_device_auth_instructions);
        this.f8050ai.setText(Html.fromHtml(mo557a(C2460f.com_facebook_device_auth_instructions)));
        return view;
    }

    /* access modifiers changed from: private */
    /* renamed from: ai */
    public void m9819ai() {
        this.f8055an.mo9112b(new Date().getTime());
        this.f8053al = m9821ak().mo6687j();
    }

    /* access modifiers changed from: private */
    /* renamed from: aj */
    public void m9820aj() {
        this.f8054am = DeviceAuthMethodHandler.m9854c().schedule(new Runnable() {
            public void run() {
                DeviceAuthDialog.this.m9819ai();
            }
        }, this.f8055an.mo9115d(), TimeUnit.SECONDS);
    }

    /* renamed from: ak */
    private GraphRequest m9821ak() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f8055an.mo9114c());
        GraphRequest graphRequest = new GraphRequest(null, "device/login_status", bundle, C2662s.POST, new C1503b() {
            /* renamed from: a */
            public void mo6691a(C2661r rVar) {
                if (!DeviceAuthDialog.this.f8052ak.get()) {
                    FacebookRequestError a = rVar.mo9370a();
                    if (a != null) {
                        int c = a.mo6658c();
                        if (c != 1349152) {
                            switch (c) {
                                case 1349172:
                                case 1349174:
                                    DeviceAuthDialog.this.m9820aj();
                                    break;
                                case 1349173:
                                    break;
                                default:
                                    DeviceAuthDialog.this.m9809a(rVar.mo9370a().mo6663g());
                                    break;
                            }
                        }
                        DeviceAuthDialog.this.m9822al();
                        return;
                    }
                    try {
                        DeviceAuthDialog.this.m9824b(rVar.mo9371b().getString("access_token"));
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.m9809a(new C2579j((Throwable) e));
                    }
                }
            }
        });
        return graphRequest;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9817a(final String str, final C2483b bVar, final String str2, String str3) {
        String string = mo628n().getString(C2460f.com_facebook_smart_login_confirmation_title);
        String string2 = mo628n().getString(C2460f.com_facebook_smart_login_confirmation_continue_as);
        String string3 = mo628n().getString(C2460f.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, new Object[]{str3});
        Builder builder = new Builder(mo622k());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.this.m9816a(str, bVar, str2);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.this.f8056ao.setContentView(DeviceAuthDialog.this.m9833k(false));
                DeviceAuthDialog.this.mo9103a(DeviceAuthDialog.this.f8059ar);
            }
        });
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9824b(final String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        AccessToken accessToken = new AccessToken(str, C2649m.m10137j(), "0", null, null, null, null, null);
        GraphRequest graphRequest = new GraphRequest(accessToken, "me", bundle, C2662s.GET, new C1503b() {
            /* renamed from: a */
            public void mo6691a(C2661r rVar) {
                if (!DeviceAuthDialog.this.f8052ak.get()) {
                    if (rVar.mo9370a() != null) {
                        DeviceAuthDialog.this.m9809a(rVar.mo9370a().mo6663g());
                        return;
                    }
                    try {
                        JSONObject b = rVar.mo9371b();
                        String string = b.getString(TtmlNode.ATTR_ID);
                        C2483b a = C2479ad.m9422a(b);
                        String string2 = b.getString("name");
                        C2466a.m9379c(DeviceAuthDialog.this.f8055an.mo9111b());
                        if (!C2529l.m9632a(C2649m.m10137j()).mo9001g().contains(C2477ab.RequireConfirm) || DeviceAuthDialog.this.f8058aq) {
                            DeviceAuthDialog.this.m9816a(string, a, str);
                            return;
                        }
                        DeviceAuthDialog.this.f8058aq = true;
                        DeviceAuthDialog.this.m9817a(string, a, str, string2);
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.m9809a(new C2579j((Throwable) e));
                    }
                }
            }
        });
        graphRequest.mo6687j();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9816a(String str, C2483b bVar, String str2) {
        this.f8051aj.mo9124a(str2, C2649m.m10137j(), str, bVar.mo8924a(), bVar.mo8925b(), C2453c.DEVICE_AUTH, null, null);
        this.f8056ao.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9809a(C2579j jVar) {
        if (this.f8052ak.compareAndSet(false, true)) {
            if (this.f8055an != null) {
                C2466a.m9379c(this.f8055an.mo9111b());
            }
            this.f8051aj.mo9123a((Exception) jVar);
            this.f8056ao.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: al */
    public void m9822al() {
        if (this.f8052ak.compareAndSet(false, true)) {
            if (this.f8055an != null) {
                C2466a.m9379c(this.f8055an.mo9111b());
            }
            if (this.f8051aj != null) {
                this.f8051aj.mo9125d_();
            }
            this.f8056ao.dismiss();
        }
    }
}
