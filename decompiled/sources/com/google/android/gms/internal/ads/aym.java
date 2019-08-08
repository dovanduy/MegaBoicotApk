package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.internal.safeparcel.C3509a.C3510a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@C3718cm
final class aym {

    /* renamed from: a */
    final zzjj f12413a;

    /* renamed from: b */
    final String f12414b;

    /* renamed from: c */
    final int f12415c;

    aym(ayh ayh) {
        this(ayh.mo14964a(), ayh.mo14968c(), ayh.mo14967b());
    }

    private aym(zzjj zzjj, String str, int i) {
        this.f12413a = zzjj;
        this.f12414b = str;
        this.f12415c = i;
    }

    /* renamed from: a */
    static aym m15774a(String str) throws IOException {
        String[] split = str.split("\u0000");
        if (split.length != 3) {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
        Parcel obtain = Parcel.obtain();
        try {
            String str2 = new String(Base64.decode(split[0], 0), C2793C.UTF8_NAME);
            int parseInt = Integer.parseInt(split[1]);
            byte[] decode = Base64.decode(split[2], 0);
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            aym aym = new aym((zzjj) zzjj.CREATOR.createFromParcel(obtain), str2, parseInt);
            obtain.recycle();
            return aym;
        } catch (C3510a | IllegalArgumentException | IllegalStateException e) {
            C3025aw.m10921i().mo15436a(e, "QueueSeed.decode");
            throw new IOException("Malformed QueueSeed encoding.", e);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo14985a() {
        Parcel obtain = Parcel.obtain();
        try {
            String encodeToString = Base64.encodeToString(this.f12414b.getBytes(C2793C.UTF8_NAME), 0);
            String num = Integer.toString(this.f12415c);
            this.f12413a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            StringBuilder sb = new StringBuilder(2 + String.valueOf(encodeToString).length() + String.valueOf(num).length() + String.valueOf(encodeToString2).length());
            sb.append(encodeToString);
            sb.append("\u0000");
            sb.append(num);
            sb.append("\u0000");
            sb.append(encodeToString2);
            String sb2 = sb.toString();
            obtain.recycle();
            return sb2;
        } catch (UnsupportedEncodingException unused) {
            C3900je.m17431c("QueueSeed encode failed because UTF-8 is not available.");
            obtain.recycle();
            return "";
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
