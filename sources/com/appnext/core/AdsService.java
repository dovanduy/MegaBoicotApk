package com.appnext.core;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.ResultReceiver;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class AdsService extends IntentService {
    public static final int ADD_PACK = 8348;
    public static final int START_APP = 8346;
    /* access modifiers changed from: private */

    /* renamed from: kl */
    public static HashMap<String, C1342n> f4098kl = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: km */
    public Runnable f4099km = new Runnable() {
        public final void run() {
            try {
                for (Entry entry : new HashMap(AdsService.f4098kl).entrySet()) {
                    C1342n nVar = (C1342n) entry.getValue();
                    if (AdsService.this.m5559aG(nVar.f4243bf)) {
                        new Bundle().putAll(nVar.f4244lx);
                        AdsService.this.mo6084a(nVar);
                        AdsService.f4098kl.remove(entry.getKey());
                        AdsService.this.startActivity(AdsService.this.getPackageManager().getLaunchIntentForPackage(nVar.f4243bf));
                    }
                }
                if (AdsService.this.mHandler != null) {
                    if (AdsService.f4098kl.entrySet().size() > 0) {
                        AdsService.this.mHandler.postDelayed(AdsService.this.f4099km, 10000);
                    } else {
                        AdsService.this.mHandler.removeCallbacksAndMessages(null);
                        AdsService.this.mHandler = null;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    };
    /* access modifiers changed from: private */
    public Handler mHandler;
    Messenger mMessenger = new Messenger(new C1292a());

    /* renamed from: com.appnext.core.AdsService$a */
    class C1292a extends Handler {
        C1292a() {
        }

        public final void handleMessage(Message message) {
            if (message.what != 8348) {
                super.handleMessage(message);
                return;
            }
            Bundle data = message.getData();
            AdsService.this.addPack(data.getString("package"), data, (ResultReceiver) data.getParcelable("receiver"));
            new StringBuilder("Package added: ").append(data.getString("package"));
        }
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }

    public AdsService() {
        super("AdsService");
    }

    public void onDestroy() {
        super.onDestroy();
        f4098kl.clear();
        if (this.mHandler != null) {
            this.mHandler.removeCallbacksAndMessages(null);
        }
        this.mHandler = null;
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent.getIntExtra("added_info", 0) == 8348) {
            addPack(intent.getStringExtra("package"), intent.getExtras(), (ResultReceiver) intent.getParcelableExtra("receiver"));
            new StringBuilder("Package added: ").append(intent.getStringExtra("package"));
        }
    }

    public void addPack(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (f4098kl == null) {
            f4098kl = new HashMap<>();
        }
        if (f4098kl.containsKey(str)) {
            C1342n nVar = (C1342n) f4098kl.get(str);
            if (nVar == null) {
                addPack(str, bundle, resultReceiver);
                return;
            }
            nVar.f4244lx = bundle;
            f4098kl.put(str, nVar);
            return;
        }
        C1342n nVar2 = new C1342n();
        nVar2.f4243bf = str;
        nVar2.f4244lx = bundle;
        f4098kl.put(str, nVar2);
        if (this.mHandler == null) {
            this.mHandler = new Handler();
            this.mHandler.postDelayed(this.f4099km, 10000);
        }
    }

    /* renamed from: a */
    private void m5557a(String str, Bundle bundle, ResultReceiver resultReceiver) {
        C1342n nVar = (C1342n) f4098kl.get(str);
        if (nVar == null) {
            addPack(str, bundle, resultReceiver);
            return;
        }
        nVar.f4244lx = bundle;
        f4098kl.put(str, nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: aG */
    public boolean m5559aG(String str) {
        try {
            getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo6084a(final C1342n nVar) {
        new Thread(new Runnable() {
            public final void run() {
                HashMap hashMap = new HashMap();
                hashMap.put("guid", nVar.f4244lx.getString("guid"));
                hashMap.put("zone", nVar.f4244lx.getString("zone") == null ? "" : nVar.f4244lx.getString("zone"));
                hashMap.put("adsID", C1326f.m5675b((Context) AdsService.this, true));
                hashMap.put("isApk", "0");
                hashMap.put("bannerid", nVar.f4244lx.getString("bannerid"));
                hashMap.put("placementid", nVar.f4244lx.getString("placementid"));
                hashMap.put("vid", nVar.f4244lx.getString("vid"));
                hashMap.put("tid", nVar.f4244lx.getString("tid", ""));
                hashMap.put("osid", "100");
                hashMap.put("auid", nVar.f4244lx.getString("auid", ""));
                String installerPackageName = AdsService.this.getPackageManager().getInstallerPackageName(nVar.f4243bf);
                String str = "installer";
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                hashMap.put(str, installerPackageName);
                try {
                    C1326f.m5659a("https://admin.appnext.com/AdminService.asmx/SetOpenV1", hashMap);
                } catch (IOException unused) {
                }
            }
        }).start();
    }

    public IBinder onBind(Intent intent) {
        return this.mMessenger.getBinder();
    }
}
