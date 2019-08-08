package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class CacheUtil {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;

    public static class CachingCounters {
        public volatile long alreadyCachedBytes;
        public volatile long contentLength = -1;
        public volatile long newlyCachedBytes;

        public long totalCachedBytes() {
            return this.alreadyCachedBytes + this.newlyCachedBytes;
        }
    }

    public static String generateKey(Uri uri) {
        return uri.toString();
    }

    public static String getKey(DataSpec dataSpec) {
        return dataSpec.key != null ? dataSpec.key : generateKey(dataSpec.uri);
    }

    public static void getCached(DataSpec dataSpec, Cache cache, CachingCounters cachingCounters) {
        long j;
        Cache cache2;
        DataSpec dataSpec2 = dataSpec;
        CachingCounters cachingCounters2 = cachingCounters;
        String key = getKey(dataSpec);
        long j2 = dataSpec2.absoluteStreamPosition;
        if (dataSpec2.length != -1) {
            j = dataSpec2.length;
            cache2 = cache;
        } else {
            cache2 = cache;
            j = cache2.getContentLength(key);
        }
        cachingCounters2.contentLength = j;
        cachingCounters2.alreadyCachedBytes = 0;
        cachingCounters2.newlyCachedBytes = 0;
        long j3 = j2;
        long j4 = j;
        while (j4 != 0) {
            long cachedLength = cache2.getCachedLength(key, j3, j4 != -1 ? j4 : Long.MAX_VALUE);
            if (cachedLength > 0) {
                cachingCounters2.alreadyCachedBytes += cachedLength;
            } else {
                cachedLength = -cachedLength;
                if (cachedLength == Long.MAX_VALUE) {
                    return;
                }
            }
            long j5 = j3 + cachedLength;
            if (j4 == -1) {
                cachedLength = 0;
            }
            j3 = j5;
            j4 -= cachedLength;
        }
    }

    public static void cache(DataSpec dataSpec, Cache cache, DataSource dataSource, CachingCounters cachingCounters, AtomicBoolean atomicBoolean) throws IOException, InterruptedException {
        cache(dataSpec, cache, new CacheDataSource(cache, dataSource), new byte[131072], null, 0, cachingCounters, atomicBoolean, false);
    }

    public static void cache(DataSpec dataSpec, Cache cache, CacheDataSource cacheDataSource, byte[] bArr, PriorityTaskManager priorityTaskManager, int i, CachingCounters cachingCounters, AtomicBoolean atomicBoolean, boolean z) throws IOException, InterruptedException {
        long j;
        DataSpec dataSpec2 = dataSpec;
        Cache cache2 = cache;
        CachingCounters cachingCounters2 = cachingCounters;
        Assertions.checkNotNull(cacheDataSource);
        Assertions.checkNotNull(bArr);
        if (cachingCounters2 != null) {
            getCached(dataSpec2, cache2, cachingCounters2);
        } else {
            cachingCounters2 = new CachingCounters();
        }
        CachingCounters cachingCounters3 = cachingCounters2;
        String key = getKey(dataSpec);
        long j2 = dataSpec2.absoluteStreamPosition;
        long contentLength = dataSpec2.length != -1 ? dataSpec2.length : cache2.getContentLength(key);
        while (contentLength != 0) {
            if (atomicBoolean == null || !atomicBoolean.get()) {
                long cachedLength = cache2.getCachedLength(key, j2, contentLength != -1 ? contentLength : Long.MAX_VALUE);
                if (cachedLength > 0) {
                    j = cachedLength;
                } else {
                    long j3 = -cachedLength;
                    j = j3;
                    if (readAndDiscard(dataSpec2, j2, j3, cacheDataSource, bArr, priorityTaskManager, i, cachingCounters3) < j) {
                        if (z && contentLength != -1) {
                            throw new EOFException();
                        }
                        return;
                    }
                }
                long j4 = j2 + j;
                if (contentLength == -1) {
                    j = 0;
                }
                j2 = j4;
                contentLength -= j;
            } else {
                throw new InterruptedException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r1 = r0;
        com.google.android.exoplayer2.util.Util.closeQuietly(r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1 A[ExcHandler: all (r0v0 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long readAndDiscard(com.google.android.exoplayer2.upstream.DataSpec r21, long r22, long r24, com.google.android.exoplayer2.upstream.DataSource r26, byte[] r27, com.google.android.exoplayer2.util.PriorityTaskManager r28, int r29, com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters r30) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r2 = r26
            r3 = r27
            r4 = r30
            r5 = r21
        L_0x0008:
            if (r28 == 0) goto L_0x000d
            r28.proceed(r29)
        L_0x000d:
            boolean r6 = java.lang.Thread.interrupted()     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
            if (r6 == 0) goto L_0x0019
            java.lang.InterruptedException r6 = new java.lang.InterruptedException     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
            r6.<init>()     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
            throw r6     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
        L_0x0019:
            com.google.android.exoplayer2.upstream.DataSpec r6 = new com.google.android.exoplayer2.upstream.DataSpec     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
            android.net.Uri r8 = r5.uri     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
            byte[] r9 = r5.postBody     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
            long r10 = r5.position     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
            long r12 = r10 + r22
            long r10 = r5.absoluteStreamPosition     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
            long r14 = r12 - r10
            r16 = -1
            java.lang.String r12 = r5.key     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
            int r7 = r5.flags     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
            r18 = r7 | 2
            r7 = r6
            r10 = r22
            r19 = r12
            r12 = r14
            r14 = r16
            r16 = r19
            r17 = r18
            r7.<init>(r8, r9, r10, r12, r14, r16, r17)     // Catch:{ PriorityTooLowException -> 0x00a7, all -> 0x00a1 }
            long r7 = r2.open(r6)     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            long r9 = r4.contentLength     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            r11 = -1
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0054
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x0054
            long r9 = r6.absoluteStreamPosition     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            long r11 = r9 + r7
            r4.contentLength = r11     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
        L_0x0054:
            r7 = 0
        L_0x0056:
            int r5 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r5 == 0) goto L_0x009b
            boolean r5 = java.lang.Thread.interrupted()     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            if (r5 == 0) goto L_0x0066
            java.lang.InterruptedException r5 = new java.lang.InterruptedException     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            r5.<init>()     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            throw r5     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
        L_0x0066:
            r5 = 0
            r9 = -1
            int r11 = (r24 > r9 ? 1 : (r24 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0077
            int r9 = r3.length     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            long r9 = (long) r9     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            long r11 = r24 - r7
            long r9 = java.lang.Math.min(r9, r11)     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            int r9 = (int) r9     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            goto L_0x0078
        L_0x0077:
            int r9 = r3.length     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
        L_0x0078:
            int r5 = r2.read(r3, r5, r9)     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            r9 = -1
            if (r5 != r9) goto L_0x008e
            long r9 = r4.contentLength     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            r11 = -1
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x009b
            long r9 = r6.absoluteStreamPosition     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            long r11 = r9 + r7
            r4.contentLength = r11     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            goto L_0x009b
        L_0x008e:
            r11 = -1
            long r9 = (long) r5     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            long r13 = r7 + r9
            long r7 = r4.newlyCachedBytes     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            long r11 = r7 + r9
            r4.newlyCachedBytes = r11     // Catch:{ PriorityTooLowException -> 0x009f, all -> 0x00a1 }
            r7 = r13
            goto L_0x0056
        L_0x009b:
            com.google.android.exoplayer2.util.Util.closeQuietly(r26)
            return r7
        L_0x009f:
            r5 = r6
            goto L_0x00a7
        L_0x00a1:
            r0 = move-exception
            r1 = r0
            com.google.android.exoplayer2.util.Util.closeQuietly(r26)
            throw r1
        L_0x00a7:
            com.google.android.exoplayer2.util.Util.closeQuietly(r26)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheUtil.readAndDiscard(com.google.android.exoplayer2.upstream.DataSpec, long, long, com.google.android.exoplayer2.upstream.DataSource, byte[], com.google.android.exoplayer2.util.PriorityTaskManager, int, com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters):long");
    }

    public static void remove(Cache cache, String str) {
        for (CacheSpan removeSpan : cache.getCachedSpans(str)) {
            try {
                cache.removeSpan(removeSpan);
            } catch (CacheException unused) {
            }
        }
    }

    private CacheUtil() {
    }
}
