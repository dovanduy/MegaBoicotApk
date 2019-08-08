package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.util.C3552d;
import com.google.android.gms.common.util.C3566r;

@TargetApi(17)
/* renamed from: com.google.android.gms.internal.ads.jz */
public class C3921jz extends C3924kb {
    /* renamed from: a */
    public final Drawable mo15534a(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    /* renamed from: a */
    public final String mo15537a(Context context) {
        C3968ls a = C3968ls.m17353a();
        if (TextUtils.isEmpty(a.f13519a)) {
            a.f13519a = (String) (C3552d.m12729a() ? C3966lq.m17350a(context, new C3969lt(a, context)) : C3966lq.m17350a(context, new C3970lu(a, C3415h.m12287e(context), context)));
        }
        return a.f13519a;
    }

    /* renamed from: a */
    public final boolean mo15543a(Context context, WebSettings webSettings) {
        super.mo15543a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    /* renamed from: b */
    public final void mo15547b(Context context) {
        C3968ls a = C3968ls.m17353a();
        C3900je.m17043a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a.f13519a)) {
            Context e = C3415h.m12287e(context);
            if (C3552d.m12729a() || e == null) {
                Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (e == null) {
                    putString.apply();
                } else {
                    C3566r.m12778a(context, putString, "admob_user_agent");
                }
            }
            a.f13519a = defaultUserAgent;
        }
        C3900je.m17043a("User agent is updated.");
    }
}
