package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/DefaultString;", "", "scheduleTime", "", "scheduleDay", "(Ljava/lang/String;Ljava/lang/String;)V", "getScheduleDay", "()Ljava/lang/String;", "getScheduleTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class DefaultString {
    @SerializedName("schedule_day")
    private final String scheduleDay;
    @SerializedName("schedule_time")
    private final String scheduleTime;

    public DefaultString() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ DefaultString copy$default(DefaultString defaultString, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultString.scheduleTime;
        }
        if ((i & 2) != 0) {
            str2 = defaultString.scheduleDay;
        }
        return defaultString.copy(str, str2);
    }

    public final String component1() {
        return this.scheduleTime;
    }

    public final String component2() {
        return this.scheduleDay;
    }

    public final DefaultString copy(String str, String str2) {
        return new DefaultString(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultString)) {
            return false;
        }
        DefaultString defaultString = (DefaultString) obj;
        return Intrinsics.areEqual(this.scheduleTime, defaultString.scheduleTime) && Intrinsics.areEqual(this.scheduleDay, defaultString.scheduleDay);
    }

    public int hashCode() {
        String str = this.scheduleTime;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.scheduleDay;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "DefaultString(scheduleTime=" + this.scheduleTime + ", scheduleDay=" + this.scheduleDay + ")";
    }

    public DefaultString(String str, String str2) {
        this.scheduleTime = str;
        this.scheduleDay = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultString(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getScheduleTime() {
        return this.scheduleTime;
    }

    public final String getScheduleDay() {
        return this.scheduleDay;
    }
}
