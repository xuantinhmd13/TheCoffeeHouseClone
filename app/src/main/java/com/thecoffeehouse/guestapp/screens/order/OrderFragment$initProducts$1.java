package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.services.api.model.orders.Menu;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$initProducts$1<T> implements Predicate<Object> {
    public static final OrderFragment$initProducts$1 INSTANCE = new OrderFragment$initProducts$1();

    OrderFragment$initProducts$1() {
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "it");
        return (obj instanceof String) || (obj instanceof Product) || (obj instanceof Menu);
    }
}
