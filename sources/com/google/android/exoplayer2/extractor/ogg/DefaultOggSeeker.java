package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import java.io.EOFException;
import java.io.IOException;

final class DefaultOggSeeker implements OggSeeker {
    private static final int DEFAULT_OFFSET = 30000;
    public static final int MATCH_BYTE_RANGE = 100000;
    public static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 3;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private long end;
    private long endGranule;
    private final long endPosition;
    private final OggPageHeader pageHeader = new OggPageHeader();
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    /* access modifiers changed from: private */
    public final long startPosition;
    private int state;
    /* access modifiers changed from: private */
    public final StreamReader streamReader;
    private long targetGranule;
    /* access modifiers changed from: private */
    public long totalGranules;

    private class OggSeekMap implements SeekMap {
        public boolean isSeekable() {
            return true;
        }

        private OggSeekMap() {
        }

        public SeekPoints getSeekPoints(long j) {
            if (j == 0) {
                return new SeekPoints(new SeekPoint(0, DefaultOggSeeker.this.startPosition));
            }
            return new SeekPoints(new SeekPoint(j, DefaultOggSeeker.this.getEstimatedPosition(DefaultOggSeeker.this.startPosition, DefaultOggSeeker.this.streamReader.convertTimeToGranule(j), 30000)));
        }

        public long getDurationUs() {
            return DefaultOggSeeker.this.streamReader.convertGranuleToTime(DefaultOggSeeker.this.totalGranules);
        }
    }

    public DefaultOggSeeker(long j, long j2, StreamReader streamReader2, int i, long j3) {
        Assertions.checkArgument(j >= 0 && j2 > j);
        this.streamReader = streamReader2;
        this.startPosition = j;
        this.endPosition = j2;
        if (((long) i) == j2 - j) {
            this.totalGranules = j3;
            this.state = 3;
            return;
        }
        this.state = 0;
    }

    public long read(ExtractorInput extractorInput) throws IOException, InterruptedException {
        switch (this.state) {
            case 0:
                this.positionBeforeSeekToEnd = extractorInput.getPosition();
                this.state = 1;
                long j = this.endPosition - 65307;
                if (j > this.positionBeforeSeekToEnd) {
                    return j;
                }
                break;
            case 1:
                break;
            case 2:
                long j2 = 0;
                if (this.targetGranule != 0) {
                    long nextSeekPosition = getNextSeekPosition(this.targetGranule, extractorInput);
                    if (nextSeekPosition >= 0) {
                        return nextSeekPosition;
                    }
                    j2 = skipToPageOfGranule(extractorInput, this.targetGranule, -(nextSeekPosition + 2));
                }
                this.state = 3;
                return -(j2 + 2);
            case 3:
                return -1;
            default:
                throw new IllegalStateException();
        }
        this.totalGranules = readGranuleOfLastPage(extractorInput);
        this.state = 3;
        return this.positionBeforeSeekToEnd;
    }

    public long startSeek(long j) {
        Assertions.checkArgument(this.state == 3 || this.state == 2);
        long j2 = 0;
        if (j != 0) {
            j2 = this.streamReader.convertTimeToGranule(j);
        }
        this.targetGranule = j2;
        this.state = 2;
        resetSeeking();
        return this.targetGranule;
    }

    public OggSeekMap createSeekMap() {
        if (this.totalGranules != 0) {
            return new OggSeekMap();
        }
        return null;
    }

    public void resetSeeking() {
        this.start = this.startPosition;
        this.end = this.endPosition;
        this.startGranule = 0;
        this.endGranule = this.totalGranules;
    }

