package android.support.p017v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.support.p017v4.app.C0301u.C0302a;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: android.support.v4.app.w */
/* compiled from: NotificationCompatJellybean */
class C0308w {

    /* renamed from: a */
    private static final Object f753a = new Object();

    /* renamed from: b */
    private static Field f754b;

    /* renamed from: c */
    private static boolean f755c;

    /* renamed from: d */
    private static final Object f756d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m1144a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m1141a(Notification notification) {
        synchronized (f753a) {
            if (f755c) {
                return null;
            }
            try {
                if (f754b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f755c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f754b = declaredField;
                }
                Bundle bundle = (Bundle) f754b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f754b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f755c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f755c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Bundle m1140a(Builder builder, C0302a aVar) {
        builder.addAction(aVar.mo1043a(), aVar.mo1044b(), aVar.mo1045c());
        Bundle bundle = new Bundle(aVar.mo1046d());
        if (aVar.mo1048f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m1145a(aVar.mo1048f()));
        }
        if (aVar.mo1050h() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m1145a(aVar.mo1050h()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1047e());
        return bundle;
    }

    /* renamed from: a */
    static Bundle m1142a(C0302a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", aVar.mo1043a());
        bundle2.putCharSequence("title", aVar.mo1044b());
        bundle2.putParcelable("actionIntent", aVar.mo1045c());
        if (aVar.mo1046d() != null) {
            bundle = new Bundle(aVar.mo1046d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1047e());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m1145a(aVar.mo1048f()));
        bundle2.putBoolean("showsUserInterface", aVar.mo1051i());
        bundle2.putInt("semanticAction", aVar.mo1049g());
        return bundle2;
    }

    /* renamed from: a */
    private static Bundle m1143a(C0317z zVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", zVar.mo1109a());
        bundle.putCharSequence("label", zVar.mo1110b());
        bundle.putCharSequenceArray("choices", zVar.mo1111c());
        bundle.putBoolean("allowFreeFormInput", zVar.mo1114f());
        bundle.putBundle("extras", zVar.mo1115g());
        Set<String> d = zVar.mo1112d();
        if (d != null && !d.isEmpty()) {
            ArrayList arrayList = new ArrayList(d.size());
            for (String add : d) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: a */
    private static Bundle[] m1145a(C0317z[] zVarArr) {
        if (zVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[zVarArr.length];
        for (int i = 0; i < zVarArr.length; i++) {
            bundleArr[i] = m1143a(zVarArr[i]);
        }
        return bundleArr;
    }
}
