package com.startapp.p154a.p155a.p158c;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/* renamed from: com.startapp.a.a.c.d */
/* compiled from: StartAppSDK */
public class C5050d {

    /* renamed from: a */
    public static final char f16366a = File.separatorChar;

    /* renamed from: b */
    public static final String f16367b;

    static {
        C5051e eVar = new C5051e(4);
        PrintWriter printWriter = new PrintWriter(eVar);
        printWriter.println();
        f16367b = eVar.toString();
        printWriter.close();
    }

    /* renamed from: a */
    public static void m21824a(OutputStream outputStream) {
        m21823a((Closeable) outputStream);
    }

    /* renamed from: a */
    public static void m21823a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
