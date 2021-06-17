package com.thecoffeehouse.guestapp.configs.trackingevents;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EventWithTrackingData;", "", "eventName", "", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EventName;", "trackingData", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TrackingData;", "(Ljava/lang/String;Lcom/thecoffeehouse/guestapp/configs/trackingevents/TrackingData;)V", "getEventName", "()Ljava/lang/String;", "getTrackingData", "()Lcom/thecoffeehouse/guestapp/configs/trackingevents/TrackingData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TrackingEventService.kt */
public final class EventWithTrackingData {
    private final String eventName;
    private final TrackingData trackingData;

    public static /* synthetic */ EventWithTrackingData copy$default(EventWithTrackingData eventWithTrackingData, String str, TrackingData trackingData2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventWithTrackingData.eventName;
        }
        if ((i & 2) != 0) {
            trackingData2 = eventWithTrackingData.trackingData;
        }
        return eventWithTrackingData.copy(str, trackingData2);
    }

    public final String component1() {
        return this.eventName;
    }

    public final TrackingData component2() {
        return this.trackingData;
    }

    public final EventWithTrackingData copy(String str, TrackingData trackingData2) {
        Intrinsics.checkNotNullParameter(str, "eventName");
        Intrinsics.checkNotNullParameter(trackingData2, "trackingData");
        return new EventWithTrackingData(str, trackingData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventWithTrackingData)) {
            return false;
        }
        EventWithTrackingData eventWithTrackingData = (EventWithTrackingData) obj;
        return Intrinsics.areEqual(this.eventName, eventWithTrackingData.eventName) && Intrinsics.areEqual(this.trackingData, eventWithTrackingData.trackingData);
    }

    public int hashCode() {
        String str = this.eventName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        TrackingData trackingData2 = this.trackingData;
        if (trackingData2 != null) {
            i = trackingData2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "EventWithTrackingData(eventName=" + this.eventName + ", trackingData=" + this.trackingData + ")";
    }

    public EventWithTrackingData(String str, TrackingData trackingData2) {
        Intrinsics.checkNotNullParameter(str, "eventName");
        Intrinsics.checkNotNullParameter(trackingData2, "trackingData");
        this.eventName = str;
        this.trackingData = trackingData2;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final TrackingData getTrackingData() {
        return this.trackingData;
    }
}
