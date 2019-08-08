package com.facebook.ads.internal.view.p110i.p114d;

import android.net.Uri;
import android.view.View;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;

/* renamed from: com.facebook.ads.internal.view.i.d.c */
public interface C2239c {
    /* renamed from: a */
    void mo8541a();

    /* renamed from: a */
    void mo8542a(int i);

    /* renamed from: a */
    void mo8543a(C2116a aVar);

    /* renamed from: a */
    void mo8544a(boolean z);

    /* renamed from: b */
    void mo8545b();

    /* renamed from: c */
    void mo8546c();

    /* renamed from: d */
    boolean mo8547d();

    /* renamed from: e */
    void mo8548e();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    C2116a getStartReason();

    C2240d getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(C2241e eVar);

    void setup(Uri uri);
}
