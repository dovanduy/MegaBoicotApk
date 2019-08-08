package com.google.android.exoplayer2.source.dash.manifest;

public final class RepresentationKey implements Comparable<RepresentationKey> {
    public final int adaptationSetIndex;
    public final int periodIndex;
    public final int representationIndex;

    public RepresentationKey(int i, int i2, int i3) {
        this.periodIndex = i;
        this.adaptationSetIndex = i2;
        this.representationIndex = i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.periodIndex);
        sb.append(".");
        sb.append(this.adaptationSetIndex);
        sb.append(".");
        sb.append(this.representationIndex);
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
        RepresentationKey representationKey = (RepresentationKey) obj;
        if (!(this.periodIndex == representationKey.periodIndex && this.adaptationSetIndex == representationKey.adaptationSetIndex && this.representationIndex == representationKey.representationIndex)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (31 * ((this.periodIndex * 31) + this.adaptationSetIndex)) + this.representationIndex;
    }

    public int compareTo(RepresentationKey representationKey) {
        int i = this.periodIndex - representationKey.periodIndex;
        if (i != 0) {
            return i;
        }
        int i2 = this.adaptationSetIndex - representationKey.adaptationSetIndex;
        return i2 == 0 ? this.representationIndex - representationKey.representationIndex : i2;
    }
}
