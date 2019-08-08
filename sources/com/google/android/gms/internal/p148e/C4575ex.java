package com.google.android.gms.internal.p148e;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.ex */
final class C4575ex extends C4574ew<FieldDescriptorType, Object> {
    C4575ex(int i) {
        super(i, null);
    }

    /* renamed from: a */
    public final void mo16702a() {
        if (!mo16704b()) {
            for (int i = 0; i < mo16705c(); i++) {
                Entry b = mo16703b(i);
                if (((C4506cn) b.getKey()).mo16596d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : mo16708d()) {
                if (((C4506cn) entry.getKey()).mo16596d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo16702a();
    }
}
