package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;

public final class ProgressiveDownloadHelper extends DownloadHelper {
    private final String customCacheKey;
    private final Uri uri;

    public int getPeriodCount() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void prepareInternal() {
    }

    public ProgressiveDownloadHelper(Uri uri2) {
        this(uri2, null);
    }

    public ProgressiveDownloadHelper(Uri uri2, String str) {
        this.uri = uri2;
        this.customCacheKey = str;
    }

    public TrackGroupArray getTrackGroups(int i) {
        return TrackGroupArray.EMPTY;
    }

    public DownloadAction getDownloadAction(byte[] bArr, List<TrackKey> list) {
        return new ProgressiveDownloadAction(this.uri, false, bArr, this.customCacheKey);
    }

    public DownloadAction getRemoveAction(byte[] bArr) {
        return new ProgressiveDownloadAction(this.uri, true, bArr, this.customCacheKey);
    }
}
