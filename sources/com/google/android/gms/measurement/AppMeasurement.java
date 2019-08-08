package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.measurement.internal.C4764aw;
import com.google.android.gms.measurement.internal.C4792bx;
import com.google.android.gms.measurement.internal.C4809cn;
import com.google.android.gms.measurement.internal.C4888m;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: a */
    private final C4764aw f15364a;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            C3513t.m12625a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            if (conditionalUserProperty.mValue != null) {
                this.mValue = C4809cn.m20645a(conditionalUserProperty.mValue);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public static final class C4740a extends C4792bx {
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return C4764aw.m20471a(context, (C4888m) null).mo17247i();
    }

    /* renamed from: a */
    public final void mo17094a(boolean z) {
        this.f15364a.mo17246h().mo17324a(z);
    }

    public AppMeasurement(C4764aw awVar) {
        C3513t.m12625a(awVar);
        this.f15364a = awVar;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f15364a.mo17246h().mo17318a(str, str2, bundle);
    }

    /* renamed from: a */
    public void mo17093a(String str, String str2, Object obj) {
        C3513t.m12627a(str);
        this.f15364a.mo17246h().mo17321a(str, str2, obj, true);
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f15364a.mo17246h().mo17331z();
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f15364a.mo17246h().mo17309A();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f15364a.mo17246h().mo17329x();
    }

    @Keep
    public String getGmpAppId() {
        return this.f15364a.mo17246h().mo17310B();
    }

    @Keep
    public long generateEventId() {
        return this.f15364a.mo17248j().mo17503g();
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f15364a.mo17228A().mo17140a(str, this.f15364a.mo17153m().mo13695b());
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f15364a.mo17228A().mo17142b(str, this.f15364a.mo17153m().mo13695b());
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        this.f15364a.mo17246h().mo17315a(conditionalUserProperty);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        this.f15364a.mo17246h().mo17325b(conditionalUserProperty);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f15364a.mo17246h().mo17327c(str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        this.f15364a.mo17246h().mo17323a(str, str2, str3, bundle);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f15364a.mo17246h().mo17314a(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        return this.f15364a.mo17246h().mo17313a(str, str2, str3, z);
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.f15364a.mo17246h().mo17311a(str, str2);
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        return this.f15364a.mo17246h().mo17312a(str, str2, str3);
    }

    @Keep
    public int getMaxUserProperties(String str) {
        this.f15364a.mo17246h();
        C3513t.m12627a(str);
        return 25;
    }
}
