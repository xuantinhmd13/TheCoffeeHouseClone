package com.thecoffeehouse.guestapp.configs.trackingevents;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents;", "", "()V", "EventOrderCancel", "EventOrderCanceled", "EventOrderCompleted", "EventOrderCreatedSuccessfully", "EventOrderPaymentFailed", "EventOrderRatingSubmitted", "EventOrderTrackingExpandSelected", "EventOrderTrackingMapSelected", "EventOrderTrackingOpenSelected", "EventOrderTrackingShipperSelected", "EventOrderTrackingSupportSelected", "EventPaymentRetriedSuccessfully", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderTrackingEvents.kt */
public final class OrderTrackingEvents {
    public static final OrderTrackingEvents INSTANCE = new OrderTrackingEvents();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderPaymentFailed;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderPaymentFailed$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderPaymentFailed$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventOrderPaymentFailed {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Order_Payment_Failed";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderPaymentFailed$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventOrderPaymentFailed() {
        }

        public /* synthetic */ EventOrderPaymentFailed(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderPaymentFailed$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderPaymentFailed;", "()V", "cartValue", "", "errorType", "paymentMethod", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventOrderPaymentFailed {
            public static final Param INSTANCE = new Param();
            public static final String cartValue = "cartValue";
            public static final String errorType = "errorType";
            public static final String paymentMethod = "paymentMethod";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderPaymentFailed$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderPaymentFailed;", "()V", "OrderTracking", "", "cartValue", "errorType", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventOrderPaymentFailed {
            public static final Value INSTANCE = new Value();
            public static final String OrderTracking = "orderTracking";
            public static final String cartValue = "cartValue";
            public static final String errorType = "errorType";

            private Value() {
                super(null);
            }
        }
    }

    private OrderTrackingEvents() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCancel;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCancel$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCancel$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventOrderCancel {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Order_Canceled";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCancel$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventOrderCancel() {
        }

        public /* synthetic */ EventOrderCancel(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCancel$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCancel;", "()V", "source", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventOrderCancel {
            public static final Param INSTANCE = new Param();
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCancel$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCancel;", "()V", "OrderTracking", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventOrderCancel {
            public static final Value INSTANCE = new Value();
            public static final String OrderTracking = "orderTracking";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCreatedSuccessfully;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCreatedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCreatedSuccessfully$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventOrderCreatedSuccessfully {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Order_Created_Successfully";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCreatedSuccessfully$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventOrderCreatedSuccessfully() {
        }

        public /* synthetic */ EventOrderCreatedSuccessfully(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCreatedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCreatedSuccessfully;", "()V", "cartValue", "", "daysFromDraftCreated", "isVoucherApplied", "paymentMethod", "qtyItemsInCart", "shippingMethod", "timeOccasion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventOrderCreatedSuccessfully {
            public static final Param INSTANCE = new Param();
            public static final String cartValue = "cartValue";
            public static final String daysFromDraftCreated = "daysFromDraftCreated";
            public static final String isVoucherApplied = "isVoucherApplied";
            public static final String paymentMethod = "paymentMethod";
            public static final String qtyItemsInCart = "qtyItemsInCart";
            public static final String shippingMethod = "shippingMethod";
            public static final String timeOccasion = "timeOccasion";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCreatedSuccessfully$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCreatedSuccessfully;", "()V", "Breakfast", "", "Dinner", Value.Early_Afternoon, "Evening", Value.Late_Afternoon, "Lunch", "Morning", "OrderTracking", "Others", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventOrderCreatedSuccessfully {
            public static final String Breakfast = "Breakfast";
            public static final String Dinner = "Dinner";
            public static final String Early_Afternoon = "Early_Afternoon";
            public static final String Evening = "Evening";
            public static final Value INSTANCE = new Value();
            public static final String Late_Afternoon = "Late_Afternoon";
            public static final String Lunch = "Lunch";
            public static final String Morning = "Morning";
            public static final String OrderTracking = "orderTracking";
            public static final String Others = "Others";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventPaymentRetriedSuccessfully;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventPaymentRetriedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventPaymentRetriedSuccessfully$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventPaymentRetriedSuccessfully {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Payment_Retried_Successfully";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventPaymentRetriedSuccessfully$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventPaymentRetriedSuccessfully() {
        }

        public /* synthetic */ EventPaymentRetriedSuccessfully(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventPaymentRetriedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventPaymentRetriedSuccessfully;", "()V", "paymentMethod", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventPaymentRetriedSuccessfully {
            public static final Param INSTANCE = new Param();
            public static final String paymentMethod = "paymentMethod";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventPaymentRetriedSuccessfully$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventPaymentRetriedSuccessfully;", "()V", "OrderTracking", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventPaymentRetriedSuccessfully {
            public static final Value INSTANCE = new Value();
            public static final String OrderTracking = "orderTracking";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCanceled;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCanceled$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCanceled$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventOrderCanceled {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Order_Canceled";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCanceled$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventOrderCanceled() {
        }

        public /* synthetic */ EventOrderCanceled(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCanceled$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCanceled;", "()V", Param.cancelType, "", "cartValue", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventOrderCanceled {
            public static final Param INSTANCE = new Param();
            public static final String cancelType = "cancelType";
            public static final String cartValue = "cartValue";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCanceled$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCanceled;", "()V", "OrderTracking", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventOrderCanceled {
            public static final Value INSTANCE = new Value();
            public static final String OrderTracking = "orderTracking";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCompleted;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCompleted$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCompleted$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventOrderCompleted {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Payment_Retried_Successfully";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCompleted$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventOrderCompleted() {
        }

        public /* synthetic */ EventOrderCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCompleted$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCompleted;", "()V", "cartValue", "", "daysFromDraftCreated", "isVoucherApplied", "paymentMethod", "qtyItemsInCart", "shippingMethod", "timeOccasion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventOrderCompleted {
            public static final Param INSTANCE = new Param();
            public static final String cartValue = "cartValue";
            public static final String daysFromDraftCreated = "daysFromDraftCreated";
            public static final String isVoucherApplied = "isVoucherApplied";
            public static final String paymentMethod = "paymentMethod";
            public static final String qtyItemsInCart = "qtyItemsInCart";
            public static final String shippingMethod = "shippingMethod";
            public static final String timeOccasion = "timeOccasion";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCompleted$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderCompleted;", "()V", "Breakfast", "", "Dinner", EventOrderCreatedSuccessfully.Value.Early_Afternoon, "Evening", EventOrderCreatedSuccessfully.Value.Late_Afternoon, "Lunch", "Morning", "OrderTracking", "Others", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventOrderCompleted {
            public static final String Breakfast = "Breakfast";
            public static final String Dinner = "Dinner";
            public static final String Early_Afternoon = "Early Afternoon";
            public static final String Evening = "Evening";
            public static final Value INSTANCE = new Value();
            public static final String Late_Afternoon = "Late Afternoon";
            public static final String Lunch = "Lunch";
            public static final String Morning = "Morning";
            public static final String OrderTracking = "orderTracking";
            public static final String Others = "Others";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderRatingSubmitted;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderRatingSubmitted$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderRatingSubmitted$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventOrderRatingSubmitted {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Order_Rating_Submitted";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderRatingSubmitted$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventOrderRatingSubmitted() {
        }

        public /* synthetic */ EventOrderRatingSubmitted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderRatingSubmitted$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderRatingSubmitted;", "()V", "OrderTracking", "", "cartValue", Param.daysFromOrderCreated, "isVoucherApplied", "paymentMethod", "qtyItemsInCart", "shippingMethod", "timeOccasion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventOrderRatingSubmitted {
            public static final Param INSTANCE = new Param();
            public static final String OrderTracking = "orderTracking";
            public static final String cartValue = "cartValue";
            public static final String daysFromOrderCreated = "daysFromOrderCreated";
            public static final String isVoucherApplied = "isVoucherApplied";
            public static final String paymentMethod = "paymentMethod";
            public static final String qtyItemsInCart = "qtyItemsInCart";
            public static final String shippingMethod = "shippingMethod";
            public static final String timeOccasion = "timeOccasion";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderRatingSubmitted$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderRatingSubmitted;", "()V", "OrderTracking", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventOrderRatingSubmitted {
            public static final Value INSTANCE = new Value();
            public static final String OrderTracking = "orderTracking";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingOpenSelected;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingOpenSelected$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingOpenSelected$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventOrderTrackingOpenSelected {
        public static final Companion Companion = new Companion(null);
        public static final String name = "OrderTracking_OpenSelected";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingOpenSelected$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventOrderTrackingOpenSelected() {
        }

        public /* synthetic */ EventOrderTrackingOpenSelected(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingOpenSelected$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingOpenSelected;", "()V", "source", "", Param.statusName, "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventOrderTrackingOpenSelected {
            public static final Param INSTANCE = new Param();
            public static final String source = "source";
            public static final String statusName = "statusName";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingOpenSelected$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingOpenSelected;", "()V", "Cart_And_CheckOut", "", "Notification", "Order_History", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventOrderTrackingOpenSelected {
            public static final String Cart_And_CheckOut = "Cart&CheckOut";
            public static final Value INSTANCE = new Value();
            public static final String Notification = "Notification";
            public static final String Order_History = "Order History";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingExpandSelected;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingExpandSelected$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingExpandSelected$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventOrderTrackingExpandSelected {
        public static final Companion Companion = new Companion(null);
        public static final String name = "OrderTracking_ExpandSelected";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingExpandSelected$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventOrderTrackingExpandSelected() {
        }

        public /* synthetic */ EventOrderTrackingExpandSelected(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingExpandSelected$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingExpandSelected;", "()V", "orderID", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventOrderTrackingExpandSelected {
            public static final Param INSTANCE = new Param();
            public static final String orderID = "orderID";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingExpandSelected$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingExpandSelected;", "()V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventOrderTrackingExpandSelected {
            public static final Value INSTANCE = new Value();

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingMapSelected;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingMapSelected$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingMapSelected$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventOrderTrackingMapSelected {
        public static final Companion Companion = new Companion(null);
        public static final String name = "OrderTracking_MapSelected";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingMapSelected$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventOrderTrackingMapSelected() {
        }

        public /* synthetic */ EventOrderTrackingMapSelected(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingMapSelected$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingMapSelected;", "()V", "orderID", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventOrderTrackingMapSelected {
            public static final Param INSTANCE = new Param();
            public static final String orderID = "orderID";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingMapSelected$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingMapSelected;", "()V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventOrderTrackingMapSelected {
            public static final Value INSTANCE = new Value();

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingSupportSelected;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingSupportSelected$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingSupportSelected$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventOrderTrackingSupportSelected {
        public static final Companion Companion = new Companion(null);
        public static final String name = "OrderTracking_SupportSelected";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingSupportSelected$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventOrderTrackingSupportSelected() {
        }

        public /* synthetic */ EventOrderTrackingSupportSelected(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingSupportSelected$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingSupportSelected;", "()V", "orderID", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventOrderTrackingSupportSelected {
            public static final Param INSTANCE = new Param();
            public static final String orderID = "orderID";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingSupportSelected$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingSupportSelected;", "()V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventOrderTrackingSupportSelected {
            public static final Value INSTANCE = new Value();

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingShipperSelected;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingShipperSelected$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingShipperSelected$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderTrackingEvents.kt */
    public static abstract class EventOrderTrackingShipperSelected {
        public static final Companion Companion = new Companion(null);
        public static final String name = "OrderTracking_ShipperSelected";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingShipperSelected$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventOrderTrackingShipperSelected() {
        }

        public /* synthetic */ EventOrderTrackingShipperSelected(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingShipperSelected$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingShipperSelected;", "()V", "orderID", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Param extends EventOrderTrackingShipperSelected {
            public static final Param INSTANCE = new Param();
            public static final String orderID = "orderID";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingShipperSelected$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderTrackingEvents$EventOrderTrackingShipperSelected;", "()V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderTrackingEvents.kt */
        public static final class Value extends EventOrderTrackingShipperSelected {
            public static final Value INSTANCE = new Value();

            private Value() {
                super(null);
            }
        }
    }
}
