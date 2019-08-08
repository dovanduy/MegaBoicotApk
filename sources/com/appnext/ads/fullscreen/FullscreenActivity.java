package com.appnext.ads.fullscreen;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.appnext.C1062R;
import com.appnext.ads.C1066a;
import com.appnext.ads.C1067b;
import com.appnext.ads.C1068c;
import com.appnext.base.p046b.C1245d;
import com.appnext.core.AppnextActivity;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1317e.C1324a;
import com.appnext.core.C1326f;
import com.appnext.core.C1334j;
import com.appnext.core.C1345p;
import com.appnext.core.C1349q;
import com.appnext.core.C1349q.C1358a;
import com.appnext.core.p049a.C1305b;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;

public class FullscreenActivity extends AppnextActivity implements C1120h, C1121i, C1122j, C1324a {
    private ArrayList<AppnextAd> ads;
    /* access modifiers changed from: private */

    /* renamed from: dA */
    public AppnextAd f3588dA;

    /* renamed from: dB */
    C1067b f3589dB;

    /* renamed from: dC */
    private HashMap<String, Integer> f3590dC;

    /* renamed from: dD */
    private Video f3591dD;

    /* renamed from: dE */
    Runnable f3592dE = new Runnable() {
        public final void run() {
            if (FullscreenActivity.this.userAction != null) {
                FullscreenActivity.this.userAction.mo6295e(FullscreenActivity.this.f3596dz);
            }
            if (Boolean.parseBoolean(FullscreenActivity.this.getConfig().get("fq_control")) && FullscreenActivity.this.m4928X() != null && FullscreenActivity.this.m4928X().fq_status) {
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            StringBuilder sb = new StringBuilder("https://www.fqtag.com/pixel.cgi?org=TkBXEI5C3FBIr4zXwnmK&p=");
                            sb.append(FullscreenActivity.this.placementID);
                            sb.append("&a=");
                            sb.append(FullscreenActivity.this.f3596dz.getBannerID());
                            sb.append("&cmp=");
                            sb.append(FullscreenActivity.this.f3596dz.getCampaignID());
                            sb.append("&fmt=banner&dmn=");
                            sb.append(FullscreenActivity.this.f3596dz.getAdPackage());
                            sb.append("&ad=&rt=displayImg&gid=");
                            sb.append(C1326f.m5675b((Context) FullscreenActivity.this, true));
                            sb.append("&aid=&applng=");
                            sb.append(Locale.getDefault().toString());
                            sb.append("&app=");
                            sb.append(FullscreenActivity.this.getPackageName());
                            sb.append("&c1=100&c2=");
                            sb.append(FullscreenActivity.this.m4928X().getTID());
                            sb.append("&c3=");
                            sb.append(FullscreenActivity.this.m4928X().getAUID());
                            sb.append("&c4=");
                            sb.append(FullscreenActivity.this.m4928X().getVID());
                            sb.append("&sl=1&fq=1");
                            C1326f.m5659a(sb.toString(), null);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
            }
            FullscreenActivity.this.report(C1066a.f3524cJ, "S2");
        }
    };

    /* renamed from: dF */
    Runnable f3593dF = new Runnable() {
        public final void run() {
            FullscreenActivity.this.mo5424a(FullscreenActivity.this.f3596dz, (C1324a) null);
            FullscreenActivity.this.report(C1066a.f3525cK, "S2");
        }
    };

    /* renamed from: dx */
    private C1345p f3594dx;

    /* renamed from: dy */
    private boolean f3595dy = true;
    /* access modifiers changed from: private */

    /* renamed from: dz */
    public AppnextAd f3596dz;
    private boolean finished = false;
    private Handler mHandler;
    private int state = 0;
    private int type;