    public long getNextSeekPosition(long j, ExtractorInput extractorInput) throws IOException, InterruptedException {
        ExtractorInput extractorInput2 = extractorInput;
        long j2 = 2;
        if (this.start == this.end) {
            return -(this.startGranule + 2);
        }
        long position = extractorInput.getPosition();
        if (skipToNextPage(extractorInput2, this.end)) {
            this.pageHeader.populate(extractorInput2, false);
            extractorInput.resetPeekPosition();
            long j3 = j - this.pageHeader.granulePosition;
            int i = this.pageHeader.headerSize + this.pageHeader.bodySize;
            if (j3 < 0 || j3 > 72000) {
                if (j3 < 0) {
                    this.end = position;
                    this.endGranule = this.pageHeader.granulePosition;
                } else {
                    long j4 = (long) i;
                    this.start = extractorInput.getPosition() + j4;
                    this.startGranule = this.pageHeader.granulePosition;
                    if ((this.end - this.start) + j4 < 100000) {
                        extractorInput2.skipFully(i);
                        return -(this.startGranule + 2);
                    }
                }
                if (this.end - this.start < 100000) {
                    this.end = this.start;
                    return this.start;
                }
                long j5 = (long) i;
                if (j3 > 0) {
                    j2 = 1;
                }
                return Math.min(Math.max((extractorInput.getPosition() - (j5 * j2)) + ((j3 * (this.end - this.start)) / (this.endGranule - this.startGranule)), this.start), this.end - 1);
            }
            extractorInput2.skipFully(i);
            return -(this.pageHeader.granulePosition + 2);
        } else if (this.start != position) {
            return this.start;
        } else {
            throw new IOException("No ogg page can be found.");
        }
    }

    /* access modifiers changed from: private */
    public long getEstimatedPosition(long j, long j2, long j3) {
        long j4 = j + (((j2 * (this.endPosition - this.startPosition)) / this.totalGranules) - j3);
        if (j4 < this.startPosition) {
            j4 = this.startPosition;
        }
        return j4 >= this.endPosition ? this.endPosition - 1 : j4;
    }

    /* access modifiers changed from: 0000 */
    public void skipToNextPage(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (!skipToNextPage(extractorInput, this.endPosition)) {
            throw new EOFException();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean skipToNextPage(ExtractorInput extractorInput, long j) throws IOException, InterruptedException {
        int i;
        long min = Math.min(j + 3, this.endPosition);
        byte[] bArr = new byte[2048];
        int length = bArr.length;
        while (true) {
            int i2 = 0;
            if (extractorInput.getPosition() + ((long) length) > min) {
                length = (int) (min - extractorInput.getPosition());
                if (length < 4) {
                    return false;
                }
            }
            extractorInput.peekFully(bArr, 0, length, false);
            while (true) {
                i = length - 3;
                if (i2 >= i) {
                    break;
                } else if (bArr[i2] == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103 && bArr[i2 + 3] == 83) {
                    extractorInput.skipFully(i2);
                    return true;
                } else {
                    i2++;
                }
            }
            extractorInput.skipFully(i);
        }
    }

    /* access modifiers changed from: 0000 */
    public long readGranuleOfLastPage(ExtractorInput extractorInput) throws IOException, InterruptedException {
        skipToNextPage(extractorInput);
        this.pageHeader.reset();
        while ((this.pageHeader.type & 4) != 4 && extractorInput.getPosition() < this.endPosition) {
            this.pageHeader.populate(extractorInput, false);
            extractorInput.skipFully(this.pageHeader.headerSize + this.pageHeader.bodySize);
        }
        return this.pageHeader.granulePosition;
    }

    /* access modifiers changed from: 0000 */
    public long skipToPageOfGranule(ExtractorInput extractorInput, long j, long j2) throws IOException, InterruptedException {
        this.pageHeader.populate(extractorInput, false);
        while (this.pageHeader.granulePosition < j) {
            extractorInput.skipFully(this.pageHeader.headerSize + this.pageHeader.bodySize);
            j2 = this.pageHeader.granulePosition;
            this.pageHeader.populate(extractorInput, false);
        }
        extractorInput.resetPeekPosition();
        return j2;
    }
}
