package com.startapp.android.publish.adsCommon.p183g.p184a;

import android.app.Activity;
import com.google.android.exoplayer2.C2793C;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.adsCommon.p183g.p186c.C5391a;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import java.net.URLDecoder;
import java.util.Map;

/* renamed from: com.startapp.android.publish.adsCommon.g.a.a */
/* compiled from: StartAppSDK */
public abstract class C5383a implements C5385b {
    private static final String TAG = "BaseMraidController";
    protected C5384a openListener;

    /* renamed from: com.startapp.android.publish.adsCommon.g.a.a$a */
    /* compiled from: StartAppSDK */
    public interface C5384a {
        boolean onClickEvent(String str);
    }

    public abstract void close();

    public abstract boolean isFeatureSupported(String str);

    public abstract void setOrientationProperties(Map<String, String> map);

    public abstract void useCustomClose(String str);

    public C5383a(C5384a aVar) {
        this.openListener = aVar;
    }

    public void resize() {
        C5518g.m23563a(TAG, 3, "resize");
    }

    public void expand(String str) {
        C5518g.m23563a(TAG, 3, "expand");
    }

    public boolean open(String str) {
        Exception e;
        String str2;
        String str3 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("open ");
        sb.append(str);
        C5518g.m23563a(str3, 3, sb.toString());
        try {
            str2 = URLDecoder.decode(str, C2793C.UTF8_NAME).trim();
            try {
                if (str2.startsWith("sms")) {
                    return openSMS(str2);
                }
                if (str2.startsWith("tel")) {
                    return openTel(str2);
                }
                return this.openListener.onClickEvent(str2);
            } catch (Exception e2) {
                e = e2;
                C5518g.m23563a(TAG, 6, e.getMessage());
                return this.openListener.onClickEvent(str2);
            }
        } catch (Exception e3) {
            Exception exc = e3;
            str2 = str;
            e = exc;
            C5518g.m23563a(TAG, 6, e.getMessage());
            return this.openListener.onClickEvent(str2);
        }
    }

    /* access modifiers changed from: protected */
    public void applyOrientationProperties(Activity activity, C5391a aVar) {
        try {
            int i = 0;
            int i2 = activity.getResources().getConfiguration().orientation == 1 ? 1 : 0;
            if (aVar.f17259b == 0) {
                i = 1;
            } else if (aVar.f17259b != 1) {
                i = aVar.f17258a ? -1 : i2;
            }
            C5509c.m23506a(activity, i);
        } catch (Exception e) {
            C5378f.m23016a(activity, C5376d.EXCEPTION, "BaseMraidController.applyOrientationProperties", e.getMessage(), "");
        }
    }

    public void setResizeProperties(Map<String, String> map) {
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setResizeProperties ");
        sb.append(map);
        C5518g.m23563a(str, 3, sb.toString());
    }

    public void setExpandProperties(Map<String, String> map) {
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setExpandProperties ");
        sb.append(map);
        C5518g.m23563a(str, 3, sb.toString());
    }

    public void createCalendarEvent(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("createCalendarEvent ");
        sb.append(str);
        C5518g.m23563a(str2, 3, sb.toString());
        isFeatureSupported("calendar");
    }

    public void playVideo(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("playVideo ");
        sb.append(str);
        C5518g.m23563a(str2, 3, sb.toString());
        isFeatureSupported("inlineVideo");
    }

    public void storePicture(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("storePicture ");
        sb.append(str);
        C5518g.m23563a(str2, 3, sb.toString());
        isFeatureSupported("storePicture");
    }

    public boolean openSMS(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("openSMS ");
        sb.append(str);
        C5518g.m23563a(str2, 3, sb.toString());
        isFeatureSupported("sms");
        return true;
    }

    public boolean openTel(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("openTel ");
        sb.append(str);
        C5518g.m23563a(str2, 3, sb.toString());
        isFeatureSupported("tel");
        return true;
    }
}
