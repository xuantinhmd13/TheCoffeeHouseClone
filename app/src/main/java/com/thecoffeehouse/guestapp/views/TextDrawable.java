package com.thecoffeehouse.guestapp.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

public class TextDrawable extends Drawable {
    private static final int DEFAULT_COLOR = -1;
    private static final int DEFAULT_TEXTSIZE = 15;
    private int mIntrinsicHeight = this.mPaint.getFontMetricsInt(null);
    private int mIntrinsicWidth;
    private Paint mPaint;
    private CharSequence mText;

    public TextDrawable(Context context, CharSequence charSequence, Integer num, Integer num2) {
        this.mText = charSequence;
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setColor(ContextCompat.getColor(context, num2.intValue()));
        this.mPaint.setTypeface(ResourcesCompat.getFont(context, num.intValue()));
        this.mPaint.setTextAlign(Paint.Align.CENTER);
        this.mPaint.setTextSize(TypedValue.applyDimension(2, 15.0f, context.getResources().getDisplayMetrics()));
        Paint paint2 = this.mPaint;
        CharSequence charSequence2 = this.mText;
        this.mIntrinsicWidth = (int) (((double) paint2.measureText(charSequence2, 0, charSequence2.length())) + 0.5d);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        CharSequence charSequence = this.mText;
        canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) bounds.centerY(), this.mPaint);
    }

    public int getOpacity() {
        return this.mPaint.getAlpha();
    }

    public int getIntrinsicWidth() {
        return this.mIntrinsicWidth;
    }

    public int getIntrinsicHeight() {
        return this.mIntrinsicHeight;
    }

    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }
}
