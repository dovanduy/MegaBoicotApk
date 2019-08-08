package com.google.android.exoplayer2.source.hls;

public final class DefaultHlsExtractorFactory implements HlsExtractorFactory {
    public static final String AAC_FILE_EXTENSION = ".aac";
    public static final String AC3_FILE_EXTENSION = ".ac3";
    public static final String EC3_FILE_EXTENSION = ".ec3";
    public static final String M4_FILE_EXTENSION_PREFIX = ".m4";
    public static final String MP3_FILE_EXTENSION = ".mp3";
    public static final String MP4_FILE_EXTENSION = ".mp4";
    public static final String MP4_FILE_EXTENSION_PREFIX = ".mp4";
    public static final String VTT_FILE_EXTENSION = ".vtt";
    public static final String WEBVTT_FILE_EXTENSION = ".webvtt";

    /* JADX WARNING: type inference failed for: r9v0, types: [com.google.android.exoplayer2.extractor.Extractor] */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v3, types: [com.google.android.exoplayer2.source.hls.WebvttExtractor] */
    /* JADX WARNING: type inference failed for: r9v4, types: [com.google.android.exoplayer2.extractor.ts.Ac3Extractor] */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor] */
    /* JADX WARNING: type inference failed for: r10v6, types: [com.google.android.exoplayer2.extractor.ts.TsExtractor] */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v21, types: [com.google.android.exoplayer2.extractor.mp3.Mp3Extractor] */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: type inference failed for: r9v23, types: [com.google.android.exoplayer2.extractor.ts.AdtsExtractor] */
    /* JADX WARNING: type inference failed for: r9v24 */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r2v2, types: [com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor] */
    /* JADX WARNING: type inference failed for: r9v26 */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.android.exoplayer2.extractor.Extractor, code=null, for r9v0, types: [com.google.android.exoplayer2.extractor.Extractor] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v16
      assigns: [?[OBJECT, ARRAY], com.google.android.exoplayer2.extractor.Extractor, com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor]
      uses: [java.lang.Object, ?[int, boolean, OBJECT, ARRAY, byte, short, char], com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor]
      mth insns count: 82
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
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<com.google.android.exoplayer2.extractor.Extractor, java.lang.Boolean> createExtractor(com.google.android.exoplayer2.extractor.Extractor r9, android.net.Uri r10, com.google.android.exoplayer2.Format r11, java.util.List<com.google.android.exoplayer2.Format> r12, com.google.android.exoplayer2.drm.DrmInitData r13, com.google.android.exoplayer2.util.TimestampAdjuster r14) {
        /*
            r8 = this;
            java.lang.String r10 = r10.getLastPathSegment()
            if (r10 != 0) goto L_0x0008
            java.lang.String r10 = ""
        L_0x0008:
            java.lang.String r0 = "text/vtt"
            java.lang.String r1 = r11.sampleMimeType
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = ".webvtt"
            boolean r0 = r10.endsWith(r0)
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = ".vtt"
            boolean r0 = r10.endsWith(r0)
            if (r0 == 0) goto L_0x0026
            goto L_0x00d8
        L_0x0026:
            java.lang.String r0 = ".aac"
            boolean r0 = r10.endsWith(r0)
            if (r0 == 0) goto L_0x0036
            com.google.android.exoplayer2.extractor.ts.AdtsExtractor r9 = new com.google.android.exoplayer2.extractor.ts.AdtsExtractor
            r9.<init>()
        L_0x0033:
            r1 = r2
            goto L_0x00df
        L_0x0036:
            java.lang.String r0 = ".ac3"
            boolean r0 = r10.endsWith(r0)
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = ".ec3"
            boolean r0 = r10.endsWith(r0)
            if (r0 == 0) goto L_0x0048
            goto L_0x00d1
        L_0x0048:
            java.lang.String r0 = ".mp3"
            boolean r0 = r10.endsWith(r0)
            if (r0 == 0) goto L_0x0058
            com.google.android.exoplayer2.extractor.mp3.Mp3Extractor r9 = new com.google.android.exoplayer2.extractor.mp3.Mp3Extractor
            r10 = 0
            r9.<init>(r1, r10)
            goto L_0x0033
        L_0x0058:
            if (r9 == 0) goto L_0x005c
            goto L_0x00df
        L_0x005c:
            java.lang.String r9 = ".mp4"
            boolean r9 = r10.endsWith(r9)
            if (r9 != 0) goto L_0x00bd
            java.lang.String r9 = ".m4"
            int r0 = r10.length()
            int r0 = r0 + -4
            boolean r9 = r10.startsWith(r9, r0)
            if (r9 != 0) goto L_0x00bd
            java.lang.String r9 = ".mp4"
            int r0 = r10.length()
            int r0 = r0 + -5
            boolean r9 = r10.startsWith(r9, r0)
            if (r9 == 0) goto L_0x0081
            goto L_0x00bd
        L_0x0081:
            r9 = 16
            if (r12 == 0) goto L_0x0088
            r9 = 48
            goto L_0x008c
        L_0x0088:
            java.util.List r12 = java.util.Collections.emptyList()
        L_0x008c:
            java.lang.String r10 = r11.codecs
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00b0
            java.lang.String r11 = "audio/mp4a-latm"
            java.lang.String r13 = com.google.android.exoplayer2.util.MimeTypes.getAudioMediaMimeType(r10)
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x00a2
            r9 = r9 | 2
        L_0x00a2:
            java.lang.String r11 = "video/avc"
            java.lang.String r10 = com.google.android.exoplayer2.util.MimeTypes.getVideoMediaMimeType(r10)
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00b0
            r9 = r9 | 4
        L_0x00b0:
            com.google.android.exoplayer2.extractor.ts.TsExtractor r10 = new com.google.android.exoplayer2.extractor.ts.TsExtractor
            com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory r11 = new com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory
            r11.<init>(r9, r12)
            r9 = 2
            r10.<init>(r9, r14, r11)
            r9 = r10
            goto L_0x00df
        L_0x00bd:
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor r9 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
            r3 = 0
            r5 = 0
            if (r12 == 0) goto L_0x00c5
        L_0x00c3:
            r7 = r12
            goto L_0x00ca
        L_0x00c5:
            java.util.List r12 = java.util.Collections.emptyList()
            goto L_0x00c3
        L_0x00ca:
            r2 = r9
            r4 = r14
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x00df
        L_0x00d1:
            com.google.android.exoplayer2.extractor.ts.Ac3Extractor r9 = new com.google.android.exoplayer2.extractor.ts.Ac3Extractor
            r9.<init>()
            goto L_0x0033
        L_0x00d8:
            com.google.android.exoplayer2.source.hls.WebvttExtractor r9 = new com.google.android.exoplayer2.source.hls.WebvttExtractor
            java.lang.String r10 = r11.language
            r9.<init>(r10, r14)
        L_0x00df:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            android.util.Pair r9 = android.util.Pair.create(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory.createExtractor(com.google.android.exoplayer2.extractor.Extractor, android.net.Uri, com.google.android.exoplayer2.Format, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, com.google.android.exoplayer2.util.TimestampAdjuster):android.util.Pair");
    }
}
