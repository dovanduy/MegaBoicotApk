package com.startapp.android.publish.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.startapp.android.publish.ads.nativead.StartAppNativeAd.C5179b;
import java.util.List;

/* compiled from: StartAppSDK */
public interface NativeAdInterface {
    C5179b getCampaignAction();

    String getCategory();

    String getDescription();

    Bitmap getImageBitmap();

    String getImageUrl();

    String getInstalls();

    String getPackacgeName();

    float getRating();

    Bitmap getSecondaryImageBitmap();

    String getSecondaryImageUrl();

    String getTitle();

    Boolean isApp();

    boolean registerViewForInteraction(View view);

    boolean registerViewForInteraction(View view, List<View> list);

    @Deprecated
    void sendClick(Context context);

    @Deprecated
    void sendImpression(Context context);

    void unregisterView();
}
