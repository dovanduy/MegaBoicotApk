package com.facebook.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p017v4.content.C0362f;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.internal.adapters.C1628g;
import com.facebook.ads.internal.adapters.C1634h;
import com.facebook.ads.internal.adapters.p072b.C1595f;
import com.facebook.ads.internal.adapters.p072b.C1600k;
import com.facebook.ads.internal.adapters.p072b.C1608q;
import com.facebook.ads.internal.ipc.RemoteANActivity;
import com.facebook.ads.internal.p081h.C1724b;
import com.facebook.ads.internal.p088o.C1774a;
import com.facebook.ads.internal.p088o.C1775b;
import com.facebook.ads.internal.p088o.C1777d;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p092s.C1803d;
import com.facebook.ads.internal.p115w.p117b.C2308c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.C1810a.C1811a;
import com.facebook.ads.internal.view.C1910a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.C1947b;
import com.facebook.ads.internal.view.C2058f;
import com.facebook.ads.internal.view.C2058f.C2062a;
import com.facebook.ads.internal.view.C2092h;
import com.facebook.ads.internal.view.C2246l;
import com.facebook.ads.internal.view.C2251m;
import com.facebook.ads.internal.view.C2254n;
import com.facebook.ads.internal.view.C2272r;
import com.facebook.ads.internal.view.C2277s;
import com.facebook.ads.internal.view.C2297z;
import com.facebook.ads.internal.view.p099a.C1916b;
import com.facebook.ads.internal.view.p099a.C1917c;
import com.facebook.ads.internal.view.p099a.C1919d;
import com.facebook.ads.internal.view.p101c.C1978c;
import com.facebook.ads.internal.view.p105e.p106a.C2050e;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.p112b.C2133aa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AudienceNetworkActivity extends Activity {
    @Deprecated
    public static final String AD_ICON_URL = "adIconUrl";
    @Deprecated
    public static final String AD_SUBTITLE = "adSubtitle";
    @Deprecated
    public static final String AD_TITLE = "adTitle";
    public static final String AUDIENCE_NETWORK_UNIQUE_ID_EXTRA = "uniqueId";
    public static final String AUTOPLAY = "autoplay";
    public static final String BROWSER_URL = "browserURL";
    public static final String CLIENT_TOKEN = "clientToken";
    @Deprecated
    public static final String CONTEXT_SWITCH_BEHAVIOR = "contextSwitchBehavior";
    @Deprecated
    public static final String END_CARD_ACTIVATION_COMMAND = "facebookRewardedVideoEndCardActivationCommand";
    @Deprecated
    public static final String END_CARD_MARKUP = "facebookRewardedVideoEndCardMarkup";
    public static final String HANDLER_TIME = "handlerTime";
    public static final String PLACEMENT_ID = "placementId";
    public static final String PREDEFINED_ORIENTATION_KEY = "predefinedOrientationKey";
    public static final String REQUEST_TIME = "requestTime";
    public static final String REWARD_SERVER_URL = "rewardServerURL";
    public static final String SKIP_DELAY_SECONDS_KEY = "skipAfterSeconds";
    public static final String USE_CACHE = "useCache";
    public static final String VIDEO_LOGGER = "videoLogger";
    public static final String VIDEO_MPD = "videoMPD";
    public static final String VIDEO_SEEK_TIME = "videoSeekTime";
    public static final String VIDEO_URL = "videoURL";
    public static final String VIEW_TYPE = "viewType";
    @Deprecated
    public static final String WEBVIEW_ENCODING = "utf-8";
    @Deprecated
    public static final String WEBVIEW_MIME_TYPE = "text/html";

    /* renamed from: a */
    private final List<BackButtonInterceptor> f4636a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public RelativeLayout f4637b;

    /* renamed from: c */
    private int f4638c = -1;

    /* renamed from: d */
    private String f4639d;

    /* renamed from: e */
    private C1811a f4640e;

    /* renamed from: f */
    private long f4641f;

    /* renamed from: g */
    private long f4642g;

    /* renamed from: h */
    private int f4643h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1910a f4644i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1917c f4645j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1978c f4646k;

    public interface BackButtonInterceptor {
        boolean interceptBackButton();
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$a */
    private static class C1525a implements C1911a {

        /* renamed from: a */
        final WeakReference<AudienceNetworkActivity> f4648a;

        private C1525a(AudienceNetworkActivity audienceNetworkActivity) {
            this.f4648a = new WeakReference<>(audienceNetworkActivity);
        }

        /* renamed from: a */
        public void mo6793a(View view) {
            if (this.f4648a.get() != null) {
                ((AudienceNetworkActivity) this.f4648a.get()).f4637b.addView(view);
            }
        }

        /* renamed from: a */
        public void mo6794a(View view, int i) {
            if (this.f4648a.get() != null) {
                ((AudienceNetworkActivity) this.f4648a.get()).f4637b.addView(view, i);
            }
        }

        /* renamed from: a */
        public void mo6795a(String str) {
            if (this.f4648a.get() != null) {
                ((AudienceNetworkActivity) this.f4648a.get()).m6337a(str);
            }
        }

        /* renamed from: a */
        public void mo6796a(String str, C1777d dVar) {
            if (this.f4648a.get() != null) {
                AudienceNetworkActivity.m6334a((AudienceNetworkActivity) this.f4648a.get(), str, dVar);
            }
        }

        /* renamed from: a */
        public void mo6797a(String str, boolean z, C1916b bVar) {
            if (this.f4648a.get() != null) {
                AudienceNetworkActivity.m6335a((AudienceNetworkActivity) this.f4648a.get(), str, z, bVar);
            }
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$b */
    private static class C1526b {

        /* renamed from: a */
        private final AudienceNetworkActivity f4649a;

        /* renamed from: b */
        private final Intent f4650b;

        /* renamed from: c */
        private final C1802c f4651c;

        private C1526b(AudienceNetworkActivity audienceNetworkActivity, Intent intent, C1802c cVar) {
            this.f4649a = audienceNetworkActivity;
            this.f4650b = intent;
            this.f4651c = cVar;
        }

        /* renamed from: a */
        static /* synthetic */ C1910a m6346a(C1526b bVar) {
            C2277s sVar = new C2277s(bVar.f4649a, bVar.f4651c, new C2110a(bVar.f4649a), new C1528d(), (C1608q) bVar.f4650b.getSerializableExtra("rewardedVideoAdDataBundle"));
            return sVar;
        }

        /* renamed from: a */
        static /* synthetic */ C1910a m6347a(C1526b bVar, RelativeLayout relativeLayout) {
            C2297z zVar = new C2297z(bVar.f4649a, bVar.f4651c, new C1525a());
            zVar.mo8699a((View) relativeLayout);
            zVar.mo8698a(bVar.f4650b.getIntExtra("video_time_polling_interval", 200));
            return zVar;
        }

        /* renamed from: a */
        private boolean m6348a() {
            return this.f4650b.getBooleanExtra(AudienceNetworkActivity.USE_CACHE, false);
        }

        /* renamed from: b */
        private C1600k m6349b() {
            return (C1600k) this.f4650b.getSerializableExtra("ad_data_bundle");
        }

        /* renamed from: b */
        static /* synthetic */ C1910a m6350b(C1526b bVar) {
            return new C2272r(bVar.f4649a, bVar.f4651c, new C1528d(), (C1608q) bVar.f4650b.getSerializableExtra("rewardedVideoAdDataBundle"));
        }

        /* renamed from: c */
        static /* synthetic */ C1910a m6351c(C1526b bVar) {
            return new C2058f(bVar.f4649a, (C1595f) bVar.f4650b.getSerializableExtra("rewardedVideoAdDataBundle"), bVar.f4651c, new C1528d());
        }

        /* renamed from: d */
        static /* synthetic */ C1910a m6352d(C1526b bVar) {
            return new C2092h(bVar.f4649a, bVar.f4651c, new C1525a());
        }

        /* renamed from: e */
        static /* synthetic */ C1910a m6353e(C1526b bVar) {
            return new C1947b(bVar.f4649a, bVar.f4651c, new C1525a());
        }

        /* renamed from: f */
        static /* synthetic */ C1910a m6354f(C1526b bVar) {
            C1910a a = C1628g.m6776a(bVar.f4650b.getStringExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA));
            if (a == null) {
                return null;
            }
            a.setListener(new C1525a());
            return a;
        }

        /* renamed from: g */
        static /* synthetic */ C1910a m6355g(C1526b bVar) {
            C2254n nVar = new C2254n(bVar.f4649a, bVar.f4651c, bVar.m6349b(), bVar.m6348a() ? new C1724b(bVar.f4649a) : null, new C1525a());
            return nVar;
        }

        /* renamed from: h */
        static /* synthetic */ C1910a m6356h(C1526b bVar) {
            return new C2246l(bVar.f4649a, bVar.m6349b(), bVar.f4651c, new C1525a());
        }

        /* renamed from: i */
        static /* synthetic */ C1910a m6357i(C1526b bVar) {
            return new C2050e(bVar.f4649a, bVar.f4651c, bVar.m6348a() ? new C1724b(bVar.f4649a) : null, new C1525a());
        }

        /* renamed from: j */
        static /* synthetic */ C1910a m6358j(C1526b bVar) {
            return new C2251m(bVar.f4649a, bVar.f4651c, bVar.m6349b(), new C1525a());
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$c */
    private class C1527c implements OnLongClickListener {
        private C1527c() {
        }

        public boolean onLongClick(View view) {
            if (!(AudienceNetworkActivity.this.f4646k == null || AudienceNetworkActivity.this.f4637b == null)) {
                AudienceNetworkActivity.this.f4646k.setBounds(0, 0, AudienceNetworkActivity.this.f4637b.getWidth(), AudienceNetworkActivity.this.f4637b.getHeight());
                AudienceNetworkActivity.this.f4646k.mo8105a(!AudienceNetworkActivity.this.f4646k.mo8106a());
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$d */
    private static class C1528d extends C1525a {
        private C1528d(AudienceNetworkActivity audienceNetworkActivity) {
            super();
        }

        /* renamed from: a */
        public void mo6795a(String str) {
            if (this.f4648a.get() != null) {
                ((AudienceNetworkActivity) this.f4648a.get()).m6337a(str);
                String a = C2133aa.REWARDED_VIDEO_END_ACTIVITY.mo8442a();
                String a2 = C2133aa.REWARDED_VIDEO_ERROR.mo8442a();
                if (str.equals(a) || str.equals(a2)) {
                    ((AudienceNetworkActivity) this.f4648a.get()).finish();
                }
            }
        }

        /* renamed from: a */
        public void mo6796a(String str, C1777d dVar) {
            super.mo6796a(str, dVar);
            if (this.f4648a.get() != null) {
                AudienceNetworkActivity audienceNetworkActivity = (AudienceNetworkActivity) this.f4648a.get();
                if (str.equals(C2133aa.REWARDED_VIDEO_CHOOSE_YOUR_OWN_AD.mo8442a())) {
                    Intent intent = new Intent();
                    intent.putExtra("rewardedVideoAdDataBundle", ((C2062a) dVar).mo8303a());
                    C1910a a = C1526b.m6346a(new C1526b(intent, C1803d.m7531a((Context) audienceNetworkActivity)));
                    if (audienceNetworkActivity.f4645j != null) {
                        audienceNetworkActivity.f4645j.mo7976b();
                    }
                    audienceNetworkActivity.f4645j = null;
                    C2342x.m9085a((ViewGroup) a);
                    audienceNetworkActivity.f4644i = a;
                    a.mo7268a(audienceNetworkActivity.getIntent(), null, audienceNetworkActivity);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m6334a(AudienceNetworkActivity audienceNetworkActivity, String str, C1777d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(audienceNetworkActivity.f4639d);
        Intent intent = new Intent(sb.toString());
        intent.putExtra("event", dVar);
        C0362f.m1362a((Context) audienceNetworkActivity).mo1252a(intent);
    }

    /* renamed from: a */
    static /* synthetic */ void m6335a(AudienceNetworkActivity audienceNetworkActivity, String str, boolean z, C1916b bVar) {
        if (audienceNetworkActivity.f4645j == null) {
            audienceNetworkActivity.f4645j = C1919d.m8033a(audienceNetworkActivity.getApplicationContext(), C1803d.m7531a((Context) audienceNetworkActivity), str, audienceNetworkActivity.f4644i, new C1525a());
            audienceNetworkActivity.f4645j.setLayoutParams(new LayoutParams(-1, -1));
        }
        audienceNetworkActivity.f4645j.mo7975a(z);
        audienceNetworkActivity.f4645j.setAdReportingFlowListener(bVar);
        C2342x.m9091b(audienceNetworkActivity.f4645j);
        C2342x.m9085a((ViewGroup) audienceNetworkActivity.f4637b);
        audienceNetworkActivity.f4637b.addView(audienceNetworkActivity.f4645j);
        audienceNetworkActivity.f4645j.mo7973a();
    }

    /* renamed from: a */
    private void m6336a(Exception exc) {
        finish();
        C2370a.m9149b(this, "an_activity", C2373b.f7493aa, exc);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6337a(String str) {
        if ("com.facebook.ads.adreporting.FINISH_AD_REPORTING_FLOW".equals(str)) {
            finish();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(this.f4639d);
        C0362f.m1362a((Context) this).mo1252a(new Intent(sb.toString()));
    }

    /* renamed from: a */
    private boolean m6338a() {
        return this.f4640e == C1811a.REWARDED_VIDEO || this.f4640e == C1811a.REWARDED_PLAYABLE || this.f4640e == C1811a.REWARDED_VIDEO_CHOOSE_YOUR_OWN_AD;
    }

    public static Class getAdActivity() {
        return AdInternalSettings.f5734d ? RemoteANActivity.class : AudienceNetworkActivity.class;
    }

    public void addBackButtonInterceptor(BackButtonInterceptor backButtonInterceptor) {
        this.f4636a.add(backButtonInterceptor);
    }

    public void finish() {
        if (!isFinishing()) {
            m6337a(m6338a() ? C2133aa.REWARDED_VIDEO_CLOSED.mo8442a() : "com.facebook.ads.interstitial.dismissed");
            super.finish();
        }
    }

    public void onBackPressed() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f4642g += currentTimeMillis - this.f4641f;
            this.f4641f = currentTimeMillis;
            if (this.f4642g > ((long) this.f4643h)) {
                boolean z = false;
                for (BackButtonInterceptor interceptBackButton : this.f4636a) {
                    if (interceptBackButton.interceptBackButton()) {
                        z = true;
                    }
                }
                if (!z) {
                    super.onBackPressed();
                }
            }
        } catch (Exception e) {
            m6336a(e);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        try {
            if (this.f4644i instanceof C1634h) {
                ((C1634h) this.f4644i).mo7269a(configuration);
            } else if (this.f4644i instanceof C2277s) {
                ((C2277s) this.f4644i).onConfigurationChanged(configuration);
            }
        } catch (Exception e) {
            m6336a(e);
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        C1910a aVar;
        super.onCreate(bundle);
        try {
            C2308c.m9019a();
            boolean z = true;
            requestWindowFeature(1);
            getWindow().setFlags(C1245d.f3947iP, C1245d.f3947iP);
            this.f4637b = new RelativeLayout(this);
            C2342x.m9082a((View) this.f4637b, -16777216);
            setContentView(this.f4637b, new LayoutParams(-1, -1));
            Intent intent = getIntent();
            if (bundle != null) {
                this.f4638c = bundle.getInt(PREDEFINED_ORIENTATION_KEY, -1);
                this.f4639d = bundle.getString(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA);
                this.f4640e = (C1811a) bundle.getSerializable(VIEW_TYPE);
            } else {
                this.f4638c = intent.getIntExtra(PREDEFINED_ORIENTATION_KEY, -1);
                this.f4639d = intent.getStringExtra(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA);
                this.f4640e = (C1811a) intent.getSerializableExtra(VIEW_TYPE);
                this.f4643h = intent.getIntExtra(SKIP_DELAY_SECONDS_KEY, 0) * AdError.NETWORK_ERROR_CODE;
            }
            C1526b bVar = new C1526b(getIntent(), C1803d.m7531a((Context) this));
            if (this.f4640e != null) {
                switch (this.f4640e) {
                    case FULL_SCREEN_VIDEO:
                        aVar = C1526b.m6347a(bVar, this.f4637b);
                        break;
                    case REWARDED_VIDEO:
                        aVar = C1526b.m6346a(bVar);
                        break;
                    case REWARDED_PLAYABLE:
                        aVar = C1526b.m6350b(bVar);
                        break;
                    case REWARDED_VIDEO_CHOOSE_YOUR_OWN_AD:
                        aVar = C1526b.m6351c(bVar);
                        break;
                    case INTERSTITIAL_WEB_VIEW:
                        aVar = C1526b.m6352d(bVar);
                        break;
                    case BROWSER:
                        aVar = C1526b.m6353e(bVar);
                        break;
                    case INTERSTITIAL_OLD_NATIVE_VIDEO:
                        aVar = C1526b.m6354f(bVar);
                        break;
                    case INTERSTITIAL_NATIVE_VIDEO:
                        aVar = C1526b.m6355g(bVar);
                        break;
                    case INTERSTITIAL_NATIVE_IMAGE:
                        aVar = C1526b.m6356h(bVar);
                        break;
                    case INTERSTITIAL_NATIVE_CAROUSEL:
                        aVar = C1526b.m6357i(bVar);
                        break;
                    case INTERSTITIAL_NATIVE_PLAYABLE:
                        aVar = C1526b.m6358j(bVar);
                        break;
                }
            }
            aVar = null;
            this.f4644i = aVar;
            if (this.f4644i == null) {
                C1775b.m7365a(C1774a.m7362a(null, "Unable to infer viewType from intent or savedInstanceState"));
                m6337a("com.facebook.ads.interstitial.error");
                finish();
                return;
            }
            this.f4644i.mo7268a(intent, bundle, this);
            m6337a("com.facebook.ads.interstitial.displayed");
            this.f4641f = System.currentTimeMillis();
            if (this.f4640e != C1811a.INTERSTITIAL_WEB_VIEW) {
                z = false;
            }
            if (C1795a.m7442b(this) && this.f4640e != C1811a.BROWSER) {
                this.f4646k = new C1978c();
                this.f4646k.mo8104a(intent.getStringExtra(PLACEMENT_ID));
                this.f4646k.mo8108b(getPackageName());
                long longExtra = intent.getLongExtra(REQUEST_TIME, 0);
                if (longExtra != 0) {
                    this.f4646k.mo8102a(longExtra);
                }
                TextView textView = new TextView(this);
                textView.setText("Debug");
                textView.setTextColor(-1);
                C2342x.m9082a((View) textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                C1527c cVar = new C1527c();
                textView.setOnLongClickListener(cVar);
                if (z) {
                    this.f4637b.addView(textView);
                } else {
                    this.f4637b.setOnLongClickListener(cVar);
                }
                this.f4637b.getOverlay().add(this.f4646k);
            }
        } catch (Exception e) {
            m6336a(e);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            m6337a(m6338a() ? C2133aa.REWARDED_VIDEO_ACTIVITY_DESTROYED.mo8442a() : "com.facebook.ads.interstitial.activity_destroyed");
            if (this.f4637b != null) {
                this.f4637b.removeAllViews();
            }
            if (this.f4644i != null) {
                C1628g.m6778a(this.f4644i);
                this.f4644i.onDestroy();
                this.f4644i = null;
            }
            if (this.f4646k != null && C1795a.m7442b(this)) {
                this.f4646k.mo8107b();
            }
            if (this.f4645j != null) {
                this.f4645j.mo7976b();
            }
        } catch (Exception e) {
            m6336a(e);
        }
        super.onDestroy();
    }

    public void onPause() {
        try {
            this.f4642g += System.currentTimeMillis() - this.f4641f;
            if (this.f4644i != null) {
                this.f4644i.mo7271a_(false);
            }
        } catch (Exception e) {
            m6336a(e);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        try {
            this.f4641f = System.currentTimeMillis();
            if (this.f4644i != null) {
                this.f4644i.mo7272b(false);
            }
        } catch (Exception e) {
            m6336a(e);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        try {
            if (this.f4644i != null) {
                this.f4644i.mo7270a(bundle);
            }
            bundle.putInt(PREDEFINED_ORIENTATION_KEY, this.f4638c);
            bundle.putString(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.f4639d);
            bundle.putSerializable(VIEW_TYPE, this.f4640e);
        } catch (Exception e) {
            m6336a(e);
        }
    }

    public void onStart() {
        super.onStart();
        try {
            if (this.f4638c != -1) {
                try {
                    setRequestedOrientation(this.f4638c);
                } catch (IllegalStateException unused) {
                }
            }
        } catch (Exception e) {
            m6336a(e);
        }
    }

    public void removeBackButtonInterceptor(BackButtonInterceptor backButtonInterceptor) {
        this.f4636a.remove(backButtonInterceptor);
    }
}
