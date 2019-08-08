package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.C1055a;

public final class AudioAttributesImplApi21Parcelizer {
    public static C0475b read(C1055a aVar) {
        C0475b bVar = new C0475b();
        bVar.mAudioAttributes = (AudioAttributes) aVar.mo5392b(bVar.mAudioAttributes, 1);
        bVar.mLegacyStreamType = aVar.mo5391b(bVar.mLegacyStreamType, 2);
        return bVar;
    }

    public static void write(C0475b bVar, C1055a aVar) {
        aVar.mo5387a(false, false);
        aVar.mo5382a((Parcelable) bVar.mAudioAttributes, 1);
        aVar.mo5380a(bVar.mLegacyStreamType, 2);
    }
}
