package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<BitmapTeleporter> CREATOR = new C3409a();

    /* renamed from: a */
    private final int f9850a;

    /* renamed from: b */
    private ParcelFileDescriptor f9851b;

    /* renamed from: c */
    private final int f9852c;

    /* renamed from: d */
    private Bitmap f9853d = null;

    /* renamed from: e */
    private boolean f9854e = false;

    /* renamed from: f */
    private File f9855f;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f9850a = i;
        this.f9851b = parcelFileDescriptor;
        this.f9852c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f9851b == null) {
            Bitmap bitmap = this.f9853d;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(m12268a()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m12269a(dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m12269a(dataOutputStream);
                throw th;
            }
        }
        int i2 = i | 1;
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9850a);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f9851b, i2, false);
        C3511b.m12599a(parcel, 3, this.f9852c);
        C3511b.m12596a(parcel, a);
        this.f9851b = null;
    }

    /* renamed from: a */
    private final FileOutputStream m12268a() {
        if (this.f9855f == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            File createTempFile = File.createTempFile("teleporter", C1245d.f3944iM, this.f9855f);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                this.f9851b = ParcelFileDescriptor.open(createTempFile, 268435456);
                createTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException unused) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Could not create temporary file", e);
        }
    }

    /* renamed from: a */
    private static void m12269a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }
}
