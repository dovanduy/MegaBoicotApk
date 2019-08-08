package com.startapp.android.publish.inappbrowser;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.common.p193a.C5518g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.startapp.android.publish.inappbrowser.b */
/* compiled from: StartAppSDK */
public class C5495b extends RelativeLayout {

    /* renamed from: p */
    private static final int f17514p = Color.rgb(78, 86, 101);

    /* renamed from: q */
    private static final int f17515q = Color.rgb(148, 155, 166);

    /* renamed from: a */
    private RelativeLayout f17516a;

    /* renamed from: b */
    private ImageView f17517b;

    /* renamed from: c */
    private ImageView f17518c;

    /* renamed from: d */
    private ImageView f17519d;

    /* renamed from: e */
    private ImageView f17520e;

    /* renamed from: f */
    private Bitmap f17521f;

    /* renamed from: g */
    private Bitmap f17522g;

    /* renamed from: h */
    private Bitmap f17523h;

    /* renamed from: i */
    private Bitmap f17524i;

    /* renamed from: j */
    private Bitmap f17525j;

    /* renamed from: k */
    private Bitmap f17526k;

    /* renamed from: l */
    private TextView f17527l;

    /* renamed from: m */
    private TextView f17528m;

    /* renamed from: n */
    private Boolean f17529n = Boolean.valueOf(false);

    /* renamed from: o */
    private Map<String, C5496c> f17530o;

