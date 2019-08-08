package com.facebook.ads.internal.view.component;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1598i;
import com.facebook.ads.internal.p070a.C1563b;
import com.facebook.ads.internal.p070a.C1564c;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p116a.C2305b;
import com.facebook.ads.internal.p115w.p117b.C2317g;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.component.a */
public class C1983a extends C2023c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f6267b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2376a f6268c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2341w f6269d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1802c f6270e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1911a f6271f;

    /* renamed from: com.facebook.ads.internal.view.component.a$a */
    public interface C1987a {
        /* renamed from: a */
        void mo8137a();
    }

    public C1983a(Context context, boolean z, boolean z2, String str, C1597h hVar, C1802c cVar, C1911a aVar, C2376a aVar2, C2341w wVar) {
        super(context, z, z2, hVar);
        this.f6270e = cVar;
        this.f6271f = aVar;
        this.f6267b = str;
        this.f6268c = aVar2;
        this.f6269d = wVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C1563b m8158a(Uri uri, String str, Map<String, String> map, boolean z) {
        return C1564c.m6494a(getContext(), this.f6270e, str, uri, map, z, false);
    }

    /* renamed from: a */
    private void m8161a(String str, String str2, String str3, Map<String, String> map, boolean z, C1987a aVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.f6270e == null) {
            setVisibility(8);
            return;
        }
        setText(str);
        final String str4 = str3;
        final Map<String, String> map2 = map;
        final String str5 = str2;
        final boolean z2 = z;
        final C1987a aVar2 = aVar;
        C19841 r1 = new OnClickListener() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void m8170a() {
                String str;
                String str2;
                if (!C1795a.m7452k(C1983a.this.getContext()) || C1983a.this.f6269d.mo8740b()) {
                    try {
                        Uri parse = Uri.parse(str5);
                        C1983a.this.f6268c.mo8779a(map2);
                        map2.put("touch", C2323k.m9046a(C1983a.this.f6269d.mo8743e()));
                        C1563b a = C1983a.this.m8158a(parse, str4, map2, z2);
                        if (a != null && aVar2 == null) {
                            a.mo7058a();
                        } else if (aVar2 != null) {
                            aVar2.mo8137a();
                        }
                        if (C1983a.this.f6271f != null) {
                            C1983a.this.f6271f.mo6795a(C1983a.this.f6267b);
                        }
                    } catch (ActivityNotFoundException e) {
                        e = e;
                        str2 = String.valueOf(C1983a.class);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error while opening ");
                        sb.append(str5);
                        str = sb.toString();
                        Log.e(str2, str, e);
                    } catch (Exception e2) {
                        e = e2;
                        str2 = String.valueOf(C1983a.class);
                        str = "Error executing action";
                        Log.e(str2, str, e);
                    }
                }
            }

            public void onClick(View view) {
                if (C1983a.this.f6269d.mo8739a(C1983a.this.getContext())) {
                    if (C1983a.this.f6270e != null) {
                        C1983a.this.f6270e.mo7696i(str4, map2);
                    }
                } else if (C1795a.m7446e(C1983a.this.getContext())) {
                    if (C1983a.this.f6270e != null) {
                        C1983a.this.f6270e.mo7697j(str4, map2);
                    }
                    C2317g.m9038a(new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            map2.put("is_two_step", "true");
                            C19841.this.m8170a();
                        }
                    }, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (C1983a.this.f6270e != null) {
                                C1983a.this.f6270e.mo7698k(str4, map2);
                            }
                        }
                    }, C2305b.m9012a());
                } else {
                    m8170a();
                }
            }
        };
        setOnClickListener(r1);
    }

    /* renamed from: a */
    public void mo8130a(C1598i iVar, String str, Map<String, String> map) {
        m8161a(iVar.mo7179b(), iVar.mo7178a(), str, map, false, null);
    }

    /* renamed from: a */
    public void mo8131a(C1598i iVar, String str, Map<String, String> map, C1987a aVar) {
        m8161a(iVar.mo7179b(), iVar.mo7178a(), str, map, false, aVar);
    }

    /* renamed from: a */
    public void mo8132a(C1598i iVar, String str, Map<String, String> map, boolean z) {
        m8161a(iVar.mo7179b(), iVar.mo7178a(), str, map, z, null);
    }

    /* renamed from: b */
    public void mo8133b(C1598i iVar, String str, Map<String, String> map) {
        Uri parse = Uri.parse(iVar.mo7178a());
        this.f6268c.mo8779a(map);
        map.put("touch", C2323k.m9046a(this.f6269d.mo8743e()));
        C1563b a = m8158a(parse, str, map, false);
        if (a != null) {
            a.mo7059b();
        }
    }
}
