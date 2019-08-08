package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareOpenGraphValueContainer.C2740a;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C2737a> {
    public static final Creator<ShareOpenGraphAction> CREATOR = new Creator<ShareOpenGraphAction>() {
        /* renamed from: a */
        public ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        /* renamed from: a */
        public ShareOpenGraphAction[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }
    };

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    public static final class C2737a extends C2740a<ShareOpenGraphAction, C2737a> {
        /* renamed from: a */
        public C2737a mo9522a(String str) {
            mo9540a("og:type", str);
            return this;
        }

        /* renamed from: a */
        public ShareOpenGraphAction mo9523a() {
            return new ShareOpenGraphAction(this);
        }

        /* renamed from: a */
        public C2737a mo9524a(ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                return this;
            }
            return ((C2737a) super.mo9524a(shareOpenGraphAction)).mo9522a(shareOpenGraphAction.mo9515a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2737a mo9520a(Parcel parcel) {
            return mo9524a((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }
    }

    private ShareOpenGraphAction(C2737a aVar) {
        super((C2740a<P, E>) aVar);
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public String mo9515a() {
        return mo9536b("og:type");
    }
}
