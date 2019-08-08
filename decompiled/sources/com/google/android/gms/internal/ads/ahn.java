package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.ads.p135a.C2961a;
import com.google.android.gms.common.C3412e;
import com.google.android.gms.common.C3413f;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ahn {

    /* renamed from: b */
    private static final String f11056b = "ahn";

    /* renamed from: a */
    protected Context f11057a;

    /* renamed from: c */
    private ExecutorService f11058c;

    /* renamed from: d */
    private DexClassLoader f11059d;

    /* renamed from: e */
    private agy f11060e;

    /* renamed from: f */
    private byte[] f11061f;

    /* renamed from: g */
    private volatile C2961a f11062g = null;

    /* renamed from: h */
    private volatile boolean f11063h = false;

    /* renamed from: i */
    private Future f11064i = null;

    /* renamed from: j */
    private boolean f11065j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile C4378zo f11066k = null;

    /* renamed from: l */
    private Future f11067l = null;

    /* renamed from: m */
    private agq f11068m;

    /* renamed from: n */
    private boolean f11069n = false;

    /* renamed from: o */
    private boolean f11070o = false;

    /* renamed from: p */
    private Map<Pair<String, String>, aiw> f11071p;

    /* renamed from: q */
    private boolean f11072q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f11073r;

    /* renamed from: s */
    private boolean f11074s;

    /* renamed from: com.google.android.gms.internal.ads.ahn$a */
    final class C3652a extends BroadcastReceiver {
        private C3652a() {
        }

        /* synthetic */ C3652a(ahn ahn, ahp ahp) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                ahn.this.f11073r = true;
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                ahn.this.f11073r = false;
            }
        }
    }

    private ahn(Context context) {
        boolean z = true;
        this.f11073r = true;
        this.f11074s = false;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            z = false;
        }
        this.f11065j = z;
        if (this.f11065j) {
            context = applicationContext;
        }
        this.f11057a = context;
        this.f11071p = new HashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(2:22|23))|24|25|26|(15:27|28|(2:30|(2:32|33))|34|(1:36)|37|38|39|40|41|42|43|(1:45)|46|47)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[Catch:{ agz -> 0x0150, ahk -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086 A[Catch:{ all -> 0x011d, FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0 A[Catch:{ all -> 0x011d, FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f8 A[Catch:{ agz -> 0x0150, ahk -> 0x0157 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.ahn m14121a(android.content.Context r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            com.google.android.gms.internal.ads.ahn r0 = new com.google.android.gms.internal.ads.ahn
            r0.<init>(r8)
            com.google.android.gms.internal.ads.ahp r8 = new com.google.android.gms.internal.ads.ahp     // Catch:{ ahk -> 0x0157 }
            r8.<init>()     // Catch:{ ahk -> 0x0157 }
            java.util.concurrent.ExecutorService r8 = java.util.concurrent.Executors.newCachedThreadPool(r8)     // Catch:{ ahk -> 0x0157 }
            r0.f11058c = r8     // Catch:{ ahk -> 0x0157 }
            r0.f11063h = r11     // Catch:{ ahk -> 0x0157 }
            if (r11 == 0) goto L_0x0021
            java.util.concurrent.ExecutorService r8 = r0.f11058c     // Catch:{ ahk -> 0x0157 }
            com.google.android.gms.internal.ads.ahq r11 = new com.google.android.gms.internal.ads.ahq     // Catch:{ ahk -> 0x0157 }
            r11.<init>(r0)     // Catch:{ ahk -> 0x0157 }
            java.util.concurrent.Future r8 = r8.submit(r11)     // Catch:{ ahk -> 0x0157 }
            r0.f11064i = r8     // Catch:{ ahk -> 0x0157 }
        L_0x0021:
            java.util.concurrent.ExecutorService r8 = r0.f11058c     // Catch:{ ahk -> 0x0157 }
            com.google.android.gms.internal.ads.ahs r11 = new com.google.android.gms.internal.ads.ahs     // Catch:{ ahk -> 0x0157 }
            r11.<init>(r0)     // Catch:{ ahk -> 0x0157 }
            r8.execute(r11)     // Catch:{ ahk -> 0x0157 }
            r8 = 0
            r11 = 1
            com.google.android.gms.common.d r1 = com.google.android.gms.common.C3407d.m12253b()     // Catch:{ Throwable -> 0x004b }
            android.content.Context r2 = r0.f11057a     // Catch:{ Throwable -> 0x004b }
            int r2 = r1.mo13418d(r2)     // Catch:{ Throwable -> 0x004b }
            if (r2 <= 0) goto L_0x003b
            r2 = r11
            goto L_0x003c
        L_0x003b:
            r2 = r8
        L_0x003c:
            r0.f11069n = r2     // Catch:{ Throwable -> 0x004b }
            android.content.Context r2 = r0.f11057a     // Catch:{ Throwable -> 0x004b }
            int r1 = r1.mo13397a(r2)     // Catch:{ Throwable -> 0x004b }
            if (r1 != 0) goto L_0x0048
            r1 = r11
            goto L_0x0049
        L_0x0048:
            r1 = r8
        L_0x0049:
            r0.f11070o = r1     // Catch:{ Throwable -> 0x004b }
        L_0x004b:
            r0.mo14303a(r8, r11)     // Catch:{ ahk -> 0x0157 }
            boolean r1 = com.google.android.gms.internal.ads.ahv.m14162a()     // Catch:{ ahk -> 0x0157 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.aru.f11841bM     // Catch:{ ahk -> 0x0157 }
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ ahk -> 0x0157 }
            java.lang.Object r1 = r2.mo14695a(r1)     // Catch:{ ahk -> 0x0157 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ ahk -> 0x0157 }
            boolean r1 = r1.booleanValue()     // Catch:{ ahk -> 0x0157 }
            if (r1 == 0) goto L_0x006e
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ ahk -> 0x0157 }
            java.lang.String r9 = "Task Context initialization must not be called from the UI thread."
            r8.<init>(r9)     // Catch:{ ahk -> 0x0157 }
            throw r8     // Catch:{ ahk -> 0x0157 }
        L_0x006e:
            com.google.android.gms.internal.ads.agy r1 = new com.google.android.gms.internal.ads.agy     // Catch:{ ahk -> 0x0157 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ ahk -> 0x0157 }
            r0.f11060e = r1     // Catch:{ ahk -> 0x0157 }
            com.google.android.gms.internal.ads.agy r1 = r0.f11060e     // Catch:{ agz -> 0x0150 }
            byte[] r9 = r1.mo14291a(r9)     // Catch:{ agz -> 0x0150 }
            r0.f11061f = r9     // Catch:{ agz -> 0x0150 }
            android.content.Context r9 = r0.f11057a     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            java.io.File r9 = r9.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            if (r9 != 0) goto L_0x0096
            android.content.Context r9 = r0.f11057a     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r1 = "dex"
            java.io.File r9 = r9.getDir(r1, r8)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            if (r9 != 0) goto L_0x0096
            com.google.android.gms.internal.ads.ahk r8 = new com.google.android.gms.internal.ads.ahk     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            throw r8     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
        L_0x0096:
            java.lang.String r1 = "1521499837408"
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r4 = "%s/%s.jar"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r6[r8] = r9     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r6[r11] = r1     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r4 = java.lang.String.format(r4, r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            boolean r4 = r3.exists()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            if (r4 != 0) goto L_0x00c7
            com.google.android.gms.internal.ads.agy r4 = r0.f11060e     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            byte[] r6 = r0.f11061f     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            byte[] r10 = r4.mo14292a(r6, r10)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r3.createNewFile()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            int r6 = r10.length     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r4.write(r10, r8, r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
        L_0x00c7:
            r0.m14130b(r9, r1)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            dalvik.system.DexClassLoader r10 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x011d }
            java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ all -> 0x011d }
            java.lang.String r6 = r9.getAbsolutePath()     // Catch:{ all -> 0x011d }
            android.content.Context r7 = r0.f11057a     // Catch:{ all -> 0x011d }
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ all -> 0x011d }
            r10.<init>(r4, r6, r2, r7)     // Catch:{ all -> 0x011d }
            r0.f11059d = r10     // Catch:{ all -> 0x011d }
            m14124a(r3)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r0.m14125a(r9, r1)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r10 = "%s/%s.dex"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r3[r8] = r9     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r3[r11] = r1     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r8 = java.lang.String.format(r10, r3)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            m14126a(r8)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            boolean r8 = r0.f11074s     // Catch:{ ahk -> 0x0157 }
            if (r8 != 0) goto L_0x0113
            android.content.IntentFilter r8 = new android.content.IntentFilter     // Catch:{ ahk -> 0x0157 }
            r8.<init>()     // Catch:{ ahk -> 0x0157 }
            java.lang.String r9 = "android.intent.action.USER_PRESENT"
            r8.addAction(r9)     // Catch:{ ahk -> 0x0157 }
            java.lang.String r9 = "android.intent.action.SCREEN_OFF"
            r8.addAction(r9)     // Catch:{ ahk -> 0x0157 }
            android.content.Context r9 = r0.f11057a     // Catch:{ ahk -> 0x0157 }
            com.google.android.gms.internal.ads.ahn$a r10 = new com.google.android.gms.internal.ads.ahn$a     // Catch:{ ahk -> 0x0157 }
            r10.<init>(r0, r2)     // Catch:{ ahk -> 0x0157 }
            r9.registerReceiver(r10, r8)     // Catch:{ ahk -> 0x0157 }
            r0.f11074s = r11     // Catch:{ ahk -> 0x0157 }
        L_0x0113:
            com.google.android.gms.internal.ads.agq r8 = new com.google.android.gms.internal.ads.agq     // Catch:{ ahk -> 0x0157 }
            r8.<init>(r0)     // Catch:{ ahk -> 0x0157 }
            r0.f11068m = r8     // Catch:{ ahk -> 0x0157 }
            r0.f11072q = r11     // Catch:{ ahk -> 0x0157 }
            return r0
        L_0x011d:
            r10 = move-exception
            m14124a(r3)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r0.m14125a(r9, r1)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r2 = "%s/%s.dex"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r3[r8] = r9     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            r3[r11] = r1     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r8 = java.lang.String.format(r2, r3)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            m14126a(r8)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
            throw r10     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, agz -> 0x013b, NullPointerException -> 0x0134 }
        L_0x0134:
            r8 = move-exception
            com.google.android.gms.internal.ads.ahk r9 = new com.google.android.gms.internal.ads.ahk     // Catch:{ ahk -> 0x0157 }
            r9.<init>(r8)     // Catch:{ ahk -> 0x0157 }
            throw r9     // Catch:{ ahk -> 0x0157 }
        L_0x013b:
            r8 = move-exception
            com.google.android.gms.internal.ads.ahk r9 = new com.google.android.gms.internal.ads.ahk     // Catch:{ ahk -> 0x0157 }
            r9.<init>(r8)     // Catch:{ ahk -> 0x0157 }
            throw r9     // Catch:{ ahk -> 0x0157 }
        L_0x0142:
            r8 = move-exception
            com.google.android.gms.internal.ads.ahk r9 = new com.google.android.gms.internal.ads.ahk     // Catch:{ ahk -> 0x0157 }
            r9.<init>(r8)     // Catch:{ ahk -> 0x0157 }
            throw r9     // Catch:{ ahk -> 0x0157 }
        L_0x0149:
            r8 = move-exception
            com.google.android.gms.internal.ads.ahk r9 = new com.google.android.gms.internal.ads.ahk     // Catch:{ ahk -> 0x0157 }
            r9.<init>(r8)     // Catch:{ ahk -> 0x0157 }
            throw r9     // Catch:{ ahk -> 0x0157 }
        L_0x0150:
            r8 = move-exception
            com.google.android.gms.internal.ads.ahk r9 = new com.google.android.gms.internal.ads.ahk     // Catch:{ ahk -> 0x0157 }
            r9.<init>(r8)     // Catch:{ ahk -> 0x0157 }
            throw r9     // Catch:{ ahk -> 0x0157 }
        L_0x0157:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ahn.m14121a(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.ahn");
    }

    /* renamed from: a */
    private static void m14124a(File file) {
        if (!file.exists()) {
            Log.d(f11056b, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0091 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A[SYNTHETIC, Splitter:B:39:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A[SYNTHETIC, Splitter:B:43:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2 A[SYNTHETIC, Splitter:B:52:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7 A[SYNTHETIC, Splitter:B:56:0x00b7] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14125a(java.io.File r8, java.lang.String r9) {
        /*
            r7 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "%s/%s.tmp"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r8
            r5 = 1
            r3[r5] = r9
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x001b
            return
        L_0x001b:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "%s/%s.dex"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r8
            r2[r5] = r9
            java.lang.String r8 = java.lang.String.format(r3, r2)
            r1.<init>(r8)
            boolean r8 = r1.exists()
            if (r8 != 0) goto L_0x0033
            return
        L_0x0033:
            long r2 = r1.length()
            r5 = 0
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x003e
            return
        L_0x003e:
            int r8 = (int) r2
            byte[] r8 = new byte[r8]
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00af, all -> 0x009f }
            r3.<init>(r1)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00af, all -> 0x009f }
            int r5 = r3.read(r8)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            if (r5 > 0) goto L_0x0054
            r3.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            m14124a(r1)
            return
        L_0x0054:
            com.google.android.gms.internal.ads.ads r5 = new com.google.android.gms.internal.ads.ads     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.<init>()     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r6 = r6.getBytes()     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f10587d = r6     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r9 = r9.getBytes()     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f10586c = r9     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            com.google.android.gms.internal.ads.agy r9 = r7.f11060e     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r6 = r7.f11061f     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.lang.String r8 = r9.mo14290a(r6, r8)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r8 = r8.getBytes()     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f10584a = r8     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r8 = com.google.android.gms.internal.ads.afx.m14042a(r8)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f10585b = r8     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r0.createNewFile()     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r8.<init>(r0)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r9 = com.google.android.gms.internal.ads.afc.m13976a(r5)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            int r0 = r9.length     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r8.write(r9, r4, r0)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r8.close()     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r3.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            r8.close()     // Catch:{ IOException -> 0x0094 }
        L_0x0094:
            m14124a(r1)
            return
        L_0x0098:
            r9 = move-exception
            r2 = r8
            goto L_0x00a1
        L_0x009b:
            r2 = r8
            goto L_0x00b0
        L_0x009d:
            r9 = move-exception
            goto L_0x00a1
        L_0x009f:
            r9 = move-exception
            r3 = r2
        L_0x00a1:
            if (r3 == 0) goto L_0x00a6
            r3.close()     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            if (r2 == 0) goto L_0x00ab
            r2.close()     // Catch:{ IOException -> 0x00ab }
        L_0x00ab:
            m14124a(r1)
            throw r9
        L_0x00af:
            r3 = r2
        L_0x00b0:
            if (r3 == 0) goto L_0x00b5
            r3.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            if (r2 == 0) goto L_0x00ba
            r2.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            m14124a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ahn.m14125a(java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private static void m14126a(String str) {
        m14124a(new File(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m14129b(int i, C4378zo zoVar) {
        if (i < 4) {
            if (zoVar == null) {
                return true;
            }
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11844bP)).booleanValue() && (zoVar.f14342n == null || zoVar.f14342n.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11845bQ)).booleanValue() && (zoVar.f14309X == null || zoVar.f14309X.f10672a == null || zoVar.f14309X.f10672a.longValue() == -2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:29|30|31|32|33|34|35|36) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00b1 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7 A[SYNTHETIC, Splitter:B:52:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cc A[SYNTHETIC, Splitter:B:56:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3 A[SYNTHETIC, Splitter:B:64:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8 A[SYNTHETIC, Splitter:B:68:0x00d8] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m14130b(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "%s/%s.tmp"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r10
            r5 = 1
            r3[r5] = r11
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x001b
            return r4
        L_0x001b:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "%s/%s.dex"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r10
            r2[r5] = r11
            java.lang.String r10 = java.lang.String.format(r3, r2)
            r1.<init>(r10)
            boolean r10 = r1.exists()
            if (r10 == 0) goto L_0x0033
            return r4
        L_0x0033:
            r10 = 0
            long r2 = r0.length()     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0042
            m14124a(r0)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            return r4
        L_0x0042:
            int r2 = (int) r2     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            byte[] r2 = new byte[r2]     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            r3.<init>(r0)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            int r6 = r3.read(r2)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r6 > 0) goto L_0x005e
            java.lang.String r11 = f11056b     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r11, r1)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            m14124a(r0)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r3.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r4
        L_0x005e:
            com.google.android.gms.internal.ads.ads r6 = new com.google.android.gms.internal.ads.ads     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r6.<init>()     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            com.google.android.gms.internal.ads.afc r2 = com.google.android.gms.internal.ads.afc.m13974a(r6, r2)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            com.google.android.gms.internal.ads.ads r2 = (com.google.android.gms.internal.ads.C3643ads) r2     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r6 = new java.lang.String     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r7 = r2.f10586c     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r6.<init>(r7)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            boolean r11 = r11.equals(r6)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r11 == 0) goto L_0x00ba
            byte[] r11 = r2.f10585b     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r6 = r2.f10584a     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r6 = com.google.android.gms.internal.ads.afx.m14042a(r6)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r11 == 0) goto L_0x00ba
            byte[] r11 = r2.f10587d     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r6 = r6.getBytes()     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r11 != 0) goto L_0x0093
            goto L_0x00ba
        L_0x0093:
            com.google.android.gms.internal.ads.agy r11 = r9.f11060e     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r0 = r9.f11061f     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r6 = new java.lang.String     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r2 = r2.f10584a     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r6.<init>(r2)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r11 = r11.mo14292a(r0, r6)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r1.createNewFile()     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r0.<init>(r1)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            int r10 = r11.length     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b8, all -> 0x00b5 }
            r0.write(r11, r4, r10)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00b8, all -> 0x00b5 }
            r3.close()     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            r0.close()     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            return r5
        L_0x00b5:
            r11 = move-exception
            r10 = r0
            goto L_0x00c5
        L_0x00b8:
            r10 = r0
            goto L_0x00d1
        L_0x00ba:
            m14124a(r0)     // Catch:{ agz | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r3.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            return r4
        L_0x00c1:
            r11 = move-exception
            goto L_0x00c5
        L_0x00c3:
            r11 = move-exception
            r3 = r10
        L_0x00c5:
            if (r3 == 0) goto L_0x00ca
            r3.close()     // Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            if (r10 == 0) goto L_0x00cf
            r10.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            throw r11
        L_0x00d0:
            r3 = r10
        L_0x00d1:
            if (r3 == 0) goto L_0x00d6
            r3.close()     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            if (r10 == 0) goto L_0x00db
            r10.close()     // Catch:{ IOException -> 0x00db }
        L_0x00db:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ahn.m14130b(java.io.File, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m14131o() {
        try {
            if (this.f11062g == null && this.f11065j) {
                C2961a aVar = new C2961a(this.f11057a);
                aVar.mo12182a();
                this.f11062g = aVar;
            }
        } catch (C3412e | C3413f | IOException unused) {
            this.f11062g = null;
        }
    }

    /* renamed from: p */
    private final C4378zo m14132p() {
        try {
            return C4164sz.m18150a(this.f11057a, this.f11057a.getPackageName(), Integer.toString(this.f11057a.getPackageManager().getPackageInfo(this.f11057a.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Context mo14301a() {
        return this.f11057a;
    }

    /* renamed from: a */
    public final Method mo14302a(String str, String str2) {
        aiw aiw = (aiw) this.f11071p.get(new Pair(str, str2));
        if (aiw == null) {
            return null;
        }
        return aiw.mo14350a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14303a(int i, boolean z) {
        if (this.f11070o) {
            Future submit = this.f11058c.submit(new ahr(this, i, z));
            if (i == 0) {
                this.f11067l = submit;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo14304a(String str, String str2, Class<?>... clsArr) {
        if (this.f11071p.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f11071p.put(new Pair(str, str2), new aiw(this, str, str2, clsArr));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C4378zo mo14305b(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep((long) (i * AdError.NETWORK_ERROR_CODE));
            } catch (InterruptedException unused) {
            }
        }
        return m14132p();
    }

    /* renamed from: b */
    public final boolean mo14306b() {
        return this.f11072q;
    }

    /* renamed from: c */
    public final ExecutorService mo14307c() {
        return this.f11058c;
    }

    /* renamed from: d */
    public final DexClassLoader mo14308d() {
        return this.f11059d;
    }

    /* renamed from: e */
    public final agy mo14309e() {
        return this.f11060e;
    }

    /* renamed from: f */
    public final byte[] mo14310f() {
        return this.f11061f;
    }

    /* renamed from: g */
    public final boolean mo14311g() {
        return this.f11069n;
    }

    /* renamed from: h */
    public final agq mo14312h() {
        return this.f11068m;
    }

    /* renamed from: i */
    public final boolean mo14313i() {
        return this.f11070o;
    }

    /* renamed from: j */
    public final boolean mo14314j() {
        return this.f11073r;
    }

    /* renamed from: k */
    public final C4378zo mo14315k() {
        return this.f11066k;
    }

    /* renamed from: l */
    public final Future mo14316l() {
        return this.f11067l;
    }

    /* renamed from: m */
    public final C2961a mo14317m() {
        if (!this.f11063h) {
            return null;
        }
        if (this.f11062g != null) {
            return this.f11062g;
        }
        if (this.f11064i != null) {
            try {
                this.f11064i.get(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, TimeUnit.MILLISECONDS);
                this.f11064i = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f11064i.cancel(true);
            }
        }
        return this.f11062g;
    }

    /* renamed from: n */
    public final int mo14318n() {
        if (this.f11068m != null) {
            return agq.m14060a();
        }
        return Integer.MIN_VALUE;
    }
}
