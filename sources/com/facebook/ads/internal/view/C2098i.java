package com.facebook.ads.internal.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p017v4.graphics.C0401a;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnDismissListener;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1602m;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;
import com.facebook.ads.internal.p115w.p120e.C2361g;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.facebook.ads.internal.view.p105e.C2057c;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2147o;
import com.facebook.ads.internal.view.p110i.p112b.C2148p;

/* renamed from: com.facebook.ads.internal.view.i */
public class C2098i extends LinearLayout implements C2117b {

    /* renamed from: a */
    public static final int f6694a = ((int) (56.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final float f6695d = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: e */
    private static final int f6696e = ((int) (40.0f * f6695d));

    /* renamed from: f */
    private static final int f6697f = ((int) (44.0f * f6695d));

    /* renamed from: g */
    private static final int f6698g = ((int) (10.0f * f6695d));

    /* renamed from: h */
    private static final int f6699h = ((int) (16.0f * f6695d));

    /* renamed from: i */
    private static final int f6700i = (f6699h - f6698g);

    /* renamed from: j */
    private static final int f6701j = ((2 * f6699h) - f6698g);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2148p f6702b = new C2148p() {
        /* renamed from: a */
        public void mo6895a(C2147o oVar) {
            if (C2098i.this.f6714u != null && C2098i.this.f6715v != 0 && C2098i.this.f6708o.isShown()) {
                float currentPositionInMillis = ((float) C2098i.this.f6714u.getCurrentPositionInMillis()) / Math.min(((float) C2098i.this.f6715v) * 1000.0f, (float) C2098i.this.f6714u.getDuration());
                C2098i.this.setProgress(100.0f * currentPositionInMillis);
                if (currentPositionInMillis >= 1.0f) {
                    C2098i.this.mo8357a(true);
                    C2098i.this.f6714u.getEventBus().mo7628b((T[]) new C1779f[]{C2098i.this.f6702b, C2098i.this.f6703c});
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2136d f6703c = new C2136d() {
        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            if (C2098i.this.f6714u != null && C2098i.this.f6715v != 0 && C2098i.this.f6708o.isShown() && !C2098i.this.f6717x) {
                C2098i.this.mo8357a(true);
                C2098i.this.f6714u.getEventBus().mo7628b((T[]) new C1779f[]{C2098i.this.f6702b, C2098i.this.f6703c});
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1911a f6704k;

    /* renamed from: l */
    private final ImageView f6705l;

    /* renamed from: m */
    private final FrameLayout f6706m;

    /* renamed from: n */
    private final ImageView f6707n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final CircularProgressView f6708o;

    /* renamed from: p */
    private final C2057c f6709p;

    /* renamed from: q */
    private final RelativeLayout f6710q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final PopupMenu f6711r;

    /* renamed from: s */
    private ImageView f6712s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C2109b f6713t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C2110a f6714u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f6715v = 0;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f6716w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f6717x = false;

    /* renamed from: y */
    private OnDismissListener f6718y;

    /* renamed from: com.facebook.ads.internal.view.i$a */
    public enum C2108a {
        CROSS,
        ARROWS,
        DOWN_ARROW
    }

    /* renamed from: com.facebook.ads.internal.view.i$b */
    public interface C2109b {
        /* renamed from: a */
        void mo8207a();
    }

    public C2098i(Context context, C1911a aVar, C2108a aVar2) {
        super(context);
        this.f6704k = aVar;
        setGravity(16);
        if (VERSION.SDK_INT >= 14) {
            this.f6718y = new OnDismissListener() {
                public void onDismiss(PopupMenu popupMenu) {
                    C2098i.this.f6716w = false;
                }
            };
        }
        this.f6707n = new ImageView(context);
        this.f6707n.setPadding(f6698g, f6698g, f6698g, f6698g);
        this.f6707n.setScaleType(ScaleType.FIT_CENTER);
        this.f6707n.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C2098i.this.f6713t != null && C2098i.this.f6717x) {
                    C2098i.this.f6713t.mo8207a();
                }
            }
        });
        setCloseButtonStyle(aVar2);
        this.f6708o = new CircularProgressView(context);
        this.f6708o.setPadding(f6698g, f6698g, f6698g, f6698g);
        this.f6708o.setProgress(0.0f);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(f6700i, f6700i, f6701j, f6700i);
        LayoutParams layoutParams2 = new LayoutParams(f6697f, f6697f);
        this.f6706m = new FrameLayout(context);
        this.f6706m.setLayoutTransition(new LayoutTransition());
        this.f6706m.addView(this.f6707n, layoutParams2);
        this.f6706m.addView(this.f6708o, layoutParams2);
        addView(this.f6706m, layoutParams);
        this.f6710q = new RelativeLayout(context);
        LayoutParams layoutParams3 = new LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        this.f6709p = new C2057c(context);
        LayoutParams layoutParams4 = new LayoutParams(-2, -2);
        layoutParams4.gravity = 17;
        this.f6709p.setLayoutParams(layoutParams4);
        this.f6710q.addView(this.f6709p);
        addView(this.f6710q, layoutParams3);
        this.f6705l = new ImageView(context);
        this.f6705l.setPadding(f6698g, f6698g, f6698g, f6698g);
        this.f6705l.setScaleType(ScaleType.FIT_CENTER);
        this.f6705l.setImageBitmap(C2348c.m9100a(C2347b.AD_CHOICES_ICON));
        this.f6705l.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C2098i.this.f6711r.show();
                C2098i.this.f6716w = true;
            }
        });
        this.f6711r = new PopupMenu(context, this.f6705l);
        this.f6711r.getMenu().add("Ad Choices");
        LayoutParams layoutParams5 = new LayoutParams(f6696e, f6696e);
        layoutParams5.setMargins(0, f6699h / 2, f6699h / 2, f6699h / 2);
        addView(this.f6705l, layoutParams5);
    }

    /* renamed from: a */
    public void mo8353a(C1597h hVar, boolean z) {
        int a = hVar.mo7170a(z);
        this.f6709p.mo8293a(hVar.mo7177g(z), a);
        this.f6705l.setColorFilter(a);
        if (this.f6712s != null) {
            this.f6712s.setColorFilter(a);
        }
        this.f6707n.setColorFilter(a);
        this.f6708o.mo8124a(C0401a.m1505b(a, 77), a);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            C2342x.m9083a((View) this, (Drawable) gradientDrawable);
            return;
        }
        C2342x.m9082a((View) this, 0);
    }

