package com.thecoffeehouse.guestapp.di;

import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.TCHApplication;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/di/InjectorUtils;", "", "()V", "initialize", "", "application", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: InjectorUtils.kt */
public final class InjectorUtils {
    public static final InjectorUtils INSTANCE = new InjectorUtils();

    private InjectorUtils() {
    }

    public final void initialize(TCHApplication tCHApplication) {
        Intrinsics.checkNotNullParameter(tCHApplication, "application");
        DIStorage dIStorage = DIStorage.INSTANCE;
        String name = TCHApplication.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "T::class.java.name");
        dIStorage.put(DiKt.DI_SCOPE_GLOBAL, name, new SingletonDIProvider(new InjectorUtils$initialize$1(tCHApplication)));
        DIStorage dIStorage2 = DIStorage.INSTANCE;
        String name2 = AppExecutors.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "T::class.java.name");
        dIStorage2.put(DiKt.DI_SCOPE_GLOBAL, name2, new SingletonDIProvider(InjectorUtils$initialize$2.INSTANCE));
    }
}
