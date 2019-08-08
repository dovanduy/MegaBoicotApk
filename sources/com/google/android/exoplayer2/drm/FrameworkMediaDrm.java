package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrm.KeyStatus;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.drm.ExoMediaDrm.DefaultKeyStatus;
import com.google.android.exoplayer2.drm.ExoMediaDrm.DefaultProvisionRequest;
import com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener;
import com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener;
import com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@TargetApi(23)
public final class FrameworkMediaDrm implements ExoMediaDrm<FrameworkMediaCrypto> {
    private static final String CENC_SCHEME_MIME_TYPE = "cenc";
    private final MediaDrm mediaDrm;
    private final UUID uuid;

    public static FrameworkMediaDrm newInstance(UUID uuid2) throws UnsupportedDrmException {
        try {
            return new FrameworkMediaDrm(uuid2);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    @SuppressLint({"WrongConstant"})
    private FrameworkMediaDrm(UUID uuid2) throws UnsupportedSchemeException {
        Assertions.checkNotNull(uuid2);
        Assertions.checkArgument(!C2793C.COMMON_PSSH_UUID.equals(uuid2), "Use C.CLEARKEY_UUID instead");
        if (Util.SDK_INT < 27 && C2793C.CLEARKEY_UUID.equals(uuid2)) {
            uuid2 = C2793C.COMMON_PSSH_UUID;
        }
        this.uuid = uuid2;
        this.mediaDrm = new MediaDrm(uuid2);
        if (C2793C.WIDEVINE_UUID.equals(uuid2) && needsForceL3Workaround()) {
            this.mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public void setOnEventListener(final OnEventListener<? super FrameworkMediaCrypto> onEventListener) {
        this.mediaDrm.setOnEventListener(onEventListener == null ? null : new MediaDrm.OnEventListener() {
            public void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                onEventListener.onEvent(FrameworkMediaDrm.this, bArr, i, i2, bArr2);
            }
        });
    }

    public void setOnKeyStatusChangeListener(final OnKeyStatusChangeListener<? super FrameworkMediaCrypto> onKeyStatusChangeListener) {
        if (Util.SDK_INT < 23) {
            throw new UnsupportedOperationException();
        }
        this.mediaDrm.setOnKeyStatusChangeListener(onKeyStatusChangeListener == null ? null : new MediaDrm.OnKeyStatusChangeListener() {
            public void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List<KeyStatus> list, boolean z) {
                ArrayList arrayList = new ArrayList();
                for (KeyStatus keyStatus : list) {
                    arrayList.add(new DefaultKeyStatus(keyStatus.getStatusCode(), keyStatus.getKeyId()));
                }
                onKeyStatusChangeListener.onKeyStatusChange(FrameworkMediaDrm.this, bArr, arrayList, z);
            }
        }, null);
    }

    public byte[] openSession() throws MediaDrmException {
        return this.mediaDrm.openSession();
    }

    public void closeSession(byte[] bArr) {
        this.mediaDrm.closeSession(bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest getKeyRequest(byte[] r8, byte[] r9, java.lang.String r10, int r11, java.util.HashMap<java.lang.String, java.lang.String> r12) throws android.media.NotProvisionedException {
        /*
            r7 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x0010
            java.util.UUID r0 = com.google.android.exoplayer2.C2793C.WIDEVINE_UUID
            java.util.UUID r1 = r7.uuid
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0042
        L_0x0010:
            java.util.UUID r0 = com.google.android.exoplayer2.C2793C.PLAYREADY_UUID
            java.util.UUID r1 = r7.uuid
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "AFTB"
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.MODEL
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "AFTS"
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.MODEL
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "AFTM"
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.MODEL
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004d
        L_0x0042:
            java.util.UUID r0 = r7.uuid
            byte[] r0 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(r9, r0)
            if (r0 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r3 = r0
            goto L_0x004e
        L_0x004d:
            r3 = r9
        L_0x004e:
            int r9 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 26
            if (r9 >= r0) goto L_0x0070
            java.util.UUID r9 = com.google.android.exoplayer2.C2793C.CLEARKEY_UUID
            java.util.UUID r0 = r7.uuid
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0070
            java.lang.String r9 = "video/mp4"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x006e
            java.lang.String r9 = "audio/mp4"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0070
        L_0x006e:
            java.lang.String r10 = "cenc"
        L_0x0070:
            r4 = r10
            android.media.MediaDrm r1 = r7.mediaDrm
            r2 = r8
            r5 = r11
            r6 = r12
            android.media.MediaDrm$KeyRequest r8 = r1.getKeyRequest(r2, r3, r4, r5, r6)
            byte[] r9 = r8.getData()
            java.util.UUID r10 = com.google.android.exoplayer2.C2793C.CLEARKEY_UUID
            java.util.UUID r11 = r7.uuid
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x008c
            byte[] r9 = com.google.android.exoplayer2.drm.ClearKeyUtil.adjustRequestData(r9)
        L_0x008c:
            com.google.android.exoplayer2.drm.ExoMediaDrm$DefaultKeyRequest r10 = new com.google.android.exoplayer2.drm.ExoMediaDrm$DefaultKeyRequest
            java.lang.String r8 = r8.getDefaultUrl()
            r10.<init>(r9, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.FrameworkMediaDrm.getKeyRequest(byte[], byte[], java.lang.String, int, java.util.HashMap):com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest");
    }

    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C2793C.CLEARKEY_UUID.equals(this.uuid)) {
            bArr2 = ClearKeyUtil.adjustResponseData(bArr2);
        }
        return this.mediaDrm.provideKeyResponse(bArr, bArr2);
    }

    public ProvisionRequest getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.mediaDrm.getProvisionRequest();
        return new DefaultProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.mediaDrm.provideProvisionResponse(bArr);
    }

    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    public void release() {
        this.mediaDrm.release();
    }

    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mediaDrm.restoreKeys(bArr, bArr2);
    }

    public String getPropertyString(String str) {
        return this.mediaDrm.getPropertyString(str);
    }

    public byte[] getPropertyByteArray(String str) {
        return this.mediaDrm.getPropertyByteArray(str);
    }

    public void setPropertyString(String str, String str2) {
        this.mediaDrm.setPropertyString(str, str2);
    }

    public void setPropertyByteArray(String str, byte[] bArr) {
        this.mediaDrm.setPropertyByteArray(str, bArr);
    }

    public FrameworkMediaCrypto createMediaCrypto(byte[] bArr) throws MediaCryptoException {
        return new FrameworkMediaCrypto(new MediaCrypto(this.uuid, bArr), Util.SDK_INT < 21 && C2793C.WIDEVINE_UUID.equals(this.uuid) && "L3".equals(getPropertyString("securityLevel")));
    }

    private static boolean needsForceL3Workaround() {
        return "ASUS_Z00AD".equals(Util.MODEL);
    }
}
