package com.startapp.android.publish.ads.list3d;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.startapp.android.publish.common.model.AdDetails;

/* compiled from: StartAppSDK */
public class ListItem implements Parcelable {
    public static final Creator<ListItem> CREATOR = new Creator<ListItem>() {
        /* renamed from: a */
        public ListItem createFromParcel(Parcel parcel) {
            return new ListItem(parcel);
        }

        /* renamed from: a */
        public ListItem[] newArray(int i) {
            return new ListItem[i];
        }
    };

    /* renamed from: a */
    private String f16562a;

    /* renamed from: b */
    private String f16563b;

    /* renamed from: c */
    private String f16564c;

    /* renamed from: d */
    private String f16565d;

    /* renamed from: e */
    private String f16566e;

    /* renamed from: f */
    private String f16567f;

    /* renamed from: g */
    private String f16568g;

    /* renamed from: h */
    private String f16569h;

    /* renamed from: i */
    private String f16570i;

    /* renamed from: j */
    private float f16571j;

    /* renamed from: k */
    private boolean f16572k;

    /* renamed from: l */
    private boolean f16573l;

    /* renamed from: m */
    private Drawable f16574m;

    /* renamed from: n */
    private String f16575n;

    /* renamed from: o */
    private String f16576o;

    /* renamed from: p */
    private Long f16577p;

    /* renamed from: q */
    private Boolean f16578q;

    /* renamed from: r */
    private String f16579r;

    public int describeContents() {
        return 0;
    }

    public ListItem(AdDetails adDetails) {
        this.f16562a = "";
        this.f16563b = "";
        this.f16564c = "";
        this.f16565d = "";
        this.f16566e = "";
        this.f16567f = "";
        this.f16568g = "";
        this.f16569h = "";
        this.f16570i = "";
        this.f16571j = 0.0f;
        this.f16572k = false;
        this.f16573l = true;
        this.f16574m = null;
        this.f16578q = null;
        this.f16579r = "";
        this.f16562a = adDetails.getAdId();
        this.f16563b = adDetails.getClickUrl();
        this.f16564c = adDetails.getTrackingUrl();
        this.f16565d = adDetails.getTrackingClickUrl();
        this.f16566e = adDetails.getTrackingCloseUrl();
        this.f16567f = adDetails.getPackageName();
        this.f16568g = adDetails.getTitle();
        this.f16569h = adDetails.getDescription();
        this.f16570i = adDetails.getImageUrl();
        this.f16571j = adDetails.getRating();
        this.f16572k = adDetails.isSmartRedirect();
        this.f16573l = adDetails.isStartappBrowserEnabled();
        this.f16574m = null;
        this.f16579r = adDetails.getTemplate();
        this.f16575n = adDetails.getIntentDetails();
        this.f16576o = adDetails.getIntentPackageName();
        this.f16577p = adDetails.getDelayImpressionInSeconds();
        this.f16578q = adDetails.shouldSendRedirectHops();
    }

    public ListItem(Parcel parcel) {
        this.f16562a = "";
        this.f16563b = "";
        this.f16564c = "";
        this.f16565d = "";
        this.f16566e = "";
        this.f16567f = "";
        this.f16568g = "";
        this.f16569h = "";
        this.f16570i = "";
        this.f16571j = 0.0f;
        boolean z = false;
        this.f16572k = false;
        this.f16573l = true;
        this.f16574m = null;
        this.f16578q = null;
        this.f16579r = "";
        if (parcel.readInt() == 1) {
            this.f16574m = new BitmapDrawable((Bitmap) Bitmap.CREATOR.createFromParcel(parcel));
        } else {
            this.f16574m = null;
        }
        this.f16562a = parcel.readString();
        this.f16563b = parcel.readString();
        this.f16564c = parcel.readString();
        this.f16565d = parcel.readString();
        this.f16566e = parcel.readString();
        this.f16567f = parcel.readString();
        this.f16568g = parcel.readString();
        this.f16569h = parcel.readString();
        this.f16570i = parcel.readString();
        this.f16571j = parcel.readFloat();
        if (parcel.readInt() == 1) {
            this.f16572k = true;
        } else {
            this.f16572k = false;
        }
        if (parcel.readInt() == 0) {
            this.f16573l = false;
        } else {
            this.f16573l = true;
        }
        this.f16579r = parcel.readString();
        this.f16576o = parcel.readString();
        this.f16575n = parcel.readString();
        this.f16577p = Long.valueOf(parcel.readLong());
        if (this.f16577p.longValue() == -1) {
            this.f16577p = null;
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            this.f16578q = null;
            return;
        }
        if (readInt == 1) {
            z = true;
        }
        this.f16578q = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public String mo18989a() {
        return this.f16562a;
    }

    /* renamed from: b */
    public String mo18990b() {
        return this.f16563b;
    }

    /* renamed from: c */
    public String mo18991c() {
        return this.f16564c;
    }

    /* renamed from: d */
    public String mo18992d() {
        return this.f16566e;
    }

    /* renamed from: e */
    public String mo18994e() {
        return this.f16565d;
    }

    /* renamed from: f */
    public String mo18995f() {
        return this.f16567f;
    }

    /* renamed from: g */
    public String mo18996g() {
        return this.f16568g;
    }

    /* renamed from: h */
    public String mo18997h() {
        return this.f16569h;
    }

    /* renamed from: i */
    public String mo18998i() {
        return this.f16570i;
    }

    /* renamed from: j */
    public Drawable mo18999j() {
        return this.f16574m;
    }

    /* renamed from: k */
    public float mo19000k() {
        return this.f16571j;
    }

    /* renamed from: l */
    public boolean mo19001l() {
        return this.f16572k;
    }

    /* renamed from: m */
    public boolean mo19002m() {
        return this.f16573l;
    }

    /* renamed from: n */
    public String mo19003n() {
        return this.f16579r;
    }

    /* renamed from: o */
    public String mo19004o() {
        return this.f16575n;
    }

    /* renamed from: p */
    public String mo19005p() {
        return this.f16576o;
    }

    /* renamed from: q */
    public boolean mo19006q() {
        return this.f16576o != null;
    }

    /* renamed from: r */
    public Long mo19007r() {
        return this.f16577p;
    }

    /* renamed from: s */
    public Boolean mo19008s() {
        return this.f16578q;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        if (mo18999j() != null) {
            parcel.writeParcelable(((BitmapDrawable) mo18999j()).getBitmap(), i);
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f16562a);
        parcel.writeString(this.f16563b);
        parcel.writeString(this.f16564c);
        parcel.writeString(this.f16565d);
        parcel.writeString(this.f16566e);
        parcel.writeString(this.f16567f);
        parcel.writeString(this.f16568g);
        parcel.writeString(this.f16569h);
        parcel.writeString(this.f16570i);
        parcel.writeFloat(this.f16571j);
        parcel.writeInt(this.f16572k ? 1 : 0);
        parcel.writeInt(this.f16573l ? 1 : 0);
        parcel.writeString(this.f16579r);
        parcel.writeString(this.f16576o);
        parcel.writeString(this.f16575n);
        if (this.f16577p == null) {
            parcel.writeLong(-1);
        } else {
            parcel.writeLong(this.f16577p.longValue());
        }
        if (this.f16578q == null) {
            parcel.writeInt(0);
            return;
        }
        if (!this.f16578q.booleanValue()) {
            i2 = -1;
        }
        parcel.writeInt(i2);
    }
}
