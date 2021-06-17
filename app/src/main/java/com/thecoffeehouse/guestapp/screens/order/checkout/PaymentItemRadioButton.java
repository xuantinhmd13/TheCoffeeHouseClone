package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.content.res.ResourcesCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/PaymentItemRadioButton;", "Landroidx/appcompat/widget/AppCompatRadioButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "onAttachedToWindow", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OptionPayment.kt */
public final class PaymentItemRadioButton extends AppCompatRadioButton {
    private HashMap _$_findViewCache;

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

    public PaymentItemRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PaymentItemRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PaymentItemRadioButton(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setButtonDrawable(getContext().getDrawable(R.drawable.radiobutton_payment_option));
        setMaxLines(1);
        setPadding(ViewExtsKt.DPtoPX(16.0f), ViewExtsKt.DPtoPX(16.0f), 0, ViewExtsKt.DPtoPX(16.0f));
        setTypeface(ResourcesCompat.getFont(getContext(), R.font.sfpd_regular));
        setCompoundDrawablePadding(ViewExtsKt.DPtoPX(16.0f));
    }
}
