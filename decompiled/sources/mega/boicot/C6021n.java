package mega.boicot;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Environment;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;

/* renamed from: mega.boicot.n */
/* compiled from: likes_adapter */
public class C6021n extends ArrayAdapter<C6029o> {

    /* renamed from: a */
    config f19889a;

    /* renamed from: b */
    protected boolean f19890b = true;

    /* renamed from: c */
    File f19891c;

    /* renamed from: d */
    SharedPreferences f19892d;

    /* renamed from: e */
    private Activity f19893e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<C6029o> f19894f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6021n f19895g;

    /* renamed from: h */
    private String f19896h;

    /* renamed from: mega.boicot.n$a */
    /* compiled from: likes_adapter */
    private class C6022a extends AsyncTask<Integer, Void, Integer> {

        /* renamed from: a */
        int f19897a;

        public C6022a(int i) {
            this.f19897a = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x00ac */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.Integer... r7) {
            /*
                r6 = this;
                r7 = -1
                java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x00bb }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bb }
                r1.<init>()     // Catch:{ IOException -> 0x00bb }
                java.lang.String r2 = "http://imgs1.e-droid.net/srv/imgs/usus/"
                r1.append(r2)     // Catch:{ IOException -> 0x00bb }
                mega.boicot.n r2 = mega.boicot.C6021n.this     // Catch:{ IOException -> 0x00bb }
                java.util.ArrayList r2 = r2.f19894f     // Catch:{ IOException -> 0x00bb }
                int r3 = r6.f19897a     // Catch:{ IOException -> 0x00bb }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x00bb }
                mega.boicot.o r2 = (mega.boicot.C6029o) r2     // Catch:{ IOException -> 0x00bb }
                java.lang.String r2 = r2.f19938f     // Catch:{ IOException -> 0x00bb }
                r1.append(r2)     // Catch:{ IOException -> 0x00bb }
                java.lang.String r2 = "_1_p.jpg?v="
                r1.append(r2)     // Catch:{ IOException -> 0x00bb }
                mega.boicot.n r2 = mega.boicot.C6021n.this     // Catch:{ IOException -> 0x00bb }
                java.util.ArrayList r2 = r2.f19894f     // Catch:{ IOException -> 0x00bb }
                int r3 = r6.f19897a     // Catch:{ IOException -> 0x00bb }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x00bb }
                mega.boicot.o r2 = (mega.boicot.C6029o) r2     // Catch:{ IOException -> 0x00bb }
                java.lang.String r2 = r2.f19939g     // Catch:{ IOException -> 0x00bb }
                r1.append(r2)     // Catch:{ IOException -> 0x00bb }
                java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00bb }
                r0.<init>(r1)     // Catch:{ IOException -> 0x00bb }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x00bb }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x00bb }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{ IOException -> 0x00bb }
                r1 = 5000(0x1388, float:7.006E-42)
                r0.setConnectTimeout(r1)     // Catch:{ IOException -> 0x00bb }
                r1 = 7000(0x1b58, float:9.809E-42)
                r0.setReadTimeout(r1)     // Catch:{ IOException -> 0x00bb }
                r0.connect()     // Catch:{ IOException -> 0x00bb }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x00bb }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ OutOfMemoryError -> 0x00b6 }
                r1.close()     // Catch:{ IOException -> 0x00bb }
                r0.disconnect()     // Catch:{ IOException -> 0x00bb }
                if (r2 != 0) goto L_0x006b
                java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00bb }
                return r0
            L_0x006b:
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x00bb }
                mega.boicot.n r1 = mega.boicot.C6021n.this     // Catch:{ IOException -> 0x00bb }
                java.io.File r1 = r1.f19891c     // Catch:{ IOException -> 0x00bb }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bb }
                r3.<init>()     // Catch:{ IOException -> 0x00bb }
                java.lang.String r4 = "fperfil_"
                r3.append(r4)     // Catch:{ IOException -> 0x00bb }
                mega.boicot.n r4 = mega.boicot.C6021n.this     // Catch:{ IOException -> 0x00bb }
                java.util.ArrayList r4 = r4.f19894f     // Catch:{ IOException -> 0x00bb }
                int r5 = r6.f19897a     // Catch:{ IOException -> 0x00bb }
                java.lang.Object r4 = r4.get(r5)     // Catch:{ IOException -> 0x00bb }
                mega.boicot.o r4 = (mega.boicot.C6029o) r4     // Catch:{ IOException -> 0x00bb }
                java.lang.String r4 = r4.f19938f     // Catch:{ IOException -> 0x00bb }
                r3.append(r4)     // Catch:{ IOException -> 0x00bb }
                java.lang.String r4 = ".jpg"
                r3.append(r4)     // Catch:{ IOException -> 0x00bb }
                java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x00bb }
                r0.<init>(r1, r3)     // Catch:{ IOException -> 0x00bb }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00b1, OutOfMemoryError -> 0x00ac }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00b1, OutOfMemoryError -> 0x00ac }
                android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00b1, OutOfMemoryError -> 0x00ac }
                r3 = 90
                r2.compress(r0, r3, r1)     // Catch:{ Exception -> 0x00b1, OutOfMemoryError -> 0x00ac }
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00b1, OutOfMemoryError -> 0x00ac }
                return r0
            L_0x00ac:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00bb }
                return r0
            L_0x00b1:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00bb }
                return r0
            L_0x00b6:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00bb }
                return r0
            L_0x00bb:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.C6021n.C6022a.doInBackground(java.lang.Integer[]):java.lang.Integer");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            ((C6029o) C6021n.this.f19894f.get(this.f19897a)).f19933a = false;
            if (num.intValue() == 0) {
                Editor edit = C6021n.this.f19892d.edit();
                StringBuilder sb = new StringBuilder();
                sb.append("fperfil_");
                sb.append(((C6029o) C6021n.this.f19894f.get(this.f19897a)).f19938f);
                edit.putString(sb.toString(), ((C6029o) C6021n.this.f19894f.get(this.f19897a)).f19939g);
                edit.commit();
                C6021n.this.f19895g.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: mega.boicot.n$b */
    /* compiled from: likes_adapter */
    static class C6023b {

        /* renamed from: a */
        TextView f19899a;

        /* renamed from: b */
        ImageView f19900b;

        /* renamed from: c */
        ImageView f19901c;

        /* renamed from: d */
        LinearLayout f19902d;

        /* renamed from: e */
        LinearLayout f19903e;

        /* renamed from: f */
        FrameLayout f19904f;

        /* renamed from: g */
        ProgressBar f19905g;

        C6023b() {
        }
    }

    public C6021n(Context context, int i, ArrayList<C6029o> arrayList, int i2) {
        super(context, i, arrayList);
        this.f19893e = (Activity) context;
        this.f19889a = (config) this.f19893e.getApplicationContext();
        this.f19894f = arrayList;
        this.f19895g = this;
        this.f19891c = new File(Environment.getExternalStorageDirectory(), context.getPackageName());
        this.f19892d = context.getSharedPreferences("sh", 0);
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append("");
        this.f19896h = sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0168, code lost:
        if (r4.getString(r5.toString(), "0").equals(((mega.boicot.C6029o) r7.f19894f.get(r8)).f19939g) == false) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            if (r9 != 0) goto L_0x0066
            android.app.Activity r9 = r7.f19893e
            android.view.LayoutInflater r9 = r9.getLayoutInflater()
            r10 = 2131361878(0x7f0a0056, float:1.834352E38)
            r0 = 0
            android.view.View r9 = r9.inflate(r10, r0)
            mega.boicot.n$b r10 = new mega.boicot.n$b
            r10.<init>()
            r0 = 2131230978(0x7f080102, float:1.8078024E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r10.f19904f = r0
            r0 = 2131231143(0x7f0801a7, float:1.8078359E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r10.f19905g = r0
            r0 = 2131231142(0x7f0801a6, float:1.8078357E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.f19900b = r0
            r0 = 2131231144(0x7f0801a8, float:1.807836E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f19899a = r0
            r0 = 2131231211(0x7f0801eb, float:1.8078497E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.f19903e = r0
            r0 = 2131231212(0x7f0801ec, float:1.8078499E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.f19902d = r0
            r0 = 2131231141(0x7f0801a5, float:1.8078355E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.f19901c = r0
            r9.setTag(r10)
            goto L_0x006c
        L_0x0066:
            java.lang.Object r10 = r9.getTag()
            mega.boicot.n$b r10 = (mega.boicot.C6021n.C6023b) r10
        L_0x006c:
            java.util.ArrayList<mega.boicot.o> r0 = r7.f19894f
            java.lang.Object r0 = r0.get(r8)
            mega.boicot.o r0 = (mega.boicot.C6029o) r0
            boolean r0 = r0.f19935c
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x0087
            android.widget.LinearLayout r8 = r10.f19902d
            r8.setVisibility(r2)
            android.widget.LinearLayout r8 = r10.f19903e
            r8.setVisibility(r1)
            goto L_0x01c5
        L_0x0087:
            android.widget.ImageView r0 = r10.f19901c
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r10.f19902d
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r10.f19903e
            r0.setVisibility(r2)
            java.util.ArrayList<mega.boicot.o> r0 = r7.f19894f
            java.lang.Object r0 = r0.get(r8)
            mega.boicot.o r0 = (mega.boicot.C6029o) r0
            boolean r0 = r0.f19936d
            if (r0 == 0) goto L_0x00a7
            android.widget.ImageView r0 = r10.f19901c
            r0.setVisibility(r2)
        L_0x00a7:
            boolean r0 = r7.f19890b
            if (r0 != 0) goto L_0x00b2
            android.widget.FrameLayout r0 = r10.f19904f
            r0.setVisibility(r1)
            goto L_0x01b6
        L_0x00b2:
            android.widget.ProgressBar r0 = r10.f19905g
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r10.f19900b
            r0.setVisibility(r2)
            java.util.ArrayList<mega.boicot.o> r0 = r7.f19894f
            java.lang.Object r0 = r0.get(r8)
            mega.boicot.o r0 = (mega.boicot.C6029o) r0
            boolean r0 = r0.f19934b
            if (r0 != 0) goto L_0x00dc
            android.widget.ImageView r0 = r10.f19900b
            android.app.Activity r1 = r7.f19893e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165535(0x7f07015f, float:1.794529E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
            goto L_0x01b6
        L_0x00dc:
            java.util.ArrayList<mega.boicot.o> r0 = r7.f19894f
            java.lang.Object r0 = r0.get(r8)
            mega.boicot.o r0 = (mega.boicot.C6029o) r0
            java.lang.String r0 = r0.f19938f
            java.lang.String r3 = r7.f19896h
            boolean r0 = r0.equals(r3)
            r3 = 1
            if (r0 == 0) goto L_0x00f8
            mega.boicot.config r0 = r7.f19889a
            android.app.Activity r4 = r7.f19893e
            java.io.File r0 = r0.mo20757a(r4, r3)
            goto L_0x011f
        L_0x00f8:
            java.io.File r0 = new java.io.File
            java.io.File r4 = r7.f19891c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "fperfil_"
            r5.append(r6)
            java.util.ArrayList<mega.boicot.o> r6 = r7.f19894f
            java.lang.Object r6 = r6.get(r8)
            mega.boicot.o r6 = (mega.boicot.C6029o) r6
            java.lang.String r6 = r6.f19938f
            r5.append(r6)
            java.lang.String r6 = ".jpg"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.<init>(r4, r5)
        L_0x011f:
            java.util.ArrayList<mega.boicot.o> r4 = r7.f19894f
            java.lang.Object r4 = r4.get(r8)
            mega.boicot.o r4 = (mega.boicot.C6029o) r4
            java.lang.String r4 = r4.f19938f
            java.lang.String r5 = r7.f19896h
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01a4
            boolean r4 = r0.exists()
            if (r4 == 0) goto L_0x016a
            android.content.SharedPreferences r4 = r7.f19892d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "fperfil_"
            r5.append(r6)
            java.util.ArrayList<mega.boicot.o> r6 = r7.f19894f
            java.lang.Object r6 = r6.get(r8)
            mega.boicot.o r6 = (mega.boicot.C6029o) r6
            java.lang.String r6 = r6.f19938f
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "0"
            java.lang.String r4 = r4.getString(r5, r6)
            java.util.ArrayList<mega.boicot.o> r5 = r7.f19894f
            java.lang.Object r5 = r5.get(r8)
            mega.boicot.o r5 = (mega.boicot.C6029o) r5
            java.lang.String r5 = r5.f19939g
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01a4
        L_0x016a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 20
            if (r0 <= r4) goto L_0x0179
            android.widget.ProgressBar r0 = r10.f19905g
            mega.boicot.config r4 = r7.f19889a
            java.lang.String r4 = r4.f17890aW
            mega.boicot.config.m23838a(r0, r4)
        L_0x0179:
            android.widget.ProgressBar r0 = r10.f19905g
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r10.f19900b
            r0.setVisibility(r1)
            java.util.ArrayList<mega.boicot.o> r0 = r7.f19894f
            java.lang.Object r0 = r0.get(r8)
            mega.boicot.o r0 = (mega.boicot.C6029o) r0
            boolean r0 = r0.f19933a
            if (r0 != 0) goto L_0x01b6
            java.util.ArrayList<mega.boicot.o> r0 = r7.f19894f
            java.lang.Object r0 = r0.get(r8)
            mega.boicot.o r0 = (mega.boicot.C6029o) r0
            r0.f19933a = r3
            mega.boicot.n$a r0 = new mega.boicot.n$a
            r0.<init>(r8)
            java.lang.Integer[] r1 = new java.lang.Integer[r2]
            r0.execute(r1)
            goto L_0x01b6
        L_0x01a4:
            android.widget.ImageView r1 = r10.f19900b     // Catch:{ Exception | OutOfMemoryError -> 0x01b6 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception | OutOfMemoryError -> 0x01b6 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01b6 }
            r2 = 2
            android.graphics.Bitmap r0 = mega.boicot.config.m23828a(r0, r2)     // Catch:{ Exception | OutOfMemoryError -> 0x01b6 }
            r1.setImageBitmap(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01b6 }
        L_0x01b6:
            android.widget.TextView r10 = r10.f19899a
            java.util.ArrayList<mega.boicot.o> r0 = r7.f19894f
            java.lang.Object r8 = r0.get(r8)
            mega.boicot.o r8 = (mega.boicot.C6029o) r8
            java.lang.String r8 = r8.f19937e
            r10.setText(r8)
        L_0x01c5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.C6021n.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
