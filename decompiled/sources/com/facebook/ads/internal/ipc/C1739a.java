package com.facebook.ads.internal.ipc;

import android.content.Context;
import android.os.Message;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.p075c.C1688c;
import com.facebook.ads.internal.p075c.C1689d;
import com.facebook.ads.internal.p075c.C1694e;
import com.facebook.ads.internal.p075c.C1698g;
import com.facebook.ads.internal.p075c.C1702j;
import com.facebook.ads.internal.p078e.C1708a;
import com.facebook.ads.internal.p078e.C1708a.C1709a;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.io.Serializable;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.internal.ipc.a */
public class C1739a {

    /* renamed from: a */
    public static final String f5435a = "a";

    /* renamed from: b */
    private final Context f5436b;

    /* renamed from: c */
    private final C1708a f5437c = C1708a.m7114a();

    C1739a(Context context) {
        this.f5436b = context;
    }

    /* renamed from: a */
    public boolean mo7525a(Message message) {
        C1708a aVar;
        int i;
        String string = message.getData().getString("STR_AD_ID_KEY");
        int i2 = message.what;
        switch (i2) {
            case 1010:
                String string2 = message.getData().getString("STR_PLACEMENT_KEY");
                String string3 = message.getData().getString("STR_BID_PAYLOAD_KEY");
                EnumSet<CacheFlag> enumSet = (EnumSet) message.getData().getSerializable("SRL_INT_CACHE_FLAGS_KEY");
                String string4 = message.getData().getString("STR_EXTRA_HINTS_KEY");
                AdInternalSettings.f5731a = message.getData().getBundle("BUNDLE_SETTINGS_KEY");
                C1698g gVar = new C1698g(this.f5436b, null, string2);
                gVar.f5298d = string4;
                gVar.f5300f = string3;
                gVar.f5299e = enumSet;
                C1709a e = C1708a.m7114a().mo7466e(string);
                if (e != null) {
                    if (e.f5356c == null) {
                        C1689d dVar = new C1689d(gVar, this.f5437c, string);
                        dVar.mo7407a(gVar.f5299e, gVar.f5300f);
                        e.f5356c = dVar;
                    } else if (e.f5356c instanceof C1689d) {
                        ((C1689d) e.f5356c).mo7407a(gVar.f5299e, gVar.f5300f);
                    }
                    this.f5437c.mo7460a(1015, string);
                    return true;
                }
                int i3 = C2373b.f7511m;
                StringBuilder sb = new StringBuilder();
                sb.append("Missing ad: ");
                sb.append(string);
                C2370a.m9149b(this.f5436b, "api", i3, new Exception(sb.toString()));
                return true;
            case 1011:
                C1688c a = C1708a.m7114a().mo7459a(string);
                if (a == null || !(a instanceof C1689d)) {
                    int i4 = C2373b.f7511m;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Missing bundle for message: ");
                    sb2.append(message);
                    C2370a.m9149b(this.f5436b, "api", i4, new Exception(sb2.toString()));
                    return true;
                }
                ((C1689d) a).mo7411e();
                this.f5437c.mo7460a(1016, string);
                return true;
            case 1012:
                C1708a.m7114a().mo7463b(string);
                aVar = this.f5437c;
                i = 1017;
                break;
            default:
                switch (i2) {
                    case 2000:
                        String string5 = message.getData().getString("STR_PLACEMENT_KEY");
                        String string6 = message.getData().getString("STR_BID_PAYLOAD_KEY");
                        Boolean valueOf = Boolean.valueOf(message.getData().getBoolean("BOOL_RV_FAIL_ON_CACHE_FAILURE_KEY"));
                        String string7 = message.getData().getString("STR_EXTRA_HINTS_KEY");
                        AdInternalSettings.f5731a = message.getData().getBundle("BUNDLE_SETTINGS_KEY");
                        C1702j jVar = new C1702j(this.f5436b, string5, null);
                        jVar.f5317d = string7;
                        jVar.f5319f = string6;
                        jVar.f5320g = valueOf.booleanValue();
                        Serializable serializable = message.getData().getSerializable("SRL_RV_REWARD_DATA_KEY");
                        if (serializable instanceof RewardData) {
                            jVar.f5318e = (RewardData) serializable;
                        }
                        C1709a e2 = C1708a.m7114a().mo7466e(string);
                        if (e2 != null) {
                            if (e2.f5356c == null) {
                                C1694e eVar = new C1694e(jVar, this.f5437c, string);
                                eVar.mo7413a(jVar.f5319f, jVar.f5320g);
                                e2.f5356c = eVar;
                            } else if (e2.f5356c instanceof C1694e) {
                                ((C1694e) e2.f5356c).mo7413a(jVar.f5319f, jVar.f5320g);
                            }
                            this.f5437c.mo7460a(2010, string);
                            return true;
                        }
                        int i5 = C2373b.f7511m;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Missing ad: ");
                        sb3.append(string);
                        C2370a.m9149b(this.f5436b, "api", i5, new Exception(sb3.toString()));
                        return true;
                    case AdError.INTERNAL_ERROR_CODE /*2001*/:
                        C1688c a2 = C1708a.m7114a().mo7459a(string);
                        if (a2 == null || !(a2 instanceof C1694e)) {
                            int i6 = C2373b.f7511m;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Missing ad: ");
                            sb4.append(string);
                            C2370a.m9149b(this.f5436b, "api", i6, new Exception(sb4.toString()));
                            return true;
                        }
                        ((C1694e) a2).mo7414a(message.getData().getInt("INT_RV_APP_ORIENTATION_KEY", 0));
                        this.f5437c.mo7460a(2011, string);
                        return true;
                    case AdError.CACHE_ERROR_CODE /*2002*/:
                        C1708a.m7114a().mo7463b(string);
                        aVar = this.f5437c;
                        i = 2012;
                        break;
                    case AdError.INTERNAL_ERROR_2003 /*2003*/:
                        C1688c a3 = C1708a.m7114a().mo7459a(string);
                        if (a3 == null || !(a3 instanceof C1694e)) {
                            int i7 = C2373b.f7511m;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Missing ad: ");
                            sb5.append(string);
                            C2370a.m9149b(this.f5436b, "api", i7, new Exception(sb5.toString()));
                        } else {
                            C1694e eVar2 = (C1694e) a3;
                            Serializable serializable2 = message.getData().getSerializable("SRL_RV_REWARD_DATA_KEY");
                            if (serializable2 instanceof RewardData) {
                                eVar2.mo7412a((RewardData) serializable2);
                                return true;
                            }
                        }
                        return true;
                    default:
                        return false;
                }
        }
        aVar.mo7460a(i, string);
        return true;
    }
}
