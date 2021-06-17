package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0002\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0017@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/OptionPaymentLayout;", "Landroid/widget/FrameLayout;", "optionItem", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;", "context", "Landroid/content/Context;", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "<set-?>", "Landroid/view/View;", "lineDivider", "getLineDivider", "()Landroid/view/View;", "paymentMethod", "getPaymentMethod", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;", "Landroid/widget/RadioButton;", "radioButton", "getRadioButton", "()Landroid/widget/RadioButton;", "Landroid/widget/TextView;", "textViewRightAlign", "getTextViewRightAlign", "()Landroid/widget/TextView;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OptionPayment.kt */
public final class OptionPaymentLayout extends FrameLayout {
    private HashMap _$_findViewCache;
    private View lineDivider;
    private Payment paymentMethod;
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

    public static final /* synthetic */ RadioButton access$getRadioButton$p(OptionPaymentLayout optionPaymentLayout) {
        RadioButton radioButton2 = optionPaymentLayout.radioButton;
        if (radioButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        return radioButton2;
    }

    public final Payment getPaymentMethod() {
        Payment payment = this.paymentMethod;
        if (payment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethod");
        }
        return payment;
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
    public OptionPaymentLayout(Payment payment, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(payment, "optionItem");
        Intrinsics.checkNotNullParameter(context, "context");
        this.paymentMethod = payment;
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
        Payment payment2 = this.paymentMethod;
        if (payment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethod");
        }
        textViewAttributeArr[0] = new TextViewAttribute(String.valueOf(payment2.getText()), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color333333), Integer.valueOf((int) R.font.sfpd_regular));
        TLTextViewKt.setTextMultipleFonts(radioButton3, textViewAttributeArr);
        RadioButton radioButton4 = this.radioButton;
        if (radioButton4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        Glide.with(radioButton4.getContext()).load(payment.getImage()).into(new CustomTarget<Drawable>(this, ViewExtsKt.DPtoPX(20.0f), ViewExtsKt.DPtoPX(20.0f)) {
            /* class com.thecoffeehouse.guestapp.screens.order.checkout.OptionPaymentLayout.AnonymousClass1 */
            final /* synthetic */ OptionPaymentLayout this$0;

            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
            }

            {
                this.this$0 = r1;
            }

            @Override // com.bumptech.glide.request.target.Target
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                onResourceReady((Drawable) obj, (Transition<? super Drawable>) transition);
            }

            public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                Intrinsics.checkNotNullParameter(drawable, "resource");
                this.this$0.getRadioButton().setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        });
        RadioButton radioButton5 = this.radioButton;
        if (radioButton5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        addView(radioButton5);
        RadioButton radioButton6 = this.radioButton;
        if (radioButton6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButton");
        }
        ViewExtsKt.marginStart(radioButton6, ViewExtsKt.DPtoPX(16.0f));
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
    public OptionPaymentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionPaymentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionPaymentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
