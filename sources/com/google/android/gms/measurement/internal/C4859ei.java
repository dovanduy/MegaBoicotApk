package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.internal.p148e.C4433aa;
import com.google.android.gms.internal.p148e.C4623gi;
import com.google.android.gms.internal.p148e.C4638k;
import com.google.android.gms.internal.p148e.C4639l;
import com.google.android.gms.internal.p148e.C4640m;
import com.google.android.gms.internal.p148e.C4641n;
import com.google.android.gms.internal.p148e.C4642o;
import com.google.android.gms.internal.p148e.C4646s;
import com.google.android.gms.internal.p148e.C4647t;
import com.google.android.gms.internal.p148e.C4648u;
import com.google.android.gms.internal.p148e.C4649v;
import com.google.android.gms.internal.p148e.C4650w;
import com.google.android.gms.internal.p148e.C4651x;
import com.google.android.gms.internal.p148e.C4652y;
import com.google.android.gms.internal.p148e.C4653z;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.ei */
public final class C4859ei extends C4851eb {
    C4859ei(C4852ec ecVar) {
        super(ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo17212e() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17471a(C4433aa aaVar, Object obj) {
        C3513t.m12625a(obj);
        aaVar.f14632c = null;
        aaVar.f14633d = null;
        aaVar.f14634e = null;
        if (obj instanceof String) {
            aaVar.f14632c = (String) obj;
        } else if (obj instanceof Long) {
            aaVar.f14633d = (Long) obj;
        } else if (obj instanceof Double) {
            aaVar.f14634e = (Double) obj;
        } else {
            mo17158r().mo17761y_().mo17764a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17472a(C4649v vVar, Object obj) {
        C3513t.m12625a(obj);
        vVar.f15159b = null;
        vVar.f15160c = null;
        vVar.f15161d = null;
        if (obj instanceof String) {
            vVar.f15159b = (String) obj;
        } else if (obj instanceof Long) {
            vVar.f15160c = (Long) obj;
        } else if (obj instanceof Double) {
            vVar.f15161d = (Double) obj;
        } else {
            mo17158r().mo17761y_().mo17764a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte[] mo17475a(C4650w wVar) {
        try {
            byte[] bArr = new byte[wVar.mo16867e()];
            C4623gi a = C4623gi.m20047a(bArr, 0, bArr.length);
            wVar.mo16327a(a);
            a.mo16830a();
            return bArr;
        } catch (IOException e) {
            mo17158r().mo17761y_().mo17764a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    /* renamed from: a */
    static C4649v m20919a(C4648u uVar, String str) {
        C4649v[] vVarArr;
        for (C4649v vVar : uVar.f15152a) {
            if (vVar.f15158a.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    static Object m20929b(C4648u uVar, String str) {
        C4649v a = m20919a(uVar, str);
        if (a != null) {
            if (a.f15159b != null) {
                return a.f15159b;
            }
            if (a.f15160c != null) {
                return a.f15160c;
            }
            if (a.f15161d != null) {
                return a.f15161d;
            }
        }
        return null;
    }

    /* renamed from: a */
    static C4649v[] m20928a(C4649v[] vVarArr, String str, Object obj) {
        for (C4649v vVar : vVarArr) {
            if (str.equals(vVar.f15158a)) {
                vVar.f15160c = null;
                vVar.f15159b = null;
                vVar.f15161d = null;
                if (obj instanceof Long) {
                    vVar.f15160c = (Long) obj;
                } else if (obj instanceof String) {
                    vVar.f15159b = (String) obj;
                } else if (obj instanceof Double) {
                    vVar.f15161d = (Double) obj;
                }
                return vVarArr;
            }
        }
        C4649v[] vVarArr2 = new C4649v[(vVarArr.length + 1)];
        System.arraycopy(vVarArr, 0, vVarArr2, 0, vVarArr.length);
        C4649v vVar2 = new C4649v();
        vVar2.f15158a = str;
        if (obj instanceof Long) {
            vVar2.f15160c = (Long) obj;
        } else if (obj instanceof String) {
            vVar2.f15159b = (String) obj;
        } else if (obj instanceof Double) {
            vVar2.f15161d = (Double) obj;
        }
        vVarArr2[vVarArr.length] = vVar2;
        return vVarArr2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo17477b(C4650w wVar) {
        C4651x[] xVarArr;
        int i;
        int i2;
        C4650w wVar2 = wVar;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (wVar2.f15163a != null) {
            for (C4651x xVar : wVar2.f15163a) {
                if (!(xVar == null || xVar == null)) {
                    int i3 = 1;
                    m20920a(sb, 1);
                    sb.append("bundle {\n");
                    m20924a(sb, 1, "protocol_version", (Object) xVar.f15180a);
                    m20924a(sb, 1, "platform", (Object) xVar.f15188i);
                    m20924a(sb, 1, "gmp_version", (Object) xVar.f15196q);
                    m20924a(sb, 1, "uploading_gmp_version", (Object) xVar.f15197r);
                    m20924a(sb, 1, "config_version", (Object) xVar.f15169E);
                    m20924a(sb, 1, "gmp_app_id", (Object) xVar.f15204y);
                    m20924a(sb, 1, "admob_app_id", (Object) xVar.f15173I);
                    m20924a(sb, 1, "app_id", (Object) xVar.f15194o);
                    m20924a(sb, 1, "app_version", (Object) xVar.f15195p);
                    m20924a(sb, 1, "app_version_major", (Object) xVar.f15167C);
                    m20924a(sb, 1, "firebase_instance_id", (Object) xVar.f15166B);
                    m20924a(sb, 1, "dev_cert_hash", (Object) xVar.f15201v);
                    m20924a(sb, 1, "app_store", (Object) xVar.f15193n);
                    m20924a(sb, 1, "upload_timestamp_millis", (Object) xVar.f15183d);
                    m20924a(sb, 1, "start_timestamp_millis", (Object) xVar.f15184e);
                    m20924a(sb, 1, "end_timestamp_millis", (Object) xVar.f15185f);
                    m20924a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) xVar.f15186g);
                    m20924a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) xVar.f15187h);
                    m20924a(sb, 1, "app_instance_id", (Object) xVar.f15200u);
                    m20924a(sb, 1, "resettable_device_id", (Object) xVar.f15198s);
                    m20924a(sb, 1, "device_id", (Object) xVar.f15168D);
                    m20924a(sb, 1, "ds_id", (Object) xVar.f15171G);
                    m20924a(sb, 1, "limited_ad_tracking", (Object) xVar.f15199t);
                    m20924a(sb, 1, "os_version", (Object) xVar.f15189j);
                    m20924a(sb, 1, "device_model", (Object) xVar.f15190k);
                    m20924a(sb, 1, "user_default_language", (Object) xVar.f15191l);
                    m20924a(sb, 1, "time_zone_offset_minutes", (Object) xVar.f15192m);
                    m20924a(sb, 1, "bundle_sequential_index", (Object) xVar.f15202w);
                    m20924a(sb, 1, "service_upload", (Object) xVar.f15205z);
                    m20924a(sb, 1, "health_monitor", (Object) xVar.f15203x);
                    if (!(xVar.f15170F == null || xVar.f15170F.longValue() == 0)) {
                        m20924a(sb, 1, "android_id", (Object) xVar.f15170F);
                    }
                    if (xVar.f15172H != null) {
                        m20924a(sb, 1, "retry_counter", (Object) xVar.f15172H);
                    }
                    C4433aa[] aaVarArr = xVar.f15182c;
                    if (aaVarArr != null) {
                        for (C4433aa aaVar : aaVarArr) {
                            if (aaVar != null) {
                                m20920a(sb, 2);
                                sb.append("user_property {\n");
                                m20924a(sb, 2, "set_timestamp_millis", (Object) aaVar.f14630a);
                                m20924a(sb, 2, "name", (Object) mo17155o().mo17748c(aaVar.f14631b));
                                m20924a(sb, 2, "string_value", (Object) aaVar.f14632c);
                                m20924a(sb, 2, "int_value", (Object) aaVar.f14633d);
                                m20924a(sb, 2, "double_value", (Object) aaVar.f14634e);
                                m20920a(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    C4646s[] sVarArr = xVar.f15165A;
                    String str = xVar.f15194o;
                    if (sVarArr != null) {
                        int length = sVarArr.length;
                        int i4 = 0;
                        while (i4 < length) {
                            C4646s sVar = sVarArr[i4];
                            if (sVar != null) {
                                m20920a(sb, 2);
                                sb.append("audience_membership {\n");
                                m20924a(sb, 2, "audience_id", (Object) sVar.f15144a);
                                m20924a(sb, 2, "new_audience", (Object) sVar.f15147d);
                                StringBuilder sb2 = sb;
                                C4646s sVar2 = sVar;
                                i2 = i4;
                                i = length;
                                String str2 = str;
                                m20923a(sb2, 2, "current_data", sVar.f15145b, str2);
                                m20923a(sb2, 2, "previous_data", sVar2.f15146c, str2);
                                m20920a(sb, 2);
                                sb.append("}\n");
                            } else {
                                i2 = i4;
                                i = length;
                            }
                            i4 = i2 + 1;
                            length = i;
                        }
                    }
                    C4648u[] uVarArr = xVar.f15181b;
                    if (uVarArr != null) {
                        int length2 = uVarArr.length;
                        int i5 = 0;
                        while (i5 < length2) {
                            C4648u uVar = uVarArr[i5];
                            if (uVar != null) {
                                m20920a(sb, 2);
                                sb.append("event {\n");
                                m20924a(sb, 2, "name", (Object) mo17155o().mo17746a(uVar.f15153b));
                                m20924a(sb, 2, "timestamp_millis", (Object) uVar.f15154c);
                                m20924a(sb, 2, "previous_timestamp_millis", (Object) uVar.f15155d);
                                m20924a(sb, 2, "count", (Object) uVar.f15156e);
                                C4649v[] vVarArr = uVar.f15152a;
                                if (vVarArr != null) {
                                    for (C4649v vVar : vVarArr) {
                                        if (vVar != null) {
                                            m20920a(sb, 3);
                                            sb.append("param {\n");
                                            m20924a(sb, 3, "name", (Object) mo17155o().mo17747b(vVar.f15158a));
                                            m20924a(sb, 3, "string_value", (Object) vVar.f15159b);
                                            m20924a(sb, 3, "int_value", (Object) vVar.f15160c);
                                            m20924a(sb, 3, "double_value", (Object) vVar.f15161d);
                                            m20920a(sb, 3);
                                            sb.append("}\n");
                                        }
                                    }
                                }
                                m20920a(sb, 2);
                                sb.append("}\n");
                            }
                            i5++;
                            i3 = 1;
                        }
                    }
                    m20920a(sb, i3);
                    sb.append("}\n");
                }
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo17469a(C4638k kVar) {
        if (kVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        m20924a(sb, 0, "filter_id", (Object) kVar.f15100a);
        m20924a(sb, 0, "event_name", (Object) mo17155o().mo17746a(kVar.f15101b));
        m20922a(sb, 1, "event_count_filter", kVar.f15103d);
        sb.append("  filters {\n");
        for (C4639l a : kVar.f15102c) {
            m20921a(sb, 2, a);
        }
        m20920a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo17470a(C4641n nVar) {
        if (nVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        m20924a(sb, 0, "filter_id", (Object) nVar.f15118a);
        m20924a(sb, 0, "property_name", (Object) mo17155o().mo17748c(nVar.f15119b));
        m20921a(sb, 1, nVar.f15120c);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    private final void m20923a(StringBuilder sb, int i, String str, C4652y yVar, String str2) {
        if (yVar != null) {
            m20920a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (yVar.f15207b != null) {
                m20920a(sb, 4);
                sb.append("results: ");
                long[] jArr = yVar.f15207b;
                int length = jArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    Long valueOf = Long.valueOf(jArr[i2]);
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf);
                    i2++;
                    i3 = i4;
                }
                sb.append(10);
            }
            if (yVar.f15206a != null) {
                m20920a(sb, 4);
                sb.append("status: ");
                long[] jArr2 = yVar.f15206a;
                int length2 = jArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    Long valueOf2 = Long.valueOf(jArr2[i5]);
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf2);
                    i5++;
                    i6 = i7;
                }
                sb.append(10);
            }
            if (mo17160t().mo17656k(str2)) {
                if (yVar.f15208c != null) {
                    m20920a(sb, 4);
                    sb.append("dynamic_filter_timestamps: {");
                    C4647t[] tVarArr = yVar.f15208c;
                    int length3 = tVarArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        C4647t tVar = tVarArr[i8];
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(", ");
                        }
                        sb.append(tVar.f15149a);
                        sb.append(":");
                        sb.append(tVar.f15150b);
                        i8++;
                        i9 = i10;
                    }
                    sb.append("}\n");
                }
                if (yVar.f15209d != null) {
                    m20920a(sb, 4);
                    sb.append("sequence_filter_timestamps: {");
                    C4653z[] zVarArr = yVar.f15209d;
                    int length4 = zVarArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length4) {
                        C4653z zVar = zVarArr[i11];
                        int i13 = i12 + 1;
                        if (i12 != 0) {
                            sb.append(", ");
                        }
                        sb.append(zVar.f15211a);
                        sb.append(": [");
                        long[] jArr3 = zVar.f15212b;
                        int length5 = jArr3.length;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < length5) {
                            long j = jArr3[i14];
                            int i16 = i15 + 1;
                            if (i15 != 0) {
                                sb.append(", ");
                            }
                            sb.append(j);
                            i14++;
                            i15 = i16;
                        }
                        sb.append("]");
                        i11++;
                        i12 = i13;
                    }
                    sb.append("}\n");
                }
            }
            m20920a(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private final void m20922a(StringBuilder sb, int i, String str, C4640m mVar) {
        if (mVar != null) {
            m20920a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (mVar.f15112a != null) {
                String str2 = "UNKNOWN_COMPARISON_TYPE";
                switch (mVar.f15112a.intValue()) {
                    case 1:
                        str2 = "LESS_THAN";
                        break;
                    case 2:
                        str2 = "GREATER_THAN";
                        break;
                    case 3:
                        str2 = "EQUAL";
                        break;
                    case 4:
                        str2 = "BETWEEN";
                        break;
                }
                m20924a(sb, i, "comparison_type", (Object) str2);
            }
            m20924a(sb, i, "match_as_float", (Object) mVar.f15113b);
            m20924a(sb, i, "comparison_value", (Object) mVar.f15114c);
            m20924a(sb, i, "min_comparison_value", (Object) mVar.f15115d);
            m20924a(sb, i, "max_comparison_value", (Object) mVar.f15116e);
            m20920a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private final void m20921a(StringBuilder sb, int i, C4639l lVar) {
        String[] strArr;
        if (lVar != null) {
            m20920a(sb, i);
            sb.append("filter {\n");
            m20924a(sb, i, "complement", (Object) lVar.f15110c);
            m20924a(sb, i, "param_name", (Object) mo17155o().mo17747b(lVar.f15111d));
            int i2 = i + 1;
            String str = "string_filter";
            C4642o oVar = lVar.f15108a;
            if (oVar != null) {
                m20920a(sb, i2);
                sb.append(str);
                sb.append(" {\n");
                if (oVar.f15123a != null) {
                    String str2 = "UNKNOWN_MATCH_TYPE";
                    switch (oVar.f15123a.intValue()) {
                        case 1:
                            str2 = "REGEXP";
                            break;
                        case 2:
                            str2 = "BEGINS_WITH";
                            break;
                        case 3:
                            str2 = "ENDS_WITH";
                            break;
                        case 4:
                            str2 = "PARTIAL";
                            break;
                        case 5:
                            str2 = "EXACT";
                            break;
                        case 6:
                            str2 = "IN_LIST";
                            break;
                    }
                    m20924a(sb, i2, "match_type", (Object) str2);
                }
                m20924a(sb, i2, "expression", (Object) oVar.f15124b);
                m20924a(sb, i2, "case_sensitive", (Object) oVar.f15125c);
                if (oVar.f15126d.length > 0) {
                    m20920a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str3 : oVar.f15126d) {
                        m20920a(sb, i2 + 2);
                        sb.append(str3);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m20920a(sb, i2);
                sb.append("}\n");
            }
            m20922a(sb, i2, "number_filter", lVar.f15109b);
            m20920a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m20920a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private static void m20924a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m20920a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo17158r().mo17761y_().mo17763a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo17468a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.r r5 = r4.mo17158r()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17761y_()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo17763a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4859ei.mo17468a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17474a(zzag zzag, zzk zzk) {
        C3513t.m12625a(zzag);
        C3513t.m12625a(zzk);
        if (!TextUtils.isEmpty(zzk.f16004b) || !TextUtils.isEmpty(zzk.f16020r)) {
            return true;
        }
        mo17161u();
        return false;
    }

    /* renamed from: a */
    static boolean m20925a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: a */
    static boolean m20926a(long[] jArr, int i) {
        if (i < (jArr.length << 6) && (jArr[i / 64] & (1 << (i % 64))) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static long[] m20927a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
            }
        }
        return jArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17473a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo17153m().mo13694a() - j) > j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte[] mo17476a(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[C1245d.f3947iP];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo17158r().mo17761y_().mo17764a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final byte[] mo17478b(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo17158r().mo17761y_().mo17764a("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int[] mo17479f() {
        Map a = C4882h.m21220a(this.f15744a.mo17154n());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) C4882h.f15870U.mo17726b()).intValue();
        Iterator it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo17158r().mo17754i().mo17764a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo17158r().mo17754i().mo17764a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            int i3 = i2 + 1;
            iArr[i2] = ((Integer) obj).intValue();
            i2 = i3;
        }
        return iArr;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4859ei mo17214g() {
        return super.mo17214g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4867eq mo17216h() {
        return super.mo17216h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4873ew mo17217i() {
        return super.mo17217i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17138a() {
        super.mo17138a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17141b() {
        super.mo17141b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo17143c() {
        super.mo17143c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo17144d() {
        super.mo17144d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4768b mo17152l() {
        return super.mo17152l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3553e mo17153m() {
        return super.mo17153m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo17154n() {
        return super.mo17154n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4891p mo17155o() {
        return super.mo17155o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4862el mo17156p() {
        return super.mo17156p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4759ar mo17157q() {
        return super.mo17157q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4893r mo17158r() {
        return super.mo17158r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4745ad mo17159s() {
        return super.mo17159s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4870et mo17160t() {
        return super.mo17160t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4868er mo17161u() {
        return super.mo17161u();
    }
}
