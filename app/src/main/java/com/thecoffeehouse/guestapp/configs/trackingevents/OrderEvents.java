package com.thecoffeehouse.guestapp.configs.trackingevents;

import com.facebook.internal.logging.monitor.MonitorLogServerProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents;", "", "()V", "EventCategoryProductList", "EventChangeDeliAddress", "EventFavoriteItem", "EventFavoriteItemList", "EventItemAddedToCartSuccessfully", "EventRecentItemList", "EventSearchItem", "EventViewCategoryItemList", "EventViewHome", "EventViewItemDetail", "EventViewMenu", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderEvents.kt */
public final class OrderEvents {
    public static final OrderEvents INSTANCE = new OrderEvents();

    private OrderEvents() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewHome;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewHome$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewHome$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderEvents.kt */
    public static abstract class EventViewHome {
        public static final Companion Companion = new Companion(null);
        public static final String name = "View_Home";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewHome$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventViewHome() {
        }

        public /* synthetic */ EventViewHome(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewHome$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewHome;", "()V", "entryPoints", "", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Param extends EventViewHome {
            public static final Param INSTANCE = new Param();
            public static final String entryPoints = "entrypoints";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewHome$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewHome;", "()V", "Deeplink", "", "Notification", "Others", "Refresh", "Store_Detail", "Tab_Order", "Voucher_Detail", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Value extends EventViewHome {
            public static final String Deeplink = "Deeplink";
            public static final Value INSTANCE = new Value();
            public static final String Notification = "Notification";
            public static final String Others = "Others";
            public static final String Refresh = "Refresh";
            public static final String Store_Detail = "Store_Detail";
            public static final String Tab_Order = "Tab_Order";
            public static final String Voucher_Detail = "Voucher_Detail";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewMenu;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewMenu$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewMenu$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderEvents.kt */
    public static abstract class EventViewMenu {
        public static final Companion Companion = new Companion(null);
        public static final String name = "View_Menu";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewMenu$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventViewMenu() {
        }

        public /* synthetic */ EventViewMenu(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewMenu$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewMenu;", "()V", Param.defaultShippingMethod, "", Param.itemsInCart, Param.menuType, Param.qtyCatsInMenu, "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Param extends EventViewMenu {
            public static final Param INSTANCE = new Param();
            public static final String defaultShippingMethod = "defaultShippingMethod";
            public static final String itemsInCart = "itemsInCart";
            public static final String menuType = "menuType";
            public static final String qtyCatsInMenu = "qtyCatsInMenu";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewMenu$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewMenu;", "()V", "Deeplink", "", "Deli", "Empty", Value.Home_Shortcut, "Notification", "Others", "Pickup", "Refresh", "Store_Detail", "Tab_Order", "Voucher_Detail", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Value extends EventViewMenu {
            public static final String Deeplink = "Deeplink";
            public static final String Deli = "Deli";
            public static final String Empty = "Empty";
            public static final String Home_Shortcut = "Home_Shortcut";
            public static final Value INSTANCE = new Value();
            public static final String Notification = "Notification";
            public static final String Others = "Others";
            public static final String Pickup = "Pickup";
            public static final String Refresh = "Refresh";
            public static final String Store_Detail = "Store_Detail";
            public static final String Tab_Order = "Tab_Order";
            public static final String Voucher_Detail = "Voucher_Detail";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventSearchItem;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventSearchItem$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventSearchItem$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderEvents.kt */
    public static abstract class EventSearchItem {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Search_Item";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventSearchItem$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventSearchItem() {
        }

        public /* synthetic */ EventSearchItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventSearchItem$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventSearchItem;", "()V", "selectedIndex", "", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Param extends EventSearchItem {
            public static final Param INSTANCE = new Param();
            public static final String selectedIndex = "selectedIndex";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventSearchItem$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventSearchItem;", "()V", "Tab_Order", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Value extends EventSearchItem {
            public static final Value INSTANCE = new Value();
            public static final String Tab_Order = "Tab_Order";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItemList;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItemList$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItemList$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderEvents.kt */
    public static abstract class EventFavoriteItemList {
        public static final Companion Companion = new Companion(null);
        public static final String name = "View_Favorite_Item_List";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItemList$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventFavoriteItemList() {
        }

        public /* synthetic */ EventFavoriteItemList(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItemList$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItemList;", "()V", "source", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Param extends EventFavoriteItemList {
            public static final Param INSTANCE = new Param();
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItemList$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItemList;", "()V", Value.qtyItemsInFav, "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Value extends EventFavoriteItemList {
            public static final Value INSTANCE = new Value();
            public static final String qtyItemsInFav = "qtyItemsInFav";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewItemDetail;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewItemDetail$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewItemDetail$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderEvents.kt */
    public static abstract class EventViewItemDetail {
        public static final Companion Companion = new Companion(null);
        public static final String name = "View_Item_Detail";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewItemDetail$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventViewItemDetail() {
        }

        public /* synthetic */ EventViewItemDetail(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewItemDetail$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewItemDetail;", "()V", "categoryID", "", "isRecentItem", "productID", "selectedIndex", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Param extends EventViewItemDetail {
            public static final Param INSTANCE = new Param();
            public static final String categoryID = "categoryID";
            public static final String isRecentItem = "isRecentItem";
            public static final String productID = "productID";
            public static final String selectedIndex = "selectedIndex";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewItemDetail$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewItemDetail;", "()V", "Cart", "", "Category", "Deeplink", "Favorite", "Others", "Recent", "Search", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Value extends EventViewItemDetail {
            public static final String Cart = "Cart";
            public static final String Category = "Category";
            public static final String Deeplink = "Deeplink";
            public static final String Favorite = "Favorite";
            public static final Value INSTANCE = new Value();
            public static final String Others = "Others";
            public static final String Recent = "Recent";
            public static final String Search = "Search";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventRecentItemList;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventRecentItemList$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventRecentItemList$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderEvents.kt */
    public static abstract class EventRecentItemList {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Event_Recent_Item_List";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventRecentItemList$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventRecentItemList() {
        }

        public /* synthetic */ EventRecentItemList(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventRecentItemList$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventRecentItemList;", "()V", "source", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Param extends EventRecentItemList {
            public static final Param INSTANCE = new Param();
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventRecentItemList$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventRecentItemList;", "()V", Value.qtyItemsInRecent, "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Value extends EventRecentItemList {
            public static final Value INSTANCE = new Value();
            public static final String qtyItemsInRecent = "qtyItemsInRecent";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewCategoryItemList;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewCategoryItemList$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewCategoryItemList$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderEvents.kt */
    public static abstract class EventViewCategoryItemList {
        public static final Companion Companion = new Companion(null);
        public static final String name = "View_Category_Item_List";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewCategoryItemList$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventViewCategoryItemList() {
        }

        public /* synthetic */ EventViewCategoryItemList(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewCategoryItemList$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewCategoryItemList;", "()V", "source", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Param extends EventViewCategoryItemList {
            public static final Param INSTANCE = new Param();
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewCategoryItemList$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventViewCategoryItemList;", "()V", "categoryID", "", "qtyItems", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Value extends EventViewCategoryItemList {
            public static final Value INSTANCE = new Value();
            public static final String categoryID = "categoryID";
            public static final String qtyItems = "qtyItems";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventCategoryProductList;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventCategoryProductList$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventCategoryProductList$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderEvents.kt */
    public static abstract class EventCategoryProductList {
        public static final Companion Companion = new Companion(null);
        public static final String name = "View_Category_Product_List";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventCategoryProductList$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventCategoryProductList() {
        }

        public /* synthetic */ EventCategoryProductList(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventCategoryProductList$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventCategoryProductList;", "()V", "categoryID", "", "qtyItems", Param.selectedCatIndex, "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Param extends EventCategoryProductList {
            public static final Param INSTANCE = new Param();
            public static final String categoryID = "categoryID";
            public static final String qtyItems = "qtyItems";
            public static final String selectedCatIndex = "selectedCatIndex";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventCategoryProductList$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventCategoryProductList;", "()V", MonitorLogServerProtocol.PARAM_CATEGORY, "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Value extends EventCategoryProductList {
            public static final Value INSTANCE = new Value();
            public static final String category = "Category";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItem;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItem$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItem$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderEvents.kt */
    public static abstract class EventFavoriteItem {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Favorite_Item";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItem$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventFavoriteItem() {
        }

        public /* synthetic */ EventFavoriteItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItem$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItem;", "()V", "categoryID", "", "productID", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Param extends EventFavoriteItem {
            public static final Param INSTANCE = new Param();
            public static final String categoryID = "categoryID";
            public static final String productID = "productID";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItem$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventFavoriteItem;", "()V", Value.ItemDetail, "", "Menu", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Value extends EventFavoriteItem {
            public static final Value INSTANCE = new Value();
            public static final String ItemDetail = "ItemDetail";
            public static final String Menu = "Menu";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventItemAddedToCartSuccessfully;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventItemAddedToCartSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventItemAddedToCartSuccessfully$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderEvents.kt */
    public static abstract class EventItemAddedToCartSuccessfully {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Item_Added_To_Cart_Successfully";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventItemAddedToCartSuccessfully$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventItemAddedToCartSuccessfully() {
        }

        public /* synthetic */ EventItemAddedToCartSuccessfully(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventItemAddedToCartSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventItemAddedToCartSuccessfully;", "()V", "categoryID", "", "currentShipping", Param.hintNoteCount, Param.isCustomized, Param.isFavItem, "isNoted", "isQtyChanged", "isRecentItem", "productID", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Param extends EventItemAddedToCartSuccessfully {
            public static final Param INSTANCE = new Param();
            public static final String categoryID = "categoryID";
            public static final String currentShipping = "currentShipping";
            public static final String hintNoteCount = "hintNoteCount";
            public static final String isCustomized = "isCustomized";
            public static final String isFavItem = "isFavItem";
            public static final String isNoted = "isNoted";
            public static final String isQtyChanged = "isQtyChanged";
            public static final String isRecentItem = "isRecentItem";
            public static final String productID = "productID";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventItemAddedToCartSuccessfully$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventItemAddedToCartSuccessfully;", "()V", "Category", "", "Deeplink", "Deli", "Empty", "Favorite", "Others", "Pickup", "Recent", "Search", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Value extends EventItemAddedToCartSuccessfully {
            public static final String Category = "Category";
            public static final String Deeplink = "Deeplink";
            public static final String Deli = "Deli";
            public static final String Empty = "Empty";
            public static final String Favorite = "Favorite";
            public static final Value INSTANCE = new Value();
            public static final String Others = "Others";
            public static final String Pickup = "Pickup";
            public static final String Recent = "Recent";
            public static final String Search = "Search";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventChangeDeliAddress;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventChangeDeliAddress$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventChangeDeliAddress$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderEvents.kt */
    public static abstract class EventChangeDeliAddress {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Change_Deli_Address";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventChangeDeliAddress$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventChangeDeliAddress() {
        }

        public /* synthetic */ EventChangeDeliAddress(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventChangeDeliAddress$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventChangeDeliAddress;", "()V", "hasFavoriteAddress", "", "hasRecentAddress", Param.hasSavedAddress, "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Param extends EventChangeDeliAddress {
            public static final Param INSTANCE = new Param();
            public static final String hasFavoriteAddress = "hasFavoriteAddress";
            public static final String hasRecentAddress = "hasRecentAddress";
            public static final String hasSavedAddress = "hasSavedAddress";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventChangeDeliAddress$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/OrderEvents$EventChangeDeliAddress;", "()V", "Checkout", "", "Menu", "Others", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: OrderEvents.kt */
        public static final class Value extends EventChangeDeliAddress {
            public static final String Checkout = "Checkout";
            public static final Value INSTANCE = new Value();
            public static final String Menu = "Menu";
            public static final String Others = "Others";

            private Value() {
                super(null);
            }
        }
    }
}
