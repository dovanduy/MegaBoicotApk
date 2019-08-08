package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.C3000i;
import com.google.android.gms.ads.formats.C2990f;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.p137b.C3238b;
import java.util.WeakHashMap;

@C3718cm
public final class avh implements C2990f {

    /* renamed from: a */
    private static WeakHashMap<IBinder, avh> f12284a = new WeakHashMap<>();

    /* renamed from: b */
    private final ave f12285b;

    /* renamed from: c */
    private final MediaView f12286c;

    /* renamed from: d */
    private final C3000i f12287d = new C3000i();

    private avh(ave ave) {
        Context context;
        this.f12285b = ave;
        MediaView mediaView = null;
        try {
            context = (Context) C3238b.m11574a(ave.mo14804e());
        } catch (RemoteException | NullPointerException e) {
            C3987mk.m17430b("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.f12285b.mo14798a(C3238b.m11573a(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                C3987mk.m17430b("", e2);
            }
        }
        this.f12286c = mediaView;
    }

    /* renamed from: a */
    public static avh m15496a(ave ave) {
        synchronized (f12284a) {
            avh avh = (avh) f12284a.get(ave.asBinder());
            if (avh != null) {
                return avh;
            }
            avh avh2 = new avh(ave);
            f12284a.put(ave.asBinder(), avh2);
            return avh2;
        }
    }

    /* renamed from: a */
    public final String mo12358a() {
        try {
            return this.f12285b.mo14771l();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final ave mo14886b() {
        return this.f12285b;
    }
}
