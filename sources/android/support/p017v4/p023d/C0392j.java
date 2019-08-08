package android.support.p017v4.p023d;

/* renamed from: android.support.v4.d.j */
/* compiled from: Pair */
public class C0392j<F, S> {

    /* renamed from: a */
    public final F f993a;

    /* renamed from: b */
    public final S f994b;

    public C0392j(F f, S s) {
        this.f993a = f;
        this.f994b = s;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0392j)) {
            return false;
        }
        C0392j jVar = (C0392j) obj;
        if (C0391i.m1460a(jVar.f993a, this.f993a) && C0391i.m1460a(jVar.f994b, this.f994b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f993a == null ? 0 : this.f993a.hashCode();
        if (this.f994b != null) {
            i = this.f994b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.f993a));
        sb.append(" ");
        sb.append(String.valueOf(this.f994b));
        sb.append("}");
        return sb.toString();
    }
}
