package com.thecoffeehouse.guestapp.di;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u0002H\u00050\u0003\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\b\u001a2\u0010\u0007\u001a\u00020\b\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u000e\b\b\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\nH\bø\u0001\u0000\u001a2\u0010\u000b\u001a\u00020\b\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u000e\b\b\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\nH\bø\u0001\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\f"}, d2 = {"DI_SCOPE_GLOBAL", "", "inject", "Lkotlin/properties/ReadOnlyProperty;", "", ExifInterface.GPS_DIRECTION_TRUE, "scope", "provide", "", "provider", "Lkotlin/Function0;", "provideSingleton", "app_liveRelease"}, k = 2, mv = {1, 4, 0})
/* compiled from: di.kt */
public final class DiKt {
    public static final String DI_SCOPE_GLOBAL = "#__global";

    public static /* synthetic */ void provide$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = DI_SCOPE_GLOBAL;
        }
        Intrinsics.checkNotNullParameter(str, "scope");
        Intrinsics.checkNotNullParameter(function0, "provider");
        DIStorage dIStorage = DIStorage.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        String name = Object.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "T::class.java.name");
        dIStorage.put(str, name, new DIProvider<>(function0));
    }

    public static final /* synthetic */ <T> void provide(String str, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(str, "scope");
        Intrinsics.checkNotNullParameter(function0, "provider");
        DIStorage dIStorage = DIStorage.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        String name = Object.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "T::class.java.name");
        dIStorage.put(str, name, new DIProvider<>(function0));
    }

    public static /* synthetic */ void provideSingleton$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = DI_SCOPE_GLOBAL;
        }
        Intrinsics.checkNotNullParameter(str, "scope");
        Intrinsics.checkNotNullParameter(function0, "provider");
        DIStorage dIStorage = DIStorage.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        String name = Object.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "T::class.java.name");
        dIStorage.put(str, name, new SingletonDIProvider(function0));
    }

    public static final /* synthetic */ <T> void provideSingleton(String str, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(str, "scope");
        Intrinsics.checkNotNullParameter(function0, "provider");
        DIStorage dIStorage = DIStorage.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        String name = Object.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "T::class.java.name");
        dIStorage.put(str, name, new SingletonDIProvider(function0));
    }

    public static /* synthetic */ ReadOnlyProperty inject$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = DI_SCOPE_GLOBAL;
        }
        Intrinsics.checkNotNullParameter(str, "scope");
        Intrinsics.needClassReification();
        return new DiKt$inject$1(str);
    }

    public static final /* synthetic */ <T> ReadOnlyProperty<Object, T> inject(String str) {
        Intrinsics.checkNotNullParameter(str, "scope");
        Intrinsics.needClassReification();
        return new DiKt$inject$1(str);
    }
}
