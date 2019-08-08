package com.facebook.ads.internal.p095v.p097b.p098a;

import com.facebook.ads.internal.p095v.p097b.C1875a;
import com.facebook.ads.internal.p095v.p097b.C1905l;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.v.b.a.b */
public class C1877b implements C1875a {

    /* renamed from: a */
    public File f5937a;

    /* renamed from: b */
    private final C1876a f5938b;

    /* renamed from: c */
    private RandomAccessFile f5939c;

    public C1877b(File file, C1876a aVar) {
        File file2;
        if (aVar == null) {
            try {
                throw new NullPointerException();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error using file ");
                sb.append(file);
                sb.append(" as disc cache");
                throw new C1905l(sb.toString(), e);
            }
        } else {
            this.f5938b = aVar;
            File parentFile = file.getParentFile();
            if (parentFile.exists()) {
                if (!parentFile.isDirectory()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("File ");
                    sb2.append(parentFile);
                    sb2.append(" is not directory!");
                    throw new IOException(sb2.toString());
                }
            } else if (!parentFile.mkdirs()) {
                throw new IOException(String.format(Locale.US, "Directory %s can't be created", new Object[]{parentFile.getAbsolutePath()}));
            }
            boolean exists = file.exists();
            if (exists) {
                file2 = file;
            } else {
                File parentFile2 = file.getParentFile();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file.getName());
                sb3.append(".download");
                file2 = new File(parentFile2, sb3.toString());
            }
            this.f5937a = file2;
            this.f5939c = new RandomAccessFile(this.f5937a, exists ? "r" : "rw");
        }
    }

    /* renamed from: a */
    public synchronized int mo7910a() {
        try {
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error reading length of file ");
            sb.append(this.f5937a);
            throw new C1905l(sb.toString(), e);
        }
        return (int) this.f5939c.length();
    }

    /* renamed from: a */
    public synchronized int mo7911a(byte[] bArr, long j, int i) {
        try {
            this.f5939c.seek(j);
        } catch (IOException e) {
            throw new C1905l(String.format(Locale.US, "Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", new Object[]{Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(mo7910a()), Integer.valueOf(bArr.length)}), e);
        }
        return this.f5939c.read(bArr, 0, i);
    }

    /* renamed from: a */
    public synchronized void mo7912a(byte[] bArr, int i) {
        try {
            if (mo7915d()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error append cache: cache file ");
                sb.append(this.f5937a);
                sb.append(" is completed!");
                throw new C1905l(sb.toString());
            }
            this.f5939c.seek((long) mo7910a());
            this.f5939c.write(bArr, 0, i);
        } catch (IOException e) {
            String str = "Error writing %d bytes to %s from buffer with size %d";
            throw new C1905l(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), this.f5939c, Integer.valueOf(bArr.length)}), e);
        }
    }

    /* renamed from: b */
    public synchronized void mo7913b() {
        try {
            this.f5939c.close();
            this.f5938b.mo7916a(this.f5937a);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error closing file ");
            sb.append(this.f5937a);
            throw new C1905l(sb.toString(), e);
        }
    }

    /* renamed from: c */
    public synchronized void mo7914c() {
        if (!mo7915d()) {
            mo7913b();
            File file = new File(this.f5937a.getParentFile(), this.f5937a.getName().substring(0, this.f5937a.getName().length() - ".download".length()));
            if (!this.f5937a.renameTo(file)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error renaming file ");
                sb.append(this.f5937a);
                sb.append(" to ");
                sb.append(file);
                sb.append(" for completion!");
                throw new C1905l(sb.toString());
            }
            this.f5937a = file;
            try {
                this.f5939c = new RandomAccessFile(this.f5937a, "r");
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error opening ");
                sb2.append(this.f5937a);
                sb2.append(" as disc cache");
                throw new C1905l(sb2.toString(), e);
            }
        }
    }

    /* renamed from: d */
    public synchronized boolean mo7915d() {
        return !this.f5937a.getName().endsWith(".download");
    }
}
