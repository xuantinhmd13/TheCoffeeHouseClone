package com.thecoffeehouse.guestapp.di;

import com.thecoffeehouse.guestapp.AppExecutors;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/AppExecutors;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: InjectorUtils.kt */
final class InjectorUtils$initialize$2 extends Lambda implements Function0<AppExecutors> {
    public static final InjectorUtils$initialize$2 INSTANCE = new InjectorUtils$initialize$2();

    InjectorUtils$initialize$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AppExecutors invoke() {
        return new AppExecutors();
    }
}
