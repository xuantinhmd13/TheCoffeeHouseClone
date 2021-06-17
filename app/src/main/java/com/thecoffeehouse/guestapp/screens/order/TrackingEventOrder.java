package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.configs.trackingevents.EditCartEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderTrackingEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.SelectVoucherEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductDetailDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J1\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\u00020\u00042\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0012J0\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020\u0004J\u0006\u0010)\u001a\u00020\u0004J\u0006\u0010*\u001a\u00020\u0004J\u0006\u0010+\u001a\u00020\u0004J\u0006\u0010,\u001a\u00020\u0004¨\u0006-"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/TrackingEventOrder;", "", "()V", "trackingAndTriggerDeleteItemCart", "", "trackingAndTriggerWhenCreateOrder", "paymentMethod", "", "qtyItemsInCart", "", "shippingType", "isVoucherApplied", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)V", "trackingEventDeleteCart", "deletedProductIds", "", "deletedCategoryIds", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ParamValue;", "trackingItemAddToCart", "product", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "orderLine", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "configs", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$ProductConfiguration;", "isRecentItem", "currentShippingMethod", "trackingShippingDetailChange", "triggerSendEventAddFavourite", "triggerSendEventApplyAVoucher", "triggerSendEventApplyAVoucherFailed", "triggerSendEventApplyAVoucherSuccessfully", "triggerSendEventChangeShippingMethod", "triggerSendEventDeleteCart", "triggerSendEventDeleteItemCart", "triggerSendEventEditItemCart", "updateSourceTrackingEvent", "name", "param", "updateSourceTrackingOpenGroupMenu", "updateSourceTrackingWhenCheckoutChangeDeliLocation", "updateSourceTrackingWhenCheckoutChangeLocation", "updateSourceTrackingWhenCheckoutChangePickupLocation", "updateSourceWhenDismissCheckoutDialog", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TrackingEventOrder.kt */
public final class TrackingEventOrder {
    public final void updateSourceTrackingEvent(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "param");
        TrackingEventService.Companion.updateSourceTrackingEvent(str, str2);
    }

    public final void trackingShippingDetailChange(String str) {
        Intrinsics.checkNotNullParameter(str, "currentShippingMethod");
        TrackingEventService.Companion.updateSourceTrackingEvent(ShippingMethodEvents.EventChangeShipping.name, "Menu - Change Method");
        TrackingEventService.Companion.updateSourceTrackingEvent(ShippingMethodEvents.EventShippingChangedSuccessfully.name, "Menu - Change Method");
        TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventChangeShipping.name, new TrackingData("currentShippingMethod", str));
        if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getDELI())) {
            TrackingEventService.Companion.updateSourceTrackingEvent(ShippingMethodEvents.EventSearchDeliAddress.name, "Menu");
            TrackingEventService.Companion.updateSourceTrackingEvent(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.name, "Menu");
        } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getPICKUP())) {
            TrackingEventService.Companion.updateSourceTrackingEvent(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.name, "Menu");
        }
    }

    public final void triggerSendEventChangeShippingMethod() {
        TrackingEventService.Companion.triggerSendTrackingEvent(ShippingMethodEvents.EventChangeShipping.name);
        TrackingEventService.Companion.triggerSendTrackingEvent(ShippingMethodEvents.EventShippingChangedSuccessfully.name);
    }

    public final void trackingItemAddToCart(Product product, OrderLine orderLine, ProductDetailDialogFragment.ProductConfiguration productConfiguration, boolean z, String str) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(orderLine, "orderLine");
        Intrinsics.checkNotNullParameter(str, "currentShippingMethod");
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[8];
        boolean z2 = false;
        trackingDataArr[0] = new TrackingData("productID", product.getId());
        trackingDataArr[1] = new TrackingData("categoryID", product.getCategoryId());
        trackingDataArr[2] = new TrackingData(OrderEvents.EventItemAddedToCartSuccessfully.Param.isFavItem, Boolean.valueOf(product.isFavourite()));
        trackingDataArr[3] = new TrackingData("isRecentItem", Boolean.valueOf(z));
        trackingDataArr[4] = new TrackingData("isQtyChanged", Boolean.valueOf(orderLine.getQuantity() != 1));
        String note = orderLine.getNote();
        if (note != null) {
            bool = Boolean.valueOf(note.length() > 0);
        } else {
            bool = null;
        }
        trackingDataArr[5] = new TrackingData("isNoted", bool);
        if (productConfiguration != null) {
            z2 = true;
        }
        trackingDataArr[6] = new TrackingData(OrderEvents.EventItemAddedToCartSuccessfully.Param.isCustomized, Boolean.valueOf(z2));
        trackingDataArr[7] = new TrackingData("currentShipping", str);
        companion.collectParamWithEventName(OrderEvents.EventItemAddedToCartSuccessfully.name, trackingDataArr);
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventItemAddedToCartSuccessfully.name);
    }

    public final void triggerSendEventAddFavourite() {
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventFavoriteItem.name);
    }

    public final void triggerSendEventEditItemCart() {
        TrackingEventService.Companion.triggerSendTrackingEvent(EditCartEvents.EventCartItemEditedSuccessfully.name);
    }

    public final void trackingEventDeleteCart(List<String> list, Object obj) {
        TrackingEventService.Companion.updateSourceTrackingEvent(EditCartEvents.EventAllCartRemoved.name, "Cart");
        TrackingEventService.Companion.updateSourceTrackingEvent(EditCartEvents.EventAllCartRemoved.name, "Delete all");
        TrackingEventService.Companion.collectParamWithEventName(EditCartEvents.EventAllCartRemoved.name, new TrackingData(EditCartEvents.EventAllCartRemoved.Param.productList, list), new TrackingData(EditCartEvents.EventAllCartRemoved.Param.categoryList, obj));
    }

    public final void triggerSendEventDeleteCart() {
        TrackingEventService.Companion.triggerSendTrackingEvent(EditCartEvents.EventAllCartRemoved.name);
    }

    public final void triggerSendEventDeleteItemCart() {
        TrackingEventService.Companion.triggerSendTrackingEvent(EditCartEvents.EventCartItemRemovedSuccessfully.name);
    }

    public final void updateSourceTrackingOpenGroupMenu() {
        TrackingEventService.Companion.updateSourceTrackingEvent(SelectVoucherEvents.EventViewVoucherDetail.name, "Cart");
        TrackingEventService.Companion.updateSourceTrackingEvent(SelectVoucherEvents.EventVoucherAppliedSuccessfully.name, "Cart");
        TrackingEventService.Companion.updateSourceTrackingEvent(SelectVoucherEvents.EventVoucherAppliedFailed.name, "Cart");
    }

    public final void triggerSendEventApplyAVoucher() {
        TrackingEventService.Companion.triggerSendTrackingEvent(SelectVoucherEvents.EventApplyAVoucher.name);
    }

    public final void triggerSendEventApplyAVoucherSuccessfully() {
        TrackingEventService.Companion.triggerSendTrackingEvent(SelectVoucherEvents.EventVoucherAppliedSuccessfully.name);
    }

    public final void triggerSendEventApplyAVoucherFailed() {
        TrackingEventService.Companion.triggerSendTrackingEvent(SelectVoucherEvents.EventVoucherAppliedFailed.name);
    }

    public final void trackingAndTriggerDeleteItemCart() {
        TrackingEventService.Companion.updateSourceTrackingEvent(EditCartEvents.EventCartItemRemovedSuccessfully.name, "Cart");
        TrackingEventService.Companion.collectParamWithEventName(EditCartEvents.EventCartItemRemovedSuccessfully.name, new TrackingData("entryPoints", "Tap On Item"));
        TrackingEventService.Companion.triggerSendTrackingEvent(EditCartEvents.EventCartItemRemovedSuccessfully.name);
    }

    public final void updateSourceTrackingWhenCheckoutChangeDeliLocation() {
        TrackingEventService.Companion.updateSourceTrackingEvent(ShippingMethodEvents.EventSearchDeliAddress.name, "Checkout");
        TrackingEventService.Companion.updateSourceTrackingEvent(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.name, "Checkout");
    }

    public final void updateSourceTrackingWhenCheckoutChangePickupLocation() {
        TrackingEventService.Companion.updateSourceTrackingEvent(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.name, "Checkout");
    }

    public final void updateSourceTrackingWhenCheckoutChangeLocation() {
        TrackingEventService.Companion.updateSourceTrackingEvent(ShippingMethodEvents.EventShippingChangedSuccessfully.name, "Checkout - Change Detail");
    }

    public final void updateSourceWhenDismissCheckoutDialog() {
        TrackingEventService.Companion.updateSourceTrackingEvent(EditCartEvents.EventViewCart.name, "Checkout");
        TrackingEventService.Companion.triggerSendTrackingEvent(EditCartEvents.EventViewCart.name);
    }

    public final void trackingAndTriggerWhenCreateOrder(String str, Integer num, String str2, boolean z) {
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderTrackingEvents.EventOrderCreatedSuccessfully.name, "orderTracking");
        TrackingEventService.Companion.collectParamWithEventName(OrderTrackingEvents.EventOrderCreatedSuccessfully.name, new TrackingData("paymentMethod", str), new TrackingData("qtyItemsInCart", num), new TrackingData("shippingMethod", ShippingMethodEvents.INSTANCE.standardizeShippingMethodValue(str2)), new TrackingData("isVoucherApplied", Boolean.valueOf(z)));
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderTrackingEvents.EventOrderCreatedSuccessfully.name);
    }
}
