package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class agw {

    /* renamed from: e */
    private static final String[] f11027e = {"/aclk", "/pcs/click"};

    /* renamed from: a */
    private String f11028a = "googleads.g.doubleclick.net";

    /* renamed from: b */
    private String f11029b = "/pagead/ads";

    /* renamed from: c */
    private String f11030c = "ad.doubleclick.net";

    /* renamed from: d */
    private String[] f11031d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: f */
    private ags f11032f;

    public agw(ags ags) {
        this.f11032f = ags;
    }

    /* renamed from: a */
    private final Uri m14094a(Uri uri, Context context, String str, boolean z, View view, Activity activity) throws agx {
        try {
            boolean c = m14095c(uri);
            if (c) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new agx("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new agx("Query parameter already exists: ms");
            }
            String a = z ? this.f11032f.mo12626a(context, str, view, activity) : this.f11032f.mo12624a(context);
            if (c) {
                String str2 = "dc_ms";
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    StringBuilder sb = new StringBuilder(uri2.substring(0, i));
                    sb.append(str2);
                    sb.append("=");
                    sb.append(a);
                    sb.append(";");
                    sb.append(uri2.substring(i));
                    return Uri.parse(sb.toString());
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                StringBuilder sb2 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                sb2.append(";");
                sb2.append(str2);
                sb2.append("=");
                sb2.append(a);
                sb2.append(";");
                sb2.append(uri2.substring(indexOf2 + encodedPath.length()));
                return Uri.parse(sb2.toString());
            }
            String str3 = "ms";
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter(str3, a).build();
            }
            int i2 = indexOf3 + 1;
            StringBuilder sb3 = new StringBuilder(uri3.substring(0, i2));
            sb3.append(str3);
            sb3.append("=");
            sb3.append(a);
            sb3.append("&");
            sb3.append(uri3.substring(i2));
            return Uri.parse(sb3.toString());
        } catch (UnsupportedOperationException unused) {
            throw new agx("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: c */
    private final boolean m14095c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f11030c);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final Uri mo14284a(Uri uri, Context context) throws agx {
        return m14094a(uri, context, null, false, null, null);
    }

    /* renamed from: a */
    public final Uri mo14285a(Uri uri, Context context, View view, Activity activity) throws agx {
        try {
            return m14094a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new agx("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    public final ags mo14286a() {
        return this.f11032f;
    }

    /* renamed from: a */
    public final void mo14287a(MotionEvent motionEvent) {
        this.f11032f.mo12628a(motionEvent);
    }

    /* renamed from: a */
    public final boolean mo14288a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.f11031d) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo14289b(Uri uri) {
        if (mo14288a(uri)) {
            for (String endsWith : f11027e) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }
}
