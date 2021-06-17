package com.thecoffeehouse.guestapp.screens.more.savedaddresses;

import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.screens.more.SavedAddressDetailFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "selectedAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SavedAddressesFragment.kt */
public final class SavedAddressesFragment$handleClickSelectAddress$1 extends Lambda implements Function1<AddressSuggestion, Unit> {
    final /* synthetic */ SavedAddressesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SavedAddressesFragment$handleClickSelectAddress$1(SavedAddressesFragment savedAddressesFragment) {
        super(1);
        this.this$0 = savedAddressesFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
        invoke(addressSuggestion);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestion addressSuggestion) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "selectedAddress");
        SavedAddressDetailFragment newInstance = SavedAddressDetailFragment.Companion.newInstance(addressSuggestion, new SavedAddressesFragment$handleClickSelectAddress$1$savedAddressDetailFragment$1(this));
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            newInstance.showNow(mainActivity.getSupportFragmentManager(), null);
        }
    }
}
