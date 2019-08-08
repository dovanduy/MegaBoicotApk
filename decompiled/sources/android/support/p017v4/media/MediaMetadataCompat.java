package android.support.p017v4.media;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p017v4.media.session.MediaSessionCompat;
import android.support.p017v4.p023d.C0376a;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new Creator<MediaMetadataCompat>() {
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: a */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    };

    /* renamed from: a */
    static final C0376a<String, Integer> f1212a = new C0376a<>();

    /* renamed from: c */
    private static final String[] f1213c = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: d */
    private static final String[] f1214d = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: e */
    private static final String[] f1215e = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: b */
    final Bundle f1216b;

    /* renamed from: f */
    private Object f1217f;

    public int describeContents() {
        return 0;
    }

    static {
        f1212a.put("android.media.metadata.TITLE", Integer.valueOf(1));
        f1212a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
        f1212a.put("android.media.metadata.DURATION", Integer.valueOf(0));
        f1212a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
        f1212a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
        f1212a.put("android.media.metadata.WRITER", Integer.valueOf(1));
        f1212a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
        f1212a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
        f1212a.put("android.media.metadata.DATE", Integer.valueOf(1));
        f1212a.put("android.media.metadata.YEAR", Integer.valueOf(0));
        f1212a.put("android.media.metadata.GENRE", Integer.valueOf(1));
        f1212a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
        f1212a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
        f1212a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
        f1212a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
        f1212a.put("android.media.metadata.ART", Integer.valueOf(2));
        f1212a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
        f1212a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
        f1212a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
        f1212a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
        f1212a.put("android.media.metadata.RATING", Integer.valueOf(3));
        f1212a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
        f1212a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
        f1212a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
        f1212a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
        f1212a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
        f1212a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
        f1212a.put("android.media.metadata.BT_FOLDER_TYPE", Integer.valueOf(0));
        f1212a.put("android.media.metadata.MEDIA_URI", Integer.valueOf(1));
        f1212a.put("android.media.metadata.ADVERTISEMENT", Integer.valueOf(0));
        f1212a.put("android.media.metadata.DOWNLOAD_STATUS", Integer.valueOf(0));
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f1216b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1216b);
    }

    /* renamed from: a */
    public static MediaMetadataCompat m1757a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0491i.m1817a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f1217f = obj;
        return mediaMetadataCompat;
    }
}
