package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"formatDistanceToString", "", "storeDistance", "", "app_liveRelease"}, k = 2, mv = {1, 4, 0})
/* compiled from: ItemRowPickStore.kt */
public final class ItemRowPickStoreKt {
    public static final String formatDistanceToString(double d) {
        String format = new DecimalFormat("#.##").format(d);
        Intrinsics.checkNotNullExpressionValue(format, "mFormatDecimalPlace.format(storeDistance)");
        return format;
    }
}
