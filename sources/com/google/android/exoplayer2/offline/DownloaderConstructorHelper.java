package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DummyDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.PriorityDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;

public final class DownloaderConstructorHelper {
    private final Cache cache;
    private final Factory cacheReadDataSourceFactory;
    private final DataSink.Factory cacheWriteDataSinkFactory;
    private final PriorityTaskManager priorityTaskManager;
    private final Factory upstreamDataSourceFactory;

    public DownloaderConstructorHelper(Cache cache2, Factory factory) {
        this(cache2, factory, null, null, null);
    }

    public DownloaderConstructorHelper(Cache cache2, Factory factory, Factory factory2, DataSink.Factory factory3, PriorityTaskManager priorityTaskManager2) {
        Assertions.checkNotNull(factory);
        this.cache = cache2;
        this.upstreamDataSourceFactory = factory;
        this.cacheReadDataSourceFactory = factory2;
        this.cacheWriteDataSinkFactory = factory3;
        this.priorityTaskManager = priorityTaskManager2;
    }

    public Cache getCache() {
        return this.cache;
    }

    public PriorityTaskManager getPriorityTaskManager() {
        return this.priorityTaskManager != null ? this.priorityTaskManager : new PriorityTaskManager();
    }

    public CacheDataSource buildCacheDataSource(boolean z) {
        DataSource createDataSource = this.cacheReadDataSourceFactory != null ? this.cacheReadDataSourceFactory.createDataSource() : new FileDataSource();
        if (z) {
            CacheDataSource cacheDataSource = new CacheDataSource(this.cache, DummyDataSource.INSTANCE, createDataSource, null, 1, null);
            return cacheDataSource;
        }
        DataSink createDataSink = this.cacheWriteDataSinkFactory != null ? this.cacheWriteDataSinkFactory.createDataSink() : new CacheDataSink(this.cache, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
        DataSource createDataSource2 = this.upstreamDataSourceFactory.createDataSource();
        CacheDataSource cacheDataSource2 = new CacheDataSource(this.cache, this.priorityTaskManager == null ? createDataSource2 : new PriorityDataSource(createDataSource2, this.priorityTaskManager, -1000), createDataSource, createDataSink, 1, null);
        return cacheDataSource2;
    }
}
