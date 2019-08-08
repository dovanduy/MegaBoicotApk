package com.facebook.share.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.p017v4.app.Fragment;
import android.support.p017v4.content.C0362f;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C2579j;
import com.facebook.common.C2454a.C2455a;
import com.facebook.common.C2454a.C2456b;
import com.facebook.common.C2454a.C2462h;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2546n;
import com.facebook.internal.C2566x;
import com.facebook.share.internal.C2670a;
import com.facebook.share.internal.C2670a.C2688c;
import com.facebook.share.internal.C2701b;
import com.facebook.share.internal.C2701b.C2703a;
import com.facebook.share.internal.C2704c;

@Deprecated
public class LikeView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f8499a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2753e f8500b;

    /* renamed from: c */
    private LinearLayout f8501c;

    /* renamed from: d */
    private C2704c f8502d;

    /* renamed from: e */
    private C2701b f8503e;

    /* renamed from: f */
    private TextView f8504f;

    /* renamed from: g */
    private C2670a f8505g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2754f f8506h;

    /* renamed from: i */
    private BroadcastReceiver f8507i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C2751c f8508j;

    /* renamed from: k */
    private C2755g f8509k = C2755g.f8546d;

    /* renamed from: l */
    private C2750b f8510l = C2750b.f8529d;

    /* renamed from: m */
    private C2749a f8511m = C2749a.f8522d;

    /* renamed from: n */
    private int f8512n = -1;

    /* renamed from: o */
    private int f8513o;

    /* renamed from: p */
    private int f8514p;

    /* renamed from: q */
    private C2546n f8515q;

    /* renamed from: r */
    private boolean f8516r = true;

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$a */
    public enum C2749a {
        BOTTOM("bottom", 0),
        INLINE("inline", 1),
        TOP("top", 2);
        

        /* renamed from: d */
        static C2749a f8522d;

        /* renamed from: e */
        private String f8524e;

        /* renamed from: f */
        private int f8525f;

        static {
            f8522d = BOTTOM;
        }

        /* renamed from: a */
        static C2749a m10484a(int i) {
            C2749a[] values;
            for (C2749a aVar : values()) {
                if (aVar.m10482a() == i) {
                    return aVar;
                }
            }
            return null;
        }

        private C2749a(String str, int i) {
            this.f8524e = str;
            this.f8525f = i;
        }

        public String toString() {
            return this.f8524e;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int m10482a() {
            return this.f8525f;
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$b */
    public enum C2750b {
        CENTER(TtmlNode.CENTER, 0),
        LEFT(TtmlNode.LEFT, 1),
        RIGHT(TtmlNode.RIGHT, 2);
        

        /* renamed from: d */
        static C2750b f8529d;

        /* renamed from: e */
        private String f8531e;

        /* renamed from: f */
        private int f8532f;

        static {
            f8529d = CENTER;
        }

        /* renamed from: a */
        static C2750b m10487a(int i) {
            C2750b[] values;
            for (C2750b bVar : values()) {
                if (bVar.m10485a() == i) {
                    return bVar;
                }
            }
            return null;
        }

        private C2750b(String str, int i) {
            this.f8531e = str;
            this.f8532f = i;
        }

        public String toString() {
            return this.f8531e;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int m10485a() {
            return this.f8532f;
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$c */
    private class C2751c implements C2688c {

        /* renamed from: b */
        private boolean f8534b;

        private C2751c() {
        }

        /* renamed from: a */
        public void mo9589a() {
            this.f8534b = true;
        }

        /* renamed from: a */
        public void mo9407a(C2670a aVar, C2579j jVar) {
            if (!this.f8534b) {
                if (aVar != null) {
                    if (!aVar.mo9406e()) {
                        jVar = new C2579j("Cannot use LikeView. The device may not be supported.");
                    }
                    LikeView.this.m10465a(aVar);
                    LikeView.this.m10473c();
                }
                if (!(jVar == null || LikeView.this.f8506h == null)) {
                    LikeView.this.f8506h.mo9593a(jVar);
                }
                LikeView.this.f8508j = null;
            }
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$d */
    private class C2752d extends BroadcastReceiver {
        private C2752d() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            boolean z = true;
            if (extras != null) {
                String string = extras.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
                if (!C2479ad.m9456a(string) && !C2479ad.m9455a(LikeView.this.f8499a, string)) {
                    z = false;
                }
            }
            if (z) {
                if ("com.facebook.sdk.LikeActionController.UPDATED".equals(action)) {
                    LikeView.this.m10473c();
                } else if ("com.facebook.sdk.LikeActionController.DID_ERROR".equals(action)) {
                    if (LikeView.this.f8506h != null) {
                        LikeView.this.f8506h.mo9593a(C2566x.m9746a(extras));
                    }
                } else if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(action)) {
                    LikeView.this.m10472b(LikeView.this.f8499a, LikeView.this.f8500b);
                    LikeView.this.m10473c();
                }
            }
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$e */
    public enum C2753e {
        UNKNOWN("unknown", 0),
        OPEN_GRAPH("open_graph", 1),
        PAGE("page", 2);
        

        /* renamed from: d */
        public static C2753e f8539d;

        /* renamed from: e */
        private String f8541e;

        /* renamed from: f */
        private int f8542f;

        static {
            f8539d = UNKNOWN;
        }

        /* renamed from: a */
        public static C2753e m10490a(int i) {
            C2753e[] values;
            for (C2753e eVar : values()) {
                if (eVar.mo9591a() == i) {
                    return eVar;
                }
            }
            return null;
        }

        private C2753e(String str, int i) {
            this.f8541e = str;
            this.f8542f = i;
        }

        public String toString() {
            return this.f8541e;
        }

        /* renamed from: a */
        public int mo9591a() {
            return this.f8542f;
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$f */
    public interface C2754f {
        /* renamed from: a */
        void mo9593a(C2579j jVar);
    }

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$g */
    public enum C2755g {
        STANDARD("standard", 0),
        BUTTON("button", 1),
        BOX_COUNT("box_count", 2);
        

        /* renamed from: d */
        static C2755g f8546d;

        /* renamed from: e */
        private String f8548e;

        /* renamed from: f */
        private int f8549f;

        static {
            f8546d = STANDARD;
        }

        /* renamed from: a */
        static C2755g m10495a(int i) {
            C2755g[] values;
            for (C2755g gVar : values()) {
                if (gVar.m10493a() == i) {
                    return gVar;
                }
            }
            return null;
        }

        private C2755g(String str, int i) {
            this.f8548e = str;
            this.f8549f = i;
        }

        public String toString() {
            return this.f8548e;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int m10493a() {
            return this.f8549f;
        }
    }

    @Deprecated
    public LikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10464a(attributeSet);
        m10463a(context);
    }

    @Deprecated
    /* renamed from: a */
    public void mo9575a(String str, C2753e eVar) {
        String a = C2479ad.m9428a(str, (String) null);
        if (eVar == null) {
            eVar = C2753e.f8539d;
        }
        if (!C2479ad.m9455a(a, this.f8499a) || eVar != this.f8500b) {
            m10472b(a, eVar);
            m10473c();
        }
    }

    @Deprecated
    public void setLikeViewStyle(C2755g gVar) {
        if (gVar == null) {
            gVar = C2755g.f8546d;
        }
        if (this.f8509k != gVar) {
            this.f8509k = gVar;
            m10477d();
        }
    }

    @Deprecated
    public void setAuxiliaryViewPosition(C2749a aVar) {
        if (aVar == null) {
            aVar = C2749a.f8522d;
        }
        if (this.f8511m != aVar) {
            this.f8511m = aVar;
            m10477d();
        }
    }

    @Deprecated
    public void setHorizontalAlignment(C2750b bVar) {
        if (bVar == null) {
            bVar = C2750b.f8529d;
        }
        if (this.f8510l != bVar) {
            this.f8510l = bVar;
            m10477d();
        }
    }

    @Deprecated
    public void setForegroundColor(int i) {
        if (this.f8512n != i) {
            this.f8504f.setTextColor(i);
        }
    }

    @Deprecated
    public void setOnErrorListener(C2754f fVar) {
        this.f8506h = fVar;
    }

    @Deprecated
    public C2754f getOnErrorListener() {
        return this.f8506h;
    }

    @Deprecated
    public void setFragment(Fragment fragment) {
        this.f8515q = new C2546n(fragment);
    }

    @Deprecated
    public void setFragment(android.app.Fragment fragment) {
        this.f8515q = new C2546n(fragment);
    }

    @Deprecated
    public void setEnabled(boolean z) {
        this.f8516r = true;
        m10473c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo9575a((String) null, C2753e.UNKNOWN);
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void m10464a(AttributeSet attributeSet) {
        if (attributeSet != null && getContext() != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2462h.com_facebook_like_view);
            if (obtainStyledAttributes != null) {
                this.f8499a = C2479ad.m9428a(obtainStyledAttributes.getString(C2462h.com_facebook_like_view_com_facebook_object_id), (String) null);
                this.f8500b = C2753e.m10490a(obtainStyledAttributes.getInt(C2462h.com_facebook_like_view_com_facebook_object_type, C2753e.f8539d.mo9591a()));
                this.f8509k = C2755g.m10495a(obtainStyledAttributes.getInt(C2462h.com_facebook_like_view_com_facebook_style, C2755g.f8546d.m10493a()));
                if (this.f8509k == null) {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
                }
                this.f8511m = C2749a.m10484a(obtainStyledAttributes.getInt(C2462h.com_facebook_like_view_com_facebook_auxiliary_view_position, C2749a.f8522d.m10482a()));
                if (this.f8511m == null) {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
                }
                this.f8510l = C2750b.m10487a(obtainStyledAttributes.getInt(C2462h.com_facebook_like_view_com_facebook_horizontal_alignment, C2750b.f8529d.m10485a()));
                if (this.f8510l == null) {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
                }
                this.f8512n = obtainStyledAttributes.getColor(C2462h.com_facebook_like_view_com_facebook_foreground_color, -1);
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: a */
    private void m10463a(Context context) {
        this.f8513o = getResources().getDimensionPixelSize(C2456b.com_facebook_likeview_edge_padding);
        this.f8514p = getResources().getDimensionPixelSize(C2456b.com_facebook_likeview_internal_padding);
        if (this.f8512n == -1) {
            this.f8512n = getResources().getColor(C2455a.com_facebook_likeview_text_color);
        }
        setBackgroundColor(0);
        this.f8501c = new LinearLayout(context);
        this.f8501c.setLayoutParams(new LayoutParams(-2, -2));
        m10471b(context);
        m10474c(context);
        m10478d(context);
        this.f8501c.addView(this.f8502d);
        this.f8501c.addView(this.f8504f);
        this.f8501c.addView(this.f8503e);
        addView(this.f8501c);
        m10472b(this.f8499a, this.f8500b);
        m10473c();
    }

    /* renamed from: b */
    private void m10471b(Context context) {
        this.f8502d = new C2704c(context, this.f8505g != null && this.f8505g.mo9405d());
        this.f8502d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                LikeView.this.m10462a();
            }
        });
        this.f8502d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    /* renamed from: c */
    private void m10474c(Context context) {
        this.f8504f = new TextView(context);
        this.f8504f.setTextSize(0, getResources().getDimension(C2456b.com_facebook_likeview_text_size));
        this.f8504f.setMaxLines(2);
        this.f8504f.setTextColor(this.f8512n);
        this.f8504f.setGravity(17);
        this.f8504f.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    }

    /* renamed from: d */
    private void m10478d(Context context) {
        this.f8503e = new C2701b(context);
        this.f8503e.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10462a() {
        if (this.f8505g != null) {
            Activity activity = null;
            if (this.f8515q == null) {
                activity = getActivity();
            }
            this.f8505g.mo9402a(activity, this.f8515q, getAnalyticsParameters());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.app.Activity getActivity() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x0018
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L_0x0018:
            com.facebook.j r0 = new com.facebook.j
            java.lang.String r1 = "Unable to get Activity."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.LikeView.getActivity():android.app.Activity");
    }

    private Bundle getAnalyticsParameters() {
        Bundle bundle = new Bundle();
        bundle.putString(TtmlNode.TAG_STYLE, this.f8509k.toString());
        bundle.putString("auxiliary_position", this.f8511m.toString());
        bundle.putString("horizontal_alignment", this.f8510l.toString());
        bundle.putString("object_id", C2479ad.m9428a(this.f8499a, ""));
        bundle.putString("object_type", this.f8500b.toString());
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10472b(String str, C2753e eVar) {
        m10470b();
        this.f8499a = str;
        this.f8500b = eVar;
        if (!C2479ad.m9456a(str)) {
            this.f8508j = new C2751c();
            if (!isInEditMode()) {
                C2670a.m10223a(str, eVar, (C2688c) this.f8508j);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10465a(C2670a aVar) {
        this.f8505g = aVar;
        this.f8507i = new C2752d();
        C0362f a = C0362f.m1362a(getContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        a.mo1251a(this.f8507i, intentFilter);
    }

    /* renamed from: b */
    private void m10470b() {
        if (this.f8507i != null) {
            C0362f.m1362a(getContext()).mo1250a(this.f8507i);
            this.f8507i = null;
        }
        if (this.f8508j != null) {
            this.f8508j.mo9589a();
            this.f8508j = null;
        }
        this.f8505g = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10473c() {
        boolean z = !this.f8516r;
        if (this.f8505g == null) {
            this.f8502d.setSelected(false);
            this.f8504f.setText(null);
            this.f8503e.setText(null);
        } else {
            this.f8502d.setSelected(this.f8505g.mo9405d());
            this.f8504f.setText(this.f8505g.mo9404c());
            this.f8503e.setText(this.f8505g.mo9403b());
            z &= this.f8505g.mo9406e();
        }
        super.setEnabled(z);
        this.f8502d.setEnabled(z);
        m10477d();
    }

    /* renamed from: d */
    private void m10477d() {
        View view;
        LayoutParams layoutParams = (LayoutParams) this.f8501c.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f8502d.getLayoutParams();
        int i = this.f8510l == C2750b.LEFT ? 3 : this.f8510l == C2750b.CENTER ? 1 : 5;
        layoutParams.gravity = i | 48;
        layoutParams2.gravity = i;
        this.f8504f.setVisibility(8);
        this.f8503e.setVisibility(8);
        if (this.f8509k == C2755g.STANDARD && this.f8505g != null && !C2479ad.m9456a(this.f8505g.mo9404c())) {
            view = this.f8504f;
        } else if (this.f8509k == C2755g.BOX_COUNT && this.f8505g != null && !C2479ad.m9456a(this.f8505g.mo9403b())) {
            m10480e();
            view = this.f8503e;
        } else {
            return;
        }
        int i2 = 0;
        view.setVisibility(0);
        ((LinearLayout.LayoutParams) view.getLayoutParams()).gravity = i;
        LinearLayout linearLayout = this.f8501c;
        if (this.f8511m != C2749a.INLINE) {
            i2 = 1;
        }
        linearLayout.setOrientation(i2);
        if (this.f8511m == C2749a.TOP || (this.f8511m == C2749a.INLINE && this.f8510l == C2750b.RIGHT)) {
            this.f8501c.removeView(this.f8502d);
            this.f8501c.addView(this.f8502d);
        } else {
            this.f8501c.removeView(view);
            this.f8501c.addView(view);
        }
        switch (this.f8511m) {
            case TOP:
                view.setPadding(this.f8513o, this.f8513o, this.f8513o, this.f8514p);
                break;
            case BOTTOM:
                view.setPadding(this.f8513o, this.f8514p, this.f8513o, this.f8513o);
                break;
            case INLINE:
                if (this.f8510l != C2750b.RIGHT) {
                    view.setPadding(this.f8514p, this.f8513o, this.f8513o, this.f8513o);
                    break;
                } else {
                    view.setPadding(this.f8513o, this.f8513o, this.f8514p, this.f8513o);
                    break;
                }
        }
    }

    /* renamed from: e */
    private void m10480e() {
        switch (this.f8511m) {
            case TOP:
                this.f8503e.setCaretPosition(C2703a.BOTTOM);
                return;
            case BOTTOM:
                this.f8503e.setCaretPosition(C2703a.TOP);
                return;
            case INLINE:
                this.f8503e.setCaretPosition(this.f8510l == C2750b.RIGHT ? C2703a.RIGHT : C2703a.LEFT);
                return;
            default:
                return;
        }
    }
}
