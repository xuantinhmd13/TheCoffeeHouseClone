package com.thecoffeehouse.guestapp.configs.trackingevents;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EventWithTrackingData;", "test", "com/thecoffeehouse/guestapp/configs/trackingevents/TrackingEventService$Companion$triggerSendTrackingEvent$1$1$1$2", "com/thecoffeehouse/guestapp/configs/trackingevents/TrackingEventService$Companion$triggerSendTrackingEvent$1$$special$$inlined$also$lambda$2"}, k = 3, mv = {1, 4, 0})
/* compiled from: TrackingEventService.kt */
final class TrackingEventService$Companion$triggerSendTrackingEvent$1$$special$$inlined$let$lambda$2<T> implements Predicate<EventWithTrackingData> {
    final /* synthetic */ EventSource $event$inlined;
    final /* synthetic */ TrackingEventService$Companion$triggerSendTrackingEvent$1 this$0;

    TrackingEventService$Companion$triggerSendTrackingEvent$1$$special$$inlined$let$lambda$2(TrackingEventService$Companion$triggerSendTrackingEvent$1 trackingEventService$Companion$triggerSendTrackingEvent$1, EventSource eventSource) {
        this.this$0 = trackingEventService$Companion$triggerSendTrackingEvent$1;
        this.$event$inlined = eventSource;
    }

    public final boolean test(EventWithTrackingData eventWithTrackingData) {
        Intrinsics.checkNotNullParameter(eventWithTrackingData, "it");
        return Intrinsics.areEqual(eventWithTrackingData.getEventName(), this.this$0.$eventName);
    }
}
