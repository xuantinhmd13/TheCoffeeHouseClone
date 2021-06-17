package com.thecoffeehouse.guestapp.screens.stores;

import androidx.appcompat.widget.SearchView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.stores.interaction.MapViewInteraction;
import com.thecoffeehouse.guestapp.screens.stores.interaction.SearchLayoutInteraction;
import com.thecoffeehouse.guestapp.screens.stores.interaction.SearchStoreInteraction;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/stores/interaction/SearchStoreInteraction;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public final class StoresFragment$searchStoreInteractions$2 extends Lambda implements Function0<SearchStoreInteraction> {
    final /* synthetic */ StoresFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresFragment$searchStoreInteractions$2(StoresFragment storesFragment) {
        super(0);
        this.this$0 = storesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchStoreInteraction invoke() {
        return new SearchStoreInteraction(new Function1<Store, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.stores.StoresFragment$searchStoreInteractions$2.AnonymousClass1 */
            final /* synthetic */ StoresFragment$searchStoreInteractions$2 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Store store) {
                invoke(store);
                return Unit.INSTANCE;
            }

            public final void invoke(Store store) {
                if (store != null) {
                    this.this$0.this$0.addToRecentlySearch(store);
                    this.this$0.this$0.updateSearchToListAndMap(store);
                    this.this$0.this$0.getSearchLayoutInteractions().setRecentlySearchForSearchView(store);
                    MapViewInteraction.zoomToSelectedStore$app_liveRelease$default(this.this$0.this$0.getMapViewInteractions(), store, false, 2, null);
                    this.this$0.this$0.onClickItemRowStore(store);
                    return;
                }
                SearchLayoutInteraction searchLayoutInteractions = this.this$0.this$0.getSearchLayoutInteractions();
                SearchView searchView = (SearchView) this.this$0.this$0.getSearchLayoutInteractions().getMSearchStoreLayout().findViewById(R.id.searchView);
                Intrinsics.checkNotNullExpressionValue(searchView, "searchLayoutInteractions…rchStoreLayout.searchView");
                searchLayoutInteractions.submitSearchQuery(searchView.getQuery().toString());
            }
        });
    }
}
