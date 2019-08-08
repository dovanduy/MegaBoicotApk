package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C3513t;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
final class ayh {

    /* renamed from: a */
    private final LinkedList<ayi> f12385a = new LinkedList<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public zzjj f12386b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f12387c;

    /* renamed from: d */
    private final int f12388d;

    /* renamed from: e */
    private boolean f12389e;

    ayh(zzjj zzjj, String str, int i) {
        C3513t.m12625a(zzjj);
        C3513t.m12625a(str);
        this.f12386b = zzjj;
        this.f12387c = str;
        this.f12388d = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ayi mo14963a(zzjj zzjj) {
        if (zzjj != null) {
            this.f12386b = zzjj;
        }
        return (ayi) this.f12385a.remove();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzjj mo14964a() {
        return this.f12386b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14965a(axa axa, zzjj zzjj) {
        this.f12385a.add(new ayi(this, axa, zzjj));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo14966a(axa axa) {
        ayi ayi = new ayi(this, axa);
        this.f12385a.add(ayi);
        return ayi.mo14974a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo14967b() {
        return this.f12388d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo14968c() {
        return this.f12387c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo14969d() {
        return this.f12385a.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo14970e() {
        Iterator it = this.f12385a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((ayi) it.next()).f12394e) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int mo14971f() {
        Iterator it = this.f12385a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((ayi) it.next()).mo14974a()) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo14972g() {
        this.f12389e = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo14973h() {
        return this.f12389e;
    }
}
