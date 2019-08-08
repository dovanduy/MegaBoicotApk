package com.google.android.gms.internal.ads;

final class awm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f12317a;

    /* renamed from: b */
    private final /* synthetic */ long f12318b;

    /* renamed from: c */
    private final /* synthetic */ avm f12319c;

    awm(avm avm, String str, long j) {
        this.f12319c = avm;
        this.f12317a = str;
        this.f12318b = j;
    }

    public final void run() {
        this.f12319c.f12288a.mo15261a(this.f12317a, this.f12318b);
        this.f12319c.f12288a.mo15260a(toString());
    }
}
