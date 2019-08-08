package com.startapp.android.publish.ads.list3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.common.metaData.MetaData;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.ads.list3d.b */
/* compiled from: StartAppSDK */
public class C5160b extends ArrayAdapter<ListItem> {

    /* renamed from: a */
    private String f16596a;

    /* renamed from: b */
    private String f16597b;

    public C5160b(Context context, List<ListItem> list, String str, String str2, String str3) {
        super(context, 0, list);
        this.f16596a = str2;
        this.f16597b = str3;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C5166d dVar;
        if (view == null) {
            dVar = new C5166d(getContext());
            view2 = dVar.mo19059a();
        } else {
            view2 = view;
            dVar = (C5166d) view.getTag();
        }
        ListItem listItem = (ListItem) getItem(i);
        dVar.mo19060a(C5344b.m22784a().mo19763a(listItem.mo19003n()));
        dVar.mo19063c().setText(listItem.mo18996g());
        dVar.mo19064d().setText(listItem.mo18997h());
        Bitmap a = C5169f.m22203a().mo19078a(this.f16597b).mo19067a(i, listItem.mo18989a(), listItem.mo18998i());
        if (a == null) {
            dVar.mo19062b().setImageResource(17301651);
            dVar.mo19062b().setTag("tag_error");
        } else {
            dVar.mo19062b().setImageBitmap(a);
            dVar.mo19062b().setTag("tag_ok");
        }
        dVar.mo19065e().setRating(listItem.mo19000k());
        dVar.mo19061a(listItem.mo19006q());
        C5169f.m22203a().mo19078a(this.f16597b).mo19069a(getContext(), listItem.mo18989a(), listItem.mo18991c(), new C5363b(this.f16596a), m22156a(listItem));
        return view2;
    }

    /* renamed from: a */
    private long m22156a(ListItem listItem) {
        if (listItem.mo19007r() != null) {
            return TimeUnit.SECONDS.toMillis(listItem.mo19007r().longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABDisplayImpressionDelayInSeconds());
    }
}
