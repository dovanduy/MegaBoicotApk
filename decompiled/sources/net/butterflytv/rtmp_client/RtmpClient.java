package net.butterflytv.rtmp_client;

import java.io.IOException;

public class RtmpClient {

    /* renamed from: a */
    private long f20795a = 0;

    /* renamed from: net.butterflytv.rtmp_client.RtmpClient$a */
    public static class C6246a extends IOException {

        /* renamed from: a */
        public final int f20796a;

        public C6246a(int i) {
            this.f20796a = i;
        }
    }

    private native long nativeAlloc();

    private native void nativeClose(long j);

    private native int nativeOpen(String str, boolean z, long j);

    private native int nativeRead(byte[] bArr, int i, int i2, long j) throws IOException;

    static {
        System.loadLibrary("rtmp-jni");
    }

    /* renamed from: a */
    public void mo22387a(String str, boolean z) throws C6246a {
        this.f20795a = nativeAlloc();
        int nativeOpen = nativeOpen(str, z, this.f20795a);
        if (nativeOpen != 1) {
            this.f20795a = 0;
            throw new C6246a(nativeOpen);
        }
    }

    /* renamed from: a */
    public int mo22385a(byte[] bArr, int i, int i2) throws IOException {
        return nativeRead(bArr, i, i2, this.f20795a);
    }

    /* renamed from: a */
    public void mo22386a() {
        nativeClose(this.f20795a);
    }
}
