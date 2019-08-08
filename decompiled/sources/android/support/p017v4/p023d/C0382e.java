package android.support.p017v4.p023d;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.d.e */
/* compiled from: LogWriter */
public class C0382e extends Writer {

    /* renamed from: a */
    private final String f963a;

    /* renamed from: b */
    private StringBuilder f964b = new StringBuilder(128);

    public C0382e(String str) {
        this.f963a = str;
    }

    public void close() {
        m1418a();
    }

    public void flush() {
        m1418a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m1418a();
            } else {
                this.f964b.append(c);
            }
        }
    }

    /* renamed from: a */
    private void m1418a() {
        if (this.f964b.length() > 0) {
            Log.d(this.f963a, this.f964b.toString());
            this.f964b.delete(0, this.f964b.length());
        }
    }
}
