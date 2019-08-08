package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@C3718cm
public final class aru {

    /* renamed from: A */
    public static final ark<Long> f11749A = ark.m14989a(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: B */
    public static final ark<Boolean> f11750B = ark.m14990a(1, "gads:video:aggressive_media_codec_release", Boolean.valueOf(false));

    /* renamed from: C */
    public static final ark<Boolean> f11751C = ark.m14990a(1, "gads:memory_bundle:debug_info", Boolean.valueOf(false));

    /* renamed from: D */
    public static final ark<Boolean> f11752D = ark.m14990a(1, "gads:memory_bundle:runtime_info", Boolean.valueOf(true));

    /* renamed from: E */
    public static final ark<String> f11753E = ark.m14991a(1, "gads:video:codec_query_mime_types", "");

    /* renamed from: F */
    public static final ark<Integer> f11754F = ark.m14988a(1, "gads:video:codec_query_minimum_version", 16);

    /* renamed from: G */
    public static final ark<Boolean> f11755G = ark.m14990a(0, "gads:looper_for_gms_client:enabled", Boolean.valueOf(true));

    /* renamed from: H */
    public static final ark<Boolean> f11756H = ark.m14990a(0, "gads:sw_ad_request_service:enabled", Boolean.valueOf(true));

    /* renamed from: I */
    public static final ark<String> f11757I = ark.m14991a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");

    /* renamed from: J */
    public static final ark<String> f11758J = ark.m14991a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");

    /* renamed from: K */
    public static final ark<String> f11759K = ark.m14991a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");

    /* renamed from: L */
    public static final ark<String> f11760L = ark.m14991a(1, "gad:mraid:version", "2.0");

    /* renamed from: M */
    public static final ark<Boolean> f11761M = ark.m14990a(1, "gads:mraid:unload", Boolean.valueOf(false));

    /* renamed from: N */
    public static final ark<Boolean> f11762N = ark.m14990a(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));

    /* renamed from: O */
    public static final ark<String> f11763O = ark.m14991a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");

