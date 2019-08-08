package mega.boicot;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C2793C;
import com.startapp.android.publish.common.metaData.MetaData;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import mega.boicot.FullscreenVideoView_pro.C5930a;
import mega.boicot.config.C5643e;

public class FullscreenVideoLayout_pro extends FullscreenVideoView_pro implements OnPreparedListener, OnClickListener, OnTouchListener, OnSeekBarChangeListener {

    /* renamed from: l */
    protected static final Handler f19472l = new Handler();

    /* renamed from: J */
    private config f19473J;

    /* renamed from: a */
    public boolean f19474a = false;

    /* renamed from: b */
    public String f19475b = "";

    /* renamed from: c */
    public String f19476c = "";

    /* renamed from: d */
    protected View f19477d;

    /* renamed from: e */
    protected SeekBar f19478e;

    /* renamed from: f */
    protected ImageButton f19479f;

    /* renamed from: g */
    protected ImageButton f19480g;

    /* renamed from: h */
    protected ImageButton f19481h;

    /* renamed from: i */
    protected TextView f19482i;

    /* renamed from: j */
    protected TextView f19483j;

    /* renamed from: k */
    protected OnTouchListener f19484k;

    /* renamed from: m */
    protected Runnable f19485m = new Runnable() {
        public void run() {
            FullscreenVideoLayout_pro.this.mo21511f();
            FullscreenVideoLayout_pro.f19472l.postDelayed(this, 200);
        }
    };

    /* renamed from: n */
    protected boolean f19486n = false;

    public FullscreenVideoLayout_pro(Context context) {
        super(context);
    }

