package com.truenet.android.p198a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.SynchronousQueue;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: com.truenet.android.a.i */
public final class C5581i {

    /* renamed from: a */
    public static final C5582a f17675a = new C5582a(null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f17676b = f17675a.getClass().getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f17677c;

    /* renamed from: com.truenet.android.a.i$a */
    public static final class C5582a {

        /* renamed from: com.truenet.android.a.i$a$a */
        static final class C5583a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f17678a;

            /* renamed from: b */
            final /* synthetic */ SynchronousQueue f17679b;

            C5583a(Context context, SynchronousQueue synchronousQueue) {
                this.f17678a = context;
                this.f17679b = synchronousQueue;
            }

            public final void run() {
                try {
                    WebSettings settings = new WebView(this.f17678a).getSettings();
                    C0032h.m42a((Object) settings, "WebView(context).settings");
                    this.f17679b.offer(settings.getUserAgentString());
                } catch (Exception e) {
                    Log.e(C5581i.f17676b, e.getMessage());
                    this.f17679b.offer("undefined");
                }
            }
        }

        private C5582a() {
        }

        public /* synthetic */ C5582a(C0029e eVar) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final String mo20685a(@NotNull Context context) {
            C0032h.m45b(context, "context");
            if (C5581i.f17677c != null) {
                String a = C5581i.f17677c;
                if (a == null) {
                    C0032h.m41a();
                }
                return a;
            }
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            new Handler(Looper.getMainLooper()).post(new C5583a(context, synchronousQueue));
            C5581i.f17677c = (String) synchronousQueue.take();
            String a2 = C5581i.f17677c;
            if (a2 == null) {
                C0032h.m41a();
            }
            return a2;
        }
    }
}
