package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.appnext.base.p046b.C1245d;
import com.appnext.core.p049a.C1305b;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.pk */
public final class C4068pk implements C3067ae<C4061pd> {

    /* renamed from: a */
    private boolean f13778a;

    /* renamed from: a */
    private static int m17643a(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                aoq.m14615a();
                return C3975lz.m17369a(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(34 + String.valueOf(str).length() + String.valueOf(str2).length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                C3900je.m17435e(sb.toString());
            }
        }
        return i;
    }

    /* renamed from: a */
    private static void m17644a(C4046op opVar, Map<String, String> map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        if (str != null) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                C3900je.m17435e(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
            }
        }
        if (str2 != null) {
            Integer.parseInt(str2);
        }
        if (str3 != null) {
            Integer.parseInt(str3);
        }
        if (str4 != null) {
            Integer.parseInt(str4);
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int i;
        int i2;
        String[] split;
        C4061pd pdVar = (C4061pd) obj;
        String str = (String) map.get(C1245d.f3959jb);
        if (str == null) {
            C3900je.m17435e("Action missing from video GMSG.");
            return;
        }
        if (C3900je.m17428a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(13 + String.valueOf(str).length() + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            C3900je.m17429b(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get(TtmlNode.ATTR_TTS_COLOR);
            if (TextUtils.isEmpty(str2)) {
                C3900je.m17435e("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                pdVar.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                C3900je.m17435e("Invalid color parameter in video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map.get("mimeTypes");
                if (str3 == null) {
                    C3900je.m17435e("No MIME types specified for decoder properties inspection.");
                    C4046op.m17545a(pdVar, "missingMimeTypes");
                } else if (VERSION.SDK_INT < 16) {
                    C3900je.m17435e("Video decoder properties available on API versions >= 16.");
                    C4046op.m17545a(pdVar, "deficientApiVersion");
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str4 : str3.split(",")) {
                        hashMap.put(str4, C3973lx.m17359a(str4.trim()));
                    }
                    C4046op.m17546a(pdVar, (Map<String, List<Map<String, Object>>>) hashMap);
                }
            } else {
                C4051ou a = pdVar.mo15796a();
                if (a == null) {
                    C3900je.m17435e("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = C1305b.f4126lT.equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context = pdVar.getContext();
                    int a2 = m17643a(context, map, "x", 0);
                    int a3 = m17643a(context, map, "y", 0);
                    int a4 = m17643a(context, map, "w", -1);
                    int a5 = m17643a(context, map, "h", -1);
                    if (((Boolean) aoq.m14620f().mo14695a(aru.f11913cf)).booleanValue()) {
                        a4 = Math.min(a4, pdVar.mo15809m() - a2);
                        i = Math.min(a5, pdVar.mo15808l() - a3);
                    } else {
                        i = a5;
                    }
                    try {
                        i2 = Integer.parseInt((String) map.get("player"));
                    } catch (NumberFormatException unused2) {
                        i2 = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                    if (!equals || a.mo15767a() != null) {
                        a.mo15768a(a2, a3, a4, i);
                        return;
                    }
                    a.mo15769a(a2, a3, a4, i, i2, parseBoolean, new C4060pc((String) map.get("flags")));
                    C4046op a6 = a.mo15767a();
                    if (a6 != null) {
                        m17644a(a6, map);
                    }
                    return;
                }
                C4046op a7 = a.mo15767a();
                if (a7 == null) {
                    C4046op.m17544a(pdVar);
                } else if ("click".equals(str)) {
                    Context context2 = pdVar.getContext();
                    int a8 = m17643a(context2, map, "x", 0);
                    int a9 = m17643a(context2, map, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a8, (float) a9, 0);
                    a7.mo15751a(obtain);
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str5 = (String) map.get(C1245d.f3955iX);
                    if (str5 == null) {
                        C3900je.m17435e("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        a7.mo15749a((int) (Float.parseFloat(str5) * 1000.0f));
                    } catch (NumberFormatException unused3) {
                        String str6 = "Could not parse time parameter from currentTime video GMSG: ";
                        String valueOf = String.valueOf(str5);
                        C3900je.m17435e(valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6));
                    }
                } else if ("hide".equals(str)) {
                    a7.setVisibility(4);
                } else if ("load".equals(str)) {
                    a7.mo15754h();
                } else if ("loadControl".equals(str)) {
                    m17644a(a7, map);
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        a7.mo15757k();
                    } else {
                        a7.mo15758l();
                    }
                } else if ("pause".equals(str)) {
                    a7.mo15755i();
                } else if ("play".equals(str)) {
                    a7.mo15756j();
                } else if ("show".equals(str)) {
                    a7.setVisibility(0);
                } else if ("src".equals(str)) {
                    a7.mo15752a((String) map.get("src"));
                } else if ("touchMove".equals(str)) {
                    Context context3 = pdVar.getContext();
                    a7.mo15748a((float) m17643a(context3, map, "dx", 0), (float) m17643a(context3, map, "dy", 0));
                    if (!this.f13778a) {
                        pdVar.mo15803f();
                        this.f13778a = true;
                    }
                } else if ("volume".equals(str)) {
                    String str7 = (String) map.get("volume");
                    if (str7 == null) {
                        C3900je.m17435e("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        a7.setVolume(Float.parseFloat(str7));
                    } catch (NumberFormatException unused4) {
                        String str8 = "Could not parse volume parameter from volume video GMSG: ";
                        String valueOf2 = String.valueOf(str7);
                        C3900je.m17435e(valueOf2.length() != 0 ? str8.concat(valueOf2) : new String(str8));
                    }
                } else if ("watermark".equals(str)) {
                    a7.mo15759m();
                } else {
                    String str9 = "Unknown video action: ";
                    String valueOf3 = String.valueOf(str);
                    C3900je.m17435e(valueOf3.length() != 0 ? str9.concat(valueOf3) : new String(str9));
                }
            }
        }
    }
}
