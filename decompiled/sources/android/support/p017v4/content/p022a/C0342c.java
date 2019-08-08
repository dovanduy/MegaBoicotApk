package android.support.p017v4.content.p022a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p012a.C0118a.C0125g;
import android.support.p017v4.p020b.C0318a;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.a.c */
/* compiled from: FontResourcesParserCompat */
public class C0342c {

    /* renamed from: android.support.v4.content.a.c$a */
    /* compiled from: FontResourcesParserCompat */
    public interface C0343a {
    }

    /* renamed from: android.support.v4.content.a.c$b */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0344b implements C0343a {

        /* renamed from: a */
        private final C0345c[] f875a;

        public C0344b(C0345c[] cVarArr) {
            this.f875a = cVarArr;
        }

        /* renamed from: a */
        public C0345c[] mo1203a() {
            return this.f875a;
        }
    }

    /* renamed from: android.support.v4.content.a.c$c */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0345c {

        /* renamed from: a */
        private final String f876a;

        /* renamed from: b */
        private int f877b;

        /* renamed from: c */
        private boolean f878c;

        /* renamed from: d */
        private String f879d;

        /* renamed from: e */
        private int f880e;

        /* renamed from: f */
        private int f881f;

        public C0345c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f876a = str;
            this.f877b = i;
            this.f878c = z;
            this.f879d = str2;
            this.f880e = i2;
            this.f881f = i3;
        }

        /* renamed from: a */
        public String mo1204a() {
            return this.f876a;
        }

        /* renamed from: b */
        public int mo1205b() {
            return this.f877b;
        }

        /* renamed from: c */
        public boolean mo1206c() {
            return this.f878c;
        }

        /* renamed from: d */
        public String mo1207d() {
            return this.f879d;
        }

        /* renamed from: e */
        public int mo1208e() {
            return this.f880e;
        }

        /* renamed from: f */
        public int mo1209f() {
            return this.f881f;
        }
    }

    /* renamed from: android.support.v4.content.a.c$d */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0346d implements C0343a {

        /* renamed from: a */
        private final C0318a f882a;

        /* renamed from: b */
        private final int f883b;

        /* renamed from: c */
        private final int f884c;

        public C0346d(C0318a aVar, int i, int i2) {
            this.f882a = aVar;
            this.f884c = i;
            this.f883b = i2;
        }

        /* renamed from: a */
        public C0318a mo1210a() {
            return this.f882a;
        }

        /* renamed from: b */
        public int mo1211b() {
            return this.f884c;
        }

        /* renamed from: c */
        public int mo1212c() {
            return this.f883b;
        }
    }

    /* renamed from: a */
    public static C0343a m1269a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m1273b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    private static C0343a m1273b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m1274c(xmlPullParser, resources);
        }
        m1272a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C0343a m1274c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0125g.FontFamily);
        String string = obtainAttributes.getString(C0125g.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0125g.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0125g.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0125g.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0125g.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0125g.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m1275d(xmlPullParser, resources));
                    } else {
                        m1272a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0344b((C0345c[]) arrayList.toArray(new C0345c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m1272a(xmlPullParser);
        }
        return new C0346d(new C0318a(string, string2, string3, m1270a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: a */
    private static int m1268a(TypedArray typedArray, int i) {
        if (VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: a */
    public static List<List<byte[]>> m1270a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m1268a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m1271a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m1271a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m1271a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: d */
    private static C0345c m1275d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0125g.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0125g.FontFamilyFont_fontWeight) ? C0125g.FontFamilyFont_fontWeight : C0125g.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0125g.FontFamilyFont_fontStyle) ? C0125g.FontFamilyFont_fontStyle : C0125g.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C0125g.FontFamilyFont_ttcIndex) ? C0125g.FontFamilyFont_ttcIndex : C0125g.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0125g.FontFamilyFont_fontVariationSettings) ? C0125g.FontFamilyFont_fontVariationSettings : C0125g.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0125g.FontFamilyFont_font) ? C0125g.FontFamilyFont_font : C0125g.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m1272a(xmlPullParser);
        }
        C0345c cVar = new C0345c(string2, i, z, string, i3, resourceId);
        return cVar;
    }

    /* renamed from: a */
    private static void m1272a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }
}
