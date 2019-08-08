package mega.boicot;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.facebook.ads.AdError;
import com.facebook.ads.C1514Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.gms.ads.C2997g;
import com.google.android.gms.ads.reward.C3165a;
import com.google.android.gms.ads.reward.C3166b;
import com.google.android.gms.ads.reward.C3167c;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.VideoListener;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import java.util.ArrayList;

public class SearchableActivity extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    config f19563a;

    /* renamed from: b */
    boolean f19564b = false;

    /* renamed from: c */
    boolean f19565c = false;

    /* renamed from: d */
    boolean f19566d;

    /* renamed from: e */
    boolean f19567e;

    /* renamed from: f */
    boolean f19568f;

    /* renamed from: g */
    C5602c f19569g;

    /* renamed from: h */
    Bundle f19570h;

    /* renamed from: i */
    String f19571i;

    /* renamed from: j */
    ListView f19572j;

    /* renamed from: k */
    C3166b f19573k;

    /* renamed from: l */
    RewardedVideo f19574l;

    /* renamed from: m */
    RewardedVideoAd f19575m;

    /* renamed from: n */
    StartAppAd f19576n;

    /* renamed from: o */
    boolean f19577o = false;

    /* renamed from: p */
    boolean f19578p = false;

    /* renamed from: q */
    View f19579q;

    /* renamed from: r */
    ProgressDialog f19580r;

    /* renamed from: s */
    ArrayList<C5938b> f19581s;

    /* renamed from: t */
    private ListView f19582t;

    /* renamed from: mega.boicot.SearchableActivity$a */
    public class C5936a extends ArrayAdapter<C5938b> {

        /* renamed from: b */
        private ArrayList<C5938b> f19589b;

        /* renamed from: mega.boicot.SearchableActivity$a$a */
        class C5937a {

            /* renamed from: a */
            TextView f19590a;

            /* renamed from: b */
            TextView f19591b;

            /* renamed from: c */
            ImageView f19592c;

            C5937a() {
            }
        }

        public C5936a(Context context, int i, ArrayList<C5938b> arrayList) {
            super(context, i, arrayList);
            this.f19589b = arrayList;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5937a aVar;
            if (view == null) {
                view = SearchableActivity.this.getLayoutInflater().inflate(R.layout.search_item, null);
                aVar = new C5937a();
                aVar.f19592c = (ImageView) view.findViewById(R.id.iv);
                aVar.f19590a = (TextView) view.findViewById(R.id.tv_tit);
                aVar.f19591b = (TextView) view.findViewById(R.id.tv_descr);
                view.setTag(aVar);
            } else {
                aVar = (C5937a) view.getTag();
            }
            if (!SearchableActivity.this.f19567e) {
                aVar.f19592c.setVisibility(8);
            } else {
                aVar.f19592c.setVisibility(0);
                if (!((C5938b) this.f19589b.get(i)).f19594a) {
                    aVar.f19592c.setImageBitmap(null);
                } else {
                    try {
                        aVar.f19592c.setImageBitmap(SearchableActivity.this.f19563a.f17971bz[((C5938b) this.f19589b.get(i)).f19597d].f18263aG);
                    } catch (Exception | OutOfMemoryError unused) {
                    }
                }
            }
            if (VERSION.SDK_INT >= 17 && SearchableActivity.this.getResources().getBoolean(R.bool.es_rtl)) {
                aVar.f19590a.setTextDirection(4);
                aVar.f19591b.setTextDirection(4);
            }
            if (SearchableActivity.this.f19563a.f17875aH) {
                aVar.f19590a.setText(((C5938b) this.f19589b.get(i)).f19595b);
            }
            if (!SearchableActivity.this.f19568f) {
                aVar.f19591b.setVisibility(8);
            } else if (SearchableActivity.this.f19563a.f17875aH) {
                aVar.f19591b.setText(((C5938b) this.f19589b.get(i)).f19596c);
                aVar.f19591b.setVisibility(0);
            } else {
                aVar.f19590a.setText(((C5938b) this.f19589b.get(i)).f19596c);
                aVar.f19591b.setVisibility(8);
            }
            return view;
        }
    }

    /* renamed from: mega.boicot.SearchableActivity$b */
    private class C5938b {

        /* renamed from: a */
        public boolean f19594a;

        /* renamed from: b */
        public String f19595b;

        /* renamed from: c */
        public String f19596c;

        /* renamed from: d */
        public int f19597d;

        private C5938b() {
            this.f19594a = false;
        }
    }

    /* renamed from: B_ */
    public void mo9672B_() {
    }

    /* renamed from: C_ */
    public void mo9673C_() {
    }

    public void onAdClicked(C1514Ad ad) {
    }

    public void onLoggingImpression(C1514Ad ad) {
    }

    public void onCreate(Bundle bundle) {
        C5663i[] iVarArr;
        this.f19563a = (config) getApplicationContext();
        if (this.f19563a.f17881aN == null) {
            this.f19563a.mo20780b();
        }
        this.f19570h = getIntent().getExtras();
        if (this.f19563a.f18045dm == 2) {
            this.f19566d = false;
        } else {
            this.f19566d = true;
        }
        this.f19571i = config.m23831a(this.f19563a.f17881aN, this.f19563a.f17890aW);
        if (VERSION.SDK_INT > 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f19563a.f17881aN);
            if (!config.m23844a(sb.toString())) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.searchableactivity);
        mo21591f();
        if (this.f19563a.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    SearchableActivity.this.f19564b = false;
                    SearchableActivity.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    SearchableActivity.this.f19578p = false;
                }
            });
        }
        ((SearchManager) getSystemService("search")).setOnCancelListener(new OnCancelListener() {
            public void onCancel() {
                SearchableActivity.this.f19564b = false;
                SearchableActivity.this.setResult(0);
            }
        });
        this.f19563a.mo20770a((Context) this, this.f19570h != null && this.f19570h.containsKey("ad_entrar"), this.f19570h != null && this.f19570h.containsKey("fb_entrar"));
        this.f19569g = this.f19563a.mo20760a((Context) this, false);
        this.f19567e = false;
        this.f19568f = false;
        if (this.f19563a.f17877aJ || this.f19563a.f17876aI) {
            for (C5663i iVar : this.f19563a.f17971bz) {
                if (iVar.f18237H) {
                    if (this.f19563a.f17877aJ && (iVar.f18264aH || iVar.f18263aG != null)) {
                        this.f19567e = true;
                    }
                    if (this.f19563a.f17876aI && !iVar.f18310c.equals("")) {
                        this.f19568f = true;
                    }
                    if (this.f19563a.f17877aJ) {
                        if (this.f19567e) {
                            if (this.f19563a.f17876aI) {
                                if (this.f19568f) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (this.f19563a.f17876aI) {
                        if (this.f19568f) {
                            if (!this.f19563a.f17877aJ || this.f19567e) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        this.f19582t = (ListView) findViewById(R.id.listView);
        if (!this.f19563a.f17881aN.equals("") && !this.f19563a.f17881aN.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f19563a.f17881aN);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f19563a.f17882aO);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb2.toString()), Color.parseColor(sb3.toString())}));
        }
        this.f19582t.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (SearchableActivity.this.f19581s != null) {
                    SearchableActivity.this.m24371c(((C5938b) SearchableActivity.this.f19581s.get(i)).f19597d);
                }
            }
        });
        m24369a(getIntent());
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        this.f19564b = false;
        setResult(0);
        setIntent(intent);
        m24369a(intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cf A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24369a(android.content.Intent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "android.intent.action.SEARCH"
            java.lang.String r1 = r11.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = "query"
            java.lang.String r11 = r11.getStringExtra(r0)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r11 = mega.boicot.config.m23855e(r11)
            java.lang.String r11 = r11.trim()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f19581s = r0
            java.lang.String r0 = ""
            boolean r0 = r11.equals(r0)
            r1 = 0
            if (r0 != 0) goto L_0x00d5
            mega.boicot.config r0 = r10.f19563a
            mega.boicot.i[] r0 = r0.f17971bz
            int r2 = r0.length
            r3 = r1
            r4 = r3
        L_0x0035:
            if (r3 >= r2) goto L_0x00d5
            r5 = r0[r3]
            boolean r6 = r5.f18237H
            if (r6 == 0) goto L_0x00cf
            mega.boicot.config r6 = r10.f19563a
            boolean r6 = r6.f17873aF
            r7 = 1
            if (r6 == 0) goto L_0x005e
            java.lang.String r6 = r5.f18309b
            java.lang.String r8 = ""
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x005e
            java.lang.String r6 = r5.f18309b
            boolean r6 = r6.contains(r11)
            if (r6 != 0) goto L_0x008a
            java.lang.String r6 = r5.f18309b
            boolean r6 = r11.contains(r6)
            if (r6 != 0) goto L_0x008a
        L_0x005e:
            mega.boicot.config r6 = r10.f19563a
            boolean r6 = r6.f17874aG
            if (r6 == 0) goto L_0x007e
            java.lang.String r6 = r5.f18311d
            java.lang.String r8 = ""
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x007e
            java.lang.String r6 = r5.f18311d
            boolean r6 = r6.contains(r11)
            if (r6 != 0) goto L_0x008a
            java.lang.String r6 = r5.f18311d
            boolean r6 = r11.contains(r6)
            if (r6 != 0) goto L_0x008a
        L_0x007e:
            java.util.ArrayList<java.lang.String> r6 = r5.f18318k
            if (r6 == 0) goto L_0x008c
            java.util.ArrayList<java.lang.String> r6 = r5.f18318k
            boolean r6 = r6.contains(r11)
            if (r6 == 0) goto L_0x008c
        L_0x008a:
            r6 = r7
            goto L_0x00b0
        L_0x008c:
            java.util.ArrayList<java.lang.String> r6 = r5.f18318k
            if (r6 == 0) goto L_0x00af
            java.util.ArrayList<java.lang.String> r6 = r5.f18318k
            java.util.Iterator r6 = r6.iterator()
        L_0x0096:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00af
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = r8.contains(r11)
            if (r9 != 0) goto L_0x008a
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L_0x0096
            goto L_0x008a
        L_0x00af:
            r6 = r1
        L_0x00b0:
            if (r6 == 0) goto L_0x00cf
            mega.boicot.SearchableActivity$b r6 = new mega.boicot.SearchableActivity$b
            r8 = 0
            r6.<init>()
            r6.f19597d = r4
            java.lang.String r8 = r5.f18256a
            r6.f19595b = r8
            java.lang.String r8 = r5.f18310c
            r6.f19596c = r8
            android.graphics.Bitmap r5 = r5.f18263aG
            if (r5 == 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r7 = r1
        L_0x00c8:
            r6.f19594a = r7
            java.util.ArrayList<mega.boicot.SearchableActivity$b> r5 = r10.f19581s
            r5.add(r6)
        L_0x00cf:
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto L_0x0035
        L_0x00d5:
            java.util.ArrayList<mega.boicot.SearchableActivity$b> r11 = r10.f19581s
            boolean r11 = r11.isEmpty()
            r0 = 2131231427(0x7f0802c3, float:1.8078935E38)
            r2 = 8
            r3 = 2131231150(0x7f0801ae, float:1.8078373E38)
            if (r11 == 0) goto L_0x00f4
            android.view.View r11 = r10.findViewById(r3)
            r11.setVisibility(r2)
            android.view.View r11 = r10.findViewById(r0)
            r11.setVisibility(r1)
            goto L_0x0102
        L_0x00f4:
            android.view.View r11 = r10.findViewById(r0)
            r11.setVisibility(r2)
            android.view.View r11 = r10.findViewById(r3)
            r11.setVisibility(r1)
        L_0x0102:
            mega.boicot.SearchableActivity$a r11 = new mega.boicot.SearchableActivity$a
            r0 = 2131361913(0x7f0a0079, float:1.8343592E38)
            java.util.ArrayList<mega.boicot.SearchableActivity$b> r1 = r10.f19581s
            r11.<init>(r10, r0, r1)
            android.widget.ListView r0 = r10.f19582t
            r0.setAdapter(r11)
            goto L_0x0129
        L_0x0112:
            java.lang.String r0 = "android.intent.action.VIEW"
            java.lang.String r1 = r11.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            java.lang.String r11 = r11.getDataString()
            int r11 = java.lang.Integer.parseInt(r11)
            r10.m24371c(r11)
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.SearchableActivity.m24369a(android.content.Intent):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m24371c(int i) {
        View view = new View(this);
        view.setId(i);
        view.setTag(R.id.TAG_IDSECC, Integer.valueOf(i));
        if ((this.f19563a.f17986cO == null || this.f19563a.f17986cO.equals("")) && ((this.f19563a.f17985cN == null || this.f19563a.f17985cN.equals("")) && ((this.f19563a.f17988cQ == null || this.f19563a.f17988cQ.equals("")) && (this.f19563a.f17989cR == null || this.f19563a.f17989cR.equals(""))))) {
            mo21590b(i);
            return;
        }
        if (this.f19563a.f17986cO != null && !this.f19563a.f17986cO.equals("")) {
            this.f19574l = new RewardedVideo((Context) this, this.f19563a.f17986cO);
        }
        if (this.f19563a.f17985cN != null && !this.f19563a.f17985cN.equals("")) {
            this.f19573k = C2997g.m10716a(this);
        }
        if (this.f19563a.f17988cQ != null && !this.f19563a.f17988cQ.equals("")) {
            this.f19575m = new RewardedVideoAd(this, this.f19563a.f17988cQ);
        }
        if (this.f19563a.f17989cR != null && !this.f19563a.f17989cR.equals("")) {
            this.f19576n = new StartAppAd(this);
        }
        this.f19580r = new ProgressDialog(this);
        if (!this.f19563a.mo20774a((Context) this, view, this.f19571i, this.f19580r, this.f19573k, this.f19574l, this.f19575m, this.f19576n)) {
            mo21590b(i);
        }
    }

    /* renamed from: b */
    public void mo21590b(int i) {
        C5662h a = this.f19563a.mo20762a(Integer.valueOf(i), (Context) this);
        this.f19564b = true;
        Intent intent = new Intent();
        intent.putExtra("finalizar", a.f18227b);
        setResult(-1, intent);
        if (this.f19563a.f18045dm != 2) {
            a.f18226a.putExtra("es_root", true);
        }
        startActivity(a.f18226a);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19566d = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21591f() {
        int b = this.f19563a.mo20778b((Context) this);
        if (this.f19563a.f18045dm == 1) {
            this.f19572j = (ListView) findViewById(R.id.left_drawer);
            this.f19563a.mo20771a(this.f19572j);
        } else if (this.f19563a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19563a.f17971bz.length; i2++) {
                if (!this.f19563a.f17971bz[i2].f18333z) {
                    findViewById(i2).setOnClickListener(this);
                    i++;
                    if (i == b) {
                        break;
                    }
                }
            }
            if (findViewById(R.id.idaux9999) != null && findViewById(R.id.idaux9999).getVisibility() == 0) {
                findViewById(R.id.idaux9999).setOnClickListener(this);
            }
        }
        for (int i3 = 0; i3 < this.f19563a.f17923bD.length; i3++) {
            if (this.f19563a.f17923bD[i3] > 0) {
                findViewById(this.f19563a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onClick(View view) {
        if ((this.f19563a.f17986cO == null || this.f19563a.f17986cO.equals("")) && ((this.f19563a.f17985cN == null || this.f19563a.f17985cN.equals("")) && ((this.f19563a.f17988cQ == null || this.f19563a.f17988cQ.equals("")) && (this.f19563a.f17989cR == null || this.f19563a.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f19563a.f17986cO != null && !this.f19563a.f17986cO.equals("")) {
            this.f19574l = new RewardedVideo((Context) this, this.f19563a.f17986cO);
        }
        if (this.f19563a.f17985cN != null && !this.f19563a.f17985cN.equals("")) {
            this.f19573k = C2997g.m10716a(this);
        }
        if (this.f19563a.f17988cQ != null && !this.f19563a.f17988cQ.equals("")) {
            this.f19575m = new RewardedVideoAd(this, this.f19563a.f17988cQ);
        }
        if (this.f19563a.f17989cR != null && !this.f19563a.f17989cR.equals("")) {
            this.f19576n = new StartAppAd(this);
        }
        this.f19580r = new ProgressDialog(this);
        this.f19579q = view;
        if (!this.f19563a.mo20774a((Context) this, view, this.f19571i, this.f19580r, this.f19573k, this.f19574l, this.f19575m, this.f19576n)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19563a.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f19564b = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19563a.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19566d = false;
            startActivity(a.f18226a);
        }
        if (this.f19564b && !this.f19578p) {
            finish();
        }
    }

    public boolean onSearchRequested() {
        if (this.f19563a.f18080q == 0) {
            return false;
        }
        this.f19564b = true;
        this.f19578p = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f19566d);
    }

    public void onStop() {
        super.onStop();
        if (this.f19564b && !this.f19578p) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f19563a.f18013cx == 0 || this.f19569g == null || this.f19569g.f17768a == null)) {
            this.f19569g.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f19563a.f18013cx != 0 && this.f19569g != null && this.f19569g.f17768a != null) {
            this.f19569g.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f19563a.f18013cx == 0 || this.f19569g == null || this.f19569g.f17768a == null)) {
            this.f19569g.f17768a.mo12168c();
        }
        if (!(this.f19563a.f18013cx == 0 || this.f19569g == null || this.f19569g.f17769b == null)) {
            this.f19569g.f17769b.destroy();
        }
        if ((this.f19566d && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f19566d || this.f19565c || !this.f19563a.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f19565c = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f19580r.cancel();
        this.f19574l.showAd();
    }

    public void onAdClosed() {
        if (this.f19577o) {
            abrir_secc(this.f19579q);
        }
    }

    public void adError(String str) {
        this.f19580r.cancel();
        abrir_secc(this.f19579q);
    }

    public void videoEnded() {
        this.f19577o = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19580r.cancel();
        this.f19573k.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19577o = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19577o) {
            abrir_secc(this.f19579q);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19577o = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19563a.mo20775a((Context) this, this.f19574l)) {
            this.f19580r.cancel();
            abrir_secc(this.f19579q);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19580r.cancel();
        abrir_secc(this.f19579q);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19580r.cancel();
        this.f19575m.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19577o = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19577o) {
            abrir_secc(this.f19579q);
        }
    }

    public void onVideoCompleted() {
        this.f19577o = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19580r.cancel();
        this.f19576n.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (SearchableActivity.this.f19577o) {
                    SearchableActivity.this.abrir_secc(SearchableActivity.this.f19579q);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19580r.cancel();
        abrir_secc(this.f19579q);
    }
}
