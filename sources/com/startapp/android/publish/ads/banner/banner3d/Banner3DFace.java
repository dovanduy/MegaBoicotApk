package com.startapp.android.publish.ads.banner.banner3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.C5402i;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5499a;
import com.startapp.common.C5499a.C5502a;
import com.startapp.common.p193a.C5518g;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: StartAppSDK */
public class Banner3DFace implements Parcelable, C5502a {
    public static final Creator<Banner3DFace> CREATOR = new Creator<Banner3DFace>() {
        /* renamed from: a */
        public Banner3DFace createFromParcel(Parcel parcel) {
            return new Banner3DFace(parcel);
        }

        /* renamed from: a */
        public Banner3DFace[] newArray(int i) {
            return new Banner3DFace[i];
        }
    };

    /* renamed from: a */
    private AdDetails f16487a;

    /* renamed from: b */
    private Point f16488b;

    /* renamed from: c */
    private Bitmap f16489c = null;

    /* renamed from: d */
    private Bitmap f16490d = null;

    /* renamed from: e */
    private AtomicBoolean f16491e = new AtomicBoolean(false);

    /* renamed from: f */
    private C5363b f16492f;

    /* renamed from: g */
    private C5402i f16493g = null;

    /* renamed from: h */
    private C5120b f16494h = null;

    public int describeContents() {
        return 0;
    }

    public Banner3DFace(Context context, ViewGroup viewGroup, AdDetails adDetails, BannerOptions bannerOptions, C5363b bVar) {
        this.f16487a = adDetails;
        this.f16492f = bVar;
        mo18880a(context, bannerOptions, viewGroup);
    }

    /* renamed from: a */
    public AdDetails mo18879a() {
        return this.f16487a;
    }

    /* renamed from: b */
    public Bitmap mo18882b() {
        return this.f16490d;
    }

    /* renamed from: a */
    public void mo18880a(Context context, BannerOptions bannerOptions, ViewGroup viewGroup) {
        int a = C5306h.m22641a(context, bannerOptions.mo18827e() - 5);
        this.f16488b = new Point((int) (((float) C5306h.m22641a(context, bannerOptions.mo18826d())) * bannerOptions.mo18834j()), (int) (((float) C5306h.m22641a(context, bannerOptions.mo18827e())) * bannerOptions.mo18835k()));
        this.f16494h = new C5120b(context, new Point(bannerOptions.mo18826d(), bannerOptions.mo18827e()));
        this.f16494h.setText(mo18879a().getTitle());
        this.f16494h.setRating(mo18879a().getRating());
        this.f16494h.setDescription(mo18879a().getDescription());
        this.f16494h.setButtonText(this.f16487a.isCPE());
        if (this.f16489c != null) {
            this.f16494h.mo18898a(this.f16489c, a, a);
        } else {
            this.f16494h.mo18897a(17301651, a, a);
            new C5499a(mo18879a().getImageUrl(), this, 0).mo20469a();
            StringBuilder sb = new StringBuilder();
            sb.append(" Banner Face Image Async Request: [");
            sb.append(mo18879a().getTitle());
            sb.append("]");
            C5518g.m23563a("Banner3DFace", 3, sb.toString());
        }
        LayoutParams layoutParams = new LayoutParams(this.f16488b.x, this.f16488b.y);
        layoutParams.addRule(13);
        viewGroup.addView(this.f16494h, layoutParams);
        this.f16494h.setVisibility(8);
        m22037f();
    }

    /* renamed from: f */
    private void m22037f() {
        this.f16490d = m22035a((View) this.f16494h);
        if (this.f16488b.x > 0 && this.f16488b.y > 0) {
            this.f16490d = Bitmap.createScaledBitmap(this.f16490d, this.f16488b.x, this.f16488b.y, false);
        }
    }

    /* renamed from: a */
    private Bitmap m22035a(View view) {
        view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public void mo18881a(Bitmap bitmap, int i) {
        if (bitmap != null && this.f16494h != null) {
            this.f16489c = bitmap;
            this.f16494h.setImage(bitmap);
            m22037f();
        }
    }

    /* renamed from: a */
    public C5402i mo18878a(Context context) {
        if (mo18879a().getTrackingUrl() == null || !this.f16491e.compareAndSet(false, true)) {
            return null;
        }
        Context context2 = context;
        C5402i iVar = new C5402i(context2, new String[]{mo18879a().getTrackingUrl()}, this.f16492f, m22038g());
        this.f16493g = iVar;
        return this.f16493g;
    }

    /* renamed from: c */
    public void mo18884c() {
        if (this.f16493g != null) {
            this.f16493g.mo19950a(false);
        }
    }

    /* renamed from: b */
    public void mo18883b(Context context) {
        String intentPackageName = mo18879a().getIntentPackageName();
        boolean a = C5349c.m22870a(context, Placement.INAPP_BANNER);
        boolean z = true;
        if (this.f16493g != null) {
            this.f16493g.mo19950a(true);
        }
        if (intentPackageName != null && !"null".equals(intentPackageName) && !TextUtils.isEmpty(intentPackageName)) {
            C5349c.m22866a(intentPackageName, mo18879a().getIntentDetails(), mo18879a().getClickUrl(), context, this.f16492f);
        } else if (!mo18879a().isSmartRedirect() || a) {
            String clickUrl = mo18879a().getClickUrl();
            String trackingClickUrl = mo18879a().getTrackingClickUrl();
            C5363b bVar = this.f16492f;
            if (!mo18879a().isStartappBrowserEnabled() || a) {
                z = false;
            }
            C5349c.m22857a(context, clickUrl, trackingClickUrl, bVar, z, false);
        } else {
            C5349c.m22859a(context, mo18879a().getClickUrl(), mo18879a().getTrackingClickUrl(), mo18879a().getPackageName(), this.f16492f, C5344b.m22784a().mo19749A(), C5344b.m22784a().mo19750B(), mo18879a().isStartappBrowserEnabled(), mo18879a().shouldSendRedirectHops(), false);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo18879a(), i);
        parcel.writeInt(this.f16488b.x);
        parcel.writeInt(this.f16488b.y);
        parcel.writeParcelable(this.f16489c, i);
        parcel.writeBooleanArray(new boolean[]{this.f16491e.get()});
        parcel.writeSerializable(this.f16492f);
    }

    public Banner3DFace(Parcel parcel) {
        this.f16487a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        this.f16488b = new Point(1, 1);
        this.f16488b.x = parcel.readInt();
        this.f16488b.y = parcel.readInt();
        this.f16489c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f16491e.set(zArr[0]);
        this.f16492f = (C5363b) parcel.readSerializable();
    }

    /* renamed from: d */
    public void mo18885d() {
        m22036a(this.f16489c);
        m22036a(this.f16490d);
        this.f16489c = null;
        this.f16490d = null;
    }

    /* renamed from: e */
    public void mo18887e() {
        mo18885d();
        if (this.f16493g != null) {
            this.f16493g.mo19950a(false);
        }
        if (this.f16494h != null) {
            this.f16494h.removeAllViews();
            this.f16494h = null;
        }
    }

    /* renamed from: a */
    private void m22036a(Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    /* renamed from: g */
    private long m22038g() {
        if (mo18879a().getDelayImpressionInSeconds() != null) {
            return TimeUnit.SECONDS.toMillis(mo18879a().getDelayImpressionInSeconds().longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABDisplayImpressionDelayInSeconds());
    }
}
