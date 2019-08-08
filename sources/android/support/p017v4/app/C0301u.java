package android.support.p017v4.app;

import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p012a.C0118a.C0120b;
import android.support.p012a.C0118a.C0121c;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: android.support.v4.app.u */
/* compiled from: NotificationCompat */
public class C0301u {

    /* renamed from: android.support.v4.app.u$a */
    /* compiled from: NotificationCompat */
    public static class C0302a {

        /* renamed from: a */
        final Bundle f682a;

        /* renamed from: b */
        boolean f683b;

        /* renamed from: c */
        public int f684c;

        /* renamed from: d */
        public CharSequence f685d;

        /* renamed from: e */
        public PendingIntent f686e;

        /* renamed from: f */
        private final C0317z[] f687f;

        /* renamed from: g */
        private final C0317z[] f688g;

        /* renamed from: h */
        private boolean f689h;

        /* renamed from: i */
        private final int f690i;

        /* renamed from: android.support.v4.app.u$a$a */
        /* compiled from: NotificationCompat */
        public static final class C0303a {

            /* renamed from: a */
            private final int f691a;

            /* renamed from: b */
            private final CharSequence f692b;

            /* renamed from: c */
            private final PendingIntent f693c;

            /* renamed from: d */
            private boolean f694d;

            /* renamed from: e */
            private final Bundle f695e;

            /* renamed from: f */
            private ArrayList<C0317z> f696f;

            /* renamed from: g */
            private int f697g;

            /* renamed from: h */
            private boolean f698h;

            public C0303a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle(), null, true, 0, true);
            }

