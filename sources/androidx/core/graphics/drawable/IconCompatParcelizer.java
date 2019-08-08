package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.support.p017v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C1055a;

public class IconCompatParcelizer {
    public static IconCompat read(C1055a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1020a = aVar.mo5391b(iconCompat.f1020a, 1);
        iconCompat.f1022c = aVar.mo5397b(iconCompat.f1022c, 2);
        iconCompat.f1023d = aVar.mo5392b(iconCompat.f1023d, 3);
        iconCompat.f1024e = aVar.mo5391b(iconCompat.f1024e, 4);
        iconCompat.f1025f = aVar.mo5391b(iconCompat.f1025f, 5);
        iconCompat.f1026g = (ColorStateList) aVar.mo5392b(iconCompat.f1026g, 6);
        iconCompat.f1028j = aVar.mo5394b(iconCompat.f1028j, 7);
        iconCompat.mo1432c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1055a aVar) {
        aVar.mo5387a(true, true);
        iconCompat.mo1430a(aVar.mo5390a());
        aVar.mo5380a(iconCompat.f1020a, 1);
        aVar.mo5389a(iconCompat.f1022c, 2);
        aVar.mo5382a(iconCompat.f1023d, 3);
        aVar.mo5380a(iconCompat.f1024e, 4);
        aVar.mo5380a(iconCompat.f1025f, 5);
        aVar.mo5382a((Parcelable) iconCompat.f1026g, 6);
        aVar.mo5386a(iconCompat.f1028j, 7);
    }
}
