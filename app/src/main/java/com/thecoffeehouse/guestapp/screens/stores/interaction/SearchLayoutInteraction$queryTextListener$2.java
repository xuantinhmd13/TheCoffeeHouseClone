package com.thecoffeehouse.guestapp.screens.stores.interaction;

import androidx.appcompat.widget.SearchView;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/stores/interaction/SearchLayoutInteraction$queryTextListener$2", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "onQueryTextChange", "", "newText", "", "onQueryTextSubmit", SearchIntents.EXTRA_QUERY, "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SearchLayoutInteraction.kt */
public final class SearchLayoutInteraction$queryTextListener$2 implements SearchView.OnQueryTextListener {
    final /* synthetic */ SearchLayoutInteraction this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    SearchLayoutInteraction$queryTextListener$2(SearchLayoutInteraction searchLayoutInteraction) {
        this.this$0 = searchLayoutInteraction;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        this.this$0.submitSearchQuery(str);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String str) {
        this.this$0.queryStoreByAddress(str);
        this.this$0.hideShowClearTextSearch(str);
        return true;
    }
}
