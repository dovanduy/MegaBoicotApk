package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadAction.Deserializer;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloadAction;
import com.google.android.exoplayer2.source.dash.manifest.RepresentationKey;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public final class DashDownloadAction extends SegmentDownloadAction<RepresentationKey> {
    public static final Deserializer DESERIALIZER = new SegmentDownloadActionDeserializer<RepresentationKey>(TYPE, 0) {
        /* access modifiers changed from: protected */
        public RepresentationKey readKey(DataInputStream dataInputStream) throws IOException {
            return new RepresentationKey(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt());
        }

        /* access modifiers changed from: protected */
        public DownloadAction createDownloadAction(Uri uri, boolean z, byte[] bArr, List<RepresentationKey> list) {
            return new DashDownloadAction(uri, z, bArr, list);
        }
    };
    private static final String TYPE = "dash";
    private static final int VERSION = 0;

    public DashDownloadAction(Uri uri, boolean z, byte[] bArr, List<RepresentationKey> list) {
        super(TYPE, 0, uri, z, bArr, list);
    }

    /* access modifiers changed from: protected */
    public DashDownloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper) {
        return new DashDownloader(this.uri, this.keys, downloaderConstructorHelper);
    }

    /* access modifiers changed from: protected */
    public void writeKey(DataOutputStream dataOutputStream, RepresentationKey representationKey) throws IOException {
        dataOutputStream.writeInt(representationKey.periodIndex);
        dataOutputStream.writeInt(representationKey.adaptationSetIndex);
        dataOutputStream.writeInt(representationKey.representationIndex);
    }
}
