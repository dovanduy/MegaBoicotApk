package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.db */
public class C4526db extends IOException {

    /* renamed from: a */
    private C4554ec f14868a = null;

    public C4526db(String str) {
        super(str);
    }

    /* renamed from: a */
    public final C4526db mo16632a(C4554ec ecVar) {
        this.f14868a = ecVar;
        return this;
    }

    /* renamed from: a */
    static C4526db m19458a() {
        return new C4526db("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C4526db m19459b() {
        return new C4526db("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C4526db m19460c() {
        return new C4526db("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C4526db m19461d() {
        return new C4526db("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: e */
    static C4527dc m19462e() {
        return new C4527dc("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    static C4526db m19463f() {
        return new C4526db("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: g */
    static C4526db m19464g() {
        return new C4526db("Failed to parse the message.");
    }

    /* renamed from: h */
    static C4526db m19465h() {
        return new C4526db("Protocol message had invalid UTF-8.");
    }
}
