package com.startapp.android.publish.ads.list3d;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appnext.base.p046b.C1245d;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.C5427m;
import com.startapp.android.publish.adsCommon.Utils.C5295a;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adinformation.C5330b;
import com.startapp.android.publish.adsCommon.adinformation.C5330b.C5338b;
import com.startapp.android.publish.adsCommon.adinformation.C5339c;
import com.startapp.android.publish.adsCommon.p180d.C5362a;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5523b;
import com.startapp.common.p193a.C5518g;
import java.util.List;

/* compiled from: StartAppSDK */
public class List3DActivity extends Activity implements C5170g {

    /* renamed from: a */
    String f16543a;

    /* renamed from: b */
    String f16544b;

    /* renamed from: c */
    List<ListItem> f16545c;

    /* renamed from: d */
    private C5161c f16546d;

    /* renamed from: e */
    private ProgressDialog f16547e = null;

    /* renamed from: f */
    private WebView f16548f = null;

    /* renamed from: g */
    private int f16549g;

    /* renamed from: h */
    private C5330b f16550h;

    /* renamed from: i */
    private Long f16551i;

    /* renamed from: j */
    private Long f16552j;

    /* renamed from: k */
    private String f16553k;

    /* renamed from: l */
    private long f16554l = 0;

    /* renamed from: m */
    private long f16555m = 0;

