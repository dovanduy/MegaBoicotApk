package com.startapp.android.publish.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.common.p193a.C5513d;

/* compiled from: StartAppSDK */
public class CloseableLayout extends FrameLayout {

    /* renamed from: a */
    private final int f16510a;

    /* renamed from: b */
    private C5139b f16511b;

    /* renamed from: c */
    private final Drawable f16512c;

    /* renamed from: d */
    private C5138a f16513d;

    /* renamed from: e */
    private final int f16514e;

    /* renamed from: f */
    private final int f16515f;

    /* renamed from: g */
    private final int f16516g;

    /* renamed from: h */
    private boolean f16517h;

    /* renamed from: i */
    private final Rect f16518i;

    /* renamed from: j */
    private final Rect f16519j;

    /* renamed from: k */
    private final Rect f16520k;

    /* renamed from: l */
    private final Rect f16521l;

    /* renamed from: m */
    private boolean f16522m;

    /* renamed from: n */
    private C5140c f16523n;

    /* renamed from: com.startapp.android.publish.ads.banner.bannerstandard.CloseableLayout$a */
    /* compiled from: StartAppSDK */
    public enum C5138a {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);
        
        private final int mGravity;

        private C5138a(int i) {
            this.mGravity = i;
        }

        /* renamed from: a */
        public static C5138a m22073a(String str, C5138a aVar) {
            if (TextUtils.isEmpty(str)) {
                return aVar;
            }
            if (str.equals("top-left")) {
                return TOP_LEFT;
            }
            if (str.equals("top-right")) {
                return TOP_RIGHT;
            }
            if (str.equals(TtmlNode.CENTER)) {
                return CENTER;
            }
            if (str.equals("bottom-left")) {
                return BOTTOM_LEFT;
            }
            if (str.equals("bottom-right")) {
                return BOTTOM_RIGHT;
            }
            if (str.equals("top-center")) {
                return TOP_CENTER;
            }
            if (str.equals("bottom-center")) {
                return BOTTOM_CENTER;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid close position: ");
            sb.append(str);
            throw new Exception(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo18946a() {
            return this.mGravity;
        }
    }

    /* renamed from: com.startapp.android.publish.ads.banner.bannerstandard.CloseableLayout$b */
    /* compiled from: StartAppSDK */
    public interface C5139b {
        void onClose();
    }

    /* renamed from: com.startapp.android.publish.ads.banner.bannerstandard.CloseableLayout$c */
    /* compiled from: StartAppSDK */
    private final class C5140c implements Runnable {
        private C5140c() {
        }

        public void run() {
            CloseableLayout.this.setClosePressed(false);
        }
    }

    public CloseableLayout(Context context) {
        this(context, null, 0);
    }

    public CloseableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16518i = new Rect();
        this.f16519j = new Rect();
        this.f16520k = new Rect();
        this.f16521l = new Rect();
        this.f16512c = C5513d.m23540a(context.getResources(), "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA39pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDY3IDc5LjE1Nzc0NywgMjAxNS8wMy8zMC0yMzo0MDo0MiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDozODRkZTAxYi00OWRkLWM4NDYtYThkNC0wZWRiMDMwYTZlODAiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QkE0Q0U2MUY2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QkE0Q0U2MUU2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjlkZjAyMGU0LTNlYmUtZTY0ZC04YjRiLWM5ZWY4MTU4ZjFhYyIgc3RSZWY6ZG9jdW1lbnRJRD0iYWRvYmU6ZG9jaWQ6cGhvdG9zaG9wOmU1MzEzNDdlLTZjMDEtMTFlNS1hZGZlLThmMTBjZWYxMGRiZSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PngNsEEAAANeSURBVHjatFfNS1tBEH+pUZOQ0B4i3sTSxHMRFNQoFBEP7dHgvyDiKWgguQra9F+oxqNiwOTQ+oFI1ZM3jSf1YK5FL41ooaKZzu+x+4gv2bx9Rgd+JNn5zO7s7IzH0CQiCvLHZ8YnxkfGe8ZbwS4zSowTxi/GT4/Hc2u8BLHjCOM745b06VboRJpx7GN8ZfyDxUqlQgcHB5RMJmloaIg6Ozupra3NBL5jDTzIQFYQdDOw5db5B8YxLDw+PtLKygr19PQQWDqIRqOUzWZNXUHH2rvBgr2M39C6uLig/v5+bcd2QLdUKskgYLNX57yvIL2zs0OhUOjZziU6Ojro8PBQBnGl3Alm+BknkMI54mybdS4BW3t7ezKIInzVCwDJYm4Zon4p5xLYzfPzcxlEpl7S3SNpmjlznZwQiXn/5CjEnTUzt5GBsbExamlpUfLBg0wjG8vLy3IXlqTzEAoH7m4kElEqTk1Nmfd7bW2tbhBYAw8ykFXZgQ9RJ1CsQghgEr/29/eVStPT09XFhdbX18nr9Vr81tZWyuVyFh+yMzMzSnvwJWjyDS+MYic2NzeV17O7u9vg2m79jsfjBv9bg7PbxOrqqjExMWHxIdvV1aW0V+VrFDtwhFCGh4cbnl0mk6kp+BsbGybsBNlGtkZGRqToEQK4xjfUc6csXlhYcHyFFhcXHe3Al6BrQz427e3tWldpfn5e6Rw83cIkHyvXAUAZb4SdsKZbPe0BaB+Bz+cjTiDlDmxtbZkybo9AKwn9fj9tb2875gBkINvIFnzJJMQ1PMV9GBgYUF6bQCBgFAoFY3x8/Ml6KpUy0un0kzXIQBY6KqrydapViPL5fM0/Rfcj+fhuJw5CqxBpleJYLEY3NzeW8dnZ2RoZrEmCLHQcSvGdWYrFe7CEFTwUqqjR85XLZUokEkoZ8CADWe3HqKoTcnyOdW5KI5m+vj56eHiQz3G0bkNyeXn5ag3J2dmZ/PffVC1Z8bVast3d3eqWLKDVlAaDwaadh8Nhvaa0XluOHg7n9lzn0MWRarfltp0oysEErRqGDTeDCbK9ajApuh7TxGiWERlrjWZzc3M0ODhYM5phDTzbaHb/rNHMFkhUNK13LobTv6K2RJ3se1yO519s4/k7wf5jG89/6I7n/wUYAGo3YtcprD4sAAAAAElFTkSuQmCC");
        this.f16513d = C5138a.TOP_RIGHT;
        this.f16512c.setState(EMPTY_STATE_SET);
        this.f16512c.setCallback(this);
        this.f16510a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f16514e = C5306h.m22641a(context, 50);
        this.f16515f = C5306h.m22641a(context, 30);
        this.f16516g = C5306h.m22641a(context, 8);
        setWillNotDraw(false);
        this.f16522m = true;
    }

    public void setOnCloseListener(C5139b bVar) {
        this.f16511b = bVar;
    }

    public void setClosePosition(C5138a aVar) {
        this.f16513d = aVar;
        this.f16517h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z) {
        if (this.f16512c.setVisible(z, false)) {
            invalidate(this.f16519j);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f16517h = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f16517h) {
            this.f16517h = false;
            this.f16518i.set(0, 0, getWidth(), getHeight());
            mo18930a(this.f16513d, this.f16518i, this.f16519j);
            this.f16521l.set(this.f16519j);
            this.f16521l.inset(this.f16516g, this.f16516g);
            m22066b(this.f16513d, this.f16521l, this.f16520k);
            this.f16512c.setBounds(this.f16520k);
        }
        if (this.f16512c.isVisible()) {
            this.f16512c.draw(canvas);
        }
    }

    /* renamed from: a */
    public void mo18930a(C5138a aVar, Rect rect, Rect rect2) {
        m22064a(aVar, this.f16514e, rect, rect2);
    }

    /* renamed from: b */
    private void m22066b(C5138a aVar, Rect rect, Rect rect2) {
        m22064a(aVar, this.f16515f, rect, rect2);
    }

    /* renamed from: a */
    private void m22064a(C5138a aVar, int i, Rect rect, Rect rect2) {
        Gravity.apply(aVar.mo18946a(), i, i, rect, rect2);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return mo18932a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo18932a((int) motionEvent.getX(), (int) motionEvent.getY(), this.f16510a) || !mo18931a()) {
            setClosePressed(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    setClosePressed(true);
                    break;
                case 1:
                    if (mo18933b()) {
                        if (this.f16523n == null) {
                            this.f16523n = new C5140c();
                        }
                        postDelayed(this.f16523n, (long) ViewConfiguration.getPressedStateDuration());
                        m22067d();
                        break;
                    }
                    break;
            }
        } else {
            setClosePressed(false);
        }
        return true;
    }

