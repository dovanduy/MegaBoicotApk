package com.startapp.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.startapp.common.b */
/* compiled from: StartAppSDK */
public class C5523b {

    /* renamed from: f */
    private static final Object f17574f = new Object();

    /* renamed from: g */
    private static C5523b f17575g;

    /* renamed from: a */
    private final Context f17576a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f17577b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<C5526b>> f17578c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<C5525a> f17579d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f17580e;

    /* renamed from: com.startapp.common.b$a */
    /* compiled from: StartAppSDK */
    private static class C5525a {

        /* renamed from: a */
        final Intent f17582a;

        /* renamed from: b */
        final ArrayList<C5526b> f17583b;

        C5525a(Intent intent, ArrayList<C5526b> arrayList) {
            this.f17582a = intent;
            this.f17583b = arrayList;
        }
    }

    /* renamed from: com.startapp.common.b$b */
    /* compiled from: StartAppSDK */
    private static class C5526b {

        /* renamed from: a */
        final IntentFilter f17584a;

        /* renamed from: b */
        final BroadcastReceiver f17585b;

        /* renamed from: c */
        boolean f17586c;

        C5526b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f17584a = intentFilter;
            this.f17585b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f17585b);
            sb.append(" filter=");
            sb.append(this.f17584a);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static C5523b m23588a(Context context) {
        C5523b bVar;
        synchronized (f17574f) {
            if (f17575g == null) {
                f17575g = new C5523b(context.getApplicationContext());
            }
            bVar = f17575g;
        }
        return bVar;
    }

    private C5523b(Context context) {
        this.f17576a = context;
        this.f17580e = new Handler(context.getMainLooper()) {
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    C5523b.this.mo20503a();
                }
            }
        };
    }

    /* renamed from: a */
    public void mo20505a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f17577b) {
            C5526b bVar = new C5526b(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.f17577b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f17577b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f17578c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f17578c.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public void mo20504a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f17577b) {
            ArrayList arrayList = (ArrayList) this.f17577b.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                    for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                        String action = intentFilter.getAction(i2);
                        ArrayList arrayList2 = (ArrayList) this.f17578c.get(action);
                        if (arrayList2 != null) {
                            int i3 = 0;
                            while (i3 < arrayList2.size()) {
                                if (((C5526b) arrayList2.get(i3)).f17585b == broadcastReceiver) {
                                    arrayList2.remove(i3);
                                    i3--;
                                }
                                i3++;
                            }
                            if (arrayList2.size() <= 0) {
                                this.f17578c.remove(action);
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
    public boolean mo20506a(android.content.Intent r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r3 = r1.f17577b
            monitor-enter(r3)
            java.lang.String r11 = r24.getAction()     // Catch:{ all -> 0x0173 }
            android.content.Context r4 = r1.f17576a     // Catch:{ all -> 0x0173 }
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
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.startapp.common.b$b>> r4 = r1.f17578c     // Catch:{ all -> 0x0173 }
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
            com.startapp.common.b$b r5 = (com.startapp.common.C5523b.C5526b) r5     // Catch:{ all -> 0x0173 }
            if (r16 == 0) goto L_0x00a7
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            r9.<init>()     // Catch:{ all -> 0x0173 }
            java.lang.String r10 = "Matching against filter "
            r9.append(r10)     // Catch:{ all -> 0x0173 }
            android.content.IntentFilter r10 = r5.f17584a     // Catch:{ all -> 0x0173 }
            r9.append(r10)     // Catch:{ all -> 0x0173 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0173 }
            android.util.Log.v(r4, r9)     // Catch:{ all -> 0x0173 }
        L_0x00a7:
            boolean r4 = r5.f17586c     // Catch:{ all -> 0x0173 }
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
            android.content.IntentFilter r4 = r5.f17584a     // Catch:{ all -> 0x0173 }
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
            r12.f17586c = r13     // Catch:{ all -> 0x0173 }
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
            com.startapp.common.b$b r5 = (com.startapp.common.C5523b.C5526b) r5     // Catch:{ all -> 0x0173 }
            r6 = 0
            r5.f17586c = r6     // Catch:{ all -> 0x0173 }
            int r4 = r4 + 1
            goto L_0x0145
        L_0x0157:
            java.util.ArrayList<com.startapp.common.b$a> r4 = r1.f17579d     // Catch:{ all -> 0x0173 }
            com.startapp.common.b$a r5 = new com.startapp.common.b$a     // Catch:{ all -> 0x0173 }
            r5.<init>(r2, r11)     // Catch:{ all -> 0x0173 }
            r4.add(r5)     // Catch:{ all -> 0x0173 }
            android.os.Handler r2 = r1.f17580e     // Catch:{ all -> 0x0173 }
            boolean r2 = r2.hasMessages(r13)     // Catch:{ all -> 0x0173 }
            if (r2 != 0) goto L_0x016e
            android.os.Handler r2 = r1.f17580e     // Catch:{ all -> 0x0173 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.common.C5523b.mo20506a(android.content.Intent):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r2 >= r1.length) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r3 = r1[r2];
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r4 >= r3.f17583b.size()) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        ((com.startapp.common.C5523b.C5526b) r3.f17583b.get(r4)).f17585b.onReceive(r8.f17576a, r3.f17582a);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r2 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20503a() {
        /*
            r8 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r0 = r8.f17577b
            monitor-enter(r0)
            java.util.ArrayList<com.startapp.common.b$a> r1 = r8.f17579d     // Catch:{ all -> 0x0041 }
            int r1 = r1.size()     // Catch:{ all -> 0x0041 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x000d:
            com.startapp.common.b$a[] r1 = new com.startapp.common.C5523b.C5525a[r1]     // Catch:{ all -> 0x0041 }
            java.util.ArrayList<com.startapp.common.b$a> r2 = r8.f17579d     // Catch:{ all -> 0x0041 }
            r2.toArray(r1)     // Catch:{ all -> 0x0041 }
            java.util.ArrayList<com.startapp.common.b$a> r2 = r8.f17579d     // Catch:{ all -> 0x0041 }
            r2.clear()     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            r0 = 0
            r2 = r0
        L_0x001c:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0000
            r3 = r1[r2]
            r4 = r0
        L_0x0022:
            java.util.ArrayList<com.startapp.common.b$b> r5 = r3.f17583b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x003e
            java.util.ArrayList<com.startapp.common.b$b> r5 = r3.f17583b
            java.lang.Object r5 = r5.get(r4)
            com.startapp.common.b$b r5 = (com.startapp.common.C5523b.C5526b) r5
            android.content.BroadcastReceiver r5 = r5.f17585b
            android.content.Context r6 = r8.f17576a
            android.content.Intent r7 = r3.f17582a
            r5.onReceive(r6, r7)
            int r4 = r4 + 1
            goto L_0x0022
        L_0x003e:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.common.C5523b.mo20503a():void");
    }
}
