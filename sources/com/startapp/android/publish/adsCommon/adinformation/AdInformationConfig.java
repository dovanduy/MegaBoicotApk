package com.startapp.android.publish.adsCommon.adinformation;

import android.content.Context;
import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationPositions.Position;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: StartAppSDK */
public class AdInformationConfig implements Serializable {
    private static final long serialVersionUID = 1;
    @C5548f(mo20535b = ArrayList.class, mo20536c = C5342e.class)
    private List<C5342e> ImageResources = new ArrayList();
    @C5548f(mo20535b = HashMap.class, mo20536c = Position.class, mo20537d = Placement.class)
    protected HashMap<Placement, Position> Positions = new HashMap<>();

    /* renamed from: a */
    private transient EnumMap<ImageResourceType, C5342e> f17088a = new EnumMap<>(ImageResourceType.class);
    private String dialogUrlSecured = "https://d1byvlfiet2h9q.cloudfront.net/InApp/resources/adInformationDialog3.html";
    private boolean enabled = true;
    private String eulaUrlSecured = "https://www.com.startapp.com/policy/sdk-policy/";
    private float fatFingersFactor = 200.0f;

    /* compiled from: StartAppSDK */
    public enum ImageResourceType {
        INFO_S(17, 14),
        INFO_EX_S(88, 14),
        INFO_L(25, 21),
        INFO_EX_L(TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 21);
        
        private int height;
        private int width;

        private ImageResourceType(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public int getDefaultWidth() {
            return this.width;
        }

        public int getDefaultHeight() {
            return this.height;
        }

        public static ImageResourceType getByName(String str) {
            ImageResourceType imageResourceType = INFO_S;
            ImageResourceType[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    imageResourceType = values[i];
                }
            }
            return imageResourceType;
        }
    }

    private AdInformationConfig() {
    }

    /* renamed from: a */
    public static AdInformationConfig m22718a() {
        AdInformationConfig adInformationConfig = new AdInformationConfig();
        m22719a(adInformationConfig);
        return adInformationConfig;
    }

    /* renamed from: a */
    public static void m22719a(AdInformationConfig adInformationConfig) {
        adInformationConfig.mo19695i();
        adInformationConfig.mo19693h();
    }

    /* renamed from: b */
    public String mo19686b() {
        return (this.eulaUrlSecured == null || this.eulaUrlSecured.equals("")) ? "https://www.com.startapp.com/policy/sdk-policy/" : this.eulaUrlSecured;
    }

    /* renamed from: c */
    public String mo19687c() {
        return (!this.f17088a.containsKey(ImageResourceType.INFO_L) || ((C5342e) this.f17088a.get(ImageResourceType.INFO_L)).mo19743d().equals("")) ? "https://info.startappservice.com/InApp/resources/info_l.png" : ((C5342e) this.f17088a.get(ImageResourceType.INFO_L)).mo19743d();
    }

    /* renamed from: d */
    public boolean mo19688d() {
        return this.enabled;
    }

    /* renamed from: a */
    public boolean mo19685a(Context context) {
        return !C5414k.m23092a(context, "userDisabledAdInformation", Boolean.valueOf(false)).booleanValue() && mo19688d();
    }

    /* renamed from: a */
    public void mo19683a(Context context, boolean z) {
        C5414k.m23099b(context, "userDisabledAdInformation", Boolean.valueOf(!z));
    }

    /* renamed from: e */
    public float mo19689e() {
        return this.fatFingersFactor / 100.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19684a(ImageResourceType imageResourceType, C5342e eVar) {
        mo19696j().put(imageResourceType, eVar);
    }

    /* renamed from: f */
    public String mo19691f() {
        return this.dialogUrlSecured != null ? this.dialogUrlSecured : "https://d1byvlfiet2h9q.cloudfront.net/InApp/resources/adInformationDialog3.html";
    }

    /* renamed from: a */
    public Position mo19681a(Placement placement) {
        Position position = (Position) this.Positions.get(placement);
        if (position != null) {
            return position;
        }
        Position position2 = Position.BOTTOM_LEFT;
        this.Positions.put(placement, position2);
        return position2;
    }

    /* renamed from: a */
    public C5342e mo19682a(ImageResourceType imageResourceType) {
        return (C5342e) mo19696j().get(imageResourceType);
    }

    /* renamed from: g */
    public void mo19692g() {
        for (C5342e eVar : this.ImageResources) {
            mo19684a(ImageResourceType.getByName(eVar.mo19734a()), eVar);
            eVar.mo19744e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo19693h() {
        ImageResourceType[] values;
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            if (mo19696j().get(imageResourceType) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("AdInformation error in ImageResource [");
                sb.append(imageResourceType);
                sb.append("] cannot be found in MetaData");
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo19695i() {
        ImageResourceType[] values;
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            C5342e eVar = (C5342e) mo19696j().get(imageResourceType);
            Boolean valueOf = Boolean.valueOf(true);
            if (eVar == null) {
                eVar = C5342e.m22766c(imageResourceType.name());
                Iterator it = this.ImageResources.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (ImageResourceType.getByName(((C5342e) it.next()).mo19734a()).equals(imageResourceType)) {
                            valueOf = Boolean.valueOf(false);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                mo19696j().put(imageResourceType, eVar);
                if (valueOf.booleanValue()) {
                    this.ImageResources.add(eVar);
                }
            }
            eVar.mo19735a(imageResourceType.getDefaultWidth());
            eVar.mo19740b(imageResourceType.getDefaultHeight());
            StringBuilder sb = new StringBuilder();
            sb.append(imageResourceType.name().toLowerCase());
            sb.append(".png");
            eVar.mo19737a(sb.toString());
        }
    }

    /* renamed from: j */
    public EnumMap<ImageResourceType, C5342e> mo19696j() {
        return this.f17088a;
    }

    /* renamed from: k */
    public void mo19697k() {
        this.f17088a = new EnumMap<>(ImageResourceType.class);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInformationConfig adInformationConfig = (AdInformationConfig) obj;
        if (this.enabled != adInformationConfig.enabled || Float.compare(adInformationConfig.fatFingersFactor, this.fatFingersFactor) != 0 || !C5307i.m22682b(this.dialogUrlSecured, adInformationConfig.dialogUrlSecured) || !C5307i.m22682b(this.eulaUrlSecured, adInformationConfig.eulaUrlSecured) || !C5307i.m22682b(this.Positions, adInformationConfig.Positions) || !C5307i.m22682b(this.ImageResources, adInformationConfig.ImageResources)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(Boolean.valueOf(this.enabled), Float.valueOf(this.fatFingersFactor), this.dialogUrlSecured, this.eulaUrlSecured, this.Positions, this.ImageResources);
    }
}
