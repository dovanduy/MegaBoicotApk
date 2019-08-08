package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.util.C3563o;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.jg */
public final class C3902jg {
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: a */
    Editor f13383a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f13384b = new Object();

    /* renamed from: c */
    private C4008ne<?> f13385c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public CopyOnWriteArraySet<C3906jk> f13386d = new CopyOnWriteArraySet<>();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: e */
    public SharedPreferences f13387e;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: f */
    public boolean f13388f = false;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: g */
    public boolean f13389g = true;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: h */
    public String f13390h;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: i */
    public String f13391i;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: j */
    public boolean f13392j = false;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: k */
    public String f13393k = "";
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: l */
    public long f13394l = 0;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: m */
    public long f13395m = 0;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: n */
    public long f13396n = 0;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: o */
    public int f13397o = -1;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: p */
    public int f13398p = 0;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: q */
    public Set<String> f13399q = Collections.emptySet();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: r */
    public JSONObject f13400r = new JSONObject();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: s */
    public boolean f13401s = true;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: t */
    public boolean f13402t = true;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17052a(Bundle bundle) {
        new C3904ji(this, bundle).mo14344c();
    }

    /* access modifiers changed from: private */
    @TargetApi(23)
    /* renamed from: n */
    public static boolean m17077n() {
        return C3563o.m12771j() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* renamed from: o */
    private final void m17079o() {
        if (this.f13385c != null && !this.f13385c.isDone()) {
            try {
                this.f13385c.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                C3900je.m17432c("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                C3900je.m17430b("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final Bundle m17080p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f13384b) {
            bundle.putBoolean("use_https", this.f13389g);
            bundle.putBoolean("content_url_opted_out", this.f13401s);
            bundle.putBoolean("content_vertical_opted_out", this.f13402t);
            bundle.putBoolean("auto_collect_location", this.f13392j);
            bundle.putInt("version_code", this.f13398p);
            bundle.putStringArray("never_pool_slots", (String[]) this.f13399q.toArray(new String[this.f13399q.size()]));
            bundle.putString("app_settings_json", this.f13393k);
            bundle.putLong("app_settings_last_update_ms", this.f13394l);
            bundle.putLong("app_last_background_time_ms", this.f13395m);
            bundle.putInt("request_in_session_count", this.f13397o);
            bundle.putLong("first_ad_req_time_ms", this.f13396n);
            bundle.putString("native_advanced_settings", this.f13400r.toString());
            if (this.f13390h != null) {
                bundle.putString("content_url_hashes", this.f13390h);
            }
            if (this.f13391i != null) {
                bundle.putString("content_vertical_hashes", this.f13391i);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo15482a(int i) {
        m17079o();
        synchronized (this.f13384b) {
            if (this.f13398p != i) {
                this.f13398p = i;
                if (this.f13383a != null) {
                    this.f13383a.putInt("version_code", i);
                    this.f13383a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i);
                m17052a(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo15483a(long j) {
        m17079o();
        synchronized (this.f13384b) {
            if (this.f13395m != j) {
                this.f13395m = j;
                if (this.f13383a != null) {
                    this.f13383a.putLong("app_last_background_time_ms", j);
                    this.f13383a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j);
                m17052a(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo15484a(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f13385c = (C4008ne) new C3903jh(this, context).mo14344c();
    }

    /* renamed from: a */
    public final void mo15485a(C3906jk jkVar) {
        synchronized (this.f13384b) {
            if (this.f13385c != null && this.f13385c.isDone()) {
                jkVar.mo15434a(m17080p());
            }
            this.f13386d.add(jkVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15486a(@javax.annotation.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r3.m17079o()
            java.lang.Object r0 = r3.f13384b
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0034
            java.lang.String r1 = r3.f13390h     // Catch:{ all -> 0x0032 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            r3.f13390h = r4     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f13383a     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f13383a     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f13383a     // Catch:{ all -> 0x0032 }
            r1.apply()     // Catch:{ all -> 0x0032 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            r3.m17052a(r1)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3902jg.mo15486a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo15487a(String str, String str2, boolean z) {
        m17079o();
        synchronized (this.f13384b) {
            JSONArray optJSONArray = this.f13400r.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i++;
                        } else if (!z || optJSONObject.optBoolean("uses_media_view", false) != z) {
                            length = i;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", C3025aw.m10924l().mo13694a());
                optJSONArray.put(length, jSONObject);
                this.f13400r.put(str, optJSONArray);
            } catch (JSONException e) {
                C3900je.m17432c("Could not update native advanced settings", e);
            }
            if (this.f13383a != null) {
                this.f13383a.putString("native_advanced_settings", this.f13400r.toString());
                this.f13383a.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.f13400r.toString());
            m17052a(bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15488a(boolean r4) {
        /*
            r3 = this;
            r3.m17079o()
            java.lang.Object r0 = r3.f13384b
            monitor-enter(r0)
            boolean r1 = r3.f13389g     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x000c:
            r3.f13389g = r4     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f13383a     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x001e
            android.content.SharedPreferences$Editor r1 = r3.f13383a     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f13383a     // Catch:{ all -> 0x0031 }
            r1.apply()     // Catch:{ all -> 0x0031 }
        L_0x001e:
            boolean r1 = r3.f13388f     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x002f
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0031 }
            r1.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            r3.m17052a(r1)     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3902jg.mo15488a(boolean):void");
    }

    /* renamed from: a */
    public final boolean mo15489a() {
        boolean z;
        m17079o();
        synchronized (this.f13384b) {
            if (!this.f13389g) {
                if (!this.f13388f) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo15490b(int i) {
        m17079o();
        synchronized (this.f13384b) {
            if (this.f13397o != i) {
                this.f13397o = i;
                if (this.f13383a != null) {
                    this.f13383a.putInt("request_in_session_count", i);
                    this.f13383a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i);
                m17052a(bundle);
            }
        }
    }

    /* renamed from: b */
    public final void mo15491b(long j) {
        m17079o();
        synchronized (this.f13384b) {
            if (this.f13396n != j) {
                this.f13396n = j;
                if (this.f13383a != null) {
                    this.f13383a.putLong("first_ad_req_time_ms", j);
                    this.f13383a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j);
                m17052a(bundle);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15492b(@javax.annotation.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r3.m17079o()
            java.lang.Object r0 = r3.f13384b
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0034
            java.lang.String r1 = r3.f13391i     // Catch:{ all -> 0x0032 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            r3.f13391i = r4     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f13383a     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f13383a     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f13383a     // Catch:{ all -> 0x0032 }
            r1.apply()     // Catch:{ all -> 0x0032 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            r3.m17052a(r1)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3902jg.mo15492b(java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo15493b(boolean z) {
        m17079o();
        synchronized (this.f13384b) {
            if (this.f13401s != z) {
                this.f13401s = z;
                if (this.f13383a != null) {
                    this.f13383a.putBoolean("content_url_opted_out", z);
                    this.f13383a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f13401s);
                bundle.putBoolean("content_vertical_opted_out", this.f13402t);
                m17052a(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo15494b() {
        boolean z;
        m17079o();
        synchronized (this.f13384b) {
            z = this.f13401s;
        }
        return z;
    }

    @Nullable
    /* renamed from: c */
    public final String mo15495c() {
        String str;
        m17079o();
        synchronized (this.f13384b) {
            str = this.f13390h;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo15496c(String str) {
        m17079o();
        synchronized (this.f13384b) {
            if (!this.f13399q.contains(str)) {
                this.f13399q.add(str);
                if (this.f13383a != null) {
                    this.f13383a.putStringSet("never_pool_slots", this.f13399q);
                    this.f13383a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f13399q.toArray(new String[this.f13399q.size()]));
                m17052a(bundle);
            }
        }
    }

    /* renamed from: c */
    public final void mo15497c(boolean z) {
        m17079o();
        synchronized (this.f13384b) {
            if (this.f13402t != z) {
                this.f13402t = z;
                if (this.f13383a != null) {
                    this.f13383a.putBoolean("content_vertical_opted_out", z);
                    this.f13383a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f13401s);
                bundle.putBoolean("content_vertical_opted_out", this.f13402t);
                m17052a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final void mo15498d(String str) {
        m17079o();
        synchronized (this.f13384b) {
            if (this.f13399q.contains(str)) {
                this.f13399q.remove(str);
                if (this.f13383a != null) {
                    this.f13383a.putStringSet("never_pool_slots", this.f13399q);
                    this.f13383a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f13399q.toArray(new String[this.f13399q.size()]));
                m17052a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final void mo15499d(boolean z) {
        m17079o();
        synchronized (this.f13384b) {
            if (this.f13392j != z) {
                this.f13392j = z;
                if (this.f13383a != null) {
                    this.f13383a.putBoolean("auto_collect_location", z);
                    this.f13383a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                m17052a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo15500d() {
        boolean z;
        m17079o();
        synchronized (this.f13384b) {
            z = this.f13402t;
        }
        return z;
    }

    @Nullable
    /* renamed from: e */
    public final String mo15501e() {
        String str;
        m17079o();
        synchronized (this.f13384b) {
            str = this.f13391i;
        }
        return str;
    }

    /* renamed from: e */
    public final boolean mo15502e(String str) {
        boolean contains;
        m17079o();
        synchronized (this.f13384b) {
            contains = this.f13399q.contains(str);
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15503f(java.lang.String r6) {
        /*
            r5 = this;
            r5.m17079o()
            java.lang.Object r0 = r5.f13384b
            monitor-enter(r0)
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.C3025aw.m10924l()     // Catch:{ all -> 0x004a }
            long r1 = r1.mo13694a()     // Catch:{ all -> 0x004a }
            r5.f13394l = r1     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x0048
            java.lang.String r3 = r5.f13393k     // Catch:{ all -> 0x004a }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x001b
            goto L_0x0048
        L_0x001b:
            r5.f13393k = r6     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences$Editor r3 = r5.f13383a     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0034
            android.content.SharedPreferences$Editor r3 = r5.f13383a     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences$Editor r3 = r5.f13383a     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "app_settings_last_update_ms"
            r3.putLong(r4, r1)     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences$Editor r3 = r5.f13383a     // Catch:{ all -> 0x004a }
            r3.apply()     // Catch:{ all -> 0x004a }
        L_0x0034:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x004a }
            r3.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = "app_settings_last_update_ms"
            r3.putLong(r6, r1)     // Catch:{ all -> 0x004a }
            r5.m17052a(r3)     // Catch:{ all -> 0x004a }
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3902jg.mo15503f(java.lang.String):void");
    }

    /* renamed from: f */
    public final boolean mo15504f() {
        boolean z;
        m17079o();
        synchronized (this.f13384b) {
            z = this.f13392j;
        }
        return z;
    }

    /* renamed from: g */
    public final int mo15505g() {
        int i;
        m17079o();
        synchronized (this.f13384b) {
            i = this.f13398p;
        }
        return i;
    }

    /* renamed from: h */
    public final C3882in mo15506h() {
        C3882in inVar;
        m17079o();
        synchronized (this.f13384b) {
            inVar = new C3882in(this.f13393k, this.f13394l);
        }
        return inVar;
    }

    /* renamed from: i */
    public final long mo15507i() {
        long j;
        m17079o();
        synchronized (this.f13384b) {
            j = this.f13395m;
        }
        return j;
    }

    /* renamed from: j */
    public final int mo15508j() {
        int i;
        m17079o();
        synchronized (this.f13384b) {
            i = this.f13397o;
        }
        return i;
    }

    /* renamed from: k */
    public final long mo15509k() {
        long j;
        m17079o();
        synchronized (this.f13384b) {
            j = this.f13396n;
        }
        return j;
    }

    /* renamed from: l */
    public final JSONObject mo15510l() {
        JSONObject jSONObject;
        m17079o();
        synchronized (this.f13384b) {
            jSONObject = this.f13400r;
        }
        return jSONObject;
    }

    /* renamed from: m */
    public final void mo15511m() {
        m17079o();
        synchronized (this.f13384b) {
            this.f13400r = new JSONObject();
            if (this.f13383a != null) {
                this.f13383a.remove("native_advanced_settings");
                this.f13383a.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            m17052a(bundle);
        }
    }
}
