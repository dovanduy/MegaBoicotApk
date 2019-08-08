package com.startapp.p154a.p155a.p156a;

import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import java.io.Serializable;

/* renamed from: com.startapp.a.a.a.c */
/* compiled from: StartAppSDK */
public class C5044c implements Serializable {

    /* renamed from: a */
    static final /* synthetic */ boolean f16330a = true;

    /* renamed from: d */
    private final long[][] f16331d;

    /* renamed from: e */
    private int f16332e;

    /* renamed from: f */
    private final int f16333f;

    /* renamed from: d */
    private int m21799d(long j) {
        return (int) (((j - 1) >>> 6) + 1);
    }

    public C5044c(long j) {
        this.f16332e = m21799d(j);
        int i = this.f16332e % MpegAudioHeader.MAX_FRAME_SIZE_BYTES;
        int i2 = this.f16332e / MpegAudioHeader.MAX_FRAME_SIZE_BYTES;
        this.f16333f = (i == 0 ? 0 : 1) + i2;
        if (this.f16333f > 100) {
            StringBuilder sb = new StringBuilder();
            sb.append("HighPageCountException pageCount = ");
            sb.append(this.f16333f);
            throw new RuntimeException(sb.toString());
        }
        this.f16331d = new long[this.f16333f][];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f16331d[i3] = new long[MpegAudioHeader.MAX_FRAME_SIZE_BYTES];
        }
        if (i != 0) {
            this.f16331d[this.f16331d.length - 1] = new long[i];
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo18637a() {
        return ((long) this.f16332e) << 6;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18638a(long j) {
        int b = m21796b(j);
        long j2 = 1 << (((int) j) & 63);
        long[] jArr = this.f16331d[b / MpegAudioHeader.MAX_FRAME_SIZE_BYTES];
        int i = b % MpegAudioHeader.MAX_FRAME_SIZE_BYTES;
        jArr[i] = jArr[i] | j2;
    }

    /* renamed from: b */
    private int m21796b(long j) {
        int i = (int) (j >> 6);
        if (i >= this.f16332e) {
            m21798c(j + 1);
            this.f16332e = i + 1;
        }
        return i;
    }

    /* renamed from: c */
    private void m21798c(long j) {
        m21797b(m21799d(j));
    }

    /* renamed from: b */
    private void m21797b(int i) {
        if (!f16330a && i > this.f16332e) {
            throw new AssertionError("Growing of paged bitset is not supported");
        }
    }

    /* renamed from: b */
    public int mo18640b() {
        return this.f16332e;
    }

    /* renamed from: c */
    public int mo18641c() {
        return this.f16333f;
    }

    /* renamed from: a */
    public long[] mo18639a(int i) {
        return this.f16331d[i];
    }
}
