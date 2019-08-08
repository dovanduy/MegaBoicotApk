package com.google.android.exoplayer2.p133ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.support.p017v4.app.C0301u.C0304b;
import android.support.p017v4.app.C0301u.C0305c;
import android.support.p017v4.app.C0301u.C0306d;

/* renamed from: com.google.android.exoplayer2.ui.DownloadNotificationUtil */
public final class DownloadNotificationUtil {
    private static final int NULL_STRING_ID = 0;

    private DownloadNotificationUtil() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Notification buildProgressNotification(android.content.Context r17, int r18, java.lang.String r19, android.app.PendingIntent r20, java.lang.String r21, com.google.android.exoplayer2.offline.DownloadManager.TaskState[] r22) {
        /*
            r0 = r22
            r1 = 1
            r2 = 0
            r3 = 0
            int r4 = r0.length
            r10 = r1
            r5 = r2
            r6 = r5
            r8 = r6
            r9 = r8
            r7 = r3
            r3 = r9
        L_0x000d:
            if (r3 >= r4) goto L_0x0042
            r11 = r0[r3]
            int r12 = r11.state
            if (r12 == r1) goto L_0x001b
            int r12 = r11.state
            r13 = 2
            if (r12 == r13) goto L_0x001b
            goto L_0x003f
        L_0x001b:
            com.google.android.exoplayer2.offline.DownloadAction r12 = r11.action
            boolean r12 = r12.isRemoveAction
            if (r12 == 0) goto L_0x0023
            r6 = r1
            goto L_0x003f
        L_0x0023:
            float r5 = r11.downloadPercentage
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            float r5 = r11.downloadPercentage
            float r7 = r7 + r5
            r10 = r2
        L_0x002f:
            long r11 = r11.downloadedBytes
            r13 = 0
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x0039
            r5 = r1
            goto L_0x003a
        L_0x0039:
            r5 = r2
        L_0x003a:
            r5 = r5 | r8
            int r9 = r9 + 1
            r8 = r5
            r5 = r1
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0042:
            if (r5 == 0) goto L_0x0049
            int r0 = com.google.android.exoplayer2.p133ui.C2933R.string.exo_download_downloading
        L_0x0046:
            r16 = r0
            goto L_0x0050
        L_0x0049:
            if (r6 == 0) goto L_0x004e
            int r0 = com.google.android.exoplayer2.p133ui.C2933R.string.exo_download_removing
            goto L_0x0046
        L_0x004e:
            r16 = r2
        L_0x0050:
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            android.support.v4.app.u$c r0 = newNotificationBuilder(r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x006b
            float r3 = (float) r9
            float r7 = r7 / r3
            int r3 = (int) r7
            if (r10 == 0) goto L_0x0069
            if (r8 == 0) goto L_0x0069
            r4 = r1
            goto L_0x006d
        L_0x0069:
            r4 = r2
            goto L_0x006d
        L_0x006b:
            r4 = r1
            r3 = r2
        L_0x006d:
            r5 = 100
            r0.mo1057a(r5, r3, r4)
            r0.mo1076c(r1)
            r0.mo1067a(r2)
            android.app.Notification r0 = r0.mo1068b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p133ui.DownloadNotificationUtil.buildProgressNotification(android.content.Context, int, java.lang.String, android.app.PendingIntent, java.lang.String, com.google.android.exoplayer2.offline.DownloadManager$TaskState[]):android.app.Notification");
    }

    public static Notification buildDownloadCompletedNotification(Context context, int i, String str, PendingIntent pendingIntent, String str2) {
        return newNotificationBuilder(context, i, str, pendingIntent, str2, C2933R.string.exo_download_completed).mo1068b();
    }

    public static Notification buildDownloadFailedNotification(Context context, int i, String str, PendingIntent pendingIntent, String str2) {
        return newNotificationBuilder(context, i, str, pendingIntent, str2, C2933R.string.exo_download_failed).mo1068b();
    }

    private static C0305c newNotificationBuilder(Context context, int i, String str, PendingIntent pendingIntent, String str2, int i2) {
        C0305c a = new C0305c(context, str).mo1056a(i);
        if (i2 != 0) {
            a.mo1065a((CharSequence) context.getResources().getString(i2));
        }
        if (pendingIntent != null) {
            a.mo1060a(pendingIntent);
        }
        if (str2 != null) {
            a.mo1064a((C0306d) new C0304b().mo1053a((CharSequence) str2));
        }
        return a;
    }
}
