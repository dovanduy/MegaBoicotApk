package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.login.C2622i.C2624b;
import com.facebook.login.C2622i.C2625c;
import com.facebook.login.C2622i.C2626d;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.login.widget.a */
/* compiled from: ToolTipPopup */
public class C2643a {

    /* renamed from: a */
    private final String f8215a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final WeakReference<View> f8216b;

    /* renamed from: c */
    private final Context f8217c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2647a f8218d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public PopupWindow f8219e;

    /* renamed from: f */
    private C2648b f8220f = C2648b.BLUE;

    /* renamed from: g */
    private long f8221g = 6000;

    /* renamed from: h */
    private final OnScrollChangedListener f8222h = new OnScrollChangedListener() {
        public void onScrollChanged() {
            if (C2643a.this.f8216b.get() != null && C2643a.this.f8219e != null && C2643a.this.f8219e.isShowing()) {
                if (C2643a.this.f8219e.isAboveAnchor()) {
                    C2643a.this.f8218d.mo9330b();
                } else {
                    C2643a.this.f8218d.mo9329a();
                }
            }
        }
    };

    /* renamed from: com.facebook.login.widget.a$a */
    /* compiled from: ToolTipPopup */
    private class C2647a extends FrameLayout {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ImageView f8227b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public ImageView f8228c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public View f8229d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public ImageView f8230e;

        public C2647a(Context context) {
            super(context);
            m10117c();
        }

        /* renamed from: c */
        private void m10117c() {
            LayoutInflater.from(getContext()).inflate(C2626d.com_facebook_tooltip_bubble, this);
            this.f8227b = (ImageView) findViewById(C2625c.com_facebook_tooltip_bubble_view_top_pointer);
            this.f8228c = (ImageView) findViewById(C2625c.com_facebook_tooltip_bubble_view_bottom_pointer);
            this.f8229d = findViewById(C2625c.com_facebook_body_frame);
            this.f8230e = (ImageView) findViewById(C2625c.com_facebook_button_xout);
        }

        /* renamed from: a */
        public void mo9329a() {
            this.f8227b.setVisibility(0);
            this.f8228c.setVisibility(4);
        }

        /* renamed from: b */
        public void mo9330b() {
            this.f8227b.setVisibility(4);
            this.f8228c.setVisibility(0);
        }
    }

    /* renamed from: com.facebook.login.widget.a$b */
    /* compiled from: ToolTipPopup */
    public enum C2648b {
        BLUE,
        BLACK
    }

    public C2643a(String str, View view) {
        this.f8215a = str;
        this.f8216b = new WeakReference<>(view);
        this.f8217c = view.getContext();
    }

    /* renamed from: a */
    public void mo9324a(C2648b bVar) {
        this.f8220f = bVar;
    }

    /* renamed from: a */
    public void mo9322a() {
        if (this.f8216b.get() != null) {
            this.f8218d = new C2647a(this.f8217c);
            ((TextView) this.f8218d.findViewById(C2625c.com_facebook_tooltip_bubble_view_text_body)).setText(this.f8215a);
            if (this.f8220f == C2648b.BLUE) {
                this.f8218d.f8229d.setBackgroundResource(C2624b.com_facebook_tooltip_blue_background);
                this.f8218d.f8228c.setImageResource(C2624b.com_facebook_tooltip_blue_bottomnub);
                this.f8218d.f8227b.setImageResource(C2624b.com_facebook_tooltip_blue_topnub);
                this.f8218d.f8230e.setImageResource(C2624b.com_facebook_tooltip_blue_xout);
            } else {
                this.f8218d.f8229d.setBackgroundResource(C2624b.com_facebook_tooltip_black_background);
                this.f8218d.f8228c.setImageResource(C2624b.com_facebook_tooltip_black_bottomnub);
                this.f8218d.f8227b.setImageResource(C2624b.com_facebook_tooltip_black_topnub);
                this.f8218d.f8230e.setImageResource(C2624b.com_facebook_tooltip_black_xout);
            }
            View decorView = ((Activity) this.f8217c).getWindow().getDecorView();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            m10108d();
            this.f8218d.measure(MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
            this.f8219e = new PopupWindow(this.f8218d, this.f8218d.getMeasuredWidth(), this.f8218d.getMeasuredHeight());
            this.f8219e.showAsDropDown((View) this.f8216b.get());
            m10107c();
            if (this.f8221g > 0) {
                this.f8218d.postDelayed(new Runnable() {
                    public void run() {
                        C2643a.this.mo9325b();
                    }
                }, this.f8221g);
            }
            this.f8219e.setTouchable(true);
            this.f8218d.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C2643a.this.mo9325b();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo9323a(long j) {
        this.f8221g = j;
    }

    /* renamed from: c */
    private void m10107c() {
        if (this.f8219e != null && this.f8219e.isShowing()) {
            if (this.f8219e.isAboveAnchor()) {
                this.f8218d.mo9330b();
            } else {
                this.f8218d.mo9329a();
            }
        }
    }

    /* renamed from: b */
    public void mo9325b() {
        m10109e();
        if (this.f8219e != null) {
            this.f8219e.dismiss();
        }
    }

    /* renamed from: d */
    private void m10108d() {
        m10109e();
        if (this.f8216b.get() != null) {
            ((View) this.f8216b.get()).getViewTreeObserver().addOnScrollChangedListener(this.f8222h);
        }
    }

    /* renamed from: e */
    private void m10109e() {
        if (this.f8216b.get() != null) {
            ((View) this.f8216b.get()).getViewTreeObserver().removeOnScrollChangedListener(this.f8222h);
        }
    }
}
