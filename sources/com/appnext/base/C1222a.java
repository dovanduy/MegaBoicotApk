package com.appnext.base;

/* renamed from: com.appnext.base.a */
public final class C1222a {

    /* renamed from: gf */
    private int f3880gf;

    /* renamed from: com.appnext.base.a$a */
    public enum C1223a {
        ;
        
        public static final int Internal$1d8b5b4a = 1;
        public static final int NoInternet$1d8b5b4a = 2;
        public static final int NoPermission$1d8b5b4a = 3;

        static {
            $VALUES$47a19cef = new int[]{Internal$1d8b5b4a, NoInternet$1d8b5b4a, NoPermission$1d8b5b4a};
        }

        /* renamed from: aM */
        public static int[] m5160aM() {
            return (int[]) $VALUES$47a19cef.clone();
        }
    }

    public C1222a(int i) {
        this.f3880gf = i;
    }

    /* renamed from: aL */
    public final int mo5885aL() {
        return this.f3880gf;
    }
}
