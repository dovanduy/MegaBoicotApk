package org.apache.p199a.p218f;

import org.apache.p199a.C6261aa;

/* renamed from: org.apache.a.f.d */
/* compiled from: EnglishReasonPhraseCatalog */
public class C6439d implements C6261aa {

    /* renamed from: a */
    public static final C6439d f21104a = new C6439d();

    /* renamed from: b */
    private static final String[][] f21105b = {null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    static {
        m25526a(200, "OK");
        m25526a(201, "Created");
        m25526a(202, "Accepted");
        m25526a(204, "No Content");
        m25526a(301, "Moved Permanently");
        m25526a(302, "Moved Temporarily");
        m25526a(304, "Not Modified");
        m25526a(400, "Bad Request");
        m25526a(401, "Unauthorized");
        m25526a(403, "Forbidden");
        m25526a(404, "Not Found");
        m25526a(500, "Internal Server Error");
        m25526a(501, "Not Implemented");
        m25526a(502, "Bad Gateway");
        m25526a(503, "Service Unavailable");
        m25526a(100, "Continue");
        m25526a(307, "Temporary Redirect");
        m25526a(405, "Method Not Allowed");
        m25526a(409, "Conflict");
        m25526a(412, "Precondition Failed");
        m25526a(413, "Request Too Long");
        m25526a(414, "Request-URI Too Long");
        m25526a(415, "Unsupported Media Type");
        m25526a(300, "Multiple Choices");
        m25526a(303, "See Other");
        m25526a(305, "Use Proxy");
        m25526a(402, "Payment Required");
        m25526a(406, "Not Acceptable");
        m25526a(407, "Proxy Authentication Required");
        m25526a(408, "Request Timeout");
        m25526a(101, "Switching Protocols");
        m25526a(203, "Non Authoritative Information");
        m25526a(205, "Reset Content");
        m25526a(206, "Partial Content");
        m25526a(504, "Gateway Timeout");
        m25526a(505, "Http Version Not Supported");
        m25526a(410, "Gone");
        m25526a(411, "Length Required");
        m25526a(416, "Requested Range Not Satisfiable");
        m25526a(417, "Expectation Failed");
        m25526a(102, "Processing");
        m25526a(207, "Multi-Status");
        m25526a(422, "Unprocessable Entity");
        m25526a(419, "Insufficient Space On Resource");
        m25526a(420, "Method Failure");
        m25526a(423, "Locked");
        m25526a(507, "Insufficient Storage");
        m25526a(424, "Failed Dependency");
    }

    protected C6439d() {
    }

    /* renamed from: a */
    private static void m25526a(int i, String str) {
        int i2 = i / 100;
        f21105b[i2][i - (100 * i2)] = str;
    }
}
