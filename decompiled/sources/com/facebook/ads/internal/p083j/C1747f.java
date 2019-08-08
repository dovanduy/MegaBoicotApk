package com.facebook.ads.internal.p083j;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.internal.j.f */
public abstract class C1747f<T> {

    /* renamed from: a */
    private C1748a f5474a;

    /* renamed from: com.facebook.ads.internal.j.f$a */
    public enum C1748a {
        UNKNOWN(9000, "An unknown error has occurred."),
        DATABASE_SELECT(AdError.MEDIATION_ERROR_CODE, "Failed to read from database."),
        DATABASE_INSERT(3002, "Failed to insert row into database."),
        DATABASE_UPDATE(3003, "Failed to update row in database."),
        DATABASE_DELETE(3004, "Failed to delete row from database.");
        

        /* renamed from: f */
        private final int f5481f;

        /* renamed from: g */
        private final String f5482g;

        private C1748a(int i, String str) {
            this.f5481f = i;
            this.f5482g = str;
        }

        /* renamed from: a */
        public int mo7560a() {
            return this.f5481f;
        }

        /* renamed from: b */
        public String mo7561b() {
            return this.f5482g;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7558a(C1748a aVar) {
        this.f5474a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract T mo7550b();

    /* renamed from: c */
    public C1748a mo7559c() {
        return this.f5474a;
    }
}
