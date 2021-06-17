package com.thecoffeehouse.guestapp.screens.stores;

import com.thecoffeehouse.guestapp.screens.stores.interaction.SearchLayoutInteraction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/stores/interaction/SearchLayoutInteraction;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public final class StoresFragment$searchLayoutInteractions$2 extends Lambda implements Function0<SearchLayoutInteraction> {
    final /* synthetic */ StoresFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresFragment$searchLayoutInteractions$2(StoresFragment storesFragment) {
        super(0);
        this.this$0 = storesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchLayoutInteraction invoke() {
        return new SearchLayoutInteraction(this.this$0);
    }
}
