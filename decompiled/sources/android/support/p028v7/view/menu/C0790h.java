package android.support.p028v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.p018a.p019a.C0205a;
import android.support.p017v4.view.C0572b;
import android.support.p017v4.view.C0599s;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.h */
/* compiled from: MenuBuilder */
public class C0790h implements C0205a {

    /* renamed from: d */
    private static final int[] f2345d = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f2346A;

    /* renamed from: a */
    CharSequence f2347a;

    /* renamed from: b */
    Drawable f2348b;

    /* renamed from: c */
    View f2349c;

    /* renamed from: e */
    private final Context f2350e;

    /* renamed from: f */
    private final Resources f2351f;

    /* renamed from: g */
    private boolean f2352g;

    /* renamed from: h */
    private boolean f2353h;

    /* renamed from: i */
    private C0791a f2354i;

    /* renamed from: j */
    private ArrayList<C0794j> f2355j;

    /* renamed from: k */
    private ArrayList<C0794j> f2356k;

    /* renamed from: l */
    private boolean f2357l;

    /* renamed from: m */
    private ArrayList<C0794j> f2358m;

    /* renamed from: n */
    private ArrayList<C0794j> f2359n;

    /* renamed from: o */
    private boolean f2360o;

    /* renamed from: p */
    private int f2361p = 0;

    /* renamed from: q */
    private ContextMenuInfo f2362q;

    /* renamed from: r */
    private boolean f2363r = false;

    /* renamed from: s */
    private boolean f2364s = false;

    /* renamed from: t */
    private boolean f2365t = false;

    /* renamed from: u */
    private boolean f2366u = false;

    /* renamed from: v */
    private boolean f2367v = false;

    /* renamed from: w */
    private ArrayList<C0794j> f2368w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<C0806o>> f2369x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private C0794j f2370y;

    /* renamed from: z */
    private boolean f2371z = false;

    /* renamed from: android.support.v7.view.menu.h$a */
    /* compiled from: MenuBuilder */
    public interface C0791a {
        /* renamed from: a */
        void mo2661a(C0790h hVar);

        /* renamed from: a */
        boolean mo2667a(C0790h hVar, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.h$b */
    /* compiled from: MenuBuilder */
    public interface C0792b {
        /* renamed from: a */
        boolean mo3040a(C0794j jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo3162a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: q */
    public C0790h mo3218q() {
        return this;
    }

    public C0790h(Context context) {
        this.f2350e = context;
        this.f2351f = context.getResources();
        this.f2355j = new ArrayList<>();
        this.f2356k = new ArrayList<>();
        this.f2357l = true;
        this.f2358m = new ArrayList<>();
        this.f2359n = new ArrayList<>();
        this.f2360o = true;
        m3277e(true);
    }

    /* renamed from: a */
    public C0790h mo3156a(int i) {
        this.f2361p = i;
        return this;
    }

    /* renamed from: a */
    public void mo3166a(C0806o oVar) {
        mo3167a(oVar, this.f2350e);
    }

    /* renamed from: a */
    public void mo3167a(C0806o oVar, Context context) {
        this.f2369x.add(new WeakReference(oVar));
        oVar.mo3096a(context, this);
        this.f2360o = true;
    }

    /* renamed from: b */
    public void mo3186b(C0806o oVar) {
        Iterator it = this.f2369x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0806o oVar2 = (C0806o) weakReference.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.f2369x.remove(weakReference);
            }
        }
    }

    /* renamed from: d */
    private void m3276d(boolean z) {
        if (!this.f2369x.isEmpty()) {
            mo3205h();
            Iterator it = this.f2369x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0806o oVar = (C0806o) weakReference.get();
                if (oVar == null) {
                    this.f2369x.remove(weakReference);
                } else {
                    oVar.mo3106b(z);
                }
            }
            mo3207i();
        }
    }

