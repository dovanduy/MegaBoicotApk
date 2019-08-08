package com.startapp.android.publish.cache;

import java.io.Serializable;

/* renamed from: com.startapp.android.publish.cache.h */
/* compiled from: StartAppSDK */
public class C5456h implements Serializable {
    private static final long serialVersionUID = 1;
    private String filename;
    private long lastUseTimestamp;
    private String videoLocation;

    public C5456h(String str) {
        this.filename = str;
    }

    /* renamed from: a */
    public String mo20134a() {
        return this.filename;
    }

    /* renamed from: b */
    public String mo20137b() {
        return this.videoLocation;
    }

    /* renamed from: a */
    public void mo20136a(String str) {
        this.videoLocation = str;
    }

    /* renamed from: a */
    public void mo20135a(long j) {
        this.lastUseTimestamp = j;
    }

    public int hashCode() {
        int i;
        if (this.filename == null) {
            i = 0;
        } else {
            i = this.filename.hashCode();
        }
        return 31 + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5456h hVar = (C5456h) obj;
        if (this.filename == null) {
            if (hVar.filename != null) {
                return false;
            }
        } else if (!this.filename.equals(hVar.filename)) {
            return false;
        }
        return true;
    }
}
