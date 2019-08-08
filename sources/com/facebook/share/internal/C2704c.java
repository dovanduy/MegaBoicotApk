package com.facebook.share.internal;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.C2471g;
import com.facebook.common.C2454a.C2457c;
import com.facebook.common.C2454a.C2460f;
import com.facebook.common.C2454a.C2461g;

@Deprecated
/* renamed from: com.facebook.share.internal.c */
/* compiled from: LikeButton */
public class C2704c extends C2471g {
    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        return 0;
    }

    @Deprecated
    public C2704c(Context context, boolean z) {
        super(context, null, 0, 0, "fb_like_button_create", "fb_like_button_did_tap");
        setSelected(z);
    }

    @Deprecated
    public void setSelected(boolean z) {
        super.setSelected(z);
        m10328a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8889a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo8889a(context, attributeSet, i, i2);
        m10328a();
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return C2461g.com_facebook_button_like;
    }

    /* renamed from: a */
    private void m10328a() {
        if (isSelected()) {
            setCompoundDrawablesWithIntrinsicBounds(C2457c.com_facebook_button_like_icon_selected, 0, 0, 0);
            setText(getResources().getString(C2460f.com_facebook_like_button_liked));
            return;
        }
        setCompoundDrawablesWithIntrinsicBounds(C2457c.com_facebook_button_icon, 0, 0, 0);
        setText(getResources().getString(C2460f.com_facebook_like_button_not_liked));
    }
}
