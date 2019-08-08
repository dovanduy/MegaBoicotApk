package com.google.android.gms.internal.ads;

import android.os.Environment;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.internal.ads.aml.C3658a.C3660b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
public final class amj {

    /* renamed from: a */
    private final amo f11400a;
    @GuardedBy("this")

    /* renamed from: b */
    private final ana f11401b;

    /* renamed from: c */
    private final boolean f11402c;

    private amj() {
        this.f11402c = false;
        this.f11400a = new amo();
        this.f11401b = new ana();
        m14432b();
    }

    public amj(amo amo) {
        this.f11400a = amo;
        this.f11402c = ((Boolean) aoq.m14620f().mo14695a(aru.f11962db)).booleanValue();
        this.f11401b = new ana();
        m14432b();
    }

    /* renamed from: a */
    public static amj m14431a() {
        return new amj();
    }

    /* renamed from: b */
    private final synchronized void m14432b() {
        this.f11401b.f11487d = new amt();
        this.f11401b.f11487d.f11444b = new amw();
        this.f11401b.f11486c = new amy();
    }

    /* renamed from: b */
    private final synchronized void m14433b(C3660b bVar) {
        this.f11401b.f11485b = m14435c();
        this.f11400a.mo14519a(afc.m13976a((afc) this.f11401b)).mo14522b(bVar.mo14004a()).mo14521a();
        String str = "Logging Event with event code : ";
        String valueOf = String.valueOf(Integer.toString(bVar.mo14004a(), 10));
        C3900je.m17043a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: c */
    private final synchronized void m14434c(C3660b bVar) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m14436d(bVar).getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        C3900je.m17043a("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    C3900je.m17043a("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        C3900je.m17043a("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                C3900je.m17043a("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    C3900je.m17043a("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: c */
    private static long[] m14435c() {
        int i;
        List b = aru.m15026b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = ((String) it.next()).split(",");
            int length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    C3900je.m17043a("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }

    /* renamed from: d */
    private final synchronized String m14436d(C3660b bVar) {
        return String.format("id=%s,timestamp=%s,event=%s", new Object[]{this.f11401b.f11484a, Long.valueOf(C3025aw.m10924l().mo13695b()), Integer.valueOf(bVar.mo14004a())});
    }

    /* renamed from: a */
    public final synchronized void mo14517a(amk amk) {
        if (this.f11402c) {
            try {
                amk.mo12540a(this.f11401b);
            } catch (NullPointerException e) {
                C3025aw.m10921i().mo15436a((Throwable) e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo14518a(C3660b bVar) {
        if (this.f11402c) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11963dc)).booleanValue()) {
                m14434c(bVar);
            } else {
                m14433b(bVar);
            }
        }
    }
}
