package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public abstract class afu<K, V> {

    /* renamed from: a */
    private static final String f10765a = "afu";

    /* renamed from: b */
    protected static <K, V> HashMap<K, V> m14030b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
            }
        } catch (IOException | ClassNotFoundException unused) {
            Log.d(f10765a, "decode object failure");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract HashMap<K, V> mo14271a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14272a(String str);

    public String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(mo14271a());
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException unused) {
            return null;
        }
    }
}
