package android.support.p017v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.FileProvider */
public class FileProvider extends ContentProvider {

    /* renamed from: a */
    private static final String[] f855a = {"_display_name", "_size"};

    /* renamed from: b */
    private static final File f856b = new File("/");

    /* renamed from: c */
    private static HashMap<String, C0336a> f857c = new HashMap<>();

    /* renamed from: d */
    private C0336a f858d;

    /* renamed from: android.support.v4.content.FileProvider$a */
    interface C0336a {
        /* renamed from: a */
        Uri mo1177a(File file);

        /* renamed from: a */
        File mo1178a(Uri uri);
    }

    /* renamed from: android.support.v4.content.FileProvider$b */
    static class C0337b implements C0336a {

        /* renamed from: a */
        private final String f859a;

        /* renamed from: b */
        private final HashMap<String, File> f860b = new HashMap<>();

        C0337b(String str) {
            this.f859a = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1179a(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f860b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to resolve canonical path for ");
                sb.append(file);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }

        /* renamed from: a */
        public Uri mo1177a(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Entry entry = null;
                for (Entry entry2 : this.f860b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to find configured root that contains ");
                    sb.append(canonicalPath);
                    throw new IllegalArgumentException(sb.toString());
                }
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    str = canonicalPath.substring(path2.length());
                } else {
                    str = canonicalPath.substring(path2.length() + 1);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Uri.encode((String) entry.getKey()));
                sb2.append('/');
                sb2.append(Uri.encode(str, "/"));
                return new Builder().scheme("content").authority(this.f859a).encodedPath(sb2.toString()).build();
            } catch (IOException unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to resolve canonical path for ");
                sb3.append(file);
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* renamed from: a */
        public File mo1178a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f860b.get(decode);
            if (file == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to find configured root for ");
                sb.append(uri);
                throw new IllegalArgumentException(sb.toString());
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to resolve canonical path for ");
                sb2.append(file2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    public boolean onCreate() {
        return true;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        } else {
            this.f858d = m1224a(context, providerInfo.authority);
        }
    }

    /* renamed from: a */
    public static Uri m1223a(Context context, String str, File file) {
        return m1224a(context, str).mo1177a(file);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a = this.f858d.mo1178a(uri);
        if (strArr == null) {
            strArr = f855a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = a.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(a.length());
            }
            i2 = i;
        }
        String[] a2 = m1227a(strArr3, i2);
        Object[] a3 = m1226a(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(a2, 1);
        matrixCursor.addRow(a3);
        return matrixCursor;
    }

    public String getType(Uri uri) {
        File a = this.f858d.mo1178a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f858d.mo1178a(uri).delete() ? 1 : 0;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f858d.mo1178a(uri), m1222a(str));
    }

    /* renamed from: a */
    private static C0336a m1224a(Context context, String str) {
        C0336a aVar;
        synchronized (f857c) {
            aVar = (C0336a) f857c.get(str);
            if (aVar == null) {
                try {
                    aVar = m1228b(context, str);
                    f857c.put(str, aVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return aVar;
    }

    /* renamed from: b */
    private static C0336a m1228b(Context context, String str) throws IOException, XmlPullParserException {
        C0337b bVar = new C0337b(str);
        XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(str, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f856b;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] a = C0356c.m1317a(context, (String) null);
                    if (a.length > 0) {
                        file = a[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] a2 = C0356c.m1316a(context);
                    if (a2.length > 0) {
                        file = a2[0];
                    }
                } else if (VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        file = externalMediaDirs[0];
                    }
                }
                if (file != null) {
                    bVar.mo1179a(attributeValue, m1225a(file, attributeValue2));
                }
            }
        }
    }

    /* renamed from: a */
    private static int m1222a(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid mode: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static File m1225a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: a */
    private static String[] m1227a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: a */
    private static Object[] m1226a(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }
}
