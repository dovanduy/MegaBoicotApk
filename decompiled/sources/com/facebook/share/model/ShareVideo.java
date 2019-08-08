package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia.C2726a;

public final class ShareVideo extends ShareMedia {
    public static final Creator<ShareVideo> CREATOR = new Creator<ShareVideo>() {
        /* renamed from: a */
        public ShareVideo createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }

        /* renamed from: a */
        public ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }
    };

    /* renamed from: a */
    private final Uri f8493a;

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    public static final class C2745a extends C2726a<ShareVideo, C2745a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Uri f8494a;

        /* renamed from: a */
        public C2745a mo9567a(Uri uri) {
            this.f8494a = uri;
            return this;
        }

        /* renamed from: a */
        public ShareVideo mo9569a() {
            return new ShareVideo(this);
        }

        /* renamed from: a */
        public C2745a mo9486a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            return ((C2745a) super.mo9486a(shareVideo)).mo9567a(shareVideo.mo9562b());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C2745a mo9570b(Parcel parcel) {
            return mo9486a((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareVideo(C2745a aVar) {
        super((C2726a) aVar);
        this.f8493a = aVar.f8494a;
    }

    ShareVideo(Parcel parcel) {
        super(parcel);
        this.f8493a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    /* renamed from: b */
    public Uri mo9562b() {
        return this.f8493a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8493a, 0);
    }
}
