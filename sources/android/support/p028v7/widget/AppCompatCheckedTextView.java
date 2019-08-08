package android.support.p028v7.widget;

import android.content.Context;
import android.support.p017v4.widget.C0663p;
import android.support.p028v7.p031c.p032a.C0740a;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.AppCompatCheckedTextView */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f2597a = {16843016};

    /* renamed from: b */
    private final C1017l f2598b;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0974av.m4362a(context), attributeSet, i);
        this.f2598b = new C1017l(this);
        this.f2598b.mo5265a(attributeSet, i);
        this.f2598b.mo5260a();
        C0977ay a = C0977ay.m4367a(getContext(), attributeSet, f2597a, i, 0);
        setCheckMarkDrawable(a.mo5086a(0));
        a.mo5087a();
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0740a.m3008b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2598b != null) {
            this.f2598b.mo5264a(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2598b != null) {
            this.f2598b.mo5260a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1013h.m4599a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0663p.m2621a((TextView) this, callback));
    }
}
