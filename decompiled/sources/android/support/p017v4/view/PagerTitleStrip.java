package android.support.p017v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.p017v4.view.ViewPager.C0553a;
import android.support.p017v4.view.ViewPager.C0556d;
import android.support.p017v4.view.ViewPager.C0557e;
import android.support.p017v4.widget.C0663p;
import android.text.TextUtils.TruncateAt;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

@C0553a
/* renamed from: android.support.v4.view.PagerTitleStrip */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: n */
    private static final int[] f1330n = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: o */
    private static final int[] f1331o = {16843660};

    /* renamed from: a */
    ViewPager f1332a;

    /* renamed from: b */
    TextView f1333b;

    /* renamed from: c */
    TextView f1334c;

    /* renamed from: d */
    TextView f1335d;

    /* renamed from: e */
    float f1336e = -1.0f;

    /* renamed from: f */
    int f1337f;

    /* renamed from: g */
    private int f1338g = -1;

    /* renamed from: h */
    private int f1339h;

    /* renamed from: i */
    private int f1340i;

    /* renamed from: j */
    private boolean f1341j;

    /* renamed from: k */
    private boolean f1342k;

    /* renamed from: l */
    private final C0546a f1343l = new C0546a();

    /* renamed from: m */
    private WeakReference<C0593p> f1344m;

    /* renamed from: p */
    private int f1345p;

    /* renamed from: android.support.v4.view.PagerTitleStrip$a */
    private class C0546a extends DataSetObserver implements C0556d, C0557e {

        /* renamed from: b */
        private int f1347b;

        C0546a() {
        }

        /* renamed from: a */
        public void mo1882a(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo1853a(i, f, false);
        }

        /* renamed from: a */
        public void mo1881a(int i) {
            if (this.f1347b == 0) {
                PagerTitleStrip.this.mo1870a(PagerTitleStrip.this.f1332a.getCurrentItem(), PagerTitleStrip.this.f1332a.getAdapter());
                float f = 0.0f;
                if (PagerTitleStrip.this.f1336e >= 0.0f) {
                    f = PagerTitleStrip.this.f1336e;
                }
                PagerTitleStrip.this.mo1853a(PagerTitleStrip.this.f1332a.getCurrentItem(), f, true);
            }
        }

        /* renamed from: b */
        public void mo1884b(int i) {
            this.f1347b = i;
        }

        /* renamed from: a */
        public void mo1883a(ViewPager viewPager, C0593p pVar, C0593p pVar2) {
            PagerTitleStrip.this.mo1871a(pVar, pVar2);
        }

        public void onChanged() {
            PagerTitleStrip.this.mo1870a(PagerTitleStrip.this.f1332a.getCurrentItem(), PagerTitleStrip.this.f1332a.getAdapter());
            float f = 0.0f;
            if (PagerTitleStrip.this.f1336e >= 0.0f) {
                f = PagerTitleStrip.this.f1336e;
            }
            PagerTitleStrip.this.mo1853a(PagerTitleStrip.this.f1332a.getCurrentItem(), f, true);
        }
    }

    /* renamed from: android.support.v4.view.PagerTitleStrip$b */
    private static class C0547b extends SingleLineTransformationMethod {

        /* renamed from: a */
        private Locale f1348a;

        C0547b(Context context) {
            this.f1348a = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f1348a);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C0547b(textView.getContext()));
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        this.f1333b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f1334c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f1335d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1330n);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C0663p.m2622a(this.f1333b, resourceId);
            C0663p.m2622a(this.f1334c, resourceId);
            C0663p.m2622a(this.f1335d, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            mo1869a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f1333b.setTextColor(color);
            this.f1334c.setTextColor(color);
            this.f1335d.setTextColor(color);
        }
        this.f1340i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f1337f = this.f1334c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f1333b.setEllipsize(TruncateAt.END);
        this.f1334c.setEllipsize(TruncateAt.END);
        this.f1335d.setEllipsize(TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f1331o);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f1333b);
            setSingleLineAllCaps(this.f1334c);
            setSingleLineAllCaps(this.f1335d);
        } else {
            this.f1333b.setSingleLine();
            this.f1334c.setSingleLine();
            this.f1335d.setSingleLine();
        }
        this.f1339h = (int) (16.0f * context.getResources().getDisplayMetrics().density);
    }

    public void setTextSpacing(int i) {
        this.f1339h = i;
        requestLayout();
    }

    public int getTextSpacing() {
        return this.f1339h;
    }

    public void setNonPrimaryAlpha(float f) {
        this.f1345p = ((int) (f * 255.0f)) & 255;
        int i = (this.f1345p << 24) | (this.f1337f & 16777215);
        this.f1333b.setTextColor(i);
        this.f1335d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.f1337f = i;
        this.f1334c.setTextColor(i);
        int i2 = (this.f1345p << 24) | (this.f1337f & 16777215);
        this.f1333b.setTextColor(i2);
        this.f1335d.setTextColor(i2);
    }

    /* renamed from: a */
    public void mo1869a(int i, float f) {
        this.f1333b.setTextSize(i, f);
        this.f1334c.setTextSize(i, f);
        this.f1335d.setTextSize(i, f);
    }

    public void setGravity(int i) {
        this.f1340i = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        C0593p adapter = viewPager.getAdapter();
        viewPager.setInternalPageChangeListener(this.f1343l);
        viewPager.addOnAdapterChangeListener(this.f1343l);
        this.f1332a = viewPager;
        mo1871a(this.f1344m != null ? (C0593p) this.f1344m.get() : null, adapter);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1332a != null) {
            mo1871a(this.f1332a.getAdapter(), (C0593p) null);
            this.f1332a.setInternalPageChangeListener(null);
            this.f1332a.removeOnAdapterChangeListener(this.f1343l);
            this.f1332a = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1870a(int i, C0593p pVar) {
        int count = pVar != null ? pVar.getCount() : 0;
        this.f1341j = true;
        CharSequence charSequence = null;
        this.f1333b.setText((i < 1 || pVar == null) ? null : pVar.getPageTitle(i - 1));
        this.f1334c.setText((pVar == null || i >= count) ? null : pVar.getPageTitle(i));
        int i2 = i + 1;
        if (i2 < count && pVar != null) {
            charSequence = pVar.getPageTitle(i2);
        }
        this.f1335d.setText(charSequence);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f1333b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f1334c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f1335d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f1338g = i;
        if (!this.f1342k) {
            mo1853a(i, this.f1336e, false);
        }
        this.f1341j = false;
    }

    public void requestLayout() {
        if (!this.f1341j) {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1871a(C0593p pVar, C0593p pVar2) {
        if (pVar != null) {
            pVar.unregisterDataSetObserver(this.f1343l);
            this.f1344m = null;
        }
        if (pVar2 != null) {
            pVar2.registerDataSetObserver(this.f1343l);
            this.f1344m = new WeakReference<>(pVar2);
        }
        if (this.f1332a != null) {
            this.f1338g = -1;
            this.f1336e = -1.0f;
            mo1870a(this.f1332a.getCurrentItem(), pVar2);
            requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1853a(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = i;
        float f2 = f;
        if (i5 != this.f1338g) {
            mo1870a(i5, this.f1332a.getAdapter());
        } else if (!z && f2 == this.f1336e) {
            return;
        }
        this.f1342k = true;
        int measuredWidth = this.f1333b.getMeasuredWidth();
        int measuredWidth2 = this.f1334c.getMeasuredWidth();
        int measuredWidth3 = this.f1335d.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (((float) i8) * f3))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f1333b.getBaseline();
        int baseline2 = this.f1334c.getBaseline();
        int baseline3 = this.f1335d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int i14 = measuredWidth3;
        int measuredHeight = this.f1335d.getMeasuredHeight() + i13;
        int max2 = Math.max(Math.max(this.f1333b.getMeasuredHeight() + i11, this.f1334c.getMeasuredHeight() + i12), measuredHeight);
        int i15 = this.f1340i & 112;
        if (i15 == 16) {
            int i16 = (((height - paddingTop) - paddingBottom) - max2) / 2;
            i4 = i11 + i16;
            i2 = i12 + i16;
            i3 = i16 + i13;
        } else if (i15 != 80) {
            i4 = i11 + paddingTop;
            i2 = i12 + paddingTop;
            i3 = paddingTop + i13;
        } else {
            int i17 = (height - paddingBottom) - max2;
            i4 = i11 + i17;
            i2 = i12 + i17;
            i3 = i17 + i13;
        }
        this.f1334c.layout(i9, i2, i10, this.f1334c.getMeasuredHeight() + i2);
        int min = Math.min(paddingLeft, (i9 - this.f1339h) - measuredWidth);
        this.f1333b.layout(min, i4, measuredWidth + min, this.f1333b.getMeasuredHeight() + i4);
        int max3 = Math.max((width - paddingRight) - i14, i10 + this.f1339h);
        this.f1335d.layout(max3, i3, max3 + i14, this.f1335d.getMeasuredHeight() + i3);
        this.f1336e = f;
        this.f1342k = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int size = MeasureSpec.getSize(i);
        int childMeasureSpec2 = getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
        this.f1333b.measure(childMeasureSpec2, childMeasureSpec);
        this.f1334c.measure(childMeasureSpec2, childMeasureSpec);
        this.f1335d.measure(childMeasureSpec2, childMeasureSpec);
        if (MeasureSpec.getMode(i2) == 1073741824) {
            i3 = MeasureSpec.getSize(i2);
        } else {
            i3 = Math.max(getMinHeight(), this.f1334c.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.f1334c.getMeasuredState() << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1332a != null) {
            float f = 0.0f;
            if (this.f1336e >= 0.0f) {
                f = this.f1336e;
            }
            mo1853a(this.f1338g, f, true);
        }
    }

    /* access modifiers changed from: 0000 */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }
}
