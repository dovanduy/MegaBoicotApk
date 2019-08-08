package com.startapp.android.publish.ads.banner.bannerstandard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.p055c.p056a.p057a.p058a.p060b.C1435a;
import com.p055c.p056a.p057a.p058a.p060b.C1437b;
import com.startapp.android.publish.ads.banner.BannerBase;
import com.startapp.android.publish.ads.banner.BannerInterface;
import com.startapp.android.publish.ads.banner.BannerListener;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.ads.banner.C5144c;
import com.startapp.android.publish.ads.banner.C5145d;
import com.startapp.android.publish.ads.banner.bannerstandard.CloseableLayout.C5138a;
import com.startapp.android.publish.ads.banner.bannerstandard.CloseableLayout.C5139b;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.C5286Ad.AdState;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.C5402i;
import com.startapp.android.publish.adsCommon.C5402i.C5404a;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adinformation.C5330b;
import com.startapp.android.publish.adsCommon.adinformation.C5330b.C5338b;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5383a;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5383a.C5384a;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5385b;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5386c;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5387d;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5388e;
import com.startapp.android.publish.adsCommon.p183g.p185b.C5389a;
import com.startapp.android.publish.adsCommon.p183g.p185b.C5390b;
import com.startapp.android.publish.adsCommon.p183g.p186c.C5391a;
import com.startapp.android.publish.adsCommon.p183g.p186c.C5392b;
import com.startapp.android.publish.adsCommon.p192l.C5424c;
import com.startapp.android.publish.adsCommon.p192l.C5424c.C5426a;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.html.JsInterface;
import com.startapp.android.publish.omsdk.C5497a;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: StartAppSDK */
public class BannerStandard extends BannerBase implements BannerInterface, AdEventListener {
    private static final int ID_WEBVIEW = 159868225;
    private static final String TAG = "BannerHtml";
    protected C5141a adHtml;
    private RelativeLayout adInformationContatiner;
    private C5330b adInformationLayout;
    protected AdPreferences adPreferences;
    private C1437b adSession;
    private boolean callbackSent;
    private boolean clickCallbackSent;
    private CloseableLayout closeableAdContainer;
    private boolean defaultLoad;
    /* access modifiers changed from: private */
    public long htmlRenderTime;
    private final Handler htmlRenderWaitingTimer;
    private boolean initBannerCalled;
    /* access modifiers changed from: private */
    public boolean jsTag;
    protected BannerListener listener;
    private boolean loaded;
    /* access modifiers changed from: private */
    public MraidBannerController mraidController;
    /* access modifiers changed from: private */
    public MraidBannerController mraidTwoPartController;
    private BannerOptions options;
    private ViewGroup rootView;
    private C5402i scheduledImpression;
    /* access modifiers changed from: private */
    public C5145d size;
    private C5424c twoPartViewabilityTracker;
    public WebView twoPartWebView;
    private C5424c viewabilityTracker;
    private boolean visible;
    public WebView webView;
    private RelativeLayout webViewContainer;
    /* access modifiers changed from: private */
    public boolean webViewTouched;

    /* compiled from: StartAppSDK */
    private class MraidBannerController extends C5383a {
        private WebView activeWebView;
        /* access modifiers changed from: private */
        public C5387d mraidState = C5387d.LOADING;
        private boolean mraidVisibility = false;
        /* access modifiers changed from: private */
        public C5390b nativeFeatureManager;
        private C5391a orientationProperties;
        private C5392b resizeProperties;

        /* compiled from: StartAppSDK */
        class BannerWebViewClient extends C5388e {
            BannerWebViewClient(C5385b bVar) {
                super(bVar);
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (MraidBannerController.this.mraidState == C5387d.LOADING) {
                    C5386c.m23033a("inline", webView);
                    C5389a.m23036a(BannerStandard.this.getContext(), webView, MraidBannerController.this.nativeFeatureManager);
                    MraidBannerController.this.updateDisplayMetrics(webView);
                    MraidBannerController.this.mraidState = C5387d.DEFAULT;
                    C5386c.m23032a(MraidBannerController.this.mraidState, webView);
                    C5386c.m23028a(webView);
                }
                BannerStandard.this.onWebviewPageFinished(webView);
            }
        }

        MraidBannerController(WebView webView, C5384a aVar) {
            super(aVar);
            this.activeWebView = webView;
            this.activeWebView.setWebViewClient(new BannerWebViewClient(this));
            this.nativeFeatureManager = new C5390b(BannerStandard.this.getContext());
            this.orientationProperties = new C5391a();
        }

        /* access modifiers changed from: 0000 */
        public C5392b getResizeProperties() {
            return this.resizeProperties;
        }