    /* renamed from: a */
    public void mo8354a(final C1602m mVar, final String str) {
        this.f6712s = new ImageView(getContext());
        this.f6712s.setPadding(f6698g, f6698g, f6698g, f6698g);
        this.f6712s.setScaleType(ScaleType.FIT_CENTER);
        this.f6712s.setImageBitmap(C2348c.m9100a(C2347b.INFO_ICON));
        this.f6712s.setColorFilter(-1);
        addView(this.f6712s, getChildCount() - 1, new LayoutParams(f6696e, f6696e));
        this.f6712s.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C2098i.this.f6704k.mo6797a(str, true, null);
            }
        });
        this.f6705l.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                String m = !TextUtils.isEmpty(C1710a.m7143m(C2098i.this.getContext())) ? C1710a.m7143m(C2098i.this.getContext()) : mVar.mo7202c();
                if (!TextUtils.isEmpty(m)) {
                    C2361g.m9129a(new C2361g(), C2098i.this.getContext(), Uri.parse(m), str);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo8355a(final C1602m mVar, final String str, int i) {
        this.f6715v = i;
        this.f6709p.setPageDetails(mVar);
        this.f6711r.setOnMenuItemClickListener(new OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                C2098i.this.f6716w = false;
                if (!TextUtils.isEmpty(mVar.mo7202c())) {
                    C2361g.m9129a(new C2361g(), C2098i.this.getContext(), Uri.parse(mVar.mo7202c()), str);
                }
                return true;
            }
        });
        if (VERSION.SDK_INT >= 14) {
            this.f6711r.setOnDismissListener(this.f6718y);
        }
        mo8357a(i <= 0);
    }

    /* renamed from: a */
    public void mo8356a(C2110a aVar) {
        this.f6714u = aVar;
        this.f6714u.getEventBus().mo7626a((T[]) new C1779f[]{this.f6702b, this.f6703c});
    }

    /* renamed from: a */
    public void mo8357a(boolean z) {
        this.f6717x = z;
        this.f6706m.setVisibility(0);
        int i = 8;
        this.f6708o.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f6707n;
        if (z) {
            i = 0;
        }
        imageView.setVisibility(i);
        ((LayoutParams) this.f6710q.getLayoutParams()).leftMargin = 0;
    }

    /* renamed from: a */
    public boolean mo8358a() {
        return this.f6717x;
    }

    /* renamed from: b */
    public void mo8359b() {
        this.f6717x = false;
        this.f6706m.setVisibility(8);
        this.f6708o.setVisibility(8);
        this.f6707n.setVisibility(8);
        ((LayoutParams) this.f6710q.getLayoutParams()).leftMargin = f6698g;
    }

    /* renamed from: b */
    public void mo8360b(C2110a aVar) {
        if (this.f6714u != null) {
            this.f6714u.getEventBus().mo7628b((T[]) new C1779f[]{this.f6702b, this.f6703c});
            this.f6714u = null;
        }
    }

    /* renamed from: b */
    public void mo8361b(boolean z) {
        this.f6705l.setVisibility(z ? 0 : 8);
    }

    /* renamed from: c */
    public void mo8362c() {
        C2342x.m9091b(this.f6709p);
    }

    /* renamed from: d */
    public void mo8363d() {
        if (VERSION.SDK_INT >= 14) {
            this.f6711r.setOnDismissListener(null);
        }
        this.f6711r.dismiss();
        if (VERSION.SDK_INT >= 14) {
            this.f6711r.setOnDismissListener(this.f6718y);
        }
    }

    /* renamed from: e */
    public void mo8364e() {
        if (this.f6716w && VERSION.SDK_INT >= 14) {
            this.f6711r.show();
        }
    }

    public void setCloseButtonStyle(C2108a aVar) {
        C2347b bVar;
        if (this.f6707n != null) {
            switch (aVar) {
                case ARROWS:
                    bVar = C2347b.SKIP_ARROW;
                    break;
                case DOWN_ARROW:
                    bVar = C2347b.MINIMIZE_ARROW;
                    break;
                default:
                    bVar = C2347b.CROSS;
                    break;
            }
            this.f6707n.setImageBitmap(C2348c.m9100a(bVar));
        }
    }

    public void setPageDetailsVisibility(int i) {
        this.f6710q.setVisibility(i);
    }

    public void setProgress(float f) {
        this.f6708o.setProgressWithAnimation(f);
    }

    public void setShowPageDetails(boolean z) {
        this.f6710q.removeAllViews();
        if (z) {
            this.f6710q.addView(this.f6709p);
        }
    }

    public void setToolbarListener(C2109b bVar) {
        this.f6713t = bVar;
    }
}
