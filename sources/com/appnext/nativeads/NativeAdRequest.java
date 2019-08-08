package com.appnext.nativeads;

import com.appnext.core.C1308c;

public class NativeAdRequest extends C1308c {
    private String categories = "";
    private CreativeType creativeType = CreativeType.ALL;

    /* renamed from: mL */
    private CachingPolicy f4345mL = CachingPolicy.ALL;

    /* renamed from: mM */
    private VideoLength f4346mM = VideoLength.DEFAULT;

    /* renamed from: mN */
    private VideoQuality f4347mN = VideoQuality.DEFAULT;
    private int maxVideoLength = 0;
    private int minVideoLength = 0;
    private String postback = "";

    public enum CachingPolicy {
        NOTHING(0),
        STATIC_ONLY(1),
        VIDEO_ONLY(2),
        ALL(3);
        
        private int value;

        private CachingPolicy(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        public static CachingPolicy fromInt(int i) {
            CachingPolicy[] values;
            for (CachingPolicy cachingPolicy : values()) {
                if (cachingPolicy.getValue() == i) {
                    return cachingPolicy;
                }
            }
            return null;
        }
    }

    public enum CreativeType {
        STATIC_ONLY,
        VIDEO_ONLY,
        ALL
    }

    public enum VideoLength {
        DEFAULT(0),
        LONG(1),
        SHORT(2);
        
        private int value;

        private VideoLength(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        public static VideoLength fromInt(int i) {
            VideoLength[] values;
            for (VideoLength videoLength : values()) {
                if (videoLength.getValue() == i) {
                    return videoLength;
                }
            }
            return null;
        }
    }

    public enum VideoQuality {
        DEFAULT(0),
        HIGH(1),
        LOW(2);
        
        private int value;

        private VideoQuality(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        public static VideoQuality fromInt(int i) {
            VideoQuality[] values;
            for (VideoQuality videoQuality : values()) {
                if (videoQuality.getValue() == i) {
                    return videoQuality;
                }
            }
            return null;
        }
    }

    public NativeAdRequest() {
    }

    NativeAdRequest(NativeAdRequest nativeAdRequest) {
        this.categories = nativeAdRequest.categories;
        this.postback = nativeAdRequest.postback;
        this.f4345mL = nativeAdRequest.f4345mL;
        this.creativeType = nativeAdRequest.creativeType;
        this.f4346mM = nativeAdRequest.f4346mM;
        this.f4347mN = nativeAdRequest.f4347mN;
    }

    public String getCategories() {
        return this.categories;
    }

    public NativeAdRequest setCategories(String str) {
        this.categories = str;
        return this;
    }

    public String getPostback() {
        return this.postback;
    }

    public NativeAdRequest setPostback(String str) {
        this.postback = str;
        return this;
    }

    public CachingPolicy getCachingPolicy() {
        return this.f4345mL;
    }

    public NativeAdRequest setCachingPolicy(CachingPolicy cachingPolicy) {
        this.f4345mL = cachingPolicy;
        return this;
    }

    public CreativeType getCreativeType() {
        return this.creativeType;
    }

    public NativeAdRequest setCreativeType(CreativeType creativeType2) {
        this.creativeType = creativeType2;
        return this;
    }

    public VideoLength getVideoLength() {
        return this.f4346mM;
    }

    public NativeAdRequest setVideoLength(VideoLength videoLength) {
        this.f4346mM = videoLength;
        return this;
    }

    public VideoQuality getVideoQuality() {
        return this.f4347mN;
    }

    public NativeAdRequest setVideoQuality(VideoQuality videoQuality) {
        this.f4347mN = videoQuality;
        return this;
    }

    public NativeAdRequest setMaxVideoLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Max Length must be higher than 0");
        } else if (i <= 0 || getMinVideoLength() <= 0 || i >= getMinVideoLength()) {
            this.maxVideoLength = i;
            return this;
        } else {
            throw new IllegalArgumentException("Max Length cannot be lower than min length");
        }
    }

    public int getMaxVideoLength() {
        return this.maxVideoLength;
    }

    public NativeAdRequest setMinVideoLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Min Length must be higher than 0");
        } else if (i <= 0 || getMaxVideoLength() <= 0 || i <= getMaxVideoLength()) {
            this.minVideoLength = i;
            return this;
        } else {
            throw new IllegalArgumentException("Min Length cannot be higher than max length");
        }
    }

    public int getMinVideoLength() {
        return this.minVideoLength;
    }
}
