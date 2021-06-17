package com.thecoffeehouse.guestapp.di;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
/* compiled from: di.kt */
public final class SingletonDIProvider$instance$2 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0 $provider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingletonDIProvider$instance$2(Function0 function0) {
        super(0);
        this.$provider = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return (T) this.$provider.invoke();
    }
}
