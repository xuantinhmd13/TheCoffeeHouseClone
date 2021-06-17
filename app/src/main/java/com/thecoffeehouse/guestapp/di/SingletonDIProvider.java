package com.thecoffeehouse.guestapp.di;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005R\u001b\u0010\u0006\u001a\u00028\u00008FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/di/SingletonDIProvider;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/thecoffeehouse/guestapp/di/DIProvider;", "provider", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "instance", "getInstance", "()Ljava/lang/Object;", "instance$delegate", "Lkotlin/Lazy;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: di.kt */
public final class SingletonDIProvider<T> extends DIProvider<T> {
    private final Lazy instance$delegate;

    public final T getInstance() {
        return (T) this.instance$delegate.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingletonDIProvider(Function0<? extends T> function0) {
        super(function0);
        Intrinsics.checkNotNullParameter(function0, "provider");
        this.instance$delegate = LazyKt.lazy(new SingletonDIProvider$instance$2(function0));
    }
}
