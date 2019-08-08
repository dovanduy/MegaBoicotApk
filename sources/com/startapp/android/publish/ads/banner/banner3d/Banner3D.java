package com.startapp.android.publish.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.BaseSavedState;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.startapp.android.publish.ads.banner.BannerBase;
import com.startapp.android.publish.ads.banner.BannerInterface;
import com.startapp.android.publish.ads.banner.BannerListener;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.ads.banner.C5144c;
import com.startapp.android.publish.ads.banner.C5145d;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5395h;
import com.startapp.android.publish.adsCommon.C5402i;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adinformation.C5330b;
import com.startapp.android.publish.adsCommon.adinformation.C5330b.C5338b;
import com.startapp.android.publish.adsCommon.adinformation.C5339c;
import com.startapp.android.publish.adsCommon.p177a.C5319f;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: StartAppSDK */
public class Banner3D extends BannerBase implements BannerInterface, AdEventListener {
    private static final String TAG = "Banner3D";
    protected AdPreferences adPreferences;
    protected boolean addedDisplayEvent;
    protected C5119a ads;
    protected List<AdDetails> adsItems;
    protected boolean animation;
    protected boolean attachedToWindow;
    protected boolean callListener;
    protected Camera camera;
    protected int currentBannerIndex;
    protected boolean defaultLoad;
    protected List<Banner3DFace> faces;
    protected boolean firstRotation;
    protected boolean firstRotationFinished;
    protected BannerListener listener;
    protected boolean loaded;
    protected boolean loading;
    private Runnable mAutoRotation;
    protected Matrix matrix;
    protected BannerOptions options;
    protected C5339c overrides;
    protected Paint paint;
    protected boolean rotating;
    protected float rotation;
    protected boolean rotationEnabled;
    protected float startY;
    protected boolean touchDown;
    protected boolean visible;

    /* compiled from: StartAppSDK */
    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public C5319f adRulesResult;
        public boolean bDefaultLoad;
        public boolean bIsVisible;
        private int currentImage;
        private AdDetails[] details;
        public Banner3DFace[] faces;
        private int firstRotation;
        private int firstRotationFinished;
        public boolean loaded;
        public boolean loading;
        public BannerOptions options;
        public C5339c overrides;
        private float rotation;

        public int describeContents() {
            return 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void setCurrentImage(int i) {
            this.currentImage = i;
        }

        public int getCurrentImage() {
            return this.currentImage;
        }

        public void setRotation(float f) {
            this.rotation = f;
        }

        public float getRotation() {
            return this.rotation;
        }

        public boolean isFirstRotation() {
            return this.firstRotation == 1;
        }

        public void setFirstRotation(boolean z) {
            this.firstRotation = z ? 1 : 0;
        }

        public boolean isFirstRotationFinished() {
            return this.firstRotationFinished == 1;
        }

        public void setFirstRotationFinished(boolean z) {
            this.firstRotationFinished = z ? 1 : 0;
        }

        public void setDetails(List<AdDetails> list) {
            this.details = new AdDetails[list.size()];
            for (int i = 0; i < list.size(); i++) {
                this.details[i] = (AdDetails) list.get(i);
            }
        }

        public List<AdDetails> getDetails() {
            return Arrays.asList(this.details);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            if (parcel.readInt() == 1) {
                this.bIsVisible = true;
                this.currentImage = parcel.readInt();
                this.rotation = parcel.readFloat();
                this.firstRotation = parcel.readInt();
                this.firstRotationFinished = parcel.readInt();
                Parcelable[] readParcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
                if (readParcelableArray != null) {
                    this.details = new AdDetails[readParcelableArray.length];
                    System.arraycopy(readParcelableArray, 0, this.details, 0, readParcelableArray.length);
                }
                int readInt = parcel.readInt();
                this.loaded = false;
                if (readInt == 1) {
                    this.loaded = true;
                }
                int readInt2 = parcel.readInt();
                this.loading = false;
                if (readInt2 == 1) {
                    this.loading = true;
                }
                int readInt3 = parcel.readInt();
                this.bDefaultLoad = false;
                if (readInt3 == 1) {
                    this.bDefaultLoad = true;
                }
                int readInt4 = parcel.readInt();
                if (readInt4 > 0) {
                    this.faces = new Banner3DFace[readInt4];
                    for (int i = 0; i < readInt4; i++) {
                        this.faces[i] = (Banner3DFace) parcel.readParcelable(Banner3DFace.class.getClassLoader());
                    }
                }
                this.overrides = (C5339c) parcel.readSerializable();
                this.options = (BannerOptions) parcel.readSerializable();
                this.adRulesResult = (C5319f) parcel.readSerializable();
                return;
            }
            this.bIsVisible = false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            if (!this.bIsVisible) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(this.currentImage);
            parcel.writeFloat(this.rotation);
            parcel.writeInt(this.firstRotation);
            parcel.writeInt(this.firstRotationFinished);
            parcel.writeParcelableArray(this.details, i);
            parcel.writeInt(this.loaded ? 1 : 0);
            parcel.writeInt(this.loading ? 1 : 0);
            parcel.writeInt(this.bDefaultLoad ? 1 : 0);
            parcel.writeInt(this.faces.length);
            for (Banner3DFace writeParcelable : this.faces) {
                parcel.writeParcelable(writeParcelable, i);
            }
            parcel.writeSerializable(this.overrides);
            parcel.writeSerializable(this.options);
            parcel.writeSerializable(this.adRulesResult);
        }
    }

