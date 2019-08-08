package android.support.p017v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new Creator<MediaDescriptionCompat>() {
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m1743a(C0487g.m1797a(parcel));
        }

        /* renamed from: a */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };

    /* renamed from: a */
    private final String f1195a;

    /* renamed from: b */
    private final CharSequence f1196b;

    /* renamed from: c */
    private final CharSequence f1197c;

    /* renamed from: d */
    private final CharSequence f1198d;

    /* renamed from: e */
    private final Bitmap f1199e;

    /* renamed from: f */
    private final Uri f1200f;

    /* renamed from: g */
    private final Bundle f1201g;

    /* renamed from: h */
    private final Uri f1202h;

    /* renamed from: i */
    private Object f1203i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0469a {

        /* renamed from: a */
        private String f1204a;

        /* renamed from: b */
        private CharSequence f1205b;

        /* renamed from: c */
        private CharSequence f1206c;

        /* renamed from: d */
        private CharSequence f1207d;

        /* renamed from: e */
        private Bitmap f1208e;

        /* renamed from: f */
        private Uri f1209f;

        /* renamed from: g */
        private Bundle f1210g;

        /* renamed from: h */
        private Uri f1211h;

        /* renamed from: a */
        public C0469a mo1628a(String str) {
            this.f1204a = str;
            return this;
        }

        /* renamed from: a */
        public C0469a mo1627a(CharSequence charSequence) {
            this.f1205b = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0469a mo1631b(CharSequence charSequence) {
            this.f1206c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0469a mo1632c(CharSequence charSequence) {
            this.f1207d = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0469a mo1624a(Bitmap bitmap) {
            this.f1208e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0469a mo1625a(Uri uri) {
            this.f1209f = uri;
            return this;
        }

        /* renamed from: a */
        public C0469a mo1626a(Bundle bundle) {
            this.f1210g = bundle;
            return this;
        }

        /* renamed from: b */
        public C0469a mo1630b(Uri uri) {
            this.f1211h = uri;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo1629a() {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(this.f1204a, this.f1205b, this.f1206c, this.f1207d, this.f1208e, this.f1209f, this.f1210g, this.f1211h);
            return mediaDescriptionCompat;
        }
    }

    public int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1195a = str;
        this.f1196b = charSequence;
        this.f1197c = charSequence2;
        this.f1198d = charSequence3;
        this.f1199e = bitmap;
        this.f1200f = uri;
        this.f1201g = bundle;
        this.f1202h = uri2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f1195a = parcel.readString();
        this.f1196b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1197c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1198d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.f1199e = (Bitmap) parcel.readParcelable(classLoader);
        this.f1200f = (Uri) parcel.readParcelable(classLoader);
        this.f1201g = parcel.readBundle(classLoader);
        this.f1202h = (Uri) parcel.readParcelable(classLoader);
    }

    /* renamed from: a */
    public String mo1615a() {
        return this.f1195a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f1195a);
            TextUtils.writeToParcel(this.f1196b, parcel, i);
            TextUtils.writeToParcel(this.f1197c, parcel, i);
            TextUtils.writeToParcel(this.f1198d, parcel, i);
            parcel.writeParcelable(this.f1199e, i);
            parcel.writeParcelable(this.f1200f, i);
            parcel.writeBundle(this.f1201g);
            parcel.writeParcelable(this.f1202h, i);
            return;
        }
        C0487g.m1799a(mo1616b(), parcel, i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1196b);
        sb.append(", ");
        sb.append(this.f1197c);
        sb.append(", ");
        sb.append(this.f1198d);
        return sb.toString();
    }

    /* renamed from: b */
    public Object mo1616b() {
        if (this.f1203i != null || VERSION.SDK_INT < 21) {
            return this.f1203i;
        }
        Object a = C0488a.m1806a();
        C0488a.m1812a(a, this.f1195a);
        C0488a.m1811a(a, this.f1196b);
        C0488a.m1813b(a, this.f1197c);
        C0488a.m1814c(a, this.f1198d);
        C0488a.m1808a(a, this.f1199e);
        C0488a.m1809a(a, this.f1200f);
        Bundle bundle = this.f1201g;
        if (VERSION.SDK_INT < 23 && this.f1202h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f1202h);
        }
        C0488a.m1810a(a, bundle);
        if (VERSION.SDK_INT >= 23) {
            C0490a.m1816a(a, this.f1202h);
        }
        this.f1203i = C0488a.m1807a(a);
        return this.f1203i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p017v4.media.MediaDescriptionCompat m1743a(java.lang.Object r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0085
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0085
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            java.lang.String r2 = android.support.p017v4.media.C0487g.m1798a(r6)
            r1.mo1628a(r2)
            java.lang.CharSequence r2 = android.support.p017v4.media.C0487g.m1800b(r6)
            r1.mo1627a(r2)
            java.lang.CharSequence r2 = android.support.p017v4.media.C0487g.m1801c(r6)
            r1.mo1631b(r2)
            java.lang.CharSequence r2 = android.support.p017v4.media.C0487g.m1802d(r6)
            r1.mo1632c(r2)
            android.graphics.Bitmap r2 = android.support.p017v4.media.C0487g.m1803e(r6)
            r1.mo1624a(r2)
            android.net.Uri r2 = android.support.p017v4.media.C0487g.m1804f(r6)
            r1.mo1625a(r2)
            android.os.Bundle r2 = android.support.p017v4.media.C0487g.m1805g(r6)
            if (r2 == 0) goto L_0x004a
            android.support.p017v4.media.session.MediaSessionCompat.m1872a(r2)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r3 = r2.getParcelable(r3)
            android.net.Uri r3 = (android.net.Uri) r3
            goto L_0x004b
        L_0x004a:
            r3 = r0
        L_0x004b:
            if (r3 == 0) goto L_0x0067
            java.lang.String r4 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L_0x005d
            int r4 = r2.size()
            r5 = 2
            if (r4 != r5) goto L_0x005d
            goto L_0x0068
        L_0x005d:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            r2.remove(r0)
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r2.remove(r0)
        L_0x0067:
            r0 = r2
        L_0x0068:
            r1.mo1626a(r0)
            if (r3 == 0) goto L_0x0071
            r1.mo1630b(r3)
            goto L_0x007e
        L_0x0071:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007e
            android.net.Uri r0 = android.support.p017v4.media.C0489h.m1815a(r6)
            r1.mo1630b(r0)
        L_0x007e:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo1629a()
            r0.f1203i = r6
            return r0
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.media.MediaDescriptionCompat.m1743a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }
}
