package android.support.p028v7.p033d.p034a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p014c.p015a.C0132c;
import android.support.p014c.p015a.C0142i;
import android.support.p017v4.content.p022a.C0354g;
import android.support.p017v4.p023d.C0383f;
import android.support.p017v4.p023d.C0399n;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.p031c.p032a.C0740a;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.d.a.a */
/* compiled from: AnimatedStateListDrawableCompat */
public class C0742a extends C0755d {

    /* renamed from: a */
    private static final String f2080a = "a";

    /* renamed from: b */
    private C0745b f2081b;

    /* renamed from: c */
    private C0749f f2082c;

    /* renamed from: d */
    private int f2083d;

    /* renamed from: e */
    private int f2084e;

    /* renamed from: f */
    private boolean f2085f;

    /* renamed from: android.support.v7.d.a.a$a */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0744a extends C0749f {

        /* renamed from: a */
        private final Animatable f2086a;

        C0744a(Animatable animatable) {
            super();
            this.f2086a = animatable;
        }

        /* renamed from: a */
        public void mo2852a() {
            this.f2086a.start();
        }

        /* renamed from: b */
        public void mo2853b() {
            this.f2086a.stop();
        }
    }

    /* renamed from: android.support.v7.d.a.a$b */
    /* compiled from: AnimatedStateListDrawableCompat */
    static class C0745b extends C0756a {

        /* renamed from: a */
        C0383f<Long> f2087a;

        /* renamed from: b */
        C0399n<Integer> f2088b;

        /* renamed from: f */
        private static long m3026f(int i, int i2) {
            return (((long) i) << 32) | ((long) i2);
        }

