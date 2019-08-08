package com.startapp.common.p193a;

import android.content.Context;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.common.a.e */
/* compiled from: StartAppSDK */
public class C5515e {
    /* renamed from: a */
    public static <T> T m23542a(Context context, String str, Class<T> cls) {
        return m23543a(context, (String) null, str, cls);
    }

    /* renamed from: a */
    public static void m23546a(Context context, String str, Serializable serializable) {
        m23547a(context, (String) null, str, serializable);
    }

    /* renamed from: b */
    public static void m23555b(final Context context, final String str, final Serializable serializable) {
        C5554g.m23702a(C5558a.DEFAULT, (Runnable) new Runnable() {
            public void run() {
                C5515e.m23547a(context, (String) null, str, serializable);
            }
        });
    }

    /* renamed from: a */
    public static void m23547a(Context context, String str, String str2, Serializable serializable) {
        if (str2 == null) {
            C5518g.m23563a("FileUtils", 3, "writeToDisk: fileName is null");
            return;
        }
        try {
            m23550a(m23553b(context, str), str2, serializable);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed writing to disk: ");
            sb.append(e.getLocalizedMessage());
            C5518g.m23563a("FileUtils", 3, sb.toString());
        }
    }

    /* renamed from: b */
    public static void m23556b(Context context, String str, String str2, Serializable serializable) {
        if (str2 == null) {
            C5518g.m23563a("FileUtils", 3, "writeToDisk: fileName is null");
            return;
        }
        try {
            m23550a(m23557c(context, str), str2, serializable);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed writing to disk: ");
            sb.append(e.getLocalizedMessage());
            C5518g.m23563a("FileUtils", 3, sb.toString());
        }
    }

    /* renamed from: a */
    public static <T> T m23543a(Context context, String str, String str2, Class<T> cls) {
        T t;
        if (str2 == null) {
            C5518g.m23561a(3, "readFromDisk::fileName is null");
            return null;
        }
        try {
            t = m23544a(m23553b(context, str), str2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read from disk: ");
            sb.append(e.getLocalizedMessage());
            C5518g.m23563a("FileUtils", 6, sb.toString());
            t = null;
            return t;
        } catch (Error e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to read from disk: ");
            sb2.append(e2.getLocalizedMessage());
            C5518g.m23563a("FileUtils", 6, sb2.toString());
            t = null;
            return t;
        }
        return t;
    }

    /* renamed from: b */
    public static <T> T m23551b(Context context, String str, String str2, Class<T> cls) {
        T t;
        if (str2 == null) {
            C5518g.m23561a(3, "readFromDisk::fileName is null");
            return null;
        }
        try {
            t = m23544a(m23557c(context, str), str2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read from disk: ");
            sb.append(e.getLocalizedMessage());
            C5518g.m23563a("FileUtils", 6, sb.toString());
            t = null;
            return t;
        } catch (Error e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to read from disk: ");
            sb2.append(e2.getLocalizedMessage());
            C5518g.m23563a("FileUtils", 6, sb2.toString());
            t = null;
            return t;
        }
        return t;
    }

    /* renamed from: b */
    public static <T> List<T> m23554b(Context context, String str, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(m23557c(context, str));
            if (file.exists()) {
                if (file.isDirectory()) {
                    String[] list = file.list();
                    if (list == null) {
                        C5518g.m23563a("FileUtils", 3, "Files directory is empty");
                        return null;
                    }
                    for (String file2 : list) {
                        File file3 = new File(file, file2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Reading file: ");
                        sb.append(file3.getPath());
                        C5518g.m23563a("FileUtils", 4, sb.toString());
                        arrayList.add(m23552b(file3));
                    }
                    return arrayList;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Files directory does not exist or not a directory: ");
            sb2.append(str);
            C5518g.m23563a("FileUtils", 3, sb2.toString());
            return null;
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to read from disk: ");
            sb3.append(e.getLocalizedMessage());
            C5518g.m23563a("FileUtils", 6, sb3.toString());
        }
    }

    /* renamed from: a */
    public static void m23545a(Context context, String str) {
        if (str == null) {
            C5518g.m23561a(3, "deleteDirectory::dirPath == null");
            return;
        }
        m23548a(new File(m23553b(context, str)));
        m23548a(new File(m23557c(context, str)));
    }

    /* renamed from: b */
    private static String m23553b(Context context, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().toString());
        if (str != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(File.separator);
            sb2.append(str);
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    private static String m23557c(Context context, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().toString());
        if (str != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(File.separator);
            sb2.append(str);
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    private static void m23550a(String str, String str2, Serializable serializable) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            File file2 = new File(file, str2);
            StringBuilder sb = new StringBuilder();
            sb.append("Writing file: ");
            sb.append(file2.getPath());
            C5518g.m23563a("FileUtils", 4, sb.toString());
            m23549a(serializable, file2);
            return;
        }
        C5518g.m23563a("FileUtils", 3, "Unable to create directories");
    }

    /* renamed from: a */
    private static <T> T m23544a(String str, String str2) {
        File file = new File(str);
        T t = null;
        if (!file.exists() || !file.isDirectory()) {
            C5518g.m23563a("FileUtils", 3, "Files directory does not exist or not a directory");
            return null;
        }
        File file2 = new File(file, str2);
        if (file2.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Reading file: ");
            sb.append(file2.getPath());
            C5518g.m23563a("FileUtils", 4, sb.toString());
            t = m23552b(file2);
        }
        return t;
    }

    /* renamed from: a */
    private static void m23548a(File file) {
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                m23548a(a);
            }
        }
        file.delete();
    }

    /* renamed from: a */
    private static void m23549a(Serializable serializable, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    /* renamed from: b */
    private static <T> T m23552b(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        T readObject = objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return readObject;
    }
}
