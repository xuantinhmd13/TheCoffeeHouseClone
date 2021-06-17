package com.thecoffeehouse.guestapp.configs.trackingevents;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u000f\u001a\u00060\u0001j\u0002`\u0006HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0001j\u0002`\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0005\u001a\u00060\u0001j\u0002`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/EventSource;", "", "eventName", "", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EventName;", "source", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ParamValue;", "(Ljava/lang/String;Ljava/lang/Object;)V", "getEventName", "()Ljava/lang/String;", "getSource", "()Ljava/lang/Object;", "setSource", "(Ljava/lang/Object;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TrackingEventService.kt */
public final class EventSource {
    private final String eventName;
    private Object source;

    public static /* synthetic */ EventSource copy$default(EventSource eventSource, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = eventSource.eventName;
        }
        if ((i & 2) != 0) {
            obj = eventSource.source;
        }
        return eventSource.copy(str, obj);
    }

    public final String component1() {
        return this.eventName;
    }

    public final Object component2() {
        return this.source;
    }

    public final EventSource copy(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "eventName");
        Intrinsics.checkNotNullParameter(obj, "source");
        return new EventSource(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventSource)) {
            return false;
        }
        EventSource eventSource = (EventSource) obj;
        return Intrinsics.areEqual(this.eventName, eventSource.eventName) && Intrinsics.areEqual(this.source, eventSource.source);
    }

    public int hashCode() {
        String str = this.eventName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Object obj = this.source;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "EventSource(eventName=" + this.eventName + ", source=" + this.source + ")";
    }

    public EventSource(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "eventName");
        Intrinsics.checkNotNullParameter(obj, "source");
        this.eventName = str;
        this.source = obj;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Object getSource() {
        return this.source;
    }

    public final void setSource(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.source = obj;
    }
}
