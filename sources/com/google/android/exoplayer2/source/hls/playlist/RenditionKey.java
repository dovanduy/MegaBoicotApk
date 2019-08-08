package com.google.android.exoplayer2.source.hls.playlist;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RenditionKey implements Comparable<RenditionKey> {
    public static final int TYPE_AUDIO = 1;
    public static final int TYPE_SUBTITLE = 2;
    public static final int TYPE_VARIANT = 0;
    public final int trackIndex;
    public final int type;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public RenditionKey(int i, int i2) {
        this.type = i;
        this.trackIndex = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.type);
        sb.append(".");
        sb.append(this.trackIndex);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RenditionKey renditionKey = (RenditionKey) obj;
        if (!(this.type == renditionKey.type && this.trackIndex == renditionKey.trackIndex)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (31 * this.type) + this.trackIndex;
    }

    public int compareTo(RenditionKey renditionKey) {
        int i = this.type - renditionKey.type;
        return i == 0 ? this.trackIndex - renditionKey.trackIndex : i;
    }
}
