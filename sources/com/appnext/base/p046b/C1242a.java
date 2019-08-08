package com.appnext.base.p046b;

import android.os.BaseBundle;
import android.os.PersistableBundle;

/* renamed from: com.appnext.base.b.a */
public final class C1242a {
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[Catch:{ Throwable -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0011 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.PersistableBundle m5252a(android.os.Bundle r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.PersistableBundle r1 = new android.os.PersistableBundle     // Catch:{ Throwable -> 0x00eb }
            r1.<init>()     // Catch:{ Throwable -> 0x00eb }
            java.util.Set r2 = r6.keySet()     // Catch:{ Throwable -> 0x00eb }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x00eb }
        L_0x0011:
            boolean r3 = r2.hasNext()     // Catch:{ Throwable -> 0x00eb }
            if (r3 == 0) goto L_0x00ea
            java.lang.Object r3 = r2.next()     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x00eb }
            java.lang.Object r4 = r6.get(r3)     // Catch:{ Throwable -> 0x00eb }
            boolean r5 = r4 instanceof android.os.PersistableBundle     // Catch:{ Throwable -> 0x00eb }
            if (r5 != 0) goto L_0x0048
            boolean r5 = r4 instanceof java.lang.Integer     // Catch:{ Throwable -> 0x00eb }
            if (r5 != 0) goto L_0x0048
            boolean r5 = r4 instanceof int[]     // Catch:{ Throwable -> 0x00eb }
            if (r5 != 0) goto L_0x0048
            boolean r5 = r4 instanceof java.lang.Long     // Catch:{ Throwable -> 0x00eb }
            if (r5 != 0) goto L_0x0048
            boolean r5 = r4 instanceof long[]     // Catch:{ Throwable -> 0x00eb }
            if (r5 != 0) goto L_0x0048
            boolean r5 = r4 instanceof java.lang.Double     // Catch:{ Throwable -> 0x00eb }
            if (r5 != 0) goto L_0x0048
            boolean r5 = r4 instanceof double[]     // Catch:{ Throwable -> 0x00eb }
            if (r5 != 0) goto L_0x0048
            boolean r5 = r4 instanceof java.lang.String     // Catch:{ Throwable -> 0x00eb }
            if (r5 != 0) goto L_0x0048
            boolean r5 = r4 instanceof java.lang.String[]     // Catch:{ Throwable -> 0x00eb }
            if (r5 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r5 = 0
            goto L_0x0049
        L_0x0048:
            r5 = 1
        L_0x0049:
            if (r5 == 0) goto L_0x0011
            if (r4 != 0) goto L_0x0055
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r1 = "Unable to determine type of null values"
            r6.<init>(r1)     // Catch:{ Throwable -> 0x00eb }
            throw r6     // Catch:{ Throwable -> 0x00eb }
        L_0x0055:
            boolean r5 = r4 instanceof java.lang.Integer     // Catch:{ Throwable -> 0x00eb }
            if (r5 == 0) goto L_0x0063
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Throwable -> 0x00eb }
            int r4 = r4.intValue()     // Catch:{ Throwable -> 0x00eb }
            r1.putInt(r3, r4)     // Catch:{ Throwable -> 0x00eb }
            goto L_0x0011
        L_0x0063:
            boolean r5 = r4 instanceof int[]     // Catch:{ Throwable -> 0x00eb }
            if (r5 == 0) goto L_0x006d
            int[] r4 = (int[]) r4     // Catch:{ Throwable -> 0x00eb }
            r1.putIntArray(r3, r4)     // Catch:{ Throwable -> 0x00eb }
            goto L_0x0011
        L_0x006d:
            boolean r5 = r4 instanceof java.lang.Long     // Catch:{ Throwable -> 0x00eb }
            if (r5 == 0) goto L_0x007b
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Throwable -> 0x00eb }
            long r4 = r4.longValue()     // Catch:{ Throwable -> 0x00eb }
            r1.putLong(r3, r4)     // Catch:{ Throwable -> 0x00eb }
            goto L_0x0011
        L_0x007b:
            boolean r5 = r4 instanceof long[]     // Catch:{ Throwable -> 0x00eb }
            if (r5 == 0) goto L_0x0085
            long[] r4 = (long[]) r4     // Catch:{ Throwable -> 0x00eb }
            r1.putLongArray(r3, r4)     // Catch:{ Throwable -> 0x00eb }
            goto L_0x0011
        L_0x0085:
            boolean r5 = r4 instanceof java.lang.Double     // Catch:{ Throwable -> 0x00eb }
            if (r5 == 0) goto L_0x0094
            java.lang.Double r4 = (java.lang.Double) r4     // Catch:{ Throwable -> 0x00eb }
            double r4 = r4.doubleValue()     // Catch:{ Throwable -> 0x00eb }
            r1.putDouble(r3, r4)     // Catch:{ Throwable -> 0x00eb }
            goto L_0x0011
        L_0x0094:
            boolean r5 = r4 instanceof double[]     // Catch:{ Throwable -> 0x00eb }
            if (r5 == 0) goto L_0x009f
            double[] r4 = (double[]) r4     // Catch:{ Throwable -> 0x00eb }
            r1.putDoubleArray(r3, r4)     // Catch:{ Throwable -> 0x00eb }
            goto L_0x0011
        L_0x009f:
            boolean r5 = r4 instanceof java.lang.String     // Catch:{ Throwable -> 0x00eb }
            if (r5 == 0) goto L_0x00aa
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x00eb }
            r1.putString(r3, r4)     // Catch:{ Throwable -> 0x00eb }
            goto L_0x0011
        L_0x00aa:
            boolean r5 = r4 instanceof java.lang.String[]     // Catch:{ Throwable -> 0x00eb }
            if (r5 == 0) goto L_0x00b5
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ Throwable -> 0x00eb }
            r1.putStringArray(r3, r4)     // Catch:{ Throwable -> 0x00eb }
            goto L_0x0011
        L_0x00b5:
            boolean r3 = r4 instanceof android.os.PersistableBundle     // Catch:{ Throwable -> 0x00eb }
            if (r3 == 0) goto L_0x00c0
            android.os.PersistableBundle r4 = (android.os.PersistableBundle) r4     // Catch:{ Throwable -> 0x00eb }
            r1.putAll(r4)     // Catch:{ Throwable -> 0x00eb }
            goto L_0x0011
        L_0x00c0:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x00eb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r2 = "Objects of type "
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00eb }
            java.lang.Class r2 = r4.getClass()     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ Throwable -> 0x00eb }
            r1.append(r2)     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r2 = " can not be put into a "
            r1.append(r2)     // Catch:{ Throwable -> 0x00eb }
            java.lang.Class<android.os.BaseBundle> r2 = android.os.BaseBundle.class
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ Throwable -> 0x00eb }
            r1.append(r2)     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x00eb }
            r6.<init>(r1)     // Catch:{ Throwable -> 0x00eb }
            throw r6     // Catch:{ Throwable -> 0x00eb }
        L_0x00ea:
            return r1
        L_0x00eb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p046b.C1242a.m5252a(android.os.Bundle):android.os.PersistableBundle");
    }

    /* renamed from: b */
    private static boolean m5254b(Object obj) {
        return (obj instanceof PersistableBundle) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof String) || (obj instanceof String[]);
    }

    /* renamed from: a */
    private static void m5253a(PersistableBundle persistableBundle, String str, Object obj) throws IllegalArgumentException {
        if (obj == null) {
            throw new IllegalArgumentException("Unable to determine type of null values");
        } else if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            persistableBundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            persistableBundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            persistableBundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof String) {
            persistableBundle.putString(str, (String) obj);
        } else if (obj instanceof String[]) {
            persistableBundle.putStringArray(str, (String[]) obj);
        } else if (obj instanceof PersistableBundle) {
            persistableBundle.putAll((PersistableBundle) obj);
        } else {
            StringBuilder sb = new StringBuilder("Objects of type ");
            sb.append(obj.getClass().getSimpleName());
            sb.append(" can not be put into a ");
            sb.append(BaseBundle.class.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
