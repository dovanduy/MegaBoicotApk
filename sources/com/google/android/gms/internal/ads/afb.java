package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afb extends IOException {
    public afb(String str) {
        super(str);
    }

    /* renamed from: a */
    static afb m13971a() {
        return new afb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static afb m13972b() {
        return new afb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static afb m13973c() {
        return new afb("CodedInputStream encountered a malformed varint.");
    }
}
