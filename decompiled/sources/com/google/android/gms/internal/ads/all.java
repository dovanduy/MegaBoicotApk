package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class all {

    /* renamed from: a */
    private ByteArrayOutputStream f11367a = new ByteArrayOutputStream(MpegAudioHeader.MAX_FRAME_SIZE_BYTES);

    /* renamed from: b */
    private Base64OutputStream f11368b = new Base64OutputStream(this.f11367a, 10);

    /* renamed from: a */
    public final void mo14497a(byte[] bArr) throws IOException {
        this.f11368b.write(bArr);
    }

    public final String toString() {
        String str;
        try {
            this.f11368b.close();
        } catch (IOException e) {
            C3900je.m17430b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f11367a.close();
            str = this.f11367a.toString();
        } catch (IOException e2) {
            C3900je.m17430b("HashManager: Unable to convert to Base64.", e2);
            str = "";
        } catch (Throwable th) {
            this.f11367a = null;
            this.f11368b = null;
            throw th;
        }
        this.f11367a = null;
        this.f11368b = null;
        return str;
    }
}
