package org.apache.p199a.p202b.p207e;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Stack;
import org.apache.p199a.C6555l;

/* renamed from: org.apache.a.b.e.b */
/* compiled from: URIUtils */
public class C6290b {
    /* renamed from: a */
    public static URI m24901a(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new URI(sb.toString());
    }

    /* renamed from: a */
    public static URI m24904a(URI uri, C6555l lVar, boolean z) throws URISyntaxException {
        if (uri == null) {
            throw new IllegalArgumentException("URI may nor be null");
        }
        String str = null;
        if (lVar != null) {
            String c = lVar.mo23060c();
            String a = lVar.mo23058a();
            int b = lVar.mo23059b();
            String a2 = m24900a(uri.getRawPath());
            String rawQuery = uri.getRawQuery();
            if (!z) {
                str = uri.getRawFragment();
            }
            return m24901a(c, a, b, a2, rawQuery, str);
        }
        String a3 = m24900a(uri.getRawPath());
        String rawQuery2 = uri.getRawQuery();
        if (!z) {
            str = uri.getRawFragment();
        }
        return m24901a(null, null, -1, a3, rawQuery2, str);
    }

    /* renamed from: a */
    private static String m24900a(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == '/') {
            i++;
        }
        if (i > 1) {
            str = str.substring(i - 1);
        }
        return str;
    }

    /* renamed from: a */
    public static URI m24903a(URI uri, C6555l lVar) throws URISyntaxException {
        return m24904a(uri, lVar, false);
    }

    /* renamed from: a */
    public static URI m24902a(URI uri, URI uri2) {
        if (uri == null) {
            throw new IllegalArgumentException("Base URI may nor be null");
        } else if (uri2 == null) {
            throw new IllegalArgumentException("Reference URI may nor be null");
        } else {
            String uri3 = uri2.toString();
            if (uri3.startsWith("?")) {
                return m24907b(uri, uri2);
            }
            boolean z = uri3.length() == 0;
            if (z) {
                uri2 = URI.create("#");
            }
            URI resolve = uri.resolve(uri2);
            if (z) {
                String uri4 = resolve.toString();
                resolve = URI.create(uri4.substring(0, uri4.indexOf(35)));
            }
            return m24906b(resolve);
        }
    }

    /* renamed from: b */
    private static URI m24907b(URI uri, URI uri2) {
        String uri3 = uri.toString();
        if (uri3.indexOf(63) > -1) {
            uri3 = uri3.substring(0, uri3.indexOf(63));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri3);
        sb.append(uri2.toString());
        return URI.create(sb.toString());
    }

    /* renamed from: b */
    private static URI m24906b(URI uri) {
        String path = uri.getPath();
        if (path == null || path.indexOf("/.") == -1) {
            return uri;
        }
        String[] split = path.split("/");
        Stack stack = new Stack();
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() != 0 && !".".equals(split[i])) {
                if (!"..".equals(split[i])) {
                    stack.push(split[i]);
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append('/');
            sb.append(str);
        }
        try {
            URI uri2 = new URI(uri.getScheme(), uri.getAuthority(), sb.toString(), uri.getQuery(), uri.getFragment());
            return uri2;
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static C6555l m24905a(URI uri) {
        C6555l lVar = null;
        if (uri == null) {
            return null;
        }
        if (uri.isAbsolute()) {
            int port = uri.getPort();
            String host = uri.getHost();
            if (host == null) {
                host = uri.getAuthority();
                if (host != null) {
                    int indexOf = host.indexOf(64);
                    if (indexOf >= 0) {
                        int i = indexOf + 1;
                        host = host.length() > i ? host.substring(i) : null;
                    }
                    if (host != null) {
                        int indexOf2 = host.indexOf(58);
                        if (indexOf2 >= 0) {
                            int i2 = indexOf2 + 1;
                            if (i2 < host.length()) {
                                port = Integer.parseInt(host.substring(i2));
                            }
                            host = host.substring(0, indexOf2);
                        }
                    }
                }
            }
            String scheme = uri.getScheme();
            if (host != null) {
                lVar = new C6555l(host, port, scheme);
            }
        }
        return lVar;
    }
}