    /* renamed from: a */
    private boolean m3275a(C0816u uVar, C0806o oVar) {
        boolean z = false;
        if (this.f2369x.isEmpty()) {
            return false;
        }
        if (oVar != null) {
            z = oVar.mo3103a(uVar);
        }
        Iterator it = this.f2369x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0806o oVar2 = (C0806o) weakReference.get();
            if (oVar2 == null) {
                this.f2369x.remove(weakReference);
            } else if (!z) {
                z = oVar2.mo3103a(uVar);
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo3163a(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0816u) item.getSubMenu()).mo3163a(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo3162a(), sparseArray);
        }
    }

    /* renamed from: b */
    public void mo3184b(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo3162a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0816u) item.getSubMenu()).mo3184b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3164a(C0791a aVar) {
        this.f2354i = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo3161a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m3278f(i3);
        C0794j a = m3272a(i, i2, i3, f, charSequence, this.f2361p);
        if (this.f2362q != null) {
            a.mo3238a(this.f2362q);
        }
        this.f2355j.add(m3271a(this.f2355j, f), a);
        mo3187b(true);
        return a;
    }

    /* renamed from: a */
    private C0794j m3272a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        C0794j jVar = new C0794j(this, i, i2, i3, i4, charSequence, i5);
        return jVar;
    }

    public MenuItem add(CharSequence charSequence) {
        return mo3161a(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return mo3161a(0, 0, 0, this.f2351f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo3161a(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo3161a(i, i2, i3, this.f2351f.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f2351f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0794j jVar = (C0794j) mo3161a(i, i2, i3, charSequence);
        C0816u uVar = new C0816u(this.f2350e, this, jVar);
        jVar.mo3237a(uVar);
        return uVar;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f2351f.getString(i4));
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f2371z = z;
    }

    /* renamed from: b */
    public boolean mo3188b() {
        return this.f2371z;
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f2350e.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public void removeItem(int i) {
        m3274a(mo3183b(i), true);
    }

    public void removeGroup(int i) {
        int c = mo3189c(i);
        if (c >= 0) {
            int size = this.f2355j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C0794j) this.f2355j.get(c)).getGroupId() != i) {
                    mo3187b(true);
                } else {
                    m3274a(c, false);
                    i2 = i3;
                }
            }
            mo3187b(true);
        }
    }

    /* renamed from: a */
    private void m3274a(int i, boolean z) {
        if (i >= 0 && i < this.f2355j.size()) {
            this.f2355j.remove(i);
            if (z) {
                mo3187b(true);
            }
        }
    }

    public void clear() {
        if (this.f2370y != null) {
            mo3198d(this.f2370y);
        }
        this.f2355j.clear();
        mo3187b(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3168a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2355j.size();
        mo3205h();
        for (int i = 0; i < size; i++) {
            C0794j jVar = (C0794j) this.f2355j.get(i);
            if (jVar.getGroupId() == groupId && jVar.mo3250g() && jVar.isCheckable()) {
                jVar.mo3241b(jVar == menuItem);
            }
        }
        mo3207i();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f2355j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0794j jVar = (C0794j) this.f2355j.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo3239a(z2);
                jVar.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f2355j.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0794j jVar = (C0794j) this.f2355j.get(i2);
            if (jVar.getGroupId() == i && jVar.mo3244c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo3187b(true);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f2355j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0794j jVar = (C0794j) this.f2355j.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f2346A) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0794j) this.f2355j.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0794j jVar = (C0794j) this.f2355j.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu()) {
                MenuItem findItem = jVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public int mo3183b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0794j) this.f2355j.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public int mo3189c(int i) {
        return mo3155a(i, 0);
    }

    /* renamed from: a */
    public int mo3155a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C0794j) this.f2355j.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int size() {
        return this.f2355j.size();
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f2355j.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo3160a(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.f2352g = z;
        mo3187b(false);
    }

    /* renamed from: f */
    private static int m3278f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 < 0 || i2 >= f2345d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (i & 65535) | (f2345d[i2] << 16);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo3191c() {
        return this.f2352g;
    }

    /* renamed from: e */
    private void m3277e(boolean z) {
        boolean z2 = true;
        if (!z || this.f2351f.getConfiguration().keyboard == 1 || !C0599s.m2289c(ViewConfiguration.get(this.f2350e), this.f2350e)) {
            z2 = false;
        }
        this.f2353h = z2;
    }

    /* renamed from: d */
    public boolean mo3197d() {
        return this.f2353h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Resources mo3199e() {
        return this.f2351f;
    }

    /* renamed from: f */
    public Context mo3201f() {
        return this.f2350e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3171a(C0790h hVar, MenuItem menuItem) {
        return this.f2354i != null && this.f2354i.mo2667a(hVar, menuItem);
    }

    /* renamed from: g */
    public void mo3203g() {
        if (this.f2354i != null) {
            this.f2354i.mo2661a(this);
        }
    }

    /* renamed from: a */
    private static int m3271a(ArrayList<C0794j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0794j) arrayList.get(size)).mo3243c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0794j a = mo3160a(i, keyEvent);
        boolean a2 = a != null ? mo3172a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo3170a(true);
        }
        return a2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3169a(List<C0794j> list, int i, KeyEvent keyEvent) {
        boolean c = mo3191c();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f2355j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0794j jVar = (C0794j) this.f2355j.get(i2);
                if (jVar.hasSubMenu()) {
                    ((C0790h) jVar.getSubMenu()).mo3169a(list, i, keyEvent);
                }
                char alphabeticShortcut = c ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & 69647) == ((c ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (c && alphabeticShortcut == 8 && i == 67)) && jVar.isEnabled())) {
                    list.add(jVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0794j mo3160a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0794j> arrayList = this.f2368w;
        arrayList.clear();
        mo3169a((List<C0794j>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0794j) arrayList.get(0);
        }
        boolean c2 = mo3191c();
        for (int i2 = 0; i2 < size; i2++) {
            C0794j jVar = (C0794j) arrayList.get(i2);
            if (c2) {
                c = jVar.getAlphabeticShortcut();
            } else {
                c = jVar.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (c2 && c == 8 && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo3172a(findItem(i), i2);
    }

    /* renamed from: a */
    public boolean mo3172a(MenuItem menuItem, int i) {
        return mo3173a(menuItem, (C0806o) null, i);
    }

    /* renamed from: a */
    public boolean mo3173a(MenuItem menuItem, C0806o oVar, int i) {
        C0794j jVar = (C0794j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean b = jVar.mo3242b();
        C0572b a = jVar.mo494a();
        boolean z = a != null && a.mo2062e();
        if (jVar.mo3274n()) {
            b |= jVar.expandActionView();
            if (b) {
                mo3170a(true);
            }
        } else if (jVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo3170a(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.mo3237a(new C0816u(mo3201f(), this, jVar));
            }
            C0816u uVar = (C0816u) jVar.getSubMenu();
            if (z) {
                a.mo2057a((SubMenu) uVar);
            }
            b |= m3275a(uVar, oVar);
            if (!b) {
                mo3170a(true);
            }
        } else if ((i & 1) == 0) {
            mo3170a(true);
        }
        return b;
    }

    /* renamed from: a */
    public final void mo3170a(boolean z) {
        if (!this.f2367v) {
            this.f2367v = true;
            Iterator it = this.f2369x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0806o oVar = (C0806o) weakReference.get();
                if (oVar == null) {
                    this.f2369x.remove(weakReference);
                } else {
                    oVar.mo3097a(this, z);
                }
            }
            this.f2367v = false;
        }
    }

    public void close() {
        mo3170a(true);
    }

    /* renamed from: b */
    public void mo3187b(boolean z) {
        if (!this.f2363r) {
            if (z) {
                this.f2357l = true;
                this.f2360o = true;
            }
            m3276d(z);
            return;
        }
        this.f2364s = true;
        if (z) {
            this.f2365t = true;
        }
    }

    /* renamed from: h */
    public void mo3205h() {
        if (!this.f2363r) {
            this.f2363r = true;
            this.f2364s = false;
            this.f2365t = false;
        }
    }

    /* renamed from: i */
    public void mo3207i() {
        this.f2363r = false;
        if (this.f2364s) {
            this.f2364s = false;
            mo3187b(this.f2365t);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3165a(C0794j jVar) {
        this.f2357l = true;
        mo3187b(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3185b(C0794j jVar) {
        this.f2360o = true;
        mo3187b(true);
    }

    /* renamed from: j */
    public ArrayList<C0794j> mo3209j() {
        if (!this.f2357l) {
            return this.f2356k;
        }
        this.f2356k.clear();
        int size = this.f2355j.size();
        for (int i = 0; i < size; i++) {
            C0794j jVar = (C0794j) this.f2355j.get(i);
            if (jVar.isVisible()) {
                this.f2356k.add(jVar);
            }
        }
        this.f2357l = false;
        this.f2360o = true;
        return this.f2356k;
    }

    /* renamed from: k */
    public void mo3210k() {
        ArrayList j = mo3209j();
        if (this.f2360o) {
            Iterator it = this.f2369x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0806o oVar = (C0806o) weakReference.get();
                if (oVar == null) {
                    this.f2369x.remove(weakReference);
                } else {
                    z |= oVar.mo3107b();
                }
            }
            if (z) {
                this.f2358m.clear();
                this.f2359n.clear();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    C0794j jVar = (C0794j) j.get(i);
                    if (jVar.mo3270j()) {
                        this.f2358m.add(jVar);
                    } else {
                        this.f2359n.add(jVar);
                    }
                }
            } else {
                this.f2358m.clear();
                this.f2359n.clear();
                this.f2359n.addAll(mo3209j());
            }
            this.f2360o = false;
        }
    }

    /* renamed from: l */
    public ArrayList<C0794j> mo3211l() {
        mo3210k();
        return this.f2358m;
    }

    /* renamed from: m */
    public ArrayList<C0794j> mo3212m() {
        mo3210k();
        return this.f2359n;
    }

    public void clearHeader() {
        this.f2348b = null;
        this.f2347a = null;
        this.f2349c = null;
        mo3187b(false);
    }

    /* renamed from: a */
    private void m3273a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources e = mo3199e();
        if (view != null) {
            this.f2349c = view;
            this.f2347a = null;
            this.f2348b = null;
        } else {
            if (i > 0) {
                this.f2347a = e.getText(i);
            } else if (charSequence != null) {
                this.f2347a = charSequence;
            }
            if (i2 > 0) {
                this.f2348b = C0356c.m1312a(mo3201f(), i2);
            } else if (drawable != null) {
                this.f2348b = drawable;
            }
            this.f2349c = null;
        }
        mo3187b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0790h mo3159a(CharSequence charSequence) {
        m3273a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0790h mo3196d(int i) {
        m3273a(i, null, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0790h mo3157a(Drawable drawable) {
        m3273a(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0790h mo3200e(int i) {
        m3273a(0, null, i, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0790h mo3158a(View view) {
        m3273a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: n */
    public CharSequence mo3213n() {
        return this.f2347a;
    }

    /* renamed from: o */
    public Drawable mo3214o() {
        return this.f2348b;
    }

    /* renamed from: p */
    public View mo3215p() {
        return this.f2349c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo3219r() {
        return this.f2366u;
    }

    /* renamed from: c */
    public boolean mo3192c(C0794j jVar) {
        boolean z = false;
        if (this.f2369x.isEmpty()) {
            return false;
        }
        mo3205h();
        Iterator it = this.f2369x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0806o oVar = (C0806o) weakReference.get();
            if (oVar == null) {
                this.f2369x.remove(weakReference);
            } else {
                z = oVar.mo3102a(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        mo3207i();
        if (z) {
            this.f2370y = jVar;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo3198d(C0794j jVar) {
        boolean z = false;
        if (this.f2369x.isEmpty() || this.f2370y != jVar) {
            return false;
        }
        mo3205h();
        Iterator it = this.f2369x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0806o oVar = (C0806o) weakReference.get();
            if (oVar == null) {
                this.f2369x.remove(weakReference);
            } else {
                z = oVar.mo3108b(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        mo3207i();
        if (z) {
            this.f2370y = null;
        }
        return z;
    }

    /* renamed from: s */
    public C0794j mo3222s() {
        return this.f2370y;
    }

    /* renamed from: c */
    public void mo3190c(boolean z) {
        this.f2346A = z;
    }
}
