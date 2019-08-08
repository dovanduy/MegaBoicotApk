package com.google.android.gms.internal.ads;

final class adc {

    /* renamed from: a */
    private final String f10557a;

    /* renamed from: b */
    private int f10558b = 0;

    adc(String str) {
        this.f10557a = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo14110a() {
        return this.f10558b < this.f10557a.length();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo14111b() {
        String str = this.f10557a;
        int i = this.f10558b;
        this.f10558b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        char c = charAt & 8191;
        int i2 = 13;
        while (true) {
            String str2 = this.f10557a;
            int i3 = this.f10558b;
            this.f10558b = i3 + 1;
            char charAt2 = str2.charAt(i3);
            if (charAt2 < 55296) {
                return c | (charAt2 << i2);
            }
            c |= (charAt2 & 8191) << i2;
            i2 += 13;
        }
    }
}
