package androidx.media;

import androidx.versionedparcelable.C1055a;

public final class AudioAttributesImplBaseParcelizer {
    public static C0476c read(C1055a aVar) {
        C0476c cVar = new C0476c();
        cVar.mUsage = aVar.mo5391b(cVar.mUsage, 1);
        cVar.mContentType = aVar.mo5391b(cVar.mContentType, 2);
        cVar.mFlags = aVar.mo5391b(cVar.mFlags, 3);
        cVar.mLegacyStream = aVar.mo5391b(cVar.mLegacyStream, 4);
        return cVar;
    }

    public static void write(C0476c cVar, C1055a aVar) {
        aVar.mo5387a(false, false);
        aVar.mo5380a(cVar.mUsage, 1);
        aVar.mo5380a(cVar.mContentType, 2);
        aVar.mo5380a(cVar.mFlags, 3);
        aVar.mo5380a(cVar.mLegacyStream, 4);
    }
}
