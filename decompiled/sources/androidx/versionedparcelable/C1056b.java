package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: androidx.versionedparcelable.b */
/* compiled from: VersionedParcelParcel */
class C1056b extends C1055a {

    /* renamed from: a */
    private final SparseIntArray f3503a;

    /* renamed from: b */
    private final Parcel f3504b;

    /* renamed from: c */
    private final int f3505c;

    /* renamed from: d */
    private final int f3506d;

    /* renamed from: e */
    private final String f3507e;

    /* renamed from: f */
    private int f3508f;

    /* renamed from: g */
    private int f3509g;

    C1056b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    C1056b(Parcel parcel, int i, int i2, String str) {
        this.f3503a = new SparseIntArray();
        this.f3508f = -1;
        this.f3509g = 0;
        this.f3504b = parcel;
        this.f3505c = i;
        this.f3506d = i2;
        this.f3509g = this.f3505c;
        this.f3507e = str;
    }

    /* renamed from: d */
    private int m4903d(int i) {
        while (this.f3509g < this.f3506d) {
            this.f3504b.setDataPosition(this.f3509g);
            int readInt = this.f3504b.readInt();
            int readInt2 = this.f3504b.readInt();
            this.f3509g += readInt;
            if (readInt2 == i) {
                return this.f3504b.dataPosition();
            }
        }
        return -1;
    }

    /* renamed from: b */
    public boolean mo5396b(int i) {
        int d = m4903d(i);
        if (d == -1) {
            return false;
        }
        this.f3504b.setDataPosition(d);
        return true;
    }

    /* renamed from: c */
    public void mo5399c(int i) {
        mo5395b();
        this.f3508f = i;
        this.f3503a.put(i, this.f3504b.dataPosition());
        mo5379a(0);
        mo5379a(i);
    }

    /* renamed from: b */
    public void mo5395b() {
        if (this.f3508f >= 0) {
            int i = this.f3503a.get(this.f3508f);
            int dataPosition = this.f3504b.dataPosition();
            int i2 = dataPosition - i;
            this.f3504b.setDataPosition(i);
            this.f3504b.writeInt(i2);
            this.f3504b.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1055a mo5398c() {
        Parcel parcel = this.f3504b;
        int dataPosition = this.f3504b.dataPosition();
        int i = this.f3509g == this.f3505c ? this.f3506d : this.f3509g;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3507e);
        sb.append("  ");
        return new C1056b(parcel, dataPosition, i, sb.toString());
    }

    /* renamed from: a */
    public void mo5388a(byte[] bArr) {
        if (bArr != null) {
            this.f3504b.writeInt(bArr.length);
            this.f3504b.writeByteArray(bArr);
            return;
        }
        this.f3504b.writeInt(-1);
    }

    /* renamed from: a */
    public void mo5379a(int i) {
        this.f3504b.writeInt(i);
    }

    /* renamed from: a */
    public void mo5385a(String str) {
        this.f3504b.writeString(str);
    }

    /* renamed from: a */
    public void mo5381a(Parcelable parcelable) {
        this.f3504b.writeParcelable(parcelable, 0);
    }

    /* renamed from: d */
    public int mo5400d() {
        return this.f3504b.readInt();
    }

    /* renamed from: e */
    public String mo5401e() {
        return this.f3504b.readString();
    }

    /* renamed from: f */
    public byte[] mo5402f() {
        int readInt = this.f3504b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3504b.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: g */
    public <T extends Parcelable> T mo5403g() {
        return this.f3504b.readParcelable(getClass().getClassLoader());
    }
}
