package android.support.p028v7.p036f;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: android.support.v7.f.a */
/* compiled from: AllCapsTransformationMethod */
public class C0760a implements TransformationMethod {

    /* renamed from: a */
    private Locale f2149a;

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public C0760a(Context context) {
        this.f2149a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f2149a);
        }
        return null;
    }
}