    public C5495b(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo20452a() {
        setDescendantFocusability(262144);
        setBackgroundColor(Color.parseColor("#e9e9e9"));
        setLayoutParams(new LayoutParams(-1, C5306h.m22641a(getContext(), 60)));
        setId(2101);
        this.f17530o = m23447d();
    }

    /* renamed from: d */
    private Map<String, C5496c> m23447d() {
        HashMap hashMap = new HashMap();
        hashMap.put("BACK", new C5496c(this.f17523h, 14, 22, "back_.png"));
        hashMap.put("BACK_DARK", new C5496c(this.f17525j, 14, 22, "back_dark.png"));
        hashMap.put("FORWARD", new C5496c(this.f17524i, 14, 22, "forward_.png"));
        hashMap.put("FORWARD_DARK", new C5496c(this.f17526k, 14, 22, "forward_dark.png"));
        hashMap.put("X", new C5496c(this.f17522g, 23, 23, "x_dark.png"));
        hashMap.put("BROWSER", new C5496c(this.f17521f, 28, 28, "browser_icon_dark.png"));
        return hashMap;
    }

    /* renamed from: b */
    public void mo20454b() {
        Typeface typeface = Typeface.DEFAULT;
        this.f17527l = C5306h.m22646a(getContext(), this.f17527l, typeface, 1, 16.46f, f17514p, 2102);
        this.f17528m = C5306h.m22646a(getContext(), this.f17527l, typeface, 1, 12.12f, f17515q, 2107);
        this.f17527l.setText("Loading...");
        this.f17516a = new RelativeLayout(getContext());
        this.f17516a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f17516a.addView(this.f17527l, C5306h.m22644a(getContext(), new int[]{0, 0, 0, 0}, new int[0]));
        this.f17516a.addView(this.f17528m, C5306h.m22645a(getContext(), new int[]{0, 0, 0, 0}, new int[0], 3, 2102));
        m23448e();
        this.f17517b = C5306h.m22643a(getContext(), this.f17517b, ((C5496c) this.f17530o.get("X")).mo20464d(), 2103);
        this.f17519d = C5306h.m22643a(getContext(), this.f17519d, ((C5496c) this.f17530o.get("BROWSER")).mo20464d(), 2104);
        this.f17520e = C5306h.m22643a(getContext(), this.f17520e, ((C5496c) this.f17530o.get("BACK")).mo20464d(), 2105);
        this.f17518c = C5306h.m22643a(getContext(), this.f17518c, ((C5496c) this.f17530o.get("FORWARD")).mo20464d(), 2106);
        int a = C5306h.m22641a(getContext(), 10);
        this.f17518c.setPadding(a, a, a, a);
        this.f17518c.setEnabled(false);
        this.f17520e.setPadding(a, a, a, a);
        addView(this.f17517b, C5306h.m22644a(getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
        addView(this.f17519d, C5306h.m22645a(getContext(), new int[]{0, 0, 17, 0}, new int[]{15}, 0, 2103));
        addView(this.f17516a, C5306h.m22645a(getContext(), new int[]{16, 6, 16, 0}, new int[]{9}, 0, 2104));
    }

    /* renamed from: e */
    private void m23448e() {
        for (C5496c cVar : this.f17530o.values()) {
            Bitmap a = C5306h.m22642a(getContext(), cVar.mo20463c());
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error getting navigation bar bitmap - ");
                sb.append(cVar.mo20463c());
                sb.append(" from resources ");
                C5518g.m23563a("NavigationBarLayout", 6, sb.toString());
            } else {
                cVar.mo20461a(Bitmap.createScaledBitmap(a, C5306h.m22641a(getContext(), cVar.mo20460a()), C5306h.m22641a(getContext(), cVar.mo20462b()), true));
            }
        }
    }

    /* renamed from: a */
    public void mo20453a(WebView webView) {
        if (this.f17529n.booleanValue()) {
            mo20455b(webView);
        } else if (webView.canGoBack()) {
            m23449f();
            this.f17529n = Boolean.valueOf(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo20455b(WebView webView) {
        if (webView.canGoBack()) {
            this.f17520e.setImageBitmap(((C5496c) this.f17530o.get("BACK_DARK")).mo20464d());
            this.f17520e.setEnabled(true);
        } else {
            this.f17520e.setImageBitmap(((C5496c) this.f17530o.get("BACK")).mo20464d());
            this.f17520e.setEnabled(false);
        }
        if (webView.canGoForward()) {
            this.f17518c.setImageBitmap(((C5496c) this.f17530o.get("FORWARD_DARK")).mo20464d());
            this.f17518c.setEnabled(true);
        } else {
            this.f17518c.setImageBitmap(((C5496c) this.f17530o.get("FORWARD")).mo20464d());
            this.f17518c.setEnabled(false);
        }
        if (webView.getTitle() != null) {
            this.f17527l.setText(webView.getTitle());
        }
    }

    public TextView getUrlTxt() {
        return this.f17528m;
    }

    public TextView getTitleTxt() {
        return this.f17527l;
    }

    public void setButtonsListener(OnClickListener onClickListener) {
        this.f17517b.setOnClickListener(onClickListener);
        this.f17520e.setOnClickListener(onClickListener);
        this.f17518c.setOnClickListener(onClickListener);
        this.f17519d.setOnClickListener(onClickListener);
    }

    /* renamed from: f */
    private void m23449f() {
        this.f17520e.setImageBitmap(((C5496c) this.f17530o.get("BACK_DARK")).mo20464d());
        addView(this.f17520e, C5306h.m22644a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
        addView(this.f17518c, C5306h.m22645a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15}, 1, 2105));
        removeView(this.f17516a);
        this.f17516a.removeView(this.f17528m);
        this.f17516a.removeView(this.f17527l);
        this.f17516a.addView(this.f17527l, C5306h.m22644a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
        this.f17516a.addView(this.f17528m, C5306h.m22645a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}, 3, 2102));
        LayoutParams a = C5306h.m22645a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15}, 1, 2106);
        a.addRule(0, 2104);
        addView(this.f17516a, a);
    }

    /* renamed from: c */
    public void mo20456c() {
        if (VERSION.SDK_INT < 11) {
            ((BitmapDrawable) this.f17517b.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f17519d.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f17520e.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f17518c.getDrawable()).getBitmap().recycle();
        }
        this.f17530o = null;
        this.f17523h = null;
        this.f17525j = null;
        this.f17524i = null;
        this.f17526k = null;
    }
}
