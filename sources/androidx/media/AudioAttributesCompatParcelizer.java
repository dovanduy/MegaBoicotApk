package androidx.media;

import android.support.p017v4.media.AudioAttributesCompat;
import androidx.versionedparcelable.C1055a;
import androidx.versionedparcelable.C1057c;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C1055a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.mImpl = (C0472a) aVar.mo5393b(audioAttributesCompat.mImpl, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C1055a aVar) {
        aVar.mo5387a(false, false);
        aVar.mo5384a((C1057c) audioAttributesCompat.mImpl, 1);
    }
}
