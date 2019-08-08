package com.google.android.exoplayer2.p133ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Locale;

/* renamed from: com.google.android.exoplayer2.ui.DefaultTrackNameProvider */
public class DefaultTrackNameProvider implements TrackNameProvider {
    private final Resources resources;

    public DefaultTrackNameProvider(Resources resources2) {
        this.resources = (Resources) Assertions.checkNotNull(resources2);
    }

    public String getTrackName(Format format) {
        String str;
        int inferPrimaryTrackType = inferPrimaryTrackType(format);
        if (inferPrimaryTrackType == 2) {
            str = joinWithSeparator(buildResolutionString(format), buildBitrateString(format));
        } else if (inferPrimaryTrackType == 1) {
            str = joinWithSeparator(buildLanguageString(format), buildAudioChannelString(format), buildBitrateString(format));
        } else {
            str = buildLanguageString(format);
        }
        return str.length() == 0 ? this.resources.getString(C2933R.string.exo_track_unknown) : str;
    }

    private String buildResolutionString(Format format) {
        int i = format.width;
        int i2 = format.height;
        if (i == -1 || i2 == -1) {
            return "";
        }
        return this.resources.getString(C2933R.string.exo_track_resolution, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }

    private String buildBitrateString(Format format) {
        int i = format.bitrate;
        if (i == -1) {
            return "";
        }
        return this.resources.getString(C2933R.string.exo_track_bitrate, new Object[]{Float.valueOf(((float) i) / 1000000.0f)});
    }

    private String buildAudioChannelString(Format format) {
        int i = format.channelCount;
        if (i == -1 || i < 1) {
            return "";
        }
        switch (i) {
            case 1:
                return this.resources.getString(C2933R.string.exo_track_mono);
            case 2:
                return this.resources.getString(C2933R.string.exo_track_stereo);
            case 6:
            case 7:
                return this.resources.getString(C2933R.string.exo_track_surround_5_point_1);
            case 8:
                return this.resources.getString(C2933R.string.exo_track_surround_7_point_1);
            default:
                return this.resources.getString(C2933R.string.exo_track_surround);
        }
    }

    private String buildLanguageString(Format format) {
        String str = format.language;
        return (TextUtils.isEmpty(str) || C2793C.LANGUAGE_UNDETERMINED.equals(str)) ? "" : buildLanguageString(str);
    }

    private String buildLanguageString(String str) {
        return (Util.SDK_INT >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayLanguage();
    }

    private String joinWithSeparator(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.resources.getString(C2933R.string.exo_item_list, new Object[]{str, str2});
                }
            }
        }
        return str;
    }

    private static int inferPrimaryTrackType(Format format) {
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width != -1 || format.height != -1) {
            return 2;
        }
        if (format.channelCount == -1 && format.sampleRate == -1) {
            return -1;
        }
        return 1;
    }
}
