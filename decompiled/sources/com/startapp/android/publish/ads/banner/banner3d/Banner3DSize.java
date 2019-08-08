package com.startapp.android.publish.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.appnext.base.p046b.C1245d;
import com.startapp.android.publish.ads.banner.Banner;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.ads.banner.C5145d;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.common.p193a.C5518g;

/* compiled from: StartAppSDK */
public class Banner3DSize {

    /* compiled from: StartAppSDK */
    public enum Size {
        XXSMALL(new C5145d(280, 50)),
        XSMALL(new C5145d(300, 50)),
        SMALL(new C5145d(320, 50)),
        MEDIUM(new C5145d(468, 60)),
        LARGE(new C5145d(728, 90)),
        XLARGE(new C5145d(C1245d.f3947iP, 90));
        
        private C5145d size;

        private Size(C5145d dVar) {
            this.size = dVar;
        }

        public C5145d getSize() {
            return this.size;
        }
    }

    /* renamed from: a */
    public static boolean m22052a(Context context, ViewParent viewParent, BannerOptions bannerOptions, Banner3D banner3D, C5145d dVar) {
        Size[] values;
        C5518g.m23563a("Banner3DSize", 3, "============== Optimize Size ==========");
        C5145d a = m22050a(context, viewParent, bannerOptions, banner3D);
        dVar.mo18958a(a.mo18956a(), a.mo18959b());
        boolean z = false;
        for (Size size : Size.values()) {
            if (size.getSize().mo18956a() <= a.mo18956a() && size.getSize().mo18959b() <= a.mo18959b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("BannerSize [");
                sb.append(size.getSize().mo18956a());
                sb.append(",");
                sb.append(size.getSize().mo18959b());
                sb.append("]");
                C5518g.m23563a("Banner3DSize", 3, sb.toString());
                bannerOptions.mo18823a(size.getSize().mo18956a(), size.getSize().mo18959b());
                z = true;
            }
        }
        if (!z) {
            bannerOptions.mo18823a(0, 0);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("============== Optimize Size [");
        sb2.append(z);
        sb2.append("] ==========");
        C5518g.m23563a("Banner3DSize", 3, sb2.toString());
        return z;
    }

    /* renamed from: a */
    private static C5145d m22050a(Context context, ViewParent viewParent, BannerOptions bannerOptions, Banner3D banner3D) {
        Point point = new Point();
        point.x = bannerOptions.mo18826d();
        point.y = bannerOptions.mo18827e();
        C5518g.m23563a("Banner3DSize", 3, "=============== set Application Size ===========");
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().width > 0) {
            point.x = C5306h.m22650b(context, banner3D.getLayoutParams().width + 1);
        }
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().height > 0) {
            point.y = C5306h.m22650b(context, banner3D.getLayoutParams().height + 1);
        }
        if (banner3D.getLayoutParams() == null || banner3D.getLayoutParams().width <= 0 || banner3D.getLayoutParams().height <= 0) {
            if (context instanceof Activity) {
                C5518g.m23563a("Banner3DSize", 3, "Context is Activity");
                View decorView = ((Activity) context).getWindow().getDecorView();
                try {
                    View view = (View) viewParent;
                    if (view instanceof Banner) {
                        C5518g.m23563a("Banner3DSize", 3, "Parent is instance of Wrapper Banner");
                        view = (View) view.getParent();
                    }
                    boolean z = false;
                    boolean z2 = false;
                    while (view != null && (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0)) {
                        if (view.getMeasuredWidth() > 0 && !z) {
                            m22053b(context, point, view);
                            z = true;
                        }
                        if (view.getMeasuredHeight() > 0 && !z2) {
                            m22051a(context, point, view);
                            z2 = true;
                        }
                        view = (View) view.getParent();
                    }
                    if (view == null) {
                        m22054c(context, point, decorView);
                    } else {
                        if (!z) {
                            m22053b(context, point, view);
                        }
                        if (!z2) {
                            m22051a(context, point, view);
                        }
                    }
                } catch (Exception unused) {
                    m22054c(context, point, decorView);
                    C5518g.m23563a("Banner3DSize", 3, "Exception occoured");
                }
            } else {
                C5518g.m23563a("Banner3DSize", 3, "Context not Activity, get max win size");
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        C5306h.m22647a(context, windowManager, point);
                    }
                } catch (Exception e) {
                    C5378f.m23016a(context, C5376d.EXCEPTION, "Banner3DSize.getApplicationSize - system service failed", e.getMessage(), "");
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("============ exit Application Size [");
        sb.append(point.x);
        sb.append(",");
        sb.append(point.y);
        sb.append("] =========");
        C5518g.m23563a("Banner3DSize", 3, sb.toString());
        return new C5145d(point.x, point.y);
    }

    /* renamed from: a */
    private static void m22051a(Context context, Point point, View view) {
        point.y = C5306h.m22650b(context, (view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop());
    }

    /* renamed from: b */
    private static void m22053b(Context context, Point point, View view) {
        point.x = C5306h.m22650b(context, (view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight());
    }

    /* renamed from: c */
    private static void m22054c(Context context, Point point, View view) {
        point.x = C5306h.m22650b(context, view.getMeasuredWidth());
        point.y = C5306h.m22650b(context, view.getMeasuredHeight());
    }
}
