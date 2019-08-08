package com.google.android.gms.internal.ads;

import java.io.IOException;

public class abk extends IOException {

    /* renamed from: a */
    private acl f10440a = null;

    public abk(String str) {
        super(str);
    }

    /* renamed from: a */
    static abk m13332a() {
        return new abk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static abk m13333b() {
        return new abk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static abk m13334c() {
        return new abk("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static abk m13335d() {
        return new abk("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static abk m13336e() {
        return new abk("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static abl m13337f() {
        return new abl("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static abk m13338g() {
        return new abk("Failed to parse the message.");
    }

    /* renamed from: h */
    static abk m13339h() {
        return new abk("Protocol message had invalid UTF-8.");
    }

    /* renamed from: a */
    public final abk mo14008a(acl acl) {
        this.f10440a = acl;
        return this;
    }
}
