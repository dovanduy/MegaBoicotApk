package android.support.p017v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p017v4.media.MediaMetadataCompat;
import android.support.p017v4.media.session.MediaSessionCompat.QueueItem;
import android.text.TextUtils;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
/* compiled from: IMediaControllerCallback */
public interface C0517a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    /* compiled from: IMediaControllerCallback */
    public static abstract class C0518a extends Binder implements C0517a {

        /* renamed from: android.support.v4.media.session.a$a$a */
        /* compiled from: IMediaControllerCallback */
        private static class C0519a implements C0517a {

            /* renamed from: a */
            private IBinder f1295a;

            C0519a(IBinder iBinder) {
                this.f1295a = iBinder;
            }

            public IBinder asBinder() {
                return this.f1295a;
            }

            /* renamed from: a */
            public void mo1715a(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1295a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1685a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f1295a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1714a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1295a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1687a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1295a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1690a(List<QueueItem> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    this.f1295a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1689a(CharSequence charSequence) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1295a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1686a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1295a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1688a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1295a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1713a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f1295a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1716a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1295a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1719b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1295a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1718b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f1295a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo1717b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f1295a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C0518a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* renamed from: a */
        public static C0517a m1908a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0517a)) {
                return new C0519a(iBinder);
            }
            return (C0517a) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v1, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r2v4, types: [android.support.v4.media.session.PlaybackStateCompat] */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.support.v4.media.session.PlaybackStateCompat] */
        /* JADX WARNING: type inference failed for: r2v7, types: [android.support.v4.media.MediaMetadataCompat] */
        /* JADX WARNING: type inference failed for: r2v9, types: [android.support.v4.media.MediaMetadataCompat] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r2v13, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r2v15, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r2v16, types: [android.support.v4.media.session.ParcelableVolumeInfo] */
        /* JADX WARNING: type inference failed for: r2v18, types: [android.support.v4.media.session.ParcelableVolumeInfo] */
        /* JADX WARNING: type inference failed for: r2v19 */
        /* JADX WARNING: type inference failed for: r2v20 */
        /* JADX WARNING: type inference failed for: r2v21 */
        /* JADX WARNING: type inference failed for: r2v22 */
        /* JADX WARNING: type inference failed for: r2v23 */
        /* JADX WARNING: type inference failed for: r2v24 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.support.v4.media.session.PlaybackStateCompat, android.os.Bundle, android.support.v4.media.MediaMetadataCompat, java.lang.CharSequence, android.support.v4.media.session.ParcelableVolumeInfo]
          uses: [android.os.Bundle, android.support.v4.media.session.PlaybackStateCompat, android.support.v4.media.MediaMetadataCompat, java.lang.CharSequence, android.support.v4.media.session.ParcelableVolumeInfo]
          mth insns count: 114
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 7 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x00ff
                r0 = 0
                r2 = 0
                switch(r4) {
                    case 1: goto L_0x00e3;
                    case 2: goto L_0x00da;
                    case 3: goto L_0x00c2;
                    case 4: goto L_0x00aa;
                    case 5: goto L_0x009b;
                    case 6: goto L_0x0083;
                    case 7: goto L_0x006b;
                    case 8: goto L_0x0053;
                    case 9: goto L_0x0046;
                    case 10: goto L_0x0036;
                    case 11: goto L_0x0026;
                    case 12: goto L_0x0019;
                    case 13: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0010:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                r3.mo1717b()
                return r1
            L_0x0019:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                r3.mo1718b(r4)
                return r1
            L_0x0026:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0032
                r0 = r1
            L_0x0032:
                r3.mo1719b(r0)
                return r1
            L_0x0036:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0042
                r0 = r1
            L_0x0042:
                r3.mo1716a(r0)
                return r1
            L_0x0046:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                r3.mo1713a(r4)
                return r1
            L_0x0053:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0067
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r4 = android.support.p017v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r2 = r4
                android.support.v4.media.session.ParcelableVolumeInfo r2 = (android.support.p017v4.media.session.ParcelableVolumeInfo) r2
            L_0x0067:
                r3.mo1688a(r2)
                return r1
            L_0x006b:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x007f
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r2 = r4
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x007f:
                r3.mo1686a(r2)
                return r1
            L_0x0083:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0097
                android.os.Parcelable$Creator r4 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r2 = r4
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            L_0x0097:
                r3.mo1689a(r2)
                return r1
            L_0x009b:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r4 = android.support.p017v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                r3.mo1690a(r4)
                return r1
            L_0x00aa:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00be
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r4 = android.support.p017v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r2 = r4
                android.support.v4.media.MediaMetadataCompat r2 = (android.support.p017v4.media.MediaMetadataCompat) r2
            L_0x00be:
                r3.mo1687a(r2)
                return r1
            L_0x00c2:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00d6
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r4 = android.support.p017v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r2 = r4
                android.support.v4.media.session.PlaybackStateCompat r2 = (android.support.p017v4.media.session.PlaybackStateCompat) r2
            L_0x00d6:
                r3.mo1714a(r2)
                return r1
            L_0x00da:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                r3.mo1685a()
                return r1
            L_0x00e3:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r6 = r5.readInt()
                if (r6 == 0) goto L_0x00fb
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r6.createFromParcel(r5)
                r2 = r5
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x00fb:
                r3.mo1715a(r4, r2)
                return r1
            L_0x00ff:
                java.lang.String r4 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.writeString(r4)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.media.session.C0517a.C0518a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo1685a() throws RemoteException;

    /* renamed from: a */
    void mo1713a(int i) throws RemoteException;

    /* renamed from: a */
    void mo1686a(Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo1687a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    /* renamed from: a */
    void mo1688a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    /* renamed from: a */
    void mo1714a(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    /* renamed from: a */
    void mo1689a(CharSequence charSequence) throws RemoteException;

    /* renamed from: a */
    void mo1715a(String str, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo1690a(List<QueueItem> list) throws RemoteException;

    /* renamed from: a */
    void mo1716a(boolean z) throws RemoteException;

    /* renamed from: b */
    void mo1717b() throws RemoteException;

    /* renamed from: b */
    void mo1718b(int i) throws RemoteException;

    /* renamed from: b */
    void mo1719b(boolean z) throws RemoteException;
}
