package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.C2579j;
import com.facebook.C2757u;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2547o;
import com.facebook.internal.C2553p;
import com.facebook.internal.C2553p.C2555a;
import com.facebook.internal.C2553p.C2556b;
import com.facebook.internal.C2557q;
import com.facebook.internal.C2563u;
import com.facebook.login.C2622i.C2623a;
import com.facebook.login.C2622i.C2624b;
import com.facebook.login.C2622i.C2629g;
import com.google.android.exoplayer2.C2793C;

public class ProfilePictureView extends FrameLayout {

    /* renamed from: a */
    public static final String f8203a = "ProfilePictureView";

    /* renamed from: b */
    private String f8204b;

    /* renamed from: c */
    private int f8205c = 0;

    /* renamed from: d */
    private int f8206d = 0;

    /* renamed from: e */
    private boolean f8207e = true;

    /* renamed from: f */
    private Bitmap f8208f;

    /* renamed from: g */
    private ImageView f8209g;

    /* renamed from: h */
    private int f8210h = -1;

    /* renamed from: i */
    private C2553p f8211i;

    /* renamed from: j */
    private C2642a f8212j;

    /* renamed from: k */
    private Bitmap f8213k = null;

    /* renamed from: com.facebook.login.widget.ProfilePictureView$a */
    public interface C2642a {
        /* renamed from: a */
        void mo9321a(C2579j jVar);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10092a(context);
        m10093a(attributeSet);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10092a(context);
        m10093a(attributeSet);
    }

    public final int getPresetSize() {
        return this.f8210h;
    }

    public final void setPresetSize(int i) {
        switch (i) {
            case C2793C.RESULT_BUFFER_READ /*-4*/:
            case -3:
            case -2:
            case -1:
                this.f8210h = i;
                requestLayout();
                return;
            default:
                throw new IllegalArgumentException("Must use a predefined preset size");
        }
    }

    /* renamed from: a */
    public final boolean mo9307a() {
        return this.f8207e;
    }

    public final void setCropped(boolean z) {
        this.f8207e = z;
        m10096a(false);
    }

    public final String getProfileId() {
        return this.f8204b;
    }

    public final void setProfileId(String str) {
        boolean z;
        if (C2479ad.m9456a(this.f8204b) || !this.f8204b.equalsIgnoreCase(str)) {
            m10097b();
            z = true;
        } else {
            z = false;
        }
        this.f8204b = str;
        m10096a(z);
    }

    public final C2642a getOnErrorListener() {
        return this.f8212j;
    }

