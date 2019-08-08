package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p017v4.content.C0356c;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.internal.p147d.C4425c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: com.google.firebase.iid.az */
final class C4988az {
    C4988az() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4990ba mo17937a(Context context, String str) throws C4992d {
        C4990ba c = m21674c(context, str);
        if (c != null) {
            return c;
        }
        return mo17938b(context, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C4990ba mo17938b(Context context, String str) {
        C4990ba baVar = new C4990ba(C4991c.m21691a(), System.currentTimeMillis());
        C4990ba a = m21662a(context, str, baVar, true);
        if (a == null || a.equals(baVar)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Generated new key");
            }
            m21668a(context, str, baVar);
            return baVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
        }
        return a;
    }

    /* renamed from: a */
    static void m21667a(Context context) {
        File[] listFiles;
        for (File file : m21673b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: c */
    private final C4990ba m21674c(Context context, String str) throws C4992d {
        try {
            C4990ba d = m21675d(context, str);
            if (d != null) {
                m21668a(context, str, d);
                return d;
            }
            e = null;
            try {
                C4990ba a = m21663a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m21662a(context, str, a, false);
                    return a;
                }
            } catch (C4992d e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (C4992d e2) {
            e = e2;
        }
    }

    /* renamed from: a */
    private static KeyPair m21666a(String str, String str2) throws C4992d {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(19 + String.valueOf(valueOf).length());
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new C4992d((Exception) e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C4992d((Exception) e2);
        }
    }

    /* renamed from: d */
    private final C4990ba m21675d(Context context, String str) throws C4992d {
        File e = m21676e(context, str);
        if (!e.exists()) {
            return null;
        }
        try {
            return m21664a(e);
        } catch (C4992d | IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(40 + String.valueOf(valueOf).length());
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return m21664a(e);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(45 + String.valueOf(valueOf2).length());
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new C4992d((Exception) e3);
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0062=Splitter:B:19:0x0062, B:32:0x00a3=Splitter:B:32:0x00a3, B:53:0x00bf=Splitter:B:53:0x00bf} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C4990ba m21662a(android.content.Context r9, java.lang.String r10, com.google.firebase.iid.C4990ba r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "Writing key to properties file"
            android.util.Log.d(r0, r2)
        L_0x0010:
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r2 = "pub"
            java.lang.String r3 = r11.m21686b()
            r0.setProperty(r2, r3)
            java.lang.String r2 = "pri"
            java.lang.String r3 = r11.m21689c()
            r0.setProperty(r2, r3)
            java.lang.String r2 = "cre"
            long r3 = r11.f16233b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.setProperty(r2, r3)
            java.io.File r9 = m21676e(r9, r10)
            r10 = 0
            r9.createNewFile()     // Catch:{ IOException -> 0x00c3 }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r3 = "rw"
            r2.<init>(r9, r3)     // Catch:{ IOException -> 0x00c3 }
            java.nio.channels.FileChannel r9 = r2.getChannel()     // Catch:{ Throwable -> 0x00b9, all -> 0x00b6 }
            r9.lock()     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            r3 = 0
            if (r12 == 0) goto L_0x0094
            long r5 = r9.size()     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x0094
            r9.position(r3)     // Catch:{ d | IOException -> 0x0066 }
            com.google.firebase.iid.ba r12 = m21665a(r9)     // Catch:{ d | IOException -> 0x0066 }
            if (r9 == 0) goto L_0x0062
            m21671a(r10, r9)     // Catch:{ Throwable -> 0x00b9, all -> 0x00b6 }
        L_0x0062:
            m21670a(r10, r2)     // Catch:{ IOException -> 0x00c3 }
            return r12
        L_0x0066:
            r12 = move-exception
            java.lang.String r5 = "FirebaseInstanceId"
            boolean r1 = android.util.Log.isLoggable(r5, r1)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            r5 = 64
            java.lang.String r6 = java.lang.String.valueOf(r12)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            int r6 = r6.length()     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            java.lang.String r5 = "Tried reading key pair before writing new one, but failed with: "
            r6.append(r5)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            r6.append(r12)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            java.lang.String r12 = r6.toString()     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            android.util.Log.d(r1, r12)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
        L_0x0094:
            r9.position(r3)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            java.io.OutputStream r12 = java.nio.channels.Channels.newOutputStream(r9)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            r0.store(r12, r10)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a7 }
            if (r9 == 0) goto L_0x00a3
            m21671a(r10, r9)     // Catch:{ Throwable -> 0x00b9, all -> 0x00b6 }
        L_0x00a3:
            m21670a(r10, r2)     // Catch:{ IOException -> 0x00c3 }
            return r11
        L_0x00a7:
            r11 = move-exception
            r12 = r10
            goto L_0x00b0
        L_0x00aa:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r12 = move-exception
            r7 = r12
            r12 = r11
            r11 = r7
        L_0x00b0:
            if (r9 == 0) goto L_0x00b5
            m21671a(r12, r9)     // Catch:{ Throwable -> 0x00b9, all -> 0x00b6 }
        L_0x00b5:
            throw r11     // Catch:{ Throwable -> 0x00b9, all -> 0x00b6 }
        L_0x00b6:
            r9 = move-exception
            r11 = r10
            goto L_0x00bf
        L_0x00b9:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r11 = move-exception
            r7 = r11
            r11 = r9
            r9 = r7
        L_0x00bf:
            m21670a(r11, r2)     // Catch:{ IOException -> 0x00c3 }
            throw r9     // Catch:{ IOException -> 0x00c3 }
        L_0x00c3:
            r9 = move-exception
            java.lang.String r11 = "FirebaseInstanceId"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12 = 21
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            int r12 = r12 + r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "Failed to write key: "
            r0.append(r12)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            android.util.Log.w(r11, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4988az.m21662a(android.content.Context, java.lang.String, com.google.firebase.iid.ba, boolean):com.google.firebase.iid.ba");
    }

    /* renamed from: b */
    private static File m21673b(Context context) {
        File b = C0356c.m1320b(context);
        if (b != null && b.isDirectory()) {
            return b;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: e */
    private static File m21676e(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes(C2793C.UTF8_NAME), 11);
                StringBuilder sb = new StringBuilder(33 + String.valueOf(encodeToString).length());
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m21673b(context), str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        m21669a(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C4990ba m21664a(java.io.File r10) throws com.google.firebase.iid.C4992d, java.io.IOException {
        /*
            r9 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            r10 = 0
            java.nio.channels.FileChannel r7 = r0.getChannel()     // Catch:{ Throwable -> 0x0034 }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r7
            r1.lock(r2, r4, r6)     // Catch:{ Throwable -> 0x0026, all -> 0x0023 }
            com.google.firebase.iid.ba r1 = m21665a(r7)     // Catch:{ Throwable -> 0x0026, all -> 0x0023 }
            if (r7 == 0) goto L_0x001f
            m21671a(r10, r7)     // Catch:{ Throwable -> 0x0034 }
        L_0x001f:
            m21669a(r10, r0)
            return r1
        L_0x0023:
            r1 = move-exception
            r2 = r10
            goto L_0x002c
        L_0x0026:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r2 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
        L_0x002c:
            if (r7 == 0) goto L_0x0031
            m21671a(r2, r7)     // Catch:{ Throwable -> 0x0034 }
        L_0x0031:
            throw r1     // Catch:{ Throwable -> 0x0034 }
        L_0x0032:
            r1 = move-exception
            goto L_0x0036
        L_0x0034:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0032 }
        L_0x0036:
            m21669a(r10, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4988az.m21664a(java.io.File):com.google.firebase.iid.ba");
    }

    /* renamed from: a */
    private static C4990ba m21665a(FileChannel fileChannel) throws C4992d, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new C4992d("Invalid properties file");
        }
        try {
            return new C4990ba(m21666a(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new C4992d((Exception) e);
        }
    }

    /* renamed from: a */
    private static C4990ba m21663a(SharedPreferences sharedPreferences, String str) throws C4992d {
        String string = sharedPreferences.getString(C5014z.m21746a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(C5014z.m21746a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new C4990ba(m21666a(string, string2), m21672b(sharedPreferences, str));
    }

    /* renamed from: a */
    private final void m21668a(Context context, String str, C4990ba baVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (baVar.equals(m21663a(sharedPreferences, str))) {
                return;
            }
        } catch (C4992d unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(C5014z.m21746a(str, "|P|"), baVar.m21686b());
        edit.putString(C5014z.m21746a(str, "|K|"), baVar.m21689c());
        edit.putString(C5014z.m21746a(str, "cre"), String.valueOf(baVar.f16233b));
        edit.commit();
    }

    /* renamed from: b */
    private static long m21672b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C5014z.m21746a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static /* synthetic */ void m21671a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C4425c.m18851a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m21670a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C4425c.m18851a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m21669a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C4425c.m18851a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
