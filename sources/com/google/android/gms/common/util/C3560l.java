package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.l */
public final class C3560l {

    /* renamed from: a */
    private static final Pattern f10189a = Pattern.compile("\\\\.");

    /* renamed from: b */
    private static final Pattern f10190b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    /* renamed from: a */
    public static String m12759a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f10190b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case 8:
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case 9:
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case 10:
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                    default:
                        switch (charAt) {
                            case 12:
                                matcher.appendReplacement(stringBuffer, "\\\\f");
                                break;
                            case 13:
                                matcher.appendReplacement(stringBuffer, "\\\\r");
                                break;
                        }
                }
            } else {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
