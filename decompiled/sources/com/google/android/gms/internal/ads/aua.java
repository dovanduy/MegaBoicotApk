package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3718cm
public final class aua extends aus implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    static final String[] f12250a = {"2011", "1009", "3010"};

    /* renamed from: b */
    private final Object f12251b = new Object();

    /* renamed from: c */
    private final WeakReference<View> f12252c;

    /* renamed from: d */
    private final Map<String, WeakReference<View>> f12253d = new HashMap();

    /* renamed from: e */
    private final Map<String, WeakReference<View>> f12254e = new HashMap();

    /* renamed from: f */
    private final Map<String, WeakReference<View>> f12255f = new HashMap();
    @GuardedBy("mLock")

    /* renamed from: g */
    private atk f12256g;

    /* renamed from: h */
    private View f12257h;

    /* renamed from: i */
    private Point f12258i = new Point();

    /* renamed from: j */
    private Point f12259j = new Point();

    /* renamed from: k */
    private WeakReference<akg> f12260k = new WeakReference<>(null);

    public aua(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        C3025aw.m10907A();
        C4027nx.m17491a(view, (OnGlobalLayoutListener) this);
        C3025aw.m10907A();
        C4027nx.m17492a(view, (OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.f12252c = new WeakReference<>(view);
        for (Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f12253d.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f12255f.putAll(this.f12253d);
        for (Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f12254e.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
            }
        }
        this.f12255f.putAll(this.f12254e);
        aru.m15024a(view.getContext());
    }

    /* renamed from: a */
    private final int m15337a(int i) {
        int b;
        synchronized (this.f12251b) {
            aoq.m14615a();
            b = C3975lz.m17379b(this.f12256g.mo14859m(), i);
        }
        return b;
    }

    /* renamed from: a */
    private final void m15338a(View view) {
        synchronized (this.f12251b) {
            if (this.f12256g != null) {
                atk f = this.f12256g instanceof atj ? ((atj) this.f12256g).mo14843f() : this.f12256g;
                if (f != null) {
                    f.mo14856c(view);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m15339a(com.google.android.gms.internal.ads.atp r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f12251b
            monitor-enter(r0)
            java.lang.String[] r1 = f12250a     // Catch:{ all -> 0x003b }
            int r2 = r1.length     // Catch:{ all -> 0x003b }
            r3 = 0
        L_0x0007:
            if (r3 >= r2) goto L_0x001f
            r4 = r1[r3]     // Catch:{ all -> 0x003b }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r6.f12255f     // Catch:{ all -> 0x003b }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x003b }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x001c
            java.lang.Object r1 = r4.get()     // Catch:{ all -> 0x003b }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x003b }
            goto L_0x0020
        L_0x001c:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x001f:
            r1 = 0
        L_0x0020:
            boolean r2 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x0029
            r7.mo14846i()     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x0029:
            com.google.android.gms.internal.ads.auc r2 = new com.google.android.gms.internal.ads.auc     // Catch:{ all -> 0x003b }
            r2.<init>(r6, r1)     // Catch:{ all -> 0x003b }
            boolean r3 = r7 instanceof com.google.android.gms.internal.ads.atj     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0036
            r7.mo14866b(r1, r2)     // Catch:{ all -> 0x003b }
            goto L_0x0039
        L_0x0036:
            r7.mo14850a(r1, r2)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aua.m15339a(com.google.android.gms.internal.ads.atp):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m15342a(String[] strArr) {
        for (String str : strArr) {
            if (this.f12253d.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (this.f12254e.get(str2) != null) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo14876a() {
        synchronized (this.f12251b) {
            this.f12257h = null;
            this.f12256g = null;
            this.f12258i = null;
            this.f12259j = null;
        }
    }

    /* renamed from: a */
    public final void mo14877a(C3235a aVar) {
        int i;
        View view;
        synchronized (this.f12251b) {
            ViewGroup viewGroup = null;
            m15338a((View) null);
            Object a = C3238b.m11574a(aVar);
            if (!(a instanceof atp)) {
                C3900je.m17435e("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            atp atp = (atp) a;
            if (!atp.mo14839b()) {
                C3900je.m17431c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view2 = (View) this.f12252c.get();
            if (!(this.f12256g == null || view2 == null)) {
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11854bZ)).booleanValue()) {
                    this.f12256g.mo14838b(view2, this.f12255f);
                }
            }
            synchronized (this.f12251b) {
                i = 0;
                if (this.f12256g instanceof atp) {
                    atp atp2 = (atp) this.f12256g;
                    View view3 = (View) this.f12252c.get();
                    if (!(atp2 == null || atp2.mo14859m() == null || view3 == null || !C3025aw.m10908B().mo15392c(view3.getContext()))) {
                        C3866hy n = atp2.mo14868n();
                        if (n != null) {
                            n.mo15384a(false);
                        }
                        akg akg = (akg) this.f12260k.get();
                        if (!(akg == null || n == null)) {
                            akg.mo14417b((akk) n);
                        }
                    }
                }
            }
            if (!(this.f12256g instanceof atj) || !((atj) this.f12256g).mo14842e()) {
                this.f12256g = atp;
                if (atp instanceof atj) {
                    ((atj) atp).mo14835a((atk) null);
                }
            } else {
                ((atj) this.f12256g).mo14835a((atk) atp);
            }
            String[] strArr = {"1098", "3011"};
            while (true) {
                if (i >= 2) {
                    view = null;
                    break;
                }
                WeakReference weakReference = (WeakReference) this.f12255f.get(strArr[i]);
                if (weakReference != null) {
                    view = (View) weakReference.get();
                    break;
                }
                i++;
            }
            if (view == null) {
                C3900je.m17435e("Ad choices asset view is not provided.");
            } else {
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                }
                if (viewGroup != null) {
                    this.f12257h = atp.mo14830a((OnClickListener) this, true);
                    if (this.f12257h != null) {
                        this.f12255f.put("1007", new WeakReference(this.f12257h));
                        this.f12253d.put("1007", new WeakReference(this.f12257h));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.f12257h);
                    }
                }
            }
            atp.mo14834a(view2, this.f12253d, this.f12254e, (OnTouchListener) this, (OnClickListener) this);
            C3909jn.f13411a.post(new aub(this, atp));
            m15338a(view2);
            this.f12256g.mo14854b(view2);
            synchronized (this.f12251b) {
                if (this.f12256g instanceof atp) {
                    atp atp3 = (atp) this.f12256g;
                    View view4 = (View) this.f12252c.get();
                    if (!(atp3 == null || atp3.mo14859m() == null || view4 == null || !C3025aw.m10908B().mo15392c(view4.getContext()))) {
                        akg akg2 = (akg) this.f12260k.get();
                        if (akg2 == null) {
                            akg2 = new akg(view4.getContext(), view4);
                            this.f12260k = new WeakReference<>(akg2);
                        }
                        akg2.mo14416a((akk) atp3.mo14868n());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo14878b(C3235a aVar) {
        synchronized (this.f12251b) {
            this.f12256g.mo14831a((View) C3238b.m11574a(aVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f12251b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.atk r1 = r8.f12256g     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0009:
            java.lang.ref.WeakReference<android.view.View> r1 = r8.f12252c     // Catch:{ all -> 0x0090 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0090 }
            r7 = r1
            android.view.View r7 = (android.view.View) r7     // Catch:{ all -> 0x0090 }
            if (r7 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0016:
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0090 }
            r5.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r8.f12258i     // Catch:{ all -> 0x0090 }
            int r2 = r2.x     // Catch:{ all -> 0x0090 }
            int r2 = r8.m15337a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r8.f12258i     // Catch:{ all -> 0x0090 }
            int r2 = r2.y     // Catch:{ all -> 0x0090 }
            int r2 = r8.m15337a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r8.f12259j     // Catch:{ all -> 0x0090 }
            int r2 = r2.x     // Catch:{ all -> 0x0090 }
            int r2 = r8.m15337a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r8.f12259j     // Catch:{ all -> 0x0090 }
            int r2 = r2.y     // Catch:{ all -> 0x0090 }
            int r2 = r8.m15337a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            android.view.View r1 = r8.f12257h     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0087
            android.view.View r1 = r8.f12257h     // Catch:{ all -> 0x0090 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.atk r1 = r8.f12256g     // Catch:{ all -> 0x0090 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.atj     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.atk r1 = r8.f12256g     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.atj r1 = (com.google.android.gms.internal.ads.atj) r1     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.atk r1 = r1.mo14843f()     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x008e
            com.google.android.gms.internal.ads.atk r1 = r8.f12256g     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.atj r1 = (com.google.android.gms.internal.ads.atj) r1     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.atk r2 = r1.mo14843f()     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f12255f     // Catch:{ all -> 0x0090 }
        L_0x007b:
            r3 = r9
            r2.mo14851a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0090 }
            goto L_0x008e
        L_0x0080:
            com.google.android.gms.internal.ads.atk r2 = r8.f12256g     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f12255f     // Catch:{ all -> 0x0090 }
            goto L_0x007b
        L_0x0087:
            com.google.android.gms.internal.ads.atk r1 = r8.f12256g     // Catch:{ all -> 0x0090 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r8.f12255f     // Catch:{ all -> 0x0090 }
            r1.mo14833a(r9, r2, r5, r7)     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0090:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aua.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.f12251b) {
            if (this.f12256g != null) {
                View view = (View) this.f12252c.get();
                if (view != null) {
                    this.f12256g.mo14857c(view, this.f12255f);
                }
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f12251b) {
            if (this.f12256g != null) {
                View view = (View) this.f12252c.get();
                if (view != null) {
                    this.f12256g.mo14857c(view, this.f12255f);
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f12251b) {
            if (this.f12256g == null) {
                return false;
            }
            View view2 = (View) this.f12252c.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f12258i = point;
            if (motionEvent.getAction() == 0) {
                this.f12259j = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f12256g.mo14849a(obtain);
            obtain.recycle();
            return false;
        }
    }
}
