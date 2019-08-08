package android.support.p017v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: android.support.v4.content.f */
/* compiled from: LocalBroadcastManager */
public final class C0362f {

    /* renamed from: f */
    private static final Object f912f = new Object();

    /* renamed from: g */
    private static C0362f f913g;

    /* renamed from: a */
    private final Context f914a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<C0365b>> f915b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<C0365b>> f916c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<C0364a> f917d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f918e;

    /* renamed from: android.support.v4.content.f$a */
    /* compiled from: LocalBroadcastManager */
    private static final class C0364a {

        /* renamed from: a */
        final Intent f920a;

        /* renamed from: b */
        final ArrayList<C0365b> f921b;

        C0364a(Intent intent, ArrayList<C0365b> arrayList) {
            this.f920a = intent;
            this.f921b = arrayList;
        }
    }

    /* renamed from: android.support.v4.content.f$b */
    /* compiled from: LocalBroadcastManager */
    private static final class C0365b {

        /* renamed from: a */
        final IntentFilter f922a;

        /* renamed from: b */
        final BroadcastReceiver f923b;

        /* renamed from: c */
        boolean f924c;

        /* renamed from: d */
        boolean f925d;

        C0365b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f922a = intentFilter;
            this.f923b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f923b);
            sb.append(" filter=");
            sb.append(this.f922a);
            if (this.f925d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static C0362f m1362a(Context context) {
        C0362f fVar;
        synchronized (f912f) {
            if (f913g == null) {
                f913g = new C0362f(context.getApplicationContext());
            }
            fVar = f913g;
        }
        return fVar;
    }

    private C0362f(Context context) {
        this.f914a = context;
        this.f918e = new Handler(context.getMainLooper()) {
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    C0362f.this.mo1249a();
                }
            }
        };
    }

    /* renamed from: a */
    public void mo1251a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f915b) {
            C0365b bVar = new C0365b(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.f915b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f915b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f916c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f916c.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public void mo1250a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f915b) {
            ArrayList arrayList = (ArrayList) this.f915b.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C0365b bVar = (C0365b) arrayList.get(size);
                    bVar.f925d = true;
                    for (int i = 0; i < bVar.f922a.countActions(); i++) {
                        String action = bVar.f922a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f916c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C0365b bVar2 = (C0365b) arrayList2.get(size2);
                                if (bVar2.f923b == broadcastReceiver) {
                                    bVar2.f925d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f916c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016f, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1252a(android.content.Intent r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.support.v4.content.f$b>> r3 = r1.f915b
            monitor-enter(r3)
            java.lang.String r11 = r24.getAction()     // Catch:{ all -> 0x0173 }
            android.content.Context r4 = r1.f914a     // Catch:{ all -> 0x0173 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0173 }
            java.lang.String r12 = r2.resolveTypeIfNeeded(r4)     // Catch:{ all -> 0x0173 }
            android.net.Uri r13 = r24.getData()     // Catch:{ all -> 0x0173 }
            java.lang.String r14 = r24.getScheme()     // Catch:{ all -> 0x0173 }
            java.util.Set r15 = r24.getCategories()     // Catch:{ all -> 0x0173 }
            int r4 = r24.getFlags()     // Catch:{ all -> 0x0173 }
            r4 = r4 & 8
            if (r4 == 0) goto L_0x002c
            r16 = 1
            goto L_0x002e
        L_0x002c:
            r16 = 0
        L_0x002e:
            if (r16 == 0) goto L_0x0056
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            r5.<init>()     // Catch:{ all -> 0x0173 }
            java.lang.String r6 = "Resolving type "
            r5.append(r6)     // Catch:{ all -> 0x0173 }
            r5.append(r12)     // Catch:{ all -> 0x0173 }
            java.lang.String r6 = " scheme "
            r5.append(r6)     // Catch:{ all -> 0x0173 }
            r5.append(r14)     // Catch:{ all -> 0x0173 }
            java.lang.String r6 = " of intent "
            r5.append(r6)     // Catch:{ all -> 0x0173 }
            r5.append(r2)     // Catch:{ all -> 0x0173 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0173 }
            android.util.Log.v(r4, r5)     // Catch:{ all -> 0x0173 }
        L_0x0056:
            java.util.HashMap<java.lang.String, java.util.ArrayList<android.support.v4.content.f$b>> r4 = r1.f916c     // Catch:{ all -> 0x0173 }
            java.lang.String r5 = r24.getAction()     // Catch:{ all -> 0x0173 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0173 }
            r8 = r4
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0173 }
            if (r8 == 0) goto L_0x0170
            if (r16 == 0) goto L_0x007d
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            r5.<init>()     // Catch:{ all -> 0x0173 }
            java.lang.String r6 = "Action list: "
            r5.append(r6)     // Catch:{ all -> 0x0173 }
            r5.append(r8)     // Catch:{ all -> 0x0173 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0173 }
            android.util.Log.v(r4, r5)     // Catch:{ all -> 0x0173 }
        L_0x007d:
            r4 = 0
            r6 = r4
            r7 = 0
        L_0x0080:
            int r4 = r8.size()     // Catch:{ all -> 0x0173 }
            if (r7 >= r4) goto L_0x0140
            java.lang.Object r4 = r8.get(r7)     // Catch:{ all -> 0x0173 }
            r5 = r4
            android.support.v4.content.f$b r5 = (android.support.p017v4.content.C0362f.C0365b) r5     // Catch:{ all -> 0x0173 }
            if (r16 == 0) goto L_0x00a7
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            r9.<init>()     // Catch:{ all -> 0x0173 }
            java.lang.String r10 = "Matching against filter "
            r9.append(r10)     // Catch:{ all -> 0x0173 }
            android.content.IntentFilter r10 = r5.f922a     // Catch:{ all -> 0x0173 }
            r9.append(r10)     // Catch:{ all -> 0x0173 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0173 }
            android.util.Log.v(r4, r9)     // Catch:{ all -> 0x0173 }
        L_0x00a7:
            boolean r4 = r5.f924c     // Catch:{ all -> 0x0173 }
            if (r4 == 0) goto L_0x00c2
            if (r16 == 0) goto L_0x00b4
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.String r5 = "  Filter's target already added"
            android.util.Log.v(r4, r5)     // Catch:{ all -> 0x0173 }
        L_0x00b4:
            r18 = r7
            r19 = r8
            r17 = r11
            r20 = r12
            r21 = r13
            r13 = 1
            r11 = r6
            goto L_0x0133
        L_0x00c2:
            android.content.IntentFilter r4 = r5.f922a     // Catch:{ all -> 0x0173 }
            java.lang.String r10 = "LocalBroadcastManager"
            r9 = r5
            r5 = r11
            r17 = r11
            r11 = r6
            r6 = r12
            r18 = r7
            r7 = r14
            r19 = r8
            r8 = r13
            r20 = r12
            r21 = r13
            r13 = 1
            r12 = r9
            r9 = r15
            int r4 = r4.match(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0173 }
            if (r4 < 0) goto L_0x010a
            if (r16 == 0) goto L_0x00fb
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            r6.<init>()     // Catch:{ all -> 0x0173 }
            java.lang.String r7 = "  Filter matched!  match=0x"
            r6.append(r7)     // Catch:{ all -> 0x0173 }
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch:{ all -> 0x0173 }
            r6.append(r4)     // Catch:{ all -> 0x0173 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0173 }
            android.util.Log.v(r5, r4)     // Catch:{ all -> 0x0173 }
        L_0x00fb:
            if (r11 != 0) goto L_0x0103
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0173 }
            r6.<init>()     // Catch:{ all -> 0x0173 }
            goto L_0x0104
        L_0x0103:
            r6 = r11
        L_0x0104:
            r6.add(r12)     // Catch:{ all -> 0x0173 }
            r12.f924c = r13     // Catch:{ all -> 0x0173 }
            goto L_0x0134
        L_0x010a:
            if (r16 == 0) goto L_0x0133
            switch(r4) {
                case -4: goto L_0x011b;
                case -3: goto L_0x0118;
                case -2: goto L_0x0115;
                case -1: goto L_0x0112;
                default: goto L_0x010f;
            }     // Catch:{ all -> 0x0173 }
        L_0x010f:
            java.lang.String r4 = "unknown reason"
            goto L_0x011d
        L_0x0112:
            java.lang.String r4 = "type"
            goto L_0x011d
        L_0x0115:
            java.lang.String r4 = "data"
            goto L_0x011d
        L_0x0118:
            java.lang.String r4 = "action"
            goto L_0x011d
        L_0x011b:
            java.lang.String r4 = "category"
        L_0x011d:
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            r6.<init>()     // Catch:{ all -> 0x0173 }
            java.lang.String r7 = "  Filter did not match: "
            r6.append(r7)     // Catch:{ all -> 0x0173 }
            r6.append(r4)     // Catch:{ all -> 0x0173 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0173 }
            android.util.Log.v(r5, r4)     // Catch:{ all -> 0x0173 }
        L_0x0133:
            r6 = r11
        L_0x0134:
            int r7 = r18 + 1
            r11 = r17
            r8 = r19
            r12 = r20
            r13 = r21
            goto L_0x0080
        L_0x0140:
            r11 = r6
            r13 = 1
            if (r11 == 0) goto L_0x0170
            r4 = 0
        L_0x0145:
            int r5 = r11.size()     // Catch:{ all -> 0x0173 }
            if (r4 >= r5) goto L_0x0157
            java.lang.Object r5 = r11.get(r4)     // Catch:{ all -> 0x0173 }
            android.support.v4.content.f$b r5 = (android.support.p017v4.content.C0362f.C0365b) r5     // Catch:{ all -> 0x0173 }
            r6 = 0
            r5.f924c = r6     // Catch:{ all -> 0x0173 }
            int r4 = r4 + 1
            goto L_0x0145
        L_0x0157:
            java.util.ArrayList<android.support.v4.content.f$a> r4 = r1.f917d     // Catch:{ all -> 0x0173 }
            android.support.v4.content.f$a r5 = new android.support.v4.content.f$a     // Catch:{ all -> 0x0173 }
            r5.<init>(r2, r11)     // Catch:{ all -> 0x0173 }
            r4.add(r5)     // Catch:{ all -> 0x0173 }
            android.os.Handler r2 = r1.f918e     // Catch:{ all -> 0x0173 }
            boolean r2 = r2.hasMessages(r13)     // Catch:{ all -> 0x0173 }
            if (r2 != 0) goto L_0x016e
            android.os.Handler r2 = r1.f918e     // Catch:{ all -> 0x0173 }
            r2.sendEmptyMessage(r13)     // Catch:{ all -> 0x0173 }
        L_0x016e:
            monitor-exit(r3)     // Catch:{ all -> 0x0173 }
            return r13
        L_0x0170:
            r6 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0173 }
            return r6
        L_0x0173:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0173 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.content.C0362f.mo1252a(android.content.Intent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r2 >= r1.length) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r3 = r1[r2];
        r4 = r3.f921b.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r5 >= r4) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r6 = (android.support.p017v4.content.C0362f.C0365b) r3.f921b.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r6.f925d != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r6.f923b.onReceive(r9.f914a, r3.f920a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r2 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1249a() {
        /*
            r9 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.support.v4.content.f$b>> r0 = r9.f915b
            monitor-enter(r0)
            java.util.ArrayList<android.support.v4.content.f$a> r1 = r9.f917d     // Catch:{ all -> 0x0045 }
            int r1 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x000d:
            android.support.v4.content.f$a[] r1 = new android.support.p017v4.content.C0362f.C0364a[r1]     // Catch:{ all -> 0x0045 }
            java.util.ArrayList<android.support.v4.content.f$a> r2 = r9.f917d     // Catch:{ all -> 0x0045 }
            r2.toArray(r1)     // Catch:{ all -> 0x0045 }
            java.util.ArrayList<android.support.v4.content.f$a> r2 = r9.f917d     // Catch:{ all -> 0x0045 }
            r2.clear()     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r0 = 0
            r2 = r0
        L_0x001c:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0000
            r3 = r1[r2]
            java.util.ArrayList<android.support.v4.content.f$b> r4 = r3.f921b
            int r4 = r4.size()
            r5 = r0
        L_0x0028:
            if (r5 >= r4) goto L_0x0042
            java.util.ArrayList<android.support.v4.content.f$b> r6 = r3.f921b
            java.lang.Object r6 = r6.get(r5)
            android.support.v4.content.f$b r6 = (android.support.p017v4.content.C0362f.C0365b) r6
            boolean r7 = r6.f925d
            if (r7 != 0) goto L_0x003f
            android.content.BroadcastReceiver r6 = r6.f923b
            android.content.Context r7 = r9.f914a
            android.content.Intent r8 = r3.f920a
            r6.onReceive(r7, r8)
        L_0x003f:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0042:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0045:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.content.C0362f.mo1249a():void");
    }
}
