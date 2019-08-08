package android.support.p017v4.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* renamed from: android.support.v4.media.b */
/* compiled from: AudioAttributesImplApi21 */
class C0475b implements C0472a {

    /* renamed from: a */
    AudioAttributes f1224a;

    /* renamed from: b */
    int f1225b = -1;

    C0475b() {
    }

    public int hashCode() {
        return this.f1224a.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0475b)) {
            return false;
        }
        return this.f1224a.equals(((C0475b) obj).f1224a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAttributesCompat: audioattributes=");
        sb.append(this.f1224a);
        return sb.toString();
    }
}
