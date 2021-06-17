package com.thecoffeehouse.guestapp.configs.trackingevents;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabHomeEvents;", "", "()V", EventNotificationAccessed.name, "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TabHomeEvents.kt */
public final class TabHomeEvents {
    public static final TabHomeEvents INSTANCE = new TabHomeEvents();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabHomeEvents$EventNotificationAccessed;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabHomeEvents$EventNotificationAccessed$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabHomeEvents$EventNotificationAccessed$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: TabHomeEvents.kt */
    public static abstract class EventNotificationAccessed {
        public static final Companion Companion = new Companion(null);
        public static final String name = "EventNotificationAccessed";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabHomeEvents$EventNotificationAccessed$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabHomeEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventNotificationAccessed() {
        }

        public /* synthetic */ EventNotificationAccessed(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabHomeEvents$EventNotificationAccessed$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabHomeEvents$EventNotificationAccessed;", "()V", Param.deeplinkName, "", Param.notifIndex, "source", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabHomeEvents.kt */
        public static final class Param extends EventNotificationAccessed {
            public static final Param INSTANCE = new Param();
            public static final String deeplinkName = "deeplinkName";
            public static final String notifIndex = "notifIndex";
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabHomeEvents$EventNotificationAccessed$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabHomeEvents$EventNotificationAccessed;", "()V", "Notification", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabHomeEvents.kt */
        public static final class Value extends EventNotificationAccessed {
            public static final Value INSTANCE = new Value();
            public static final String Notification = "Notification";

            private Value() {
                super(null);
            }
        }
    }

    private TabHomeEvents() {
    }
}
