package android.support.p028v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p017v4.p023d.C0397l;
import android.support.p017v4.p025os.C0541d;
import android.support.p017v4.view.AbsSavedState;
import android.support.p017v4.view.C0561a;
import android.support.p017v4.view.C0585h;
import android.support.p017v4.view.C0587j;
import android.support.p017v4.view.C0588k;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.C0599s;
import android.support.p017v4.view.p026a.C0563a;
import android.support.p017v4.view.p026a.C0564b;
import android.support.p017v4.view.p026a.C0564b.C0566b;
import android.support.p017v4.view.p026a.C0564b.C0567c;
import android.support.p028v7.p035e.C0757a.C0758a;
import android.support.p028v7.p035e.C0757a.C0759b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.widget.RecyclerView */
public class RecyclerView extends ViewGroup implements C0587j {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = (VERSION.SDK_INT >= 23);
    static final boolean ALLOW_THREAD_GAP_WORK = (VERSION.SDK_INT >= 21);
    private static final int[] CLIP_TO_PADDING_ATTR = {16842987};
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = (VERSION.SDK_INT <= 15);
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = (VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20);
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = (VERSION.SDK_INT <= 15);
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = (VERSION.SDK_INT >= 16);
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    C0953aj mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    private C0888l mActiveOnItemTouchListener;
    C0870a mAdapter;
    C1002d mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private C0873d mChildDrawingOrderCallback;
    C1027s mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0874e mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    C0937ab mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    boolean mIsAttached;
    C0875f mItemAnimator;
    private C0877b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<C0880h> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    C0881i mLayout;
    boolean mLayoutFrozen;
    private int mLayoutOrScrollCounter;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C0894q mObserver;
    private List<C0886j> mOnChildAttachStateListeners;
    private C0887k mOnFlingListener;
    private final ArrayList<C0888l> mOnItemTouchListeners;
    final List<C0901v> mPendingAccessibilityImportanceChange;
    private SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    C0939a mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C0892o mRecycler;
    C0893p mRecyclerListener;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    final int[] mScrollConsumed;
    private C0889m mScrollListener;
    private List<C0889m> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    final int[] mScrollStepConsumed;
    private C0588k mScrollingChildHelper;
    final C0898s mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final C0900u mViewFlinger;
    private final C0993b mViewInfoProcessCallback;
    final C0991bf mViewInfoStore;

    /* renamed from: android.support.v7.widget.RecyclerView$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: c */
        C0901v f2764c;

        /* renamed from: d */
        final Rect f2765d = new Rect();

        /* renamed from: e */
        boolean f2766e = true;

        /* renamed from: f */
        boolean f2767f = false;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: c */
        public boolean mo4192c() {
            return this.f2764c.isInvalid();
        }

        /* renamed from: d */
        public boolean mo4193d() {
            return this.f2764c.isRemoved();
        }

        /* renamed from: e */
        public boolean mo4194e() {
            return this.f2764c.isUpdated();
        }

        /* renamed from: f */
        public int mo4195f() {
            return this.f2764c.getLayoutPosition();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$SavedState */
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
        Parcelable f2768a;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C0881i.class.getClassLoader();
            }
            this.f2768a = parcel.readParcelable(classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f2768a, 0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4196a(SavedState savedState) {
            this.f2768a = savedState.f2768a;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$a */
    public static abstract class C0870a<VH extends C0901v> {
        private boolean mHasStableIds = false;
        private final C0871b mObservable = new C0871b();

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C0541d.m2067a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.mItemViewType = i;
                return onCreateViewHolder;
            } finally {
                C0541d.m2066a();
            }
        }

        public final void bindViewHolder(VH vh, int i) {
            vh.mPosition = i;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            C0541d.m2067a(RecyclerView.TRACE_BIND_VIEW_TAG);
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            android.view.ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                ((LayoutParams) layoutParams).f2766e = true;
            }
            C0541d.m2066a();
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo4234a();
        }

        public void registerAdapterDataObserver(C0872c cVar) {
            this.mObservable.registerObserver(cVar);
        }

