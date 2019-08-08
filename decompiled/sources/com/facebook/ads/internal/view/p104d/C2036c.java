package com.facebook.ads.internal.view.p104d;

import android.content.Context;
import android.support.p028v7.widget.LinearLayoutManager;
import android.support.p028v7.widget.RecyclerView;
import android.support.p028v7.widget.RecyclerView.C0881i;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.facebook.ads.internal.view.d.c */
public class C2036c extends RecyclerView implements OnTouchListener {

    /* renamed from: a */
    protected final int f6439a = m8315a();

    /* renamed from: b */
    protected int f6440b = 0;

    /* renamed from: c */
    private int f6441c = 0;

    /* renamed from: d */
    private boolean f6442d = true;

    /* renamed from: e */
    private boolean f6443e = false;

    /* renamed from: f */
    private LinearLayoutManager f6444f;

    /* renamed from: g */
    private C2037a f6445g;

    /* renamed from: com.facebook.ads.internal.view.d.c$a */
    public interface C2037a {
        /* renamed from: a */
        int mo8257a(int i);
    }

    public C2036c(Context context) {
        super(context);
        setOnTouchListener(this);
    }

    public C2036c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnTouchListener(this);
    }

    public C2036c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnTouchListener(this);
    }

    /* renamed from: a */
    private int m8315a() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    private int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getItemCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8253a(int i, boolean z) {
        if (getAdapter() != null) {
            this.f6440b = i;
            if (z) {
                smoothScrollToPosition(i);
            } else {
                scrollToPosition(i);
            }
        }
    }

    public int getCurrentPosition() {
        return this.f6440b;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || actionMasked == 4) {
            if (this.f6443e) {
                int i = this.f6441c - rawX;
                int a = this.f6445g.mo8257a(i);
                int i2 = i > this.f6439a ? Math.min(this.f6440b + a, getItemCount() - 1) : i < (-this.f6439a) ? Math.max(this.f6440b - a, 0) : this.f6440b;
                mo8253a(i2, true);
            }
            this.f6442d = true;
            this.f6443e = false;
            return true;
        }
        if (actionMasked == 0 || actionMasked == 5 || (this.f6442d && actionMasked == 2)) {
            this.f6441c = rawX;
            if (this.f6442d) {
                this.f6442d = false;
            }
            this.f6443e = true;
        }
        return false;
    }

    public void setLayoutManager(C0881i iVar) {
        if (!(iVar instanceof LinearLayoutManager)) {
            throw new IllegalArgumentException("SnapRecyclerView only supports LinearLayoutManager");
        }
        super.setLayoutManager(iVar);
        this.f6444f = (LinearLayoutManager) iVar;
    }

    public void setSnapDelegate(C2037a aVar) {
        this.f6445g = aVar;
    }
}
