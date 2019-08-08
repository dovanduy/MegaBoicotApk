package com.facebook.ads.internal.p095v.p097b.p098a;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.facebook.ads.internal.v.b.a.d */
class C1879d {

    /* renamed from: com.facebook.ads.internal.v.b.a.d$a */
    private static final class C1881a implements Comparator<File> {
        private C1881a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            long lastModified = file.lastModified();
            long lastModified2 = file2.lastModified();
            if (lastModified < lastModified2) {
                return -1;
            }
            return lastModified == lastModified2 ? 0 : 1;
        }
    }
}
