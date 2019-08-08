package com.appnext.base.operations.imp;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

public class earcon extends C1269d {
    private static String TAG = "earcon";

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return true;
    }

    public earcon(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        try {
            ArrayList arrayList = new ArrayList();
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(m5430bJ());
            arrayList.add(new C1230b(str, sb.toString(), C1246a.Boolean.getType()));
            if (mo6012e(arrayList)) {
                return arrayList;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return earcon.class.getSimpleName();
    }

    /* renamed from: bJ */
    private static boolean m5430bJ() {
        AudioDeviceInfo[] devices;
        AudioManager audioManager = (AudioManager) C1247e.getContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (VERSION.SDK_INT < 23) {
            return audioManager.isWiredHeadsetOn();
        }
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7) {
                return true;
            }
        }
        return false;
    }
}
