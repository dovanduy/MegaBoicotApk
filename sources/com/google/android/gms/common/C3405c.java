package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.support.p017v4.app.C0301u.C0304b;
import android.support.p017v4.app.C0301u.C0305c;
import android.support.p017v4.app.C0301u.C0306d;
import android.support.p017v4.app.FragmentActivity;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C3312bg;
import com.google.android.gms.common.api.internal.C3368h;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.C3485f;
import com.google.android.gms.common.internal.C3486g;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3557i;
import com.google.android.gms.common.util.C3563o;
import com.google.android.gms.internal.p145b.C4415f;
import com.google.android.gms.p134a.C2955a.C2957b;
import com.google.android.gms.p134a.C2955a.C2958c;

/* renamed from: com.google.android.gms.common.c */
public class C3405c extends C3407d {

    /* renamed from: a */
    public static final int f9842a = C3407d.f9849b;

    /* renamed from: c */
    private static final Object f9843c = new Object();

    /* renamed from: d */
    private static final C3405c f9844d = new C3405c();

    /* renamed from: e */
    private String f9845e;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.c$a */
    private class C3406a extends C4415f {

        /* renamed from: a */
        private final Context f9846a;

        public C3406a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f9846a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                int i = message.what;
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
            } else {
                int a = C3405c.this.mo13397a(this.f9846a);
                if (C3405c.this.mo13405a(a)) {
                    C3405c.this.mo13404a(this.f9846a, a);
                }
            }
        }
    }

    /* renamed from: a */
    public static C3405c m12234a() {
        return f9844d;
    }

    C3405c() {
    }

    /* renamed from: a */
    public Dialog mo13398a(Activity activity, int i, int i2) {
        return mo13399a(activity, i, i2, (OnCancelListener) null);
    }

    /* renamed from: a */
    public Dialog mo13399a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return m12233a((Context) activity, i, C3486g.m12505a(activity, mo13402a((Context) activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: a */
    public final boolean mo13406a(Activity activity, C3368h hVar, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = m12233a((Context) activity, i, C3486g.m12506a(hVar, mo13402a((Context) activity, i, "d"), 2), onCancelListener);
        if (a == null) {
            return false;
        }
        m12235a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: b */
    public boolean mo13411b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = mo13399a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        m12235a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: a */
    public void mo13404a(Context context, int i) {
        m12236a(context, i, (String) null, mo13413a(context, i, 0, "n"));
    }

    /* renamed from: a */
    public final boolean mo13407a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = mo13401a(context, connectionResult);
        if (a == null) {
            return false;
        }
        m12236a(context, connectionResult.mo13043c(), (String) null, GoogleApiActivity.m11594a(context, a, i));
        return true;
    }

    /* renamed from: a */
    public static Dialog m12232a(Activity activity, OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C3485f.m12502c(activity, 18));
        builder.setPositiveButton("", null);
        AlertDialog create = builder.create();
        m12235a(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: a */
    public final zabq mo13403a(Context context, C3312bg bgVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabq zabq = new zabq(bgVar);
        context.registerReceiver(zabq, intentFilter);
        zabq.mo13373a(context);
        if (mo13414a(context, "com.google.android.gms")) {
            return zabq;
        }
        bgVar.mo13206a();
        zabq.mo13372a();
        return null;
    }

    /* renamed from: c */
    private final String m12237c() {
        String str;
        synchronized (f9843c) {
            str = this.f9845e;
        }
        return str;
    }

    /* renamed from: a */
    public int mo13397a(Context context) {
        return super.mo13397a(context);
    }

    /* renamed from: b */
    public int mo13408b(Context context, int i) {
        return super.mo13408b(context, i);
    }

    /* renamed from: a */
    public final boolean mo13405a(int i) {
        return super.mo13405a(i);
    }

    /* renamed from: a */
    public Intent mo13402a(Context context, int i, String str) {
        return super.mo13402a(context, i, str);
    }

    /* renamed from: a */
    public PendingIntent mo13400a(Context context, int i, int i2) {
        return super.mo13400a(context, i, i2);
    }

    /* renamed from: a */
    public PendingIntent mo13401a(Context context, ConnectionResult connectionResult) {
        if (connectionResult.mo13041a()) {
            return connectionResult.mo13044d();
        }
        return mo13400a(context, connectionResult.mo13043c(), 0);
    }

    /* renamed from: b */
    public final String mo13409b(int i) {
        return super.mo13409b(i);
    }

    /* renamed from: a */
    static Dialog m12233a(Context context, int i, C3486g gVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(C3485f.m12502c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = C3485f.m12504e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, gVar);
        }
        String a = C3485f.m12497a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        return builder.create();
    }

    /* renamed from: a */
    static void m12235a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            C3522k.m12651a(dialog, onCancelListener).mo827a(((FragmentActivity) activity).mo670f(), str);
            return;
        }
        C3401b.m12219a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: a */
    private final void m12236a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo13410b(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String b = C3485f.m12501b(context, i);
            String d = C3485f.m12503d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0305c a = new C0305c(context).mo1084f(true).mo1082e(true).mo1065a((CharSequence) b).mo1064a((C0306d) new C0304b().mo1053a((CharSequence) d));
            if (C3557i.m12750a(context)) {
                C3513t.m12631a(C3563o.m12769h());
                a.mo1056a(context.getApplicationInfo().icon).mo1074c(2);
                if (C3557i.m12751b(context)) {
                    a.mo1058a(C2957b.common_full_open_on_phone, (CharSequence) resources.getString(C2958c.common_open_on_phone), pendingIntent);
                } else {
                    a.mo1060a(pendingIntent);
                }
            } else {
                a.mo1056a(17301642).mo1075c((CharSequence) resources.getString(C2958c.common_google_play_services_notification_ticker)).mo1059a(System.currentTimeMillis()).mo1060a(pendingIntent).mo1071b((CharSequence) d);
            }
            if (C3563o.m12773l()) {
                C3513t.m12631a(C3563o.m12773l());
                String c = m12237c();
                if (c == null) {
                    c = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(c);
                    String b2 = C3485f.m12500b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(c, b2, 4));
                    } else if (!b2.equals(notificationChannel.getName())) {
                        notificationChannel.setName(b2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                a.mo1066a(c);
            }
            Notification b3 = a.mo1068b();
            switch (i) {
                case 1:
                case 2:
                case 3:
                    i2 = 10436;
                    C3415h.f9878c.set(false);
                    break;
                default:
                    i2 = 39789;
                    break;
            }
            notificationManager.notify(i2, b3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo13410b(Context context) {
        new C3406a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
