package com.startapp.android.publish.ads.video.p173c.p176b;

import android.content.Context;
import com.startapp.android.publish.ads.video.p173c.p174a.C5234a;
import com.startapp.android.publish.ads.video.p173c.p174a.C5241c;
import com.startapp.android.publish.ads.video.p173c.p174a.C5246e;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.C5435o;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p193a.C5519h;
import com.startapp.common.p193a.C5519h.C5520a;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/* renamed from: com.startapp.android.publish.ads.video.c.b.b */
/* compiled from: StartAppSDK */
public final class C5248b {

    /* renamed from: a */
    private final int f16889a;

    /* renamed from: b */
    private final int f16890b;

    /* renamed from: c */
    private C5246e f16891c;

    /* renamed from: d */
    private StringBuilder f16892d = new StringBuilder(500);

    /* renamed from: e */
    private long f16893e = -1;

    public C5248b(int i, int i2) {
        this.f16889a = i;
        this.f16890b = i2;
    }

    /* renamed from: a */
    public C5246e mo19356a() {
        return this.f16891c;
    }

    /* renamed from: a */
    public C5234a mo19355a(Context context, String str, C5241c cVar) {
        this.f16891c = null;
        this.f16893e = System.currentTimeMillis();
        C5234a a = mo19354a(context, str, 0);
        if (a == C5234a.XMLParsingError) {
            StringBuilder sb = new StringBuilder();
            sb.append("processXml error ");
            sb.append(a);
            C5518g.m23563a("VASTProcessor", 3, sb.toString());
            return C5234a.XMLParsingError;
        }
        Document a2 = m22471a(this.f16892d.toString());
        if (a2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("wrapMergedVastDocWithVasts error ");
            sb2.append(a);
            C5518g.m23563a("VASTProcessor", 3, sb2.toString());
            return C5234a.XMLParsingError;
        }
        this.f16891c = new C5246e(a2);
        if (!this.f16891c.mo19346a(cVar)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("validate error ");
            sb3.append(a);
            C5518g.m23563a("VASTProcessor", 3, sb3.toString());
            if (a == C5234a.ErrorNone) {
                a = C5234a.MediaNotSupported;
            }
        }
        return a;
    }

    /* renamed from: a */
    public C5234a mo19354a(Context context, String str, int i) {
        if (i >= this.f16889a) {
            StringBuilder sb = new StringBuilder();
            sb.append("VAST wrapping exceeded max limit of ");
            sb.append(this.f16889a);
            C5518g.m23563a("VASTProcessor", 6, sb.toString());
            return C5234a.WrapperLimitReached;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f16893e;
        if (currentTimeMillis <= ((long) this.f16890b) || this.f16893e <= 0) {
            Document b = m22472b(str);
            if (b == null) {
                return C5234a.XMLParsingError;
            }
            String a = m22470a(b);
            if (b.getChildNodes().getLength() == 0 || b.getChildNodes().item(0).getChildNodes().getLength() == 0 || a == null) {
                return C5234a.WrapperNoReponse;
            }
            this.f16892d.append(a);
            NodeList elementsByTagName = b.getElementsByTagName("VASTAdTagURI");
            if (elementsByTagName == null || elementsByTagName.getLength() == 0) {
                return C5234a.ErrorNone;
            }
            String b2 = C5435o.m23244b(elementsByTagName.item(0));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Wrapper URL: ");
            sb2.append(b2);
            C5518g.m23563a("VASTProcessor", 3, sb2.toString());
            try {
                C5520a a2 = C5519h.m23566a(context, b2.replace(" ", "%20"), null, C5414k.m23096a(context, "User-Agent", "-1"), false);
                if (a2 == null || a2.mo20491a() == null) {
                    return C5234a.WrapperNoReponse;
                }
                return mo19354a(context, a2.mo20491a(), i + 1);
            } catch (Exception e) {
                C5518g.m23564a("VASTProcessor", 6, "processXml network", e);
                return C5234a.GeneralWrapperError;
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("VAST wrapping exceeded timeout ");
            sb3.append(currentTimeMillis);
            C5518g.m23563a("VASTProcessor", 6, sb3.toString());
            return C5234a.WrapperTimeout;
        }
    }

    /* renamed from: a */
    public static Document m22471a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<VASTS>");
        sb.append(str);
        sb.append("</VASTS>");
        return C5435o.m23243a(sb.toString());
    }

    /* renamed from: b */
    public static Document m22472b(String str) {
        Document a = C5435o.m23243a(str);
        if (a != null) {
            a.getDocumentElement().normalize();
        }
        return a;
    }

    /* renamed from: a */
    public static String m22470a(Document document) {
        if (document != null) {
            NodeList elementsByTagName = document.getElementsByTagName("VAST");
            if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
                return C5435o.m23242a(elementsByTagName.item(0));
            }
        }
        return null;
    }
}
