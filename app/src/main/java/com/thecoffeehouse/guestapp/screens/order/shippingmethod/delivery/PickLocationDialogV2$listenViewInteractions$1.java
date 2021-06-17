package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import androidx.appcompat.widget.SearchView;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialogV2$listenViewInteractions$1", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "onQueryTextChange", "", SearchIntents.EXTRA_QUERY, "", "onQueryTextSubmit", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickLocationDialogV2.kt */
public final class PickLocationDialogV2$listenViewInteractions$1 implements SearchView.OnQueryTextListener {
    final /* synthetic */ PickLocationDialogV2 this$0;

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        Intrinsics.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        return true;
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PickLocationDialogV2$listenViewInteractions$1(PickLocationDialogV2 pickLocationDialogV2) {
        this.this$0 = pickLocationDialogV2;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String str) {
        Intrinsics.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        this.this$0.mQueryHandler.removeCallbacksAndMessages(null);
        String str2 = str;
        if ((str2.length() == 0) || StringsKt.isBlank(str2)) {
            this.this$0.initPlaceHolderScreen();
        } else {
            this.this$0.queryPlaceAutoSuggestion(str);
        }
        return true;
    }
}
