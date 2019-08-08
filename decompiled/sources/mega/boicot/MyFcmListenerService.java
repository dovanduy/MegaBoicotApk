package mega.boicot;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import android.support.p017v4.app.C0301u.C0305c;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.io.FileInputStream;

public class MyFcmListenerService extends FirebaseMessagingService {
    /* renamed from: a */
    public void mo17990a(RemoteMessage remoteMessage) {
        Bitmap bitmap;
        C0305c cVar;
        String str = (String) remoteMessage.mo17994a().get("message");
        if (str != null) {
            String replace = str.replace("@EURO@", "€");
            String[] split = replace.split(";");
            if (split.length < 3) {
                String replace2 = replace.replace("@x@", ";");
                int length = replace2.split("@").length;
                if (length == 8 || length == 5 || length == 9 || length == 12 || length == 13 || length == 7) {
                    config.m23849b((Context) this, replace2);
                }
            } else if (split[1].equals("0") || split[1].equals("1") || split[1].equals("2") || split[1].equals("3")) {
                SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
                Editor edit = sharedPreferences.edit();
                if (split[1].equals("3")) {
                    String str2 = split[4];
                    if (!sharedPreferences.getString("mensajechat_ult", "").equals(str2) || System.currentTimeMillis() - sharedPreferences.getLong("fchat_ult", System.currentTimeMillis()) >= DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
                        edit.putLong("fchat_ult", System.currentTimeMillis());
                        edit.putString("mensajechat_ult", str2);
                        String string = sharedPreferences.getString("conv", "");
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append("@0@");
                        sb.append(split[4].replace("@x@", ";"));
                        edit.putString("conv", sb.toString());
                        edit.commit();
                    } else {
                        return;
                    }
                }
                if (!split[1].equals("3") || !sharedPreferences.getBoolean("activa", false)) {
                    try {
                        FileInputStream openFileInput = openFileInput("icohome");
                        bitmap = BitmapFactory.decodeFileDescriptor(openFileInput.getFD());
                        try {
                            openFileInput.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        bitmap = null;
                    }
                    if (VERSION.SDK_INT >= 26) {
                        cVar = new C0305c(this, config.m23850c((Context) this, 1).getId());
                    } else {
                        cVar = new C0305c(this);
                    }
                    C0305c cVar2 = cVar;
                    cVar2.mo1056a((int) R.drawable.notif).mo1065a((CharSequence) split[2].replace("@x@", ";")).mo1071b((CharSequence) split[3].replace("@x@", ";")).mo1082e(true).mo1061a(bitmap);
                    cVar2.mo1069b(5);
                    Intent intent = new Intent(this, preinicio.class);
                    if (VERSION.SDK_INT >= 11) {
                        intent.setFlags(268468224);
                    }
                    intent.putExtra("notif_id", split[0]);
                    intent.putExtra("notif_tipo", split[1]);
                    intent.putExtra("notif_idelem", split[4].replace("@x@", ";"));
                    int i = sharedPreferences.getInt("numnotif", 20);
                    if (split[5].equals("0")) {
                        i++;
                        if (i > 99) {
                            i = 20;
                        }
                        edit.putInt("numnotif", i);
                        edit.commit();
                    }
                    int i2 = i;
                    String replace3 = split[2].replace("@x@", ";");
                    String replace4 = split[3].replace("@x@", ";");
                    config.m23825a((Context) this, replace3, replace4, intent, i2, 1, "0", "0");
                    cVar2.mo1060a(PendingIntent.getActivity(this, i2, intent, 134217728));
                    ((NotificationManager) getSystemService("notification")).notify(i2, cVar2.mo1068b());
                } else {
                    edit.putString("f_id", "0");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(config.f17840h);
                    sb2.append("");
                    edit.putString("f_idfrase", sb2.toString());
                    edit.putString("f_frase", split[4].replace("@x@", ";"));
                    config.f17840h++;
                    edit.commit();
                }
            }
        }
    }
}
