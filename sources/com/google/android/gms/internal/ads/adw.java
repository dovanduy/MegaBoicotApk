package com.google.android.gms.internal.ads;

import java.util.List;

public final class adw extends RuntimeException {

    /* renamed from: a */
    private final List<String> f10589a = null;

    public adw(acl acl) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final abk mo14153a() {
        return new abk(getMessage());
    }
}
