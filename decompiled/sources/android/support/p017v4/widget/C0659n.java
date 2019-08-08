package android.support.p017v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.n */
/* compiled from: ResourceCursorAdapter */
public abstract class C0659n extends C0648f {

    /* renamed from: j */
    private int f1736j;

    /* renamed from: k */
    private int f1737k;

    /* renamed from: l */
    private LayoutInflater f1738l;

    @Deprecated
    public C0659n(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f1737k = i;
        this.f1736j = i;
        this.f1738l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public C0659n(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f1737k = i;
        this.f1736j = i;
        this.f1738l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo2502a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1738l.inflate(this.f1736j, viewGroup, false);
    }

    /* renamed from: b */
    public View mo2507b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1738l.inflate(this.f1737k, viewGroup, false);
    }
}
