package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.appnext.banners.BannerAdRequest;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.p093t.C1833f;
import com.facebook.ads.internal.p093t.C1838k;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p125x.C2376a;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.p */
public class C1650p extends C1584b {

    /* renamed from: c */
    private final C1637i f5164c;

    /* renamed from: d */
    private C1838k f5165d;

    /* renamed from: e */
    private boolean f5166e;

    /* renamed from: f */
    private boolean f5167f;

    /* renamed from: g */
    private boolean f5168g;

    /* renamed from: h */
    private boolean f5169h;

    /* renamed from: i */
    private boolean f5170i;

    /* renamed from: j */
    private View f5171j;

    /* renamed from: k */
    private C1833f f5172k;

    /* renamed from: l */
    private List<View> f5173l;

    /* renamed from: m */
    private C1651a f5174m = C1651a.ALL;

    /* renamed from: n */
    private C1652b f5175n = null;

    /* renamed from: o */
    private String f5176o;

    /* renamed from: com.facebook.ads.internal.adapters.p$a */
    public enum C1651a {
        ALL(BannerAdRequest.TYPE_ALL),
        NONE("none"),
        MANUAL("manual");
        

        /* renamed from: d */
        private final String f5181d;

        private C1651a(String str) {
            this.f5181d = str;
        }

        public String toString() {
            return this.f5181d;
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.p$b */
    public enum C1652b {
        AVAILABLE("available"),
        TOO_SMALL("too_small"),
        NO_NATIVE_AD_LAYOUT("no_native_ad_layout");
        

        /* renamed from: d */
        private final String f5186d;

        private C1652b(String str) {
            this.f5186d = str;
        }

        public String toString() {
            return this.f5186d;
        }
    }

    public C1650p(Context context, C1609c cVar, C2376a aVar, C1637i iVar) {
        super(context, cVar, aVar);
        this.f5164c = iVar;
    }

    /* renamed from: b */
    private String m6902b(View view) {
        try {
            return m6903c(view).toString();
        } catch (JSONException unused) {
            return "Json exception";
        }
    }

    /* renamed from: c */
    private JSONObject m6903c(View view) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(TtmlNode.ATTR_ID, Integer.valueOf(view.getId()));
        jSONObject.putOpt("class", view.getClass());
        boolean z = true;
        jSONObject.putOpt(TtmlNode.ATTR_TTS_ORIGIN, String.format(Locale.US, "{x:%d, y:%d}", new Object[]{Integer.valueOf(view.getTop()), Integer.valueOf(view.getLeft())}));
        jSONObject.putOpt("size", String.format(Locale.US, "{h:%d, w:%d}", new Object[]{Integer.valueOf(view.getHeight()), Integer.valueOf(view.getWidth())}));
        if (this.f5173l == null || !this.f5173l.contains(view)) {
            z = false;
        }
        jSONObject.putOpt("clickable", Boolean.valueOf(z));
        String str = "unknown";
        if (view instanceof Button) {
            str = "button";
        } else if (view instanceof TextView) {
            str = MimeTypes.BASE_TYPE_TEXT;
        } else if (view instanceof ImageView) {
            str = "image";
        } else if (view instanceof MediaView) {
            str = "mediaview";
        } else if (view instanceof ViewGroup) {
            str = "viewgroup";
        }
        jSONObject.putOpt(C1245d.f3961jd, str);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                jSONArray.put(m6903c(viewGroup.getChildAt(i)));
            }
            jSONObject.putOpt("list", jSONArray);
        }
        return jSONObject;
    }

    /* renamed from: d */
    private String m6904d(View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return "";
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.ARGB_8888);
            createBitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(CompressFormat.JPEG, this.f5164c.mo7297i(), byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public void mo7333a(View view) {
        this.f5171j = view;
    }

    /* renamed from: a */
    public void mo7334a(C1651a aVar) {
        this.f5174m = aVar;
    }

    /* renamed from: a */
    public void mo7335a(C1652b bVar) {
        this.f5175n = bVar;
    }

    /* renamed from: a */
    public void mo7336a(C1833f fVar) {
        this.f5172k = fVar;
    }

    /* renamed from: a */
    public void mo7337a(C1838k kVar) {
        this.f5165d = kVar;
    }

    /* renamed from: a */
    public void mo7338a(String str) {
        this.f5176o = str;
    }

    /* renamed from: a */
    public void mo7339a(List<View> list) {
        this.f5173l = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7112a(Map<String, String> map) {
        if (this.f5164c != null) {
            if (this.f5165d != null) {
                map.put("nti", String.valueOf(this.f5165d.mo7810c()));
            }
            if (this.f5166e) {
                map.put("nhs", Boolean.TRUE.toString());
            }
            if (this.f5167f) {
                map.put("nmv", Boolean.TRUE.toString());
            }
            if (this.f5168g) {
                map.put("nmvap", Boolean.TRUE.toString());
            }
            if (this.f5171j != null && this.f5164c.mo7291d()) {
                map.put("view", m6902b(this.f5171j));
            }
            if (this.f5171j != null && this.f5164c.mo7296h()) {
                map.put("snapshot", m6904d(this.f5171j));
            }
            if (this.f5169h) {
                map.put("niv", Boolean.TRUE.toString());
            }
            if (this.f5174m != null) {
                map.put("precache_media", this.f5174m.toString());
            }
            if (this.f5170i) {
                map.put("ucvr", Boolean.TRUE.toString());
            }
            if (this.f5172k != null) {
                map.put("namw", String.valueOf((int) (((float) this.f5172k.getWidth()) / C2342x.f7369b)));
                map.put("namh", String.valueOf((int) (((float) this.f5172k.getHeight()) / C2342x.f7369b)));
            }
            if (this.f5175n != null) {
                map.put("narar", this.f5175n.toString());
            }
            if (this.f5176o != null) {
                map.put("extra_hints", this.f5176o);
            }
            this.f5164c.mo7286a(map);
        }
    }

    /* renamed from: a */
    public void mo7340a(boolean z) {
        this.f5166e = z;
    }

    /* renamed from: b */
    public void mo7341b(boolean z) {
        this.f5167f = z;
    }

    /* renamed from: c */
    public void mo7342c(boolean z) {
        this.f5168g = z;
    }

    /* renamed from: d */
    public void mo7343d(boolean z) {
        this.f5169h = z;
    }

    /* renamed from: e */
    public void mo7344e(boolean z) {
        this.f5170i = z;
    }
}
