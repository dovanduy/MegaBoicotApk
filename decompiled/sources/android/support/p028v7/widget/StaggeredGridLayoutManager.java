package android.support.p028v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p017v4.view.p026a.C0564b;
import android.support.p017v4.view.p026a.C0564b.C0567c;
import android.support.p028v7.widget.RecyclerView.C0881i;
import android.support.p028v7.widget.RecyclerView.C0881i.C0884a;
import android.support.p028v7.widget.RecyclerView.C0881i.C0885b;
import android.support.p028v7.widget.RecyclerView.C0892o;
import android.support.p028v7.widget.RecyclerView.C0895r.C0897b;
import android.support.p028v7.widget.RecyclerView.C0898s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: android.support.v7.widget.StaggeredGridLayoutManager */
public class StaggeredGridLayoutManager extends C0881i implements C0897b {

    /* renamed from: a */
    C0923b[] f2909a;

    /* renamed from: b */
    C0948ah f2910b;

    /* renamed from: c */
    C0948ah f2911c;

    /* renamed from: d */
    boolean f2912d = false;

    /* renamed from: e */
    boolean f2913e = false;

    /* renamed from: f */
    int f2914f = -1;

    /* renamed from: g */
    int f2915g = Integer.MIN_VALUE;

    /* renamed from: h */
    LazySpanLookup f2916h = new LazySpanLookup();

    /* renamed from: i */
    private int f2917i = -1;

    /* renamed from: j */
    private int f2918j;

    /* renamed from: k */
    private int f2919k;

    /* renamed from: l */
    private final C0941ac f2920l;

    /* renamed from: m */
    private BitSet f2921m;

    /* renamed from: n */
    private int f2922n = 2;

    /* renamed from: o */
    private boolean f2923o;

    /* renamed from: p */
    private boolean f2924p;

    /* renamed from: q */
    private SavedState f2925q;

    /* renamed from: r */
    private int f2926r;

    /* renamed from: s */
    private final Rect f2927s = new Rect();

    /* renamed from: t */
    private final C0922a f2928t = new C0922a();

    /* renamed from: u */
    private boolean f2929u = false;

    /* renamed from: v */
    private boolean f2930v = true;

    /* renamed from: w */
    private int[] f2931w;

    /* renamed from: x */
    private final Runnable f2932x = new Runnable() {
        public void run() {
            StaggeredGridLayoutManager.this.mo4629a();
        }
    };

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams */
    public static class LayoutParams extends android.support.p028v7.widget.RecyclerView.LayoutParams {

        /* renamed from: a */
        C0923b f2934a;

        /* renamed from: b */
        boolean f2935b;

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

        /* renamed from: a */
        public boolean mo4644a() {
            return this.f2935b;
        }

