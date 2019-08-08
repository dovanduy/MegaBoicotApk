package com.startapp.android.publish.ads.banner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.startapp.android.publish.adsCommon.C5402i;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p177a.C5314a;
import com.startapp.android.publish.adsCommon.p177a.C5315b;
import com.startapp.android.publish.adsCommon.p177a.C5319f;
import com.startapp.android.publish.adsCommon.p177a.C5320g;
import com.startapp.android.publish.adsCommon.p192l.C5423b;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5554g;
import com.startapp.common.Constants;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p193a.C5522i;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledFuture;

/* compiled from: StartAppSDK */
public abstract class BannerBase extends RelativeLayout {
    private static final String TAG = "BannerLayout";
    protected AdPreferences adPreferences;
    protected C5319f adRulesResult;
    protected String adTag;
    private boolean attachedToWindow;
    private boolean clicked;
    protected Point desirableSizeForManualLoading;
    protected boolean drawn;
    private String error;
    private boolean firstLoad;
    protected int innerBanner3dId;
    protected int innerBannerStandardId;
    protected boolean isManualLoading;
    private ScheduledFuture<?> notVisibleReloadFuture;
    protected int offset;
    private boolean shouldReloadBanner;
    private C5109a task;
    private Timer timer;
    protected C5423b viewabilityRunner;

    /* renamed from: com.startapp.android.publish.ads.banner.BannerBase$a */
    /* compiled from: StartAppSDK */
    class C5109a extends TimerTask {
        C5109a() {
        }

