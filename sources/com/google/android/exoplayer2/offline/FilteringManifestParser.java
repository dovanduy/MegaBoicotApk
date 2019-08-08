package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class FilteringManifestParser<T extends FilterableManifest<T, K>, K> implements Parser<T> {
    private final Parser<T> parser;
    private final List<K> trackKeys;

    public FilteringManifestParser(Parser<T> parser2, List<K> list) {
        this.parser = parser2;
        this.trackKeys = list;
    }

    public T parse(Uri uri, InputStream inputStream) throws IOException {
        T t = (FilterableManifest) this.parser.parse(uri, inputStream);
        return (this.trackKeys == null || this.trackKeys.isEmpty()) ? t : (FilterableManifest) t.copy(this.trackKeys);
    }
}
