package android.support.p017v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
/* compiled from: MediaControllerCompatApi21 */
class C0523c {

    /* renamed from: android.support.v4.media.session.c$a */
    /* compiled from: MediaControllerCompatApi21 */
    public interface C0524a {
        /* renamed from: a */
        void mo1705a();

        /* renamed from: a */
        void mo1706a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo1707a(Bundle bundle);

        /* renamed from: a */
        void mo1708a(CharSequence charSequence);

        /* renamed from: a */
        void mo1709a(Object obj);

        /* renamed from: a */
        void mo1710a(String str, Bundle bundle);

        /* renamed from: a */
        void mo1711a(List<?> list);

        /* renamed from: b */
        void mo1712b(Object obj);
    }

    /* renamed from: android.support.v4.media.session.c$b */
    /* compiled from: MediaControllerCompatApi21 */
    static class C0525b<T extends C0524a> extends Callback {

        /* renamed from: a */
        protected final T f1297a;

        public C0525b(T t) {
            this.f1297a = t;
        }

        public void onSessionDestroyed() {
            this.f1297a.mo1705a();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m1872a(bundle);
            this.f1297a.mo1710a(str, bundle);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f1297a.mo1709a((Object) playbackState);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f1297a.mo1712b(mediaMetadata);
        }

        public void onQueueChanged(List<QueueItem> list) {
            this.f1297a.mo1711a(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f1297a.mo1708a(charSequence);
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m1872a(bundle);
            this.f1297a.mo1707a(bundle);
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            this.f1297a.mo1706a(playbackInfo.getPlaybackType(), C0526c.m2035b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    /* compiled from: MediaControllerCompatApi21 */
    public static class C0526c {
        /* renamed from: a */
        public static AudioAttributes m2034a(Object obj) {
            return ((PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m2035b(Object obj) {
            return m2033a(m2034a(obj));
        }

        /* renamed from: a */
        private static int m2033a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m2021a(Context context, Object obj) {
        return new MediaController(context, (Token) obj);
    }

    /* renamed from: a */
    public static Object m2022a(C0524a aVar) {
        return new C0525b(aVar);
    }

    /* renamed from: a */
    public static boolean m2024a(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: a */
    public static void m2023a(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }
}
