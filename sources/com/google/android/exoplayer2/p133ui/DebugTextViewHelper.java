package com.google.android.exoplayer2.p133ui;

import android.annotation.SuppressLint;
import android.widget.TextView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player.DefaultEventListener;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import java.util.Locale;

/* renamed from: com.google.android.exoplayer2.ui.DebugTextViewHelper */
public class DebugTextViewHelper extends DefaultEventListener implements Runnable {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final SimpleExoPlayer player;
    private boolean started;
    private final TextView textView;

    public DebugTextViewHelper(SimpleExoPlayer simpleExoPlayer, TextView textView2) {
        this.player = simpleExoPlayer;
        this.textView = textView2;
    }

    public final void start() {
        if (!this.started) {
            this.started = true;
            this.player.addListener(this);
            updateAndPost();
        }
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener(this);
            this.textView.removeCallbacks(this);
        }
    }

    public final void onPlayerStateChanged(boolean z, int i) {
        updateAndPost();
    }

    public final void onPositionDiscontinuity(int i) {
        updateAndPost();
    }

    public final void run() {
        updateAndPost();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetTextI18n"})
    public final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this);
        this.textView.postDelayed(this, 1000);
    }

    /* access modifiers changed from: protected */
    public String getDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getPlayerStateString());
        sb.append(getVideoString());
        sb.append(getAudioString());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String getPlayerStateString() {
        String str;
        switch (this.player.getPlaybackState()) {
            case 1:
                str = "idle";
                break;
            case 2:
                str = "buffering";
                break;
            case 3:
                str = "ready";
                break;
            case 4:
                str = "ended";
                break;
            default:
                str = "unknown";
                break;
        }
        return String.format("playWhenReady:%s playbackState:%s window:%s", new Object[]{Boolean.valueOf(this.player.getPlayWhenReady()), str, Integer.valueOf(this.player.getCurrentWindowIndex())});
    }

    /* access modifiers changed from: protected */
    public String getVideoString() {
        Format videoFormat = this.player.getVideoFormat();
        if (videoFormat == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(videoFormat.sampleMimeType);
        sb.append("(id:");
        sb.append(videoFormat.f8626id);
        sb.append(" r:");
        sb.append(videoFormat.width);
        sb.append("x");
        sb.append(videoFormat.height);
        sb.append(getPixelAspectRatioString(videoFormat.pixelWidthHeightRatio));
        sb.append(getDecoderCountersBufferCountString(this.player.getVideoDecoderCounters()));
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String getAudioString() {
        Format audioFormat = this.player.getAudioFormat();
        if (audioFormat == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(audioFormat.sampleMimeType);
        sb.append("(id:");
        sb.append(audioFormat.f8626id);
        sb.append(" hz:");
        sb.append(audioFormat.sampleRate);
        sb.append(" ch:");
        sb.append(audioFormat.channelCount);
        sb.append(getDecoderCountersBufferCountString(this.player.getAudioDecoderCounters()));
        sb.append(")");
        return sb.toString();
    }

    private static String getDecoderCountersBufferCountString(DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return "";
        }
        decoderCounters.ensureUpdated();
        StringBuilder sb = new StringBuilder();
        sb.append(" sib:");
        sb.append(decoderCounters.skippedInputBufferCount);
        sb.append(" sb:");
        sb.append(decoderCounters.skippedOutputBufferCount);
        sb.append(" rb:");
        sb.append(decoderCounters.renderedOutputBufferCount);
        sb.append(" db:");
        sb.append(decoderCounters.droppedBufferCount);
        sb.append(" mcdb:");
        sb.append(decoderCounters.maxConsecutiveDroppedBufferCount);
        sb.append(" dk:");
        sb.append(decoderCounters.droppedToKeyframeCount);
        return sb.toString();
    }

    private static String getPixelAspectRatioString(float f) {
        if (f == -1.0f || f == 1.0f) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" par:");
        sb.append(String.format(Locale.US, "%.02f", new Object[]{Float.valueOf(f)}));
        return sb.toString();
    }
}
