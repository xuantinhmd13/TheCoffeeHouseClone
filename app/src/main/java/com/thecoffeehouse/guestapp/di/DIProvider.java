package com.thecoffeehouse.guestapp.di;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/di/DIProvider;", ExifInterface.GPS_DIRECTION_TRUE, "", "provider", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "getProvider", "()Lkotlin/jvm/functions/Function0;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: di.kt */
public class DIProvider<T> {
    private final Function0<T> provider;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public DIProvider(Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "provider");
        this.provider = function0;
    }

    public final Function0<T> getProvider() {
        return this.provider;
    }
}
