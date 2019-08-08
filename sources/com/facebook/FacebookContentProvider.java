package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.C2565w;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;

public class FacebookContentProvider extends ContentProvider {

    /* renamed from: a */
    private static final String f4520a = "com.facebook.FacebookContentProvider";

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        Pair a = mo6648a(uri);
        if (a == null) {
            throw new FileNotFoundException();
        }
        try {
            File a2 = C2565w.m9732a((UUID) a.first, (String) a.second);
            if (a2 != null) {
                return ParcelFileDescriptor.open(a2, 268435456);
            }
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            String str2 = f4520a;
            StringBuilder sb = new StringBuilder();
            sb.append("Got unexpected exception:");
            sb.append(e);
            Log.e(str2, sb.toString());
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Pair<UUID, String> mo6648a(Uri uri) {
        try {
            String[] split = uri.getPath().substring(1).split("/");
            String str = split[0];
            String str2 = split[1];
            if (!"..".contentEquals(str)) {
                if (!"..".contentEquals(str2)) {
                    return new Pair<>(UUID.fromString(str), str2);
                }
            }
            throw new Exception();
        } catch (Exception unused) {
            return null;
        }
    }
}
