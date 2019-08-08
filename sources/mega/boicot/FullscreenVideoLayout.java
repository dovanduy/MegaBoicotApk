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
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
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
import mega.boicot.FullscreenVideoView.C5926a;
import mega.boicot.config.C5643e;

public class FullscreenVideoLayout extends FullscreenVideoView implements OnPreparedListener, OnClickListener, OnTouchListener, OnSeekBarChangeListener {

    /* renamed from: m */
    protected static final Handler f19455m = new Handler();

    /* renamed from: J */
    private config f19456J;

    /* renamed from: a */
    public boolean f19457a = false;

    /* renamed from: b */
    public String f19458b = "";

    /* renamed from: c */
    public String f19459c = "";

    /* renamed from: d */
    protected View f19460d;

    /* renamed from: e */
    protected SeekBar f19461e;

    /* renamed from: f */
    protected ImageButton f19462f;

    /* renamed from: g */
    protected ImageButton f19463g;

    /* renamed from: h */
    protected ImageButton f19464h;

    /* renamed from: i */
    protected ImageButton f19465i;

    /* renamed from: j */
    protected TextView f19466j;

    /* renamed from: k */
    protected TextView f19467k;

    /* renamed from: l */
    protected OnTouchListener f19468l;

    /* renamed from: n */
    protected Runnable f19469n = new Runnable() {
        public void run() {
            FullscreenVideoLayout.this.mo21486f();
            FullscreenVideoLayout.f19455m.postDelayed(this, 200);
        }
    };

    /* renamed from: o */
    protected boolean f19470o = false;

    public FullscreenVideoLayout(Context context) {
        super(context);
    }