    /* access modifiers changed from: protected */
    public String getBannerName() {
        return "StartApp Banner3D";
    }

    /* access modifiers changed from: protected */
    public int getHeightInDp() {
        return 50;
    }

    /* access modifiers changed from: protected */
    public int getWidthInDp() {
        return 300;
    }

    public Banner3D(Activity activity) {
        this((Context) activity);
    }

    public Banner3D(Activity activity, AdPreferences adPreferences2) {
        this((Context) activity, adPreferences2);
    }

    public Banner3D(Activity activity, BannerListener bannerListener) {
        this((Context) activity, bannerListener);
    }

    public Banner3D(Activity activity, AdPreferences adPreferences2, BannerListener bannerListener) {
        this((Context) activity, adPreferences2, bannerListener);
    }

    public Banner3D(Activity activity, boolean z) {
        this((Context) activity, z);
    }

    public Banner3D(Activity activity, boolean z, AdPreferences adPreferences2) {
        this((Context) activity, z, adPreferences2);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet) {
        this((Context) activity, attributeSet);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet, int i) {
        this((Context) activity, attributeSet, i);
    }

    @Deprecated
    public Banner3D(Context context) {
        this(context, true, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences2) {
        this(context, true, adPreferences2);
    }

    @Deprecated
    public Banner3D(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences2, BannerListener bannerListener) {
        this(context, true, adPreferences2);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, boolean z) {
        this(context, z, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, boolean z, AdPreferences adPreferences2) {
        super(context);
        this.camera = null;
        this.matrix = null;
        this.paint = null;
        this.rotation = 45.0f;
        this.startY = 0.0f;
        this.rotationEnabled = true;
        this.rotating = false;
        this.firstRotation = true;
        this.firstRotationFinished = false;
        this.addedDisplayEvent = false;
        this.touchDown = false;
        this.animation = false;
        this.visible = true;
        this.defaultLoad = true;
        this.loaded = false;
        this.loading = false;
        this.attachedToWindow = false;
        this.callListener = true;
        this.faces = new ArrayList();
        this.currentBannerIndex = 0;
        this.mAutoRotation = new Runnable() {
            public void run() {
                if (Banner3D.this.loaded && Banner3D.this.faces.size() != 0) {
                    if (Banner3D.this.visible && Banner3D.this.isShown() && Banner3D.this.drawn) {
                        Banner3D.this.makeImpression((Banner3DFace) Banner3D.this.faces.get(Banner3D.this.getCurrentBannerIndex()));
                        if (!Banner3D.this.addedDisplayEvent) {
                            Banner3D.this.addedDisplayEvent = true;
                            Banner3D.this.addDisplayEventOnLoad();
                        }
                    }
                    if (Banner3D.this.rotationEnabled) {
                        Banner3D.this.rotate((float) (Banner3D.this.getBannerOptions().mo18824b() * (!Banner3D.this.firstRotationFinished ? Banner3D.this.options.mo18840p() : 1)));
                    }
                    if (Banner3D.this.rotation <= ((float) (90 - Banner3D.this.getBannerOptions().mo18824b())) || Banner3D.this.rotation >= ((float) (90 + Banner3D.this.getBannerOptions().mo18824b())) || Banner3D.this.firstRotation) {
                        Banner3D.this.postDelayed(this, (long) Banner3D.this.getBannerOptions().mo18822a());
                        Banner3D.this.rotating = true;
                    } else {
                        if (Banner3D.this.attachedToWindow) {
                            Banner3D.this.postDelayed(this, (long) Banner3D.this.getBannerOptions().mo18825c());
                        }
                        Banner3D.this.rotating = false;
                    }
                    if (Banner3D.this.getNextBannerIndex() == 0) {
                        Banner3D.this.firstRotation = false;
                    }
                }
            }
        };
        try {
            this.defaultLoad = z;
            if (adPreferences2 == null) {
                this.adPreferences = new AdPreferences();
            } else {
                this.adPreferences = adPreferences2;
            }
            init();
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "Banner.init - unexpected error occurd", e.getMessage(), "");
        }
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.camera = null;
        this.matrix = null;
        this.paint = null;
        this.rotation = 45.0f;
        this.startY = 0.0f;
        this.rotationEnabled = true;
        this.rotating = false;
        this.firstRotation = true;
        this.firstRotationFinished = false;
        this.addedDisplayEvent = false;
        this.touchDown = false;
        this.animation = false;
        this.visible = true;
        this.defaultLoad = true;
        this.loaded = false;
        this.loading = false;
        this.attachedToWindow = false;
        this.callListener = true;
        this.faces = new ArrayList();
        this.currentBannerIndex = 0;
        this.mAutoRotation = new Runnable() {
            public void run() {
                if (Banner3D.this.loaded && Banner3D.this.faces.size() != 0) {
                    if (Banner3D.this.visible && Banner3D.this.isShown() && Banner3D.this.drawn) {
                        Banner3D.this.makeImpression((Banner3DFace) Banner3D.this.faces.get(Banner3D.this.getCurrentBannerIndex()));
                        if (!Banner3D.this.addedDisplayEvent) {
                            Banner3D.this.addedDisplayEvent = true;
                            Banner3D.this.addDisplayEventOnLoad();
                        }
                    }
                    if (Banner3D.this.rotationEnabled) {
                        Banner3D.this.rotate((float) (Banner3D.this.getBannerOptions().mo18824b() * (!Banner3D.this.firstRotationFinished ? Banner3D.this.options.mo18840p() : 1)));
                    }
                    if (Banner3D.this.rotation <= ((float) (90 - Banner3D.this.getBannerOptions().mo18824b())) || Banner3D.this.rotation >= ((float) (90 + Banner3D.this.getBannerOptions().mo18824b())) || Banner3D.this.firstRotation) {
                        Banner3D.this.postDelayed(this, (long) Banner3D.this.getBannerOptions().mo18822a());
                        Banner3D.this.rotating = true;
                    } else {
                        if (Banner3D.this.attachedToWindow) {
                            Banner3D.this.postDelayed(this, (long) Banner3D.this.getBannerOptions().mo18825c());
                        }
                        Banner3D.this.rotating = false;
                    }
                    if (Banner3D.this.getNextBannerIndex() == 0) {
                        Banner3D.this.firstRotation = false;
                    }
                }
            }
        };
        try {
            init();
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "Banner.init - unexpected error occurd", e.getMessage(), "");
        }
    }

