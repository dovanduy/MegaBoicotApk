package com.google.android.gms.internal.p148e;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.ef */
final class C4557ef {
    /* renamed from: a */
    static String m19556a(C4554ec ecVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m19558a(ecVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f8, code lost:
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020b, code lost:
        if (((java.lang.Integer) r6).intValue() == 0) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021c, code lost:
        if (((java.lang.Float) r6).floatValue() == 0.0f) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x022e, code lost:
        if (((java.lang.Double) r6).doubleValue() == 0.0d) goto L_0x01fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0267  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m19558a(com.google.android.gms.internal.p148e.C4554ec r12, java.lang.StringBuilder r13, int r14) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r12.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            r4 = 0
            int r5 = r3.length
            r6 = r4
        L_0x001a:
            if (r6 >= r5) goto L_0x0049
            r7 = r3[r6]
            java.lang.String r8 = r7.getName()
            r1.put(r8, r7)
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            if (r8 != 0) goto L_0x0046
            java.lang.String r8 = r7.getName()
            r0.put(r8, r7)
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "get"
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L_0x0046
            java.lang.String r7 = r7.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0280
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = "get"
            java.lang.String r6 = ""
            java.lang.String r5 = r3.replaceFirst(r5, r6)
            java.lang.String r6 = "List"
            boolean r6 = r5.endsWith(r6)
            r7 = 1
            if (r6 == 0) goto L_0x00c7
            java.lang.String r6 = "OrBuilderList"
            boolean r6 = r5.endsWith(r6)
            if (r6 != 0) goto L_0x00c7
            java.lang.String r6 = "List"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x00c7
            java.lang.String r6 = r5.substring(r4, r7)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r5.length()
            int r8 = r8 + -4
            java.lang.String r8 = r5.substring(r7, r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r8.length()
            if (r9 == 0) goto L_0x009f
            java.lang.String r6 = r6.concat(r8)
            goto L_0x00a5
        L_0x009f:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r6)
            r6 = r8
        L_0x00a5:
            java.lang.Object r8 = r0.get(r3)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 == 0) goto L_0x00c7
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class<java.util.List> r10 = java.util.List.class
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00c7
            java.lang.String r3 = m19557a(r6)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Object r5 = com.google.android.gms.internal.p148e.C4513cu.m19410a(r8, r12, r5)
            m19559a(r13, r14, r3, r5)
            goto L_0x004d
        L_0x00c7:
            java.lang.String r6 = "Map"
            boolean r6 = r5.endsWith(r6)
            if (r6 == 0) goto L_0x0137
            java.lang.String r6 = "Map"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0137
            java.lang.String r6 = r5.substring(r4, r7)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r5.length()
            int r8 = r8 + -3
            java.lang.String r8 = r5.substring(r7, r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r8.length()
            if (r9 == 0) goto L_0x00fc
            java.lang.String r6 = r6.concat(r8)
            goto L_0x0102
        L_0x00fc:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r6)
            r6 = r8
        L_0x0102:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0137
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0137
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0137
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0137
            java.lang.String r5 = m19557a(r6)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Object r3 = com.google.android.gms.internal.p148e.C4513cu.m19410a(r3, r12, r6)
            m19559a(r13, r14, r5, r3)
            goto L_0x004d
        L_0x0137:
            java.lang.String r3 = "set"
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r8 = r6.length()
            if (r8 == 0) goto L_0x0148
            java.lang.String r3 = r3.concat(r6)
            goto L_0x014e
        L_0x0148:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3)
            r3 = r6
        L_0x014e:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = "Bytes"
            boolean r3 = r5.endsWith(r3)
            if (r3 == 0) goto L_0x0185
            java.lang.String r3 = "get"
            int r6 = r5.length()
            int r6 = r6 + -5
            java.lang.String r6 = r5.substring(r4, r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r6.length()
            if (r8 == 0) goto L_0x0179
            java.lang.String r3 = r3.concat(r6)
            goto L_0x017f
        L_0x0179:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3)
            r3 = r6
        L_0x017f:
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L_0x004d
        L_0x0185:
            java.lang.String r3 = r5.substring(r4, r7)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = r5.substring(r7)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r6.length()
            if (r8 == 0) goto L_0x01a4
            java.lang.String r3 = r3.concat(r6)
            goto L_0x01aa
        L_0x01a4:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3)
            r3 = r6
        L_0x01aa:
            java.lang.String r6 = "get"
            java.lang.String r8 = java.lang.String.valueOf(r5)
            int r9 = r8.length()
            if (r9 == 0) goto L_0x01bb
            java.lang.String r6 = r6.concat(r8)
            goto L_0x01c1
        L_0x01bb:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r6)
            r6 = r8
        L_0x01c1:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r8 = "has"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r9 = r5.length()
            if (r9 == 0) goto L_0x01d8
            java.lang.String r5 = r8.concat(r5)
            goto L_0x01dd
        L_0x01d8:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r8)
        L_0x01dd:
            java.lang.Object r5 = r0.get(r5)
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r6 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Object r6 = com.google.android.gms.internal.p148e.C4513cu.m19410a(r6, r12, r8)
            if (r5 != 0) goto L_0x0269
            boolean r5 = r6 instanceof java.lang.Boolean
            if (r5 == 0) goto L_0x0200
            r5 = r6
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x01fd
        L_0x01fa:
            r5 = r7
            goto L_0x0263
        L_0x01fd:
            r5 = r4
            goto L_0x0263
        L_0x0200:
            boolean r5 = r6 instanceof java.lang.Integer
            if (r5 == 0) goto L_0x020e
            r5 = r6
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != 0) goto L_0x01fd
            goto L_0x01fa
        L_0x020e:
            boolean r5 = r6 instanceof java.lang.Float
            if (r5 == 0) goto L_0x021f
            r5 = r6
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r8 = 0
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x01fd
            goto L_0x01fa
        L_0x021f:
            boolean r5 = r6 instanceof java.lang.Double
            if (r5 == 0) goto L_0x0231
            r5 = r6
            java.lang.Double r5 = (java.lang.Double) r5
            double r8 = r5.doubleValue()
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x01fd
            goto L_0x01fa
        L_0x0231:
            boolean r5 = r6 instanceof java.lang.String
            if (r5 == 0) goto L_0x023c
            java.lang.String r5 = ""
            boolean r5 = r6.equals(r5)
            goto L_0x0263
        L_0x023c:
            boolean r5 = r6 instanceof com.google.android.gms.internal.p148e.C4469bj
            if (r5 == 0) goto L_0x0247
            com.google.android.gms.internal.e.bj r5 = com.google.android.gms.internal.p148e.C4469bj.f14699a
            boolean r5 = r6.equals(r5)
            goto L_0x0263
        L_0x0247:
            boolean r5 = r6 instanceof com.google.android.gms.internal.p148e.C4554ec
            if (r5 == 0) goto L_0x0255
            r5 = r6
            com.google.android.gms.internal.e.ec r5 = (com.google.android.gms.internal.p148e.C4554ec) r5
            com.google.android.gms.internal.e.ec r5 = r5.mo16615l()
            if (r6 != r5) goto L_0x01fd
            goto L_0x01fa
        L_0x0255:
            boolean r5 = r6 instanceof java.lang.Enum
            if (r5 == 0) goto L_0x01fd
            r5 = r6
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r5 = r5.ordinal()
            if (r5 != 0) goto L_0x01fd
            goto L_0x01fa
        L_0x0263:
            if (r5 != 0) goto L_0x0267
            r5 = r7
            goto L_0x0275
        L_0x0267:
            r5 = r4
            goto L_0x0275
        L_0x0269:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Object r5 = com.google.android.gms.internal.p148e.C4513cu.m19410a(r5, r12, r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
        L_0x0275:
            if (r5 == 0) goto L_0x004d
            java.lang.String r3 = m19557a(r3)
            m19559a(r13, r14, r3, r6)
            goto L_0x004d
        L_0x0280:
            boolean r0 = r12 instanceof com.google.android.gms.internal.p148e.C4513cu.C4516c
            if (r0 == 0) goto L_0x02a2
            r0 = r12
            com.google.android.gms.internal.e.cu$c r0 = (com.google.android.gms.internal.p148e.C4513cu.C4516c) r0
            com.google.android.gms.internal.e.cl<java.lang.Object> r0 = r0.zzbyj
            java.util.Iterator r0 = r0.mo16584e()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02a2
            java.lang.Object r12 = r0.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            r12.getKey()
            java.lang.NoSuchMethodError r12 = new java.lang.NoSuchMethodError
            r12.<init>()
            throw r12
        L_0x02a2:
            com.google.android.gms.internal.e.cu r12 = (com.google.android.gms.internal.p148e.C4513cu) r12
            com.google.android.gms.internal.e.fm r0 = r12.zzbyd
            if (r0 == 0) goto L_0x02ad
            com.google.android.gms.internal.e.fm r12 = r12.zzbyd
            r12.mo16766a(r13, r14)
        L_0x02ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4557ef.m19558a(com.google.android.gms.internal.e.ec, java.lang.StringBuilder, int):void");
    }

    /* renamed from: a */
    static final void m19559a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                m19559a(sb, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Entry a2 : ((Map) obj).entrySet()) {
                m19559a(sb, i, str, a2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C4591fh.m19781a(C4469bj.m18959a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C4469bj) {
                sb.append(": \"");
                sb.append(C4591fh.m19781a((C4469bj) obj));
                sb.append('\"');
            } else if (obj instanceof C4513cu) {
                sb.append(" {");
                m19558a((C4513cu) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Entry) {
                sb.append(" {");
                Entry entry = (Entry) obj;
                int i4 = i + 2;
                m19559a(sb, i4, "key", entry.getKey());
                m19559a(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: a */
    private static final String m19557a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
