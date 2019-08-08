package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@C3718cm
public final class alj {

    /* renamed from: a */
    private final int f11363a;

    /* renamed from: b */
    private final int f11364b;

    /* renamed from: c */
    private final int f11365c;

    /* renamed from: d */
    private final ali f11366d = new aln();

    public alj(int i) {
        this.f11364b = i;
        this.f11363a = 6;
        this.f11365c = 0;
    }

    /* renamed from: a */
    private final String m14389a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        all all = new all();
        PriorityQueue priorityQueue = new PriorityQueue(this.f11364b, new alk(this));
        for (String a : split) {
            String[] a2 = alm.m14393a(a, false);
            if (a2.length != 0) {
                alp.m14401a(a2, this.f11364b, this.f11363a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                all.mo14497a(this.f11366d.mo14494a(((alq) it.next()).f11371b));
            } catch (IOException e) {
                C3900je.m17430b("Error while writing hash to byteStream", e);
            }
        }
        return all.toString();
    }

    /* renamed from: a */
    public final String mo14495a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            sb.append(((String) obj).toLowerCase(Locale.US));
            sb.append(10);
        }
        return m14389a(sb.toString());
    }
}
