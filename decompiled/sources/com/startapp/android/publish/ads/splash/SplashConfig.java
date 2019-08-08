package com.startapp.android.publish.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: StartAppSDK */
public class SplashConfig implements Serializable {
    private static long DEFAULT_MAX_LOAD = 7500;
    private static final int INT_EMPTY_VALUE = -1;
    private static final String STRING_EMPTY_VALUE = "";
    private static final String VALUE_DEFAULT_HTML_BG_COLOR = "#066CAA";
    private static final String VALUE_DEFAULT_HTML_FONT_COLOR = "ffffff";
    private static final String VALUE_DEFAULT_HTML_LOADING_TYPE = "LoadingDots";
    private static final boolean VALUE_DEFAULT_HTML_SPLASH = true;
    private static final MaxAdDisplayTime VALUE_DEFAULT_MAXADDISPLAY = MaxAdDisplayTime.FOR_EVER;
    private static final long VALUE_DEFAULT_MAXLOAD = DEFAULT_MAX_LOAD;
    private static final MinSplashTime VALUE_DEFAULT_MINSPLASHTIME = MinSplashTime.REGULAR;
    private static final Orientation VALUE_DEFAULT_ORIENTATION = Orientation.AUTO;
    private static final Theme VALUE_DEFAULT_THEME = Theme.OCEAN;
    private static final long serialVersionUID = 1;
    private String appName = "";
    private int customScreen = -1;
    @C5548f(mo20535b = MaxAdDisplayTime.class)
    private MaxAdDisplayTime defaultMaxAdDisplayTime = VALUE_DEFAULT_MAXADDISPLAY;
    private Long defaultMaxLoadTime = Long.valueOf(VALUE_DEFAULT_MAXLOAD);
    @C5548f(mo20535b = MinSplashTime.class)
    private MinSplashTime defaultMinSplashTime = VALUE_DEFAULT_MINSPLASHTIME;
    @C5548f(mo20535b = Orientation.class)
    private Orientation defaultOrientation = VALUE_DEFAULT_ORIENTATION;
    @C5548f(mo20535b = Theme.class)
    private Theme defaultTheme = VALUE_DEFAULT_THEME;
    private transient String errMsg = "";
    private boolean forceNative = false;
    private boolean htmlSplash = true;
    private transient Drawable logo = null;
    private byte[] logoByteArray = null;
    private int logoRes = -1;
    private String splashBgColor = VALUE_DEFAULT_HTML_BG_COLOR;
    private String splashFontColor = VALUE_DEFAULT_HTML_FONT_COLOR;
    private String splashLoadingType = VALUE_DEFAULT_HTML_LOADING_TYPE;

    /* compiled from: StartAppSDK */
    public enum MaxAdDisplayTime {
        SHORT(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS),
        LONG(10000),
        FOR_EVER(86400000);
        
        private long index;

        private MaxAdDisplayTime(long j) {
            this.index = j;
        }

        public long getIndex() {
            return this.index;
        }