    /* renamed from: W */
    private static void m4927W() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Fragment fragment;
        if (bundle != null) {
            this.f3590dC = (HashMap) bundle.getSerializable("templates");
            this.state = bundle.getInt("state");
        }
        if (VERSION.SDK_INT >= 17) {
            Configuration configuration = getResources().getConfiguration();
            configuration.setLayoutDirection(new Locale("en"));
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        }
        super.onCreate(bundle);
        if (Video.currentAd == null) {
            onError(AppnextError.NO_ADS);
            finish();
            return;
        }
        if (Video.currentAd instanceof RewardedVideo) {
            this.f3591dD = new RewardedVideo((Context) this, (RewardedVideo) Video.currentAd);
        } else {
            this.f3591dD = new FullScreenVideo((Context) this, (FullScreenVideo) Video.currentAd);
        }
        String orientation = m4928X().getOrientation();
        char c = 65535;
        int hashCode = orientation.hashCode();
        if (hashCode != 729267099) {
            if (hashCode != 1430647483) {
                if (hashCode != 1673671211) {
                    if (hashCode == 2129065206 && orientation.equals(C1286Ad.ORIENTATION_DEFAULT)) {
                        c = 0;
                    }
                } else if (orientation.equals(C1286Ad.ORIENTATION_AUTO)) {
                    c = 1;
                }
            } else if (orientation.equals(C1286Ad.ORIENTATION_LANDSCAPE)) {
                c = 2;
            }
        } else if (orientation.equals(C1286Ad.ORIENTATION_PORTRAIT)) {
            c = 3;
        }
        switch (c) {
            case 0:
            case 1:
                if (getResources().getConfiguration().orientation != 2) {
                    setRequestedOrientation(7);
                    break;
                } else {
                    setRequestedOrientation(6);
                    break;
                }
            case 2:
                setRequestedOrientation(6);
                break;
            case 3:
                setRequestedOrientation(7);
                break;
        }
        this.mHandler = new Handler();
        this.placementID = getIntent().getExtras().getString(TtmlNode.ATTR_ID);
        this.type = getIntent().getExtras().getInt(C1245d.f3961jd);
        if (this.type == 1) {
            this.f3594dx = C1085c.m4984af();
        } else {
            this.f3594dx = C1103f.m5002ah();
        }
        this.f3595dy = Boolean.parseBoolean(this.f3594dx.get("can_close"));
        if (m4928X() instanceof FullScreenVideo) {
            this.f3595dy = ((FullScreenVideo) m4928X()).isBackButtonCanClose();
        }
        if (bundle == null) {
            this.ads = C1083b.m4964ac().mo5564f(m4928X());
            if (this.ads == null) {
                onError(AppnextError.NO_ADS);
                finish();
                return;
            }
            this.f3596dz = mo5423a(this.ads, this.placementID, "");
        } else {
            this.ads = (ArrayList) bundle.getSerializable("ads");
            this.f3596dz = (AppnextAd) bundle.getSerializable("currentAd");
        }
        if (this.f3596dz == null) {
            onError(AppnextError.NO_ADS);
            finish();
            return;
        }
        setContentView(C1062R.layout.apnxt_video_activity);
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            String mode = m4928X() instanceof RewardedVideo ? ((RewardedVideo) m4928X()).getMode() : "";
            if (mode.equals(RewardedVideo.VIDEO_MODE_DEFAULT)) {
                mode = getConfig().get("default_mode");
            }
            if (this.type != 2 || !mode.equals("multi")) {
                if (this.type == 2) {
                    report("normal");
                }
                fragment = new C1104g();
                bundle2.putBoolean("showCta", m4928X().isShowCta());
                this.state = 1;
            } else {
                fragment = new C1095e();
                bundle2.putInt(C1245d.f3955iX, ((RewardedVideo) m4928X()).getMultiTimerLength());
                report("multi");
            }
            fragment.setArguments(bundle2);
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.add(C1062R.C1064id.f3511ll, fragment, "fragment");
            try {
                beginTransaction.commit();
            } catch (Exception unused) {
                finish();
                return;
            }
        } else {
            this.finished = bundle.getBoolean("finished", true);
        }
        this.f4106kr = (RelativeLayout) findViewById(C1062R.C1064id.f3511ll);
        this.userAction = new C1349q(this, new C1358a() {
            public final void report(String str) {
                FullscreenActivity.this.report(str);
            }

            /* renamed from: Y */
            public final C1286Ad mo5458Y() {
                return Video.currentAd;
            }

            /* renamed from: Z */
            public final AppnextAd mo5459Z() {
                return FullscreenActivity.this.f3588dA;
            }

            /* renamed from: aa */
            public final C1345p mo5460aa() {
                return FullscreenActivity.this.getConfig();
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void onError(String str) {
        if (m4928X() != null && m4928X().getOnAdErrorCallback() != null) {
            m4928X().getOnAdErrorCallback().adError(str);
        }
    }

    /* access modifiers changed from: protected */
    public final C1345p getConfig() {
        if (this.f3594dx == null) {
            if (this.type == 1) {
                this.f3594dx = C1085c.m4984af();
            } else {
                this.f3594dx = C1103f.m5002ah();
            }
        }
        return this.f3594dx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5424a(AppnextAd appnextAd, C1324a aVar) {
        super.mo5424a(appnextAd, (C1324a) new C1324a() {
            public final void error(String str) {
            }

            public final void onMarket(String str) {
            }
        });
    }

    /* renamed from: U */
    private Uri m4925U() {
        String str;
        String videoUrl = C1083b.getVideoUrl(this.f3596dz, m4928X().getVideoLength());
        String N = C1083b.m4960N(videoUrl);
        if (Video.getCacheVideo()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getFilesDir().getAbsolutePath());
            sb.append("/data/appnext/videos/");
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getFilesDir().getAbsolutePath());
            sb2.append("/data/appnext/videos/");
            sb2.append("tmp/vid");
            sb2.append(m4928X().rnd);
            sb2.append("/");
            str = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(N);
        File file = new File(sb3.toString());
        if (file.exists()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(N);
            Uri parse = Uri.parse(sb4.toString());
            new StringBuilder("playing video ").append(parse.getPath());
            return parse;
        }
        Uri parse2 = Uri.parse(videoUrl);
        new StringBuilder("playing video from web: ").append(videoUrl);
        new StringBuilder("file not found: ").append(file.getAbsolutePath());
        return parse2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("finished", this.finished);
        bundle.putInt(C1245d.f3961jd, this.type);
        bundle.putSerializable("templates", this.f3590dC);
        bundle.putSerializable("ads", this.ads);
        bundle.putInt("state", this.state);
        bundle.putSerializable("currentAd", this.f3596dz);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.finished = bundle.getBoolean("finished", true);
        this.type = bundle.getInt(C1245d.f3961jd);
        this.f3590dC = (HashMap) bundle.getSerializable("templates");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto L_0x001d
            com.appnext.ads.fullscreen.Video r0 = r2.m4928X()
            boolean r0 = r0 instanceof com.appnext.ads.fullscreen.FullScreenVideo
            if (r0 == 0) goto L_0x001a
            com.appnext.ads.fullscreen.Video r0 = r2.m4928X()
            com.appnext.ads.fullscreen.FullScreenVideo r0 = (com.appnext.ads.fullscreen.FullScreenVideo) r0
            boolean r0 = r0.isBackButtonCanClose()
            if (r0 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 != 0) goto L_0x0022
        L_0x001d:
            int r0 = r2.state
            r1 = 2
            if (r0 != r1) goto L_0x0028
        L_0x0022:
            r2.onClose()
            super.onBackPressed()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.fullscreen.FullscreenActivity.onBackPressed():void");
    }

    /* renamed from: V */
    private boolean m4926V() {
        return (m4928X() instanceof FullScreenVideo) && ((FullScreenVideo) m4928X()).isBackButtonCanClose();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mHandler.removeCallbacks(this.f3592dE);
        this.mHandler.removeCallbacks(this.f3593dF);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() | 2;
        if (VERSION.SDK_INT >= 16) {
            systemUiVisibility |= 4;
        }
        if (VERSION.SDK_INT >= 18) {
            systemUiVisibility |= MpegAudioHeader.MAX_FRAME_SIZE_BYTES;
        }
        getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|5|6|(1:8)|9|10|11|(1:13)|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0047 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b A[Catch:{ Throwable -> 0x0053 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r4 = this;
            super.onDestroy()
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0037 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0037 }
            r1.<init>()     // Catch:{ Throwable -> 0x0037 }
            java.io.File r2 = r4.getFilesDir()     // Catch:{ Throwable -> 0x0037 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Throwable -> 0x0037 }
            r1.append(r2)     // Catch:{ Throwable -> 0x0037 }
            java.lang.String r2 = "/data/appnext/videos/"
            r1.append(r2)     // Catch:{ Throwable -> 0x0037 }
            java.lang.String r2 = "tmp/vid"
            r1.append(r2)     // Catch:{ Throwable -> 0x0037 }
            com.appnext.ads.fullscreen.Video r2 = r4.m4928X()     // Catch:{ Throwable -> 0x0037 }
            long r2 = r2.rnd     // Catch:{ Throwable -> 0x0037 }
            r1.append(r2)     // Catch:{ Throwable -> 0x0037 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ Throwable -> 0x0037 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0037 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0037 }
            com.appnext.core.C1326f.m5679b(r0)     // Catch:{ Throwable -> 0x0037 }
        L_0x0037:
            r0 = 0
            android.os.Handler r1 = r4.mHandler     // Catch:{ Throwable -> 0x0047 }
            if (r1 == 0) goto L_0x0041
            android.os.Handler r1 = r4.mHandler     // Catch:{ Throwable -> 0x0047 }
            r1.removeCallbacksAndMessages(r0)     // Catch:{ Throwable -> 0x0047 }
        L_0x0041:
            r4.mHandler = r0     // Catch:{ Throwable -> 0x0047 }
            r4.f3588dA = r0     // Catch:{ Throwable -> 0x0047 }
            r4.f3596dz = r0     // Catch:{ Throwable -> 0x0047 }
        L_0x0047:
            com.appnext.ads.b r1 = r4.f3589dB     // Catch:{ Throwable -> 0x0053 }
            if (r1 == 0) goto L_0x0050
            com.appnext.ads.b r1 = r4.f3589dB     // Catch:{ Throwable -> 0x0053 }
            r1.mo5410d(r4)     // Catch:{ Throwable -> 0x0053 }
        L_0x0050:
            r4.f3589dB = r0     // Catch:{ Throwable -> 0x0053 }
            return
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.fullscreen.FullscreenActivity.onDestroy():void");
    }

    /* renamed from: a */
    private void m4931a(AppnextAd appnextAd) {
        mo5425b(appnextAd, (C1324a) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo5425b(AppnextAd appnextAd, C1324a aVar) {
        if (appnextAd != null) {
            this.f3588dA = appnextAd;
            if (m4928X().getOnAdClickedCallback() != null) {
                m4928X().getOnAdClickedCallback().adClicked();
            }
            if (this.finished || !(m4928X() instanceof RewardedVideo)) {
                super.mo5425b(appnextAd, aVar);
            }
        }
    }

    public void onMarket(String str) {
        mo6094cA();
        this.finished = true;
        Collections.shuffle(this.ads, new Random(System.nanoTime()));
        this.ads.remove(this.f3596dz);
        this.ads.add(0, this.f3596dz);
        C1086d dVar = new C1086d();
        this.state = 2;
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(C1062R.C1064id.f3511ll, dVar, "fragment");
        try {
            beginTransaction.commit();
        } catch (Exception unused) {
            finish();
        }
    }

    public void error(String str) {
        mo6094cA();
        report(C1066a.f3518cD);
    }

    private void onClose() {
        try {
            C1083b.m4964ac().mo5557a(this.f3596dz.getBannerID(), (C1286Ad) m4928X());
            if (!(m4928X() == null || m4928X().getOnAdClosedCallback() == null)) {
                m4928X().getOnAdClosedCallback().onAdClosed();
            }
            Video.currentAd = null;
        } catch (Throwable unused) {
        }
    }

    public void videoStarted() {
        this.mHandler.postDelayed(this.f3592dE, Long.parseLong(this.f3594dx.get("postpone_impression_sec")) * 1000);
        if (Boolean.parseBoolean(this.f3594dx.get("pview"))) {
            this.mHandler.postDelayed(this.f3593dF, Long.parseLong(this.f3594dx.get("postpone_vta_sec")) * 1000);
        }
        if (m4928X() != null && m4928X().getOnAdOpenedCallback() != null) {
            m4928X().getOnAdOpenedCallback().adOpened();
        }
    }

    public void videoEnded() {
        this.state = 2;
        this.finished = true;
        if (!(m4928X() == null || m4928X().getOnVideoEndedCallback() == null)) {
            m4928X().getOnVideoEndedCallback().videoEnded();
        }
        new Thread(new Runnable() {
            public final void run() {
                if (FullscreenActivity.this.m4928X() instanceof RewardedVideo) {
                    RewardedServerSidePostback rewardedServerSidePostback = ((RewardedVideo) FullscreenActivity.this.m4928X()).getRewardedServerSidePostback();
                    if (rewardedServerSidePostback != null) {
                        HashMap ag = rewardedServerSidePostback.mo5485ag();
                        ag.put(AudienceNetworkActivity.PLACEMENT_ID, FullscreenActivity.this.placementID);
                        try {
                            C1326f.m5659a("https://admin.appnext.com/adminService.asmx/SetRewards", ag);
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        }).start();
        Collections.shuffle(this.ads, new Random(System.nanoTime()));
        this.ads.remove(this.f3596dz);
        this.ads.add(0, this.f3596dz);
        C1086d dVar = new C1086d();
        this.state = 2;
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(C1062R.C1064id.f3511ll, dVar, "fragment");
        try {
            beginTransaction.commit();
            if (this.f3588dA != null) {
                super.mo5425b(this.f3588dA, this);
                report(C1066a.f3534cT);
                return;
            }
            report(C1066a.f3533cS);
            if (Integer.parseInt(getConfig().get("clickType_b")) > new Random(System.nanoTime()).nextInt(100)) {
                installClicked(getSelectedAd());
            }
        } catch (Exception unused) {
            finish();
        }
    }

    public void videoSelected(AppnextAd appnextAd) {
        this.f3596dz = appnextAd;
        C1104g gVar = new C1104g();
        FragmentManager fragmentManager = getFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showCta", m4928X().isShowCta());
        gVar.setArguments(bundle);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.replace(C1062R.C1064id.f3511ll, gVar, "fragment");
        try {
            beginTransaction.commit();
        } catch (Exception unused) {
            finish();
        }
    }

    public ArrayList<AppnextAd> getPreRollAds() {
        if (this.ads == null) {
            this.ads = C1083b.m4964ac().mo5564f(m4928X());
        }
        ArrayList<AppnextAd> arrayList = new ArrayList<>();
        AppnextAd a = mo5423a(this.ads, this.placementID, "");
        arrayList.add(a);
        AppnextAd a2 = mo5423a(this.ads, this.placementID, a.getBannerID());
        if (a2 != null && !a2.getBannerID().equals(((AppnextAd) arrayList.get(0)).getBannerID())) {
            arrayList.add(a2);
        }
        return arrayList;
    }

    public void privacyClicked() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C1326f.m5691f(this.f3596dz)));
            intent.setFlags(268435456);
            startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public void installClicked(AppnextAd appnextAd) {
        if (this.state == 1 && !isRewarded()) {
            mo6093a((ViewGroup) this.f4106kr, getResources().getDrawable(C1062R.C1063drawable.apnxt_loader));
        }
        mo5425b(appnextAd, (C1324a) this);
    }

    public void closeClicked() {
        if (this.state != 1 || isRewarded() || Integer.parseInt(getConfig().get("clickType_a")) <= new Random(System.nanoTime()).nextInt(100)) {
            onClose();
            finish();
            return;
        }
        installClicked(getSelectedAd());
    }

    public AppnextAd getSelectedAd() {
        return this.f3596dz;
    }

    public boolean showClose() {
        return (m4928X() instanceof FullScreenVideo) && ((FullScreenVideo) m4928X()).isShowClose();
    }

    public C1345p getConfigManager() {
        return getConfig();
    }

    public int getTemplate(String str) {
        if (this.f3590dC == null) {
            this.f3590dC = new HashMap<>();
        }
        if (!this.f3590dC.containsKey(str)) {
            String L = C1068c.m4923L(getConfig().get(str));
            Resources resources = getResources();
            StringBuilder sb = new StringBuilder("apnxt_");
            sb.append(L);
            int identifier = resources.getIdentifier(sb.toString(), TtmlNode.TAG_LAYOUT, getPackageName());
            if (identifier == 0) {
                Resources resources2 = getResources();
                StringBuilder sb2 = new StringBuilder("apnxt_");
                sb2.append(str.toLowerCase());
                sb2.append("t1");
                identifier = resources2.getIdentifier(sb2.toString(), TtmlNode.TAG_LAYOUT, getPackageName());
            }
            this.f3590dC.put(str, Integer.valueOf(identifier));
        }
        return ((Integer) this.f3590dC.get(str)).intValue();
    }

    public boolean getMute() {
        return m4928X().getMute();
    }

    public void report(String str, String str2) {
        m4936c(str, getResources().getResourceEntryName(getTemplate(str2)));
    }

    public ArrayList<AppnextAd> getPostRollAds() {
        return this.ads;
    }

    public boolean isRewarded() {
        return m4928X() instanceof RewardedVideo;
    }

    public String getLanguage() {
        return this.f3591dD.getLanguage();
    }

    public String getCtaText() {
        String buttonText = new FullscreenAd(this.f3596dz).getButtonText();
        if (this.f3596dz == null || !buttonText.equals("")) {
            return C1305b.m5595cN().mo6203c(this.f3591dD.getLanguage(), isInstalled() ? C1305b.f4127lU : C1305b.f4126lT, buttonText);
        } else if (isInstalled()) {
            return C1305b.m5595cN().mo6203c(this.f3591dD.getLanguage(), C1305b.f4127lU, "Open");
        } else {
            return C1305b.m5595cN().mo6203c(this.f3591dD.getLanguage(), C1305b.f4126lT, "Install");
        }
    }

    public boolean isInstalled() {
        try {
            return C1326f.m5694i(this, this.f3596dz.getAdPackage());
        } catch (Throwable unused) {
            return false;
        }
    }

    public int getCaptionTextTime() {
        return m4928X().getRollCaptionTime();
    }

    public long closeDelay() {
        if (m4928X() instanceof FullScreenVideo) {
            return ((FullScreenVideo) m4928X()).getCloseDelay();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo5423a(ArrayList<AppnextAd> arrayList, String str, String str2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd appnextAd = (AppnextAd) it.next();
            if (m4933b(appnextAd) && !m4934b(appnextAd.getBannerID(), str) && !appnextAd.getBannerID().equals(str2)) {
                return appnextAd;
            }
        }
        C1334j.m5708cI().mo6262aO(str);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AppnextAd appnextAd2 = (AppnextAd) it2.next();
            if (m4933b(appnextAd2) && !m4934b(appnextAd2.getBannerID(), str)) {
                return appnextAd2;
            }
        }
        return null;
    }

    /* renamed from: b */
    protected static boolean m4934b(String str, String str2) {
        return C1334j.m5708cI().mo6266p(str, str2);
    }

    /* renamed from: b */
    private static boolean m4933b(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        Resources resources = getResources();
        StringBuilder sb = new StringBuilder("S");
        sb.append(this.state + 1);
        m4936c(str, resources.getResourceEntryName(getTemplate(sb.toString())));
    }

    /* renamed from: c */
    private void m4936c(String str, String str2) {
        try {
            C1326f.m5665a(m4928X().getTID(), m4928X().getVID(), m4928X().getAUID(), this.placementID, m4928X().getSessionId(), str, str2, this.f3596dz != null ? this.f3596dz.getBannerID() : "", this.f3596dz != null ? this.f3596dz.getCampaignID() : "");
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public Video m4928X() {
        if (Video.currentAd != null) {
            return Video.currentAd;
        }
        return this.f3591dD;
    }

    public Uri getSelectedVideoUri() {
        String str;
        String videoUrl = C1083b.getVideoUrl(this.f3596dz, m4928X().getVideoLength());
        String N = C1083b.m4960N(videoUrl);
        if (Video.getCacheVideo()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getFilesDir().getAbsolutePath());
            sb.append("/data/appnext/videos/");
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getFilesDir().getAbsolutePath());
            sb2.append("/data/appnext/videos/");
            sb2.append("tmp/vid");
            sb2.append(m4928X().rnd);
            sb2.append("/");
            str = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(N);
        File file = new File(sb3.toString());
        if (file.exists()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(N);
            Uri parse = Uri.parse(sb4.toString());
            new StringBuilder("playing video ").append(parse.getPath());
            return parse;
        }
        Uri parse2 = Uri.parse(videoUrl);
        new StringBuilder("playing video from web: ").append(videoUrl);
        new StringBuilder("file not found: ").append(file.getAbsolutePath());
        return parse2;
    }
}
