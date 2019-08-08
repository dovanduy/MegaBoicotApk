package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2479ad.C2482a;
import com.facebook.internal.C2484ae;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile implements Parcelable {
    public static final Creator<Profile> CREATOR = new Creator<Profile>() {
        /* renamed from: a */
        public Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel);
        }

        /* renamed from: a */
        public Profile[] newArray(int i) {
            return new Profile[i];
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f4574a = "Profile";

    /* renamed from: b */
    private final String f4575b;

    /* renamed from: c */
    private final String f4576c;

    /* renamed from: d */
    private final String f4577d;

    /* renamed from: e */
    private final String f4578e;

    /* renamed from: f */
    private final String f4579f;

    /* renamed from: g */
    private final Uri f4580g;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static Profile m6288a() {
        return C2759w.m10507a().mo9601b();
    }

    /* renamed from: a */
    public static void m6289a(Profile profile) {
        C2759w.m10507a().mo9600a(profile);
    }

    /* renamed from: b */
    public static void m6290b() {
        AccessToken a = AccessToken.m6161a();
        if (!AccessToken.m6168b()) {
            m6289a(null);
        } else {
            C2479ad.m9446a(a.mo6614d(), (C2482a) new C2482a() {
                /* renamed from: a */
                public void mo6723a(JSONObject jSONObject) {
                    String optString = jSONObject.optString(TtmlNode.ATTR_ID);
                    if (optString != null) {
                        String optString2 = jSONObject.optString("link");
                        Profile profile = new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null);
                        Profile.m6289a(profile);
                    }
                }

                /* renamed from: a */
                public void mo6722a(C2579j jVar) {
                    String e = Profile.f4574a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got unexpected exception: ");
                    sb.append(jVar);
                    Log.e(e, sb.toString());
                }
            });
        }
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        C2484ae.m9490a(str, TtmlNode.ATTR_ID);
        this.f4575b = str;
        this.f4576c = str2;
        this.f4577d = str3;
        this.f4578e = str4;
        this.f4579f = str5;
        this.f4580g = uri;
    }

    /* renamed from: c */
    public String mo6716c() {
        return this.f4579f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r5.f4576c == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r5.f4577d == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r5.f4578e == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r5.f4579f == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if (r5.f4580g == null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.facebook.Profile
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.facebook.Profile r5 = (com.facebook.Profile) r5
            java.lang.String r1 = r4.f4575b
            java.lang.String r3 = r5.f4575b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = r4.f4576c
            if (r1 != 0) goto L_0x0021
            java.lang.String r5 = r5.f4576c
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x001f:
            r0 = r2
            goto L_0x0075
        L_0x0021:
            java.lang.String r1 = r4.f4576c
            java.lang.String r3 = r5.f4576c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = r4.f4577d
            if (r1 != 0) goto L_0x0034
            java.lang.String r5 = r5.f4577d
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x0034:
            java.lang.String r1 = r4.f4577d
            java.lang.String r3 = r5.f4577d
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = r4.f4578e
            if (r1 != 0) goto L_0x0047
            java.lang.String r5 = r5.f4578e
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x0047:
            java.lang.String r1 = r4.f4578e
            java.lang.String r3 = r5.f4578e
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = r4.f4579f
            if (r1 != 0) goto L_0x005a
            java.lang.String r5 = r5.f4579f
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x005a:
            java.lang.String r1 = r4.f4579f
            java.lang.String r3 = r5.f4579f
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            android.net.Uri r1 = r4.f4580g
            if (r1 != 0) goto L_0x006d
            android.net.Uri r5 = r5.f4580g
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x006d:
            android.net.Uri r0 = r4.f4580g
            android.net.Uri r5 = r5.f4580g
            boolean r0 = r0.equals(r5)
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.Profile.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = 527 + this.f4575b.hashCode();
        if (this.f4576c != null) {
            hashCode = (hashCode * 31) + this.f4576c.hashCode();
        }
        if (this.f4577d != null) {
            hashCode = (hashCode * 31) + this.f4577d.hashCode();
        }
        if (this.f4578e != null) {
            hashCode = (hashCode * 31) + this.f4578e.hashCode();
        }
        if (this.f4579f != null) {
            hashCode = (hashCode * 31) + this.f4579f.hashCode();
        }
        return this.f4580g != null ? (hashCode * 31) + this.f4580g.hashCode() : hashCode;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public JSONObject mo6717d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TtmlNode.ATTR_ID, this.f4575b);
            jSONObject.put("first_name", this.f4576c);
            jSONObject.put("middle_name", this.f4577d);
            jSONObject.put("last_name", this.f4578e);
            jSONObject.put("name", this.f4579f);
            if (this.f4580g == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.f4580g.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f4575b = jSONObject.optString(TtmlNode.ATTR_ID, null);
        this.f4576c = jSONObject.optString("first_name", null);
        this.f4577d = jSONObject.optString("middle_name", null);
        this.f4578e = jSONObject.optString("last_name", null);
        this.f4579f = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        if (optString != null) {
            uri = Uri.parse(optString);
        }
        this.f4580g = uri;
    }

    private Profile(Parcel parcel) {
        Uri uri;
        this.f4575b = parcel.readString();
        this.f4576c = parcel.readString();
        this.f4577d = parcel.readString();
        this.f4578e = parcel.readString();
        this.f4579f = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.f4580g = uri;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4575b);
        parcel.writeString(this.f4576c);
        parcel.writeString(this.f4577d);
        parcel.writeString(this.f4578e);
        parcel.writeString(this.f4579f);
        parcel.writeString(this.f4580g == null ? null : this.f4580g.toString());
    }
}
