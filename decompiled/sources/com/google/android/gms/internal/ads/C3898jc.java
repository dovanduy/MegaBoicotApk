package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jc */
public final class C3898jc {

    /* renamed from: e */
    private static final Comparator<byte[]> f13377e = new C3926kd();

    /* renamed from: a */
    private final List<byte[]> f13378a = new LinkedList();

    /* renamed from: b */
    private final List<byte[]> f13379b = new ArrayList(64);

    /* renamed from: c */
    private int f13380c = 0;

    /* renamed from: d */
    private final int f13381d = MpegAudioHeader.MAX_FRAME_SIZE_BYTES;

    public C3898jc(int i) {
    }

    /* renamed from: a */
    private final synchronized void m17038a() {
        while (this.f13380c > this.f13381d) {
            byte[] bArr = (byte[]) this.f13378a.remove(0);
            this.f13379b.remove(bArr);
            this.f13380c -= bArr.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo15478a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f13381d     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f13378a     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f13379b     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f13377e     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f13379b     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f13380c     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f13380c = r0     // Catch:{ all -> 0x002b }
            r2.m17038a()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3898jc.mo15478a(byte[]):void");
    }

    /* renamed from: a */
    public final synchronized byte[] mo15479a(int i) {
        for (int i2 = 0; i2 < this.f13379b.size(); i2++) {
            byte[] bArr = (byte[]) this.f13379b.get(i2);
            if (bArr.length >= i) {
                this.f13380c -= bArr.length;
                this.f13379b.remove(i2);
                this.f13378a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
