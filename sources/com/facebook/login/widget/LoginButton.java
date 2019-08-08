package com.facebook.login.widget;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.os.Bundle;
import android.support.p028v7.p031c.p032a.C0740a;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.appnext.core.C1286Ad;
import com.facebook.AccessToken;
import com.facebook.C2463d;
import com.facebook.C2468e;
import com.facebook.C2471g;
import com.facebook.C2473h;
import com.facebook.C2649m;
import com.facebook.Profile;
import com.facebook.appevents.C2436g;
import com.facebook.common.C2454a.C2455a;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2512d.C2514b;
import com.facebook.internal.C2527k;
import com.facebook.internal.C2529l;
import com.facebook.internal.C2564v;
import com.facebook.login.C2606a;
import com.facebook.login.C2609d;
import com.facebook.login.C2614g;
import com.facebook.login.C2621h;
import com.facebook.login.C2622i.C2624b;
import com.facebook.login.C2622i.C2627e;
import com.facebook.login.C2622i.C2628f;
import com.facebook.login.C2622i.C2629g;
import com.facebook.login.widget.C2643a.C2648b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LoginButton extends C2471g {

    /* renamed from: a */
    private static final String f8169a = "com.facebook.login.widget.LoginButton";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f8170b;

    /* renamed from: c */
    private String f8171c;

    /* renamed from: d */
    private String f8172d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2637a f8173e = new C2637a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f8174f = "fb_login_view_usage";

    /* renamed from: g */
    private boolean f8175g;

    /* renamed from: h */
    private C2648b f8176h = C2648b.BLUE;

    /* renamed from: i */
    private C2640c f8177i;

    /* renamed from: j */
    private long f8178j = 6000;

    /* renamed from: k */
    private C2643a f8179k;

    /* renamed from: l */
    private C2463d f8180l;

    /* renamed from: m */
    private C2614g f8181m;

    /* renamed from: com.facebook.login.widget.LoginButton$a */
    static class C2637a {

        /* renamed from: a */
        private C2606a f8188a = C2606a.FRIENDS;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public List<String> f8189b = Collections.emptyList();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C2564v f8190c = null;

        /* renamed from: d */
        private C2609d f8191d = C2609d.NATIVE_WITH_FALLBACK;

        /* renamed from: e */
        private String f8192e = "rerequest";

        C2637a() {
        }

        /* renamed from: a */
        public void mo9293a(C2606a aVar) {
            this.f8188a = aVar;
        }

        /* renamed from: a */
        public C2606a mo9292a() {
            return this.f8188a;
        }

        /* renamed from: a */
        public void mo9296a(List<String> list) {
            if (C2564v.PUBLISH.equals(this.f8190c)) {
                throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
            }
            this.f8189b = list;
            this.f8190c = C2564v.READ;
        }

        /* renamed from: b */
        public void mo9298b(List<String> list) {
            if (C2564v.READ.equals(this.f8190c)) {
                throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
            } else if (C2479ad.m9457a((Collection<T>) list)) {
                throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
            } else {
                this.f8189b = list;
                this.f8190c = C2564v.PUBLISH;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public List<String> mo9297b() {
            return this.f8189b;
        }

        /* renamed from: a */
        public void mo9294a(C2609d dVar) {
            this.f8191d = dVar;
        }

        /* renamed from: c */
        public C2609d mo9299c() {
            return this.f8191d;
        }

        /* renamed from: d */
        public String mo9300d() {
            return this.f8192e;
        }

        /* renamed from: a */
        public void mo9295a(String str) {
            this.f8192e = str;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$b */
    protected class C2638b implements OnClickListener {
        protected C2638b() {
        }

        public void onClick(View view) {
            LoginButton.this.mo8890a(view);
            AccessToken a = AccessToken.m6161a();
            if (AccessToken.m6168b()) {
                mo9301a(LoginButton.this.getContext());
            } else {
                mo9302b();
            }
            C2436g a2 = C2436g.m9318a(LoginButton.this.getContext());
            Bundle bundle = new Bundle();
            bundle.putInt("logging_in", a != null ? 0 : 1);
            bundle.putInt("access_token_expired", AccessToken.m6168b() ? 1 : 0);
            a2.mo8855a(LoginButton.this.f8174f, (Double) null, bundle);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo9302b() {
            C2614g a = mo9264a();
            if (C2564v.PUBLISH.equals(LoginButton.this.f8173e.f8190c)) {
                if (LoginButton.this.getFragment() != null) {
                    a.mo9255b(LoginButton.this.getFragment(), (Collection<String>) LoginButton.this.f8173e.f8189b);
                } else if (LoginButton.this.getNativeFragment() != null) {
                    a.mo9254b(LoginButton.this.getNativeFragment(), (Collection<String>) LoginButton.this.f8173e.f8189b);
                } else {
                    a.mo9253b(LoginButton.this.getActivity(), (Collection<String>) LoginButton.this.f8173e.f8189b);
                }
            } else if (LoginButton.this.getFragment() != null) {
                a.mo9249a(LoginButton.this.getFragment(), (Collection<String>) LoginButton.this.f8173e.f8189b);
            } else if (LoginButton.this.getNativeFragment() != null) {
                a.mo9248a(LoginButton.this.getNativeFragment(), (Collection<String>) LoginButton.this.f8173e.f8189b);
            } else {
                a.mo9247a(LoginButton.this.getActivity(), (Collection<String>) LoginButton.this.f8173e.f8189b);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9301a(Context context) {
            String str;
            final C2614g a = mo9264a();
            if (LoginButton.this.f8170b) {
                String string = LoginButton.this.getResources().getString(C2627e.com_facebook_loginview_log_out_action);
                String string2 = LoginButton.this.getResources().getString(C2627e.com_facebook_loginview_cancel_action);
                Profile a2 = Profile.m6288a();
                if (a2 == null || a2.mo6716c() == null) {
                    str = LoginButton.this.getResources().getString(C2627e.com_facebook_loginview_logged_in_using_facebook);
                } else {
                    str = String.format(LoginButton.this.getResources().getString(C2627e.com_facebook_loginview_logged_in_as), new Object[]{a2.mo6716c()});
                }
                Builder builder = new Builder(context);
                builder.setMessage(str).setCancelable(true).setPositiveButton(string, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        a.mo9256d();
                    }
                }).setNegativeButton(string2, null);
                builder.create().show();
                return;
            }
            a.mo9256d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C2614g mo9264a() {
            C2614g c = C2614g.m10027c();
            c.mo9244a(LoginButton.this.getDefaultAudience());
            c.mo9245a(LoginButton.this.getLoginBehavior());
            c.mo9246a(LoginButton.this.getAuthType());
            return c;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$c */
    public enum C2640c {
        AUTOMATIC(C1286Ad.ORIENTATION_AUTO, 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        

        /* renamed from: d */
        public static C2640c f8199d;

        /* renamed from: e */
        private String f8201e;

        /* renamed from: f */
        private int f8202f;

        static {
            f8199d = AUTOMATIC;
        }

        /* renamed from: a */
        public static C2640c m10090a(int i) {
            C2640c[] values;
            for (C2640c cVar : values()) {
                if (cVar.mo9305a() == i) {
                    return cVar;
                }
            }
            return null;
        }

        private C2640c(String str, int i) {
            this.f8201e = str;
            this.f8202f = i;
        }

        public String toString() {
            return this.f8201e;
        }

        /* renamed from: a */
        public int mo9305a() {
            return this.f8202f;
        }
    }

    public LoginButton(Context context) {
        super(context, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public void setDefaultAudience(C2606a aVar) {
        this.f8173e.mo9293a(aVar);
    }

    public C2606a getDefaultAudience() {
        return this.f8173e.mo9292a();
    }

    public void setReadPermissions(List<String> list) {
        this.f8173e.mo9296a(list);
    }

    public void setReadPermissions(String... strArr) {
        this.f8173e.mo9296a(Arrays.asList(strArr));
    }

    public void setPublishPermissions(List<String> list) {
        this.f8173e.mo9298b(list);
    }

    public void setPublishPermissions(String... strArr) {
        this.f8173e.mo9298b(Arrays.asList(strArr));
    }

    public void setLoginBehavior(C2609d dVar) {
        this.f8173e.mo9294a(dVar);
    }

    public C2609d getLoginBehavior() {
        return this.f8173e.mo9299c();
    }

    public String getAuthType() {
        return this.f8173e.mo9300d();
    }

    public void setAuthType(String str) {
        this.f8173e.mo9295a(str);
    }

    public void setToolTipStyle(C2648b bVar) {
        this.f8176h = bVar;
    }

    public void setToolTipMode(C2640c cVar) {
        this.f8177i = cVar;
    }

    public C2640c getToolTipMode() {
        return this.f8177i;
    }

    public void setToolTipDisplayTime(long j) {
        this.f8178j = j;
    }

    public long getToolTipDisplayTime() {
        return this.f8178j;
    }

    /* renamed from: a */
    public void mo9265a() {
        if (this.f8179k != null) {
            this.f8179k.mo9325b();
            this.f8179k = null;
        }
    }

    /* renamed from: a */
    public void mo9266a(C2468e eVar, C2473h<C2621h> hVar) {
        getLoginManager().mo9250a(eVar, hVar);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8180l != null && !this.f8180l.mo8881c()) {
            this.f8180l.mo8878a();
            m10067c();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f8175g && !isInEditMode()) {
            this.f8175g = true;
            m10061b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10058a(C2527k kVar) {
        if (kVar != null && kVar.mo8997c() && getVisibility() == 0) {
            m10064b(kVar.mo8996b());
        }
    }

    /* renamed from: b */
    private void m10064b(String str) {
        this.f8179k = new C2643a(str, this);
        this.f8179k.mo9324a(this.f8176h);
        this.f8179k.mo9323a(this.f8178j);
        this.f8179k.mo9322a();
    }

    /* renamed from: b */
    private void m10061b() {
        switch (this.f8177i) {
            case AUTOMATIC:
                final String a = C2479ad.m9426a(getContext());
                C2649m.m10131d().execute(new Runnable() {
                    public void run() {
                        final C2527k a = C2529l.m9634a(a, false);
                        LoginButton.this.getActivity().runOnUiThread(new Runnable() {
                            public void run() {
                                LoginButton.this.m10058a(a);
                            }
                        });
                    }
                });
                return;
            case DISPLAY_ALWAYS:
                m10064b(getResources().getString(C2627e.com_facebook_tooltip_default));
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m10067c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8180l != null) {
            this.f8180l.mo8880b();
        }
        mo9265a();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            mo9265a();
        }
    }

    /* access modifiers changed from: 0000 */
    public List<String> getPermissions() {
        return this.f8173e.mo9297b();
    }

    /* access modifiers changed from: 0000 */
    public void setProperties(C2637a aVar) {
        this.f8173e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8889a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo8889a(context, attributeSet, i, i2);
        setInternalOnClickListener(getNewLoginClickListener());
        m10062b(context, attributeSet, i, i2);
        if (isInEditMode()) {
            setBackgroundColor(getResources().getColor(C2455a.com_facebook_blue));
            this.f8171c = "Continue with Facebook";
        } else {
            this.f8180l = new C2463d() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo8879a(AccessToken accessToken, AccessToken accessToken2) {
                    LoginButton.this.m10067c();
                }
            };
        }
        m10067c();
        setCompoundDrawablesWithIntrinsicBounds(C0740a.m3008b(getContext(), C2624b.com_facebook_button_login_logo), null, null, null);
    }

    /* access modifiers changed from: protected */
    public C2638b getNewLoginClickListener() {
        return new C2638b();
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return C2628f.com_facebook_loginview_default_style;
    }

    /* renamed from: b */
    private void m10062b(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f8177i = C2640c.f8199d;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2629g.com_facebook_login_view, i, i2);
        try {
            this.f8170b = obtainStyledAttributes.getBoolean(C2629g.com_facebook_login_view_com_facebook_confirm_logout, true);
            this.f8171c = obtainStyledAttributes.getString(C2629g.com_facebook_login_view_com_facebook_login_text);
            this.f8172d = obtainStyledAttributes.getString(C2629g.com_facebook_login_view_com_facebook_logout_text);
            this.f8177i = C2640c.m10090a(obtainStyledAttributes.getInt(C2629g.com_facebook_login_view_com_facebook_tooltip_mode, C2640c.f8199d.mo9305a()));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        FontMetrics fontMetrics = getPaint().getFontMetrics();
        int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
        Resources resources = getResources();
        String str = this.f8171c;
        if (str == null) {
            str = resources.getString(C2627e.com_facebook_loginview_log_in_button_continue);
            int c = m10065c(str);
            if (resolveSize(c, i) < c) {
                str = resources.getString(C2627e.com_facebook_loginview_log_in_button);
            }
        }
        int c2 = m10065c(str);
        String str2 = this.f8172d;
        if (str2 == null) {
            str2 = resources.getString(C2627e.com_facebook_loginview_log_out_button);
        }
        setMeasuredDimension(resolveSize(Math.max(c2, m10065c(str2)), i), compoundPaddingTop);
    }

    /* renamed from: c */
    private int m10065c(String str) {
        return getCompoundPaddingLeft() + getCompoundDrawablePadding() + mo8888a(str) + getCompoundPaddingRight();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10067c() {
        String str;
        Resources resources = getResources();
        if (!isInEditMode() && AccessToken.m6168b()) {
            if (this.f8172d != null) {
                str = this.f8172d;
            } else {
                str = resources.getString(C2627e.com_facebook_loginview_log_out_button);
            }
            setText(str);
        } else if (this.f8171c != null) {
            setText(this.f8171c);
        } else {
            String string = resources.getString(C2627e.com_facebook_loginview_log_in_button_continue);
            int width = getWidth();
            if (width != 0 && m10065c(string) > width) {
                string = resources.getString(C2627e.com_facebook_loginview_log_in_button);
            }
            setText(string);
        }
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        return C2514b.Login.mo8989a();
    }

    /* access modifiers changed from: 0000 */
    public C2614g getLoginManager() {
        if (this.f8181m == null) {
            this.f8181m = C2614g.m10027c();
        }
        return this.f8181m;
    }

    /* access modifiers changed from: 0000 */
    public void setLoginManager(C2614g gVar) {
        this.f8181m = gVar;
    }
}
