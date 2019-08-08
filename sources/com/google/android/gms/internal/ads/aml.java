package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.abe.C3636a;

public final class aml {

    /* renamed from: com.google.android.gms.internal.ads.aml$a */
    public static final class C3658a extends abe<C3658a, C3659a> implements acn {
        /* access modifiers changed from: private */
        public static final C3658a zzakg = new C3658a();
        private static volatile acx<C3658a> zzakh;

        /* renamed from: com.google.android.gms.internal.ads.aml$a$a */
        public static final class C3659a extends C3636a<C3658a, C3659a> implements acn {
            private C3659a() {
                super(C3658a.zzakg);
            }

            /* synthetic */ C3659a(amm amm) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.aml$a$b */
        public enum C3660b implements abh {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(AdError.NETWORK_ERROR_CODE),
            REQUEST_DID_UPDATE_GMS_SIGNALS(AdError.NO_FILL_ERROR_CODE),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE),
            REQUEST_FAILED_TO_BUILD_URL(1003),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005),
            REQUEST_FAILED_TO_UPDATE_SIGNALS(1006),
            BANNER_SIZE_INVALID(10000),
            BANNER_SIZE_VALID(10001);
            

            /* renamed from: D */
            private static final abi<C3660b> f11406D = null;

            /* renamed from: E */
            private final int f11434E;

            static {
                f11406D = new amn();
            }

            private C3660b(int i) {
                this.f11434E = i;
            }

            /* renamed from: a */
            public static C3660b m14442a(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_EVENT_TYPE;
                    case 1:
                        return AD_REQUEST;
                    case 2:
                        return AD_LOADED;
                    case 3:
                        return AD_FAILED_TO_LOAD;
                    case 4:
                        return AD_FAILED_TO_LOAD_NO_FILL;
                    case 5:
                        return AD_IMPRESSION;
                    case 6:
                        return AD_FIRST_CLICK;
                    case 7:
                        return AD_SUBSEQUENT_CLICK;
                    case 8:
                        return REQUEST_WILL_START;
                    case 9:
                        return REQUEST_DID_END;
                    case 10:
                        return REQUEST_WILL_UPDATE_SIGNALS;
                    case 11:
                        return REQUEST_DID_UPDATE_SIGNALS;
                    case 12:
                        return REQUEST_WILL_BUILD_URL;
                    case 13:
                        return REQUEST_DID_BUILD_URL;
                    case 14:
                        return REQUEST_WILL_MAKE_NETWORK_REQUEST;
                    case 15:
                        return REQUEST_DID_RECEIVE_NETWORK_RESPONSE;
                    case 16:
                        return REQUEST_WILL_PROCESS_RESPONSE;
                    case 17:
                        return REQUEST_DID_PROCESS_RESPONSE;
                    case 18:
                        return REQUEST_WILL_RENDER;
                    case 19:
                        return REQUEST_DID_RENDER;
                    default:
                        switch (i) {
                            case AdError.NETWORK_ERROR_CODE /*1000*/:
                                return REQUEST_WILL_UPDATE_GMS_SIGNALS;
                            case AdError.NO_FILL_ERROR_CODE /*1001*/:
                                return REQUEST_DID_UPDATE_GMS_SIGNALS;
                            case AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE /*1002*/:
                                return REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS;
                            case 1003:
                                return REQUEST_FAILED_TO_BUILD_URL;
                            case 1004:
                                return REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST;
                            case 1005:
                                return REQUEST_FAILED_TO_PROCESS_RESPONSE;
                            case 1006:
                                return REQUEST_FAILED_TO_UPDATE_SIGNALS;
                            default:
                                switch (i) {
                                    case 10000:
                                        return BANNER_SIZE_INVALID;
                                    case 10001:
                                        return BANNER_SIZE_VALID;
                                    default:
                                        return null;
                                }
                        }
                }
            }

            /* renamed from: a */
            public final int mo14004a() {
                return this.f11434E;
            }
        }

        static {
            abe.m13287a(C3658a.class, zzakg);
        }

        private C3658a() {
        }

        /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.aml$a>] */
        /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r1v12, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.aml$a>, com.google.android.gms.internal.ads.abe$b] */
        /* JADX WARNING: type inference failed for: r1v15 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v12, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.aml$a>, com.google.android.gms.internal.ads.abe$b]
          assigns: [com.google.android.gms.internal.ads.abe$b]
          uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.aml$a>]
          mth insns count: 34
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo13979a(int r1, java.lang.Object r2, java.lang.Object r3) {
            /*
                r0 = this;
                int[] r2 = com.google.android.gms.internal.ads.amm.f11435a
                r3 = 1
                int r1 = r1 - r3
                r1 = r2[r1]
                r2 = 0
                switch(r1) {
                    case 1: goto L_0x0042;
                    case 2: goto L_0x003c;
                    case 3: goto L_0x0033;
                    case 4: goto L_0x0030;
                    case 5: goto L_0x0016;
                    case 6: goto L_0x0011;
                    case 7: goto L_0x0010;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
            L_0x0010:
                return r2
            L_0x0011:
                java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
                return r1
            L_0x0016:
                com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.aml$a> r1 = zzakh
                if (r1 != 0) goto L_0x002f
                java.lang.Class<com.google.android.gms.internal.ads.aml$a> r2 = com.google.android.gms.internal.ads.aml.C3658a.class
                monitor-enter(r2)
                com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.aml$a> r1 = zzakh     // Catch:{ all -> 0x002c }
                if (r1 != 0) goto L_0x002a
                com.google.android.gms.internal.ads.abe$b r1 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
                com.google.android.gms.internal.ads.aml$a r3 = zzakg     // Catch:{ all -> 0x002c }
                r1.<init>(r3)     // Catch:{ all -> 0x002c }
                zzakh = r1     // Catch:{ all -> 0x002c }
            L_0x002a:
                monitor-exit(r2)     // Catch:{ all -> 0x002c }
                return r1
            L_0x002c:
                r1 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002c }
                throw r1
            L_0x002f:
                return r1
            L_0x0030:
                com.google.android.gms.internal.ads.aml$a r1 = zzakg
                return r1
            L_0x0033:
                java.lang.String r1 = "\u0001\u0000"
                com.google.android.gms.internal.ads.aml$a r3 = zzakg
                java.lang.Object r1 = m13285a(r3, r1, r2)
                return r1
            L_0x003c:
                com.google.android.gms.internal.ads.aml$a$a r1 = new com.google.android.gms.internal.ads.aml$a$a
                r1.<init>(r2)
                return r1
            L_0x0042:
                com.google.android.gms.internal.ads.aml$a r1 = new com.google.android.gms.internal.ads.aml$a
                r1.<init>()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aml.C3658a.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
