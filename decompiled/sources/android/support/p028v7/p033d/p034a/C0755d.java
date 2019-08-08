package android.support.p028v7.p033d.p034a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.content.p022a.C0354g;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.p031c.p032a.C0740a;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.d.a.d */
/* compiled from: StateListDrawable */
class C0755d extends C0750b {

    /* renamed from: a */
    private C0756a f2146a;

    /* renamed from: b */
    private boolean f2147b;

    /* renamed from: android.support.v7.d.a.d$a */
    /* compiled from: StateListDrawable */
    static class C0756a extends C0753b {

        /* renamed from: L */
        int[][] f2148L;

        C0756a(C0756a aVar, C0755d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f2148L = aVar.f2148L;
            } else {
                this.f2148L = new int[mo2889c()][];
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2859a() {
            int[][] iArr = new int[this.f2148L.length][];
            for (int length = this.f2148L.length - 1; length >= 0; length--) {
                iArr[length] = this.f2148L[length] != null ? (int[]) this.f2148L[length].clone() : null;
            }
            this.f2148L = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo2942a(int[] iArr, Drawable drawable) {
            int a = mo2882a(drawable);
            this.f2148L[a] = iArr;
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo2943b(int[] iArr) {
            int[][] iArr2 = this.f2148L;
            int d = mo2892d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C0755d(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0755d(this, resources);
        }

        /* renamed from: e */
        public void mo2896e(int i, int i2) {
            super.mo2896e(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f2148L, 0, iArr, 0, i);
            this.f2148L = iArr;
        }
    }

    public boolean isStateful() {
        return true;
    }

    C0755d() {
        this(null, null);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b = this.f2146a.mo2943b(iArr);
        if (b < 0) {
            b = this.f2146a.mo2943b(StateSet.WILD_CARD);
        }
        return mo2871a(b) || onStateChange;
    }

    /* renamed from: b */
    public void mo2819b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        TypedArray a = C0354g.m1303a(resources, theme, attributeSet, C0682j.StateListDrawable);
        setVisible(a.getBoolean(C0682j.StateListDrawable_android_visible, true), true);
        m3087a(a);
        mo2869a(resources);
        a.recycle();
        m3086a(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    /* renamed from: a */
    private void m3087a(TypedArray typedArray) {
        C0756a aVar = this.f2146a;
        if (VERSION.SDK_INT >= 21) {
            aVar.f2124f |= typedArray.getChangingConfigurations();
        }
        aVar.f2129k = typedArray.getBoolean(C0682j.StateListDrawable_android_variablePadding, aVar.f2129k);
        aVar.f2132n = typedArray.getBoolean(C0682j.StateListDrawable_android_constantSize, aVar.f2132n);
        aVar.f2112C = typedArray.getInt(C0682j.StateListDrawable_android_enterFadeDuration, aVar.f2112C);
        aVar.f2113D = typedArray.getInt(C0682j.StateListDrawable_android_exitFadeDuration, aVar.f2113D);
        aVar.f2144z = typedArray.getBoolean(C0682j.StateListDrawable_android_dither, aVar.f2144z);
    }

    /* renamed from: a */
    private void m3086a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        C0756a aVar = this.f2146a;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray a = C0354g.m1303a(resources, theme, attributeSet, C0682j.StateListDrawableItem);
                    Drawable drawable = null;
                    int resourceId = a.getResourceId(C0682j.StateListDrawableItem_android_drawable, -1);
                    if (resourceId > 0) {
                        drawable = C0740a.m3008b(context, resourceId);
                    }
                    a.recycle();
                    int[] a2 = mo2941a(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(xmlPullParser.getPositionDescription());
                            sb.append(": <item> tag requires a 'drawable' attribute or ");
                            sb.append("child tag defining a drawable");
                            throw new XmlPullParserException(sb.toString());
                        } else if (VERSION.SDK_INT >= 21) {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    aVar.mo2942a(a2, drawable);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo2941a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f2147b && super.mutate() == this) {
            this.f2146a.mo2859a();
            this.f2147b = true;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0756a mo2820c() {
        return new C0756a(this.f2146a, this, null);
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2816a(C0753b bVar) {
        super.mo2816a(bVar);
        if (bVar instanceof C0756a) {
            this.f2146a = (C0756a) bVar;
        }
    }

    C0755d(C0756a aVar, Resources resources) {
        mo2816a((C0753b) new C0756a(aVar, this, resources));
        onStateChange(getState());
    }

    C0755d(C0756a aVar) {
        if (aVar != null) {
            mo2816a((C0753b) aVar);
        }
    }
}
