package com.thecoffeehouse.guestapp.configs.trackingevents;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents;", "", "()V", EventMusicView.name, "EventNewsAccessed", "EventNewsView", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TabMoreEvents.kt */
public final class TabMoreEvents {
    public static final TabMoreEvents INSTANCE = new TabMoreEvents();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventMusicView;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventMusicView$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventMusicView$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: TabMoreEvents.kt */
    public static abstract class EventMusicView {
        public static final Companion Companion = new Companion(null);
        public static final String name = "EventMusicView";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventMusicView$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabMoreEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventMusicView() {
        }

        public /* synthetic */ EventMusicView(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventMusicView$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventMusicView;", "()V", "source", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabMoreEvents.kt */
        public static final class Param extends EventMusicView {
            public static final Param INSTANCE = new Param();
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventMusicView$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventMusicView;", "()V", "Home", "", "More", "Notification", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabMoreEvents.kt */
        public static final class Value extends EventMusicView {
            public static final String Home = "Home";
            public static final Value INSTANCE = new Value();
            public static final String More = "More";
            public static final String Notification = "Notification";

            private Value() {
                super(null);
            }
        }
    }

    private TabMoreEvents() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsView;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsView$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsView$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: TabMoreEvents.kt */
    public static abstract class EventNewsView {
        public static final Companion Companion = new Companion(null);
        public static final String name = "News_View";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsView$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabMoreEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventNewsView() {
        }

        public /* synthetic */ EventNewsView(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsView$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsView;", "()V", "source", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabMoreEvents.kt */
        public static final class Param extends EventNewsView {
            public static final Param INSTANCE = new Param();
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsView$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsView;", "()V", "Home", "", "More", "Notification", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabMoreEvents.kt */
        public static final class Value extends EventNewsView {
            public static final String Home = "Home";
            public static final Value INSTANCE = new Value();
            public static final String More = "More";
            public static final String Notification = "Notification";

            private Value() {
                super(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsAccessed;", "", "()V", "Companion", "Param", "Value", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsAccessed$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsAccessed$Value;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: TabMoreEvents.kt */
    public static abstract class EventNewsAccessed {
        public static final Companion Companion = new Companion(null);
        public static final String name = "News_Accessed";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsAccessed$Companion;", "", "()V", "name", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabMoreEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private EventNewsAccessed() {
        }

        public /* synthetic */ EventNewsAccessed(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsAccessed$Param;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsAccessed;", "()V", "source", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabMoreEvents.kt */
        public static final class Param extends EventNewsAccessed {
            public static final Param INSTANCE = new Param();
            public static final String source = "source";

            private Param() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsAccessed$Value;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TabMoreEvents$EventNewsAccessed;", "()V", Value.News, "", "Notification", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TabMoreEvents.kt */
        public static final class Value extends EventNewsAccessed {
            public static final Value INSTANCE = new Value();
            public static final String News = "News";
            public static final String Notification = "Notification";

            private Value() {
                super(null);
            }
        }
    }
}
