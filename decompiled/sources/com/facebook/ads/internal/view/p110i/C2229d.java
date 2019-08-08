package com.facebook.ads.internal.view.p110i;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.p110i.p111a.C2118c;
import com.facebook.ads.internal.view.p110i.p113c.C2194g;
import com.facebook.ads.internal.view.p110i.p114d.C2239c;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.i.d */
public class C2229d extends RelativeLayout {

    /* renamed from: a */
    private final C2239c f6993a;

    /* renamed from: b */
    private C2194g f6994b;

    /* renamed from: c */
    private WeakReference<C2230a> f6995c;

    /* renamed from: com.facebook.ads.internal.view.i.d$a */
    public interface C2230a {
        /* renamed from: a */
        void mo7727a();
    }

    public C2229d(Context context, C2239c cVar) {
        super(context);
        this.f6993a = cVar;
        C2342x.m9091b((View) this.f6993a);
        addView(this.f6993a.getView(), new LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo8536a(C2118c cVar) {
        addView(cVar, new LayoutParams(-1, -1));
        this.f6994b = (C2194g) cVar;
    }

    /* renamed from: b */
    public void mo8537b(C2118c cVar) {
        C2342x.m9091b(cVar);
        this.f6994b = null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.f6993a).layout(0, 0, getWidth(), getHeight());
        if (this.f6994b != null) {
            this.f6994b.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r3 > r10) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            com.facebook.ads.internal.view.i.d.c r0 = r8.f6993a
            int r0 = r0.getVideoWidth()
            com.facebook.ads.internal.view.i.d.c r1 = r8.f6993a
            int r1 = r1.getVideoHeight()
            int r2 = getDefaultSize(r0, r9)
            int r3 = getDefaultSize(r1, r10)
            if (r0 <= 0) goto L_0x006a
            if (r1 <= 0) goto L_0x006a
            r2 = 1
            int r3 = android.view.View.MeasureSpec.getMode(r9)
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            int r4 = android.view.View.MeasureSpec.getMode(r10)
            int r10 = android.view.View.MeasureSpec.getSize(r10)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 != r5) goto L_0x003d
            if (r4 != r5) goto L_0x003d
            int r3 = r0 * r10
            int r4 = r9 * r1
            if (r3 >= r4) goto L_0x0038
            int r9 = r3 / r1
            goto L_0x006f
        L_0x0038:
            if (r3 <= r4) goto L_0x006f
            int r3 = r4 / r0
            goto L_0x0049
        L_0x003d:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r5) goto L_0x004b
            int r1 = r1 * r9
            int r3 = r1 / r0
            if (r4 != r6) goto L_0x0049
            if (r3 <= r10) goto L_0x0049
            goto L_0x006f
        L_0x0049:
            r10 = r3
            goto L_0x006f
        L_0x004b:
            if (r4 != r5) goto L_0x0056
            int r0 = r0 * r10
            int r0 = r0 / r1
            if (r3 != r6) goto L_0x0054
            if (r0 <= r9) goto L_0x0054
            goto L_0x006f
        L_0x0054:
            r9 = r0
            goto L_0x006f
        L_0x0056:
            if (r4 != r6) goto L_0x005e
            if (r1 <= r10) goto L_0x005e
            int r4 = r10 * r0
            int r4 = r4 / r1
            goto L_0x0060
        L_0x005e:
            r4 = r0
            r10 = r1
        L_0x0060:
            if (r3 != r6) goto L_0x0068
            if (r4 <= r9) goto L_0x0068
            int r1 = r1 * r9
            int r3 = r1 / r0
            goto L_0x0049
        L_0x0068:
            r9 = r4
            goto L_0x006f
        L_0x006a:
            r9 = 0
            r10 = r3
            r7 = r2
            r2 = r9
            r9 = r7
        L_0x006f:
            r8.setMeasuredDimension(r9, r10)
            if (r2 == 0) goto L_0x008b
            java.lang.ref.WeakReference<com.facebook.ads.internal.view.i.d$a> r9 = r8.f6995c
            if (r9 == 0) goto L_0x008b
            java.lang.ref.WeakReference<com.facebook.ads.internal.view.i.d$a> r9 = r8.f6995c
            java.lang.Object r9 = r9.get()
            if (r9 == 0) goto L_0x008b
            java.lang.ref.WeakReference<com.facebook.ads.internal.view.i.d$a> r9 = r8.f6995c
            java.lang.Object r9 = r9.get()
            com.facebook.ads.internal.view.i.d$a r9 = (com.facebook.ads.internal.view.p110i.C2229d.C2230a) r9
            r9.mo7727a()
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.p110i.C2229d.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(C2230a aVar) {
        this.f6995c = new WeakReference<>(aVar);
    }
}
