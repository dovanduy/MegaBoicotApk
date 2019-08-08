package org.apache.p199a.p218f.p224f;

import java.io.IOException;
import java.net.Socket;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.f.f.o */
/* compiled from: SocketOutputBuffer */
public class C6496o extends C6485d {
    public C6496o(Socket socket, int i, C6531d dVar) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        if (i < 0) {
            i = socket.getSendBufferSize();
        }
        if (i < 1024) {
            i = 1024;
        }
        mo22865a(socket.getOutputStream(), i, dVar);
    }
}
