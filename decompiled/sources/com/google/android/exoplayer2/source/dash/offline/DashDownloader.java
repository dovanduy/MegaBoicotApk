package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.offline.DownloadException;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.DashUtil;
import com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.source.dash.manifest.RepresentationKey;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class DashDownloader extends SegmentDownloader<DashManifest, RepresentationKey> {
    public DashDownloader(Uri uri, List<RepresentationKey> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        super(uri, list, downloaderConstructorHelper);
    }

    /* access modifiers changed from: protected */
    public DashManifest getManifest(DataSource dataSource, Uri uri) throws IOException {
        return DashUtil.loadManifest(dataSource, uri);
    }

    /* access modifiers changed from: protected */
    public List<Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z) throws InterruptedException, IOException {
        DashManifest dashManifest2 = dashManifest;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dashManifest.getPeriodCount(); i++) {
            Period period = dashManifest2.getPeriod(i);
            long msToUs = C2793C.msToUs(period.startMs);
            long periodDurationUs = dashManifest2.getPeriodDurationUs(i);
            List<AdaptationSet> list = period.adaptationSets;
            int i2 = 0;
            while (i2 < list.size()) {
                int i3 = i2;
                List<AdaptationSet> list2 = list;
                addSegmentsForAdaptationSet(dataSource, (AdaptationSet) list.get(i2), msToUs, periodDurationUs, z, arrayList);
                i2 = i3 + 1;
                list = list2;
            }
        }
        return arrayList;
    }

    private static void addSegmentsForAdaptationSet(DataSource dataSource, AdaptationSet adaptationSet, long j, long j2, boolean z, ArrayList<Segment> arrayList) throws IOException, InterruptedException {
        AdaptationSet adaptationSet2 = adaptationSet;
        long j3 = j;
        ArrayList<Segment> arrayList2 = arrayList;
        int i = 0;
        while (i < adaptationSet2.representations.size()) {
            Representation representation = (Representation) adaptationSet2.representations.get(i);
            try {
                DashSegmentIndex segmentIndex = getSegmentIndex(dataSource, adaptationSet2.type, representation);
                if (segmentIndex == null) {
                    throw new DownloadException("Missing segment index");
                }
                int segmentCount = segmentIndex.getSegmentCount(j2);
                if (segmentCount == -1) {
                    throw new DownloadException("Unbounded segment index");
                }
                String str = representation.baseUrl;
                RangedUri initializationUri = representation.getInitializationUri();
                if (initializationUri != null) {
                    addSegment(j3, str, initializationUri, arrayList2);
                }
                RangedUri indexUri = representation.getIndexUri();
                if (indexUri != null) {
                    addSegment(j3, str, indexUri, arrayList2);
                }
                long firstSegmentNum = segmentIndex.getFirstSegmentNum();
                long j4 = (firstSegmentNum + ((long) segmentCount)) - 1;
                while (firstSegmentNum <= j4) {
                    addSegment(j3 + segmentIndex.getTimeUs(firstSegmentNum), str, segmentIndex.getSegmentUrl(firstSegmentNum), arrayList2);
                    firstSegmentNum++;
                }
                i++;
            } catch (IOException e) {
                IOException iOException = e;
                if (!z) {
                    throw iOException;
                }
            }
        }
    }

    private static void addSegment(long j, String str, RangedUri rangedUri, ArrayList<Segment> arrayList) {
        DataSpec dataSpec = new DataSpec(rangedUri.resolveUri(str), rangedUri.start, rangedUri.length, null);
        arrayList.add(new Segment(j, dataSpec));
    }

    private static DashSegmentIndex getSegmentIndex(DataSource dataSource, int i, Representation representation) throws IOException, InterruptedException {
        DashSegmentIndex dashSegmentIndex;
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex loadChunkIndex = DashUtil.loadChunkIndex(dataSource, i, representation);
        if (loadChunkIndex == null) {
            dashSegmentIndex = null;
        } else {
            dashSegmentIndex = new DashWrappingSegmentIndex(loadChunkIndex, representation.presentationTimeOffsetUs);
        }
        return dashSegmentIndex;
    }
}
