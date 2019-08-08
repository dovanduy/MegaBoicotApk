package android.support.p014c.p015a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.p017v4.content.p022a.C0354g;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.p023d.C0376a;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.c.a.c */
/* compiled from: AnimatedVectorDrawableCompat */
public class C0132c extends C0141h implements C0131b {

    /* renamed from: a */
    ArrayList<Object> f119a;

    /* renamed from: b */
    final Callback f120b;

    /* renamed from: d */
    private C0134a f121d;

    /* renamed from: e */
    private Context f122e;

    /* renamed from: f */
    private ArgbEvaluator f123f;

    /* renamed from: g */
    private AnimatorListener f124g;

    /* renamed from: android.support.c.a.c$a */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C0134a extends ConstantState {

        /* renamed from: a */
        int f126a;

        /* renamed from: b */
        C0142i f127b;

        /* renamed from: c */
        AnimatorSet f128c;

        /* renamed from: d */
        ArrayList<Animator> f129d;

        /* renamed from: e */
        C0376a<Animator, String> f130e;

        public C0134a(Context context, C0134a aVar, Callback callback, Resources resources) {
            if (aVar != null) {
                this.f126a = aVar.f126a;
                if (aVar.f127b != null) {
                    ConstantState constantState = aVar.f127b.getConstantState();
                    if (resources != null) {
                        this.f127b = (C0142i) constantState.newDrawable(resources);
                    } else {
                        this.f127b = (C0142i) constantState.newDrawable();
                    }
                    this.f127b = (C0142i) this.f127b.mutate();
                    this.f127b.setCallback(callback);
                    this.f127b.setBounds(aVar.f127b.getBounds());
                    this.f127b.mo223a(false);
                }
                if (aVar.f129d != null) {
                    int size = aVar.f129d.size();
                    this.f129d = new ArrayList<>(size);
                    this.f130e = new C0376a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) aVar.f129d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) aVar.f130e.get(animator);
                        clone.setTarget(this.f127b.mo222a(str));
                        this.f129d.add(clone);
                        this.f130e.put(clone, str);
                    }
                    mo208a();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.f126a;
        }

