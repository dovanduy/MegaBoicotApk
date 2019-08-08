package android.support.p017v4.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint.FontMetricsInt;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.support.p017v4.p021c.C0333a;
import android.support.p017v4.p021c.C0333a.C0334a;
import android.support.p017v4.p021c.C0333a.C0334a.C0335a;
import android.support.p017v4.p023d.C0397l;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.p */
/* compiled from: TextViewCompat */
public final class C0663p {

    /* renamed from: android.support.v4.widget.p$a */
    /* compiled from: TextViewCompat */
    private static class C0664a implements Callback {

        /* renamed from: a */
        private final Callback f1745a;

        /* renamed from: b */
        private final TextView f1746b;

        /* renamed from: c */
        private Class f1747c;

        /* renamed from: d */
        private Method f1748d;

        /* renamed from: e */
        private boolean f1749e;

        /* renamed from: f */
        private boolean f1750f = false;

        C0664a(Callback callback, TextView textView) {
            this.f1745a = callback;
            this.f1746b = textView;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f1745a.onCreateActionMode(actionMode, menu);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m2634a(menu);
            return this.f1745a.onPrepareActionMode(actionMode, menu);
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f1745a.onActionItemClicked(actionMode, menuItem);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f1745a.onDestroyActionMode(actionMode);
        }

        /* renamed from: a */
        private void m2634a(Menu menu) {
            Method method;
            Context context = this.f1746b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f1750f) {
                this.f1750f = true;
                try {
                    this.f1747c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f1748d = this.f1747c.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f1749e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f1747c = null;
                    this.f1748d = null;
                    this.f1749e = false;
                }
            }
            try {
                if (!this.f1749e || !this.f1747c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f1748d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List a = m2633a(context, packageManager);
                for (int i = 0; i < a.size(); i++) {
                    ResolveInfo resolveInfo = (ResolveInfo) a.get(i);
                    menu.add(0, 0, 100 + i, resolveInfo.loadLabel(packageManager)).setIntent(m2632a(resolveInfo, this.f1746b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* renamed from: a */
        private List<ResolveInfo> m2633a(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m2631a(), 0)) {
                if (m2635a(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private boolean m2635a(ResolveInfo resolveInfo, Context context) {
            boolean z = true;
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (!resolveInfo.activityInfo.exported) {
                return false;
            }
            if (!(resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0)) {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        private Intent m2632a(ResolveInfo resolveInfo, TextView textView) {
            return m2631a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m2636a(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        /* renamed from: a */
        private boolean m2636a(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: a */
        private Intent m2631a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    /* renamed from: a */
    public static void m2622a(TextView textView, int i) {
        if (VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: a */
    public static Callback m2621a(TextView textView, Callback callback) {
        return (VERSION.SDK_INT < 26 || VERSION.SDK_INT > 27 || (callback instanceof C0664a)) ? callback : new C0664a(callback, textView);
    }

    /* renamed from: b */
    public static void m2626b(TextView textView, int i) {
        int i2;
        C0397l.m1468a(i);
        if (VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: c */
    public static void m2628c(TextView textView, int i) {
        int i2;
        C0397l.m1468a(i);
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: a */
    public static int m2620a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: b */
    public static int m2625b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static void m2630d(TextView textView, int i) {
        C0397l.m1468a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: c */
    public static C0334a m2627c(TextView textView) {
        if (VERSION.SDK_INT >= 28) {
            return new C0334a(textView.getTextMetricsParams());
        }
        C0335a aVar = new C0335a(new TextPaint(textView.getPaint()));
        if (VERSION.SDK_INT >= 23) {
            aVar.mo1165a(textView.getBreakStrategy());
            aVar.mo1168b(textView.getHyphenationFrequency());
        }
        if (VERSION.SDK_INT >= 18) {
            aVar.mo1166a(m2629d(textView));
        }
        return aVar.mo1167a();
    }

    /* renamed from: a */
    public static void m2623a(TextView textView, C0334a aVar) {
        if (VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m2619a(aVar.mo1159b()));
        }
        if (VERSION.SDK_INT < 23) {
            float textScaleX = aVar.mo1158a().getTextScaleX();
            textView.getPaint().set(aVar.mo1158a());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.mo1158a());
        textView.setBreakStrategy(aVar.mo1160c());
        textView.setHyphenationFrequency(aVar.mo1161d());
    }

    /* renamed from: a */
    public static void m2624a(TextView textView, C0333a aVar) {
        if (VERSION.SDK_INT >= 28) {
            textView.setText(aVar.mo1145a());
        } else if (!m2627c(textView).equals(aVar.mo1146b())) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        } else {
            textView.setText(aVar);
        }
    }

    /* renamed from: d */
    private static TextDirectionHeuristic m2629d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = true;
        if (VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: a */
    private static int m2619a(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }
}
