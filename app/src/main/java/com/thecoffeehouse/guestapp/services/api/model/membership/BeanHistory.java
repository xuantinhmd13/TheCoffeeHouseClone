package com.thecoffeehouse.guestapp.services.api.model.membership;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/membership/BeanHistory;", "", "valueStr", "", "time", "", "title", "value", "", "(Ljava/lang/String;JLjava/lang/String;I)V", "getTime", "()J", "getTitle", "()Ljava/lang/String;", "getValue", "()I", "getValueStr", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: GetMembershipResponse.kt */
public final class BeanHistory {
    @SerializedName("time")
    private final long time;
    @SerializedName("title")
    private final String title;
    @SerializedName("value")
    private final int value;
    @SerializedName("value_str")
    private final String valueStr;

    public BeanHistory() {
        this(null, 0, null, 0, 15, null);
    }

    public static /* synthetic */ BeanHistory copy$default(BeanHistory beanHistory, String str, long j, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = beanHistory.valueStr;
        }
        if ((i2 & 2) != 0) {
            j = beanHistory.time;
        }
        if ((i2 & 4) != 0) {
            str2 = beanHistory.title;
        }
        if ((i2 & 8) != 0) {
            i = beanHistory.value;
        }
        return beanHistory.copy(str, j, str2, i);
    }

    public final String component1() {
        return this.valueStr;
    }

    public final long component2() {
        return this.time;
    }

    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.value;
    }

    public final BeanHistory copy(String str, long j, String str2, int i) {
        return new BeanHistory(str, j, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeanHistory)) {
            return false;
        }
        BeanHistory beanHistory = (BeanHistory) obj;
        return Intrinsics.areEqual(this.valueStr, beanHistory.valueStr) && this.time == beanHistory.time && Intrinsics.areEqual(this.title, beanHistory.title) && this.value == beanHistory.value;
    }

    public int hashCode() {
        String str = this.valueStr;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.time)) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + Integer.hashCode(this.value);
    }

    public String toString() {
        return "BeanHistory(valueStr=" + this.valueStr + ", time=" + this.time + ", title=" + this.title + ", value=" + this.value + ")";
    }

    public BeanHistory(String str, long j, String str2, int i) {
        this.valueStr = str;
        this.time = j;
        this.title = str2;
        this.value = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeanHistory(String str, long j, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : j, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0 : i);
    }

    public final String getValueStr() {
        return this.valueStr;
    }

    public final long getTime() {
        return this.time;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }
}
