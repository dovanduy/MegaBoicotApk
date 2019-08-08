package com.startapp.android.publish.omsdk;

import com.startapp.common.p196c.C5548f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* compiled from: StartAppSDK */
public class AdVerification implements Serializable {
    private static final long serialVersionUID = 1;
    @C5548f(mo20535b = VerificationDetails.class, mo20539f = "adVerifications")
    private VerificationDetails[] adVerification;

    public AdVerification() {
    }

    public AdVerification(VerificationDetails[] verificationDetailsArr) {
        this.adVerification = verificationDetailsArr;
    }

    public List<VerificationDetails> getAdVerification() {
        if (this.adVerification == null) {
            return null;
        }
        return Arrays.asList(this.adVerification);
    }
}
