package android.support.p017v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: android.support.v4.widget.o */
/* compiled from: SimpleCursorAdapter */
public class C0660o extends C0659n {

    /* renamed from: j */
    protected int[] f1739j;

    /* renamed from: k */
    protected int[] f1740k;

    /* renamed from: l */
    String[] f1741l;

    /* renamed from: m */
    private int f1742m = -1;

    /* renamed from: n */
    private C0661a f1743n;

    /* renamed from: o */
    private C0662b f1744o;

    /* renamed from: android.support.v4.widget.o$a */
    /* compiled from: SimpleCursorAdapter */
    public interface C0661a {
        /* renamed from: a */
        CharSequence mo2533a(Cursor cursor);
    }

    /* renamed from: android.support.v4.widget.o$b */
    /* compiled from: SimpleCursorAdapter */
    public interface C0662b {
        /* renamed from: a */
        boolean mo2534a(View view, Cursor cursor, int i);
    }

    public C0660o(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.f1740k = iArr;
        this.f1741l = strArr;
        m2610a(cursor, strArr);
    }

    /* renamed from: a */
    public void mo2505a(View view, Context context, Cursor cursor) {
        C0662b bVar = this.f1744o;
        int length = this.f1740k.length;
        int[] iArr = this.f1739j;
        int[] iArr2 = this.f1740k;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr2[i]);
            if (findViewById != null) {
                if (!(bVar != null ? bVar.mo2534a(findViewById, cursor, iArr[i]) : false)) {
                    String string = cursor.getString(iArr[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        mo2532a((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        mo2531a((ImageView) findViewById, string);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(findViewById.getClass().getName());
                        sb.append(" is not a ");
                        sb.append(" view that can be bounds by this SimpleCursorAdapter");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2530a(C0662b bVar) {
        this.f1744o = bVar;
    }

    /* renamed from: a */
    public void mo2531a(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    /* renamed from: a */
    public void mo2532a(TextView textView, String str) {
        textView.setText(str);
    }

    /* renamed from: c */
    public CharSequence mo2509c(Cursor cursor) {
        if (this.f1743n != null) {
            return this.f1743n.mo2533a(cursor);
        }
        if (this.f1742m > -1) {
            return cursor.getString(this.f1742m);
        }
        return super.mo2509c(cursor);
    }

    /* renamed from: a */
    private void m2610a(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            if (this.f1739j == null || this.f1739j.length != length) {
                this.f1739j = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f1739j[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.f1739j = null;
    }

    /* renamed from: b */
    public Cursor mo2506b(Cursor cursor) {
        m2610a(cursor, this.f1741l);
        return super.mo2506b(cursor);
    }
}
