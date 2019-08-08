package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3640e;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class aam implements aer {

    /* renamed from: a */
    private final aak f10302a;

    private aam(aak aak) {
        this.f10302a = (aak) abg.m13322a(aak, "output");
    }

    /* renamed from: a */
    public static aam m13161a(aak aak) {
        return aak.f10297a != null ? aak.f10297a : new aam(aak);
    }

    /* renamed from: a */
    public final int mo13883a() {
        return C3640e.f10427j;
    }

    /* renamed from: a */
    public final void mo13884a(int i) throws IOException {
        this.f10302a.mo13854a(i, 3);
    }

    /* renamed from: a */
    public final void mo13885a(int i, double d) throws IOException {
        this.f10302a.mo13852a(i, d);
    }

    /* renamed from: a */
    public final void mo13886a(int i, float f) throws IOException {
        this.f10302a.mo13853a(i, f);
    }

    /* renamed from: a */
    public final void mo13887a(int i, int i2) throws IOException {
        this.f10302a.mo13881e(i, i2);
    }

    /* renamed from: a */
    public final void mo13888a(int i, long j) throws IOException {
        this.f10302a.mo13855a(i, j);
    }

    /* renamed from: a */
    public final <K, V> void mo13889a(int i, ace<K, V> ace, Map<K, V> map) throws IOException {
        for (Entry entry : map.entrySet()) {
            this.f10302a.mo13854a(i, 2);
            this.f10302a.mo13868b(acd.m13392a(ace, entry.getKey(), entry.getValue()));
            acd.m13393a(this.f10302a, ace, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public final void mo13890a(int i, C4386zw zwVar) throws IOException {
        this.f10302a.mo13858a(i, zwVar);
    }

    /* renamed from: a */
    public final void mo13891a(int i, Object obj) throws IOException {
        if (obj instanceof C4386zw) {
            this.f10302a.mo13871b(i, (C4386zw) obj);
        } else {
            this.f10302a.mo13856a(i, (acl) obj);
        }
    }

    /* renamed from: a */
    public final void mo13892a(int i, Object obj, ade ade) throws IOException {
        this.f10302a.mo13857a(i, (acl) obj, ade);
    }

    /* renamed from: a */
    public final void mo13893a(int i, String str) throws IOException {
        this.f10302a.mo13859a(i, str);
    }

    /* renamed from: a */
    public final void mo13894a(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof abu) {
            abu abu = (abu) list;
            while (i2 < list.size()) {
                Object b = abu.mo14025b(i2);
                if (b instanceof String) {
                    this.f10302a.mo13859a(i, (String) b);
                } else {
                    this.f10302a.mo13858a(i, (C4386zw) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13859a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo13895a(int i, List<?> list, ade ade) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo13892a(i, list.get(i2), ade);
        }
    }

    /* renamed from: a */
    public final void mo13896a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13080f(((Integer) list.get(i4)).intValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13851a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13869b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo13897a(int i, boolean z) throws IOException {
        this.f10302a.mo13860a(i, z);
    }

    /* renamed from: b */
    public final void mo13898b(int i) throws IOException {
        this.f10302a.mo13854a(i, 4);
    }

    /* renamed from: b */
    public final void mo13899b(int i, int i2) throws IOException {
        this.f10302a.mo13869b(i, i2);
    }

    /* renamed from: b */
    public final void mo13900b(int i, long j) throws IOException {
        this.f10302a.mo13876c(i, j);
    }

    /* renamed from: b */
    public final void mo13901b(int i, Object obj, ade ade) throws IOException {
        aak aak = this.f10302a;
        acl acl = (acl) obj;
        aak.mo13854a(i, 3);
        ade.mo14073a(acl, (aer) aak.f10297a);
        aak.mo13854a(i, 4);
    }

    /* renamed from: b */
    public final void mo13902b(int i, List<C4386zw> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f10302a.mo13858a(i, (C4386zw) list.get(i2));
        }
    }

    /* renamed from: b */
    public final void mo13903b(int i, List<?> list, ade ade) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo13901b(i, list.get(i2), ade);
        }
    }

    /* renamed from: b */
    public final void mo13904b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13092i(((Integer) list.get(i4)).intValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13879d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13881e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo13905c(int i, int i2) throws IOException {
        this.f10302a.mo13869b(i, i2);
    }

    /* renamed from: c */
    public final void mo13906c(int i, long j) throws IOException {
        this.f10302a.mo13855a(i, j);
    }

    /* renamed from: c */
    public final void mo13907c(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13076d(((Long) list.get(i4)).longValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13861a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13855a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo13908d(int i, int i2) throws IOException {
        this.f10302a.mo13881e(i, i2);
    }

    /* renamed from: d */
    public final void mo13909d(int i, long j) throws IOException {
        this.f10302a.mo13876c(i, j);
    }

    /* renamed from: d */
    public final void mo13910d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13079e(((Long) list.get(i4)).longValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13861a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13855a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo13911e(int i, int i2) throws IOException {
        this.f10302a.mo13875c(i, i2);
    }

    /* renamed from: e */
    public final void mo13912e(int i, long j) throws IOException {
        this.f10302a.mo13870b(i, j);
    }

    /* renamed from: e */
    public final void mo13913e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13087g(((Long) list.get(i4)).longValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13877c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13876c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo13914f(int i, int i2) throws IOException {
        this.f10302a.mo13880d(i, i2);
    }

    /* renamed from: f */
    public final void mo13915f(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13057b(((Float) list.get(i4)).floatValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13850a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13853a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo13916g(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13056b(((Double) list.get(i4)).doubleValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13849a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13852a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo13917h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13097k(((Integer) list.get(i4)).intValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13851a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13869b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo13918i(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13068b(((Boolean) list.get(i4)).booleanValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13866a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13860a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo13919j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13084g(((Integer) list.get(i4)).intValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13868b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13875c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo13920k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13095j(((Integer) list.get(i4)).intValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13879d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13881e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo13921l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13091h(((Long) list.get(i4)).longValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13877c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13876c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo13922m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13088h(((Integer) list.get(i4)).intValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13874c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13880d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo13923n(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f10302a.mo13854a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += aak.m13083f(((Long) list.get(i4)).longValue());
            }
            this.f10302a.mo13868b(i3);
            while (i2 < list.size()) {
                this.f10302a.mo13872b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10302a.mo13870b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
