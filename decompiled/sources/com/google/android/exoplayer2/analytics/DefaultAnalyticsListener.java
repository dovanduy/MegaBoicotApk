package com.google.android.exoplayer2.analytics;

import android.net.NetworkInfo;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;

public abstract class DefaultAnalyticsListener implements AnalyticsListener {
    public void onAudioSessionId(EventTime eventTime, int i) {
    }

    public void onAudioUnderrun(EventTime eventTime, int i, long j, long j2) {
    }

    public void onBandwidthEstimate(EventTime eventTime, int i, long j, long j2) {
    }

    public void onDecoderDisabled(EventTime eventTime, int i, DecoderCounters decoderCounters) {
    }

    public void onDecoderEnabled(EventTime eventTime, int i, DecoderCounters decoderCounters) {
    }

    public void onDecoderInitialized(EventTime eventTime, int i, String str, long j) {
    }

    public void onDecoderInputFormatChanged(EventTime eventTime, int i, Format format) {
    }

    public void onDownstreamFormatChanged(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    public void onDrmKeysLoaded(EventTime eventTime) {
    }

    public void onDrmKeysRemoved(EventTime eventTime) {
    }

    public void onDrmKeysRestored(EventTime eventTime) {
    }

    public void onDrmSessionManagerError(EventTime eventTime, Exception exc) {
    }

    public void onDroppedVideoFrames(EventTime eventTime, int i, long j) {
    }

    public void onLoadCanceled(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public void onLoadCompleted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public void onLoadError(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
    }

    public void onLoadStarted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public void onLoadingChanged(EventTime eventTime, boolean z) {
    }

    public void onMediaPeriodCreated(EventTime eventTime) {
    }

    public void onMediaPeriodReleased(EventTime eventTime) {
    }

    public void onMetadata(EventTime eventTime, Metadata metadata) {
    }

    public void onNetworkTypeChanged(EventTime eventTime, NetworkInfo networkInfo) {
    }

    public void onPlaybackParametersChanged(EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    public void onPlayerError(EventTime eventTime, ExoPlaybackException exoPlaybackException) {
    }

    public void onPlayerStateChanged(EventTime eventTime, boolean z, int i) {
    }

    public void onPositionDiscontinuity(EventTime eventTime, int i) {
    }

    public void onReadingStarted(EventTime eventTime) {
    }

    public void onRenderedFirstFrame(EventTime eventTime, Surface surface) {
    }

    public void onRepeatModeChanged(EventTime eventTime, int i) {
    }

    public void onSeekProcessed(EventTime eventTime) {
    }

    public void onSeekStarted(EventTime eventTime) {
    }

    public void onShuffleModeChanged(EventTime eventTime, boolean z) {
    }

    public void onTimelineChanged(EventTime eventTime, int i) {
    }

    public void onTracksChanged(EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public void onUpstreamDiscarded(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    public void onVideoSizeChanged(EventTime eventTime, int i, int i2, int i3, float f) {
    }

    public void onViewportSizeChange(EventTime eventTime, int i, int i2) {
    }
}
