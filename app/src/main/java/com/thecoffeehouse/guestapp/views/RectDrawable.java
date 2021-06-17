package com.thecoffeehouse.guestapp.views;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0007H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-H\u0014J\u0010\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0007H\u0016J\u0012\u00100\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u000102H\u0016R\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001b¨\u00063"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/RectDrawable;", "Landroid/graphics/drawable/Drawable;", "wrappedBitmap", "Landroid/graphics/Bitmap;", "strokeWidth", "", "strokeColor", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "cornerRadius", "", "(Landroid/graphics/Bitmap;FIII[F)V", "bitmap", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "borderPaint", "Landroid/graphics/Paint;", "getBorderPaint", "()Landroid/graphics/Paint;", "setBorderPaint", "(Landroid/graphics/Paint;)V", "getCornerRadius", "()[F", "getHeight", "()I", "maskPaint", "getMaskPaint", "setMaskPaint", "side", "getSide", "setSide", "(I)V", "getStrokeWidth", "()F", "getWidth", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "setAlpha", "alpha", "setColorFilter", "cf", "Landroid/graphics/ColorFilter;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TLImageView.kt */
public final class RectDrawable extends Drawable {
    private Bitmap bitmap;
    private Paint borderPaint;
    private final float[] cornerRadius;
    private final int height;
    private Paint maskPaint;
    private int side;
    private final float strokeWidth;
    private final int width;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public RectDrawable(Bitmap bitmap2, float f, int i, int i2, int i3, float[] fArr) {
        Intrinsics.checkNotNullParameter(bitmap2, "wrappedBitmap");
        Intrinsics.checkNotNullParameter(fArr, "cornerRadius");
        this.strokeWidth = f;
        this.width = i2;
        this.height = i3;
        this.cornerRadius = fArr;
        this.bitmap = bitmap2;
        this.maskPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.borderPaint = paint;
        if (f > ((float) 0)) {
            paint.setStyle(Paint.Style.STROKE);
            this.borderPaint.setStrokeWidth(f);
            this.borderPaint.setColor(i);
        } else {
            paint.setStyle(Paint.Style.FILL);
            this.borderPaint.setColor(0);
        }
        this.side = Math.min(this.bitmap.getWidth(), this.bitmap.getHeight());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RectDrawable(android.graphics.Bitmap r8, float r9, int r10, int r11, int r12, float[] r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r14 = r14 & 32
            if (r14 == 0) goto L_0x0013
            r13 = 8
            float[] r14 = new float[r13]
            r15 = 0
        L_0x0009:
            if (r15 >= r13) goto L_0x0011
            r0 = 0
            r14[r15] = r0
            int r15 = r15 + 1
            goto L_0x0009
        L_0x0011:
            r6 = r14
            goto L_0x0014
        L_0x0013:
            r6 = r13
        L_0x0014:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thecoffeehouse.guestapp.views.RectDrawable.<init>(android.graphics.Bitmap, float, int, int, int, float[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final float[] getCornerRadius() {
        return this.cornerRadius;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final void setBitmap(Bitmap bitmap2) {
        Intrinsics.checkNotNullParameter(bitmap2, "<set-?>");
        this.bitmap = bitmap2;
    }

    public final Paint getMaskPaint() {
        return this.maskPaint;
    }

    public final void setMaskPaint(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.maskPaint = paint;
    }

    public final Paint getBorderPaint() {
        return this.borderPaint;
    }

    public final void setBorderPaint(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.borderPaint = paint;
    }

    public final int getSide() {
        return this.side;
    }

    public final void setSide(int i) {
        this.side = i;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "bounds");
        Matrix matrix = new Matrix();
        int i = this.side;
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i);
        rectF.offset(((float) (this.bitmap.getWidth() - this.side)) / 2.0f, ((float) (this.bitmap.getHeight() - this.side)) / 2.0f);
        RectF rectF2 = new RectF(rect);
        if (this.borderPaint.getStrokeWidth() > ((float) 0)) {
            rectF2.inset(this.borderPaint.getStrokeWidth(), this.borderPaint.getStrokeWidth());
        }
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        BitmapShader bitmapShader = new BitmapShader(this.bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(matrix);
        this.maskPaint.setShader(bitmapShader);
        matrix.mapRect(rectF);
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRect(new RectF(0.0f, 0.0f, (float) this.width, (float) this.height), this.maskPaint);
        if (this.strokeWidth > ((float) 0)) {
            float f = this.strokeWidth;
            float f2 = (float) 2;
            canvas.drawRect(new RectF((f / f2) + 0.0f, (f / f2) + 0.0f, ((float) this.width) - (f / f2), ((float) this.height) - (f / f2)), this.borderPaint);
        }
    }
}
