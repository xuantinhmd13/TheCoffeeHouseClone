package com.thecoffeehouse.guestapp.screens.more.externalaccount;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/more/externalaccount/ExternalAccountViewModel;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ExternalAccountDialogFragment.kt */
final class ExternalAccountDialogFragment$mExternalAccountViewModel$2 extends Lambda implements Function0<ExternalAccountViewModel> {
    final /* synthetic */ ExternalAccountDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExternalAccountDialogFragment$mExternalAccountViewModel$2(ExternalAccountDialogFragment externalAccountDialogFragment) {
        super(0);
        this.this$0 = externalAccountDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExternalAccountViewModel invoke() {
        ViewModel viewModel = new ViewModelProvider(this.this$0, new ExternalAccountViewModelFactory(this.this$0, null)).get(ExternalAccountViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProvider(\n     …untViewModel::class.java)");
        return (ExternalAccountViewModel) viewModel;
    }
}
