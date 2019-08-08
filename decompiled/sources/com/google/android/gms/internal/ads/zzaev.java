package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C3559k;
import java.io.DataInputStream;
import java.io.IOException;

@C3718cm
public final class zzaev extends AbstractSafeParcelable {
    public static final Creator<zzaev> CREATOR = new C3758dz();

    /* renamed from: a */
    private ParcelFileDescriptor f14480a;

    /* renamed from: b */
    private Parcelable f14481b;

    /* renamed from: c */
    private boolean f14482c;

    public zzaev(ParcelFileDescriptor parcelFileDescriptor) {
        this.f14480a = parcelFileDescriptor;
        this.f14481b = null;
        this.f14482c = true;
    }

    public zzaev(SafeParcelable safeParcelable) {
        this.f14480a = null;
        this.f14481b = safeParcelable;
        this.f14482c = false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final ParcelFileDescriptor m18786a() {
        if (this.f14480a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f14481b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f14480a = m18787a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f14480a;
    }

    /* renamed from: a */
    private final <T> ParcelFileDescriptor m18787a(byte[] bArr) {
        AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new C3757dy(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                C3900je.m17430b("Error transporting the ad response", e);
                C3025aw.m10921i().mo15436a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
                C3559k.m12757a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
            C3900je.m17430b("Error transporting the ad response", e);
            C3025aw.m10921i().mo15436a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
            C3559k.m12757a(autoCloseOutputStream);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final <T extends SafeParcelable> T mo16246a(Creator<T> creator) {
        if (this.f14482c) {
            if (this.f14480a == null) {
                C3900je.m17431c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new AutoCloseInputStream(this.f14480a));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                C3559k.m12757a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.f14481b = (SafeParcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f14482c = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                C3900je.m17430b("Could not read from parcel file descriptor", e);
                C3559k.m12757a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                C3559k.m12757a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f14481b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        m18786a();
        int a = C3511b.m12595a(parcel);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f14480a, i, false);
        C3511b.m12596a(parcel, a);
    }
}