    public FullscreenVideoLayout_pro(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FullscreenVideoLayout_pro(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21505a() {
        Log.d("FullscreenVideoLayout", "init");
        super.mo21505a();
        if (!isInEditMode()) {
            super.setOnTouchListener(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21507b() {
        super.mo21507b();
        this.f19473J = (config) this.f19532o.getApplicationContext();
        if (this.f19477d == null) {
            this.f19477d = ((LayoutInflater) this.f19532o.getSystemService("layout_inflater")).inflate(R.layout.view_videocontrols, this, false);
        }
        if (this.f19477d != null) {
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.addRule(12);
            addView(this.f19477d, layoutParams);
            this.f19478e = (SeekBar) this.f19477d.findViewById(R.id.vcv_seekbar);
            this.f19481h = (ImageButton) this.f19477d.findViewById(R.id.vcv_img_fullscreen);
            this.f19479f = (ImageButton) this.f19477d.findViewById(R.id.vcv_img_play);
            this.f19480g = (ImageButton) this.f19477d.findViewById(R.id.vcv_img_cast);
            this.f19482i = (TextView) this.f19477d.findViewById(R.id.vcv_txt_total);
            this.f19483j = (TextView) this.f19477d.findViewById(R.id.vcv_txt_elapsed);
        }
        if (this.f19479f != null) {
            this.f19479f.setOnClickListener(this);
        }
        if (this.f19480g != null) {
            this.f19480g.setOnClickListener(this);
        }
        if (this.f19481h != null) {
            this.f19481h.setOnClickListener(this);
        }
        if (this.f19478e != null) {
            this.f19478e.setOnSeekBarChangeListener(this);
        }
        if (this.f19477d != null) {
            this.f19477d.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21506a(boolean z) {
        if (z) {
            ((LayoutParams) this.f19481h.getLayoutParams()).addRule(0, R.id.vcv_img_cast);
            return;
        }
        this.f19480g.setVisibility(8);
        ((LayoutParams) this.f19481h.getLayoutParams()).addRule(11);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo21508c() {
        super.mo21508c();
        if (this.f19477d != null) {
            removeView(this.f19477d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21509d() {
        Log.d("FullscreenVideoLayout", "startCounter");
        f19472l.postDelayed(this.f19485m, 200);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo21510e() {
        Log.d("FullscreenVideoLayout", "stopCounter");
        f19472l.removeCallbacks(this.f19485m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo21511f() {
        if (this.f19483j != null) {
            int currentPosition = getCurrentPosition();
            if (currentPosition > 0 && currentPosition < getDuration()) {
                this.f19478e.setProgress(currentPosition);
                int round = Math.round(((float) currentPosition) / 1000.0f);
                long j = (long) (round % 60);
                long j2 = (long) ((round / 60) % 60);
                long j3 = (long) ((round / MetaData.DEFAULT_NOT_VISIBLE_BANNER_RELOAD_INTERVAL) % 24);
                if (j3 > 0) {
                    this.f19483j.setText(String.format(Locale.US, "%d:%02d:%02d", new Object[]{Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)}));
                } else {
                    this.f19483j.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(j2), Long.valueOf(j)}));
                }
            }
        }
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f19484k = onTouchListener;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Log.d("FullscreenVideoLayout", "onCompletion");
        super.onCompletion(mediaPlayer);
        mo21510e();
        mo21516k();
        if (this.f19539v != C5930a.ERROR) {
            mo21511f();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        boolean onError = super.onError(mediaPlayer, i, i2);
        mo21510e();
        mo21516k();
        return onError;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getCurrentState() == C5930a.END) {
            Log.d("FullscreenVideoLayout", "onDetachedFromWindow END");
            mo21510e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo21512g() {
        Log.d("FullscreenVideoLayout", "tryToPrepare");
        super.mo21512g();
        if ((getCurrentState() == C5930a.PREPARED || getCurrentState() == C5930a.STARTED) && this.f19483j != null && this.f19482i != null) {
            int duration = getDuration();
            if (duration > 0) {
                this.f19478e.setMax(duration);
                this.f19478e.setProgress(0);
                int i = duration / AdError.NETWORK_ERROR_CODE;
                long j = (long) (i % 60);
                long j2 = (long) ((i / 60) % 60);
                long j3 = (long) ((i / MetaData.DEFAULT_NOT_VISIBLE_BANNER_RELOAD_INTERVAL) % 24);
                if (j3 > 0) {
                    this.f19483j.setText("00:00:00");
                    this.f19482i.setText(String.format(Locale.US, "%d:%02d:%02d", new Object[]{Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)}));
                    return;
                }
                this.f19483j.setText("00:00");
                this.f19482i.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(j2), Long.valueOf(j)}));
            }
        }
    }

    /* renamed from: h */
    public void mo21513h() throws IllegalStateException {
        Log.d("FullscreenVideoLayout", TtmlNode.START);
        if (!mo21578t()) {
            super.mo21513h();
            if (this.f19474a) {
                findViewById(R.id.ll_btns).setVisibility(0);
                new C5643e(this.f19475b, null).execute(new String[0]);
            }
            mo21509d();
            mo21516k();
        }
    }

    /* renamed from: i */
    public void mo21514i() throws IllegalStateException {
        Log.d("FullscreenVideoLayout", "pause");
        if (mo21578t()) {
            mo21510e();
            super.mo21514i();
            mo21516k();
        }
    }

    /* renamed from: j */
    public void mo21515j() {
        Log.d("FullscreenVideoLayout", "reset");
        super.mo21515j();
        mo21510e();
        mo21516k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo21516k() {
        Drawable drawable;
        if (this.f19479f != null) {
            if (getCurrentState() == C5930a.STARTED) {
                drawable = this.f19532o.getResources().getDrawable(R.drawable.fvl_selector_pause);
            } else {
                drawable = this.f19532o.getResources().getDrawable(R.drawable.fvl_selector_play);
            }
            this.f19479f.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: l */
    public void mo21517l() {
        if (this.f19477d != null) {
            this.f19477d.findViewById(R.id.vcv_txt_elapsed).setVisibility(4);
            this.f19477d.findViewById(R.id.vcv_txt_total).setVisibility(4);
            this.f19477d.findViewById(R.id.vcv_seekbar).setVisibility(4);
        }
    }

    /* renamed from: m */
    public void mo21518m() {
        Log.d("FullscreenVideoLayout", "hideControls");
        if (this.f19477d != null) {
            this.f19477d.setVisibility(4);
        }
    }

    /* renamed from: n */
    public void mo21519n() {
        if (this.f19477d != null) {
            this.f19477d.bringToFront();
            this.f19477d.setVisibility(0);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.f19477d != null) {
            if (this.f19477d.getVisibility() == 0) {
                mo21518m();
            } else if (this.f19474a) {
                this.f19532o.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f19476c)));
            } else {
                mo21519n();
            }
        }
        if (this.f19484k != null) {
            return this.f19484k.onTouch(this, motionEvent);
        }
        return false;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.vcv_img_play) {
            if (mo21578t()) {
                mo21514i();
            } else {
                mo21513h();
            }
        } else if (view.getId() == R.id.vcv_img_cast) {
            String encode = Uri.encode(this.f19531I.toString());
            try {
                encode = Base64.encodeToString(encode.getBytes(C2793C.UTF8_NAME), 0);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            String str = "0";
            if (this.f19486n) {
                str = "1";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("http://cast.e-droid.net/?st=");
            sb.append(encode);
            sb.append("&esstr=");
            sb.append(str);
            sb.append("&idl=");
            sb.append(Locale.getDefault().getLanguage());
            sb.append("&v=");
            sb.append(this.f19473J.f18041dZ);
            sb.append("&ts=");
            sb.append(TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis()));
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
            intent.setPackage("com.android.chrome");
            try {
                this.f19532o.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.setPackage(null);
                this.f19532o.startActivity(intent);
            }
        } else {
            if (!mo21570r()) {
                mo21518m();
            }
            setFullscreen(!mo21570r());
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("onProgressChanged ");
        sb.append(i);
        Log.d("FullscreenVideoLayout", sb.toString());
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        mo21510e();
        Log.d("FullscreenVideoLayout", "onStartTrackingTouch");
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        mo21556a(seekBar.getProgress());
        Log.d("FullscreenVideoLayout", "onStopTrackingTouch");
    }
}
