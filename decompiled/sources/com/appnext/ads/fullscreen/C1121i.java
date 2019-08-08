package com.appnext.ads.fullscreen;

import com.appnext.core.AppnextAd;
import com.appnext.core.C1345p;
import java.util.ArrayList;

/* renamed from: com.appnext.ads.fullscreen.i */
public interface C1121i {
    void closeClicked();

    C1345p getConfigManager();

    ArrayList<AppnextAd> getPreRollAds();

    int getTemplate(String str);

    void privacyClicked();

    void report(String str, String str2);

    void videoSelected(AppnextAd appnextAd);
}
