package com.thecoffeehouse.guestapp.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.thecoffeehouse.guestapp.views.base.CustomTypefaceSpan;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"setHintMultipleFonts", "", "Landroid/widget/TextView;", "textAttribute", "", "Lcom/thecoffeehouse/guestapp/views/base/TextViewAttribute;", "(Landroid/widget/TextView;[Lcom/thecoffeehouse/guestapp/views/base/TextViewAttribute;)V", "setTextMultipleFonts", "app_liveRelease"}, k = 2, mv = {1, 4, 0})
/* compiled from: TLTextView.kt */
public final class TLTextViewKt {
    public static final void setTextMultipleFonts(TextView textView, TextViewAttribute... textViewAttributeArr) {
        Intrinsics.checkNotNullParameter(textView, "$this$setTextMultipleFonts");
        Intrinsics.checkNotNullParameter(textViewAttributeArr, "textAttribute");
        String str = "";
        for (int i = 0; i < textViewAttributeArr.length; i++) {
            str = str + textViewAttributeArr[i].getText();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i2 = 0;
        for (TextViewAttribute textViewAttribute : textViewAttributeArr) {
            if (textViewAttribute.getTextColor() != null) {
                Context context = textView.getContext();
                Integer textColor = textViewAttribute.getTextColor();
                Intrinsics.checkNotNull(textColor);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(textColor.intValue())), i2, textViewAttribute.getText().length() + i2, 33);
            }
            if (textViewAttribute.getTextSize() != null) {
                Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "this.context");
                Resources resources = context2.getResources();
                Integer textSize = textViewAttribute.getTextSize();
                Intrinsics.checkNotNull(textSize);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(resources.getDimensionPixelOffset(textSize.intValue())), i2, textViewAttribute.getText().length() + i2, 33);
            }
            if (textViewAttribute.getFont() != null) {
                Context context3 = textView.getContext();
                Integer font = textViewAttribute.getFont();
                Intrinsics.checkNotNull(font);
                Typeface font2 = ResourcesCompat.getFont(context3, font.intValue());
                Intrinsics.checkNotNull(font2);
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("", font2), i2, textViewAttribute.getText().length() + i2, 33);
            }
            i2 += textViewAttribute.getText().length();
        }
        textView.setText(spannableStringBuilder);
    }

    public static final void setHintMultipleFonts(TextView textView, TextViewAttribute... textViewAttributeArr) {
        Intrinsics.checkNotNullParameter(textView, "$this$setHintMultipleFonts");
        Intrinsics.checkNotNullParameter(textViewAttributeArr, "textAttribute");
        String str = "";
        for (int i = 0; i < textViewAttributeArr.length; i++) {
            str = str + textViewAttributeArr[i].getText();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i2 = 0;
        for (TextViewAttribute textViewAttribute : textViewAttributeArr) {
            if (textViewAttribute.getTextColor() != null) {
                Integer textColor = textViewAttribute.getTextColor();
                Intrinsics.checkNotNull(textColor);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(textColor.intValue()), i2, textViewAttribute.getText().length() + i2, 33);
            }
            if (textViewAttribute.getTextSize() != null) {
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "this.context");
                Resources resources = context.getResources();
                Integer textSize = textViewAttribute.getTextSize();
                Intrinsics.checkNotNull(textSize);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(resources.getDimensionPixelOffset(textSize.intValue())), i2, textViewAttribute.getText().length() + i2, 33);
            }
            if (textViewAttribute.getFont() != null) {
                Context context2 = textView.getContext();
                Integer font = textViewAttribute.getFont();
                Intrinsics.checkNotNull(font);
                Typeface font2 = ResourcesCompat.getFont(context2, font.intValue());
                Intrinsics.checkNotNull(font2);
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("", font2), i2, textViewAttribute.getText().length() + i2, 33);
            }
            i2 += textViewAttribute.getText().length();
        }
        textView.setHint(spannableStringBuilder);
    }
}
