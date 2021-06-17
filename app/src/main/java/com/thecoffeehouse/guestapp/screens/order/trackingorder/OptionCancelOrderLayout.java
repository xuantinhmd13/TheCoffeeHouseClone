package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.checkout.PaymentItemRadioButton;
import com.thecoffeehouse.guestapp.services.api.model.common.config.CancelReasonsItem;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0011@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0015@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/OptionCancelOrderLayout;", "Landroid/widget/FrameLayout;", "optionItem", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/CancelReasonsItem;", "context", "Landroid/content/Context;", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/config/CancelReasonsItem;Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "cancelReasonsItem", "getCancelReasonsItem", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/config/CancelReasonsItem;", "Landroid/view/View;", "lineDivider", "getLineDivider", "()Landroid/view/View;", "Landroid/widget/RadioButton;", "radioButton", "getRadioButton", "()Landroid/widget/RadioButton;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OptionCancelOrderLayout.kt */
public final class OptionCancelOrderLayout extends FrameLayout {
    private HashMap _$_findViewCache;
    private CancelReasonsItem cancelReasonsItem;
    private View lineDivider;
    private RadioButton radioButton;

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

    public final CancelReasonsItem getCancelReasonsItem() {
        CancelReasonsItem cancelReasonsItem2 = this.cancelReasonsItem;
        if (cancelReasonsItem2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelReasonsItem");
        }
        return cancelReasonsItem2;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionCancelOrderLayout(CancelReasonsItem cancelReasonsItem2, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(cancelReasonsItem2, "optionItem");
        Intrinsics.checkNotNullParameter(context, "context");
        this.cancelReasonsItem = cancelReasonsItem2;
        PaymentItemRadioButton paymentItemRadioButton = new PaymentItemRadioButton(context);
        this.radioButton = paymentItemRadioButton;
        if (paymentItemRadioButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        paymentItemRadioButton.setGravity(8388627);
        RadioButton radioButton2 = this.radioButton;
        if (radioButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        RadioButton radioButton3 = radioButton2;
        TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[1];
        CancelReasonsItem cancelReasonsItem3 = this.cancelReasonsItem;
        if (cancelReasonsItem3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelReasonsItem");
        }
        textViewAttributeArr[0] = new TextViewAttribute(cancelReasonsItem3.getText(), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color333333), Integer.valueOf((int) R.font.sfpd_regular));
        TLTextViewKt.setTextMultipleFonts(radioButton3, textViewAttributeArr);
        RadioButton radioButton4 = this.radioButton;
        if (radioButton4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        addView(radioButton4);
        RadioButton radioButton5 = this.radioButton;
        if (radioButton5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        ViewExtsKt.marginStart(radioButton5, ViewExtsKt.DPtoPX(16.0f));
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
        ViewExtsKt.marginStart(view3, ViewExtsKt.DPtoPX(16.0f));
        View view4 = this.lineDivider;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineDivider");
        }
        view4.setBackground(ContextCompat.getDrawable(context, R.color.colorE3E3E3));
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionCancelOrderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionCancelOrderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
