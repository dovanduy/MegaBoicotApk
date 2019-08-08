package com.startapp.android.publish.ads.video.tracking;

import com.startapp.android.publish.ads.video.p173c.p174a.C5240b;
import com.startapp.android.publish.ads.video.p173c.p174a.C5246e;
import com.startapp.android.publish.ads.video.p173c.p174a.p175a.C5237c;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: StartAppSDK */
public class VideoTrackingDetails implements Serializable {
    private static final long serialVersionUID = 1;
    @C5548f(mo20535b = AbsoluteTrackingLink.class)
    private AbsoluteTrackingLink[] absoluteTrackingUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] creativeViewUrls;
    @C5548f(mo20535b = FractionTrackingLink.class)
    private FractionTrackingLink[] fractionTrackingUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] impressionUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] inlineErrorTrackingUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] soundMuteUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] soundUnmuteUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClickTrackingUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClosedUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPausedUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClosedUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollImpressionUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] videoResumedUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] videoRewardedUrls;
    @C5548f(mo20535b = ActionTrackingLink.class)
    private ActionTrackingLink[] videoSkippedUrls;

    public VideoTrackingDetails() {
    }

    public VideoTrackingDetails(C5246e eVar) {
        if (eVar != null) {
            HashMap a = eVar.mo19345a();
            ArrayList arrayList = new ArrayList();
            addFractionUrls((List) a.get(C5240b.start), 0, arrayList);
            addFractionUrls((List) a.get(C5240b.firstQuartile), 25, arrayList);
            addFractionUrls((List) a.get(C5240b.midpoint), 50, arrayList);
            addFractionUrls((List) a.get(C5240b.thirdQuartile), 75, arrayList);
            addFractionUrls((List) a.get(C5240b.complete), 100, arrayList);
            this.fractionTrackingUrls = (FractionTrackingLink[]) arrayList.toArray(new FractionTrackingLink[arrayList.size()]);
            this.impressionUrls = urlToTrackingList(eVar.mo19349d());
            this.soundMuteUrls = trackingToTrackingList((List) a.get(C5240b.mute));
            this.soundUnmuteUrls = trackingToTrackingList((List) a.get(C5240b.unmute));
            this.videoPausedUrls = trackingToTrackingList((List) a.get(C5240b.pause));
            this.videoResumedUrls = trackingToTrackingList((List) a.get(C5240b.resume));
            this.videoSkippedUrls = trackingToTrackingList((List) a.get(C5240b.skip));
            this.videoPausedUrls = trackingToTrackingList((List) a.get(C5240b.pause));
            this.videoClosedUrls = trackingToTrackingList((List) a.get(C5240b.close));
            this.inlineErrorTrackingUrls = urlToTrackingList(eVar.mo19350e());
            this.videoClickTrackingUrls = urlToTrackingList(eVar.mo19348c().mo19334b());
            this.absoluteTrackingUrls = toAbsoluteTrackingList((List) a.get(C5240b.progress));
        }
    }

    public FractionTrackingLink[] getFractionTrackingUrls() {
        return this.fractionTrackingUrls;
    }

    public AbsoluteTrackingLink[] getAbsoluteTrackingUrls() {
        return this.absoluteTrackingUrls;
    }

    public ActionTrackingLink[] getImpressionUrls() {
        return this.impressionUrls;
    }

    public ActionTrackingLink[] getSoundUnmuteUrls() {
        return this.soundUnmuteUrls;
    }

    public ActionTrackingLink[] getCreativeViewUrls() {
        return this.creativeViewUrls;
    }

    public ActionTrackingLink[] getSoundMuteUrls() {
        return this.soundMuteUrls;
    }

    public ActionTrackingLink[] getVideoPausedUrls() {
        return this.videoPausedUrls;
    }

    public ActionTrackingLink[] getVideoResumedUrls() {
        return this.videoResumedUrls;
    }

    public ActionTrackingLink[] getVideoSkippedUrls() {
        return this.videoSkippedUrls;
    }

    public ActionTrackingLink[] getVideoClosedUrls() {
        return this.videoClosedUrls;
    }

    public ActionTrackingLink[] getVideoPostRollImpressionUrls() {
        return this.videoPostRollImpressionUrls;
    }

    public ActionTrackingLink[] getVideoPostRollClosedUrls() {
        return this.videoPostRollClosedUrls;
    }

    public ActionTrackingLink[] getVideoRewardedUrls() {
        return this.videoRewardedUrls;
    }

    public ActionTrackingLink[] getVideoClickTrackingUrls() {
        return this.videoClickTrackingUrls;
    }

    public ActionTrackingLink[] getInlineErrorTrackingUrls() {
        return this.inlineErrorTrackingUrls;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoTrackingDetails [fractionTrackingUrls=");
        sb.append(printTrackingLinks(this.fractionTrackingUrls));
        sb.append(", absoluteTrackingUrls=");
        sb.append(printTrackingLinks(this.absoluteTrackingUrls));
        sb.append(", impressionUrls=");
        sb.append(printTrackingLinks(this.impressionUrls));
        sb.append(", creativeViewUrls=");
        sb.append(printTrackingLinks(this.creativeViewUrls));
        sb.append(", soundMuteUrls=");
        sb.append(printTrackingLinks(this.soundMuteUrls));
        sb.append(", soundUnmuteUrls=");
        sb.append(printTrackingLinks(this.soundUnmuteUrls));
        sb.append(", videoPausedUrls=");
        sb.append(printTrackingLinks(this.videoPausedUrls));
        sb.append(", videoResumedUrls=");
        sb.append(printTrackingLinks(this.videoResumedUrls));
        sb.append(", videoSkippedUrls=");
        sb.append(printTrackingLinks(this.videoSkippedUrls));
        sb.append(", videoClosedUrls=");
        sb.append(printTrackingLinks(this.videoClosedUrls));
        sb.append(", videoPostRollImpressionUrls=");
        sb.append(printTrackingLinks(this.videoPostRollImpressionUrls));
        sb.append(", videoPostRollClosedUrls=");
        sb.append(printTrackingLinks(this.videoPostRollClosedUrls));
        sb.append(", videoRewardedUrls=");
        sb.append(printTrackingLinks(this.videoRewardedUrls));
        sb.append(", videoClickTrackingUrls=");
        sb.append(printTrackingLinks(this.videoClickTrackingUrls));
        sb.append(", inlineErrorTrackingUrls=");
        sb.append(printTrackingLinks(this.inlineErrorTrackingUrls));
        sb.append("]");
        return sb.toString();
    }

    private String printTrackingLinks(VideoTrackingLink[] videoTrackingLinkArr) {
        return videoTrackingLinkArr != null ? Arrays.toString(videoTrackingLinkArr) : "";
    }

    private static void addFractionUrls(List<C5237c> list, int i, List<FractionTrackingLink> list2) {
        if (list != null) {
            for (C5237c cVar : list) {
                FractionTrackingLink fractionTrackingLink = new FractionTrackingLink();
                fractionTrackingLink.setTrackingUrl(cVar.mo19327a());
                fractionTrackingLink.setFraction(i);
                fractionTrackingLink.setAppendReplayParameter(true);
                fractionTrackingLink.setReplayParameter("");
                list2.add(fractionTrackingLink);
            }
        }
    }

    private static ActionTrackingLink[] trackingToTrackingList(List<C5237c> list) {
        if (list == null) {
            return new ActionTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C5237c cVar : list) {
            ActionTrackingLink actionTrackingLink = new ActionTrackingLink();
            actionTrackingLink.setTrackingUrl(cVar.mo19327a());
            actionTrackingLink.setAppendReplayParameter(true);
            actionTrackingLink.setReplayParameter("");
            arrayList.add(actionTrackingLink);
        }
        return (ActionTrackingLink[]) arrayList.toArray(new ActionTrackingLink[arrayList.size()]);
    }

    private static ActionTrackingLink[] urlToTrackingList(List<String> list) {
        if (list == null) {
            return new ActionTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            ActionTrackingLink actionTrackingLink = new ActionTrackingLink();
            actionTrackingLink.setTrackingUrl(str);
            actionTrackingLink.setAppendReplayParameter(true);
            actionTrackingLink.setReplayParameter("");
            arrayList.add(actionTrackingLink);
        }
        return (ActionTrackingLink[]) arrayList.toArray(new ActionTrackingLink[arrayList.size()]);
    }

    private AbsoluteTrackingLink[] toAbsoluteTrackingList(List<C5237c> list) {
        if (list == null) {
            return new AbsoluteTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C5237c cVar : list) {
            AbsoluteTrackingLink absoluteTrackingLink = new AbsoluteTrackingLink();
            absoluteTrackingLink.setTrackingUrl(cVar.mo19327a());
            if (cVar.mo19328b() != -1) {
                absoluteTrackingLink.setVideoOffsetMillis(cVar.mo19328b());
            }
            absoluteTrackingLink.setAppendReplayParameter(true);
            absoluteTrackingLink.setReplayParameter("");
            arrayList.add(absoluteTrackingLink);
        }
        return (AbsoluteTrackingLink[]) arrayList.toArray(new AbsoluteTrackingLink[arrayList.size()]);
    }
}
