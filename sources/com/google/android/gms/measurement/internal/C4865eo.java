package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.google.android.gms.measurement.internal.eo */
final class C4865eo extends SSLSocket {

    /* renamed from: a */
    private final SSLSocket f15824a;

    C4865eo(C4863em emVar, SSLSocket sSLSocket) {
        this.f15824a = sSLSocket;
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f15824a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f15824a.setEnabledProtocols(strArr);
    }

    public final String[] getSupportedCipherSuites() {
        return this.f15824a.getSupportedCipherSuites();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f15824a.getEnabledCipherSuites();
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f15824a.setEnabledCipherSuites(strArr);
    }

    public final String[] getSupportedProtocols() {
        return this.f15824a.getSupportedProtocols();
    }

    public final String[] getEnabledProtocols() {
        return this.f15824a.getEnabledProtocols();
    }

    public final SSLSession getSession() {
        return this.f15824a.getSession();
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f15824a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f15824a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void startHandshake() throws IOException {
        this.f15824a.startHandshake();
    }

    public final void setUseClientMode(boolean z) {
        this.f15824a.setUseClientMode(z);
    }

    public final boolean getUseClientMode() {
        return this.f15824a.getUseClientMode();
    }

    public final void setNeedClientAuth(boolean z) {
        this.f15824a.setNeedClientAuth(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f15824a.setWantClientAuth(z);
    }

    public final boolean getNeedClientAuth() {
        return this.f15824a.getNeedClientAuth();
    }

    public final boolean getWantClientAuth() {
        return this.f15824a.getWantClientAuth();
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f15824a.setEnableSessionCreation(z);
    }

    public final boolean getEnableSessionCreation() {
        return this.f15824a.getEnableSessionCreation();
    }

    public final void bind(SocketAddress socketAddress) throws IOException {
        this.f15824a.bind(socketAddress);
    }

    public final synchronized void close() throws IOException {
        this.f15824a.close();
    }

    public final void connect(SocketAddress socketAddress) throws IOException {
        this.f15824a.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.f15824a.connect(socketAddress, i);
    }

    public final SocketChannel getChannel() {
        return this.f15824a.getChannel();
    }

    public final InetAddress getInetAddress() {
        return this.f15824a.getInetAddress();
    }

    public final InputStream getInputStream() throws IOException {
        return this.f15824a.getInputStream();
    }

    public final boolean getKeepAlive() throws SocketException {
        return this.f15824a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f15824a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f15824a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f15824a.getLocalSocketAddress();
    }

    public final boolean getOOBInline() throws SocketException {
        return this.f15824a.getOOBInline();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.f15824a.getOutputStream();
    }

    public final int getPort() {
        return this.f15824a.getPort();
    }

    public final synchronized int getReceiveBufferSize() throws SocketException {
        return this.f15824a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f15824a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() throws SocketException {
        return this.f15824a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() throws SocketException {
        return this.f15824a.getSendBufferSize();
    }

    public final int getSoLinger() throws SocketException {
        return this.f15824a.getSoLinger();
    }

    public final synchronized int getSoTimeout() throws SocketException {
        return this.f15824a.getSoTimeout();
    }

    public final boolean getTcpNoDelay() throws SocketException {
        return this.f15824a.getTcpNoDelay();
    }

    public final int getTrafficClass() throws SocketException {
        return this.f15824a.getTrafficClass();
    }

    public final boolean isBound() {
        return this.f15824a.isBound();
    }

    public final boolean isClosed() {
        return this.f15824a.isClosed();
    }

    public final boolean isConnected() {
        return this.f15824a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f15824a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f15824a.isOutputShutdown();
    }

    public final void sendUrgentData(int i) throws IOException {
        this.f15824a.sendUrgentData(i);
    }

    public final void setKeepAlive(boolean z) throws SocketException {
        this.f15824a.setKeepAlive(z);
    }

    public final void setOOBInline(boolean z) throws SocketException {
        this.f15824a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f15824a.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) throws SocketException {
        this.f15824a.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) throws SocketException {
        this.f15824a.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) throws SocketException {
        this.f15824a.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) throws SocketException {
        this.f15824a.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) throws SocketException {
        this.f15824a.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.f15824a.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) throws SocketException {
        this.f15824a.setTrafficClass(i);
    }

    public final void shutdownInput() throws IOException {
        this.f15824a.shutdownInput();
    }

    public final void shutdownOutput() throws IOException {
        this.f15824a.shutdownOutput();
    }

    public final String toString() {
        return this.f15824a.toString();
    }

    public final boolean equals(Object obj) {
        return this.f15824a.equals(obj);
    }
}
