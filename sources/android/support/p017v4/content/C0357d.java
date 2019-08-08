package android.support.p017v4.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.p017v4.content.C0358e.C0359a;
import android.support.p017v4.p025os.C0535a;
import android.support.p017v4.p025os.C0540c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: android.support.v4.content.d */
/* compiled from: CursorLoader */
public class C0357d extends C0338a<Cursor> {

    /* renamed from: f */
    final C0359a f894f = new C0359a<>();

    /* renamed from: g */
    Uri f895g;

    /* renamed from: h */
    String[] f896h;

    /* renamed from: i */
    String f897i;

    /* renamed from: j */
    String[] f898j;

    /* renamed from: k */
    String f899k;

    /* renamed from: l */
    Cursor f900l;

    /* renamed from: m */
    C0535a f901m;

    /* renamed from: h */
    public Cursor mo1187d() {
        Cursor a;
        synchronized (this) {
            if (mo1190g()) {
                throw new C0540c();
            }
            this.f901m = new C0535a();
        }
        try {
            a = C0355b.m1311a(mo1231m().getContentResolver(), this.f895g, this.f896h, this.f897i, this.f898j, this.f899k, this.f901m);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f894f);
            }
            synchronized (this) {
                this.f901m = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.f901m = null;
                throw th;
            }
        }
    }

    /* renamed from: f */
    public void mo1189f() {
        super.mo1189f();
        synchronized (this) {
            if (this.f901m != null) {
                this.f901m.mo1839c();
            }
        }
    }

    /* renamed from: a */
    public void mo1221b(Cursor cursor) {
        if (mo1234p()) {
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        Cursor cursor2 = this.f900l;
        this.f900l = cursor;
        if (mo1232n()) {
            super.mo1221b(cursor);
        }
        if (!(cursor2 == null || cursor2 == cursor || cursor2.isClosed())) {
            cursor2.close();
        }
    }

    public C0357d(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f895g = uri;
        this.f896h = strArr;
        this.f897i = str;
        this.f898j = strArr2;
        this.f899k = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo1223i() {
        if (this.f900l != null) {
            mo1221b(this.f900l);
        }
        if (mo1243x() || this.f900l == null) {
            mo1237s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo1224j() {
        mo1236r();
    }

    /* renamed from: b */
    public void mo1182a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo1225k() {
        super.mo1225k();
        mo1224j();
        if (this.f900l != null && !this.f900l.isClosed()) {
            this.f900l.close();
        }
        this.f900l = null;
    }

    @Deprecated
    /* renamed from: a */
    public void mo1183a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo1183a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f895g);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f896h));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f897i);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f898j));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f899k);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f900l);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f909u);
    }
}
