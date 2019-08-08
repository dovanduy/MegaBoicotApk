package com.appnext.core;

import com.google.android.exoplayer2.C2793C;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public abstract class Configuration implements Serializable {
    private static final long serialVersionUID = 1;
    public String categories = "";
    public String language = "";
    public int maxVideoLength = 0;
    public int minVideoLength = 0;
    public Boolean mute;
    public String orientation = C1286Ad.ORIENTATION_DEFAULT;
    public String postback = "";

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public abstract C1345p mo5475ae();

    public void setCategories(String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(URLDecoder.decode(str, C2793C.UTF8_NAME))) {
                str = URLEncoder.encode(str, C2793C.UTF8_NAME);
            }
        } catch (Throwable unused) {
            str = "";
        }
        this.categories = str;
    }

    public void setPostback(String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(URLDecoder.decode(str, C2793C.UTF8_NAME))) {
                str = URLEncoder.encode(str, C2793C.UTF8_NAME);
            }
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        this.postback = str;
    }

    public void setMute(boolean z) {
        this.mute = Boolean.valueOf(z);
    }

    public String getCategories() {
        return this.categories;
    }

    public String getPostback() {
        return this.postback;
    }

    public boolean getMute() {
        return this.mute == null ? Boolean.parseBoolean(mo5475ae().get("mute")) : this.mute.booleanValue();
    }

    public String getOrientation() {
        return this.orientation;
    }

    public void setOrientation(String str) {
        if (str == null) {
            throw new IllegalArgumentException("orientation type");
        } else if (str.equals(C1286Ad.ORIENTATION_AUTO) || str.equals(C1286Ad.ORIENTATION_DEFAULT) || str.equals(C1286Ad.ORIENTATION_LANDSCAPE) || str.equals(C1286Ad.ORIENTATION_PORTRAIT)) {
            this.orientation = str;
        } else {
            throw new IllegalArgumentException("Wrong orientation type");
        }
    }

    public int getMaxVideoLength() {
        return this.maxVideoLength;
    }

    public void setMaxVideoLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Max Length must be higher than 0");
        } else if (i <= 0 || getMinVideoLength() <= 0 || i >= getMinVideoLength()) {
            this.maxVideoLength = i;
        } else {
            throw new IllegalArgumentException("Max Length cannot be lower than min length");
        }
    }

    public int getMinVideoLength() {
        return this.minVideoLength;
    }

    public void setMinVideoLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Min Length must be higher than 0");
        } else if (i <= 0 || getMaxVideoLength() <= 0 || i <= getMaxVideoLength()) {
            this.minVideoLength = i;
        } else {
            throw new IllegalArgumentException("Min Length cannot be higher than max length");
        }
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String str) {
        this.language = str;
    }
}