    /* renamed from: n */
    private BroadcastReceiver f16556n = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            List3DActivity.this.finish();
        }
    };

    public void onCreate(Bundle bundle) {
        View view;
        try {
            overridePendingTransition(0, 0);
            super.onCreate(bundle);
            if (getIntent().getBooleanExtra("fullscreen", false)) {
                requestWindowFeature(1);
                getWindow().setFlags(C1245d.f3947iP, C1245d.f3947iP);
            }
            if (bundle == null) {
                C5523b.m23588a((Context) this).mo20506a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
                this.f16551i = (Long) getIntent().getSerializableExtra("lastLoadTime");
                this.f16552j = (Long) getIntent().getSerializableExtra("adCacheTtl");
            } else {
                if (bundle.containsKey("lastLoadTime")) {
                    this.f16551i = (Long) bundle.getSerializable("lastLoadTime");
                }
                if (bundle.containsKey("adCacheTtl")) {
                    this.f16552j = (Long) bundle.getSerializable("adCacheTtl");
                }
            }
            this.f16553k = getIntent().getStringExtra("position");
            this.f16543a = getIntent().getStringExtra("listModelUuid");
            C5523b.m23588a((Context) this).mo20505a(this.f16556n, new IntentFilter("com.startapp.android.CloseAdActivity"));
            this.f16549g = getResources().getConfiguration().orientation;
            C5307i.m22662a((Activity) this, true);
            boolean booleanExtra = getIntent().getBooleanExtra("overlay", false);
            requestWindowFeature(1);
            this.f16544b = getIntent().getStringExtra("adTag");
            int e = C5344b.m22784a().mo19767e();
            int f = C5344b.m22784a().mo19769f();
            this.f16546d = new C5161c(this, null, this.f16544b, this.f16543a);
            this.f16546d.setBackgroundDrawable(new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{e, f}));
            this.f16545c = C5169f.m22203a().mo19078a(this.f16543a).mo19077e();
            if (this.f16545c == null) {
                finish();
                return;
            }
            String str = "";
            if (booleanExtra) {
                C5523b.m23588a((Context) this).mo20505a(this.f16546d.f16617p, new IntentFilter("com.startapp.android.Activity3DGetValues"));
            } else {
                this.f16546d.mo19034a();
                this.f16546d.setHint(true);
                this.f16546d.setFade(true);
                str = "back";
            }
            C5160b bVar = new C5160b(this, this.f16545c, str, this.f16544b, this.f16543a);
            C5169f.m22203a().mo19078a(this.f16543a).mo19070a(this, !booleanExtra);
            this.f16546d.setAdapter(bVar);
            this.f16546d.setDynamics(new SimpleDynamics(0.9f, 0.6f));
            this.f16546d.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    int i2 = i;
                    String b = ((ListItem) List3DActivity.this.f16545c.get(i2)).mo18990b();
                    String e = ((ListItem) List3DActivity.this.f16545c.get(i2)).mo18994e();
                    String f = ((ListItem) List3DActivity.this.f16545c.get(i2)).mo18995f();
                    boolean l = ((ListItem) List3DActivity.this.f16545c.get(i2)).mo19001l();
                    boolean m = ((ListItem) List3DActivity.this.f16545c.get(i2)).mo19002m();
                    String p = ((ListItem) List3DActivity.this.f16545c.get(i2)).mo19005p();
                    String o = ((ListItem) List3DActivity.this.f16545c.get(i2)).mo19004o();
                    Boolean s = ((ListItem) List3DActivity.this.f16545c.get(i2)).mo19008s();
                    C5169f.m22203a().mo19078a(List3DActivity.this.f16543a).mo19072a(((ListItem) List3DActivity.this.f16545c.get(i2)).mo18991c());
                    if (p != null && !TextUtils.isEmpty(p)) {
                        m22119a(p, o, b, e);
                    } else if (!TextUtils.isEmpty(b)) {
                        boolean a = C5349c.m22870a(List3DActivity.this.getApplicationContext(), Placement.INAPP_OFFER_WALL);
                        if (!l || a) {
                            C5349c.m22857a(List3DActivity.this, b, e, List3DActivity.this.mo18974a(), m && !a, false);
                            List3DActivity.this.finish();
                            return;
                        }
                        C5349c.m22860a(List3DActivity.this, b, e, f, List3DActivity.this.mo18974a(), C5344b.m22784a().mo19749A(), C5344b.m22784a().mo19750B(), m, s, false, new Runnable() {
                            public void run() {
                                List3DActivity.this.finish();
                            }
                        });
                    }
                }

                /* renamed from: a */
                private void m22119a(String str, String str2, String str3, String str4) {
                    C5349c.m22866a(str, str2, str3, (Context) List3DActivity.this, new C5363b(List3DActivity.this.f16544b));
                    List3DActivity.this.finish();
                }
            });
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.setContentDescription("StartApp Ad");
            relativeLayout.setId(AdsConstants.STARTAPP_AD_MAIN_LAYOUT_ID);
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            relativeLayout.addView(linearLayout, layoutParams2);
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            relativeLayout2.setBackgroundColor(C5344b.m22784a().mo19771h().intValue());
            linearLayout.addView(relativeLayout2);
            TextView textView = new TextView(this);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            textView.setLayoutParams(layoutParams3);
            textView.setPadding(0, C5306h.m22641a((Context) this, 2), 0, C5306h.m22641a((Context) this, 5));
            textView.setTextColor(C5344b.m22784a().mo19775k().intValue());
            textView.setTextSize((float) C5344b.m22784a().mo19774j().intValue());
            textView.setSingleLine(true);
            textView.setEllipsize(TruncateAt.END);
            textView.setText(C5344b.m22784a().mo19773i());
            textView.setShadowLayer(2.5f, -2.0f, 2.0f, -11513776);
            C5306h.m22649a(textView, C5344b.m22784a().mo19776l());
            relativeLayout2.addView(textView);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(11);
            layoutParams4.addRule(15);
            Bitmap a = C5295a.m22608a(this, "close_button.png");
            if (a != null) {
                view = new ImageButton(this, null, 16973839);
                ((ImageButton) view).setImageBitmap(Bitmap.createScaledBitmap(a, C5306h.m22641a((Context) this, 36), C5306h.m22641a((Context) this, 36), true));
            } else {
                view = new TextView(this);
                ((TextView) view).setText("   x   ");
                ((TextView) view).setTextSize(20.0f);
            }
            view.setLayoutParams(layoutParams4);
            view.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C5349c.m22876b((Context) List3DActivity.this, List3DActivity.this.mo18976b(), List3DActivity.this.mo18974a());
                    List3DActivity.this.finish();
                }
            });
            view.setContentDescription("x");
            view.setId(AdsConstants.LIST_3D_CLOSE_BUTTON_ID);
            relativeLayout2.addView(view);
            View view2 = new View(this);
            view2.setLayoutParams(new LinearLayout.LayoutParams(-1, C5306h.m22641a((Context) this, 2)));
            view2.setBackgroundColor(C5344b.m22784a().mo19777m().intValue());
            linearLayout.addView(view2);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams5.weight = 1.0f;
            this.f16546d.setLayoutParams(layoutParams5);
            linearLayout.addView(this.f16546d);
            LinearLayout linearLayout2 = new LinearLayout(this);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.gravity = 80;
            linearLayout2.setLayoutParams(layoutParams6);
            linearLayout2.setBackgroundColor(C5344b.m22784a().mo19786v().intValue());
            linearLayout2.setGravity(17);
            linearLayout.addView(linearLayout2);
            TextView textView2 = new TextView(this);
            textView2.setTextColor(C5344b.m22784a().mo19787w().intValue());
            textView2.setPadding(0, C5306h.m22641a((Context) this, 2), 0, C5306h.m22641a((Context) this, 3));
            textView2.setText("Powered By ");
            textView2.setTextSize(16.0f);
            linearLayout2.addView(textView2);
            ImageView imageView = new ImageView(this);
            imageView.setImageBitmap(Bitmap.createScaledBitmap(C5295a.m22608a(this, "logo.png"), C5306h.m22641a((Context) this, 56), C5306h.m22641a((Context) this, 12), true));
            linearLayout2.addView(imageView);
            this.f16550h = new C5330b(this, C5338b.LARGE, Placement.INAPP_OFFER_WALL, (C5339c) getIntent().getSerializableExtra("adInfoOverride"));
            this.f16550h.mo19713a(relativeLayout);
            setContentView(relativeLayout, layoutParams);
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    List3DActivity.this.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                }
            }, 500);
        } catch (Throwable th) {
            C5518g.m23564a("List3DActivity", 6, "List3DActivity.onCreate", th);
            C5378f.m23016a(this, C5376d.EXCEPTION, "List3DActivity.onCreate", th.getMessage(), "");
            finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5363b mo18974a() {
        this.f16554l = System.currentTimeMillis();
        return new C5362a(String.valueOf(((double) (this.f16554l - this.f16555m)) / 1000.0d), this.f16544b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo18976b() {
        if (this.f16545c == null || this.f16545c.isEmpty()) {
            return "";
        }
        return ((ListItem) this.f16545c.get(0)).mo18992d() != null ? ((ListItem) this.f16545c.get(0)).mo18992d() : "";
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (m22115d()) {
            C5518g.m23563a("List3DActivity", 3, "Cache TTL passed, finishing");
            finish();
            return;
        }
        C5427m.m23145a().mo19990a(true);
        this.f16555m = System.currentTimeMillis();
        C5169f.m22203a().mo19078a(this.f16543a).mo19075c();
    }

    public void onBackPressed() {
        C5169f.m22203a().mo19078a(this.f16543a).mo19076d();
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f16547e != null) {
            synchronized (this.f16547e) {
                if (this.f16547e != null) {
                    this.f16547e.dismiss();
                    this.f16547e = null;
                }
            }
        }
        if (this.f16548f != null) {
            this.f16548f.stopLoading();
        }
        C5307i.m22662a((Activity) this, false);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C5169f.m22203a().mo19078a(this.f16543a).mo19073b();
        if (this.f16550h != null && this.f16550h.mo19715b()) {
            this.f16550h.mo19717d();
        }
        overridePendingTransition(0, 0);
        if (this.f16553k != null && this.f16553k.equals("back")) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f16551i != null) {
            bundle.putSerializable("lastLoadTime", this.f16551i);
        }
        if (this.f16552j != null) {
            bundle.putSerializable("adCacheTtl", this.f16552j);
        }
    }

    /* renamed from: a */
    public void mo18975a(int i) {
        View childAt = this.f16546d.getChildAt(i - this.f16546d.getFirstItemPosition());
        if (childAt != null) {
            C5166d dVar = (C5166d) childAt.getTag();
            C5168e a = C5169f.m22203a().mo19078a(this.f16543a);
            if (a != null && a.mo19077e() != null && i < a.mo19077e().size()) {
                ListItem listItem = (ListItem) a.mo19077e().get(i);
                dVar.mo19062b().setImageBitmap(a.mo19067a(i, listItem.mo18989a(), listItem.mo18998i()));
                dVar.mo19062b().requestLayout();
                dVar.mo19061a(listItem.mo19006q());
            }
        }
    }

    public void finish() {
        try {
            C5518g.m23563a("List3DActivity", 2, "Finishing activity.");
            this.f16554l = System.currentTimeMillis();
            C5349c.m22876b((Context) this, mo18976b(), mo18974a());
            C5427m.m23145a().mo19990a(false);
            m22114c();
            synchronized (this) {
                if (this.f16556n != null) {
                    C5523b.m23588a((Context) this).mo20504a(this.f16556n);
                    this.f16556n = null;
                }
            }
            if (this.f16543a != null) {
                C5169f.m22203a().mo19078a(this.f16543a).mo19076d();
                if (!AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
                    C5169f.m22203a().mo19079b(this.f16543a);
                }
            }
        } catch (Exception e) {
            C5518g.m23564a("List3DActivity", 6, "List3DActivity.finish error", e);
            C5378f.m23016a(this, C5376d.EXCEPTION, "List3DActivity.finish", e.getMessage(), "");
        }
        super.finish();
    }

    /* renamed from: c */
    private void m22114c() {
        if (this.f16549g == getResources().getConfiguration().orientation) {
            C5523b.m23588a((Context) this).mo20506a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
        }
    }

    /* renamed from: d */
    private boolean m22115d() {
        boolean z = false;
        if (this.f16551i == null || this.f16552j == null) {
            return false;
        }
        if (System.currentTimeMillis() - this.f16551i.longValue() > this.f16552j.longValue()) {
            z = true;
        }
        return z;
    }
}
