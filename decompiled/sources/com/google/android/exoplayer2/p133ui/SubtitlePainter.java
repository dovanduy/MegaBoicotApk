package com.google.android.exoplayer2.p133ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.CaptionStyleCompat;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.ui.SubtitlePainter */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final String TAG = "SubtitlePainter";
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private int backgroundColor;
    private Rect bitmapRect;
    private float bottomPaddingFraction;
    private final float cornerRadius;
    private Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;
    private CharSequence cueText;
    private Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private int edgeType;
    private int foregroundColor;
    private final RectF lineBounds = new RectF();
    private final float outlineWidth;
    private final Paint paint;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final TextPaint textPaint;
    private int textTop;
    private int windowColor;

    public SubtitlePainter(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.spacingAdd = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((2.0f * ((float) context.getResources().getDisplayMetrics().densityDpi)) / 160.0f);
        this.cornerRadius = round;
        this.outlineWidth = round;
        this.shadowRadius = round;
        this.shadowOffset = round;
        this.textPaint = new TextPaint();
        this.textPaint.setAntiAlias(true);
        this.textPaint.setSubpixelText(true);
        this.paint = new Paint();
        this.paint.setAntiAlias(true);
        this.paint.setStyle(Style.FILL);
    }

    public void draw(Cue cue, boolean z, boolean z2, CaptionStyleCompat captionStyleCompat, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        Cue cue2 = cue;
        boolean z3 = z;
        boolean z4 = z2;
        CaptionStyleCompat captionStyleCompat2 = captionStyleCompat;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        Canvas canvas2 = canvas;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        boolean z5 = cue2.bitmap == null;
        int i9 = -16777216;
        if (z5) {
            if (!TextUtils.isEmpty(cue2.text)) {
                i9 = (!cue2.windowColorSet || !z3) ? captionStyleCompat2.windowColor : cue2.windowColor;
            } else {
                return;
            }
        }
        if (areCharSequencesEqual(this.cueText, cue2.text) && Util.areEqual(this.cueTextAlignment, cue2.textAlignment) && this.cueBitmap == cue2.bitmap && this.cueLine == cue2.line && this.cueLineType == cue2.lineType && Util.areEqual(Integer.valueOf(this.cueLineAnchor), Integer.valueOf(cue2.lineAnchor)) && this.cuePosition == cue2.position && Util.areEqual(Integer.valueOf(this.cuePositionAnchor), Integer.valueOf(cue2.positionAnchor)) && this.cueSize == cue2.size && this.cueBitmapHeight == cue2.bitmapHeight && this.applyEmbeddedStyles == z3 && this.applyEmbeddedFontSizes == z4 && this.foregroundColor == captionStyleCompat2.foregroundColor && this.backgroundColor == captionStyleCompat2.backgroundColor && this.windowColor == i9 && this.edgeType == captionStyleCompat2.edgeType && this.edgeColor == captionStyleCompat2.edgeColor && Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat2.typeface) && this.defaultTextSizePx == f4 && this.cueTextSizePx == f5 && this.bottomPaddingFraction == f6 && this.parentLeft == i5 && this.parentTop == i6 && this.parentRight == i7 && this.parentBottom == i8) {
            drawLayout(canvas, z5);
            return;
        }
        Canvas canvas3 = canvas;
        this.cueText = cue2.text;
        this.cueTextAlignment = cue2.textAlignment;
        this.cueBitmap = cue2.bitmap;
        this.cueLine = cue2.line;
        this.cueLineType = cue2.lineType;
        this.cueLineAnchor = cue2.lineAnchor;
        this.cuePosition = cue2.position;
        this.cuePositionAnchor = cue2.positionAnchor;
        this.cueSize = cue2.size;
        this.cueBitmapHeight = cue2.bitmapHeight;
        this.applyEmbeddedStyles = z3;
        this.applyEmbeddedFontSizes = z4;
        this.foregroundColor = captionStyleCompat2.foregroundColor;
        this.backgroundColor = captionStyleCompat2.backgroundColor;
        this.windowColor = i9;
        this.edgeType = captionStyleCompat2.edgeType;
        this.edgeColor = captionStyleCompat2.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat2.typeface);
        this.defaultTextSizePx = f4;
        this.cueTextSizePx = f5;
        this.bottomPaddingFraction = f6;
        this.parentLeft = i5;
        this.parentTop = i6;
        this.parentRight = i7;
        this.parentBottom = i8;
        if (z5) {
            setupTextLayout();
        } else {
            setupBitmapLayout();
        }
        drawLayout(canvas3, z5);
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r18v1 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r18v2 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cc A[LOOP:2: B:28:0x00ca->B:29:0x00cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupTextLayout() {
        /*
            r26 = this;
            r0 = r26
            int r1 = r0.parentRight
            int r2 = r0.parentLeft
            int r1 = r1 - r2
            int r2 = r0.parentBottom
            int r3 = r0.parentTop
            int r2 = r2 - r3
            android.text.TextPaint r3 = r0.textPaint
            float r4 = r0.defaultTextSizePx
            r3.setTextSize(r4)
            float r3 = r0.defaultTextSizePx
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            int r4 = r3 * 2
            int r5 = r1 - r4
            float r6 = r0.cueSize
            r7 = 1
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x002c
            float r5 = (float) r5
            float r6 = r0.cueSize
            float r5 = r5 * r6
            int r5 = (int) r5
        L_0x002c:
            if (r5 > 0) goto L_0x0036
            java.lang.String r1 = "SubtitlePainter"
            java.lang.String r2 = "Skipped drawing subtitle cue (insufficient space)"
            android.util.Log.w(r1, r2)
            return
        L_0x0036:
            java.lang.CharSequence r6 = r0.cueText
            boolean r8 = r0.applyEmbeddedStyles
            r16 = 0
            r15 = 0
            if (r8 != 0) goto L_0x0046
            java.lang.String r6 = r6.toString()
        L_0x0043:
            r18 = r6
            goto L_0x0099
        L_0x0046:
            boolean r8 = r0.applyEmbeddedFontSizes
            if (r8 != 0) goto L_0x007b
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r6)
            int r6 = r8.length()
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r9 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r9 = r8.getSpans(r15, r6, r9)
            android.text.style.AbsoluteSizeSpan[] r9 = (android.text.style.AbsoluteSizeSpan[]) r9
            java.lang.Class<android.text.style.RelativeSizeSpan> r10 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r6 = r8.getSpans(r15, r6, r10)
            android.text.style.RelativeSizeSpan[] r6 = (android.text.style.RelativeSizeSpan[]) r6
            int r10 = r9.length
            r11 = r15
        L_0x0065:
            if (r11 >= r10) goto L_0x006f
            r12 = r9[r11]
            r8.removeSpan(r12)
            int r11 = r11 + 1
            goto L_0x0065
        L_0x006f:
            int r9 = r6.length
            r10 = r15
        L_0x0071:
            if (r10 >= r9) goto L_0x0097
            r11 = r6[r10]
            r8.removeSpan(r11)
            int r10 = r10 + 1
            goto L_0x0071
        L_0x007b:
            float r8 = r0.cueTextSizePx
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0043
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r6)
            android.text.style.AbsoluteSizeSpan r6 = new android.text.style.AbsoluteSizeSpan
            float r9 = r0.cueTextSizePx
            int r9 = (int) r9
            r6.<init>(r9)
            int r9 = r8.length()
            r10 = 16711680(0xff0000, float:2.3418052E-38)
            r8.setSpan(r6, r15, r9, r10)
        L_0x0097:
            r18 = r8
        L_0x0099:
            android.text.Layout$Alignment r6 = r0.cueTextAlignment
            if (r6 != 0) goto L_0x00a2
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x009f:
            r21 = r6
            goto L_0x00a5
        L_0x00a2:
            android.text.Layout$Alignment r6 = r0.cueTextAlignment
            goto L_0x009f
        L_0x00a5:
            android.text.StaticLayout r6 = new android.text.StaticLayout
            android.text.TextPaint r10 = r0.textPaint
            float r13 = r0.spacingMult
            float r14 = r0.spacingAdd
            r17 = 1
            r8 = r6
            r9 = r18
            r11 = r5
            r12 = r21
            r15 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.textLayout = r6
            android.text.StaticLayout r6 = r0.textLayout
            int r6 = r6.getHeight()
            android.text.StaticLayout r8 = r0.textLayout
            int r8 = r8.getLineCount()
            r9 = 0
            r10 = 0
        L_0x00ca:
            if (r9 >= r8) goto L_0x00df
            android.text.StaticLayout r11 = r0.textLayout
            float r11 = r11.getLineWidth(r9)
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
            int r10 = java.lang.Math.max(r11, r10)
            int r9 = r9 + 1
            goto L_0x00ca
        L_0x00df:
            float r8 = r0.cueSize
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x00e8
            if (r10 >= r5) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r5 = r10
        L_0x00e9:
            int r5 = r5 + r4
            float r4 = r0.cuePosition
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r8 = 1
            r9 = 2
            if (r4 == 0) goto L_0x0119
            float r1 = (float) r1
            float r4 = r0.cuePosition
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
            int r4 = r0.parentLeft
            int r1 = r1 + r4
            int r4 = r0.cuePositionAnchor
            if (r4 != r9) goto L_0x0103
            int r1 = r1 - r5
            goto L_0x010b
        L_0x0103:
            int r4 = r0.cuePositionAnchor
            if (r4 != r8) goto L_0x010b
            int r1 = r1 * 2
            int r1 = r1 - r5
            int r1 = r1 / r9
        L_0x010b:
            int r4 = r0.parentLeft
            int r1 = java.lang.Math.max(r1, r4)
            int r5 = r5 + r1
            int r4 = r0.parentRight
            int r4 = java.lang.Math.min(r5, r4)
            goto L_0x011d
        L_0x0119:
            int r1 = r1 - r5
            int r1 = r1 / r9
            int r4 = r1 + r5
        L_0x011d:
            int r20 = r4 - r1
            if (r20 > 0) goto L_0x0129
            java.lang.String r1 = "SubtitlePainter"
            java.lang.String r2 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            android.util.Log.w(r1, r2)
            return
        L_0x0129:
            float r4 = r0.cueLine
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x018c
            int r4 = r0.cueLineType
            if (r4 != 0) goto L_0x013f
            float r2 = (float) r2
            float r4 = r0.cueLine
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r0.parentTop
            int r2 = r2 + r4
            goto L_0x016d
        L_0x013f:
            android.text.StaticLayout r2 = r0.textLayout
            r4 = 0
            int r2 = r2.getLineBottom(r4)
            android.text.StaticLayout r5 = r0.textLayout
            int r4 = r5.getLineTop(r4)
            int r2 = r2 - r4
            float r4 = r0.cueLine
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 < 0) goto L_0x015f
            float r4 = r0.cueLine
            float r2 = (float) r2
            float r4 = r4 * r2
            int r2 = java.lang.Math.round(r4)
            int r4 = r0.parentTop
            int r2 = r2 + r4
            goto L_0x016d
        L_0x015f:
            float r4 = r0.cueLine
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 + r5
            float r2 = (float) r2
            float r4 = r4 * r2
            int r2 = java.lang.Math.round(r4)
            int r4 = r0.parentBottom
            int r2 = r2 + r4
        L_0x016d:
            int r4 = r0.cueLineAnchor
            if (r4 != r9) goto L_0x0173
            int r2 = r2 - r6
            goto L_0x017b
        L_0x0173:
            int r4 = r0.cueLineAnchor
            if (r4 != r8) goto L_0x017b
            int r2 = r2 * 2
            int r2 = r2 - r6
            int r2 = r2 / r9
        L_0x017b:
            int r4 = r2 + r6
            int r5 = r0.parentBottom
            if (r4 <= r5) goto L_0x0185
            int r2 = r0.parentBottom
            int r2 = r2 - r6
            goto L_0x0196
        L_0x0185:
            int r4 = r0.parentTop
            if (r2 >= r4) goto L_0x0196
            int r2 = r0.parentTop
            goto L_0x0196
        L_0x018c:
            int r4 = r0.parentBottom
            int r4 = r4 - r6
            float r2 = (float) r2
            float r5 = r0.bottomPaddingFraction
            float r2 = r2 * r5
            int r2 = (int) r2
            int r2 = r4 - r2
        L_0x0196:
            android.text.StaticLayout r4 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.textPaint
            float r6 = r0.spacingMult
            float r7 = r0.spacingAdd
            r24 = 1
            r17 = r4
            r19 = r5
            r22 = r6
            r23 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.textLayout = r4
            r0.textLeft = r1
            r0.textTop = r2
            r0.textPaddingX = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p133ui.SubtitlePainter.setupTextLayout():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupBitmapLayout() {
        /*
            r7 = this;
            int r0 = r7.parentRight
            int r1 = r7.parentLeft
            int r0 = r0 - r1
            int r1 = r7.parentBottom
            int r2 = r7.parentTop
            int r1 = r1 - r2
            int r2 = r7.parentLeft
            float r2 = (float) r2
            float r0 = (float) r0
            float r3 = r7.cuePosition
            float r3 = r3 * r0
            float r2 = r2 + r3
            int r3 = r7.parentTop
            float r3 = (float) r3
            float r1 = (float) r1
            float r4 = r7.cueLine
            float r4 = r4 * r1
            float r3 = r3 + r4
            float r4 = r7.cueSize
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            float r4 = r7.cueBitmapHeight
            r5 = 1
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0030
            float r4 = r7.cueBitmapHeight
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
            goto L_0x0045
        L_0x0030:
            float r1 = (float) r0
            android.graphics.Bitmap r4 = r7.cueBitmap
            int r4 = r4.getHeight()
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r7.cueBitmap
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
        L_0x0045:
            int r4 = r7.cueLineAnchor
            r5 = 1
            r6 = 2
            if (r4 != r6) goto L_0x004e
            float r4 = (float) r0
        L_0x004c:
            float r2 = r2 - r4
            goto L_0x0056
        L_0x004e:
            int r4 = r7.cueLineAnchor
            if (r4 != r5) goto L_0x0056
            int r4 = r0 / 2
            float r4 = (float) r4
            goto L_0x004c
        L_0x0056:
            int r2 = java.lang.Math.round(r2)
            int r4 = r7.cuePositionAnchor
            if (r4 != r6) goto L_0x0061
            float r4 = (float) r1
        L_0x005f:
            float r3 = r3 - r4
            goto L_0x0069
        L_0x0061:
            int r4 = r7.cuePositionAnchor
            if (r4 != r5) goto L_0x0069
            int r4 = r1 / 2
            float r4 = (float) r4
            goto L_0x005f
        L_0x0069:
            int r3 = java.lang.Math.round(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r0 = r0 + r2
            int r1 = r1 + r3
            r4.<init>(r2, r3, r0, r1)
            r7.bitmapRect = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p133ui.SubtitlePainter.setupBitmapLayout():void");
    }

    private void drawLayout(Canvas canvas, boolean z) {
        if (z) {
            drawTextLayout(canvas);
        } else {
            drawBitmapLayout(canvas);
        }
    }

    private void drawTextLayout(Canvas canvas) {
        int i;
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            int save = canvas.save();
            canvas.translate((float) this.textLeft, (float) this.textTop);
            if (Color.alpha(this.windowColor) > 0) {
                this.paint.setColor(this.windowColor);
                canvas.drawRect((float) (-this.textPaddingX), 0.0f, (float) (staticLayout.getWidth() + this.textPaddingX), (float) staticLayout.getHeight(), this.paint);
            }
            if (Color.alpha(this.backgroundColor) > 0) {
                this.paint.setColor(this.backgroundColor);
                float lineTop = (float) staticLayout.getLineTop(0);
                int lineCount = staticLayout.getLineCount();
                float f = lineTop;
                for (int i2 = 0; i2 < lineCount; i2++) {
                    float lineLeft = staticLayout.getLineLeft(i2);
                    float lineRight = staticLayout.getLineRight(i2);
                    this.lineBounds.left = lineLeft - ((float) this.textPaddingX);
                    this.lineBounds.right = ((float) this.textPaddingX) + lineRight;
                    this.lineBounds.top = f;
                    this.lineBounds.bottom = (float) staticLayout.getLineBottom(i2);
                    f = this.lineBounds.bottom;
                    if (lineRight - lineLeft > 0.0f) {
                        canvas.drawRoundRect(this.lineBounds, this.cornerRadius, this.cornerRadius, this.paint);
                    }
                }
            }
            boolean z = true;
            if (this.edgeType == 1) {
                this.textPaint.setStrokeJoin(Join.ROUND);
                this.textPaint.setStrokeWidth(this.outlineWidth);
                this.textPaint.setColor(this.edgeColor);
                this.textPaint.setStyle(Style.FILL_AND_STROKE);
                staticLayout.draw(canvas);
            } else if (this.edgeType == 2) {
                this.textPaint.setShadowLayer(this.shadowRadius, this.shadowOffset, this.shadowOffset, this.edgeColor);
            } else if (this.edgeType == 3 || this.edgeType == 4) {
                if (this.edgeType != 3) {
                    z = false;
                }
                int i3 = -1;
                if (z) {
                    i = -1;
                } else {
                    i = this.edgeColor;
                }
                if (z) {
                    i3 = this.edgeColor;
                }
                float f2 = this.shadowRadius / 2.0f;
                this.textPaint.setColor(this.foregroundColor);
                this.textPaint.setStyle(Style.FILL);
                float f3 = -f2;
                this.textPaint.setShadowLayer(this.shadowRadius, f3, f3, i);
                staticLayout.draw(canvas);
                this.textPaint.setShadowLayer(this.shadowRadius, f2, f2, i3);
            }
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Style.FILL);
            staticLayout.draw(canvas);
            this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, null, this.bitmapRect, null);
    }

    private static boolean areCharSequencesEqual(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}
