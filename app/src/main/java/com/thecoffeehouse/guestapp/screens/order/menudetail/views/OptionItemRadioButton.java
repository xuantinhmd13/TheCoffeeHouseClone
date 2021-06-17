package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.Item;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0014R\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/OptionItemRadioButton;", "Landroidx/appcompat/widget/AppCompatRadioButton;", "option", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Item;", "context", "Landroid/content/Context;", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Item;Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "optionItem", "getOptionItem", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Item;", "onAttachedToWindow", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OptionProductViews.kt */
public final class OptionItemRadioButton extends AppCompatRadioButton {
    private HashMap _$_findViewCache;
    private Item optionItem;

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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionItemRadioButton(Item item, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(item, "option");
        this.optionItem = item;
    }

    public OptionItemRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OptionItemRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setButtonDrawable(ContextCompat.getDrawable(getContext(), R.drawable.radiobutton_product_option));
        setMaxLines(1);
        setPadding(ViewExtsKt.DPtoPX(8.0f), ViewExtsKt.DPtoPX(16.0f), 0, ViewExtsKt.DPtoPX(16.0f));
        setTypeface(ResourcesCompat.getFont(getContext(), R.font.sfpd_regular));
    }
}
