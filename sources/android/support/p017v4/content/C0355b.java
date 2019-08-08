package android.support.p017v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.support.p017v4.p025os.C0535a;
import android.support.p017v4.p025os.C0540c;

/* renamed from: android.support.v4.content.b */
/* compiled from: ContentResolverCompat */
public final class C0355b {
    /* renamed from: a */
    public static Cursor m1311a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0535a aVar) {
        Object obj;
        if (VERSION.SDK_INT >= 16) {
            if (aVar != null) {
                try {
                    obj = aVar.mo1840d();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new C0540c();
                    }
                    throw e;
                }
            } else {
                obj = null;
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
        if (aVar != null) {
            aVar.mo1838b();
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2);
    }
}
