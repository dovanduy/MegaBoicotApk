package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
public class atp implements atk {

    /* renamed from: a */
    boolean f12199a;

    /* renamed from: b */
    boolean f12200b;

    /* renamed from: c */
    private final Object f12201c = new Object();

    /* renamed from: d */
    private final atm f12202d;

    /* renamed from: e */
    private final Context f12203e;

    /* renamed from: f */
    private final asv f12204f;

    /* renamed from: g */
    private final JSONObject f12205g;

    /* renamed from: h */
    private final C3695bq f12206h;

    /* renamed from: i */
    private final atn f12207i;

    /* renamed from: j */
    private final agw f12208j;

    /* renamed from: k */
    private final zzang f12209k;

    /* renamed from: l */
    private String f12210l;

    /* renamed from: m */
    private C3866hy f12211m;

    /* renamed from: n */
    private WeakReference<View> f12212n = null;

    public atp(Context context, atm atm, C3695bq bqVar, agw agw, JSONObject jSONObject, atn atn, zzang zzang, String str) {
        this.f12203e = context;
        this.f12202d = atm;
        this.f12206h = bqVar;
        this.f12208j = agw;
        this.f12205g = jSONObject;
        this.f12207i = atn;
        this.f12209k = zzang;
        this.f12210l = str;
        this.f12204f = new asv(this.f12206h);
    }

    /* renamed from: a */
    private final int m15274a(int i) {
        aoq.m14615a();
        return C3975lz.m17379b(this.f12203e, i);
    }