        public void unregisterAdapterDataObserver(C0872c cVar) {
            this.mObservable.unregisterObserver(cVar);
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo4235b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo4232a(i, 1);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo4233a(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo4232a(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo4233a(i, i2, obj);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo4236b(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo4238d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo4236b(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo4237c(i, 1);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo4237c(i, i2);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$b */
    static class C0871b extends Observable<C0872c> {
        C0871b() {
        }

        /* renamed from: a */
        public boolean mo4234a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo4235b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0872c) this.mObservers.get(size)).mo4239a();
            }
        }

        /* renamed from: a */
        public void mo4232a(int i, int i2) {
            mo4233a(i, i2, null);
        }

        /* renamed from: a */
        public void mo4233a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0872c) this.mObservers.get(size)).mo4242a(i, i2, obj);
            }
        }

        /* renamed from: b */
        public void mo4236b(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0872c) this.mObservers.get(size)).mo4243b(i, i2);
            }
        }

        /* renamed from: c */
        public void mo4237c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0872c) this.mObservers.get(size)).mo4244c(i, i2);
            }
        }

        /* renamed from: d */
        public void mo4238d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0872c) this.mObservers.get(size)).mo4241a(i, i2, 1);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$c */
    public static abstract class C0872c {
        /* renamed from: a */
        public void mo4239a() {
        }

        /* renamed from: a */
        public void mo4240a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo4241a(int i, int i2, int i3) {
        }

        /* renamed from: b */
        public void mo4243b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo4244c(int i, int i2) {
        }

        /* renamed from: a */
        public void mo4242a(int i, int i2, Object obj) {
            mo4240a(i, i2);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$d */
    public interface C0873d {
        /* renamed from: a */
        int mo4245a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$e */
    public static class C0874e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo4246a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$f */
    public static abstract class C0875f {

        /* renamed from: a */
        private C0877b f2769a = null;

        /* renamed from: b */
        private ArrayList<C0876a> f2770b = new ArrayList<>();

        /* renamed from: c */
        private long f2771c = 120;

        /* renamed from: d */
        private long f2772d = 120;

        /* renamed from: e */
        private long f2773e = 250;

        /* renamed from: f */
        private long f2774f = 250;

        /* renamed from: android.support.v7.widget.RecyclerView$f$a */
        public interface C0876a {
            /* renamed from: a */
            void mo4268a();
        }

        /* renamed from: android.support.v7.widget.RecyclerView$f$b */
        interface C0877b {
            /* renamed from: a */
            void mo4269a(C0901v vVar);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$f$c */
        public static class C0878c {

            /* renamed from: a */
            public int f2775a;

            /* renamed from: b */
            public int f2776b;

            /* renamed from: c */
            public int f2777c;

            /* renamed from: d */
            public int f2778d;

            /* renamed from: a */
            public C0878c mo4270a(C0901v vVar) {
                return mo4271a(vVar, 0);
            }

            /* renamed from: a */
            public C0878c mo4271a(C0901v vVar, int i) {
                View view = vVar.itemView;
                this.f2775a = view.getLeft();
                this.f2776b = view.getTop();
                this.f2777c = view.getRight();
                this.f2778d = view.getBottom();
                return this;
            }
        }

        /* renamed from: a */
        public abstract void mo4249a();

        /* renamed from: a */
        public abstract boolean mo4251a(C0901v vVar, C0878c cVar, C0878c cVar2);

        /* renamed from: a */
        public abstract boolean mo4252a(C0901v vVar, C0901v vVar2, C0878c cVar, C0878c cVar2);

        /* renamed from: b */
        public abstract boolean mo4254b();

        /* renamed from: b */
        public abstract boolean mo4255b(C0901v vVar, C0878c cVar, C0878c cVar2);

        /* renamed from: c */
        public abstract boolean mo4256c(C0901v vVar, C0878c cVar, C0878c cVar2);

        /* renamed from: d */
        public abstract void mo4257d();

        /* renamed from: d */
        public abstract void mo4258d(C0901v vVar);

        /* renamed from: g */
        public void mo4263g(C0901v vVar) {
        }

        /* renamed from: h */
        public boolean mo4265h(C0901v vVar) {
            return true;
        }

        /* renamed from: e */
        public long mo4259e() {
            return this.f2773e;
        }

        /* renamed from: f */
        public long mo4260f() {
            return this.f2771c;
        }

        /* renamed from: g */
        public long mo4262g() {
            return this.f2772d;
        }

        /* renamed from: h */
        public long mo4264h() {
            return this.f2774f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4250a(C0877b bVar) {
            this.f2769a = bVar;
        }

        /* renamed from: a */
        public C0878c mo4248a(C0898s sVar, C0901v vVar, int i, List<Object> list) {
            return mo4267j().mo4270a(vVar);
        }

        /* renamed from: a */
        public C0878c mo4247a(C0898s sVar, C0901v vVar) {
            return mo4267j().mo4270a(vVar);
        }

        /* renamed from: e */
        static int m3761e(C0901v vVar) {
            int i = vVar.mFlags & 14;
            if (vVar.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = vVar.getOldPosition();
                int adapterPosition = vVar.getAdapterPosition();
                if (!(oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition)) {
                    i |= 2048;
                }
            }
            return i;
        }

        /* renamed from: f */
        public final void mo4261f(C0901v vVar) {
            mo4263g(vVar);
            if (this.f2769a != null) {
                this.f2769a.mo4269a(vVar);
            }
        }

        /* renamed from: a */
        public boolean mo4253a(C0901v vVar, List<Object> list) {
            return mo4265h(vVar);
        }

        /* renamed from: i */
        public final void mo4266i() {
            int size = this.f2770b.size();
            for (int i = 0; i < size; i++) {
                ((C0876a) this.f2770b.get(i)).mo4268a();
            }
            this.f2770b.clear();
        }

        /* renamed from: j */
        public C0878c mo4267j() {
            return new C0878c();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$g */
    private class C0879g implements C0877b {
        C0879g() {
        }

        /* renamed from: a */
        public void mo4269a(C0901v vVar) {
            vVar.setIsRecyclable(true);
            if (vVar.mShadowedHolder != null && vVar.mShadowingHolder == null) {
                vVar.mShadowedHolder = null;
            }
            vVar.mShadowingHolder = null;
            if (!vVar.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(vVar.itemView) && vVar.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(vVar.itemView, false);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$h */
    public static abstract class C0880h {
        @Deprecated
        /* renamed from: a */
        public void mo4272a(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        /* renamed from: b */
        public void mo4276b(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo4277b(Canvas canvas, RecyclerView recyclerView, C0898s sVar) {
            mo4272a(canvas, recyclerView);
        }

        /* renamed from: a */
        public void mo4273a(Canvas canvas, RecyclerView recyclerView, C0898s sVar) {
            mo4276b(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: a */
        public void mo4274a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: a */
        public void mo4275a(Rect rect, View view, RecyclerView recyclerView, C0898s sVar) {
            mo4274a(rect, ((LayoutParams) view.getLayoutParams()).mo4195f(), recyclerView);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$i */
    public static abstract class C0881i {
        boolean mAutoMeasure = false;
        C1027s mChildHelper;
        private int mHeight;
        private int mHeightMode;
        C0988be mHorizontalBoundCheck = new C0988be(this.mHorizontalBoundCheckCallback);
        private final C0990b mHorizontalBoundCheckCallback = new C0990b() {
            /* renamed from: a */
            public View mo4395a(int i) {
                return C0881i.this.getChildAt(i);
            }

            /* renamed from: a */
            public int mo4393a() {
                return C0881i.this.getPaddingLeft();
            }

            /* renamed from: b */
            public int mo4396b() {
                return C0881i.this.getWidth() - C0881i.this.getPaddingRight();
            }

            /* renamed from: a */
            public int mo4394a(View view) {
                return C0881i.this.getDecoratedLeft(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: b */
            public int mo4397b(View view) {
                return C0881i.this.getDecoratedRight(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        };
        boolean mIsAttachedToWindow = false;
        private boolean mItemPrefetchEnabled = true;
        private boolean mMeasurementCacheEnabled = true;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations = false;
        C0895r mSmoothScroller;
        C0988be mVerticalBoundCheck = new C0988be(this.mVerticalBoundCheckCallback);
        private final C0990b mVerticalBoundCheckCallback = new C0990b() {
            /* renamed from: a */
            public View mo4395a(int i) {
                return C0881i.this.getChildAt(i);
            }

            /* renamed from: a */
            public int mo4393a() {
                return C0881i.this.getPaddingTop();
            }

            /* renamed from: b */
            public int mo4396b() {
                return C0881i.this.getHeight() - C0881i.this.getPaddingBottom();
            }

            /* renamed from: a */
            public int mo4394a(View view) {
                return C0881i.this.getDecoratedTop(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public int mo4397b(View view) {
                return C0881i.this.getDecoratedBottom(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        };
        private int mWidth;
        private int mWidthMode;

        /* renamed from: android.support.v7.widget.RecyclerView$i$a */
        public interface C0884a {
            /* renamed from: b */
            void mo4398b(int i, int i2);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$i$b */
        public static class C0885b {

            /* renamed from: a */
            public int f2782a;

            /* renamed from: b */
            public int f2783b;

            /* renamed from: c */
            public boolean f2784c;

            /* renamed from: d */
            public boolean f2785d;
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, C0898s sVar, C0884a aVar) {
        }

        public void collectInitialPrefetchPositions(int i, C0884a aVar) {
        }

        public int computeHorizontalScrollExtent(C0898s sVar) {
            return 0;
        }

        public int computeHorizontalScrollOffset(C0898s sVar) {
            return 0;
        }

        public int computeHorizontalScrollRange(C0898s sVar) {
            return 0;
        }

        public int computeVerticalScrollExtent(C0898s sVar) {
            return 0;
        }

        public int computeVerticalScrollOffset(C0898s sVar) {
            return 0;
        }

        public int computeVerticalScrollRange(C0898s sVar) {
            return 0;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public int getBaseline() {
            return -1;
        }

        public int getSelectionModeForAccessibility(C0892o oVar, C0898s sVar) {
            return 0;
        }

        public boolean isLayoutHierarchical(C0892o oVar, C0898s sVar) {
            return false;
        }

        public void onAdapterChanged(C0870a aVar, C0870a aVar2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i, C0892o oVar, C0898s sVar) {
            return null;
        }

        public View onInterceptFocusSearch(View view, int i) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        }

        public void onLayoutCompleted(C0898s sVar) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public boolean performAccessibilityActionForItem(C0892o oVar, C0898s sVar, View view, int i, Bundle bundle) {
            return false;
        }

        public int scrollHorizontallyBy(int i, C0892o oVar, C0898s sVar) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, C0892o oVar, C0898s sVar) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        /* access modifiers changed from: 0000 */
        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = MeasureSpec.getSize(i);
            this.mWidthMode = MeasureSpec.getMode(i);
            if (this.mWidthMode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = MeasureSpec.getSize(i2);
            this.mHeightMode = MeasureSpec.getMode(i2);
            if (this.mHeightMode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mHeight = 0;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i4) {
                    i4 = rect.right;
                }
                if (rect.top < i6) {
                    i6 = rect.top;
                }
                if (rect.bottom > i5) {
                    i5 = rect.bottom;
                }
            }
            this.mRecyclerView.mTempRect.set(i3, i6, i4, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i2, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void requestLayout() {
            if (this.mRecyclerView != null) {
                this.mRecyclerView.requestLayout();
            }
        }

        public void assertInLayoutOrScroll(String str) {
            if (this.mRecyclerView != null) {
                this.mRecyclerView.assertInLayoutOrScroll(str);
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public void assertNotInLayoutOrScroll(String str) {
            if (this.mRecyclerView != null) {
                this.mRecyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                if (this.mRecyclerView != null) {
                    this.mRecyclerView.mRecycler.mo4433b();
                }
            }
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        /* access modifiers changed from: 0000 */
        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        /* access modifiers changed from: 0000 */
        public void dispatchDetachedFromWindow(RecyclerView recyclerView, C0892o oVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, oVar);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public void postOnAnimation(Runnable runnable) {
            if (this.mRecyclerView != null) {
                C0595r.m2242a((View) this.mRecyclerView, runnable);
            }
        }

        public boolean removeCallbacks(Runnable runnable) {
            if (this.mRecyclerView != null) {
                return this.mRecyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, C0892o oVar) {
            onDetachedFromWindow(recyclerView);
        }

        public boolean getClipToPadding() {
            return this.mRecyclerView != null && this.mRecyclerView.mClipToPadding;
        }

        public void onLayoutChildren(C0892o oVar, C0898s sVar) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                return new LayoutParams((MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, C0898s sVar, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(C0895r rVar) {
            if (!(this.mSmoothScroller == null || rVar == this.mSmoothScroller || !this.mSmoothScroller.isRunning())) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = rVar;
            this.mSmoothScroller.start(this.mRecyclerView, this);
        }

        public boolean isSmoothScrolling() {
            return this.mSmoothScroller != null && this.mSmoothScroller.isRunning();
        }

        public int getLayoutDirection() {
            return C0595r.m2256f(this.mRecyclerView);
        }

        public void endAnimation(View view) {
            if (this.mRecyclerView.mItemAnimator != null) {
                this.mRecyclerView.mItemAnimator.mo4258d(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        private void addViewInt(View view, int i, boolean z) {
            C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.mo5177e(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.mo5178f(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.mo5308a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int b = this.mChildHelper.mo5312b(view);
                if (i == -1) {
                    i = this.mChildHelper.mo5311b();
                }
                if (b == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.mRecyclerView.indexOfChild(view));
                    sb.append(this.mRecyclerView.exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                } else if (b != i) {
                    this.mRecyclerView.mLayout.moveView(b, i);
                }
            } else {
                this.mChildHelper.mo5309a(view, i, false);
                layoutParams.f2766e = true;
                if (this.mSmoothScroller != null && this.mSmoothScroller.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.f2767f) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.f2767f = false;
            }
        }

        public void removeView(View view) {
            this.mChildHelper.mo5307a(view);
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.mo5306a(i);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.mo5306a(childCount);
            }
        }

        public int getPosition(View view) {
            return ((LayoutParams) view.getLayoutParams()).mo4195f();
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public View findContainingItemView(View view) {
            if (this.mRecyclerView == null) {
                return null;
            }
            View findContainingItemView = this.mRecyclerView.findContainingItemView(view);
            if (findContainingItemView != null && !this.mChildHelper.mo5316c(findContainingItemView)) {
                return findContainingItemView;
            }
            return null;
        }

        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.mo4480a() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public void detachView(View view) {
            int b = this.mChildHelper.mo5312b(view);
            if (b >= 0) {
                detachViewInternal(b, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        private void detachViewInternal(int i, View view) {
            this.mChildHelper.mo5319e(i);
        }

        public void attachView(View view, int i, LayoutParams layoutParams) {
            C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.mo5177e(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.mo5178f(childViewHolderInt);
            }
            this.mChildHelper.mo5308a(view, i, layoutParams, childViewHolderInt.isRemoved());
        }

        public void attachView(View view, int i) {
            attachView(view, i, (LayoutParams) view.getLayoutParams());
        }

        public void attachView(View view) {
            attachView(view, -1);
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot move a child from non-existing index:");
                sb.append(i);
                sb.append(this.mRecyclerView.toString());
                throw new IllegalArgumentException(sb.toString());
            }
            detachViewAt(i);
            attachView(childAt, i2);
        }

        public void detachAndScrapView(View view, C0892o oVar) {
            scrapOrRecycleView(oVar, this.mChildHelper.mo5312b(view), view);
        }

        public void detachAndScrapViewAt(int i, C0892o oVar) {
            scrapOrRecycleView(oVar, i, getChildAt(i));
        }

        public void removeAndRecycleView(View view, C0892o oVar) {
            removeView(view);
            oVar.mo4429a(view);
        }

        public void removeAndRecycleViewAt(int i, C0892o oVar) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            oVar.mo4429a(childAt);
        }

        public int getChildCount() {
            if (this.mChildHelper != null) {
                return this.mChildHelper.mo5311b();
            }
            return 0;
        }

        public View getChildAt(int i) {
            if (this.mChildHelper != null) {
                return this.mChildHelper.mo5313b(i);
            }
            return null;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getPaddingLeft() {
            if (this.mRecyclerView != null) {
                return this.mRecyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingTop() {
            if (this.mRecyclerView != null) {
                return this.mRecyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPaddingRight() {
            if (this.mRecyclerView != null) {
                return this.mRecyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingBottom() {
            if (this.mRecyclerView != null) {
                return this.mRecyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingStart() {
            if (this.mRecyclerView != null) {
                return C0595r.m2259h(this.mRecyclerView);
            }
            return 0;
        }

        public int getPaddingEnd() {
            if (this.mRecyclerView != null) {
                return C0595r.m2260i(this.mRecyclerView);
            }
            return 0;
        }

        public boolean isFocused() {
            return this.mRecyclerView != null && this.mRecyclerView.isFocused();
        }

        public boolean hasFocus() {
            return this.mRecyclerView != null && this.mRecyclerView.hasFocus();
        }

        public View getFocusedChild() {
            if (this.mRecyclerView == null) {
                return null;
            }
            View focusedChild = this.mRecyclerView.getFocusedChild();
            if (focusedChild == null || this.mChildHelper.mo5316c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getItemCount() {
            C0870a adapter = this.mRecyclerView != null ? this.mRecyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public void offsetChildrenHorizontal(int i) {
            if (this.mRecyclerView != null) {
                this.mRecyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(int i) {
            if (this.mRecyclerView != null) {
                this.mRecyclerView.offsetChildrenVertical(i);
            }
        }

        public void ignoreView(View view) {
            if (view.getParent() != this.mRecyclerView || this.mRecyclerView.indexOfChild(view) == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("View should be fully attached to be ignored");
                sb.append(this.mRecyclerView.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.mo5179g(childViewHolderInt);
        }

        public void stopIgnoringView(View view) {
            C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void detachAndScrapAttachedViews(C0892o oVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(oVar, childCount, getChildAt(childCount));
            }
        }

        private void scrapOrRecycleView(C0892o oVar, int i, View view) {
            C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.mRecyclerView.mAdapter.hasStableIds()) {
                    detachViewAt(i);
                    oVar.mo4441c(view);
                    this.mRecyclerView.mViewInfoStore.mo5180h(childViewHolderInt);
                } else {
                    removeViewAt(i);
                    oVar.mo4435b(childViewHolderInt);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void removeAndRecycleScrapInt(C0892o oVar) {
            int e = oVar.mo4445e();
            for (int i = e - 1; i >= 0; i--) {
                View e2 = oVar.mo4446e(i);
                C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(e2);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(e2, false);
                    }
                    if (this.mRecyclerView.mItemAnimator != null) {
                        this.mRecyclerView.mItemAnimator.mo4258d(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    oVar.mo4436b(e2);
                }
            }
            oVar.mo4448f();
            if (e > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void measureChild(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, layoutParams.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i3, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldReMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return !this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getMeasuredWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getMeasuredHeight(), i2, layoutParams.height);
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getHeight(), i2, layoutParams.height);
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            boolean z = false;
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                if (size >= i) {
                    z = true;
                }
                return z;
            } else if (mode == 0) {
                return true;
            } else {
                if (mode != 1073741824) {
                    return false;
                }
                if (size == i) {
                    z = true;
                }
                return z;
            }
        }

        public void measureChildWithMargins(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, layoutParams.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i3, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x000c;
         */
        @java.lang.Deprecated
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x0011
                if (r3 < 0) goto L_0x000f
            L_0x000c:
                r1 = r3
            L_0x000d:
                r2 = r0
                goto L_0x001d
            L_0x000f:
                r1 = r2
                goto L_0x001d
            L_0x0011:
                if (r3 < 0) goto L_0x0014
                goto L_0x000c
            L_0x0014:
                r4 = -1
                if (r3 != r4) goto L_0x0018
                goto L_0x000d
            L_0x0018:
                r4 = -2
                if (r3 != r4) goto L_0x000f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x001d:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.RecyclerView.C0881i.getChildMeasureSpec(int, int, int, boolean):int");
        }

        public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6 = i - i3;
            int i7 = 0;
            int max = Math.max(0, i6);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 == Integer.MIN_VALUE || (i2 != 0 && i2 == 1073741824)) {
                            i5 = max;
                        } else {
                            i2 = 0;
                            i5 = 0;
                        }
                        i7 = i2;
                        max = i5;
                        return MeasureSpec.makeMeasureSpec(max, i7);
                    }
                    max = 0;
                    return MeasureSpec.makeMeasureSpec(max, i7);
                }
            } else if (i4 < 0) {
                if (i4 == -1) {
                    i7 = i2;
                } else {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i7 = Integer.MIN_VALUE;
                        }
                    }
                    max = 0;
                }
                return MeasureSpec.makeMeasureSpec(max, i7);
            }
            max = i4;
            i7 = 1073741824;
            return MeasureSpec.makeMeasureSpec(max, i7);
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f2765d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f2765d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f2765d;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f2765d;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f2765d;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.mRecyclerView.mTempRectF;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            if (this.mRecyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.mRecyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public int getTopDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).f2765d.top;
        }

        public int getBottomDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).f2765d.bottom;
        }

        public int getLeftDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).f2765d.left;
        }

        public int getRightDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).f2765d.right;
        }

        private int[] getChildRectangleOnScreenScrollAmount(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width2 - width;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(recyclerView, view, rect, z);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.mo5159a(view, 24579) && this.mVerticalBoundCheck.mo5159a(view, 24579);
            return z ? z3 : !z3;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            if (rect.left - i >= width || rect.right - i <= paddingLeft || rect.top - i2 >= height || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, C0898s sVar, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onMeasure(C0892o oVar, C0898s sVar, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public int getMinimumWidth() {
            return C0595r.m2261j(this.mRecyclerView);
        }

        public int getMinimumHeight() {
            return C0595r.m2262k(this.mRecyclerView);
        }

        /* access modifiers changed from: 0000 */
        public void stopSmoothScroller() {
            if (this.mSmoothScroller != null) {
                this.mSmoothScroller.stop();
            }
        }

        /* access modifiers changed from: 0000 */
        public void onSmoothScrollerStopped(C0895r rVar) {
            if (this.mSmoothScroller == rVar) {
                this.mSmoothScroller = null;
            }
        }

        public void removeAndRecycleAllViews(C0892o oVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, oVar);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void onInitializeAccessibilityNodeInfo(C0564b bVar) {
            onInitializeAccessibilityNodeInfo(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, bVar);
        }

        public void onInitializeAccessibilityNodeInfo(C0892o oVar, C0898s sVar, C0564b bVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                bVar.mo1994a(8192);
                bVar.mo2026i(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                bVar.mo1994a((int) MpegAudioHeader.MAX_FRAME_SIZE_BYTES);
                bVar.mo2026i(true);
            }
            bVar.mo1998a((Object) C0566b.m2157a(getRowCountForAccessibility(oVar, sVar), getColumnCountForAccessibility(oVar, sVar), isLayoutHierarchical(oVar, sVar), getSelectionModeForAccessibility(oVar, sVar)));
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            onInitializeAccessibilityEvent(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(C0892o oVar, C0898s sVar, AccessibilityEvent accessibilityEvent) {
            if (this.mRecyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!this.mRecyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (this.mRecyclerView.mAdapter != null) {
                    accessibilityEvent.setItemCount(this.mRecyclerView.mAdapter.getItemCount());
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void onInitializeAccessibilityNodeInfoForItem(View view, C0564b bVar) {
            C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.mChildHelper.mo5316c(childViewHolderInt.itemView)) {
                onInitializeAccessibilityNodeInfoForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, bVar);
            }
        }

        public void onInitializeAccessibilityNodeInfoForItem(C0892o oVar, C0898s sVar, View view, C0564b bVar) {
            int i = 0;
            int position = canScrollVertically() ? getPosition(view) : 0;
            if (canScrollHorizontally()) {
                i = getPosition(view);
            }
            bVar.mo2006b((Object) C0567c.m2158a(position, 1, i, 1, false, false));
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int getRowCountForAccessibility(C0892o oVar, C0898s sVar) {
            int i = 1;
            if (this.mRecyclerView == null || this.mRecyclerView.mAdapter == null) {
                return 1;
            }
            if (canScrollVertically()) {
                i = this.mRecyclerView.mAdapter.getItemCount();
            }
            return i;
        }

        public int getColumnCountForAccessibility(C0892o oVar, C0898s sVar) {
            int i = 1;
            if (this.mRecyclerView == null || this.mRecyclerView.mAdapter == null) {
                return 1;
            }
            if (canScrollHorizontally()) {
                i = this.mRecyclerView.mAdapter.getItemCount();
            }
            return i;
        }

        /* access modifiers changed from: 0000 */
        public boolean performAccessibilityAction(int i, Bundle bundle) {
            return performAccessibilityAction(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, i, bundle);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean performAccessibilityAction(android.support.p028v7.widget.RecyclerView.C0892o r2, android.support.p028v7.widget.RecyclerView.C0898s r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                android.support.v7.widget.RecyclerView r2 = r1.mRecyclerView
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r2 = 4096(0x1000, float:5.74E-42)
                r5 = 1
                if (r4 == r2) goto L_0x0044
                r2 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r2) goto L_0x0012
                r2 = r3
                r4 = r2
                goto L_0x0074
            L_0x0012:
                android.support.v7.widget.RecyclerView r2 = r1.mRecyclerView
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x002b
                int r2 = r1.getHeight()
                int r0 = r1.getPaddingTop()
                int r2 = r2 - r0
                int r0 = r1.getPaddingBottom()
                int r2 = r2 - r0
                int r2 = -r2
                goto L_0x002c
            L_0x002b:
                r2 = r3
            L_0x002c:
                android.support.v7.widget.RecyclerView r0 = r1.mRecyclerView
                boolean r4 = r0.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0073
                int r4 = r1.getWidth()
                int r0 = r1.getPaddingLeft()
                int r4 = r4 - r0
                int r0 = r1.getPaddingRight()
                int r4 = r4 - r0
                int r4 = -r4
                goto L_0x0074
            L_0x0044:
                android.support.v7.widget.RecyclerView r2 = r1.mRecyclerView
                boolean r2 = r2.canScrollVertically(r5)
                if (r2 == 0) goto L_0x005b
                int r2 = r1.getHeight()
                int r4 = r1.getPaddingTop()
                int r2 = r2 - r4
                int r4 = r1.getPaddingBottom()
                int r2 = r2 - r4
                goto L_0x005c
            L_0x005b:
                r2 = r3
            L_0x005c:
                android.support.v7.widget.RecyclerView r4 = r1.mRecyclerView
                boolean r4 = r4.canScrollHorizontally(r5)
                if (r4 == 0) goto L_0x0073
                int r4 = r1.getWidth()
                int r0 = r1.getPaddingLeft()
                int r4 = r4 - r0
                int r0 = r1.getPaddingRight()
                int r4 = r4 - r0
                goto L_0x0074
            L_0x0073:
                r4 = r3
            L_0x0074:
                if (r2 != 0) goto L_0x0079
                if (r4 != 0) goto L_0x0079
                return r3
            L_0x0079:
                android.support.v7.widget.RecyclerView r3 = r1.mRecyclerView
                r3.smoothScrollBy(r4, r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.RecyclerView.C0881i.performAccessibilityAction(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s, int, android.os.Bundle):boolean");
        }

        /* access modifiers changed from: 0000 */
        public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
            return performAccessibilityActionForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, i, bundle);
        }

        public static C0885b getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
            C0885b bVar = new C0885b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0759b.RecyclerView, i, i2);
            bVar.f2782a = obtainStyledAttributes.getInt(C0759b.RecyclerView_android_orientation, 1);
            bVar.f2783b = obtainStyledAttributes.getInt(C0759b.RecyclerView_spanCount, 1);
            bVar.f2784c = obtainStyledAttributes.getBoolean(C0759b.RecyclerView_reverseLayout, false);
            bVar.f2785d = obtainStyledAttributes.getBoolean(C0759b.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        /* access modifiers changed from: 0000 */
        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* access modifiers changed from: 0000 */
        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$j */
    public interface C0886j {
        /* renamed from: a */
        void mo4399a(View view);

        /* renamed from: b */
        void mo4400b(View view);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$k */
    public static abstract class C0887k {
        /* renamed from: a */
        public abstract boolean mo4401a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$l */
    public interface C0888l {
        /* renamed from: a */
        void mo4402a(boolean z);

        /* renamed from: a */
        boolean mo4403a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo4404b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$m */
    public static abstract class C0889m {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$n */
    public static class C0890n {

        /* renamed from: a */
        SparseArray<C0891a> f2786a = new SparseArray<>();

        /* renamed from: b */
        private int f2787b = 0;

        /* renamed from: android.support.v7.widget.RecyclerView$n$a */
        static class C0891a {

            /* renamed from: a */
            final ArrayList<C0901v> f2788a = new ArrayList<>();

            /* renamed from: b */
            int f2789b = 5;

            /* renamed from: c */
            long f2790c = 0;

            /* renamed from: d */
            long f2791d = 0;

            C0891a() {
            }
        }

        /* renamed from: a */
        public void mo4409a() {
            for (int i = 0; i < this.f2786a.size(); i++) {
                ((C0891a) this.f2786a.valueAt(i)).f2788a.clear();
            }
        }

        /* renamed from: a */
        public C0901v mo4408a(int i) {
            C0891a aVar = (C0891a) this.f2786a.get(i);
            if (aVar == null || aVar.f2788a.isEmpty()) {
                return null;
            }
            ArrayList<C0901v> arrayList = aVar.f2788a;
            return (C0901v) arrayList.remove(arrayList.size() - 1);
        }

        /* renamed from: a */
        public void mo4412a(C0901v vVar) {
            int itemViewType = vVar.getItemViewType();
            ArrayList<C0901v> arrayList = m3811b(itemViewType).f2788a;
            if (((C0891a) this.f2786a.get(itemViewType)).f2789b > arrayList.size()) {
                vVar.resetInternal();
                arrayList.add(vVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo4407a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4410a(int i, long j) {
            C0891a b = m3811b(i);
            b.f2790c = mo4407a(b.f2790c, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4415b(int i, long j) {
            C0891a b = m3811b(i);
            b.f2791d = mo4407a(b.f2791d, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4413a(int i, long j, long j2) {
            long j3 = m3811b(i).f2790c;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4416b(int i, long j, long j2) {
            long j3 = m3811b(i).f2791d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4414b() {
            this.f2787b++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4417c() {
            this.f2787b--;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4411a(C0870a aVar, C0870a aVar2, boolean z) {
            if (aVar != null) {
                mo4417c();
            }
            if (!z && this.f2787b == 0) {
                mo4409a();
            }
            if (aVar2 != null) {
                mo4414b();
            }
        }

        /* renamed from: b */
        private C0891a m3811b(int i) {
            C0891a aVar = (C0891a) this.f2786a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0891a aVar2 = new C0891a();
            this.f2786a.put(i, aVar2);
            return aVar2;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$o */
    public final class C0892o {

        /* renamed from: a */
        final ArrayList<C0901v> f2792a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C0901v> f2793b = null;

        /* renamed from: c */
        final ArrayList<C0901v> f2794c = new ArrayList<>();

        /* renamed from: d */
        int f2795d = 2;

        /* renamed from: e */
        C0890n f2796e;

        /* renamed from: g */
        private final List<C0901v> f2798g = Collections.unmodifiableList(this.f2792a);

        /* renamed from: h */
        private int f2799h = 2;

        /* renamed from: i */
        private C0899t f2800i;

        public C0892o() {
        }

        /* renamed from: a */
        public void mo4421a() {
            this.f2792a.clear();
            mo4442d();
        }

        /* renamed from: a */
        public void mo4422a(int i) {
            this.f2799h = i;
            mo4433b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4433b() {
            this.f2795d = this.f2799h + (RecyclerView.this.mLayout != null ? RecyclerView.this.mLayout.mPrefetchMaxCountObserved : 0);
            for (int size = this.f2794c.size() - 1; size >= 0 && this.f2794c.size() > this.f2795d; size--) {
                mo4443d(size);
            }
        }

        /* renamed from: c */
        public List<C0901v> mo4438c() {
            return this.f2798g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4430a(C0901v vVar) {
            if (vVar.isRemoved()) {
                return RecyclerView.this.mState.mo4480a();
            }
            if (vVar.mPosition < 0 || vVar.mPosition >= RecyclerView.this.mAdapter.getItemCount()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistency detected. Invalid view holder adapter position");
                sb.append(vVar);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            boolean z = false;
            if (!RecyclerView.this.mState.mo4480a() && RecyclerView.this.mAdapter.getItemViewType(vVar.mPosition) != vVar.getItemViewType()) {
                return false;
            }
            if (!RecyclerView.this.mAdapter.hasStableIds()) {
                return true;
            }
            if (vVar.getItemId() == RecyclerView.this.mAdapter.getItemId(vVar.mPosition)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        private boolean m3824a(C0901v vVar, int i, int i2, long j) {
            vVar.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = vVar.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f2796e.mo4416b(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(vVar, i);
            this.f2796e.mo4415b(vVar.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m3825e(vVar);
            if (RecyclerView.this.mState.mo4480a()) {
                vVar.mPreLayoutPosition = i2;
            }
            return true;
        }

        /* renamed from: b */
        public int mo4431b(int i) {
            if (i < 0 || i >= RecyclerView.this.mState.mo4484e()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i);
                sb.append(". State ");
                sb.append("item count is ");
                sb.append(RecyclerView.this.mState.mo4484e());
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.mState.mo4480a()) {
                return i;
            } else {
                return RecyclerView.this.mAdapterHelper.mo5208b(i);
            }
        }

        /* renamed from: c */
        public View mo4437c(int i) {
            return mo4420a(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo4420a(int i, boolean z) {
            return mo4418a(i, z, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01ae  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01d3  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0209  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0217  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.support.p028v7.widget.RecyclerView.C0901v mo4418a(int r18, boolean r19, long r20) {
            /*
                r17 = this;
                r6 = r17
                r3 = r18
                r0 = r19
                if (r3 < 0) goto L_0x023a
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r1 = r1.mState
                int r1 = r1.mo4484e()
                if (r3 < r1) goto L_0x0014
                goto L_0x023a
            L_0x0014:
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r1 = r1.mState
                boolean r1 = r1.mo4480a()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0029
                android.support.v7.widget.RecyclerView$v r1 = r17.mo4447f(r18)
                if (r1 == 0) goto L_0x002a
                r4 = r7
                goto L_0x002b
            L_0x0029:
                r1 = r2
            L_0x002a:
                r4 = r8
            L_0x002b:
                if (r1 != 0) goto L_0x005f
                android.support.v7.widget.RecyclerView$v r1 = r17.mo4432b(r18, r19)
                if (r1 == 0) goto L_0x005f
                boolean r5 = r6.mo4430a(r1)
                if (r5 != 0) goto L_0x005e
                if (r0 != 0) goto L_0x005c
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x0050
                android.support.v7.widget.RecyclerView r5 = android.support.p028v7.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0059
            L_0x0050:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0059
                r1.clearReturnedFromScrapFlag()
            L_0x0059:
                r6.mo4435b(r1)
            L_0x005c:
                r1 = r2
                goto L_0x005f
            L_0x005e:
                r4 = r7
            L_0x005f:
                if (r1 != 0) goto L_0x018d
                android.support.v7.widget.RecyclerView r5 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.d r5 = r5.mAdapterHelper
                int r5 = r5.mo5208b(r3)
                if (r5 < 0) goto L_0x0150
                android.support.v7.widget.RecyclerView r9 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r9 = r9.mAdapter
                int r9 = r9.getItemCount()
                if (r5 < r9) goto L_0x0077
                goto L_0x0150
            L_0x0077:
                android.support.v7.widget.RecyclerView r9 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r9 = r9.mAdapter
                int r9 = r9.getItemViewType(r5)
                android.support.v7.widget.RecyclerView r10 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r10 = r10.mAdapter
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x009a
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r1 = r1.mAdapter
                long r10 = r1.getItemId(r5)
                android.support.v7.widget.RecyclerView$v r1 = r6.mo4419a(r10, r9, r0)
                if (r1 == 0) goto L_0x009a
                r1.mPosition = r5
                r4 = r7
            L_0x009a:
                if (r1 != 0) goto L_0x00f0
                android.support.v7.widget.RecyclerView$t r0 = r6.f2800i
                if (r0 == 0) goto L_0x00f0
                android.support.v7.widget.RecyclerView$t r0 = r6.f2800i
                android.view.View r0 = r0.mo4486a(r6, r3, r9)
                if (r0 == 0) goto L_0x00f0
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$v r1 = r1.getChildViewHolder(r0)
                if (r1 != 0) goto L_0x00cd
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p028v7.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00cd:
                boolean r0 = r1.shouldIgnore()
                if (r0 == 0) goto L_0x00f0
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p028v7.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00f0:
                if (r1 != 0) goto L_0x0106
                android.support.v7.widget.RecyclerView$n r0 = r17.mo4449g()
                android.support.v7.widget.RecyclerView$v r1 = r0.mo4408a(r9)
                if (r1 == 0) goto L_0x0106
                r1.resetInternal()
                boolean r0 = android.support.p028v7.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r0 == 0) goto L_0x0106
                r6.m3826f(r1)
            L_0x0106:
                if (r1 != 0) goto L_0x018d
                android.support.v7.widget.RecyclerView r0 = android.support.p028v7.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0124
                android.support.v7.widget.RecyclerView$n r10 = r6.f2796e
                r11 = r9
                r12 = r0
                r14 = r20
                boolean r5 = r10.mo4413a(r11, r12, r14)
                if (r5 != 0) goto L_0x0124
                return r2
            L_0x0124:
                android.support.v7.widget.RecyclerView r2 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r2 = r2.mAdapter
                android.support.v7.widget.RecyclerView r5 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$v r2 = r2.createViewHolder(r5, r9)
                boolean r5 = android.support.p028v7.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r5 == 0) goto L_0x0141
                android.view.View r5 = r2.itemView
                android.support.v7.widget.RecyclerView r5 = android.support.p028v7.widget.RecyclerView.findNestedRecyclerView(r5)
                if (r5 == 0) goto L_0x0141
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x0141:
                android.support.v7.widget.RecyclerView r5 = android.support.p028v7.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                android.support.v7.widget.RecyclerView$n r5 = r6.f2796e
                long r12 = r10 - r0
                r5.mo4410a(r9, r12)
                r10 = r2
                goto L_0x018e
            L_0x0150:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")."
                r1.append(r2)
                java.lang.String r2 = "state:"
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r2 = r2.mState
                int r2 = r2.mo4484e()
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p028v7.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x018d:
                r10 = r1
            L_0x018e:
                r9 = r4
                if (r9 == 0) goto L_0x01c9
                android.support.v7.widget.RecyclerView r0 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r0 = r0.mState
                boolean r0 = r0.mo4480a()
                if (r0 != 0) goto L_0x01c9
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x01c9
                r10.setFlags(r8, r0)
                android.support.v7.widget.RecyclerView r0 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r0 = r0.mState
                boolean r0 = r0.f2818j
                if (r0 == 0) goto L_0x01c9
                int r0 = android.support.p028v7.widget.RecyclerView.C0875f.m3761e(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$f r1 = r1.mItemAnimator
                android.support.v7.widget.RecyclerView r2 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r2 = r2.mState
                java.util.List r4 = r10.getUnmodifiedPayloads()
                android.support.v7.widget.RecyclerView$f$c r0 = r1.mo4248a(r2, r10, r0, r4)
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r10, r0)
            L_0x01c9:
                android.support.v7.widget.RecyclerView r0 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r0 = r0.mState
                boolean r0 = r0.mo4480a()
                if (r0 == 0) goto L_0x01dc
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01dc
                r10.mPreLayoutPosition = r3
                goto L_0x01ef
            L_0x01dc:
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01f1
                boolean r0 = r10.needsUpdate()
                if (r0 != 0) goto L_0x01f1
                boolean r0 = r10.isInvalid()
                if (r0 == 0) goto L_0x01ef
                goto L_0x01f1
            L_0x01ef:
                r0 = r8
                goto L_0x0201
            L_0x01f1:
                android.support.v7.widget.RecyclerView r0 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.d r0 = r0.mAdapterHelper
                int r2 = r0.mo5208b(r3)
                r0 = r6
                r1 = r10
                r4 = r20
                boolean r0 = r0.m3824a(r1, r2, r3, r4)
            L_0x0201:
                android.view.View r1 = r10.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0217
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                android.support.v7.widget.RecyclerView$LayoutParams r1 = (android.support.p028v7.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x022f
            L_0x0217:
                android.support.v7.widget.RecyclerView r2 = android.support.p028v7.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x022d
                android.support.v7.widget.RecyclerView r2 = android.support.p028v7.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                android.support.v7.widget.RecyclerView$LayoutParams r1 = (android.support.p028v7.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x022f
            L_0x022d:
                android.support.v7.widget.RecyclerView$LayoutParams r1 = (android.support.p028v7.widget.RecyclerView.LayoutParams) r1
            L_0x022f:
                r1.f2764c = r10
                if (r9 == 0) goto L_0x0236
                if (r0 == 0) goto L_0x0236
                goto L_0x0237
            L_0x0236:
                r7 = r8
            L_0x0237:
                r1.f2767f = r7
                return r10
            L_0x023a:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r2 = r2.mState
                int r2 = r2.mo4484e()
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p028v7.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.RecyclerView.C0892o.mo4418a(int, boolean, long):android.support.v7.widget.RecyclerView$v");
        }

        /* renamed from: e */
        private void m3825e(C0901v vVar) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = vVar.itemView;
                if (C0595r.m2254e(view) == 0) {
                    C0595r.m2247b(view, 1);
                }
                if (!C0595r.m2248b(view)) {
                    vVar.addFlags(16384);
                    C0595r.m2240a(view, RecyclerView.this.mAccessibilityDelegate.mo4934c());
                }
            }
        }

        /* renamed from: f */
        private void m3826f(C0901v vVar) {
            if (vVar.itemView instanceof ViewGroup) {
                m3823a((ViewGroup) vVar.itemView, false);
            }
        }

        /* renamed from: a */
        private void m3823a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m3823a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: a */
        public void mo4429a(View view) {
            C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            mo4435b(childViewHolderInt);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4442d() {
            for (int size = this.f2794c.size() - 1; size >= 0; size--) {
                mo4443d(size);
            }
            this.f2794c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.mo4876a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4443d(int i) {
            mo4428a((C0901v) this.f2794c.get(i), true);
            this.f2794c.remove(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4435b(C0901v vVar) {
            boolean z;
            boolean z2 = false;
            if (vVar.isScrap() || vVar.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(vVar.isScrap());
                sb.append(" isAttached:");
                if (vVar.itemView.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (vVar.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(vVar);
                sb2.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb2.toString());
            } else if (vVar.shouldIgnore()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb3.toString());
            } else {
                boolean doesTransientStatePreventRecycling = vVar.doesTransientStatePreventRecycling();
                if ((RecyclerView.this.mAdapter != null && doesTransientStatePreventRecycling && RecyclerView.this.mAdapter.onFailedToRecycleView(vVar)) || vVar.isRecyclable()) {
                    if (this.f2795d <= 0 || vVar.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.f2794c.size();
                        if (size >= this.f2795d && size > 0) {
                            mo4443d(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.mo4879a(vVar.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.mo4879a(((C0901v) this.f2794c.get(i)).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f2794c.add(size, vVar);
                        z = true;
                    }
                    if (!z) {
                        mo4428a(vVar, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.mViewInfoStore.mo5179g(vVar);
                if (!z && !z2 && doesTransientStatePreventRecycling) {
                    vVar.mOwnerRecyclerView = null;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4428a(C0901v vVar, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(vVar);
            if (vVar.hasAnyOfTheFlags(16384)) {
                vVar.setFlags(0, 16384);
                C0595r.m2240a(vVar.itemView, (C0561a) null);
            }
            if (z) {
                mo4444d(vVar);
            }
            vVar.mOwnerRecyclerView = null;
            mo4449g().mo4412a(vVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4436b(View view) {
            C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            mo4435b(childViewHolderInt);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4441c(View view) {
            C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f2793b == null) {
                    this.f2793b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f2793b.add(childViewHolderInt);
            } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f2792a.add(childViewHolderInt);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4440c(C0901v vVar) {
            if (vVar.mInChangeScrap) {
                this.f2793b.remove(vVar);
            } else {
                this.f2792a.remove(vVar);
            }
            vVar.mScrapContainer = null;
            vVar.mInChangeScrap = false;
            vVar.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo4445e() {
            return this.f2792a.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public View mo4446e(int i) {
            return ((C0901v) this.f2792a.get(i)).itemView;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo4448f() {
            this.f2792a.clear();
            if (this.f2793b != null) {
                this.f2793b.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C0901v mo4447f(int i) {
            if (this.f2793b != null) {
                int size = this.f2793b.size();
                if (size != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        C0901v vVar = (C0901v) this.f2793b.get(i3);
                        if (vVar.wasReturnedFromScrap() || vVar.getLayoutPosition() != i) {
                            i3++;
                        } else {
                            vVar.addFlags(32);
                            return vVar;
                        }
                    }
                    if (RecyclerView.this.mAdapter.hasStableIds()) {
                        int b = RecyclerView.this.mAdapterHelper.mo5208b(i);
                        if (b > 0 && b < RecyclerView.this.mAdapter.getItemCount()) {
                            long itemId = RecyclerView.this.mAdapter.getItemId(b);
                            while (i2 < size) {
                                C0901v vVar2 = (C0901v) this.f2793b.get(i2);
                                if (vVar2.wasReturnedFromScrap() || vVar2.getItemId() != itemId) {
                                    i2++;
                                } else {
                                    vVar2.addFlags(32);
                                    return vVar2;
                                }
                            }
                        }
                    }
                    return null;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0901v mo4432b(int i, boolean z) {
            int size = this.f2792a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0901v vVar = (C0901v) this.f2792a.get(i3);
                if (vVar.wasReturnedFromScrap() || vVar.getLayoutPosition() != i || vVar.isInvalid() || (!RecyclerView.this.mState.f2815g && vVar.isRemoved())) {
                    i3++;
                } else {
                    vVar.addFlags(32);
                    return vVar;
                }
            }
            if (!z) {
                View c = RecyclerView.this.mChildHelper.mo5315c(i);
                if (c != null) {
                    C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(c);
                    RecyclerView.this.mChildHelper.mo5320e(c);
                    int b = RecyclerView.this.mChildHelper.mo5312b(c);
                    if (b == -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("layout index should not be -1 after unhiding a view:");
                        sb.append(childViewHolderInt);
                        sb.append(RecyclerView.this.exceptionLabel());
                        throw new IllegalStateException(sb.toString());
                    }
                    RecyclerView.this.mChildHelper.mo5319e(b);
                    mo4441c(c);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
            }
            int size2 = this.f2794c.size();
            while (i2 < size2) {
                C0901v vVar2 = (C0901v) this.f2794c.get(i2);
                if (vVar2.isInvalid() || vVar2.getLayoutPosition() != i) {
                    i2++;
                } else {
                    if (!z) {
                        this.f2794c.remove(i2);
                    }
                    return vVar2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0901v mo4419a(long j, int i, boolean z) {
            for (int size = this.f2792a.size() - 1; size >= 0; size--) {
                C0901v vVar = (C0901v) this.f2792a.get(size);
                if (vVar.getItemId() == j && !vVar.wasReturnedFromScrap()) {
                    if (i == vVar.getItemViewType()) {
                        vVar.addFlags(32);
                        if (vVar.isRemoved() && !RecyclerView.this.mState.mo4480a()) {
                            vVar.setFlags(2, 14);
                        }
                        return vVar;
                    } else if (!z) {
                        this.f2792a.remove(size);
                        RecyclerView.this.removeDetachedView(vVar.itemView, false);
                        mo4436b(vVar.itemView);
                    }
                }
            }
            int size2 = this.f2794c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0901v vVar2 = (C0901v) this.f2794c.get(size2);
                if (vVar2.getItemId() == j) {
                    if (i == vVar2.getItemViewType()) {
                        if (!z) {
                            this.f2794c.remove(size2);
                        }
                        return vVar2;
                    } else if (!z) {
                        mo4443d(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4444d(C0901v vVar) {
            if (RecyclerView.this.mRecyclerListener != null) {
                RecyclerView.this.mRecyclerListener.mo4453a(vVar);
            }
            if (RecyclerView.this.mAdapter != null) {
                RecyclerView.this.mAdapter.onViewRecycled(vVar);
            }
            if (RecyclerView.this.mState != null) {
                RecyclerView.this.mViewInfoStore.mo5179g(vVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4425a(C0870a aVar, C0870a aVar2, boolean z) {
            mo4421a();
            mo4449g().mo4411a(aVar, aVar2, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4423a(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i4 = i2;
                i3 = -1;
                i5 = i;
            } else {
                i4 = i;
                i3 = 1;
                i5 = i2;
            }
            int size = this.f2794c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0901v vVar = (C0901v) this.f2794c.get(i6);
                if (vVar != null && vVar.mPosition >= i5 && vVar.mPosition <= i4) {
                    if (vVar.mPosition == i) {
                        vVar.offsetPosition(i2 - i, false);
                    } else {
                        vVar.offsetPosition(i3, false);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4434b(int i, int i2) {
            int size = this.f2794c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0901v vVar = (C0901v) this.f2794c.get(i3);
                if (vVar != null && vVar.mPosition >= i) {
                    vVar.offsetPosition(i2, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4424a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f2794c.size() - 1; size >= 0; size--) {
                C0901v vVar = (C0901v) this.f2794c.get(size);
                if (vVar != null) {
                    if (vVar.mPosition >= i3) {
                        vVar.offsetPosition(-i2, z);
                    } else if (vVar.mPosition >= i) {
                        vVar.addFlags(8);
                        mo4443d(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4427a(C0899t tVar) {
            this.f2800i = tVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4426a(C0890n nVar) {
            if (this.f2796e != null) {
                this.f2796e.mo4417c();
            }
            this.f2796e = nVar;
            if (this.f2796e != null && RecyclerView.this.getAdapter() != null) {
                this.f2796e.mo4414b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public C0890n mo4449g() {
            if (this.f2796e == null) {
                this.f2796e = new C0890n();
            }
            return this.f2796e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4439c(int i, int i2) {
            int i3 = i2 + i;
            for (int size = this.f2794c.size() - 1; size >= 0; size--) {
                C0901v vVar = (C0901v) this.f2794c.get(size);
                if (vVar != null) {
                    int i4 = vVar.mPosition;
                    if (i4 >= i && i4 < i3) {
                        vVar.addFlags(2);
                        mo4443d(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo4450h() {
            int size = this.f2794c.size();
            for (int i = 0; i < size; i++) {
                C0901v vVar = (C0901v) this.f2794c.get(i);
                if (vVar != null) {
                    vVar.addFlags(6);
                    vVar.addChangePayload(null);
                }
            }
            if (RecyclerView.this.mAdapter == null || !RecyclerView.this.mAdapter.hasStableIds()) {
                mo4442d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo4451i() {
            int size = this.f2794c.size();
            for (int i = 0; i < size; i++) {
                ((C0901v) this.f2794c.get(i)).clearOldPosition();
            }
            int size2 = this.f2792a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C0901v) this.f2792a.get(i2)).clearOldPosition();
            }
            if (this.f2793b != null) {
                int size3 = this.f2793b.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((C0901v) this.f2793b.get(i3)).clearOldPosition();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo4452j() {
            int size = this.f2794c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) ((C0901v) this.f2794c.get(i)).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f2766e = true;
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$p */
    public interface C0893p {
        /* renamed from: a */
        void mo4453a(C0901v vVar);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$q */
    private class C0894q extends C0872c {
        C0894q() {
        }

        /* renamed from: a */
        public void mo4239a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView.this.mState.f2814f = true;
            RecyclerView.this.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.mo5214d()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: a */
        public void mo4242a(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo5207a(i, i2, obj)) {
                mo4454b();
            }
        }

        /* renamed from: b */
        public void mo4243b(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo5210b(i, i2)) {
                mo4454b();
            }
        }

        /* renamed from: c */
        public void mo4244c(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo5213c(i, i2)) {
                mo4454b();
            }
        }

        /* renamed from: a */
        public void mo4241a(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo5206a(i, i2, i3)) {
                mo4454b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4454b() {
            if (!RecyclerView.POST_UPDATES_ON_ANIMATION || !RecyclerView.this.mHasFixedSize || !RecyclerView.this.mIsAttached) {
                RecyclerView.this.mAdapterUpdateDuringMeasure = true;
                RecyclerView.this.requestLayout();
                return;
            }
            C0595r.m2242a((View) RecyclerView.this, RecyclerView.this.mUpdateChildViewsRunnable);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$r */
    public static abstract class C0895r {
        private C0881i mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final C0896a mRecyclingAction = new C0896a(0, 0);
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition = -1;
        private View mTargetView;

        /* renamed from: android.support.v7.widget.RecyclerView$r$a */
        public static class C0896a {

            /* renamed from: a */
            private int f2802a;

            /* renamed from: b */
            private int f2803b;

            /* renamed from: c */
            private int f2804c;

            /* renamed from: d */
            private int f2805d;

            /* renamed from: e */
            private Interpolator f2806e;

            /* renamed from: f */
            private boolean f2807f;

            /* renamed from: g */
            private int f2808g;

            public C0896a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public C0896a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2805d = -1;
                this.f2807f = false;
                this.f2808g = 0;
                this.f2802a = i;
                this.f2803b = i2;
                this.f2804c = i3;
                this.f2806e = interpolator;
            }

            /* renamed from: a */
            public void mo4474a(int i) {
                this.f2805d = i;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo4477a() {
                return this.f2805d >= 0;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo4476a(RecyclerView recyclerView) {
                if (this.f2805d >= 0) {
                    int i = this.f2805d;
                    this.f2805d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f2807f = false;
                    return;
                }
                if (this.f2807f) {
                    m3869b();
                    if (this.f2806e != null) {
                        recyclerView.mViewFlinger.mo4491a(this.f2802a, this.f2803b, this.f2804c, this.f2806e);
                    } else if (this.f2804c == Integer.MIN_VALUE) {
                        recyclerView.mViewFlinger.mo4494b(this.f2802a, this.f2803b);
                    } else {
                        recyclerView.mViewFlinger.mo4489a(this.f2802a, this.f2803b, this.f2804c);
                    }
                    this.f2808g++;
                    if (this.f2808g > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2807f = false;
                } else {
                    this.f2808g = 0;
                }
            }

            /* renamed from: b */
            private void m3869b() {
                if (this.f2806e != null && this.f2804c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f2804c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            public void mo4475a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2802a = i;
                this.f2803b = i2;
                this.f2804c = i3;
                this.f2806e = interpolator;
                this.f2807f = true;
            }
        }

        /* renamed from: android.support.v7.widget.RecyclerView$r$b */
        public interface C0897b {
            PointF computeScrollVectorForPosition(int i);
        }

        /* access modifiers changed from: protected */
        public abstract void onSeekTargetStep(int i, int i2, C0898s sVar, C0896a aVar);

        /* access modifiers changed from: protected */
        public abstract void onStart();

        /* access modifiers changed from: protected */
        public abstract void onStop();

        /* access modifiers changed from: protected */
        public abstract void onTargetFound(View view, C0898s sVar, C0896a aVar);

        /* access modifiers changed from: 0000 */
        public void start(RecyclerView recyclerView, C0881i iVar) {
            if (this.mStarted) {
                String str = RecyclerView.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started ");
                sb.append("more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" ");
                sb.append("is intended to only be used once. You should create a new instance for ");
                sb.append("each use.");
                Log.w(str, sb.toString());
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = iVar;
            if (this.mTargetPosition == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            this.mRecyclerView.mState.f2809a = this.mTargetPosition;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.mo4487a();
            this.mStarted = true;
        }

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public PointF computeScrollVectorForPosition(int i) {
            C0881i layoutManager = getLayoutManager();
            if (layoutManager instanceof C0897b) {
                return ((C0897b) layoutManager).computeScrollVectorForPosition(i);
            }
            String str = RecyclerView.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(C0897b.class.getCanonicalName());
            Log.w(str, sb.toString());
            return null;
        }

        public C0881i getLayoutManager() {
            return this.mLayoutManager;
        }

        /* access modifiers changed from: protected */
        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f2809a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        /* access modifiers changed from: 0000 */
        public void onAnimation(int i, int i2) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (!this.mRunning || this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null) {
                PointF computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition);
                if (!(computeScrollVectorForPosition == null || (computeScrollVectorForPosition.x == 0.0f && computeScrollVectorForPosition.y == 0.0f))) {
                    recyclerView.scrollStep((int) Math.signum(computeScrollVectorForPosition.x), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            if (this.mTargetView != null) {
                if (getChildPosition(this.mTargetView) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.mo4476a(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                boolean a = this.mRecyclingAction.mo4477a();
                this.mRecyclingAction.mo4476a(recyclerView);
                if (!a) {
                    return;
                }
                if (this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.mo4487a();
                    return;
                }
                stop();
            }
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        /* access modifiers changed from: protected */
        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        /* access modifiers changed from: protected */
        public void normalize(PointF pointF) {
            float sqrt = (float) Math.sqrt((double) ((pointF.x * pointF.x) + (pointF.y * pointF.y)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$s */
    public static class C0898s {

        /* renamed from: a */
        int f2809a = -1;

        /* renamed from: b */
        int f2810b = 0;

        /* renamed from: c */
        int f2811c = 0;

        /* renamed from: d */
        int f2812d = 1;

        /* renamed from: e */
        int f2813e = 0;

        /* renamed from: f */
        boolean f2814f = false;

        /* renamed from: g */
        boolean f2815g = false;

        /* renamed from: h */
        boolean f2816h = false;

        /* renamed from: i */
        boolean f2817i = false;

        /* renamed from: j */
        boolean f2818j = false;

        /* renamed from: k */
        boolean f2819k = false;

        /* renamed from: l */
        int f2820l;

        /* renamed from: m */
        long f2821m;

        /* renamed from: n */
        int f2822n;

        /* renamed from: o */
        int f2823o;

        /* renamed from: p */
        int f2824p;

        /* renamed from: q */
        private SparseArray<Object> f2825q;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4478a(int i) {
            if ((this.f2812d & i) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.f2812d));
                throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4479a(C0870a aVar) {
            this.f2812d = 1;
            this.f2813e = aVar.getItemCount();
            this.f2815g = false;
            this.f2816h = false;
            this.f2817i = false;
        }

        /* renamed from: a */
        public boolean mo4480a() {
            return this.f2815g;
        }

        /* renamed from: b */
        public boolean mo4481b() {
            return this.f2819k;
        }

        /* renamed from: c */
        public int mo4482c() {
            return this.f2809a;
        }

        /* renamed from: d */
        public boolean mo4483d() {
            return this.f2809a != -1;
        }

        /* renamed from: e */
        public int mo4484e() {
            return this.f2815g ? this.f2810b - this.f2811c : this.f2813e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State{mTargetPosition=");
            sb.append(this.f2809a);
            sb.append(", mData=");
            sb.append(this.f2825q);
            sb.append(", mItemCount=");
            sb.append(this.f2813e);
            sb.append(", mIsMeasuring=");
            sb.append(this.f2817i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f2810b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f2811c);
            sb.append(", mStructureChanged=");
            sb.append(this.f2814f);
            sb.append(", mInPreLayout=");
            sb.append(this.f2815g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f2818j);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.f2819k);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$t */
    public static abstract class C0899t {
        /* renamed from: a */
        public abstract View mo4486a(C0892o oVar, int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$u */
    class C0900u implements Runnable {

        /* renamed from: a */
        OverScroller f2826a;

        /* renamed from: b */
        Interpolator f2827b = RecyclerView.sQuinticInterpolator;

        /* renamed from: d */
        private int f2829d;

        /* renamed from: e */
        private int f2830e;

        /* renamed from: f */
        private boolean f2831f = false;

        /* renamed from: g */
        private boolean f2832g = false;

        C0900u() {
            this.f2826a = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f3, code lost:
            if (r8 > 0) goto L_0x00f7;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ef  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r23 = this;
                r0 = r23
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r1 = r1.mLayout
                if (r1 != 0) goto L_0x000c
                r23.mo4493b()
                return
            L_0x000c:
                r23.m3884c()
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                r1.consumePendingUpdateOperations()
                android.widget.OverScroller r1 = r0.f2826a
                android.support.v7.widget.RecyclerView r2 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r2 = r2.mLayout
                android.support.v7.widget.RecyclerView$r r2 = r2.mSmoothScroller
                boolean r3 = r1.computeScrollOffset()
                r4 = 0
                if (r3 == 0) goto L_0x0199
                android.support.v7.widget.RecyclerView r3 = android.support.p028v7.widget.RecyclerView.this
                int[] r3 = r3.mScrollConsumed
                int r11 = r1.getCurrX()
                int r12 = r1.getCurrY()
                int r5 = r0.f2829d
                int r13 = r11 - r5
                int r5 = r0.f2830e
                int r14 = r12 - r5
                r0.f2829d = r11
                r0.f2830e = r12
                android.support.v7.widget.RecyclerView r5 = android.support.p028v7.widget.RecyclerView.this
                r9 = 0
                r10 = 1
                r6 = r13
                r7 = r14
                r8 = r3
                boolean r5 = r5.dispatchNestedPreScroll(r6, r7, r8, r9, r10)
                r6 = 1
                if (r5 == 0) goto L_0x004f
                r5 = r3[r4]
                int r13 = r13 - r5
                r3 = r3[r6]
                int r14 = r14 - r3
            L_0x004f:
                android.support.v7.widget.RecyclerView r3 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r3 = r3.mAdapter
                if (r3 == 0) goto L_0x00a4
                android.support.v7.widget.RecyclerView r3 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView r5 = android.support.p028v7.widget.RecyclerView.this
                int[] r5 = r5.mScrollStepConsumed
                r3.scrollStep(r13, r14, r5)
                android.support.v7.widget.RecyclerView r3 = android.support.p028v7.widget.RecyclerView.this
                int[] r3 = r3.mScrollStepConsumed
                r3 = r3[r4]
                android.support.v7.widget.RecyclerView r5 = android.support.p028v7.widget.RecyclerView.this
                int[] r5 = r5.mScrollStepConsumed
                r5 = r5[r6]
                int r7 = r13 - r3
                int r8 = r14 - r5
                if (r2 == 0) goto L_0x00a8
                boolean r9 = r2.isPendingInitialRun()
                if (r9 != 0) goto L_0x00a8
                boolean r9 = r2.isRunning()
                if (r9 == 0) goto L_0x00a8
                android.support.v7.widget.RecyclerView r9 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r9 = r9.mState
                int r9 = r9.mo4484e()
                if (r9 != 0) goto L_0x008a
                r2.stop()
                goto L_0x00a8
            L_0x008a:
                int r10 = r2.getTargetPosition()
                if (r10 < r9) goto L_0x009c
                int r9 = r9 - r6
                r2.setTargetPosition(r9)
                int r9 = r13 - r7
                int r10 = r14 - r8
                r2.onAnimation(r9, r10)
                goto L_0x00a8
            L_0x009c:
                int r9 = r13 - r7
                int r10 = r14 - r8
                r2.onAnimation(r9, r10)
                goto L_0x00a8
            L_0x00a4:
                r3 = r4
                r5 = r3
                r7 = r5
                r8 = r7
            L_0x00a8:
                android.support.v7.widget.RecyclerView r9 = android.support.p028v7.widget.RecyclerView.this
                java.util.ArrayList<android.support.v7.widget.RecyclerView$h> r9 = r9.mItemDecorations
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L_0x00b7
                android.support.v7.widget.RecyclerView r9 = android.support.p028v7.widget.RecyclerView.this
                r9.invalidate()
            L_0x00b7:
                android.support.v7.widget.RecyclerView r9 = android.support.p028v7.widget.RecyclerView.this
                int r9 = r9.getOverScrollMode()
                r10 = 2
                if (r9 == r10) goto L_0x00c5
                android.support.v7.widget.RecyclerView r9 = android.support.p028v7.widget.RecyclerView.this
                r9.considerReleasingGlowsOnScroll(r13, r14)
            L_0x00c5:
                android.support.v7.widget.RecyclerView r15 = android.support.p028v7.widget.RecyclerView.this
                r20 = 0
                r21 = 1
                r16 = r3
                r17 = r5
                r18 = r7
                r19 = r8
                boolean r9 = r15.dispatchNestedScroll(r16, r17, r18, r19, r20, r21)
                if (r9 != 0) goto L_0x011b
                if (r7 != 0) goto L_0x00dd
                if (r8 == 0) goto L_0x011b
            L_0x00dd:
                float r9 = r1.getCurrVelocity()
                int r9 = (int) r9
                if (r7 == r11) goto L_0x00ec
                if (r7 >= 0) goto L_0x00e8
                int r15 = -r9
                goto L_0x00ed
            L_0x00e8:
                if (r7 <= 0) goto L_0x00ec
                r15 = r9
                goto L_0x00ed
            L_0x00ec:
                r15 = r4
            L_0x00ed:
                if (r8 == r12) goto L_0x00f6
                if (r8 >= 0) goto L_0x00f3
                int r9 = -r9
                goto L_0x00f7
            L_0x00f3:
                if (r8 <= 0) goto L_0x00f6
                goto L_0x00f7
            L_0x00f6:
                r9 = r4
            L_0x00f7:
                android.support.v7.widget.RecyclerView r4 = android.support.p028v7.widget.RecyclerView.this
                int r4 = r4.getOverScrollMode()
                if (r4 == r10) goto L_0x0104
                android.support.v7.widget.RecyclerView r4 = android.support.p028v7.widget.RecyclerView.this
                r4.absorbGlows(r15, r9)
            L_0x0104:
                if (r15 != 0) goto L_0x010e
                if (r7 == r11) goto L_0x010e
                int r4 = r1.getFinalX()
                if (r4 != 0) goto L_0x011b
            L_0x010e:
                if (r9 != 0) goto L_0x0118
                if (r8 == r12) goto L_0x0118
                int r4 = r1.getFinalY()
                if (r4 != 0) goto L_0x011b
            L_0x0118:
                r1.abortAnimation()
            L_0x011b:
                if (r3 != 0) goto L_0x011f
                if (r5 == 0) goto L_0x0124
            L_0x011f:
                android.support.v7.widget.RecyclerView r4 = android.support.p028v7.widget.RecyclerView.this
                r4.dispatchOnScrolled(r3, r5)
            L_0x0124:
                android.support.v7.widget.RecyclerView r4 = android.support.p028v7.widget.RecyclerView.this
                boolean r4 = r4.awakenScrollBars()
                if (r4 != 0) goto L_0x0131
                android.support.v7.widget.RecyclerView r4 = android.support.p028v7.widget.RecyclerView.this
                r4.invalidate()
            L_0x0131:
                if (r14 == 0) goto L_0x0141
                android.support.v7.widget.RecyclerView r4 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r4 = r4.mLayout
                boolean r4 = r4.canScrollVertically()
                if (r4 == 0) goto L_0x0141
                if (r5 != r14) goto L_0x0141
                r4 = r6
                goto L_0x0142
            L_0x0141:
                r4 = 0
            L_0x0142:
                if (r13 == 0) goto L_0x0152
                android.support.v7.widget.RecyclerView r5 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r5 = r5.mLayout
                boolean r5 = r5.canScrollHorizontally()
                if (r5 == 0) goto L_0x0152
                if (r3 != r13) goto L_0x0152
                r3 = r6
                goto L_0x0153
            L_0x0152:
                r3 = 0
            L_0x0153:
                if (r13 != 0) goto L_0x0157
                if (r14 == 0) goto L_0x015e
            L_0x0157:
                if (r3 != 0) goto L_0x015e
                if (r4 == 0) goto L_0x015c
                goto L_0x015e
            L_0x015c:
                r3 = 0
                goto L_0x015f
            L_0x015e:
                r3 = r6
            L_0x015f:
                boolean r1 = r1.isFinished()
                if (r1 != 0) goto L_0x0183
                if (r3 != 0) goto L_0x0170
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                boolean r1 = r1.hasNestedScrollingParent(r6)
                if (r1 != 0) goto L_0x0170
                goto L_0x0183
            L_0x0170:
                r23.mo4487a()
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.ab r1 = r1.mGapWorker
                if (r1 == 0) goto L_0x0199
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.ab r1 = r1.mGapWorker
                android.support.v7.widget.RecyclerView r3 = android.support.p028v7.widget.RecyclerView.this
                r1.mo4871a(r3, r13, r14)
                goto L_0x0199
            L_0x0183:
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                r3 = 0
                r1.setScrollState(r3)
                boolean r1 = android.support.p028v7.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r1 == 0) goto L_0x0194
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                android.support.v7.widget.ab$a r1 = r1.mPrefetchRegistry
                r1.mo4876a()
            L_0x0194:
                android.support.v7.widget.RecyclerView r1 = android.support.p028v7.widget.RecyclerView.this
                r1.stopNestedScroll(r6)
            L_0x0199:
                if (r2 == 0) goto L_0x01ac
                boolean r1 = r2.isPendingInitialRun()
                if (r1 == 0) goto L_0x01a5
                r1 = 0
                r2.onAnimation(r1, r1)
            L_0x01a5:
                boolean r1 = r0.f2832g
                if (r1 != 0) goto L_0x01ac
                r2.stop()
            L_0x01ac:
                r23.m3885d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.RecyclerView.C0900u.run():void");
        }

        /* renamed from: c */
        private void m3884c() {
            this.f2832g = false;
            this.f2831f = true;
        }

        /* renamed from: d */
        private void m3885d() {
            this.f2831f = false;
            if (this.f2832g) {
                mo4487a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4487a() {
            if (this.f2831f) {
                this.f2832g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            C0595r.m2242a((View) RecyclerView.this, (Runnable) this);
        }

        /* renamed from: a */
        public void mo4488a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f2830e = 0;
            this.f2829d = 0;
            this.f2826a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4487a();
        }

        /* renamed from: b */
        public void mo4494b(int i, int i2) {
            mo4490a(i, i2, 0, 0);
        }

        /* renamed from: a */
        public void mo4490a(int i, int i2, int i3, int i4) {
            mo4489a(i, i2, m3883b(i, i2, i3, i4));
        }

        /* renamed from: a */
        private float m3882a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: b */
        private int m3883b(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int width = z ? RecyclerView.this.getWidth() : RecyclerView.this.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float a = f2 + (m3882a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = 4 * Math.round(1000.0f * Math.abs(a / ((float) sqrt)));
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: a */
        public void mo4489a(int i, int i2, int i3) {
            mo4491a(i, i2, i3, RecyclerView.sQuinticInterpolator);
        }

        /* renamed from: a */
        public void mo4492a(int i, int i2, Interpolator interpolator) {
            int b = m3883b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            mo4491a(i, i2, b, interpolator);
        }

        /* renamed from: a */
        public void mo4491a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f2827b != interpolator) {
                this.f2827b = interpolator;
                this.f2826a = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f2830e = 0;
            this.f2829d = 0;
            this.f2826a.startScroll(0, 0, i, i2, i3);
            if (VERSION.SDK_INT < 23) {
                this.f2826a.computeScrollOffset();
            }
            mo4487a();
        }

        /* renamed from: b */
        public void mo4493b() {
            RecyclerView.this.removeCallbacks(this);
            this.f2826a.abortAnimation();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$v */
    public static abstract class C0901v {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_SET_A11Y_ITEM_DELEGATE = 16384;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        C0892o mScrapContainer = null;
        C0901v mShadowedHolder = null;
        C0901v mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public C0901v(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        /* access modifiers changed from: 0000 */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        /* access modifiers changed from: 0000 */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f2766e = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: 0000 */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        @Deprecated
        public final int getPosition() {
            return this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
        }

        public final int getLayoutPosition() {
            return this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
        }

        public final int getAdapterPosition() {
            if (this.mOwnerRecyclerView == null) {
                return -1;
            }
            return this.mOwnerRecyclerView.getAdapterPositionFor(this);
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        /* access modifiers changed from: 0000 */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: 0000 */
        public void unScrap() {
            this.mScrapContainer.mo4440c(this);
        }

        /* access modifiers changed from: 0000 */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        /* access modifiers changed from: 0000 */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: 0000 */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: 0000 */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        /* access modifiers changed from: 0000 */
        public void setScrapContainer(C0892o oVar, boolean z) {
            this.mScrapContainer = oVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: 0000 */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        /* access modifiers changed from: 0000 */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (i2 ^ -1));
        }

        /* access modifiers changed from: 0000 */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: 0000 */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                this.mPayloads = new ArrayList();
                this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
            }
        }

        /* access modifiers changed from: 0000 */
        public void clearPayload() {
            if (this.mPayloads != null) {
                this.mPayloads.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: 0000 */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            if (this.mPayloads == null || this.mPayloads.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: 0000 */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: 0000 */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            if (this.mPendingAccessibilityState != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = this.mPendingAccessibilityState;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C0595r.m2254e(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* access modifiers changed from: 0000 */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewHolder{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.mPosition);
            sb.append(" id=");
            sb.append(this.mItemId);
            sb.append(", oldPos=");
            sb.append(this.mOldPosition);
            sb.append(", pLpos:");
            sb.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" not recyclable(");
                sb3.append(this.mIsRecyclableCount);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public final void setIsRecyclable(boolean z) {
            this.mIsRecyclableCount = z ? this.mIsRecyclableCount - 1 : this.mIsRecyclableCount + 1;
            if (this.mIsRecyclableCount < 0) {
                this.mIsRecyclableCount = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
            } else if (!z && this.mIsRecyclableCount == 1) {
                this.mFlags |= 16;
            } else if (z && this.mIsRecyclableCount == 0) {
                this.mFlags &= -17;
            }
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C0595r.m2251c(this.itemView);
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C0595r.m2251c(this.itemView);
        }

        /* access modifiers changed from: 0000 */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C0894q();
        this.mRecycler = new C0892o();
        this.mViewInfoStore = new C0991bf();
        this.mUpdateChildViewsRunnable = new Runnable() {
            public void run() {
                if (RecyclerView.this.mFirstLayoutComplete && !RecyclerView.this.isLayoutRequested()) {
                    if (!RecyclerView.this.mIsAttached) {
                        RecyclerView.this.requestLayout();
                    } else if (RecyclerView.this.mLayoutFrozen) {
                        RecyclerView.this.mLayoutWasDefered = true;
                    } else {
                        RecyclerView.this.consumePendingUpdateOperations();
                    }
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C0874e();
        this.mItemAnimator = new C1032v();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C0900u();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C0939a() : null;
        this.mState = new C0898s();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0879g();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mNestedOffsets = new int[2];
        this.mScrollStepConsumed = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable() {
            public void run() {
                if (RecyclerView.this.mItemAnimator != null) {
                    RecyclerView.this.mItemAnimator.mo4249a();
                }
                RecyclerView.this.mPostedAnimatorRunner = false;
            }
        };
        this.mViewInfoProcessCallback = new C0993b() {
            /* renamed from: a */
            public void mo4169a(C0901v vVar, C0878c cVar, C0878c cVar2) {
                RecyclerView.this.mRecycler.mo4440c(vVar);
                RecyclerView.this.animateDisappearance(vVar, cVar, cVar2);
            }

            /* renamed from: b */
            public void mo4170b(C0901v vVar, C0878c cVar, C0878c cVar2) {
                RecyclerView.this.animateAppearance(vVar, cVar, cVar2);
            }

            /* renamed from: c */
            public void mo4171c(C0901v vVar, C0878c cVar, C0878c cVar2) {
                vVar.setIsRecyclable(false);
                if (RecyclerView.this.mDataSetHasChangedAfterLayout) {
                    if (RecyclerView.this.mItemAnimator.mo4252a(vVar, vVar, cVar, cVar2)) {
                        RecyclerView.this.postAnimationRunner();
                    }
                } else if (RecyclerView.this.mItemAnimator.mo4256c(vVar, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            }

            /* renamed from: a */
            public void mo4168a(C0901v vVar) {
                RecyclerView.this.mLayout.removeAndRecycleView(vVar.itemView, RecyclerView.this.mRecycler);
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CLIP_TO_PADDING_ATTR, i, 0);
            this.mClipToPadding = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.mClipToPadding = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C0599s.m2286a(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C0599s.m2288b(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.mo4250a(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C0595r.m2254e(this) == 0) {
            C0595r.m2247b((View) this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0953aj(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0759b.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(C0759b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C0759b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.mEnableFastScroller = obtainStyledAttributes2.getBoolean(C0759b.RecyclerView_fastScrollEnabled, false);
            if (this.mEnableFastScroller) {
                initFastScroller((StateListDrawable) obtainStyledAttributes2.getDrawable(C0759b.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(C0759b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(C0759b.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(C0759b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            createLayoutManager(context, string, attributeSet, i, 0);
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i, 0);
                boolean z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z2;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    /* access modifiers changed from: 0000 */
    public String exceptionLabel() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.mAdapter);
        sb.append(", layout:");
        sb.append(this.mLayout);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C0595r.m2229a(this) == 0) {
            C0595r.m2233a((View) this, 8);
        }
    }

    public C0953aj getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(C0953aj ajVar) {
        this.mAccessibilityDelegate = ajVar;
        C0595r.m2240a((View) this, (C0561a) this.mAccessibilityDelegate);
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = classLoader.loadClass(fullClassName).asSubclass(C0881i.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0881i) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(fullClassName);
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(fullClassName);
                    throw new IllegalStateException(sb2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(": Could not instantiate the LayoutManager: ");
                    sb3.append(fullClassName);
                    throw new IllegalStateException(sb3.toString(), e4);
                } catch (InstantiationException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(": Could not instantiate the LayoutManager: ");
                    sb4.append(fullClassName);
                    throw new IllegalStateException(sb4.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(fullClassName);
                    throw new IllegalStateException(sb5.toString(), e6);
                } catch (ClassCastException e7) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(fullClassName);
                    throw new IllegalStateException(sb6.toString(), e7);
                }
            }
        }
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(".")) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1027s(new C1029b() {
            /* renamed from: a */
            public int mo4172a() {
                return RecyclerView.this.getChildCount();
            }

            /* renamed from: a */
            public void mo4175a(View view, int i) {
                RecyclerView.this.addView(view, i);
                RecyclerView.this.dispatchChildAttached(view);
            }

            /* renamed from: a */
            public int mo4173a(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            /* renamed from: a */
            public void mo4174a(int i) {
                View childAt = RecyclerView.this.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i);
            }

            /* renamed from: b */
            public View mo4178b(int i) {
                return RecyclerView.this.getChildAt(i);
            }

            /* renamed from: b */
            public void mo4179b() {
                int a = mo4172a();
                for (int i = 0; i < a; i++) {
                    View b = mo4178b(i);
                    RecyclerView.this.dispatchChildDetached(b);
                    b.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            /* renamed from: b */
            public C0901v mo4177b(View view) {
                return RecyclerView.getChildViewHolderInt(view);
            }

            /* renamed from: a */
            public void mo4176a(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
                C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                        childViewHolderInt.clearTmpDetachFlag();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Called attach on a child which is not detached: ");
                        sb.append(childViewHolderInt);
                        sb.append(RecyclerView.this.exceptionLabel());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                RecyclerView.this.attachViewToParent(view, i, layoutParams);
            }

            /* renamed from: c */
            public void mo4180c(int i) {
                View b = mo4178b(i);
                if (b != null) {
                    C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(b);
                    if (childViewHolderInt != null) {
                        if (!childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                            childViewHolderInt.addFlags(256);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("called detach on an already detached child ");
                            sb.append(childViewHolderInt);
                            sb.append(RecyclerView.this.exceptionLabel());
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                RecyclerView.this.detachViewFromParent(i);
            }

            /* renamed from: c */
            public void mo4181c(View view) {
                C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
                }
            }

            /* renamed from: d */
            public void mo4182d(View view) {
                C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(RecyclerView.this);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void initAdapterManager() {
        this.mAdapterHelper = new C1002d(new C1003a() {
            /* renamed from: a */
            public C0901v mo4183a(int i) {
                C0901v findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
                if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.mo5316c(findViewHolderForPosition.itemView)) {
                    return findViewHolderForPosition;
                }
                return null;
            }

            /* renamed from: a */
            public void mo4184a(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
                RecyclerView.this.mItemsAddedOrRemoved = true;
                RecyclerView.this.mState.f2811c += i2;
            }

            /* renamed from: b */
            public void mo4187b(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            /* renamed from: a */
            public void mo4185a(int i, int i2, Object obj) {
                RecyclerView.this.viewRangeUpdate(i, i2, obj);
                RecyclerView.this.mItemsChanged = true;
            }

            /* renamed from: a */
            public void mo4186a(C1004b bVar) {
                mo4190c(bVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public void mo4190c(C1004b bVar) {
                int i = bVar.f3318a;
                if (i == 4) {
                    RecyclerView.this.mLayout.onItemsUpdated(RecyclerView.this, bVar.f3319b, bVar.f3321d, bVar.f3320c);
                } else if (i != 8) {
                    switch (i) {
                        case 1:
                            RecyclerView.this.mLayout.onItemsAdded(RecyclerView.this, bVar.f3319b, bVar.f3321d);
                            return;
                        case 2:
                            RecyclerView.this.mLayout.onItemsRemoved(RecyclerView.this, bVar.f3319b, bVar.f3321d);
                            return;
                        default:
                            return;
                    }
                } else {
                    RecyclerView.this.mLayout.onItemsMoved(RecyclerView.this, bVar.f3319b, bVar.f3321d, 1);
                }
            }

            /* renamed from: b */
            public void mo4188b(C1004b bVar) {
                mo4190c(bVar);
            }

            /* renamed from: c */
            public void mo4189c(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            /* renamed from: d */
            public void mo4191d(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForMove(i, i2);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        });
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w(str, sb.toString());
                break;
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void swapAdapter(C0870a aVar, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(aVar, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void setAdapter(C0870a aVar) {
        setLayoutFrozen(false);
        setAdapterInternal(aVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void removeAndRecycleViews() {
        if (this.mItemAnimator != null) {
            this.mItemAnimator.mo4257d();
        }
        if (this.mLayout != null) {
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.mo4421a();
    }

    private void setAdapterInternal(C0870a aVar, boolean z, boolean z2) {
        if (this.mAdapter != null) {
            this.mAdapter.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.mo5202a();
        C0870a aVar2 = this.mAdapter;
        this.mAdapter = aVar;
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.mObserver);
            aVar.onAttachedToRecyclerView(this);
        }
        if (this.mLayout != null) {
            this.mLayout.onAdapterChanged(aVar2, this.mAdapter);
        }
        this.mRecycler.mo4425a(aVar2, this.mAdapter, z);
        this.mState.f2814f = true;
    }

    public C0870a getAdapter() {
        return this.mAdapter;
    }

    public void setRecyclerListener(C0893p pVar) {
        this.mRecyclerListener = pVar;
    }

    public int getBaseline() {
        if (this.mLayout != null) {
            return this.mLayout.getBaseline();
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(C0886j jVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(jVar);
    }

    public void removeOnChildAttachStateChangeListener(C0886j jVar) {
        if (this.mOnChildAttachStateListeners != null) {
            this.mOnChildAttachStateListeners.remove(jVar);
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        if (this.mOnChildAttachStateListeners != null) {
            this.mOnChildAttachStateListeners.clear();
        }
    }

    public void setLayoutManager(C0881i iVar) {
        if (iVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                if (this.mItemAnimator != null) {
                    this.mItemAnimator.mo4257d();
                }
                this.mLayout.removeAndRecycleAllViews(this.mRecycler);
                this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
                this.mRecycler.mo4421a();
                if (this.mIsAttached) {
                    this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
                }
                this.mLayout.setRecyclerView(null);
                this.mLayout = null;
            } else {
                this.mRecycler.mo4421a();
            }
            this.mChildHelper.mo5305a();
            this.mLayout = iVar;
            if (iVar != null) {
                if (iVar.mRecyclerView != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(iVar);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(iVar.mRecyclerView.exceptionLabel());
                    throw new IllegalArgumentException(sb.toString());
                }
                this.mLayout.setRecyclerView(this);
                if (this.mIsAttached) {
                    this.mLayout.dispatchAttachedToWindow(this);
                }
            }
            this.mRecycler.mo4433b();
            requestLayout();
        }
    }

    public void setOnFlingListener(C0887k kVar) {
        this.mOnFlingListener = kVar;
    }

    public C0887k getOnFlingListener() {
        return this.mOnFlingListener;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.mPendingSavedState != null) {
            savedState.mo4196a(this.mPendingSavedState);
        } else if (this.mLayout != null) {
            savedState.f2768a = this.mLayout.onSaveInstanceState();
        } else {
            savedState.f2768a = null;
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.mPendingSavedState = (SavedState) parcelable;
        super.onRestoreInstanceState(this.mPendingSavedState.mo1845a());
        if (!(this.mLayout == null || this.mPendingSavedState.f2768a == null)) {
            this.mLayout.onRestoreInstanceState(this.mPendingSavedState.f2768a);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void addAnimatingView(C0901v vVar) {
        View view = vVar.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.mo4440c(getChildViewHolder(view));
        if (vVar.isTmpDetached()) {
            this.mChildHelper.mo5308a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.mo5310a(view, true);
        } else {
            this.mChildHelper.mo5318d(view);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean f = this.mChildHelper.mo5321f(view);
        if (f) {
            C0901v childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.mo4440c(childViewHolderInt);
            this.mRecycler.mo4435b(childViewHolderInt);
        }
        stopInterceptRequestLayout(!f);
        return f;
    }

    public C0881i getLayoutManager() {
        return this.mLayout;
    }

    public C0890n getRecycledViewPool() {
        return this.mRecycler.mo4449g();
    }

    public void setRecycledViewPool(C0890n nVar) {
        this.mRecycler.mo4426a(nVar);
    }

    public void setViewCacheExtension(C0899t tVar) {
        this.mRecycler.mo4427a(tVar);
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.mo4422a(i);
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void addItemDecoration(C0880h hVar, int i) {
        if (this.mLayout != null) {
            this.mLayout.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(hVar);
        } else {
            this.mItemDecorations.add(i, hVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(C0880h hVar) {
        addItemDecoration(hVar, -1);
    }

    public C0880h getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (C0880h) this.mItemDecorations.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is an invalid index for size ");
        sb.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is an invalid index for size ");
            sb.append(itemDecorationCount);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeItemDecoration(C0880h hVar) {
        if (this.mLayout != null) {
            this.mLayout.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(hVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0873d dVar) {
        if (dVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = dVar;
            setChildrenDrawingOrderEnabled(this.mChildDrawingOrderCallback != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(C0889m mVar) {
        this.mScrollListener = mVar;
    }

    public void addOnScrollListener(C0889m mVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(mVar);
    }

    public void removeOnScrollListener(C0889m mVar) {
        if (this.mScrollListeners != null) {
            this.mScrollListeners.remove(mVar);
        }
    }

    public void clearOnScrollListeners() {
        if (this.mScrollListeners != null) {
            this.mScrollListeners.clear();
        }
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutFrozen) {
            stopScroll();
            if (this.mLayout == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            this.mLayout.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: 0000 */
    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            this.mLayout.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutFrozen) {
            if (this.mLayout == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                this.mLayout.smoothScrollToPosition(this, this.mState, i);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int i, int i2) {
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutFrozen) {
            boolean canScrollHorizontally = this.mLayout.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (canScrollHorizontally || canScrollVertically) {
                if (!canScrollHorizontally) {
                    i = 0;
                }
                if (!canScrollVertically) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0541d.m2067a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        C0541d.m2066a();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    /* access modifiers changed from: 0000 */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C0541d.m2067a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C0541d.m2066a();
        } else if (this.mAdapterHelper.mo5214d()) {
            if (this.mAdapterHelper.mo5205a(4) && !this.mAdapterHelper.mo5205a(11)) {
                C0541d.m2067a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.mo5209b();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.mo5212c();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                C0541d.m2066a();
            } else if (this.mAdapterHelper.mo5214d()) {
                C0541d.m2067a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                C0541d.m2066a();
            }
        }
    }

    private boolean hasUpdatedView() {
        int b = this.mChildHelper.mo5311b();
        for (int i = 0; i < b; i++) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5313b(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            scrollStep(i7, i8, this.mScrollStepConsumed);
            int i9 = this.mScrollStepConsumed[0];
            int i10 = this.mScrollStepConsumed[1];
            i5 = i9;
            i4 = i10;
            i3 = i7 - i9;
            i6 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int i11 = i6;
        if (dispatchNestedScroll(i5, i4, i3, i6, this.mScrollOffset, 0)) {
            this.mLastTouchX -= this.mScrollOffset[0];
            this.mLastTouchY -= this.mScrollOffset[1];
            if (motionEvent2 != null) {
                motionEvent2.offsetLocation((float) this.mScrollOffset[0], (float) this.mScrollOffset[1]);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[0] = iArr[0] + this.mScrollOffset[0];
            int[] iArr2 = this.mNestedOffsets;
            iArr2[1] = iArr2[1] + this.mScrollOffset[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C0585h.m2199a(motionEvent2, 8194)) {
                pullGlows(motionEvent.getX(), (float) i3, motionEvent.getY(), (float) i11);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (!(i5 == 0 && i4 == 0)) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i5 == 0 && i4 == 0) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollOffset() {
        int i = 0;
        if (this.mLayout == null) {
            return 0;
        }
        if (this.mLayout.canScrollHorizontally()) {
            i = this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return i;
    }

    public int computeHorizontalScrollExtent() {
        int i = 0;
        if (this.mLayout == null) {
            return 0;
        }
        if (this.mLayout.canScrollHorizontally()) {
            i = this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return i;
    }

    public int computeHorizontalScrollRange() {
        int i = 0;
        if (this.mLayout == null) {
            return 0;
        }
        if (this.mLayout.canScrollHorizontally()) {
            i = this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollOffset() {
        int i = 0;
        if (this.mLayout == null) {
            return 0;
        }
        if (this.mLayout.canScrollVertically()) {
            i = this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollExtent() {
        int i = 0;
        if (this.mLayout == null) {
            return 0;
        }
        if (this.mLayout.canScrollVertically()) {
            i = this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollRange() {
        int i = 0;
        if (this.mLayout == null) {
            return 0;
        }
        if (this.mLayout.canScrollVertically()) {
            i = this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public void startInterceptRequestLayout() {
        this.mInterceptRequestLayoutDepth++;
        if (this.mInterceptRequestLayoutDepth == 1 && !this.mLayoutFrozen) {
            this.mLayoutWasDefered = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutFrozen) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutFrozen && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutFrozen) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.mLayoutFrozen) {
            assertNotInLayoutOrScroll("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.mLayoutFrozen = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutFrozen = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public boolean isLayoutFrozen() {
        return this.mLayoutFrozen;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutFrozen) {
            if (!this.mLayout.canScrollHorizontally()) {
                i = 0;
            }
            if (!this.mLayout.canScrollVertically()) {
                i2 = 0;
            }
            if (!(i == 0 && i2 == 0)) {
                this.mViewFlinger.mo4492a(i, i2, interpolator);
            }
        }
    }

    public boolean fling(int i, int i2) {
        int i3 = 0;
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutFrozen) {
            return false;
        } else {
            boolean canScrollHorizontally = this.mLayout.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (!canScrollHorizontally || Math.abs(i) < this.mMinFlingVelocity) {
                i = 0;
            }
            if (!canScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = canScrollHorizontally || canScrollVertically;
                dispatchNestedFling(f, f2, z);
                if (this.mOnFlingListener != null && this.mOnFlingListener.mo4401a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (canScrollHorizontally) {
                        i3 = 1;
                    }
                    if (canScrollVertically) {
                        i3 |= 2;
                    }
                    startNestedScroll(i3, 1);
                    this.mViewFlinger.mo4488a(Math.max(-this.mMaxFlingVelocity, Math.min(i, this.mMaxFlingVelocity)), Math.max(-this.mMaxFlingVelocity, Math.min(i2, this.mMaxFlingVelocity)));
                    return true;
                }
            }
            return false;
        }
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.mo4493b();
        if (this.mLayout != null) {
            this.mLayout.stopSmoothScroller();
        }
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            android.support.p017v4.widget.C0654i.m2595a(r1, r4, r9)
        L_0x001f:
            r9 = r3
            goto L_0x003c
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            android.support.p017v4.widget.C0654i.m2595a(r1, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            android.support.p017v4.widget.C0654i.m2595a(r9, r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            android.support.p017v4.widget.C0654i.m2595a(r9, r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            android.support.p017v4.view.C0595r.m2252d(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void releaseGlows() {
        boolean z;
        if (this.mLeftGlow != null) {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        if (this.mTopGlow != null) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        if (this.mRightGlow != null) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        if (this.mBottomGlow != null) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0595r.m2252d(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        if (this.mLeftGlow == null || this.mLeftGlow.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        if (this.mRightGlow != null && !this.mRightGlow.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        if (this.mTopGlow != null && !this.mTopGlow.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        if (this.mBottomGlow != null && !this.mBottomGlow.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0595r.m2252d(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            this.mLeftGlow.onAbsorb(-i);
        } else if (i > 0) {
            ensureRightGlow();
            this.mRightGlow.onAbsorb(i);
        }
        if (i2 < 0) {
            ensureTopGlow();
            this.mTopGlow.onAbsorb(-i2);
        } else if (i2 > 0) {
            ensureBottomGlow();
            this.mBottomGlow.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C0595r.m2252d(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            this.mLeftGlow = this.mEdgeEffectFactory.mo4246a(this, 0);
            if (this.mClipToPadding) {
                this.mLeftGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.mLeftGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            this.mRightGlow = this.mEdgeEffectFactory.mo4246a(this, 2);
            if (this.mClipToPadding) {
                this.mRightGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.mRightGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            this.mTopGlow = this.mEdgeEffectFactory.mo4246a(this, 1);
            if (this.mClipToPadding) {
                this.mTopGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.mTopGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            this.mBottomGlow = this.mEdgeEffectFactory.mo4246a(this, 3);
            if (this.mClipToPadding) {
                this.mBottomGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.mBottomGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void setEdgeEffectFactory(C0874e eVar) {
        C0397l.m1469a(eVar);
        this.mEdgeEffectFactory = eVar;
        invalidateGlows();
    }

    public C0874e getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z2 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutFrozen;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z2 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? TsExtractor.TS_STREAM_TYPE_HDMV_DTS : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                z = instance.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!isPreferredNextFocus(view, view2, i)) {
                view2 = super.focusSearch(view, i);
            }
            return view2;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        boolean z = false;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        int i2 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        int i3 = ((this.mTempRect.left < this.mTempRect2.left || this.mTempRect.right <= this.mTempRect2.left) && this.mTempRect.right < this.mTempRect2.right) ? 1 : ((this.mTempRect.right > this.mTempRect2.right || this.mTempRect.left >= this.mTempRect2.right) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        if ((this.mTempRect.top < this.mTempRect2.top || this.mTempRect.bottom <= this.mTempRect2.top) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c = 1;
        } else if ((this.mTempRect.bottom <= this.mTempRect2.bottom && this.mTempRect.top < this.mTempRect2.bottom) || this.mTempRect.top <= this.mTempRect2.top) {
            c = 0;
        }
        if (i == 17) {
            if (i3 < 0) {
                z = true;
            }
            return z;
        } else if (i == 33) {
            if (c < 0) {
                z = true;
            }
            return z;
        } else if (i == 66) {
            if (i3 > 0) {
                z = true;
            }
            return z;
        } else if (i != 130) {
            switch (i) {
                case 1:
                    if (c < 0 || (c == 0 && i3 * i2 <= 0)) {
                        z = true;
                    }
                    return z;
                case 2:
                    if (c > 0 || (c == 0 && i3 * i2 >= 0)) {
                        z = true;
                    }
                    return z;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid direction: ");
                    sb.append(i);
                    sb.append(exceptionLabel());
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            if (c > 0) {
                z = true;
            }
            return z;
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f2766e) {
                Rect rect = layoutParams2.f2765d;
                this.mTempRect.left -= rect.left;
                this.mTempRect.right += rect.right;
                this.mTempRect.top -= rect.top;
                this.mTempRect.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (this.mLayout == null || !this.mLayout.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r0 >= 30.0f) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.mLayoutOrScrollCounter = r0
            r1 = 1
            r4.mIsAttached = r1
            boolean r2 = r4.mFirstLayoutComplete
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r4.mFirstLayoutComplete = r1
            android.support.v7.widget.RecyclerView$i r1 = r4.mLayout
            if (r1 == 0) goto L_0x0020
            android.support.v7.widget.RecyclerView$i r1 = r4.mLayout
            r1.dispatchAttachedToWindow(r4)
        L_0x0020:
            r4.mPostedAnimatorRunner = r0
            boolean r0 = ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L_0x006a
            java.lang.ThreadLocal<android.support.v7.widget.ab> r0 = android.support.p028v7.widget.C0937ab.f3082a
            java.lang.Object r0 = r0.get()
            android.support.v7.widget.ab r0 = (android.support.p028v7.widget.C0937ab) r0
            r4.mGapWorker = r0
            android.support.v7.widget.ab r0 = r4.mGapWorker
            if (r0 != 0) goto L_0x0065
            android.support.v7.widget.ab r0 = new android.support.v7.widget.ab
            r0.<init>()
            r4.mGapWorker = r0
            android.view.Display r0 = android.support.p017v4.view.C0595r.m2227A(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0054
            if (r0 == 0) goto L_0x0054
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r0 = r1
        L_0x0055:
            android.support.v7.widget.ab r1 = r4.mGapWorker
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f3086d = r2
            java.lang.ThreadLocal<android.support.v7.widget.ab> r0 = android.support.p028v7.widget.C0937ab.f3082a
            android.support.v7.widget.ab r1 = r4.mGapWorker
            r0.set(r1)
        L_0x0065:
            android.support.v7.widget.ab r0 = r4.mGapWorker
            r0.mo4870a(r4)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mItemAnimator != null) {
            this.mItemAnimator.mo4257d();
        }
        stopScroll();
        this.mIsAttached = false;
        if (this.mLayout != null) {
            this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.mo5172b();
        if (ALLOW_THREAD_GAP_WORK && this.mGapWorker != null) {
            this.mGapWorker.mo4872b(this);
            this.mGapWorker = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    /* access modifiers changed from: 0000 */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot call this method unless RecyclerView is computing a layout or scrolling");
            sb.append(exceptionLabel());
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(exceptionLabel());
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(exceptionLabel());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(exceptionLabel());
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    public void addOnItemTouchListener(C0888l lVar) {
        this.mOnItemTouchListeners.add(lVar);
    }

    public void removeOnItemTouchListener(C0888l lVar) {
        this.mOnItemTouchListeners.remove(lVar);
        if (this.mActiveOnItemTouchListener == lVar) {
            this.mActiveOnItemTouchListener = null;
        }
    }

    private boolean dispatchOnItemTouchIntercept(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.mActiveOnItemTouchListener = null;
        }
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            C0888l lVar = (C0888l) this.mOnItemTouchListeners.get(i);
            if (!lVar.mo4403a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.mActiveOnItemTouchListener = lVar;
                return true;
            }
        }
        return false;
    }

    private boolean dispatchOnItemTouch(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.mActiveOnItemTouchListener != null) {
            if (action == 0) {
                this.mActiveOnItemTouchListener = null;
            } else {
                this.mActiveOnItemTouchListener.mo4404b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.mActiveOnItemTouchListener = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.mOnItemTouchListeners.size();
            for (int i = 0; i < size; i++) {
                C0888l lVar = (C0888l) this.mOnItemTouchListeners.get(i);
                if (lVar.mo4403a(this, motionEvent)) {
                    this.mActiveOnItemTouchListener = lVar;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.mLayoutFrozen) {
            return false;
        }
        if (dispatchOnItemTouchIntercept(motionEvent)) {
            cancelTouch();
            return true;
        } else if (this.mLayout == null) {
            return false;
        } else {
            boolean canScrollHorizontally = this.mLayout.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            switch (actionMasked) {
                case 0:
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x;
                    this.mInitialTouchX = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y;
                    this.mInitialTouchY = y;
                    if (this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    this.mNestedOffsets[1] = 0;
                    iArr[0] = 0;
                    int i = canScrollHorizontally ? 1 : 0;
                    if (canScrollVertically) {
                        i |= 2;
                    }
                    startNestedScroll(i, 0);
                    break;
                case 1:
                    this.mVelocityTracker.clear();
                    stopNestedScroll(0);
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        if (this.mScrollState != 1) {
                            int i2 = x2 - this.mInitialTouchX;
                            int i3 = y2 - this.mInitialTouchY;
                            if (!canScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                                z = false;
                            } else {
                                this.mLastTouchX = x2;
                                z = true;
                            }
                            if (canScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                                this.mLastTouchY = y2;
                                z = true;
                            }
                            if (z) {
                                setScrollState(1);
                                break;
                            }
                        }
                    } else {
                        String str = TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error processing scroll; pointer index for id ");
                        sb.append(this.mScrollPointerId);
                        sb.append(" not found. Did any MotionEvents get skipped?");
                        Log.e(str, sb.toString());
                        return false;
                    }
                    break;
                case 3:
                    cancelTouch();
                    break;
                case 5:
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x3;
                    this.mInitialTouchX = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y3;
                    this.mInitialTouchY = y3;
                    break;
                case 6:
                    onPointerUp(motionEvent);
                    break;
            }
            if (this.mScrollState == 1) {
                z2 = true;
            }
            return z2;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((C0888l) this.mOnItemTouchListeners.get(i)).mo4402a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        boolean z;
        boolean z2 = false;
        if (this.mLayoutFrozen || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchOnItemTouch(motionEvent)) {
            cancelTouch();
            return true;
        } else if (this.mLayout == null) {
            return false;
        } else {
            boolean canScrollHorizontally = this.mLayout.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.mNestedOffsets;
                this.mNestedOffsets[1] = 0;
                iArr[0] = 0;
            }
            obtain.offsetLocation((float) this.mNestedOffsets[0], (float) this.mNestedOffsets[1]);
            switch (actionMasked) {
                case 0:
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x;
                    this.mInitialTouchX = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y;
                    this.mInitialTouchY = y;
                    int i3 = canScrollHorizontally ? 1 : 0;
                    if (canScrollVertically) {
                        i3 |= 2;
                    }
                    startNestedScroll(i3, 0);
                    break;
                case 1:
                    this.mVelocityTracker.addMovement(obtain);
                    this.mVelocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) this.mMaxFlingVelocity);
                    float f = canScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                    float f2 = canScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                    if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                        setScrollState(0);
                    }
                    resetTouch();
                    z2 = true;
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i4 = this.mLastTouchX - x2;
                        int i5 = this.mLastTouchY - y2;
                        if (dispatchNestedPreScroll(i4, i5, this.mScrollConsumed, this.mScrollOffset, 0)) {
                            i4 -= this.mScrollConsumed[0];
                            i5 -= this.mScrollConsumed[1];
                            obtain.offsetLocation((float) this.mScrollOffset[0], (float) this.mScrollOffset[1]);
                            int[] iArr2 = this.mNestedOffsets;
                            iArr2[0] = iArr2[0] + this.mScrollOffset[0];
                            int[] iArr3 = this.mNestedOffsets;
                            iArr3[1] = iArr3[1] + this.mScrollOffset[1];
                        }
                        if (this.mScrollState != 1) {
                            if (!canScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                                z = false;
                            } else {
                                if (i2 > 0) {
                                    i2 -= this.mTouchSlop;
                                } else {
                                    i2 += this.mTouchSlop;
                                }
                                z = true;
                            }
                            if (canScrollVertically && Math.abs(i) > this.mTouchSlop) {
                                if (i > 0) {
                                    i -= this.mTouchSlop;
                                } else {
                                    i += this.mTouchSlop;
                                }
                                z = true;
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.mScrollState == 1) {
                            this.mLastTouchX = x2 - this.mScrollOffset[0];
                            this.mLastTouchY = y2 - this.mScrollOffset[1];
                            if (scrollByInternal(canScrollHorizontally ? i2 : 0, canScrollVertically ? i : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            if (!(this.mGapWorker == null || (i2 == 0 && i == 0))) {
                                this.mGapWorker.mo4871a(this, i2, i);
                                break;
                            }
                        }
                    } else {
                        String str = TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error processing scroll; pointer index for id ");
                        sb.append(this.mScrollPointerId);
                        sb.append(" not found. Did any MotionEvents get skipped?");
                        Log.e(str, sb.toString());
                        return false;
                    }
                    break;
                case 3:
                    cancelTouch();
                    break;
                case 5:
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x3;
                    this.mInitialTouchX = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y3;
                    this.mInitialTouchY = y3;
                    break;
                case 6:
                    onPointerUp(motionEvent);
                    break;
            }
            if (!z2) {
                this.mVelocityTracker.addMovement(obtain);
            }
            obtain.recycle();
            return true;
        }
    }

    private void resetTouch() {
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void cancelTouch() {
        resetTouch();
        setScrollState(0);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutFrozen && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.canScrollHorizontally()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.canScrollVertically()) {
                        f2 = -axisValue;
                    } else if (this.mLayout.canScrollHorizontally()) {
                        f = axisValue;
                        f2 = 0.0f;
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
            }
            f = 0.0f;
            scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mLayout == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (this.mLayout.isAutoMeasureEnabled()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.mAdapter != null) {
                if (this.mState.f2812d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.setMeasureSpecs(i, i2);
                this.mState.f2817i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
                if (this.mLayout.shouldMeasureTwice()) {
                    this.mLayout.setMeasureSpecs(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f2817i = true;
                    dispatchLayoutStep2();
                    this.mLayout.setMeasuredDimensionFromChildren(i, i2);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                if (this.mState.f2819k) {
                    this.mState.f2815g = true;
                } else {
                    this.mAdapterHelper.mo5215e();
                    this.mState.f2815g = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f2819k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            if (this.mAdapter != null) {
                this.mState.f2813e = this.mAdapter.getItemCount();
            } else {
                this.mState.f2813e = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f2815g = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(C0881i.chooseSize(i, getPaddingLeft() + getPaddingRight(), C0595r.m2261j(this)), C0881i.chooseSize(i2, getPaddingTop() + getPaddingBottom(), C0595r.m2262k(this)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    public void setItemAnimator(C0875f fVar) {
        if (this.mItemAnimator != null) {
            this.mItemAnimator.mo4257d();
            this.mItemAnimator.mo4250a(null);
        }
        this.mItemAnimator = fVar;
        if (this.mItemAnimator != null) {
            this.mItemAnimator.mo4250a(this.mItemAnimatorListener);
        }
    }

    /* access modifiers changed from: 0000 */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: 0000 */
    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* access modifiers changed from: 0000 */
    public void onExitLayoutOrScroll(boolean z) {
        this.mLayoutOrScrollCounter--;
        if (this.mLayoutOrScrollCounter < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean isAccessibilityEnabled() {
        return this.mAccessibilityManager != null && this.mAccessibilityManager.isEnabled();
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0563a.m2107a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0563a.m2106a(accessibilityEvent) : 0;
        if (a == 0) {
            a = 0;
        }
        this.mEatenAccessibilityChangeFlags = a | this.mEatenAccessibilityChangeFlags;
        return true;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public C0875f getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: 0000 */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C0595r.m2242a((View) this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.mo5202a();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo5209b();
        } else {
            this.mAdapterHelper.mo5215e();
        }
        boolean z = true;
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f2818j = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.mRequestedSimpleAnimations) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.hasStableIds());
        C0898s sVar = this.mState;
        if (!this.mState.f2818j || !z2 || this.mDataSetHasChangedAfterLayout || !predictiveItemAnimationsEnabled()) {
            z = false;
        }
        sVar.f2819k = z;
    }

    /* access modifiers changed from: 0000 */
    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            this.mState.f2817i = false;
            if (this.mState.f2812d == 1) {
                dispatchLayoutStep1();
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.mo5216f() && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    private void saveFocusInfo() {
        int i;
        C0901v vVar = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            vVar = findContainingViewHolder(focusedChild);
        }
        if (vVar == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f2821m = this.mAdapter.hasStableIds() ? vVar.getItemId() : -1;
        C0898s sVar = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i = -1;
        } else if (vVar.isRemoved()) {
            i = vVar.mOldPosition;
        } else {
            i = vVar.getAdapterPosition();
        }
        sVar.f2820l = i;
        this.mState.f2822n = getDeepestFocusedViewWithId(vVar.itemView);
    }

    private void resetFocusInfo() {
        this.mState.f2821m = -1;
        this.mState.f2820l = -1;
        this.mState.f2822n = -1;
    }

    private View findNextViewToFocus() {
        int i = this.mState.f2820l != -1 ? this.mState.f2820l : 0;
        int e = this.mState.mo4484e();
        int i2 = i;
        while (i2 < e) {
            C0901v findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition == null) {
                break;
            } else if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            } else {
                i2++;
            }
        }
        int min = Math.min(e, i);
        while (true) {
            min--;
            if (min < 0) {
                return null;
            }
            C0901v findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(min);
            if (findViewHolderForAdapterPosition2 == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
    }

    private void recoverFocusFromState() {
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                View focusedChild = getFocusedChild();
                if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                    if (!this.mChildHelper.mo5316c(focusedChild)) {
                        return;
                    }
                } else if (this.mChildHelper.mo5311b() == 0) {
                    requestFocus();
                    return;
                }
            }
            View view = null;
            C0901v findViewHolderForItemId = (this.mState.f2821m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f2821m);
            if (findViewHolderForItemId != null && !this.mChildHelper.mo5316c(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
                view = findViewHolderForItemId.itemView;
            } else if (this.mChildHelper.mo5311b() > 0) {
                view = findNextViewToFocus();
            }
            if (view != null) {
                if (((long) this.mState.f2822n) != -1) {
                    View findViewById = view.findViewById(this.mState.f2822n);
                    if (findViewById != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                }
                view.requestFocus();
            }
        }
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* access modifiers changed from: 0000 */
    public final void fillRemainingScrollValues(C0898s sVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f2826a;
            sVar.f2823o = overScroller.getFinalX() - overScroller.getCurrX();
            sVar.f2824p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        sVar.f2823o = 0;
        sVar.f2824p = 0;
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.mo4478a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f2817i = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.mo5166a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0898s sVar = this.mState;
        if (!this.mState.f2818j || !this.mItemsChanged) {
            z = false;
        }
        sVar.f2816h = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        this.mState.f2815g = this.mState.f2819k;
        this.mState.f2813e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f2818j) {
            int b = this.mChildHelper.mo5311b();
            for (int i = 0; i < b; i++) {
                C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5313b(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.mo5168a(childViewHolderInt, this.mItemAnimator.mo4248a(this.mState, childViewHolderInt, C0875f.m3761e(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f2816h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.mo5167a(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f2819k) {
            saveOldPositions();
            boolean z2 = this.mState.f2814f;
            this.mState.f2814f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
            this.mState.f2814f = z2;
            for (int i2 = 0; i2 < this.mChildHelper.mo5311b(); i2++) {
                C0901v childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.mo5313b(i2));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.mo5176d(childViewHolderInt2)) {
                    int e = C0875f.m3761e(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e |= MpegAudioHeader.MAX_FRAME_SIZE_BYTES;
                    }
                    C0878c a = this.mItemAnimator.mo4248a(this.mState, childViewHolderInt2, e, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, a);
                    } else {
                        this.mViewInfoStore.mo5173b(childViewHolderInt2, a);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f2812d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mo4478a(6);
        this.mAdapterHelper.mo5215e();
        this.mState.f2813e = this.mAdapter.getItemCount();
        this.mState.f2811c = 0;
        this.mState.f2815g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
        this.mState.f2814f = false;
        this.mPendingSavedState = null;
        this.mState.f2818j = this.mState.f2818j && this.mItemAnimator != null;
        this.mState.f2812d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.mo4478a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.f2812d = 1;
        if (this.mState.f2818j) {
            for (int b = this.mChildHelper.mo5311b() - 1; b >= 0; b--) {
                C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5313b(b));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    C0878c a = this.mItemAnimator.mo4247a(this.mState, childViewHolderInt);
                    C0901v a2 = this.mViewInfoStore.mo5165a(changedHolderKey);
                    if (a2 == null || a2.shouldIgnore()) {
                        this.mViewInfoStore.mo5175c(childViewHolderInt, a);
                    } else {
                        boolean a3 = this.mViewInfoStore.mo5170a(a2);
                        boolean a4 = this.mViewInfoStore.mo5170a(childViewHolderInt);
                        if (!a3 || a2 != childViewHolderInt) {
                            C0878c b2 = this.mViewInfoStore.mo5171b(a2);
                            this.mViewInfoStore.mo5175c(childViewHolderInt, a);
                            C0878c c = this.mViewInfoStore.mo5174c(childViewHolderInt);
                            if (b2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, a2);
                            } else {
                                animateChange(a2, childViewHolderInt, b2, c, a3, a4);
                            }
                        } else {
                            this.mViewInfoStore.mo5175c(childViewHolderInt, a);
                        }
                    }
                }
            }
            this.mViewInfoStore.mo5169a(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        this.mState.f2810b = this.mState.f2813e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mState.f2818j = false;
        this.mState.f2819k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        if (this.mRecycler.f2793b != null) {
            this.mRecycler.f2793b.clear();
        }
        if (this.mLayout.mPrefetchMaxObservedInInitialPrefetch) {
            this.mLayout.mPrefetchMaxCountObserved = 0;
            this.mLayout.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.mo4433b();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.mo5166a();
        if (didChildRangeChange(this.mMinMaxLayoutPositions[0], this.mMinMaxLayoutPositions[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private void handleMissingPreInfoForChangeError(long j, C0901v vVar, C0901v vVar2) {
        int b = this.mChildHelper.mo5311b();
        int i = 0;
        while (i < b) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5313b(i));
            if (childViewHolderInt == vVar || getChangedHolderKey(childViewHolderInt) != j) {
                i++;
            } else if (this.mAdapter == null || !this.mAdapter.hasStableIds()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb.append(childViewHolderInt);
                sb.append(" \n View Holder 2:");
                sb.append(vVar);
                sb.append(exceptionLabel());
                throw new IllegalStateException(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(vVar);
                sb2.append(exceptionLabel());
                throw new IllegalStateException(sb2.toString());
            }
        }
        String str = TAG;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb3.append(vVar2);
        sb3.append(" cannot be found but it is necessary for ");
        sb3.append(vVar);
        sb3.append(exceptionLabel());
        Log.e(str, sb3.toString());
    }

    /* access modifiers changed from: 0000 */
    public void recordAnimationInfoIfBouncedHiddenView(C0901v vVar, C0878c cVar) {
        vVar.setFlags(0, 8192);
        if (this.mState.f2816h && vVar.isUpdated() && !vVar.isRemoved() && !vVar.shouldIgnore()) {
            this.mViewInfoStore.mo5167a(getChangedHolderKey(vVar), vVar);
        }
        this.mViewInfoStore.mo5168a(vVar, cVar);
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int b = this.mChildHelper.mo5311b();
        if (b == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < b; i3++) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5313b(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i) {
                    i = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        return (this.mMinMaxLayoutPositions[0] == i && this.mMinMaxLayoutPositions[1] == i2) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C0901v childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                sb.append(exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    /* access modifiers changed from: 0000 */
    public long getChangedHolderKey(C0901v vVar) {
        return this.mAdapter.hasStableIds() ? vVar.getItemId() : (long) vVar.mPosition;
    }

    /* access modifiers changed from: 0000 */
    public void animateAppearance(C0901v vVar, C0878c cVar, C0878c cVar2) {
        vVar.setIsRecyclable(false);
        if (this.mItemAnimator.mo4255b(vVar, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: 0000 */
    public void animateDisappearance(C0901v vVar, C0878c cVar, C0878c cVar2) {
        addAnimatingView(vVar);
        vVar.setIsRecyclable(false);
        if (this.mItemAnimator.mo4251a(vVar, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void animateChange(C0901v vVar, C0901v vVar2, C0878c cVar, C0878c cVar2, boolean z, boolean z2) {
        vVar.setIsRecyclable(false);
        if (z) {
            addAnimatingView(vVar);
        }
        if (vVar != vVar2) {
            if (z2) {
                addAnimatingView(vVar2);
            }
            vVar.mShadowedHolder = vVar2;
            addAnimatingView(vVar);
            this.mRecycler.mo4440c(vVar);
            vVar2.setIsRecyclable(false);
            vVar2.mShadowingHolder = vVar;
        }
        if (this.mItemAnimator.mo4252a(vVar, vVar2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0541d.m2067a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C0541d.m2066a();
        this.mFirstLayoutComplete = true;
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutFrozen) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    public void markItemDecorInsetsDirty() {
        int c = this.mChildHelper.mo5314c();
        for (int i = 0; i < c; i++) {
            ((LayoutParams) this.mChildHelper.mo5317d(i).getLayoutParams()).f2766e = true;
        }
        this.mRecycler.mo4452j();
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((C0880h) this.mItemDecorations.get(i)).mo4273a(canvas, this, this.mState);
        }
        if (this.mLeftGlow == null || this.mLeftGlow.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            z = this.mLeftGlow != null && this.mLeftGlow.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (this.mTopGlow != null && !this.mTopGlow.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            z |= this.mTopGlow != null && this.mTopGlow.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.mRightGlow != null && !this.mRightGlow.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            z |= this.mRightGlow != null && this.mRightGlow.draw(canvas);
            canvas.restoreToCount(save3);
        }
        if (this.mBottomGlow == null || this.mBottomGlow.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            if (this.mBottomGlow != null && this.mBottomGlow.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.mo4254b()) {
            z2 = true;
        }
        if (z2) {
            C0595r.m2252d(this);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((C0880h) this.mItemDecorations.get(i)).mo4277b(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.mLayout != null) {
            return this.mLayout.generateDefaultLayoutParams();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.mLayout != null) {
            return this.mLayout.generateLayoutParams(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.mLayout != null) {
            return this.mLayout.generateLayoutParams(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    public boolean isAnimating() {
        return this.mItemAnimator != null && this.mItemAnimator.mo4254b();
    }

    /* access modifiers changed from: 0000 */
    public void saveOldPositions() {
        int c = this.mChildHelper.mo5314c();
        for (int i = 0; i < c; i++) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5317d(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void clearOldPositions() {
        int c = this.mChildHelper.mo5314c();
        for (int i = 0; i < c; i++) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5317d(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.mo4451i();
    }

    /* access modifiers changed from: 0000 */
    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int c = this.mChildHelper.mo5314c();
        if (i < i2) {
            i4 = i2;
            i3 = -1;
            i5 = i;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i6 = 0; i6 < c; i6++) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5317d(i6));
            if (childViewHolderInt != null && childViewHolderInt.mPosition >= i5 && childViewHolderInt.mPosition <= i4) {
                if (childViewHolderInt.mPosition == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i3, false);
                }
                this.mState.f2814f = true;
            }
        }
        this.mRecycler.mo4423a(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void offsetPositionRecordsForInsert(int i, int i2) {
        int c = this.mChildHelper.mo5314c();
        for (int i3 = 0; i3 < c; i3++) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5317d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f2814f = true;
            }
        }
        this.mRecycler.mo4434b(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int c = this.mChildHelper.mo5314c();
        for (int i4 = 0; i4 < c; i4++) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5317d(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                if (childViewHolderInt.mPosition >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f2814f = true;
                } else if (childViewHolderInt.mPosition >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f2814f = true;
                }
            }
        }
        this.mRecycler.mo4424a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void viewRangeUpdate(int i, int i2, Object obj) {
        int c = this.mChildHelper.mo5314c();
        int i3 = i + i2;
        for (int i4 = 0; i4 < c; i4++) {
            View d = this.mChildHelper.mo5317d(i4);
            C0901v childViewHolderInt = getChildViewHolderInt(d);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i && childViewHolderInt.mPosition < i3) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) d.getLayoutParams()).f2766e = true;
            }
        }
        this.mRecycler.mo4439c(i, i2);
    }

    /* access modifiers changed from: 0000 */
    public boolean canReuseUpdatedViewHolder(C0901v vVar) {
        return this.mItemAnimator == null || this.mItemAnimator.mo4253a(vVar, vVar.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: 0000 */
    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* access modifiers changed from: 0000 */
    public void markKnownViewsInvalid() {
        int c = this.mChildHelper.mo5314c();
        for (int i = 0; i < c; i++) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5317d(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.mo4450h();
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            if (this.mLayout != null) {
                this.mLayout.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public C0901v getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public C0901v findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    static C0901v getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2764c;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public int getChildAdapterPosition(View view) {
        C0901v childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(View view) {
        C0901v childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public long getChildItemId(View view) {
        long j = -1;
        if (this.mAdapter == null || !this.mAdapter.hasStableIds()) {
            return -1;
        }
        C0901v childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            j = childViewHolderInt.getItemId();
        }
        return j;
    }

    @Deprecated
    public C0901v findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public C0901v findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public C0901v findViewHolderForAdapterPosition(int i) {
        C0901v vVar = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int c = this.mChildHelper.mo5314c();
        for (int i2 = 0; i2 < c; i2++) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5317d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i) {
                if (!this.mChildHelper.mo5316c(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                vVar = childViewHolderInt;
            }
        }
        return vVar;
    }

    /* access modifiers changed from: 0000 */
    public C0901v findViewHolderForPosition(int i, boolean z) {
        int c = this.mChildHelper.mo5314c();
        C0901v vVar = null;
        for (int i2 = 0; i2 < c; i2++) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5317d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.mChildHelper.mo5316c(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                vVar = childViewHolderInt;
            }
        }
        return vVar;
    }

    public C0901v findViewHolderForItemId(long j) {
        C0901v vVar = null;
        if (this.mAdapter == null || !this.mAdapter.hasStableIds()) {
            return null;
        }
        int c = this.mChildHelper.mo5314c();
        for (int i = 0; i < c; i++) {
            C0901v childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5317d(i));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                if (!this.mChildHelper.mo5316c(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                vVar = childViewHolderInt;
            }
        }
        return vVar;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int b = this.mChildHelper.mo5311b() - 1; b >= 0; b--) {
            View b2 = this.mChildHelper.mo5313b(b);
            float translationX = b2.getTranslationX();
            float translationY = b2.getTranslationY();
            if (f >= ((float) b2.getLeft()) + translationX && f <= ((float) b2.getRight()) + translationX && f2 >= ((float) b2.getTop()) + translationY && f2 <= ((float) b2.getBottom()) + translationY) {
                return b2;
            }
        }
        return null;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void offsetChildrenVertical(int i) {
        int b = this.mChildHelper.mo5311b();
        for (int i2 = 0; i2 < b; i2++) {
            this.mChildHelper.mo5313b(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int b = this.mChildHelper.mo5311b();
        for (int i2 = 0; i2 < b; i2++) {
            this.mChildHelper.mo5313b(i2).offsetLeftAndRight(i);
        }
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f2765d;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    /* access modifiers changed from: 0000 */
    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f2766e) {
            return layoutParams.f2765d;
        }
        if (this.mState.mo4480a() && (layoutParams.mo4194e() || layoutParams.mo4192c())) {
            return layoutParams.f2765d;
        }
        Rect rect = layoutParams.f2765d;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            ((C0880h) this.mItemDecorations.get(i)).mo4275a(this.mTempRect, view, this, this.mState);
            rect.left += this.mTempRect.left;
            rect.top += this.mTempRect.top;
            rect.right += this.mTempRect.right;
            rect.bottom += this.mTempRect.bottom;
        }
        layoutParams.f2766e = false;
        return rect;
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        onScrolled(i, i2);
        if (this.mScrollListener != null) {
            this.mScrollListener.onScrolled(this, i, i2);
        }
        if (this.mScrollListeners != null) {
            for (int size = this.mScrollListeners.size() - 1; size >= 0; size--) {
                ((C0889m) this.mScrollListeners.get(size)).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnScrollStateChanged(int i) {
        if (this.mLayout != null) {
            this.mLayout.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        if (this.mScrollListener != null) {
            this.mScrollListener.onScrollStateChanged(this, i);
        }
        if (this.mScrollListeners != null) {
            for (int size = this.mScrollListeners.size() - 1; size >= 0; size--) {
                ((C0889m) this.mScrollListeners.get(size)).onScrollStateChanged(this, i);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo5214d();
    }

    /* access modifiers changed from: 0000 */
    public void repositionShadowingViews() {
        int b = this.mChildHelper.mo5311b();
        for (int i = 0; i < b; i++) {
            View b2 = this.mChildHelper.mo5313b(i);
            C0901v childViewHolder = getChildViewHolder(b2);
            if (!(childViewHolder == null || childViewHolder.mShadowingHolder == null)) {
                View view = childViewHolder.mShadowingHolder.itemView;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    static void clearNestedRecyclerViewIfNotNested(C0901v vVar) {
        if (vVar.mNestedRecyclerView != null) {
            View view = (View) vVar.mNestedRecyclerView.get();
            while (view != null) {
                if (view != vVar.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            vVar.mNestedRecyclerView = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public void dispatchChildDetached(View view) {
        C0901v childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        if (!(this.mAdapter == null || childViewHolderInt == null)) {
            this.mAdapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        if (this.mOnChildAttachStateListeners != null) {
            for (int size = this.mOnChildAttachStateListeners.size() - 1; size >= 0; size--) {
                ((C0886j) this.mOnChildAttachStateListeners.get(size)).mo4400b(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void dispatchChildAttached(View view) {
        C0901v childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        if (!(this.mAdapter == null || childViewHolderInt == null)) {
            this.mAdapter.onViewAttachedToWindow(childViewHolderInt);
        }
        if (this.mOnChildAttachStateListeners != null) {
            for (int size = this.mOnChildAttachStateListeners.size() - 1; size >= 0; size--) {
                ((C0886j) this.mOnChildAttachStateListeners.get(size)).mo4399a(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean setChildImportantForAccessibilityInternal(C0901v vVar, int i) {
        if (isComputingLayout()) {
            vVar.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(vVar);
            return false;
        }
        C0595r.m2247b(vVar.itemView, i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void dispatchPendingImportantForAccessibilityChanges() {
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            C0901v vVar = (C0901v) this.mPendingAccessibilityImportanceChange.get(size);
            if (vVar.itemView.getParent() == this && !vVar.shouldIgnore()) {
                int i = vVar.mPendingAccessibilityState;
                if (i != -1) {
                    C0595r.m2247b(vVar.itemView, i);
                    vVar.mPendingAccessibilityState = -1;
                }
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    /* access modifiers changed from: 0000 */
    public int getAdapterPositionFor(C0901v vVar) {
        if (vVar.hasAnyOfTheFlags(524) || !vVar.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.mo5211c(vVar.mPosition);
    }

    /* access modifiers changed from: 0000 */
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set fast scroller without both required drawables.");
            sb.append(exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new C1047y(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0758a.fastscroll_default_thickness), resources.getDimensionPixelSize(C0758a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0758a.fastscroll_margin));
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo2069a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo2070a();
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo2080b(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().mo2074a(i, i2);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo2081c();
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().mo2082c(i);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo2079b();
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().mo2073a(i);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo2075a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo2076a(i, i2, i3, i4, iArr, i5);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo2077a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo2078a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo2072a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo2071a(f, f2);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mChildDrawingOrderCallback == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return this.mChildDrawingOrderCallback.mo4245a(i, i2);
    }

    private C0588k getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0588k(this);
        }
        return this.mScrollingChildHelper;
    }
}
