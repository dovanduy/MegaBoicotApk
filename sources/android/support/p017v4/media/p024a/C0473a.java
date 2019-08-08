package android.support.p017v4.media.p024a;

import android.app.Notification.MediaStyle;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build.VERSION;
import android.support.p016d.C0180a.C0181a;
import android.support.p016d.C0180a.C0182b;
import android.support.p016d.C0180a.C0183c;
import android.support.p017v4.app.C0300t;
import android.support.p017v4.app.C0301u.C0302a;
import android.support.p017v4.app.C0301u.C0306d;
import android.support.p017v4.media.session.MediaSessionCompat.Token;
import android.widget.RemoteViews;

/* renamed from: android.support.v4.media.a.a */
/* compiled from: NotificationCompat */
public class C0473a {

    /* renamed from: android.support.v4.media.a.a$a */
    /* compiled from: NotificationCompat */
    public static class C0474a extends C0306d {

        /* renamed from: e */
        int[] f1220e = null;

        /* renamed from: f */
        Token f1221f;

        /* renamed from: g */
        boolean f1222g;

        /* renamed from: h */
        PendingIntent f1223h;

        /* renamed from: a */
        public C0474a mo1651a(int... iArr) {
            this.f1220e = iArr;
            return this;
        }

        /* renamed from: a */
        public C0474a mo1649a(Token token) {
            this.f1221f = token;
            return this;
        }

        /* renamed from: a */
        public C0474a mo1650a(boolean z) {
            if (VERSION.SDK_INT < 21) {
                this.f1222g = z;
            }
            return this;
        }

        /* renamed from: a */
        public C0474a mo1648a(PendingIntent pendingIntent) {
            this.f1223h = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public void mo1054a(C0300t tVar) {
            if (VERSION.SDK_INT >= 21) {
                tVar.mo1042a().setStyle(mo1647a(new MediaStyle()));
            } else if (this.f1222g) {
                tVar.mo1042a().setOngoing(true);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public MediaStyle mo1647a(MediaStyle mediaStyle) {
            if (this.f1220e != null) {
                mediaStyle.setShowActionsInCompactView(this.f1220e);
            }
            if (this.f1221f != null) {
                mediaStyle.setMediaSession((MediaSession.Token) this.f1221f.mo1733a());
            }
            return mediaStyle;
        }

        /* renamed from: b */
        public RemoteViews mo1089b(C0300t tVar) {
            if (VERSION.SDK_INT >= 21) {
                return null;
            }
            return mo1652a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public RemoteViews mo1652a() {
            int i;
            RemoteViews a = mo1086a(false, mo1653b(), true);
            int size = this.f741a.f716b.size();
            if (this.f1220e == null) {
                i = 0;
            } else {
                i = Math.min(this.f1220e.length, 3);
            }
            a.removeAllViews(C0181a.media_actions);
            if (i > 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 >= size) {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                    }
                    a.addView(C0181a.media_actions, m1762a((C0302a) this.f741a.f716b.get(this.f1220e[i2])));
                }
            }
            if (this.f1222g) {
                a.setViewVisibility(C0181a.end_padder, 8);
                a.setViewVisibility(C0181a.cancel_action, 0);
                a.setOnClickPendingIntent(C0181a.cancel_action, this.f1223h);
                a.setInt(C0181a.cancel_action, "setAlpha", this.f741a.f715a.getResources().getInteger(C0182b.cancel_button_image_alpha));
            } else {
                a.setViewVisibility(C0181a.end_padder, 0);
                a.setViewVisibility(C0181a.cancel_action, 8);
            }
            return a;
        }

        /* renamed from: a */
        private RemoteViews m1762a(C0302a aVar) {
            boolean z = aVar.mo1045c() == null;
            RemoteViews remoteViews = new RemoteViews(this.f741a.f715a.getPackageName(), C0183c.notification_media_action);
            remoteViews.setImageViewResource(C0181a.action0, aVar.mo1043a());
            if (!z) {
                remoteViews.setOnClickPendingIntent(C0181a.action0, aVar.mo1045c());
            }
            if (VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(C0181a.action0, aVar.mo1044b());
            }
            return remoteViews;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo1653b() {
            return C0183c.notification_template_media;
        }

        /* renamed from: c */
        public RemoteViews mo1090c(C0300t tVar) {
            if (VERSION.SDK_INT >= 21) {
                return null;
            }
            return mo1654c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public RemoteViews mo1654c() {
            int min = Math.min(this.f741a.f716b.size(), 5);
            RemoteViews a = mo1086a(false, mo1646a(min), false);
            a.removeAllViews(C0181a.media_actions);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    a.addView(C0181a.media_actions, m1762a((C0302a) this.f741a.f716b.get(i)));
                }
            }
            if (this.f1222g) {
                a.setViewVisibility(C0181a.cancel_action, 0);
                a.setInt(C0181a.cancel_action, "setAlpha", this.f741a.f715a.getResources().getInteger(C0182b.cancel_button_image_alpha));
                a.setOnClickPendingIntent(C0181a.cancel_action, this.f1223h);
            } else {
                a.setViewVisibility(C0181a.cancel_action, 8);
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo1646a(int i) {
            return i <= 3 ? C0183c.notification_template_big_media_narrow : C0183c.notification_template_big_media;
        }
    }
}
