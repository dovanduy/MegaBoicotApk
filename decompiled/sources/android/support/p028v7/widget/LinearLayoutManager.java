package android.support.p028v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p028v7.widget.RecyclerView.C0881i;
import android.support.p028v7.widget.RecyclerView.C0881i.C0884a;
import android.support.p028v7.widget.RecyclerView.C0881i.C0885b;
import android.support.p028v7.widget.RecyclerView.C0892o;
import android.support.p028v7.widget.RecyclerView.C0895r.C0897b;
import android.support.p028v7.widget.RecyclerView.C0898s;
import android.support.p028v7.widget.RecyclerView.C0901v;
import android.support.p028v7.widget.RecyclerView.LayoutParams;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.widget.LinearLayoutManager */
public class LinearLayoutManager extends C0881i implements C0897b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C0853a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C0854b mLayoutChunkResult;
    private C0855c mLayoutState;
    int mOrientation;
    C0948ah mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* renamed from: android.support.v7.widget.LinearLayoutManager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f2692a;

        /* renamed from: b */
        int f2693b;

        /* renamed from: c */
        boolean f2694c;

        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f2692a = parcel.readInt();
            this.f2693b = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f2694c = z;
        }

        public SavedState(SavedState savedState) {
            this.f2692a = savedState.f2692a;
            this.f2693b = savedState.f2693b;
            this.f2694c = savedState.f2694c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3929a() {
            return this.f2692a >= 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3930b() {
            this.f2692a = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2692a);
            parcel.writeInt(this.f2693b);
            parcel.writeInt(this.f2694c ? 1 : 0);
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$a */
    static class C0853a {

        /* renamed from: a */
        C0948ah f2695a;

        /* renamed from: b */
        int f2696b;

        /* renamed from: c */
        int f2697c;

        /* renamed from: d */
        boolean f2698d;

        /* renamed from: e */
        boolean f2699e;

        C0853a() {
            mo3937a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3937a() {
            this.f2696b = -1;
            this.f2697c = Integer.MIN_VALUE;
            this.f2698d = false;
            this.f2699e = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3940b() {
            int i;
            if (this.f2698d) {
                i = this.f2695a.mo4920d();
            } else {
                i = this.f2695a.mo4918c();
            }
            this.f2697c = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AnchorInfo{mPosition=");
            sb.append(this.f2696b);
            sb.append(", mCoordinate=");
            sb.append(this.f2697c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f2698d);
            sb.append(", mValid=");
            sb.append(this.f2699e);
            sb.append('}');
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3939a(View view, C0898s sVar) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return !layoutParams.mo4193d() && layoutParams.mo4195f() >= 0 && layoutParams.mo4195f() < sVar.mo4484e();
        }

        /* renamed from: a */
        public void mo3938a(View view, int i) {
            int b = this.f2695a.mo4916b();
            if (b >= 0) {
                mo3941b(view, i);
                return;
            }
            this.f2696b = i;
            if (this.f2698d) {
                int d = (this.f2695a.mo4920d() - b) - this.f2695a.mo4917b(view);
                this.f2697c = this.f2695a.mo4920d() - d;
                if (d > 0) {
                    int e = this.f2697c - this.f2695a.mo4923e(view);
                    int c = this.f2695a.mo4918c();
                    int min = e - (c + Math.min(this.f2695a.mo4913a(view) - c, 0));
                    if (min < 0) {
                        this.f2697c += Math.min(d, -min);
                    }
                }
            } else {
                int a = this.f2695a.mo4913a(view);
                int c2 = a - this.f2695a.mo4918c();
                this.f2697c = a;
                if (c2 > 0) {
                    int d2 = (this.f2695a.mo4920d() - Math.min(0, (this.f2695a.mo4920d() - b) - this.f2695a.mo4917b(view))) - (a + this.f2695a.mo4923e(view));
                    if (d2 < 0) {
                        this.f2697c -= Math.min(c2, -d2);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo3941b(View view, int i) {
            if (this.f2698d) {
                this.f2697c = this.f2695a.mo4917b(view) + this.f2695a.mo4916b();
            } else {
                this.f2697c = this.f2695a.mo4913a(view);
            }
            this.f2696b = i;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$b */
    protected static class C0854b {

        /* renamed from: a */
        public int f2700a;

        /* renamed from: b */
        public boolean f2701b;

        /* renamed from: c */
        public boolean f2702c;

        /* renamed from: d */
        public boolean f2703d;

        protected C0854b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3943a() {
            this.f2700a = 0;
            this.f2701b = false;
            this.f2702c = false;
            this.f2703d = false;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$c */
    static class C0855c {

        /* renamed from: a */
        boolean f2704a = true;

        /* renamed from: b */
        int f2705b;

        /* renamed from: c */
        int f2706c;

        /* renamed from: d */
        int f2707d;

        /* renamed from: e */
        int f2708e;

        /* renamed from: f */
        int f2709f;

        /* renamed from: g */
        int f2710g;

        /* renamed from: h */
        int f2711h = 0;

        /* renamed from: i */
        boolean f2712i = false;

        /* renamed from: j */
        int f2713j;

        /* renamed from: k */
        List<C0901v> f2714k = null;

        /* renamed from: l */
        boolean f2715l;

        C0855c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3947a(C0898s sVar) {
            return this.f2707d >= 0 && this.f2707d < sVar.mo4484e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo3944a(C0892o oVar) {
            if (this.f2714k != null) {
                return m3674b();
            }
            View c = oVar.mo4437c(this.f2707d);
            this.f2707d += this.f2708e;
            return c;
        }

        /* renamed from: b */
        private View m3674b() {
            int size = this.f2714k.size();
            for (int i = 0; i < size; i++) {
                View view = ((C0901v) this.f2714k.get(i)).itemView;
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (!layoutParams.mo4193d() && this.f2707d == layoutParams.mo4195f()) {
                    mo3946a(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo3945a() {
            mo3946a((View) null);
        }

        /* renamed from: a */
        public void mo3946a(View view) {
            View b = mo3948b(view);
            if (b == null) {
                this.f2707d = -1;
            } else {
                this.f2707d = ((LayoutParams) b.getLayoutParams()).mo4195f();
            }
        }

        /* renamed from: b */
        public View mo3948b(View view) {
            int size = this.f2714k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((C0901v) this.f2714k.get(i2)).itemView;
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.mo4193d()) {
                    int f = (layoutParams.mo4195f() - this.f2707d) * this.f2708e;
                    if (f >= 0 && f < i) {
                        if (f == 0) {
                            return view3;
                        }
                        view2 = view3;
                        i = f;
                    }
                }
            }
            return view2;
        }
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void onAnchorReady(C0892o oVar, C0898s sVar, C0853a aVar, int i) {
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0853a();
        this.mLayoutChunkResult = new C0854b();
        this.mInitialPrefetchItemCount = 2;
        setOrientation(i);
        setReverseLayout(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0853a();
        this.mLayoutChunkResult = new C0854b();
        this.mInitialPrefetchItemCount = 2;
        C0885b properties = getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f2782a);
        setReverseLayout(properties.f2784c);
        setStackFromEnd(properties.f2785d);
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, C0892o oVar) {
        super.onDetachedFromWindow(recyclerView, oVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(oVar);
            oVar.mo4421a();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.f2694c = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.f2693b = this.mOrientationHelper.mo4920d() - this.mOrientationHelper.mo4917b(childClosestToEnd);
                savedState.f2692a = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.f2692a = getPosition(childClosestToStart);
                savedState.f2693b = this.mOrientationHelper.mo4913a(childClosestToStart) - this.mOrientationHelper.mo4918c();
            }
        } else {
            savedState.mo3930b();
        }
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd != z) {
            this.mStackFromEnd = z;
            requestLayout();
        }
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll(null);
            if (i != this.mOrientation || this.mOrientationHelper == null) {
                this.mOrientationHelper = C0948ah.m4185a(this, i);
                this.mAnchorInfo.f2695a = this.mOrientationHelper;
                this.mOrientation = i;
                requestLayout();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z != this.mReverseLayout) {
            this.mReverseLayout = z;
            requestLayout();
        }
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    /* access modifiers changed from: protected */
    public int getExtraLayoutSpace(C0898s sVar) {
        if (sVar.mo4483d()) {
            return this.mOrientationHelper.mo4924f();
        }
        return 0;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, C0898s sVar, int i) {
        C0942ad adVar = new C0942ad(recyclerView.getContext());
        adVar.setTargetPosition(i);
        startSmoothScroll(adVar);
    }

    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    public void onLayoutChildren(C0892o oVar, C0898s sVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && sVar.mo4484e() == 0) {
            removeAndRecycleAllViews(oVar);
            return;
        }
        if (this.mPendingSavedState != null && this.mPendingSavedState.mo3929a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f2692a;
        }
        ensureLayoutState();
        this.mLayoutState.f2704a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        if (!this.mAnchorInfo.f2699e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.mo3937a();
            this.mAnchorInfo.f2698d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(oVar, sVar, this.mAnchorInfo);
            this.mAnchorInfo.f2699e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo4913a(focusedChild) >= this.mOrientationHelper.mo4920d() || this.mOrientationHelper.mo4917b(focusedChild) <= this.mOrientationHelper.mo4918c())) {
            this.mAnchorInfo.mo3938a(focusedChild, getPosition(focusedChild));
        }
        int extraLayoutSpace = getExtraLayoutSpace(sVar);
        if (this.mLayoutState.f2713j >= 0) {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        } else {
            i = 0;
        }
        int c = extraLayoutSpace + this.mOrientationHelper.mo4918c();
        int g = i + this.mOrientationHelper.mo4926g();
        if (!(!sVar.mo4480a() || this.mPendingScrollPosition == -1 || this.mPendingScrollPositionOffset == Integer.MIN_VALUE)) {
            View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
            if (findViewByPosition != null) {
                if (this.mShouldReverseLayout) {
                    i4 = (this.mOrientationHelper.mo4920d() - this.mOrientationHelper.mo4917b(findViewByPosition)) - this.mPendingScrollPositionOffset;
                } else {
                    i4 = this.mPendingScrollPositionOffset - (this.mOrientationHelper.mo4913a(findViewByPosition) - this.mOrientationHelper.mo4918c());
                }
                if (i4 > 0) {
                    c += i4;
                } else {
                    g -= i4;
                }
            }
        }
        if (!this.mAnchorInfo.f2698d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i5 = 1;
        }
        onAnchorReady(oVar, sVar, this.mAnchorInfo, i5);
        detachAndScrapAttachedViews(oVar);
        this.mLayoutState.f2715l = resolveIsInfinite();
        this.mLayoutState.f2712i = sVar.mo4480a();
        if (this.mAnchorInfo.f2698d) {
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.f2711h = c;
            fill(oVar, this.mLayoutState, sVar, false);
            i3 = this.mLayoutState.f2705b;
            int i6 = this.mLayoutState.f2707d;
            if (this.mLayoutState.f2706c > 0) {
                g += this.mLayoutState.f2706c;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.f2711h = g;
            this.mLayoutState.f2707d += this.mLayoutState.f2708e;
            fill(oVar, this.mLayoutState, sVar, false);
            i2 = this.mLayoutState.f2705b;
            if (this.mLayoutState.f2706c > 0) {
                int i7 = this.mLayoutState.f2706c;
                updateLayoutStateToFillStart(i6, i3);
                this.mLayoutState.f2711h = i7;
                fill(oVar, this.mLayoutState, sVar, false);
                i3 = this.mLayoutState.f2705b;
            }
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.f2711h = g;
            fill(oVar, this.mLayoutState, sVar, false);
            i2 = this.mLayoutState.f2705b;
            int i8 = this.mLayoutState.f2707d;
            if (this.mLayoutState.f2706c > 0) {
                c += this.mLayoutState.f2706c;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.f2711h = c;
            this.mLayoutState.f2707d += this.mLayoutState.f2708e;
            fill(oVar, this.mLayoutState, sVar, false);
            i3 = this.mLayoutState.f2705b;
            if (this.mLayoutState.f2706c > 0) {
                int i9 = this.mLayoutState.f2706c;
                updateLayoutStateToFillEnd(i8, i2);
                this.mLayoutState.f2711h = i9;
                fill(oVar, this.mLayoutState, sVar, false);
                i2 = this.mLayoutState.f2705b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap = fixLayoutEndGap(i2, oVar, sVar, true);
                int i10 = i3 + fixLayoutEndGap;
                int i11 = i2 + fixLayoutEndGap;
                int fixLayoutStartGap = fixLayoutStartGap(i10, oVar, sVar, false);
                i3 = i10 + fixLayoutStartGap;
                i2 = i11 + fixLayoutStartGap;
            } else {
                int fixLayoutStartGap2 = fixLayoutStartGap(i3, oVar, sVar, true);
                int i12 = i3 + fixLayoutStartGap2;
                int i13 = i2 + fixLayoutStartGap2;
                int fixLayoutEndGap2 = fixLayoutEndGap(i13, oVar, sVar, false);
                i3 = i12 + fixLayoutEndGap2;
                i2 = i13 + fixLayoutEndGap2;
            }
        }
        layoutForPredictiveAnimations(oVar, sVar, i3, i2);
        if (!sVar.mo4480a()) {
            this.mOrientationHelper.mo4914a();
        } else {
            this.mAnchorInfo.mo3937a();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    public void onLayoutCompleted(C0898s sVar) {
        super.onLayoutCompleted(sVar);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.mo3937a();
    }

    private void layoutForPredictiveAnimations(C0892o oVar, C0898s sVar, int i, int i2) {
        C0892o oVar2 = oVar;
        C0898s sVar2 = sVar;
        if (sVar.mo4481b() && getChildCount() != 0 && !sVar.mo4480a() && supportsPredictiveItemAnimations()) {
            List<C0901v> c = oVar.mo4438c();
            int size = c.size();
            int position = getPosition(getChildAt(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C0901v vVar = (C0901v) c.get(i5);
                if (!vVar.isRemoved()) {
                    boolean z = true;
                    if ((vVar.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        z = true;
                    }
                    if (z) {
                        i3 += this.mOrientationHelper.mo4923e(vVar.itemView);
                    } else {
                        i4 += this.mOrientationHelper.mo4923e(vVar.itemView);
                    }
                }
            }
            this.mLayoutState.f2714k = c;
            if (i3 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
                this.mLayoutState.f2711h = i3;
                this.mLayoutState.f2706c = 0;
                this.mLayoutState.mo3945a();
                fill(oVar2, this.mLayoutState, sVar2, false);
            }
            if (i4 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
                this.mLayoutState.f2711h = i4;
                this.mLayoutState.f2706c = 0;
                this.mLayoutState.mo3945a();
                fill(oVar2, this.mLayoutState, sVar2, false);
            }
            this.mLayoutState.f2714k = null;
        }
    }

    private void updateAnchorInfoForLayout(C0892o oVar, C0898s sVar, C0853a aVar) {
        if (!updateAnchorFromPendingData(sVar, aVar) && !updateAnchorFromChildren(oVar, sVar, aVar)) {
            aVar.mo3940b();
            aVar.f2696b = this.mStackFromEnd ? sVar.mo4484e() - 1 : 0;
        }
    }

    private boolean updateAnchorFromChildren(C0892o oVar, C0898s sVar, C0853a aVar) {
        View view;
        int i;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.mo3939a(focusedChild, sVar)) {
            aVar.mo3938a(focusedChild, getPosition(focusedChild));
            return true;
        } else if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        } else {
            if (aVar.f2698d) {
                view = findReferenceChildClosestToEnd(oVar, sVar);
            } else {
                view = findReferenceChildClosestToStart(oVar, sVar);
            }
            if (view == null) {
                return false;
            }
            aVar.mo3941b(view, getPosition(view));
            if (!sVar.mo4480a() && supportsPredictiveItemAnimations()) {
                if (this.mOrientationHelper.mo4913a(view) >= this.mOrientationHelper.mo4920d() || this.mOrientationHelper.mo4917b(view) < this.mOrientationHelper.mo4918c()) {
                    z = true;
                }
                if (z) {
                    if (aVar.f2698d) {
                        i = this.mOrientationHelper.mo4920d();
                    } else {
                        i = this.mOrientationHelper.mo4918c();
                    }
                    aVar.f2697c = i;
                }
            }
            return true;
        }
    }

    private boolean updateAnchorFromPendingData(C0898s sVar, C0853a aVar) {
        int i;
        boolean z = false;
        if (sVar.mo4480a() || this.mPendingScrollPosition == -1) {
            return false;
        }
        if (this.mPendingScrollPosition < 0 || this.mPendingScrollPosition >= sVar.mo4484e()) {
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            return false;
        }
        aVar.f2696b = this.mPendingScrollPosition;
        if (this.mPendingSavedState != null && this.mPendingSavedState.mo3929a()) {
            aVar.f2698d = this.mPendingSavedState.f2694c;
            if (aVar.f2698d) {
                aVar.f2697c = this.mOrientationHelper.mo4920d() - this.mPendingSavedState.f2693b;
            } else {
                aVar.f2697c = this.mOrientationHelper.mo4918c() + this.mPendingSavedState.f2693b;
            }
            return true;
        } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
            View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
            if (findViewByPosition == null) {
                if (getChildCount() > 0) {
                    if ((this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout) {
                        z = true;
                    }
                    aVar.f2698d = z;
                }
                aVar.mo3940b();
            } else if (this.mOrientationHelper.mo4923e(findViewByPosition) > this.mOrientationHelper.mo4924f()) {
                aVar.mo3940b();
                return true;
            } else if (this.mOrientationHelper.mo4913a(findViewByPosition) - this.mOrientationHelper.mo4918c() < 0) {
                aVar.f2697c = this.mOrientationHelper.mo4918c();
                aVar.f2698d = false;
                return true;
            } else if (this.mOrientationHelper.mo4920d() - this.mOrientationHelper.mo4917b(findViewByPosition) < 0) {
                aVar.f2697c = this.mOrientationHelper.mo4920d();
                aVar.f2698d = true;
                return true;
            } else {
                if (aVar.f2698d) {
                    i = this.mOrientationHelper.mo4917b(findViewByPosition) + this.mOrientationHelper.mo4916b();
                } else {
                    i = this.mOrientationHelper.mo4913a(findViewByPosition);
                }
                aVar.f2697c = i;
            }
            return true;
        } else {
            aVar.f2698d = this.mShouldReverseLayout;
            if (this.mShouldReverseLayout) {
                aVar.f2697c = this.mOrientationHelper.mo4920d() - this.mPendingScrollPositionOffset;
            } else {
                aVar.f2697c = this.mOrientationHelper.mo4918c() + this.mPendingScrollPositionOffset;
            }
            return true;
        }
    }

    private int fixLayoutEndGap(int i, C0892o oVar, C0898s sVar, boolean z) {
        int d = this.mOrientationHelper.mo4920d() - i;
        if (d <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-d, oVar, sVar);
        int i3 = i + i2;
        if (z) {
            int d2 = this.mOrientationHelper.mo4920d() - i3;
            if (d2 > 0) {
                this.mOrientationHelper.mo4915a(d2);
                return d2 + i2;
            }
        }
        return i2;
    }

    private int fixLayoutStartGap(int i, C0892o oVar, C0898s sVar, boolean z) {
        int c = i - this.mOrientationHelper.mo4918c();
        if (c <= 0) {
            return 0;
        }
        int i2 = -scrollBy(c, oVar, sVar);
        int i3 = i + i2;
        if (z) {
            int c2 = i3 - this.mOrientationHelper.mo4918c();
            if (c2 > 0) {
                this.mOrientationHelper.mo4915a(-c2);
                return i2 - c2;
            }
        }
        return i2;
    }

    private void updateLayoutStateToFillEnd(C0853a aVar) {
        updateLayoutStateToFillEnd(aVar.f2696b, aVar.f2697c);
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.f2706c = this.mOrientationHelper.mo4920d() - i2;
        this.mLayoutState.f2708e = this.mShouldReverseLayout ? -1 : 1;
        this.mLayoutState.f2707d = i;
        this.mLayoutState.f2709f = 1;
        this.mLayoutState.f2705b = i2;
        this.mLayoutState.f2710g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(C0853a aVar) {
        updateLayoutStateToFillStart(aVar.f2696b, aVar.f2697c);
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.f2706c = i2 - this.mOrientationHelper.mo4918c();
        this.mLayoutState.f2707d = i;
        this.mLayoutState.f2708e = this.mShouldReverseLayout ? 1 : -1;
        this.mLayoutState.f2709f = -1;
        this.mLayoutState.f2705b = i2;
        this.mLayoutState.f2710g = Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* access modifiers changed from: 0000 */
    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    /* access modifiers changed from: 0000 */
    public C0855c createLayoutState() {
        return new C0855c();
    }

    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        if (this.mPendingSavedState != null) {
            this.mPendingSavedState.mo3930b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        if (this.mPendingSavedState != null) {
            this.mPendingSavedState.mo3930b();
        }
        requestLayout();
    }

    public int scrollHorizontallyBy(int i, C0892o oVar, C0898s sVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, oVar, sVar);
    }

    public int scrollVerticallyBy(int i, C0892o oVar, C0898s sVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, oVar, sVar);
    }

    public int computeHorizontalScrollOffset(C0898s sVar) {
        return computeScrollOffset(sVar);
    }

    public int computeVerticalScrollOffset(C0898s sVar) {
        return computeScrollOffset(sVar);
    }

    public int computeHorizontalScrollExtent(C0898s sVar) {
        return computeScrollExtent(sVar);
    }

    public int computeVerticalScrollExtent(C0898s sVar) {
        return computeScrollExtent(sVar);
    }

    public int computeHorizontalScrollRange(C0898s sVar) {
        return computeScrollRange(sVar);
    }

    public int computeVerticalScrollRange(C0898s sVar) {
        return computeScrollRange(sVar);
    }

    private int computeScrollOffset(C0898s sVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C0948ah ahVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C0960ao.m4285a(sVar, ahVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollExtent(C0898s sVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C0948ah ahVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C0960ao.m4284a(sVar, ahVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollRange(C0898s sVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C0948ah ahVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C0960ao.m4286b(sVar, ahVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    private void updateLayoutState(int i, int i2, boolean z, C0898s sVar) {
        int i3;
        this.mLayoutState.f2715l = resolveIsInfinite();
        this.mLayoutState.f2711h = getExtraLayoutSpace(sVar);
        this.mLayoutState.f2709f = i;
        int i4 = -1;
        if (i == 1) {
            this.mLayoutState.f2711h += this.mOrientationHelper.mo4926g();
            View childClosestToEnd = getChildClosestToEnd();
            C0855c cVar = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i4 = 1;
            }
            cVar.f2708e = i4;
            this.mLayoutState.f2707d = getPosition(childClosestToEnd) + this.mLayoutState.f2708e;
            this.mLayoutState.f2705b = this.mOrientationHelper.mo4917b(childClosestToEnd);
            i3 = this.mOrientationHelper.mo4917b(childClosestToEnd) - this.mOrientationHelper.mo4920d();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.f2711h += this.mOrientationHelper.mo4918c();
            C0855c cVar2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i4 = 1;
            }
            cVar2.f2708e = i4;
            this.mLayoutState.f2707d = getPosition(childClosestToStart) + this.mLayoutState.f2708e;
            this.mLayoutState.f2705b = this.mOrientationHelper.mo4913a(childClosestToStart);
            i3 = (-this.mOrientationHelper.mo4913a(childClosestToStart)) + this.mOrientationHelper.mo4918c();
        }
        this.mLayoutState.f2706c = i2;
        if (z) {
            this.mLayoutState.f2706c -= i3;
        }
        this.mLayoutState.f2710g = i3;
    }

    /* access modifiers changed from: 0000 */
    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo4927h() == 0 && this.mOrientationHelper.mo4922e() == 0;
    }

    /* access modifiers changed from: 0000 */
    public void collectPrefetchPositionsForLayoutState(C0898s sVar, C0855c cVar, C0884a aVar) {
        int i = cVar.f2707d;
        if (i >= 0 && i < sVar.mo4484e()) {
            aVar.mo4398b(i, Math.max(0, cVar.f2710g));
        }
    }

    public void collectInitialPrefetchPositions(int i, C0884a aVar) {
        int i2;
        boolean z;
        int i3 = -1;
        if (this.mPendingSavedState == null || !this.mPendingSavedState.mo3929a()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition == -1 ? z ? i - 1 : 0 : this.mPendingScrollPosition;
        } else {
            z = this.mPendingSavedState.f2694c;
            i2 = this.mPendingSavedState.f2692a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            aVar.mo4398b(i2, 0);
            i2 += i3;
        }
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, C0898s sVar, C0884a aVar) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            ensureLayoutState();
            updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, sVar);
            collectPrefetchPositionsForLayoutState(sVar, this.mLayoutState, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public int scrollBy(int i, C0892o oVar, C0898s sVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        this.mLayoutState.f2704a = true;
        ensureLayoutState();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, sVar);
        int fill = this.mLayoutState.f2710g + fill(oVar, this.mLayoutState, sVar, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.mo4915a(-i);
        this.mLayoutState.f2713j = i;
        return i;
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    private void recycleChildren(C0892o oVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    removeAndRecycleViewAt(i3, oVar);
                }
            } else {
                while (i > i2) {
                    removeAndRecycleViewAt(i, oVar);
                    i--;
                }
            }
        }
    }

    private void recycleViewsFromStart(C0892o oVar, int i) {
        if (i >= 0) {
            int childCount = getChildCount();
            if (this.mShouldReverseLayout) {
                int i2 = childCount - 1;
                for (int i3 = i2; i3 >= 0; i3--) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.mo4917b(childAt) > i || this.mOrientationHelper.mo4919c(childAt) > i) {
                        recycleChildren(oVar, i2, i3);
                        return;
                    }
                }
            } else {
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt2 = getChildAt(i4);
                    if (this.mOrientationHelper.mo4917b(childAt2) > i || this.mOrientationHelper.mo4919c(childAt2) > i) {
                        recycleChildren(oVar, 0, i4);
                        return;
                    }
                }
            }
        }
    }

    private void recycleViewsFromEnd(C0892o oVar, int i) {
        int childCount = getChildCount();
        if (i >= 0) {
            int e = this.mOrientationHelper.mo4922e() - i;
            if (this.mShouldReverseLayout) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (this.mOrientationHelper.mo4913a(childAt) < e || this.mOrientationHelper.mo4921d(childAt) < e) {
                        recycleChildren(oVar, 0, i2);
                        return;
                    }
                }
            } else {
                int i3 = childCount - 1;
                for (int i4 = i3; i4 >= 0; i4--) {
                    View childAt2 = getChildAt(i4);
                    if (this.mOrientationHelper.mo4913a(childAt2) < e || this.mOrientationHelper.mo4921d(childAt2) < e) {
                        recycleChildren(oVar, i3, i4);
                        return;
                    }
                }
            }
        }
    }

    private void recycleByLayoutState(C0892o oVar, C0855c cVar) {
        if (cVar.f2704a && !cVar.f2715l) {
            if (cVar.f2709f == -1) {
                recycleViewsFromEnd(oVar, cVar.f2710g);
            } else {
                recycleViewsFromStart(oVar, cVar.f2710g);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public int fill(C0892o oVar, C0855c cVar, C0898s sVar, boolean z) {
        int i = cVar.f2706c;
        if (cVar.f2710g != Integer.MIN_VALUE) {
            if (cVar.f2706c < 0) {
                cVar.f2710g += cVar.f2706c;
            }
            recycleByLayoutState(oVar, cVar);
        }
        int i2 = cVar.f2706c + cVar.f2711h;
        C0854b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f2715l && i2 <= 0) || !cVar.mo3947a(sVar)) {
                break;
            }
            bVar.mo3943a();
            layoutChunk(oVar, sVar, cVar, bVar);
            if (!bVar.f2701b) {
                cVar.f2705b += bVar.f2700a * cVar.f2709f;
                if (!bVar.f2702c || this.mLayoutState.f2714k != null || !sVar.mo4480a()) {
                    cVar.f2706c -= bVar.f2700a;
                    i2 -= bVar.f2700a;
                }
                if (cVar.f2710g != Integer.MIN_VALUE) {
                    cVar.f2710g += bVar.f2700a;
                    if (cVar.f2706c < 0) {
                        cVar.f2710g += cVar.f2706c;
                    }
                    recycleByLayoutState(oVar, cVar);
                }
                if (z && bVar.f2703d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2706c;
    }

    /* access modifiers changed from: 0000 */
    public void layoutChunk(C0892o oVar, C0898s sVar, C0855c cVar, C0854b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo3944a(oVar);
        if (a == null) {
            bVar.f2701b = true;
            return;
        }
        LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
        if (cVar.f2714k == null) {
            if (this.mShouldReverseLayout == (cVar.f2709f == -1)) {
                addView(a);
            } else {
                addView(a, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f2709f == -1)) {
                addDisappearingView(a);
            } else {
                addDisappearingView(a, 0);
            }
        }
        measureChildWithMargins(a, 0, 0);
        bVar.f2700a = this.mOrientationHelper.mo4923e(a);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                i5 = getWidth() - getPaddingRight();
                i4 = i5 - this.mOrientationHelper.mo4925f(a);
            } else {
                i4 = getPaddingLeft();
                i5 = this.mOrientationHelper.mo4925f(a) + i4;
            }
            if (cVar.f2709f == -1) {
                i3 = cVar.f2705b - bVar.f2700a;
                i2 = i5;
                i = cVar.f2705b;
            } else {
                i = cVar.f2705b + bVar.f2700a;
                i2 = i5;
                i3 = cVar.f2705b;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f = this.mOrientationHelper.mo4925f(a) + paddingTop;
            if (cVar.f2709f == -1) {
                i3 = paddingTop;
                i2 = cVar.f2705b;
                i = f;
                i4 = cVar.f2705b - bVar.f2700a;
            } else {
                i2 = cVar.f2705b + bVar.f2700a;
                i3 = paddingTop;
                i = f;
                i4 = cVar.f2705b;
            }
        }
        layoutDecoratedWithMargins(a, i4, i3, i2, i);
        if (layoutParams.mo4193d() || layoutParams.mo4194e()) {
            bVar.f2702c = true;
        }
        bVar.f2703d = a.hasFocusable();
    }

    /* access modifiers changed from: 0000 */
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    public int convertFocusDirectionToLayoutDirection(int i) {
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        if (i == 17) {
            if (this.mOrientation != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.mOrientation != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.mOrientation == 0) {
                i3 = 1;
            }
            return i3;
        } else if (i != 130) {
            switch (i) {
                case 1:
                    return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
                case 2:
                    return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
                default:
                    return Integer.MIN_VALUE;
            }
        } else {
            if (this.mOrientation == 1) {
                i3 = 1;
            }
            return i3;
        }
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    private View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    private View findReferenceChildClosestToEnd(C0892o oVar, C0898s sVar) {
        if (this.mShouldReverseLayout) {
            return findFirstReferenceChild(oVar, sVar);
        }
        return findLastReferenceChild(oVar, sVar);
    }

    private View findReferenceChildClosestToStart(C0892o oVar, C0898s sVar) {
        if (this.mShouldReverseLayout) {
            return findLastReferenceChild(oVar, sVar);
        }
        return findFirstReferenceChild(oVar, sVar);
    }

    private View findFirstReferenceChild(C0892o oVar, C0898s sVar) {
        return findReferenceChild(oVar, sVar, 0, getChildCount(), sVar.mo4484e());
    }

    private View findLastReferenceChild(C0892o oVar, C0898s sVar) {
        return findReferenceChild(oVar, sVar, getChildCount() - 1, -1, sVar.mo4484e());
    }

    /* access modifiers changed from: 0000 */
    public View findReferenceChild(C0892o oVar, C0898s sVar, int i, int i2, int i3) {
        ensureLayoutState();
        int c = this.mOrientationHelper.mo4918c();
        int d = this.mOrientationHelper.mo4920d();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((LayoutParams) childAt.getLayoutParams()).mo4193d()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.mo4913a(childAt) < d && this.mOrientationHelper.mo4917b(childAt) >= c) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd(C0892o oVar, C0898s sVar) {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild(oVar, sVar);
        }
        return findLastPartiallyOrCompletelyInvisibleChild(oVar, sVar);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart(C0892o oVar, C0898s sVar) {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild(oVar, sVar);
        }
        return findFirstPartiallyOrCompletelyInvisibleChild(oVar, sVar);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild(C0892o oVar, C0898s sVar) {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild(C0892o oVar, C0898s sVar) {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    /* access modifiers changed from: 0000 */
    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.mo5158a(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.mo5158a(i, i2, i4, i3);
    }

    /* access modifiers changed from: 0000 */
    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        View view;
        ensureLayoutState();
        char c = i2 > i ? 1 : i2 < i ? (char) 65535 : 0;
        if (c == 0) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo4913a(getChildAt(i)) < this.mOrientationHelper.mo4918c()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.mOrientation == 0) {
            view = this.mHorizontalBoundCheck.mo5158a(i, i2, i4, i3);
        } else {
            view = this.mVerticalBoundCheck.mo5158a(i, i2, i4, i3);
        }
        return view;
    }

    public View onFocusSearchFailed(View view, int i, C0892o oVar, C0898s sVar) {
        View view2;
        View view3;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0) {
            return null;
        }
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (MAX_SCROLL_FACTOR * ((float) this.mOrientationHelper.mo4924f())), false, sVar);
        this.mLayoutState.f2710g = Integer.MIN_VALUE;
        this.mLayoutState.f2704a = false;
        fill(oVar, this.mLayoutState, sVar, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToStart(oVar, sVar);
        } else {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToEnd(oVar, sVar);
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            view3 = getChildClosestToStart();
        } else {
            view3 = getChildClosestToEnd();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("item ");
            sb.append(getPosition(childAt));
            sb.append(", coord:");
            sb.append(this.mOrientationHelper.mo4913a(childAt));
            Log.d(str, sb.toString());
        }
        Log.d(TAG, "==============");
    }

    /* access modifiers changed from: 0000 */
    public void validateChildOrder() {
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("validating child count ");
        sb.append(getChildCount());
        Log.d(str, sb.toString());
        if (getChildCount() >= 1) {
            boolean z = false;
            int position = getPosition(getChildAt(0));
            int a = this.mOrientationHelper.mo4913a(getChildAt(0));
            if (this.mShouldReverseLayout) {
                int i = 1;
                while (i < getChildCount()) {
                    View childAt = getChildAt(i);
                    int position2 = getPosition(childAt);
                    int a2 = this.mOrientationHelper.mo4913a(childAt);
                    if (position2 < position) {
                        logChildren();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("detected invalid position. loc invalid? ");
                        if (a2 < a) {
                            z = true;
                        }
                        sb2.append(z);
                        throw new RuntimeException(sb2.toString());
                    } else if (a2 > a) {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    } else {
                        i++;
                    }
                }
            } else {
                int i2 = 1;
                while (i2 < getChildCount()) {
                    View childAt2 = getChildAt(i2);
                    int position3 = getPosition(childAt2);
                    int a3 = this.mOrientationHelper.mo4913a(childAt2);
                    if (position3 < position) {
                        logChildren();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("detected invalid position. loc invalid? ");
                        if (a3 < a) {
                            z = true;
                        }
                        sb3.append(z);
                        throw new RuntimeException(sb3.toString());
                    } else if (a3 < a) {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        boolean z = position < position2 ? true : true;
        if (this.mShouldReverseLayout) {
            if (z) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4920d() - (this.mOrientationHelper.mo4913a(view2) + this.mOrientationHelper.mo4923e(view)));
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4920d() - this.mOrientationHelper.mo4917b(view2));
            }
        } else if (z) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4913a(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4917b(view2) - this.mOrientationHelper.mo4923e(view));
        }
    }
}