        public void setResizeProperties(Map<String, String> map) {
            boolean z;
            try {
                int parseInt = Integer.parseInt((String) map.get("width"));
                int parseInt2 = Integer.parseInt((String) map.get("height"));
                int parseInt3 = Integer.parseInt((String) map.get("offsetX"));
                int parseInt4 = Integer.parseInt((String) map.get("offsetY"));
                String str = (String) map.get("allowOffscreen");
                String str2 = (String) map.get("customClosePosition");
                if (str != null) {
                    if (!Boolean.parseBoolean(str)) {
                        z = false;
                        C5392b bVar = new C5392b(parseInt, parseInt2, parseInt3, parseInt4, str2, z);
                        this.resizeProperties = bVar;
                    }
                }
                z = true;
                C5392b bVar2 = new C5392b(parseInt, parseInt2, parseInt3, parseInt4, str2, z);
                this.resizeProperties = bVar2;
            } catch (Exception unused) {
                C5386c.m23029a(this.activeWebView, "wrong format", "setResizeProperties");
            }
        }

        /* access modifiers changed from: 0000 */
        public C5387d getState() {
            return this.mraidState;
        }

        /* access modifiers changed from: 0000 */
        public void setState(C5387d dVar) {
            this.mraidState = dVar;
            C5386c.m23032a(this.mraidState, this.activeWebView);
        }

        public void close() {
            BannerStandard.this.handleCollapse();
        }

        public void expand(String str) {
            BannerStandard.this.handleExpand(str);
        }

        public void resize() {
            BannerStandard.this.handleResize();
        }

        public void useCustomClose(String str) {
            BannerStandard.this.handleCustomClose(Boolean.parseBoolean(str));
        }

        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
            String str = (String) map.get("forceOrientation");
            if (this.orientationProperties.f17258a != parseBoolean || this.orientationProperties.f17259b != C5391a.m23044a(str)) {
                this.orientationProperties.f17258a = parseBoolean;
                this.orientationProperties.f17259b = C5391a.m23044a(str);
                applyOrientationProperties((Activity) BannerStandard.this.getContext(), this.orientationProperties);
            }
        }

        public void setExpandProperties(Map<String, String> map) {
            String str = (String) map.get("useCustomClose");
            if (str != null) {
                BannerStandard.this.handleCustomClose(Boolean.parseBoolean(str));
            }
        }

        public boolean isFeatureSupported(String str) {
            return this.nativeFeatureManager.mo19933a(str);
        }

        /* access modifiers changed from: private */
        public void fireViewableChangeEvent(boolean z) {
            if (this.mraidVisibility != z) {
                this.mraidVisibility = z;
                C5386c.m23031a(this.activeWebView, this.mraidVisibility);
            }
        }

