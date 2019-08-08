package android.support.p017v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: android.support.v4.app.q */
/* compiled from: ListFragment */
public class C0294q extends Fragment {

    /* renamed from: a */
    ListAdapter f669a;

    /* renamed from: ag */
    private final Runnable f670ag = new Runnable() {
        public void run() {
            C0294q.this.f672b.focusableViewAvailable(C0294q.this.f672b);
        }
    };

    /* renamed from: ah */
    private final OnItemClickListener f671ah = new OnItemClickListener() {
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C0294q.this.mo1034a((ListView) adapterView, view, i, j);
        }
    };

    /* renamed from: b */
    ListView f672b;

    /* renamed from: c */
    View f673c;

    /* renamed from: d */
    TextView f674d;

    /* renamed from: e */
    View f675e;

    /* renamed from: f */
    View f676f;

    /* renamed from: g */
    CharSequence f677g;

    /* renamed from: h */
    boolean f678h;

    /* renamed from: i */
    private final Handler f679i = new Handler();

    /* renamed from: a */
    public void mo1034a(ListView listView, View view, int i, long j) {
    }

    /* renamed from: a */
    public View mo555a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context k = mo622k();
        FrameLayout frameLayout = new FrameLayout(k);
        LinearLayout linearLayout = new LinearLayout(k);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(k, null, 16842874), new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(k);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(k);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new LayoutParams(-1, -1));
        ListView listView = new ListView(k);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        return frameLayout;
    }

    /* renamed from: a */
    public void mo577a(View view, Bundle bundle) {
        super.mo577a(view, bundle);
        m1056d();
    }

    /* renamed from: h */
    public void mo613h() {
        this.f679i.removeCallbacks(this.f670ag);
        this.f672b = null;
        this.f678h = false;
        this.f676f = null;
        this.f675e = null;
        this.f673c = null;
        this.f674d = null;
        super.mo613h();
    }

    /* renamed from: a */
    public void mo1033a(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.f669a != null;
        this.f669a = listAdapter;
        if (this.f672b != null) {
            this.f672b.setAdapter(listAdapter);
            if (!this.f678h && !z2) {
                if (mo645y().getWindowToken() != null) {
                    z = true;
                }
                m1055a(true, z);
            }
        }
    }

    /* renamed from: c */
    public ListView mo830c() {
        m1056d();
        return this.f672b;
    }

    /* renamed from: a */
    public void mo1035a(CharSequence charSequence) {
        m1056d();
        if (this.f674d == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        this.f674d.setText(charSequence);
        if (this.f677g == null) {
            this.f672b.setEmptyView(this.f674d);
        }
        this.f677g = charSequence;
    }

    /* renamed from: a */
    public void mo1036a(boolean z) {
        m1055a(z, true);
    }

    /* renamed from: a */
    private void m1055a(boolean z, boolean z2) {
        m1056d();
        if (this.f675e == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f678h != z) {
            this.f678h = z;
            if (z) {
                if (z2) {
                    this.f675e.startAnimation(AnimationUtils.loadAnimation(mo622k(), 17432577));
                    this.f676f.startAnimation(AnimationUtils.loadAnimation(mo622k(), 17432576));
                } else {
                    this.f675e.clearAnimation();
                    this.f676f.clearAnimation();
                }
                this.f675e.setVisibility(8);
                this.f676f.setVisibility(0);
            } else {
                if (z2) {
                    this.f675e.startAnimation(AnimationUtils.loadAnimation(mo622k(), 17432576));
                    this.f676f.startAnimation(AnimationUtils.loadAnimation(mo622k(), 17432577));
                } else {
                    this.f675e.clearAnimation();
                    this.f676f.clearAnimation();
                }
                this.f675e.setVisibility(0);
                this.f676f.setVisibility(8);
            }
        }
    }

    /* renamed from: d */
    private void m1056d() {
        if (this.f672b == null) {
            View y = mo645y();
            if (y == null) {
                throw new IllegalStateException("Content view not yet created");
            }
            if (y instanceof ListView) {
                this.f672b = (ListView) y;
            } else {
                this.f674d = (TextView) y.findViewById(16711681);
                if (this.f674d == null) {
                    this.f673c = y.findViewById(16908292);
                } else {
                    this.f674d.setVisibility(8);
                }
                this.f675e = y.findViewById(16711682);
                this.f676f = y.findViewById(16711683);
                View findViewById = y.findViewById(16908298);
                if (findViewById instanceof ListView) {
                    this.f672b = (ListView) findViewById;
                    if (this.f673c != null) {
                        this.f672b.setEmptyView(this.f673c);
                    } else if (this.f677g != null) {
                        this.f674d.setText(this.f677g);
                        this.f672b.setEmptyView(this.f674d);
                    }
                } else if (findViewById == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                } else {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
            }
            this.f678h = true;
            this.f672b.setOnItemClickListener(this.f671ah);
            if (this.f669a != null) {
                ListAdapter listAdapter = this.f669a;
                this.f669a = null;
                mo1033a(listAdapter);
            } else if (this.f675e != null) {
                m1055a(false, false);
            }
            this.f679i.post(this.f670ag);
        }
    }
}
