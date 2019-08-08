package android.support.p017v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.FragmentTabHost */
public class FragmentTabHost extends TabHost implements OnTabChangeListener {

    /* renamed from: a */
    private final ArrayList<C0223a> f432a = new ArrayList<>();

    /* renamed from: b */
    private Context f433b;

    /* renamed from: c */
    private C0254i f434c;

    /* renamed from: d */
    private int f435d;

    /* renamed from: e */
    private OnTabChangeListener f436e;

    /* renamed from: f */
    private C0223a f437f;

    /* renamed from: g */
    private boolean f438g;

    /* renamed from: android.support.v4.app.FragmentTabHost$SavedState */
    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        String f439a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f439a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f439a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.f439a);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.app.FragmentTabHost$a */
    static final class C0223a {

        /* renamed from: a */
        final String f440a;

        /* renamed from: b */
        final Class<?> f441b;

        /* renamed from: c */
        final Bundle f442c;

        /* renamed from: d */
        Fragment f443d;
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m658a(context, attributeSet);
    }

    /* renamed from: a */
    private void m658a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f435d = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f436e = onTabChangeListener;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f432a.size();
        C0275l lVar = null;
        for (int i = 0; i < size; i++) {
            C0223a aVar = (C0223a) this.f432a.get(i);
            aVar.f443d = this.f434c.mo866a(aVar.f440a);
            if (aVar.f443d != null && !aVar.f443d.mo637s()) {
                if (aVar.f440a.equals(currentTabTag)) {
                    this.f437f = aVar;
                } else {
                    if (lVar == null) {
                        lVar = this.f434c.mo867a();
                    }
                    lVar.mo817b(aVar.f443d);
                }
            }
        }
        this.f438g = true;
        C0275l a = m657a(currentTabTag, lVar);
        if (a != null) {
            a.mo815b();
            this.f434c.mo870b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f438g = false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f439a = getCurrentTabTag();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f439a);
    }

    public void onTabChanged(String str) {
        if (this.f438g) {
            C0275l a = m657a(str, (C0275l) null);
            if (a != null) {
                a.mo815b();
            }
        }
        if (this.f436e != null) {
            this.f436e.onTabChanged(str);
        }
    }

    /* renamed from: a */
    private C0275l m657a(String str, C0275l lVar) {
        C0223a a = m656a(str);
        if (this.f437f != a) {
            if (lVar == null) {
                lVar = this.f434c.mo867a();
            }
            if (!(this.f437f == null || this.f437f.f443d == null)) {
                lVar.mo817b(this.f437f.f443d);
            }
            if (a != null) {
                if (a.f443d == null) {
                    a.f443d = Fragment.m499a(this.f433b, a.f441b.getName(), a.f442c);
                    lVar.mo804a(this.f435d, a.f443d, a.f440a);
                } else {
                    lVar.mo821c(a.f443d);
                }
            }
            this.f437f = a;
        }
        return lVar;
    }

    /* renamed from: a */
    private C0223a m656a(String str) {
        int size = this.f432a.size();
        for (int i = 0; i < size; i++) {
            C0223a aVar = (C0223a) this.f432a.get(i);
            if (aVar.f440a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }
}
