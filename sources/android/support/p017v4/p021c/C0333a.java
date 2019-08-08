package android.support.p017v4.p021c;

import android.os.Build.VERSION;
import android.support.p017v4.p023d.C0391i;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.c.a */
/* compiled from: PrecomputedTextCompat */
public class C0333a implements Spannable {

    /* renamed from: a */
    private static final Object f841a = new Object();

    /* renamed from: b */
    private static Executor f842b;

    /* renamed from: c */
    private final Spannable f843c;

    /* renamed from: d */
    private final C0334a f844d;

    /* renamed from: e */
    private final PrecomputedText f845e;

    /* renamed from: android.support.v4.c.a$a */
    /* compiled from: PrecomputedTextCompat */
    public static final class C0334a {

        /* renamed from: a */
        final Params f846a;

        /* renamed from: b */
        private final TextPaint f847b;

        /* renamed from: c */
        private final TextDirectionHeuristic f848c;

        /* renamed from: d */
        private final int f849d;

        /* renamed from: e */
        private final int f850e;

        /* renamed from: android.support.v4.c.a$a$a */
        /* compiled from: PrecomputedTextCompat */
        public static class C0335a {

            /* renamed from: a */
            private final TextPaint f851a;

            /* renamed from: b */
            private TextDirectionHeuristic f852b;

            /* renamed from: c */
            private int f853c;

            /* renamed from: d */
            private int f854d;

            public C0335a(TextPaint textPaint) {
                this.f851a = textPaint;
                if (VERSION.SDK_INT >= 23) {
                    this.f853c = 1;
                    this.f854d = 1;
                } else {
                    this.f854d = 0;
                    this.f853c = 0;
                }
                if (VERSION.SDK_INT >= 18) {
                    this.f852b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f852b = null;
                }
            }

            /* renamed from: a */
            public C0335a mo1165a(int i) {
                this.f853c = i;
                return this;
            }

            /* renamed from: b */
            public C0335a mo1168b(int i) {
                this.f854d = i;
                return this;
            }

            /* renamed from: a */
            public C0335a mo1166a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f852b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public C0334a mo1167a() {
                return new C0334a(this.f851a, this.f852b, this.f853c, this.f854d);
            }
        }

        C0334a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (VERSION.SDK_INT >= 28) {
                this.f846a = new Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f846a = null;
            }
            this.f847b = textPaint;
            this.f848c = textDirectionHeuristic;
            this.f849d = i;
            this.f850e = i2;
        }

        public C0334a(Params params) {
            this.f847b = params.getTextPaint();
            this.f848c = params.getTextDirection();
            this.f849d = params.getBreakStrategy();
            this.f850e = params.getHyphenationFrequency();
            this.f846a = params;
        }

        /* renamed from: a */
        public TextPaint mo1158a() {
            return this.f847b;
        }

        /* renamed from: b */
        public TextDirectionHeuristic mo1159b() {
            return this.f848c;
        }

        /* renamed from: c */
        public int mo1160c() {
            return this.f849d;
        }

