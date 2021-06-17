package com.thecoffeehouse.guestapp.views.base;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/base/CustomTypefaceSpan;", "Landroid/text/style/TypefaceSpan;", "family", "", "type", "Landroid/graphics/Typeface;", "(Ljava/lang/String;Landroid/graphics/Typeface;)V", "newType", "applyCustomTypeface", "", "ds", "Landroid/text/TextPaint;", "updateDrawState", "updateMeasureState", "paint", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TextView.kt */
public final class CustomTypefaceSpan extends TypefaceSpan {
    private Typeface newType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomTypefaceSpan(String str, Typeface typeface) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "family");
        Intrinsics.checkNotNullParameter(typeface, "type");
        this.newType = typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        super.updateDrawState(textPaint);
        applyCustomTypeface(textPaint, this.newType);
    }

    private final void applyCustomTypeface(TextPaint textPaint, Typeface typeface) {
        Typeface typeface2 = textPaint.getTypeface();
        int style = (typeface2 != null ? typeface2.getStyle() : 0) & (~typeface.getStyle());
        if ((style & 1) != 0) {
            textPaint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            textPaint.setTextSkewX(-0.25f);
        }
        textPaint.setTypeface(typeface);
    }

    public void updateMeasureState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        applyCustomTypeface(textPaint, this.newType);
    }
}