        /* access modifiers changed from: private */
        public void updateDisplayMetrics(WebView webView) {
            Context context = BannerStandard.this.getContext();
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                BannerStandard.this.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                C5386c.m23027a(context, i, i2, webView);
                C5386c.m23034b(context, i3, i4, BannerStandard.this.size.mo18956a(), BannerStandard.this.size.mo18959b(), webView);
                C5386c.m23035b(context, i, i2, webView);
                C5386c.m23026a(context, i3, i4, BannerStandard.this.size.mo18956a(), BannerStandard.this.size.mo18959b(), webView);
            } catch (Exception e) {
                C5378f.m23016a(context, C5376d.EXCEPTION, "BannerStandard.updateDisplayMetrics", e.getMessage(), "");
            }
        }
    }

    /* access modifiers changed from: protected */
    public String getBannerName() {
        return "StartApp Banner";
    }

    /* access modifiers changed from: protected */
    public int getBannerType() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getHeightInDp() {
        return 50;
    }

    /* access modifiers changed from: protected */
    public int getWidthInDp() {
        return 300;
    }

    public BannerStandard(Activity activity) {
        this((Context) activity);
    }

    public BannerStandard(Activity activity, AdPreferences adPreferences2) {
        this((Context) activity, adPreferences2);
    }

    public BannerStandard(Activity activity, BannerListener bannerListener) {
        this((Context) activity, bannerListener);
    }

    public BannerStandard(Activity activity, AdPreferences adPreferences2, BannerListener bannerListener) {
        this((Context) activity, adPreferences2, bannerListener);
    }

    public BannerStandard(Activity activity, boolean z) {
        this((Context) activity, z);
    }

    public BannerStandard(Activity activity, boolean z, AdPreferences adPreferences2) {
        this((Context) activity, z, adPreferences2);
    }

    public BannerStandard(Activity activity, AttributeSet attributeSet) {
        this((Context) activity, attributeSet);
    }

    public BannerStandard(Activity activity, AttributeSet attributeSet, int i) {
        this((Context) activity, attributeSet, i);
    }

    @Deprecated
    public BannerStandard(Context context) {
        this(context, true, (AdPreferences) null);
    }

    @Deprecated
    public BannerStandard(Context context, AdPreferences adPreferences2) {
        this(context, true, adPreferences2);
    }

    @Deprecated
    public BannerStandard(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public BannerStandard(Context context, AdPreferences adPreferences2, BannerListener bannerListener) {
        this(context, true, adPreferences2);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public BannerStandard(Context context, boolean z) {
        this(context, z, (AdPreferences) null);
    }

    @Deprecated
    public BannerStandard(Context context, boolean z, AdPreferences adPreferences2) {
        super(context);
        this.loaded = false;
        this.webViewTouched = true;
        this.jsTag = false;
        this.defaultLoad = true;
        this.visible = true;
        this.initBannerCalled = false;
        this.htmlRenderWaitingTimer = new Handler(Looper.getMainLooper());
        this.callbackSent = false;
        this.clickCallbackSent = false;
        this.adInformationLayout = null;
        this.adInformationContatiner = null;
        try {
            this.defaultLoad = z;
            this.adPreferences = adPreferences2;
            init();
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "BannerStandard.constructor - unexpected error occurd", e.getMessage(), "");
        }
    }

    @Deprecated
    public BannerStandard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public BannerStandard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loaded = false;
        this.webViewTouched = true;
        this.jsTag = false;
        this.defaultLoad = true;
        this.visible = true;
        this.initBannerCalled = false;
        this.htmlRenderWaitingTimer = new Handler(Looper.getMainLooper());
        this.callbackSent = false;
        this.clickCallbackSent = false;
        this.adInformationLayout = null;
        this.adInformationContatiner = null;
        try {
            init();
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "BannerStandard.constructor - unexpected error occurd", e.getMessage(), "");
        }
    }

    private void addAdInformationLayout() {
        if (this.adInformationLayout == null && this.adInformationContatiner == null) {
            this.adInformationContatiner = new RelativeLayout(getContext());
            this.adInformationLayout = new C5330b(getContext(), C5338b.SMALL, Placement.INAPP_BANNER, this.adHtml.getAdInfoOverride());
            this.adInformationLayout.mo19713a(this.adInformationContatiner);
        }
        try {
            ViewGroup viewGroup = (ViewGroup) this.adInformationContatiner.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.adInformationContatiner);
            }
        } catch (Exception unused) {
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.webView.addView(this.adInformationContatiner, layoutParams);
    }

    public void hideBanner() {
        this.visible = false;
        setVisibility(8);
    }

    public void showBanner() {
        this.visible = true;
        setVisibility(0);
    }

    private void prepareWebView(WebView webView2) {
        webView2.setBackgroundColor(0);
        webView2.setHorizontalScrollBarEnabled(false);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setVerticalScrollBarEnabled(false);
        webView2.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                BannerStandard.this.webViewTouched = true;
                if (motionEvent.getAction() == 2) {
                    return true;
                }
                return false;
            }
        });
        webView2.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View view) {
                return true;
            }
        });
        webView2.setLongClickable(false);
    }

    /* access modifiers changed from: protected */
    public void initRuntime() {
        try {
            Context context = getContext();
            this.closeableAdContainer = new CloseableLayout(context);
            this.closeableAdContainer.setOnCloseListener(new C5139b() {
                public void onClose() {
                    BannerStandard.this.handleCollapse();
                }
            });
            this.webView = new WebView(context);
            this.mraidController = new MraidBannerController(this.webView, new C5384a() {
                public boolean onClickEvent(String str) {
                    if (!BannerStandard.this.jsTag || BannerStandard.this.webViewTouched) {
                        return BannerStandard.this.handleClick(str);
                    }
                    return false;
                }
            });
            this.options = new BannerOptions();
            this.adHtml = new C5141a(context, getOffset());
            if (this.adPreferences == null) {
                this.adPreferences = new AdPreferences();
            }
            this.size = new C5145d(getWidthInDp(), getHeightInDp());
            if (getId() == -1) {
                setId(getBannerId());
            }
            this.webView.setId(ID_WEBVIEW);
            setVisibility(8);
            prepareWebView(this.webView);
            this.options = C5144c.m22086a().mo18953c();
            getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    C5509c.m23511a(BannerStandard.this.getViewTreeObserver(), (OnGlobalLayoutListener) this);
                    BannerStandard.this.setHardwareAcceleration(BannerStandard.this.adPreferences);
                    BannerStandard.this.initBanner();
                }
            });
        } catch (Exception e) {
            C5378f.m23016a(getContext(), C5376d.EXCEPTION, "BannerStandard.init - webview failed", e.getMessage(), "");
            C5518g.m23563a(TAG, 6, "webVIew exception");
            hideBanner();
            onFailedToReceiveBanner("BannerStandard.init - webview failed");
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams.width > 0 && layoutParams.height > 0) {
            new Handler().post(new Runnable() {
                public void run() {
                    BannerStandard.this.initBanner();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void initBanner() {
        if (!this.initBannerCalled && this.webView != null) {
            C5518g.m23563a(TAG, 3, "Initializing BannerHtml");
            this.initBannerCalled = true;
            int a = C5306h.m22641a(getContext(), this.size.mo18956a());
            int a2 = C5306h.m22641a(getContext(), this.size.mo18959b());
            setMinimumWidth(a);
            setMinimumHeight(a2);
            this.webView.addJavascriptInterface(new JsInterface(getContext(), (Runnable) new Runnable() {
                public void run() {
                }
            }, new C5363b(getAdTag()), this.adHtml.mo19845e(0)), "startappwall");
            this.webViewContainer = new RelativeLayout(getContext());
            attachWebViewToContainer(this.webView);
            if (getLayoutParams() != null) {
                LayoutParams layoutParams = new LayoutParams(getLayoutParams().width, getLayoutParams().height);
                layoutParams.addRule(13);
                addView(this.webViewContainer, layoutParams);
            } else {
                addView(this.webViewContainer);
            }
            if (this.loaded || this.isManualLoading) {
                C5518g.m23563a(TAG, 3, "BannerHTML already Loaded");
                onReceiveAd(this.adHtml);
            } else if (this.defaultLoad) {
                loadBanner();
            }
        }
    }

    private void attachWebViewToContainer(View view) {
        LayoutParams layoutParams = new LayoutParams(C5306h.m22641a(getContext(), this.size.mo18956a()), C5306h.m22641a(getContext(), this.size.mo18959b()));
        layoutParams.addRule(13);
        this.webViewContainer.addView(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void scheduleReloadTask() {
        if (this.scheduledImpression != null && this.scheduledImpression.mo19953c()) {
            super.scheduleReloadTask();
        }
    }

    /* access modifiers changed from: protected */
    public void reload() {
        C5518g.m23563a(TAG, 3, "Loading from network");
        if (this.adSession != null) {
            this.adSession.mo6486b();
            this.adSession = null;
        }
        if (this.adPreferences == null) {
            this.adPreferences = new AdPreferences();
        }
        Point availableSize = this.isManualLoading ? this.desirableSizeForManualLoading : getAvailableSize();
        this.adHtml.mo19835a(availableSize.x, availableSize.y);
        this.adHtml.setState(AdState.UN_INITIALIZED);
        this.adHtml.mo18948a(getBannerType());
        this.adHtml.load(this.adPreferences, this);
    }

    private Point getAvailableSize() {
        Point point = new Point();
        if (getLayoutParams() != null && getLayoutParams().width > 0) {
            point.x = C5306h.m22650b(getContext(), getLayoutParams().width + 1);
        }
        if (getLayoutParams() != null && getLayoutParams().height > 0) {
            point.y = C5306h.m22650b(getContext(), getLayoutParams().height + 1);
        }
        if (getLayoutParams() != null && getLayoutParams().width > 0 && getLayoutParams().height > 0) {
            this.adHtml.mo18949a(true);
        }
        if (getLayoutParams() == null || getLayoutParams().width <= 0 || getLayoutParams().height <= 0) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            try {
                View view = (View) getParent();
                while (view != null && (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0)) {
                    if (view.getMeasuredWidth() > 0) {
                        setPointWidthIfNotSet(point, C5306h.m22650b(getContext(), (view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight()));
                    }
                    if (view.getMeasuredHeight() > 0) {
                        setPointHeightIfNotSet(point, C5306h.m22650b(getContext(), (view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()));
                    }
                    view = (View) view.getParent();
                }
                if (view == null) {
                    determineSizeByScreen(point, displayMetrics);
                } else {
                    setPointWidthIfNotSet(point, C5306h.m22650b(getContext(), (view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight()));
                    setPointHeightIfNotSet(point, C5306h.m22650b(getContext(), (view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()));
                }
            } catch (Exception e) {
                C5378f.m23016a(getContext(), C5376d.EXCEPTION, "BannerStandard.getAvailableSize - system service failed", e.getMessage(), "");
                determineSizeByScreen(point, displayMetrics);
            }
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("============ exit Application Size [");
        sb.append(point.x);
        sb.append(",");
        sb.append(point.y);
        sb.append("] =========");
        C5518g.m23563a(str, 3, sb.toString());
        return point;
    }

    private void determineSizeByScreen(Point point, DisplayMetrics displayMetrics) {
        setPointWidthIfNotSet(point, C5306h.m22650b(getContext(), displayMetrics.widthPixels));
        setPointHeightIfNotSet(point, C5306h.m22650b(getContext(), displayMetrics.heightPixels));
    }

    private void setPointWidthIfNotSet(Point point, int i) {
        if (point.x <= 0) {
            point.x = i;
        }
    }

    private void setPointHeightIfNotSet(Point point, int i) {
        if (point.y <= 0) {
            point.y = i;
        }
    }

    public void onReceiveAd(C5286Ad ad) {
        C5518g.m23563a(TAG, 3, " Html Ad Recievied OK");
        if (this.isManualLoading) {
            this.isManualLoading = false;
            this.loaded = true;
            if (this.listener != null && !this.callbackSent) {
                this.callbackSent = true;
                this.listener.onReceiveAd(this);
            }
            return;
        }
        this.webViewTouched = false;
        removeView(this.adInformationContatiner);
        if (this.adHtml == null || this.adHtml.mo19847f() == null || this.adHtml.mo19847f().compareTo("") == 0) {
            C5518g.m23563a(TAG, 6, "No Banner recieved");
            onFailedToReceiveBanner("No Banner received");
        } else {
            this.jsTag = "true".equals(C5307i.m22659a(this.adHtml.mo19847f(), "@jsTag@", "@jsTag@"));
            loadHtml();
            try {
                if (setSize(Integer.parseInt(C5307i.m22659a(this.adHtml.mo19847f(), "@width@", "@width@")), Integer.parseInt(C5307i.m22659a(this.adHtml.mo19847f(), "@height@", "@height@")))) {
                    this.loaded = true;
                    addAdInformationLayout();
                    makeImpression();
                    addDisplayEventOnLoad();
                    addVisibilityTracker();
                    if (this.listener != null && !this.callbackSent) {
                        this.callbackSent = true;
                        this.listener.onReceiveAd(this);
                    }
                    if (this.visible) {
                        setVisibility(0);
                    }
                    C5518g.m23563a(TAG, 3, "Done Loading HTML Banner");
                } else {
                    onFailedToReceiveBanner("Banner cannot be displayed (not enough room)");
                }
            } catch (NumberFormatException unused) {
                C5518g.m23563a(TAG, 6, "Error Casting width & height from HTML");
                onFailedToReceiveBanner("Error Casting width & height from HTML");
            } catch (Exception e) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown error occurred ");
                sb.append(e.getMessage());
                C5518g.m23563a(str, 6, sb.toString());
                onFailedToReceiveBanner(e.getMessage());
            }
        }
    }

    private void onFailedToReceiveBanner(String str) {
        setErrorMessage(str);
        this.isManualLoading = false;
        if (this.listener != null && !this.callbackSent) {
            this.callbackSent = true;
            this.listener.onFailedToReceiveAd(this);
        }
    }

    public void loadHtml() {
        this.htmlRenderWaitingTimer.postDelayed(new Runnable() {
            public void run() {
                BannerStandard.this.load();
            }
        }, (long) getRefreshRate());
        this.htmlRenderTime = System.currentTimeMillis();
        C5307i.m22663a(getContext(), this.webView, this.adHtml.mo19847f());
    }

    private void addVisibilityTracker() {
        if (this.adHtml != null && this.adHtml.mo19859r()) {
            this.viewabilityTracker = new C5424c(this.webView, getMinViewabilityPercentage(), new C5426a() {
                public boolean onUpdate(boolean z) {
                    BannerStandard.this.mraidController.fireViewableChangeEvent(z);
                    return BannerStandard.this.adHtml.mo19859r();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void makeImpression() {
        C5518g.m23563a(TAG, 3, "BannerStandard Scheduling visibility check");
        C5402i iVar = new C5402i(getContext(), this.adHtml.mo19853l(), new C5363b(getAdTag()), getImpressionDelayMillis());
        this.scheduledImpression = iVar;
        this.scheduledImpression.mo19949a((C5404a) new C5404a() {
            public void onSent() {
                BannerStandard.this.htmlRenderTime = System.currentTimeMillis() - BannerStandard.this.htmlRenderTime;
                BannerStandard.this.scheduleReloadTask();
            }
        });
        startVisibilityRunnable(this.scheduledImpression);
    }

    private long getImpressionDelayMillis() {
        if (this.adHtml.mo19857p() != null) {
            return TimeUnit.SECONDS.toMillis(this.adHtml.mo19857p().longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABDisplayImpressionDelayInSeconds());
    }

    private boolean setSize(int i, int i2) {
        Point availableSize = getAvailableSize();
        if (availableSize.x < i || availableSize.y < i2) {
            Point point = new Point(0, 0);
            ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LayoutParams(point.x, point.y);
            } else {
                layoutParams.width = point.x;
                layoutParams.height = point.y;
            }
            this.webView.setLayoutParams(layoutParams);
            return false;
        }
        this.size.mo18958a(i, i2);
        int a = C5306h.m22641a(getContext(), this.size.mo18956a());
        int a2 = C5306h.m22641a(getContext(), this.size.mo18959b());
        setMinimumWidth(a);
        setMinimumHeight(a2);
        ViewGroup.LayoutParams layoutParams2 = this.webView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new LayoutParams(a, a2);
        } else {
            layoutParams2.width = a;
            layoutParams2.height = a2;
        }
        this.webView.setLayoutParams(layoutParams2);
        return true;
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        onFailedToReceiveBanner(ad.getErrorMessage());
    }

    /* access modifiers changed from: protected */
    public void onWebviewPageFinished(WebView webView2) {
        cancelHtmlWaitingTimer();
        if (MetaData.getInstance().isOmsdkEnabled()) {
            this.adSession = C5497a.m23461a(webView2);
            if (this.adSession != null) {
                if (this.adInformationContatiner != null) {
                    this.adSession.mo6487b(this.adInformationContatiner);
                }
                if (this.closeableAdContainer != null) {
                    this.adSession.mo6487b(this.closeableAdContainer);
                }
                this.adSession.mo6485a(webView2);
                this.adSession.mo6484a();
                C1435a.m5917a(this.adSession).mo6473a();
            }
        }
    }

    private void onResume() {
        if (this.webView != null) {
            C5509c.m23526c(this.webView);
        }
        if (this.twoPartWebView != null) {
            C5509c.m23526c(this.twoPartWebView);
        }
    }

    private void onPause() {
        if (this.webView != null) {
            C5509c.m23524b(this.webView);
        }
        if (this.twoPartWebView != null) {
            C5509c.m23524b(this.twoPartWebView);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        onResume();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onPause();
        cancelScheduledImpression(false);
        cancelViewabilityTracking();
        cancelHtmlWaitingTimer();
        if (this.adSession != null) {
            this.adSession.mo6486b();
            this.adSession = null;
            C5307i.m22672a((Object) this.webView, 1000);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            onResume();
        } else {
            onPause();
        }
    }

    public void setBannerListener(BannerListener bannerListener) {
        this.listener = bannerListener;
    }

    /* access modifiers changed from: protected */
    public int getRefreshRate() {
        return this.options.mo18833i();
    }

    /* access modifiers changed from: protected */
    public int getAdjustedRefreshRate() {
        int max = Math.max(getRefreshRate() - ((int) this.htmlRenderTime), 0);
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Next banner refresh rate: ");
        sb.append(max);
        C5518g.m23563a(str, 3, sb.toString());
        return max;
    }

    /* access modifiers changed from: protected */
    public int getOffset() {
        if (this.adHtml == null) {
            return 0;
        }
        return this.adHtml.mo18767a();
    }

    /* access modifiers changed from: protected */
    public int getBannerId() {
        return this.innerBannerStandardId;
    }

    /* access modifiers changed from: protected */
    public void setBannerId(int i) {
        this.innerBannerStandardId = i;
    }

    public void setAdTag(String str) {
        this.adTag = str;
    }

    /* access modifiers changed from: protected */
    public void cancelScheduledImpression(boolean z) {
        if (this.scheduledImpression != null) {
            this.scheduledImpression.mo19950a(z);
        }
    }

    private void cancelViewabilityTracking() {
        if (this.viewabilityTracker != null) {
            this.viewabilityTracker.mo19980a();
        }
        if (this.twoPartViewabilityTracker != null) {
            this.twoPartViewabilityTracker.mo19980a();
        }
    }

    private void cancelHtmlWaitingTimer() {
        this.htmlRenderWaitingTimer.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: private */
    public boolean handleClick(String str) {
        String str2;
        if (!this.clickCallbackSent) {
            this.clickCallbackSent = true;
            if (this.listener != null) {
                this.listener.onClick(this);
            }
        }
        cancelScheduledImpression(true);
        cancelViewabilityTracking();
        cancelHtmlWaitingTimer();
        boolean a = C5349c.m22870a(getContext(), Placement.INAPP_BANNER);
        if (!this.jsTag) {
            str2 = str;
            if (str2.contains("index=")) {
                try {
                    int a2 = C5349c.m22845a(str);
                    String str3 = null;
                    if (!this.adHtml.mo19843d(a2) || a) {
                        Context context = getContext();
                        if (a2 < this.adHtml.mo19854m().length) {
                            str3 = this.adHtml.mo19854m()[a2];
                        }
                        C5349c.m22857a(context, str2, str3, new C5363b(getAdTag()), this.adHtml.mo19845e(a2) && !a, false);
                        this.webView.stopLoading();
                        setClicked(true);
                        return true;
                    }
                    Context context2 = getContext();
                    String str4 = a2 < this.adHtml.mo19854m().length ? this.adHtml.mo19854m()[a2] : null;
                    if (a2 < this.adHtml.mo19856o().length) {
                        str3 = this.adHtml.mo19856o()[a2];
                    }
                    C5349c.m22859a(context2, str2, str4, str3, new C5363b(getAdTag()), C5344b.m22784a().mo19749A(), C5344b.m22784a().mo19750B(), this.adHtml.mo19845e(a2), this.adHtml.mo19846f(a2), false);
                    this.webView.stopLoading();
                    setClicked(true);
                    return true;
                } catch (Exception unused) {
                    C5518g.m23563a(TAG, 6, "Error while trying parsing index from url");
                    return false;
                }
            }
        } else {
            str2 = str;
        }
        if (!this.adHtml.mo19843d(0) || a) {
            C5349c.m22857a(getContext(), str2, this.adHtml.mo19854m()[0], new C5363b(getAdTag()), this.adHtml.mo19845e(0) && !a, false);
            this.webView.stopLoading();
            setClicked(true);
            return true;
        }
        C5349c.m22859a(getContext(), str2, this.adHtml.mo19854m()[0], this.adHtml.mo19856o()[0], new C5363b(getAdTag()), C5344b.m22784a().mo19749A(), C5344b.m22784a().mo19750B(), this.adHtml.mo19845e(0), this.adHtml.mo19846f(0), false);
        this.webView.stopLoading();
        setClicked(true);
        return true;
    }

    /* access modifiers changed from: private */
    public void handleCustomClose(boolean z) {
        if (z != (!this.closeableAdContainer.mo18934c())) {
            this.closeableAdContainer.setCloseVisible(!z);
        }
    }

    /* access modifiers changed from: private */
    public void handleCollapse() {
        if (this.mraidController.getState() != C5387d.LOADING && this.mraidController.getState() != C5387d.HIDDEN) {
            if (this.mraidController.getState() == C5387d.RESIZED || this.mraidController.getState() == C5387d.EXPANDED) {
                if (this.mraidTwoPartController != null) {
                    detachTwoPartMraidController();
                } else {
                    this.closeableAdContainer.removeView(this.webView);
                    attachWebViewToContainer(this.webView);
                    this.webViewContainer.setVisibility(0);
                }
                C5143c.m22084a((View) this.closeableAdContainer);
                this.mraidController.setState(C5387d.DEFAULT);
            } else if (this.mraidController.getState() == C5387d.DEFAULT) {
                this.webViewContainer.setVisibility(4);
                this.mraidController.setState(C5387d.HIDDEN);
            }
            scheduleReloadTask();
        }
    }

    private void setupTwoPartMraidController(String str) {
        this.webViewTouched = false;
        if (this.twoPartWebView == null) {
            this.twoPartWebView = new WebView(getContext());
        }
        this.mraidTwoPartController = new MraidBannerController(this.twoPartWebView, new C5384a() {
            public boolean onClickEvent(String str) {
                if (!BannerStandard.this.jsTag || BannerStandard.this.webViewTouched) {
                    return BannerStandard.this.handleClick(str);
                }
                return false;
            }
        });
        this.twoPartViewabilityTracker = new C5424c(this.twoPartWebView, getMinViewabilityPercentage(), new C5426a() {
            public boolean onUpdate(boolean z) {
                BannerStandard.this.mraidController.fireViewableChangeEvent(z);
                BannerStandard.this.mraidTwoPartController.fireViewableChangeEvent(z);
                return BannerStandard.this.adHtml.mo19859r();
            }
        });
        this.twoPartWebView.setId(159868226);
        prepareWebView(this.twoPartWebView);
        this.twoPartWebView.loadUrl(str);
    }

    private void detachTwoPartMraidController() {
        this.closeableAdContainer.removeView(this.twoPartWebView);
        this.twoPartViewabilityTracker.mo19980a();
        this.twoPartViewabilityTracker = null;
        this.mraidTwoPartController = null;
        this.twoPartWebView.stopLoading();
        this.twoPartWebView = null;
    }

    /* access modifiers changed from: private */
    public void handleExpand(String str) {
        cancelReloadTask();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        boolean z = str != null && !TextUtils.isEmpty(str);
        if (z) {
            setupTwoPartMraidController(str);
        }
        if (this.mraidController.getState() == C5387d.DEFAULT) {
            if (z) {
                this.closeableAdContainer.addView(this.twoPartWebView, layoutParams);
            } else {
                this.webViewContainer.removeView(this.webView);
                this.webViewContainer.setVisibility(4);
                this.closeableAdContainer.addView(this.webView, layoutParams);
            }
            getAndMemoizeRootView().addView(this.closeableAdContainer, new FrameLayout.LayoutParams(-1, -1));
        } else if (this.mraidController.getState() == C5387d.RESIZED && z) {
            this.closeableAdContainer.removeView(this.webView);
            this.webViewContainer.addView(this.webView, layoutParams);
            this.webViewContainer.setVisibility(4);
            this.closeableAdContainer.addView(this.twoPartWebView, layoutParams);
        }
        this.closeableAdContainer.setLayoutParams(layoutParams);
        this.mraidController.setState(C5387d.EXPANDED);
    }

    /* access modifiers changed from: 0000 */
    public int clampInt(int i, int i2, int i3) {
        return Math.max(i, Math.min(i2, i3));
    }

    /* access modifiers changed from: private */
    public void handleResize() {
        C5392b resizeProperties = this.mraidController.getResizeProperties();
        if (resizeProperties == null) {
            C5386c.m23029a(this.webView, "requires: setResizeProperties first", "resize");
            return;
        }
        cancelReloadTask();
        if (this.mraidController.getState() != C5387d.LOADING && this.mraidController.getState() != C5387d.HIDDEN) {
            if (this.mraidController.getState() == C5387d.EXPANDED) {
                C5386c.m23029a(this.webView, "Not allowed to resize from an already expanded ad", "resize");
                return;
            }
            int i = resizeProperties.f17260a;
            int i2 = resizeProperties.f17261b;
            int i3 = resizeProperties.f17262c;
            int i4 = resizeProperties.f17263d;
            int[] iArr = new int[2];
            this.webView.getLocationOnScreen(iArr);
            Context context = getContext();
            int b = C5306h.m22650b(context, iArr[0]) + i3;
            int b2 = C5306h.m22650b(context, iArr[1]) + i4;
            Rect rect = new Rect(b, b2, i + b, i2 + b2);
            ViewGroup topmostView = getTopmostView();
            int b3 = C5306h.m22650b(context, topmostView.getWidth());
            int b4 = C5306h.m22650b(context, topmostView.getHeight());
            int[] iArr2 = new int[2];
            topmostView.getLocationOnScreen(iArr2);
            int b5 = C5306h.m22650b(context, iArr2[0]);
            int b6 = C5306h.m22650b(context, iArr2[1]);
            if (!resizeProperties.f17265f) {
                if (rect.width() > b3 || rect.height() > b4) {
                    C5386c.m23029a(this.webView, "Not enough room for the ad", "resize");
                    return;
                }
                rect.offsetTo(clampInt(b5, rect.left, (b5 + b3) - rect.width()), clampInt(b6, rect.top, (b6 + b4) - rect.height()));
            }
            Rect rect2 = new Rect();
            try {
                C5138a a = C5138a.m22073a(resizeProperties.f17264e, C5138a.TOP_RIGHT);
                this.closeableAdContainer.mo18930a(a, rect, rect2);
                if (!new Rect(b5, b6, b3 + b5, b4 + b6).contains(rect2)) {
                    C5386c.m23029a(this.webView, "The close region to appear within the max allowed size", "resize");
                } else if (!rect.contains(rect2)) {
                    C5386c.m23029a(this.webView, "The close region to appear within the max allowed size", "resize");
                } else {
                    this.closeableAdContainer.setCloseVisible(false);
                    this.closeableAdContainer.setClosePosition(a);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
                    layoutParams.leftMargin = rect.left - b5;
                    layoutParams.topMargin = rect.top - b6;
                    if (this.mraidController.getState() == C5387d.DEFAULT) {
                        this.webViewContainer.removeView(this.webView);
                        this.webViewContainer.setVisibility(4);
                        this.closeableAdContainer.addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
                        getAndMemoizeRootView().addView(this.closeableAdContainer, layoutParams);
                    } else if (this.mraidController.getState() == C5387d.RESIZED) {
                        this.closeableAdContainer.setLayoutParams(layoutParams);
                    }
                    this.closeableAdContainer.setClosePosition(a);
                    this.mraidController.setState(C5387d.RESIZED);
                }
            } catch (Exception e) {
                C5386c.m23029a(this.webView, e.getMessage(), "resize");
            }
        }
    }

    private ViewGroup getTopmostView() {
        if (this.rootView != null) {
            return this.rootView;
        }
        View a = C5143c.m22083a(getContext(), this.webViewContainer);
        return a instanceof ViewGroup ? (ViewGroup) a : this.webViewContainer;
    }

    private ViewGroup getAndMemoizeRootView() {
        if (this.rootView == null) {
            this.rootView = getTopmostView();
        }
        return this.rootView;
    }
}
