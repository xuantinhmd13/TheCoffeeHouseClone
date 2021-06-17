package com.thecoffeehouse.guestapp.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.di.DiKt;
import com.thecoffeehouse.guestapp.repositories.data.AbsentLiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiErrorResponse;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0017J\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u0017H%J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0015J\u0016\u0010 \u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0015J\u0017\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00028\u0000H\u0015¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0003J\b\u0010'\u001a\u00020(H\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "ResultType", "", "RequestType", "appExecutors", "Lcom/thecoffeehouse/guestapp/AppExecutors;", "(Lcom/thecoffeehouse/guestapp/AppExecutors;)V", "application", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "getApplication", "()Lcom/thecoffeehouse/guestapp/TCHApplication;", "application$delegate", "Lkotlin/properties/ReadOnlyProperty;", "cachedResponseClass", "Ljava/lang/Class;", "getCachedResponseClass", "()Ljava/lang/Class;", "setCachedResponseClass", "(Ljava/lang/Class;)V", "result", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "asLiveData", "Landroidx/lifecycle/LiveData;", "convertRequestToResult", "newData", "(Ljava/lang/Object;)Ljava/lang/Object;", "createCall", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "fetchFromNetwork", "", "loadFromDb", "onErrorResponse", "item", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiErrorResponse;", "saveCallResult", "(Ljava/lang/Object;)Lkotlin/Unit;", "setValue", "newValue", "shouldFetch", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: NetworkBoundResource.kt */
public abstract class NetworkBoundResource<ResultType, RequestType> {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NetworkBoundResource.class, "application", "getApplication()Lcom/thecoffeehouse/guestapp/TCHApplication;", 0))};
    private final AppExecutors appExecutors;
    private final ReadOnlyProperty application$delegate = new NetworkBoundResource$$special$$inlined$inject$1(DiKt.DI_SCOPE_GLOBAL);
    private Class<ResultType> cachedResponseClass;
    private final MediatorLiveData<Resource<ResultType>> result;

    /* access modifiers changed from: private */
    public final TCHApplication getApplication() {
        return (TCHApplication) this.application$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: RequestType */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public ResultType convertRequestToResult(RequestType requesttype) {
        Intrinsics.checkNotNullParameter(requesttype, "newData");
        return requesttype;
    }

    /* access modifiers changed from: protected */
    public abstract LiveData<ApiResponse<RequestType>> createCall();

    /* access modifiers changed from: protected */
    public void onErrorResponse(ApiErrorResponse<RequestType> apiErrorResponse) {
        Intrinsics.checkNotNullParameter(apiErrorResponse, "item");
    }

    /* access modifiers changed from: protected */
    public final boolean shouldFetch() {
        return true;
    }

    public NetworkBoundResource(AppExecutors appExecutors2) {
        Intrinsics.checkNotNullParameter(appExecutors2, "appExecutors");
        this.appExecutors = appExecutors2;
        MediatorLiveData<Resource<ResultType>> mediatorLiveData = new MediatorLiveData<>();
        this.result = mediatorLiveData;
        mediatorLiveData.setValue(Resource.Companion.loading(null));
        if (shouldFetch()) {
            fetchFromNetwork();
        } else {
            mediatorLiveData.addSource(loadFromDb(), new Observer<ResultType>(this) {
                /* class com.thecoffeehouse.guestapp.repositories.NetworkBoundResource.AnonymousClass1 */
                final /* synthetic */ NetworkBoundResource this$0;

                {
                    this.this$0 = r1;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(ResultType resulttype) {
                    this.this$0.setValue(Resource.Companion.success(resulttype));
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void setValue(Resource<? extends ResultType> resource) {
        if (!Intrinsics.areEqual(this.result.getValue(), resource)) {
            this.result.setValue(resource);
        }
    }

    private final void fetchFromNetwork() {
        LiveData<ApiResponse<RequestType>> createCall = createCall();
        this.result.addSource(createCall, new NetworkBoundResource$fetchFromNetwork$1(this, createCall));
    }

    public final LiveData<Resource<ResultType>> asLiveData() {
        MediatorLiveData<Resource<ResultType>> mediatorLiveData = this.result;
        Objects.requireNonNull(mediatorLiveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.thecoffeehouse.guestapp.repositories.Resource<ResultType>>");
        return mediatorLiveData;
    }

    /* access modifiers changed from: protected */
    public Class<ResultType> getCachedResponseClass() {
        return this.cachedResponseClass;
    }

    /* access modifiers changed from: protected */
    public void setCachedResponseClass(Class<ResultType> cls) {
        this.cachedResponseClass = cls;
    }

    /* access modifiers changed from: protected */
    public Unit saveCallResult(ResultType resulttype) {
        Intrinsics.checkNotNullParameter(resulttype, "item");
        return (Unit) BuildersKt.runBlocking(Dispatchers.getIO(), new NetworkBoundResource$saveCallResult$1(this, resulttype, null));
    }

    /* access modifiers changed from: protected */
    public LiveData<ResultType> loadFromDb() {
        if (getCachedResponseClass() == null) {
            return AbsentLiveData.Companion.create();
        }
        Class<ResultType> cachedResponseClass2 = getCachedResponseClass();
        Intrinsics.checkNotNull(cachedResponseClass2);
        String name = cachedResponseClass2.getName();
        Intrinsics.checkNotNullExpressionValue(name, "cachedResponseClass!!.name");
        Class<ResultType> cachedResponseClass3 = getCachedResponseClass();
        Intrinsics.checkNotNull(cachedResponseClass3);
        Object cacheResponse = CacheRequestUtils.INSTANCE.getCacheResponse(getApplication(), name, cachedResponseClass3);
        if (cacheResponse != null) {
            return new MutableLiveData(cacheResponse);
        }
        return AbsentLiveData.Companion.create();
    }
}
