package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Xml;
import com.appnext.base.p042a.p045c.C1237d;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public class DashManifestParser extends DefaultHandler implements Parser<DashManifest> {
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final String TAG = "MpdParser";
    private final String contentId;
    private final XmlPullParserFactory xmlParserFactory;

    protected static final class RepresentationInfo {
        public final String baseUrl;
        public final ArrayList<SchemeData> drmSchemeDatas;
        public final String drmSchemeType;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;

        public RepresentationInfo(Format format2, String str, SegmentBase segmentBase2, String str2, ArrayList<SchemeData> arrayList, ArrayList<Descriptor> arrayList2, long j) {
            this.format = format2;
            this.baseUrl = str;
            this.segmentBase = segmentBase2;
            this.drmSchemeType = str2;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.revisionId = j;
        }
    }

    /* access modifiers changed from: protected */
    public void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
    }

    public DashManifestParser() {
        this(null);
    }

    public DashManifestParser(String str) {
        this.contentId = str;
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public DashManifest parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2) {
                if ("MPD".equals(newPullParser.getName())) {
                    return parseMediaPresentationDescription(newPullParser, uri.toString());
                }
            }
            throw new ParserException("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw new ParserException((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0170 A[LOOP:0: B:20:0x0069->B:63:0x0170, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0132 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.manifest.DashManifest parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser r35, java.lang.String r36) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r34 = this;
            r0 = r35
            java.lang.String r1 = "availabilityStartTime"
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = parseDateTime(r0, r1, r2)
            java.lang.String r1 = "mediaPresentationDuration"
            long r7 = parseDuration(r0, r1, r2)
            java.lang.String r1 = "minBufferTime"
            long r9 = parseDuration(r0, r1, r2)
            java.lang.String r1 = "type"
            r4 = 0
            java.lang.String r1 = r0.getAttributeValue(r4, r1)
            r11 = 0
            if (r1 == 0) goto L_0x002d
            java.lang.String r13 = "dynamic"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x002d
            r1 = 1
            goto L_0x002e
        L_0x002d:
            r1 = r11
        L_0x002e:
            if (r1 == 0) goto L_0x0037
            java.lang.String r13 = "minimumUpdatePeriod"
            long r13 = parseDuration(r0, r13, r2)
            goto L_0x0038
        L_0x0037:
            r13 = r2
        L_0x0038:
            if (r1 == 0) goto L_0x0041
            java.lang.String r15 = "timeShiftBufferDepth"
            long r15 = parseDuration(r0, r15, r2)
            goto L_0x0042
        L_0x0041:
            r15 = r2
        L_0x0042:
            if (r1 == 0) goto L_0x004b
            java.lang.String r4 = "suggestedPresentationDelay"
            long r17 = parseDuration(r0, r4, r2)
            goto L_0x004d
        L_0x004b:
            r17 = r2
        L_0x004d:
            java.lang.String r4 = "publishTime"
            long r19 = parseDateTime(r0, r4, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r1 == 0) goto L_0x005d
            r21 = r2
            goto L_0x005f
        L_0x005d:
            r21 = 0
        L_0x005f:
            r12 = r36
            r2 = r21
            r22 = 0
            r23 = 0
            r21 = r11
        L_0x0069:
            r35.next()
            r26 = r15
            java.lang.String r15 = "BaseURL"
            boolean r15 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r15)
            if (r15 == 0) goto L_0x0090
            if (r11 != 0) goto L_0x0084
            java.lang.String r11 = parseBaseUrl(r0, r12)
            r15 = r34
            r12 = r11
            r31 = r13
            r11 = 1
            goto L_0x012a
        L_0x0084:
            r15 = r34
            r29 = r2
            r28 = r11
            r33 = r12
            r31 = r13
            goto L_0x0124
        L_0x0090:
            java.lang.String r15 = "UTCTiming"
            boolean r15 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r15)
            if (r15 == 0) goto L_0x00a4
            com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r15 = r34.parseUtcTiming(r35)
            r31 = r13
            r23 = r15
        L_0x00a0:
            r15 = r34
            goto L_0x012a
        L_0x00a4:
            java.lang.String r15 = "Location"
            boolean r15 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r15)
            if (r15 == 0) goto L_0x00b9
            java.lang.String r15 = r35.nextText()
            android.net.Uri r15 = android.net.Uri.parse(r15)
            r31 = r13
            r22 = r15
            goto L_0x00a0
        L_0x00b9:
            java.lang.String r15 = "Period"
            boolean r15 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r15)
            if (r15 == 0) goto L_0x0084
            if (r21 != 0) goto L_0x0084
            r15 = r34
            r28 = r11
            android.util.Pair r11 = r15.parsePeriod(r0, r12, r2)
            r29 = r2
            java.lang.Object r2 = r11.first
            com.google.android.exoplayer2.source.dash.manifest.Period r2 = (com.google.android.exoplayer2.source.dash.manifest.Period) r2
            r33 = r12
            r31 = r13
            long r12 = r2.startMs
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r3 != 0) goto L_0x0106
            if (r1 == 0) goto L_0x00eb
            r11 = r28
            r2 = r29
            r12 = r33
            r21 = 1
            goto L_0x012a
        L_0x00eb:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to determine start of period "
            r1.append(r2)
            int r2 = r4.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0106:
            java.lang.Object r3 = r11.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r11 = r3.longValue()
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x011d
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0121
        L_0x011d:
            long r13 = r2.startMs
            long r29 = r13 + r11
        L_0x0121:
            r4.add(r2)
        L_0x0124:
            r11 = r28
            r2 = r29
            r12 = r33
        L_0x012a:
            java.lang.String r13 = "MPD"
            boolean r13 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r13)
            if (r13 == 0) goto L_0x0170
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x014b
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0141
            r7 = r2
            goto L_0x014b
        L_0x0141:
            if (r1 != 0) goto L_0x014b
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Unable to determine duration of static manifest."
            r0.<init>(r1)
            throw r0
        L_0x014b:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0159
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "No periods found."
            r0.<init>(r1)
            throw r0
        L_0x0159:
            r24 = r4
            r4 = r15
            r11 = r1
            r12 = r31
            r14 = r26
            r16 = r17
            r18 = r19
            r20 = r23
            r21 = r22
            r22 = r24
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r4.buildMediaPresentationDescription(r5, r7, r9, r11, r12, r14, r16, r18, r20, r21, r22)
            return r0
        L_0x0170:
            r15 = r26
            r13 = r31
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser, java.lang.String):com.google.android.exoplayer2.source.dash.manifest.DashManifest");
    }

    /* access modifiers changed from: protected */
    public DashManifest buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, UtcTimingElement utcTimingElement, Uri uri, List<Period> list) {
        DashManifest dashManifest = new DashManifest(j, j2, j3, z, j4, j5, j6, j7, utcTimingElement, uri, list);
        return dashManifest;
    }

    /* access modifiers changed from: protected */
    public UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /* access modifiers changed from: protected */
    public UtcTimingElement buildUtcTimingElement(String str, String str2) {
        return new UtcTimingElement(str, str2);
    }

    /* access modifiers changed from: protected */
    public Pair<Period, Long> parsePeriod(XmlPullParser xmlPullParser, String str, long j) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, TtmlNode.ATTR_ID);
        long parseDuration = parseDuration(xmlPullParser, TtmlNode.START, j);
        long parseDuration2 = parseDuration(xmlPullParser, "duration", C2793C.TIME_UNSET);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        SegmentBase segmentBase = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z) {
                    str = parseBaseUrl(xmlPullParser, str);
                    z = true;
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "AdaptationSet")) {
                arrayList.add(parseAdaptationSet(xmlPullParser, str, segmentBase));
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "EventStream")) {
                arrayList2.add(parseEventStream(xmlPullParser));
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                segmentBase = parseSegmentBase(xmlPullParser, null);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                segmentBase = parseSegmentList(xmlPullParser, null);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                segmentBase = parseSegmentTemplate(xmlPullParser, null);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Period"));
        return Pair.create(buildPeriod(attributeValue, parseDuration, arrayList, arrayList2), Long.valueOf(parseDuration2));
    }

    /* access modifiers changed from: protected */
    public Period buildPeriod(String str, long j, List<AdaptationSet> list, List<EventStream> list2) {
        Period period = new Period(str, j, list, list2);
        return period;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0224 A[LOOP:0: B:1:0x0063->B:59:0x0224, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ec A[EDGE_INSN: B:60:0x01ec->B:53:0x01ec ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.manifest.AdaptationSet parseAdaptationSet(org.xmlpull.v1.XmlPullParser r38, java.lang.String r39, com.google.android.exoplayer2.source.dash.manifest.SegmentBase r40) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r37 = this;
            r14 = r37
            r15 = r38
            java.lang.String r0 = "id"
            r1 = -1
            int r16 = parseInt(r15, r0, r1)
            int r0 = r37.parseContentType(r38)
            java.lang.String r2 = "mimeType"
            r13 = 0
            java.lang.String r17 = r15.getAttributeValue(r13, r2)
            java.lang.String r2 = "codecs"
            java.lang.String r18 = r15.getAttributeValue(r13, r2)
            java.lang.String r2 = "width"
            int r19 = parseInt(r15, r2, r1)
            java.lang.String r2 = "height"
            int r20 = parseInt(r15, r2, r1)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r21 = parseFrameRate(r15, r2)
            java.lang.String r2 = "audioSamplingRate"
            int r22 = parseInt(r15, r2, r1)
            java.lang.String r2 = "lang"
            java.lang.String r2 = r15.getAttributeValue(r13, r2)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r23 = 0
            r7 = r39
            r27 = r40
            r5 = r0
            r26 = r1
            r6 = r2
            r28 = r13
            r24 = r23
            r25 = r24
        L_0x0063:
            r38.next()
            java.lang.String r0 = "BaseURL"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r0)
            if (r0 == 0) goto L_0x009b
            if (r24 != 0) goto L_0x0089
            java.lang.String r0 = parseBaseUrl(r15, r7)
            r1 = 1
            r30 = r0
            r24 = r1
            r29 = r6
        L_0x007b:
            r6 = r8
            r32 = r9
            r33 = r10
            r7 = r11
            r35 = r12
            r36 = r13
            r1 = r15
            r8 = r5
            goto L_0x01e4
        L_0x0089:
            r2 = r5
            r29 = r6
            r30 = r7
            r6 = r8
            r32 = r9
            r33 = r10
            r7 = r11
            r35 = r12
            r36 = r13
            r1 = r15
            goto L_0x01e3
        L_0x009b:
            java.lang.String r0 = "ContentProtection"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r0)
            if (r0 == 0) goto L_0x00bf
            android.util.Pair r0 = r37.parseContentProtection(r38)
            java.lang.Object r1 = r0.first
            if (r1 == 0) goto L_0x00b1
            java.lang.Object r1 = r0.first
            r28 = r1
            java.lang.String r28 = (java.lang.String) r28
        L_0x00b1:
            java.lang.Object r1 = r0.second
            if (r1 == 0) goto L_0x00ba
            java.lang.Object r0 = r0.second
            r12.add(r0)
        L_0x00ba:
            r29 = r6
            r30 = r7
            goto L_0x007b
        L_0x00bf:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r0)
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = "lang"
            java.lang.String r0 = r15.getAttributeValue(r13, r0)
            java.lang.String r6 = checkLanguageConsistency(r6, r0)
            int r0 = r37.parseContentType(r38)
            int r0 = checkContentTypeConsistency(r5, r0)
            r29 = r6
            r30 = r7
            r6 = r8
            r32 = r9
            r33 = r10
            r7 = r11
            r35 = r12
            r36 = r13
            r1 = r15
            r8 = r0
            goto L_0x01e4
        L_0x00eb:
            java.lang.String r0 = "Role"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r0)
            if (r0 == 0) goto L_0x00fa
            int r0 = r37.parseRole(r38)
            r25 = r25 | r0
            goto L_0x00ba
        L_0x00fa:
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r0)
            if (r0 == 0) goto L_0x0107
            int r26 = r37.parseAudioChannelConfiguration(r38)
            goto L_0x00ba
        L_0x0107:
            java.lang.String r0 = "Accessibility"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r0)
            if (r0 == 0) goto L_0x011a
            java.lang.String r0 = "Accessibility"
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r0 = parseDescriptor(r15, r0)
            r10.add(r0)
            goto L_0x0089
        L_0x011a:
            java.lang.String r0 = "SupplementalProperty"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r0)
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = "SupplementalProperty"
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r0 = parseDescriptor(r15, r0)
            r9.add(r0)
            goto L_0x0089
        L_0x012d:
            java.lang.String r0 = "Representation"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r0)
            if (r0 == 0) goto L_0x0179
            r0 = r14
            r1 = r15
            r2 = r7
            r3 = r17
            r4 = r18
            r15 = r5
            r5 = r19
            r29 = r6
            r6 = r20
            r30 = r7
            r7 = r21
            r31 = r8
            r8 = r26
            r32 = r9
            r9 = r22
            r33 = r10
            r10 = r29
            r34 = r11
            r11 = r25
            r35 = r12
            r12 = r33
            r36 = r13
            r13 = r27
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo r0 = r0.parseRepresentation(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.google.android.exoplayer2.Format r1 = r0.format
            int r1 = r14.getContentType(r1)
            int r1 = checkContentTypeConsistency(r15, r1)
            r6 = r31
            r6.add(r0)
            r8 = r1
            r7 = r34
            r1 = r38
            goto L_0x01e4
        L_0x0179:
            r15 = r5
            r29 = r6
            r30 = r7
            r6 = r8
            r32 = r9
            r33 = r10
            r34 = r11
            r35 = r12
            r36 = r13
            java.lang.String r0 = "SegmentBase"
            r2 = r15
            r1 = r38
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r0 == 0) goto L_0x01a2
            r0 = r27
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r0 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase) r0
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r0 = r14.parseSegmentBase(r1, r0)
        L_0x019c:
            r27 = r0
            r8 = r2
            r7 = r34
            goto L_0x01e4
        L_0x01a2:
            java.lang.String r0 = "SegmentList"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r0 == 0) goto L_0x01b3
            r0 = r27
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r0 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList) r0
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r0 = r14.parseSegmentList(r1, r0)
            goto L_0x019c
        L_0x01b3:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r0 == 0) goto L_0x01c4
            r0 = r27
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r0 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate) r0
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r0 = r14.parseSegmentTemplate(r1, r0)
            goto L_0x019c
        L_0x01c4:
            java.lang.String r0 = "InbandEventStream"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r0 == 0) goto L_0x01d8
            java.lang.String r0 = "InbandEventStream"
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r0 = parseDescriptor(r1, r0)
            r7 = r34
            r7.add(r0)
            goto L_0x01e3
        L_0x01d8:
            r7 = r34
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r38)
            if (r0 == 0) goto L_0x01e3
            r37.parseAdaptationSetChild(r38)
        L_0x01e3:
            r8 = r2
        L_0x01e4:
            java.lang.String r0 = "AdaptationSet"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r1, r0)
            if (r0 == 0) goto L_0x0224
            java.util.ArrayList r9 = new java.util.ArrayList
            int r0 = r6.size()
            r9.<init>(r0)
            r10 = r23
        L_0x01f7:
            int r0 = r6.size()
            if (r10 >= r0) goto L_0x0216
            java.lang.Object r0 = r6.get(r10)
            r1 = r0
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo r1 = (com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.RepresentationInfo) r1
            java.lang.String r2 = r14.contentId
            r0 = r14
            r3 = r28
            r4 = r35
            r5 = r7
            com.google.android.exoplayer2.source.dash.manifest.Representation r0 = r0.buildRepresentation(r1, r2, r3, r4, r5)
            r9.add(r0)
            int r10 = r10 + 1
            goto L_0x01f7
        L_0x0216:
            r0 = r14
            r1 = r16
            r2 = r8
            r3 = r9
            r4 = r33
            r5 = r32
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r0 = r0.buildAdaptationSet(r1, r2, r3, r4, r5)
            return r0
        L_0x0224:
            r15 = r1
            r11 = r7
            r5 = r8
            r7 = r30
            r9 = r32
            r10 = r33
            r12 = r35
            r13 = r36
            r8 = r6
            r6 = r29
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseAdaptationSet(org.xmlpull.v1.XmlPullParser, java.lang.String, com.google.android.exoplayer2.source.dash.manifest.SegmentBase):com.google.android.exoplayer2.source.dash.manifest.AdaptationSet");
    }

    /* access modifiers changed from: protected */
    public AdaptationSet buildAdaptationSet(int i, int i2, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3) {
        AdaptationSet adaptationSet = new AdaptationSet(i, i2, list, list2, list3);
        return adaptationSet;
    }

    /* access modifiers changed from: protected */
    public int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MimeTypes.BASE_TYPE_AUDIO.equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if (MimeTypes.BASE_TYPE_TEXT.equals(attributeValue)) {
            return 3;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getContentType(Format format) {
        String str = format.sampleMimeType;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (MimeTypes.isVideo(str)) {
            return 2;
        }
        if (MimeTypes.isAudio(str)) {
            return 1;
        }
        if (mimeTypeIsRawText(str)) {
            return 3;
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v3, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r1v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r13v3, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r1v16, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r5v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v0
      assigns: []
      uses: []
      mth insns count: 137
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
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0136 A[LOOP:1: B:35:0x009a->B:72:0x0136, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0125 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 19 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> parseContentProtection(org.xmlpull.v1.XmlPullParser r17) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "schemeIdUri"
            r2 = 0
            java.lang.String r1 = r0.getAttributeValue(r2, r1)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0095
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r1)
            r5 = -1
            int r6 = r1.hashCode()
            r7 = 489446379(0x1d2c5beb, float:2.281153E-21)
            if (r6 == r7) goto L_0x003a
            r7 = 755418770(0x2d06c692, float:7.66111E-12)
            if (r6 == r7) goto L_0x0030
            r7 = 1812765994(0x6c0c9d2a, float:6.799672E26)
            if (r6 == r7) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            java.lang.String r6 = "urn:mpeg:dash:mp4protection:2011"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0044
            r1 = r4
            goto L_0x0045
        L_0x0030:
            java.lang.String r6 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0044
            r1 = 2
            goto L_0x0045
        L_0x003a:
            java.lang.String r6 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0044
            r1 = r3
            goto L_0x0045
        L_0x0044:
            r1 = r5
        L_0x0045:
            switch(r1) {
                case 0: goto L_0x0050;
                case 1: goto L_0x004c;
                case 2: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0095
        L_0x0049:
            java.util.UUID r1 = com.google.android.exoplayer2.C2793C.WIDEVINE_UUID
            goto L_0x004e
        L_0x004c:
            java.util.UUID r1 = com.google.android.exoplayer2.C2793C.PLAYREADY_UUID
        L_0x004e:
            r5 = r2
            goto L_0x0097
        L_0x0050:
            java.lang.String r1 = "value"
            java.lang.String r1 = r0.getAttributeValue(r2, r1)
            java.lang.String r5 = "default_KID"
            java.lang.String r5 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValueIgnorePrefix(r0, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0090
            java.lang.String r6 = "00000000-0000-0000-0000-000000000000"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0090
            java.lang.String r6 = "\\s+"
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            java.util.UUID[] r6 = new java.util.UUID[r6]
            r7 = r4
        L_0x0074:
            int r8 = r5.length
            if (r7 >= r8) goto L_0x0082
            r8 = r5[r7]
            java.util.UUID r8 = java.util.UUID.fromString(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x0074
        L_0x0082:
            java.util.UUID r5 = com.google.android.exoplayer2.C2793C.COMMON_PSSH_UUID
            byte[] r5 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.buildPsshAtom(r5, r6, r2)
            java.util.UUID r6 = com.google.android.exoplayer2.C2793C.COMMON_PSSH_UUID
            r7 = r2
            r8 = r4
            r15 = r6
            r6 = r1
            r1 = r15
            goto L_0x009a
        L_0x0090:
            r6 = r1
            r1 = r2
            r5 = r1
            r7 = r5
            goto L_0x0099
        L_0x0095:
            r1 = r2
            r5 = r1
        L_0x0097:
            r6 = r5
            r7 = r6
        L_0x0099:
            r8 = r4
        L_0x009a:
            r17.next()
            java.lang.String r9 = "ms:laurl"
            boolean r9 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r9)
            if (r9 == 0) goto L_0x00b1
            java.lang.String r7 = "licenseUrl"
            java.lang.String r7 = r0.getAttributeValue(r2, r7)
        L_0x00ab:
            r10 = r1
            r13 = r5
        L_0x00ad:
            r11 = r7
            r14 = r8
            goto L_0x011d
        L_0x00b1:
            java.lang.String r9 = "widevine:license"
            boolean r9 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r9)
            if (r9 == 0) goto L_0x00cd
            java.lang.String r8 = "robustness_level"
            java.lang.String r8 = r0.getAttributeValue(r2, r8)
            if (r8 == 0) goto L_0x00cb
            java.lang.String r9 = "HW"
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L_0x00cb
            r8 = r3
            goto L_0x00ab
        L_0x00cb:
            r8 = r4
            goto L_0x00ab
        L_0x00cd:
            if (r5 != 0) goto L_0x00ab
            java.lang.String r9 = "pssh"
            boolean r9 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTagIgnorePrefix(r0, r9)
            r10 = 4
            if (r9 == 0) goto L_0x00f8
            int r9 = r17.next()
            if (r9 != r10) goto L_0x00f8
            java.lang.String r1 = r17.getText()
            byte[] r1 = android.util.Base64.decode(r1, r4)
            java.util.UUID r5 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseUuid(r1)
            if (r5 != 0) goto L_0x00f5
            java.lang.String r1 = "MpdParser"
            java.lang.String r9 = "Skipping malformed cenc:pssh data"
            android.util.Log.w(r1, r9)
            r13 = r2
            goto L_0x00f6
        L_0x00f5:
            r13 = r1
        L_0x00f6:
            r10 = r5
            goto L_0x00ad
        L_0x00f8:
            java.util.UUID r9 = com.google.android.exoplayer2.C2793C.PLAYREADY_UUID
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x00ab
            java.lang.String r9 = "mspr:pro"
            boolean r9 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r9)
            if (r9 == 0) goto L_0x00ab
            int r9 = r17.next()
            if (r9 != r10) goto L_0x00ab
            java.util.UUID r5 = com.google.android.exoplayer2.C2793C.PLAYREADY_UUID
            java.lang.String r9 = r17.getText()
            byte[] r9 = android.util.Base64.decode(r9, r4)
            byte[] r5 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.buildPsshAtom(r5, r9)
            goto L_0x00ab
        L_0x011d:
            java.lang.String r1 = "ContentProtection"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r1)
            if (r1 == 0) goto L_0x0136
            if (r10 == 0) goto L_0x0130
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.lang.String r12 = "video/mp4"
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0131
        L_0x0130:
            r0 = r2
        L_0x0131:
            android.util.Pair r0 = android.util.Pair.create(r6, r0)
            return r0
        L_0x0136:
            r1 = r10
            r7 = r11
            r5 = r13
            r8 = r14
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseContentProtection(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    public int parseRole(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String parseString = parseString(xmlPullParser, "schemeIdUri", null);
        String parseString2 = parseString(xmlPullParser, "value", null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Role"));
        return (!"urn:mpeg:dash:role:2011".equals(parseString) || !"main".equals(parseString2)) ? 0 : 1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0135 A[LOOP:0: B:1:0x0058->B:40:0x0135, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0102 A[EDGE_INSN: B:41:0x0102->B:34:0x0102 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.RepresentationInfo parseRepresentation(org.xmlpull.v1.XmlPullParser r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, int r32, float r33, int r34, int r35, java.lang.String r36, int r37, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r38, com.google.android.exoplayer2.source.dash.manifest.SegmentBase r39) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r26 = this;
            r14 = r26
            r0 = r27
            java.lang.String r1 = "id"
            r2 = 0
            java.lang.String r1 = r0.getAttributeValue(r2, r1)
            java.lang.String r3 = "bandwidth"
            r4 = -1
            int r8 = parseInt(r0, r3, r4)
            java.lang.String r3 = "mimeType"
            r4 = r29
            java.lang.String r3 = parseString(r0, r3, r4)
            java.lang.String r4 = "codecs"
            r5 = r30
            java.lang.String r12 = parseString(r0, r4, r5)
            java.lang.String r4 = "width"
            r5 = r31
            int r4 = parseInt(r0, r4, r5)
            java.lang.String r5 = "height"
            r6 = r32
            int r5 = parseInt(r0, r5, r6)
            r6 = r33
            float r6 = parseFrameRate(r0, r6)
            java.lang.String r7 = "audioSamplingRate"
            r9 = r35
            int r7 = parseInt(r0, r7, r9)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r9 = 0
            r16 = r34
            r10 = r39
            r17 = r2
            r2 = r28
        L_0x0058:
            r27.next()
            r24 = r12
            java.lang.String r12 = "BaseURL"
            boolean r12 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r12)
            if (r12 == 0) goto L_0x0070
            if (r9 != 0) goto L_0x006c
            java.lang.String r2 = parseBaseUrl(r0, r2)
            r9 = 1
        L_0x006c:
            r25 = r2
            goto L_0x00f6
        L_0x0070:
            java.lang.String r12 = "AudioChannelConfiguration"
            boolean r12 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r12)
            if (r12 == 0) goto L_0x0082
            int r12 = r26.parseAudioChannelConfiguration(r27)
            r25 = r2
            r16 = r12
            goto L_0x00f6
        L_0x0082:
            java.lang.String r12 = "SegmentBase"
            boolean r12 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r12)
            if (r12 == 0) goto L_0x0091
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r10 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase) r10
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r10 = r14.parseSegmentBase(r0, r10)
            goto L_0x006c
        L_0x0091:
            java.lang.String r12 = "SegmentList"
            boolean r12 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r12)
            if (r12 == 0) goto L_0x00a0
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r10 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList) r10
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r10 = r14.parseSegmentList(r0, r10)
            goto L_0x006c
        L_0x00a0:
            java.lang.String r12 = "SegmentTemplate"
            boolean r12 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r12)
            if (r12 == 0) goto L_0x00af
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r10 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate) r10
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r10 = r14.parseSegmentTemplate(r0, r10)
            goto L_0x006c
        L_0x00af:
            java.lang.String r12 = "ContentProtection"
            boolean r12 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r12)
            if (r12 == 0) goto L_0x00d1
            android.util.Pair r12 = r26.parseContentProtection(r27)
            r25 = r2
            java.lang.Object r2 = r12.first
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r2 = r12.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
        L_0x00c7:
            java.lang.Object r2 = r12.second
            if (r2 == 0) goto L_0x00f6
            java.lang.Object r2 = r12.second
            r15.add(r2)
            goto L_0x00f6
        L_0x00d1:
            r25 = r2
            java.lang.String r2 = "InbandEventStream"
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r2)
            if (r2 == 0) goto L_0x00e5
            java.lang.String r2 = "InbandEventStream"
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r2 = parseDescriptor(r0, r2)
            r13.add(r2)
            goto L_0x00f6
        L_0x00e5:
            java.lang.String r2 = "SupplementalProperty"
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r2)
            if (r2 == 0) goto L_0x00f6
            java.lang.String r2 = "SupplementalProperty"
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r2 = parseDescriptor(r0, r2)
            r11.add(r2)
        L_0x00f6:
            r19 = r17
            r17 = r10
            java.lang.String r2 = "Representation"
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r2)
            if (r2 == 0) goto L_0x0135
            r0 = r14
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r16
            r9 = r36
            r10 = r37
            r18 = r11
            r11 = r38
            r12 = r24
            r21 = r13
            r13 = r18
            com.google.android.exoplayer2.Format r16 = r0.buildFormat(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r17 == 0) goto L_0x0120
            r18 = r17
            goto L_0x0127
        L_0x0120:
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r0 = new com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase
            r0.<init>()
            r18 = r0
        L_0x0127:
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo r0 = new com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo
            r22 = -1
            r2 = r15
            r15 = r0
            r17 = r25
            r20 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r0
        L_0x0135:
            r10 = r17
            r17 = r19
            r12 = r24
            r2 = r25
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseRepresentation(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, int, java.util.List, com.google.android.exoplayer2.source.dash.manifest.SegmentBase):com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo");
    }

    /* access modifiers changed from: protected */
    public Format buildFormat(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, int i6, List<Descriptor> list, String str4, List<Descriptor> list2) {
        String str5;
        String str6 = str2;
        String str7 = str4;
        String sampleMimeType = getSampleMimeType(str6, str7);
        if (sampleMimeType != null) {
            if (MimeTypes.AUDIO_E_AC3.equals(sampleMimeType)) {
                sampleMimeType = parseEac3SupplementalProperties(list2);
            }
            str5 = sampleMimeType;
            if (MimeTypes.isVideo(str5)) {
                return Format.createVideoContainerFormat(str, str6, str5, str7, i5, i, i2, f, null, i6);
            }
            if (MimeTypes.isAudio(str5)) {
                return Format.createAudioContainerFormat(str, str6, str5, str7, i5, i3, i4, null, i6, str3);
            }
            if (mimeTypeIsRawText(str5)) {
                int i7 = MimeTypes.APPLICATION_CEA608.equals(str5) ? parseCea608AccessibilityChannel(list) : MimeTypes.APPLICATION_CEA708.equals(str5) ? parseCea708AccessibilityChannel(list) : -1;
                return Format.createTextContainerFormat(str, str6, str5, str7, i5, i6, str3, i7);
            }
        } else {
            str5 = sampleMimeType;
        }
        return Format.createContainerFormat(str, str6, str5, str7, i5, i6, str3);
    }

    /* access modifiers changed from: protected */
    public Representation buildRepresentation(RepresentationInfo representationInfo, String str, String str2, ArrayList<SchemeData> arrayList, ArrayList<Descriptor> arrayList2) {
        Format format = representationInfo.format;
        if (representationInfo.drmSchemeType != null) {
            str2 = representationInfo.drmSchemeType;
        }
        ArrayList<SchemeData> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            filterRedundantIncompleteSchemeDatas(arrayList3);
            format = format.copyWithDrmInitData(new DrmInitData(str2, (List<SchemeData>) arrayList3));
        }
        Format format2 = format;
        ArrayList<Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(str, representationInfo.revisionId, format2, representationInfo.baseUrl, representationInfo.segmentBase, arrayList4);
    }

    /* access modifiers changed from: protected */
    public SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, SingleSegmentBase singleSegmentBase) throws XmlPullParserException, IOException {
        long j;
        long j2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        SingleSegmentBase singleSegmentBase2 = singleSegmentBase;
        long parseLong = parseLong(xmlPullParser2, "timescale", singleSegmentBase2 != null ? singleSegmentBase2.timescale : 1);
        long j3 = 0;
        long parseLong2 = parseLong(xmlPullParser2, "presentationTimeOffset", singleSegmentBase2 != null ? singleSegmentBase2.presentationTimeOffset : 0);
        long j4 = singleSegmentBase2 != null ? singleSegmentBase2.indexStart : 0;
        if (singleSegmentBase2 != null) {
            j3 = singleSegmentBase2.indexLength;
        }
        RangedUri rangedUri = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j2 = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - j2) + 1;
        } else {
            j = j3;
            j2 = j4;
        }
        if (singleSegmentBase2 != null) {
            rangedUri = singleSegmentBase2.initialization;
        }
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser2, "SegmentBase"));
        return buildSingleSegmentBase(rangedUri, parseLong, parseLong2, j2, j);
    }

    /* access modifiers changed from: protected */
    public SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j, long j2, long j3, long j4) {
        SingleSegmentBase singleSegmentBase = new SingleSegmentBase(rangedUri, j, j2, j3, j4);
        return singleSegmentBase;
    }

    /* access modifiers changed from: protected */
    public SegmentList parseSegmentList(XmlPullParser xmlPullParser, SegmentList segmentList) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        SegmentList segmentList2 = segmentList;
        long j = 1;
        long parseLong = parseLong(xmlPullParser2, "timescale", segmentList2 != null ? segmentList2.timescale : 1);
        long parseLong2 = parseLong(xmlPullParser2, "presentationTimeOffset", segmentList2 != null ? segmentList2.presentationTimeOffset : 0);
        long parseLong3 = parseLong(xmlPullParser2, "duration", segmentList2 != null ? segmentList2.duration : C2793C.TIME_UNSET);
        String str = "startNumber";
        if (segmentList2 != null) {
            j = segmentList2.startNumber;
        }
        long parseLong4 = parseLong(xmlPullParser2, str, j);
        List list = null;
        RangedUri rangedUri = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTimeline")) {
                list2 = parseSegmentTimeline(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(parseSegmentUrl(xmlPullParser));
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser2, "SegmentList"));
        if (segmentList2 != null) {
            if (rangedUri == null) {
                rangedUri = segmentList2.initialization;
            }
            if (list2 == null) {
                list2 = segmentList2.segmentTimeline;
            }
            if (list == null) {
                list = segmentList2.mediaSegments;
            }
        }
        return buildSegmentList(rangedUri, parseLong, parseLong2, parseLong4, parseLong3, list2, list);
    }

    /* access modifiers changed from: protected */
    public SegmentList buildSegmentList(RangedUri rangedUri, long j, long j2, long j3, long j4, List<SegmentTimelineElement> list, List<RangedUri> list2) {
        SegmentList segmentList = new SegmentList(rangedUri, j, j2, j3, j4, list, list2);
        return segmentList;
    }

    /* access modifiers changed from: protected */
    public SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, SegmentTemplate segmentTemplate) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        SegmentTemplate segmentTemplate2 = segmentTemplate;
        long j = 1;
        long parseLong = parseLong(xmlPullParser2, "timescale", segmentTemplate2 != null ? segmentTemplate2.timescale : 1);
        long parseLong2 = parseLong(xmlPullParser2, "presentationTimeOffset", segmentTemplate2 != null ? segmentTemplate2.presentationTimeOffset : 0);
        long parseLong3 = parseLong(xmlPullParser2, "duration", segmentTemplate2 != null ? segmentTemplate2.duration : C2793C.TIME_UNSET);
        String str = "startNumber";
        if (segmentTemplate2 != null) {
            j = segmentTemplate2.startNumber;
        }
        long parseLong4 = parseLong(xmlPullParser2, str, j);
        RangedUri rangedUri = null;
        UrlTemplate parseUrlTemplate = parseUrlTemplate(xmlPullParser2, "media", segmentTemplate2 != null ? segmentTemplate2.mediaTemplate : null);
        UrlTemplate parseUrlTemplate2 = parseUrlTemplate(xmlPullParser2, "initialization", segmentTemplate2 != null ? segmentTemplate2.initializationTemplate : null);
        List list = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTimeline")) {
                list = parseSegmentTimeline(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser2, "SegmentTemplate"));
        if (segmentTemplate2 != null) {
            if (rangedUri == null) {
                rangedUri = segmentTemplate2.initialization;
            }
            if (list == null) {
                list = segmentTemplate2.segmentTimeline;
            }
        }
        return buildSegmentTemplate(rangedUri, parseLong, parseLong2, parseLong4, parseLong3, list, parseUrlTemplate2, parseUrlTemplate);
    }

    /* access modifiers changed from: protected */
    public SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j, long j2, long j3, long j4, List<SegmentTimelineElement> list, UrlTemplate urlTemplate, UrlTemplate urlTemplate2) {
        SegmentTemplate segmentTemplate = new SegmentTemplate(rangedUri, j, j2, j3, j4, list, urlTemplate, urlTemplate2);
        return segmentTemplate;
    }

    /* access modifiers changed from: protected */
    public EventStream parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", "");
        long parseLong = parseLong(xmlPullParser, "timescale", 1);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                arrayList.add(parseEvent(xmlPullParser, parseString, parseString2, parseLong, byteArrayOutputStream));
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            EventMessage eventMessage = (EventMessage) arrayList.get(i);
            jArr[i] = eventMessage.presentationTimeUs;
            eventMessageArr[i] = eventMessage;
        }
        return buildEventStream(parseString, parseString2, parseLong, jArr, eventMessageArr);
    }

    /* access modifiers changed from: protected */
    public EventStream buildEventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        EventStream eventStream = new EventStream(str, str2, j, jArr, eventMessageArr);
        return eventStream;
    }

    /* access modifiers changed from: protected */
    public EventMessage parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long parseLong = parseLong(xmlPullParser2, TtmlNode.ATTR_ID, 0);
        long parseLong2 = parseLong(xmlPullParser2, "duration", C2793C.TIME_UNSET);
        long parseLong3 = parseLong(xmlPullParser2, "presentationTime", 0);
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(parseLong2, 1000, j);
        long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(parseLong3, 1000000, j);
        return buildEvent(str, str2, parseLong, scaleLargeTimestamp, parseEventObject(xmlPullParser2, byteArrayOutputStream), scaleLargeTimestamp2);
    }

    /* access modifiers changed from: protected */
    public byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, null);
        xmlPullParser.nextToken();
        while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.valueOf(false));
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: protected */
    public EventMessage buildEvent(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        EventMessage eventMessage = new EventMessage(str, str2, j2, j, bArr, j3);
        return eventMessage;
    }

    /* access modifiers changed from: protected */
    public List<SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "S")) {
                j = parseLong(xmlPullParser, C1237d.COLUMN_TYPE, j);
                long parseLong = parseLong(xmlPullParser, "d", C2793C.TIME_UNSET);
                int i = 0;
                int parseInt = 1 + parseInt(xmlPullParser, "r", 0);
                while (i < parseInt) {
                    arrayList.add(buildSegmentTimelineElement(j, parseLong));
                    i++;
                    j += parseLong;
                }
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public SegmentTimelineElement buildSegmentTimelineElement(long j, long j2) {
        return new SegmentTimelineElement(j, j2);
    }

    /* access modifiers changed from: protected */
    public UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, UrlTemplate urlTemplate) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    /* access modifiers changed from: protected */
    public RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", "range");
    }

    /* access modifiers changed from: protected */
    public RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    /* access modifiers changed from: protected */
    public RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return buildRangedUri(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return buildRangedUri(attributeValue, j2, j);
    }

    /* access modifiers changed from: protected */
    public RangedUri buildRangedUri(String str, long j, long j2) {
        RangedUri rangedUri = new RangedUri(str, j, j2);
        return rangedUri;
    }

    /* access modifiers changed from: protected */
    public int parseAudioChannelConfiguration(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String parseString = parseString(xmlPullParser, "schemeIdUri", null);
        int i = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(parseString)) {
            i = parseInt(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(parseString)) {
            i = parseDolbyChannelConfiguration(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            SchemeData schemeData = (SchemeData) arrayList.get(size);
            if (!schemeData.hasData()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (((SchemeData) arrayList.get(i)).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    private static String getSampleMimeType(String str, String str2) {
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.getAudioMediaMimeType(str2);
        }
        if (MimeTypes.isVideo(str)) {
            return MimeTypes.getVideoMediaMimeType(str2);
        }
        if (mimeTypeIsRawText(str)) {
            return str;
        }
        if (!MimeTypes.APPLICATION_MP4.equals(str)) {
            if (MimeTypes.APPLICATION_RAWCC.equals(str) && str2 != null) {
                if (str2.contains("cea708")) {
                    return MimeTypes.APPLICATION_CEA708;
                }
                if (str2.contains("eia608") || str2.contains("cea608")) {
                    return MimeTypes.APPLICATION_CEA608;
                }
            }
            return null;
        } else if ("stpp".equals(str2)) {
            return MimeTypes.APPLICATION_TTML;
        } else {
            if ("wvtt".equals(str2)) {
                return MimeTypes.APPLICATION_MP4VTT;
            }
        }
        return null;
    }

    private static boolean mimeTypeIsRawText(String str) {
        return MimeTypes.isText(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str);
    }

    private static String checkLanguageConsistency(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        Assertions.checkState(str.equals(str2));
        return str;
    }

    private static int checkContentTypeConsistency(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        Assertions.checkState(i == i2);
        return i;
    }

    protected static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", null);
        String parseString3 = parseString(xmlPullParser, TtmlNode.ATTR_ID, null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return new Descriptor(parseString, parseString2, parseString3);
    }

    protected static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = (Descriptor) list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && descriptor.value != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(descriptor.value);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse CEA-608 channel number from: ");
                sb.append(descriptor.value);
                Log.w(str, sb.toString());
            }
        }
        return -1;
    }

    protected static int parseCea708AccessibilityChannel(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = (Descriptor) list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && descriptor.value != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(descriptor.value);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse CEA-708 service block number from: ");
                sb.append(descriptor.value);
                Log.w(str, sb.toString());
            }
        }
        return -1;
    }

    protected static String parseEac3SupplementalProperties(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = (Descriptor) list.get(i);
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(descriptor.schemeIdUri) && "ec+3".equals(descriptor.value)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
        }
        return MimeTypes.AUDIO_E_AC3;
    }

    protected static float parseFrameRate(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    protected static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return Util.parseXsDuration(attributeValue);
    }

    protected static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return Util.parseXsDateTime(attributeValue);
    }

    protected static String parseBaseUrl(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        xmlPullParser.next();
        return UriUtil.resolve(str, xmlPullParser.getText());
    }

    protected static int parseInt(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    protected static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    protected static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static int parseDolbyChannelConfiguration(org.xmlpull.v1.XmlPullParser r5) {
        /*
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r5 = r5.getAttributeValue(r1, r0)
            java.lang.String r5 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r5)
            r0 = -1
            if (r5 != 0) goto L_0x000f
            return r0
        L_0x000f:
            int r1 = r5.hashCode()
            r2 = 1596796(0x185d7c, float:2.237588E-39)
            r3 = 1
            r4 = 2
            if (r1 == r2) goto L_0x0048
            r2 = 2937391(0x2cd22f, float:4.116161E-39)
            if (r1 == r2) goto L_0x003e
            r2 = 3094035(0x2f3613, float:4.335666E-39)
            if (r1 == r2) goto L_0x0034
            r2 = 3133436(0x2fcffc, float:4.390879E-39)
            if (r1 == r2) goto L_0x002a
            goto L_0x0052
        L_0x002a:
            java.lang.String r1 = "fa01"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0052
            r5 = 3
            goto L_0x0053
        L_0x0034:
            java.lang.String r1 = "f801"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0052
            r5 = r4
            goto L_0x0053
        L_0x003e:
            java.lang.String r1 = "a000"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0052
            r5 = r3
            goto L_0x0053
        L_0x0048:
            java.lang.String r1 = "4000"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0052
            r5 = 0
            goto L_0x0053
        L_0x0052:
            r5 = r0
        L_0x0053:
            switch(r5) {
                case 0: goto L_0x005d;
                case 1: goto L_0x005c;
                case 2: goto L_0x005a;
                case 3: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            return r0
        L_0x0057:
            r5 = 8
            return r5
        L_0x005a:
            r5 = 6
            return r5
        L_0x005c:
            return r4
        L_0x005d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseDolbyChannelConfiguration(org.xmlpull.v1.XmlPullParser):int");
    }
}
