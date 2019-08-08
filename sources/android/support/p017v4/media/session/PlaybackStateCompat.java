package android.support.p017v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new Creator<PlaybackStateCompat>() {
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: a */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };

    /* renamed from: a */
    final int f1278a;

    /* renamed from: b */
    final long f1279b;

    /* renamed from: c */
    final long f1280c;

    /* renamed from: d */
    final float f1281d;

    /* renamed from: e */
    final long f1282e;

    /* renamed from: f */
    final int f1283f;

    /* renamed from: g */
    final CharSequence f1284g;

    /* renamed from: h */
    final long f1285h;

    /* renamed from: i */
    List<CustomAction> f1286i;

    /* renamed from: j */
    final long f1287j;

    /* renamed from: k */
    final Bundle f1288k;

    /* renamed from: l */
    private Object f1289l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new Creator<CustomAction>() {
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: a */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };

        /* renamed from: a */
        private final String f1290a;

        /* renamed from: b */
        private final CharSequence f1291b;

        /* renamed from: c */
        private final int f1292c;

        /* renamed from: d */
        private final Bundle f1293d;

        /* renamed from: e */
        private Object f1294e;

        public int describeContents() {
            return 0;
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1290a = str;
            this.f1291b = charSequence;
            this.f1292c = i;
            this.f1293d = bundle;
        }

        CustomAction(Parcel parcel) {
            this.f1290a = parcel.readString();
            this.f1291b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1292c = parcel.readInt();
            this.f1293d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1290a);
            TextUtils.writeToParcel(this.f1291b, parcel, i);
            parcel.writeInt(this.f1292c);
            parcel.writeBundle(this.f1293d);
        }

        /* renamed from: a */
        public static CustomAction m1892a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0530a.m2048a(obj), C0530a.m2049b(obj), C0530a.m2050c(obj), C0530a.m2051d(obj));
            customAction.f1294e = obj;
            return customAction;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Action:mName='");
            sb.append(this.f1291b);
            sb.append(", mIcon=");
            sb.append(this.f1292c);
            sb.append(", mExtras=");
            sb.append(this.f1293d);
            return sb.toString();
        }
    }

    public int describeContents() {
        return 0;
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f1278a = i;
        this.f1279b = j;
        this.f1280c = j2;
        this.f1281d = f;
        this.f1282e = j3;
        this.f1283f = i2;
        this.f1284g = charSequence;
        this.f1285h = j4;
        this.f1286i = new ArrayList(list);
        this.f1287j = j5;
        this.f1288k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f1278a = parcel.readInt();
        this.f1279b = parcel.readLong();
        this.f1281d = parcel.readFloat();
        this.f1285h = parcel.readLong();
        this.f1280c = parcel.readLong();
        this.f1282e = parcel.readLong();
        this.f1284g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1286i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1287j = parcel.readLong();
        this.f1288k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f1283f = parcel.readInt();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f1278a);
        sb.append(", position=");
        sb.append(this.f1279b);
        sb.append(", buffered position=");
        sb.append(this.f1280c);
        sb.append(", speed=");
        sb.append(this.f1281d);
        sb.append(", updated=");
        sb.append(this.f1285h);
        sb.append(", actions=");
        sb.append(this.f1282e);
        sb.append(", error code=");
        sb.append(this.f1283f);
        sb.append(", error message=");
        sb.append(this.f1284g);
        sb.append(", custom actions=");
        sb.append(this.f1286i);
        sb.append(", active item id=");
        sb.append(this.f1287j);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1278a);
        parcel.writeLong(this.f1279b);
        parcel.writeFloat(this.f1281d);
        parcel.writeLong(this.f1285h);
        parcel.writeLong(this.f1280c);
        parcel.writeLong(this.f1282e);
        TextUtils.writeToParcel(this.f1284g, parcel, i);
        parcel.writeTypedList(this.f1286i);
        parcel.writeLong(this.f1287j);
        parcel.writeBundle(this.f1288k);
        parcel.writeInt(this.f1283f);
    }

    /* renamed from: a */
    public static PlaybackStateCompat m1889a(Object obj) {
        List list;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> h = C0529e.m2046h(obj);
        if (h != null) {
            ArrayList arrayList = new ArrayList(h.size());
            for (Object a : h) {
                arrayList.add(CustomAction.m1892a(a));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            bundle = C0531f.m2052a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0529e.m2039a(obj), C0529e.m2040b(obj), C0529e.m2041c(obj), C0529e.m2042d(obj), C0529e.m2043e(obj), 0, C0529e.m2044f(obj), C0529e.m2045g(obj), list, C0529e.m2047i(obj), bundle);
        playbackStateCompat.f1289l = obj2;
        return playbackStateCompat;
    }
}
