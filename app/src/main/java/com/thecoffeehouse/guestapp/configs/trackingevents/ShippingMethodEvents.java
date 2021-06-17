package com.thecoffeehouse.guestapp.configs.trackingevents;

import com.thecoffeehouse.guestapp.configs.trackingevents.OrderTrackingEvents;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents;", "", "()V", "standardizeShippingMethodValue", "", "shippingValue", "EventChangeShipping", "EventDeliAddressChangedSuccessfully", "EventPickupStoreAddedSuccessfully", "EventSearchDeliAddress", "EventShippingChangedSuccessfully", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ShippingMethodEvents.kt */
public final class ShippingMethodEvents {
    public static final ShippingMethodEvents INSTANCE = new ShippingMethodEvents();

    private ShippingMethodEvents() {
    }

    public final String standardizeShippingMethodValue(String str) {
        if (str == null) {
            return "Empty";
        }
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return StringsKt.capitalize(lowerCase);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventChangeShipping;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventChangeShipping$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventChangeShipping$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ShippingMethodEvents.kt */
    public static abstract class EventChangeShipping {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Change_Shipping";

        private EventChangeShipping() {
        }

        public /* synthetic */ EventChangeShipping(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventChangeShipping$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventChangeShipping$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventChangeShipping;", "()V", "currentShippingMethod", "", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Param extends EventChangeShipping {
            public static final Param INSTANCE = new Param();
            public static final String currentShippingMethod = "currentShippingMethod";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventChangeShipping$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventChangeShipping;", "()V", "Checkout_Change_Detail", "", "Checkout_Change_Method", "Deli", "Empty", "Menu_Change_Detail", "Menu_Change_Method", "Others", "Pickup", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Value extends EventChangeShipping {
            public static final String Checkout_Change_Detail = "Checkout - Change Detail";
            public static final String Checkout_Change_Method = "Checkout - Change Method";
            public static final String Deli = "Deli";
            public static final String Empty = "Empty";
            public static final Value INSTANCE = new Value();
            public static final String Menu_Change_Detail = "Menu - Change Method";
            public static final String Menu_Change_Method = "Menu - Change Method";
            public static final String Others = "Others";
            public static final String Pickup = "Pickup";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventShippingChangedSuccessfully;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventShippingChangedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventShippingChangedSuccessfully$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ShippingMethodEvents.kt */
    public static abstract class EventShippingChangedSuccessfully {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Shipping_Changed_Successfully";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventShippingChangedSuccessfully$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventShippingChangedSuccessfully() {
        }

        public /* synthetic */ EventShippingChangedSuccessfully(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventShippingChangedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventShippingChangedSuccessfully;", "()V", Param.newShippingMethod, "", Param.oldShippingMethod, "source", "timeOccasion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Param extends EventShippingChangedSuccessfully {
            public static final Param INSTANCE = new Param();
            public static final String newShippingMethod = "newShippingMethod";
            public static final String oldShippingMethod = "oldShippingMethod";
            public static final String source = "source";
            public static final String timeOccasion = "timeOccasion";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventShippingChangedSuccessfully$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventShippingChangedSuccessfully;", "()V", "Breakfast", "", "Checkout_Change_Detail", "Checkout_Change_Method", "Deli", "Dinner", OrderTrackingEvents.EventOrderCreatedSuccessfully.Value.Early_Afternoon, "Empty", "Evening", OrderTrackingEvents.EventOrderCreatedSuccessfully.Value.Late_Afternoon, "Lunch", "Menu_Change_Detail", "Menu_Change_Method", "Morning", "Others", "Pickup", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Value extends EventShippingChangedSuccessfully {
            public static final String Breakfast = "Breakfast";
            public static final String Checkout_Change_Detail = "Checkout - Change Detail";
            public static final String Checkout_Change_Method = "Checkout - Change Method";
            public static final String Deli = "Deli";
            public static final String Dinner = "Dinner";
            public static final String Early_Afternoon = "Early Afternoon";
            public static final String Empty = "Empty";
            public static final String Evening = "Evening";
            public static final Value INSTANCE = new Value();
            public static final String Late_Afternoon = "Late Afternoon";
            public static final String Lunch = "Lunch";
            public static final String Menu_Change_Detail = "Menu - Change Method";
            public static final String Menu_Change_Method = "Menu - Change Method";
            public static final String Morning = "Morning";
            public static final String Others = "Others";
            public static final String Pickup = "Pickup";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventSearchDeliAddress;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventSearchDeliAddress$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventSearchDeliAddress$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ShippingMethodEvents.kt */
    public static abstract class EventSearchDeliAddress {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Search_Deli_Address";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventSearchDeliAddress$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventSearchDeliAddress() {
        }

        public /* synthetic */ EventSearchDeliAddress(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventSearchDeliAddress$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventSearchDeliAddress;", "()V", "hasFavoriteAddress", "", "hasRecentAddress", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Param extends EventSearchDeliAddress {
            public static final Param INSTANCE = new Param();
            public static final String hasFavoriteAddress = "hasFavoriteAddress";
            public static final String hasRecentAddress = "hasRecentAddress";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventSearchDeliAddress$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventSearchDeliAddress;", "()V", "Checkout", "", "Menu", "Others", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Value extends EventSearchDeliAddress {
            public static final String Checkout = "Checkout";
            public static final Value INSTANCE = new Value();
            public static final String Menu = "Menu";
            public static final String Others = "Others";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventDeliAddressChangedSuccessfully;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventDeliAddressChangedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventDeliAddressChangedSuccessfully$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ShippingMethodEvents.kt */
    public static abstract class EventDeliAddressChangedSuccessfully {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Deli_Address_Changed_Successfully";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventDeliAddressChangedSuccessfully$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventDeliAddressChangedSuccessfully() {
        }

        public /* synthetic */ EventDeliAddressChangedSuccessfully(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventDeliAddressChangedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventDeliAddressChangedSuccessfully;", "()V", "entryPoints", "", Param.isNewAddress, Param.isRecentAddress, Param.isSavedAddress, Param.lettersInSearchBox, Param.qtyResults, "selectedIndex", "source", "userLocation", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Param extends EventDeliAddressChangedSuccessfully {
            public static final Param INSTANCE = new Param();
            public static final String entryPoints = "entryPoints";
            public static final String isNewAddress = "isNewAddress";
            public static final String isRecentAddress = "isRecentAddress";
            public static final String isSavedAddress = "isSavedAddress";
            public static final String lettersInSearchBox = "lettersInSearchBox";
            public static final String qtyResults = "qtyResults";
            public static final String selectedIndex = "selectedIndex";
            public static final String source = "source";
            public static final String userLocation = "userLocation";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventDeliAddressChangedSuccessfully$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventDeliAddressChangedSuccessfully;", "()V", "Checkout", "", Value.Custom, "Menu", "Others", "Search_Result", Value.Suggested, "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Value extends EventDeliAddressChangedSuccessfully {
            public static final String Checkout = "Checkout";
            public static final String Custom = "Custom";
            public static final Value INSTANCE = new Value();
            public static final String Menu = "Menu";
            public static final String Others = "Others";
            public static final String Search_Result = "Search Result";
            public static final String Suggested = "Suggested";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventPickupStoreAddedSuccessfully;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventPickupStoreAddedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventPickupStoreAddedSuccessfully$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ShippingMethodEvents.kt */
    public static abstract class EventPickupStoreAddedSuccessfully {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Pickup_Store_Added_Successfully";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventPickupStoreAddedSuccessfully$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventPickupStoreAddedSuccessfully() {
        }

        public /* synthetic */ EventPickupStoreAddedSuccessfully(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventPickupStoreAddedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventPickupStoreAddedSuccessfully;", "()V", Param.connection, "", "entryPoints", Param.isFavStore, Param.isRecentStore, Param.isSearched, "selectedIndex", "source", "userLocation", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Param extends EventPickupStoreAddedSuccessfully {
            public static final Param INSTANCE = new Param();
            public static final String connection = "connection";
            public static final String entryPoints = "entryPoints";
            public static final String isFavStore = "isFavStore";
            public static final String isRecentStore = "isRecentStore";
            public static final String isSearched = "isSearched";
            public static final String selectedIndex = "selectedIndex";
            public static final String source = "source";
            public static final String userLocation = "userLocation";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventPickupStoreAddedSuccessfully$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ShippingMethodEvents$EventPickupStoreAddedSuccessfully;", "()V", "Checkout", "", "Favorite", Value.List, Value.Map, "Menu", "No_Network", "Others", "Recent", "Search", Value.Tab_Store, Value.Wifi, "_3G", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: ShippingMethodEvents.kt */
        public static final class Value extends EventPickupStoreAddedSuccessfully {
            public static final String Checkout = "Checkout";
            public static final String Favorite = "Favorite";
            public static final Value INSTANCE = new Value();
            public static final String List = "List";
            public static final String Map = "Map";
            public static final String Menu = "Menu";
            public static final String No_Network = "No Network";
            public static final String Others = "Others";
            public static final String Recent = "Recent";
            public static final String Search = "Search";
            public static final String Tab_Store = "Tab_Store";
            public static final String Wifi = "Wifi";
            public static final String _3G = "3G";

            private Value() {
                super(null);
            }
        }
    }
}
