package org.apache.p199a.p218f.p220b;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: org.apache.a.f.b.p */
/* compiled from: RedirectLocations */
public class C6418p {

    /* renamed from: a */
    private final Set<URI> f21045a = new HashSet();

    /* renamed from: b */
    private final List<URI> f21046b = new ArrayList();

    /* renamed from: a */
    public boolean mo22765a(URI uri) {
        return this.f21045a.contains(uri);
    }

    /* renamed from: b */
    public void mo22766b(URI uri) {
        this.f21045a.add(uri);
        this.f21046b.add(uri);
    }
}
