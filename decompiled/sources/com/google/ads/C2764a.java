package com.google.ads;

@Deprecated
/* renamed from: com.google.ads.a */
public final class C2764a {

    /* renamed from: com.google.ads.a$a */
    public enum C2765a {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        

        /* renamed from: e */
        private final String f8586e;

        private C2765a(String str) {
            this.f8586e = str;
        }

        public final String toString() {
            return this.f8586e;
        }
    }

    /* renamed from: com.google.ads.a$b */
    public enum C2766b {
        UNKNOWN,
        MALE,
        FEMALE
    }
}
