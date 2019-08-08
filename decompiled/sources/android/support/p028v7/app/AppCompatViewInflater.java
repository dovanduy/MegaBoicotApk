package android.support.p028v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p017v4.p023d.C0376a;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.view.C0765d;
import android.support.p028v7.widget.AppCompatAutoCompleteTextView;
import android.support.p028v7.widget.AppCompatButton;
import android.support.p028v7.widget.AppCompatCheckBox;
import android.support.p028v7.widget.AppCompatCheckedTextView;
import android.support.p028v7.widget.AppCompatEditText;
import android.support.p028v7.widget.AppCompatImageButton;
import android.support.p028v7.widget.AppCompatImageView;
import android.support.p028v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.p028v7.widget.AppCompatRadioButton;
import android.support.p028v7.widget.AppCompatRatingBar;
import android.support.p028v7.widget.AppCompatSeekBar;
import android.support.p028v7.widget.AppCompatSpinner;
import android.support.p028v7.widget.AppCompatTextView;
import android.support.p028v7.widget.C0974av;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: android.support.v7.app.AppCompatViewInflater */
public class AppCompatViewInflater {

    /* renamed from: a */
    private static final Class<?>[] f1986a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f1987b = {16843375};

    /* renamed from: c */
    private static final String[] f1988c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f1989d = new C0376a();

    /* renamed from: e */
    private final Object[] f1990e = new Object[2];

    /* renamed from: android.support.v7.app.AppCompatViewInflater$a */
    private static class C0715a implements OnClickListener {

        /* renamed from: a */
        private final View f1991a;

        /* renamed from: b */
        private final String f1992b;

        /* renamed from: c */
        private Method f1993c;

        /* renamed from: d */
        private Context f1994d;

        public C0715a(View view, String str) {
            this.f1991a = view;
            this.f1992b = str;
        }

        public void onClick(View view) {
            if (this.f1993c == null) {
                m2874a(this.f1991a.getContext(), this.f1992b);
            }
            try {
                this.f1993c.invoke(this.f1994d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        /* renamed from: a */
        private void m2874a(Context context, String str) {
            String str2;
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.f1992b, new Class[]{View.class});
                        if (method != null) {
                            this.f1993c = method;
                            this.f1994d = context;
                            return;
                        }
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f1991a.getId();
            if (id == -1) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" with id '");
                sb.append(this.f1991a.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                str2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find method ");
            sb2.append(this.f1992b);
            sb2.append("(View) in a parent or ancestor Context for android:onClick ");
            sb2.append("attribute defined on view ");
            sb2.append(this.f1991a.getClass());
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo2747a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo2748a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m2854a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0974av.m4362a(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo2746a(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 1:
                view2 = mo2749b(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 2:
                view2 = mo2750c(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 3:
                view2 = mo2751d(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 4:
                view2 = mo2752e(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 5:
                view2 = mo2753f(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 6:
                view2 = mo2754g(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 7:
                view2 = mo2755h(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 8:
                view2 = mo2756i(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 9:
                view2 = mo2757j(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 10:
                view2 = mo2758k(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 11:
                view2 = mo2759l(context2, attributeSet);
                m2857a(view2, str);
                break;
            case 12:
                view2 = mo2760m(context2, attributeSet);
                m2857a(view2, str);
                break;
            default:
                view2 = mo2747a(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m2858b(context2, str, attributeSet);
        }
        if (view2 != null) {
            m2856a(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AppCompatTextView mo2746a(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AppCompatImageView mo2749b(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AppCompatButton mo2750c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AppCompatEditText mo2751d(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AppCompatSpinner mo2752e(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public AppCompatImageButton mo2753f(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AppCompatCheckBox mo2754g(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AppCompatRadioButton mo2755h(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AppCompatCheckedTextView mo2756i(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AppCompatAutoCompleteTextView mo2757j(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public AppCompatMultiAutoCompleteTextView mo2758k(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public AppCompatRatingBar mo2759l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AppCompatSeekBar mo2760m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    /* renamed from: a */
    private void m2857a(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private View m2858b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f1990e[0] = context;
            this.f1990e[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f1988c) {
                    View a2 = m2855a(context, str, a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                this.f1990e[0] = null;
                this.f1990e[1] = null;
                return null;
            }
            View a3 = m2855a(context, str, (String) null);
            this.f1990e[0] = null;
            this.f1990e[1] = null;
            return a3;
        } catch (Exception unused) {
            return null;
        } finally {
            this.f1990e[0] = null;
            this.f1990e[1] = null;
        }
    }

    /* renamed from: a */
    private void m2856a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && (VERSION.SDK_INT < 15 || C0595r.m2277z(view))) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1987b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0715a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private View m2855a(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor constructor = (Constructor) f1989d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f1986a);
                f1989d.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1990e);
    }

    /* renamed from: a */
    private static Context m2854a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0682j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0682j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C0682j.View_theme, 0);
            if (resourceId != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof C0765d) || ((C0765d) context).mo2958a() != resourceId) ? new C0765d(context, resourceId) : context;
        }
        return context;
    }
}