        /* renamed from: b */
        public final int mo4645b() {
            if (this.f2934a == null) {
                return -1;
            }
            return this.f2934a.f2963e;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup */
    static class LazySpanLookup {

        /* renamed from: a */
        int[] f2936a;

        /* renamed from: b */
        List<FullSpanItem> f2937b;

        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem */
        static class FullSpanItem implements Parcelable {
            public static final Creator<FullSpanItem> CREATOR = new Creator<FullSpanItem>() {
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: a */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            };

            /* renamed from: a */
            int f2938a;

            /* renamed from: b */
            int f2939b;

            /* renamed from: c */
            int[] f2940c;

            /* renamed from: d */
            boolean f2941d;

            public int describeContents() {
                return 0;
            }

            FullSpanItem(Parcel parcel) {
                this.f2938a = parcel.readInt();
                this.f2939b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.f2941d = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f2940c = new int[readInt];
                    parcel.readIntArray(this.f2940c);
                }
            }

            FullSpanItem() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public int mo4658a(int i) {
                if (this.f2940c == null) {
                    return 0;
                }
                return this.f2940c[i];
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2938a);
                parcel.writeInt(this.f2939b);
                parcel.writeInt(this.f2941d ? 1 : 0);
                if (this.f2940c == null || this.f2940c.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(this.f2940c.length);
                parcel.writeIntArray(this.f2940c);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("FullSpanItem{mPosition=");
                sb.append(this.f2938a);
                sb.append(", mGapDir=");
                sb.append(this.f2939b);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.f2941d);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.f2940c));
                sb.append('}');
                return sb.toString();
            }
        }

        LazySpanLookup() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4646a(int i) {
            if (this.f2937b != null) {
                for (int size = this.f2937b.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f2937b.get(size)).f2938a >= i) {
                        this.f2937b.remove(size);
                    }
                }
            }
            return mo4652b(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4652b(int i) {
            if (this.f2936a == null || i >= this.f2936a.length) {
                return -1;
            }
            int g = m4009g(i);
            if (g == -1) {
                Arrays.fill(this.f2936a, i, this.f2936a.length, -1);
                return this.f2936a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f2936a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo4654c(int i) {
            if (this.f2936a == null || i >= this.f2936a.length) {
                return -1;
            }
            return this.f2936a[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4650a(int i, C0923b bVar) {
            mo4656e(i);
            this.f2936a[i] = bVar.f2963e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo4655d(int i) {
            int length = this.f2936a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo4656e(int i) {
            if (this.f2936a == null) {
                this.f2936a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f2936a, -1);
            } else if (i >= this.f2936a.length) {
                int[] iArr = this.f2936a;
                this.f2936a = new int[mo4655d(i)];
                System.arraycopy(iArr, 0, this.f2936a, 0, iArr.length);
                Arrays.fill(this.f2936a, iArr.length, this.f2936a.length, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4648a() {
            if (this.f2936a != null) {
                Arrays.fill(this.f2936a, -1);
            }
            this.f2937b = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4649a(int i, int i2) {
            if (this.f2936a != null && i < this.f2936a.length) {
                int i3 = i + i2;
                mo4656e(i3);
                System.arraycopy(this.f2936a, i3, this.f2936a, i, (this.f2936a.length - i) - i2);
                Arrays.fill(this.f2936a, this.f2936a.length - i2, this.f2936a.length, -1);
                m4007c(i, i2);
            }
        }

        /* renamed from: c */
        private void m4007c(int i, int i2) {
            if (this.f2937b != null) {
                int i3 = i + i2;
                for (int size = this.f2937b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f2937b.get(size);
                    if (fullSpanItem.f2938a >= i) {
                        if (fullSpanItem.f2938a < i3) {
                            this.f2937b.remove(size);
                        } else {
                            fullSpanItem.f2938a -= i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4653b(int i, int i2) {
            if (this.f2936a != null && i < this.f2936a.length) {
                int i3 = i + i2;
                mo4656e(i3);
                System.arraycopy(this.f2936a, i, this.f2936a, i3, (this.f2936a.length - i) - i2);
                Arrays.fill(this.f2936a, i, i3, -1);
                m4008d(i, i2);
            }
        }

        /* renamed from: d */
        private void m4008d(int i, int i2) {
            if (this.f2937b != null) {
                for (int size = this.f2937b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f2937b.get(size);
                    if (fullSpanItem.f2938a >= i) {
                        fullSpanItem.f2938a += i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m4009g(int i) {
            if (this.f2937b == null) {
                return -1;
            }
            FullSpanItem f = mo4657f(i);
            if (f != null) {
                this.f2937b.remove(f);
            }
            int size = this.f2937b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((FullSpanItem) this.f2937b.get(i2)).f2938a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f2937b.get(i2);
            this.f2937b.remove(i2);
            return fullSpanItem.f2938a;
        }

        /* renamed from: a */
        public void mo4651a(FullSpanItem fullSpanItem) {
            if (this.f2937b == null) {
                this.f2937b = new ArrayList();
            }
            int size = this.f2937b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f2937b.get(i);
                if (fullSpanItem2.f2938a == fullSpanItem.f2938a) {
                    this.f2937b.remove(i);
                }
                if (fullSpanItem2.f2938a >= fullSpanItem.f2938a) {
                    this.f2937b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f2937b.add(fullSpanItem);
        }

        /* renamed from: f */
        public FullSpanItem mo4657f(int i) {
            if (this.f2937b == null) {
                return null;
            }
            for (int size = this.f2937b.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f2937b.get(size);
                if (fullSpanItem.f2938a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: a */
        public FullSpanItem mo4647a(int i, int i2, int i3, boolean z) {
            if (this.f2937b == null) {
                return null;
            }
            int size = this.f2937b.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f2937b.get(i4);
                if (fullSpanItem.f2938a >= i2) {
                    return null;
                }
                if (fullSpanItem.f2938a >= i && (i3 == 0 || fullSpanItem.f2939b == i3 || (z && fullSpanItem.f2941d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$SavedState */
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
        int f2942a;

        /* renamed from: b */
        int f2943b;

        /* renamed from: c */
        int f2944c;

        /* renamed from: d */
        int[] f2945d;

        /* renamed from: e */
        int f2946e;

        /* renamed from: f */
        int[] f2947f;

        /* renamed from: g */
        List<FullSpanItem> f2948g;

        /* renamed from: h */
        boolean f2949h;

        /* renamed from: i */
        boolean f2950i;

        /* renamed from: j */
        boolean f2951j;

        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f2942a = parcel.readInt();
            this.f2943b = parcel.readInt();
            this.f2944c = parcel.readInt();
            if (this.f2944c > 0) {
                this.f2945d = new int[this.f2944c];
                parcel.readIntArray(this.f2945d);
            }
            this.f2946e = parcel.readInt();
            if (this.f2946e > 0) {
                this.f2947f = new int[this.f2946e];
                parcel.readIntArray(this.f2947f);
            }
            boolean z = false;
            this.f2949h = parcel.readInt() == 1;
            this.f2950i = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f2951j = z;
            this.f2948g = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f2944c = savedState.f2944c;
            this.f2942a = savedState.f2942a;
            this.f2943b = savedState.f2943b;
            this.f2945d = savedState.f2945d;
            this.f2946e = savedState.f2946e;
            this.f2947f = savedState.f2947f;
            this.f2949h = savedState.f2949h;
            this.f2950i = savedState.f2950i;
            this.f2951j = savedState.f2951j;
            this.f2948g = savedState.f2948g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4666a() {
            this.f2945d = null;
            this.f2944c = 0;
            this.f2946e = 0;
            this.f2947f = null;
            this.f2948g = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4667b() {
            this.f2945d = null;
            this.f2944c = 0;
            this.f2942a = -1;
            this.f2943b = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2942a);
            parcel.writeInt(this.f2943b);
            parcel.writeInt(this.f2944c);
            if (this.f2944c > 0) {
                parcel.writeIntArray(this.f2945d);
            }
            parcel.writeInt(this.f2946e);
            if (this.f2946e > 0) {
                parcel.writeIntArray(this.f2947f);
            }
            parcel.writeInt(this.f2949h ? 1 : 0);
            parcel.writeInt(this.f2950i ? 1 : 0);
            parcel.writeInt(this.f2951j ? 1 : 0);
            parcel.writeList(this.f2948g);
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$a */
    class C0922a {

        /* renamed from: a */
        int f2952a;

        /* renamed from: b */
        int f2953b;

        /* renamed from: c */
        boolean f2954c;

        /* renamed from: d */
        boolean f2955d;

        /* renamed from: e */
        boolean f2956e;

        /* renamed from: f */
        int[] f2957f;

        C0922a() {
            mo4674a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4674a() {
            this.f2952a = -1;
            this.f2953b = Integer.MIN_VALUE;
            this.f2954c = false;
            this.f2955d = false;
            this.f2956e = false;
            if (this.f2957f != null) {
                Arrays.fill(this.f2957f, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4676a(C0923b[] bVarArr) {
            int length = bVarArr.length;
            if (this.f2957f == null || this.f2957f.length < length) {
                this.f2957f = new int[StaggeredGridLayoutManager.this.f2909a.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2957f[i] = bVarArr[i].mo4678a(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4677b() {
            int i;
            if (this.f2954c) {
                i = StaggeredGridLayoutManager.this.f2910b.mo4920d();
            } else {
                i = StaggeredGridLayoutManager.this.f2910b.mo4918c();
            }
            this.f2953b = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4675a(int i) {
            if (this.f2954c) {
                this.f2953b = StaggeredGridLayoutManager.this.f2910b.mo4920d() - i;
            } else {
                this.f2953b = StaggeredGridLayoutManager.this.f2910b.mo4918c() + i;
            }
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$b */
    class C0923b {

        /* renamed from: a */
        ArrayList<View> f2959a = new ArrayList<>();

        /* renamed from: b */
        int f2960b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f2961c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f2962d = 0;

        /* renamed from: e */
        final int f2963e;

        C0923b(int i) {
            this.f2963e = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4678a(int i) {
            if (this.f2960b != Integer.MIN_VALUE) {
                return this.f2960b;
            }
            if (this.f2959a.size() == 0) {
                return i;
            }
            mo4682a();
            return this.f2960b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4682a() {
            View view = (View) this.f2959a.get(0);
            LayoutParams c = mo4688c(view);
            this.f2960b = StaggeredGridLayoutManager.this.f2910b.mo4913a(view);
            if (c.f2935b) {
                FullSpanItem f = StaggeredGridLayoutManager.this.f2916h.mo4657f(c.mo4195f());
                if (f != null && f.f2939b == -1) {
                    this.f2960b -= f.mo4658a(this.f2963e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4685b() {
            if (this.f2960b != Integer.MIN_VALUE) {
                return this.f2960b;
            }
            mo4682a();
            return this.f2960b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4686b(int i) {
            if (this.f2961c != Integer.MIN_VALUE) {
                return this.f2961c;
            }
            if (this.f2959a.size() == 0) {
                return i;
            }
            mo4689c();
            return this.f2961c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4689c() {
            View view = (View) this.f2959a.get(this.f2959a.size() - 1);
            LayoutParams c = mo4688c(view);
            this.f2961c = StaggeredGridLayoutManager.this.f2910b.mo4917b(view);
            if (c.f2935b) {
                FullSpanItem f = StaggeredGridLayoutManager.this.f2916h.mo4657f(c.mo4195f());
                if (f != null && f.f2939b == 1) {
                    this.f2961c += f.mo4658a(this.f2963e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo4691d() {
            if (this.f2961c != Integer.MIN_VALUE) {
                return this.f2961c;
            }
            mo4689c();
            return this.f2961c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4683a(View view) {
            LayoutParams c = mo4688c(view);
            c.f2934a = this;
            this.f2959a.add(0, view);
            this.f2960b = Integer.MIN_VALUE;
            if (this.f2959a.size() == 1) {
                this.f2961c = Integer.MIN_VALUE;
            }
            if (c.mo4193d() || c.mo4194e()) {
                this.f2962d += StaggeredGridLayoutManager.this.f2910b.mo4923e(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4687b(View view) {
            LayoutParams c = mo4688c(view);
            c.f2934a = this;
            this.f2959a.add(view);
            this.f2961c = Integer.MIN_VALUE;
            if (this.f2959a.size() == 1) {
                this.f2960b = Integer.MIN_VALUE;
            }
            if (c.mo4193d() || c.mo4194e()) {
                this.f2962d += StaggeredGridLayoutManager.this.f2910b.mo4923e(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4684a(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo4686b(Integer.MIN_VALUE);
            } else {
                i2 = mo4678a(Integer.MIN_VALUE);
            }
            mo4693e();
            if (i2 != Integer.MIN_VALUE) {
                if ((!z || i2 >= StaggeredGridLayoutManager.this.f2910b.mo4920d()) && (z || i2 <= StaggeredGridLayoutManager.this.f2910b.mo4918c())) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f2961c = i2;
                    this.f2960b = i2;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo4693e() {
            this.f2959a.clear();
            mo4694f();
            this.f2962d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo4694f() {
            this.f2960b = Integer.MIN_VALUE;
            this.f2961c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4690c(int i) {
            this.f2960b = i;
            this.f2961c = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo4695g() {
            int size = this.f2959a.size();
            View view = (View) this.f2959a.remove(size - 1);
            LayoutParams c = mo4688c(view);
            c.f2934a = null;
            if (c.mo4193d() || c.mo4194e()) {
                this.f2962d -= StaggeredGridLayoutManager.this.f2910b.mo4923e(view);
            }
            if (size == 1) {
                this.f2960b = Integer.MIN_VALUE;
            }
            this.f2961c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo4696h() {
            View view = (View) this.f2959a.remove(0);
            LayoutParams c = mo4688c(view);
            c.f2934a = null;
            if (this.f2959a.size() == 0) {
                this.f2961c = Integer.MIN_VALUE;
            }
            if (c.mo4193d() || c.mo4194e()) {
                this.f2962d -= StaggeredGridLayoutManager.this.f2910b.mo4923e(view);
            }
            this.f2960b = Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public int mo4697i() {
            return this.f2962d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public LayoutParams mo4688c(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4692d(int i) {
            if (this.f2960b != Integer.MIN_VALUE) {
                this.f2960b += i;
            }
            if (this.f2961c != Integer.MIN_VALUE) {
                this.f2961c += i;
            }
        }

        /* renamed from: j */
        public int mo4698j() {
            if (StaggeredGridLayoutManager.this.f2912d) {
                return mo4679a(this.f2959a.size() - 1, -1, true);
            }
            return mo4679a(0, this.f2959a.size(), true);
        }

        /* renamed from: k */
        public int mo4699k() {
            if (StaggeredGridLayoutManager.this.f2912d) {
                return mo4679a(0, this.f2959a.size(), true);
            }
            return mo4679a(this.f2959a.size() - 1, -1, true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4680a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int c = StaggeredGridLayoutManager.this.f2910b.mo4918c();
            int d = StaggeredGridLayoutManager.this.f2910b.mo4920d();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.f2959a.get(i);
                int a = StaggeredGridLayoutManager.this.f2910b.mo4913a(view);
                int b = StaggeredGridLayoutManager.this.f2910b.mo4917b(view);
                boolean z4 = false;
                boolean z5 = !z3 ? a < d : a <= d;
                if (!z3 ? b > c : b >= c) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (a < c || b > d) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else if (a >= c && b <= d) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4679a(int i, int i2, boolean z) {
            return mo4680a(i, i2, false, false, z);
        }

        /* renamed from: a */
        public View mo4681a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2959a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f2959a.get(size);
                    if ((StaggeredGridLayoutManager.this.f2912d && StaggeredGridLayoutManager.this.getPosition(view2) >= i) || ((!StaggeredGridLayoutManager.this.f2912d && StaggeredGridLayoutManager.this.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2959a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f2959a.get(i3);
                    if ((StaggeredGridLayoutManager.this.f2912d && StaggeredGridLayoutManager.this.getPosition(view3) <= i) || ((!StaggeredGridLayoutManager.this.f2912d && StaggeredGridLayoutManager.this.getPosition(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0885b properties = getProperties(context, attributeSet, i, i2);
        mo4632b(properties.f2782a);
        mo4625a(properties.f2783b);
        mo4628a(properties.f2784c);
        this.f2920l = new C0941ac();
        m3978j();
    }

    public boolean isAutoMeasureEnabled() {
        return this.f2922n != 0;
    }

    /* renamed from: j */
    private void m3978j() {
        this.f2910b = C0948ah.m4185a(this, this.f2918j);
        this.f2911c = C0948ah.m4185a(this, 1 - this.f2918j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4629a() {
        int i;
        int i2;
        if (getChildCount() == 0 || this.f2922n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f2913e) {
            i2 = mo4641h();
            i = mo4642i();
        } else {
            i2 = mo4642i();
            i = mo4641h();
        }
        if (i2 == 0 && mo4630b() != null) {
            this.f2916h.mo4648a();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else if (!this.f2929u) {
            return false;
        } else {
            int i3 = this.f2913e ? -1 : 1;
            int i4 = i + 1;
            FullSpanItem a = this.f2916h.mo4647a(i2, i4, i3, true);
            if (a == null) {
                this.f2929u = false;
                this.f2916h.mo4646a(i4);
                return false;
            }
            FullSpanItem a2 = this.f2916h.mo4647a(i2, a.f2938a, i3 * -1, true);
            if (a2 == null) {
                this.f2916h.mo4646a(a.f2938a);
            } else {
                this.f2916h.mo4646a(a2.f2938a + 1);
            }
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
    }

    public void onScrollStateChanged(int i) {
        if (i == 0) {
            mo4629a();
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, C0892o oVar) {
        super.onDetachedFromWindow(recyclerView, oVar);
        removeCallbacks(this.f2932x);
        for (int i = 0; i < this.f2917i; i++) {
            this.f2909a[i].mo4693e();
        }
        recyclerView.requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4630b() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2917i
            r2.<init>(r3)
            int r3 = r12.f2917i
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2918j
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo4637d()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.f2913e
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams r8 = (android.support.p028v7.widget.StaggeredGridLayoutManager.LayoutParams) r8
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r8.f2934a
            int r9 = r9.f2963e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r8.f2934a
            boolean r9 = r12.m3961a(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r8.f2934a
            int r9 = r9.f2963e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f2935b
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f2913e
            if (r10 == 0) goto L_0x0077
            android.support.v7.widget.ah r10 = r12.f2910b
            int r10 = r10.mo4917b(r7)
            android.support.v7.widget.ah r11 = r12.f2910b
            int r11 = r11.mo4917b(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            android.support.v7.widget.ah r10 = r12.f2910b
            int r10 = r10.mo4913a(r7)
            android.support.v7.widget.ah r11 = r12.f2910b
            int r11 = r11.mo4913a(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = r1
            goto L_0x008b
        L_0x008a:
            r10 = r4
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams r9 = (android.support.p028v7.widget.StaggeredGridLayoutManager.LayoutParams) r9
            android.support.v7.widget.StaggeredGridLayoutManager$b r8 = r8.f2934a
            int r8 = r8.f2963e
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r9.f2934a
            int r9 = r9.f2963e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = r1
            goto L_0x00a1
        L_0x00a0:
            r8 = r4
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = r1
            goto L_0x00a6
        L_0x00a5:
            r9 = r4
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.StaggeredGridLayoutManager.mo4630b():android.view.View");
    }

    /* renamed from: a */
    private boolean m3961a(C0923b bVar) {
        if (this.f2913e) {
            if (bVar.mo4691d() < this.f2910b.mo4920d()) {
                return !bVar.mo4688c((View) bVar.f2959a.get(bVar.f2959a.size() - 1)).f2935b;
            }
        } else if (bVar.mo4685b() > this.f2910b.mo4918c()) {
            return !bVar.mo4688c((View) bVar.f2959a.get(0)).f2935b;
        }
        return false;
    }

    /* renamed from: a */
    public void mo4625a(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.f2917i) {
            mo4635c();
            this.f2917i = i;
            this.f2921m = new BitSet(this.f2917i);
            this.f2909a = new C0923b[this.f2917i];
            for (int i2 = 0; i2 < this.f2917i; i2++) {
                this.f2909a[i2] = new C0923b(i2);
            }
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo4632b(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll(null);
            if (i != this.f2918j) {
                this.f2918j = i;
                C0948ah ahVar = this.f2910b;
                this.f2910b = this.f2911c;
                this.f2911c = ahVar;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: a */
    public void mo4628a(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (!(this.f2925q == null || this.f2925q.f2949h == z)) {
            this.f2925q.f2949h = z;
        }
        this.f2912d = z;
        requestLayout();
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.f2925q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* renamed from: c */
    public void mo4635c() {
        this.f2916h.mo4648a();
        requestLayout();
    }

    /* renamed from: k */
    private void m3979k() {
        if (this.f2918j == 1 || !mo4637d()) {
            this.f2913e = this.f2912d;
        } else {
            this.f2913e = !this.f2912d;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo4637d() {
        return getLayoutDirection() == 1;
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f2918j == 1) {
            i4 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i3 = chooseSize(i, (this.f2919k * this.f2917i) + paddingLeft, getMinimumWidth());
        } else {
            i3 = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            i4 = chooseSize(i2, (this.f2919k * this.f2917i) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    public void onLayoutChildren(C0892o oVar, C0898s sVar) {
        m3953a(oVar, sVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0163, code lost:
        if (mo4629a() != false) goto L_0x0167;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3953a(android.support.p028v7.widget.RecyclerView.C0892o r9, android.support.p028v7.widget.RecyclerView.C0898s r10, boolean r11) {
        /*
            r8 = this;
            android.support.v7.widget.StaggeredGridLayoutManager$a r0 = r8.f2928t
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f2925q
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f2914f
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4484e()
            if (r1 != 0) goto L_0x0018
            r8.removeAndRecycleAllViews(r9)
            r0.mo4674a()
            return
        L_0x0018:
            boolean r1 = r0.f2956e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f2914f
            if (r1 != r2) goto L_0x0029
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f2925q
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo4674a()
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f2925q
            if (r5 == 0) goto L_0x0037
            r8.m3955a(r0)
            goto L_0x003e
        L_0x0037:
            r8.m3979k()
            boolean r5 = r8.f2913e
            r0.f2954c = r5
        L_0x003e:
            r8.mo4627a(r10, r0)
            r0.f2956e = r4
        L_0x0043:
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f2925q
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f2914f
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f2954c
            boolean r6 = r8.f2923o
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo4637d()
            boolean r6 = r8.f2924p
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f2916h
            r5.mo4648a()
            r0.f2955d = r4
        L_0x0060:
            int r5 = r8.getChildCount()
            if (r5 <= 0) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f2925q
            if (r5 == 0) goto L_0x0070
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f2925q
            int r5 = r5.f2944c
            if (r5 >= r4) goto L_0x00cd
        L_0x0070:
            boolean r5 = r0.f2955d
            if (r5 == 0) goto L_0x0092
            r1 = r3
        L_0x0075:
            int r5 = r8.f2917i
            if (r1 >= r5) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f2909a
            r5 = r5[r1]
            r5.mo4693e()
            int r5 = r0.f2953b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008f
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f2909a
            r5 = r5[r1]
            int r6 = r0.f2953b
            r5.mo4690c(r6)
        L_0x008f:
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0092:
            if (r1 != 0) goto L_0x00b3
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f2928t
            int[] r1 = r1.f2957f
            if (r1 != 0) goto L_0x009b
            goto L_0x00b3
        L_0x009b:
            r1 = r3
        L_0x009c:
            int r5 = r8.f2917i
            if (r1 >= r5) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f2909a
            r5 = r5[r1]
            r5.mo4693e()
            android.support.v7.widget.StaggeredGridLayoutManager$a r6 = r8.f2928t
            int[] r6 = r6.f2957f
            r6 = r6[r1]
            r5.mo4690c(r6)
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00b3:
            r1 = r3
        L_0x00b4:
            int r5 = r8.f2917i
            if (r1 >= r5) goto L_0x00c6
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f2909a
            r5 = r5[r1]
            boolean r6 = r8.f2913e
            int r7 = r0.f2953b
            r5.mo4684a(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b4
        L_0x00c6:
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f2928t
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f2909a
            r1.mo4676a(r5)
        L_0x00cd:
            r8.detachAndScrapAttachedViews(r9)
            android.support.v7.widget.ac r1 = r8.f2920l
            r1.f3097a = r3
            r8.f2929u = r3
            android.support.v7.widget.ah r1 = r8.f2911c
            int r1 = r1.mo4924f()
            r8.mo4636c(r1)
            int r1 = r0.f2952a
            r8.m3964b(r1, r10)
            boolean r1 = r0.f2954c
            if (r1 == 0) goto L_0x0104
            r8.m3971d(r2)
            android.support.v7.widget.ac r1 = r8.f2920l
            r8.m3948a(r9, r1, r10)
            r8.m3971d(r4)
            android.support.v7.widget.ac r1 = r8.f2920l
            int r2 = r0.f2952a
            android.support.v7.widget.ac r5 = r8.f2920l
            int r5 = r5.f3100d
            int r2 = r2 + r5
            r1.f3099c = r2
            android.support.v7.widget.ac r1 = r8.f2920l
            r8.m3948a(r9, r1, r10)
            goto L_0x011f
        L_0x0104:
            r8.m3971d(r4)
            android.support.v7.widget.ac r1 = r8.f2920l
            r8.m3948a(r9, r1, r10)
            r8.m3971d(r2)
            android.support.v7.widget.ac r1 = r8.f2920l
            int r2 = r0.f2952a
            android.support.v7.widget.ac r5 = r8.f2920l
            int r5 = r5.f3100d
            int r2 = r2 + r5
            r1.f3099c = r2
            android.support.v7.widget.ac r1 = r8.f2920l
            r8.m3948a(r9, r1, r10)
        L_0x011f:
            r8.m3982l()
            int r1 = r8.getChildCount()
            if (r1 <= 0) goto L_0x0139
            boolean r1 = r8.f2913e
            if (r1 == 0) goto L_0x0133
            r8.m3966b(r9, r10, r4)
            r8.m3969c(r9, r10, r3)
            goto L_0x0139
        L_0x0133:
            r8.m3969c(r9, r10, r4)
            r8.m3966b(r9, r10, r3)
        L_0x0139:
            if (r11 == 0) goto L_0x0166
            boolean r11 = r10.mo4480a()
            if (r11 != 0) goto L_0x0166
            int r11 = r8.f2922n
            if (r11 == 0) goto L_0x0157
            int r11 = r8.getChildCount()
            if (r11 <= 0) goto L_0x0157
            boolean r11 = r8.f2929u
            if (r11 != 0) goto L_0x0155
            android.view.View r11 = r8.mo4630b()
            if (r11 == 0) goto L_0x0157
        L_0x0155:
            r11 = r4
            goto L_0x0158
        L_0x0157:
            r11 = r3
        L_0x0158:
            if (r11 == 0) goto L_0x0166
            java.lang.Runnable r11 = r8.f2932x
            r8.removeCallbacks(r11)
            boolean r11 = r8.mo4629a()
            if (r11 == 0) goto L_0x0166
            goto L_0x0167
        L_0x0166:
            r4 = r3
        L_0x0167:
            boolean r11 = r10.mo4480a()
            if (r11 == 0) goto L_0x0172
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f2928t
            r11.mo4674a()
        L_0x0172:
            boolean r11 = r0.f2954c
            r8.f2923o = r11
            boolean r11 = r8.mo4637d()
            r8.f2924p = r11
            if (r4 == 0) goto L_0x0186
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f2928t
            r11.mo4674a()
            r8.m3953a(r9, r10, r3)
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.StaggeredGridLayoutManager.m3953a(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s, boolean):void");
    }

    public void onLayoutCompleted(C0898s sVar) {
        super.onLayoutCompleted(sVar);
        this.f2914f = -1;
        this.f2915g = Integer.MIN_VALUE;
        this.f2925q = null;
        this.f2928t.mo4674a();
    }

    /* renamed from: l */
    private void m3982l() {
        if (this.f2911c.mo4927h() != 1073741824) {
            int childCount = getChildCount();
            float f = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                float e = (float) this.f2911c.mo4923e(childAt);
                if (e >= f) {
                    if (((LayoutParams) childAt.getLayoutParams()).mo4644a()) {
                        e = (1.0f * e) / ((float) this.f2917i);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f2919k;
            int round = Math.round(f * ((float) this.f2917i));
            if (this.f2911c.mo4927h() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2911c.mo4924f());
            }
            mo4636c(round);
            if (this.f2919k != i2) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt2 = getChildAt(i3);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (!layoutParams.f2935b) {
                        if (!mo4637d() || this.f2918j != 1) {
                            int i4 = layoutParams.f2934a.f2963e * this.f2919k;
                            int i5 = layoutParams.f2934a.f2963e * i2;
                            if (this.f2918j == 1) {
                                childAt2.offsetLeftAndRight(i4 - i5);
                            } else {
                                childAt2.offsetTopAndBottom(i4 - i5);
                            }
                        } else {
                            childAt2.offsetLeftAndRight(((-((this.f2917i - 1) - layoutParams.f2934a.f2963e)) * this.f2919k) - ((-((this.f2917i - 1) - layoutParams.f2934a.f2963e)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m3955a(C0922a aVar) {
        if (this.f2925q.f2944c > 0) {
            if (this.f2925q.f2944c == this.f2917i) {
                for (int i = 0; i < this.f2917i; i++) {
                    this.f2909a[i].mo4693e();
                    int i2 = this.f2925q.f2945d[i];
                    if (i2 != Integer.MIN_VALUE) {
                        if (this.f2925q.f2950i) {
                            i2 += this.f2910b.mo4920d();
                        } else {
                            i2 += this.f2910b.mo4918c();
                        }
                    }
                    this.f2909a[i].mo4690c(i2);
                }
            } else {
                this.f2925q.mo4666a();
                this.f2925q.f2942a = this.f2925q.f2943b;
            }
        }
        this.f2924p = this.f2925q.f2951j;
        mo4628a(this.f2925q.f2949h);
        m3979k();
        if (this.f2925q.f2942a != -1) {
            this.f2914f = this.f2925q.f2942a;
            aVar.f2954c = this.f2925q.f2950i;
        } else {
            aVar.f2954c = this.f2913e;
        }
        if (this.f2925q.f2946e > 1) {
            this.f2916h.f2936a = this.f2925q.f2947f;
            this.f2916h.f2937b = this.f2925q.f2948g;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4627a(C0898s sVar, C0922a aVar) {
        if (!mo4633b(sVar, aVar) && !m3970c(sVar, aVar)) {
            aVar.mo4677b();
            aVar.f2952a = 0;
        }
    }

    /* renamed from: c */
    private boolean m3970c(C0898s sVar, C0922a aVar) {
        int i;
        if (this.f2923o) {
            i = m3984n(sVar.mo4484e());
        } else {
            i = m3983m(sVar.mo4484e());
        }
        aVar.f2952a = i;
        aVar.f2953b = Integer.MIN_VALUE;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4633b(C0898s sVar, C0922a aVar) {
        int i;
        int i2;
        boolean z = false;
        if (sVar.mo4480a() || this.f2914f == -1) {
            return false;
        }
        if (this.f2914f < 0 || this.f2914f >= sVar.mo4484e()) {
            this.f2914f = -1;
            this.f2915g = Integer.MIN_VALUE;
            return false;
        }
        if (this.f2925q == null || this.f2925q.f2942a == -1 || this.f2925q.f2944c < 1) {
            View findViewByPosition = findViewByPosition(this.f2914f);
            if (findViewByPosition != null) {
                if (this.f2913e) {
                    i = mo4641h();
                } else {
                    i = mo4642i();
                }
                aVar.f2952a = i;
                if (this.f2915g != Integer.MIN_VALUE) {
                    if (aVar.f2954c) {
                        aVar.f2953b = (this.f2910b.mo4920d() - this.f2915g) - this.f2910b.mo4917b(findViewByPosition);
                    } else {
                        aVar.f2953b = (this.f2910b.mo4918c() + this.f2915g) - this.f2910b.mo4913a(findViewByPosition);
                    }
                    return true;
                } else if (this.f2910b.mo4923e(findViewByPosition) > this.f2910b.mo4924f()) {
                    if (aVar.f2954c) {
                        i2 = this.f2910b.mo4920d();
                    } else {
                        i2 = this.f2910b.mo4918c();
                    }
                    aVar.f2953b = i2;
                    return true;
                } else {
                    int a = this.f2910b.mo4913a(findViewByPosition) - this.f2910b.mo4918c();
                    if (a < 0) {
                        aVar.f2953b = -a;
                        return true;
                    }
                    int d = this.f2910b.mo4920d() - this.f2910b.mo4917b(findViewByPosition);
                    if (d < 0) {
                        aVar.f2953b = d;
                        return true;
                    }
                    aVar.f2953b = Integer.MIN_VALUE;
                }
            } else {
                aVar.f2952a = this.f2914f;
                if (this.f2915g == Integer.MIN_VALUE) {
                    if (m3981l(aVar.f2952a) == 1) {
                        z = true;
                    }
                    aVar.f2954c = z;
                    aVar.mo4677b();
                } else {
                    aVar.mo4675a(this.f2915g);
                }
                aVar.f2955d = true;
            }
        } else {
            aVar.f2953b = Integer.MIN_VALUE;
            aVar.f2952a = this.f2914f;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4636c(int i) {
        this.f2919k = i / this.f2917i;
        this.f2926r = MeasureSpec.makeMeasureSpec(i, this.f2911c.mo4927h());
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.f2925q == null;
    }

    public int computeHorizontalScrollOffset(C0898s sVar) {
        return m3949a(sVar);
    }

    /* renamed from: a */
    private int m3949a(C0898s sVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0960ao.m4285a(sVar, this.f2910b, mo4631b(!this.f2930v), mo4634c(!this.f2930v), this, this.f2930v, this.f2913e);
    }

    public int computeVerticalScrollOffset(C0898s sVar) {
        return m3949a(sVar);
    }

    public int computeHorizontalScrollExtent(C0898s sVar) {
        return m3962b(sVar);
    }

    /* renamed from: b */
    private int m3962b(C0898s sVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0960ao.m4284a(sVar, this.f2910b, mo4631b(!this.f2930v), mo4634c(!this.f2930v), this, this.f2930v);
    }

    public int computeVerticalScrollExtent(C0898s sVar) {
        return m3962b(sVar);
    }

    public int computeHorizontalScrollRange(C0898s sVar) {
        return m3968c(sVar);
    }

    /* renamed from: c */
    private int m3968c(C0898s sVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0960ao.m4286b(sVar, this.f2910b, mo4631b(!this.f2930v), mo4634c(!this.f2930v), this, this.f2930v);
    }

    public int computeVerticalScrollRange(C0898s sVar) {
        return m3968c(sVar);
    }

    /* renamed from: a */
    private void m3960a(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f2935b) {
            if (this.f2918j == 1) {
                m3958a(view, this.f2926r, getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
            } else {
                m3958a(view, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), this.f2926r, z);
            }
        } else if (this.f2918j == 1) {
            m3958a(view, getChildMeasureSpec(this.f2919k, getWidthMode(), 0, layoutParams.width, false), getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
        } else {
            m3958a(view, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), getChildMeasureSpec(this.f2919k, getHeightMode(), 0, layoutParams.height, false), z);
        }
    }

    /* renamed from: a */
    private void m3958a(View view, int i, int i2, boolean z) {
        boolean z2;
        calculateItemDecorationsForChild(view, this.f2927s);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int a = m3947a(i, layoutParams.leftMargin + this.f2927s.left, layoutParams.rightMargin + this.f2927s.right);
        int a2 = m3947a(i2, layoutParams.topMargin + this.f2927s.top, layoutParams.bottomMargin + this.f2927s.bottom);
        if (z) {
            z2 = shouldReMeasureChild(view, a, a2, layoutParams);
        } else {
            z2 = shouldMeasureChild(view, a, a2, layoutParams);
        }
        if (z2) {
            view.measure(a, a2);
        }
    }

    /* renamed from: a */
    private int m3947a(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f2925q = (SavedState) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        int i;
        int i2;
        if (this.f2925q != null) {
            return new SavedState(this.f2925q);
        }
        SavedState savedState = new SavedState();
        savedState.f2949h = this.f2912d;
        savedState.f2950i = this.f2923o;
        savedState.f2951j = this.f2924p;
        if (this.f2916h == null || this.f2916h.f2936a == null) {
            savedState.f2946e = 0;
        } else {
            savedState.f2947f = this.f2916h.f2936a;
            savedState.f2946e = savedState.f2947f.length;
            savedState.f2948g = this.f2916h.f2937b;
        }
        if (getChildCount() > 0) {
            if (this.f2923o) {
                i = mo4641h();
            } else {
                i = mo4642i();
            }
            savedState.f2942a = i;
            savedState.f2943b = mo4638e();
            savedState.f2944c = this.f2917i;
            savedState.f2945d = new int[this.f2917i];
            for (int i3 = 0; i3 < this.f2917i; i3++) {
                if (this.f2923o) {
                    i2 = this.f2909a[i3].mo4686b(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i2 -= this.f2910b.mo4920d();
                    }
                } else {
                    i2 = this.f2909a[i3].mo4678a(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i2 -= this.f2910b.mo4918c();
                    }
                }
                savedState.f2945d[i3] = i2;
            }
        } else {
            savedState.f2942a = -1;
            savedState.f2943b = -1;
            savedState.f2944c = 0;
        }
        return savedState;
    }

    public void onInitializeAccessibilityNodeInfoForItem(C0892o oVar, C0898s sVar, View view, C0564b bVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, bVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int i = 1;
        if (this.f2918j == 0) {
            int b = layoutParams2.mo4645b();
            if (layoutParams2.f2935b) {
                i = this.f2917i;
            }
            bVar.mo2006b((Object) C0567c.m2158a(b, i, -1, -1, layoutParams2.f2935b, false));
        } else {
            int b2 = layoutParams2.mo4645b();
            if (layoutParams2.f2935b) {
                i = this.f2917i;
            }
            bVar.mo2006b((Object) C0567c.m2158a(-1, -1, b2, i, layoutParams2.f2935b, false));
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View b = mo4631b(false);
            View c = mo4634c(false);
            if (b != null && c != null) {
                int position = getPosition(b);
                int position2 = getPosition(c);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                } else {
                    accessibilityEvent.setFromIndex(position2);
                    accessibilityEvent.setToIndex(position);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo4638e() {
        View view;
        if (this.f2913e) {
            view = mo4634c(true);
        } else {
            view = mo4631b(true);
        }
        if (view == null) {
            return -1;
        }
        return getPosition(view);
    }

    public int getRowCountForAccessibility(C0892o oVar, C0898s sVar) {
        if (this.f2918j == 0) {
            return this.f2917i;
        }
        return super.getRowCountForAccessibility(oVar, sVar);
    }

    public int getColumnCountForAccessibility(C0892o oVar, C0898s sVar) {
        if (this.f2918j == 1) {
            return this.f2917i;
        }
        return super.getColumnCountForAccessibility(oVar, sVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo4631b(boolean z) {
        int c = this.f2910b.mo4918c();
        int d = this.f2910b.mo4920d();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int a = this.f2910b.mo4913a(childAt);
            if (this.f2910b.mo4917b(childAt) > c && a < d) {
                if (a >= c || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo4634c(boolean z) {
        int c = this.f2910b.mo4918c();
        int d = this.f2910b.mo4920d();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int a = this.f2910b.mo4913a(childAt);
            int b = this.f2910b.mo4917b(childAt);
            if (b > c && a < d) {
                if (b <= d || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: b */
    private void m3966b(C0892o oVar, C0898s sVar, boolean z) {
        int i = m3976i(Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE) {
            int d = this.f2910b.mo4920d() - i;
            if (d > 0) {
                int i2 = d - (-mo4624a(-d, oVar, sVar));
                if (z && i2 > 0) {
                    this.f2910b.mo4915a(i2);
                }
            }
        }
    }

    /* renamed from: c */
    private void m3969c(C0892o oVar, C0898s sVar, boolean z) {
        int h = m3975h(Integer.MAX_VALUE);
        if (h != Integer.MAX_VALUE) {
            int c = h - this.f2910b.mo4918c();
            if (c > 0) {
                int a = c - mo4624a(c, oVar, sVar);
                if (z && a > 0) {
                    this.f2910b.mo4915a(-a);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3964b(int r5, android.support.p028v7.widget.RecyclerView.C0898s r6) {
        /*
            r4 = this;
            android.support.v7.widget.ac r0 = r4.f2920l
            r1 = 0
            r0.f3098b = r1
            android.support.v7.widget.ac r0 = r4.f2920l
            r0.f3099c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L_0x0031
            int r6 = r6.mo4482c()
            r0 = -1
            if (r6 == r0) goto L_0x0031
            boolean r0 = r4.f2913e
            if (r6 >= r5) goto L_0x001d
            r5 = r2
            goto L_0x001e
        L_0x001d:
            r5 = r1
        L_0x001e:
            if (r0 != r5) goto L_0x0029
            android.support.v7.widget.ah r5 = r4.f2910b
            int r5 = r5.mo4924f()
            r6 = r5
            r5 = r1
            goto L_0x0033
        L_0x0029:
            android.support.v7.widget.ah r5 = r4.f2910b
            int r5 = r5.mo4924f()
            r6 = r1
            goto L_0x0033
        L_0x0031:
            r5 = r1
            r6 = r5
        L_0x0033:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L_0x0050
            android.support.v7.widget.ac r0 = r4.f2920l
            android.support.v7.widget.ah r3 = r4.f2910b
            int r3 = r3.mo4918c()
            int r3 = r3 - r5
            r0.f3102f = r3
            android.support.v7.widget.ac r5 = r4.f2920l
            android.support.v7.widget.ah r0 = r4.f2910b
            int r0 = r0.mo4920d()
            int r0 = r0 + r6
            r5.f3103g = r0
            goto L_0x0060
        L_0x0050:
            android.support.v7.widget.ac r0 = r4.f2920l
            android.support.v7.widget.ah r3 = r4.f2910b
            int r3 = r3.mo4922e()
            int r3 = r3 + r6
            r0.f3103g = r3
            android.support.v7.widget.ac r6 = r4.f2920l
            int r5 = -r5
            r6.f3102f = r5
        L_0x0060:
            android.support.v7.widget.ac r5 = r4.f2920l
            r5.f3104h = r1
            android.support.v7.widget.ac r5 = r4.f2920l
            r5.f3097a = r2
            android.support.v7.widget.ac r5 = r4.f2920l
            android.support.v7.widget.ah r6 = r4.f2910b
            int r6 = r6.mo4927h()
            if (r6 != 0) goto L_0x007b
            android.support.v7.widget.ah r6 = r4.f2910b
            int r6 = r6.mo4922e()
            if (r6 != 0) goto L_0x007b
            r1 = r2
        L_0x007b:
            r5.f3105i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.StaggeredGridLayoutManager.m3964b(int, android.support.v7.widget.RecyclerView$s):void");
    }

    /* renamed from: d */
    private void m3971d(int i) {
        this.f2920l.f3101e = i;
        C0941ac acVar = this.f2920l;
        int i2 = 1;
        if (this.f2913e != (i == -1)) {
            i2 = -1;
        }
        acVar.f3100d = i2;
    }

    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f2917i; i2++) {
            this.f2909a[i2].mo4692d(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f2917i; i2++) {
            this.f2909a[i2].mo4692d(i);
        }
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m3963b(i, i2, 2);
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m3963b(i, i2, 1);
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.f2916h.mo4648a();
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m3963b(i, i2, 8);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        m3963b(i, i2, 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3963b(int r6, int r7, int r8) {
        /*
            r5 = this;
            boolean r0 = r5.f2913e
            if (r0 == 0) goto L_0x0009
            int r0 = r5.mo4641h()
            goto L_0x000d
        L_0x0009:
            int r0 = r5.mo4642i()
        L_0x000d:
            r1 = 8
            if (r8 != r1) goto L_0x001b
            if (r6 >= r7) goto L_0x0016
            int r2 = r7 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r6 + 1
            r3 = r2
            r2 = r7
            goto L_0x001f
        L_0x001b:
            int r2 = r6 + r7
        L_0x001d:
            r3 = r2
            r2 = r6
        L_0x001f:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r5.f2916h
            r4.mo4652b(r2)
            if (r8 == r1) goto L_0x0036
            switch(r8) {
                case 1: goto L_0x0030;
                case 2: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0041
        L_0x002a:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f2916h
            r8.mo4649a(r6, r7)
            goto L_0x0041
        L_0x0030:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f2916h
            r8.mo4653b(r6, r7)
            goto L_0x0041
        L_0x0036:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f2916h
            r1 = 1
            r8.mo4649a(r6, r1)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r5.f2916h
            r6.mo4653b(r7, r1)
        L_0x0041:
            if (r3 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r6 = r5.f2913e
            if (r6 == 0) goto L_0x004d
            int r6 = r5.mo4642i()
            goto L_0x0051
        L_0x004d:
            int r6 = r5.mo4641h()
        L_0x0051:
            if (r2 > r6) goto L_0x0056
            r5.requestLayout()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.StaggeredGridLayoutManager.m3963b(int, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r3v0, types: [int] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [boolean, int]
      assigns: []
      uses: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], boolean, int, ?[int, short, byte, char]]
      mth insns count: 226
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m3948a(android.support.p028v7.widget.RecyclerView.C0892o r18, android.support.p028v7.widget.C0941ac r19, android.support.p028v7.widget.RecyclerView.C0898s r20) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = r19
            java.util.BitSet r0 = r6.f2921m
            int r1 = r6.f2917i
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            android.support.v7.widget.ac r0 = r6.f2920l
            boolean r0 = r0.f3105i
            if (r0 == 0) goto L_0x0021
            int r0 = r8.f3101e
            if (r0 != r10) goto L_0x001e
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x001c:
            r11 = r0
            goto L_0x0031
        L_0x001e:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x001c
        L_0x0021:
            int r0 = r8.f3101e
            if (r0 != r10) goto L_0x002b
            int r0 = r8.f3103g
            int r1 = r8.f3098b
            int r0 = r0 + r1
            goto L_0x001c
        L_0x002b:
            int r0 = r8.f3102f
            int r1 = r8.f3098b
            int r0 = r0 - r1
            goto L_0x001c
        L_0x0031:
            int r0 = r8.f3101e
            r6.m3951a(r0, r11)
            boolean r0 = r6.f2913e
            if (r0 == 0) goto L_0x0042
            android.support.v7.widget.ah r0 = r6.f2910b
            int r0 = r0.mo4920d()
        L_0x0040:
            r12 = r0
            goto L_0x0049
        L_0x0042:
            android.support.v7.widget.ah r0 = r6.f2910b
            int r0 = r0.mo4918c()
            goto L_0x0040
        L_0x0049:
            r0 = r9
        L_0x004a:
            boolean r1 = r19.mo4882a(r20)
            r2 = -1
            if (r1 == 0) goto L_0x01c8
            android.support.v7.widget.ac r1 = r6.f2920l
            boolean r1 = r1.f3105i
            if (r1 != 0) goto L_0x005f
            java.util.BitSet r1 = r6.f2921m
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01c8
        L_0x005f:
            android.view.View r13 = r8.mo4881a(r7)
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r14 = r0
            android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams r14 = (android.support.p028v7.widget.StaggeredGridLayoutManager.LayoutParams) r14
            int r0 = r14.mo4195f()
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.f2916h
            int r1 = r1.mo4654c(r0)
            if (r1 != r2) goto L_0x0078
            r3 = r10
            goto L_0x0079
        L_0x0078:
            r3 = r9
        L_0x0079:
            if (r3 == 0) goto L_0x008e
            boolean r1 = r14.f2935b
            if (r1 == 0) goto L_0x0084
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r1 = r6.f2909a
            r1 = r1[r9]
            goto L_0x0088
        L_0x0084:
            android.support.v7.widget.StaggeredGridLayoutManager$b r1 = r6.m3950a(r8)
        L_0x0088:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f2916h
            r4.mo4650a(r0, r1)
            goto L_0x0092
        L_0x008e:
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r4 = r6.f2909a
            r1 = r4[r1]
        L_0x0092:
            r15 = r1
            r14.f2934a = r15
            int r1 = r8.f3101e
            if (r1 != r10) goto L_0x009d
            r6.addView(r13)
            goto L_0x00a0
        L_0x009d:
            r6.addView(r13, r9)
        L_0x00a0:
            r6.m3960a(r13, r14, r9)
            int r1 = r8.f3101e
            if (r1 != r10) goto L_0x00d1
            boolean r1 = r14.f2935b
            if (r1 == 0) goto L_0x00b0
            int r1 = r6.m3976i(r12)
            goto L_0x00b4
        L_0x00b0:
            int r1 = r15.mo4686b(r12)
        L_0x00b4:
            android.support.v7.widget.ah r4 = r6.f2910b
            int r4 = r4.mo4923e(r13)
            int r4 = r4 + r1
            if (r3 == 0) goto L_0x00ce
            boolean r5 = r14.f2935b
            if (r5 == 0) goto L_0x00ce
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r6.m3972e(r1)
            r5.f2939b = r2
            r5.f2938a = r0
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f2916h
            r9.mo4651a(r5)
        L_0x00ce:
            r5 = r4
            r4 = r1
            goto L_0x00fa
        L_0x00d1:
            boolean r1 = r14.f2935b
            if (r1 == 0) goto L_0x00da
            int r1 = r6.m3975h(r12)
            goto L_0x00de
        L_0x00da:
            int r1 = r15.mo4678a(r12)
        L_0x00de:
            android.support.v7.widget.ah r4 = r6.f2910b
            int r4 = r4.mo4923e(r13)
            int r4 = r1 - r4
            if (r3 == 0) goto L_0x00f9
            boolean r5 = r14.f2935b
            if (r5 == 0) goto L_0x00f9
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r6.m3973f(r1)
            r5.f2939b = r10
            r5.f2938a = r0
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f2916h
            r9.mo4651a(r5)
        L_0x00f9:
            r5 = r1
        L_0x00fa:
            boolean r1 = r14.f2935b
            if (r1 == 0) goto L_0x0124
            int r1 = r8.f3100d
            if (r1 != r2) goto L_0x0124
            if (r3 == 0) goto L_0x0107
            r6.f2929u = r10
            goto L_0x0124
        L_0x0107:
            int r1 = r8.f3101e
            if (r1 != r10) goto L_0x0111
            boolean r1 = r17.mo4639f()
        L_0x010f:
            r1 = r1 ^ r10
            goto L_0x0116
        L_0x0111:
            boolean r1 = r17.mo4640g()
            goto L_0x010f
        L_0x0116:
            if (r1 == 0) goto L_0x0124
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.f2916h
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r1.mo4657f(r0)
            if (r0 == 0) goto L_0x0122
            r0.f2941d = r10
        L_0x0122:
            r6.f2929u = r10
        L_0x0124:
            r6.m3959a(r13, r14, r8)
            boolean r0 = r17.mo4637d()
            if (r0 == 0) goto L_0x0157
            int r0 = r6.f2918j
            if (r0 != r10) goto L_0x0157
            boolean r0 = r14.f2935b
            if (r0 == 0) goto L_0x013c
            android.support.v7.widget.ah r0 = r6.f2911c
            int r0 = r0.mo4920d()
            goto L_0x014c
        L_0x013c:
            android.support.v7.widget.ah r0 = r6.f2911c
            int r0 = r0.mo4920d()
            int r1 = r6.f2917i
            int r1 = r1 - r10
            int r2 = r15.f2963e
            int r1 = r1 - r2
            int r2 = r6.f2919k
            int r1 = r1 * r2
            int r0 = r0 - r1
        L_0x014c:
            android.support.v7.widget.ah r1 = r6.f2911c
            int r1 = r1.mo4923e(r13)
            int r1 = r0 - r1
            r9 = r0
            r3 = r1
            goto L_0x0177
        L_0x0157:
            boolean r0 = r14.f2935b
            if (r0 == 0) goto L_0x0162
            android.support.v7.widget.ah r0 = r6.f2911c
            int r0 = r0.mo4918c()
            goto L_0x016e
        L_0x0162:
            int r0 = r15.f2963e
            int r1 = r6.f2919k
            int r0 = r0 * r1
            android.support.v7.widget.ah r1 = r6.f2911c
            int r1 = r1.mo4918c()
            int r0 = r0 + r1
        L_0x016e:
            android.support.v7.widget.ah r1 = r6.f2911c
            int r1 = r1.mo4923e(r13)
            int r1 = r1 + r0
            r3 = r0
            r9 = r1
        L_0x0177:
            int r0 = r6.f2918j
            if (r0 != r10) goto L_0x0184
            r0 = r6
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r9
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            goto L_0x018c
        L_0x0184:
            r0 = r6
            r1 = r13
            r2 = r4
            r4 = r5
            r5 = r9
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
        L_0x018c:
            boolean r0 = r14.f2935b
            if (r0 == 0) goto L_0x0198
            android.support.v7.widget.ac r0 = r6.f2920l
            int r0 = r0.f3101e
            r6.m3951a(r0, r11)
            goto L_0x019f
        L_0x0198:
            android.support.v7.widget.ac r0 = r6.f2920l
            int r0 = r0.f3101e
            r6.m3956a(r15, r0, r11)
        L_0x019f:
            android.support.v7.widget.ac r0 = r6.f2920l
            r6.m3954a(r7, r0)
            android.support.v7.widget.ac r0 = r6.f2920l
            boolean r0 = r0.f3104h
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r14.f2935b
            if (r0 == 0) goto L_0x01ba
            java.util.BitSet r0 = r6.f2921m
            r0.clear()
            goto L_0x01c3
        L_0x01ba:
            java.util.BitSet r0 = r6.f2921m
            int r1 = r15.f2963e
            r3 = 0
            r0.set(r1, r3)
            goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            r9 = r3
            r0 = r10
            goto L_0x004a
        L_0x01c8:
            r3 = r9
            if (r0 != 0) goto L_0x01d0
            android.support.v7.widget.ac r0 = r6.f2920l
            r6.m3954a(r7, r0)
        L_0x01d0:
            android.support.v7.widget.ac r0 = r6.f2920l
            int r0 = r0.f3101e
            if (r0 != r2) goto L_0x01e8
            android.support.v7.widget.ah r0 = r6.f2910b
            int r0 = r0.mo4918c()
            int r0 = r6.m3975h(r0)
            android.support.v7.widget.ah r1 = r6.f2910b
            int r1 = r1.mo4918c()
            int r1 = r1 - r0
            goto L_0x01fa
        L_0x01e8:
            android.support.v7.widget.ah r0 = r6.f2910b
            int r0 = r0.mo4920d()
            int r0 = r6.m3976i(r0)
            android.support.v7.widget.ah r1 = r6.f2910b
            int r1 = r1.mo4920d()
            int r1 = r0 - r1
        L_0x01fa:
            if (r1 <= 0) goto L_0x0203
            int r0 = r8.f3098b
            int r9 = java.lang.Math.min(r0, r1)
            r3 = r9
        L_0x0203:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.StaggeredGridLayoutManager.m3948a(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.ac, android.support.v7.widget.RecyclerView$s):int");
    }

    /* renamed from: e */
    private FullSpanItem m3972e(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f2940c = new int[this.f2917i];
        for (int i2 = 0; i2 < this.f2917i; i2++) {
            fullSpanItem.f2940c[i2] = i - this.f2909a[i2].mo4686b(i);
        }
        return fullSpanItem;
    }

    /* renamed from: f */
    private FullSpanItem m3973f(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f2940c = new int[this.f2917i];
        for (int i2 = 0; i2 < this.f2917i; i2++) {
            fullSpanItem.f2940c[i2] = this.f2909a[i2].mo4678a(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: a */
    private void m3959a(View view, LayoutParams layoutParams, C0941ac acVar) {
        if (acVar.f3101e == 1) {
            if (layoutParams.f2935b) {
                m3957a(view);
            } else {
                layoutParams.f2934a.mo4687b(view);
            }
        } else if (layoutParams.f2935b) {
            m3967b(view);
        } else {
            layoutParams.f2934a.mo4683a(view);
        }
    }

    /* renamed from: a */
    private void m3954a(C0892o oVar, C0941ac acVar) {
        int i;
        int i2;
        if (acVar.f3097a && !acVar.f3105i) {
            if (acVar.f3098b == 0) {
                if (acVar.f3101e == -1) {
                    m3965b(oVar, acVar.f3103g);
                } else {
                    m3952a(oVar, acVar.f3102f);
                }
            } else if (acVar.f3101e == -1) {
                int g = acVar.f3102f - m3974g(acVar.f3102f);
                if (g < 0) {
                    i2 = acVar.f3103g;
                } else {
                    i2 = acVar.f3103g - Math.min(g, acVar.f3098b);
                }
                m3965b(oVar, i2);
            } else {
                int j = m3977j(acVar.f3103g) - acVar.f3103g;
                if (j < 0) {
                    i = acVar.f3102f;
                } else {
                    i = Math.min(j, acVar.f3098b) + acVar.f3102f;
                }
                m3952a(oVar, i);
            }
        }
    }

    /* renamed from: a */
    private void m3957a(View view) {
        for (int i = this.f2917i - 1; i >= 0; i--) {
            this.f2909a[i].mo4687b(view);
        }
    }

    /* renamed from: b */
    private void m3967b(View view) {
        for (int i = this.f2917i - 1; i >= 0; i--) {
            this.f2909a[i].mo4683a(view);
        }
    }

    /* renamed from: a */
    private void m3951a(int i, int i2) {
        for (int i3 = 0; i3 < this.f2917i; i3++) {
            if (!this.f2909a[i3].f2959a.isEmpty()) {
                m3956a(this.f2909a[i3], i, i2);
            }
        }
    }

    /* renamed from: a */
    private void m3956a(C0923b bVar, int i, int i2) {
        int i3 = bVar.mo4697i();
        if (i == -1) {
            if (bVar.mo4685b() + i3 <= i2) {
                this.f2921m.set(bVar.f2963e, false);
            }
        } else if (bVar.mo4691d() - i3 >= i2) {
            this.f2921m.set(bVar.f2963e, false);
        }
    }

    /* renamed from: g */
    private int m3974g(int i) {
        int a = this.f2909a[0].mo4678a(i);
        for (int i2 = 1; i2 < this.f2917i; i2++) {
            int a2 = this.f2909a[i2].mo4678a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: h */
    private int m3975h(int i) {
        int a = this.f2909a[0].mo4678a(i);
        for (int i2 = 1; i2 < this.f2917i; i2++) {
            int a2 = this.f2909a[i2].mo4678a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo4639f() {
        int b = this.f2909a[0].mo4686b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2917i; i++) {
            if (this.f2909a[i].mo4686b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo4640g() {
        int a = this.f2909a[0].mo4678a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2917i; i++) {
            if (this.f2909a[i].mo4678a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    private int m3976i(int i) {
        int b = this.f2909a[0].mo4686b(i);
        for (int i2 = 1; i2 < this.f2917i; i2++) {
            int b2 = this.f2909a[i2].mo4686b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: j */
    private int m3977j(int i) {
        int b = this.f2909a[0].mo4686b(i);
        for (int i2 = 1; i2 < this.f2917i; i2++) {
            int b2 = this.f2909a[i2].mo4686b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: a */
    private void m3952a(C0892o oVar, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f2910b.mo4917b(childAt) <= i && this.f2910b.mo4919c(childAt) <= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f2935b) {
                    int i2 = 0;
                    while (i2 < this.f2917i) {
                        if (this.f2909a[i2].f2959a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f2917i; i3++) {
                        this.f2909a[i3].mo4696h();
                    }
                } else if (layoutParams.f2934a.f2959a.size() != 1) {
                    layoutParams.f2934a.mo4696h();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, oVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m3965b(C0892o oVar, int i) {
        int childCount = getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            if (this.f2910b.mo4913a(childAt) >= i && this.f2910b.mo4921d(childAt) >= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f2935b) {
                    int i2 = 0;
                    while (i2 < this.f2917i) {
                        if (this.f2909a[i2].f2959a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f2917i; i3++) {
                        this.f2909a[i3].mo4695g();
                    }
                } else if (layoutParams.f2934a.f2959a.size() != 1) {
                    layoutParams.f2934a.mo4695g();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, oVar);
                childCount--;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    private boolean m3980k(int i) {
        boolean z = false;
        if (this.f2918j == 0) {
            if ((i == -1) != this.f2913e) {
                z = true;
            }
            return z;
        }
        if (((i == -1) == this.f2913e) == mo4637d()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private C0923b m3950a(C0941ac acVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m3980k(acVar.f3101e)) {
            i2 = this.f2917i - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f2917i;
            i = 1;
        }
        C0923b bVar = null;
        if (acVar.f3101e == 1) {
            int i4 = Integer.MAX_VALUE;
            int c = this.f2910b.mo4918c();
            while (i2 != i3) {
                C0923b bVar2 = this.f2909a[i2];
                int b = bVar2.mo4686b(c);
                if (b < i4) {
                    bVar = bVar2;
                    i4 = b;
                }
                i2 += i;
            }
            return bVar;
        }
        int i5 = Integer.MIN_VALUE;
        int d = this.f2910b.mo4920d();
        while (i2 != i3) {
            C0923b bVar3 = this.f2909a[i2];
            int a = bVar3.mo4678a(d);
            if (a > i5) {
                bVar = bVar3;
                i5 = a;
            }
            i2 += i;
        }
        return bVar;
    }

    public boolean canScrollVertically() {
        return this.f2918j == 1;
    }

    public boolean canScrollHorizontally() {
        return this.f2918j == 0;
    }

    public int scrollHorizontallyBy(int i, C0892o oVar, C0898s sVar) {
        return mo4624a(i, oVar, sVar);
    }

    public int scrollVerticallyBy(int i, C0892o oVar, C0898s sVar) {
        return mo4624a(i, oVar, sVar);
    }

    /* renamed from: l */
    private int m3981l(int i) {
        int i2 = -1;
        if (getChildCount() == 0) {
            if (this.f2913e) {
                i2 = 1;
            }
            return i2;
        }
        if ((i < mo4642i()) == this.f2913e) {
            i2 = 1;
        }
        return i2;
    }

    public PointF computeScrollVectorForPosition(int i) {
        int l = m3981l(i);
        PointF pointF = new PointF();
        if (l == 0) {
            return null;
        }
        if (this.f2918j == 0) {
            pointF.x = (float) l;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) l;
        }
        return pointF;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, C0898s sVar, int i) {
        C0942ad adVar = new C0942ad(recyclerView.getContext());
        adVar.setTargetPosition(i);
        startSmoothScroll(adVar);
    }

    public void scrollToPosition(int i) {
        if (!(this.f2925q == null || this.f2925q.f2942a == i)) {
            this.f2925q.mo4667b();
        }
        this.f2914f = i;
        this.f2915g = Integer.MIN_VALUE;
        requestLayout();
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, C0898s sVar, C0884a aVar) {
        int i3;
        if (this.f2918j != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            mo4626a(i, sVar);
            if (this.f2931w == null || this.f2931w.length < this.f2917i) {
                this.f2931w = new int[this.f2917i];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f2917i; i5++) {
                if (this.f2920l.f3100d == -1) {
                    i3 = this.f2920l.f3102f - this.f2909a[i5].mo4678a(this.f2920l.f3102f);
                } else {
                    i3 = this.f2909a[i5].mo4686b(this.f2920l.f3103g) - this.f2920l.f3103g;
                }
                if (i3 >= 0) {
                    this.f2931w[i4] = i3;
                    i4++;
                }
            }
            Arrays.sort(this.f2931w, 0, i4);
            for (int i6 = 0; i6 < i4 && this.f2920l.mo4882a(sVar); i6++) {
                aVar.mo4398b(this.f2920l.f3099c, this.f2931w[i6]);
                this.f2920l.f3099c += this.f2920l.f3100d;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4626a(int i, C0898s sVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo4641h();
            i2 = 1;
        } else {
            i2 = -1;
            i3 = mo4642i();
        }
        this.f2920l.f3097a = true;
        m3964b(i3, sVar);
        m3971d(i2);
        this.f2920l.f3099c = i3 + this.f2920l.f3100d;
        this.f2920l.f3098b = Math.abs(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo4624a(int i, C0892o oVar, C0898s sVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo4626a(i, sVar);
        int a = m3948a(oVar, this.f2920l, sVar);
        if (this.f2920l.f3098b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f2910b.mo4915a(-i);
        this.f2923o = this.f2913e;
        this.f2920l.f3098b = 0;
        m3954a(oVar, this.f2920l);
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo4641h() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo4642i() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* renamed from: m */
    private int m3983m(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: n */
    private int m3984n(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    public android.support.p028v7.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.f2918j == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    public android.support.p028v7.widget.RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public android.support.p028v7.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public boolean checkLayoutParams(android.support.p028v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public View onFocusSearchFailed(View view, int i, C0892o oVar, C0898s sVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (getChildCount() == 0) {
            return null;
        }
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        m3979k();
        int o = m3985o(i);
        if (o == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) findContainingItemView.getLayoutParams();
        boolean z = layoutParams.f2935b;
        C0923b bVar = layoutParams.f2934a;
        if (o == 1) {
            i2 = mo4641h();
        } else {
            i2 = mo4642i();
        }
        m3964b(i2, sVar);
        m3971d(o);
        this.f2920l.f3099c = this.f2920l.f3100d + i2;
        this.f2920l.f3098b = (int) (0.33333334f * ((float) this.f2910b.mo4924f()));
        this.f2920l.f3104h = true;
        this.f2920l.f3097a = false;
        m3948a(oVar, this.f2920l, sVar);
        this.f2923o = this.f2913e;
        if (!z) {
            View a = bVar.mo4681a(i2, o);
            if (!(a == null || a == findContainingItemView)) {
                return a;
            }
        }
        if (m3980k(o)) {
            for (int i6 = this.f2917i - 1; i6 >= 0; i6--) {
                View a2 = this.f2909a[i6].mo4681a(i2, o);
                if (a2 != null && a2 != findContainingItemView) {
                    return a2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f2917i; i7++) {
                View a3 = this.f2909a[i7].mo4681a(i2, o);
                if (a3 != null && a3 != findContainingItemView) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f2912d ^ true) == (o == -1);
        if (!z) {
            if (z2) {
                i5 = bVar.mo4698j();
            } else {
                i5 = bVar.mo4699k();
            }
            View findViewByPosition = findViewByPosition(i5);
            if (!(findViewByPosition == null || findViewByPosition == findContainingItemView)) {
                return findViewByPosition;
            }
        }
        if (m3980k(o)) {
            for (int i8 = this.f2917i - 1; i8 >= 0; i8--) {
                if (i8 != bVar.f2963e) {
                    if (z2) {
                        i4 = this.f2909a[i8].mo4698j();
                    } else {
                        i4 = this.f2909a[i8].mo4699k();
                    }
                    View findViewByPosition2 = findViewByPosition(i4);
                    if (!(findViewByPosition2 == null || findViewByPosition2 == findContainingItemView)) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f2917i; i9++) {
                if (z2) {
                    i3 = this.f2909a[i9].mo4698j();
                } else {
                    i3 = this.f2909a[i9].mo4699k();
                }
                View findViewByPosition3 = findViewByPosition(i3);
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    /* renamed from: o */
    private int m3985o(int i) {
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        if (i == 17) {
            if (this.f2918j != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f2918j != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f2918j == 0) {
                i3 = 1;
            }
            return i3;
        } else if (i != 130) {
            switch (i) {
                case 1:
                    return (this.f2918j != 1 && mo4637d()) ? 1 : -1;
                case 2:
                    return (this.f2918j != 1 && mo4637d()) ? -1 : 1;
                default:
                    return Integer.MIN_VALUE;
            }
        } else {
            if (this.f2918j == 1) {
                i3 = 1;
            }
            return i3;
        }
    }
}
