package com.google.android.exoplayer2.offline;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public abstract class DownloadAction {
    public final byte[] data;
    public final boolean isRemoveAction;
    public final String type;
    public final Uri uri;
    public final int version;

    public static abstract class Deserializer {
        public final String type;
        public final int version;

        public abstract DownloadAction readFromStream(int i, DataInputStream dataInputStream) throws IOException;

        public Deserializer(String str, int i) {
            this.type = str;
            this.version = i;
        }
    }

    /* access modifiers changed from: protected */
    public abstract Downloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper);

    /* access modifiers changed from: protected */
    public abstract void writeToStream(DataOutputStream dataOutputStream) throws IOException;

    public static DownloadAction deserializeFromStream(Deserializer[] deserializerArr, InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String readUTF = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        for (Deserializer deserializer : deserializerArr) {
            if (readUTF.equals(deserializer.type) && deserializer.version >= readInt) {
                return deserializer.readFromStream(readInt, dataInputStream);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No deserializer found for:");
        sb.append(readUTF);
        sb.append(", ");
        sb.append(readInt);
        throw new DownloadException(sb.toString());
    }

    public static void serializeToStream(DownloadAction downloadAction, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.type);
        dataOutputStream.writeInt(downloadAction.version);
        downloadAction.writeToStream(dataOutputStream);
        dataOutputStream.flush();
    }

    protected DownloadAction(String str, int i, Uri uri2, boolean z, byte[] bArr) {
        this.type = str;
        this.version = i;
        this.uri = uri2;
        this.isRemoveAction = z;
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.data = bArr;
    }

    public final byte[] toByteArray() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            serializeToStream(this, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException();
        }
    }

    public boolean isSameMedia(DownloadAction downloadAction) {
        return this.uri.equals(downloadAction.uri);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadAction downloadAction = (DownloadAction) obj;
        if (this.type.equals(downloadAction.type) && this.version == downloadAction.version && this.uri.equals(downloadAction.uri) && this.isRemoveAction == downloadAction.isRemoveAction && Arrays.equals(this.data, downloadAction.data)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return (31 * ((this.uri.hashCode() * 31) + (this.isRemoveAction ? 1 : 0))) + Arrays.hashCode(this.data);
    }
}
