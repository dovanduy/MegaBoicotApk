package android.support.p028v7.widget;

import android.support.p028v7.widget.RecyclerView.C0881i;
import android.support.p028v7.widget.RecyclerView.C0898s;
import android.view.View;

/* renamed from: android.support.v7.widget.ao */
/* compiled from: ScrollbarHelper */
class C0960ao {
    /* renamed from: a */
    static int m4285a(C0898s sVar, C0948ah ahVar, View view, View view2, C0881i iVar, boolean z, boolean z2) {
        int i;
        if (iVar.getChildCount() == 0 || sVar.mo4484e() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(iVar.getPosition(view), iVar.getPosition(view2));
        int max = Math.max(iVar.getPosition(view), iVar.getPosition(view2));
        if (z2) {
            i = Math.max(0, (sVar.mo4484e() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(ahVar.mo4917b(view2) - ahVar.mo4913a(view))) / ((float) (Math.abs(iVar.getPosition(view) - iVar.getPosition(view2)) + 1)))) + ((float) (ahVar.mo4918c() - ahVar.mo4913a(view))));
    }

    /* renamed from: a */
    static int m4284a(C0898s sVar, C0948ah ahVar, View view, View view2, C0881i iVar, boolean z) {
        if (iVar.getChildCount() == 0 || sVar.mo4484e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(iVar.getPosition(view) - iVar.getPosition(view2)) + 1;
        }
        return Math.min(ahVar.mo4924f(), ahVar.mo4917b(view2) - ahVar.mo4913a(view));
    }

    /* renamed from: b */
    static int m4286b(C0898s sVar, C0948ah ahVar, View view, View view2, C0881i iVar, boolean z) {
        if (iVar.getChildCount() == 0 || sVar.mo4484e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return sVar.mo4484e();
        }
        return (int) ((((float) (ahVar.mo4917b(view2) - ahVar.mo4913a(view))) / ((float) (Math.abs(iVar.getPosition(view) - iVar.getPosition(view2)) + 1))) * ((float) sVar.mo4484e()));
    }
}
