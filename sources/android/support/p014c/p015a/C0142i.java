package android.support.p014c.p015a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.p017v4.content.p022a.C0341b;
import android.support.p017v4.content.p022a.C0354g;
import android.support.p017v4.graphics.C0402b;
import android.support.p017v4.graphics.C0402b.C0404b;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.p023d.C0376a;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.c.a.i */
/* compiled from: VectorDrawableCompat */
public class C0142i extends C0141h {

    /* renamed from: a */
    static final Mode f137a = Mode.SRC_IN;

    /* renamed from: b */
    private C0150g f138b;

    /* renamed from: d */
    private PorterDuffColorFilter f139d;

    /* renamed from: e */
    private ColorFilter f140e;

    /* renamed from: f */
    private boolean f141f;

    /* renamed from: g */
    private boolean f142g;

    /* renamed from: h */
    private ConstantState f143h;

    /* renamed from: i */
    private final float[] f144i;

    /* renamed from: j */
    private final Matrix f145j;

    /* renamed from: k */
    private final Rect f146k;

    /* renamed from: android.support.c.a.i$a */
    /* compiled from: VectorDrawableCompat */
    private static class C0144a extends C0148e {
        /* renamed from: a */
        public boolean mo246a() {
            return true;
        }

        public C0144a() {
        }

        public C0144a(C0144a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void mo245a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C0354g.m1307a(xmlPullParser, "pathData")) {
                TypedArray a = C0354g.m1303a(resources, theme, attributeSet, C0130a.f110d);
                m243a(a);
                a.recycle();
            }
        }

