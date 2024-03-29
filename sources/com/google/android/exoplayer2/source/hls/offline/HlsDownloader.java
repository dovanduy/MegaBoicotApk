package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.RenditionKey;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.util.UriUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class HlsDownloader extends SegmentDownloader<HlsPlaylist, RenditionKey> {
    public HlsDownloader(Uri uri, List<RenditionKey> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        super(uri, list, downloaderConstructorHelper);
    }

    /* access modifiers changed from: protected */
    public HlsPlaylist getManifest(DataSource dataSource, Uri uri) throws IOException {
        return loadManifest(dataSource, uri);
    }

    /* access modifiers changed from: protected */
    public List<Segment> getSegments(DataSource dataSource, HlsPlaylist hlsPlaylist, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (hlsPlaylist instanceof HlsMasterPlaylist) {
            HlsMasterPlaylist hlsMasterPlaylist = (HlsMasterPlaylist) hlsPlaylist;
            addResolvedUris(hlsMasterPlaylist.baseUri, hlsMasterPlaylist.variants, arrayList);
            addResolvedUris(hlsMasterPlaylist.baseUri, hlsMasterPlaylist.audios, arrayList);
            addResolvedUris(hlsMasterPlaylist.baseUri, hlsMasterPlaylist.subtitles, arrayList);
        } else {
            arrayList.add(Uri.parse(hlsPlaylist.baseUri));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            try {
                HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) loadManifest(dataSource, uri);
                arrayList2.add(new Segment(hlsMediaPlaylist.startTimeUs, new DataSpec(uri)));
                Segment segment = null;
                List<Segment> list = hlsMediaPlaylist.segments;
                for (int i = 0; i < list.size(); i++) {
                    Segment segment2 = (Segment) list.get(i);
                    Segment segment3 = segment2.initializationSegment;
                    if (!(segment3 == null || segment3 == segment)) {
                        addSegment(arrayList2, hlsMediaPlaylist, segment3, hashSet);
                        segment = segment3;
                    }
                    addSegment(arrayList2, hlsMediaPlaylist, segment2, hashSet);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
                arrayList2.add(new Segment(0, new DataSpec(uri)));
            }
        }
        return arrayList2;
    }

    private static HlsPlaylist loadManifest(DataSource dataSource, Uri uri) throws IOException {
        ParsingLoadable parsingLoadable = new ParsingLoadable(dataSource, uri, 4, (Parser<? extends T>) new HlsPlaylistParser<Object>());
        parsingLoadable.load();
        return (HlsPlaylist) parsingLoadable.getResult();
    }

    private static void addSegment(ArrayList<Segment> arrayList, HlsMediaPlaylist hlsMediaPlaylist, Segment segment, HashSet<Uri> hashSet) {
        ArrayList<Segment> arrayList2 = arrayList;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        Segment segment2 = segment;
        long j = hlsMediaPlaylist2.startTimeUs + segment2.relativeStartTimeUs;
        if (segment2.fullSegmentEncryptionKeyUri != null) {
            Uri resolveToUri = UriUtil.resolveToUri(hlsMediaPlaylist2.baseUri, segment2.fullSegmentEncryptionKeyUri);
            if (hashSet.add(resolveToUri)) {
                arrayList2.add(new Segment(j, new DataSpec(resolveToUri)));
            }
        }
        DataSpec dataSpec = new DataSpec(UriUtil.resolveToUri(hlsMediaPlaylist2.baseUri, segment2.url), segment2.byterangeOffset, segment2.byterangeLength, null);
        arrayList2.add(new Segment(j, dataSpec));
    }

    private static void addResolvedUris(String str, List<HlsUrl> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            list2.add(UriUtil.resolveToUri(str, ((HlsUrl) list.get(i)).url));
        }
    }
}
