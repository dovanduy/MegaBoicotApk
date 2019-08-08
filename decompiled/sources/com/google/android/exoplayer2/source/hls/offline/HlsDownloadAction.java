package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadAction.Deserializer;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloadAction;
import com.google.android.exoplayer2.source.hls.playlist.RenditionKey;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public final class HlsDownloadAction extends SegmentDownloadAction<RenditionKey> {
    public static final Deserializer DESERIALIZER = new SegmentDownloadActionDeserializer<RenditionKey>(TYPE, 0) {
        /* access modifiers changed from: protected */
        public RenditionKey readKey(DataInputStream dataInputStream) throws IOException {
            return new RenditionKey(dataInputStream.readInt(), dataInputStream.readInt());
        }

        /* access modifiers changed from: protected */
        public DownloadAction createDownloadAction(Uri uri, boolean z, byte[] bArr, List<RenditionKey> list) {
            return new HlsDownloadAction(uri, z, bArr, list);
        }
    };
    private static final String TYPE = "hls";
    private static final int VERSION = 0;

    public HlsDownloadAction(Uri uri, boolean z, byte[] bArr, List<RenditionKey> list) {
        super(TYPE, 0, uri, z, bArr, list);
    }

    /* access modifiers changed from: protected */
    public HlsDownloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper) {
        return new HlsDownloader(this.uri, this.keys, downloaderConstructorHelper);
    }

    /* access modifiers changed from: protected */
    public void writeKey(DataOutputStream dataOutputStream, RenditionKey renditionKey) throws IOException {
        dataOutputStream.writeInt(renditionKey.type);
        dataOutputStream.writeInt(renditionKey.trackIndex);
    }
}
