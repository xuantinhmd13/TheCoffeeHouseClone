package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Day;", "", "key", "", ViewHierarchyConstants.TEXT_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getText", "setText", "equals", "", "other", "hashCode", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Day {
    @SerializedName("key")
    private String key;
    @SerializedName(ViewHierarchyConstants.TEXT_KEY)
    private String text;

    public final String getKey() {
        return this.key;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public Day(String str, String str2) {
        this.key = str;
        this.text = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.orders.Day");
        Day day = (Day) obj;
        if (!(!Intrinsics.areEqual(this.key, day.key)) && !(!Intrinsics.areEqual(this.text, day.text))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
