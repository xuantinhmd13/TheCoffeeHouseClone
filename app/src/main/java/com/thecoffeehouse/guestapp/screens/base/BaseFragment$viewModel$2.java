package com.thecoffeehouse.guestapp.screens.base;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "VM", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "invoke", "()Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseFragment.kt */
final class BaseFragment$viewModel$2 extends Lambda implements Function0<VM> {
    final /* synthetic */ BaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseFragment$viewModel$2(BaseFragment baseFragment) {
        super(0);
        this.this$0 = baseFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final VM invoke() {
        BaseFragment baseFragment = this.this$0;
        ViewModel viewModel = new ViewModelProvider(baseFragment, baseFragment.getViewModelFactory()).get(this.this$0.getViewModelClass());
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProvider(\n     …    ).get(viewModelClass)");
        return (VM) ((BaseViewModel) viewModel);
    }
}
