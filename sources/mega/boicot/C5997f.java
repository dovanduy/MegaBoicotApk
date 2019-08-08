package mega.boicot;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: mega.boicot.f */
/* compiled from: IcyStreamMeta */
public class C5997f {

    /* renamed from: a */
    protected URL f19781a;

    /* renamed from: b */
    private Map<String, String> f19782b;

    public C5997f(URL url) {
        mo21734a(url);
    }

    /* renamed from: a */
    public String mo21733a() throws IOException {
        Map c = mo21736c();
        if (c == null) {
            return "";
        }
        if (!c.containsKey("StreamTitle")) {
            return "";
        }
        try {
            String str = (String) c.get("StreamTitle");
            return str.substring(0, str.indexOf("-")).trim();
        } catch (StringIndexOutOfBoundsException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public String mo21735b() throws IOException {
        Map c = mo21736c();
        if (c == null) {
            return "";
        }
        if (!c.containsKey("StreamTitle")) {
            return "";
        }
        try {
            String str = (String) c.get("StreamTitle");
            return str.substring(str.indexOf("-") + 1).trim();
        } catch (StringIndexOutOfBoundsException unused) {
            return "";
        }
    }

    /* renamed from: c */
    public Map<String, String> mo21736c() throws IOException {
        if (this.f19782b == null) {
            mo21737d();
        }
        return this.f19782b;
    }

    /* renamed from: d */
    public void mo21737d() throws IOException {
        m24434e();
    }

    /* renamed from: e */
    private void m24434e() throws IOException {
        int i;
        URLConnection openConnection = this.f19781a.openConnection();
        openConnection.setRequestProperty("Icy-MetaData", "1");
        openConnection.setRequestProperty("Connection", "close");
        openConnection.connect();
        Map headerFields = openConnection.getHeaderFields();
        InputStream inputStream = openConnection.getInputStream();
        if (headerFields == null || !headerFields.containsKey("icy-metaint")) {
            StringBuilder sb = new StringBuilder();
            String str = "";
            while (true) {
                char read = (char) inputStream.read();
                if (read == 65535) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(read);
                str = sb2.toString();
                sb.append(read);
                if (str.length() > 4000 || (sb.length() > 5 && sb.substring(sb.length() - 4, sb.length()).equals("\r\n\r\n"))) {
                    break;
                }
            }
            Matcher matcher = Pattern.compile("\\r\\n(icy-metaint):\\s*(.*)\\r\\n").matcher(sb.toString());
            i = matcher.find() ? Integer.parseInt(matcher.group(2)) : 0;
        } else {
            i = Integer.parseInt((String) ((List) headerFields.get("icy-metaint")).get(0));
        }
        if (i != 0) {
            StringBuilder sb3 = new StringBuilder();
            int i2 = 4080;
            int i3 = 0;
            do {
                int read2 = inputStream.read();
                if (read2 == -1) {
                    break;
                }
                boolean z = true;
                i3++;
                int i4 = i + 1;
                if (i3 == i4) {
                    i2 = read2 * 16;
                }
                if (i3 <= i4 || i3 >= i + i2) {
                    z = false;
                }
                if (z && read2 != 0) {
                    sb3.append((char) read2);
                }
            } while (i3 <= i + i2);
            this.f19782b = m24433a(sb3.toString());
            inputStream.close();
        }
    }

    /* renamed from: a */
    public void mo21734a(URL url) {
        this.f19782b = null;
        this.f19781a = url;
    }

    /* renamed from: a */
    public static Map<String, String> m24433a(String str) {
        HashMap hashMap = new HashMap();
        String[] split = str.split(";");
        Pattern compile = Pattern.compile("^([a-zA-Z]+)=\\'([^\\']*)\\'$");
        for (String matcher : split) {
            Matcher matcher2 = compile.matcher(matcher);
            if (matcher2.find()) {
                hashMap.put(matcher2.group(1), matcher2.group(2));
            }
        }
        return hashMap;
    }
}
