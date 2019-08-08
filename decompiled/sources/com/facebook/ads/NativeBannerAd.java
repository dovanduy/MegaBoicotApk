package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeBannerAdView.Type;
import com.facebook.ads.internal.p093t.C1833f;
import com.facebook.ads.internal.protocol.C1787e;
import java.util.List;

public class NativeBannerAd extends NativeAdBase {
    public NativeBannerAd(Context context, String str) {
        super(context, str);
        mo6923a(C1787e.NATIVE_BANNER);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Type mo7020a() {
        if (mo6927f().mo7771x() == null) {
            return null;
        }
        return Type.m6463a(mo6927f().mo7771x());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7021a(Type type) {
        mo6927f().mo7741a(type.mo7024a());
    }

    public void registerViewForInteraction(View view, MediaView mediaView) {
        registerViewForInteraction(view, mediaView, null);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, List<View> list) {
        if (mediaView != null) {
            mediaView.mo6836a((NativeAdBase) this, true);
        }
        if (list != null) {
            mo6927f().mo7735a(view, (C1833f) mediaView, list);
        } else {
            mo6927f().mo7734a(view, (C1833f) mediaView);
        }
    }
}