        /* renamed from: a */
        public void mo208a() {
            if (this.f128c == null) {
                this.f128c = new AnimatorSet();
            }
            this.f128c.playTogether(this.f129d);
        }
    }

    /* renamed from: android.support.c.a.c$b */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C0135b extends ConstantState {

        /* renamed from: a */
        private final ConstantState f131a;

        public C0135b(ConstantState constantState) {
            this.f131a = constantState;
        }

        public Drawable newDrawable() {
            C0132c cVar = new C0132c();
            cVar.f136c = this.f131a.newDrawable();
            cVar.f136c.setCallback(cVar.f120b);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0132c cVar = new C0132c();
            cVar.f136c = this.f131a.newDrawable(resources);
            cVar.f136c.setCallback(cVar.f120b);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C0132c cVar = new C0132c();
            cVar.f136c = this.f131a.newDrawable(resources, theme);
            cVar.f136c.setCallback(cVar.f120b);
            return cVar;
        }

        public boolean canApplyTheme() {
            return this.f131a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f131a.getChangingConfigurations();
        }
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    C0132c() {
        this(null, null, null);
    }

    private C0132c(Context context) {
        this(context, null, null);
    }

    private C0132c(Context context, C0134a aVar, Resources resources) {
        this.f123f = null;
        this.f124g = null;
        this.f119a = null;
        this.f120b = new Callback() {
            public void invalidateDrawable(Drawable drawable) {
                C0132c.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C0132c.this.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C0132c.this.unscheduleSelf(runnable);
            }
        };
        this.f122e = context;
        if (aVar != null) {
            this.f121d = aVar;
        } else {
            this.f121d = new C0134a(context, aVar, this.f120b, resources);
        }
    }

    public Drawable mutate() {
        if (this.f136c != null) {
            this.f136c.mutate();
        }
        return this;
    }

    /* renamed from: a */
    public static C0132c m202a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C0132c cVar = new C0132c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public ConstantState getConstantState() {
        if (this.f136c == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0135b(this.f136c.getConstantState());
    }

    public int getChangingConfigurations() {
        if (this.f136c != null) {
            return this.f136c.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f121d.f126a;
    }

    public void draw(Canvas canvas) {
        if (this.f136c != null) {
            this.f136c.draw(canvas);
            return;
        }
        this.f121d.f127b.draw(canvas);
        if (this.f121d.f128c.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f136c != null) {
            this.f136c.setBounds(rect);
        } else {
            this.f121d.f127b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f136c != null) {
            return this.f136c.setState(iArr);
        }
        return this.f121d.f127b.setState(iArr);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f136c != null) {
            return this.f136c.setLevel(i);
        }
        return this.f121d.f127b.setLevel(i);
    }

    public int getAlpha() {
        if (this.f136c != null) {
            return C0407a.m1547c(this.f136c);
        }
        return this.f121d.f127b.getAlpha();
    }

    public void setAlpha(int i) {
        if (this.f136c != null) {
            this.f136c.setAlpha(i);
        } else {
            this.f121d.f127b.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f136c != null) {
            this.f136c.setColorFilter(colorFilter);
        } else {
            this.f121d.f127b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        if (this.f136c != null) {
            C0407a.m1538a(this.f136c, i);
        } else {
            this.f121d.f127b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f136c != null) {
            C0407a.m1540a(this.f136c, colorStateList);
        } else {
            this.f121d.f127b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (this.f136c != null) {
            C0407a.m1543a(this.f136c, mode);
        } else {
            this.f121d.f127b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f136c != null) {
            return this.f136c.setVisible(z, z2);
        }
        this.f121d.f127b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public boolean isStateful() {
        if (this.f136c != null) {
            return this.f136c.isStateful();
        }
        return this.f121d.f127b.isStateful();
    }

    public int getOpacity() {
        if (this.f136c != null) {
            return this.f136c.getOpacity();
        }
        return this.f121d.f127b.getOpacity();
    }

    public int getIntrinsicWidth() {
        if (this.f136c != null) {
            return this.f136c.getIntrinsicWidth();
        }
        return this.f121d.f127b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.f136c != null) {
            return this.f136c.getIntrinsicHeight();
        }
        return this.f121d.f127b.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        if (this.f136c != null) {
            return C0407a.m1545b(this.f136c);
        }
        return this.f121d.f127b.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        if (this.f136c != null) {
            C0407a.m1544a(this.f136c, z);
        } else {
            this.f121d.f127b.setAutoMirrored(z);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (this.f136c != null) {
            C0407a.m1542a(this.f136c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a = C0354g.m1303a(resources, theme, attributeSet, C0130a.f111e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0142i a2 = C0142i.m235a(resources, resourceId, theme);
                        a2.mo223a(false);
                        a2.setCallback(this.f120b);
                        if (this.f121d.f127b != null) {
                            this.f121d.f127b.setCallback(null);
                        }
                        this.f121d.f127b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0130a.f112f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f122e != null) {
                            m204a(string, C0137e.m210a(this.f122e, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f121d.mo208a();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void applyTheme(Theme theme) {
        if (this.f136c != null) {
            C0407a.m1541a(this.f136c, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.f136c != null) {
            return C0407a.m1548d(this.f136c);
        }
        return false;
    }

    /* renamed from: a */
    private void m203a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m203a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f123f == null) {
                    this.f123f = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f123f);
            }
        }
    }

    /* renamed from: a */
    private void m204a(String str, Animator animator) {
        animator.setTarget(this.f121d.f127b.mo222a(str));
        if (VERSION.SDK_INT < 21) {
            m203a(animator);
        }
        if (this.f121d.f129d == null) {
            this.f121d.f129d = new ArrayList<>();
            this.f121d.f130e = new C0376a<>();
        }
        this.f121d.f129d.add(animator);
        this.f121d.f130e.put(animator, str);
    }

    public boolean isRunning() {
        if (this.f136c != null) {
            return ((AnimatedVectorDrawable) this.f136c).isRunning();
        }
        return this.f121d.f128c.isRunning();
    }

    public void start() {
        if (this.f136c != null) {
            ((AnimatedVectorDrawable) this.f136c).start();
        } else if (!this.f121d.f128c.isStarted()) {
            this.f121d.f128c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.f136c != null) {
            ((AnimatedVectorDrawable) this.f136c).stop();
        } else {
            this.f121d.f128c.end();
        }
    }
}