        C0745b(C0745b bVar, C0742a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.f2087a = bVar.f2087a;
                this.f2088b = bVar.f2088b;
                return;
            }
            this.f2087a = new C0383f<>();
            this.f2088b = new C0399n<>();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2859a() {
            this.f2087a = this.f2087a.clone();
            this.f2088b = this.f2088b.clone();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo2856a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo2882a(drawable);
            long f = m3026f(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f2087a.mo1315c(f, Long.valueOf(j2 | j));
            if (z) {
                this.f2087a.mo1315c(m3026f(i2, i), Long.valueOf(j2 | 4294967296L | j));
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo2858a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo2942a(iArr, drawable);
            this.f2088b.mo1418b(a, Integer.valueOf(i));
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo2857a(int[] iArr) {
            int b = super.mo2943b(iArr);
            if (b >= 0) {
                return b;
            }
            return super.mo2943b(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo2854a(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f2088b.mo1415a(i, Integer.valueOf(0))).intValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo2855a(int i, int i2) {
            return (int) ((Long) this.f2087a.mo1307a(m3026f(i, i2), Long.valueOf(-1))).longValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo2860b(int i, int i2) {
            return (((Long) this.f2087a.mo1307a(m3026f(i, i2), Long.valueOf(-1))).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo2861c(int i, int i2) {
            return (((Long) this.f2087a.mo1307a(m3026f(i, i2), Long.valueOf(-1))).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C0742a(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0742a(this, resources);
        }
    }

    /* renamed from: android.support.v7.d.a.a$c */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0746c extends C0749f {

        /* renamed from: a */
        private final C0132c f2089a;

        C0746c(C0132c cVar) {
            super();
            this.f2089a = cVar;
        }

        /* renamed from: a */
        public void mo2852a() {
            this.f2089a.start();
        }

        /* renamed from: b */
        public void mo2853b() {
            this.f2089a.stop();
        }
    }

    /* renamed from: android.support.v7.d.a.a$d */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0747d extends C0749f {

        /* renamed from: a */
        private final ObjectAnimator f2090a;

        /* renamed from: b */
        private final boolean f2091b;

        C0747d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0748e eVar = new C0748e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) eVar.mo2866a());
            ofInt.setInterpolator(eVar);
            this.f2091b = z2;
            this.f2090a = ofInt;
        }

        /* renamed from: c */
        public boolean mo2864c() {
            return this.f2091b;
        }

        /* renamed from: a */
        public void mo2852a() {
            this.f2090a.start();
        }

        /* renamed from: d */
        public void mo2865d() {
            this.f2090a.reverse();
        }

        /* renamed from: b */
        public void mo2853b() {
            this.f2090a.cancel();
        }
    }

    /* renamed from: android.support.v7.d.a.a$e */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0748e implements TimeInterpolator {

        /* renamed from: a */
        private int[] f2092a;

        /* renamed from: b */
        private int f2093b;

        /* renamed from: c */
        private int f2094c;

        C0748e(AnimationDrawable animationDrawable, boolean z) {
            mo2867a(animationDrawable, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo2867a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f2093b = numberOfFrames;
            if (this.f2092a == null || this.f2092a.length < numberOfFrames) {
                this.f2092a = new int[numberOfFrames];
            }
            int[] iArr = this.f2092a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr[i2] = duration;
                i += duration;
            }
            this.f2094c = i;
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo2866a() {
            return this.f2094c;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f2094c)) + 0.5f);
            int i2 = this.f2093b;
            int[] iArr = this.f2092a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f2094c) : 0.0f);
        }
    }

    /* renamed from: android.support.v7.d.a.a$f */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class C0749f {
        /* renamed from: a */
        public abstract void mo2852a();

        /* renamed from: b */
        public abstract void mo2853b();

        /* renamed from: c */
        public boolean mo2864c() {
            return false;
        }

        /* renamed from: d */
        public void mo2865d() {
        }

        private C0749f() {
        }
    }

    public boolean isStateful() {
        return true;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public C0742a() {
        this(null, null);
    }

    C0742a(C0745b bVar, Resources resources) {
        super(null);
        this.f2083d = -1;
        this.f2084e = -1;
        mo2816a((C0753b) new C0745b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    public static C0742a m3012a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("animated-selector")) {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid animated-selector tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        C0742a aVar = new C0742a();
        aVar.mo2819b(context, resources, xmlPullParser, attributeSet, theme);
        return aVar;
    }

    /* renamed from: b */
    public void mo2819b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        TypedArray a = C0354g.m1303a(resources, theme, attributeSet, C0682j.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C0682j.AnimatedStateListDrawableCompat_android_visible, true), true);
        m3013a(a);
        mo2869a(resources);
        a.recycle();
        m3015c(context, resources, xmlPullParser, attributeSet, theme);
        m3018e();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f2082c != null && (visible || z2)) {
            if (z) {
                this.f2082c.mo2852a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        if (this.f2082c != null) {
            this.f2082c.mo2853b();
            this.f2082c = null;
            mo2871a(this.f2083d);
            this.f2083d = -1;
            this.f2084e = -1;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int a = this.f2081b.mo2857a(iArr);
        boolean z = a != mo2872d() && (m3014b(a) || mo2871a(a));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    /* renamed from: b */
    private boolean m3014b(int i) {
        int i2;
        C0749f fVar;
        C0749f fVar2 = this.f2082c;
        if (fVar2 == null) {
            i2 = mo2872d();
        } else if (i == this.f2083d) {
            return true;
        } else {
            if (i != this.f2084e || !fVar2.mo2864c()) {
                i2 = this.f2083d;
                fVar2.mo2853b();
            } else {
                fVar2.mo2865d();
                this.f2083d = this.f2084e;
                this.f2084e = i;
                return true;
            }
        }
        this.f2082c = null;
        this.f2084e = -1;
        this.f2083d = -1;
        C0745b bVar = this.f2081b;
        int a = bVar.mo2854a(i2);
        int a2 = bVar.mo2854a(i);
        if (a2 == 0 || a == 0) {
            return false;
        }
        int a3 = bVar.mo2855a(a, a2);
        if (a3 < 0) {
            return false;
        }
        boolean c = bVar.mo2861c(a, a2);
        mo2871a(a3);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            fVar = new C0747d((AnimationDrawable) current, bVar.mo2860b(a, a2), c);
        } else if (current instanceof C0132c) {
            fVar = new C0746c((C0132c) current);
        } else if (!(current instanceof Animatable)) {
            return false;
        } else {
            fVar = new C0744a((Animatable) current);
        }
        fVar.mo2852a();
        this.f2082c = fVar;
        this.f2084e = i2;
        this.f2083d = i;
        return true;
    }

    /* renamed from: a */
    private void m3013a(TypedArray typedArray) {
        C0745b bVar = this.f2081b;
        if (VERSION.SDK_INT >= 21) {
            bVar.f2124f |= typedArray.getChangingConfigurations();
        }
        bVar.mo2885a(typedArray.getBoolean(C0682j.AnimatedStateListDrawableCompat_android_variablePadding, bVar.f2129k));
        bVar.mo2888b(typedArray.getBoolean(C0682j.AnimatedStateListDrawableCompat_android_constantSize, bVar.f2132n));
        bVar.mo2890c(typedArray.getInt(C0682j.AnimatedStateListDrawableCompat_android_enterFadeDuration, bVar.f2112C));
        bVar.mo2893d(typedArray.getInt(C0682j.AnimatedStateListDrawableCompat_android_exitFadeDuration, bVar.f2113D));
        setDither(typedArray.getBoolean(C0682j.AnimatedStateListDrawableCompat_android_dither, bVar.f2144z));
    }

    /* renamed from: e */
    private void m3018e() {
        onStateChange(getState());
    }

    /* renamed from: c */
    private void m3015c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m3017e(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m3016d(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private int m3016d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a = C0354g.m1303a(resources, theme, attributeSet, C0682j.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C0682j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C0682j.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(C0682j.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable b = resourceId3 > 0 ? C0740a.m3008b(context, resourceId3) : null;
        boolean z = a.getBoolean(C0682j.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        if (b == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                b = C0132c.m202a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                b = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                b = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (b == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f2081b.mo2856a(resourceId, resourceId2, b, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    /* renamed from: e */
    private int m3017e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a = C0354g.m1303a(resources, theme, attributeSet, C0682j.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(C0682j.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a.getResourceId(C0682j.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable b = resourceId2 > 0 ? C0740a.m3008b(context, resourceId2) : null;
        a.recycle();
        int[] a2 = mo2941a(attributeSet);
        if (b == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                b = C0142i.m236a(resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                b = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                b = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (b != null) {
            return this.f2081b.mo2858a(a2, b, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(sb2.toString());
    }

    public Drawable mutate() {
        if (!this.f2085f && super.mutate() == this) {
            this.f2081b.mo2859a();
            this.f2085f = true;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0745b mo2820c() {
        return new C0745b(this.f2081b, this, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2816a(C0753b bVar) {
        super.mo2816a(bVar);
        if (bVar instanceof C0745b) {
            this.f2081b = (C0745b) bVar;
        }
    }
}