        public void run() {
            BannerBase.this.post(new Runnable() {
                public void run() {
                    if (BannerBase.this.isShown() || (BannerBase.this.adRulesResult != null && !BannerBase.this.adRulesResult.mo19660a())) {
                        C5518g.m23563a(BannerBase.TAG, 3, "REFRESH");
                        BannerBase.this.load();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public abstract int getBannerId();

    /* access modifiers changed from: protected */
    public abstract String getBannerName();

    /* access modifiers changed from: protected */
    public abstract int getHeightInDp();

    /* access modifiers changed from: protected */
    public abstract int getOffset();

    /* access modifiers changed from: protected */
    public abstract int getRefreshRate();

    /* access modifiers changed from: protected */
    public abstract int getWidthInDp();

    /* access modifiers changed from: protected */
    public abstract void initRuntime();

    /* access modifiers changed from: protected */
    public abstract void reload();

    public abstract void setAdTag(String str);

    /* access modifiers changed from: protected */
    public abstract void setBannerId(int i);

    public BannerBase(Context context) {
        super(context);
        this.attachedToWindow = false;
        this.offset = 0;
        this.firstLoad = true;
        this.drawn = false;
        this.innerBanner3dId = 159868227 + new Random().nextInt(DefaultOggSeeker.MATCH_BYTE_RANGE);
        this.innerBannerStandardId = this.innerBanner3dId + 1;
        this.adTag = null;
        this.clicked = false;
        this.shouldReloadBanner = false;
        this.notVisibleReloadFuture = null;
        this.timer = new Timer();
        this.task = new C5109a();
    }

    public BannerBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.attachedToWindow = false;
        this.offset = 0;
        this.firstLoad = true;
        this.drawn = false;
        this.innerBanner3dId = 159868227 + new Random().nextInt(DefaultOggSeeker.MATCH_BYTE_RANGE);
        this.innerBannerStandardId = this.innerBanner3dId + 1;
        this.adTag = null;
        this.clicked = false;
        this.shouldReloadBanner = false;
        this.notVisibleReloadFuture = null;
        this.timer = new Timer();
        this.task = new C5109a();
        setBannerAttrs(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void init() {
        if (!isInEditMode()) {
            initRuntime();
        } else {
            initDebug();
        }
    }

    private void initDebug() {
        setMinimumWidth(C5306h.m22641a(getContext(), getWidthInDp()));
        setMinimumHeight(C5306h.m22641a(getContext(), getHeightInDp()));
        setBackgroundColor(Color.rgb(169, 169, 169));
        TextView textView = new TextView(getContext());
        textView.setText(getBannerName());
        textView.setTextColor(-16777216);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(textView, layoutParams);
    }

    /* access modifiers changed from: protected */
    public int getAdjustedRefreshRate() {
        return getRefreshRate();
    }

    /* access modifiers changed from: protected */
    public String getAdTag() {
        return this.adTag;
    }

    public void loadAd(int i, int i2) {
        if (getParent() == null) {
            this.isManualLoading = true;
            this.desirableSizeForManualLoading = new Point(i, i2);
            loadBanner();
        }
    }

    public void loadAd() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        loadAd(C5306h.m22650b(getContext(), displayMetrics.widthPixels), C5306h.m22650b(getContext(), displayMetrics.heightPixels));
    }

    /* access modifiers changed from: protected */
    public void loadBanner() {
        scheduleReloadTask();
        load();
    }

    private void rescheduleNotVisibleReload() {
        if (this.notVisibleReloadFuture != null) {
            this.notVisibleReloadFuture.cancel(false);
        }
        this.notVisibleReloadFuture = C5554g.m23701a((Runnable) new Runnable() {
            public void run() {
                BannerBase.this.loadBanner();
            }
        }, (long) (MetaData.getInstance().getNotVisibleBannerReloadInterval() * AdError.NETWORK_ERROR_CODE));
    }

    /* access modifiers changed from: protected */
    public void load() {
        clearVisibilityHandler();
        if (this.adRulesResult == null || C5320g.m22714a().mo19663b().mo19656a()) {
            this.adRulesResult = C5320g.m22714a().mo19663b().mo19655a(Placement.INAPP_BANNER, getAdTag());
            if (this.adRulesResult.mo19660a()) {
                reload();
                return;
            }
            setVisibility(4);
            if (Constants.m23468a().booleanValue()) {
                C5522i.m23586a().mo20502a(getContext(), this.adRulesResult.mo19661b());
            }
        } else if (this.adRulesResult.mo19660a()) {
            reload();
        }
    }

    private void clearVisibilityHandler() {
        if (this.viewabilityRunner != null) {
            this.viewabilityRunner.mo19976b();
            this.viewabilityRunner = null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean shouldSendImpression(C5402i iVar) {
        return iVar != null && !iVar.mo19953c();
    }

    /* access modifiers changed from: protected */
    public int getMinViewabilityPercentage() {
        return C5144c.m22086a().mo18952b().mo18841q();
    }

    /* access modifiers changed from: protected */
    public void startVisibilityRunnable(C5402i iVar) {
        if (this.viewabilityRunner == null) {
            this.viewabilityRunner = new C5423b((View) this, iVar, getMinViewabilityPercentage());
            this.viewabilityRunner.mo19975a();
        }
    }

    private void setBannerAttrs(Context context, AttributeSet attributeSet) {
        setAdTag(new C5112b(context, attributeSet).mo18850a());
    }

    /* access modifiers changed from: protected */
    public void scheduleReloadTask() {
        if (this.attachedToWindow && !isInEditMode()) {
            if (this.task != null) {
                this.task.cancel();
            }
            if (this.timer != null) {
                this.timer.cancel();
            }
            this.task = new C5109a();
            this.timer = new Timer();
            this.timer.schedule(this.task, (long) getAdjustedRefreshRate());
            rescheduleNotVisibleReload();
        }
    }

    /* access modifiers changed from: protected */
    public void cancelReloadTask() {
        if (!isInEditMode()) {
            if (this.task != null) {
                this.task.cancel();
            }
            if (this.timer != null) {
                this.timer.cancel();
            }
            if (this.notVisibleReloadFuture != null) {
                this.notVisibleReloadFuture.cancel(false);
            }
            this.task = null;
            this.timer = null;
            this.notVisibleReloadFuture = null;
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        if (isClicked()) {
            setClicked(false);
            this.shouldReloadBanner = true;
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putInt("bannerId", getBannerId());
        bundle.putParcelable("upperState", onSaveInstanceState);
        bundle.putSerializable("adRulesResult", this.adRulesResult);
        bundle.putSerializable("adPreferences", this.adPreferences);
        bundle.putInt("offset", this.offset);
        bundle.putBoolean("firstLoad", this.firstLoad);
        bundle.putBoolean("shouldReloadBanner", this.shouldReloadBanner);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        setBannerId(bundle.getInt("bannerId"));
        this.adRulesResult = (C5319f) bundle.getSerializable("adRulesResult");
        this.adPreferences = (AdPreferences) bundle.getSerializable("adPreferences");
        this.offset = bundle.getInt("offset");
        this.firstLoad = bundle.getBoolean("firstLoad");
        this.shouldReloadBanner = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5518g.m23563a(TAG, 3, "onAttachedToWindow");
        this.attachedToWindow = true;
        scheduleReloadTask();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5518g.m23563a(TAG, 3, "onDetachedFromWindow");
        this.attachedToWindow = false;
        cancelReloadTask();
        clearVisibilityHandler();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C5518g.m23563a(TAG, 3, "onWindowFocusChanged");
        if (z) {
            if (this.shouldReloadBanner) {
                this.shouldReloadBanner = false;
                load();
            }
            this.attachedToWindow = true;
            scheduleReloadTask();
            return;
        }
        this.attachedToWindow = false;
        cancelReloadTask();
    }

    public boolean isFirstLoad() {
        return this.firstLoad;
    }

    public void setFirstLoad(boolean z) {
        this.firstLoad = z;
    }

    /* access modifiers changed from: protected */
    public void addDisplayEventOnLoad() {
        if (isFirstLoad() || C5320g.m22714a().mo19663b().mo19656a()) {
            setFirstLoad(false);
            C5315b.m22698a().mo19649a(new C5314a(Placement.INAPP_BANNER, getAdTag()));
        }
    }

    /* access modifiers changed from: protected */
    public void setHardwareAcceleration(AdPreferences adPreferences2) {
        C5307i.m22670a(adPreferences2, "hardwareAccelerated", C5509c.m23519a((View) this, this.attachedToWindow));
    }

    public boolean isClicked() {
        return this.clicked;
    }

    public void setClicked(boolean z) {
        this.clicked = z;
    }

    public void setErrorMessage(String str) {
        this.error = str;
    }

    public String getErrorMessage() {
        return this.error;
    }
}