    public void setCloseAlwaysInteractable(boolean z) {
        this.f16522m = z;
    }

    /* renamed from: a */
    public boolean mo18931a() {
        return this.f16522m || this.f16512c.isVisible();
    }

    /* access modifiers changed from: private */
    public void setClosePressed(boolean z) {
        if (z != mo18933b()) {
            this.f16512c.setState(z ? SELECTED_STATE_SET : EMPTY_STATE_SET);
            invalidate(this.f16519j);
        }
    }

    /* renamed from: b */
    public boolean mo18933b() {
        return this.f16512c.getState() == SELECTED_STATE_SET;
    }

    /* renamed from: a */
    public boolean mo18932a(int i, int i2, int i3) {
        return i >= this.f16519j.left - i3 && i2 >= this.f16519j.top - i3 && i < this.f16519j.right + i3 && i2 < this.f16519j.bottom + i3;
    }

    /* renamed from: d */
    private void m22067d() {
        playSoundEffect(0);
        if (this.f16511b != null) {
            this.f16511b.onClose();
        }
    }

    public void setCloseBounds(Rect rect) {
        this.f16519j.set(rect);
    }

    public Rect getCloseBounds() {
        return this.f16519j;
    }

    public void setCloseBoundChanged(boolean z) {
        this.f16517h = z;
    }

    /* renamed from: c */
    public boolean mo18934c() {
        return this.f16512c.isVisible();
    }
}
