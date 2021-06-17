package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.location.Location;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.Shop;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "myAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: CheckoutDialogFragment.kt */
public final class CheckoutDialogFragment$initViewPickUpInfo$1 extends Lambda implements Function1<AddressSuggestion, Unit> {
    final /* synthetic */ CheckoutDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CheckoutDialogFragment$initViewPickUpInfo$1(CheckoutDialogFragment checkoutDialogFragment) {
        super(1);
        this.this$0 = checkoutDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
        invoke(addressSuggestion);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestion addressSuggestion) {
        Shop shop;
        AddressOrder address;
        Shop shop2;
        AddressOrder address2;
        Intrinsics.checkNotNullParameter(addressSuggestion, "myAddress");
        Location location = new Location("");
        Order order = this.this$0.mOrder;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        location.setLatitude((order == null || (shop2 = order.getShop()) == null || (address2 = shop2.getAddress()) == null) ? 0.0d : address2.getLatitude());
        Order order2 = this.this$0.mOrder;
        if (!(order2 == null || (shop = order2.getShop()) == null || (address = shop.getAddress()) == null)) {
            d = address.getLongitude();
        }
        location.setLongitude(d);
        Location location2 = new Location("");
        location2.setLatitude(addressSuggestion.getLat());
        location2.setLongitude(addressSuggestion.getLng());
        double distanceTo = (double) location2.distanceTo(location);
        PickUpCheckoutInteraction pickUpCheckoutInteraction = this.this$0.mPickUpCheckoutInteraction;
        if (pickUpCheckoutInteraction != null) {
            pickUpCheckoutInteraction.updateDistanceToStoreLocation(this.this$0.mOrder, distanceTo);
        }
    }
}
