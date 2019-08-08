package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.components.f */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public class C4944f extends C4945g {

    /* renamed from: a */
    private final List<C4937a<?>> f16127a;

    public C4944f(List<C4937a<?>> list) {
        StringBuilder sb = new StringBuilder("Dependency cycle detected: ");
        sb.append(Arrays.toString(list.toArray()));
        super(sb.toString());
        this.f16127a = list;
    }
}
