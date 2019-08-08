package com.facebook.appevents.p126a.p127a;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.facebook.appevents.a.a.d */
/* compiled from: ViewHierarchy */
public class C2395d {

    /* renamed from: a */
    private static final String f7614a = C2395d.class.getCanonicalName();

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m9208a(android.view.View r7) {
        /*
            boolean r0 = r7 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L_0x0020
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r1 = r0.getText()
            boolean r0 = r7 instanceof android.widget.Switch
            if (r0 == 0) goto L_0x00c5
            android.widget.Switch r7 = (android.widget.Switch) r7
            boolean r7 = r7.isChecked()
            if (r7 == 0) goto L_0x001d
            java.lang.String r7 = "1"
        L_0x001a:
            r1 = r7
            goto L_0x00c5
        L_0x001d:
            java.lang.String r7 = "0"
            goto L_0x001a
        L_0x0020:
            boolean r0 = r7 instanceof android.widget.Spinner
            if (r0 == 0) goto L_0x0032
            android.widget.Spinner r7 = (android.widget.Spinner) r7
            java.lang.Object r7 = r7.getSelectedItem()
            if (r7 == 0) goto L_0x00c5
            java.lang.String r1 = r7.toString()
            goto L_0x00c5
        L_0x0032:
            boolean r0 = r7 instanceof android.widget.DatePicker
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0063
            android.widget.DatePicker r7 = (android.widget.DatePicker) r7
            int r0 = r7.getYear()
            int r1 = r7.getMonth()
            int r7 = r7.getDayOfMonth()
            java.lang.String r5 = "%04d-%02d-%02d"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6[r3] = r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r2] = r7
            java.lang.String r1 = java.lang.String.format(r5, r6)
            goto L_0x00c5
        L_0x0063:
            boolean r0 = r7 instanceof android.widget.TimePicker
            if (r0 == 0) goto L_0x008e
            android.widget.TimePicker r7 = (android.widget.TimePicker) r7
            java.lang.Integer r0 = r7.getCurrentHour()
            int r0 = r0.intValue()
            java.lang.Integer r7 = r7.getCurrentMinute()
            int r7 = r7.intValue()
            java.lang.String r1 = "%02d:%02d"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r4] = r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r3] = r7
            java.lang.String r1 = java.lang.String.format(r1, r2)
            goto L_0x00c5
        L_0x008e:
            boolean r0 = r7 instanceof android.widget.RadioGroup
            if (r0 == 0) goto L_0x00b7
            android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7
            int r0 = r7.getCheckedRadioButtonId()
            int r2 = r7.getChildCount()
        L_0x009c:
            if (r4 >= r2) goto L_0x00c5
            android.view.View r3 = r7.getChildAt(r4)
            int r5 = r3.getId()
            if (r5 != r0) goto L_0x00b4
            boolean r5 = r3 instanceof android.widget.RadioButton
            if (r5 == 0) goto L_0x00b4
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            java.lang.CharSequence r7 = r3.getText()
            goto L_0x001a
        L_0x00b4:
            int r4 = r4 + 1
            goto L_0x009c
        L_0x00b7:
            boolean r0 = r7 instanceof android.widget.RatingBar
            if (r0 == 0) goto L_0x00c5
            android.widget.RatingBar r7 = (android.widget.RatingBar) r7
            float r7 = r7.getRating()
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L_0x00c5:
            if (r1 != 0) goto L_0x00ca
            java.lang.String r7 = ""
            goto L_0x00ce
        L_0x00ca:
            java.lang.String r7 = r1.toString()
        L_0x00ce:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.p126a.p127a.C2395d.m9208a(android.view.View):java.lang.String");
    }

    /* renamed from: b */
    public static String m9209b(View view) {
        CharSequence charSequence = view instanceof TextView ? ((TextView) view).getHint() : view instanceof EditText ? ((EditText) view).getHint() : null;
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    /* renamed from: c */
    public static AccessibilityDelegate m9210c(View view) {
        try {
            return (AccessibilityDelegate) view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (NullPointerException unused2) {
            return null;
        } catch (SecurityException unused3) {
            return null;
        } catch (IllegalAccessException unused4) {
            return null;
        } catch (InvocationTargetException unused5) {
            return null;
        }
    }
}
