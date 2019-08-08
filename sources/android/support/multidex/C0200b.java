package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: android.support.multidex.b */
/* compiled from: MultiDexExtractor */
final class C0200b implements Closeable {

    /* renamed from: a */
    private final File f304a;

    /* renamed from: b */
    private final long f305b;

    /* renamed from: c */
    private final File f306c;

    /* renamed from: d */
    private final RandomAccessFile f307d;

    /* renamed from: e */
    private final FileChannel f308e;

    /* renamed from: f */
    private final FileLock f309f;

    /* renamed from: android.support.multidex.b$a */
    /* compiled from: MultiDexExtractor */
    private static class C0202a extends File {

        /* renamed from: a */
        public long f311a = -1;

        public C0202a(File file, String str) {
            super(file, str);
        }
    }

    C0200b(File file, File file2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor(");
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(file2.getPath());
        sb.append(")");
        Log.i("MultiDex", sb.toString());
        this.f304a = file;
        this.f306c = file2;
        this.f305b = m484b(file);
        File file3 = new File(file2, "MultiDex.lock");
        this.f307d = new RandomAccessFile(file3, "rw");
        try {
            this.f308e = this.f307d.getChannel();
            String str = "MultiDex";
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Blocking on lock ");
            sb2.append(file3.getPath());
            Log.i(str, sb2.toString());
            this.f309f = this.f308e.lock();
            String str2 = "MultiDex";
            StringBuilder sb3 = new StringBuilder();
            sb3.append(file3.getPath());
            sb3.append(" locked");
            Log.i(str2, sb3.toString());
        } catch (IOException | Error | RuntimeException e) {
            m481a((Closeable) this.f308e);
            throw e;
        } catch (IOException | Error | RuntimeException e2) {
            m481a((Closeable) this.f307d);
            throw e2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<? extends File> mo489a(Context context, String str, boolean z) throws IOException {
        List<? extends File> list;
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor.load(");
        sb.append(this.f304a.getPath());
        sb.append(", ");
        sb.append(z);
        sb.append(", ");
        sb.append(str);
        sb.append(")");
        Log.i("MultiDex", sb.toString());
        if (!this.f309f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z || m483a(context, this.f304a, this.f305b, str)) {
            if (z) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            list = m478a();
            m480a(context, str, m476a(this.f304a), this.f305b, list);
        } else {
            try {
                list = m479a(context, str);
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                list = m478a();
                m480a(context, str, m476a(this.f304a), this.f305b, list);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("load found ");
        sb2.append(list.size());
        sb2.append(" secondary dex files");
        Log.i("MultiDex", sb2.toString());
        return list;
    }

    public void close() throws IOException {
        this.f309f.release();
        this.f308e.close();
        this.f307d.close();
    }

    /* renamed from: a */
    private List<C0202a> m479a(Context context, String str) throws IOException {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f304a.getName());
        sb.append(".classes");
        String sb2 = sb.toString();
        SharedPreferences a = m477a(context);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append("dex.number");
        int i = a.getInt(sb3.toString(), 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append(i2);
            sb4.append(".zip");
            C0202a aVar = new C0202a(this.f306c, sb4.toString());
            if (aVar.isFile()) {
                aVar.f311a = m484b(aVar);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append("dex.crc.");
                sb5.append(i2);
                long j = a.getLong(sb5.toString(), -1);
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append("dex.time.");
                sb6.append(i2);
                long j2 = a.getLong(sb6.toString(), -1);
                long lastModified = aVar.lastModified();
                if (j2 == lastModified) {
                    String str3 = sb2;
                    SharedPreferences sharedPreferences = a;
                    if (j == aVar.f311a) {
                        arrayList.add(aVar);
                        i2++;
                        sb2 = str3;
                        a = sharedPreferences;
                    }
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Invalid extracted dex: ");
                sb7.append(aVar);
                sb7.append(" (key \"");
                sb7.append(str2);
                sb7.append("\"), expected modification time: ");
                sb7.append(j2);
                sb7.append(", modification time: ");
                sb7.append(lastModified);
                sb7.append(", expected crc: ");
                sb7.append(j);
                sb7.append(", file crc: ");
                sb7.append(aVar.f311a);
                throw new IOException(sb7.toString());
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Missing extracted secondary dex file '");
            sb8.append(aVar.getPath());
            sb8.append("'");
            throw new IOException(sb8.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m483a(Context context, File file, long j, String str) {
        SharedPreferences a = m477a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        if (a.getLong(sb.toString(), -1) == m476a(file)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("crc");
            if (a.getLong(sb2.toString(), -1) == j) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static long m476a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: b */
    private static long m484b(File file) throws IOException {
        long a = C0203c.m487a(file);
        return a == -1 ? a - 1 : a;
    }

    /* renamed from: a */
    private List<C0202a> m478a() throws IOException {
        C0202a aVar;
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f304a.getName());
        sb.append(".classes");
        String sb2 = sb.toString();
        m485b();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f304a);
        int i = 2;
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("classes");
            sb3.append(2);
            sb3.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb3.toString());
            while (entry != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb2);
                sb4.append(i);
                sb4.append(".zip");
                aVar = new C0202a(this.f306c, sb4.toString());
                arrayList.add(aVar);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Extraction is needed for file ");
                sb5.append(aVar);
                Log.i("MultiDex", sb5.toString());
                int i2 = 0;
                z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    m482a(zipFile, entry, (File) aVar, sb2);
                    aVar.f311a = m484b(aVar);
                    z = true;
                    String str = "MultiDex";
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Extraction ");
                    sb6.append(z ? "succeeded" : "failed");
                    sb6.append(" '");
                    sb6.append(aVar.getAbsolutePath());
                    sb6.append("': length ");
                    sb6.append(aVar.length());
                    sb6.append(" - crc: ");
                    sb6.append(aVar.f311a);
                    Log.i(str, sb6.toString());
                    if (!z) {
                        aVar.delete();
                        if (aVar.exists()) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Failed to delete corrupted secondary dex '");
                            sb7.append(aVar.getPath());
                            sb7.append("'");
                            Log.w("MultiDex", sb7.toString());
                        }
                    }
                }
                if (!z) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("Could not create zip file ");
                    sb8.append(aVar.getAbsolutePath());
                    sb8.append(" for secondary dex (");
                    sb8.append(i);
                    sb8.append(")");
                    throw new IOException(sb8.toString());
                }
                i++;
                StringBuilder sb9 = new StringBuilder();
                sb9.append("classes");
                sb9.append(i);
                sb9.append(".dex");
                entry = zipFile.getEntry(sb9.toString());
            }
            try {
                zipFile.close();
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
            }
            return arrayList;
        } catch (IOException e2) {
            String str2 = "MultiDex";
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Failed to read crc from ");
            sb10.append(aVar.getAbsolutePath());
            Log.w(str2, sb10.toString(), e2);
            z = false;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static void m480a(Context context, String str, long j, long j2, List<C0202a> list) {
        Editor edit = m477a(context).edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        edit.putLong(sb.toString(), j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        edit.putLong(sb2.toString(), j2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("dex.number");
        edit.putInt(sb3.toString(), list.size() + 1);
        int i = 2;
        for (C0202a aVar : list) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("dex.crc.");
            sb4.append(i);
            edit.putLong(sb4.toString(), aVar.f311a);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("dex.time.");
            sb5.append(i);
            edit.putLong(sb5.toString(), aVar.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: a */
    private static SharedPreferences m477a(Context context) {
        return context.getSharedPreferences("multidex.version", VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: b */
    private void m485b() {
        File[] listFiles = this.f306c.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return !file.getName().equals("MultiDex.lock");
            }
        });
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to list secondary dex dir content (");
            sb.append(this.f306c.getPath());
            sb.append(").");
            Log.w("MultiDex", sb.toString());
            return;
        }
        for (File file : listFiles) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Trying to delete old file ");
            sb2.append(file.getPath());
            sb2.append(" of size ");
            sb2.append(file.length());
            Log.i("MultiDex", sb2.toString());
            if (!file.delete()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to delete old file ");
                sb3.append(file.getPath());
                Log.w("MultiDex", sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Deleted old file ");
                sb4.append(file.getPath());
                Log.i("MultiDex", sb4.toString());
            }
        }
    }

    /* renamed from: a */
    private static void m482a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        StringBuilder sb = new StringBuilder();
        sb.append("tmp-");
        sb.append(str);
        File createTempFile = File.createTempFile(sb.toString(), ".zip", file.getParentFile());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Extracting ");
        sb2.append(createTempFile.getPath());
        Log.i("MultiDex", sb2.toString());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (!createTempFile.setReadOnly()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to mark readonly \"");
                sb3.append(createTempFile.getAbsolutePath());
                sb3.append("\" (tmp of \"");
                sb3.append(file.getAbsolutePath());
                sb3.append("\")");
                throw new IOException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Renaming to ");
            sb4.append(file.getPath());
            Log.i("MultiDex", sb4.toString());
            if (!createTempFile.renameTo(file)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Failed to rename \"");
                sb5.append(createTempFile.getAbsolutePath());
                sb5.append("\" to \"");
                sb5.append(file.getAbsolutePath());
                sb5.append("\"");
                throw new IOException(sb5.toString());
            }
            m481a((Closeable) inputStream);
            createTempFile.delete();
        } catch (Throwable th) {
            m481a((Closeable) inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m481a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }
}
