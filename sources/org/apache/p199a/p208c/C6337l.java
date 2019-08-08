package org.apache.p199a.p208c;

import java.net.ConnectException;
import org.apache.p199a.C6555l;

/* renamed from: org.apache.a.c.l */
/* compiled from: HttpHostConnectException */
public class C6337l extends ConnectException {

    /* renamed from: a */
    private final C6555l f20874a;

    public C6337l(C6555l lVar, ConnectException connectException) {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection to ");
        sb.append(lVar);
        sb.append(" refused");
        super(sb.toString());
        this.f20874a = lVar;
        initCause(connectException);
    }
}
