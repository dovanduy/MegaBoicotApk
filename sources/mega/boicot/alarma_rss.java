package mega.boicot;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;

public class alarma_rss extends BroadcastReceiver {

    /* renamed from: a */
    public SharedPreferences f17726a;

    /* renamed from: mega.boicot.alarma_rss$a */
    private class C5600a extends AsyncTask<String, Integer, ArrayList<C5728q>> {

        /* renamed from: b */
        private String f17728b;

        /* renamed from: c */
        private int f17729c;

        /* renamed from: d */
        private Context f17730d;

        public C5600a(Context context, String str, int i) {
            this.f17730d = context;
            this.f17728b = str;
            this.f17729c = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C5728q> doInBackground(String... strArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                return config.m23832a(httpURLConnection.getInputStream());
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.util.ArrayList<mega.boicot.C5728q> r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L_0x0171
                int r0 = r14.size()
                if (r0 <= 0) goto L_0x0171
                r0 = 0
                java.lang.Object r1 = r14.get(r0)
                mega.boicot.q r1 = (mega.boicot.C5728q) r1
                java.lang.String r1 = r1.f18492f
                if (r1 == 0) goto L_0x0171
                java.lang.Object r1 = r14.get(r0)
                mega.boicot.q r1 = (mega.boicot.C5728q) r1
                java.lang.String r1 = r1.f18492f
                java.lang.String r2 = ""
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0171
                java.lang.Object r1 = r14.get(r0)
                mega.boicot.q r1 = (mega.boicot.C5728q) r1
                java.lang.String r1 = r1.f18492f
                mega.boicot.alarma_rss r2 = mega.boicot.alarma_rss.this
                android.content.SharedPreferences r2 = r2.f17726a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "rss_"
                r3.append(r4)
                java.lang.String r4 = r13.f17728b
                r3.append(r4)
                java.lang.String r4 = "_ultpost"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = ""
                java.lang.String r2 = r2.getString(r3, r4)
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0171
                java.lang.String r1 = ""
                r2 = 1
                android.content.Context r3 = r13.f17730d     // Catch:{ Exception -> 0x00a5 }
                java.lang.String r4 = "sh"
                android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r0)     // Catch:{ Exception -> 0x00a5 }
                java.lang.String r4 = "rss_i"
                int r4 = r3.getInt(r4, r0)     // Catch:{ Exception -> 0x00a5 }
                java.lang.String r5 = "rss_n"
                int r5 = r3.getInt(r5, r0)     // Catch:{ Exception -> 0x00a2 }
                java.lang.String r6 = "rss_t"
                java.lang.String r7 = ""
                java.lang.String r6 = r3.getString(r6, r7)     // Catch:{ Exception -> 0x00a0 }
                android.content.SharedPreferences$Editor r1 = r3.edit()     // Catch:{ Exception -> 0x009e }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009e }
                r3.<init>()     // Catch:{ Exception -> 0x009e }
                java.lang.String r7 = "rss_"
                r3.append(r7)     // Catch:{ Exception -> 0x009e }
                java.lang.String r7 = r13.f17728b     // Catch:{ Exception -> 0x009e }
                r3.append(r7)     // Catch:{ Exception -> 0x009e }
                java.lang.String r7 = "_ultpost"
                r3.append(r7)     // Catch:{ Exception -> 0x009e }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x009e }
                java.lang.Object r7 = r14.get(r0)     // Catch:{ Exception -> 0x009e }
                mega.boicot.q r7 = (mega.boicot.C5728q) r7     // Catch:{ Exception -> 0x009e }
                java.lang.String r7 = r7.f18492f     // Catch:{ Exception -> 0x009e }
                r1.putString(r3, r7)     // Catch:{ Exception -> 0x009e }
                r1.commit()     // Catch:{ Exception -> 0x009e }
                r1 = r2
                goto L_0x00ae
            L_0x009e:
                r1 = move-exception
                goto L_0x00aa
            L_0x00a0:
                r3 = move-exception
                goto L_0x00a8
            L_0x00a2:
                r3 = move-exception
                r5 = r0
                goto L_0x00a8
            L_0x00a5:
                r3 = move-exception
                r4 = r0
                r5 = r4
            L_0x00a8:
                r6 = r1
                r1 = r3
            L_0x00aa:
                r1.printStackTrace()
                r1 = r0
            L_0x00ae:
                if (r1 == 0) goto L_0x0171
                if (r4 <= 0) goto L_0x0171
                java.lang.String r1 = ""
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x0171
                java.lang.String r1 = "notification"
                android.content.Context r3 = r13.f17730d
                java.lang.Object r1 = r3.getSystemService(r1)
                android.app.NotificationManager r1 = (android.app.NotificationManager) r1
                r3 = 0
                android.content.Context r4 = r13.f17730d     // Catch:{ Exception -> 0x00d9 }
                java.lang.String r7 = "icohome"
                java.io.FileInputStream r4 = r4.openFileInput(r7)     // Catch:{ Exception -> 0x00d9 }
                java.io.FileDescriptor r7 = r4.getFD()     // Catch:{ Exception -> 0x00d9 }
                android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeFileDescriptor(r7)     // Catch:{ Exception -> 0x00d9 }
                r4.close()     // Catch:{ Exception -> 0x00da }
                goto L_0x00da
            L_0x00d9:
                r7 = r3
            L_0x00da:
                if (r5 != r2) goto L_0x00de
                r3 = r2
                goto L_0x00df
            L_0x00de:
                r3 = r0
            L_0x00df:
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 26
                if (r4 < r5) goto L_0x00f7
                android.support.v4.app.u$c r4 = new android.support.v4.app.u$c
                android.content.Context r5 = r13.f17730d
                android.content.Context r8 = r13.f17730d
                android.app.NotificationChannel r8 = mega.boicot.config.m23850c(r8, r3)
                java.lang.String r8 = r8.getId()
                r4.<init>(r5, r8)
                goto L_0x00fe
            L_0x00f7:
                android.support.v4.app.u$c r4 = new android.support.v4.app.u$c
                android.content.Context r5 = r13.f17730d
                r4.<init>(r5)
            L_0x00fe:
                r5 = 2131165492(0x7f070134, float:1.7945203E38)
                android.support.v4.app.u$c r5 = r4.mo1056a(r5)
                android.support.v4.app.u$c r5 = r5.mo1065a(r6)
                java.lang.Object r8 = r14.get(r0)
                mega.boicot.q r8 = (mega.boicot.C5728q) r8
                java.lang.String r8 = r8.f18490d
                android.support.v4.app.u$c r5 = r5.mo1071b(r8)
                android.support.v4.app.u$c r5 = r5.mo1082e(r2)
                r5.mo1061a(r7)
                if (r3 != r2) goto L_0x0122
                r2 = 5
                r4.mo1069b(r2)
            L_0x0122:
                android.content.Intent r2 = new android.content.Intent
                android.content.Context r3 = r13.f17730d
                java.lang.Class<mega.boicot.preinicio> r5 = mega.boicot.preinicio.class
                r2.<init>(r3, r5)
                java.lang.String r3 = "notif_id"
                java.lang.String r5 = "0"
                r2.putExtra(r3, r5)
                java.lang.String r3 = "notif_tipo"
                java.lang.String r5 = "1"
                r2.putExtra(r3, r5)
                java.lang.String r3 = "notif_idelem"
                java.lang.String r5 = r13.f17728b
                r2.putExtra(r3, r5)
                android.content.Context r5 = r13.f17730d
                java.lang.Object r14 = r14.get(r0)
                mega.boicot.q r14 = (mega.boicot.C5728q) r14
                java.lang.String r7 = r14.f18490d
                int r14 = r13.f17729c
                r0 = 100
                int r9 = r0 + r14
                r10 = 3
                java.lang.String r11 = "0"
                java.lang.String r12 = "0"
                r8 = r2
                mega.boicot.config.m23825a(r5, r6, r7, r8, r9, r10, r11, r12)
                android.content.Context r14 = r13.f17730d
                int r3 = r13.f17729c
                int r3 = r3 + r0
                r5 = 134217728(0x8000000, float:3.85186E-34)
                android.app.PendingIntent r14 = android.app.PendingIntent.getActivity(r14, r3, r2, r5)
                r4.mo1060a(r14)
                int r14 = r13.f17729c
                int r0 = r0 + r14
                android.app.Notification r14 = r4.mo1068b()
                r1.notify(r0, r14)
            L_0x0171:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.alarma_rss.C5600a.onPostExecute(java.util.ArrayList):void");
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f17726a = context.getSharedPreferences("sh", 0);
        if (System.currentTimeMillis() - this.f17726a.getLong("f_ult_rss", 0) >= 120000) {
            Editor edit = this.f17726a.edit();
            edit.putLong("f_ult_rss", System.currentTimeMillis());
            edit.commit();
            String string = this.f17726a.getString("idseccs", "");
            if (!string.equals("")) {
                String[] split = string.split(",");
                int i = 0;
                for (int i2 = 0; i2 < split.length; i2++) {
                    SharedPreferences sharedPreferences = this.f17726a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("s");
                    sb.append(split[i2]);
                    sb.append("_tipo");
                    if (sharedPreferences.getInt(sb.toString(), 0) == 8) {
                        String str = split[i2];
                        i++;
                        SharedPreferences sharedPreferences2 = this.f17726a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("rss_");
                        sb2.append(str);
                        sb2.append("_ultpost");
                        if (!sharedPreferences2.getString(sb2.toString(), "").equals("")) {
                            SharedPreferences sharedPreferences3 = this.f17726a;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("s");
                            sb3.append(str);
                            sb3.append("_url");
                            String string2 = sharedPreferences3.getString(sb3.toString(), "");
                            if (!string2.equals("")) {
                                new C5600a(context, str, i).execute(new String[]{string2});
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo20719a(Context context, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 1, new Intent(context, alarma_rss.class), 134217728);
        if (i == 0) {
            alarmManager.cancel(broadcast);
            return;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.add(13, 60);
        alarmManager.setInexactRepeating(1, instance.getTimeInMillis(), (long) (3600000 * i), broadcast);
    }
}
