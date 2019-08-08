package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.p136b.C2969a.C2970a;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.g */
public final class C3814g extends C4003n {

    /* renamed from: a */
    private final Map<String, String> f13138a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f13139b;

    public C3814g(C4089qe qeVar, Map<String, String> map) {
        super(qeVar, "storePicture");
        this.f13138a = map;
        this.f13139b = qeVar.mo15801d();
    }

    /* renamed from: a */
    public final void mo15317a() {
        if (this.f13139b == null) {
            mo15652a("Activity context is not available");
            return;
        }
        C3025aw.m10917e();
        if (!C3909jn.m17168f(this.f13139b).mo14677c()) {
            mo15652a("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f13138a.get("iurl");
        if (TextUtils.isEmpty(str)) {
            mo15652a("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String str2 = "Invalid image url: ";
            String valueOf = String.valueOf(str);
            mo15652a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            C3025aw.m10917e();
            if (!C3909jn.m17160c(lastPathSegment)) {
                String str3 = "Image type not recognized: ";
                String valueOf2 = String.valueOf(lastPathSegment);
                mo15652a(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                return;
            }
            Resources h = C3025aw.m10921i().mo15445h();
            C3025aw.m10917e();
            Builder e = C3909jn.m17164e(this.f13139b);
            e.setTitle(h != null ? h.getString(C2970a.f8682s1) : "Save image");
            e.setMessage(h != null ? h.getString(C2970a.f8683s2) : "Allow Ad to store image in Picture gallery?");
            e.setPositiveButton(h != null ? h.getString(C2970a.f8684s3) : "Accept", new C3841h(this, str, lastPathSegment));
            e.setNegativeButton(h != null ? h.getString(C2970a.f8685s4) : "Decline", new C3868i(this));
            e.create().show();
        }
    }
}
