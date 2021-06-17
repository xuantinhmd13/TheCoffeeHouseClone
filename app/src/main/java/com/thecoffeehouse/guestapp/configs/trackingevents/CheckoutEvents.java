package com.thecoffeehouse.guestapp.configs.trackingevents;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents;", "", "()V", "EventPaymentMethodChangedSuccessfully", "EventRequestCheckout", "EventStartCheckout", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CheckoutEvents.kt */
public final class CheckoutEvents {
    public static final CheckoutEvents INSTANCE = new CheckoutEvents();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventStartCheckout;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventStartCheckout$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventStartCheckout$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CheckoutEvents.kt */
    public static abstract class EventStartCheckout {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Start_Checkout";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventStartCheckout$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: CheckoutEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventStartCheckout() {
        }

        public /* synthetic */ EventStartCheckout(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventStartCheckout$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventStartCheckout;", "()V", "cartValue", "", Param.defaultPaymentMethod, "isNoted", "isVoucherApplied", "qtyItemsInCart", Param.reasonDefaultPaymentMethod, "shippingMethod", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: CheckoutEvents.kt */
        public static final class Param extends EventStartCheckout {
            public static final Param INSTANCE = new Param();
            public static final String cartValue = "cartValue";
            public static final String defaultPaymentMethod = "defaultPaymentMethod";
            public static final String isNoted = "isNoted";
            public static final String isVoucherApplied = "isVoucherApplied";
            public static final String qtyItemsInCart = "qtyItemsInCart";
            public static final String reasonDefaultPaymentMethod = "reasonDefaultPaymentMethod";
            public static final String shippingMethod = "shippingMethod";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventStartCheckout$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventStartCheckout;", "()V", "Cart", "", Value.Cash, "Deli", Value.Momo, "Pickup", "Recent", Value.ZaloPay, "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: CheckoutEvents.kt */
        public static final class Value extends EventStartCheckout {
            public static final String Cart = "Cart";
            public static final String Cash = "Cash";
            public static final String Deli = "Deli";
            public static final Value INSTANCE = new Value();
            public static final String Momo = "Momo";
            public static final String Pickup = "Pickup";
            public static final String Recent = "Recent";
            public static final String ZaloPay = "ZaloPay";

            private Value() {
                super(null);
            }
        }
    }

    private CheckoutEvents() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventRequestCheckout;", "", "()V", "Companion", "Param", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventRequestCheckout$Param;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CheckoutEvents.kt */
    public static abstract class EventRequestCheckout {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Order_Request_Checkout";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventRequestCheckout$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: CheckoutEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventRequestCheckout() {
        }

        public /* synthetic */ EventRequestCheckout(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventRequestCheckout$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventRequestCheckout;", "()V", "cartValue", "", "isVoucherApplied", "paymentMethod", "qtyItemsInCart", "shippingMethod", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: CheckoutEvents.kt */
        public static final class Param extends EventRequestCheckout {
            public static final Param INSTANCE = new Param();
            public static final String cartValue = "cartValue";
            public static final String isVoucherApplied = "isVoucherApplied";
            public static final String paymentMethod = "paymentMethod";
            public static final String qtyItemsInCart = "qtyItemsInCart";
            public static final String shippingMethod = "shippingMethod";

            private Param() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventPaymentMethodChangedSuccessfully;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventPaymentMethodChangedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventPaymentMethodChangedSuccessfully$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CheckoutEvents.kt */
    public static abstract class EventPaymentMethodChangedSuccessfully {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Payment_Method_Changed_Successfully";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventPaymentMethodChangedSuccessfully$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: CheckoutEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventPaymentMethodChangedSuccessfully() {
        }

        public /* synthetic */ EventPaymentMethodChangedSuccessfully(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventPaymentMethodChangedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventPaymentMethodChangedSuccessfully;", "()V", "currentShippingMethod", "", Param.newPaymentMethod, Param.oldPaymentMethod, "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: CheckoutEvents.kt */
        public static final class Param extends EventPaymentMethodChangedSuccessfully {
            public static final Param INSTANCE = new Param();
            public static final String currentShippingMethod = "currentShippingMethod";
            public static final String newPaymentMethod = "newPaymentMethod";
            public static final String oldPaymentMethod = "oldPaymentMethod";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventPaymentMethodChangedSuccessfully$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/CheckoutEvents$EventPaymentMethodChangedSuccessfully;", "()V", "Checkout", "", "Deli", "Pickup", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: CheckoutEvents.kt */
        public static final class Value extends EventPaymentMethodChangedSuccessfully {
            public static final String Checkout = "Checkout";
            public static final String Deli = "Deli";
            public static final Value INSTANCE = new Value();
            public static final String Pickup = "Pickup";

            private Value() {
                super(null);
            }
        }
    }
}
