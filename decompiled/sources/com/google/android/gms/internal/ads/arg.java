package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

final class arg implements Callable<Boolean> {
    arg() {
    }

    public final /* synthetic */ Object call() throws Exception {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
