package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.C2649m;
import com.facebook.appevents.p128b.C2408b;
import com.facebook.internal.C2479ad;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* renamed from: com.facebook.appevents.f */
/* compiled from: AppEventStore */
class C2434f {

    /* renamed from: a */
    private static final String f7699a = "com.facebook.appevents.f";

    /* renamed from: com.facebook.appevents.f$a */
    /* compiled from: AppEventStore */
    private static class C2435a extends ObjectInputStream {
        public C2435a(InputStream inputStream) throws IOException {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(C2384a.class);
            }
            return readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1") ? ObjectStreamClass.lookup(C2424a.class) : readClassDescriptor;
        }
    }

    C2434f() {
    }

    /* renamed from: a */
    public static synchronized void m9314a(C2382a aVar, C2446l lVar) {
        synchronized (C2434f.class) {
            C2408b.m9249a();
            C2443k a = m9313a();
            if (a.mo8863b(aVar)) {
                a.mo8860a(aVar).addAll(lVar.mo8868b());
            } else {
                a.mo8862a(aVar, lVar.mo8868b());
            }
            m9316a(a);
        }
    }

    /* renamed from: a */
    public static synchronized void m9315a(C2426d dVar) {
        synchronized (C2434f.class) {
            C2408b.m9249a();
            C2443k a = m9313a();
            for (C2382a aVar : dVar.mo8843a()) {
                a.mo8862a(aVar, dVar.mo8842a(aVar).mo8868b());
            }
            m9316a(a);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008a A[Catch:{ Exception -> 0x002e }] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.appevents.C2443k m9313a() {
        /*
            java.lang.Class<com.facebook.appevents.f> r0 = com.facebook.appevents.C2434f.class
            monitor-enter(r0)
            com.facebook.appevents.p128b.C2408b.m9249a()     // Catch:{ all -> 0x0091 }
            android.content.Context r1 = com.facebook.C2649m.m10133f()     // Catch:{ all -> 0x0091 }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003c, all -> 0x003a }
            com.facebook.appevents.f$a r4 = new com.facebook.appevents.f$a     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003c, all -> 0x003a }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003c, all -> 0x003a }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003c, all -> 0x003a }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003c, all -> 0x003a }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x0075, Exception -> 0x0038 }
            com.facebook.appevents.k r3 = (com.facebook.appevents.C2443k) r3     // Catch:{ FileNotFoundException -> 0x0075, Exception -> 0x0038 }
            com.facebook.internal.C2479ad.m9444a(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x002e }
            r1.delete()     // Catch:{ Exception -> 0x002e }
            goto L_0x0036
        L_0x002e:
            r1 = move-exception
            java.lang.String r2 = f7699a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch:{ all -> 0x0091 }
        L_0x0036:
            r2 = r3
            goto L_0x0088
        L_0x0038:
            r3 = move-exception
            goto L_0x003e
        L_0x003a:
            r3 = move-exception
            goto L_0x005e
        L_0x003c:
            r3 = move-exception
            r4 = r2
        L_0x003e:
            java.lang.String r5 = f7699a     // Catch:{ all -> 0x005b }
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x005b }
            com.facebook.internal.C2479ad.m9444a(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0052 }
            r1.delete()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0088
        L_0x0052:
            r1 = move-exception
            java.lang.String r3 = f7699a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L_0x0057:
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0088
        L_0x005b:
            r2 = move-exception
            r3 = r2
            r2 = r4
        L_0x005e:
            com.facebook.internal.C2479ad.m9444a(r2)     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x006b }
            r1.delete()     // Catch:{ Exception -> 0x006b }
            goto L_0x0073
        L_0x006b:
            r1 = move-exception
            java.lang.String r2 = f7699a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch:{ all -> 0x0091 }
        L_0x0073:
            throw r3     // Catch:{ all -> 0x0091 }
        L_0x0074:
            r4 = r2
        L_0x0075:
            com.facebook.internal.C2479ad.m9444a(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0082 }
            r1.delete()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0088
        L_0x0082:
            r1 = move-exception
            java.lang.String r3 = f7699a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L_0x0057
        L_0x0088:
            if (r2 != 0) goto L_0x008f
            com.facebook.appevents.k r2 = new com.facebook.appevents.k     // Catch:{ all -> 0x0091 }
            r2.<init>()     // Catch:{ all -> 0x0091 }
        L_0x008f:
            monitor-exit(r0)
            return r2
        L_0x0091:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2434f.m9313a():com.facebook.appevents.k");
    }

    /* renamed from: a */
    private static void m9316a(C2443k kVar) {
        Context f = C2649m.m10133f();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(f.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(kVar);
                C2479ad.m9444a((Closeable) objectOutputStream2);
            } catch (Exception e) {
                e = e;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f7699a, "Got unexpected exception while persisting events: ", e);
                    try {
                        f.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                    C2479ad.m9444a((Closeable) objectOutputStream);
                } catch (Throwable th) {
                    th = th;
                    C2479ad.m9444a((Closeable) objectOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                C2479ad.m9444a((Closeable) objectOutputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Log.w(f7699a, "Got unexpected exception while persisting events: ", e);
            f.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            C2479ad.m9444a((Closeable) objectOutputStream);
        }
    }
}
