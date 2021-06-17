package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010+\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderProcessing;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CreateOrderResponse;", "()V", "CANCEL", "", "getCANCEL", "()I", "CONFIRMED", "getCONFIRMED", "DONE", "getDONE", "DRAFT", "getDRAFT", "PICKUP_READY", "getPICKUP_READY", "PROCESSING", "getPROCESSING", "SHIPPING", "getSHIPPING", "customerInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/DeliveryInfo;", "getCustomerInfo", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/DeliveryInfo;", "setCustomerInfo", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/DeliveryInfo;)V", "orderTypeStr", "", "getOrderTypeStr", "()Ljava/lang/String;", "setOrderTypeStr", "(Ljava/lang/String;)V", "rating", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Rating;", "getRating", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Rating;", "setRating", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Rating;)V", "shipper", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shipper;", "getShipper", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shipper;", "setShipper", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shipper;)V", "shop", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shop;", "getShop", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shop;", "setShop", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shop;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public class OrderProcessing extends CreateOrderResponse {
    private final transient int CANCEL = -1;
    private final transient int CONFIRMED;
    private final transient int DONE = 5;
    private final transient int DRAFT = -2;
    private final transient int PICKUP_READY = 3;
    private final transient int PROCESSING = 1;
    private final transient int SHIPPING = 2;
    @SerializedName("customer_info")
    private DeliveryInfo customerInfo;
    @SerializedName("order_type_str")
    private String orderTypeStr;
    @SerializedName("rating")
    private Rating rating;
    @SerializedName("shipper_info")
    private Shipper shipper;
    @SerializedName("shop")
    private Shop shop;

    public final int getDRAFT() {
        return this.DRAFT;
    }

    public final int getCANCEL() {
        return this.CANCEL;
    }

    public final int getCONFIRMED() {
        return this.CONFIRMED;
    }

    public final int getPROCESSING() {
        return this.PROCESSING;
    }

    public final int getSHIPPING() {
        return this.SHIPPING;
    }

    public final int getPICKUP_READY() {
        return this.PICKUP_READY;
    }

    public final int getDONE() {
        return this.DONE;
    }

    public final Shop getShop() {
        return this.shop;
    }

    public final void setShop(Shop shop2) {
        this.shop = shop2;
    }

    public final Rating getRating() {
        return this.rating;
    }

    public final void setRating(Rating rating2) {
        this.rating = rating2;
    }

    public final Shipper getShipper() {
        return this.shipper;
    }

    public final void setShipper(Shipper shipper2) {
        this.shipper = shipper2;
    }

    public final DeliveryInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final void setCustomerInfo(DeliveryInfo deliveryInfo) {
        this.customerInfo = deliveryInfo;
    }

    public final String getOrderTypeStr() {
        return this.orderTypeStr;
    }

    public final void setOrderTypeStr(String str) {
        this.orderTypeStr = str;
    }
}
