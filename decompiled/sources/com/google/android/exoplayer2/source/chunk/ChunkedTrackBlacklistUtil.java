package com.google.android.exoplayer2.source.chunk;

import android.util.Log;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;

public final class ChunkedTrackBlacklistUtil {
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    private static final String TAG = "ChunkedTrackBlacklist";

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i, Exception exc) {
        return maybeBlacklistTrack(trackSelection, i, exc, DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i, Exception exc, long j) {
        if (!shouldBlacklist(exc)) {
            return false;
        }
        boolean blacklist = trackSelection.blacklist(i, j);
        int i2 = ((InvalidResponseCodeException) exc).responseCode;
        if (blacklist) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Blacklisted: duration=");
            sb.append(j);
            sb.append(", responseCode=");
            sb.append(i2);
            sb.append(", format=");
            sb.append(trackSelection.getFormat(i));
            Log.w(str, sb.toString());
        } else {
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Blacklisting failed (cannot blacklist last enabled track): responseCode=");
            sb2.append(i2);
            sb2.append(", format=");
            sb2.append(trackSelection.getFormat(i));
            Log.w(str2, sb2.toString());
        }
        return blacklist;
    }

    public static boolean shouldBlacklist(Exception exc) {
        boolean z = false;
        if (!(exc instanceof InvalidResponseCodeException)) {
            return false;
        }
        int i = ((InvalidResponseCodeException) exc).responseCode;
        if (i == 404 || i == 410) {
            z = true;
        }
        return z;
    }

    private ChunkedTrackBlacklistUtil() {
    }
}
