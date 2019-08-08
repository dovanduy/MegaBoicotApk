package mega.boicot;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class MySuggestionProvider extends ContentProvider {

    /* renamed from: a */
    private static final UriMatcher f19559a = new UriMatcher(-1);

    /* renamed from: b */
    private static String[] f19560b;

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

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        f19559a.addURI("mega.boicot.MySuggestionProvider", "stores/search_suggest_query/*", 1);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (f19559a.match(uri) != 1) {
            return null;
        }
        return m24367a(uri.getLastPathSegment().toLowerCase());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c0, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c3, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c5, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c7, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d4, code lost:
        if (r3 != null) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b8, code lost:
        if (r3 != null) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01be, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c2 A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:88:0x018e] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ce A[SYNTHETIC, Splitter:B:111:0x01ce] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01db A[SYNTHETIC, Splitter:B:123:0x01db] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01e4 A[SYNTHETIC, Splitter:B:131:0x01e4] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0106  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.database.MatrixCursor m24367a(java.lang.String r19) {
        /*
            r18 = this;
            android.content.Context r1 = r18.getContext()
            mega.boicot.config r1 = (mega.boicot.config) r1
            java.lang.String r2 = r1.f17881aN
            r3 = 0
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            boolean r2 = r1.f17877aJ
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x002b
            mega.boicot.i[] r2 = r1.f17971bz
            int r6 = r2.length
            r7 = r4
        L_0x0016:
            if (r7 >= r6) goto L_0x002b
            r8 = r2[r7]
            boolean r9 = r8.f18237H
            if (r9 == 0) goto L_0x0028
            boolean r9 = r8.f18264aH
            if (r9 != 0) goto L_0x0026
            android.graphics.Bitmap r8 = r8.f18263aG
            if (r8 == 0) goto L_0x0028
        L_0x0026:
            r2 = r5
            goto L_0x002c
        L_0x0028:
            int r7 = r7 + 1
            goto L_0x0016
        L_0x002b:
            r2 = r4
        L_0x002c:
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            if (r2 == 0) goto L_0x004b
            java.lang.String[] r10 = new java.lang.String[r6]
            java.lang.String r11 = "_id"
            r10[r4] = r11
            java.lang.String r11 = "suggest_text_1"
            r10[r5] = r11
            java.lang.String r11 = "suggest_text_2"
            r10[r9] = r11
            java.lang.String r11 = "suggest_icon_1"
            r10[r8] = r11
            java.lang.String r11 = "suggest_intent_data"
            r10[r7] = r11
            f19560b = r10
            goto L_0x005f
        L_0x004b:
            java.lang.String[] r10 = new java.lang.String[r7]
            java.lang.String r11 = "_id"
            r10[r4] = r11
            java.lang.String r11 = "suggest_text_1"
            r10[r5] = r11
            java.lang.String r11 = "suggest_text_2"
            r10[r9] = r11
            java.lang.String r11 = "suggest_intent_data"
            r10[r8] = r11
            f19560b = r10
        L_0x005f:
            android.database.MatrixCursor r10 = new android.database.MatrixCursor
            java.lang.String[] r11 = f19560b
            r10.<init>(r11)
            if (r2 == 0) goto L_0x006c
            java.lang.Object[] r6 = new java.lang.Object[r6]
        L_0x006a:
            r11 = r6
            goto L_0x006f
        L_0x006c:
            java.lang.Object[] r6 = new java.lang.Object[r7]
            goto L_0x006a
        L_0x006f:
            if (r19 == 0) goto L_0x024c
            java.lang.String r12 = r19.trim()
            java.lang.String r13 = ""
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x024c
            java.lang.String r6 = r19.toLowerCase()
            java.lang.String r6 = mega.boicot.config.m23855e(r6)
            java.lang.String r6 = r6.trim()
            mega.boicot.i[] r12 = r1.f17971bz
            int r13 = r12.length
            r14 = r4
            r15 = r14
        L_0x008e:
            if (r14 >= r13) goto L_0x024c
            r7 = r12[r14]
            boolean r8 = r7.f18237H
            if (r8 == 0) goto L_0x023d
            boolean r8 = r1.f17873aF
            if (r8 == 0) goto L_0x00b4
            java.lang.String r8 = r7.f18309b
            java.lang.String r3 = ""
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x00b4
            java.lang.String r3 = r7.f18309b
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L_0x00de
            java.lang.String r3 = r7.f18309b
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L_0x00de
        L_0x00b4:
            boolean r3 = r1.f17874aG
            if (r3 == 0) goto L_0x00d2
            java.lang.String r3 = r7.f18311d
            java.lang.String r8 = ""
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x00d2
            java.lang.String r3 = r7.f18311d
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L_0x00de
            java.lang.String r3 = r7.f18311d
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L_0x00de
        L_0x00d2:
            java.util.ArrayList<java.lang.String> r3 = r7.f18318k
            if (r3 == 0) goto L_0x00e0
            java.util.ArrayList<java.lang.String> r3 = r7.f18318k
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L_0x00e0
        L_0x00de:
            r3 = r5
            goto L_0x0104
        L_0x00e0:
            java.util.ArrayList<java.lang.String> r3 = r7.f18318k
            if (r3 == 0) goto L_0x0103
            java.util.ArrayList<java.lang.String> r3 = r7.f18318k
            java.util.Iterator r3 = r3.iterator()
        L_0x00ea:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0103
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r16 = r8.contains(r6)
            if (r16 != 0) goto L_0x00de
            boolean r8 = r6.contains(r8)
            if (r8 == 0) goto L_0x00ea
            goto L_0x00de
        L_0x0103:
            r3 = r4
        L_0x0104:
            if (r3 == 0) goto L_0x023d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = ""
            r3.append(r8)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            r11[r4] = r3
            boolean r3 = r1.f17875aH
            if (r3 == 0) goto L_0x012f
            java.lang.String r3 = r7.f18256a
            r11[r5] = r3
            boolean r3 = r1.f17876aI
            if (r3 == 0) goto L_0x012b
            java.lang.String r3 = r7.f18310c
            r11[r9] = r3
            r3 = 0
            goto L_0x0136
        L_0x012b:
            r3 = 0
            r11[r9] = r3
            goto L_0x0136
        L_0x012f:
            r3 = 0
            java.lang.String r8 = r7.f18310c
            r11[r5] = r8
            r11[r9] = r3
        L_0x0136:
            if (r2 == 0) goto L_0x0223
            r8 = 3
            r11[r8] = r3
            boolean r8 = r7.f18264aH
            if (r8 != 0) goto L_0x020c
            android.graphics.Bitmap r8 = r7.f18263aG
            if (r8 == 0) goto L_0x020c
            android.content.Context r8 = r18.getContext()     // Catch:{ FileNotFoundException -> 0x0165 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0165 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0165 }
            java.lang.String r9 = "img_s"
            r3.append(r9)     // Catch:{ FileNotFoundException -> 0x0165 }
            int r9 = r7.f18330w     // Catch:{ FileNotFoundException -> 0x0165 }
            r3.append(r9)     // Catch:{ FileNotFoundException -> 0x0165 }
            java.lang.String r9 = "_ico_g"
            r3.append(r9)     // Catch:{ FileNotFoundException -> 0x0165 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0165 }
            java.io.FileInputStream r3 = r8.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x0165 }
            r8 = r4
            goto L_0x0167
        L_0x0165:
            r8 = r5
            r3 = 0
        L_0x0167:
            if (r3 == 0) goto L_0x016c
            r3.close()     // Catch:{ Exception -> 0x016c }
        L_0x016c:
            if (r8 == 0) goto L_0x01e0
            android.content.Context r3 = r18.getContext()     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d2, all -> 0x01c9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d2, all -> 0x01c9 }
            r8.<init>()     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d2, all -> 0x01c9 }
            java.lang.String r9 = "img_s"
            r8.append(r9)     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d2, all -> 0x01c9 }
            int r9 = r7.f18330w     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d2, all -> 0x01c9 }
            r8.append(r9)     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d2, all -> 0x01c9 }
            java.lang.String r9 = "_ico_g"
            r8.append(r9)     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d2, all -> 0x01c9 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d2, all -> 0x01c9 }
            java.io.FileOutputStream r3 = r3.openFileOutput(r8, r4)     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d2, all -> 0x01c9 }
            android.graphics.Bitmap r8 = r7.f18263aG     // Catch:{ Exception -> 0x01c7, OutOfMemoryError -> 0x01c5, all -> 0x01c2 }
            android.content.Context r9 = r18.getContext()     // Catch:{ Exception -> 0x01c7, OutOfMemoryError -> 0x01c5, all -> 0x01c2 }
            android.graphics.Bitmap r4 = r7.f18263aG     // Catch:{ Exception -> 0x01c7, OutOfMemoryError -> 0x01c5, all -> 0x01c2 }
            int r4 = r4.getWidth()     // Catch:{ Exception -> 0x01c7, OutOfMemoryError -> 0x01c5, all -> 0x01c2 }
            int r4 = mega.boicot.config.m23845b(r9, r4)     // Catch:{ Exception -> 0x01c7, OutOfMemoryError -> 0x01c5, all -> 0x01c2 }
            android.content.Context r9 = r18.getContext()     // Catch:{ Exception -> 0x01c7, OutOfMemoryError -> 0x01c5, all -> 0x01c2 }
            android.graphics.Bitmap r5 = r7.f18263aG     // Catch:{ Exception -> 0x01c0, OutOfMemoryError -> 0x01be, all -> 0x01c2 }
            int r5 = r5.getHeight()     // Catch:{ Exception -> 0x01c0, OutOfMemoryError -> 0x01be, all -> 0x01c2 }
            int r5 = mega.boicot.config.m23845b(r9, r5)     // Catch:{ Exception -> 0x01c0, OutOfMemoryError -> 0x01be, all -> 0x01c2 }
            r9 = 1
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r8, r4, r5, r9)     // Catch:{ Exception -> 0x01d9, OutOfMemoryError -> 0x01d4, all -> 0x01c2 }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x01d9, OutOfMemoryError -> 0x01d4, all -> 0x01c2 }
            r8 = 100
            r4.compress(r5, r8, r3)     // Catch:{ Exception -> 0x01d9, OutOfMemoryError -> 0x01d4, all -> 0x01c2 }
            if (r3 == 0) goto L_0x01e1
        L_0x01ba:
            r3.close()     // Catch:{ IOException -> 0x01e1 }
            goto L_0x01e1
        L_0x01be:
            r9 = 1
            goto L_0x01d4
        L_0x01c0:
            r9 = 1
            goto L_0x01d9
        L_0x01c2:
            r0 = move-exception
            r1 = r0
            goto L_0x01cc
        L_0x01c5:
            r9 = r5
            goto L_0x01d4
        L_0x01c7:
            r9 = r5
            goto L_0x01d9
        L_0x01c9:
            r0 = move-exception
            r1 = r0
            r3 = 0
        L_0x01cc:
            if (r3 == 0) goto L_0x01d1
            r3.close()     // Catch:{ IOException -> 0x01d1 }
        L_0x01d1:
            throw r1
        L_0x01d2:
            r9 = r5
            r3 = 0
        L_0x01d4:
            if (r3 == 0) goto L_0x01e1
            goto L_0x01ba
        L_0x01d7:
            r9 = r5
            r3 = 0
        L_0x01d9:
            if (r3 == 0) goto L_0x01de
            r3.close()     // Catch:{ IOException -> 0x01de }
        L_0x01de:
            r3 = 0
            goto L_0x01e2
        L_0x01e0:
            r9 = r5
        L_0x01e1:
            r3 = r9
        L_0x01e2:
            if (r3 == 0) goto L_0x020d
            android.content.Context r3 = r18.getContext()     // Catch:{ Exception | OutOfMemoryError -> 0x020d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception | OutOfMemoryError -> 0x020d }
            r4.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x020d }
            java.lang.String r5 = "img_s"
            r4.append(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x020d }
            int r5 = r7.f18330w     // Catch:{ Exception | OutOfMemoryError -> 0x020d }
            r4.append(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x020d }
            java.lang.String r5 = "_ico_g"
            r4.append(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x020d }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception | OutOfMemoryError -> 0x020d }
            java.io.File r3 = r3.getFileStreamPath(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x020d }
            java.net.URI r3 = r3.toURI()     // Catch:{ Exception | OutOfMemoryError -> 0x020d }
            r4 = 3
            r11[r4] = r3     // Catch:{ Exception | OutOfMemoryError -> 0x020d }
            goto L_0x020d
        L_0x020c:
            r9 = r5
        L_0x020d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ""
            r3.append(r4)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            r4 = 4
            r11[r4] = r3
            r5 = 3
            goto L_0x0239
        L_0x0223:
            r9 = r5
            r4 = 4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = ""
            r3.append(r5)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            r5 = 3
            r11[r5] = r3
        L_0x0239:
            r10.addRow(r11)
            goto L_0x0240
        L_0x023d:
            r9 = r5
            r4 = 4
            r5 = 3
        L_0x0240:
            int r15 = r15 + 1
            int r14 = r14 + 1
            r7 = r4
            r8 = r5
            r5 = r9
            r3 = 0
            r4 = 0
            r9 = 2
            goto L_0x008e
        L_0x024c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.MySuggestionProvider.m24367a(java.lang.String):android.database.MatrixCursor");
    }
}
