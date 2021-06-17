package com.thecoffeehouse.guestapp.screens.stores;

import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.Observer;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.stores.interaction.SearchStoreInteraction;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "resource", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
final class StoresFragment$observeViewModel$2<T> implements Observer<ArrayList<Store>> {
    final /* synthetic */ StoresFragment this$0;

    StoresFragment$observeViewModel$2(StoresFragment storesFragment) {
        this.this$0 = storesFragment;
    }

    public final void onChanged(ArrayList<Store> arrayList) {
        this.this$0.getSearchStoreInteractions().removeAllViews();
        SearchView searchView = (SearchView) this.this$0.getSearchLayoutInteractions().getMSearchStoreLayout().findViewById(R.id.searchView);
        Intrinsics.checkNotNullExpressionValue(searchView, "searchLayoutInteractions…rchStoreLayout.searchView");
        String obj = searchView.getQuery().toString();
        boolean z = obj.length() == 0;
        if (z) {
            if (arrayList.isEmpty()) {
                this.this$0.getSearchStoreInteractions().addRecentlySearchRow(this.this$0.getMStores());
                return;
            }
            this.this$0.getSearchStoreInteractions().addRecentlySearchHeader$app_liveRelease();
            SearchStoreInteraction searchStoreInteractions = this.this$0.getSearchStoreInteractions();
            Intrinsics.checkNotNullExpressionValue(arrayList, "resource");
            searchStoreInteractions.addRecentlySearchRow(arrayList);
        } else if (z) {
        } else {
            if (arrayList.isEmpty()) {
                this.this$0.getSearchStoreInteractions().addNotFoundItem(obj);
                return;
            }
            SearchStoreInteraction searchStoreInteractions2 = this.this$0.getSearchStoreInteractions();
            Intrinsics.checkNotNullExpressionValue(arrayList, "resource");
            searchStoreInteractions2.addFoundStoreRow(arrayList);
        }
    }
}
