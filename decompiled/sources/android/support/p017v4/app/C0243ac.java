package android.support.p017v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.p017v4.content.C0356c;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.app.ac */
/* compiled from: TaskStackBuilder */
public final class C0243ac implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f484a = new ArrayList<>();

    /* renamed from: b */
    private final Context f485b;

    /* renamed from: android.support.v4.app.ac$a */
    /* compiled from: TaskStackBuilder */
    public interface C0244a {
        /* renamed from: b_ */
        Intent mo801b_();
    }

    private C0243ac(Context context) {
        this.f485b = context;
    }

    /* renamed from: a */
    public static C0243ac m724a(Context context) {
        return new C0243ac(context);
    }

    /* renamed from: a */
    public C0243ac mo797a(Intent intent) {
        this.f484a.add(intent);
        return this;
    }

    /* renamed from: a */
    public C0243ac mo795a(Activity activity) {
        Intent b_ = activity instanceof C0244a ? ((C0244a) activity).mo801b_() : null;
        if (b_ == null) {
            b_ = C0299s.m1072a(activity);
        }
        if (b_ != null) {
            ComponentName component = b_.getComponent();
            if (component == null) {
                component = b_.resolveActivity(this.f485b.getPackageManager());
            }
            mo796a(component);
            mo797a(b_);
        }
        return this;
    }

    /* renamed from: a */
    public C0243ac mo796a(ComponentName componentName) {
        int size = this.f484a.size();
        try {
            Intent a = C0299s.m1073a(this.f485b, componentName);
            while (a != null) {
                this.f484a.add(size, a);
                a = C0299s.m1073a(this.f485b, a.getComponent());
            }
            return this;
        } catch (NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f484a.iterator();
    }

    /* renamed from: a */
    public void mo798a() {
        mo799a((Bundle) null);
    }

    /* renamed from: a */
    public void mo799a(Bundle bundle) {
        if (this.f484a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f484a.toArray(new Intent[this.f484a.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!C0356c.m1315a(this.f485b, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f485b.startActivity(intent);
        }
    }
}
