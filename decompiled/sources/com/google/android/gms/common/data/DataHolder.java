package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Creator<DataHolder> CREATOR = new C3411c();

    /* renamed from: k */
    private static final C3408a f9856k = new C3410b(new String[0], null);

    /* renamed from: a */
    private final int f9857a;

    /* renamed from: b */
    private final String[] f9858b;

    /* renamed from: c */
    private Bundle f9859c;

    /* renamed from: d */
    private final CursorWindow[] f9860d;

    /* renamed from: e */
    private final int f9861e;

    /* renamed from: f */
    private final Bundle f9862f;

    /* renamed from: g */
    private int[] f9863g;

    /* renamed from: h */
    private int f9864h;

    /* renamed from: i */
    private boolean f9865i = false;

    /* renamed from: j */
    private boolean f9866j = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C3408a {

        /* renamed from: a */
        private final String[] f9867a;

        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f9868b;

        /* renamed from: c */
        private final String f9869c;

        /* renamed from: d */
        private final HashMap<Object, Integer> f9870d;

        /* renamed from: e */
        private boolean f9871e;

        /* renamed from: f */
        private String f9872f;

        private C3408a(String[] strArr, String str) {
            this.f9867a = (String[]) C3513t.m12625a(strArr);
            this.f9868b = new ArrayList<>();
            this.f9869c = str;
            this.f9870d = new HashMap<>();
            this.f9871e = false;
            this.f9872f = null;
        }

        /* synthetic */ C3408a(String[] strArr, String str, C3410b bVar) {
            this(strArr, null);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f9857a = i;
        this.f9858b = strArr;
        this.f9860d = cursorWindowArr;
        this.f9861e = i2;
        this.f9862f = bundle;
    }

    /* renamed from: a */
    public final void mo13421a() {
        this.f9859c = new Bundle();
        for (int i = 0; i < this.f9858b.length; i++) {
            this.f9859c.putInt(this.f9858b[i], i);
        }
        this.f9863g = new int[this.f9860d.length];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9860d.length; i3++) {
            this.f9863g[i3] = i2;
            i2 += this.f9860d[i3].getNumRows() - (i2 - this.f9860d[i3].getStartPosition());
        }
        this.f9864h = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12615a(parcel, 1, this.f9858b, false);
        C3511b.m12614a(parcel, 2, (T[]) this.f9860d, i, false);
        C3511b.m12599a(parcel, 3, mo13422b());
        C3511b.m12601a(parcel, 4, mo13423c(), false);
        C3511b.m12599a(parcel, (int) AdError.NETWORK_ERROR_CODE, this.f9857a);
        C3511b.m12596a(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    /* renamed from: b */
    public final int mo13422b() {
        return this.f9861e;
    }

    /* renamed from: c */
    public final Bundle mo13423c() {
        return this.f9862f;
    }

    /* renamed from: d */
    public final boolean mo13425d() {
        boolean z;
        synchronized (this) {
            z = this.f9865i;
        }
        return z;
    }

    public final void close() {
        synchronized (this) {
            if (!this.f9865i) {
                this.f9865i = true;
                for (CursorWindow close : this.f9860d) {
                    close.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.f9866j && this.f9860d.length > 0 && !mo13425d()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(178 + String.valueOf(obj).length());
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }
}
