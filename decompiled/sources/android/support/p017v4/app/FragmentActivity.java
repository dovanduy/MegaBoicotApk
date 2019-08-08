package android.support.p017v4.app;

import android.arch.lifecycle.C0097c;
import android.arch.lifecycle.C0097c.C0099b;
import android.arch.lifecycle.C0116p;
import android.arch.lifecycle.C0117q;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.p017v4.app.C0236a.C0238a;
import android.support.p017v4.app.C0236a.C0239b;
import android.support.p017v4.app.C0236a.C0240c;
import android.support.p017v4.p023d.C0399n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.FragmentActivity */
public class FragmentActivity extends SupportActivity implements C0117q, C0238a, C0240c {

    /* renamed from: a */
    final Handler f399a = new Handler() {
        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            FragmentActivity.this.mo667c();
            FragmentActivity.this.f400b.mo860m();
        }
    };

    /* renamed from: b */
    final C0252g f400b = C0252g.m782a((C0253h<?>) new C0218a<Object>());

    /* renamed from: c */
    boolean f401c;

    /* renamed from: d */
    boolean f402d;

    /* renamed from: e */
    boolean f403e = true;

    /* renamed from: f */
    boolean f404f;

    /* renamed from: g */
    boolean f405g;

    /* renamed from: h */
    boolean f406h;

    /* renamed from: i */
    int f407i;

    /* renamed from: j */
    C0399n<String> f408j;

    /* renamed from: k */
    private C0116p f409k;

    /* renamed from: android.support.v4.app.FragmentActivity$a */
    class C0218a extends C0253h<FragmentActivity> {
        public C0218a() {
            super(FragmentActivity.this);
        }

        /* renamed from: a */
        public void mo702a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: a */
        public boolean mo703a(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        /* renamed from: b */
        public LayoutInflater mo704b() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        /* renamed from: c */
        public void mo706c() {
            FragmentActivity.this.mo661D_();
        }

        /* renamed from: a */
        public void mo701a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            FragmentActivity.this.mo664a(fragment, intent, i, bundle);
        }

        /* renamed from: d */
        public boolean mo707d() {
            return FragmentActivity.this.getWindow() != null;
        }

        /* renamed from: e */
        public int mo708e() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        /* renamed from: b */
        public void mo705b(Fragment fragment) {
            FragmentActivity.this.mo663a(fragment);
        }

        /* renamed from: a */
        public View mo649a(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: a */
        public boolean mo650a() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    /* renamed from: android.support.v4.app.FragmentActivity$b */
    static final class C0219b {

        /* renamed from: a */
        Object f412a;

        /* renamed from: b */
        C0116p f413b;

        /* renamed from: c */
        C0274k f414c;

        C0219b() {
        }
    }

    /* renamed from: a */
    public void mo663a(Fragment fragment) {
    }

    /* renamed from: d */
    public Object mo668d() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f400b.mo846b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.f408j.mo1414a(i4);
            this.f408j.mo1420c(i4);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.f400b.mo836a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w("FragmentActivity", sb.toString());
            } else {
                a.mo559a(i & 65535, i2, intent);
            }
            return;
        }
        C0239b a2 = C0236a.m714a();
        if (a2 == null || !a2.mo790a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        C0254i a = this.f400b.mo837a();
        boolean e = a.mo873e();
        if (!e || VERSION.SDK_INT > 25) {
            if (e || !a.mo871c()) {
                super.onBackPressed();
            }
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f400b.mo842a(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f400b.mo848b(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f400b.mo846b();
        this.f400b.mo839a(configuration);
    }

    /* renamed from: b */
    public C0116p mo162b() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f409k == null) {
            C0219b bVar = (C0219b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.f409k = bVar.f413b;
            }
            if (this.f409k == null) {
                this.f409k = new C0116p();
            }
        }
        return this.f409k;
    }

    /* renamed from: a */
    public C0097c mo139a() {
        return super.mo139a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0274k kVar = null;
        this.f400b.mo841a((Fragment) null);
        super.onCreate(bundle);
        C0219b bVar = (C0219b) getLastNonConfigurationInstance();
        if (!(bVar == null || bVar.f413b == null || this.f409k != null)) {
            this.f409k = bVar.f413b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0252g gVar = this.f400b;
            if (bVar != null) {
                kVar = bVar.f414c;
            }
            gVar.mo840a(parcelable, kVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f407i = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f408j = new C0399n<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f408j.mo1418b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f408j == null) {
            this.f408j = new C0399n<>();
            this.f407i = 0;
        }
        this.f400b.mo852e();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.f400b.mo844a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo662a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo662a((View) null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo662a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f400b.mo838a(view, str, context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f409k != null && !isChangingConfigurations()) {
            this.f409k.mo160a();
        }
        this.f400b.mo858k();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f400b.mo859l();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f400b.mo845a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f400b.mo849b(menuItem);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f400b.mo847b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f402d = false;
        if (this.f399a.hasMessages(2)) {
            this.f399a.removeMessages(2);
            mo667c();
        }
        this.f400b.mo856i();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f400b.mo846b();
    }

    public void onStateNotSaved() {
        this.f400b.mo846b();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f399a.sendEmptyMessage(2);
        this.f402d = true;
        this.f400b.mo860m();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f399a.removeMessages(2);
        mo667c();
        this.f400b.mo860m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo667c() {
        this.f400b.mo855h();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        return mo665a(view, menu) | this.f400b.mo843a(menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo665a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        Object d = mo668d();
        C0274k d2 = this.f400b.mo851d();
        if (d2 == null && this.f409k == null && d == null) {
            return null;
        }
        C0219b bVar = new C0219b();
        bVar.f412a = d;
        bVar.f413b = this.f409k;
        bVar.f414c = d2;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo2636h();
        Parcelable c = this.f400b.mo850c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        if (this.f408j.mo1416b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f407i);
            int[] iArr = new int[this.f408j.mo1416b()];
            String[] strArr = new String[this.f408j.mo1416b()];
            for (int i = 0; i < this.f408j.mo1416b(); i++) {
                iArr[i] = this.f408j.mo1423d(i);
                strArr[i] = (String) this.f408j.mo1424e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f403e = false;
        if (!this.f401c) {
            this.f401c = true;
            this.f400b.mo853f();
        }
        this.f400b.mo846b();
        this.f400b.mo860m();
        this.f400b.mo854g();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f403e = true;
        mo2636h();
        this.f400b.mo857j();
    }

    @Deprecated
    /* renamed from: D_ */
    public void mo661D_() {
        invalidateOptionsMenu();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.f401c);
        printWriter.print(" mResumed=");
        printWriter.print(this.f402d);
        printWriter.print(" mStopped=");
        printWriter.print(this.f403e);
        if (getApplication() != null) {
            C0297r.m1065a(this).mo766a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.f400b.mo837a().mo869a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: f */
    public C0254i mo670f() {
        return this.f400b.mo837a();
    }

    @Deprecated
    /* renamed from: g */
    public C0297r mo671g() {
        return C0297r.m1065a(this);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.f406h && i != -1) {
            m627b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f406h && i != -1) {
            m627b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws SendIntentException {
        if (!this.f405g && i != -1) {
            m627b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (!this.f405g && i != -1) {
            m627b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: b */
    static void m627b(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: a_ */
    public final void mo666a_(int i) {
        if (!this.f404f && i != -1) {
            m627b(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f400b.mo846b();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.f408j.mo1414a(i3);
            this.f408j.mo1420c(i3);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.f400b.mo836a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w("FragmentActivity", sb.toString());
            } else {
                a.mo561a(i & 65535, strArr, iArr);
            }
        }
    }

    /* renamed from: a */
    public void mo664a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.f406h = true;
        if (i == -1) {
            try {
                C0236a.m716a(this, intent, -1, bundle);
            } finally {
                this.f406h = false;
            }
        } else {
            m627b(i);
            C0236a.m716a(this, intent, ((m626b(fragment) + 1) << 16) + (i & 65535), bundle);
            this.f406h = false;
        }
    }

    /* renamed from: b */
    private int m626b(Fragment fragment) {
        if (this.f408j.mo1416b() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.f408j.mo1425f(this.f407i) >= 0) {
            this.f407i = (this.f407i + 1) % 65534;
        }
        int i = this.f407i;
        this.f408j.mo1418b(i, fragment.f365p);
        this.f407i = (this.f407i + 1) % 65534;
        return i;
    }

    /* renamed from: h */
    private void mo2636h() {
        do {
        } while (m625a(mo670f(), C0099b.CREATED));
    }

    /* renamed from: a */
    private static boolean m625a(C0254i iVar, C0099b bVar) {
        boolean z = false;
        for (Fragment fragment : iVar.mo872d()) {
            if (fragment != null) {
                if (fragment.mo139a().mo135a().mo138a(C0099b.STARTED)) {
                    fragment.f356ac.mo141a(bVar);
                    z = true;
                }
                C0254i q = fragment.mo635q();
                if (q != null) {
                    z |= m625a(q, bVar);
                }
            }
        }
        return z;
    }
}
