package com.startapp.android.publish.adsCommon.Utils;

import com.google.android.exoplayer2.C2793C;
import com.startapp.common.C5552e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.android.publish.adsCommon.Utils.d */
/* compiled from: StartAppSDK */
public class C5301d extends C5302e {

    /* renamed from: a */
    private List<NameValueObject> f17034a;

    public C5301d() {
        this.f17034a = null;
        this.f17034a = new ArrayList();
    }

    /* renamed from: a */
    public void mo19620a(String str, Object obj, boolean z, boolean z2) {
        if (z && obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Required key: [");
            sb.append(str);
            sb.append("] is missing");
            throw new C5552e(sb.toString(), null);
        } else if (obj != null && !obj.toString().equals("")) {
            try {
                NameValueObject nameValueObject = new NameValueObject();
                nameValueObject.setName(str);
                String obj2 = obj.toString();
                if (z2) {
                    obj2 = URLEncoder.encode(obj2, C2793C.UTF8_NAME);
                }
                nameValueObject.setValue(obj2);
                this.f17034a.add(nameValueObject);
            } catch (UnsupportedEncodingException e) {
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("failed encoding value: [");
                    sb2.append(obj);
                    sb2.append("]");
                    throw new C5552e(sb2.toString(), e);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19621a(String str, Set<String> set, boolean z, boolean z2) {
        if (z && set == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Required key: [");
            sb.append(str);
            sb.append("] is missing");
            throw new C5552e(sb.toString(), null);
        } else if (set != null) {
            NameValueObject nameValueObject = new NameValueObject();
            nameValueObject.setName(str);
            HashSet hashSet = new HashSet();
            for (String str2 : set) {
                if (z2) {
                    try {
                        str2 = URLEncoder.encode(str2, C2793C.UTF8_NAME);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                hashSet.add(str2);
            }
            if (!z || hashSet.size() != 0) {
                nameValueObject.setValueSet(hashSet);
                this.f17034a.add(nameValueObject);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("failed encoding value: [");
            sb2.append(set);
            sb2.append("]");
            throw new C5552e(sb2.toString(), null);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f17034a == null) {
            return sb.toString();
        }
        sb.append('?');
        for (NameValueObject nameValueObject : this.f17034a) {
            if (nameValueObject.getValue() != null) {
                sb.append(nameValueObject.getName());
                sb.append('=');
                sb.append(nameValueObject.getValue());
                sb.append('&');
            } else if (nameValueObject.getValueSet() != null) {
                Set<String> valueSet = nameValueObject.getValueSet();
                if (valueSet != null) {
                    for (String str : valueSet) {
                        sb.append(nameValueObject.getName());
                        sb.append('=');
                        sb.append(str);
                        sb.append('&');
                    }
                }
            }
        }
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString().replace("+", "%20");
    }
}