        public static MaxAdDisplayTime getByIndex(long j) {
            MaxAdDisplayTime maxAdDisplayTime = SHORT;
            MaxAdDisplayTime[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].getIndex() == j) {
                    maxAdDisplayTime = values[i];
                }
            }
            return maxAdDisplayTime;
        }

        public static MaxAdDisplayTime getByName(String str) {
            MaxAdDisplayTime maxAdDisplayTime = FOR_EVER;
            MaxAdDisplayTime[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    maxAdDisplayTime = values[i];
                }
            }
            return maxAdDisplayTime;
        }
    }

    /* compiled from: StartAppSDK */
    public enum MinSplashTime {
        REGULAR(3000),
        SHORT(2000),
        LONG(5000);
        
        private long index;

        private MinSplashTime(int i) {
            this.index = (long) i;
        }

        public long getIndex() {
            return this.index;
        }

        public static MinSplashTime getByIndex(long j) {
            MinSplashTime minSplashTime = SHORT;
            MinSplashTime[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].getIndex() == j) {
                    minSplashTime = values[i];
                }
            }
            return minSplashTime;
        }

        public static MinSplashTime getByName(String str) {
            MinSplashTime minSplashTime = LONG;
            MinSplashTime[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    minSplashTime = values[i];
                }
            }
            return minSplashTime;
        }
    }

    /* compiled from: StartAppSDK */
    public enum Orientation {
        PORTRAIT(1),
        LANDSCAPE(2),
        AUTO(3);
        
        private int index;

        private Orientation(int i) {
            this.index = i;
        }

        public int getIndex() {
            return this.index;
        }

        public static Orientation getByIndex(int i) {
            Orientation orientation = PORTRAIT;
            Orientation[] values = values();
            for (int i2 = 0; i2 < values.length; i2++) {
                if (values[i2].getIndex() == i) {
                    orientation = values[i2];
                }
            }
            return orientation;
        }

        public static Orientation getByName(String str) {
            Orientation orientation = AUTO;
            Orientation[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    orientation = values[i];
                }
            }
            return orientation;
        }
    }

    /* compiled from: StartAppSDK */
    public enum Theme {
        DEEP_BLUE(1),
        SKY(2),
        ASHEN_SKY(3),
        BLAZE(4),
        GLOOMY(5),
        OCEAN(6),
        USER_DEFINED(0);
        
        private int index;

        private Theme(int i) {
            this.index = i;
        }

        public int getIndex() {
            return this.index;
        }

        public static Theme getByIndex(int i) {
            Theme theme = DEEP_BLUE;
            Theme[] values = values();
            for (int i2 = 0; i2 < values.length; i2++) {
                if (values[i2].getIndex() == i) {
                    theme = values[i2];
                }
            }
            return theme;
        }

        public static Theme getByName(String str) {
            Theme theme = DEEP_BLUE;
            Theme[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    theme = values[i];
                }
            }
            return theme;
        }
    }

    public static SplashConfig getDefaultSplashConfig() {
        SplashConfig splashConfig = new SplashConfig();
        splashConfig.setTheme(VALUE_DEFAULT_THEME).setMinSplashTime(VALUE_DEFAULT_MINSPLASHTIME).setMaxLoadAdTimeout(VALUE_DEFAULT_MAXLOAD).setMaxAdDisplayTime(VALUE_DEFAULT_MAXADDISPLAY).setOrientation(VALUE_DEFAULT_ORIENTATION).setLoadingType(VALUE_DEFAULT_HTML_LOADING_TYPE).setAppName("");
        return splashConfig;
    }

    private static void applyDefaultSplashConfig(SplashConfig splashConfig, Context context) {
        SplashConfig defaultSplashConfig = getDefaultSplashConfig();
        if (splashConfig.getTheme() == null) {
            splashConfig.setTheme(defaultSplashConfig.getTheme());
        }
        if (splashConfig.getMinSplashTime() == null) {
            splashConfig.setMinSplashTime(defaultSplashConfig.getMinSplashTime());
        }
        if (splashConfig.getMaxLoadAdTimeout() == null) {
            splashConfig.setMaxLoadAdTimeout(defaultSplashConfig.getMaxLoadAdTimeout().longValue());
        }
        if (splashConfig.getMaxAdDisplayTime() == null) {
            splashConfig.setMaxAdDisplayTime(defaultSplashConfig.getMaxAdDisplayTime());
        }
        if (splashConfig.getOrientation() == null) {
            splashConfig.setOrientation(defaultSplashConfig.getOrientation());
        }
        if (splashConfig.getLoadingType() == null) {
            splashConfig.setLoadingType(defaultSplashConfig.getLoadingType());
        }
        if (splashConfig.getAppName().equals("")) {
            splashConfig.setAppName(C5349c.m22848a(context, "Welcome!"));
        }
    }

    public SplashConfig setTheme(Theme theme) {
        this.defaultTheme = theme;
        return this;
    }

    private void setSplashColorsByTheme(Theme theme) {
        String str = VALUE_DEFAULT_HTML_BG_COLOR;
        String str2 = VALUE_DEFAULT_HTML_FONT_COLOR;
        switch (theme) {
            case DEEP_BLUE:
                str2 = "#FFFFFF";
                str = VALUE_DEFAULT_HTML_BG_COLOR;
                break;
            case SKY:
                str2 = "#333333";
                str = "#a3d4e5";
                break;
            case ASHEN_SKY:
                str2 = "#333333";
                str = "#E3E3E3";
                break;
            case BLAZE:
                str2 = "#FFFFFF";
                str = "#FF6600";
                break;
            case GLOOMY:
                str2 = "#33B5E5";
                str = "#2F353F";
                break;
            case OCEAN:
                str2 = "#063D51";
                str = "#237C9A";
                break;
        }
        this.splashBgColor = str;
        this.splashFontColor = str2;
    }

    public SplashConfig setCustomScreen(int i) {
        this.customScreen = i;
        return this;
    }

    public SplashConfig setAppName(String str) {
        this.appName = str;
        return this;
    }

    public SplashConfig setLogo(int i) {
        this.logoRes = i;
        return this;
    }

    public SplashConfig setLogo(byte[] bArr) {
        this.logoByteArray = bArr;
        return this;
    }

    private SplashConfig setLogo(Drawable drawable) {
        this.logo = drawable;
        return this;
    }

    /* access modifiers changed from: protected */
    public SplashConfig setMaxLoadAdTimeout(long j) {
        this.defaultMaxLoadTime = Long.valueOf(j);
        return this;
    }

    public SplashConfig setOrientation(Orientation orientation) {
        this.defaultOrientation = orientation;
        return this;
    }

    public SplashConfig setMinSplashTime(MinSplashTime minSplashTime) {
        this.defaultMinSplashTime = minSplashTime;
        return this;
    }

    public SplashConfig setMaxAdDisplayTime(MaxAdDisplayTime maxAdDisplayTime) {
        this.defaultMaxAdDisplayTime = maxAdDisplayTime;
        return this;
    }

    /* access modifiers changed from: protected */
    public SplashConfig setHtmlSplash(boolean z) {
        this.htmlSplash = z;
        return this;
    }

    private void setErrorMsg(String str) {
        this.errMsg = str;
    }

    public int getCustomScreen() {
        return this.customScreen;
    }

    public String getAppName() {
        return this.appName;
    }

    public Drawable getLogo() {
        return this.logo;
    }

    public int getLogoRes() {
        return this.logoRes;
    }

    public byte[] getLogoByteArray() {
        return this.logoByteArray;
    }

    /* access modifiers changed from: protected */
    public Long getMaxLoadAdTimeout() {
        return this.defaultMaxLoadTime;
    }

    public String getErrorMessage() {
        return this.errMsg;
    }

    /* access modifiers changed from: protected */
    public Theme getTheme() {
        return this.defaultTheme;
    }

    public Orientation getOrientation() {
        return this.defaultOrientation;
    }

    public MinSplashTime getMinSplashTime() {
        return this.defaultMinSplashTime;
    }

    public MaxAdDisplayTime getMaxAdDisplayTime() {
        return this.defaultMaxAdDisplayTime;
    }

    public boolean isHtmlSplash() {
        if (this.forceNative) {
            return false;
        }
        return this.htmlSplash;
    }

    public String getBgColor() {
        return this.splashBgColor;
    }

    public String getFontColor() {
        return this.splashFontColor;
    }

    public String getLoadingType() {
        return this.splashLoadingType;
    }

    public SplashConfig setLoadingType(String str) {
        this.splashLoadingType = str;
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean validate(Context context) {
        if (C51821.f16667xd2cb10b[getTheme().ordinal()] != 7) {
            if (getAppName().equals("")) {
                setAppName(C5349c.m22848a(context, "Welcome!"));
            }
            if (getLogo() == null && getLogoByteArray() == null) {
                if (getLogoRes() == -1) {
                    setLogo(context.getApplicationInfo().icon);
                    setLogo(context.getResources().getDrawable(context.getApplicationInfo().icon));
                } else {
                    setLogo(context.getResources().getDrawable(getLogoRes()));
                }
            }
        } else if (getCustomScreen() == -1) {
            setErrorMsg("StartApp: Exception getting custom screen resource id, make sure it is set");
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public View getLayout(Context context) {
        if (C51821.f16667xd2cb10b[getTheme().ordinal()] != 7) {
            return C5207i.m22289a(context, this);
        }
        try {
            return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getCustomScreen(), null);
        } catch (NotFoundException unused) {
            throw new NotFoundException("StartApp: Can't find Custom layout resource");
        } catch (InflateException unused2) {
            throw new InflateException("StartApp: Can't inflate layout in Custom mode, Are you sure layout resource is valid?");
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "SplashConfig.getLayout - System service failed", e.getMessage(), "");
            return null;
        }
    }

    public void setDefaults(Context context) {
        SplashConfig a = C5194f.m22266b().mo19203a();
        if (a == null) {
            a = getDefaultSplashConfig();
        } else {
            setHtmlSplash(a.isHtmlSplash());
        }
        applyDefaultSplashConfig(a, context);
        if (getMaxAdDisplayTime() == null) {
            setMaxAdDisplayTime(a.getMaxAdDisplayTime());
        }
        if (getMaxLoadAdTimeout() == null) {
            setMaxLoadAdTimeout(a.getMaxLoadAdTimeout().longValue());
        }
        if (getMinSplashTime() == null) {
            setMinSplashTime(a.getMinSplashTime());
        }
        if (getOrientation() == null) {
            setOrientation(a.getOrientation());
        }
        if (getTheme() == null) {
            setTheme(a.getTheme());
        }
        if (getLogoRes() == -1) {
            setLogo(context.getApplicationInfo().icon);
        }
        if (getAppName().equals("")) {
            setAppName(a.getAppName());
        }
    }

    /* access modifiers changed from: protected */
    public void initSplashLogo(Activity activity) {
        if (getLogo() == null && getLogoRes() == -1 && getLogoByteArray() != null) {
            byte[] logoByteArray2 = getLogoByteArray();
            setLogo((Drawable) new BitmapDrawable(activity.getResources(), BitmapFactory.decodeByteArray(logoByteArray2, 0, logoByteArray2.length)));
        }
    }

    /* access modifiers changed from: protected */
    public C5191d initSplashHtml(Activity activity) {
        setSplashColorsByTheme(getTheme());
        C5191d dVar = new C5191d(activity);
        dVar.mo19200b(this);
        dVar.mo19197a(this);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    public boolean isUserDefinedSplash() {
        return getTheme() == Theme.USER_DEFINED || getCustomScreen() != -1;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SplashConfig splashConfig = (SplashConfig) obj;
        if (!(this.forceNative == splashConfig.forceNative && this.customScreen == splashConfig.customScreen && this.logoRes == splashConfig.logoRes && this.htmlSplash == splashConfig.htmlSplash && C5307i.m22682b(this.appName, splashConfig.appName) && Arrays.equals(this.logoByteArray, splashConfig.logoByteArray) && this.defaultTheme == splashConfig.defaultTheme && this.defaultMinSplashTime == splashConfig.defaultMinSplashTime && C5307i.m22682b(this.defaultMaxLoadTime, splashConfig.defaultMaxLoadTime) && this.defaultMaxAdDisplayTime == splashConfig.defaultMaxAdDisplayTime && this.defaultOrientation == splashConfig.defaultOrientation && C5307i.m22682b(this.splashBgColor, splashConfig.splashBgColor) && C5307i.m22682b(this.splashFontColor, splashConfig.splashFontColor) && C5307i.m22682b(this.splashLoadingType, splashConfig.splashLoadingType))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (31 * C5307i.m22652a(Boolean.valueOf(this.forceNative), Integer.valueOf(this.customScreen), this.appName, Integer.valueOf(this.logoRes), this.defaultTheme, this.defaultMinSplashTime, this.defaultMaxLoadTime, this.defaultMaxAdDisplayTime, this.defaultOrientation, Boolean.valueOf(this.htmlSplash), this.splashBgColor, this.splashFontColor, this.splashLoadingType)) + Arrays.hashCode(this.logoByteArray);
    }
}