        /* renamed from: d */
        public int mo1161d() {
            return this.f850e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof C0334a)) {
                return false;
            }
            C0334a aVar = (C0334a) obj;
            if (this.f846a != null) {
                return this.f846a.equals(aVar.f846a);
            }
            if (VERSION.SDK_INT >= 23 && (this.f849d != aVar.mo1160c() || this.f850e != aVar.mo1161d())) {
                return false;
            }
            if ((VERSION.SDK_INT >= 18 && this.f848c != aVar.mo1159b()) || this.f847b.getTextSize() != aVar.mo1158a().getTextSize() || this.f847b.getTextScaleX() != aVar.mo1158a().getTextScaleX() || this.f847b.getTextSkewX() != aVar.mo1158a().getTextSkewX()) {
                return false;
            }
            if ((VERSION.SDK_INT >= 21 && (this.f847b.getLetterSpacing() != aVar.mo1158a().getLetterSpacing() || !TextUtils.equals(this.f847b.getFontFeatureSettings(), aVar.mo1158a().getFontFeatureSettings()))) || this.f847b.getFlags() != aVar.mo1158a().getFlags()) {
                return false;
            }
            if (VERSION.SDK_INT >= 24) {
                if (!this.f847b.getTextLocales().equals(aVar.mo1158a().getTextLocales())) {
                    return false;
                }
            } else if (VERSION.SDK_INT >= 17 && !this.f847b.getTextLocale().equals(aVar.mo1158a().getTextLocale())) {
                return false;
            }
            if (this.f847b.getTypeface() == null) {
                if (aVar.mo1158a().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f847b.getTypeface().equals(aVar.mo1158a().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (VERSION.SDK_INT >= 24) {
                return C0391i.m1459a(Float.valueOf(this.f847b.getTextSize()), Float.valueOf(this.f847b.getTextScaleX()), Float.valueOf(this.f847b.getTextSkewX()), Float.valueOf(this.f847b.getLetterSpacing()), Integer.valueOf(this.f847b.getFlags()), this.f847b.getTextLocales(), this.f847b.getTypeface(), Boolean.valueOf(this.f847b.isElegantTextHeight()), this.f848c, Integer.valueOf(this.f849d), Integer.valueOf(this.f850e));
            } else if (VERSION.SDK_INT >= 21) {
                return C0391i.m1459a(Float.valueOf(this.f847b.getTextSize()), Float.valueOf(this.f847b.getTextScaleX()), Float.valueOf(this.f847b.getTextSkewX()), Float.valueOf(this.f847b.getLetterSpacing()), Integer.valueOf(this.f847b.getFlags()), this.f847b.getTextLocale(), this.f847b.getTypeface(), Boolean.valueOf(this.f847b.isElegantTextHeight()), this.f848c, Integer.valueOf(this.f849d), Integer.valueOf(this.f850e));
            } else if (VERSION.SDK_INT >= 18) {
                return C0391i.m1459a(Float.valueOf(this.f847b.getTextSize()), Float.valueOf(this.f847b.getTextScaleX()), Float.valueOf(this.f847b.getTextSkewX()), Integer.valueOf(this.f847b.getFlags()), this.f847b.getTextLocale(), this.f847b.getTypeface(), this.f848c, Integer.valueOf(this.f849d), Integer.valueOf(this.f850e));
            } else if (VERSION.SDK_INT >= 17) {
                return C0391i.m1459a(Float.valueOf(this.f847b.getTextSize()), Float.valueOf(this.f847b.getTextScaleX()), Float.valueOf(this.f847b.getTextSkewX()), Integer.valueOf(this.f847b.getFlags()), this.f847b.getTextLocale(), this.f847b.getTypeface(), this.f848c, Integer.valueOf(this.f849d), Integer.valueOf(this.f850e));
            } else {
                return C0391i.m1459a(Float.valueOf(this.f847b.getTextSize()), Float.valueOf(this.f847b.getTextScaleX()), Float.valueOf(this.f847b.getTextSkewX()), Integer.valueOf(this.f847b.getFlags()), this.f847b.getTypeface(), this.f848c, Integer.valueOf(this.f849d), Integer.valueOf(this.f850e));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("textSize=");
            sb2.append(this.f847b.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", textScaleX=");
            sb3.append(this.f847b.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(", textSkewX=");
            sb4.append(this.f847b.getTextSkewX());
            sb.append(sb4.toString());
            if (VERSION.SDK_INT >= 21) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(", letterSpacing=");
                sb5.append(this.f847b.getLetterSpacing());
                sb.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append(", elegantTextHeight=");
                sb6.append(this.f847b.isElegantTextHeight());
                sb.append(sb6.toString());
            }
            if (VERSION.SDK_INT >= 24) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(", textLocale=");
                sb7.append(this.f847b.getTextLocales());
                sb.append(sb7.toString());
            } else if (VERSION.SDK_INT >= 17) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(", textLocale=");
                sb8.append(this.f847b.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(", typeface=");
            sb9.append(this.f847b.getTypeface());
            sb.append(sb9.toString());
            if (VERSION.SDK_INT >= 26) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(", variationSettings=");
                sb10.append(this.f847b.getFontVariationSettings());
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append(", textDir=");
            sb11.append(this.f848c);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(", breakStrategy=");
            sb12.append(this.f849d);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(", hyphenationFrequency=");
            sb13.append(this.f850e);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public PrecomputedText mo1145a() {
        if (this.f843c instanceof PrecomputedText) {
            return (PrecomputedText) this.f843c;
        }
        return null;
    }

    /* renamed from: b */
    public C0334a mo1146b() {
        return this.f844d;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (VERSION.SDK_INT >= 28) {
            this.f845e.setSpan(obj, i, i2, i3);
        } else {
            this.f843c.setSpan(obj, i, i2, i3);
        }
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (VERSION.SDK_INT >= 28) {
            this.f845e.removeSpan(obj);
        } else {
            this.f843c.removeSpan(obj);
        }
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (VERSION.SDK_INT >= 28) {
            return this.f845e.getSpans(i, i2, cls);
        }
        return this.f843c.getSpans(i, i2, cls);
    }

    public int getSpanStart(Object obj) {
        return this.f843c.getSpanStart(obj);
    }

    public int getSpanEnd(Object obj) {
        return this.f843c.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f843c.getSpanFlags(obj);
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f843c.nextSpanTransition(i, i2, cls);
    }

    public int length() {
        return this.f843c.length();
    }

    public char charAt(int i) {
        return this.f843c.charAt(i);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f843c.subSequence(i, i2);
    }

    public String toString() {
        return this.f843c.toString();
    }
}