    public FullscreenVideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FullscreenVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21480a() {
        Log.d("FullscreenVideoLayout", "init");
        super.mo21480a();
        if (!isInEditMode()) {
            super.setOnTouchListener(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21482b() {
        super.mo21482b();
        this.f19456J = (config) this.f19498q.getApplicationContext();
        if (this.f19460d == null) {
            this.f19460d = ((LayoutInflater) this.f19498q.getSystemService("layout_inflater")).inflate(R.layout.view_videocontrols, this, false);
        }
        if (this.f19460d != null) {
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.addRule(12);
            addView(this.f19460d, layoutParams);
            this.f19461e = (SeekBar) this.f19460d.findViewById(R.id.vcv_seekbar);
            this.f19465i = (ImageButton) this.f19460d.findViewById(R.id.vcv_img_fullscreen);
            this.f19462f = (ImageButton) this.f19460d.findViewById(R.id.vcv_img_play);
            this.f19463g = (ImageButton) this.f19460d.findViewById(R.id.vcv_img_cast);
            this.f19464h = (ImageButton) this.f19460d.findViewById(R.id.vcv_img_download);
            this.f19466j = (TextView) this.f19460d.findViewById(R.id.vcv_txt_total);
            this.f19467k = (TextView) this.f19460d.findViewById(R.id.vcv_txt_elapsed);
        }
        if (this.f19462f != null) {
            this.f19462f.setOnClickListener(this);
        }
        if (this.f19463g != null) {
            this.f19463g.setOnClickListener(this);
        }
        if (this.f19464h != null) {
            this.f19464h.setOnClickListener(this);
        }
        if (this.f19465i != null) {
            this.f19465i.setOnClickListener(this);
        }
        if (this.f19461e != null) {
            this.f19461e.setOnSeekBarChangeListener(this);
        }
        if (this.f19460d != null) {
            this.f19460d.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21481a(boolean z, boolean z2) {
        if (!z) {
            this.f19463g.setVisibility(8);
            if (z2) {
                this.f19464h.setVisibility(0);
                ((LayoutParams) this.f19464h.getLayoutParams()).addRule(11);
                ((LayoutParams) this.f19465i.getLayoutParams()).addRule(0, R.id.vcv_img_download);
                return;
            }
            ((LayoutParams) this.f19465i.getLayoutParams()).addRule(11);
        } else if (z2) {
            this.f19464h.setVisibility(0);
            ((LayoutParams) this.f19464h.getLayoutParams()).addRule(0, R.id.vcv_img_cast);
            ((LayoutParams) this.f19465i.getLayoutParams()).addRule(0, R.id.vcv_img_download);
        } else {
            ((LayoutParams) this.f19465i.getLayoutParams()).addRule(0, R.id.vcv_img_cast);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo21483c() {
        super.mo21483c();
        if (this.f19460d != null) {
            removeView(this.f19460d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21484d() {
        Log.d("FullscreenVideoLayout", "startCounter");
        f19455m.postDelayed(this.f19469n, 200);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo21485e() {
        Log.d("FullscreenVideoLayout", "stopCounter");
        f19455m.removeCallbacks(this.f19469n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo21486f() {
        if (this.f19467k != null) {
            int currentPosition = getCurrentPosition();
            if (currentPosition > 0 && currentPosition < getDuration()) {
                this.f19461e.setProgress(currentPosition);
                int round = Math.round(((float) currentPosition) / 1000.0f);
                long j = (long) (round % 60);
                long j2 = (long) ((round / 60) % 60);
                long j3 = (long) ((round / MetaData.DEFAULT_NOT_VISIBLE_BANNER_RELOAD_INTERVAL) % 24);
                if (j3 > 0) {
                    this.f19467k.setText(String.format(Locale.US, "%d:%02d:%02d", new Object[]{Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)}));
                } else {
                    this.f19467k.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(j2), Long.valueOf(j)}));
                }
            }
        }
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f19468l = onTouchListener;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Log.d("FullscreenVideoLayout", "onCompletion");
        super.onCompletion(mediaPlayer);
        mo21485e();
        mo21491k();
        if (this.f19505x != C5926a.ERROR) {
            mo21486f();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        boolean onError = super.onError(mediaPlayer, i, i2);
        mo21485e();
        mo21491k();
        return onError;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getCurrentState() == C5926a.END) {
            Log.d("FullscreenVideoLayout", "onDetachedFromWindow END");
            mo21485e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo21487g() {
        Log.d("FullscreenVideoLayout", "tryToPrepare");
        super.mo21487g();
        if ((getCurrentState() == C5926a.PREPARED || getCurrentState() == C5926a.STARTED) && this.f19467k != null && this.f19466j != null) {
            int duration = getDuration();
            if (duration > 0) {
                this.f19461e.setMax(duration);
                this.f19461e.setProgress(0);
                int i = duration / AdError.NETWORK_ERROR_CODE;
                long j = (long) (i % 60);
                long j2 = (long) ((i / 60) % 60);
                long j3 = (long) ((i / MetaData.DEFAULT_NOT_VISIBLE_BANNER_RELOAD_INTERVAL) % 24);
                if (j3 > 0) {
                    this.f19467k.setText("00:00:00");
                    this.f19466j.setText(String.format(Locale.US, "%d:%02d:%02d", new Object[]{Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)}));
                    return;
                }
                this.f19467k.setText("00:00");
                this.f19466j.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(j2), Long.valueOf(j)}));
            }
        }
    }

    /* renamed from: h */
    public void mo21488h() throws IllegalStateException {
        Log.d("FullscreenVideoLayout", TtmlNode.START);
        if (!mo21553t()) {
            super.mo21488h();
            if (this.f19457a) {
                findViewById(R.id.ll_btns).setVisibility(0);
                new C5643e(this.f19458b, null).execute(new String[0]);
            }
            mo21484d();
            mo21491k();
        }
    }

    /* renamed from: i */
    public void mo21489i() throws IllegalStateException {
        Log.d("FullscreenVideoLayout", "pause");
        if (mo21553t()) {
            mo21485e();
            super.mo21489i();
            mo21491k();
        }
    }

    /* renamed from: j */
    public void mo21490j() {
        Log.d("FullscreenVideoLayout", "reset");
        super.mo21490j();
        mo21485e();
        mo21491k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo21491k() {
        Drawable drawable;
        if (this.f19462f != null) {
            if (getCurrentState() == C5926a.STARTED) {
                drawable = this.f19498q.getResources().getDrawable(R.drawable.fvl_selector_pause);
            } else {
                drawable = this.f19498q.getResources().getDrawable(R.drawable.fvl_selector_play);
            }
            this.f19462f.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: l */
    public void mo21492l() {
        if (this.f19460d != null) {
            this.f19460d.findViewById(R.id.vcv_txt_elapsed).setVisibility(4);
            this.f19460d.findViewById(R.id.vcv_txt_total).setVisibility(4);
            this.f19460d.findViewById(R.id.vcv_seekbar).setVisibility(4);
        }
    }

    /* renamed from: m */
    public void mo21493m() {
        Log.d("FullscreenVideoLayout", "hideControls");
        if (this.f19460d != null) {
            this.f19460d.setVisibility(4);
        }
    }

    /* renamed from: n */
    public void mo21494n() {
        Log.d("FullscreenVideoLayout", "showControls");
        if (this.f19460d != null) {
            this.f19460d.setVisibility(0);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.f19460d != null) {
            if (this.f19460d.getVisibility() == 0) {
                mo21493m();
            } else if (this.f19457a) {
                this.f19498q.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f19459c)));
            } else {
                mo21494n();
            }
        }
        if (this.f19468l != null) {
            return this.f19468l.onTouch(this, motionEvent);
        }
        return false;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.vcv_img_play) {
            if (mo21553t()) {
                mo21489i();
            } else {
                mo21488h();
            }
        } else if (view.getId() == R.id.vcv_img_download) {
            String str = "video/*";
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(this.f19496I.toString());
            if (fileExtensionFromUrl != null) {
                str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            }
            String str2 = "";
            try {
                str2 = URLUtil.guessFileName(this.f19496I.toString(), null, str);
            } catch (Exception unused) {
            }
            this.f19456J.mo20773a(this.f19496I.toString(), str, str2, this.f19498q);
        } else if (view.getId() == R.id.vcv_img_cast) {
            String encode = Uri.encode(this.f19496I.toString());
            try {
                encode = Base64.encodeToString(encode.getBytes(C2793C.UTF8_NAME), 0);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            String str3 = "0";
            if (this.f19470o) {
                str3 = "1";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("http://cast.e-droid.net/?st=");
            sb.append(encode);
            sb.append("&esstr=");
            sb.append(str3);
            sb.append("&idl=");
            sb.append(Locale.getDefault().getLanguage());
            sb.append("&v=");
            sb.append(this.f19456J.f18041dZ);
            sb.append("&ts=");
            sb.append(TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis()));
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
            intent.setPackage("com.android.chrome");
            try {
                this.f19498q.startActivity(intent);
            } catch (ActivityNotFoundException unused2) {
                intent.setPackage(null);
                this.f19498q.startActivity(intent);
            }
        } else {
            if (!mo21545r()) {
                mo21493m();
            }
            setFullscreen(!mo21545r());
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("onProgressChanged ");
        sb.append(i);
        Log.d("FullscreenVideoLayout", sb.toString());
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        mo21485e();
        Log.d("FullscreenVideoLayout", "onStartTrackingTouch");
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        mo21530a(seekBar.getProgress());
        Log.d("FullscreenVideoLayout", "onStopTrackingTouch");
    }
}
