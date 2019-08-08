package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class atl {

    /* renamed from: a */
    public final int f12193a;

    /* renamed from: b */
    public final byte[] f12194b;

    /* renamed from: c */
    public final Map<String, String> f12195c;

    /* renamed from: d */
    public final List<C3667app> f12196d;

    /* renamed from: e */
    public final boolean f12197e;

    /* renamed from: f */
    private final long f12198f;

    private atl(int i, byte[] bArr, Map<String, String> map, List<C3667app> list, boolean z, long j) {
        this.f12193a = i;
        this.f12194b = bArr;
        this.f12195c = map;
        this.f12196d = list == null ? null : Collections.unmodifiableList(list);
        this.f12197e = z;
        this.f12198f = j;
    }

    @Deprecated
    public atl(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new C3667app((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        List list = arrayList;
        this(i, bArr, map, list, z, j);
    }

    public atl(int i, byte[] bArr, boolean z, long j, List<C3667app> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (C3667app app : list) {
                treeMap.put(app.mo14558a(), app.mo14559b());
            }
        }
        Map map = treeMap;
        this(i, bArr, map, list, z, j);
    }

    @Deprecated
    public atl(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }
}