    /* renamed from: a */
    private final JSONObject m15275a(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m15274a(rect.right - rect.left));
        jSONObject.put("height", m15274a(rect.bottom - rect.top));
        jSONObject.put("x", m15274a(rect.left));
        jSONObject.put("y", m15274a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONObject m15276a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] f = m15281f(view);
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] f2 = m15281f(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", m15274a(view2.getMeasuredWidth()));
                        jSONObject4.put("height", m15274a(view2.getMeasuredHeight()));
                        jSONObject4.put("x", m15274a(f2[0] - f[0]));
                        jSONObject4.put("y", m15274a(f2[1] - f[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = m15275a(rect);
                        } else {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("width", 0);
                            jSONObject5.put("height", 0);
                            jSONObject5.put("x", m15274a(f2[0] - f[0]));
                            jSONObject5.put("y", m15274a(f2[1] - f[1]));
                            jSONObject5.put("relative_to", "ad_view");
                            jSONObject = jSONObject5;
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", (double) textView.getTextSize());
                            jSONObject3.put(MimeTypes.BASE_TYPE_TEXT, textView.getText());
                        }
                        jSONObject2.put((String) entry.getKey(), jSONObject3);
                    } catch (JSONException unused) {
                        C3900je.m17435e("Unable to get asset views information");
                    }
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m15277a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        C3513t.m12634b("Invalid call from a non-UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f12205g);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f12207i.mo14770k());
            C3025aw.m10919g();
            jSONObject8.put("is_privileged_process", C3915jt.m17197e());
            boolean z = true;
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11918ck)).booleanValue() && this.f12204f.mo14748a() != null && this.f12205g.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", C3025aw.m10924l().mo13694a());
            jSONObject8.put("has_custom_click_handler", this.f12202d.mo12476b(this.f12207i.mo14771l()) != null);
            String str2 = "has_custom_click_handler";
            if (this.f12202d.mo12476b(this.f12207i.mo14771l()) == null) {
                z = false;
            }
            jSONObject7.put(str2, z);
            try {
                JSONObject optJSONObject = this.f12205g.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject8.put("click_signals", this.f12208j.mo14286a().mo12625a(this.f12203e, optJSONObject.optString("click_string"), view));
            } catch (Exception e) {
                C3900je.m17430b("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject8);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.f12210l);
            C3994mr.m17444a(this.f12206h.mo15208b(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e2) {
            C3900je.m17430b("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: a */
    private final boolean m15278a(String str) {
        JSONObject optJSONObject = this.f12205g == null ? null : this.f12205g.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    /* renamed from: a */
    private final boolean m15279a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        C3513t.m12634b("Invalid call from a non-UI thread.");
        if (this.f12199a) {
            return true;
        }
        this.f12199a = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f12205g);
            jSONObject6.put("ads_id", this.f12210l);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            C3994mr.m17444a(this.f12206h.mo15210c(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.f12202d.mo12473a((atk) this);
            this.f12202d.mo14860C();
            mo14847j();
            return true;
        } catch (JSONException e) {
            C3900je.m17430b("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m15280e(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    /* renamed from: f */
    private static int[] m15281f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: g */
    private final JSONObject m15282g(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] f = m15281f(view);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", m15274a(view.getMeasuredWidth()));
            jSONObject3.put("height", m15274a(view.getMeasuredHeight()));
            jSONObject3.put("x", m15274a(f[0]));
            jSONObject3.put("y", m15274a(f[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = m15275a(rect);
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("width", 0);
                jSONObject.put("height", 0);
                jSONObject.put("x", m15274a(f[0]));
                jSONObject.put("y", m15274a(f[1]));
                jSONObject.put("relative_to", "window");
            }
            jSONObject2.put("visible_bounds", jSONObject);
            return jSONObject2;
        } catch (Exception unused) {
            C3900je.m17435e("Unable to get native ad view bounding box");
            return jSONObject2;
        }
    }

    /* renamed from: h */
    private static JSONObject m15283h(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            C3025aw.m10917e();
            jSONObject.put("contained_in_scroll_view", C3909jn.m17161d(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: i */
    private final JSONObject m15284i(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        String str = "can_show_on_lock_screen";
        try {
            C3025aw.m10917e();
            jSONObject.put(str, C3909jn.m17159c(view));
            C3025aw.m10917e();
            jSONObject.put("is_keyguard_locked", C3909jn.m17172j(this.f12203e));
            return jSONObject;
        } catch (JSONException unused) {
            C3900je.m17435e("Unable to get lock screen information");
            return jSONObject;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r1.addRule(11);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo14830a(android.view.View.OnClickListener r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.atn r0 = r6.f12207i
            com.google.android.gms.internal.ads.asu r0 = r0.mo14772m()
            if (r0 != 0) goto L_0x000a
            r7 = 0
            return r7
        L_0x000a:
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            if (r8 != 0) goto L_0x0038
            int r8 = r0.mo14746h()
            r2 = 9
            r3 = 10
            if (r8 == 0) goto L_0x0032
            r4 = 12
            r5 = 11
            switch(r8) {
                case 2: goto L_0x002e;
                case 3: goto L_0x002a;
                default: goto L_0x0023;
            }
        L_0x0023:
            r1.addRule(r3)
        L_0x0026:
            r1.addRule(r5)
            goto L_0x0038
        L_0x002a:
            r1.addRule(r4)
            goto L_0x0035
        L_0x002e:
            r1.addRule(r4)
            goto L_0x0026
        L_0x0032:
            r1.addRule(r3)
        L_0x0035:
            r1.addRule(r2)
        L_0x0038:
            com.google.android.gms.internal.ads.asx r8 = new com.google.android.gms.internal.ads.asx
            android.content.Context r2 = r6.f12203e
            r8.<init>(r2, r0, r1)
            r8.setOnClickListener(r7)
            com.google.android.gms.internal.ads.ark<java.lang.String> r7 = com.google.android.gms.internal.ads.aru.f11912ce
            com.google.android.gms.internal.ads.ars r0 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r7 = r0.mo14695a(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r8.setContentDescription(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.atp.mo14830a(android.view.View$OnClickListener, boolean):android.view.View");
    }

    /* renamed from: a */
    public final void mo14849a(MotionEvent motionEvent) {
        this.f12208j.mo14287a(motionEvent);
    }

    /* renamed from: a */
    public void mo14831a(View view) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11918ck)).booleanValue()) {
            if (!this.f12205g.optBoolean("custom_one_point_five_click_enabled", false)) {
                C3900je.m17435e("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
                return;
            }
            asv asv = this.f12204f;
            if (view != null) {
                view.setOnClickListener(asv);
                view.setClickable(true);
                asv.f12113c = new WeakReference<>(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo14850a(View view, ati ati) {
        if (!mo14866b(view, ati)) {
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            ((FrameLayout) view).removeAllViews();
            if (this.f12207i instanceof ato) {
                ato ato = (ato) this.f12207i;
                if (ato.mo14759b() != null && ato.mo14759b().size() > 0) {
                    Object obj = ato.mo14759b().get(0);
                    auh a = obj instanceof IBinder ? aui.m15356a((IBinder) obj) : null;
                    if (a != null) {
                        try {
                            C3235a a2 = a.mo14753a();
                            if (a2 != null) {
                                Drawable drawable = (Drawable) C3238b.m11574a(a2);
                                ImageView imageView = new ImageView(this.f12203e);
                                imageView.setImageDrawable(drawable);
                                imageView.setScaleType(ScaleType.CENTER_INSIDE);
                                ((FrameLayout) view).addView(imageView, layoutParams);
                            }
                        } catch (RemoteException unused) {
                            C3900je.m17435e("Could not get drawable from image");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14851a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        JSONObject a = m15276a(map, view2);
        JSONObject g = m15282g(view2);
        JSONObject h = m15283h(view2);
        JSONObject i = m15284i(view2);
        JSONObject jSONObject2 = null;
        try {
            JSONObject a2 = C3025aw.m10917e().mo15513a(bundle, (JSONObject) null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", a2);
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e) {
                e = e;
                jSONObject2 = jSONObject3;
                C3900je.m17430b("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                m15277a(view, g, a, h, i, str, jSONObject, null);
            }
        } catch (Exception e2) {
            e = e2;
            C3900je.m17430b("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject2;
            m15277a(view, g, a, h, i, str, jSONObject, null);
        }
        m15277a(view, g, a, h, i, str, jSONObject, null);
    }

    /* renamed from: a */
    public void mo14832a(View view, Map<String, WeakReference<View>> map) {
        m15279a(m15282g(view), m15276a(map, view), m15283h(view), m15284i(view), (JSONObject) null);
    }

    /* renamed from: a */
    public void mo14833a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        String str;
        C3513t.m12634b("Invalid call from a non-UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Entry entry : map.entrySet()) {
                    if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                        mo14851a(view, (String) entry.getKey(), bundle, map, view2);
                        return;
                    }
                }
            }
        }
        if ("6".equals(this.f12207i.mo14770k())) {
            str = "3099";
        } else if ("2".equals(this.f12207i.mo14770k())) {
            str = "2099";
        } else {
            if ("1".equals(this.f12207i.mo14770k())) {
                mo14851a(view, "1099", bundle, map, view2);
            }
            return;
        }
        mo14851a(view, str, bundle, map, view2);
    }

    /* renamed from: a */
    public void mo14834a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11909cb)).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                synchronized (map) {
                    for (Entry value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener(onTouchListener);
                            view2.setClickable(true);
                            view2.setOnClickListener(onClickListener);
                        }
                    }
                }
            }
            if (map2 != null) {
                synchronized (map2) {
                    for (Entry value2 : map2.entrySet()) {
                        View view3 = (View) ((WeakReference) value2.getValue()).get();
                        if (view3 != null) {
                            view3.setOnTouchListener(onTouchListener);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo14836a(awb awb) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11918ck)).booleanValue()) {
            if (!this.f12205g.optBoolean("custom_one_point_five_click_enabled", false)) {
                C3900je.m17435e("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            } else {
                this.f12204f.mo14749a(awb);
            }
        }
    }

    /* renamed from: a */
    public final void mo14865a(Map<String, WeakReference<View>> map) {
        if (this.f12207i.mo14774o() != null) {
            if ("2".equals(this.f12207i.mo14770k())) {
                C3025aw.m10921i().mo15449l().mo15487a(this.f12202d.mo12395D(), this.f12207i.mo14770k(), map.containsKey("2011"));
            } else if ("1".equals(this.f12207i.mo14770k())) {
                C3025aw.m10921i().mo15449l().mo15487a(this.f12202d.mo12395D(), this.f12207i.mo14770k(), map.containsKey("1009"));
            }
        }
    }

    /* renamed from: a */
    public boolean mo14837a() {
        asu m = this.f12207i.mo14772m();
        return m != null && m.mo14747i();
    }

    /* renamed from: a */
    public final boolean mo14852a(Bundle bundle) {
        if (!m15278a("impression_reporting")) {
            C3900je.m17431c("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return m15279a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, C3025aw.m10917e().mo15513a(bundle, (JSONObject) null));
    }

    /* renamed from: b */
    public final void mo14853b(Bundle bundle) {
        if (bundle == null) {
            C3900je.m17429b("Click data is null. No click is reported.");
        } else if (!m15278a("click_reporting")) {
            C3900je.m17431c("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            m15277a(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, C3025aw.m10917e().mo15513a(bundle, (JSONObject) null));
        }
    }

    /* renamed from: b */
    public final void mo14854b(View view) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11835bG)).booleanValue() && this.f12208j != null) {
            ags a = this.f12208j.mo14286a();
            if (a != null) {
                a.mo12629a(view);
            }
        }
    }

    /* renamed from: b */
    public void mo14838b(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11908ca)).booleanValue()) {
            view.setOnTouchListener(null);
            view.setClickable(false);
            view.setOnClickListener(null);
            if (map != null) {
                synchronized (map) {
                    for (Entry value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener(null);
                            view2.setClickable(false);
                            view2.setOnClickListener(null);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo14839b() {
        return this.f12205g != null && this.f12205g.optBoolean("allow_pub_owned_ad_view", false);
    }

    /* renamed from: b */
    public final boolean mo14866b(View view, ati ati) {
        LayoutParams layoutParams = new LayoutParams(-2, -2, 17);
        View o = this.f12207i.mo14774o();
        if (o == null) {
            return false;
        }
        ViewParent parent = o.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(o);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(o, layoutParams);
        this.f12202d.mo12472a(ati);
        return true;
    }

    /* renamed from: c */
    public void mo14840c() {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11918ck)).booleanValue()) {
            if (!this.f12205g.optBoolean("custom_one_point_five_click_enabled", false)) {
                C3900je.m17435e("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            } else {
                this.f12204f.mo14750b();
            }
        }
    }

    /* renamed from: c */
    public final void mo14855c(Bundle bundle) {
        if (bundle == null) {
            C3900je.m17429b("Touch event data is null. No touch event is reported.");
        } else if (!m15278a("touch_reporting")) {
            C3900je.m17431c("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            this.f12208j.mo14286a().mo12627a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        }
    }

    /* renamed from: c */
    public final void mo14856c(View view) {
        this.f12212n = new WeakReference<>(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14857c(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12201c
            monitor-enter(r0)
            boolean r1 = r3.f12199a     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0009:
            boolean r1 = m15280e(r4)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0014
            r3.mo14832a(r4, r5)     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0014:
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.aru.f11917cj     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.mo14695a(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            if (r5 == 0) goto L_0x005c
            monitor-enter(r5)     // Catch:{ all -> 0x005e }
            java.util.Set r1 = r5.entrySet()     // Catch:{ all -> 0x0059 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0059 }
        L_0x0031:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0059 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0059 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0059 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = m15280e(r2)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            r3.mo14832a(r4, r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r4     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.atp.mo14857c(android.view.View, java.util.Map):void");
    }

    /* renamed from: d */
    public void mo14841d() {
        C3513t.m12634b("Invalid call from a non-UI thread.");
        if (!this.f12200b) {
            this.f12200b = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad", this.f12205g);
                jSONObject.put("ads_id", this.f12210l);
                C3994mr.m17444a(this.f12206h.mo15211d(jSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
            } catch (JSONException e) {
                C3987mk.m17430b("", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo14867d(View view) {
        this.f12202d.mo12478b(view);
    }

    /* renamed from: g */
    public C4089qe mo14844g() throws C4100qp {
        if (this.f12205g == null || this.f12205g.optJSONObject("overlay") == null) {
            return null;
        }
        C3025aw.m10918f();
        Context context = this.f12203e;
        zzjn a = zzjn.m18803a(this.f12203e);
        C4089qe a2 = C4096ql.m17760a(context, C4130rs.m17979a(a), a.f14543a, false, false, this.f12208j, this.f12209k, null, null, null, amj.m14431a());
        if (a2 != null) {
            a2.getView().setVisibility(8);
            new atr(a2).mo14869a(this.f12206h);
        }
        return a2;
    }

    /* renamed from: h */
    public void mo14845h() {
        this.f12206h.mo15205a();
    }

    /* renamed from: i */
    public void mo14846i() {
        this.f12202d.mo12463P();
    }

    /* renamed from: j */
    public void mo14847j() {
        this.f12202d.mo12459L();
    }

    /* renamed from: k */
    public void mo14848k() {
        this.f12202d.mo12464Q();
    }

    /* renamed from: l */
    public final View mo14858l() {
        if (this.f12212n != null) {
            return (View) this.f12212n.get();
        }
        return null;
    }

    /* renamed from: m */
    public final Context mo14859m() {
        return this.f12203e;
    }

    /* renamed from: n */
    public final C3866hy mo14868n() {
        if (!C3025aw.m10908B().mo15392c(this.f12203e)) {
            return null;
        }
        if (this.f12211m == null) {
            this.f12211m = new C3866hy(this.f12203e, this.f12202d.mo12395D());
        }
        return this.f12211m;
    }
}
