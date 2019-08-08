package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareModel;

@Deprecated
public class LikeContent implements ShareModel {
    @Deprecated
    public static final Creator<LikeContent> CREATOR = new Creator<LikeContent>() {
        /* renamed from: a */
        public LikeContent createFromParcel(Parcel parcel) {
            return new LikeContent(parcel);
        }

        /* renamed from: a */
        public LikeContent[] newArray(int i) {
            return new LikeContent[i];
        }
    };

    /* renamed from: a */
    private final String f8293a;

    /* renamed from: b */
    private final String f8294b;

    @Deprecated
    /* renamed from: com.facebook.share.internal.LikeContent$a */
    public static class C2668a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f8295a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f8296b;

        @Deprecated
        /* renamed from: a */
        public C2668a mo9392a(String str) {
            this.f8295a = str;
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C2668a mo9394b(String str) {
            this.f8296b = str;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public LikeContent mo9393a() {
            return new LikeContent(this);
        }
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    private LikeContent(C2668a aVar) {
        this.f8293a = aVar.f8295a;
        this.f8294b = aVar.f8296b;
    }

    @Deprecated
    LikeContent(Parcel parcel) {
        this.f8293a = parcel.readString();
        this.f8294b = parcel.readString();
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8293a);
        parcel.writeString(this.f8294b);
    }
}
