package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.gp */
public final class C4630gp extends IOException {
    public C4630gp(String str) {
        super(str);
    }

    public C4630gp(String str, Exception exc) {
        super(str, exc);
    }

    /* renamed from: a */
    static C4630gp m20099a() {
        return new C4630gp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C4630gp m20100b() {
        return new C4630gp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C4630gp m20101c() {
        return new C4630gp("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C4630gp m20102d() {
        return new C4630gp("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
