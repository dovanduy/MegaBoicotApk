package com.appnext.p050d;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/* renamed from: com.appnext.d.a */
public final class C1378a extends VideoView {

    /* renamed from: nw */
    private C1379a f4302nw;

    /* renamed from: com.appnext.d.a$a */
    public interface C1379a {
        void onPause();

        void onPlay();
    }

    public C1378a(Context context) {
        super(context);
    }

    public C1378a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1378a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C1378a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo6334a(C1379a aVar) {
        this.f4302nw = aVar;
    }

    public final void pause() {
        super.pause();
        if (this.f4302nw != null) {
            this.f4302nw.onPause();
        }
    }

    public final void start() {
        super.start();
        if (this.f4302nw != null) {
            this.f4302nw.onPlay();
        }
    }
}
