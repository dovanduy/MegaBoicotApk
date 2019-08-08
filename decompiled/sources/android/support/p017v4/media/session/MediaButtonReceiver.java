package android.support.p017v4.media.session;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.support.p017v4.media.MediaBrowserCompat;
import android.support.p017v4.media.MediaBrowserCompat.C0425b;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaButtonReceiver */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: android.support.v4.media.session.MediaButtonReceiver$a */
    private static class C0500a extends C0425b {

        /* renamed from: c */
        private final Context f1240c;

        /* renamed from: d */
        private final Intent f1241d;

        /* renamed from: e */
        private final PendingResult f1242e;

        /* renamed from: f */
        private MediaBrowserCompat f1243f;

        C0500a(Context context, Intent intent, PendingResult pendingResult) {
            this.f1240c = context;
            this.f1241d = intent;
            this.f1242e = pendingResult;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1679a(MediaBrowserCompat mediaBrowserCompat) {
            this.f1243f = mediaBrowserCompat;
        }

        /* renamed from: a */
        public void mo1509a() {
            try {
                new MediaControllerCompat(this.f1240c, this.f1243f.mo1498c()).mo1680a((KeyEvent) this.f1241d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException e) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
            }
            m1820d();
        }

        /* renamed from: b */
        public void mo1511b() {
            m1820d();
        }

        /* renamed from: c */
        public void mo1512c() {
            m1820d();
        }

        /* renamed from: d */
        private void m1820d() {
            this.f1243f.mo1497b();
            this.f1242e.finish();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignore unsupported intent: ");
            sb.append(intent);
            Log.d("MediaButtonReceiver", sb.toString());
            return;
        }
        ComponentName a = m1818a(context, "android.intent.action.MEDIA_BUTTON");
        if (a != null) {
            intent.setComponent(a);
            m1819a(context, intent);
            return;
        }
        ComponentName a2 = m1818a(context, "android.media.browse.MediaBrowserService");
        if (a2 != null) {
            PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C0500a aVar = new C0500a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a2, aVar, null);
            aVar.mo1679a(mediaBrowserCompat);
            mediaBrowserCompat.mo1496a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }

    /* renamed from: a */
    private static void m1819a(Context context, Intent intent) {
        if (VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* renamed from: a */
    private static ComponentName m1818a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected 1 service that handles ");
            sb.append(str);
            sb.append(", found ");
            sb.append(queryIntentServices.size());
            throw new IllegalStateException(sb.toString());
        }
    }
}
