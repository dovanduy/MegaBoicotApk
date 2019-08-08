package mega.boicot;

import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p017v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class t_rssdetalle extends FragmentActivity implements OnClickListener, C5599a {

    /* renamed from: k */
    config f20681k;

    /* renamed from: l */
    boolean f20682l = false;

    /* renamed from: m */
    t_rssdetalle_fr f20683m;

    /* renamed from: n */
    C5602c f20684n;

    /* renamed from: o */
    boolean f20685o = false;

    /* renamed from: p */
    ListView f20686p;

    public void onCreate(Bundle bundle) {
        this.f20681k = (config) getApplicationContext();
        super.onCreate(bundle);
        setContentView(R.layout.rssdetalle_fr);
        mo2636h();
        if (this.f20681k.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_rssdetalle.this.f20682l = false;
                    t_rssdetalle.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_rssdetalle.this.f20685o = false;
                }
            });
        }
        String string = getIntent().getExtras().getString("url");
        this.f20684n = this.f20681k.mo20760a((Context) this, string.contains("youtube.com") || string.contains("youtu.be"));
        this.f20683m = (t_rssdetalle_fr) mo670f().mo865a((int) R.id.rssdetalle_fr);
        this.f20683m.mo22302b(string);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f20683m.mo22301a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onClick(View view) {
        C5662h a = this.f20681k.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f20682l = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f20681k.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            startActivity(a.f18226a);
        }
        if (this.f20682l && !this.f20685o) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2636h() {
        int b = this.f20681k.mo20778b((Context) this);
        if (this.f20681k.f18045dm == 1) {
            this.f20686p = (ListView) findViewById(R.id.left_drawer);
            this.f20681k.mo20771a(this.f20686p);
        } else if (this.f20681k.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f20681k.f17971bz.length; i2++) {
                if (!this.f20681k.f17971bz[i2].f18333z) {
                    findViewById(i2).setOnClickListener(this);
                    i++;
                    if (i == b) {
                        break;
                    }
                }
            }
            if (findViewById(R.id.idaux9999) != null && findViewById(R.id.idaux9999).getVisibility() == 0) {
                findViewById(R.id.idaux9999).setOnClickListener(this);
            }
        }
        for (int i3 = 0; i3 < this.f20681k.f17923bD.length; i3++) {
            if (this.f20681k.f17923bD[i3] > 0) {
                findViewById(this.f20681k.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f20681k.f18080q == 0) {
            return false;
        }
        this.f20682l = true;
        this.f20685o = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onStop() {
        super.onStop();
        if (this.f20682l && !this.f20685o) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f20681k.f18013cx == 0 || this.f20684n == null || this.f20684n.f17768a == null)) {
            this.f20684n.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f20681k.f18013cx != 0 && this.f20684n != null && this.f20684n.f17768a != null) {
            this.f20684n.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f20681k.f18013cx == 0 || this.f20684n == null || this.f20684n.f17768a == null)) {
            this.f20684n.f17768a.mo12168c();
        }
        if (!(this.f20681k.f18013cx == 0 || this.f20684n == null || this.f20684n.f17769b == null)) {
            this.f20684n.f17769b.destroy();
        }
        super.onDestroy();
    }
}
