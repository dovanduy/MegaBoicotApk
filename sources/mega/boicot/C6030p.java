package mega.boicot;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: mega.boicot.p */
/* compiled from: rss_adapter */
public class C6030p extends ArrayAdapter<C5728q> {

    /* renamed from: a */
    config f19946a;

    /* renamed from: b */
    protected int f19947b = -1;

    /* renamed from: c */
    protected Drawable f19948c;

    /* renamed from: d */
    protected boolean f19949d = false;

    /* renamed from: e */
    protected boolean f19950e = true;

    /* renamed from: f */
    protected boolean f19951f = true;

    /* renamed from: g */
    Integer f19952g;

    /* renamed from: h */
    Integer f19953h;

    /* renamed from: i */
    private Activity f19954i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ArrayList<C5728q> f19955j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C6030p f19956k;

    /* renamed from: mega.boicot.p$a */
    /* compiled from: rss_adapter */
    private class C6032a extends AsyncTask<Integer, Void, Integer> {
        private C6032a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00b3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.Integer... r11) {
            /*
                r10 = this;
                r0 = 0
                r11 = r11[r0]
                r1 = -1
                java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x00cf }
                mega.boicot.p r3 = mega.boicot.C6030p.this     // Catch:{ IOException -> 0x00cf }
                java.util.ArrayList r3 = r3.f19955j     // Catch:{ IOException -> 0x00cf }
                int r4 = r11.intValue()     // Catch:{ IOException -> 0x00cf }
                java.lang.Object r3 = r3.get(r4)     // Catch:{ IOException -> 0x00cf }
                mega.boicot.q r3 = (mega.boicot.C5728q) r3     // Catch:{ IOException -> 0x00cf }
                java.lang.String r3 = r3.f18487a     // Catch:{ IOException -> 0x00cf }
                java.lang.String r4 = " "
                java.lang.String r5 = "%20"
                java.lang.String r3 = r3.replace(r4, r5)     // Catch:{ IOException -> 0x00cf }
                r2.<init>(r3)     // Catch:{ IOException -> 0x00cf }
                java.net.URLConnection r3 = r2.openConnection()     // Catch:{ IOException -> 0x00cf }
                java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x00cf }
                r4 = 1
                r3.setDoInput(r4)     // Catch:{ IOException -> 0x00cf }
                r5 = 5000(0x1388, float:7.006E-42)
                r3.setConnectTimeout(r5)     // Catch:{ IOException -> 0x00cf }
                r6 = 7000(0x1b58, float:9.809E-42)
                r3.setReadTimeout(r6)     // Catch:{ IOException -> 0x00cf }
                r3.connect()     // Catch:{ IOException -> 0x00cf }
                java.io.InputStream r7 = r3.getInputStream()     // Catch:{ IOException -> 0x00cf }
                android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x00cf }
                r8.<init>()     // Catch:{ IOException -> 0x00cf }
                r8.inJustDecodeBounds = r4     // Catch:{ IOException -> 0x00cf }
                r9 = 0
                android.graphics.BitmapFactory.decodeStream(r7, r9, r8)     // Catch:{ IOException -> 0x00cf }
                r7.close()     // Catch:{ IOException -> 0x00cf }
                r3.disconnect()     // Catch:{ IOException -> 0x00cf }
                int r3 = r8.outWidth     // Catch:{ IOException -> 0x00cf }
                if (r3 != r4) goto L_0x006e
                int r3 = r8.outHeight     // Catch:{ IOException -> 0x00cf }
                if (r3 != r4) goto L_0x006e
                mega.boicot.p r2 = mega.boicot.C6030p.this     // Catch:{ IOException -> 0x00cf }
                java.util.ArrayList r2 = r2.f19955j     // Catch:{ IOException -> 0x00cf }
                int r11 = r11.intValue()     // Catch:{ IOException -> 0x00cf }
                java.lang.Object r11 = r2.get(r11)     // Catch:{ IOException -> 0x00cf }
                mega.boicot.q r11 = (mega.boicot.C5728q) r11     // Catch:{ IOException -> 0x00cf }
                r11.f18487a = r9     // Catch:{ IOException -> 0x00cf }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00cf }
                return r11
            L_0x006e:
                mega.boicot.p r3 = mega.boicot.C6030p.this     // Catch:{ IOException -> 0x00cf }
                mega.boicot.config r3 = r3.f19946a     // Catch:{ IOException -> 0x00cf }
                r3 = 300(0x12c, float:4.2E-43)
                int r3 = mega.boicot.config.m23826a(r8, r3, r3)     // Catch:{ IOException -> 0x00cf }
                r8.inSampleSize = r3     // Catch:{ IOException -> 0x00cf }
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x00cf }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x00cf }
                r2.setDoInput(r4)     // Catch:{ IOException -> 0x00cf }
                r2.setConnectTimeout(r5)     // Catch:{ IOException -> 0x00cf }
                r2.setReadTimeout(r6)     // Catch:{ IOException -> 0x00cf }
                r2.connect()     // Catch:{ IOException -> 0x00cf }
                java.io.InputStream r2 = r2.getInputStream()     // Catch:{ IOException -> 0x00cf }
                r8.inJustDecodeBounds = r0     // Catch:{ IOException -> 0x00cf }
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2, r9, r8)     // Catch:{ IOException -> 0x00cf }
                r2.close()     // Catch:{ IOException -> 0x00cf }
                if (r3 != 0) goto L_0x00a0
                java.lang.Integer r11 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00cf }
                return r11
            L_0x00a0:
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00cf }
                r2.<init>()     // Catch:{ IOException -> 0x00cf }
                android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x00cf }
                r5 = 100
                r3.compress(r4, r5, r2)     // Catch:{ IOException -> 0x00cf }
                byte[] r3 = r2.toByteArray()     // Catch:{ IOException -> 0x00cf }
                r2.close()     // Catch:{ IOException -> 0x00b3 }
            L_0x00b3:
                mega.boicot.p r2 = mega.boicot.C6030p.this     // Catch:{ IOException -> 0x00cf }
                java.util.ArrayList r2 = r2.f19955j     // Catch:{ IOException -> 0x00cf }
                int r11 = r11.intValue()     // Catch:{ IOException -> 0x00cf }
                java.lang.Object r11 = r2.get(r11)     // Catch:{ IOException -> 0x00cf }
                mega.boicot.q r11 = (mega.boicot.C5728q) r11     // Catch:{ IOException -> 0x00cf }
                int r2 = r3.length     // Catch:{ IOException -> 0x00cf }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r3, r0, r2)     // Catch:{ IOException -> 0x00cf }
                r11.f18488b = r2     // Catch:{ IOException -> 0x00cf }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00cf }
                return r11
            L_0x00cf:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.C6030p.C6032a.doInBackground(java.lang.Integer[]):java.lang.Integer");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                C6030p.this.f19956k.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: mega.boicot.p$b */
    /* compiled from: rss_adapter */
    static class C6033b {

        /* renamed from: a */
        TextView f19958a;

        /* renamed from: b */
        TextView f19959b;

        /* renamed from: c */
        ImageView f19960c;

        /* renamed from: d */
        ImageView f19961d;

        /* renamed from: e */
        ImageView f19962e;

        C6033b() {
        }
    }

    public C6030p(Context context, int i, ArrayList<C5728q> arrayList) {
        super(context, i, arrayList);
        this.f19954i = (Activity) context;
        this.f19946a = (config) this.f19954i.getApplicationContext();
        this.f19955j = arrayList;
        this.f19956k = this;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C6033b bVar;
        if (view == null) {
            view = this.f19954i.getLayoutInflater().inflate(R.layout.rss_item, null);
            bVar = new C6033b();
            bVar.f19960c = (ImageView) view.findViewById(R.id.postThumb);
            bVar.f19958a = (TextView) view.findViewById(R.id.postTitleLabel);
            if (this.f19952g != null) {
                bVar.f19958a.setTextColor(this.f19952g.intValue());
            }
            if (VERSION.SDK_INT >= 17 && this.f19954i.getResources().getBoolean(R.bool.es_rtl)) {
                bVar.f19958a.setTextDirection(4);
            }
            bVar.f19959b = (TextView) view.findViewById(R.id.postDateLabel);
            if (this.f19953h != null) {
                bVar.f19959b.setTextColor(this.f19953h.intValue());
            }
            bVar.f19961d = (ImageView) view.findViewById(R.id.iv_item_sel);
            bVar.f19962e = (ImageView) view.findViewById(R.id.iv_item_der);
            view.setTag(bVar);
        } else {
            bVar = (C6033b) view.getTag();
        }
        if (!this.f19950e) {
            bVar.f19960c.setVisibility(8);
        } else if (((C5728q) this.f19955j.get(i)).f18487a == null) {
            bVar.f19960c.setImageResource(17170445);
        } else if (((C5728q) this.f19955j.get(i)).f18488b == null) {
            bVar.f19960c.setImageResource(R.drawable.loader_g);
            if (!((C5728q) this.f19955j.get(i)).f18489c) {
                ((C5728q) this.f19955j.get(i)).f18489c = true;
                new C6032a().execute(new Integer[]{Integer.valueOf(i)});
            }
        } else {
            bVar.f19960c.setImageBitmap(((C5728q) this.f19955j.get(i)).f18488b);
        }
        bVar.f19958a.setText(((C5728q) this.f19955j.get(i)).f18490d);
        if (!this.f19951f || ((C5728q) this.f19955j.get(i)).f18491e == null || ((C5728q) this.f19955j.get(i)).f18491e.equals("")) {
            bVar.f19959b.setVisibility(8);
        } else {
            bVar.f19959b.setText(((C5728q) this.f19955j.get(i)).f18491e);
        }
        if (!this.f19949d) {
            bVar.f19962e.setVisibility(8);
        } else if (i == this.f19947b) {
            bVar.f19961d.setImageDrawable(this.f19948c);
            bVar.f19961d.setVisibility(0);
        } else {
            bVar.f19961d.setVisibility(8);
        }
        return view;
    }
}
