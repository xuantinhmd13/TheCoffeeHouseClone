package com.thecoffeehouse.guestapp.screens.home;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LinePagerIndicatorDecoration extends RecyclerView.ItemDecoration {
    private static final float DP = Resources.getSystem().getDisplayMetrics().density;
    private int colorActive = -1;
    private int colorInactive = 1728053247;
    private final int mIndicatorHeight;
    private final float mIndicatorItemLength;
    private final float mIndicatorItemPadding;
    private final float mIndicatorStrokeWidth;
    private final Interpolator mInterpolator;
    private final Paint mPaint;

    public LinePagerIndicatorDecoration() {
        float f = DP;
        this.mIndicatorHeight = (int) (f * 16.0f);
        float f2 = 2.0f * f;
        this.mIndicatorStrokeWidth = f2;
        this.mIndicatorItemLength = 16.0f * f;
        this.mIndicatorItemPadding = f * 4.0f;
        this.mInterpolator = new AccelerateDecelerateInterpolator();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        int itemCount = recyclerView.getAdapter().getItemCount();
        float width = (((float) recyclerView.getWidth()) - ((this.mIndicatorItemLength * ((float) itemCount)) + (((float) Math.max(0, itemCount - 1)) * this.mIndicatorItemPadding))) / 2.0f;
        float height = ((float) recyclerView.getHeight()) - (((float) this.mIndicatorHeight) / 2.0f);
        drawInactiveIndicators(canvas, width, height, itemCount);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition != -1) {
            View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
            drawHighlights(canvas, width, height, findFirstVisibleItemPosition, this.mInterpolator.getInterpolation(((float) (findViewByPosition.getLeft() * -1)) / ((float) findViewByPosition.getWidth())), itemCount);
        }
    }

    private void drawInactiveIndicators(Canvas canvas, float f, float f2, int i) {
        this.mPaint.setColor(this.colorInactive);
        float f3 = this.mIndicatorItemLength + this.mIndicatorItemPadding;
        for (int i2 = 0; i2 < i; i2++) {
            canvas.drawLine(f, f2, f + this.mIndicatorItemLength, f2, this.mPaint);
            f += f3;
        }
    }

    private void drawHighlights(Canvas canvas, float f, float f2, int i, float f3, int i2) {
        this.mPaint.setColor(this.colorActive);
        float f4 = this.mIndicatorItemLength;
        float f5 = this.mIndicatorItemPadding + f4;
        if (f3 == 0.0f) {
            float f6 = f + (f5 * ((float) i));
            canvas.drawLine(f6, f2, f6 + f4, f2, this.mPaint);
            return;
        }
        float f7 = f + (((float) i) * f5);
        float f8 = f3 * f4;
        canvas.drawLine(f7 + f8, f2, f7 + f4, f2, this.mPaint);
        if (i < i2 - 1) {
            float f9 = f7 + f5;
            canvas.drawLine(f9, f2, f9 + f8, f2, this.mPaint);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        rect.bottom = -this.mIndicatorHeight;
    }
}
