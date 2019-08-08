package mega.boicot;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.app.Fragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.ProgressBar;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class t_rss_fr extends Fragment {

    /* renamed from: a */
    config f20670a;

    /* renamed from: b */
    Bundle f20671b;

    /* renamed from: c */
    int f20672c;

    /* renamed from: d */
    private View f20673d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList<C5728q> f20674e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6030p f20675f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f20676g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public SharedPreferences f20677h;

    /* renamed from: mega.boicot.t_rss_fr$a */
    private class C6209a extends AsyncTask<String, Integer, ArrayList<C5728q>> {

        /* renamed from: a */
        ProgressBar f20679a;

        private C6209a() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(t_rss_fr.this.f20676g);
            if (config.m23844a(sb.toString())) {
                this.f20679a = (ProgressBar) t_rss_fr.this.mo626m().findViewById(R.id.pb_rss_inv);
            } else {
                this.f20679a = (ProgressBar) t_rss_fr.this.mo626m().findViewById(R.id.pb_rss);
            }
            if (VERSION.SDK_INT > 20) {
                config.m23838a(this.f20679a, t_rss_fr.this.f20670a.f17890aW);
            }
            this.f20679a.setVisibility(0);
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
        /* renamed from: a */
        public void onPostExecute(ArrayList<C5728q> arrayList) {
            if (arrayList != null) {
                boolean z = false;
                for (int i = 0; i < arrayList.size(); i++) {
                    t_rss_fr.this.f20674e.add(arrayList.get(i));
                    if (((C5728q) arrayList.get(i)).f18487a != null) {
                        z = true;
                    }
                }
                if (!z || !t_rss_fr.this.f20670a.f17971bz[t_rss_fr.this.f20672c].f18240K) {
                    t_rss_fr.this.f20675f.f19950e = false;
                }
                if (!t_rss_fr.this.f20670a.f17971bz[t_rss_fr.this.f20672c].f18241L) {
                    t_rss_fr.this.f20675f.f19951f = false;
                }
                t_rss_fr.this.f20675f.notifyDataSetChanged();
                if (arrayList.size() > 0 && ((C5728q) arrayList.get(0)).f18492f != null && !((C5728q) arrayList.get(0)).f18492f.equals("")) {
                    Editor edit = t_rss_fr.this.f20677h.edit();
                    StringBuilder sb = new StringBuilder();
                    sb.append("rss_");
                    sb.append(t_rss_fr.this.f20670a.f17971bz[t_rss_fr.this.f20672c].f18330w);
                    sb.append("_ultpost");
                    edit.putString(sb.toString(), ((C5728q) arrayList.get(0)).f18492f);
                    edit.commit();
                }
            }
            try {
                this.f20679a.setVisibility(8);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public View mo555a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20670a = (config) mo626m().getApplicationContext();
        if (this.f20670a.f17881aN == null) {
            this.f20670a.mo20780b();
        }
        this.f20677h = mo626m().getSharedPreferences("sh", 0);
        this.f20671b = mo626m().getIntent().getExtras();
        this.f20672c = this.f20671b.getInt("ind");
        this.f20673d = layoutInflater.inflate(R.layout.t_rss, viewGroup, false);
        ListView listView = (ListView) this.f20673d.findViewById(R.id.postListView);
        listView.setCacheColorHint(0);
        this.f20676g = this.f20670a.f17971bz[this.f20672c].f18314g;
        String str = this.f20670a.f17971bz[this.f20672c].f18315h;
        String str2 = this.f20670a.f17971bz[this.f20672c].f18323p;
        String str3 = this.f20670a.f17971bz[this.f20672c].f18324q;
        if (!this.f20676g.equals("") && !this.f20676g.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f20676g);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(str);
            listView.setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb.toString()), Color.parseColor(sb2.toString())}));
        }
        this.f20674e = new ArrayList<>();
        this.f20675f = new C6030p(this.f20673d.getContext(), R.layout.rss_item, this.f20674e);
        if (!str2.equals("")) {
            C6030p pVar = this.f20675f;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(str2);
            pVar.f19952g = Integer.valueOf(Color.parseColor(sb3.toString()));
        }
        if (!str3.equals("")) {
            C6030p pVar2 = this.f20675f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(str3);
            pVar2.f19953h = Integer.valueOf(Color.parseColor(sb4.toString()));
        }
        this.f20675f.f19948c = mo628n().getDrawable(R.drawable.item_sel);
        this.f20675f.f19948c.setColorFilter(Color.parseColor("#FFFFFFFF"), Mode.MULTIPLY);
        listView.setAdapter(this.f20675f);
        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                t_rss_fr.this.f20675f.f19947b = i;
                t_rss_fr.this.f20675f.notifyDataSetChanged();
                ((t_rss) t_rss_fr.this.mo626m()).mo21352a(((C5728q) t_rss_fr.this.f20674e.get(i)).f18492f);
            }
        });
        return this.f20673d;
    }

    @TargetApi(13)
    /* renamed from: d */
    public void mo598d(Bundle bundle) {
        int i;
        super.mo598d(bundle);
        new C6209a().execute(new String[]{this.f20670a.f17971bz[this.f20672c].f18312e});
        this.f20675f.f19949d = false;
        Display defaultDisplay = mo626m().getWindowManager().getDefaultDisplay();
        if (VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
        } else {
            i = defaultDisplay.getWidth();
        }
        if (!((t_rss) mo626m()).f19261n && i > ((int) ((500.0f * mo628n().getDisplayMetrics().density) + 0.5f))) {
            this.f20675f.f19949d = true;
        }
    }
}
