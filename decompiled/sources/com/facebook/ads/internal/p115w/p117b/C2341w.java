package com.facebook.ads.internal.p115w.p117b;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.InputDevice;
import android.view.InputDevice.MotionRange;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.p091r.C1795a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.w.b.w */
public class C2341w {

    /* renamed from: a */
    private static final String f7349a = "w";

    /* renamed from: b */
    private boolean f7350b;

    /* renamed from: c */
    private int f7351c = -1;

    /* renamed from: d */
    private int f7352d = -1;

    /* renamed from: e */
    private int f7353e = -1;

    /* renamed from: f */
    private int f7354f = -1;

    /* renamed from: g */
    private long f7355g = -1;

    /* renamed from: h */
    private int f7356h = -1;

    /* renamed from: i */
    private long f7357i = -1;

    /* renamed from: j */
    private long f7358j = -1;

    /* renamed from: k */
    private int f7359k = -1;

    /* renamed from: l */
    private int f7360l = -1;

    /* renamed from: m */
    private int f7361m = -1;

    /* renamed from: n */
    private int f7362n = -1;

    /* renamed from: o */
    private float f7363o = -1.0f;

    /* renamed from: p */
    private float f7364p = -1.0f;

    /* renamed from: q */
    private float f7365q = -1.0f;

    /* renamed from: r */
    private View f7366r;

    /* renamed from: s */
    private View f7367s;

    /* renamed from: a */
    public void mo8737a() {
        this.f7355g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo8738a(MotionEvent motionEvent, View view, View view2) {
        if (!this.f7350b) {
            this.f7350b = true;
            InputDevice device = motionEvent.getDevice();
            if (device != null) {
                MotionRange motionRange = device.getMotionRange(0);
                MotionRange motionRange2 = device.getMotionRange(1);
                if (!(motionRange == null || motionRange2 == null)) {
                    this.f7365q = Math.min(motionRange.getRange(), motionRange2.getRange());
                }
            }
            if (this.f7365q <= 0.0f) {
                this.f7365q = (float) Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationInWindow(iArr2);
        switch (motionEvent.getAction()) {
            case 0:
                this.f7351c = (int) (((float) iArr[0]) / C2342x.f7369b);
                this.f7352d = (int) (((float) iArr[1]) / C2342x.f7369b);
                this.f7353e = (int) (((float) view.getWidth()) / C2342x.f7369b);
                this.f7354f = (int) (((float) view.getHeight()) / C2342x.f7369b);
                this.f7356h = 1;
                this.f7357i = System.currentTimeMillis();
                this.f7359k = (int) (((float) ((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0])) / C2342x.f7369b);
                this.f7360l = (int) (((float) ((((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1])) / C2342x.f7369b);
                this.f7363o = motionEvent.getPressure();
                this.f7364p = motionEvent.getSize();
                this.f7366r = view2;
                return;
            case 1:
            case 3:
                this.f7358j = System.currentTimeMillis();
                this.f7361m = (int) (((float) ((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0])) / C2342x.f7369b);
                this.f7362n = (int) (((float) ((((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1])) / C2342x.f7369b);
                this.f7367s = view2;
                return;
            case 2:
                this.f7363o -= this.f7363o / ((float) this.f7356h);
                this.f7363o += motionEvent.getPressure() / ((float) this.f7356h);
                this.f7364p -= this.f7364p / ((float) this.f7356h);
                this.f7364p += motionEvent.getSize() / ((float) this.f7356h);
                this.f7356h++;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public boolean mo8739a(Context context) {
        int d = C1795a.m7445d(context);
        return d >= 0 && mo8741c() < ((long) d);
    }

    /* renamed from: b */
    public boolean mo8740b() {
        return this.f7355g != -1;
    }

    /* renamed from: c */
    public long mo8741c() {
        if (mo8740b()) {
            return System.currentTimeMillis() - this.f7355g;
        }
        return -1;
    }

    /* renamed from: d */
    public boolean mo8742d() {
        return this.f7350b;
    }

    /* renamed from: e */
    public Map<String, String> mo8743e() {
        C2322j jVar;
        if (!this.f7350b) {
            return null;
        }
        String valueOf = String.valueOf((this.f7364p * this.f7365q) / 2.0f);
        long j = (this.f7355g <= 0 || this.f7358j <= this.f7355g) ? -1 : this.f7358j - this.f7355g;
        HashMap hashMap = new HashMap();
        hashMap.put("adPositionX", String.valueOf(this.f7351c));
        hashMap.put("adPositionY", String.valueOf(this.f7352d));
        hashMap.put("width", String.valueOf(this.f7353e));
        hashMap.put("height", String.valueOf(this.f7354f));
        hashMap.put("clickDelayTime", String.valueOf(j));
        hashMap.put("startTime", String.valueOf(this.f7357i));
        hashMap.put("endTime", String.valueOf(this.f7358j));
        hashMap.put("startX", String.valueOf(this.f7359k));
        hashMap.put("startY", String.valueOf(this.f7360l));
        hashMap.put("clickX", String.valueOf(this.f7361m));
        hashMap.put("clickY", String.valueOf(this.f7362n));
        hashMap.put("endX", String.valueOf(this.f7361m));
        hashMap.put("endY", String.valueOf(this.f7362n));
        hashMap.put("force", String.valueOf(this.f7363o));
        hashMap.put("radiusX", valueOf);
        hashMap.put("radiusY", valueOf);
        String str = "clickedViewTag";
        if (this.f7366r == null || this.f7367s == null) {
            jVar = C2322j.INTERNAL_NULL_VIEW;
        } else if (this.f7366r != this.f7367s) {
            jVar = C2322j.INTERNAL_NO_CLICK;
        } else if (VERSION.SDK_INT < 4) {
            jVar = C2322j.INTERNAL_API_TOO_LOW;
        } else {
            Object tag = this.f7366r.getTag(C2322j.f7311p);
            jVar = tag == null ? C2322j.INTERNAL_NO_TAG : !(tag instanceof C2322j) ? C2322j.INTERNAL_WRONG_TAG_CLASS : (C2322j) tag;
        }
        hashMap.put(str, String.valueOf(jVar.mo8724a()));
        return hashMap;
    }
}
