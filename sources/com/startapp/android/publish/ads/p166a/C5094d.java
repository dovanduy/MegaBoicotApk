package com.startapp.android.publish.ads.p166a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5383a;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5383a.C5384a;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5385b;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5386c;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5387d;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5388e;
import com.startapp.android.publish.adsCommon.p183g.p185b.C5389a;
import com.startapp.android.publish.adsCommon.p183g.p185b.C5390b;
import com.startapp.android.publish.adsCommon.p183g.p186c.C5391a;
import com.startapp.common.p193a.C5513d;
import com.startapp.common.p193a.C5518g;
import java.util.Map;

/* renamed from: com.startapp.android.publish.ads.a.d */
/* compiled from: StartAppSDK */
public class C5094d extends C5086c {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5387d f16467i = C5387d.LOADING;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C5099b f16468j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C5390b f16469k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C5391a f16470l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ImageButton f16471m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f16472n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f16473o = false;

    /* renamed from: com.startapp.android.publish.ads.a.d$a */
    /* compiled from: StartAppSDK */
    private class C5098a extends C5388e {
        public C5098a(C5385b bVar) {
            super(bVar);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (C5094d.this.f16467i == C5387d.LOADING) {
                C5386c.m23033a("interstitial", webView);
                C5389a.m23036a(C5094d.this.mo18705b(), webView, C5094d.this.f16469k);
                C5094d.this.mo18756F();
                C5094d.this.m21975G();
                C5094d.this.f16467i = C5387d.DEFAULT;
                C5386c.m23032a(C5094d.this.f16467i, webView);
                C5386c.m23028a(webView);
                if (C5094d.this.f16473o) {
                    C5094d.this.f16468j.fireViewableChangeEvent();
                }
                C5094d.this.mo18738a((View) C5094d.this.f16471m);
            }
        }
    }

    /* renamed from: com.startapp.android.publish.ads.a.d$b */
    /* compiled from: StartAppSDK */
    private class C5099b extends C5383a {
        public C5099b(C5384a aVar) {
            super(aVar);
        }

        public void close() {
            C5518g.m23563a("MraidMode", 3, "close");
            C5094d.this.f16467i = C5387d.HIDDEN;
            C5386c.m23032a(C5094d.this.f16467i, C5094d.this.f16448d);
            C5094d.this.f16451g.run();
        }

        public void useCustomClose(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("useCustomClose: ");
            sb.append(str);
            C5518g.m23563a("MraidMode", 3, sb.toString());
            boolean parseBoolean = Boolean.parseBoolean(str);
            if (C5094d.this.f16472n != parseBoolean) {
                C5094d.this.f16472n = parseBoolean;
                if (parseBoolean) {
                    C5094d.this.m21977I();
                } else {
                    C5094d.this.m21976H();
                }
            }
        }

        public void setOrientationProperties(Map<String, String> map) {
            StringBuilder sb = new StringBuilder();
            sb.append("setOrientationProperties: ");
            sb.append(map);
            C5518g.m23563a("MraidMode", 3, sb.toString());
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
            String str = (String) map.get("forceOrientation");
            if (C5094d.this.f16470l.f17258a != parseBoolean || C5094d.this.f16470l.f17259b != C5391a.m23044a(str)) {
                C5094d.this.f16470l.f17258a = parseBoolean;
                C5094d.this.f16470l.f17259b = C5391a.m23044a(str);
                applyOrientationProperties(C5094d.this.mo18705b(), C5094d.this.f16470l);
            }
        }

        public boolean isFeatureSupported(String str) {
            return C5094d.this.f16469k.mo19933a(str);
        }

