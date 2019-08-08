package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.internal.p148e.C4439ag;
import com.google.android.gms.internal.p148e.C4450ar;
import com.google.android.gms.internal.p148e.C4451as;
import com.google.android.gms.internal.p148e.C4457ay;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.h */
public final class C4882h {

    /* renamed from: A */
    public static C4883a<Long> f15850A = C4883a.m21226a("measurement.upload.window_interval", 3600000, 3600000);

    /* renamed from: B */
    public static C4883a<Long> f15851B = C4883a.m21226a("measurement.upload.interval", 3600000, 3600000);

    /* renamed from: C */
    public static C4883a<Long> f15852C = C4883a.m21226a("measurement.upload.realtime_upload_interval", 10000, 10000);

    /* renamed from: D */
    public static C4883a<Long> f15853D = C4883a.m21226a("measurement.upload.debug_upload_interval", 1000, 1000);

    /* renamed from: E */
    public static C4883a<Long> f15854E = C4883a.m21226a("measurement.upload.minimum_delay", 500, 500);

    /* renamed from: F */
    public static C4883a<Long> f15855F = C4883a.m21226a("measurement.alarm_manager.minimum_interval", (long) ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, (long) ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);

    /* renamed from: G */
    public static C4883a<Long> f15856G = C4883a.m21226a("measurement.upload.stale_data_deletion_interval", 86400000, 86400000);

    /* renamed from: H */
    public static C4883a<Long> f15857H = C4883a.m21226a("measurement.upload.refresh_blacklisted_config_interval", 604800000, 604800000);

    /* renamed from: I */
    public static C4883a<Long> f15858I = C4883a.m21226a("measurement.upload.initial_upload_delay_time", 15000, 15000);

    /* renamed from: J */
    public static C4883a<Long> f15859J = C4883a.m21226a("measurement.upload.retry_time", 1800000, 1800000);

    /* renamed from: K */
    public static C4883a<Integer> f15860K = C4883a.m21225a("measurement.upload.retry_count", 6, 6);

