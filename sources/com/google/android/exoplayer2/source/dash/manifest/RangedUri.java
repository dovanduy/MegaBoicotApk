package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.util.UriUtil;

public final class RangedUri {
    private int hashCode;
    public final long length;
    private final String referenceUri;
    public final long start;

    public RangedUri(String str, long j, long j2) {
        if (str == null) {
            str = "";
        }
        this.referenceUri = str;
        this.start = j;
        this.length = j2;
    }

    public Uri resolveUri(String str) {
        return UriUtil.resolveToUri(str, this.referenceUri);
    }

    public String resolveUriString(String str) {
        return UriUtil.resolve(str, this.referenceUri);
    }

    public RangedUri attemptMerge(RangedUri rangedUri, String str) {
        String resolveUriString = resolveUriString(str);
        if (rangedUri == null || !resolveUriString.equals(rangedUri.resolveUriString(str))) {
            return null;
        }
        long j = -1;
        if (this.length != -1 && this.start + this.length == rangedUri.start) {
            long j2 = this.start;
            if (rangedUri.length != -1) {
                j = this.length + rangedUri.length;
            }
            RangedUri rangedUri2 = new RangedUri(resolveUriString, j2, j);
            return rangedUri2;
        } else if (rangedUri.length == -1 || rangedUri.start + rangedUri.length != this.start) {
            return null;
        } else {
            long j3 = rangedUri.start;
            if (this.length != -1) {
                j = rangedUri.length + this.length;
            }
            RangedUri rangedUri3 = new RangedUri(resolveUriString, j3, j);
            return rangedUri3;
        }
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = (31 * (((527 + ((int) this.start)) * 31) + ((int) this.length))) + this.referenceUri.hashCode();
        }
        return this.hashCode;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RangedUri rangedUri = (RangedUri) obj;
        if (!(this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri))) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RangedUri(referenceUri=");
        sb.append(this.referenceUri);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }
}