            private C0303a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0317z[] zVarArr, boolean z, int i2, boolean z2) {
                ArrayList<C0317z> arrayList;
                this.f694d = true;
                this.f698h = true;
                this.f691a = i;
                this.f692b = C0305c.m1094d(charSequence);
                this.f693c = pendingIntent;
                this.f695e = bundle;
                if (zVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(zVarArr));
                }
                this.f696f = arrayList;
                this.f694d = z;
                this.f697g = i2;
                this.f698h = z2;
            }

            /* renamed from: a */
            public C0302a mo1052a() {
                C0317z[] zVarArr;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (this.f696f != null) {
                    Iterator it = this.f696f.iterator();
                    while (it.hasNext()) {
                        C0317z zVar = (C0317z) it.next();
                        if (zVar.mo1113e()) {
                            arrayList.add(zVar);
                        } else {
                            arrayList2.add(zVar);
                        }
                    }
                }
                C0317z[] zVarArr2 = null;
                if (arrayList.isEmpty()) {
                    zVarArr = null;
                } else {
                    zVarArr = (C0317z[]) arrayList.toArray(new C0317z[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    zVarArr2 = (C0317z[]) arrayList2.toArray(new C0317z[arrayList2.size()]);
                }
                C0302a aVar = new C0302a(this.f691a, this.f692b, this.f693c, this.f695e, zVarArr2, zVarArr, this.f694d, this.f697g, this.f698h);
                return aVar;
            }
        }

        public C0302a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        C0302a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0317z[] zVarArr, C0317z[] zVarArr2, boolean z, int i2, boolean z2) {
            this.f683b = true;
            this.f684c = i;
            this.f685d = C0305c.m1094d(charSequence);
            this.f686e = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.f682a = bundle;
            this.f687f = zVarArr;
            this.f688g = zVarArr2;
            this.f689h = z;
            this.f690i = i2;
            this.f683b = z2;
        }

        /* renamed from: a */
        public int mo1043a() {
            return this.f684c;
        }

        /* renamed from: b */
        public CharSequence mo1044b() {
            return this.f685d;
        }

        /* renamed from: c */
        public PendingIntent mo1045c() {
            return this.f686e;
        }

        /* renamed from: d */
        public Bundle mo1046d() {
            return this.f682a;
        }

        /* renamed from: e */
        public boolean mo1047e() {
            return this.f689h;
        }

        /* renamed from: f */
        public C0317z[] mo1048f() {
            return this.f687f;
        }

        /* renamed from: g */
        public int mo1049g() {
            return this.f690i;
        }

        /* renamed from: h */
        public C0317z[] mo1050h() {
            return this.f688g;
        }

        /* renamed from: i */
        public boolean mo1051i() {
            return this.f683b;
        }
    }

    /* renamed from: android.support.v4.app.u$b */
    /* compiled from: NotificationCompat */
    public static class C0304b extends C0306d {

        /* renamed from: e */
        private CharSequence f699e;

        /* renamed from: a */
        public C0304b mo1053a(CharSequence charSequence) {
            this.f699e = C0305c.m1094d(charSequence);
            return this;
        }

        /* renamed from: a */
        public void mo1054a(C0300t tVar) {
            if (VERSION.SDK_INT >= 16) {
                BigTextStyle bigText = new BigTextStyle(tVar.mo1042a()).setBigContentTitle(this.f742b).bigText(this.f699e);
                if (this.f744d) {
                    bigText.setSummaryText(this.f743c);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.u$c */
    /* compiled from: NotificationCompat */
    public static class C0305c {

        /* renamed from: A */
        String f700A;

        /* renamed from: B */
        Bundle f701B;

        /* renamed from: C */
        int f702C;

        /* renamed from: D */
        int f703D;

        /* renamed from: E */
        Notification f704E;

        /* renamed from: F */
        RemoteViews f705F;

        /* renamed from: G */
        RemoteViews f706G;

        /* renamed from: H */
        RemoteViews f707H;

        /* renamed from: I */
        String f708I;

        /* renamed from: J */
        int f709J;

        /* renamed from: K */
        String f710K;

        /* renamed from: L */
        long f711L;

        /* renamed from: M */
        int f712M;

        /* renamed from: N */
        Notification f713N;
        @Deprecated

        /* renamed from: O */
        public ArrayList<String> f714O;

        /* renamed from: a */
        public Context f715a;

        /* renamed from: b */
        public ArrayList<C0302a> f716b;

        /* renamed from: c */
        ArrayList<C0302a> f717c;

        /* renamed from: d */
        CharSequence f718d;

        /* renamed from: e */
        CharSequence f719e;

        /* renamed from: f */
        PendingIntent f720f;

        /* renamed from: g */
        PendingIntent f721g;

        /* renamed from: h */
        RemoteViews f722h;

        /* renamed from: i */
        Bitmap f723i;

        /* renamed from: j */
        CharSequence f724j;

        /* renamed from: k */
        int f725k;

        /* renamed from: l */
        int f726l;

        /* renamed from: m */
        boolean f727m;

        /* renamed from: n */
        boolean f728n;

        /* renamed from: o */
        C0306d f729o;

        /* renamed from: p */
        CharSequence f730p;

        /* renamed from: q */
        CharSequence[] f731q;

        /* renamed from: r */
        int f732r;

        /* renamed from: s */
        int f733s;

        /* renamed from: t */
        boolean f734t;

        /* renamed from: u */
        String f735u;

        /* renamed from: v */
        boolean f736v;

        /* renamed from: w */
        String f737w;

        /* renamed from: x */
        boolean f738x;

        /* renamed from: y */
        boolean f739y;

        /* renamed from: z */
        boolean f740z;

        public C0305c(Context context, String str) {
            this.f716b = new ArrayList<>();
            this.f717c = new ArrayList<>();
            this.f727m = true;
            this.f738x = false;
            this.f702C = 0;
            this.f703D = 0;
            this.f709J = 0;
            this.f712M = 0;
            this.f713N = new Notification();
            this.f715a = context;
            this.f708I = str;
            this.f713N.when = System.currentTimeMillis();
            this.f713N.audioStreamType = -1;
            this.f726l = 0;
            this.f714O = new ArrayList<>();
        }

        @Deprecated
        public C0305c(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public C0305c mo1059a(long j) {
            this.f713N.when = j;
            return this;
        }

        /* renamed from: a */
        public C0305c mo1067a(boolean z) {
            this.f727m = z;
            return this;
        }

        /* renamed from: b */
        public C0305c mo1072b(boolean z) {
            this.f728n = z;
            return this;
        }

        /* renamed from: a */
        public C0305c mo1056a(int i) {
            this.f713N.icon = i;
            return this;
        }

        /* renamed from: a */
        public C0305c mo1065a(CharSequence charSequence) {
            this.f718d = m1094d(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0305c mo1071b(CharSequence charSequence) {
            this.f719e = m1094d(charSequence);
            return this;
        }

        /* renamed from: a */
        public C0305c mo1057a(int i, int i2, boolean z) {
            this.f732r = i;
            this.f733s = i2;
            this.f734t = z;
            return this;
        }

        /* renamed from: a */
        public C0305c mo1060a(PendingIntent pendingIntent) {
            this.f720f = pendingIntent;
            return this;
        }

        /* renamed from: b */
        public C0305c mo1070b(PendingIntent pendingIntent) {
            this.f713N.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public C0305c mo1075c(CharSequence charSequence) {
            this.f713N.tickerText = m1094d(charSequence);
            return this;
        }

        /* renamed from: a */
        public C0305c mo1061a(Bitmap bitmap) {
            this.f723i = m1093b(bitmap);
            return this;
        }

        /* renamed from: b */
        private Bitmap m1093b(Bitmap bitmap) {
            if (bitmap == null || VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f715a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0120b.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C0120b.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        /* renamed from: a */
        public C0305c mo1062a(Uri uri) {
            this.f713N.sound = uri;
            this.f713N.audioStreamType = -1;
            if (VERSION.SDK_INT >= 21) {
                this.f713N.audioAttributes = new Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: c */
        public C0305c mo1076c(boolean z) {
            m1092a(2, z);
            return this;
        }

        /* renamed from: d */
        public C0305c mo1079d(boolean z) {
            this.f739y = z;
            this.f740z = true;
            return this;
        }

        /* renamed from: e */
        public C0305c mo1082e(boolean z) {
            m1092a(16, z);
            return this;
        }

        /* renamed from: f */
        public C0305c mo1084f(boolean z) {
            this.f738x = z;
            return this;
        }

        /* renamed from: b */
        public C0305c mo1069b(int i) {
            this.f713N.defaults = i;
            if ((i & 4) != 0) {
                this.f713N.flags |= 1;
            }
            return this;
        }

        /* renamed from: a */
        private void m1092a(int i, boolean z) {
            if (z) {
                Notification notification = this.f713N;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f713N;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        /* renamed from: c */
        public C0305c mo1074c(int i) {
            this.f726l = i;
            return this;
        }

        /* renamed from: a */
        public Bundle mo1055a() {
            if (this.f701B == null) {
                this.f701B = new Bundle();
            }
            return this.f701B;
        }

        /* renamed from: a */
        public C0305c mo1058a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f716b.add(new C0302a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C0305c mo1063a(C0302a aVar) {
            this.f716b.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C0305c mo1064a(C0306d dVar) {
            if (this.f729o != dVar) {
                this.f729o = dVar;
                if (this.f729o != null) {
                    this.f729o.mo1088a(this);
                }
            }
            return this;
        }

        /* renamed from: d */
        public C0305c mo1078d(int i) {
            this.f702C = i;
            return this;
        }

        /* renamed from: e */
        public C0305c mo1081e(int i) {
            this.f703D = i;
            return this;
        }

        /* renamed from: a */
        public C0305c mo1066a(String str) {
            this.f708I = str;
            return this;
        }

        /* renamed from: f */
        public C0305c mo1083f(int i) {
            this.f709J = i;
            return this;
        }

        /* renamed from: b */
        public Notification mo1068b() {
            return new C0307v(this).mo1092b();
        }

        /* renamed from: d */
        protected static CharSequence m1094d(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: c */
        public long mo1073c() {
            if (this.f727m) {
                return this.f713N.when;
            }
            return 0;
        }

        /* renamed from: d */
        public int mo1077d() {
            return this.f726l;
        }

        /* renamed from: e */
        public int mo1080e() {
            return this.f702C;
        }
    }

    /* renamed from: android.support.v4.app.u$d */
    /* compiled from: NotificationCompat */
    public static abstract class C0306d {

        /* renamed from: a */
        protected C0305c f741a;

        /* renamed from: b */
        CharSequence f742b;

        /* renamed from: c */
        CharSequence f743c;

        /* renamed from: d */
        boolean f744d = false;

        /* renamed from: a */
        public void mo1087a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1054a(C0300t tVar) {
        }

        /* renamed from: b */
        public RemoteViews mo1089b(C0300t tVar) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews mo1090c(C0300t tVar) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo1091d(C0300t tVar) {
            return null;
        }

        /* renamed from: a */
        public void mo1088a(C0305c cVar) {
            if (this.f741a != cVar) {
                this.f741a = cVar;
                if (this.f741a != null) {
                    this.f741a.mo1064a(this);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01b9  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01c7  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01e9  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x022c  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0231  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0233  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x023c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews mo1086a(boolean r18, int r19, boolean r20) {
            /*
                r17 = this;
                r0 = r17
                android.support.v4.app.u$c r2 = r0.f741a
                android.content.Context r2 = r2.f715a
                android.content.res.Resources r2 = r2.getResources()
                android.widget.RemoteViews r9 = new android.widget.RemoteViews
                android.support.v4.app.u$c r3 = r0.f741a
                android.content.Context r3 = r3.f715a
                java.lang.String r3 = r3.getPackageName()
                r4 = r19
                r9.<init>(r3, r4)
                android.support.v4.app.u$c r3 = r0.f741a
                int r3 = r3.mo1077d()
                r4 = -1
                r10 = 1
                r11 = 0
                if (r3 >= r4) goto L_0x0026
                r3 = r10
                goto L_0x0027
            L_0x0026:
                r3 = r11
            L_0x0027:
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 21
                r12 = 16
                if (r5 < r12) goto L_0x005a
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 >= r6) goto L_0x005a
                if (r3 == 0) goto L_0x0048
                int r3 = android.support.p012a.C0118a.C0122d.notification_background
                java.lang.String r5 = "setBackgroundResource"
                int r7 = android.support.p012a.C0118a.C0121c.notification_bg_low
                r9.setInt(r3, r5, r7)
                int r3 = android.support.p012a.C0118a.C0122d.icon
                java.lang.String r5 = "setBackgroundResource"
                int r7 = android.support.p012a.C0118a.C0121c.notification_template_icon_low_bg
                r9.setInt(r3, r5, r7)
                goto L_0x005a
            L_0x0048:
                int r3 = android.support.p012a.C0118a.C0122d.notification_background
                java.lang.String r5 = "setBackgroundResource"
                int r7 = android.support.p012a.C0118a.C0121c.notification_bg
                r9.setInt(r3, r5, r7)
                int r3 = android.support.p012a.C0118a.C0122d.icon
                java.lang.String r5 = "setBackgroundResource"
                int r7 = android.support.p012a.C0118a.C0121c.notification_template_icon_bg
                r9.setInt(r3, r5, r7)
            L_0x005a:
                android.support.v4.app.u$c r3 = r0.f741a
                android.graphics.Bitmap r3 = r3.f723i
                r13 = 8
                if (r3 == 0) goto L_0x00c3
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r12) goto L_0x0075
                int r3 = android.support.p012a.C0118a.C0122d.icon
                r9.setViewVisibility(r3, r11)
                int r3 = android.support.p012a.C0118a.C0122d.icon
                android.support.v4.app.u$c r5 = r0.f741a
                android.graphics.Bitmap r5 = r5.f723i
                r9.setImageViewBitmap(r3, r5)
                goto L_0x007a
            L_0x0075:
                int r3 = android.support.p012a.C0118a.C0122d.icon
                r9.setViewVisibility(r3, r13)
            L_0x007a:
                if (r18 == 0) goto L_0x010e
                android.support.v4.app.u$c r1 = r0.f741a
                android.app.Notification r1 = r1.f713N
                int r1 = r1.icon
                if (r1 == 0) goto L_0x010e
                int r1 = android.support.p012a.C0118a.C0120b.notification_right_icon_size
                int r1 = r2.getDimensionPixelSize(r1)
                int r3 = android.support.p012a.C0118a.C0120b.notification_small_icon_background_padding
                int r3 = r2.getDimensionPixelSize(r3)
                int r3 = r3 * 2
                int r3 = r1 - r3
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r6) goto L_0x00ae
                android.support.v4.app.u$c r4 = r0.f741a
                android.app.Notification r4 = r4.f713N
                int r4 = r4.icon
                android.support.v4.app.u$c r5 = r0.f741a
                int r5 = r5.mo1080e()
                android.graphics.Bitmap r1 = r0.m1126a(r4, r1, r3, r5)
                int r3 = android.support.p012a.C0118a.C0122d.right_icon
                r9.setImageViewBitmap(r3, r1)
                goto L_0x00bd
            L_0x00ae:
                int r1 = android.support.p012a.C0118a.C0122d.right_icon
                android.support.v4.app.u$c r3 = r0.f741a
                android.app.Notification r3 = r3.f713N
                int r3 = r3.icon
                android.graphics.Bitmap r3 = r0.mo1085a(r3, r4)
                r9.setImageViewBitmap(r1, r3)
            L_0x00bd:
                int r1 = android.support.p012a.C0118a.C0122d.right_icon
                r9.setViewVisibility(r1, r11)
                goto L_0x010e
            L_0x00c3:
                if (r18 == 0) goto L_0x010e
                android.support.v4.app.u$c r1 = r0.f741a
                android.app.Notification r1 = r1.f713N
                int r1 = r1.icon
                if (r1 == 0) goto L_0x010e
                int r1 = android.support.p012a.C0118a.C0122d.icon
                r9.setViewVisibility(r1, r11)
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r6) goto L_0x00ff
                int r1 = android.support.p012a.C0118a.C0120b.notification_large_icon_width
                int r1 = r2.getDimensionPixelSize(r1)
                int r3 = android.support.p012a.C0118a.C0120b.notification_big_circle_margin
                int r3 = r2.getDimensionPixelSize(r3)
                int r1 = r1 - r3
                int r3 = android.support.p012a.C0118a.C0120b.notification_small_icon_size_as_large
                int r3 = r2.getDimensionPixelSize(r3)
                android.support.v4.app.u$c r4 = r0.f741a
                android.app.Notification r4 = r4.f713N
                int r4 = r4.icon
                android.support.v4.app.u$c r5 = r0.f741a
                int r5 = r5.mo1080e()
                android.graphics.Bitmap r1 = r0.m1126a(r4, r1, r3, r5)
                int r3 = android.support.p012a.C0118a.C0122d.icon
                r9.setImageViewBitmap(r3, r1)
                goto L_0x010e
            L_0x00ff:
                int r1 = android.support.p012a.C0118a.C0122d.icon
                android.support.v4.app.u$c r3 = r0.f741a
                android.app.Notification r3 = r3.f713N
                int r3 = r3.icon
                android.graphics.Bitmap r3 = r0.mo1085a(r3, r4)
                r9.setImageViewBitmap(r1, r3)
            L_0x010e:
                android.support.v4.app.u$c r1 = r0.f741a
                java.lang.CharSequence r1 = r1.f718d
                if (r1 == 0) goto L_0x011d
                int r1 = android.support.p012a.C0118a.C0122d.title
                android.support.v4.app.u$c r3 = r0.f741a
                java.lang.CharSequence r3 = r3.f718d
                r9.setTextViewText(r1, r3)
            L_0x011d:
                android.support.v4.app.u$c r1 = r0.f741a
                java.lang.CharSequence r1 = r1.f719e
                if (r1 == 0) goto L_0x012e
                int r1 = android.support.p012a.C0118a.C0122d.text
                android.support.v4.app.u$c r3 = r0.f741a
                java.lang.CharSequence r3 = r3.f719e
                r9.setTextViewText(r1, r3)
                r1 = r10
                goto L_0x012f
            L_0x012e:
                r1 = r11
            L_0x012f:
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 >= r6) goto L_0x013b
                android.support.v4.app.u$c r3 = r0.f741a
                android.graphics.Bitmap r3 = r3.f723i
                if (r3 == 0) goto L_0x013b
                r3 = r10
                goto L_0x013c
            L_0x013b:
                r3 = r11
            L_0x013c:
                android.support.v4.app.u$c r4 = r0.f741a
                java.lang.CharSequence r4 = r4.f724j
                if (r4 == 0) goto L_0x0153
                int r1 = android.support.p012a.C0118a.C0122d.info
                android.support.v4.app.u$c r3 = r0.f741a
                java.lang.CharSequence r3 = r3.f724j
                r9.setTextViewText(r1, r3)
                int r1 = android.support.p012a.C0118a.C0122d.info
                r9.setViewVisibility(r1, r11)
            L_0x0150:
                r1 = r10
                r14 = r1
                goto L_0x0190
            L_0x0153:
                android.support.v4.app.u$c r4 = r0.f741a
                int r4 = r4.f725k
                if (r4 <= 0) goto L_0x0189
                int r1 = android.support.p012a.C0118a.C0123e.status_bar_notification_info_maxnum
                int r1 = r2.getInteger(r1)
                android.support.v4.app.u$c r3 = r0.f741a
                int r3 = r3.f725k
                if (r3 <= r1) goto L_0x0171
                int r1 = android.support.p012a.C0118a.C0122d.info
                int r3 = android.support.p012a.C0118a.C0124f.status_bar_notification_info_overflow
                java.lang.String r3 = r2.getString(r3)
                r9.setTextViewText(r1, r3)
                goto L_0x0183
            L_0x0171:
                java.text.NumberFormat r1 = java.text.NumberFormat.getIntegerInstance()
                int r3 = android.support.p012a.C0118a.C0122d.info
                android.support.v4.app.u$c r4 = r0.f741a
                int r4 = r4.f725k
                long r4 = (long) r4
                java.lang.String r1 = r1.format(r4)
                r9.setTextViewText(r3, r1)
            L_0x0183:
                int r1 = android.support.p012a.C0118a.C0122d.info
                r9.setViewVisibility(r1, r11)
                goto L_0x0150
            L_0x0189:
                int r4 = android.support.p012a.C0118a.C0122d.info
                r9.setViewVisibility(r4, r13)
                r14 = r1
                r1 = r3
            L_0x0190:
                android.support.v4.app.u$c r3 = r0.f741a
                java.lang.CharSequence r3 = r3.f730p
                if (r3 == 0) goto L_0x01be
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r12) goto L_0x01be
                int r3 = android.support.p012a.C0118a.C0122d.text
                android.support.v4.app.u$c r4 = r0.f741a
                java.lang.CharSequence r4 = r4.f730p
                r9.setTextViewText(r3, r4)
                android.support.v4.app.u$c r3 = r0.f741a
                java.lang.CharSequence r3 = r3.f719e
                if (r3 == 0) goto L_0x01b9
                int r3 = android.support.p012a.C0118a.C0122d.text2
                android.support.v4.app.u$c r4 = r0.f741a
                java.lang.CharSequence r4 = r4.f719e
                r9.setTextViewText(r3, r4)
                int r3 = android.support.p012a.C0118a.C0122d.text2
                r9.setViewVisibility(r3, r11)
                r3 = r10
                goto L_0x01bf
            L_0x01b9:
                int r3 = android.support.p012a.C0118a.C0122d.text2
                r9.setViewVisibility(r3, r13)
            L_0x01be:
                r3 = r11
            L_0x01bf:
                if (r3 == 0) goto L_0x01dd
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r12) goto L_0x01dd
                if (r20 == 0) goto L_0x01d3
                int r3 = android.support.p012a.C0118a.C0120b.notification_subtext_size
                int r2 = r2.getDimensionPixelSize(r3)
                float r2 = (float) r2
                int r3 = android.support.p012a.C0118a.C0122d.text
                r9.setTextViewTextSize(r3, r11, r2)
            L_0x01d3:
                int r4 = android.support.p012a.C0118a.C0122d.line1
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r3 = r9
                r3.setViewPadding(r4, r5, r6, r7, r8)
            L_0x01dd:
                android.support.v4.app.u$c r2 = r0.f741a
                long r2 = r2.mo1073c()
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x022c
                android.support.v4.app.u$c r1 = r0.f741a
                boolean r1 = r1.f728n
                if (r1 == 0) goto L_0x0219
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r12) goto L_0x0219
                int r1 = android.support.p012a.C0118a.C0122d.chronometer
                r9.setViewVisibility(r1, r11)
                int r1 = android.support.p012a.C0118a.C0122d.chronometer
                java.lang.String r2 = "setBase"
                android.support.v4.app.u$c r3 = r0.f741a
                long r3 = r3.mo1073c()
                long r5 = android.os.SystemClock.elapsedRealtime()
                long r7 = java.lang.System.currentTimeMillis()
                long r15 = r5 - r7
                long r5 = r3 + r15
                r9.setLong(r1, r2, r5)
                int r1 = android.support.p012a.C0118a.C0122d.chronometer
                java.lang.String r2 = "setStarted"
                r9.setBoolean(r1, r2, r10)
                goto L_0x022d
            L_0x0219:
                int r1 = android.support.p012a.C0118a.C0122d.time
                r9.setViewVisibility(r1, r11)
                int r1 = android.support.p012a.C0118a.C0122d.time
                java.lang.String r2 = "setTime"
                android.support.v4.app.u$c r3 = r0.f741a
                long r3 = r3.mo1073c()
                r9.setLong(r1, r2, r3)
                goto L_0x022d
            L_0x022c:
                r10 = r1
            L_0x022d:
                int r1 = android.support.p012a.C0118a.C0122d.right_side
                if (r10 == 0) goto L_0x0233
                r2 = r11
                goto L_0x0234
            L_0x0233:
                r2 = r13
            L_0x0234:
                r9.setViewVisibility(r1, r2)
                int r1 = android.support.p012a.C0118a.C0122d.line3
                if (r14 == 0) goto L_0x023c
                goto L_0x023d
            L_0x023c:
                r11 = r13
            L_0x023d:
                r9.setViewVisibility(r1, r11)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.app.C0301u.C0306d.mo1086a(boolean, int, boolean):android.widget.RemoteViews");
        }

        /* renamed from: a */
        public Bitmap mo1085a(int i, int i2) {
            return m1125a(i, i2, 0);
        }

        /* renamed from: a */
        private Bitmap m1125a(int i, int i2, int i3) {
            Drawable drawable = this.f741a.f715a.getResources().getDrawable(i);
            int intrinsicWidth = i3 == 0 ? drawable.getIntrinsicWidth() : i3;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_IN));
            }
            drawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: a */
        private Bitmap m1126a(int i, int i2, int i3, int i4) {
            int i5 = C0121c.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap a = m1125a(i5, i4, i2);
            Canvas canvas = new Canvas(a);
            Drawable mutate = this.f741a.f715a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, Mode.SRC_ATOP));
            mutate.draw(canvas);
            return a;
        }
    }

    /* renamed from: a */
    public static Bundle m1079a(Notification notification) {
        if (VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (VERSION.SDK_INT >= 16) {
            return C0308w.m1141a(notification);
        }
        return null;
    }
}
