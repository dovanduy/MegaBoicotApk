package com.facebook.devicerequests.p129a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.C2649m;
import com.facebook.internal.C2477ab;
import com.facebook.internal.C2529l;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.devicerequests.a.a */
/* compiled from: DeviceRequestsHelper */
public class C2466a {

    /* renamed from: a */
    private static HashMap<String, RegistrationListener> f7775a = new HashMap<>();

    /* renamed from: a */
    public static String m9375a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static boolean m9376a(String str) {
        if (m9378b()) {
            return m9380d(str);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m9378b() {
        return VERSION.SDK_INT >= 16 && C2529l.m9632a(C2649m.m10137j()).mo9001g().contains(C2477ab.f7799b);
    }

    /* renamed from: b */
    public static Bitmap m9377b(String str) {
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.MARGIN, Integer.valueOf(2));
        try {
            BitMatrix encode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, 200, 200, enumMap);
            int height = encode.getHeight();
            int width = encode.getWidth();
            int[] iArr = new int[(height * width)];
            for (int i = 0; i < height; i++) {
                int i2 = i * width;
                for (int i3 = 0; i3 < width; i3++) {
                    iArr[i2 + i3] = encode.get(i3, i) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
            try {
                createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                return createBitmap;
            } catch (WriterException unused) {
                return createBitmap;
            }
        } catch (WriterException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m9379c(String str) {
        m9381e(str);
    }

    @TargetApi(16)
    /* renamed from: d */
    private static boolean m9380d(final String str) {
        if (f7775a.containsKey(str)) {
            return true;
        }
        final String format = String.format("%s_%s_%s", new Object[]{"fbsdk", String.format("%s-%s", new Object[]{"android", C2649m.m10135h().replace('.', '|')}), str});
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(format);
        nsdServiceInfo.setPort(80);
        NsdManager nsdManager = (NsdManager) C2649m.m10133f().getSystemService("servicediscovery");
        C24671 r4 = new RegistrationListener() {
            public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            }

            public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            }

            public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
                if (!format.equals(nsdServiceInfo.getServiceName())) {
                    C2466a.m9379c(str);
                }
            }

            public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
                C2466a.m9379c(str);
            }
        };
        f7775a.put(str, r4);
        nsdManager.registerService(nsdServiceInfo, 1, r4);
        return true;
    }

    @TargetApi(16)
    /* renamed from: e */
    private static void m9381e(String str) {
        RegistrationListener registrationListener = (RegistrationListener) f7775a.get(str);
        if (registrationListener != null) {
            ((NsdManager) C2649m.m10133f().getSystemService("servicediscovery")).unregisterService(registrationListener);
            f7775a.remove(str);
        }
    }
}
