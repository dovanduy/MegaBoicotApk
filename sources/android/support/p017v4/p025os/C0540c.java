package android.support.p017v4.p025os;

/* renamed from: android.support.v4.os.c */
/* compiled from: OperationCanceledException */
public class C0540c extends RuntimeException {
    public C0540c() {
        this(null);
    }

    public C0540c(String str) {
        if (str == null) {
            str = "The operation has been canceled.";
        }
        super(str);
    }
}
