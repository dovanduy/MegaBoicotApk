package mega.boicot;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;

public class bd_provider extends ContentProvider {

    /* renamed from: a */
    public static final Uri f19599a = Uri.parse("content://mega.boicot.bd_provider/productos");

    /* renamed from: b */
    public static final Uri f19600b = Uri.parse("content://mega.boicot.bd_provider/fotos");

    /* renamed from: d */
    private static final UriMatcher f19601d = new UriMatcher(-1);

    /* renamed from: c */
    private C5665k f19602c;

    static {
        f19601d.addURI("mega.boicot.bd_provider", "productos", 101);
        f19601d.addURI("mega.boicot.bd_provider", "productos/#", 111);
        f19601d.addURI("mega.boicot.bd_provider", "fotos", 102);
        f19601d.addURI("mega.boicot.bd_provider", "fotos/#", 112);
    }

    public boolean onCreate() {
        this.f19602c = new C5665k(getContext());
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        int match = f19601d.match(uri);
        String str3 = "";
        if (match == 111 || match == 101) {
            str3 = "productos";
        } else if (match == 112 || match == 102) {
            str3 = "fotos";
        } else if (match == 113 || match == 103) {
            str3 = "cats";
        }
        sQLiteQueryBuilder.setTables(str3);
        switch (match) {
            case 101:
            case 102:
            case 103:
                break;
            default:
                switch (match) {
                    case 111:
                    case 112:
                    case 113:
                        StringBuilder sb = new StringBuilder();
                        sb.append("_id=");
                        sb.append(uri.getLastPathSegment());
                        sQLiteQueryBuilder.appendWhere(sb.toString());
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown URI");
                }
        }
        Cursor query = sQLiteQueryBuilder.query(this.f19602c.getReadableDatabase(), strArr, str, strArr2, null, null, str2);
        query.setNotificationUri(getContext().getContentResolver(), uri);
        return query;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        int i;
        int match = f19601d.match(uri);
        SQLiteDatabase writableDatabase = this.f19602c.getWritableDatabase();
        switch (match) {
            case 101:
                i = writableDatabase.delete("productos", str, strArr);
                break;
            case 102:
                i = writableDatabase.delete("fotos", str, strArr);
                break;
            case 103:
                i = writableDatabase.delete("cats", str, strArr);
                break;
            default:
                switch (match) {
                    case 111:
                        String lastPathSegment = uri.getLastPathSegment();
                        if (!TextUtils.isEmpty(str)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(" and id=");
                            sb.append(lastPathSegment);
                            i = writableDatabase.delete("productos", sb.toString(), strArr);
                            break;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("_id=");
                            sb2.append(lastPathSegment);
                            i = writableDatabase.delete("productos", sb2.toString(), null);
                            break;
                        }
                    case 112:
                        String lastPathSegment2 = uri.getLastPathSegment();
                        if (!TextUtils.isEmpty(str)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str);
                            sb3.append(" and id=");
                            sb3.append(lastPathSegment2);
                            i = writableDatabase.delete("fotos", sb3.toString(), strArr);
                            break;
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("_id=");
                            sb4.append(lastPathSegment2);
                            i = writableDatabase.delete("fotos", sb4.toString(), null);
                            break;
                        }
                    case 113:
                        String lastPathSegment3 = uri.getLastPathSegment();
                        if (!TextUtils.isEmpty(str)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str);
                            sb5.append(" and id=");
                            sb5.append(lastPathSegment3);
                            i = writableDatabase.delete("cats", sb5.toString(), strArr);
                            break;
                        } else {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("_id=");
                            sb6.append(lastPathSegment3);
                            i = writableDatabase.delete("cats", sb6.toString(), null);
                            break;
                        }
                    default:
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Unknown or Invalid URI ");
                        sb7.append(uri);
                        throw new IllegalArgumentException(sb7.toString());
                }
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
    }

    public String getType(Uri uri) {
        int match = f19601d.match(uri);
        switch (match) {
            case 101:
                return "vnd.android.cursor.dir/mt-producto";
            case 102:
                return "vnd.android.cursor.dir/mt-foto";
            case 103:
                return "vnd.android.cursor.dir/mt-cat";
            default:
                switch (match) {
                    case 111:
                        return "vnd.android.cursor.item/mt-producto";
                    case 112:
                        return "vnd.android.cursor.item/mt-foto";
                    case 113:
                        return "vnd.android.cursor.item/mt-cat";
                    default:
                        return null;
                }
        }
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        String str;
        int match = f19601d.match(uri);
        if (match == 101) {
            str = "productos";
        } else if (match == 102) {
            str = "fotos";
        } else if (match == 103) {
            str = "cats";
        } else {
            throw new IllegalArgumentException("Invalid URI for insert");
        }
        try {
            long insertOrThrow = this.f19602c.getWritableDatabase().insertOrThrow(str, null, contentValues);
            if (insertOrThrow > 0) {
                Uri withAppendedId = ContentUris.withAppendedId(uri, insertOrThrow);
                getContext().getContentResolver().notifyChange(uri, null);
                return withAppendedId;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to insert row into ");
            sb.append(uri);
            throw new SQLException(sb.toString());
        } catch (SQLiteConstraintException unused) {
            return null;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        int match = f19601d.match(uri);
        SQLiteDatabase writableDatabase = this.f19602c.getWritableDatabase();
        String str2 = "";
        if (match == 111 || match == 101) {
            str2 = "productos";
        } else if (match == 112 || match == 102) {
            str2 = "fotos";
        } else if (match == 113 || match == 103) {
            str2 = "cats";
        }
        switch (match) {
            case 101:
            case 102:
            case 103:
                i = writableDatabase.update(str2, contentValues, str, strArr);
                break;
            default:
                switch (match) {
                    case 111:
                    case 112:
                    case 113:
                        String lastPathSegment = uri.getLastPathSegment();
                        StringBuilder sb = new StringBuilder();
                        sb.append("_id=");
                        sb.append(lastPathSegment);
                        StringBuilder sb2 = new StringBuilder(sb.toString());
                        if (!TextUtils.isEmpty(str)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(" AND ");
                            sb3.append(str);
                            sb2.append(sb3.toString());
                        }
                        i = writableDatabase.update(str2, contentValues, sb2.toString(), null);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown URI");
                }
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
    }
}
