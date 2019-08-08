package com.facebook.ads.internal.p115w.p116a;

import android.app.Activity;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.w.a.a */
class C2304a {
    /* renamed from: a */
    static Activity m9011a() {
        Activity activity = null;
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map == null) {
                return null;
            }
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Class cls2 = next.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(next);
                    break;
                }
            }
            return activity;
        } catch (Exception unused) {
        }
    }
}
