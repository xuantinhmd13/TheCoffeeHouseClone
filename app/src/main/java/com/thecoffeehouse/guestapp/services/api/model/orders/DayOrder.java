package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/DayOrder;", "", "()V", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", ViewHierarchyConstants.TEXT_KEY, "getText", "setText", "times", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Day;", "getTimes", "()Ljava/util/List;", "setTimes", "(Ljava/util/List;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class DayOrder {
    @SerializedName("key")
    private String key;
    @SerializedName(ViewHierarchyConstants.TEXT_KEY)
    private String text;
    @SerializedName("times")
    private List<Day> times = new ArrayList();

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

    public final List<Day> getTimes() {
        return this.times;
    }

    public final void setTimes(List<Day> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.times = list;
    }
}
