package com.google.android.gms.internal.ads;

final class adt {
    /* renamed from: a */
    static String m13698a(C4386zw zwVar) {
        String str;
        char c;
        adu adu = new adu(zwVar);
        StringBuilder sb = new StringBuilder(adu.mo14152a());
        for (int i = 0; i < adu.mo14152a(); i++) {
            byte a = adu.mo14151a(i);
            if (a == 34) {
                str = "\\\"";
            } else if (a == 39) {
                str = "\\'";
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            c = (char) (48 + (a & 7));
                        } else {
                            c = (char) a;
                        }
                        sb.append(c);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}