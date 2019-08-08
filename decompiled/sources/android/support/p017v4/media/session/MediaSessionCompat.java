package android.support.p017v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.p017v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new Creator<QueueItem>() {
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: a */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };

        /* renamed from: a */
        private final MediaDescriptionCompat f1266a;

        /* renamed from: b */
        private final long f1267b;

        /* renamed from: c */
        private Object f1268c;

        public int describeContents() {
            return 0;
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            } else {
                this.f1266a = mediaDescriptionCompat;
                this.f1267b = j;
                this.f1268c = obj;
            }
        }

        QueueItem(Parcel parcel) {
            this.f1266a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f1267b = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f1266a.writeToParcel(parcel, i);
            parcel.writeLong(this.f1267b);
        }

        /* renamed from: a */
        public static QueueItem m1873a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m1743a(C0528a.m2037a(obj)), C0528a.m2038b(obj));
        }

        /* renamed from: a */
        public static List<QueueItem> m1874a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m1873a(a));
            }
            return arrayList;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaSession.QueueItem {Description=");
            sb.append(this.f1266a);
            sb.append(", Id=");
            sb.append(this.f1267b);
            sb.append(" }");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new Creator<ResultReceiverWrapper>() {
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: a */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };

        /* renamed from: a */
        ResultReceiver f1269a;

        public int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f1269a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f1269a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new Creator<Token>() {
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* renamed from: a */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        };

        /* renamed from: a */
        private final Object f1270a;

        /* renamed from: b */
        private C0520b f1271b;

        /* renamed from: c */
        private Bundle f1272c;

        public int describeContents() {
            return 0;
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        Token(Object obj, C0520b bVar) {
            this(obj, bVar, null);
        }

        Token(Object obj, C0520b bVar, Bundle bundle) {
            this.f1270a = obj;
            this.f1271b = bVar;
            this.f1272c = bundle;
        }

        /* renamed from: a */
        public static Token m1879a(Object obj) {
            return m1880a(obj, null);
        }

        /* renamed from: a */
        public static Token m1880a(Object obj, C0520b bVar) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new Token(C0527d.m2036a(obj), bVar);
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f1270a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f1270a);
            }
        }

        public int hashCode() {
            if (this.f1270a == null) {
                return 0;
            }
            return this.f1270a.hashCode();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (this.f1270a == null) {
                if (token.f1270a != null) {
                    z = false;
                }
                return z;
            } else if (token.f1270a == null) {
                return false;
            } else {
                return this.f1270a.equals(token.f1270a);
            }
        }

        /* renamed from: a */
        public Object mo1733a() {
            return this.f1270a;
        }

        /* renamed from: b */
        public C0520b mo1736b() {
            return this.f1271b;
        }

        /* renamed from: a */
        public void mo1735a(C0520b bVar) {
            this.f1271b = bVar;
        }

        /* renamed from: a */
        public void mo1734a(Bundle bundle) {
            this.f1272c = bundle;
        }
    }

    /* renamed from: a */
    public static void m1872a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
