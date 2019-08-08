package android.support.p017v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p017v4.content.C0356c;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;

/* renamed from: android.support.v4.view.PagerTabStrip */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: g */
    private int f1312g = this.f1337f;

    /* renamed from: h */
    private int f1313h;

    /* renamed from: i */
    private int f1314i;

    /* renamed from: j */
    private int f1315j;

    /* renamed from: k */
    private int f1316k;

    /* renamed from: l */
    private int f1317l;

    /* renamed from: m */
    private final Paint f1318m = new Paint();

    /* renamed from: n */
    private final Rect f1319n = new Rect();

    /* renamed from: o */
    private int f1320o = 255;

    /* renamed from: p */
    private boolean f1321p = false;

    /* renamed from: q */
    private boolean f1322q = false;

    /* renamed from: r */
    private int f1323r;

    /* renamed from: s */
    private boolean f1324s;

    /* renamed from: t */
    private float f1325t;

    /* renamed from: u */
    private float f1326u;

    /* renamed from: v */
    private int f1327v;

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1318m.setColor(this.f1312g);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1313h = (int) ((3.0f * f) + 0.5f);
        this.f1314i = (int) ((6.0f * f) + 0.5f);
        this.f1315j = (int) (64.0f * f);
        this.f1317l = (int) ((16.0f * f) + 0.5f);
        this.f1323r = (int) ((1.0f * f) + 0.5f);
        this.f1316k = (int) ((32.0f * f) + 0.5f);
        this.f1327v = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f1333b.setFocusable(true);
        this.f1333b.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                PagerTabStrip.this.f1332a.setCurrentItem(PagerTabStrip.this.f1332a.getCurrentItem() - 1);
            }
        });
        this.f1335d.setFocusable(true);
        this.f1335d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                PagerTabStrip.this.f1332a.setCurrentItem(PagerTabStrip.this.f1332a.getCurrentItem() + 1);
            }
        });
        if (getBackground() == null) {
            this.f1321p = true;
        }
    }

    public void setTabIndicatorColor(int i) {
        this.f1312g = i;
        this.f1318m.setColor(this.f1312g);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(C0356c.m1321c(getContext(), i));
    }

    public int getTabIndicatorColor() {
        return this.f1312g;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f1314i) {
            i4 = this.f1314i;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTextSpacing(int i) {
        if (i < this.f1315j) {
            i = this.f1315j;
        }
        super.setTextSpacing(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f1322q) {
            this.f1321p = drawable == null;
        }
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f1322q) {
            this.f1321p = (i & -16777216) == 0;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f1322q) {
            this.f1321p = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f1321p = z;
        this.f1322q = true;
        invalidate();
    }

    public boolean getDrawFullUnderline() {
        return this.f1321p;
    }

    /* access modifiers changed from: 0000 */
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f1316k);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f1324s) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.f1325t = x;
                this.f1326u = y;
                this.f1324s = false;
                break;
            case 1:
                if (x >= ((float) (this.f1334c.getLeft() - this.f1317l))) {
                    if (x > ((float) (this.f1334c.getRight() + this.f1317l))) {
                        this.f1332a.setCurrentItem(this.f1332a.getCurrentItem() + 1);
                        break;
                    }
                } else {
                    this.f1332a.setCurrentItem(this.f1332a.getCurrentItem() - 1);
                    break;
                }
                break;
            case 2:
                if (Math.abs(x - this.f1325t) > ((float) this.f1327v) || Math.abs(y - this.f1326u) > ((float) this.f1327v)) {
                    this.f1324s = true;
                    break;
                }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f1334c.getLeft() - this.f1317l;
        int right = this.f1334c.getRight() + this.f1317l;
        int i = height - this.f1313h;
        this.f1318m.setColor((this.f1320o << 24) | (this.f1312g & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) i, (float) right, f, this.f1318m);
        if (this.f1321p) {
            this.f1318m.setColor(-16777216 | (this.f1312g & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f1323r), (float) (getWidth() - getPaddingRight()), f, this.f1318m);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1853a(int i, float f, boolean z) {
        Rect rect = this.f1319n;
        int height = getHeight();
        int i2 = height - this.f1313h;
        rect.set(this.f1334c.getLeft() - this.f1317l, i2, this.f1334c.getRight() + this.f1317l, height);
        super.mo1853a(i, f, z);
        this.f1320o = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f1334c.getLeft() - this.f1317l, i2, this.f1334c.getRight() + this.f1317l, height);
        invalidate(rect);
    }
}
