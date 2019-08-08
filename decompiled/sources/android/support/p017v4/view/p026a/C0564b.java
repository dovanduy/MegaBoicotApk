package android.support.p017v4.view.p026a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.appnext.base.p046b.C1245d;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.source.ExtractorMediaSource;

/* renamed from: android.support.v4.view.a.b */
/* compiled from: AccessibilityNodeInfoCompat */
public class C0564b {

    /* renamed from: a */
    public int f1371a = -1;

    /* renamed from: b */
    private final AccessibilityNodeInfo f1372b;

    /* renamed from: android.support.v4.view.a.b$a */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0565a {

        /* renamed from: A */
        public static final C0565a f1373A = new C0565a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null);

        /* renamed from: B */
        public static final C0565a f1374B = new C0565a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null);

        /* renamed from: C */
        public static final C0565a f1375C = new C0565a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null);

        /* renamed from: D */
        public static final C0565a f1376D = new C0565a(VERSION.SDK_INT >= 24 ? AccessibilityAction.ACTION_SET_PROGRESS : null);

        /* renamed from: E */
        public static final C0565a f1377E = new C0565a(VERSION.SDK_INT >= 26 ? AccessibilityAction.ACTION_MOVE_WINDOW : null);

        /* renamed from: F */
        public static final C0565a f1378F = new C0565a(VERSION.SDK_INT >= 28 ? AccessibilityAction.ACTION_SHOW_TOOLTIP : null);

        /* renamed from: G */
        public static final C0565a f1379G;

        /* renamed from: a */
        public static final C0565a f1380a = new C0565a(1, null);

        /* renamed from: b */
        public static final C0565a f1381b = new C0565a(2, null);

        /* renamed from: c */
        public static final C0565a f1382c = new C0565a(4, null);

        /* renamed from: d */
        public static final C0565a f1383d = new C0565a(8, null);

        /* renamed from: e */
        public static final C0565a f1384e = new C0565a(16, null);

        /* renamed from: f */
        public static final C0565a f1385f = new C0565a(32, null);

        /* renamed from: g */
        public static final C0565a f1386g = new C0565a(64, null);

        /* renamed from: h */
        public static final C0565a f1387h = new C0565a(128, null);

        /* renamed from: i */
        public static final C0565a f1388i = new C0565a(256, null);

        /* renamed from: j */
        public static final C0565a f1389j = new C0565a(512, null);

        /* renamed from: k */
        public static final C0565a f1390k = new C0565a(C1245d.f3947iP, null);

        /* renamed from: l */
        public static final C0565a f1391l = new C0565a(2048, null);

        /* renamed from: m */
        public static final C0565a f1392m = new C0565a(MpegAudioHeader.MAX_FRAME_SIZE_BYTES, null);

        /* renamed from: n */
        public static final C0565a f1393n = new C0565a(8192, null);

        /* renamed from: o */
        public static final C0565a f1394o = new C0565a(16384, null);

        /* renamed from: p */
        public static final C0565a f1395p = new C0565a(32768, null);

        /* renamed from: q */
        public static final C0565a f1396q = new C0565a(C2793C.DEFAULT_BUFFER_SEGMENT_SIZE, null);

        /* renamed from: r */
        public static final C0565a f1397r = new C0565a(131072, null);

        /* renamed from: s */
        public static final C0565a f1398s = new C0565a(262144, null);

        /* renamed from: t */
        public static final C0565a f1399t = new C0565a(524288, null);

        /* renamed from: u */
        public static final C0565a f1400u = new C0565a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);

        /* renamed from: v */
        public static final C0565a f1401v = new C0565a(2097152, null);

        /* renamed from: w */
        public static final C0565a f1402w = new C0565a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);

        /* renamed from: x */
        public static final C0565a f1403x = new C0565a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);

        /* renamed from: y */
        public static final C0565a f1404y = new C0565a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null);

        /* renamed from: z */
        public static final C0565a f1405z = new C0565a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null);

        /* renamed from: H */
        final Object f1406H;

        static {
            AccessibilityAction accessibilityAction = null;
            if (VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            f1379G = new C0565a(accessibilityAction);
        }

        public C0565a(int i, CharSequence charSequence) {
            this(VERSION.SDK_INT >= 21 ? new AccessibilityAction(i, charSequence) : null);
        }

        C0565a(Object obj) {
            this.f1406H = obj;
        }
    }

    /* renamed from: android.support.v4.view.a.b$b */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0566b {

        /* renamed from: a */
        final Object f1407a;

        /* renamed from: a */
        public static C0566b m2157a(int i, int i2, boolean z, int i3) {
            if (VERSION.SDK_INT >= 21) {
                return new C0566b(CollectionInfo.obtain(i, i2, z, i3));
            }
            if (VERSION.SDK_INT >= 19) {
                return new C0566b(CollectionInfo.obtain(i, i2, z));
            }
            return new C0566b(null);
        }

        C0566b(Object obj) {
            this.f1407a = obj;
        }
    }

    /* renamed from: android.support.v4.view.a.b$c */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0567c {

        /* renamed from: a */
        final Object f1408a;

        /* renamed from: a */
        public static C0567c m2158a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            if (VERSION.SDK_INT >= 21) {
                return new C0567c(CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (VERSION.SDK_INT >= 19) {
                return new C0567c(CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C0567c(null);
        }

        C0567c(Object obj) {
            this.f1408a = obj;
        }
    }

    /* renamed from: c */
    private static String m2110c(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case C1245d.f3947iP /*1024*/:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case MpegAudioHeader.MAX_FRAME_SIZE_BYTES /*4096*/:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case C2793C.DEFAULT_BUFFER_SEGMENT_SIZE /*65536*/:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    private C0564b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1372b = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0564b m2109a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0564b(accessibilityNodeInfo);
    }

    /* renamed from: a */
    public AccessibilityNodeInfo mo1993a() {
        return this.f1372b;
    }

    /* renamed from: a */
    public static C0564b m2108a(C0564b bVar) {
        return m2109a(AccessibilityNodeInfo.obtain(bVar.f1372b));
    }

    /* renamed from: a */
    public void mo1996a(View view) {
        this.f1372b.setSource(view);
    }

    /* renamed from: b */
    public void mo2004b(View view) {
        this.f1372b.addChild(view);
    }

    /* renamed from: b */
    public int mo2001b() {
        return this.f1372b.getActions();
    }

    /* renamed from: a */
    public void mo1994a(int i) {
        this.f1372b.addAction(i);
    }

    /* renamed from: a */
    public boolean mo2000a(C0565a aVar) {
        if (VERSION.SDK_INT >= 21) {
            return this.f1372b.removeAction((AccessibilityAction) aVar.f1406H);
        }
        return false;
    }

    /* renamed from: b */
    public void mo2002b(int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f1372b.setMovementGranularities(i);
        }
    }

    /* renamed from: c */
    public int mo2008c() {
        if (VERSION.SDK_INT >= 16) {
            return this.f1372b.getMovementGranularities();
        }
        return 0;
    }

    /* renamed from: c */
    public void mo2010c(View view) {
        this.f1372b.setParent(view);
    }

    /* renamed from: a */
    public void mo1995a(Rect rect) {
        this.f1372b.getBoundsInParent(rect);
    }

    /* renamed from: b */
    public void mo2003b(Rect rect) {
        this.f1372b.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public void mo2009c(Rect rect) {
        this.f1372b.getBoundsInScreen(rect);
    }

    /* renamed from: d */
    public void mo2013d(Rect rect) {
        this.f1372b.setBoundsInScreen(rect);
    }

    /* renamed from: d */
    public boolean mo2015d() {
        return this.f1372b.isCheckable();
    }

    /* renamed from: e */
    public boolean mo2017e() {
        return this.f1372b.isChecked();
    }

    /* renamed from: f */
    public boolean mo2020f() {
        return this.f1372b.isFocusable();
    }

    /* renamed from: a */
    public void mo1999a(boolean z) {
        this.f1372b.setFocusable(z);
    }

    /* renamed from: g */
    public boolean mo2022g() {
        return this.f1372b.isFocused();
    }

    /* renamed from: b */
    public void mo2007b(boolean z) {
        this.f1372b.setFocused(z);
    }

    /* renamed from: h */
    public boolean mo2024h() {
        if (VERSION.SDK_INT >= 16) {
            return this.f1372b.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: c */
    public void mo2012c(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f1372b.setVisibleToUser(z);
        }
    }

    /* renamed from: i */
    public boolean mo2027i() {
        if (VERSION.SDK_INT >= 16) {
            return this.f1372b.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: d */
    public void mo2014d(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f1372b.setAccessibilityFocused(z);
        }
    }

    /* renamed from: j */
    public boolean mo2029j() {
        return this.f1372b.isSelected();
    }

    /* renamed from: e */
    public void mo2016e(boolean z) {
        this.f1372b.setSelected(z);
    }

    /* renamed from: k */
    public boolean mo2030k() {
        return this.f1372b.isClickable();
    }

    /* renamed from: f */
    public void mo2019f(boolean z) {
        this.f1372b.setClickable(z);
    }

    /* renamed from: l */
    public boolean mo2031l() {
        return this.f1372b.isLongClickable();
    }

    /* renamed from: g */
    public void mo2021g(boolean z) {
        this.f1372b.setLongClickable(z);
    }

    /* renamed from: m */
    public boolean mo2032m() {
        return this.f1372b.isEnabled();
    }

    /* renamed from: h */
    public void mo2023h(boolean z) {
        this.f1372b.setEnabled(z);
    }

    /* renamed from: n */
    public boolean mo2033n() {
        return this.f1372b.isPassword();
    }

    /* renamed from: o */
    public boolean mo2034o() {
        return this.f1372b.isScrollable();
    }

    /* renamed from: i */
    public void mo2026i(boolean z) {
        this.f1372b.setScrollable(z);
    }

    /* renamed from: p */
    public CharSequence mo2035p() {
        return this.f1372b.getPackageName();
    }

    /* renamed from: a */
    public void mo1997a(CharSequence charSequence) {
        this.f1372b.setPackageName(charSequence);
    }

    /* renamed from: q */
    public CharSequence mo2036q() {
        return this.f1372b.getClassName();
    }

    /* renamed from: b */
    public void mo2005b(CharSequence charSequence) {
        this.f1372b.setClassName(charSequence);
    }

    /* renamed from: r */
    public CharSequence mo2037r() {
        return this.f1372b.getText();
    }

    /* renamed from: s */
    public CharSequence mo2038s() {
        return this.f1372b.getContentDescription();
    }

    /* renamed from: c */
    public void mo2011c(CharSequence charSequence) {
        this.f1372b.setContentDescription(charSequence);
    }

    /* renamed from: t */
    public void mo2039t() {
        this.f1372b.recycle();
    }

    /* renamed from: u */
    public String mo2041u() {
        if (VERSION.SDK_INT >= 18) {
            return this.f1372b.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: a */
    public void mo1998a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f1372b.setCollectionInfo(obj == null ? null : (CollectionInfo) ((C0566b) obj).f1407a);
        }
    }

    /* renamed from: b */
    public void mo2006b(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f1372b.setCollectionItemInfo(obj == null ? null : (CollectionItemInfo) ((C0567c) obj).f1408a);
        }
    }

    /* renamed from: j */
    public void mo2028j(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f1372b.setCanOpenPopup(z);
        }
    }

    public int hashCode() {
        if (this.f1372b == null) {
            return 0;
        }
        return this.f1372b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0564b bVar = (C0564b) obj;
        if (this.f1372b == null) {
            if (bVar.f1372b != null) {
                return false;
            }
        } else if (!this.f1372b.equals(bVar.f1372b)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo1995a(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        mo2009c(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(mo2035p());
        sb.append("; className: ");
        sb.append(mo2036q());
        sb.append("; text: ");
        sb.append(mo2037r());
        sb.append("; contentDescription: ");
        sb.append(mo2038s());
        sb.append("; viewId: ");
        sb.append(mo2041u());
        sb.append("; checkable: ");
        sb.append(mo2015d());
        sb.append("; checked: ");
        sb.append(mo2017e());
        sb.append("; focusable: ");
        sb.append(mo2020f());
        sb.append("; focused: ");
        sb.append(mo2022g());
        sb.append("; selected: ");
        sb.append(mo2029j());
        sb.append("; clickable: ");
        sb.append(mo2030k());
        sb.append("; longClickable: ");
        sb.append(mo2031l());
        sb.append("; enabled: ");
        sb.append(mo2032m());
        sb.append("; password: ");
        sb.append(mo2033n());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(mo2034o());
        sb.append(sb4.toString());
        sb.append("; [");
        int b = mo2001b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ -1;
            sb.append(m2110c(numberOfTrailingZeros));
            if (b != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
