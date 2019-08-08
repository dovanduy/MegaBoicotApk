package android.support.p017v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.view.p026a.C0564b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: android.support.v4.view.ViewPager */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator<C0554b> COMPARATOR = new Comparator<C0554b>() {
        /* renamed from: a */
        public int compare(C0554b bVar, C0554b bVar2) {
            return bVar.f1362b - bVar2.f1362b;
        }
    };
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final C0560h sPositionComparator = new C0560h();
    private int mActivePointerId = -1;
    C0593p mAdapter;
    private List<C0556d> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable = new Runnable() {
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    };
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout = true;
    private float mFirstOffset = -3.4028235E38f;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private C0557e mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C0554b> mItems = new ArrayList<>();
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset = Float.MAX_VALUE;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets = false;
    private C0559g mObserver;
    private int mOffscreenPageLimit = 1;
    private C0557e mOnPageChangeListener;
    private List<C0557e> mOnPageChangeListeners;
    private int mPageMargin;
    private C0558f mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mRestoredCurItem = -1;
    private EdgeEffect mRightEdge;
    private int mScrollState = 0;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C0554b mTempItem = new C0554b();
    private final Rect mTempRect = new Rect();
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    /* renamed from: android.support.v4.view.ViewPager$LayoutParams */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f1352a;

        /* renamed from: b */
        public int f1353b;

        /* renamed from: c */
        float f1354c = 0.0f;

        /* renamed from: d */
        boolean f1355d;

        /* renamed from: e */
        int f1356e;

        /* renamed from: f */
        int f1357f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f1353b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f1358a;

        /* renamed from: c */
        Parcelable f1359c;

        /* renamed from: d */
        ClassLoader f1360d;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1358a);
            parcel.writeParcelable(this.f1359c, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f1358a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f1358a = parcel.readInt();
            this.f1359c = parcel.readParcelable(classLoader);
            this.f1360d = classLoader;
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.v4.view.ViewPager$a */
    public @interface C0553a {
    }

    /* renamed from: android.support.v4.view.ViewPager$b */
    static class C0554b {

        /* renamed from: a */
        Object f1361a;

        /* renamed from: b */
        int f1362b;

        /* renamed from: c */
        boolean f1363c;

        /* renamed from: d */
        float f1364d;

        /* renamed from: e */
        float f1365e;

        C0554b() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$c */
    class C0555c extends C0561a {
        C0555c() {
        }

        /* renamed from: d */
        public void mo1971d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1971d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m2086b());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.mAdapter != null) {
                accessibilityEvent.setItemCount(ViewPager.this.mAdapter.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        /* renamed from: a */
        public void mo1969a(View view, C0564b bVar) {
            super.mo1969a(view, bVar);
            bVar.mo2005b((CharSequence) ViewPager.class.getName());
            bVar.mo2026i(m2086b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                bVar.mo1994a((int) MpegAudioHeader.MAX_FRAME_SIZE_BYTES);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                bVar.mo1994a(8192);
            }
        }

        /* renamed from: a */
        public boolean mo1970a(View view, int i, Bundle bundle) {
            if (super.mo1970a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager.this.setCurrentItem(ViewPager.this.mCurItem - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager.this.setCurrentItem(ViewPager.this.mCurItem + 1);
                return true;
            }
        }

        /* renamed from: b */
        private boolean m2086b() {
            return ViewPager.this.mAdapter != null && ViewPager.this.mAdapter.getCount() > 1;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$d */
    public interface C0556d {
        /* renamed from: a */
        void mo1883a(ViewPager viewPager, C0593p pVar, C0593p pVar2);
    }

    /* renamed from: android.support.v4.view.ViewPager$e */
    public interface C0557e {
        /* renamed from: a */
        void mo1881a(int i);

        /* renamed from: a */
        void mo1882a(int i, float f, int i2);

        /* renamed from: b */
        void mo1884b(int i);
    }

    /* renamed from: android.support.v4.view.ViewPager$f */
    public interface C0558f {
        /* renamed from: a */
        void mo1972a(View view, float f);
    }

    /* renamed from: android.support.v4.view.ViewPager$g */
    private class C0559g extends DataSetObserver {
        C0559g() {
        }

        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$h */
    static class C0560h implements Comparator<View> {
        C0560h() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f1352a == layoutParams2.f1352a) {
                return layoutParams.f1356e - layoutParams2.f1356e;
            }
            return layoutParams.f1352a ? 1 : -1;
        }
    }

    public ViewPager(Context context) {
        super(context);
        initViewPager();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }

    /* access modifiers changed from: 0000 */
    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (16.0f * f);
        C0595r.m2240a((View) this, (C0561a) new C0555c());
        if (C0595r.m2254e(this) == 0) {
            C0595r.m2247b((View) this, 1);
        }
        C0595r.m2241a((View) this, (C0592o) new C0592o() {

            /* renamed from: b */
            private final Rect f1351b = new Rect();

            /* renamed from: a */
            public C0609z mo427a(View view, C0609z zVar) {
                C0609z a = C0595r.m2231a(view, zVar);
                if (a.mo2140e()) {
                    return a;
                }
                Rect rect = this.f1351b;
                rect.left = a.mo2135a();
                rect.top = a.mo2137b();
                rect.right = a.mo2138c();
                rect.bottom = a.mo2139d();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0609z b = C0595r.m2246b(ViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo2135a(), rect.left);
                    rect.top = Math.min(b.mo2137b(), rect.top);
                    rect.right = Math.min(b.mo2138c(), rect.right);
                    rect.bottom = Math.min(b.mo2139d(), rect.bottom);
                }
                return a.mo2136a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        if (this.mScroller != null && !this.mScroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                enableLayers(i != 0);
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setAdapter(C0593p pVar) {
        if (this.mAdapter != null) {
            this.mAdapter.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C0554b bVar = (C0554b) this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, bVar.f1362b, bVar.f1361a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        C0593p pVar2 = this.mAdapter;
        this.mAdapter = pVar;
        this.mExpectedAdapterCount = 0;
        if (this.mAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new C0559g();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        if (this.mAdapterChangeListeners != null && !this.mAdapterChangeListeners.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C0556d) this.mAdapterChangeListeners.get(i2)).mo1883a(this, pVar2, pVar);
            }
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f1352a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public C0593p getAdapter() {
        return this.mAdapter;
    }

    public void addOnAdapterChangeListener(C0556d dVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(dVar);
    }

    public void removeOnAdapterChangeListener(C0556d dVar) {
        if (this.mAdapterChangeListeners != null) {
            this.mAdapterChangeListeners.remove(dVar);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    /* access modifiers changed from: 0000 */
    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    /* access modifiers changed from: 0000 */
    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        if (this.mAdapter == null || this.mAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            if (i > this.mCurItem + i3 || i < this.mCurItem - i3) {
                for (int i4 = 0; i4 < this.mItems.size(); i4++) {
                    ((C0554b) this.mItems.get(i4)).f1363c = true;
                }
            }
            if (this.mCurItem == i) {
                z3 = false;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3) {
                    dispatchOnPageSelected(i);
                }
                requestLayout();
            } else {
                populate(i);
                scrollToItem(i, z, i2, z3);
            }
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        C0554b infoForPosition = infoForPosition(i);
        int clientWidth = infoForPosition != null ? (int) (((float) getClientWidth()) * Math.max(this.mFirstOffset, Math.min(infoForPosition.f1365e, this.mLastOffset))) : 0;
        if (z) {
            smoothScrollTo(clientWidth, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(C0557e eVar) {
        this.mOnPageChangeListener = eVar;
    }

    public void addOnPageChangeListener(C0557e eVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(eVar);
    }

    public void removeOnPageChangeListener(C0557e eVar) {
        if (this.mOnPageChangeListeners != null) {
            this.mOnPageChangeListeners.remove(eVar);
        }
    }

    public void clearOnPageChangeListeners() {
        if (this.mOnPageChangeListeners != null) {
            this.mOnPageChangeListeners.clear();
        }
    }

    public void setPageTransformer(boolean z, C0558f fVar) {
        setPageTransformer(z, fVar, 2);
    }

    public void setPageTransformer(boolean z, C0558f fVar, int i) {
        int i2 = 1;
        boolean z2 = fVar != null;
        boolean z3 = z2 != (this.mPageTransformer != null);
        this.mPageTransformer = fVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z3) {
            populate();
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.mDrawingOrderedChildren.get(i2)).getLayoutParams()).f1357f;
    }

    /* access modifiers changed from: 0000 */
    public C0557e setInternalPageChangeListener(C0557e eVar) {
        C0557e eVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = eVar;
        return eVar2;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w(str, sb.toString());
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0356c.m1312a(getContext(), i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: 0000 */
    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: 0000 */
    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    /* access modifiers changed from: 0000 */
    public void smoothScrollTo(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (this.mScroller != null && !this.mScroller.isFinished()) {
            i4 = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = 4 * Math.round(1000.0f * Math.abs(distanceInfluenceForSnapDuration / ((float) abs)));
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + ((float) this.mPageMargin))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i6, scrollY, i7, i8, min);
        C0595r.m2252d(this);
    }

    /* access modifiers changed from: 0000 */
    public C0554b addNewItem(int i, int i2) {
        C0554b bVar = new C0554b();
        bVar.f1362b = i;
        bVar.f1361a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        bVar.f1364d = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(bVar);
        } else {
            this.mItems.add(i2, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            C0554b bVar = (C0554b) this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(bVar.f1361a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, bVar.f1362b, bVar.f1361a);
                    if (this.mCurItem == bVar.f1362b) {
                        i = Math.max(0, Math.min(this.mCurItem, count - 1));
                    }
                } else if (bVar.f1362b != itemPosition) {
                    if (bVar.f1362b == this.mCurItem) {
                        i = itemPosition;
                    }
                    bVar.f1362b = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f1352a) {
                    layoutParams.f1354c = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    public void populate() {
        populate(this.mCurItem);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00be, code lost:
        if (r8.f1362b == r0.mCurItem) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void populate(int r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r0.mCurItem
            if (r2 == r1) goto L_0x0011
            int r2 = r0.mCurItem
            android.support.v4.view.ViewPager$b r2 = r0.infoForPosition(r2)
            r0.mCurItem = r1
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            android.support.v4.view.p r1 = r0.mAdapter
            if (r1 != 0) goto L_0x001a
            r18.sortChildDrawingOrder()
            return
        L_0x001a:
            boolean r1 = r0.mPopulatePending
            if (r1 == 0) goto L_0x0022
            r18.sortChildDrawingOrder()
            return
        L_0x0022:
            android.os.IBinder r1 = r18.getWindowToken()
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            android.support.v4.view.p r1 = r0.mAdapter
            r1.startUpdate(r0)
            int r1 = r0.mOffscreenPageLimit
            int r4 = r0.mCurItem
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            android.support.v4.view.p r6 = r0.mAdapter
            int r6 = r6.getCount()
            int r7 = r6 + -1
            int r8 = r0.mCurItem
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.mExpectedAdapterCount
            if (r6 == r7) goto L_0x00a3
            android.content.res.Resources r1 = r18.getResources()     // Catch:{ NotFoundException -> 0x0058 }
            int r2 = r18.getId()     // Catch:{ NotFoundException -> 0x0058 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0058 }
            goto L_0x0060
        L_0x0058:
            int r1 = r18.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0060:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.mExpectedAdapterCount
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r18.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            android.support.v4.view.p r1 = r0.mAdapter
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00a3:
            r7 = r5
        L_0x00a4:
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r8 = r0.mItems
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x00c4
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r8 = r0.mItems
            java.lang.Object r8 = r8.get(r7)
            android.support.v4.view.ViewPager$b r8 = (android.support.p017v4.view.ViewPager.C0554b) r8
            int r9 = r8.f1362b
            int r10 = r0.mCurItem
            if (r9 < r10) goto L_0x00c1
            int r9 = r8.f1362b
            int r10 = r0.mCurItem
            if (r9 != r10) goto L_0x00c4
            goto L_0x00c5
        L_0x00c1:
            int r7 = r7 + 1
            goto L_0x00a4
        L_0x00c4:
            r8 = 0
        L_0x00c5:
            if (r8 != 0) goto L_0x00cf
            if (r6 <= 0) goto L_0x00cf
            int r8 = r0.mCurItem
            android.support.v4.view.ViewPager$b r8 = r0.addNewItem(r8, r7)
        L_0x00cf:
            r9 = 0
            if (r8 == 0) goto L_0x01fb
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x00df
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r11 = r0.mItems
            java.lang.Object r11 = r11.get(r10)
            android.support.v4.view.ViewPager$b r11 = (android.support.p017v4.view.ViewPager.C0554b) r11
            goto L_0x00e0
        L_0x00df:
            r11 = 0
        L_0x00e0:
            int r12 = r18.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x00ea
            r3 = r9
            goto L_0x00f7
        L_0x00ea:
            float r14 = r8.f1364d
            float r14 = r13 - r14
            int r15 = r18.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x00f7:
            int r14 = r0.mCurItem
            int r14 = r14 + -1
            r15 = r7
            r7 = r9
        L_0x00fd:
            if (r14 < 0) goto L_0x015d
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x012b
            if (r14 >= r4) goto L_0x012b
            if (r11 != 0) goto L_0x0108
            goto L_0x015d
        L_0x0108:
            int r5 = r11.f1362b
            if (r14 != r5) goto L_0x0159
            boolean r5 = r11.f1363c
            if (r5 != 0) goto L_0x0159
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            r5.remove(r10)
            android.support.v4.view.p r5 = r0.mAdapter
            java.lang.Object r11 = r11.f1361a
            r5.destroyItem(r0, r14, r11)
            int r10 = r10 + -1
            int r15 = r15 + -1
            if (r10 < 0) goto L_0x0157
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r10)
            android.support.v4.view.ViewPager$b r5 = (android.support.p017v4.view.ViewPager.C0554b) r5
            goto L_0x0158
        L_0x012b:
            if (r11 == 0) goto L_0x0141
            int r5 = r11.f1362b
            if (r14 != r5) goto L_0x0141
            float r5 = r11.f1364d
            float r7 = r7 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x0157
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r10)
            android.support.v4.view.ViewPager$b r5 = (android.support.p017v4.view.ViewPager.C0554b) r5
            goto L_0x0158
        L_0x0141:
            int r5 = r10 + 1
            android.support.v4.view.ViewPager$b r5 = r0.addNewItem(r14, r5)
            float r5 = r5.f1364d
            float r7 = r7 + r5
            int r15 = r15 + 1
            if (r10 < 0) goto L_0x0157
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r10)
            android.support.v4.view.ViewPager$b r5 = (android.support.p017v4.view.ViewPager.C0554b) r5
            goto L_0x0158
        L_0x0157:
            r5 = 0
        L_0x0158:
            r11 = r5
        L_0x0159:
            int r14 = r14 + -1
            r5 = 0
            goto L_0x00fd
        L_0x015d:
            float r3 = r8.f1364d
            int r4 = r15 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x01ef
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0176
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p017v4.view.ViewPager.C0554b) r5
            goto L_0x0177
        L_0x0176:
            r5 = 0
        L_0x0177:
            if (r12 > 0) goto L_0x017b
            r7 = r9
            goto L_0x0183
        L_0x017b:
            int r7 = r18.getPaddingRight()
            float r7 = (float) r7
            float r10 = (float) r12
            float r7 = r7 / r10
            float r7 = r7 + r13
        L_0x0183:
            int r10 = r0.mCurItem
        L_0x0185:
            int r10 = r10 + 1
            if (r10 >= r6) goto L_0x01ef
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x01b9
            if (r10 <= r1) goto L_0x01b9
            if (r5 != 0) goto L_0x0192
            goto L_0x01ef
        L_0x0192:
            int r11 = r5.f1362b
            if (r10 != r11) goto L_0x01ee
            boolean r11 = r5.f1363c
            if (r11 != 0) goto L_0x01ee
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r11 = r0.mItems
            r11.remove(r4)
            android.support.v4.view.p r11 = r0.mAdapter
            java.lang.Object r5 = r5.f1361a
            r11.destroyItem(r0, r10, r5)
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x01b7
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p017v4.view.ViewPager.C0554b) r5
            goto L_0x01ee
        L_0x01b7:
            r5 = 0
            goto L_0x01ee
        L_0x01b9:
            if (r5 == 0) goto L_0x01d5
            int r11 = r5.f1362b
            if (r10 != r11) goto L_0x01d5
            float r5 = r5.f1364d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x01b7
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p017v4.view.ViewPager.C0554b) r5
            goto L_0x01ee
        L_0x01d5:
            android.support.v4.view.ViewPager$b r5 = r0.addNewItem(r10, r4)
            int r4 = r4 + 1
            float r5 = r5.f1364d
            float r3 = r3 + r5
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x01b7
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p017v4.view.ViewPager.C0554b) r5
        L_0x01ee:
            goto L_0x0185
        L_0x01ef:
            r0.calculatePageOffsets(r8, r15, r2)
            android.support.v4.view.p r1 = r0.mAdapter
            int r2 = r0.mCurItem
            java.lang.Object r3 = r8.f1361a
            r1.setPrimaryItem(r0, r2, r3)
        L_0x01fb:
            android.support.v4.view.p r1 = r0.mAdapter
            r1.finishUpdate(r0)
            int r1 = r18.getChildCount()
            r2 = 0
        L_0x0205:
            if (r2 >= r1) goto L_0x022e
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r4 = (android.support.p017v4.view.ViewPager.LayoutParams) r4
            r4.f1357f = r2
            boolean r5 = r4.f1352a
            if (r5 != 0) goto L_0x022b
            float r5 = r4.f1354c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x022b
            android.support.v4.view.ViewPager$b r3 = r0.infoForChild(r3)
            if (r3 == 0) goto L_0x022b
            float r5 = r3.f1364d
            r4.f1354c = r5
            int r3 = r3.f1362b
            r4.f1356e = r3
        L_0x022b:
            int r2 = r2 + 1
            goto L_0x0205
        L_0x022e:
            r18.sortChildDrawingOrder()
            boolean r1 = r18.hasFocus()
            if (r1 == 0) goto L_0x026d
            android.view.View r1 = r18.findFocus()
            if (r1 == 0) goto L_0x0242
            android.support.v4.view.ViewPager$b r3 = r0.infoForAnyChild(r1)
            goto L_0x0243
        L_0x0242:
            r3 = 0
        L_0x0243:
            if (r3 == 0) goto L_0x024b
            int r1 = r3.f1362b
            int r2 = r0.mCurItem
            if (r1 == r2) goto L_0x026d
        L_0x024b:
            r1 = 0
        L_0x024c:
            int r2 = r18.getChildCount()
            if (r1 >= r2) goto L_0x026d
            android.view.View r2 = r0.getChildAt(r1)
            android.support.v4.view.ViewPager$b r3 = r0.infoForChild(r2)
            if (r3 == 0) goto L_0x026a
            int r3 = r3.f1362b
            int r4 = r0.mCurItem
            if (r3 != r4) goto L_0x026a
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 == 0) goto L_0x026a
            goto L_0x026d
        L_0x026a:
            int r1 = r1 + 1
            goto L_0x024c
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.view.ViewPager.populate(int):void");
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            if (this.mDrawingOrderedChildren == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                this.mDrawingOrderedChildren.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    private void calculatePageOffsets(C0554b bVar, int i, C0554b bVar2) {
        C0554b bVar3;
        C0554b bVar4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f1362b;
            if (i2 < bVar.f1362b) {
                float f2 = bVar2.f1365e + bVar2.f1364d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f1362b && i4 < this.mItems.size()) {
                    Object obj = this.mItems.get(i4);
                    while (true) {
                        bVar4 = (C0554b) obj;
                        if (i3 > bVar4.f1362b && i4 < this.mItems.size() - 1) {
                            i4++;
                            obj = this.mItems.get(i4);
                        }
                    }
                    while (i3 < bVar4.f1362b) {
                        f2 += this.mAdapter.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f1365e = f2;
                    f2 += bVar4.f1364d + f;
                    i3++;
                }
            } else if (i2 > bVar.f1362b) {
                int size = this.mItems.size() - 1;
                float f3 = bVar2.f1365e;
                while (true) {
                    i2--;
                    if (i2 < bVar.f1362b || size < 0) {
                        break;
                    }
                    Object obj2 = this.mItems.get(size);
                    while (true) {
                        bVar3 = (C0554b) obj2;
                        if (i2 < bVar3.f1362b && size > 0) {
                            size--;
                            obj2 = this.mItems.get(size);
                        }
                    }
                    while (i2 > bVar3.f1362b) {
                        f3 -= this.mAdapter.getPageWidth(i2) + f;
                        i2--;
                    }
                    f3 -= bVar3.f1364d + f;
                    bVar3.f1365e = f3;
                }
            }
        }
        int size2 = this.mItems.size();
        float f4 = bVar.f1365e;
        int i5 = bVar.f1362b - 1;
        this.mFirstOffset = bVar.f1362b == 0 ? bVar.f1365e : -3.4028235E38f;
        int i6 = count - 1;
        this.mLastOffset = bVar.f1362b == i6 ? (bVar.f1365e + bVar.f1364d) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            C0554b bVar5 = (C0554b) this.mItems.get(i7);
            while (i5 > bVar5.f1362b) {
                f4 -= this.mAdapter.getPageWidth(i5) + f;
                i5--;
            }
            f4 -= bVar5.f1364d + f;
            bVar5.f1365e = f4;
            if (bVar5.f1362b == 0) {
                this.mFirstOffset = f4;
            }
            i7--;
            i5--;
        }
        float f5 = bVar.f1365e + bVar.f1364d + f;
        int i8 = bVar.f1362b + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C0554b bVar6 = (C0554b) this.mItems.get(i9);
            while (i8 < bVar6.f1362b) {
                f5 += this.mAdapter.getPageWidth(i8) + f;
                i8++;
            }
            if (bVar6.f1362b == i6) {
                this.mLastOffset = (bVar6.f1364d + f5) - 1.0f;
            }
            bVar6.f1365e = f5;
            f5 += bVar6.f1364d + f;
            i9++;
            i8++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1358a = this.mCurItem;
        if (this.mAdapter != null) {
            savedState.f1359c = this.mAdapter.saveState();
        }
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1845a());
        if (this.mAdapter != null) {
            this.mAdapter.restoreState(savedState.f1359c, savedState.f1360d);
            setCurrentItemInternal(savedState.f1358a, false, true);
        } else {
            this.mRestoredCurItem = savedState.f1358a;
            this.mRestoredAdapterState = savedState.f1359c;
            this.mRestoredClassLoader = savedState.f1360d;
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f1352a |= isDecorView(view);
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f1352a) {
            layoutParams2.f1355d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    private static boolean isDecorView(View view) {
        return view.getClass().getAnnotation(C0553a.class) != null;
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: 0000 */
    public C0554b infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C0554b bVar = (C0554b) this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, bVar.f1361a)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public C0554b infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public C0554b infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C0554b bVar = (C0554b) this.mItems.get(i2);
            if (bVar.f1362b == i) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = measuredHeight;
        int i7 = paddingLeft;
        int i8 = 0;
        while (true) {
            boolean z2 = true;
            int i9 = 1073741824;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.f1352a) {
                    int i10 = layoutParams.f1353b & 7;
                    int i11 = layoutParams.f1353b & 112;
                    boolean z3 = (i11 == 48 || i11 == 80) ? true : z;
                    if (!(i10 == 3 || i10 == 5)) {
                        z2 = z;
                    }
                    int i12 = Integer.MIN_VALUE;
                    if (z3) {
                        i3 = Integer.MIN_VALUE;
                        i12 = 1073741824;
                    } else {
                        i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                    }
                    if (layoutParams.width != -2) {
                        i4 = layoutParams.width != -1 ? layoutParams.width : i7;
                        i12 = 1073741824;
                    } else {
                        i4 = i7;
                    }
                    if (layoutParams.height != -2) {
                        i5 = layoutParams.height != -1 ? layoutParams.height : i6;
                    } else {
                        i5 = i6;
                        i9 = i3;
                    }
                    childAt.measure(MeasureSpec.makeMeasureSpec(i4, i12), MeasureSpec.makeMeasureSpec(i5, i9));
                    if (z3) {
                        i6 -= childAt.getMeasuredHeight();
                    } else if (z2) {
                        i7 -= childAt.getMeasuredWidth();
                    }
                }
            }
            i8++;
            z = false;
        }
        this.mChildWidthMeasureSpec = MeasureSpec.makeMeasureSpec(i7, 1073741824);
        this.mChildHeightMeasureSpec = MeasureSpec.makeMeasureSpec(i6, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (layoutParams2 == null || !layoutParams2.f1352a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (((float) i7) * layoutParams2.f1354c), 1073741824), this.mChildHeightMeasureSpec);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            recomputeScrollPosition(i, i3, this.mPageMargin, this.mPageMargin);
        }
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.mItems.isEmpty()) {
            C0554b infoForPosition = infoForPosition(this.mCurItem);
            int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.f1365e, this.mLastOffset) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                completeScroll(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = paddingBottom;
        int i10 = 0;
        int i11 = paddingTop;
        int i12 = paddingLeft;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1352a) {
                    int i14 = layoutParams.f1353b & 7;
                    int i15 = layoutParams.f1353b & 112;
                    if (i14 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i12);
                    } else if (i14 == 3) {
                        i5 = i12;
                        i12 = childAt.getMeasuredWidth() + i12;
                    } else if (i14 != 5) {
                        i5 = i12;
                    } else {
                        i5 = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i15 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, i11);
                    } else if (i15 == 48) {
                        i6 = i11;
                        i11 = childAt.getMeasuredHeight() + i11;
                    } else if (i15 != 80) {
                        i6 = i11;
                    } else {
                        i6 = (i8 - i9) - childAt.getMeasuredHeight();
                        i9 += childAt.getMeasuredHeight();
                    }
                    int i16 = i5 + scrollX;
                    childAt.layout(i16, i6, childAt.getMeasuredWidth() + i16, i6 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i17 = (i7 - i12) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f1352a) {
                    C0554b infoForChild = infoForChild(childAt2);
                    if (infoForChild != null) {
                        float f = (float) i17;
                        int i19 = ((int) (infoForChild.f1365e * f)) + i12;
                        if (layoutParams2.f1355d) {
                            layoutParams2.f1355d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f1354c), 1073741824), MeasureSpec.makeMeasureSpec((i8 - i11) - i9, 1073741824));
                        }
                        childAt2.layout(i19, i11, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + i11);
                    }
                }
            }
        }
        this.mTopPageBounds = i11;
        this.mBottomPageBounds = i8 - i9;
        this.mDecorChildCount = i10;
        if (this.mFirstLayout) {
            z2 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }

    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0595r.m2252d(this);
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() != 0) {
            C0554b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = this.mPageMargin + clientWidth;
            float f = (float) clientWidth;
            float f2 = ((float) this.mPageMargin) / f;
            int i3 = infoForCurrentScrollPosition.f1362b;
            float f3 = ((((float) i) / f) - infoForCurrentScrollPosition.f1365e) / (infoForCurrentScrollPosition.f1364d + f2);
            int i4 = (int) (((float) i2) * f3);
            this.mCalledSuper = false;
            onPageScrolled(i3, f3, i4);
            if (this.mCalledSuper) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.mFirstLayout) {
            return false;
        } else {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006d
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = r1
        L_0x001d:
            if (r3 >= r6) goto L_0x006d
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r9 = (android.support.p017v4.view.ViewPager.LayoutParams) r9
            boolean r10 = r9.f1352a
            if (r10 != 0) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            int r9 = r9.f1353b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004f
            r10 = 3
            if (r9 == r10) goto L_0x0049
            r10 = 5
            if (r9 == r10) goto L_0x003c
            r9 = r4
            goto L_0x005e
        L_0x003c:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L_0x005b
        L_0x0049:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L_0x005e
        L_0x004f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L_0x005b:
            r11 = r9
            r9 = r4
            r4 = r11
        L_0x005e:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0069
            r8.offsetLeftAndRight(r4)
        L_0x0069:
            r4 = r9
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x006d:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            android.support.v4.view.ViewPager$f r13 = r12.mPageTransformer
            if (r13 == 0) goto L_0x00a1
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007c:
            if (r1 >= r14) goto L_0x00a1
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r0 = (android.support.p017v4.view.ViewPager.LayoutParams) r0
            boolean r0 = r0.f1352a
            if (r0 == 0) goto L_0x008d
            goto L_0x009e
        L_0x008d:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            android.support.v4.view.ViewPager$f r3 = r12.mPageTransformer
            r3.mo1972a(r15, r0)
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x007c
        L_0x00a1:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.view.ViewPager.onPageScrolled(int, float, int):void");
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.mo1882a(i, f, i2);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0557e eVar = (C0557e) this.mOnPageChangeListeners.get(i3);
                if (eVar != null) {
                    eVar.mo1882a(i, f, i2);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.mo1882a(i, f, i2);
        }
    }

    private void dispatchOnPageSelected(int i) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.mo1881a(i);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0557e eVar = (C0557e) this.mOnPageChangeListeners.get(i2);
                if (eVar != null) {
                    eVar.mo1881a(i);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.mo1881a(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.mo1884b(i);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0557e eVar = (C0557e) this.mOnPageChangeListeners.get(i2);
                if (eVar != null) {
                    eVar.mo1884b(i);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.mo1884b(i);
        }
    }

    private void completeScroll(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        boolean z3 = z2;
        for (int i = 0; i < this.mItems.size(); i++) {
            C0554b bVar = (C0554b) this.mItems.get(i);
            if (bVar.f1363c) {
                bVar.f1363c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            C0595r.m2242a((View) this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private boolean isGutterDrag(float f, float f2) {
        return (f < ((float) this.mGutterSize) && f2 > 0.0f) || (f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f);
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.mPageTransformerLayerType : 0, null);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent2.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.mLastMotionX;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                if (f != 0.0f && !isGutterDrag(this.mLastMotionX, f)) {
                    if (canScroll(this, false, (int) f, (int) x2, (int) y2)) {
                        this.mLastMotionX = x2;
                        this.mLastMotionY = y2;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                }
                if (abs > ((float) this.mTouchSlop) && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    this.mLastMotionX = f > 0.0f ? this.mInitialMotionX + ((float) this.mTouchSlop) : this.mInitialMotionX - ((float) this.mTouchSlop);
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.mTouchSlop)) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x2)) {
                    C0595r.m2252d(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent2);
        return this.mIsBeingDragged;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mFakeDragging) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || this.mAdapter == null || this.mAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                float x = motionEvent.getX();
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                float y = motionEvent.getY();
                this.mInitialMotionY = y;
                this.mLastMotionY = y;
                this.mActivePointerId = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.mIsBeingDragged) {
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) this.mMaximumVelocity);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                    this.mPopulatePending = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C0554b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                    float f = (float) clientWidth;
                    setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f1362b, ((((float) scrollX) / f) - infoForCurrentScrollPosition.f1365e) / (infoForCurrentScrollPosition.f1364d + (((float) this.mPageMargin) / f)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                    z = resetTouch();
                    break;
                }
                break;
            case 2:
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        z = resetTouch();
                        break;
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.mLastMotionX);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.mLastMotionY);
                        if (abs > ((float) this.mTouchSlop) && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            this.mLastMotionX = x2 - this.mInitialMotionX > 0.0f ? this.mInitialMotionX + ((float) this.mTouchSlop) : this.mInitialMotionX - ((float) this.mTouchSlop);
                            this.mLastMotionY = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    break;
                }
                break;
            case 3:
                if (this.mIsBeingDragged) {
                    scrollToItem(this.mCurItem, true, 0, false);
                    z = resetTouch();
                    break;
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.mLastMotionX = motionEvent.getX(actionIndex);
                this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                onSecondaryPointerUp(motionEvent);
                this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                break;
        }
        if (z) {
            C0595r.m2252d(this);
        }
        return true;
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C0554b bVar = (C0554b) this.mItems.get(0);
        C0554b bVar2 = (C0554b) this.mItems.get(this.mItems.size() - 1);
        if (bVar.f1362b != 0) {
            f3 = bVar.f1365e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f1362b != this.mAdapter.getCount() - 1) {
            f4 = bVar2.f1365e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    private C0554b infoForCurrentScrollPosition() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = -1;
        C0554b bVar = null;
        boolean z = true;
        while (i < this.mItems.size()) {
            C0554b bVar2 = (C0554b) this.mItems.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (bVar2.f1362b != i3) {
                    bVar2 = this.mTempItem;
                    bVar2.f1365e = f2 + f3 + f;
                    bVar2.f1362b = i3;
                    bVar2.f1364d = this.mAdapter.getPageWidth(bVar2.f1362b);
                    i--;
                }
            }
            f2 = bVar2.f1365e;
            float f4 = bVar2.f1364d + f2 + f;
            if (!z && scrollX < f2) {
                return bVar;
            }
            if (scrollX < f4 || i == this.mItems.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f1362b;
            f3 = bVar2.f1364d;
            i++;
            z = false;
            bVar = bVar2;
        }
        return bVar;
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i += (int) (f + (i >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= 0) {
            return i;
        }
        return Math.max(((C0554b) this.mItems.get(0)).f1362b, Math.min(i, ((C0554b) this.mItems.get(this.mItems.size() - 1)).f1362b));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && this.mAdapter != null && this.mAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.mFirstOffset * ((float) width));
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.mLastOffset + 1.0f)) * ((float) width2));
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (z) {
            C0595r.m2252d(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = (float) width;
            float f4 = ((float) this.mPageMargin) / f3;
            int i = 0;
            C0554b bVar = (C0554b) this.mItems.get(0);
            float f5 = bVar.f1365e;
            int size = this.mItems.size();
            int i2 = bVar.f1362b;
            int i3 = ((C0554b) this.mItems.get(size - 1)).f1362b;
            while (i2 < i3) {
                while (i2 > bVar.f1362b && i < size) {
                    i++;
                    bVar = (C0554b) this.mItems.get(i);
                }
                if (i2 == bVar.f1362b) {
                    f = (bVar.f1365e + bVar.f1364d) * f3;
                    f5 = bVar.f1365e + bVar.f1364d + f4;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i2);
                    f = (f5 + pageWidth) * f3;
                    f5 += pageWidth + f4;
                }
                if (((float) this.mPageMargin) + f > ((float) scrollX)) {
                    f2 = f4;
                    this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(((float) this.mPageMargin) + f), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f2 = f4;
                }
                if (f <= ((float) (scrollX + width))) {
                    i2++;
                    f4 = f2;
                } else {
                    return;
                }
            }
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            this.mVelocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0554b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f1362b, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.f1365e) / infoForCurrentScrollPosition.f1364d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        endDrag();
        this.mFakeDragging = false;
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.mAdapter != null) {
            this.mLastMotionX += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            C0554b bVar = (C0554b) this.mItems.get(0);
            C0554b bVar2 = (C0554b) this.mItems.get(this.mItems.size() - 1);
            if (bVar.f1362b != 0) {
                f2 = bVar.f1365e * clientWidth;
            }
            if (bVar2.f1362b != this.mAdapter.getCount() - 1) {
                f3 = bVar2.f1365e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
        }
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.clear();
            }
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.mFirstOffset))) {
                z = true;
            }
            return z;
        } else if (i <= 0) {
            return false;
        } else {
            if (scrollX < ((int) (((float) clientWidth) * this.mLastOffset))) {
                z = true;
            }
            return z;
        }
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view2.getScrollX();
            int scrollY = view2.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (canScroll(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !view2.canScrollHorizontally(-i)) {
            z2 = false;
        }
        return z2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        if (keyEvent.hasModifiers(2)) {
                            return pageLeft();
                        }
                        return arrowScroll(17);
                    case 22:
                        if (keyEvent.hasModifiers(2)) {
                            return pageRight();
                        }
                        return arrowScroll(66);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return arrowScroll(2);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    public boolean arrowScroll(int i) {
        boolean requestFocus;
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    String str = TAG;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("arrowScroll tried to find focus based on non-child current focused view ");
                    sb2.append(sb.toString());
                    Log.e(str, sb2.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus != null && findNextFocus != view) {
            if (i == 17) {
                int i2 = getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left;
                int i3 = getChildRectInPagerCoordinates(this.mTempRect, view).left;
                if (view == null || i2 < i3) {
                    requestFocus = findNextFocus.requestFocus();
                } else {
                    requestFocus = pageLeft();
                }
            } else if (i == 66) {
                int i4 = getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left;
                int i5 = getChildRectInPagerCoordinates(this.mTempRect, view).left;
                if (view == null || i4 > i5) {
                    requestFocus = findNextFocus.requestFocus();
                } else {
                    requestFocus = pageRight();
                }
            }
            z2 = requestFocus;
        } else if (i == 17 || i == 1) {
            z2 = pageLeft();
        } else if (i == 66 || i == 2) {
            z2 = pageRight();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* access modifiers changed from: 0000 */
    public boolean pageLeft() {
        if (this.mCurItem <= 0) {
            return false;
        }
        setCurrentItem(this.mCurItem - 1, true);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean pageRight() {
        if (this.mAdapter == null || this.mCurItem >= this.mAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0554b infoForChild = infoForChild(childAt);
                    if (infoForChild != null && infoForChild.f1362b == this.mCurItem) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0554b infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.f1362b == this.mCurItem) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                C0554b infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.f1362b == this.mCurItem && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0554b infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.f1362b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
