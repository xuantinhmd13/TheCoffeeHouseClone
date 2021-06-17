package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import com.facebook.appevents.integrity.IntegrityManager;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"getIconByAddressType", "", "type", "getTitleByAddressType", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "app_liveRelease"}, k = 2, mv = {1, 4, 0})
/* compiled from: PickLocationDialogV2.kt */
public final class PickLocationDialogV2Kt {
    public static final int getIconByAddressType(int i) {
        if (i == AddressType.INSTANCE.getHOME()) {
            return R.drawable.ic_home_address;
        }
        if (i == AddressType.INSTANCE.getWORK()) {
            return R.drawable.ic_work_address;
        }
        if (i == AddressType.INSTANCE.getOTHER()) {
            return R.drawable.ic_other_address;
        }
        if (i == AddressType.INSTANCE.getRECENT()) {
            return R.drawable.ic_recently_search;
        }
        AddressType.INSTANCE.getGOOGLE();
        return R.drawable.ic_default_address;
    }

    public static final String getTitleByAddressType(AddressSuggestion addressSuggestion) {
        Intrinsics.checkNotNullParameter(addressSuggestion, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        int type = addressSuggestion.getType();
        if (type == AddressType.INSTANCE.getHOME()) {
            return addressSuggestion.getTitle();
        }
        if (type == AddressType.INSTANCE.getWORK()) {
            return addressSuggestion.getTitle();
        }
        if (type == AddressType.INSTANCE.getOTHER()) {
            return addressSuggestion.getTitle();
        }
        if (type == AddressType.INSTANCE.getRECENT()) {
            return addressSuggestion.getTitleAddress();
        }
        if (type == AddressType.INSTANCE.getGOOGLE()) {
            return addressSuggestion.getTitleAddress();
        }
        return addressSuggestion.getTitleAddress();
    }
}
