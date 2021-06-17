package com.thecoffeehouse.guestapp.screens.more.savedaddresses;

import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SavedAddressesFragment.kt */
public final class SavedAddressesFragment$addRowItemSavedAddress$2 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ SavedAddressesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SavedAddressesFragment$addRowItemSavedAddress$2(SavedAddressesFragment savedAddressesFragment) {
        super(1);
        this.this$0 = savedAddressesFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        AddressSuggestion addressSuggestion = new AddressSuggestion();
        addressSuggestion.setTitle(this.this$0.getString(R.string.str_work));
        addressSuggestion.setType(AddressType.INSTANCE.getWORK());
        this.this$0.handleClickSelectAddress.invoke(addressSuggestion);
    }
}
