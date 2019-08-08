package com.google.android.exoplayer2.source.smoothstreaming.manifest;

public final class StreamKey implements Comparable<StreamKey> {
    public final int streamElementIndex;
    public final int trackIndex;

    public StreamKey(int i, int i2) {
        this.streamElementIndex = i;
        this.trackIndex = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.streamElementIndex);
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
        StreamKey streamKey = (StreamKey) obj;
        if (!(this.streamElementIndex == streamKey.streamElementIndex && this.trackIndex == streamKey.trackIndex)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (31 * this.streamElementIndex) + this.trackIndex;
    }

    public int compareTo(StreamKey streamKey) {
        int i = this.streamElementIndex - streamKey.streamElementIndex;
        return i == 0 ? this.trackIndex - streamKey.trackIndex : i;
    }
}
