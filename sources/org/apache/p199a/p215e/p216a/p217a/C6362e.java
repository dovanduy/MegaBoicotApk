package org.apache.p199a.p215e.p216a.p217a;

import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: org.apache.a.e.a.a.e */
/* compiled from: FileBody */
public class C6362e extends C6358a {

    /* renamed from: a */
    private final File f20891a;

    /* renamed from: b */
    private final String f20892b;

    /* renamed from: c */
    private final String f20893c;

    /* renamed from: d */
    public String mo22633d() {
        return "binary";
    }

    public C6362e(File file, String str, String str2, String str3) {
        super(str2);
        if (file == null) {
            throw new IllegalArgumentException("File may not be null");
        }
        this.f20891a = file;
        if (str != null) {
            this.f20892b = str;
        } else {
            this.f20892b = file.getName();
        }
        this.f20893c = str3;
    }

    public C6362e(File file, String str, String str2) {
        this(file, null, str, str2);
    }

    public C6362e(File file, String str) {
        this(file, str, null);
    }

    public C6362e(File file) {
        this(file, "application/octet-stream");
    }

    /* renamed from: a */
    public void mo22630a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        FileInputStream fileInputStream = new FileInputStream(this.f20891a);
        try {
            byte[] bArr = new byte[MpegAudioHeader.MAX_FRAME_SIZE_BYTES];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } finally {
            fileInputStream.close();
        }
    }

    /* renamed from: c */
    public String mo22632c() {
        return this.f20893c;
    }

    /* renamed from: e */
    public long mo22634e() {
        return this.f20891a.length();
    }

    /* renamed from: b */
    public String mo22631b() {
        return this.f20892b;
    }
}
