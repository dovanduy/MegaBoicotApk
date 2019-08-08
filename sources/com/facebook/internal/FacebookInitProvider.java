package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.facebook.C2649m;

public final class FacebookInitProvider extends ContentProvider {

    /* renamed from: a */
    private static final String f7791a = "FacebookInitProvider";

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        try {
            C2649m.m10121a(getContext());
        } catch (Exception e) {
            Log.i(f7791a, "Failed to auto initialize the Facebook SDK", e);
        }
        return false;
    }
}
