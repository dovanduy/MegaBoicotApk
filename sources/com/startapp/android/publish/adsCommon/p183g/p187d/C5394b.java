package com.startapp.android.publish.adsCommon.p183g.p187d;

import com.startapp.common.p193a.C5518g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.startapp.android.publish.adsCommon.g.d.b */
/* compiled from: StartAppSDK */
public class C5394b {
    /* renamed from: a */
    public static Map<String, String> m23050a(String str) {
        String[] split;
        StringBuilder sb = new StringBuilder();
        sb.append("parseCommandUrl ");
        sb.append(str);
        C5518g.m23563a("MraidParser", 3, sb.toString());
        String substring = str.substring(8);
        HashMap hashMap = new HashMap();
        int indexOf = substring.indexOf(63);
        if (indexOf != -1) {
            String substring2 = substring.substring(0, indexOf);
            for (String str2 : substring.substring(indexOf + 1).split("&")) {
                int indexOf2 = str2.indexOf(61);
                hashMap.put(str2.substring(0, indexOf2), str2.substring(indexOf2 + 1));
            }
            substring = substring2;
        }
        if (!m23052b(substring)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("command ");
            sb2.append(substring);
            sb2.append(" is unknown");
            C5518g.m23561a(5, sb2.toString());
            return null;
        } else if (!m23051a(substring, hashMap)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("command URL ");
            sb3.append(str);
            sb3.append(" is missing parameters");
            C5518g.m23561a(5, sb3.toString());
            return null;
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("command", substring);
            hashMap2.putAll(hashMap);
            return hashMap2;
        }
    }

    /* renamed from: b */
    public static boolean m23052b(String str) {
        return Arrays.asList(new String[]{"close", "createCalendarEvent", "expand", "open", "playVideo", "resize", "setOrientationProperties", "setResizeProperties", "storePicture", "useCustomClose"}).contains(str);
    }

    /* renamed from: a */
    private static boolean m23051a(String str, Map<String, String> map) {
        if (str.equals("createCalendarEvent")) {
            return map.containsKey("eventJSON");
        }
        if (str.equals("open") || str.equals("playVideo") || str.equals("storePicture")) {
            return map.containsKey("url");
        }
        boolean z = false;
        if (str.equals("setOrientationProperties")) {
            if (map.containsKey("allowOrientationChange") && map.containsKey("forceOrientation")) {
                z = true;
            }
            return z;
        } else if (str.equals("setResizeProperties")) {
            if (map.containsKey("width") && map.containsKey("height") && map.containsKey("offsetX") && map.containsKey("offsetY") && map.containsKey("customClosePosition") && map.containsKey("allowOffscreen")) {
                z = true;
            }
            return z;
        } else if (str.equals("useCustomClose")) {
            return map.containsKey("useCustomClose");
        } else {
            return true;
        }
    }
}
