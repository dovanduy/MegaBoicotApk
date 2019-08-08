package com.facebook.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdView.Type;
import com.facebook.ads.internal.adapters.C1637i;
import com.facebook.ads.internal.p086m.C1765d;
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1833f;
import com.facebook.ads.internal.protocol.C1787e;
import java.util.ArrayList;
import java.util.List;

public class NativeAd extends NativeAdBase {

    public enum AdCreativeType {
        IMAGE,
        VIDEO,
        CAROUSEL,
        UNKNOWN
    }

    protected NativeAd(Context context, C1637i iVar, C1765d dVar) {
        super(context, iVar, dVar);
        mo6923a(C1787e.NATIVE_UNKNOWN);
    }

    public NativeAd(Context context, String str) {
        super(context, str);
        mo6923a(C1787e.NATIVE_UNKNOWN);
    }

    NativeAd(NativeAdBase nativeAdBase) {
        super(nativeAdBase);
    }

    NativeAd(C1822e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo6909a() {
        return mo6927f().mo7765r();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6910a(Type type) {
        mo6927f().mo7741a(type.mo6981a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo6911b() {
        return mo6927f().mo7766s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public VideoAutoplayBehavior mo6912c() {
        return VideoAutoplayBehavior.fromInternalAutoplayBehavior(mo6927f().mo7767t());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public List<NativeAd> mo6913d() {
        if (mo6927f().mo7768u() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C1822e nativeAd : mo6927f().mo7768u()) {
            arrayList.add(new NativeAd(nativeAd));
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Type mo6914e() {
        if (mo6927f().mo7771x() == null) {
            return null;
        }
        return Type.m6448a(mo6927f().mo7771x());
    }

    public AdCreativeType getAdCreativeType() {
        return !TextUtils.isEmpty(mo6927f().mo7765r()) ? AdCreativeType.VIDEO : (mo6927f().mo7768u() == null || mo6927f().mo7768u().isEmpty()) ? (mo6927f().mo7757j() == null || TextUtils.isEmpty(mo6927f().mo7757j().mo7780a())) ? AdCreativeType.UNKNOWN : AdCreativeType.IMAGE : AdCreativeType.CAROUSEL;
    }

    public void registerViewForInteraction(View view, MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (AdIconView) null);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, ImageView imageView) {
        registerViewForInteraction(view, mediaView, imageView, null);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, ImageView imageView, List<View> list) {
        if (imageView != null) {
            C1822e.m7618a(mo6927f().mo7756i(), imageView);
        }
        registerViewForInteraction(view, mediaView, (MediaView) null, list);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, AdIconView adIconView) {
        registerViewForInteraction(view, mediaView, (MediaView) adIconView, null);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, MediaView mediaView2, List<View> list) {
        if (mediaView != null) {
            mediaView.setNativeAd(this);
        }
        if (mediaView2 != null) {
            mediaView2.mo6836a((NativeAdBase) this, false);
        }
        if (list != null) {
            mo6927f().mo7735a(view, (C1833f) mediaView, list);
        } else {
            mo6927f().mo7734a(view, (C1833f) mediaView);
        }
    }

    public void registerViewForInteraction(View view, MediaView mediaView, List<View> list) {
        registerViewForInteraction(view, mediaView, (MediaView) null, list);
    }
}
