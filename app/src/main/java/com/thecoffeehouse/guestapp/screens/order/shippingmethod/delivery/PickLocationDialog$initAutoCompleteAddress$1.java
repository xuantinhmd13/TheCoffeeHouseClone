package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import androidx.appcompat.widget.SearchView;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$initAutoCompleteAddress$1", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "onQueryTextChange", "", "newText", "", "onQueryTextSubmit", SearchIntents.EXTRA_QUERY, "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
public final class PickLocationDialog$initAutoCompleteAddress$1 implements SearchView.OnQueryTextListener {
    final /* synthetic */ PickLocationDialog this$0;

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        return true;
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PickLocationDialog$initAutoCompleteAddress$1(PickLocationDialog pickLocationDialog) {
        this.this$0 = pickLocationDialog;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String str) {
        PickLocationDialog.access$queryPlaceAutoSuggestion(this.this$0, str);
        return true;
    }
}
