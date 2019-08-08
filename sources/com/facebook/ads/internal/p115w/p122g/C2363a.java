package com.facebook.ads.internal.p115w.p122g;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.widget.EditText;
import com.facebook.ads.internal.p080g.C1719b;
import com.facebook.ads.internal.p086m.C1764c;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p095v.p096a.C1855a;
import com.facebook.ads.internal.p095v.p096a.C1872p;
import com.facebook.ads.internal.p115w.p116a.C2305b;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p120e.C2357d;
import com.facebook.ads.internal.p115w.p122g.C2368b.C2369a;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.facebook.ads.internal.w.g.a */
public class C2363a {

    /* renamed from: a */
    private static C2363a f7437a;

    /* renamed from: b */
    private final C2368b f7438b;

    /* renamed from: c */
    private final C2364a f7439c;

    /* renamed from: com.facebook.ads.internal.w.g.a$a */
    private static class C2364a implements C2369a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1855a f7440a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ThreadPoolExecutor f7441b;

        /* renamed from: c */
        private final C1764c f7442c;

        public C2364a(ThreadPoolExecutor threadPoolExecutor, C1764c cVar, Context context) {
            this.f7440a = C2357d.m9119b(context);
            this.f7441b = threadPoolExecutor;
            this.f7442c = cVar;
        }

        /* renamed from: a */
        static /* synthetic */ Map m9141a(C2364a aVar, String str) {
            C1872p pVar = new C1872p();
            C1872p pVar2 = new C1872p();
            C1872p pVar3 = new C1872p();
            pVar.put("user_identifier", C1719b.f5386b);
            pVar.put("config_id", "297035420885434");
            pVar.put("category_id", "277149136230712");
            pVar.put("access_token", "693953940997901|9bf29a1f2745746a6c60d707f5bc23c2");
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis() / 1000);
            sb.append("");
            pVar.put("client_time", sb.toString());
            String f = aVar.f7442c.mo7602f();
            if (f != null) {
                pVar3.put("client_token", f);
            }
            pVar2.put("description", str);
            pVar2.put("misc_info", C2323k.m9046a(pVar3));
            pVar.mo7895b(TtmlNode.TAG_METADATA, C2323k.m9046a(pVar2));
            return pVar;
        }

        /* renamed from: a */
        public void mo8769a() {
            Activity a = C2305b.m9012a();
            if (a != null) {
                Builder builder = new Builder(a);
                builder.setTitle("What Happened?");
                final EditText editText = new EditText(a);
                editText.setSingleLine(false);
                editText.setImeOptions(1073741824);
                editText.setHint("May others login as you to debug? How do you reproduce the issue?");
                editText.setMaxLines(2);
                editText.setMinLines(2);
                builder.setView(editText);
                builder.setNegativeButton("Cancel", new OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.setPositiveButton("Send Report", new OnClickListener() {
                    public void onClick(final DialogInterface dialogInterface, int i) {
                        C2364a.this.f7441b.execute(new Runnable() {
                            public void run() {
                                String str;
                                C1855a a = C2364a.this.f7440a;
                                String urlPrefix = AdInternalSettings.getUrlPrefix();
                                if (TextUtils.isEmpty(urlPrefix)) {
                                    str = "https://graph.facebook.com/693953940997901/bugs";
                                } else {
                                    str = String.format(Locale.US, "https://graph.%s.facebook.com/693953940997901/bugs", new Object[]{urlPrefix});
                                }
                                a.mo7852b(str, C2364a.this.f7440a.mo7844a().mo7891a(C2364a.m9141a(C2364a.this, editText.getText().toString())));
                                dialogInterface.cancel();
                            }
                        });
                    }
                });
                builder.create().show();
            }
        }
    }

    public C2363a(Context context, ThreadPoolExecutor threadPoolExecutor, C1764c cVar) {
        this.f7438b = new C2368b(context);
        this.f7439c = new C2364a(threadPoolExecutor, cVar, context);
    }

    /* renamed from: a */
    public static void m9139a(Context context, ThreadPoolExecutor threadPoolExecutor, C1764c cVar) {
        if (C1795a.m7443c(context) && f7437a == null) {
            f7437a = new C2363a(context, threadPoolExecutor, cVar);
            C2363a aVar = f7437a;
            aVar.f7438b.mo8773a(aVar.f7439c);
        }
    }
}
