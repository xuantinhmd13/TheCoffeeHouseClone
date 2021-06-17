package com.thecoffeehouse.guestapp.screens.stores.interaction;

import com.thecoffeehouse.guestapp.screens.stores.StoresViewModel;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: SearchLayoutInteraction.kt */
public final class SearchLayoutInteraction$queryStoreByAddress$1 implements Runnable {
    final /* synthetic */ String $newText;
    final /* synthetic */ SearchLayoutInteraction this$0;

    SearchLayoutInteraction$queryStoreByAddress$1(SearchLayoutInteraction searchLayoutInteraction, String str) {
        this.this$0 = searchLayoutInteraction;
        this.$newText = str;
    }

    public final void run() {
        String str = this.$newText;
        boolean z = false;
        if (!(str == null || StringsKt.isBlank(str))) {
            String str2 = this.$newText;
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                ((StoresViewModel) this.this$0.storeFragment.getViewModel()).searchStore(this.$newText);
                return;
            }
        }
        if (((StoresViewModel) this.this$0.storeFragment.getViewModel()).hasRecentlySearch()) {
            ((StoresViewModel) this.this$0.storeFragment.getViewModel()).showRecentlySearch();
        } else {
            ((StoresViewModel) this.this$0.storeFragment.getViewModel()).searchStore(null);
        }
    }
}
