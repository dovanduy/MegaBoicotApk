package com.facebook.ads.internal.p115w.p117b;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.w.b.s */
public class C2332s {
    /* renamed from: a */
    public static final String m9057a(Throwable th) {
        if (th == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static String m9058a(List<String> list, String str) {
        StringBuilder sb = new StringBuilder("");
        for (String append : list) {
            sb.append(append);
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m9059a(StackTraceElement[] stackTraceElementArr) {
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }
}