        /* renamed from: a */
        private void m243a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f174n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f173m = C0402b.m1515b(string2);
            }
        }
    }

    /* renamed from: android.support.c.a.i$b */
    /* compiled from: VectorDrawableCompat */
    private static class C0145b extends C0148e {

        /* renamed from: a */
        C0341b f147a;

        /* renamed from: b */
        float f148b = 0.0f;

        /* renamed from: c */
        C0341b f149c;

        /* renamed from: d */
        float f150d = 1.0f;

        /* renamed from: e */
        int f151e = 0;

        /* renamed from: f */
        float f152f = 1.0f;

        /* renamed from: g */
        float f153g = 0.0f;

        /* renamed from: h */
        float f154h = 1.0f;

        /* renamed from: i */
        float f155i = 0.0f;

        /* renamed from: j */
        Cap f156j = Cap.BUTT;

        /* renamed from: k */
        Join f157k = Join.MITER;

        /* renamed from: l */
        float f158l = 4.0f;

        /* renamed from: p */
        private int[] f159p;

        public C0145b() {
        }

        public C0145b(C0145b bVar) {
            super(bVar);
            this.f159p = bVar.f159p;
            this.f147a = bVar.f147a;
            this.f148b = bVar.f148b;
            this.f150d = bVar.f150d;
            this.f149c = bVar.f149c;
            this.f151e = bVar.f151e;
            this.f152f = bVar.f152f;
            this.f153g = bVar.f153g;
            this.f154h = bVar.f154h;
            this.f155i = bVar.f155i;
            this.f156j = bVar.f156j;
            this.f157k = bVar.f157k;
            this.f158l = bVar.f158l;
        }

        /* renamed from: a */
        private Cap m246a(int i, Cap cap) {
            switch (i) {
                case 0:
                    return Cap.BUTT;
                case 1:
                    return Cap.ROUND;
                case 2:
                    return Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private Join m247a(int i, Join join) {
            switch (i) {
                case 0:
                    return Join.MITER;
                case 1:
                    return Join.ROUND;
                case 2:
                    return Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        public void mo247a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0354g.m1303a(resources, theme, attributeSet, C0130a.f109c);
            m248a(a, xmlPullParser, theme);
            a.recycle();
        }

        /* renamed from: a */
        private void m248a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.f159p = null;
            if (C0354g.m1307a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f174n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f173m = C0402b.m1515b(string2);
                }
                Theme theme2 = theme;
                this.f149c = C0354g.m1304a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f152f = C0354g.m1301a(typedArray, xmlPullParser, "fillAlpha", 12, this.f152f);
                this.f156j = m246a(C0354g.m1302a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f156j);
                this.f157k = m247a(C0354g.m1302a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f157k);
                this.f158l = C0354g.m1301a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f158l);
                this.f147a = C0354g.m1304a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f150d = C0354g.m1301a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f150d);
                this.f148b = C0354g.m1301a(typedArray, xmlPullParser, "strokeWidth", 4, this.f148b);
                this.f154h = C0354g.m1301a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f154h);
                this.f155i = C0354g.m1301a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f155i);
                this.f153g = C0354g.m1301a(typedArray, xmlPullParser, "trimPathStart", 5, this.f153g);
                this.f151e = C0354g.m1302a(typedArray, xmlPullParser, "fillType", 13, this.f151e);
            }
        }

        /* renamed from: b */
        public boolean mo249b() {
            return this.f149c.mo1201d() || this.f147a.mo1201d();
        }

        /* renamed from: a */
        public boolean mo248a(int[] iArr) {
            return this.f147a.mo1197a(iArr) | this.f149c.mo1197a(iArr);
        }

        /* access modifiers changed from: 0000 */
        public int getStrokeColor() {
            return this.f147a.mo1198b();
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeColor(int i) {
            this.f147a.mo1199b(i);
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeWidth() {
            return this.f148b;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeWidth(float f) {
            this.f148b = f;
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeAlpha() {
            return this.f150d;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeAlpha(float f) {
            this.f150d = f;
        }

        /* access modifiers changed from: 0000 */
        public int getFillColor() {
            return this.f149c.mo1198b();
        }

        /* access modifiers changed from: 0000 */
        public void setFillColor(int i) {
            this.f149c.mo1199b(i);
        }

        /* access modifiers changed from: 0000 */
        public float getFillAlpha() {
            return this.f152f;
        }

        /* access modifiers changed from: 0000 */
        public void setFillAlpha(float f) {
            this.f152f = f;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathStart() {
            return this.f153g;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathStart(float f) {
            this.f153g = f;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathEnd() {
            return this.f154h;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathEnd(float f) {
            this.f154h = f;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathOffset() {
            return this.f155i;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathOffset(float f) {
            this.f155i = f;
        }
    }

    /* renamed from: android.support.c.a.i$c */
    /* compiled from: VectorDrawableCompat */
    private static class C0146c extends C0147d {

        /* renamed from: a */
        final Matrix f160a = new Matrix();

        /* renamed from: b */
        final ArrayList<C0147d> f161b = new ArrayList<>();

        /* renamed from: c */
        float f162c = 0.0f;

        /* renamed from: d */
        final Matrix f163d = new Matrix();

        /* renamed from: e */
        int f164e;

        /* renamed from: f */
        private float f165f = 0.0f;

        /* renamed from: g */
        private float f166g = 0.0f;

        /* renamed from: h */
        private float f167h = 1.0f;

        /* renamed from: i */
        private float f168i = 1.0f;

        /* renamed from: j */
        private float f169j = 0.0f;

        /* renamed from: k */
        private float f170k = 0.0f;

        /* renamed from: l */
        private int[] f171l;

        /* renamed from: m */
        private String f172m = null;

        public C0146c(C0146c cVar, C0376a<String, Object> aVar) {
            C0148e eVar;
            super();
            this.f162c = cVar.f162c;
            this.f165f = cVar.f165f;
            this.f166g = cVar.f166g;
            this.f167h = cVar.f167h;
            this.f168i = cVar.f168i;
            this.f169j = cVar.f169j;
            this.f170k = cVar.f170k;
            this.f171l = cVar.f171l;
            this.f172m = cVar.f172m;
            this.f164e = cVar.f164e;
            if (this.f172m != null) {
                aVar.put(this.f172m, this);
            }
            this.f163d.set(cVar.f163d);
            ArrayList<C0147d> arrayList = cVar.f161b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0146c) {
                    this.f161b.add(new C0146c((C0146c) obj, aVar));
                } else {
                    if (obj instanceof C0145b) {
                        eVar = new C0145b((C0145b) obj);
                    } else if (obj instanceof C0144a) {
                        eVar = new C0144a((C0144a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f161b.add(eVar);
                    if (eVar.f174n != null) {
                        aVar.put(eVar.f174n, eVar);
                    }
                }
            }
        }

        public C0146c() {
            super();
        }

        public String getGroupName() {
            return this.f172m;
        }

        public Matrix getLocalMatrix() {
            return this.f163d;
        }

        /* renamed from: a */
        public void mo266a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0354g.m1303a(resources, theme, attributeSet, C0130a.f108b);
            m253a(a, xmlPullParser);
            a.recycle();
        }

        /* renamed from: a */
        private void m253a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f171l = null;
            this.f162c = C0354g.m1301a(typedArray, xmlPullParser, "rotation", 5, this.f162c);
            this.f165f = typedArray.getFloat(1, this.f165f);
            this.f166g = typedArray.getFloat(2, this.f166g);
            this.f167h = C0354g.m1301a(typedArray, xmlPullParser, "scaleX", 3, this.f167h);
            this.f168i = C0354g.m1301a(typedArray, xmlPullParser, "scaleY", 4, this.f168i);
            this.f169j = C0354g.m1301a(typedArray, xmlPullParser, "translateX", 6, this.f169j);
            this.f170k = C0354g.m1301a(typedArray, xmlPullParser, "translateY", 7, this.f170k);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f172m = string;
            }
            m252a();
        }

        /* renamed from: a */
        private void m252a() {
            this.f163d.reset();
            this.f163d.postTranslate(-this.f165f, -this.f166g);
            this.f163d.postScale(this.f167h, this.f168i);
            this.f163d.postRotate(this.f162c, 0.0f, 0.0f);
            this.f163d.postTranslate(this.f169j + this.f165f, this.f170k + this.f166g);
        }

        public float getRotation() {
            return this.f162c;
        }

        public void setRotation(float f) {
            if (f != this.f162c) {
                this.f162c = f;
                m252a();
            }
        }

        public float getPivotX() {
            return this.f165f;
        }

        public void setPivotX(float f) {
            if (f != this.f165f) {
                this.f165f = f;
                m252a();
            }
        }

        public float getPivotY() {
            return this.f166g;
        }

        public void setPivotY(float f) {
            if (f != this.f166g) {
                this.f166g = f;
                m252a();
            }
        }

        public float getScaleX() {
            return this.f167h;
        }

        public void setScaleX(float f) {
            if (f != this.f167h) {
                this.f167h = f;
                m252a();
            }
        }

        public float getScaleY() {
            return this.f168i;
        }

        public void setScaleY(float f) {
            if (f != this.f168i) {
                this.f168i = f;
                m252a();
            }
        }

        public float getTranslateX() {
            return this.f169j;
        }

        public void setTranslateX(float f) {
            if (f != this.f169j) {
                this.f169j = f;
                m252a();
            }
        }

        public float getTranslateY() {
            return this.f170k;
        }

        public void setTranslateY(float f) {
            if (f != this.f170k) {
                this.f170k = f;
                m252a();
            }
        }

        /* renamed from: b */
        public boolean mo249b() {
            for (int i = 0; i < this.f161b.size(); i++) {
                if (((C0147d) this.f161b.get(i)).mo249b()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo248a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f161b.size(); i++) {
                z |= ((C0147d) this.f161b.get(i)).mo248a(iArr);
            }
            return z;
        }
    }

    /* renamed from: android.support.c.a.i$d */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C0147d {
        /* renamed from: a */
        public boolean mo248a(int[] iArr) {
            return false;
        }

        /* renamed from: b */
        public boolean mo249b() {
            return false;
        }

        private C0147d() {
        }
    }

    /* renamed from: android.support.c.a.i$e */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C0148e extends C0147d {

        /* renamed from: m */
        protected C0404b[] f173m = null;

        /* renamed from: n */
        String f174n;

        /* renamed from: o */
        int f175o;

        /* renamed from: a */
        public boolean mo246a() {
            return false;
        }

        public C0148e() {
            super();
        }

        public C0148e(C0148e eVar) {
            super();
            this.f174n = eVar.f174n;
            this.f175o = eVar.f175o;
            this.f173m = C0402b.m1513a(eVar.f173m);
        }

        /* renamed from: a */
        public void mo283a(Path path) {
            path.reset();
            if (this.f173m != null) {
                C0404b.m1520a(this.f173m, path);
            }
        }

        public String getPathName() {
            return this.f174n;
        }

        public C0404b[] getPathData() {
            return this.f173m;
        }

        public void setPathData(C0404b[] bVarArr) {
            if (!C0402b.m1511a(this.f173m, bVarArr)) {
                this.f173m = C0402b.m1513a(bVarArr);
            } else {
                C0402b.m1514b(this.f173m, bVarArr);
            }
        }
    }

    /* renamed from: android.support.c.a.i$f */
    /* compiled from: VectorDrawableCompat */
    private static class C0149f {

        /* renamed from: n */
        private static final Matrix f176n = new Matrix();

        /* renamed from: a */
        Paint f177a;

        /* renamed from: b */
        Paint f178b;

        /* renamed from: c */
        final C0146c f179c;

        /* renamed from: d */
        float f180d;

        /* renamed from: e */
        float f181e;

        /* renamed from: f */
        float f182f;

        /* renamed from: g */
        float f183g;

        /* renamed from: h */
        int f184h;

        /* renamed from: i */
        String f185i;

        /* renamed from: j */
        Boolean f186j;

        /* renamed from: k */
        final C0376a<String, Object> f187k;

        /* renamed from: l */
        private final Path f188l;

        /* renamed from: m */
        private final Path f189m;

        /* renamed from: o */
        private final Matrix f190o;

        /* renamed from: p */
        private PathMeasure f191p;

        /* renamed from: q */
        private int f192q;

        /* renamed from: a */
        private static float m261a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public C0149f() {
            this.f190o = new Matrix();
            this.f180d = 0.0f;
            this.f181e = 0.0f;
            this.f182f = 0.0f;
            this.f183g = 0.0f;
            this.f184h = 255;
            this.f185i = null;
            this.f186j = null;
            this.f187k = new C0376a<>();
            this.f179c = new C0146c();
            this.f188l = new Path();
            this.f189m = new Path();
        }

        public void setRootAlpha(int i) {
            this.f184h = i;
        }

        public int getRootAlpha() {
            return this.f184h;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public C0149f(C0149f fVar) {
            this.f190o = new Matrix();
            this.f180d = 0.0f;
            this.f181e = 0.0f;
            this.f182f = 0.0f;
            this.f183g = 0.0f;
            this.f184h = 255;
            this.f185i = null;
            this.f186j = null;
            this.f187k = new C0376a<>();
            this.f179c = new C0146c(fVar.f179c, this.f187k);
            this.f188l = new Path(fVar.f188l);
            this.f189m = new Path(fVar.f189m);
            this.f180d = fVar.f180d;
            this.f181e = fVar.f181e;
            this.f182f = fVar.f182f;
            this.f183g = fVar.f183g;
            this.f192q = fVar.f192q;
            this.f184h = fVar.f184h;
            this.f185i = fVar.f185i;
            if (fVar.f185i != null) {
                this.f187k.put(fVar.f185i, this);
            }
            this.f186j = fVar.f186j;
        }

        /* renamed from: a */
        private void m263a(C0146c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f160a.set(matrix);
            cVar.f160a.preConcat(cVar.f163d);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f161b.size(); i3++) {
                C0147d dVar = (C0147d) cVar.f161b.get(i3);
                if (dVar instanceof C0146c) {
                    m263a((C0146c) dVar, cVar.f160a, canvas, i, i2, colorFilter);
                } else if (dVar instanceof C0148e) {
                    m264a(cVar, (C0148e) dVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        public void mo287a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m263a(this.f179c, f176n, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        private void m264a(C0146c cVar, C0148e eVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f182f;
            float f2 = ((float) i2) / this.f183g;
            float min = Math.min(f, f2);
            Matrix matrix = cVar.f160a;
            this.f190o.set(matrix);
            this.f190o.postScale(f, f2);
            float a = m262a(matrix);
            if (a != 0.0f) {
                eVar.mo283a(this.f188l);
                Path path = this.f188l;
                this.f189m.reset();
                if (eVar.mo246a()) {
                    this.f189m.addPath(path, this.f190o);
                    canvas.clipPath(this.f189m);
                } else {
                    C0145b bVar = (C0145b) eVar;
                    if (!(bVar.f153g == 0.0f && bVar.f154h == 1.0f)) {
                        float f3 = (bVar.f153g + bVar.f155i) % 1.0f;
                        float f4 = (bVar.f154h + bVar.f155i) % 1.0f;
                        if (this.f191p == null) {
                            this.f191p = new PathMeasure();
                        }
                        this.f191p.setPath(this.f188l, false);
                        float length = this.f191p.getLength();
                        float f5 = f3 * length;
                        float f6 = f4 * length;
                        path.reset();
                        if (f5 > f6) {
                            this.f191p.getSegment(f5, length, path, true);
                            this.f191p.getSegment(0.0f, f6, path, true);
                        } else {
                            this.f191p.getSegment(f5, f6, path, true);
                        }
                        path.rLineTo(0.0f, 0.0f);
                    }
                    this.f189m.addPath(path, this.f190o);
                    if (bVar.f149c.mo1202e()) {
                        C0341b bVar2 = bVar.f149c;
                        if (this.f178b == null) {
                            this.f178b = new Paint(1);
                            this.f178b.setStyle(Style.FILL);
                        }
                        Paint paint = this.f178b;
                        if (bVar2.mo1200c()) {
                            Shader a2 = bVar2.mo1196a();
                            a2.setLocalMatrix(this.f190o);
                            paint.setShader(a2);
                            paint.setAlpha(Math.round(bVar.f152f * 255.0f));
                        } else {
                            paint.setColor(C0142i.m233a(bVar2.mo1198b(), bVar.f152f));
                        }
                        paint.setColorFilter(colorFilter);
                        this.f189m.setFillType(bVar.f151e == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.f189m, paint);
                    }
                    if (bVar.f147a.mo1202e()) {
                        C0341b bVar3 = bVar.f147a;
                        if (this.f177a == null) {
                            this.f177a = new Paint(1);
                            this.f177a.setStyle(Style.STROKE);
                        }
                        Paint paint2 = this.f177a;
                        if (bVar.f157k != null) {
                            paint2.setStrokeJoin(bVar.f157k);
                        }
                        if (bVar.f156j != null) {
                            paint2.setStrokeCap(bVar.f156j);
                        }
                        paint2.setStrokeMiter(bVar.f158l);
                        if (bVar3.mo1200c()) {
                            Shader a3 = bVar3.mo1196a();
                            a3.setLocalMatrix(this.f190o);
                            paint2.setShader(a3);
                            paint2.setAlpha(Math.round(bVar.f150d * 255.0f));
                        } else {
                            paint2.setColor(C0142i.m233a(bVar3.mo1198b(), bVar.f150d));
                        }
                        paint2.setColorFilter(colorFilter);
                        paint2.setStrokeWidth(bVar.f148b * min * a);
                        canvas.drawPath(this.f189m, paint2);
                    }
                }
            }
        }

        /* renamed from: a */
        private float m262a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = m261a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        public boolean mo288a() {
            if (this.f186j == null) {
                this.f186j = Boolean.valueOf(this.f179c.mo249b());
            }
            return this.f186j.booleanValue();
        }

        /* renamed from: a */
        public boolean mo289a(int[] iArr) {
            return this.f179c.mo248a(iArr);
        }
    }

    /* renamed from: android.support.c.a.i$g */
    /* compiled from: VectorDrawableCompat */
    private static class C0150g extends ConstantState {

        /* renamed from: a */
        int f193a;

        /* renamed from: b */
        C0149f f194b;

        /* renamed from: c */
        ColorStateList f195c;

        /* renamed from: d */
        Mode f196d;

        /* renamed from: e */
        boolean f197e;

        /* renamed from: f */
        Bitmap f198f;

        /* renamed from: g */
        ColorStateList f199g;

        /* renamed from: h */
        Mode f200h;

        /* renamed from: i */
        int f201i;

        /* renamed from: j */
        boolean f202j;

        /* renamed from: k */
        boolean f203k;

        /* renamed from: l */
        Paint f204l;

        public C0150g(C0150g gVar) {
            this.f195c = null;
            this.f196d = C0142i.f137a;
            if (gVar != null) {
                this.f193a = gVar.f193a;
                this.f194b = new C0149f(gVar.f194b);
                if (gVar.f194b.f178b != null) {
                    this.f194b.f178b = new Paint(gVar.f194b.f178b);
                }
                if (gVar.f194b.f177a != null) {
                    this.f194b.f177a = new Paint(gVar.f194b.f177a);
                }
                this.f195c = gVar.f195c;
                this.f196d = gVar.f196d;
                this.f197e = gVar.f197e;
            }
        }

        /* renamed from: a */
        public void mo296a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f198f, null, rect, mo294a(colorFilter));
        }

        /* renamed from: a */
        public boolean mo297a() {
            return this.f194b.getRootAlpha() < 255;
        }

        /* renamed from: a */
        public Paint mo294a(ColorFilter colorFilter) {
            if (!mo297a() && colorFilter == null) {
                return null;
            }
            if (this.f204l == null) {
                this.f204l = new Paint();
                this.f204l.setFilterBitmap(true);
            }
            this.f204l.setAlpha(this.f194b.getRootAlpha());
            this.f204l.setColorFilter(colorFilter);
            return this.f204l;
        }

        /* renamed from: a */
        public void mo295a(int i, int i2) {
            this.f198f.eraseColor(0);
            this.f194b.mo287a(new Canvas(this.f198f), i, i2, (ColorFilter) null);
        }

        /* renamed from: b */
        public void mo299b(int i, int i2) {
            if (this.f198f == null || !mo302c(i, i2)) {
                this.f198f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f203k = true;
            }
        }

        /* renamed from: c */
        public boolean mo302c(int i, int i2) {
            return i == this.f198f.getWidth() && i2 == this.f198f.getHeight();
        }

        /* renamed from: b */
        public boolean mo300b() {
            return !this.f203k && this.f199g == this.f195c && this.f200h == this.f196d && this.f202j == this.f197e && this.f201i == this.f194b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo301c() {
            this.f199g = this.f195c;
            this.f200h = this.f196d;
            this.f201i = this.f194b.getRootAlpha();
            this.f202j = this.f197e;
            this.f203k = false;
        }

        public C0150g() {
            this.f195c = null;
            this.f196d = C0142i.f137a;
            this.f194b = new C0149f();
        }

        public Drawable newDrawable() {
            return new C0142i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0142i(this);
        }

        public int getChangingConfigurations() {
            return this.f193a;
        }

        /* renamed from: d */
        public boolean mo303d() {
            return this.f194b.mo288a();
        }

        /* renamed from: a */
        public boolean mo298a(int[] iArr) {
            boolean a = this.f194b.mo289a(iArr);
            this.f203k |= a;
            return a;
        }
    }

    /* renamed from: android.support.c.a.i$h */
    /* compiled from: VectorDrawableCompat */
    private static class C0151h extends ConstantState {

        /* renamed from: a */
        private final ConstantState f205a;

        public C0151h(ConstantState constantState) {
            this.f205a = constantState;
        }

        public Drawable newDrawable() {
            C0142i iVar = new C0142i();
            iVar.f136c = (VectorDrawable) this.f205a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0142i iVar = new C0142i();
            iVar.f136c = (VectorDrawable) this.f205a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C0142i iVar = new C0142i();
            iVar.f136c = (VectorDrawable) this.f205a.newDrawable(resources, theme);
            return iVar;
        }

        public boolean canApplyTheme() {
            return this.f205a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f205a.getChangingConfigurations();
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
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

    C0142i() {
        this.f142g = true;
        this.f144i = new float[9];
        this.f145j = new Matrix();
        this.f146k = new Rect();
        this.f138b = new C0150g();
    }

    C0142i(C0150g gVar) {
        this.f142g = true;
        this.f144i = new float[9];
        this.f145j = new Matrix();
        this.f146k = new Rect();
        this.f138b = gVar;
        this.f139d = mo221a(this.f139d, gVar.f195c, gVar.f196d);
    }

    public Drawable mutate() {
        if (this.f136c != null) {
            this.f136c.mutate();
            return this;
        }
        if (!this.f141f && super.mutate() == this) {
            this.f138b = new C0150g(this.f138b);
            this.f141f = true;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo222a(String str) {
        return this.f138b.f194b.f187k.get(str);
    }

    public ConstantState getConstantState() {
        if (this.f136c != null && VERSION.SDK_INT >= 24) {
            return new C0151h(this.f136c.getConstantState());
        }
        this.f138b.f193a = getChangingConfigurations();
        return this.f138b;
    }

    public void draw(Canvas canvas) {
        if (this.f136c != null) {
            this.f136c.draw(canvas);
            return;
        }
        copyBounds(this.f146k);
        if (this.f146k.width() > 0 && this.f146k.height() > 0) {
            ColorFilter colorFilter = this.f140e == null ? this.f139d : this.f140e;
            canvas.getMatrix(this.f145j);
            this.f145j.getValues(this.f144i);
            float abs = Math.abs(this.f144i[0]);
            float abs2 = Math.abs(this.f144i[4]);
            float abs3 = Math.abs(this.f144i[1]);
            float abs4 = Math.abs(this.f144i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int height = (int) (((float) this.f146k.height()) * abs2);
            int min = Math.min(2048, (int) (((float) this.f146k.width()) * abs));
            int min2 = Math.min(2048, height);
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f146k.left, (float) this.f146k.top);
                if (m238a()) {
                    canvas.translate((float) this.f146k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f146k.offsetTo(0, 0);
                this.f138b.mo299b(min, min2);
                if (!this.f142g) {
                    this.f138b.mo295a(min, min2);
                } else if (!this.f138b.mo300b()) {
                    this.f138b.mo295a(min, min2);
                    this.f138b.mo301c();
                }
                this.f138b.mo296a(canvas, colorFilter, this.f146k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        if (this.f136c != null) {
            return C0407a.m1547c(this.f136c);
        }
        return this.f138b.f194b.getRootAlpha();
    }

    public void setAlpha(int i) {
        if (this.f136c != null) {
            this.f136c.setAlpha(i);
            return;
        }
        if (this.f138b.f194b.getRootAlpha() != i) {
            this.f138b.f194b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f136c != null) {
            this.f136c.setColorFilter(colorFilter);
            return;
        }
        this.f140e = colorFilter;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PorterDuffColorFilter mo221a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setTint(int i) {
        if (this.f136c != null) {
            C0407a.m1538a(this.f136c, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f136c != null) {
            C0407a.m1540a(this.f136c, colorStateList);
            return;
        }
        C0150g gVar = this.f138b;
        if (gVar.f195c != colorStateList) {
            gVar.f195c = colorStateList;
            this.f139d = mo221a(this.f139d, colorStateList, gVar.f196d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        if (this.f136c != null) {
            C0407a.m1543a(this.f136c, mode);
            return;
        }
        C0150g gVar = this.f138b;
        if (gVar.f196d != mode) {
            gVar.f196d = mode;
            this.f139d = mo221a(this.f139d, gVar.f195c, mode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        if (this.f136c != null) {
            return this.f136c.isStateful();
        }
        return super.isStateful() || (this.f138b != null && (this.f138b.mo303d() || (this.f138b.f195c != null && this.f138b.f195c.isStateful())));
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f136c != null) {
            return this.f136c.setState(iArr);
        }
        boolean z = false;
        C0150g gVar = this.f138b;
        if (!(gVar.f195c == null || gVar.f196d == null)) {
            this.f139d = mo221a(this.f139d, gVar.f195c, gVar.f196d);
            invalidateSelf();
            z = true;
        }
        if (gVar.mo303d() && gVar.mo298a(iArr)) {
            invalidateSelf();
            z = true;
        }
        return z;
    }

    public int getOpacity() {
        if (this.f136c != null) {
            return this.f136c.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        if (this.f136c != null) {
            return this.f136c.getIntrinsicWidth();
        }
        return (int) this.f138b.f194b.f180d;
    }

    public int getIntrinsicHeight() {
        if (this.f136c != null) {
            return this.f136c.getIntrinsicHeight();
        }
        return (int) this.f138b.f194b.f181e;
    }

    public boolean canApplyTheme() {
        if (this.f136c != null) {
            C0407a.m1548d(this.f136c);
        }
        return false;
    }

    public boolean isAutoMirrored() {
        if (this.f136c != null) {
            return C0407a.m1545b(this.f136c);
        }
        return this.f138b.f197e;
    }

    public void setAutoMirrored(boolean z) {
        if (this.f136c != null) {
            C0407a.m1544a(this.f136c, z);
        } else {
            this.f138b.f197e = z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p014c.p015a.C0142i m235a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            android.support.c.a.i r0 = new android.support.c.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r4 = android.support.p017v4.content.p022a.C0350f.m1296a(r4, r5, r6)
            r0.f136c = r4
            android.support.c.a.i$h r4 = new android.support.c.a.i$h
            android.graphics.drawable.Drawable r5 = r0.f136c
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f143h = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
            r2 = 2
            if (r1 == r2) goto L_0x0032
            r3 = 1
            if (r1 == r3) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            if (r1 == r2) goto L_0x003c
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
            throw r4     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
        L_0x003c:
            android.support.c.a.i r4 = m236a(r4, r5, r0, r6)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
            return r4
        L_0x0041:
            r4 = move-exception
            java.lang.String r5 = "VectorDrawableCompat"
            java.lang.String r6 = "parser error"
            android.util.Log.e(r5, r6, r4)
            goto L_0x0052
        L_0x004a:
            r4 = move-exception
            java.lang.String r5 = "VectorDrawableCompat"
            java.lang.String r6 = "parser error"
            android.util.Log.e(r5, r6, r4)
        L_0x0052:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p014c.p015a.C0142i.m235a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.c.a.i");
    }

    /* renamed from: a */
    public static C0142i m236a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C0142i iVar = new C0142i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: a */
    static int m233a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.f136c != null) {
            this.f136c.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (this.f136c != null) {
            C0407a.m1542a(this.f136c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0150g gVar = this.f138b;
        gVar.f194b = new C0149f();
        TypedArray a = C0354g.m1303a(resources, theme, attributeSet, C0130a.f107a);
        m237a(a, xmlPullParser);
        a.recycle();
        gVar.f193a = getChangingConfigurations();
        gVar.f203k = true;
        m239b(resources, xmlPullParser, attributeSet, theme);
        this.f139d = mo221a(this.f139d, gVar.f195c, gVar.f196d);
    }

    /* renamed from: a */
    private static Mode m234a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    private void m237a(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        C0150g gVar = this.f138b;
        C0149f fVar = gVar.f194b;
        gVar.f196d = m234a(C0354g.m1302a(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            gVar.f195c = colorStateList;
        }
        gVar.f197e = C0354g.m1306a(typedArray, xmlPullParser, "autoMirrored", 5, gVar.f197e);
        fVar.f182f = C0354g.m1301a(typedArray, xmlPullParser, "viewportWidth", 7, fVar.f182f);
        fVar.f183g = C0354g.m1301a(typedArray, xmlPullParser, "viewportHeight", 8, fVar.f183g);
        if (fVar.f182f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (fVar.f183g <= 0.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(typedArray.getPositionDescription());
            sb2.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb2.toString());
        } else {
            fVar.f180d = typedArray.getDimension(3, fVar.f180d);
            fVar.f181e = typedArray.getDimension(2, fVar.f181e);
            if (fVar.f180d <= 0.0f) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb3.toString());
            } else if (fVar.f181e <= 0.0f) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(typedArray.getPositionDescription());
                sb4.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb4.toString());
            } else {
                fVar.setAlpha(C0354g.m1301a(typedArray, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    fVar.f185i = string;
                    fVar.f187k.put(string, fVar);
                }
            }
        }
    }

    /* renamed from: b */
    private void m239b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C0150g gVar = this.f138b;
        C0149f fVar = gVar.f194b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f179c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0146c cVar = (C0146c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0145b bVar = new C0145b();
                    bVar.mo247a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f161b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f187k.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    gVar.f193a = bVar.f175o | gVar.f193a;
                } else if ("clip-path".equals(name)) {
                    C0144a aVar = new C0144a();
                    aVar.mo245a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f161b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.f187k.put(aVar.getPathName(), aVar);
                    }
                    gVar.f193a = aVar.f175o | gVar.f193a;
                } else if ("group".equals(name)) {
                    C0146c cVar2 = new C0146c();
                    cVar2.mo266a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f161b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.f187k.put(cVar2.getGroupName(), cVar2);
                    }
                    gVar.f193a = cVar2.f164e | gVar.f193a;
                }
            } else if (eventType == 3) {
                if ("group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo223a(boolean z) {
        this.f142g = z;
    }

    /* renamed from: a */
    private boolean m238a() {
        boolean z = false;
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (isAutoMirrored() && C0407a.m1552h(this) == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f136c != null) {
            this.f136c.setBounds(rect);
        }
    }

    public int getChangingConfigurations() {
        if (this.f136c != null) {
            return this.f136c.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f138b.getChangingConfigurations();
    }

    public void invalidateSelf() {
        if (this.f136c != null) {
            this.f136c.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f136c != null) {
            this.f136c.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f136c != null) {
            return this.f136c.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.f136c != null) {
            this.f136c.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
