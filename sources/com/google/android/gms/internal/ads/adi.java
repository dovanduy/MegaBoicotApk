package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class adi extends adh<FieldDescriptorType, Object> {
    adi(int i) {
        super(i, null);
    }

    /* renamed from: a */
    public final void mo14113a() {
        if (!mo14115b()) {
            for (int i = 0; i < mo14116c(); i++) {
                Entry b = mo14114b(i);
                if (((aay) b.getKey()).mo13970d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : mo14119d()) {
                if (((aay) entry.getKey()).mo13970d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo14113a();
    }
}