    /* renamed from: L */
    public static C4883a<Long> f15861L = C4883a.m21226a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);

    /* renamed from: M */
    public static C4883a<Integer> f15862M = C4883a.m21225a("measurement.lifetimevalue.max_currency_tracked", 4, 4);

    /* renamed from: N */
    public static C4883a<Integer> f15863N = C4883a.m21225a("measurement.audience.filter_result_max_count", 200, 200);

    /* renamed from: O */
    public static C4883a<Long> f15864O = C4883a.m21226a("measurement.service_client.idle_disconnect_millis", (long) DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, (long) DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: P */
    public static C4883a<Boolean> f15865P = C4883a.m21228a("measurement.test.boolean_flag", false, false);

    /* renamed from: Q */
    public static C4883a<String> f15866Q;

    /* renamed from: R */
    public static C4883a<Long> f15867R = C4883a.m21226a("measurement.test.long_flag", -1, -1);

    /* renamed from: S */
    public static C4883a<Integer> f15868S = C4883a.m21225a("measurement.test.int_flag", -2, -2);

    /* renamed from: T */
    public static C4883a<Double> f15869T = C4883a.m21224a("measurement.test.double_flag", -3.0d, -3.0d);

    /* renamed from: U */
    public static C4883a<Integer> f15870U = C4883a.m21225a("measurement.experiment.max_ids", 50, 50);

    /* renamed from: V */
    public static C4883a<Boolean> f15871V = C4883a.m21228a("measurement.lifetimevalue.user_engagement_tracking_enabled", true, true);

    /* renamed from: W */
    public static C4883a<Boolean> f15872W = C4883a.m21228a("measurement.audience.complex_param_evaluation", true, true);

    /* renamed from: X */
    public static C4883a<Boolean> f15873X = C4883a.m21228a("measurement.validation.internal_limits_internal_event_params", false, false);

    /* renamed from: Y */
    public static C4883a<Boolean> f15874Y = C4883a.m21228a("measurement.quality.unsuccessful_update_retry_counter", true, true);

    /* renamed from: Z */
    public static C4883a<Boolean> f15875Z = C4883a.m21228a("measurement.iid.disable_on_collection_disabled", true, true);

    /* renamed from: a */
    static C4868er f15876a;

    /* renamed from: aA */
    private static C4883a<Boolean> f15877aA = C4883a.m21228a("measurement.log_upgrades_enabled", false, false);

    /* renamed from: aa */
    public static C4883a<Boolean> f15878aa = C4883a.m21228a("measurement.app_launch.call_only_when_enabled", true, true);

    /* renamed from: ab */
    public static C4883a<Boolean> f15879ab = C4883a.m21228a("measurement.run_on_worker_inline", true, false);

    /* renamed from: ac */
    public static C4883a<Boolean> f15880ac = C4883a.m21228a("measurement.audience.dynamic_filters", true, true);

    /* renamed from: ad */
    public static C4883a<Boolean> f15881ad = C4883a.m21228a("measurement.reset_analytics.persist_time", false, false);

    /* renamed from: ae */
    public static C4883a<Boolean> f15882ae = C4883a.m21228a("measurement.validation.value_and_currency_params", false, false);

    /* renamed from: af */
    public static C4883a<Boolean> f15883af = C4883a.m21228a("measurement.sampling.time_zone_offset_enabled", false, false);

    /* renamed from: ag */
    public static C4883a<Boolean> f15884ag = C4883a.m21228a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false, false);

    /* renamed from: ah */
    public static C4883a<Boolean> f15885ah = C4883a.m21228a("measurement.fetch_config_with_admob_app_id", true, true);

    /* renamed from: ai */
    public static C4883a<Boolean> f15886ai = C4883a.m21228a("measurement.sessions.session_id_enabled", false, false);

    /* renamed from: aj */
    public static C4883a<Boolean> f15887aj = C4883a.m21228a("measurement.sessions.session_number_enabled", false, false);

    /* renamed from: ak */
    public static C4883a<Boolean> f15888ak = C4883a.m21228a("measurement.sessions.immediate_start_enabled", false, false);

    /* renamed from: al */
    public static C4883a<Boolean> f15889al = C4883a.m21228a("measurement.sessions.background_sessions_enabled", false, false);

    /* renamed from: am */
    public static C4883a<Boolean> f15890am = C4883a.m21228a("measurement.collection.firebase_global_collection_flag_enabled", true, true);

    /* renamed from: an */
    public static C4883a<Boolean> f15891an = C4883a.m21228a("measurement.collection.efficient_engagement_reporting_enabled", false, false);

    /* renamed from: ao */
    public static C4883a<Boolean> f15892ao = C4883a.m21228a("measurement.collection.redundant_engagement_removal_enabled", false, false);

    /* renamed from: ap */
    public static C4883a<Boolean> f15893ap = C4883a.m21228a("measurement.remove_app_instance_id_cache_enabled", true, true);

    /* renamed from: aq */
    public static C4883a<Boolean> f15894aq = C4883a.m21228a("measurement.collection.init_params_control_enabled", true, true);

    /* renamed from: ar */
    public static C4883a<Boolean> f15895ar = C4883a.m21228a("measurement.upload.disable_is_uploader", false, false);

    /* renamed from: as */
    public static C4883a<Boolean> f15896as = C4883a.m21228a("measurement.experiment.enable_experiment_reporting", false, false);

    /* renamed from: at */
    public static C4883a<Boolean> f15897at = C4883a.m21228a("measurement.collection.log_event_and_bundle_v2", true, true);

    /* renamed from: au */
    public static C4883a<Boolean> f15898au = C4883a.m21228a("measurement.collection.null_empty_event_name_fix", true, true);
    /* access modifiers changed from: private */

    /* renamed from: av */
    public static final C4457ay f15899av = new C4457ay(C4450ar.m18900a("com.google.android.gms.measurement"));

    /* renamed from: aw */
    private static volatile C4764aw f15900aw;

    /* renamed from: ax */
    private static Boolean f15901ax;

    /* renamed from: ay */
    private static C4883a<Boolean> f15902ay = C4883a.m21228a("measurement.log_third_party_store_events_enabled", false, false);

    /* renamed from: az */
    private static C4883a<Boolean> f15903az = C4883a.m21228a("measurement.log_installs_enabled", false, false);

    /* renamed from: b */
    static List<C4883a<Integer>> f15904b = new ArrayList();

    /* renamed from: c */
    static List<C4883a<Long>> f15905c = new ArrayList();

    /* renamed from: d */
    static List<C4883a<Boolean>> f15906d = new ArrayList();

    /* renamed from: e */
    static List<C4883a<String>> f15907e = new ArrayList();

    /* renamed from: f */
    static List<C4883a<Double>> f15908f = new ArrayList();

    /* renamed from: g */
    public static C4883a<Boolean> f15909g = C4883a.m21228a("measurement.log_androidId_enabled", false, false);

    /* renamed from: h */
    public static C4883a<Boolean> f15910h = C4883a.m21228a("measurement.upload_dsid_enabled", false, false);

    /* renamed from: i */
    public static C4883a<String> f15911i = C4883a.m21227a("measurement.log_tag", "FA", "FA-SVC");

    /* renamed from: j */
    public static C4883a<Long> f15912j = C4883a.m21226a("measurement.ad_id_cache_time", 10000, 10000);

    /* renamed from: k */
    public static C4883a<Long> f15913k = C4883a.m21226a("measurement.monitoring.sample_period_millis", 86400000, 86400000);

    /* renamed from: l */
    public static C4883a<Long> f15914l = C4883a.m21226a("measurement.config.cache_time", 86400000, 3600000);

    /* renamed from: m */
    public static C4883a<String> f15915m;

    /* renamed from: n */
    public static C4883a<String> f15916n;

    /* renamed from: o */
    public static C4883a<Integer> f15917o = C4883a.m21225a("measurement.upload.max_bundles", 100, 100);

    /* renamed from: p */
    public static C4883a<Integer> f15918p = C4883a.m21225a("measurement.upload.max_batch_size", (int) C2793C.DEFAULT_BUFFER_SEGMENT_SIZE, (int) C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);

    /* renamed from: q */
    public static C4883a<Integer> f15919q = C4883a.m21225a("measurement.upload.max_bundle_size", (int) C2793C.DEFAULT_BUFFER_SEGMENT_SIZE, (int) C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);

    /* renamed from: r */
    public static C4883a<Integer> f15920r = C4883a.m21225a("measurement.upload.max_events_per_bundle", (int) AdError.NETWORK_ERROR_CODE, (int) AdError.NETWORK_ERROR_CODE);

    /* renamed from: s */
    public static C4883a<Integer> f15921s = C4883a.m21225a("measurement.upload.max_events_per_day", (int) DefaultOggSeeker.MATCH_BYTE_RANGE, (int) DefaultOggSeeker.MATCH_BYTE_RANGE);

    /* renamed from: t */
    public static C4883a<Integer> f15922t = C4883a.m21225a("measurement.upload.max_error_events_per_day", (int) AdError.NETWORK_ERROR_CODE, (int) AdError.NETWORK_ERROR_CODE);

    /* renamed from: u */
    public static C4883a<Integer> f15923u = C4883a.m21225a("measurement.upload.max_public_events_per_day", (int) DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, (int) DefaultLoadControl.DEFAULT_MAX_BUFFER_MS);

    /* renamed from: v */
    public static C4883a<Integer> f15924v = C4883a.m21225a("measurement.upload.max_conversions_per_day", 500, 500);

    /* renamed from: w */
    public static C4883a<Integer> f15925w = C4883a.m21225a("measurement.upload.max_realtime_events_per_day", 10, 10);

    /* renamed from: x */
    public static C4883a<Integer> f15926x = C4883a.m21225a("measurement.store.max_stored_events_per_app", (int) DefaultOggSeeker.MATCH_BYTE_RANGE, (int) DefaultOggSeeker.MATCH_BYTE_RANGE);

    /* renamed from: y */
    public static C4883a<String> f15927y;

    /* renamed from: z */
    public static C4883a<Long> f15928z = C4883a.m21226a("measurement.upload.backoff_period", 43200000, 43200000);

    /* renamed from: com.google.android.gms.measurement.internal.h$a */
    public static final class C4883a<V> {

        /* renamed from: a */
        private C4451as<V> f15929a;

        /* renamed from: b */
        private final V f15930b;

        /* renamed from: c */
        private final V f15931c;

        /* renamed from: d */
        private volatile V f15932d;

        /* renamed from: e */
        private final String f15933e;

        private C4883a(String str, V v, V v2) {
            this.f15933e = str;
            this.f15931c = v;
            this.f15930b = v2;
        }

        /* renamed from: a */
        static C4883a<Boolean> m21228a(String str, boolean z, boolean z2) {
            C4883a<Boolean> aVar = new C4883a<>(str, Boolean.valueOf(z), Boolean.valueOf(z2));
            C4882h.f15906d.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C4883a<String> m21227a(String str, String str2, String str3) {
            C4883a<String> aVar = new C4883a<>(str, str2, str3);
            C4882h.f15907e.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C4883a<Long> m21226a(String str, long j, long j2) {
            C4883a<Long> aVar = new C4883a<>(str, Long.valueOf(j), Long.valueOf(j2));
            C4882h.f15905c.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C4883a<Integer> m21225a(String str, int i, int i2) {
            C4883a<Integer> aVar = new C4883a<>(str, Integer.valueOf(i), Integer.valueOf(i2));
            C4882h.f15904b.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C4883a<Double> m21224a(String str, double d, double d2) {
            C4883a<Double> aVar = new C4883a<>(str, Double.valueOf(-3.0d), Double.valueOf(-3.0d));
            C4882h.f15908f.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        public final String mo17725a() {
            return this.f15933e;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static void m21230d() {
            synchronized (C4883a.class) {
                for (C4883a aVar : C4882h.f15906d) {
                    C4457ay a = C4882h.f15899av;
                    String str = aVar.f15933e;
                    C4868er erVar = C4882h.f15876a;
                    aVar.f15929a = a.mo16356a(str, ((Boolean) aVar.f15931c).booleanValue());
                }
                for (C4883a aVar2 : C4882h.f15907e) {
                    C4457ay a2 = C4882h.f15899av;
                    String str2 = aVar2.f15933e;
                    C4868er erVar2 = C4882h.f15876a;
                    aVar2.f15929a = a2.mo16355a(str2, (String) aVar2.f15931c);
                }
                for (C4883a aVar3 : C4882h.f15905c) {
                    C4457ay a3 = C4882h.f15899av;
                    String str3 = aVar3.f15933e;
                    C4868er erVar3 = C4882h.f15876a;
                    aVar3.f15929a = a3.mo16354a(str3, ((Long) aVar3.f15931c).longValue());
                }
                for (C4883a aVar4 : C4882h.f15904b) {
                    C4457ay a4 = C4882h.f15899av;
                    String str4 = aVar4.f15933e;
                    C4868er erVar4 = C4882h.f15876a;
                    aVar4.f15929a = a4.mo16353a(str4, ((Integer) aVar4.f15931c).intValue());
                }
                for (C4883a aVar5 : C4882h.f15908f) {
                    C4457ay a5 = C4882h.f15899av;
                    String str5 = aVar5.f15933e;
                    C4868er erVar5 = C4882h.f15876a;
                    aVar5.f15929a = a5.mo16352a(str5, ((Double) aVar5.f15931c).doubleValue());
                }
            }
        }

        /* renamed from: e */
        private static void m21231e() {
            synchronized (C4883a.class) {
                if (!C4868er.m21094a()) {
                    C4868er erVar = C4882h.f15876a;
                    try {
                        for (C4883a aVar : C4882h.f15906d) {
                            aVar.f15932d = aVar.f15929a.mo16351d();
                        }
                        for (C4883a aVar2 : C4882h.f15907e) {
                            aVar2.f15932d = aVar2.f15929a.mo16351d();
                        }
                        for (C4883a aVar3 : C4882h.f15905c) {
                            aVar3.f15932d = aVar3.f15929a.mo16351d();
                        }
                        for (C4883a aVar4 : C4882h.f15904b) {
                            aVar4.f15932d = aVar4.f15929a.mo16351d();
                        }
                        for (C4883a aVar5 : C4882h.f15908f) {
                            aVar5.f15932d = aVar5.f15929a.mo16351d();
                        }
                    } catch (SecurityException e) {
                        C4882h.m21223a((Exception) e);
                    }
                } else {
                    throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
                }
            }
        }

        /* renamed from: b */
        public final V mo17726b() {
            if (C4882h.f15876a == null) {
                return this.f15931c;
            }
            C4868er erVar = C4882h.f15876a;
            if (C4868er.m21094a()) {
                return this.f15932d == null ? this.f15931c : this.f15932d;
            }
            m21231e();
            try {
                return this.f15929a.mo16351d();
            } catch (SecurityException e) {
                C4882h.m21223a((Exception) e);
                return this.f15929a.mo16350c();
            }
        }

        /* renamed from: a */
        public final V mo17724a(V v) {
            if (v != null) {
                return v;
            }
            if (C4882h.f15876a == null) {
                return this.f15931c;
            }
            C4868er erVar = C4882h.f15876a;
            if (C4868er.m21094a()) {
                return this.f15932d == null ? this.f15931c : this.f15932d;
            }
            m21231e();
            try {
                return this.f15929a.mo16351d();
            } catch (SecurityException e) {
                C4882h.m21223a((Exception) e);
                return this.f15929a.mo16350c();
            }
        }
    }

    /* renamed from: a */
    public static Map<String, String> m21220a(Context context) {
        return C4439ag.m18880a(context.getContentResolver(), C4450ar.m18900a("com.google.android.gms.measurement")).mo16340a();
    }

    /* renamed from: a */
    static void m21221a(C4764aw awVar) {
        f15900aw = awVar;
    }

    /* renamed from: a */
    static void m21223a(Exception exc) {
        if (f15900aw != null) {
            Context n = f15900aw.mo17154n();
            if (f15901ax == null) {
                f15901ax = Boolean.valueOf(C3407d.m12253b().mo13408b(n, (int) C3415h.f9877b) == 0);
            }
            if (f15901ax.booleanValue()) {
                f15900aw.mo17158r().mo17761y_().mo17764a("Got Exception on PhenotypeFlag.get on Play device", exc);
            }
        }
    }

    /* renamed from: a */
    static void m21222a(C4868er erVar) {
        f15876a = erVar;
        C4883a.m21230d();
    }

    static {
        String str = "https";
        f15915m = C4883a.m21227a("measurement.config.url_scheme", str, str);
        String str2 = "app-measurement.com";
        f15916n = C4883a.m21227a("measurement.config.url_authority", str2, str2);
        String str3 = "https://app-measurement.com/a";
        f15927y = C4883a.m21227a("measurement.upload.url", str3, str3);
        String str4 = "---";
        f15866Q = C4883a.m21227a("measurement.test.string_flag", str4, str4);
    }
}
