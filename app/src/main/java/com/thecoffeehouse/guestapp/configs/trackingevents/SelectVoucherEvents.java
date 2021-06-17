package com.thecoffeehouse.guestapp.configs.trackingevents;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents;", "", "()V", "EventApplyAVoucher", "EventViewVoucherDetail", "EventViewVoucherList", "EventVoucherAppliedFailed", "EventVoucherAppliedSuccessfully", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SelectVoucherEvents.kt */
public final class SelectVoucherEvents {
    public static final SelectVoucherEvents INSTANCE = new SelectVoucherEvents();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherList;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherList$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherList$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SelectVoucherEvents.kt */
    public static abstract class EventViewVoucherList {
        public static final Companion Companion = new Companion(null);
        public static final String name = "View_Voucher_List";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherList$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventViewVoucherList() {
        }

        public /* synthetic */ EventViewVoucherList(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherList$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherList;", "()V", Param.qtyVoucherInList, "", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Param extends EventViewVoucherList {
            public static final Param INSTANCE = new Param();
            public static final String qtyVoucherInList = "qtyVoucherInList";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherList$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherList;", "()V", "Cart", "", "Deeplink", "Notification", "Others", "Redeem_Reward", "Tab_Reward", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Value extends EventViewVoucherList {
            public static final String Cart = "Cart";
            public static final String Deeplink = "Deeplink";
            public static final Value INSTANCE = new Value();
            public static final String Notification = "Notification";
            public static final String Others = "Others";
            public static final String Redeem_Reward = "Redeem_Reward";
            public static final String Tab_Reward = "Tab_Reward";

            private Value() {
                super(null);
            }
        }
    }

    private SelectVoucherEvents() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherDetail;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherDetail$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherDetail$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SelectVoucherEvents.kt */
    public static abstract class EventViewVoucherDetail {
        public static final Companion Companion = new Companion(null);
        public static final String name = "View_Voucher_Detail";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherDetail$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventViewVoucherDetail() {
        }

