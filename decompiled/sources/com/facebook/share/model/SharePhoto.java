package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia.C2726a;
import java.util.ArrayList;
import java.util.List;

public final class SharePhoto extends ShareMedia {
    public static final Creator<SharePhoto> CREATOR = new Creator<SharePhoto>() {
        /* renamed from: a */
        public SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        /* renamed from: a */
        public SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }
    };

    /* renamed from: a */
    private final Bitmap f8484a;

    /* renamed from: b */
    private final Uri f8485b;

    /* renamed from: c */
    private final boolean f8486c;

    /* renamed from: d */
    private final String f8487d;

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    public static final class C2742a extends C2726a<SharePhoto, C2742a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bitmap f8488a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Uri f8489b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f8490c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f8491d;

        /* renamed from: a */
        public C2742a mo9550a(Bitmap bitmap) {
            this.f8488a = bitmap;
            return this;
        }

        /* renamed from: a */
        public C2742a mo9551a(Uri uri) {
            this.f8489b = uri;
            return this;
        }

        /* renamed from: a */
        public C2742a mo9554a(boolean z) {
            this.f8490c = z;
            return this;
        }

        /* renamed from: a */
        public C2742a mo9553a(String str) {
            this.f8491d = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Uri mo9549a() {
            return this.f8489b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Bitmap mo9555b() {
            return this.f8488a;
        }

        /* renamed from: c */
        public SharePhoto mo9557c() {
            return new SharePhoto(this);
        }

        /* renamed from: a */
        public C2742a mo9486a(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            return ((C2742a) super.mo9486a(sharePhoto)).mo9550a(sharePhoto.mo9541b()).mo9551a(sharePhoto.mo9542c()).mo9554a(sharePhoto.mo9543d()).mo9553a(sharePhoto.mo9544e());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C2742a mo9556b(Parcel parcel) {
            return mo9486a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        /* renamed from: a */
        static void m10433a(Parcel parcel, int i, List<SharePhoto> list) {
            ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                shareMediaArr[i2] = (ShareMedia) list.get(i2);
            }
            parcel.writeParcelableArray(shareMediaArr, i);
        }

        /* renamed from: c */
        static List<SharePhoto> m10435c(Parcel parcel) {
            List<ShareMedia> a = m10391a(parcel);
            ArrayList arrayList = new ArrayList();
            for (ShareMedia shareMedia : a) {
                if (shareMedia instanceof SharePhoto) {
                    arrayList.add((SharePhoto) shareMedia);
                }
            }
            return arrayList;
        }
    }

    public int describeContents() {
        return 0;
    }

    private SharePhoto(C2742a aVar) {
        super((C2726a) aVar);
        this.f8484a = aVar.f8488a;
        this.f8485b = aVar.f8489b;
        this.f8486c = aVar.f8490c;
        this.f8487d = aVar.f8491d;
    }

    SharePhoto(Parcel parcel) {
        super(parcel);
        this.f8484a = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f8485b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8486c = parcel.readByte() != 0;
        this.f8487d = parcel.readString();
    }

    /* renamed from: b */
    public Bitmap mo9541b() {
        return this.f8484a;
    }

    /* renamed from: c */
    public Uri mo9542c() {
        return this.f8485b;
    }

    /* renamed from: d */
    public boolean mo9543d() {
        return this.f8486c;
    }

    /* renamed from: e */
    public String mo9544e() {
        return this.f8487d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8484a, 0);
        parcel.writeParcelable(this.f8485b, 0);
        parcel.writeByte(this.f8486c ? (byte) 1 : 0);
        parcel.writeString(this.f8487d);
    }
}
