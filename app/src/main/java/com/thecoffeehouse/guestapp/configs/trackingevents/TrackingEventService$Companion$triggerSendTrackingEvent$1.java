package com.thecoffeehouse.guestapp.configs.trackingevents;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: TrackingEventService.kt */
public final class TrackingEventService$Companion$triggerSendTrackingEvent$1 implements Runnable {
    final /* synthetic */ String $eventName;

    TrackingEventService$Companion$triggerSendTrackingEvent$1(String str) {
        this.$eventName = str;
    }

    public final void run() {
        Object obj;
        Iterator it = TrackingEventService.mTrackingSources.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((EventSource) obj).getEventName(), this.$eventName)) {
                break;
            }
        }
        EventSource eventSource = (EventSource) obj;
        if (eventSource != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TrackingData("source", eventSource.getSource()));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : TrackingEventService.mTrackingParams) {
                if (Intrinsics.areEqual(((EventWithTrackingData) obj2).getEventName(), this.$eventName)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList<EventWithTrackingData> arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (EventWithTrackingData eventWithTrackingData : arrayList3) {
                arrayList4.add(eventWithTrackingData.getTrackingData());
            }
            arrayList.addAll(arrayList4);
            Unit unused = TrackingEventService.Companion.logCustomEventName(eventSource.getEventName(), arrayList);
            TrackingEventService.mTrackingSources.removeIf(new TrackingEventService$Companion$triggerSendTrackingEvent$1$$special$$inlined$let$lambda$1(this, eventSource));
            TrackingEventService.mTrackingParams.removeIf(new TrackingEventService$Companion$triggerSendTrackingEvent$1$$special$$inlined$let$lambda$2(this, eventSource));
        }
    }
}
