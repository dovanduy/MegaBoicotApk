package com.startapp.android.publish.adsCommon;

import com.google.android.exoplayer2.C2793C;
import com.startapp.common.p193a.C5518g;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* renamed from: com.startapp.android.publish.adsCommon.o */
/* compiled from: StartAppSDK */
public class C5435o {

    /* renamed from: a */
    private static String f17372a = "XmlTools";

    /* renamed from: a */
    public static String m23242a(Node node) {
        try {
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", "yes");
            newTransformer.setOutputProperty("method", "xml");
            newTransformer.setOutputProperty("indent", "no");
            newTransformer.setOutputProperty("encoding", C2793C.UTF8_NAME);
            StringWriter stringWriter = new StringWriter();
            newTransformer.transform(new DOMSource(node), new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (Exception e) {
            C5518g.m23564a(f17372a, 6, "xmlDocumentToString", e);
            return null;
        }
    }

    /* renamed from: a */
    public static Document m23243a(String str) {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setIgnoringElementContentWhitespace(true);
            newInstance.setIgnoringComments(true);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(new StringReader(str));
            return newDocumentBuilder.parse(inputSource);
        } catch (Exception e) {
            C5518g.m23564a(f17372a, 6, "stringToDocument", e);
            return null;
        }
    }

    /* renamed from: b */
    public static String m23244b(Node node) {
        NodeList childNodes = node.getChildNodes();
        String str = null;
        for (int i = 0; i < childNodes.getLength(); i++) {
            str = ((CharacterData) childNodes.item(i)).getData().trim();
            if (str.length() != 0) {
                return str;
            }
        }
        return str;
    }
}
