package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p017v4.app.C0250e;
import android.support.p017v4.app.FragmentActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C2661r;
import com.facebook.C2662s;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1503b;
import com.facebook.common.C2454a.C2458d;
import com.facebook.common.C2454a.C2459e;
import com.facebook.common.C2454a.C2460f;
import com.facebook.common.C2454a.C2461g;
import com.facebook.devicerequests.p129a.C2466a;
import com.facebook.internal.C2484ae;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceShareDialogFragment extends C0250e {

    /* renamed from: al */
    private static ScheduledThreadPoolExecutor f8281al;

    /* renamed from: ag */
    private ProgressBar f8282ag;

    /* renamed from: ah */
    private TextView f8283ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public Dialog f8284ai;

    /* renamed from: aj */
    private volatile RequestState f8285aj;

    /* renamed from: ak */
    private volatile ScheduledFuture f8286ak;

    /* renamed from: am */
    private ShareContent f8287am;

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
        private String f8291a;

        /* renamed from: b */
        private long f8292b;

        public int describeContents() {
            return 0;
        }

        RequestState() {
        }

        /* renamed from: a */
        public String mo9376a() {
            return this.f8291a;
        }

        /* renamed from: a */
        public void mo9378a(String str) {
            this.f8291a = str;
        }

        /* renamed from: b */
        public long mo9379b() {
            return this.f8292b;
        }

        /* renamed from: a */
        public void mo9377a(long j) {
            this.f8292b = j;
        }

        protected RequestState(Parcel parcel) {
            this.f8291a = parcel.readString();
            this.f8292b = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f8291a);
            parcel.writeLong(this.f8292b);
        }
    }

    /* renamed from: a */
    public View mo555a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo555a(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                m10180a(requestState);
            }
        }
        return a;
    }

    /* renamed from: c */
    public Dialog mo831c(Bundle bundle) {
        this.f8284ai = new Dialog(mo626m(), C2461g.com_facebook_auth_dialog);
        View inflate = mo626m().getLayoutInflater().inflate(C2459e.com_facebook_device_auth_dialog_fragment, null);
        this.f8282ag = (ProgressBar) inflate.findViewById(C2458d.progress_bar);
        this.f8283ah = (TextView) inflate.findViewById(C2458d.confirmation_code);
        ((Button) inflate.findViewById(C2458d.cancel_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                DeviceShareDialogFragment.this.f8284ai.dismiss();
            }
        });
        ((TextView) inflate.findViewById(C2458d.com_facebook_device_auth_instructions)).setText(Html.fromHtml(mo557a(C2460f.com_facebook_device_auth_instructions)));
        this.f8284ai.setContentView(inflate);
        m10185ak();
        return this.f8284ai;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f8286ak != null) {
            this.f8286ak.cancel(true);
        }
        m10178a(-1, new Intent());
    }

    /* renamed from: e */
    public void mo603e(Bundle bundle) {
        super.mo603e(bundle);
        if (this.f8285aj != null) {
            bundle.putParcelable("request_state", this.f8285aj);
        }
    }

    /* renamed from: a */
    private void m10178a(int i, Intent intent) {
        if (this.f8285aj != null) {
            C2466a.m9379c(this.f8285aj.mo9376a());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(mo622k(), facebookRequestError.mo6661e(), 0).show();
        }
        if (mo636r()) {
            FragmentActivity m = mo626m();
            m.setResult(i, intent);
            m.finish();
        }
    }

    /* renamed from: ai */
    private void m10183ai() {
        if (mo636r()) {
            mo630o().mo867a().mo805a(this).mo815b();
        }
    }

    /* renamed from: a */
    public void mo9373a(ShareContent shareContent) {
        this.f8287am = shareContent;
    }

    /* renamed from: aj */
    private Bundle m10184aj() {
        ShareContent shareContent = this.f8287am;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return C2712i.m10353a((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return C2712i.m10354a((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    /* renamed from: ak */
    private void m10185ak() {
        Bundle aj = m10184aj();
        if (aj == null || aj.size() == 0) {
            m10179a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C2484ae.m9493b());
        sb.append("|");
        sb.append(C2484ae.m9496c());
        aj.putString("access_token", sb.toString());
        aj.putString("device_info", C2466a.m9375a());
        GraphRequest graphRequest = new GraphRequest(null, "device/share", aj, C2662s.POST, new C1503b() {
            /* renamed from: a */
            public void mo6691a(C2661r rVar) {
                FacebookRequestError a = rVar.mo9370a();
                if (a != null) {
                    DeviceShareDialogFragment.this.m10179a(a);
                    return;
                }
                JSONObject b = rVar.mo9371b();
                RequestState requestState = new RequestState();
                try {
                    requestState.mo9378a(b.getString("user_code"));
                    requestState.mo9377a(b.getLong("expires_in"));
                    DeviceShareDialogFragment.this.m10180a(requestState);
                } catch (JSONException unused) {
                    DeviceShareDialogFragment.this.m10179a(new FacebookRequestError(0, "", "Malformed server response"));
                }
            }
        });
        graphRequest.mo6687j();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10179a(FacebookRequestError facebookRequestError) {
        m10183ai();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m10178a(-1, intent);
    }

    /* renamed from: al */
    private static synchronized ScheduledThreadPoolExecutor m10186al() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f8281al == null) {
                f8281al = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f8281al;
        }
        return scheduledThreadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10180a(RequestState requestState) {
        this.f8285aj = requestState;
        this.f8283ah.setText(requestState.mo9376a());
        this.f8283ah.setVisibility(0);
        this.f8282ag.setVisibility(8);
        this.f8286ak = m10186al().schedule(new Runnable() {
            public void run() {
                DeviceShareDialogFragment.this.f8284ai.dismiss();
            }
        }, requestState.mo9379b(), TimeUnit.SECONDS);
    }
}
