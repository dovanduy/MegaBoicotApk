package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Credential> CREATOR = new C3184b();
    @Nonnull

    /* renamed from: a */
    private final String f9287a;

    /* renamed from: b */
    private final String f9288b;

    /* renamed from: c */
    private final Uri f9289c;
    @Nonnull

    /* renamed from: d */
    private final List<IdToken> f9290d;

    /* renamed from: e */
    private final String f9291e;

    /* renamed from: f */
    private final String f9292f;

    /* renamed from: g */
    private final String f9293g;

    /* renamed from: h */
    private final String f9294h;

    Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        List<IdToken> list2;
        String trim = ((String) C3513t.m12626a(str, (Object) "credential identifier cannot be null")).trim();
        C3513t.m12628a(trim, (Object) "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f9288b = str2;
                this.f9289c = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f9290d = list2;
                this.f9287a = trim;
                this.f9291e = str3;
                this.f9292f = str4;
                this.f9293g = str5;
                this.f9294h = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    @Nonnull
    /* renamed from: a */
    public String mo12893a() {
        return this.f9287a;
    }

    /* renamed from: b */
    public String mo12894b() {
        return this.f9288b;
    }

    /* renamed from: c */
    public Uri mo12895c() {
        return this.f9289c;
    }

    @Nonnull
    /* renamed from: d */
    public List<IdToken> mo12896d() {
        return this.f9290d;
    }

    /* renamed from: e */
    public String mo12897e() {
        return this.f9291e;
    }

    /* renamed from: f */
    public String mo12899f() {
        return this.f9292f;
    }

    /* renamed from: g */
    public String mo12900g() {
        return this.f9293g;
    }

    /* renamed from: h */
    public String mo12901h() {
        return this.f9294h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 1, mo12893a(), false);
        C3511b.m12609a(parcel, 2, mo12894b(), false);
        C3511b.m12604a(parcel, 3, (Parcelable) mo12895c(), i, false);
        C3511b.m12621c(parcel, 4, mo12896d(), false);
        C3511b.m12609a(parcel, 5, mo12897e(), false);
        C3511b.m12609a(parcel, 6, mo12899f(), false);
        C3511b.m12609a(parcel, 9, mo12900g(), false);
        C3511b.m12609a(parcel, 10, mo12901h(), false);
        C3511b.m12596a(parcel, a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f9287a, credential.f9287a) && TextUtils.equals(this.f9288b, credential.f9288b) && C3504r.m12550a(this.f9289c, credential.f9289c) && TextUtils.equals(this.f9291e, credential.f9291e) && TextUtils.equals(this.f9292f, credential.f9292f);
    }

    public int hashCode() {
        return C3504r.m12548a(this.f9287a, this.f9288b, this.f9289c, this.f9291e, this.f9292f);
    }
}
