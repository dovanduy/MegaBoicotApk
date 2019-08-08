package com.truenet.android;

import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.p196c.C5548f;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.p003b.p005b.C0032h;

public final class ValidationResult {
    @NotNull
    private final String error;
    @NotNull
    private final String instanceId;
    @NotNull
    private final String lastHtml;
    @NotNull
    private final String lastImage;
    @NotNull
    private final String lastUrl;
    @NotNull
    private final String metaData;
    private final int numOfRedirect;
    @NotNull
    private final String publisherId;
    @NotNull
    @C5548f(mo20535b = ArrayList.class, mo20536c = RedirectsResult.class)
    private final List<RedirectsResult> redirectUrls;
    private final long sessionTime;

    public ValidationResult(@NotNull String str, int i, long j, @NotNull List<RedirectsResult> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        C0032h.m45b(str, "instanceId");
        C0032h.m45b(list, "redirectUrls");
        C0032h.m45b(str2, "lastUrl");
        C0032h.m45b(str3, "lastHtml");
        C0032h.m45b(str4, "lastImage");
        C0032h.m45b(str5, "publisherId");
        C0032h.m45b(str6, "error");
        C0032h.m45b(str7, MetaData.KEY_METADATA);
        this.instanceId = str;
        this.numOfRedirect = i;
        this.sessionTime = j;
        this.redirectUrls = list;
        this.lastUrl = str2;
        this.lastHtml = str3;
        this.lastImage = str4;
        this.publisherId = str5;
        this.error = str6;
        this.metaData = str7;
    }

    @NotNull
    public static /* synthetic */ ValidationResult copy$default(ValidationResult validationResult, String str, int i, long j, List list, String str2, String str3, String str4, String str5, String str6, String str7, int i2, Object obj) {
        ValidationResult validationResult2 = validationResult;
        int i3 = i2;
        return validationResult2.copy((i3 & 1) != 0 ? validationResult2.instanceId : str, (i3 & 2) != 0 ? validationResult2.numOfRedirect : i, (i3 & 4) != 0 ? validationResult2.sessionTime : j, (i3 & 8) != 0 ? validationResult2.redirectUrls : list, (i3 & 16) != 0 ? validationResult2.lastUrl : str2, (i3 & 32) != 0 ? validationResult2.lastHtml : str3, (i3 & 64) != 0 ? validationResult2.lastImage : str4, (i3 & 128) != 0 ? validationResult2.publisherId : str5, (i3 & 256) != 0 ? validationResult2.error : str6, (i3 & 512) != 0 ? validationResult2.metaData : str7);
    }

    @NotNull
    public final String component1() {
        return this.instanceId;
    }

    @NotNull
    public final String component10() {
        return this.metaData;
    }

    public final int component2() {
        return this.numOfRedirect;
    }

    public final long component3() {
        return this.sessionTime;
    }

    @NotNull
    public final List<RedirectsResult> component4() {
        return this.redirectUrls;
    }

    @NotNull
    public final String component5() {
        return this.lastUrl;
    }

    @NotNull
    public final String component6() {
        return this.lastHtml;
    }

    @NotNull
    public final String component7() {
        return this.lastImage;
    }

    @NotNull
    public final String component8() {
        return this.publisherId;
    }

    @NotNull
    public final String component9() {
        return this.error;
    }

    @NotNull
    public final ValidationResult copy(@NotNull String str, int i, long j, @NotNull List<RedirectsResult> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        String str8 = str;
        C0032h.m45b(str8, "instanceId");
        List<RedirectsResult> list2 = list;
        C0032h.m45b(list2, "redirectUrls");
        String str9 = str2;
        C0032h.m45b(str9, "lastUrl");
        String str10 = str3;
        C0032h.m45b(str10, "lastHtml");
        String str11 = str4;
        C0032h.m45b(str11, "lastImage");
        String str12 = str5;
        C0032h.m45b(str12, "publisherId");
        String str13 = str6;
        C0032h.m45b(str13, "error");
        String str14 = str7;
        C0032h.m45b(str14, MetaData.KEY_METADATA);
        ValidationResult validationResult = new ValidationResult(str8, i, j, list2, str9, str10, str11, str12, str13, str14);
        return validationResult;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidationResult) {
            ValidationResult validationResult = (ValidationResult) obj;
            if (C0032h.m44a((Object) this.instanceId, (Object) validationResult.instanceId)) {
                if (this.numOfRedirect == validationResult.numOfRedirect) {
                    return ((this.sessionTime > validationResult.sessionTime ? 1 : (this.sessionTime == validationResult.sessionTime ? 0 : -1)) == 0) && C0032h.m44a((Object) this.redirectUrls, (Object) validationResult.redirectUrls) && C0032h.m44a((Object) this.lastUrl, (Object) validationResult.lastUrl) && C0032h.m44a((Object) this.lastHtml, (Object) validationResult.lastHtml) && C0032h.m44a((Object) this.lastImage, (Object) validationResult.lastImage) && C0032h.m44a((Object) this.publisherId, (Object) validationResult.publisherId) && C0032h.m44a((Object) this.error, (Object) validationResult.error) && C0032h.m44a((Object) this.metaData, (Object) validationResult.metaData);
                }
            }
        }
    }

    @NotNull
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final String getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    public final String getLastHtml() {
        return this.lastHtml;
    }

    @NotNull
    public final String getLastImage() {
        return this.lastImage;
    }

    @NotNull
    public final String getLastUrl() {
        return this.lastUrl;
    }

    @NotNull
    public final String getMetaData() {
        return this.metaData;
    }

    public final int getNumOfRedirect() {
        return this.numOfRedirect;
    }

    @NotNull
    public final String getPublisherId() {
        return this.publisherId;
    }

    @NotNull
    public final List<RedirectsResult> getRedirectUrls() {
        return this.redirectUrls;
    }

    public final long getSessionTime() {
        return this.sessionTime;
    }

    public int hashCode() {
        String str = this.instanceId;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.numOfRedirect) * 31;
        long j = this.sessionTime;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        List<RedirectsResult> list = this.redirectUrls;
        int hashCode2 = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.lastUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.lastHtml;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.lastImage;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.publisherId;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.error;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.metaData;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ValidationResult(instanceId=");
        sb.append(this.instanceId);
        sb.append(", numOfRedirect=");
        sb.append(this.numOfRedirect);
        sb.append(", sessionTime=");
        sb.append(this.sessionTime);
        sb.append(", redirectUrls=");
        sb.append(this.redirectUrls);
        sb.append(", lastUrl=");
        sb.append(this.lastUrl);
        sb.append(", lastHtml=");
        sb.append(this.lastHtml);
        sb.append(", lastImage=");
        sb.append(this.lastImage);
        sb.append(", publisherId=");
        sb.append(this.publisherId);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", metaData=");
        sb.append(this.metaData);
        sb.append(")");
        return sb.toString();
    }
}