        public /* synthetic */ EventViewVoucherDetail(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherDetail$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherDetail;", "()V", "daysTilExpired", "", "partnerID", "selectedIndex", "source", "voucherID", "voucherMinOrder", "voucherShippingMethod", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Param extends EventViewVoucherDetail {
            public static final Param INSTANCE = new Param();
            public static final String daysTilExpired = "daysTilExpired";
            public static final String partnerID = "partnerID";
            public static final String selectedIndex = "selectedIndex";
            public static final String source = "source";
            public static final String voucherID = "voucherID";
            public static final String voucherMinOrder = "voucherMinOrder";
            public static final String voucherShippingMethod = "voucherShippingMethod";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherDetail$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventViewVoucherDetail;", "()V", "Cart", "", "Deeplink", "Notification", "Others", "Redeem_Reward", "Tab_Reward", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Value extends EventViewVoucherDetail {
            public static final String Cart = "Cart";
            public static final String Deeplink = "Deeplink";
            public static final Value INSTANCE = new Value();
            public static final String Notification = "Notification";
            public static final String Others = "Others";
            public static final String Redeem_Reward = "Redeem_Reward";
            public static final String Tab_Reward = "Tab_Reward";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventApplyAVoucher;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventApplyAVoucher$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventApplyAVoucher$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SelectVoucherEvents.kt */
    public static abstract class EventApplyAVoucher {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Apply_a_Voucher";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventApplyAVoucher$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventApplyAVoucher() {
        }

        public /* synthetic */ EventApplyAVoucher(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventApplyAVoucher$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventApplyAVoucher;", "()V", "daysTilExpired", "", "entryPoint", "partnerID", "source", "voucherID", "voucherMinOrder", "voucherShippingMethod", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Param extends EventApplyAVoucher {
            public static final Param INSTANCE = new Param();
            public static final String daysTilExpired = "daysTilExpired";
            public static final String entryPoint = "entryPoint";
            public static final String partnerID = "partnerID";
            public static final String source = "source";
            public static final String voucherID = "voucherID";
            public static final String voucherMinOrder = "voucherMinOrder";
            public static final String voucherShippingMethod = "voucherShippingMethod";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventApplyAVoucher$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventApplyAVoucher;", "()V", "Cart", "", "Deeplink", "Manual", "Notification", "Others", "Redeem_Reward", "Tab_Reward", "Voucher_Detail", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Value extends EventApplyAVoucher {
            public static final String Cart = "Cart";
            public static final String Deeplink = "Deeplink";
            public static final Value INSTANCE = new Value();
            public static final String Manual = "Manual";
            public static final String Notification = "Notification";
            public static final String Others = "Others";
            public static final String Redeem_Reward = "Redeem_Reward";
            public static final String Tab_Reward = "Tab_Reward";
            public static final String Voucher_Detail = "Voucher_Detail";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedSuccessfully;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedSuccessfully$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SelectVoucherEvents.kt */
    public static abstract class EventVoucherAppliedSuccessfully {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Voucher_Applied_Successfully";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedSuccessfully$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventVoucherAppliedSuccessfully() {
        }

        public /* synthetic */ EventVoucherAppliedSuccessfully(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedSuccessfully$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedSuccessfully;", "()V", "daysTilExpired", "", "entryPoint", "partnerID", "selectedIndex", "source", "voucherID", "voucherMinOrder", "voucherShippingMethod", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Param extends EventVoucherAppliedSuccessfully {
            public static final Param INSTANCE = new Param();
            public static final String daysTilExpired = "daysTilExpired";
            public static final String entryPoint = "entryPoint";
            public static final String partnerID = "partnerID";
            public static final String selectedIndex = "selectedIndex";
            public static final String source = "source";
            public static final String voucherID = "voucherID";
            public static final String voucherMinOrder = "voucherMinOrder";
            public static final String voucherShippingMethod = "voucherShippingMethod";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedSuccessfully$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedSuccessfully;", "()V", "Cart", "", "Deeplink", "Manual", "Notification", "Others", "Redeem_Reward", "Tab_Reward", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Value extends EventVoucherAppliedSuccessfully {
            public static final String Cart = "Cart";
            public static final String Deeplink = "Deeplink";
            public static final Value INSTANCE = new Value();
            public static final String Manual = "Manual";
            public static final String Notification = "Notification";
            public static final String Others = "Others";
            public static final String Redeem_Reward = "Redeem_Reward";
            public static final String Tab_Reward = "Tab_Reward";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedFailed;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedFailed$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedFailed$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SelectVoucherEvents.kt */
    public static abstract class EventVoucherAppliedFailed {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Voucher_Applied_Failed";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedFailed$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventVoucherAppliedFailed() {
        }

        public /* synthetic */ EventVoucherAppliedFailed(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedFailed$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedFailed;", "()V", "daysTilExpired", "", "entryPoint", "partnerID", "selectedIndex", "source", "voucherID", "voucherMinOrder", "voucherShippingMethod", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Param extends EventVoucherAppliedFailed {
            public static final Param INSTANCE = new Param();
            public static final String daysTilExpired = "daysTilExpired";
            public static final String entryPoint = "entryPoint";
            public static final String partnerID = "partnerID";
            public static final String selectedIndex = "selectedIndex";
            public static final String source = "source";
            public static final String voucherID = "voucherID";
            public static final String voucherMinOrder = "voucherMinOrder";
            public static final String voucherShippingMethod = "voucherShippingMethod";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedFailed$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/SelectVoucherEvents$EventVoucherAppliedFailed;", "()V", "Cart", "", "Deeplink", "Manual", "Notification", "Others", "Redeem_Reward", "Tab_Reward", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SelectVoucherEvents.kt */
        public static final class Value extends EventVoucherAppliedFailed {
            public static final String Cart = "Cart";
            public static final String Deeplink = "Deeplink";
            public static final Value INSTANCE = new Value();
            public static final String Manual = "Manual";
            public static final String Notification = "Notification";
            public static final String Others = "Others";
            public static final String Redeem_Reward = "Redeem Reward";
            public static final String Tab_Reward = "Tab Reward";

            private Value() {
                super(null);
            }
        }
    }
}