    /* renamed from: P */
    public static final ark<Boolean> f11764P = ark.m14990a(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));

    /* renamed from: Q */
    public static final ark<Boolean> f11765Q = ark.m14990a(0, "gads:enable_content_fetching", Boolean.valueOf(true));

    /* renamed from: R */
    public static final ark<Integer> f11766R = ark.m14988a(0, "gads:content_length_weight", 1);

    /* renamed from: S */
    public static final ark<Integer> f11767S = ark.m14988a(0, "gads:content_age_weight", 1);

    /* renamed from: T */
    public static final ark<Integer> f11768T = ark.m14988a(0, "gads:min_content_len", 11);

    /* renamed from: U */
    public static final ark<Integer> f11769U = ark.m14988a(0, "gads:fingerprint_number", 10);

    /* renamed from: V */
    public static final ark<Integer> f11770V = ark.m14988a(0, "gads:sleep_sec", 10);

    /* renamed from: W */
    public static final ark<Boolean> f11771W = ark.m14990a(1, "gads:enable_content_url_hash", Boolean.valueOf(true));

    /* renamed from: X */
    public static final ark<Integer> f11772X = ark.m14988a(1, "gads:content_vertical_fingerprint_number", 100);

    /* renamed from: Y */
    public static final ark<Boolean> f11773Y = ark.m14990a(1, "gads:enable_content_vertical_hash", Boolean.valueOf(true));

    /* renamed from: Z */
    public static final ark<Integer> f11774Z = ark.m14988a(1, "gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: a */
    public static final ark<String> f11775a = ark.m14991a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");

    /* renamed from: aA */
    public static final ark<Boolean> f11776aA = ark.m14990a(0, "gads:corewebview:javascript_engine", Boolean.valueOf(false));

    /* renamed from: aB */
    public static final ark<Boolean> f11777aB = ark.m14990a(1, "gad:webview:inject_scripts", Boolean.valueOf(false));

    /* renamed from: aC */
    public static final ark<Boolean> f11778aC = ark.m14990a(0, "gads:webview:permission:disabled", Boolean.valueOf(false));

    /* renamed from: aD */
    public static final ark<Boolean> f11779aD = ark.m14990a(1, "gads:rewarded:adapter_initialization_enabled", Boolean.valueOf(false));

    /* renamed from: aE */
    public static final ark<Long> f11780aE = ark.m14989a(1, "gads:rewarded:adapter_timeout_ms", 20000);

    /* renamed from: aF */
    public static final ark<Boolean> f11781aF = ark.m14990a(1, "gads:rewarded:ad_metadata_enabled", Boolean.valueOf(false));

    /* renamed from: aG */
    public static final ark<Boolean> f11782aG = ark.m14990a(1, "gads:app_activity_tracker:enabled", Boolean.valueOf(true));

    /* renamed from: aH */
    public static final ark<Long> f11783aH = ark.m14989a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: aI */
    public static final ark<Long> f11784aI = ark.m14989a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: aJ */
    public static final ark<Boolean> f11785aJ = ark.m14990a(1, "gads:adid_values_in_adrequest:enabled", Boolean.valueOf(false));

    /* renamed from: aK */
    public static final ark<Long> f11786aK = ark.m14989a(1, "gads:adid_values_in_adrequest:timeout", (long) AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);

    /* renamed from: aL */
    public static final ark<Boolean> f11787aL = ark.m14990a(1, "gads:disable_adid_values_in_ms", Boolean.valueOf(false));

    /* renamed from: aM */
    public static final ark<Boolean> f11788aM = ark.m14990a(1, "gads:enable_ad_loader_manager", Boolean.valueOf(true));

    /* renamed from: aN */
    public static final ark<Boolean> f11789aN = ark.m14990a(1, "gads:ad_manager_enforce_arp_invariant:enabled", Boolean.valueOf(true));

    /* renamed from: aO */
    public static final ark<Boolean> f11790aO = ark.m14990a(1, "gads:ad_manager:admob_extra:new_bundle", Boolean.valueOf(true));

    /* renamed from: aP */
    public static final ark<Long> f11791aP = ark.m14989a(1, "gads:ad_overlay:delay_page_close_timeout_ms", (long) DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: aQ */
    public static final ark<Boolean> f11792aQ = ark.m14990a(1, "gads:interstitial_ad_immersive_mode", Boolean.valueOf(true));

    /* renamed from: aR */
    public static final ark<Boolean> f11793aR = ark.m14990a(1, "gads:custom_close_blocking:enabled", Boolean.valueOf(false));

    /* renamed from: aS */
    public static final ark<Boolean> f11794aS = ark.m14990a(1, "gads:disabling_closable_area:enabled", Boolean.valueOf(false));

    /* renamed from: aT */
    public static final ark<Boolean> f11795aT = ark.m14990a(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));

    /* renamed from: aU */
    public static final ark<Boolean> f11796aU = ark.m14990a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));

    /* renamed from: aV */
    public static final ark<String> f11797aV = ark.m14991a(1, "gads:interstitial_ad_pool:schema", "customTargeting");

    /* renamed from: aW */
    public static final ark<String> f11798aW = ark.m14991a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");

    /* renamed from: aX */
    public static final ark<Integer> f11799aX = ark.m14988a(1, "gads:interstitial_ad_pool:max_pools", 3);

    /* renamed from: aY */
    public static final ark<Integer> f11800aY = ark.m14988a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);

    /* renamed from: aZ */
    public static final ark<Integer> f11801aZ = ark.m14988a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);

    /* renamed from: aa */
    public static final ark<Integer> f11802aa = ark.m14988a(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: ab */
    public static final ark<String> f11803ab = ark.m14991a(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* renamed from: ac */
    public static final ark<String> f11804ac = ark.m14991a(1, "gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: ad */
    public static final ark<Boolean> f11805ad = ark.m14990a(0, "gad:app_index_enabled", Boolean.valueOf(true));

    /* renamed from: ae */
    public static final ark<Boolean> f11806ae = ark.m14990a(1, "gads:content_fetch_disable_get_title_from_webview", Boolean.valueOf(false));

    /* renamed from: af */
    public static final ark<Boolean> f11807af = ark.m14990a(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));

    /* renamed from: ag */
    public static final ark<Long> f11808ag = ark.m14989a(0, "gads:app_index:timeout_ms", 1000);

    /* renamed from: ah */
    public static final ark<Boolean> f11809ah = ark.m14990a(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));

    /* renamed from: ai */
    public static final ark<Boolean> f11810ai = ark.m14990a(0, "gads:interstitial_follow_url", Boolean.valueOf(true));

    /* renamed from: aj */
    public static final ark<Boolean> f11811aj = ark.m14990a(0, "gads:interstitial_follow_url:register_click", Boolean.valueOf(true));

    /* renamed from: ak */
    public static final ark<Boolean> f11812ak = ark.m14990a(0, "gads:ad_key_enabled", Boolean.valueOf(false));

    /* renamed from: al */
    public static final ark<Boolean> f11813al = ark.m14990a(1, "gads:sai:enabled", Boolean.valueOf(true));

    /* renamed from: am */
    public static final ark<Boolean> f11814am = ark.m14990a(1, "gads:sai:banner_ad_enabled", Boolean.valueOf(true));

    /* renamed from: an */
    public static final ark<Boolean> f11815an = ark.m14990a(1, "gads:sai:native_ad_enabled", Boolean.valueOf(true));

    /* renamed from: ao */
    public static final ark<Boolean> f11816ao = ark.m14990a(1, "gads:sai:interstitial_ad_enabled", Boolean.valueOf(true));

    /* renamed from: ap */
    public static final ark<Boolean> f11817ap = ark.m14990a(1, "gads:sai:rewardedvideo_ad_enabled", Boolean.valueOf(true));

    /* renamed from: aq */
    public static final ark<String> f11818aq = ark.m14991a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: ar */
    public static final ark<String> f11819ar = ark.m14991a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");

    /* renamed from: as */
    public static final ark<Boolean> f11820as = ark.m14990a(1, "gads:sai:click_gmsg_enabled", Boolean.valueOf(true));

    /* renamed from: at */
    public static final ark<Boolean> f11821at = ark.m14990a(1, "gads:sai:using_macro:enabled", Boolean.valueOf(false));

    /* renamed from: au */
    public static final ark<String> f11822au = ark.m14991a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: av */
    public static final ark<Long> f11823av = ark.m14989a(1, "gads:sai:timeout_ms", -1);

    /* renamed from: aw */
    public static final ark<Integer> f11824aw = ark.m14988a(1, "gads:sai:scion_thread_pool_size", 5);

    /* renamed from: ax */
    public static final ark<Boolean> f11825ax = ark.m14990a(1, "gads:x_seconds_rewarded:enable", Boolean.valueOf(false));

    /* renamed from: ay */
    public static final ark<Boolean> f11826ay = ark.m14990a(1, "gads:webview:ignore_over_scroll", Boolean.valueOf(true));

    /* renamed from: az */
    public static final ark<Boolean> f11827az = ark.m14990a(0, "gads:corewebview:adwebview_factory:enable", Boolean.valueOf(false));

    /* renamed from: b */
    public static final ark<Boolean> f11828b = ark.m14990a(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));

    /* renamed from: bA */
    public static final ark<Long> f11829bA = ark.m14989a(0, "gads:ad_loader:timeout_ms", (long) ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);

    /* renamed from: bB */
    public static final ark<Long> f11830bB = ark.m14989a(0, "gads:rendering:timeout_ms", (long) ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);

    /* renamed from: bC */
    public static final ark<Boolean> f11831bC = ark.m14990a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));

    /* renamed from: bD */
    public static final ark<Long> f11832bD = ark.m14989a(1, "gads:gestures:task_timeout", (long) AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);

    /* renamed from: bE */
    public static final ark<Boolean> f11833bE = ark.m14990a(1, "gads:gestures:asig:enabled", Boolean.valueOf(false));

    /* renamed from: bF */
    public static final ark<Boolean> f11834bF = ark.m14990a(1, "gads:gestures:ans:enabled", Boolean.valueOf(false));

    /* renamed from: bG */
    public static final ark<Boolean> f11835bG = ark.m14990a(1, "gads:gestures:tos:enabled", Boolean.valueOf(false));

    /* renamed from: bH */
    public static final ark<Boolean> f11836bH = ark.m14990a(1, "gads:signal:app_permissions:disabled", Boolean.valueOf(false));

    /* renamed from: bI */
    public static final ark<Boolean> f11837bI = ark.m14990a(1, "gads:gestures:inthex:enabled", Boolean.valueOf(false));

    /* renamed from: bJ */
    public static final ark<Boolean> f11838bJ = ark.m14990a(1, "gads:gestures:hpk:enabled", Boolean.valueOf(true));

    /* renamed from: bK */
    public static final ark<String> f11839bK = ark.m14991a(1, "gads:gestures:pk", "");

    /* renamed from: bL */
    public static final ark<Boolean> f11840bL = ark.m14990a(1, "gads:gestures:bs:enabled", Boolean.valueOf(true));

    /* renamed from: bM */
    public static final ark<Boolean> f11841bM = ark.m14990a(1, "gads:gestures:check_initialization_thread:enabled", Boolean.valueOf(false));

    /* renamed from: bN */
    public static final ark<Boolean> f11842bN = ark.m14990a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", Boolean.valueOf(true));

    /* renamed from: bO */
    public static final ark<Boolean> f11843bO = ark.m14990a(0, "gass:enabled", Boolean.valueOf(true));

    /* renamed from: bP */
    public static final ark<Boolean> f11844bP = ark.m14990a(0, "gass:enable_int_signal", Boolean.valueOf(true));

    /* renamed from: bQ */
    public static final ark<Boolean> f11845bQ = ark.m14990a(0, "gass:enable_ad_attestation_signal", Boolean.valueOf(true));

    /* renamed from: bR */
    public static final ark<Boolean> f11846bR = ark.m14990a(0, "gads:support_screen_shot", Boolean.valueOf(true));

    /* renamed from: bS */
    public static final ark<Boolean> f11847bS = ark.m14990a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", Boolean.valueOf(true));

    /* renamed from: bT */
    public static final ark<String> f11848bT = ark.m14991a(1, "gads:sdk_core_constants:caps", "");

    /* renamed from: bU */
    public static final ark<Long> f11849bU = ark.m14989a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));

    /* renamed from: bV */
    public static final ark<Boolean> f11850bV = ark.m14990a(0, "gads:js_flags:mf", Boolean.valueOf(false));

    /* renamed from: bW */
    public static final ark<Boolean> f11851bW = ark.m14990a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));

    /* renamed from: bX */
    public static final ark<String> f11852bX = ark.m14991a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: bY */
    public static final ark<String> f11853bY = ark.m14991a(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: bZ */
    public static final ark<Boolean> f11854bZ = ark.m14990a(1, "gads:enable_untrack_view_native", Boolean.valueOf(true));

    /* renamed from: ba */
    public static final ark<String> f11855ba = ark.m14991a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");

    /* renamed from: bb */
    public static final ark<Integer> f11856bb = ark.m14988a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);

    /* renamed from: bc */
    public static final ark<Integer> f11857bc = ark.m14988a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);

    /* renamed from: bd */
    public static final ark<Long> f11858bd = ark.m14989a(1, "gads:interstitial_ad_pool:discard_thresholds", 0);

    /* renamed from: be */
    public static final ark<Long> f11859be = ark.m14989a(1, "gads:interstitial_ad_pool:miss_thresholds", 0);

    /* renamed from: bf */
    public static final ark<Float> f11860bf = ark.m14987a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);

    /* renamed from: bg */
    public static final ark<Float> f11861bg = ark.m14987a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);

    /* renamed from: bh */
    public static final ark<Boolean> f11862bh = ark.m14990a(0, "gads:debug_logging_feature:enable", Boolean.valueOf(false));

    /* renamed from: bi */
    public static final ark<Boolean> f11863bi = ark.m14990a(0, "gads:debug_logging_feature:intercept_web_view", Boolean.valueOf(false));

    /* renamed from: bj */
    public static final ark<String> f11864bj = ark.m14991a(1, "gads:spherical_video:vertex_shader", "");

    /* renamed from: bk */
    public static final ark<String> f11865bk = ark.m14991a(1, "gads:spherical_video:fragment_shader", "");

    /* renamed from: bl */
    public static final ark<Boolean> f11866bl = ark.m14990a(0, "gads:log:verbose_enabled", Boolean.valueOf(false));

    /* renamed from: bm */
    public static final ark<Boolean> f11867bm = ark.m14990a(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));

    /* renamed from: bn */
    public static final ark<Long> f11868bn = ark.m14989a(1, "gads:position_watcher:throttle_ms", 200);

    /* renamed from: bo */
    public static final ark<Boolean> f11869bo = ark.m14990a(1, "gads:include_lock_screen_apps_for_visibility", Boolean.valueOf(true));

    /* renamed from: bp */
    public static final ark<Boolean> f11870bp = ark.m14990a(0, "gads:device_info_caching:enabled", Boolean.valueOf(true));

    /* renamed from: bq */
    public static final ark<Long> f11871bq = ark.m14989a(0, "gads:device_info_caching_expiry_ms:expiry", 300000);

    /* renamed from: br */
    public static final ark<Boolean> f11872br = ark.m14990a(1, "gads:gen204_signals:enabled", Boolean.valueOf(false));

    /* renamed from: bs */
    public static final ark<Boolean> f11873bs = ark.m14990a(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));

    /* renamed from: bt */
    public static final ark<Boolean> f11874bt = ark.m14990a(1, "gads:gmsg:disable_back_button:enabled", Boolean.valueOf(true));

    /* renamed from: bu */
    public static final ark<Boolean> f11875bu = ark.m14990a(0, "gads:gmsg:video_meta:enabled", Boolean.valueOf(true));

    /* renamed from: bv */
    public static final ark<Long> f11876bv = ark.m14989a(1, "gads:network:network_prediction_timeout_ms", (long) AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);

    /* renamed from: bw */
    public static final ark<Boolean> f11877bw = ark.m14990a(0, "gads:mediation:dynamite_first:admobadapter", Boolean.valueOf(true));

    /* renamed from: bx */
    public static final ark<Boolean> f11878bx = ark.m14990a(0, "gads:mediation:dynamite_first:adurladapter", Boolean.valueOf(true));

    /* renamed from: by */
    public static final ark<Boolean> f11879by = ark.m14990a(1, "gads:bypass_adrequest_service_for_inlined_mediation", Boolean.valueOf(true));

    /* renamed from: bz */
    public static final ark<Long> f11880bz = ark.m14989a(0, "gads:resolve_future:default_timeout_ms", 30000);

    /* renamed from: c */
    public static final ark<Boolean> f11881c = ark.m14990a(0, "gads:report_dynamite_crash_in_background_thread", Boolean.valueOf(false));

    /* renamed from: cA */
    public static final ark<Long> f11882cA = ark.m14989a(1, "gads:parental_controls:timeout", (long) AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);

    /* renamed from: cB */
    public static final ark<Boolean> f11883cB = ark.m14990a(0, "gads:safe_browsing:debug", Boolean.valueOf(false));

    /* renamed from: cC */
    public static final ark<Boolean> f11884cC = ark.m14990a(0, "gads:webview_cookie:enabled", Boolean.valueOf(true));

    /* renamed from: cD */
    public static final ark<Boolean> f11885cD = ark.m14990a(1, "gads:cache:bind_on_foreground", Boolean.valueOf(false));

    /* renamed from: cE */
    public static final ark<Boolean> f11886cE = ark.m14990a(1, "gads:cache:bind_on_init", Boolean.valueOf(false));

    /* renamed from: cF */
    public static final ark<Boolean> f11887cF = ark.m14990a(1, "gads:cache:bind_on_request", Boolean.valueOf(false));

    /* renamed from: cG */
    public static final ark<Long> f11888cG = ark.m14989a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: cH */
    public static final ark<Boolean> f11889cH = ark.m14990a(1, "gads:cache:use_cache_data_source", Boolean.valueOf(false));

    /* renamed from: cI */
    public static final ark<Boolean> f11890cI = ark.m14990a(1, "gads:http_assets_cache:enabled", Boolean.valueOf(false));

    /* renamed from: cJ */
    public static final ark<String> f11891cJ = ark.m14991a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: cK */
    public static final ark<Integer> f11892cK = ark.m14988a(1, "gads:http_assets_cache:time_out", 100);

    /* renamed from: cL */
    public static final ark<Boolean> f11893cL = ark.m14990a(1, "gads:chrome_custom_tabs:enabled", Boolean.valueOf(true));

    /* renamed from: cM */
    public static final ark<Boolean> f11894cM = ark.m14990a(1, "gads:chrome_custom_tabs_browser:enabled", Boolean.valueOf(false));

    /* renamed from: cN */
    public static final ark<Boolean> f11895cN = ark.m14990a(1, "gads:chrome_custom_tabs:disabled", Boolean.valueOf(false));

    /* renamed from: cO */
    public static final ark<Boolean> f11896cO = ark.m14990a(1, "gads:drx_in_app_preview:enabled", Boolean.valueOf(true));

    /* renamed from: cP */
    public static final ark<Boolean> f11897cP = ark.m14990a(1, "gads:drx_debug_signals:enabled", Boolean.valueOf(true));

    /* renamed from: cQ */
    public static final ark<Boolean> f11898cQ = ark.m14990a(1, "gads:debug_hold_gesture:enabled", Boolean.valueOf(false));

    /* renamed from: cR */
    public static final ark<Long> f11899cR = ark.m14989a(1, "gads:debug_hold_gesture:time_millis", (long) AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);

    /* renamed from: cS */
    public static final ark<String> f11900cS = ark.m14991a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: cT */
    public static final ark<String> f11901cT = ark.m14991a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: cU */
    public static final ark<String> f11902cU = ark.m14991a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: cV */
    public static final ark<String> f11903cV = ark.m14991a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: cW */
    public static final ark<Integer> f11904cW = ark.m14988a(1, "gads:drx_debug:timeout_ms", 5000);

    /* renamed from: cX */
    public static final ark<Integer> f11905cX = ark.m14988a(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: cY */
    public static final ark<Boolean> f11906cY = ark.m14990a(1, "gad:interstitial_for_multi_window", Boolean.valueOf(false));

    /* renamed from: cZ */
    public static final ark<Boolean> f11907cZ = ark.m14990a(1, "gad:interstitial_ad_stay_active_in_multi_window", Boolean.valueOf(false));

    /* renamed from: ca */
    public static final ark<Boolean> f11908ca = ark.m14990a(1, "gads:ignore_untrack_view_google_native", Boolean.valueOf(true));

    /* renamed from: cb */
    public static final ark<Boolean> f11909cb = ark.m14990a(1, "gads:reset_listeners_preparead_native", Boolean.valueOf(true));

    /* renamed from: cc */
    public static final ark<Integer> f11910cc = ark.m14988a(1, "gads:native_video_load_timeout", 10);

    /* renamed from: cd */
    public static final ark<Integer> f11911cd = ark.m14988a(1, "gads:omid:native_webview_load_timeout", 2000);

    /* renamed from: ce */
    public static final ark<String> f11912ce = ark.m14991a(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: cf */
    public static final ark<Boolean> f11913cf = ark.m14990a(1, "gads:clamp_native_video_player_dimensions", Boolean.valueOf(true));

    /* renamed from: cg */
    public static final ark<Boolean> f11914cg = ark.m14990a(1, "gads:enable_store_active_view_state", Boolean.valueOf(false));

    /* renamed from: ch */
    public static final ark<Boolean> f11915ch = ark.m14990a(1, "gads:enable_singleton_broadcast_receiver", Boolean.valueOf(false));

    /* renamed from: ci */
    public static final ark<Boolean> f11916ci = ark.m14990a(1, "gads:native:overlay_new_fix:enabled", Boolean.valueOf(true));

    /* renamed from: cj */
    public static final ark<Boolean> f11917cj = ark.m14990a(1, "gads:native:count_impression_for_assets", Boolean.valueOf(false));

    /* renamed from: ck */
    public static final ark<Boolean> f11918ck = ark.m14990a(1, "gads:native:custom_one_point_five_click:enable", Boolean.valueOf(true));

    /* renamed from: cl */
    public static final ark<Boolean> f11919cl = ark.m14990a(1, "gads:unified_native_ad:enable", Boolean.valueOf(true));

    /* renamed from: cm */
    public static final ark<Boolean> f11920cm = ark.m14990a(1, "gads:fluid_ad:use_wrap_content_height", Boolean.valueOf(false));

    /* renamed from: cn */
    public static final ark<Boolean> f11921cn = ark.m14990a(0, "gads:method_tracing:enabled", Boolean.valueOf(false));

    /* renamed from: co */
    public static final ark<Long> f11922co = ark.m14989a(0, "gads:method_tracing:duration_ms", 30000);

    /* renamed from: cp */
    public static final ark<Integer> f11923cp = ark.m14988a(0, "gads:method_tracing:count", 5);

    /* renamed from: cq */
    public static final ark<Integer> f11924cq = ark.m14988a(0, "gads:method_tracing:filesize", 134217728);

    /* renamed from: cr */
    public static final ark<Long> f11925cr = ark.m14989a(1, "gads:auto_location_timeout", (long) AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);

    /* renamed from: cs */
    public static final ark<Boolean> f11926cs = ark.m14990a(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));

    /* renamed from: ct */
    public static final ark<Long> f11927ct = ark.m14989a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);

    /* renamed from: cu */
    public static final ark<String> f11928cu = ark.m14991a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");

    /* renamed from: cv */
    public static final ark<String> f11929cv = ark.m14991a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");

    /* renamed from: cw */
    public static final ark<String> f11930cw = ark.m14991a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");

    /* renamed from: cx */
    public static final ark<String> f11931cx = ark.m14991a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");

    /* renamed from: cy */
    public static final ark<String> f11932cy = ark.m14991a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");

    /* renamed from: cz */
    public static final ark<Long> f11933cz = ark.m14989a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);

    /* renamed from: d */
    public static final ark<Boolean> f11934d = ark.m14990a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));

    /* renamed from: dA */
    private static final ark<String> f11935dA = ark.m14986a(0, "gads:video_stream_cache:experiment_id");

    /* renamed from: dB */
    private static final ark<Boolean> f11936dB = ark.m14990a(0, "gads:ad_id_app_context:enabled", Boolean.valueOf(false));

    /* renamed from: dC */
    private static final ark<Float> f11937dC = ark.m14987a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);

    /* renamed from: dD */
    private static final ark<String> f11938dD = ark.m14986a(0, "gads:ad_id_app_context:experiment_id");

    /* renamed from: dE */
    private static final ark<String> f11939dE = ark.m14986a(0, "gads:ad_id_use_shared_preference:experiment_id");

    /* renamed from: dF */
    private static final ark<Boolean> f11940dF = ark.m14990a(0, "gads:ad_id_use_shared_preference:enabled", Boolean.valueOf(false));

    /* renamed from: dG */
    private static final ark<Float> f11941dG = ark.m14987a(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);

    /* renamed from: dH */
    private static final ark<Boolean> f11942dH = ark.m14990a(0, "gads:ad_id_use_persistent_service:enabled", Boolean.valueOf(false));

    /* renamed from: dI */
    private static final ark<Boolean> f11943dI = ark.m14990a(0, "gads:ad_id:use_ipc:enabled", Boolean.valueOf(false));

    /* renamed from: dJ */
    private static final ark<String> f11944dJ = ark.m14992b(0, "gads:looper_for_gms_client:experiment_id");

    /* renamed from: dK */
    private static final ark<Boolean> f11945dK = ark.m14990a(0, "gads:sw_dynamite:enabled", Boolean.valueOf(true));

    /* renamed from: dL */
    private static final ark<String> f11946dL = ark.m14986a(0, "gads:app_index:experiment_id");

    /* renamed from: dM */
    private static final ark<String> f11947dM = ark.m14986a(0, "gads:kitkat_interstitial_workaround:experiment_id");

    /* renamed from: dN */
    private static final ark<String> f11948dN = ark.m14986a(0, "gads:interstitial_follow_url:experiment_id");

    /* renamed from: dO */
    private static final ark<Boolean> f11949dO = ark.m14990a(0, "gads:analytics_enabled", Boolean.valueOf(true));

    /* renamed from: dP */
    private static final ark<Integer> f11950dP = ark.m14988a(0, "gads:webview_cache_version", 0);

    /* renamed from: dQ */
    private static final ark<String> f11951dQ = ark.m14992b(0, "gads:pan:experiment_id");

    /* renamed from: dR */
    private static final ark<Boolean> f11952dR = ark.m14990a(0, "gads:ad_serving:enabled", Boolean.valueOf(true));

    /* renamed from: dS */
    private static final ark<Boolean> f11953dS = ark.m14990a(1, "gads:impression_optimization_enabled", Boolean.valueOf(false));

    /* renamed from: dT */
    private static final ark<String> f11954dT = ark.m14991a(1, "gads:banner_ad_pool:schema", "customTargeting");

    /* renamed from: dU */
    private static final ark<Integer> f11955dU = ark.m14988a(1, "gads:banner_ad_pool:max_queues", 3);

    /* renamed from: dV */
    private static final ark<Integer> f11956dV = ark.m14988a(1, "gads:banner_ad_pool:max_pools", 3);

    /* renamed from: dW */
    private static final ark<Integer> f11957dW = ark.m14988a(1, "gads:heap_wastage:bytes", 0);

    /* renamed from: dX */
    private static final ark<Boolean> f11958dX = ark.m14990a(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: dY */
    private static final ark<Boolean> f11959dY = ark.m14990a(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: dZ */
    private static final ark<Boolean> f11960dZ = ark.m14990a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: da */
    public static final ark<Integer> f11961da = ark.m14988a(1, "gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: db */
    public static final ark<Boolean> f11962db = ark.m14990a(1, "gads:clearcut_logging:enabled", Boolean.valueOf(false));

    /* renamed from: dc */
    public static final ark<Boolean> f11963dc = ark.m14990a(1, "gads:clearcut_logging:write_to_file", Boolean.valueOf(false));

    /* renamed from: dd */
    public static final ark<Boolean> f11964dd = ark.m14990a(0, "gad:force_local_ad_request_service:enabled", Boolean.valueOf(false));

    /* renamed from: de */
    public static final ark<Boolean> f11965de = ark.m14990a(0, "gad:force_dynamite_loading_enabled", Boolean.valueOf(false));

    /* renamed from: df */
    public static final ark<Integer> f11966df = ark.m14988a(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: dg */
    public static final ark<Boolean> f11967dg = ark.m14990a(1, "gads:omid:enabled", Boolean.valueOf(false));

    /* renamed from: dh */
    public static final ark<Boolean> f11968dh = ark.m14990a(1, "gads:nonagon:banner:check_dp_size", Boolean.valueOf(false));

    /* renamed from: di */
    public static final ark<Long> f11969di = ark.m14989a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: dj */
    public static final ark<String> f11970dj = ark.m14991a(0, "gads:public_beta:traffic_multiplier", "1.0");

    /* renamed from: dk */
    public static final ark<Boolean> f11971dk = ark.m14990a(1, "gads:real_test_request:enabled", Boolean.valueOf(true));

    /* renamed from: dl */
    public static final ark<Boolean> f11972dl = ark.m14990a(1, "gads:real_test_request:render_webview_label", Boolean.valueOf(true));

    /* renamed from: dm */
    public static final ark<Boolean> f11973dm = ark.m14990a(1, "gads:real_test_request:render_native_label", Boolean.valueOf(true));

    /* renamed from: dn */
    public static final ark<Integer> f11974dn = ark.m14988a(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: do */
    public static final ark<Integer> f11975do = ark.m14988a(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 27);

    /* renamed from: dp */
    public static final ark<Integer> f11976dp = ark.m14988a(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 26);

    /* renamed from: dq */
    public static final ark<Integer> f11977dq = ark.m14988a(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 27);

    /* renamed from: dr */
    private static final ark<String> f11978dr = ark.m14986a(0, "gads:sdk_core_experiment_id");

    /* renamed from: ds */
    private static final ark<String> f11979ds = ark.m14991a(0, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");

    /* renamed from: dt */
    private static final ark<Boolean> f11980dt = ark.m14990a(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));

    /* renamed from: du */
    private static final ark<String> f11981du = ark.m14986a(0, "gads:request_builder:singleton_webview_experiment_id");

    /* renamed from: dv */
    private static final ark<Boolean> f11982dv = ark.m14990a(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));

    /* renamed from: dw */
    private static final ark<String> f11983dw = ark.m14986a(0, "gads:sdk_use_dynamic_module_experiment_id");

    /* renamed from: dx */
    private static final ark<String> f11984dx = ark.m14986a(0, "gads:block_autoclicks_experiment_id");

    /* renamed from: dy */
    private static final ark<String> f11985dy = ark.m14986a(0, "gads:spam_app_context:experiment_id");

    /* renamed from: dz */
    private static final ark<Integer> f11986dz = ark.m14988a(1, "gads:http_url_connection_factory:timeout_millis", 10000);

    /* renamed from: e */
    public static final ark<String> f11987e = ark.m14991a(0, "gads:sdk_crash_report_class_prefix", "com.google.");

    /* renamed from: eA */
    private static final ark<Long> f11988eA = ark.m14989a(1, "gads:cache:javascript_timeout_millis", (long) DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: eB */
    private static final ark<Boolean> f11989eB = ark.m14990a(1, "gads:cache:connection_per_read", Boolean.valueOf(false));

    /* renamed from: eC */
    private static final ark<Long> f11990eC = ark.m14989a(1, "gads:cache:connection_timeout", (long) DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: eD */
    private static final ark<Long> f11991eD = ark.m14989a(1, "gads:cache:read_only_connection_timeout", (long) DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: eE */
    private static final ark<Boolean> f11992eE = ark.m14990a(0, "gads:nonagon:red_button", Boolean.valueOf(false));

    /* renamed from: eF */
    private static final ark<Boolean> f11993eF = ark.m14990a(1, "gads:nonagon:banner:enabled", Boolean.valueOf(false));

    /* renamed from: eG */
    private static final ark<String> f11994eG = ark.m14991a(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");

    /* renamed from: eH */
    private static final ark<Boolean> f11995eH = ark.m14990a(1, "gads:nonagon:interstitial:enabled", Boolean.valueOf(false));

    /* renamed from: eI */
    private static final ark<String> f11996eI = ark.m14991a(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");

    /* renamed from: eJ */
    private static final ark<Boolean> f11997eJ = ark.m14990a(1, "gads:nonagon:rewardedvideo:enabled", Boolean.valueOf(false));

    /* renamed from: eK */
    private static final ark<Boolean> f11998eK = ark.m14990a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", Boolean.valueOf(false));

    /* renamed from: eL */
    private static final ark<String> f11999eL = ark.m14991a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");

    /* renamed from: eM */
    private static final ark<Boolean> f12000eM = ark.m14990a(1, "gads:nonagon:nativead:enabled", Boolean.valueOf(false));

    /* renamed from: eN */
    private static final ark<String> f12001eN = ark.m14991a(1, "gads:nonagon:nativead:app_name", "(?!)");

    /* renamed from: eO */
    private static final ark<Boolean> f12002eO = ark.m14990a(1, "gads:nonagon:service:enabled", Boolean.valueOf(false));

    /* renamed from: eP */
    private static final ark<Boolean> f12003eP = ark.m14990a(1, "gads:signals:ad_id_info:enabled", Boolean.valueOf(false));

    /* renamed from: eQ */
    private static final ark<Boolean> f12004eQ = ark.m14990a(1, "gads:signals:app_index:enabled", Boolean.valueOf(false));

    /* renamed from: eR */
    private static final ark<Boolean> f12005eR = ark.m14990a(1, "gads:signals:cache:enabled", Boolean.valueOf(false));

    /* renamed from: eS */
    private static final ark<Boolean> f12006eS = ark.m14990a(1, "gads:signals:doritos:enabled", Boolean.valueOf(false));

    /* renamed from: eT */
    private static final ark<Boolean> f12007eT = ark.m14990a(1, "gads:signals:location:enabled", Boolean.valueOf(false));

    /* renamed from: eU */
    private static final ark<Boolean> f12008eU = ark.m14990a(1, "gads:signals:network_prediction:enabled", Boolean.valueOf(false));

    /* renamed from: eV */
    private static final ark<Boolean> f12009eV = ark.m14990a(1, "gads:signals:parental_control:enabled", Boolean.valueOf(false));

    /* renamed from: eW */
    private static byte[] f12010eW;

    /* renamed from: ea */
    private static final ark<Boolean> f12011ea = ark.m14990a(0, "gads:request_pkg:enabled", Boolean.valueOf(true));

    /* renamed from: eb */
    private static final ark<String> f12012eb = ark.m14986a(0, "gads:gmsg:video_meta:experiment_id");

    /* renamed from: ec */
    private static final ark<Long> f12013ec = ark.m14989a(1, "gads:network:cache_prediction_duration_s", 300);

    /* renamed from: ed */
    private static final ark<Long> f12014ed = ark.m14989a(1, "gads:rtb_signal_timeout_ms", 1000);

    /* renamed from: ee */
    private static final ark<Boolean> f12015ee = ark.m14990a(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));

    /* renamed from: ef */
    private static final ark<Boolean> f12016ef = ark.m14990a(0, "gads:edu_device_helper:enabled", Boolean.valueOf(true));

    /* renamed from: eg */
    private static final ark<String> f12017eg = ark.m14986a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");

    /* renamed from: eh */
    private static final ark<String> f12018eh = ark.m14986a(1, "gads:sdk_core_constants:experiment_id");

    /* renamed from: ei */
    private static final ark<Boolean> f12019ei = ark.m14990a(1, "gads:js_flags:disable_phenotype", Boolean.valueOf(false));

    /* renamed from: ej */
    private static final ark<String> f12020ej = ark.m14991a(0, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");

    /* renamed from: ek */
    private static final ark<String> f12021ek = ark.m14991a(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: el */
    private static final ark<String> f12022el = ark.m14986a(1, "gads:singleton_webview_native:experiment_id");

    /* renamed from: em */
    private static final ark<Boolean> f12023em = ark.m14990a(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));

    /* renamed from: en */
    private static final ark<String> f12024en = ark.m14992b(1, "gads:auto_location_for_coarse_permission:experiment_id");

    /* renamed from: eo */
    private static final ark<String> f12025eo = ark.m14992b(1, "gads:auto_location_timeout:experiment_id");

    /* renamed from: ep */
    private static final ark<Long> f12026ep = ark.m14989a(1, "gads:auto_location_interval", -1);

    /* renamed from: eq */
    private static final ark<String> f12027eq = ark.m14992b(1, "gads:auto_location_interval:experiment_id");

    /* renamed from: er */
    private static final ark<String> f12028er = ark.m14986a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");

    /* renamed from: es */
    private static final ark<String> f12029es = ark.m14986a(0, "gads:afs:csa:experiment_id");

    /* renamed from: et */
    private static final ark<Boolean> f12030et = ark.m14990a(0, "gads:afs:csa_ad_manager_enabled", Boolean.valueOf(true));

    /* renamed from: eu */
    private static final ark<Boolean> f12031eu = ark.m14990a(1, "gads:parental_controls:send_from_client", Boolean.valueOf(true));

    /* renamed from: ev */
    private static final ark<Boolean> f12032ev = ark.m14990a(1, "gads:parental_controls:cache_results", Boolean.valueOf(true));

    /* renamed from: ew */
    private static final ark<String> f12033ew = ark.m14991a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");

    /* renamed from: ex */
    private static final ark<Long> f12034ex = ark.m14989a(0, "gads:safe_browsing:safety_net:delay_ms", (long) AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);

    /* renamed from: ey */
    private static final ark<Integer> f12035ey = ark.m14988a(1, "gads:cache:ad_request_timeout_millis", 250);

    /* renamed from: ez */
    private static final ark<Integer> f12036ez = ark.m14988a(1, "gads:cache:max_concurrent_downloads", 10);

    /* renamed from: f */
    public static final ark<Float> f12037f = ark.m14987a(1, "gads:trapped_exception_sample_rate", 0.01f);

    /* renamed from: g */
    public static final ark<Boolean> f12038g = ark.m14990a(0, "gads:block_autoclicks", Boolean.valueOf(false));

    /* renamed from: h */
    public static final ark<String> f12039h = ark.m14991a(1, "gads:video_exo_player:version", "1");

    /* renamed from: i */
    public static final ark<Integer> f12040i = ark.m14988a(1, "gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: j */
    public static final ark<Integer> f12041j = ark.m14988a(1, "gads:video_exo_player:read_timeout", 8000);

    /* renamed from: k */
    public static final ark<Integer> f12042k = ark.m14988a(1, "gads:video_exo_player:loading_check_interval", (int) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);

    /* renamed from: l */
    public static final ark<Integer> f12043l = ark.m14988a(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: m */
    public static final ark<Integer> f12044m = ark.m14988a(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: n */
    public static final ark<Integer> f12045n = ark.m14988a(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: o */
    public static final ark<Integer> f12046o = ark.m14988a(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: p */
    public static final ark<Integer> f12047p = ark.m14988a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: q */
    public static final ark<Long> f12048q = ark.m14989a(1, "gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: r */
    public static final ark<Long> f12049r = ark.m14989a(1, "gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: s */
    public static final ark<Integer> f12050s = ark.m14988a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);

    /* renamed from: t */
    public static final ark<Boolean> f12051t = ark.m14990a(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));

    /* renamed from: u */
    public static final ark<String> f12052u = ark.m14991a(1, "gads:video:metric_frame_hash_times", "");

    /* renamed from: v */
    public static final ark<Long> f12053v = ark.m14989a(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: w */
    public static final ark<Boolean> f12054w = ark.m14990a(1, "gads:video:force_watermark", Boolean.valueOf(false));

    /* renamed from: x */
    public static final ark<Long> f12055x = ark.m14989a(1, "gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: y */
    public static final ark<Boolean> f12056y = ark.m14990a(1, "gads:video:spinner:enabled", Boolean.valueOf(false));

    /* renamed from: z */
    public static final ark<Integer> f12057z = ark.m14988a(1, "gads:video:spinner:scale", 4);

    /* renamed from: a */
    public static List<String> m15023a() {
        return aoq.m14619e().mo14689a();
    }

    /* renamed from: a */
    public static void m15024a(Context context) {
        C3966lq.m17350a(context, new arv(context));
        int intValue = ((Integer) aoq.m14620f().mo14695a(f11957dW)).intValue();
        if (intValue > 0 && f12010eW == null) {
            f12010eW = new byte[intValue];
        }
    }

    /* renamed from: a */
    public static void m15025a(Context context, int i, JSONObject jSONObject) {
        aoq.m14618d();
        Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
        aoq.m14619e().mo14690a(edit, 1, jSONObject);
        aoq.m14618d();
        edit.commit();
    }

    /* renamed from: b */
    public static List<String> m15026b() {
        return aoq.m14619e().mo14692b();
    }
}
