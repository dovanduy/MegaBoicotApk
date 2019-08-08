package com.startapp.p154a.p155a.p159d;

import com.startapp.p154a.p155a.p158c.C5046a;
import com.startapp.p154a.p155a.p158c.C5050d;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.startapp.a.a.d.a */
/* compiled from: StartAppSDK */
public class C5053a implements C5057e {

    /* renamed from: a */
    private final C5055c f16369a;

    public C5053a(C5055c cVar) {
        this.f16369a = cVar;
    }

    /* renamed from: a */
    public String mo18662a(String str) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(str.getBytes());
                C5050d.m21824a((OutputStream) gZIPOutputStream2);
                String a = this.f16369a.mo18663a(C5046a.m21807a(byteArrayOutputStream.toByteArray()));
                C5050d.m21824a((OutputStream) gZIPOutputStream2);
                return a;
            } catch (Exception unused) {
                gZIPOutputStream = gZIPOutputStream2;
                String str2 = "";
                C5050d.m21824a((OutputStream) gZIPOutputStream);
                return str2;
            } catch (Throwable th) {
                C5050d.m21824a((OutputStream) gZIPOutputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            String str22 = "";
            C5050d.m21824a((OutputStream) gZIPOutputStream);
            return str22;
        }
    }
}
