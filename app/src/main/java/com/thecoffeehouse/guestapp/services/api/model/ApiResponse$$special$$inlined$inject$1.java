package com.thecoffeehouse.guestapp.services.api.model;

import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.di.DIProvider;
import com.thecoffeehouse.guestapp.di.DIStorage;
import com.thecoffeehouse.guestapp.di.SingletonDIProvider;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0004\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0002\u0010\fR\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r¸\u0006\u0000"}, d2 = {"com/thecoffeehouse/guestapp/di/DiKt$inject$1", "Lkotlin/properties/ReadOnlyProperty;", "", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: di.kt */
public final class ApiResponse$$special$$inlined$inject$1 implements ReadOnlyProperty<Object, TCHApplication> {
    final /* synthetic */ String $scope;
    private TCHApplication value;

    public ApiResponse$$special$$inlined$inject$1(String str) {
        this.$scope = str;
    }

    public final TCHApplication getValue() {
        return this.value;
    }

    public final void setValue(TCHApplication tCHApplication) {
        this.value = tCHApplication;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public TCHApplication getValue(Object obj, KProperty<?> kProperty) {
        TCHApplication tCHApplication;
        Intrinsics.checkNotNullParameter(kProperty, "property");
        TCHApplication tCHApplication2 = this.value;
        if (tCHApplication2 != null) {
            Intrinsics.checkNotNull(tCHApplication2);
            return tCHApplication2;
        }
        DIStorage dIStorage = DIStorage.INSTANCE;
        String str = this.$scope;
        String name = TCHApplication.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "T::class.java.name");
        DIProvider<Object> dIProvider = dIStorage.get(str, name);
        if (dIProvider != null) {
            if (dIProvider instanceof SingletonDIProvider) {
                Object instance = ((SingletonDIProvider) dIProvider).getInstance();
                Objects.requireNonNull(instance, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.TCHApplication");
                tCHApplication = (TCHApplication) instance;
            } else {
                Object invoke = dIProvider.getProvider().invoke();
                Objects.requireNonNull(invoke, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.TCHApplication");
                tCHApplication = (TCHApplication) invoke;
            }
            this.value = tCHApplication;
            return tCHApplication;
        }
        throw new IllegalStateException("Dependency for property " + kProperty.getName() + ": " + TCHApplication.class.getName() + " not provided.");
    }
}
