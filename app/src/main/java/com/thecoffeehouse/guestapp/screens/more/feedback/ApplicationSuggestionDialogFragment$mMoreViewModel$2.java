package com.thecoffeehouse.guestapp.screens.more.feedback;

import androidx.lifecycle.ViewModelProvider;
import com.thecoffeehouse.guestapp.screens.more.MoreViewModel;
import com.thecoffeehouse.guestapp.screens.more.MoreViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/more/MoreViewModel;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ApplicationSuggestionDialogFragment.kt */
public final class ApplicationSuggestionDialogFragment$mMoreViewModel$2 extends Lambda implements Function0<MoreViewModel> {
    final /* synthetic */ ApplicationSuggestionDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ApplicationSuggestionDialogFragment$mMoreViewModel$2(ApplicationSuggestionDialogFragment applicationSuggestionDialogFragment) {
        super(0);
        this.this$0 = applicationSuggestionDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MoreViewModel invoke() {
        return (MoreViewModel) new ViewModelProvider(this.this$0, new MoreViewModelFactory(this.this$0, null)).get(MoreViewModel.class);
    }
}