    public void hideBanner() {
        this.visible = false;
        setVisibility(8);
    }

    public void showBanner() {
        this.visible = true;
        setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public BannerOptions getBannerOptions() {
        return this.options;
    }

    private void addAdInformationLayout() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        LayoutParams layoutParams = new LayoutParams(getFaceWidth(), getFaceHeight());
        layoutParams.addRule(13);
        int faceStartLeft = getFaceStartLeft();
        layoutParams.rightMargin = faceStartLeft;
        layoutParams.leftMargin = faceStartLeft;
        int faceStartTop = getFaceStartTop();
        layoutParams.topMargin = faceStartTop;
        layoutParams.bottomMargin = faceStartTop;
        addView(relativeLayout, layoutParams);
        new C5330b(getContext(), C5338b.SMALL, Placement.INAPP_BANNER, this.overrides).mo19713a(relativeLayout);
    }

    /* access modifiers changed from: protected */
    public void initRuntime() {
        if (!this.loading) {
            this.options = C5144c.m22086a().mo18953c();
            this.adsItems = new ArrayList();
            if (this.adPreferences == null) {
                this.adPreferences = new AdPreferences();
            }
            this.overrides = C5339c.m22758a();
            cleanFaces();
            this.faces = new ArrayList();
            this.loading = true;
            setBackgroundColor(0);
            if (getId() == -1) {
                setId(getBannerId());
            }
            getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    C5509c.m23511a(Banner3D.this.getViewTreeObserver(), (OnGlobalLayoutListener) this);
                    Banner3D.this.setHardwareAcceleration(Banner3D.this.adPreferences);
                    Banner3D.this.isManualLoading = false;
                    if (Banner3D.this.loaded) {
                        Banner3D.this.loadBanners(Banner3D.this.adsItems, false);
                    } else if (Banner3D.this.defaultLoad) {
                        Banner3D.this.loadBanner();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void reload() {
        this.loaded = false;
        this.loading = true;
        this.animation = false;
        this.rotationEnabled = true;
        this.firstRotation = true;
        this.firstRotationFinished = false;
        this.addedDisplayEvent = false;
        this.drawn = false;
        this.adRulesResult = null;
        cleanFaces();
        this.faces = new ArrayList();
        this.ads = new C5119a(getContext(), getOffset());
        if (this.adPreferences == null) {
            this.adPreferences = new AdPreferences();
        }
        this.ads.load(this.adPreferences, this);
    }

    /* access modifiers changed from: protected */
    public void loadBanners(List<AdDetails> list, boolean z) {
        this.adsItems = list;
        if (list != null) {
            C5145d dVar = new C5145d();
            if (setBannerSize(dVar)) {
                setMinimumWidth(C5306h.m22641a(getContext(), this.options.mo18826d()));
                setMinimumHeight(C5306h.m22641a(getContext(), this.options.mo18827e()));
                if (getLayoutParams() != null && getLayoutParams().width == -1) {
                    setMinimumWidth(C5306h.m22641a(getContext(), dVar.mo18956a()));
                }
                if (getLayoutParams() != null && getLayoutParams().height == -1) {
                    setMinimumHeight(C5306h.m22641a(getContext(), dVar.mo18959b()));
                }
                if (getLayoutParams() != null) {
                    if (getLayoutParams().width > 0) {
                        setMinimumWidth(getLayoutParams().width);
                    }
                    if (getLayoutParams().height > 0) {
                        setMinimumHeight(getLayoutParams().height);
                    }
                    if (getLayoutParams().width > 0 && getLayoutParams().height > 0) {
                        this.ads.mo18895a(true);
                    }
                }
                initFaces(list);
                addAdInformationLayout();
                if (this.paint == null) {
                    this.paint = new Paint();
                    this.paint.setAntiAlias(true);
                    this.paint.setFilterBitmap(true);
                }
                if (!this.animation) {
                    this.animation = true;
                    startRotation();
                }
                if (this.visible) {
                    setVisibility(0);
                }
                if (this.listener != null && z) {
                    this.listener.onReceiveAd(this);
                    return;
                }
                return;
            }
            C5518g.m23563a(TAG, 6, "Banner3DError in banner screen size");
            setErrorMessage("Error in banner screen size");
            setVisibility(8);
            if (this.listener != null && z) {
                this.listener.onFailedToReceiveAd(this);
                return;
            }
            return;
        }
        setErrorMessage("No ads to load");
        if (this.listener != null && z) {
            this.listener.onFailedToReceiveAd(this);
        }
    }

    /* access modifiers changed from: private */
    public void makeImpression(Banner3DFace banner3DFace) {
        C5402i a = banner3DFace.mo18878a(getContext());
        if (a != null) {
            C5518g.m23563a(TAG, 3, "Banner3D Scheduling visibility check");
            startVisibilityRunnable(a);
        }
    }

    private void initFaces(List<AdDetails> list) {
        if (shouldCreateFaces()) {
            createFaces(list);
        } else {
            initFacesViews();
        }
    }

    private void initFacesViews() {
        for (Banner3DFace a : this.faces) {
            a.mo18880a(getContext(), getBannerOptions(), this);
        }
    }

    private boolean shouldCreateFaces() {
        return this.faces == null || this.faces.size() == 0;
    }

    private void createFaces(List<AdDetails> list) {
        cleanFaces();
        removeAllViews();
        this.faces = new ArrayList();
        for (AdDetails adDetails : list) {
            List<Banner3DFace> list2 = this.faces;
            Banner3DFace banner3DFace = new Banner3DFace(getContext(), this, adDetails, getBannerOptions(), new C5363b(getAdTag()));
            list2.add(banner3DFace);
        }
        this.currentBannerIndex = 0;
    }

    private boolean setBannerSize(C5145d dVar) {
        return Banner3DSize.m22052a(getContext(), getParent(), getBannerOptions(), this, dVar);
    }

    private Bitmap getCurrentBitmap() {
        return ((Banner3DFace) this.faces.get(getCurrentBannerIndex())).mo18882b();
    }

    private Bitmap getPreviousBitmap() {
        return ((Banner3DFace) this.faces.get(((getCurrentBannerIndex() - 1) + this.faces.size()) % this.faces.size())).mo18882b();
    }

    /* access modifiers changed from: protected */
    public int getCurrentBannerIndex() {
        return this.currentBannerIndex;
    }

    /* access modifiers changed from: protected */
    public int getNextBannerIndex() {
        return (this.currentBannerIndex + 1) % getTotalBaners();
    }

    private int getTotalBaners() {
        return this.faces.size();
    }

    private void nextBanner() {
        this.currentBannerIndex = (this.currentBannerIndex + 1) % getTotalBaners();
    }

    private void prevBanner() {
        this.currentBannerIndex = ((this.currentBannerIndex - 1) + getTotalBaners()) % getTotalBaners();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.drawn && !this.loading) {
            this.drawn = true;
            startRotation();
        }
        if (!isInEditMode() && this.visible && !shouldCreateFaces()) {
            drawFrame(canvas);
        }
    }

    private void drawFrame(Canvas canvas) {
        try {
            int faceWidth = getFaceWidth();
            int faceHeight = getFaceHeight();
            int faceStartLeft = getFaceStartLeft();
            int faceStartTop = getFaceStartTop();
            float l = this.options.mo18836l() + (((float) Math.pow((double) (Math.abs(this.rotation - 45.0f) / 45.0f), (double) this.options.mo18837m())) * (1.0f - this.options.mo18836l()));
            if (!this.firstRotationFinished) {
                l = this.options.mo18836l();
            }
            float f = l;
            Bitmap previousBitmap = getPreviousBitmap();
            Bitmap currentBitmap = getCurrentBitmap();
            if (currentBitmap != null && previousBitmap != null) {
                if (this.rotation < 45.0f) {
                    if (this.rotation > 3.0f) {
                        drawFace(canvas, currentBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f, (this.rotation - 90.0f) * ((float) this.options.mo18838n().getRotationMultiplier()));
                    }
                    drawFace(canvas, previousBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f, this.rotation * ((float) this.options.mo18838n().getRotationMultiplier()));
                    return;
                }
                if (this.rotation < 87.0f) {
                    drawFace(canvas, previousBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f, this.rotation * ((float) this.options.mo18838n().getRotationMultiplier()));
                }
                drawFace(canvas, currentBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f, (this.rotation - 90.0f) * ((float) this.options.mo18838n().getRotationMultiplier()));
                if (!this.firstRotation) {
                    this.firstRotationFinished = true;
                }
            }
        } catch (Exception unused) {
            C5518g.m23563a(TAG, 6, "Exception onDraw Banner3D");
        }
    }

    private int getFaceStartTop() {
        return (getHeight() - getFaceHeight()) / 2;
    }

    private int getFaceStartLeft() {
        return (getWidth() - getFaceWidth()) / 2;
    }

    private int getFaceHeight() {
        return (int) (((float) C5306h.m22641a(getContext(), this.options.mo18827e())) * this.options.mo18835k());
    }

    private int getFaceWidth() {
        return (int) (((float) C5306h.m22641a(getContext(), this.options.mo18826d())) * this.options.mo18834j());
    }

    private void drawFace(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2) {
        if (this.camera == null) {
            this.camera = new Camera();
        }
        this.camera.save();
        this.camera.translate(0.0f, 0.0f, (float) i4);
        this.camera.rotateX(f2);
        float f3 = (float) (-i4);
        this.camera.translate(0.0f, 0.0f, f3);
        if (this.matrix == null) {
            this.matrix = new Matrix();
        }
        this.camera.getMatrix(this.matrix);
        this.camera.restore();
        this.matrix.preTranslate((float) (-i3), f3);
        this.matrix.postScale(f, f);
        this.matrix.postTranslate((float) (i2 + i3), (float) (i + i4));
        canvas.drawBitmap(bitmap, this.matrix, this.paint);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEventInsideBanner(motionEvent) || this.faces == null || this.faces.size() == 0) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.touchDown = true;
                this.startY = motionEvent.getY();
                break;
            case 1:
                if (this.touchDown) {
                    if (this.rotation < 45.0f) {
                        prevBanner();
                    }
                    this.touchDown = false;
                    this.rotationEnabled = false;
                    setClicked(true);
                    postDelayed(new Runnable() {
                        public void run() {
                            Banner3D.this.rotationEnabled = true;
                        }
                    }, C5344b.m22784a().mo19749A());
                    ((Banner3DFace) this.faces.get(getCurrentBannerIndex())).mo18883b(getContext());
                    if (this.listener != null) {
                        this.listener.onClick(this);
                        break;
                    }
                }
                break;
            case 2:
                if (this.startY - motionEvent.getY() >= 10.0f) {
                    this.touchDown = false;
                    this.startY = motionEvent.getY();
                    break;
                }
                break;
        }
        return true;
    }

