package com.facebook.ads.internal.view;

import android.content.Context;
import android.support.p028v7.widget.LinearLayoutManager;
import android.support.p028v7.widget.RecyclerView;
import android.support.p028v7.widget.RecyclerView.C0881i;

/* renamed from: com.facebook.ads.internal.view.d */
public final class C2033d extends RecyclerView {
    public C2033d(Context context) {
        super(context);
        setCarouselLayoutManager(context);
    }

    private void setCarouselLayoutManager(Context context) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.setAutoMeasureEnabled(true);
        super.setLayoutManager(linearLayoutManager);
    }

    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) super.getLayoutManager();
    }

    public void setLayoutManager(C0881i iVar) {
    }
}
