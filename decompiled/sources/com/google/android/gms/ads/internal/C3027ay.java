package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3930kh;
import com.google.android.gms.internal.ads.C3974ly;
import com.google.android.gms.internal.ads.C4089qe;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.ads.internal.ay */
public final class C3027ay extends ViewSwitcher {

    /* renamed from: a */
    private final C3930kh f8882a;

    /* renamed from: b */
    private final C3974ly f8883b;

    /* renamed from: c */
    private boolean f8884c = true;

    public C3027ay(Context context, String str, String str2, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.f8882a = new C3930kh(context);
        this.f8882a.mo15563a(str);
        this.f8882a.mo15566b(str2);
        if (context instanceof Activity) {
            this.f8883b = new C3974ly((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.f8883b = new C3974ly(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.f8883b.mo15617a();
    }

    /* renamed from: a */
    public final C3930kh mo12532a() {
        return this.f8882a;
    }

    /* renamed from: b */
    public final void mo12533b() {
        C3900je.m17043a("Disable position monitoring on adFrame.");
        if (this.f8883b != null) {
            this.f8883b.mo15619b();
        }
    }

    /* renamed from: c */
    public final void mo12534c() {
        C3900je.m17043a("Enable debug gesture detector on adFrame.");
        this.f8884c = true;
    }

    /* renamed from: d */
    public final void mo12535d() {
        C3900je.m17043a("Disable debug gesture detector on adFrame.");
        this.f8884c = false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8883b != null) {
            this.f8883b.mo15620c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8883b != null) {
            this.f8883b.mo15621d();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f8884c) {
            this.f8882a.mo15562a(motionEvent);
        }
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof C4089qe)) {
                arrayList.add((C4089qe) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((C4089qe) obj).destroy();
        }
    }
}
