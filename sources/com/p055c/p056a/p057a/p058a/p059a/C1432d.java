package com.p055c.p056a.p057a.p058a.p059a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings.System;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.c.a.a.a.a.d */
public final class C1432d extends ContentObserver {

    /* renamed from: a */
    private final Context f4369a;

    /* renamed from: b */
    private final AudioManager f4370b;

    /* renamed from: c */
    private final C1429a f4371c;

    /* renamed from: d */
    private final C1431c f4372d;

    /* renamed from: e */
    private float f4373e;

    public C1432d(Handler handler, Context context, C1429a aVar, C1431c cVar) {
        super(handler);
        this.f4369a = context;
        this.f4370b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f4371c = aVar;
        this.f4372d = cVar;
    }

    /* renamed from: a */
    private boolean m5910a(float f) {
        return f != this.f4373e;
    }

    /* renamed from: c */
    private float m5911c() {
        return this.f4371c.mo6466a(this.f4370b.getStreamVolume(3), this.f4370b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m5912d() {
        this.f4372d.mo6468a(this.f4373e);
    }

    /* renamed from: a */
    public void mo6469a() {
        this.f4373e = m5911c();
        m5912d();
        this.f4369a.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo6470b() {
        this.f4369a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m5911c();
        if (m5910a(c)) {
            this.f4373e = c;
            m5912d();
        }
    }
}
