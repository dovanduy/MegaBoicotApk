package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v7.widget.m */
/* compiled from: AppCompatTextViewAutoSizeHelper */
class C1019m {

    /* renamed from: a */
    private static final RectF f3375a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f3376b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private int f3377c = 0;

    /* renamed from: d */
    private boolean f3378d = false;

    /* renamed from: e */
    private float f3379e = -1.0f;

    /* renamed from: f */
    private float f3380f = -1.0f;

    /* renamed from: g */
    private float f3381g = -1.0f;

    /* renamed from: h */
    private int[] f3382h = new int[0];

    /* renamed from: i */
    private boolean f3383i = false;

    /* renamed from: j */
    private TextPaint f3384j;

    /* renamed from: k */
    private final TextView f3385k;

    /* renamed from: l */
    private final Context f3386l;

    C1019m(TextView textView) {
        this.f3385k = textView;
        this.f3386l = this.f3385k.getContext();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5281a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3386l.obtainStyledAttributes(attributeSet, C0682j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0682j.AppCompatTextView_autoSizeTextType)) {
            this.f3377c = obtainStyledAttributes.getInt(C0682j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0682j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0682j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0682j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0682j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0682j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0682j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0682j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C0682j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                m4651a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!m4657k()) {
            this.f3377c = 0;
        } else if (this.f3377c == 1) {
            if (!this.f3383i) {
                DisplayMetrics displayMetrics = this.f3386l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m4650a(dimension2, dimension3, dimension);
            }
            m4655i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5278a(int i) {
        if (m4657k()) {
            switch (i) {
                case 0:
                    m4656j();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f3386l.getResources().getDisplayMetrics();
                    m4650a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m4655i()) {
                        mo5287f();
                        return;
                    }
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown auto-size text type: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5280a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m4657k()) {
            DisplayMetrics displayMetrics = this.f3386l.getResources().getDisplayMetrics();
            m4650a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m4655i()) {
                mo5287f();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5282a(int[] iArr, int i) throws IllegalArgumentException {
        if (m4657k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f3386l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f3382h = m4653a(iArr2);
                if (!m4654h()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f3383i = false;
            }
            if (m4655i()) {
                mo5287f();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5277a() {
        return this.f3377c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo5283b() {
        return Math.round(this.f3379e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo5284c() {
        return Math.round(this.f3380f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo5285d() {
        return Math.round(this.f3381g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int[] mo5286e() {
        return this.f3382h;
    }

    /* renamed from: a */
    private void m4651a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f3382h = m4653a(iArr);
            m4654h();
        }
    }

    /* renamed from: h */
    private boolean m4654h() {
        int length = this.f3382h.length;
        this.f3383i = length > 0;
        if (this.f3383i) {
            this.f3377c = 1;
            this.f3380f = (float) this.f3382h[0];
            this.f3381g = (float) this.f3382h[length - 1];
            this.f3379e = -1.0f;
        }
        return this.f3383i;
    }

    /* renamed from: a */
    private int[] m4653a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: a */
    private void m4650a(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size ");
            sb2.append("text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 <= 0.0f) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        } else {
            this.f3377c = 1;
            this.f3380f = f;
            this.f3381g = f2;
            this.f3379e = f3;
            this.f3383i = false;
        }
    }

    /* renamed from: i */
    private boolean m4655i() {
        if (!m4657k() || this.f3377c != 1) {
            this.f3378d = false;
        } else {
            if (!this.f3383i || this.f3382h.length == 0) {
                float round = (float) Math.round(this.f3380f);
                int i = 1;
                while (Math.round(this.f3379e + round) <= Math.round(this.f3381g)) {
                    i++;
                    round += this.f3379e;
                }
                int[] iArr = new int[i];
                float f = this.f3380f;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f3379e;
                }
                this.f3382h = m4653a(iArr);
            }
            this.f3378d = true;
        }
        return this.f3378d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo5287f() {
        int i;
        if (mo5288g()) {
            if (this.f3378d) {
                if (this.f3385k.getMeasuredHeight() > 0 && this.f3385k.getMeasuredWidth() > 0) {
                    if (((Boolean) m4647a((Object) this.f3385k, "getHorizontallyScrolling", (T) Boolean.valueOf(false))).booleanValue()) {
                        i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i = (this.f3385k.getMeasuredWidth() - this.f3385k.getTotalPaddingLeft()) - this.f3385k.getTotalPaddingRight();
                    }
                    int height = (this.f3385k.getHeight() - this.f3385k.getCompoundPaddingBottom()) - this.f3385k.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (f3375a) {
                            f3375a.setEmpty();
                            f3375a.right = (float) i;
                            f3375a.bottom = (float) height;
                            float a = (float) m4644a(f3375a);
                            if (a != this.f3385k.getTextSize()) {
                                mo5279a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f3378d = true;
        }
    }

    /* renamed from: j */
    private void m4656j() {
        this.f3377c = 0;
        this.f3380f = -1.0f;
        this.f3381g = -1.0f;
        this.f3379e = -1.0f;
        this.f3382h = new int[0];
        this.f3378d = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5279a(int i, float f) {
        Resources resources;
        if (this.f3386l == null) {
            resources = Resources.getSystem();
        } else {
            resources = this.f3386l.getResources();
        }
        m4649a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: a */
    private void m4649a(float f) {
        if (f != this.f3385k.getPaint().getTextSize()) {
            this.f3385k.getPaint().setTextSize(f);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.f3385k.isInLayout() : false;
            if (this.f3385k.getLayout() != null) {
                this.f3378d = false;
                try {
                    Method a = m4648a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f3385k, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f3385k.requestLayout();
                } else {
                    this.f3385k.forceLayout();
                }
                this.f3385k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private int m4644a(RectF rectF) {
        int length = this.f3382h.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 0;
        int i2 = 1;
        int i3 = length - 1;
        while (true) {
            int i4 = i2;
            int i5 = i;
            i = i4;
            while (i <= i3) {
                int i6 = (i + i3) / 2;
                if (m4652a(this.f3382h[i6], rectF)) {
                    i2 = i6 + 1;
                } else {
                    i5 = i6 - 1;
                    i3 = i5;
                }
            }
            return this.f3382h[i5];
        }
    }

    /* renamed from: a */
    private boolean m4652a(int i, RectF rectF) {
        StaticLayout staticLayout;
        CharSequence text = this.f3385k.getText();
        TransformationMethod transformationMethod = this.f3385k.getTransformationMethod();
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.f3385k);
            if (transformation != null) {
                text = transformation;
            }
        }
        int maxLines = VERSION.SDK_INT >= 16 ? this.f3385k.getMaxLines() : -1;
        if (this.f3384j == null) {
            this.f3384j = new TextPaint();
        } else {
            this.f3384j.reset();
        }
        this.f3384j.set(this.f3385k.getPaint());
        this.f3384j.setTextSize((float) i);
        Alignment alignment = (Alignment) m4647a((Object) this.f3385k, "getLayoutAlignment", (T) Alignment.ALIGN_NORMAL);
        if (VERSION.SDK_INT >= 23) {
            staticLayout = m4646a(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            staticLayout = m4645a(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private StaticLayout m4646a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m4647a((Object) this.f3385k, "getTextDirectionHeuristic", (T) TextDirectionHeuristics.FIRSTSTRONG_LTR);
        Builder hyphenationFrequency = Builder.obtain(charSequence, 0, charSequence.length(), this.f3384j, i).setAlignment(alignment).setLineSpacing(this.f3385k.getLineSpacingExtra(), this.f3385k.getLineSpacingMultiplier()).setIncludePad(this.f3385k.getIncludeFontPadding()).setBreakStrategy(this.f3385k.getBreakStrategy()).setHyphenationFrequency(this.f3385k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private StaticLayout m4645a(CharSequence charSequence, Alignment alignment, int i) {
        float floatValue;
        float floatValue2;
        boolean booleanValue;
        if (VERSION.SDK_INT >= 16) {
            floatValue = this.f3385k.getLineSpacingMultiplier();
            floatValue2 = this.f3385k.getLineSpacingExtra();
            booleanValue = this.f3385k.getIncludeFontPadding();
        } else {
            floatValue = ((Float) m4647a((Object) this.f3385k, "getLineSpacingMultiplier", (T) Float.valueOf(1.0f))).floatValue();
            floatValue2 = ((Float) m4647a((Object) this.f3385k, "getLineSpacingExtra", (T) Float.valueOf(0.0f))).floatValue();
            booleanValue = ((Boolean) m4647a((Object) this.f3385k, "getIncludeFontPadding", (T) Boolean.valueOf(true))).booleanValue();
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f3384j, i, alignment, floatValue, floatValue2, booleanValue);
        return staticLayout;
    }

    /* renamed from: a */
    private <T> T m4647a(Object obj, String str, T t) {
        try {
            return m4648a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            String str2 = "ACTVAutoSizeHelper";
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w(str2, sb.toString(), e);
            return t;
        }
    }

    /* renamed from: a */
    private Method m4648a(String str) {
        try {
            Method method = (Method) f3376b.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f3376b.put(str, method);
                }
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo5288g() {
        return m4657k() && this.f3377c != 0;
    }

    /* renamed from: k */
    private boolean m4657k() {
        return !(this.f3385k instanceof AppCompatEditText);
    }
}