        public void fireViewableChangeEvent() {
            C5386c.m23031a(C5094d.this.f16448d, C5094d.this.f16473o);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo18743b(String str) {
        return false;
    }

    /* renamed from: a */
    public void mo18697a(Bundle bundle) {
        super.mo18697a(bundle);
        if (this.f16469k == null) {
            this.f16469k = new C5390b(mo18705b());
        }
        if (this.f16470l == null) {
            this.f16470l = new C5391a();
        }
        if (this.f16468j == null) {
            this.f16468j = new C5099b(new C5384a() {
                public boolean onClickEvent(String str) {
                    return C5094d.this.mo18741a(str, true);
                }
            });
        }
    }

    /* renamed from: u */
    public void mo18728u() {
        super.mo18728u();
        this.f16473o = true;
        if (this.f16467i == C5387d.DEFAULT) {
            this.f16468j.fireViewableChangeEvent();
        }
    }

    /* renamed from: a */
    public void mo18696a(Configuration configuration) {
        mo18756F();
    }

    /* renamed from: s */
    public void mo18726s() {
        this.f16473o = false;
        if (this.f16467i == C5387d.DEFAULT) {
            this.f16468j.fireViewableChangeEvent();
        }
        super.mo18726s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo18745x() {
        this.f16448d.setWebViewClient(new C5098a(this.f16468j));
        this.f16448d.setWebChromeClient(new WebChromeClient() {
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                try {
                    if (consoleMessage.messageLevel() == MessageLevel.ERROR) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("WebChromeClient console error: ");
                        sb.append(consoleMessage.message());
                        C5518g.m23563a("MraidMode", 6, sb.toString());
                        if (consoleMessage.message().contains("mraid")) {
                            C5378f.m23016a(C5094d.this.mo18705b(), C5376d.EXCEPTION, "MraidMode.ConsoleError", consoleMessage.message(), "");
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("WebChromeClient console log: ");
                        sb2.append(consoleMessage.message());
                        C5518g.m23563a("MraidMode", 3, sb2.toString());
                    }
                } catch (Exception e) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("WebChromeClient onConsoleMessage Exception: ");
                    sb3.append(e.getMessage());
                    C5518g.m23563a("MraidMode", 6, sb3.toString());
                }
                return super.onConsoleMessage(consoleMessage);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18741a(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("adClicked with url: ");
        sb.append(str);
        C5518g.m23563a("MraidMode", 3, sb.toString());
        this.f16467i = C5387d.HIDDEN;
        C5386c.m23032a(this.f16467i, this.f16448d);
        try {
            return super.mo18741a(str, z);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("url = [");
            sb2.append(str);
            sb2.append("], ");
            sb2.append(e.getMessage());
            C5378f.m23016a(mo18705b(), C5376d.EXCEPTION, "MraidMode.adClicked", sb2.toString(), "");
            return false;
        }
    }

    /* renamed from: F */
    public void mo18756F() {
        Activity b = mo18705b();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            C5386c.m23027a(b, i, i2, this.f16448d);
            C5386c.m23035b(b, i, i2, this.f16448d);
            C5386c.m23026a(b, 0, 0, i, i2, this.f16448d);
            C5386c.m23034b(b, 0, 0, i, i2, this.f16448d);
        } catch (Exception e) {
            C5378f.m23016a(b, C5376d.EXCEPTION, "MraidMode.updateDisplayMetrics", e.getMessage(), "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m21975G() {
        try {
            this.f16471m = new ImageButton(mo18705b());
            this.f16471m.setBackgroundColor(0);
            this.f16471m.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C5094d.this.f16468j.close();
                }
            });
            if (!this.f16472n) {
                m21976H();
            }
            int a = C5306h.m22641a((Context) mo18705b(), 50);
            LayoutParams layoutParams = new LayoutParams(a, a);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            this.f16450f.addView(this.f16471m, layoutParams);
        } catch (Exception e) {
            C5378f.m23016a(mo18705b(), C5376d.EXCEPTION, "MraidMode.addCloseRegion", e.getMessage(), "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m21976H() {
        try {
            if (this.f16471m != null) {
                this.f16471m.setImageDrawable(C5513d.m23540a(mo18705b().getResources(), "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA39pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDY3IDc5LjE1Nzc0NywgMjAxNS8wMy8zMC0yMzo0MDo0MiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDozODRkZTAxYi00OWRkLWM4NDYtYThkNC0wZWRiMDMwYTZlODAiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QkE0Q0U2MUY2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QkE0Q0U2MUU2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjlkZjAyMGU0LTNlYmUtZTY0ZC04YjRiLWM5ZWY4MTU4ZjFhYyIgc3RSZWY6ZG9jdW1lbnRJRD0iYWRvYmU6ZG9jaWQ6cGhvdG9zaG9wOmU1MzEzNDdlLTZjMDEtMTFlNS1hZGZlLThmMTBjZWYxMGRiZSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PngNsEEAAANeSURBVHjatFfNS1tBEH+pUZOQ0B4i3sTSxHMRFNQoFBEP7dHgvyDiKWgguQra9F+oxqNiwOTQ+oFI1ZM3jSf1YK5FL41ooaKZzu+x+4gv2bx9Rgd+JNn5zO7s7IzH0CQiCvLHZ8YnxkfGe8ZbwS4zSowTxi/GT4/Hc2u8BLHjCOM745b06VboRJpx7GN8ZfyDxUqlQgcHB5RMJmloaIg6Ozupra3NBL5jDTzIQFYQdDOw5db5B8YxLDw+PtLKygr19PQQWDqIRqOUzWZNXUHH2rvBgr2M39C6uLig/v5+bcd2QLdUKskgYLNX57yvIL2zs0OhUOjZziU6Ojro8PBQBnGl3Alm+BknkMI54mybdS4BW3t7ezKIInzVCwDJYm4Zon4p5xLYzfPzcxlEpl7S3SNpmjlznZwQiXn/5CjEnTUzt5GBsbExamlpUfLBg0wjG8vLy3IXlqTzEAoH7m4kElEqTk1Nmfd7bW2tbhBYAw8ykFXZgQ9RJ1CsQghgEr/29/eVStPT09XFhdbX18nr9Vr81tZWyuVyFh+yMzMzSnvwJWjyDS+MYic2NzeV17O7u9vg2m79jsfjBv9bg7PbxOrqqjExMWHxIdvV1aW0V+VrFDtwhFCGh4cbnl0mk6kp+BsbGybsBNlGtkZGRqToEQK4xjfUc6csXlhYcHyFFhcXHe3Al6BrQz427e3tWldpfn5e6Rw83cIkHyvXAUAZb4SdsKZbPe0BaB+Bz+cjTiDlDmxtbZkybo9AKwn9fj9tb2875gBkINvIFnzJJMQ1PMV9GBgYUF6bQCBgFAoFY3x8/Ml6KpUy0un0kzXIQBY6KqrydapViPL5fM0/Rfcj+fhuJw5CqxBpleJYLEY3NzeW8dnZ2RoZrEmCLHQcSvGdWYrFe7CEFTwUqqjR85XLZUokEkoZ8CADWe3HqKoTcnyOdW5KI5m+vj56eHiQz3G0bkNyeXn5ag3J2dmZ/PffVC1Z8bVast3d3eqWLKDVlAaDwaadh8Nhvaa0XluOHg7n9lzn0MWRarfltp0oysEErRqGDTeDCbK9ajApuh7TxGiWERlrjWZzc3M0ODhYM5phDTzbaHb/rNHMFkhUNK13LobTv6K2RJ3se1yO519s4/k7wf5jG89/6I7n/wUYAGo3YtcprD4sAAAAAElFTkSuQmCC"));
                this.f16471m.setScaleType(ScaleType.FIT_CENTER);
            }
        } catch (Exception e) {
            C5378f.m23016a(mo18705b(), C5376d.EXCEPTION, "MraidMode.showDefaultCloseButton", e.getMessage(), "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m21977I() {
        try {
            if (this.f16471m != null) {
                this.f16471m.setImageResource(17170445);
            }
        } catch (Exception e) {
            C5378f.m23016a(mo18705b(), C5376d.EXCEPTION, "MraidMode.removeDefaultCloseButton", e.getMessage(), "");
        }
    }
}
