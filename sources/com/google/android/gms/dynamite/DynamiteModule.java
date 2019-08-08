package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3555g;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

public final class DynamiteModule {

    /* renamed from: a */
    public static final C3607b f10249a = new C3613b();

    /* renamed from: b */
    public static final C3607b f10250b = new C3614c();

    /* renamed from: c */
    public static final C3607b f10251c = new C3615d();

    /* renamed from: d */
    public static final C3607b f10252d = new C3616e();

    /* renamed from: e */
    public static final C3607b f10253e = new C3617f();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f */
    private static Boolean f10254f = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: g */
    private static C3620i f10255g = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: h */
    private static C3622k f10256h = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: i */
    private static String f10257i = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: j */
    private static int f10258j = -1;

    /* renamed from: k */
    private static final ThreadLocal<C3610c> f10259k = new ThreadLocal<>();

    /* renamed from: l */
    private static final C3608a f10260l = new C3612a();

    /* renamed from: m */
    private static final C3607b f10261m = new C3618g();

    /* renamed from: n */
    private final Context f10262n;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C3606a extends Exception {
        private C3606a(String str) {
            super(str);
        }

        private C3606a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ C3606a(String str, C3612a aVar) {
            this(str);
        }

        /* synthetic */ C3606a(String str, Throwable th, C3612a aVar) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C3607b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface C3608a {
            /* renamed from: a */
            int mo13746a(Context context, String str);

            /* renamed from: a */
            int mo13747a(Context context, String str, boolean z) throws C3606a;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class C3609b {

            /* renamed from: a */
            public int f10263a = 0;

            /* renamed from: b */
            public int f10264b = 0;

            /* renamed from: c */
            public int f10265c = 0;
        }

        /* renamed from: a */
        C3609b mo13745a(Context context, String str, C3608a aVar) throws C3606a;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    private static class C3610c {

        /* renamed from: a */
        public Cursor f10266a;

        private C3610c() {
        }

        /* synthetic */ C3610c(C3612a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    private static class C3611d implements C3608a {

        /* renamed from: a */
        private final int f10267a;

        /* renamed from: b */
        private final int f10268b = 0;

        public C3611d(int i, int i2) {
            this.f10267a = i;
        }

        /* renamed from: a */
        public final int mo13747a(Context context, String str, boolean z) {
            return 0;
        }

        /* renamed from: a */
        public final int mo13746a(Context context, String str) {
            return this.f10267a;
        }
    }

    /* renamed from: a */
    public static DynamiteModule m12874a(Context context, C3607b bVar, String str) throws C3606a {
        C3609b a;
        C3610c cVar = (C3610c) f10259k.get();
        C3610c cVar2 = new C3610c(null);
        f10259k.set(cVar2);
        try {
            a = bVar.mo13745a(context, str, f10260l);
            int i = a.f10263a;
            int i2 = a.f10264b;
            StringBuilder sb = new StringBuilder(68 + String.valueOf(str).length() + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            if (!(a.f10265c == 0 || (a.f10265c == -1 && a.f10263a == 0))) {
                if (a.f10265c != 1 || a.f10264b != 0) {
                    if (a.f10265c == -1) {
                        DynamiteModule c = m12883c(context, str);
                        if (cVar2.f10266a != null) {
                            cVar2.f10266a.close();
                        }
                        f10259k.set(cVar);
                        return c;
                    } else if (a.f10265c == 1) {
                        DynamiteModule a2 = m12875a(context, str, a.f10264b);
                        if (cVar2.f10266a != null) {
                            cVar2.f10266a.close();
                        }
                        f10259k.set(cVar);
                        return a2;
                    } else {
                        int i3 = a.f10265c;
                        StringBuilder sb2 = new StringBuilder(47);
                        sb2.append("VersionPolicy returned invalid code:");
                        sb2.append(i3);
                        throw new C3606a(sb2.toString(), (C3612a) null);
                    }
                }
            }
            int i4 = a.f10263a;
            int i5 = a.f10264b;
            StringBuilder sb3 = new StringBuilder(91);
            sb3.append("No acceptable module found. Local version is ");
            sb3.append(i4);
            sb3.append(" and remote version is ");
            sb3.append(i5);
            sb3.append(".");
            throw new C3606a(sb3.toString(), (C3612a) null);
        } catch (C3606a e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to load remote module: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            if (a.f10263a == 0 || bVar.mo13745a(context, str, new C3611d(a.f10263a, 0)).f10265c != -1) {
                throw new C3606a("Remote load failed. No local fallback found.", e, null);
            }
            DynamiteModule c2 = m12883c(context, str);
            if (cVar2.f10266a != null) {
                cVar2.f10266a.close();
            }
            f10259k.set(cVar);
            return c2;
        } catch (Throwable th) {
            if (cVar2.f10266a != null) {
                cVar2.f10266a.close();
            }
            f10259k.set(cVar);
            throw th;
        }
    }

    /* renamed from: a */
    public static int m12872a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(61 + String.valueOf(str).length());
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(51 + String.valueOf(valueOf).length() + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(45 + String.valueOf(str).length());
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to load module descriptor class: ";
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:40|41|42|43|52|53|54|55|(3:57|58|59)(2:69|70)) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
        r2 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c2, code lost:
        return m12882c(r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e9, code lost:
        return m12879b(r8, r9, r10);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007e */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC, Splitter:B:57:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e5 A[Catch:{ a -> 0x00c3, Throwable -> 0x00ed }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x007b=Splitter:B:35:0x007b} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m12873a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ Throwable -> 0x00ed }
            java.lang.Boolean r1 = f10254f     // Catch:{ all -> 0x00ea }
            if (r1 != 0) goto L_0x00b7
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x008a }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0032:
            m12877a(r4)     // Catch:{ a -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x008a }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x008a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0052:
            int r4 = m12882c(r8, r9, r10)     // Catch:{ a -> 0x007e }
            java.lang.String r5 = f10257i     // Catch:{ a -> 0x007e }
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = f10257i     // Catch:{ a -> 0x007e }
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x007e }
            if (r5 == 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            com.google.android.gms.dynamite.h r5 = new com.google.android.gms.dynamite.h     // Catch:{ a -> 0x007e }
            java.lang.String r6 = f10257i     // Catch:{ a -> 0x007e }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x007e }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x007e }
            m12877a(r5)     // Catch:{ a -> 0x007e }
            r2.set(r3, r5)     // Catch:{ a -> 0x007e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x007e }
            f10254f = r5     // Catch:{ a -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            return r4
        L_0x007b:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            return r4
        L_0x007e:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            r1 = r2
            goto L_0x00b5
        L_0x008a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        L_0x008d:
            r1 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ea }
            r3 = 30
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ea }
            int r4 = r4.length()     // Catch:{ all -> 0x00ea }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r4.<init>(r3)     // Catch:{ all -> 0x00ea }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00ea }
            r4.append(r1)     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00ea }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00ea }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ea }
        L_0x00b5:
            f10254f = r1     // Catch:{ all -> 0x00ea }
        L_0x00b7:
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            boolean r0 = r1.booleanValue()     // Catch:{ Throwable -> 0x00ed }
            if (r0 == 0) goto L_0x00e5
            int r9 = m12882c(r8, r9, r10)     // Catch:{ a -> 0x00c3 }
            return r9
        L_0x00c3:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ Throwable -> 0x00ed }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x00ed }
            int r1 = r9.length()     // Catch:{ Throwable -> 0x00ed }
            if (r1 == 0) goto L_0x00db
            java.lang.String r9 = r0.concat(r9)     // Catch:{ Throwable -> 0x00ed }
            goto L_0x00e0
        L_0x00db:
            java.lang.String r9 = new java.lang.String     // Catch:{ Throwable -> 0x00ed }
            r9.<init>(r0)     // Catch:{ Throwable -> 0x00ed }
        L_0x00e0:
            android.util.Log.w(r10, r9)     // Catch:{ Throwable -> 0x00ed }
            r8 = 0
            return r8
        L_0x00e5:
            int r9 = m12879b(r8, r9, r10)     // Catch:{ Throwable -> 0x00ed }
            return r9
        L_0x00ea:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            throw r9     // Catch:{ Throwable -> 0x00ed }
        L_0x00ed:
            r9 = move-exception
            com.google.android.gms.common.util.C3555g.m12743a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m12873a(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: b */
    private static int m12879b(Context context, String str, boolean z) {
        C3620i a = m12876a(context);
        if (a == null) {
            return 0;
        }
        try {
            if (a.mo13749a() >= 2) {
                return a.mo13752b(C3238b.m11573a(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a.mo13750a(C3238b.m11573a(context), str, z);
        } catch (RemoteException e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b6  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m12882c(android.content.Context r8, java.lang.String r9, boolean r10) throws com.google.android.gms.dynamite.DynamiteModule.C3606a {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            r10 = 42
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            int r10 = r10 + r2
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            r2.append(r8)     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            r2.append(r9)     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00a3, all -> 0x00a1 }
            if (r8 == 0) goto L_0x0092
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
            if (r9 != 0) goto L_0x004e
            goto L_0x0092
        L_0x004e:
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
            if (r9 <= 0) goto L_0x0083
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0080 }
            f10257i = r1     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0080 }
            if (r1 < 0) goto L_0x006d
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0080 }
            f10258j = r1     // Catch:{ all -> 0x0080 }
        L_0x006d:
            monitor-exit(r10)     // Catch:{ all -> 0x0080 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f10259k     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.C3610c) r10     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
            if (r10 == 0) goto L_0x0083
            android.database.Cursor r1 = r10.f10266a     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
            if (r1 != 0) goto L_0x0083
            r10.f10266a = r8     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
            r8 = r0
            goto L_0x0083
        L_0x0080:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
        L_0x0083:
            if (r8 == 0) goto L_0x0088
            r8.close()
        L_0x0088:
            return r9
        L_0x0089:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00b4
        L_0x008d:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x00a5
        L_0x0092:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
            throw r9     // Catch:{ Exception -> 0x008d, all -> 0x0089 }
        L_0x00a1:
            r8 = move-exception
            goto L_0x00b4
        L_0x00a3:
            r8 = move-exception
            r9 = r0
        L_0x00a5:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.C3606a     // Catch:{ all -> 0x00b2 }
            if (r10 == 0) goto L_0x00aa
            throw r8     // Catch:{ all -> 0x00b2 }
        L_0x00aa:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00b2 }
            throw r10     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r8 = move-exception
            r0 = r9
        L_0x00b4:
            if (r0 == 0) goto L_0x00b9
            r0.close()
        L_0x00b9:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m12882c(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: b */
    public static int m12878b(Context context, String str) {
        return m12873a(context, str, false);
    }

    /* renamed from: c */
    private static DynamiteModule m12883c(Context context, String str) {
        String str2 = "DynamiteModule";
        String str3 = "Selected local version of ";
        String valueOf = String.valueOf(str);
        Log.i(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: a */
    private static DynamiteModule m12875a(Context context, String str, int i) throws C3606a {
        Boolean bool;
        C3235a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f10254f;
            }
            if (bool == null) {
                throw new C3606a("Failed to determine which loading route to use.", (C3612a) null);
            } else if (bool.booleanValue()) {
                return m12880b(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(51 + String.valueOf(str).length());
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                C3620i a = m12876a(context);
                if (a == null) {
                    throw new C3606a("Failed to create IDynamiteLoader.", (C3612a) null);
                }
                if (a.mo13749a() >= 2) {
                    aVar = a.mo13753b(C3238b.m11573a(context), str, i);
                } else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                    aVar = a.mo13751a(C3238b.m11573a(context), str, i);
                }
                if (C3238b.m11574a(aVar) != null) {
                    return new DynamiteModule((Context) C3238b.m11574a(aVar));
                }
                throw new C3606a("Failed to load remote module.", (C3612a) null);
            }
        } catch (RemoteException e) {
            throw new C3606a("Failed to load remote module.", e, null);
        } catch (C3606a e2) {
            throw e2;
        } catch (Throwable th) {
            C3555g.m12743a(context, th);
            throw new C3606a("Failed to load remote module.", th, null);
        }
    }

    /* renamed from: a */
    private static C3620i m12876a(Context context) {
        C3620i iVar;
        synchronized (DynamiteModule.class) {
            if (f10255g != null) {
                C3620i iVar2 = f10255g;
                return iVar2;
            } else if (C3407d.m12253b().mo13397a(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        if (queryLocalInterface instanceof C3620i) {
                            iVar = (C3620i) queryLocalInterface;
                        } else {
                            iVar = new C3621j(iBinder);
                        }
                    }
                    if (iVar != null) {
                        f10255g = iVar;
                        return iVar;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Context mo13743a() {
        return this.f10262n;
    }

    /* renamed from: b */
    private static DynamiteModule m12880b(Context context, String str, int i) throws C3606a, RemoteException {
        C3622k kVar;
        C3235a aVar;
        StringBuilder sb = new StringBuilder(51 + String.valueOf(str).length());
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            kVar = f10256h;
        }
        if (kVar == null) {
            throw new C3606a("DynamiteLoaderV2 was not cached.", (C3612a) null);
        }
        C3610c cVar = (C3610c) f10259k.get();
        if (cVar == null || cVar.f10266a == null) {
            throw new C3606a("No result cursor", (C3612a) null);
        }
        Context applicationContext = context.getApplicationContext();
        Cursor cursor = cVar.f10266a;
        C3238b.m11573a(null);
        if (m12881b().booleanValue()) {
            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
            aVar = kVar.mo13755b(C3238b.m11573a(applicationContext), str, i, C3238b.m11573a(cursor));
        } else {
            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
            aVar = kVar.mo13754a(C3238b.m11573a(applicationContext), str, i, C3238b.m11573a(cursor));
        }
        Context context2 = (Context) C3238b.m11574a(aVar);
        if (context2 != null) {
            return new DynamiteModule(context2);
        }
        throw new C3606a("Failed to get module context", (C3612a) null);
    }

    /* renamed from: b */
    private static Boolean m12881b() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f10258j >= 2);
        }
        return valueOf;
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: a */
    private static void m12877a(ClassLoader classLoader) throws C3606a {
        C3622k kVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C3622k) {
                    kVar = (C3622k) queryLocalInterface;
                } else {
                    kVar = new C3623l(iBinder);
                }
            }
            f10256h = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C3606a("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: a */
    public final IBinder mo13744a(String str) throws C3606a {
        try {
            return (IBinder) this.f10262n.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String str2 = "Failed to instantiate module class: ";
            String valueOf = String.valueOf(str);
            throw new C3606a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e, null);
        }
    }

    private DynamiteModule(Context context) {
        this.f10262n = (Context) C3513t.m12625a(context);
    }
}