    public final void setOnErrorListener(C2642a aVar) {
        this.f8212j = aVar;
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.f8213k = bitmap;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        LayoutParams layoutParams = getLayoutParams();
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i2) == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = m10099c(true);
            i2 = MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (MeasureSpec.getMode(i) != 1073741824 && layoutParams.width == -2) {
            size2 = m10099c(true);
            i = MeasureSpec.makeMeasureSpec(size2, 1073741824);
            z = true;
        }
        if (z) {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m10096a(false);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", onSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.f8204b);
        bundle.putInt("ProfilePictureView_presetSize", this.f8210h);
        bundle.putBoolean("ProfilePictureView_isCropped", this.f8207e);
        bundle.putInt("ProfilePictureView_width", this.f8206d);
        bundle.putInt("ProfilePictureView_height", this.f8205c);
        bundle.putBoolean("ProfilePictureView_refresh", this.f8211i != null);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.f8204b = bundle.getString("ProfilePictureView_profileId");
        this.f8210h = bundle.getInt("ProfilePictureView_presetSize");
        this.f8207e = bundle.getBoolean("ProfilePictureView_isCropped");
        this.f8206d = bundle.getInt("ProfilePictureView_width");
        this.f8205c = bundle.getInt("ProfilePictureView_height");
        m10096a(true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8211i = null;
    }

    /* renamed from: a */
    private void m10092a(Context context) {
        removeAllViews();
        this.f8209g = new ImageView(context);
        this.f8209g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f8209g.setScaleType(ScaleType.CENTER_INSIDE);
        addView(this.f8209g);
    }

    /* renamed from: a */
    private void m10093a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2629g.com_facebook_profile_picture_view);
        setPresetSize(obtainStyledAttributes.getInt(C2629g.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
        this.f8207e = obtainStyledAttributes.getBoolean(C2629g.com_facebook_profile_picture_view_com_facebook_is_cropped, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m10096a(boolean z) {
        boolean c = m10100c();
        if (this.f8204b == null || this.f8204b.length() == 0 || (this.f8206d == 0 && this.f8205c == 0)) {
            m10097b();
        } else if (c || z) {
            m10098b(true);
        }
    }

    /* renamed from: b */
    private void m10097b() {
        if (this.f8211i != null) {
            C2547o.m9688b(this.f8211i);
        }
        if (this.f8213k == null) {
            setImageBitmap(BitmapFactory.decodeResource(getResources(), mo9307a() ? C2624b.com_facebook_profile_picture_blank_square : C2624b.com_facebook_profile_picture_blank_portrait));
            return;
        }
        m10100c();
        setImageBitmap(Bitmap.createScaledBitmap(this.f8213k, this.f8206d, this.f8205c, false));
    }

    private void setImageBitmap(Bitmap bitmap) {
        if (this.f8209g != null && bitmap != null) {
            this.f8208f = bitmap;
            this.f8209g.setImageBitmap(bitmap);
        }
    }

    /* renamed from: b */
    private void m10098b(boolean z) {
        C2553p a = new C2555a(getContext(), C2553p.m9689a(this.f8204b, this.f8206d, this.f8205c)).mo9061a(z).mo9060a((Object) this).mo9059a((C2556b) new C2556b() {
            /* renamed from: a */
            public void mo9063a(C2557q qVar) {
                ProfilePictureView.this.m10094a(qVar);
            }
        }).mo9062a();
        if (this.f8211i != null) {
            C2547o.m9688b(this.f8211i);
        }
        this.f8211i = a;
        C2547o.m9682a(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10094a(C2557q qVar) {
        if (qVar.mo9064a() == this.f8211i) {
            this.f8211i = null;
            Bitmap c = qVar.mo9066c();
            Exception b = qVar.mo9065b();
            if (b != null) {
                C2642a aVar = this.f8212j;
                if (aVar != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error in downloading profile picture for profileId: ");
                    sb.append(getProfileId());
                    aVar.mo9321a(new C2579j(sb.toString(), (Throwable) b));
                    return;
                }
                C2563u.m9719a(C2757u.REQUESTS, 6, f8203a, b.toString());
            } else if (c != null) {
                setImageBitmap(c);
                if (qVar.mo9067d()) {
                    m10098b(false);
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m10100c() {
        int height = getHeight();
        int width = getWidth();
        boolean z = true;
        if (width < 1 || height < 1) {
            return false;
        }
        int c = m10099c(false);
        if (c != 0) {
            height = c;
            width = height;
        }
        if (width <= height) {
            height = mo9307a() ? width : 0;
        } else {
            width = mo9307a() ? height : 0;
        }
        if (width == this.f8206d && height == this.f8205c) {
            z = false;
        }
        this.f8206d = width;
        this.f8205c = height;
        return z;
    }

    /* renamed from: c */
    private int m10099c(boolean z) {
        int i;
        switch (this.f8210h) {
            case C2793C.RESULT_BUFFER_READ /*-4*/:
                i = C2623a.com_facebook_profilepictureview_preset_size_large;
                break;
            case -3:
                i = C2623a.com_facebook_profilepictureview_preset_size_normal;
                break;
            case -2:
                i = C2623a.com_facebook_profilepictureview_preset_size_small;
                break;
            case -1:
                if (z) {
                    i = C2623a.com_facebook_profilepictureview_preset_size_normal;
                    break;
                } else {
                    return 0;
                }
            default:
                return 0;
        }
        return getResources().getDimensionPixelSize(i);
    }
}
