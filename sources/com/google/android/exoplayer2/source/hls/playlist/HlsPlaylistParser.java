package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class HlsPlaylistParser implements Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(,|$)");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";

    private static class LineIterator {
        private final Queue<String> extraLines;
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        public boolean hasNext() throws IOException {
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (String) this.extraLines.poll();
                return true;
            }
            do {
                String readLine = this.reader.readLine();
                this.next = readLine;
                if (readLine == null) {
                    return false;
                }
                this.next = this.next.trim();
            } while (this.next.isEmpty());
            return true;
        }

        public String next() throws IOException {
            if (!hasNext()) {
                return null;
            }
            String str = this.next;
            this.next = null;
            return str;
        }
    }

    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (!trim.startsWith(TAG_STREAM_INF)) {
                            if (trim.startsWith(TAG_TARGET_DURATION) || trim.startsWith(TAG_MEDIA_SEQUENCE) || trim.startsWith(TAG_MEDIA_DURATION) || trim.startsWith(TAG_KEY) || trim.startsWith(TAG_BYTERANGE) || trim.equals(TAG_DISCONTINUITY) || trim.equals(TAG_DISCONTINUITY_SEQUENCE)) {
                                break;
                            } else if (trim.equals(TAG_ENDLIST)) {
                                break;
                            } else {
                                arrayDeque.add(trim);
                            }
                        } else {
                            arrayDeque.add(trim);
                            HlsMasterPlaylist parseMasterPlaylist = parseMasterPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                            Util.closeQuietly((Closeable) bufferedReader);
                            return parseMasterPlaylist;
                        }
                    }
                } else {
                    Util.closeQuietly((Closeable) bufferedReader);
                    throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                }
            }
            arrayDeque.add(trim);
            return parseMediaPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
        } finally {
            Util.closeQuietly((Closeable) bufferedReader);
        }
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int skipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, read);
        int length = PLAYLIST_HEADER.length();
        int i = skipIgnorableWhitespace;
        for (int i2 = 0; i2 < length; i2++) {
            if (i != PLAYLIST_HEADER.charAt(i2)) {
                return false;
            }
            i = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, i));
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.isLinebreak(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01e3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist parseMasterPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.LineIterator r27, java.lang.String r28) throws java.io.IOException {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
            r8 = r3
        L_0x0025:
            boolean r9 = r27.hasNext()
            r10 = 1
            if (r9 == 0) goto L_0x00e6
            java.lang.String r9 = r27.next()
            java.lang.String r12 = "#EXT"
            boolean r12 = r9.startsWith(r12)
            if (r12 == 0) goto L_0x003b
            r4.add(r9)
        L_0x003b:
            java.lang.String r12 = "#EXT-X-MEDIA"
            boolean r12 = r9.startsWith(r12)
            if (r12 == 0) goto L_0x0047
            r2.add(r9)
            goto L_0x0025
        L_0x0047:
            java.lang.String r12 = "#EXT-X-STREAM-INF"
            boolean r12 = r9.startsWith(r12)
            if (r12 == 0) goto L_0x0025
            java.lang.String r12 = "CLOSED-CAPTIONS=NONE"
            boolean r12 = r9.contains(r12)
            r8 = r8 | r12
            java.util.regex.Pattern r12 = REGEX_BANDWIDTH
            int r12 = parseIntAttr(r9, r12)
            java.util.regex.Pattern r13 = REGEX_AVERAGE_BANDWIDTH
            java.lang.String r13 = parseOptionalStringAttr(r9, r13)
            if (r13 == 0) goto L_0x0068
            int r12 = java.lang.Integer.parseInt(r13)
        L_0x0068:
            r17 = r12
            java.util.regex.Pattern r12 = REGEX_CODECS
            java.lang.String r12 = parseOptionalStringAttr(r9, r12)
            java.util.regex.Pattern r13 = REGEX_RESOLUTION
            java.lang.String r13 = parseOptionalStringAttr(r9, r13)
            if (r13 == 0) goto L_0x0098
            java.lang.String r14 = "x"
            java.lang.String[] r13 = r13.split(r14)
            r14 = r13[r3]
            int r14 = java.lang.Integer.parseInt(r14)
            r13 = r13[r10]
            int r13 = java.lang.Integer.parseInt(r13)
            if (r14 <= 0) goto L_0x0091
            if (r13 > 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r11 = r14
            goto L_0x0093
        L_0x0091:
            r11 = -1
            r13 = -1
        L_0x0093:
            r18 = r11
            r19 = r13
            goto L_0x009c
        L_0x0098:
            r18 = -1
            r19 = -1
        L_0x009c:
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.regex.Pattern r13 = REGEX_FRAME_RATE
            java.lang.String r13 = parseOptionalStringAttr(r9, r13)
            if (r13 == 0) goto L_0x00aa
            float r11 = java.lang.Float.parseFloat(r13)
        L_0x00aa:
            r20 = r11
            java.util.regex.Pattern r11 = REGEX_AUDIO
            java.lang.String r9 = parseOptionalStringAttr(r9, r11)
            if (r9 == 0) goto L_0x00bd
            if (r12 == 0) goto L_0x00bd
            java.lang.String r10 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r12, r10)
            r1.put(r9, r10)
        L_0x00bd:
            java.lang.String r9 = r27.next()
            boolean r10 = r0.add(r9)
            if (r10 == 0) goto L_0x0025
            int r10 = r5.size()
            java.lang.String r13 = java.lang.Integer.toString(r10)
            java.lang.String r14 = "application/x-mpegURL"
            r15 = 0
            r21 = 0
            r22 = 0
            r16 = r12
            com.google.android.exoplayer2.Format r10 = com.google.android.exoplayer2.Format.createVideoContainerFormat(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl r11 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl
            r11.<init>(r9, r10)
            r5.add(r11)
            goto L_0x0025
        L_0x00e6:
            r9 = r3
            r12 = 0
            r13 = 0
        L_0x00e9:
            int r14 = r2.size()
            if (r9 >= r14) goto L_0x01eb
            java.lang.Object r14 = r2.get(r9)
            java.lang.String r14 = (java.lang.String) r14
            int r23 = parseSelectionFlags(r14)
            java.util.regex.Pattern r15 = REGEX_URI
            java.lang.String r15 = parseOptionalStringAttr(r14, r15)
            java.util.regex.Pattern r0 = REGEX_NAME
            java.lang.String r0 = parseStringAttr(r14, r0)
            java.util.regex.Pattern r3 = REGEX_LANGUAGE
            java.lang.String r24 = parseOptionalStringAttr(r14, r3)
            java.util.regex.Pattern r3 = REGEX_GROUP_ID
            java.lang.String r3 = parseOptionalStringAttr(r14, r3)
            java.util.regex.Pattern r10 = REGEX_TYPE
            java.lang.String r10 = parseStringAttr(r14, r10)
            int r11 = r10.hashCode()
            r25 = r2
            r2 = -959297733(0xffffffffc6d2473b, float:-26915.615)
            r26 = r15
            r15 = 2
            if (r11 == r2) goto L_0x0144
            r2 = -333210994(0xffffffffec239a8e, float:-7.911391E26)
            if (r11 == r2) goto L_0x013a
            r2 = 62628790(0x3bba3b6, float:1.1028458E-36)
            if (r11 == r2) goto L_0x0130
            goto L_0x014e
        L_0x0130:
            java.lang.String r2 = "AUDIO"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x014e
            r2 = 0
            goto L_0x014f
        L_0x013a:
            java.lang.String r2 = "CLOSED-CAPTIONS"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x014e
            r2 = r15
            goto L_0x014f
        L_0x0144:
            java.lang.String r2 = "SUBTITLES"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x014e
            r2 = 1
            goto L_0x014f
        L_0x014e:
            r2 = -1
        L_0x014f:
            switch(r2) {
                case 0: goto L_0x01b3;
                case 1: goto L_0x0197;
                case 2: goto L_0x0154;
                default: goto L_0x0152;
            }
        L_0x0152:
            goto L_0x01e3
        L_0x0154:
            java.util.regex.Pattern r2 = REGEX_INSTREAM_ID
            java.lang.String r2 = parseStringAttr(r14, r2)
            java.lang.String r3 = "CC"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0171
            java.lang.String r3 = "application/cea-608"
            java.lang.String r2 = r2.substring(r15)
            int r2 = java.lang.Integer.parseInt(r2)
        L_0x016c:
            r22 = r2
            r17 = r3
            goto L_0x017d
        L_0x0171:
            java.lang.String r3 = "application/cea-708"
            r10 = 7
            java.lang.String r2 = r2.substring(r10)
            int r2 = java.lang.Integer.parseInt(r2)
            goto L_0x016c
        L_0x017d:
            if (r13 != 0) goto L_0x0184
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0184:
            r16 = 0
            r18 = 0
            r19 = -1
            r15 = r0
            r20 = r23
            r21 = r24
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.createTextContainerFormat(r15, r16, r17, r18, r19, r20, r21, r22)
            r13.add(r0)
            goto L_0x01e3
        L_0x0197:
            java.lang.String r16 = "application/x-mpegURL"
            java.lang.String r17 = "text/vtt"
            r18 = 0
            r19 = -1
            r2 = r26
            r15 = r0
            r20 = r23
            r21 = r24
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.createTextContainerFormat(r15, r16, r17, r18, r19, r20, r21)
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl r3 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl
            r3.<init>(r2, r0)
            r7.add(r3)
            goto L_0x01e3
        L_0x01b3:
            r2 = r26
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x01c4
            java.lang.String r10 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r3)
            r17 = r10
            goto L_0x01c6
        L_0x01c4:
            r17 = 0
        L_0x01c6:
            java.lang.String r16 = "application/x-mpegURL"
            r19 = -1
            r20 = -1
            r21 = -1
            r22 = 0
            r15 = r0
            r18 = r3
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.createAudioContainerFormat(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            if (r2 != 0) goto L_0x01db
            r12 = r0
            goto L_0x01e3
        L_0x01db:
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl r3 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl
            r3.<init>(r2, r0)
            r6.add(r3)
        L_0x01e3:
            int r9 = r9 + 1
            r2 = r25
            r3 = 0
            r10 = 1
            goto L_0x00e9
        L_0x01eb:
            if (r8 == 0) goto L_0x01f3
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
            goto L_0x01f4
        L_0x01f3:
            r9 = r13
        L_0x01f4:
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist
            r2 = r0
            r3 = r28
            r8 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.parseMasterPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator, java.lang.String):com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist");
    }

    private static int parseSelectionFlags(String str) {
        char c = 0;
        boolean parseBooleanAttribute = parseBooleanAttribute(str, REGEX_DEFAULT, false) | (parseBooleanAttribute(str, REGEX_FORCED, false) ? (char) 2 : 0);
        if (parseBooleanAttribute(str, REGEX_AUTOSELECT, false)) {
            c = 4;
        }
        return parseBooleanAttribute | c ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r26v0 */
    /* JADX WARNING: type inference failed for: r17v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r26v1 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: type inference failed for: r8v24 */
    /* JADX WARNING: type inference failed for: r8v25 */
    /* JADX WARNING: type inference failed for: r8v26 */
    /* JADX WARNING: type inference failed for: r8v27 */
    /* JADX WARNING: type inference failed for: r8v28 */
    /* JADX WARNING: type inference failed for: r8v29 */
    /* JADX WARNING: type inference failed for: r8v30 */
    /* JADX WARNING: type inference failed for: r8v31 */
    /* JADX WARNING: type inference failed for: r8v32 */
    /* JADX WARNING: type inference failed for: r8v33 */
    /* JADX WARNING: type inference failed for: r6v55 */
    /* JADX WARNING: type inference failed for: r6v56 */
    /* JADX WARNING: type inference failed for: r6v57 */
    /* JADX WARNING: type inference failed for: r6v58 */
    /* JADX WARNING: type inference failed for: r6v59 */
    /* JADX WARNING: type inference failed for: r6v60 */
    /* JADX WARNING: type inference failed for: r8v34 */
    /* JADX WARNING: type inference failed for: r8v35 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v4
      assigns: []
      uses: []
      mth insns count: 287
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist parseMediaPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.LineIterator r54, java.lang.String r55) throws java.io.IOException {
        /*
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r9 = 1
            r10 = r0
            r20 = r10
            r0 = r8
            r1 = r0
            r14 = r1
            r16 = r14
            r22 = r16
            r23 = r22
            r41 = r23
            r19 = r9
            r4 = 0
            r12 = 0
            r17 = 0
            r24 = 0
            r25 = 0
            r42 = -1
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
        L_0x0037:
            boolean r27 = r54.hasNext()
            if (r27 == 0) goto L_0x028b
            java.lang.String r2 = r54.next()
            java.lang.String r6 = "#EXT"
            boolean r6 = r2.startsWith(r6)
            if (r6 == 0) goto L_0x004c
            r3.add(r2)
        L_0x004c:
            java.lang.String r6 = "#EXT-X-PLAYLIST-TYPE"
            boolean r6 = r2.startsWith(r6)
            if (r6 == 0) goto L_0x006e
            java.util.regex.Pattern r6 = REGEX_PLAYLIST_TYPE
            java.lang.String r2 = parseStringAttr(r2, r6)
            java.lang.String r6 = "VOD"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0064
            r1 = r9
            goto L_0x0037
        L_0x0064:
            java.lang.String r6 = "EVENT"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0037
            r1 = 2
            goto L_0x0037
        L_0x006e:
            java.lang.String r6 = "#EXT-X-START"
            boolean r6 = r2.startsWith(r6)
            r27 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r6 == 0) goto L_0x0085
            java.util.regex.Pattern r6 = REGEX_TIME_OFFSET
            double r6 = parseDoubleAttr(r2, r6)
            double r6 = r6 * r27
            long r10 = (long) r6
            goto L_0x0037
        L_0x0085:
            java.lang.String r6 = "#EXT-X-MAP"
            boolean r6 = r2.startsWith(r6)
            if (r6 == 0) goto L_0x00c3
            java.util.regex.Pattern r6 = REGEX_URI
            java.lang.String r28 = parseStringAttr(r2, r6)
            java.util.regex.Pattern r6 = REGEX_ATTR_BYTERANGE
            java.lang.String r2 = parseOptionalStringAttr(r2, r6)
            if (r2 == 0) goto L_0x00b0
            java.lang.String r6 = "@"
            java.lang.String[] r2 = r2.split(r6)
            r6 = r2[r8]
            long r42 = java.lang.Long.parseLong(r6)
            int r6 = r2.length
            if (r6 <= r9) goto L_0x00b0
            r2 = r2[r9]
            long r25 = java.lang.Long.parseLong(r2)
        L_0x00b0:
            r29 = r25
            r31 = r42
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r2 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment
            r27 = r2
            r27.<init>(r28, r29, r31)
            r48 = r2
            r25 = 0
            r42 = -1
            goto L_0x0037
        L_0x00c3:
            java.lang.String r6 = "#EXT-X-TARGETDURATION"
            boolean r6 = r2.startsWith(r6)
            if (r6 == 0) goto L_0x00d9
            java.util.regex.Pattern r6 = REGEX_TARGET_DURATION
            int r2 = parseIntAttr(r2, r6)
            long r6 = (long) r2
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r20 = r20 * r6
            goto L_0x0037
        L_0x00d9:
            java.lang.String r6 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r6 = r2.startsWith(r6)
            if (r6 == 0) goto L_0x00eb
            java.util.regex.Pattern r4 = REGEX_MEDIA_SEQUENCE
            long r4 = parseLongAttr(r2, r4)
            r17 = r4
            goto L_0x0037
        L_0x00eb:
            java.lang.String r6 = "#EXT-X-VERSION"
            boolean r6 = r2.startsWith(r6)
            if (r6 == 0) goto L_0x00fb
            java.util.regex.Pattern r6 = REGEX_VERSION
            int r19 = parseIntAttr(r2, r6)
            goto L_0x0037
        L_0x00fb:
            java.lang.String r6 = "#EXTINF"
            boolean r6 = r2.startsWith(r6)
            if (r6 == 0) goto L_0x0110
            java.util.regex.Pattern r6 = REGEX_MEDIA_DURATION
            double r6 = parseDoubleAttr(r2, r6)
            double r6 = r6 * r27
            long r6 = (long) r6
            r49 = r6
            goto L_0x0037
        L_0x0110:
            java.lang.String r6 = "#EXT-X-KEY"
            boolean r6 = r2.startsWith(r6)
            if (r6 == 0) goto L_0x0190
            java.util.regex.Pattern r6 = REGEX_METHOD
            java.lang.String r6 = parseOptionalStringAttr(r2, r6)
            java.util.regex.Pattern r7 = REGEX_KEYFORMAT
            java.lang.String r7 = parseOptionalStringAttr(r2, r7)
            java.lang.String r8 = "NONE"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x0188
            java.util.regex.Pattern r8 = REGEX_IV
            java.lang.String r8 = parseOptionalStringAttr(r2, r8)
            java.lang.String r9 = "identity"
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x016e
            if (r7 != 0) goto L_0x013d
            goto L_0x016e
        L_0x013d:
            if (r6 == 0) goto L_0x016b
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r2 = parseWidevineSchemeData(r2, r7)
            if (r2 == 0) goto L_0x016b
            com.google.android.exoplayer2.drm.DrmInitData r7 = new com.google.android.exoplayer2.drm.DrmInitData
            java.lang.String r9 = "SAMPLE-AES-CENC"
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x015b
            java.lang.String r9 = "SAMPLE-AES-CTR"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x0158
            goto L_0x015b
        L_0x0158:
            java.lang.String r6 = "cbcs"
            goto L_0x015d
        L_0x015b:
            java.lang.String r6 = "cenc"
        L_0x015d:
            r53 = r8
            r9 = 1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r8 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r9]
            r9 = 0
            r8[r9] = r2
            r7.<init>(r6, r8)
            r24 = r7
            goto L_0x0183
        L_0x016b:
            r53 = r8
            goto L_0x0183
        L_0x016e:
            r53 = r8
            java.lang.String r7 = "AES-128"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0183
            java.util.regex.Pattern r6 = REGEX_URI
            java.lang.String r2 = parseStringAttr(r2, r6)
            r46 = r2
            r47 = r53
            goto L_0x018c
        L_0x0183:
            r47 = r53
            r46 = 0
            goto L_0x018c
        L_0x0188:
            r46 = 0
            r47 = 0
        L_0x018c:
            r8 = 0
        L_0x018d:
            r9 = 1
            goto L_0x0037
        L_0x0190:
            java.lang.String r6 = "#EXT-X-BYTERANGE"
            boolean r6 = r2.startsWith(r6)
            if (r6 == 0) goto L_0x01b9
            java.util.regex.Pattern r6 = REGEX_BYTERANGE
            java.lang.String r2 = parseStringAttr(r2, r6)
            java.lang.String r6 = "@"
            java.lang.String[] r2 = r2.split(r6)
            r6 = 0
            r7 = r2[r6]
            long r42 = java.lang.Long.parseLong(r7)
            int r7 = r2.length
            r8 = 1
            if (r7 <= r8) goto L_0x01b5
            r2 = r2[r8]
            long r25 = java.lang.Long.parseLong(r2)
        L_0x01b5:
            r9 = r8
        L_0x01b6:
            r8 = r6
            goto L_0x0037
        L_0x01b9:
            r6 = 0
            r8 = 1
            java.lang.String r7 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r7 = r2.startsWith(r7)
            r9 = 58
            if (r7 == 0) goto L_0x01d7
            int r7 = r2.indexOf(r9)
            int r7 = r7 + r8
            java.lang.String r2 = r2.substring(r7)
            int r16 = java.lang.Integer.parseInt(r2)
            r8 = r6
            r9 = 1
            r14 = 1
            goto L_0x0037
        L_0x01d7:
            java.lang.String r7 = "#EXT-X-DISCONTINUITY"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x01e3
            int r0 = r0 + 1
            r8 = r6
            goto L_0x018d
        L_0x01e3:
            java.lang.String r7 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r7 = r2.startsWith(r7)
            if (r7 == 0) goto L_0x020d
            r7 = 0
            int r27 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r27 != 0) goto L_0x0209
            int r7 = r2.indexOf(r9)
            r8 = 1
            int r7 = r7 + r8
            java.lang.String r2 = r2.substring(r7)
            long r12 = com.google.android.exoplayer2.util.Util.parseXsDateTime(r2)
            long r12 = com.google.android.exoplayer2.C2793C.msToUs(r12)
            long r27 = r12 - r44
            r9 = r8
            r12 = r27
            goto L_0x01b6
        L_0x0209:
            r8 = 1
        L_0x020a:
            r27 = -1
            goto L_0x01b5
        L_0x020d:
            r8 = 1
            java.lang.String r7 = "#EXT-X-GAP"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x021a
            r9 = r8
            r41 = r9
            goto L_0x01b6
        L_0x021a:
            java.lang.String r7 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x0226
            r9 = r8
            r22 = r9
            goto L_0x01b6
        L_0x0226:
            java.lang.String r7 = "#EXT-X-ENDLIST"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x0232
            r9 = r8
            r23 = r9
            goto L_0x01b6
        L_0x0232:
            java.lang.String r7 = "#"
            boolean r7 = r2.startsWith(r7)
            if (r7 != 0) goto L_0x020a
            if (r46 != 0) goto L_0x023f
            r36 = 0
            goto L_0x024a
        L_0x023f:
            if (r47 == 0) goto L_0x0244
            r36 = r47
            goto L_0x024a
        L_0x0244:
            java.lang.String r7 = java.lang.Long.toHexString(r4)
            r36 = r7
        L_0x024a:
            r27 = 1
            long r51 = r4 + r27
            r4 = -1
            int r7 = (r42 > r4 ? 1 : (r42 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0256
            r25 = 0
        L_0x0256:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r4 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment
            r27 = r4
            r28 = r2
            r29 = r48
            r30 = r49
            r32 = r0
            r33 = r44
            r35 = r46
            r37 = r25
            r39 = r42
            r27.<init>(r28, r29, r30, r32, r33, r35, r36, r37, r39, r41)
            r15.add(r4)
            long r4 = r44 + r49
            r27 = -1
            int r2 = (r42 > r27 ? 1 : (r42 == r27 ? 0 : -1))
            if (r2 == 0) goto L_0x027c
            long r29 = r25 + r42
            r25 = r29
        L_0x027c:
            r44 = r4
            r41 = r6
            r9 = r8
            r42 = r27
            r4 = r51
            r49 = 0
            r8 = r41
            goto L_0x0037
        L_0x028b:
            r6 = r8
            r8 = r9
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r25 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist
            r4 = 0
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0298
            r26 = r8
            goto L_0x029a
        L_0x0298:
            r26 = r6
        L_0x029a:
            r0 = r25
            r2 = r55
            r4 = r10
            r6 = r12
            r8 = r14
            r9 = r16
            r10 = r17
            r12 = r19
            r13 = r20
            r19 = r15
            r15 = r22
            r16 = r23
            r17 = r26
            r18 = r24
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.parseMediaPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator, java.lang.String):com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist");
    }

    private static SchemeData parseWidevineSchemeData(String str, String str2) throws ParserException {
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String parseStringAttr = parseStringAttr(str, REGEX_URI);
            return new SchemeData(C2793C.WIDEVINE_UUID, MimeTypes.VIDEO_MP4, Base64.decode(parseStringAttr.substring(parseStringAttr.indexOf(44)), 0));
        } else if (!KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return null;
        } else {
            try {
                return new SchemeData(C2793C.WIDEVINE_UUID, "hls", str.getBytes(C2793C.UTF8_NAME));
            } catch (UnsupportedEncodingException e) {
                throw new ParserException((Throwable) e);
            }
        }
    }

    private static int parseIntAttr(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(parseStringAttr(str, pattern));
    }

    private static long parseLongAttr(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(parseStringAttr(str, pattern));
    }

    private static double parseDoubleAttr(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(parseStringAttr(str, pattern));
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private static String parseStringAttr(String str, Pattern pattern) throws ParserException {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Couldn't match ");
        sb.append(pattern.pattern());
        sb.append(" in ");
        sb.append(str);
        throw new ParserException(sb.toString());
    }

    private static boolean parseBooleanAttribute(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals(BOOLEAN_TRUE) : z;
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=(");
        sb.append(BOOLEAN_FALSE);
        sb.append("|");
        sb.append(BOOLEAN_TRUE);
        sb.append(")");
        return Pattern.compile(sb.toString());
    }
}
