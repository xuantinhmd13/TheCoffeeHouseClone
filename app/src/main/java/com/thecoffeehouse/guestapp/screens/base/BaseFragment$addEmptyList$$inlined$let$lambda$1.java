package com.thecoffeehouse.guestapp.screens.base;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "VM", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/thecoffeehouse/guestapp/screens/base/BaseFragment$addEmptyList$4$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseFragment.kt */
final class BaseFragment$addEmptyList$$inlined$let$lambda$1 implements View.OnClickListener {
    final /* synthetic */ String $buttonText$inlined;
    final /* synthetic */ View $emptyListLayout$inlined;
    final /* synthetic */ Function0 $onClickButton$inlined;

    BaseFragment$addEmptyList$$inlined$let$lambda$1(View view, String str, Function0 function0) {
        this.$emptyListLayout$inlined = view;
        this.$buttonText$inlined = str;
        this.$onClickButton$inlined = function0;
    }

    public final void onClick(View view) {
        Function0 function0 = this.$onClickButton$inlined;
        if (function0 != null) {
            Unit unit = (Unit) function0.invoke();
        }
    }
}
