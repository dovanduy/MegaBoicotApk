package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.SharePhoto.C2742a;
import java.util.Collections;
import java.util.List;

public final class SharePhotoContent extends ShareContent<SharePhotoContent, Object> {
    public static final Creator<SharePhotoContent> CREATOR = new Creator<SharePhotoContent>() {
        /* renamed from: a */
        public SharePhotoContent createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }

        /* renamed from: a */
        public SharePhotoContent[] newArray(int i) {
            return new SharePhotoContent[i];
        }
    };

    /* renamed from: a */
    private final List<SharePhoto> f8492a;

    public int describeContents() {
        return 0;
    }

    SharePhotoContent(Parcel parcel) {
        super(parcel);
        this.f8492a = Collections.unmodifiableList(C2742a.m10435c(parcel));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C2742a.m10433a(parcel, i, this.f8492a);
    }
}
