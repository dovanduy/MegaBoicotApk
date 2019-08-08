package android.support.multidex;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: android.support.multidex.c */
/* compiled from: ZipUtil */
final class C0203c {

    /* renamed from: android.support.multidex.c$a */
    /* compiled from: ZipUtil */
    static class C0204a {

        /* renamed from: a */
        long f312a;

        /* renamed from: b */
        long f313b;

        C0204a() {
        }
    }

    /* renamed from: a */
    static long m487a(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m488a(randomAccessFile, m489a(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    static C0204a m489a(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("File too short to be a zip file: ");
            sb.append(randomAccessFile.length());
            throw new ZipException(sb.toString());
        }
        long j2 = length - 65536;
        if (j2 >= 0) {
            j = j2;
        }
        int reverseBytes = Integer.reverseBytes(101010256);
        while (true) {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                C0204a aVar = new C0204a();
                aVar.f313b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                aVar.f312a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return aVar;
            }
            long j3 = length - 1;
            if (j3 < j) {
                throw new ZipException("End Of Central Directory signature not found");
            }
            length = j3;
        }
    }

    /* renamed from: a */
    static long m488a(RandomAccessFile randomAccessFile, C0204a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = aVar.f313b;
        randomAccessFile.seek(aVar.f312a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            long j2 = j - ((long) read);
            if (j2 == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j2));
            j = j2;
        }
        return crc32.getValue();
    }
}
