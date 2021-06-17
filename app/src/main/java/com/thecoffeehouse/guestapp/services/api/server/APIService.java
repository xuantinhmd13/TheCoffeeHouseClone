package com.thecoffeehouse.guestapp.services.api.server;

import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.di.DiKt;
import com.thecoffeehouse.guestapp.utility.Retrofit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8DX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/server/APIService;", "", "()V", "application", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "getApplication", "()Lcom/thecoffeehouse/guestapp/TCHApplication;", "application$delegate", "Lkotlin/properties/ReadOnlyProperty;", "baseUrl", "", "retrofit", "Lcom/thecoffeehouse/guestapp/utility/Retrofit;", "getRetrofit", "()Lcom/thecoffeehouse/guestapp/utility/Retrofit;", "retrofit$delegate", "Lkotlin/Lazy;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: APIService.kt */
public class APIService {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(APIService.class, "application", "getApplication()Lcom/thecoffeehouse/guestapp/TCHApplication;", 0))};
    private final ReadOnlyProperty application$delegate = new APIService$$special$$inlined$inject$1(DiKt.DI_SCOPE_GLOBAL);
    private final String baseUrl = "https://api.thecoffeehouse.com/api/v5/";
    private final Lazy retrofit$delegate = LazyKt.lazy(new APIService$retrofit$2(this));

    /* access modifiers changed from: protected */
    public final TCHApplication getApplication() {
        return (TCHApplication) this.application$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* access modifiers changed from: protected */
    public final Retrofit getRetrofit() {
        return (Retrofit) this.retrofit$delegate.getValue();
    }
}
