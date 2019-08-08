package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag.C2724a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E> implements ShareModel {

    /* renamed from: a */
    private final Uri f8435a;

    /* renamed from: b */
    private final List<String> f8436b;

    /* renamed from: c */
    private final String f8437c;

    /* renamed from: d */
    private final String f8438d;

    /* renamed from: e */
    private final String f8439e;

    /* renamed from: f */
    private final ShareHashtag f8440f;

    public int describeContents() {
        return 0;
    }

    protected ShareContent(Parcel parcel) {
        this.f8435a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8436b = m10375a(parcel);
        this.f8437c = parcel.readString();
        this.f8438d = parcel.readString();
        this.f8439e = parcel.readString();
        this.f8440f = new C2724a().mo9473a(parcel).mo9476a();
    }

    /* renamed from: a */
    public Uri mo9464a() {
        return this.f8435a;
    }

    /* renamed from: b */
    public ShareHashtag mo9465b() {
        return this.f8440f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8435a, 0);
        parcel.writeStringList(this.f8436b);
        parcel.writeString(this.f8437c);
        parcel.writeString(this.f8438d);
        parcel.writeString(this.f8439e);
        parcel.writeParcelable(this.f8440f, 0);
    }

    /* renamed from: a */
    private List<String> m10375a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }
}
