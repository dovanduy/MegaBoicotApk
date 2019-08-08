package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.internal.ads.C4300xc.C4302b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.ads.tu */
public final class C4186tu<P> {

    /* renamed from: a */
    private static final Charset f14081a = Charset.forName(C2793C.UTF8_NAME);

    /* renamed from: b */
    private ConcurrentMap<String, List<C4187tv<P>>> f14082b = new ConcurrentHashMap();

    /* renamed from: c */
    private C4187tv<P> f14083c;

    /* renamed from: a */
    public final C4187tv<P> mo16089a() {
        return this.f14083c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4187tv<P> mo16090a(P p, C4302b bVar) throws GeneralSecurityException {
        byte[] bArr;
        byte b;
        ByteBuffer byteBuffer;
        switch (bVar.mo16190e()) {
            case LEGACY:
            case CRUNCHY:
                byteBuffer = ByteBuffer.allocate(5);
                b = 0;
                break;
            case TINK:
                byteBuffer = ByteBuffer.allocate(5);
                b = 1;
                break;
            case RAW:
                bArr = C4176tk.f14077a;
                break;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
        bArr = byteBuffer.put(b).putInt(bVar.mo16189d()).array();
        C4187tv<P> tvVar = new C4187tv<>(p, bArr, bVar.mo16188c(), bVar.mo16190e());
        ArrayList arrayList = new ArrayList();
        arrayList.add(tvVar);
        String str = new String(tvVar.mo16093b(), f14081a);
        List list = (List) this.f14082b.put(str, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(tvVar);
            this.f14082b.put(str, Collections.unmodifiableList(arrayList2));
        }
        return tvVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16091a(C4187tv<P> tvVar) {
        this.f14083c = tvVar;
    }
}
