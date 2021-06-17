package com.thecoffeehouse.guestapp.configs.trackingevents;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents;", "", "()V", "EventAllCartRemoved", "EventCartItemEditedSuccessfully", "EventCartItemRemovedSuccessfully", "EventViewCart", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: EditCartEvents.kt */
public final class EditCartEvents {
    public static final EditCartEvents INSTANCE = new EditCartEvents();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventViewCart;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventViewCart$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventViewCart$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: EditCartEvents.kt */
    public static abstract class EventViewCart {
        public static final Companion Companion = new Companion(null);
        public static final String name = "View_Cart";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventViewCart$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventViewCart() {
        }

        public /* synthetic */ EventViewCart(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventViewCart$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventViewCart;", "()V", "cartValue", "", "currentShipping", "qtyItemsInCart", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Param extends EventViewCart {
            public static final Param INSTANCE = new Param();
            public static final String cartValue = "cartValue";
            public static final String currentShipping = "currentShipping";
            public static final String qtyItemsInCart = "qtyItemsInCart";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventViewCart$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventViewCart;", "()V", "Checkout", "", "Deli", "Menu", "Others", "Pickup", Value.Reorder, "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Value extends EventViewCart {
            public static final String Checkout = "Checkout";
            public static final String Deli = "Deli";
            public static final Value INSTANCE = new Value();
            public static final String Menu = "Menu";
            public static final String Others = "Others";
            public static final String Pickup = "Pickup";
            public static final String Reorder = "Reorder";

            private Value() {
                super(null);
            }
        }
    }

    private EditCartEvents() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemEditedSuccessfully;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemEditedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemEditedSuccessfully$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: EditCartEvents.kt */
    public static abstract class EventCartItemEditedSuccessfully {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Cart_Item_Edited_Successfully";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemEditedSuccessfully$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventCartItemEditedSuccessfully() {
        }

        public /* synthetic */ EventCartItemEditedSuccessfully(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemEditedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemEditedSuccessfully;", "()V", "categoryID", "", "entryPoints", Param.isCustomizeChanged, Param.isNoteChanged, "isQtyChanged", "productID", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Param extends EventCartItemEditedSuccessfully {
            public static final Param INSTANCE = new Param();
            public static final String categoryID = "categoryID";
            public static final String entryPoints = "entryPoints";
            public static final String isCustomizeChanged = "isCustomizeChanged";
            public static final String isNoteChanged = "isNoteChanged";
            public static final String isQtyChanged = "isQtyChanged";
            public static final String productID = "productID";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemEditedSuccessfully$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemEditedSuccessfully;", "()V", "Cart", "", "On_Swipe", "Pencil_Icon", "Tap_On_Item", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Value extends EventCartItemEditedSuccessfully {
            public static final String Cart = "Cart";
            public static final Value INSTANCE = new Value();
            public static final String On_Swipe = "On Swipe";
            public static final String Pencil_Icon = "Pencil Icon";
            public static final String Tap_On_Item = "Tap On Item";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemRemovedSuccessfully;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemRemovedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemRemovedSuccessfully$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: EditCartEvents.kt */
    public static abstract class EventCartItemRemovedSuccessfully {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Cart_Item_Removed_Successfully";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemRemovedSuccessfully$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventCartItemRemovedSuccessfully() {
        }

        public /* synthetic */ EventCartItemRemovedSuccessfully(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemRemovedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemRemovedSuccessfully;", "()V", "categoryID", "", "entryPoints", "productID", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Param extends EventCartItemRemovedSuccessfully {
            public static final Param INSTANCE = new Param();
            public static final String categoryID = "categoryID";
            public static final String entryPoints = "entryPoints";
            public static final String productID = "productID";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemRemovedSuccessfully$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventCartItemRemovedSuccessfully;", "()V", "Cart", "", "Delete_all", "On_Swipe", "Tap_On_Item", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Value extends EventCartItemRemovedSuccessfully {
            public static final String Cart = "Cart";
            public static final String Delete_all = "Delete all";
            public static final Value INSTANCE = new Value();
            public static final String On_Swipe = "On Swipe";
            public static final String Tap_On_Item = "Tap On Item";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventAllCartRemoved;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventAllCartRemoved$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventAllCartRemoved$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: EditCartEvents.kt */
    public static abstract class EventAllCartRemoved {
        public static final Companion Companion = new Companion(null);
        public static final String name = "All_Cart_Removed";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventAllCartRemoved$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventAllCartRemoved() {
        }

        public /* synthetic */ EventAllCartRemoved(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventAllCartRemoved$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventAllCartRemoved;", "()V", Param.categoryList, "", "daysFromDraftCreated", "entryPoints", Param.productList, "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Param extends EventAllCartRemoved {
            public static final Param INSTANCE = new Param();
            public static final String categoryList = "categoryList";
            public static final String daysFromDraftCreated = "daysFromDraftCreated";
            public static final String entryPoints = "entryPoints";
            public static final String productList = "productList";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventAllCartRemoved$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EditCartEvents$EventAllCartRemoved;", "()V", "Cart", "", "Delete_all", "On_Swipe", "Tap_On_Item", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: EditCartEvents.kt */
        public static final class Value extends EventAllCartRemoved {
            public static final String Cart = "Cart";
            public static final String Delete_all = "Delete all";
            public static final Value INSTANCE = new Value();
            public static final String On_Swipe = "On Swipe";
            public static final String Tap_On_Item = "Tap On Item";

            private Value() {
                super(null);
            }
        }
    }
}
