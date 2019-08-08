package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.asz;
import com.google.android.gms.internal.ads.atb;
import com.google.android.gms.internal.ads.auh;
import com.google.android.gms.internal.ads.aui;
import com.google.android.gms.internal.ads.bcm;
import com.google.android.gms.internal.ads.bcq;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.s */
public final class C3132s {
    /* renamed from: a */
    public static View m11231a(C3878ij ijVar) {
        if (ijVar == null) {
            C3900je.m17431c("AdState is null");
            return null;
        } else if (m11243b(ijVar) && ijVar.f13266b != null) {
            return ijVar.f13266b.getView();
        } else {
            try {
                C3235a a = ijVar.f13280p != null ? ijVar.f13280p.mo15083a() : null;
                if (a != null) {
                    return (View) C3238b.m11574a(a);
                }
                C3900je.m17435e("View in mediation adapter is null.");
                return null;
            } catch (RemoteException e) {
                C3900je.m17432c("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    static C3067ae<C4089qe> m11232a(bcm bcm, bcq bcq, C3054d dVar) {
        return new C3137x(bcm, dVar, bcq);
    }

    /* renamed from: a */
    private static auh m11233a(Object obj) {
        if (obj instanceof IBinder) {
            return aui.m15356a((IBinder) obj);
        }
        return null;
    }

    /* renamed from: a */
    private static String m11234a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            C3900je.m17435e("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        String valueOf2 = String.valueOf(encodeToString);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private static String m11235a(auh auh) {
        if (auh == null) {
            C3900je.m17435e("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri b = auh.mo14754b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException unused) {
            C3900je.m17435e("Unable to get image uri. Trying data uri next");
        }
        return m11241b(auh);
    }

    /* renamed from: a */
    private static JSONObject m11236a(Bundle bundle, String str) throws JSONException {
        String valueOf;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str3 = (String) keys.next();
            if (bundle.containsKey(str3)) {
                if ("image".equals(jSONObject2.getString(str3))) {
                    Object obj = bundle.get(str3);
                    if (obj instanceof Bitmap) {
                        valueOf = m11234a((Bitmap) obj);
                    } else {
                        str2 = "Invalid type. An image type extra should return a bitmap";
                        C3900je.m17435e(str2);
                    }
                } else if (bundle.get(str3) instanceof Bitmap) {
                    str2 = "Invalid asset type. Bitmap should be returned only for image type";
                    C3900je.m17435e(str2);
                } else {
                    valueOf = String.valueOf(bundle.get(str3));
                }
                jSONObject.put(str3, valueOf);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    static final /* synthetic */ void m11237a(asz asz, String str, C4089qe qeVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", asz.mo14756a());
            jSONObject.put(TtmlNode.TAG_BODY, asz.mo14761c());
            jSONObject.put("call_to_action", asz.mo14764e());
            jSONObject.put("price", asz.mo14767h());
            jSONObject.put("star_rating", String.valueOf(asz.mo14765f()));
            jSONObject.put("store", asz.mo14766g());
            jSONObject.put("icon", m11235a(asz.mo14763d()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b = asz.mo14759b();
            if (b != null) {
                for (Object a : b) {
                    jSONArray.put(m11235a(m11233a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", m11236a(asz.mo14773n(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            qeVar.mo14994b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            C3900je.m17432c("Exception occurred when loading assets", e);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m11238a(atb atb, String str, C4089qe qeVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", atb.mo14780a());
            jSONObject.put(TtmlNode.TAG_BODY, atb.mo14786e());
            jSONObject.put("call_to_action", atb.mo14788g());
            jSONObject.put("advertiser", atb.mo14789h());
            jSONObject.put("logo", m11235a(atb.mo14787f()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b = atb.mo14759b();
            if (b != null) {
                for (Object a : b) {
                    jSONArray.put(m11235a(m11233a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", m11236a(atb.mo14792n(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            qeVar.mo14994b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            C3900je.m17432c("Exception occurred when loading assets", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0134  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11240a(com.google.android.gms.internal.ads.C4089qe r26, com.google.android.gms.internal.ads.bbr r27, java.util.concurrent.CountDownLatch r28) {
        /*
            r1 = r26
            r2 = r27
            r7 = r28
            r8 = 0
            android.view.View r3 = r26.getView()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            if (r3 != 0) goto L_0x0014
            java.lang.String r1 = "AdWebView is null"
        L_0x000f:
            com.google.android.gms.internal.ads.C3900je.m17435e(r1)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            goto L_0x0132
        L_0x0014:
            r4 = 4
            r3.setVisibility(r4)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.bbj r3 = r2.f12614b     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.util.List<java.lang.String> r3 = r3.f12559r     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            if (r3 == 0) goto L_0x0121
            boolean r4 = r3.isEmpty()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            if (r4 == 0) goto L_0x0026
            goto L_0x0121
        L_0x0026:
            java.lang.String r4 = "/nativeExpressAssetsLoaded"
            com.google.android.gms.ads.internal.v r5 = new com.google.android.gms.ads.internal.v     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r5.<init>(r7)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r1.mo15880a(r4, r5)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r4 = "/nativeExpressAssetsLoadingFailed"
            com.google.android.gms.ads.internal.w r5 = new com.google.android.gms.ads.internal.w     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r5.<init>(r7)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r1.mo15880a(r4, r5)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.bcd r4 = r2.f12615c     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.bcm r4 = r4.mo15101h()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.bcd r5 = r2.f12615c     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.bcq r5 = r5.mo15102i()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r6 = "2"
            boolean r6 = r3.contains(r6)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r9 = 0
            if (r6 == 0) goto L_0x00a9
            if (r4 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.asz r3 = new com.google.android.gms.internal.ads.asz     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r11 = r4.mo15110a()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.util.List r12 = r4.mo15113b()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r13 = r4.mo15115c()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.auh r14 = r4.mo15117d()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r15 = r4.mo15118e()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            double r16 = r4.mo15119f()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r18 = r4.mo15120g()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r19 = r4.mo15121h()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r20 = 0
            android.os.Bundle r21 = r4.mo15125l()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r22 = 0
            com.google.android.gms.b.a r5 = r4.mo15129p()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            if (r5 == 0) goto L_0x008c
            com.google.android.gms.b.a r5 = r4.mo15129p()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.Object r5 = com.google.android.gms.p137b.C3238b.m11574a(r5)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r9 = r5
            android.view.View r9 = (android.view.View) r9     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
        L_0x008c:
            r23 = r9
            com.google.android.gms.b.a r24 = r4.mo15130q()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r25 = 0
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.bbj r4 = r2.f12614b     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r4 = r4.f12558q     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.rm r5 = r26.mo15919v()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.ads.internal.t r6 = new com.google.android.gms.ads.internal.t     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r6.<init>(r3, r4, r1)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
        L_0x00a5:
            r5.mo15931a(r6)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            goto L_0x0100
        L_0x00a9:
            java.lang.String r4 = "1"
            boolean r3 = r3.contains(r4)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            if (r3 == 0) goto L_0x011d
            if (r5 == 0) goto L_0x011d
            com.google.android.gms.internal.ads.atb r3 = new com.google.android.gms.internal.ads.atb     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r11 = r5.mo15132a()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.util.List r12 = r5.mo15135b()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r13 = r5.mo15137c()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.auh r14 = r5.mo15139d()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r15 = r5.mo15140e()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r16 = r5.mo15141f()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r17 = 0
            android.os.Bundle r18 = r5.mo15145j()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r19 = 0
            com.google.android.gms.b.a r4 = r5.mo15149n()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            if (r4 == 0) goto L_0x00e6
            com.google.android.gms.b.a r4 = r5.mo15149n()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.Object r4 = com.google.android.gms.p137b.C3238b.m11574a(r4)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r9 = r4
            android.view.View r9 = (android.view.View) r9     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
        L_0x00e6:
            r20 = r9
            com.google.android.gms.b.a r21 = r5.mo15150o()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r22 = 0
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.bbj r4 = r2.f12614b     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r4 = r4.f12558q     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.rm r5 = r26.mo15919v()     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.ads.internal.u r6 = new com.google.android.gms.ads.internal.u     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            r6.<init>(r3, r4, r1)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            goto L_0x00a5
        L_0x0100:
            com.google.android.gms.internal.ads.bbj r3 = r2.f12614b     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r3 = r3.f12556o     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            com.google.android.gms.internal.ads.bbj r2 = r2.f12614b     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            java.lang.String r2 = r2.f12557p     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            if (r2 == 0) goto L_0x0113
            java.lang.String r4 = "text/html"
            java.lang.String r5 = "UTF-8"
            r6 = 0
            r1.loadDataWithBaseURL(r2, r3, r4, r5, r6)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
            goto L_0x011a
        L_0x0113:
            java.lang.String r2 = "text/html"
            java.lang.String r4 = "UTF-8"
            r1.loadData(r3, r2, r4)     // Catch:{ RemoteException -> 0x012b, RuntimeException -> 0x0125 }
        L_0x011a:
            r1 = 1
            r8 = r1
            goto L_0x0132
        L_0x011d:
            java.lang.String r1 = "No matching template id and mapper"
            goto L_0x000f
        L_0x0121:
            java.lang.String r1 = "No template ids present in mediation response"
            goto L_0x000f
        L_0x0125:
            r0 = move-exception
            r1 = r0
            r28.countDown()
            throw r1
        L_0x012b:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "Unable to invoke load assets"
            com.google.android.gms.internal.ads.C3900je.m17432c(r2, r1)
        L_0x0132:
            if (r8 != 0) goto L_0x0137
            r28.countDown()
        L_0x0137:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C3132s.m11240a(com.google.android.gms.internal.ads.qe, com.google.android.gms.internal.ads.bbr, java.util.concurrent.CountDownLatch):boolean");
    }

    /* renamed from: b */
    private static String m11241b(auh auh) {
        try {
            C3235a a = auh.mo14753a();
            if (a == null) {
                C3900je.m17435e("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) C3238b.m11574a(a);
            if (drawable instanceof BitmapDrawable) {
                return m11234a(((BitmapDrawable) drawable).getBitmap());
            }
            C3900je.m17435e("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException unused) {
            C3900je.m17435e("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m11242b(C4089qe qeVar) {
        OnClickListener onClickListener = qeVar.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(qeVar.getView());
        }
    }

    /* renamed from: b */
    public static boolean m11243b(C3878ij ijVar) {
        return (ijVar == null || !ijVar.f13278n || ijVar.f13279o == null || ijVar.f13279o.f12556o == null) ? false : true;
    }
}
