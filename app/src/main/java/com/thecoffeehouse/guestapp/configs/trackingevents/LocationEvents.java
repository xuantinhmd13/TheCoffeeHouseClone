package com.thecoffeehouse.guestapp.configs.trackingevents;

import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents;", "", "()V", "EventCreateNewAddressSubmitted", "EventSaveAddressButtonTurned", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LocationEvents.kt */
public final class LocationEvents {
    public static final LocationEvents INSTANCE = new LocationEvents();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventCreateNewAddressSubmitted;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventCreateNewAddressSubmitted$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventCreateNewAddressSubmitted$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: LocationEvents.kt */
    public static abstract class EventCreateNewAddressSubmitted {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Create_New_Address_Submitted";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventCreateNewAddressSubmitted$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: LocationEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventCreateNewAddressSubmitted() {
        }

        public /* synthetic */ EventCreateNewAddressSubmitted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventCreateNewAddressSubmitted$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventCreateNewAddressSubmitted;", "()V", "entryPoints", "", "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: LocationEvents.kt */
        public static final class Param extends EventCreateNewAddressSubmitted {
            public static final Param INSTANCE = new Param();
            public static final String entryPoints = "entryPoints";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventCreateNewAddressSubmitted$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventCreateNewAddressSubmitted;", "()V", "ChangeDeliAddress", "", "CheckOut", "SavedAddress", TrackingScreenService.Tab_More, "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: LocationEvents.kt */
        public static final class Value extends EventCreateNewAddressSubmitted {
            public static final String ChangeDeliAddress = "Change_Deli_Address";
            public static final String CheckOut = "CheckOut";
            public static final Value INSTANCE = new Value();
            public static final String SavedAddress = "Saved Address";
            public static final String Tab_More = "Tab More";

            private Value() {
                super(null);
            }
        }
    }

    private LocationEvents() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventSaveAddressButtonTurned;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventSaveAddressButtonTurned$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventSaveAddressButtonTurned$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: LocationEvents.kt */
    public static abstract class EventSaveAddressButtonTurned {
        public static final Companion Companion = new Companion(null);
        public static final String name = "Save_Address_Button_Turned";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventSaveAddressButtonTurned$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: LocationEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventSaveAddressButtonTurned() {
        }

        public /* synthetic */ EventSaveAddressButtonTurned(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventSaveAddressButtonTurned$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventSaveAddressButtonTurned;", "()V", "source", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: LocationEvents.kt */
        public static final class Param extends EventSaveAddressButtonTurned {
            public static final Param INSTANCE = new Param();
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventSaveAddressButtonTurned$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/LocationEvents$EventSaveAddressButtonTurned;", "()V", "CheckOut", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: LocationEvents.kt */
        public static final class Value extends EventSaveAddressButtonTurned {
            public static final String CheckOut = "CheckOut";
            public static final Value INSTANCE = new Value();

            private Value() {
                super(null);
            }
        }
    }
}