    private void cleanFaces() {
        if (this.faces != null && !this.faces.isEmpty()) {
            for (Banner3DFace banner3DFace : this.faces) {
                if (banner3DFace != null) {
                    banner3DFace.mo18887e();
                }
            }
        }
    }

    private boolean isEventInsideBanner(MotionEvent motionEvent) {
        int faceWidth = getFaceWidth();
        int faceHeight = getFaceHeight();
        int faceStartLeft = getFaceStartLeft();
        int faceStartTop = getFaceStartTop();
        return motionEvent.getX() >= ((float) faceStartLeft) && motionEvent.getY() >= ((float) faceStartTop) && motionEvent.getX() <= ((float) (faceStartLeft + faceWidth)) && motionEvent.getY() <= ((float) (faceStartTop + faceHeight));
    }

    /* access modifiers changed from: protected */
    public void rotate(float f) {
        this.rotation += f;
        if (this.rotation >= 90.0f) {
            nextBanner();
            this.rotation -= 90.0f;
        }
        if (this.rotation <= 0.0f) {
            prevBanner();
            this.rotation += 90.0f;
        }
        invalidate();
    }

    public void onReceiveAd(C5286Ad ad) {
        this.loaded = true;
        this.loading = false;
        this.overrides = this.ads.getAdInfoOverride();
        this.adsItems = ((C5395h) ad).mo19940d();
        loadBanners(this.adsItems, this.callListener);
        this.callListener = false;
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        setErrorMessage(ad.getErrorMessage());
        if (this.listener != null) {
            this.listener.onFailedToReceiveAd(this);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.bIsVisible = this.visible;
        savedState.setDetails(this.adsItems);
        savedState.setRotation(this.rotation);
        savedState.setFirstRotation(this.firstRotation);
        savedState.setFirstRotationFinished(this.firstRotationFinished);
        savedState.setCurrentImage(this.currentBannerIndex);
        savedState.options = this.options;
        savedState.faces = new Banner3DFace[this.faces.size()];
        savedState.loaded = this.loaded;
        savedState.loading = this.loading;
        savedState.overrides = this.overrides;
        for (int i = 0; i < this.faces.size(); i++) {
            savedState.faces[i] = (Banner3DFace) this.faces.get(i);
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.visible = savedState.bIsVisible;
        if (this.visible) {
            this.adsItems = savedState.getDetails();
            this.rotation = savedState.getRotation();
            this.firstRotation = savedState.isFirstRotation();
            this.firstRotationFinished = savedState.isFirstRotationFinished();
            this.currentBannerIndex = savedState.getCurrentImage();
            Banner3DFace[] banner3DFaceArr = savedState.faces;
            cleanFaces();
            this.faces = new ArrayList();
            if (banner3DFaceArr != null) {
                for (Banner3DFace add : banner3DFaceArr) {
                    this.faces.add(add);
                }
            }
            this.loaded = savedState.loaded;
            this.loading = savedState.loading;
            this.defaultLoad = savedState.bDefaultLoad;
            this.overrides = savedState.overrides;
            this.options = savedState.options;
            if (this.adsItems.size() == 0) {
                this.defaultLoad = true;
                init();
            } else {
                post(new Runnable() {
                    public void run() {
                        Banner3D.this.loadBanners(Banner3D.this.adsItems, false);
                    }
                });
            }
        }
    }

    private void startRotation() {
        if (this.attachedToWindow && this.drawn) {
            removeCallbacks(this.mAutoRotation);
            post(this.mAutoRotation);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        if (this.options == null || !this.options.mo18839o()) {
            this.firstRotation = false;
            this.firstRotationFinished = true;
        }
        startRotation();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        removeCallbacks(this.mAutoRotation);
        dispatchOnDetatchedFromWindow();
    }

    private void dispatchOnDetatchedFromWindow() {
        if (this.faces != null) {
            for (Banner3DFace c : this.faces) {
                c.mo18884c();
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.attachedToWindow = true;
            if (this.options == null || !this.options.mo18839o()) {
                this.firstRotation = false;
                this.firstRotationFinished = true;
            }
            startRotation();
            return;
        }
        this.attachedToWindow = false;
        if (!this.rotating) {
            removeCallbacks(this.mAutoRotation);
        }
    }

    public void setBannerListener(BannerListener bannerListener) {
        this.listener = bannerListener;
    }

    /* access modifiers changed from: protected */
    public int getRefreshRate() {
        return C5144c.m22086a().mo18952b().mo18831h();
    }

    /* access modifiers changed from: protected */
    public int getOffset() {
        if (this.ads == null) {
            return 0;
        }
        return this.ads.mo18894a();
    }

    /* access modifiers changed from: protected */
    public int getBannerId() {
        return this.innerBanner3dId;
    }

    /* access modifiers changed from: protected */
    public void setBannerId(int i) {
        this.innerBanner3dId = i;
    }

    public void setAdTag(String str) {
        this.adTag = str;
    }
}
