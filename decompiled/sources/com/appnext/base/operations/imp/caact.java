package com.appnext.base.operations.imp;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import com.appnext.base.p046b.C1251i;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class caact extends C1269d {
    private static final String CAMERA = "camera";
    public static final String KEY = "caact";

    /* renamed from: ht */
    private static final String f4025ht = "caact_last_running";

    /* renamed from: hu */
    private static final int f4026hu = 900000;

    /* renamed from: hv */
    private static final String f4027hv = "[^a-zA-Z]+";

    /* renamed from: hw */
    private static final String f4028hw = "dcim";

    /* renamed from: hx */
    private static Uri f4029hx = Media.INTERNAL_CONTENT_URI;

    /* renamed from: hy */
    private static Uri f4030hy = Media.EXTERNAL_CONTENT_URI;

    public caact(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        if (VERSION.SDK_INT >= 16) {
            return C1248f.m5280g(C1247e.getContext().getApplicationContext(), "android.permission.READ_EXTERNAL_STORAGE");
        }
        return C1248f.m5280g(C1247e.getContext().getApplicationContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        ArrayList arrayList;
        try {
            if (!m5407a(f4030hy)) {
                if (!m5407a(f4029hx)) {
                    arrayList = null;
                    C1251i.m5302ck().putLong(f4025ht, System.currentTimeMillis());
                    return arrayList;
                }
            }
            arrayList = new ArrayList();
            arrayList.add(new C1230b(KEY, "true", C1246a.Boolean.getType()));
            C1251i.m5302ck().putLong(f4025ht, System.currentTimeMillis());
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m5407a(Uri uri) {
        Uri uri2 = uri;
        Cursor query = C1247e.getContext().getContentResolver().query(uri2, new String[]{"_data", "datetaken"}, null, null, "datetaken DESC");
        if (query != null && query.moveToNext()) {
            long currentTimeMillis = System.currentTimeMillis();
            do {
                long j = query.getLong(query.getColumnIndexOrThrow("datetaken"));
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    String lowerCase = string.replaceAll(f4027hv, "").toLowerCase();
                    if (lowerCase.contains(CAMERA) || lowerCase.contains(f4028hw)) {
                        if (!new File(string).exists()) {
                            return false;
                        }
                        long j2 = C1251i.m5302ck().getLong(f4025ht, 0);
                        if (j2 <= 0 || j <= j2) {
                            if (j2 == 0) {
                                long j3 = currentTimeMillis - j;
                                if (j3 > 0 && j3 < 900000) {
                                }
                            }
                        }
                        return true;
                    }
                }
                long j4 = currentTimeMillis - j;
                if (j4 > 0 && j4 < 900000) {
                    break;
                }
            } while (query.moveToNext());
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return caact.class.getSimpleName();
    }
}
