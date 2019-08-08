package android.support.p017v4.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.app.C0301u.C0302a;
import android.support.p017v4.app.C0301u.C0305c;
import android.support.p017v4.app.C0301u.C0306d;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.v */
/* compiled from: NotificationCompatBuilder */
class C0307v implements C0300t {

    /* renamed from: a */
    private final Builder f745a;

    /* renamed from: b */
    private final C0305c f746b;

    /* renamed from: c */
    private RemoteViews f747c;

    /* renamed from: d */
    private RemoteViews f748d;

    /* renamed from: e */
    private final List<Bundle> f749e = new ArrayList();

    /* renamed from: f */
    private final Bundle f750f = new Bundle();

    /* renamed from: g */
    private int f751g;

    /* renamed from: h */
    private RemoteViews f752h;

    C0307v(C0305c cVar) {
        this.f746b = cVar;
        if (VERSION.SDK_INT >= 26) {
            this.f745a = new Builder(cVar.f715a, cVar.f708I);
        } else {
            this.f745a = new Builder(cVar.f715a);
        }
        Notification notification = cVar.f713N;
        this.f745a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.f722h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.f718d).setContentText(cVar.f719e).setContentInfo(cVar.f724j).setContentIntent(cVar.f720f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.f721g, (notification.flags & 128) != 0).setLargeIcon(cVar.f723i).setNumber(cVar.f725k).setProgress(cVar.f732r, cVar.f733s, cVar.f734t);
        if (VERSION.SDK_INT < 21) {
            this.f745a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f745a.setSubText(cVar.f730p).setUsesChronometer(cVar.f728n).setPriority(cVar.f726l);
            Iterator it = cVar.f716b.iterator();
            while (it.hasNext()) {
                m1136a((C0302a) it.next());
            }
            if (cVar.f701B != null) {
                this.f750f.putAll(cVar.f701B);
            }
            if (VERSION.SDK_INT < 20) {
                if (cVar.f738x) {
                    this.f750f.putBoolean("android.support.localOnly", true);
                }
                if (cVar.f735u != null) {
                    this.f750f.putString("android.support.groupKey", cVar.f735u);
                    if (cVar.f736v) {
                        this.f750f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f750f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (cVar.f737w != null) {
                    this.f750f.putString("android.support.sortKey", cVar.f737w);
                }
            }
            this.f747c = cVar.f705F;
            this.f748d = cVar.f706G;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f745a.setShowWhen(cVar.f727m);
            if (VERSION.SDK_INT < 21 && cVar.f714O != null && !cVar.f714O.isEmpty()) {
                this.f750f.putStringArray("android.people", (String[]) cVar.f714O.toArray(new String[cVar.f714O.size()]));
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.f745a.setLocalOnly(cVar.f738x).setGroup(cVar.f735u).setGroupSummary(cVar.f736v).setSortKey(cVar.f737w);
            this.f751g = cVar.f712M;
        }
        if (VERSION.SDK_INT >= 21) {
            this.f745a.setCategory(cVar.f700A).setColor(cVar.f702C).setVisibility(cVar.f703D).setPublicVersion(cVar.f704E).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = cVar.f714O.iterator();
            while (it2.hasNext()) {
                this.f745a.addPerson((String) it2.next());
            }
            this.f752h = cVar.f707H;
            if (cVar.f717c.size() > 0) {
                Bundle bundle = cVar.mo1055a().getBundle("android.car.EXTENSIONS");
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = new Bundle();
                for (int i = 0; i < cVar.f717c.size(); i++) {
                    bundle2.putBundle(Integer.toString(i), C0308w.m1142a((C0302a) cVar.f717c.get(i)));
                }
                bundle.putBundle("invisible_actions", bundle2);
                cVar.mo1055a().putBundle("android.car.EXTENSIONS", bundle);
                this.f750f.putBundle("android.car.EXTENSIONS", bundle);
            }
        }
        if (VERSION.SDK_INT >= 24) {
            this.f745a.setExtras(cVar.f701B).setRemoteInputHistory(cVar.f731q);
            if (cVar.f705F != null) {
                this.f745a.setCustomContentView(cVar.f705F);
            }
            if (cVar.f706G != null) {
                this.f745a.setCustomBigContentView(cVar.f706G);
            }
            if (cVar.f707H != null) {
                this.f745a.setCustomHeadsUpContentView(cVar.f707H);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.f745a.setBadgeIconType(cVar.f709J).setShortcutId(cVar.f710K).setTimeoutAfter(cVar.f711L).setGroupAlertBehavior(cVar.f712M);
            if (cVar.f740z) {
                this.f745a.setColorized(cVar.f739y);
            }
            if (!TextUtils.isEmpty(cVar.f708I)) {
                this.f745a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    /* renamed from: a */
    public Builder mo1042a() {
        return this.f745a;
    }

    /* renamed from: b */
    public Notification mo1092b() {
        C0306d dVar = this.f746b.f729o;
        if (dVar != null) {
            dVar.mo1054a((C0300t) this);
        }
        RemoteViews b = dVar != null ? dVar.mo1089b(this) : null;
        Notification c = mo1093c();
        if (b != null) {
            c.contentView = b;
        } else if (this.f746b.f705F != null) {
            c.contentView = this.f746b.f705F;
        }
        if (VERSION.SDK_INT >= 16 && dVar != null) {
            RemoteViews c2 = dVar.mo1090c(this);
            if (c2 != null) {
                c.bigContentView = c2;
            }
        }
        if (VERSION.SDK_INT >= 21 && dVar != null) {
            RemoteViews d = this.f746b.f729o.mo1091d(this);
            if (d != null) {
                c.headsUpContentView = d;
            }
        }
        if (VERSION.SDK_INT >= 16 && dVar != null) {
            Bundle a = C0301u.m1079a(c);
            if (a != null) {
                dVar.mo1087a(a);
            }
        }
        return c;
    }

    /* renamed from: a */
    private void m1136a(C0302a aVar) {
        Bundle bundle;
        if (VERSION.SDK_INT >= 20) {
            Action.Builder builder = new Action.Builder(aVar.mo1043a(), aVar.mo1044b(), aVar.mo1045c());
            if (aVar.mo1048f() != null) {
                for (RemoteInput addRemoteInput : C0317z.m1170a(aVar.mo1048f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.mo1046d() != null) {
                bundle = new Bundle(aVar.mo1046d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1047e());
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo1047e());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo1049g());
            if (VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.mo1049g());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo1051i());
            builder.addExtras(bundle);
            this.f745a.addAction(builder.build());
        } else if (VERSION.SDK_INT >= 16) {
            this.f749e.add(C0308w.m1140a(this.f745a, aVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Notification mo1093c() {
        if (VERSION.SDK_INT >= 26) {
            return this.f745a.build();
        }
        if (VERSION.SDK_INT >= 24) {
            Notification build = this.f745a.build();
            if (this.f751g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f751g != 2)) {
                    m1135a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f751g == 1) {
                    m1135a(build);
                }
            }
            return build;
        } else if (VERSION.SDK_INT >= 21) {
            this.f745a.setExtras(this.f750f);
            Notification build2 = this.f745a.build();
            if (this.f747c != null) {
                build2.contentView = this.f747c;
            }
            if (this.f748d != null) {
                build2.bigContentView = this.f748d;
            }
            if (this.f752h != null) {
                build2.headsUpContentView = this.f752h;
            }
            if (this.f751g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f751g != 2)) {
                    m1135a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f751g == 1) {
                    m1135a(build2);
                }
            }
            return build2;
        } else if (VERSION.SDK_INT >= 20) {
            this.f745a.setExtras(this.f750f);
            Notification build3 = this.f745a.build();
            if (this.f747c != null) {
                build3.contentView = this.f747c;
            }
            if (this.f748d != null) {
                build3.bigContentView = this.f748d;
            }
            if (this.f751g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f751g != 2)) {
                    m1135a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f751g == 1) {
                    m1135a(build3);
                }
            }
            return build3;
        } else if (VERSION.SDK_INT >= 19) {
            SparseArray a = C0308w.m1144a(this.f749e);
            if (a != null) {
                this.f750f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f745a.setExtras(this.f750f);
            Notification build4 = this.f745a.build();
            if (this.f747c != null) {
                build4.contentView = this.f747c;
            }
            if (this.f748d != null) {
                build4.bigContentView = this.f748d;
            }
            return build4;
        } else if (VERSION.SDK_INT < 16) {
            return this.f745a.getNotification();
        } else {
            Notification build5 = this.f745a.build();
            Bundle a2 = C0301u.m1079a(build5);
            Bundle bundle = new Bundle(this.f750f);
            for (String str : this.f750f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray a3 = C0308w.m1144a(this.f749e);
            if (a3 != null) {
                C0301u.m1079a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            if (this.f747c != null) {
                build5.contentView = this.f747c;
            }
            if (this.f748d != null) {
                build5.bigContentView = this.f748d;
            }
            return build5;
        }
    }

    /* renamed from: a */
    private void m1135a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
