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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0007H\u0016J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*H\u0014J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u0007H\u0016J\u0012\u0010-\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001e\"\u0004\b!\u0010\"¨\u00060"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/RoundDrawable;", "Landroid/graphics/drawable/Drawable;", "wrappedBitmap", "Landroid/graphics/Bitmap;", "strokeWidth", "", "strokeColor", "", "roundRectRadius", "(Landroid/graphics/Bitmap;FII)V", "bitmap", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "borderPaint", "Landroid/graphics/Paint;", "getBorderPaint", "()Landroid/graphics/Paint;", "setBorderPaint", "(Landroid/graphics/Paint;)V", "maskPaint", "getMaskPaint", "setMaskPaint", "radius", "getRadius", "()F", "setRadius", "(F)V", "getRoundRectRadius", "()I", "side", "getSide", "setSide", "(I)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "setAlpha", "alpha", "setColorFilter", "cf", "Landroid/graphics/ColorFilter;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TLImageView.kt */
public final class RoundDrawable extends Drawable {
    private Bitmap bitmap;
    private Paint borderPaint;
    private Paint maskPaint;
    private float radius;
    private final int roundRectRadius;
    private int side;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public RoundDrawable(Bitmap bitmap2, float f, int i, int i2) {
        Intrinsics.checkNotNullParameter(bitmap2, "wrappedBitmap");
        this.roundRectRadius = i2;
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoundDrawable(Bitmap bitmap2, float f, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap2, f, i, (i3 & 8) != 0 ? 0 : i2);
    }

    public final int getRoundRectRadius() {
        return this.roundRectRadius;
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

    public final float getRadius() {
        return this.radius;
    }

    public final void setRadius(float f) {
        this.radius = f;
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
        this.radius = rectF.width() / 2.0f;
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "bounds");
        if (this.roundRectRadius == 0) {
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), this.radius, this.maskPaint);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), this.radius + (this.borderPaint.getStrokeWidth() / ((float) 2)), this.borderPaint);
            return;
        }
        float f = (float) bounds.bottom;
        int i = this.roundRectRadius;
        canvas.drawRoundRect((float) bounds.left, (float) bounds.top, (float) bounds.right, f, (float) i, (float) i, this.borderPaint);
    }
}
