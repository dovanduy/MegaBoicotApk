package android.support.p017v4.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: android.support.v4.app.e */
/* compiled from: DialogFragment */
public class C0250e extends Fragment implements OnCancelListener, OnDismissListener {

    /* renamed from: a */
    int f517a = 0;

    /* renamed from: b */
    int f518b = 0;

    /* renamed from: c */
    boolean f519c = true;

    /* renamed from: d */
    boolean f520d = true;

    /* renamed from: e */
    int f521e = -1;

    /* renamed from: f */
    Dialog f522f;

    /* renamed from: g */
    boolean f523g;

    /* renamed from: h */
    boolean f524h;

    /* renamed from: i */
    boolean f525i;

    public void onCancel(DialogInterface dialogInterface) {
    }

    /* renamed from: a */
    public void mo827a(C0254i iVar, String str) {
        this.f524h = false;
        this.f525i = true;
        C0275l a = iVar.mo867a();
        a.mo806a(this, str);
        a.mo815b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo828a(boolean z) {
        if (!this.f524h) {
            this.f524h = true;
            this.f525i = false;
            if (this.f522f != null) {
                this.f522f.dismiss();
            }
            this.f523g = true;
            if (this.f521e >= 0) {
                mo630o().mo868a(this.f521e, 1);
                this.f521e = -1;
            } else {
                C0275l a = mo630o().mo867a();
                a.mo805a(this);
                if (z) {
                    a.mo820c();
                } else {
                    a.mo815b();
                }
            }
        }
    }

    /* renamed from: c */
    public Dialog mo830c() {
        return this.f522f;
    }

    /* renamed from: d */
    public int mo833d() {
        return this.f518b;
    }

    /* renamed from: b */
    public void mo829b(boolean z) {
        this.f519c = z;
        if (this.f522f != null) {
            this.f522f.setCancelable(z);
        }
    }

    /* renamed from: c */
    public void mo832c(boolean z) {
        this.f520d = z;
    }

    /* renamed from: a */
    public void mo565a(Context context) {
        super.mo565a(context);
        if (!this.f525i) {
            this.f524h = false;
        }
    }

    /* renamed from: e */
    public void mo602e() {
        super.mo602e();
        if (!this.f525i && !this.f524h) {
            this.f524h = true;
        }
    }

    /* renamed from: a */
    public void mo571a(Bundle bundle) {
        super.mo571a(bundle);
        this.f520d = this.f336I == 0;
        if (bundle != null) {
            this.f517a = bundle.getInt("android:style", 0);
            this.f518b = bundle.getInt("android:theme", 0);
            this.f519c = bundle.getBoolean("android:cancelable", true);
            this.f520d = bundle.getBoolean("android:showsDialog", this.f520d);
            this.f521e = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: b */
    public LayoutInflater mo589b(Bundle bundle) {
        if (!this.f520d) {
            return super.mo589b(bundle);
        }
        this.f522f = mo831c(bundle);
        if (this.f522f == null) {
            return (LayoutInflater) this.f330C.mo862g().getSystemService("layout_inflater");
        }
        mo826a(this.f522f, this.f517a);
        return (LayoutInflater) this.f522f.getContext().getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public void mo826a(Dialog dialog, int i) {
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
            default:
                return;
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: c */
    public Dialog mo831c(Bundle bundle) {
        return new Dialog(mo626m(), mo833d());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f523g) {
            mo828a(true);
        }
    }

    /* renamed from: d */
    public void mo598d(Bundle bundle) {
        super.mo598d(bundle);
        if (this.f520d) {
            View y = mo645y();
            if (y != null) {
                if (y.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f522f.setContentView(y);
            }
            FragmentActivity m = mo626m();
            if (m != null) {
                this.f522f.setOwnerActivity(m);
            }
            this.f522f.setCancelable(this.f519c);
            this.f522f.setOnCancelListener(this);
            this.f522f.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.f522f.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo606f() {
        super.mo606f();
        if (this.f522f != null) {
            this.f523g = false;
            this.f522f.show();
        }
    }

    /* renamed from: e */
    public void mo603e(Bundle bundle) {
        super.mo603e(bundle);
        if (this.f522f != null) {
            Bundle onSaveInstanceState = this.f522f.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        if (this.f517a != 0) {
            bundle.putInt("android:style", this.f517a);
        }
        if (this.f518b != 0) {
            bundle.putInt("android:theme", this.f518b);
        }
        if (!this.f519c) {
            bundle.putBoolean("android:cancelable", this.f519c);
        }
        if (!this.f520d) {
            bundle.putBoolean("android:showsDialog", this.f520d);
        }
        if (this.f521e != -1) {
            bundle.putInt("android:backStackId", this.f521e);
        }
    }

    /* renamed from: g */
    public void mo609g() {
        super.mo609g();
        if (this.f522f != null) {
            this.f522f.hide();
        }
    }

    /* renamed from: h */
    public void mo613h() {
        super.mo613h();
        if (this.f522f != null) {
            this.f523g = true;
            this.f522f.dismiss();
            this.f522f = null;
        }
    }
}
