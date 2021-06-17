package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.Item;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0002\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u001a@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/OptionItemRadioButtonLayout;", "Landroid/widget/FrameLayout;", "optionItem", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Item;", "context", "Landroid/content/Context;", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Item;Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "<set-?>", "Landroid/view/View;", "lineDivider", "getLineDivider", "()Landroid/view/View;", "getOptionItem", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Item;", "Landroid/widget/RadioButton;", "radioButton", "getRadioButton", "()Landroid/widget/RadioButton;", "Landroid/widget/TextView;", "textViewRightAlign", "getTextViewRightAlign", "()Landroid/widget/TextView;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OptionProductViews.kt */
public final class OptionItemRadioButtonLayout extends FrameLayout {
    private HashMap _$_findViewCache;
    private View lineDivider;
    private Item optionItem;
    private RadioButton radioButton;
    private TextView textViewRightAlign;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Item getOptionItem() {
        Item item = this.optionItem;
        if (item == null) {
            Intrinsics.throwUninitializedPropertyAccessException("optionItem");
        }
        return item;
    }

    public final RadioButton getRadioButton() {
        RadioButton radioButton2 = this.radioButton;
        if (radioButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        return radioButton2;
    }

    public final View getLineDivider() {
        View view = this.lineDivider;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineDivider");
        }
        return view;
    }

    public final TextView getTextViewRightAlign() {
        TextView textView = this.textViewRightAlign;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewRightAlign");
        }
        return textView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionItemRadioButtonLayout(Item item, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(item, "optionItem");
        Intrinsics.checkNotNullParameter(context, "context");
        this.optionItem = item;
        OptionItemRadioButton optionItemRadioButton = new OptionItemRadioButton(item, context);
        this.radioButton = optionItemRadioButton;
        if (optionItemRadioButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        optionItemRadioButton.setGravity(8388627);
        RadioButton radioButton2 = this.radioButton;
        if (radioButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        radioButton2.setText(item.getName());
        RadioButton radioButton3 = this.radioButton;
        if (radioButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        addView(radioButton3);
        TextView textView = new TextView(context);
        this.textViewRightAlign = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewRightAlign");
        }
        ViewExtsKt.formatHtmlCompact(textView, item.getPriceStr());
        TextView textView2 = this.textViewRightAlign;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewRightAlign");
        }
        textView2.setMaxLines(1);
        TextView textView3 = this.textViewRightAlign;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewRightAlign");
        }
        textView3.setGravity(8388629);
        TextView textView4 = this.textViewRightAlign;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewRightAlign");
        }
        textView4.setTypeface(ResourcesCompat.getFont(context, R.font.sfpd_regular));
        TextView textView5 = this.textViewRightAlign;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewRightAlign");
        }
        TextView textView6 = this.textViewRightAlign;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewRightAlign");
        }
        int paddingLeft = textView6.getPaddingLeft();
        TextView textView7 = this.textViewRightAlign;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewRightAlign");
        }
        int paddingTop = textView7.getPaddingTop();
        int DPtoPX = ViewExtsKt.DPtoPX(16.0f);
        TextView textView8 = this.textViewRightAlign;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewRightAlign");
        }
        textView5.setPadding(paddingLeft, paddingTop, DPtoPX, textView8.getPaddingBottom());
        TextView textView9 = this.textViewRightAlign;
        if (textView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewRightAlign");
        }
        addView(textView9);
        View view = new View(context);
        this.lineDivider = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineDivider");
        }
        addView(view);
        View view2 = this.lineDivider;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineDivider");
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = ViewExtsKt.DPtoPX(1.0f);
        View view3 = this.lineDivider;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineDivider");
        }
        view3.setBackground(ContextCompat.getDrawable(context, R.color.colorE3E3E3));
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionItemRadioButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionItemRadioButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionItemRadioButtonLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
