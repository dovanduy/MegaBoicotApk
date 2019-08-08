package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4499ch;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.e.cs */
abstract class C4511cs<T extends C4499ch> {

    /* renamed from: a */
    private static final Logger f14838a = Logger.getLogger(C4487ca.class.getName());

    /* renamed from: b */
    private static String f14839b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C4511cs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo16603a();

    /* renamed from: a */
    static <T extends C4499ch> T m19402a(Class<T> cls) {
        String str;
        ClassLoader classLoader = C4511cs.class.getClassLoader();
        if (cls.equals(C4499ch.class)) {
            str = f14839b;
        } else if (!cls.getPackage().equals(C4511cs.class.getPackage())) {
            throw new IllegalArgumentException(cls.getName());
        } else {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        }
        try {
            return (C4499ch) cls.cast(((C4511cs) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo16603a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(C4511cs.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((C4499ch) cls.cast(((C4511cs) it.next()).mo16603a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f14838a;
                    Level level = Level.SEVERE;
                    String str2 = "com.google.protobuf.GeneratedExtensionRegistryLoader";
                    String str3 = "load";
                    String str4 = "Unable to load ";
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C4499ch) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C4499ch) cls.getMethod("combine", new Class[]{Collection.class}).invoke(null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
