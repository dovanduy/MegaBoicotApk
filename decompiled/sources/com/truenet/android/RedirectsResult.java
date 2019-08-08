package com.truenet.android;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.p003b.p005b.C0032h;

public final class RedirectsResult {
    @NotNull
    private final List<String> cookies;
    private final long loadTime;
    private final int response;
    @NotNull
    private final String url;

    public RedirectsResult(@NotNull String str, long j, int i, @NotNull List<String> list) {
        C0032h.m45b(str, "url");
        C0032h.m45b(list, "cookies");
        this.url = str;
        this.loadTime = j;
        this.response = i;
        this.cookies = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r8v0, types: [java.util.List] */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.truenet.android.RedirectsResult copy$default(com.truenet.android.RedirectsResult r3, java.lang.String r4, long r5, int r7, java.util.List<java.lang.String> r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = r3.url
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            long r5 = r3.loadTime
        L_0x000c:
            r0 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            int r7 = r3.response
        L_0x0013:
            r10 = r7
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            java.util.List<java.lang.String> r8 = r3.cookies
        L_0x001a:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r0
            r9 = r10
            r10 = r2
            com.truenet.android.RedirectsResult r3 = r5.copy(r6, r7, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truenet.android.RedirectsResult.copy$default(com.truenet.android.RedirectsResult, java.lang.String, long, int, java.util.List, int, java.lang.Object):com.truenet.android.RedirectsResult");
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    public final long component2() {
        return this.loadTime;
    }

    public final int component3() {
        return this.response;
    }

    @NotNull
    public final List<String> component4() {
        return this.cookies;
    }

    @NotNull
    public final RedirectsResult copy(@NotNull String str, long j, int i, @NotNull List<String> list) {
        C0032h.m45b(str, "url");
        C0032h.m45b(list, "cookies");
        RedirectsResult redirectsResult = new RedirectsResult(str, j, i, list);
        return redirectsResult;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RedirectsResult) {
            RedirectsResult redirectsResult = (RedirectsResult) obj;
            if (C0032h.m44a((Object) this.url, (Object) redirectsResult.url)) {
                if (this.loadTime == redirectsResult.loadTime) {
                    return (this.response == redirectsResult.response) && C0032h.m44a((Object) this.cookies, (Object) redirectsResult.cookies);
                }
            }
        }
    }

    @NotNull
    public final List<String> getCookies() {
        return this.cookies;
    }

    public final long getLoadTime() {
        return this.loadTime;
    }

    public final int getResponse() {
        return this.response;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.loadTime;
        int i2 = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.response) * 31;
        List<String> list = this.cookies;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RedirectsResult(url=");
        sb.append(this.url);
        sb.append(", loadTime=");
        sb.append(this.loadTime);
        sb.append(", response=");
        sb.append(this.response);
        sb.append(", cookies=");
        sb.append(this.cookies);
        sb.append(")");
        return sb.toString();
    }
}
