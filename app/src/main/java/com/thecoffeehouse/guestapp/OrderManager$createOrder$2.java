package com.thecoffeehouse.guestapp;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.CreateOrderRequest;
import com.thecoffeehouse.guestapp.services.api.model.orders.CreateOrderResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\u0014J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0014¨\u0006\t"}, d2 = {"com/thecoffeehouse/guestapp/OrderManager$createOrder$2", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CreateOrderResponse;", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "saveCallResult", "", "item", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderManager.kt */
public final class OrderManager$createOrder$2 extends NetworkBoundResource<CreateOrderResponse, CreateOrderResponse> {
    final /* synthetic */ CreateOrderRequest $createOrderRequest;
    final /* synthetic */ OrderManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderManager$createOrder$2(OrderManager orderManager, CreateOrderRequest createOrderRequest, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = orderManager;
        this.$createOrderRequest = createOrderRequest;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public /* bridge */ /* synthetic */ Unit saveCallResult(CreateOrderResponse createOrderResponse) {
        saveCallResult(createOrderResponse);
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<CreateOrderResponse>> createCall() {
        return this.this$0.getOrderAPIService().createOrder(this.$createOrderRequest);
    }

    /* access modifiers changed from: protected */
    public void saveCallResult(CreateOrderResponse createOrderResponse) {
        Intrinsics.checkNotNullParameter(createOrderResponse, "item");
        if (createOrderResponse.getWarning() == null) {
            OrderManager.access$saveLatestOrderInformation(this.this$0);
            OrderManager.access$getMCalculateOrderRequest$p(this.this$0).setOrderLines(new ArrayList<>());
            MainActivity mainActivity = null;
            OrderManager.access$getMCalculateOrderRequest$p(this.this$0).setCouponCode(null);
            OrderManager.access$getMCalculateOrderRequest$p(this.this$0).setReorder(false);
            CalculateOrderResponse mCalculateOrderResponse = this.this$0.getMCalculateOrderResponse();
            if (mCalculateOrderResponse != null) {
                mCalculateOrderResponse.setOrder(null);
            }
            CalculateOrderResponse mCalculateOrderResponse2 = this.this$0.getMCalculateOrderResponse();
            if (mCalculateOrderResponse2 != null) {
                mCalculateOrderResponse2.setProblems(null);
            }
            CalculateOrderResponse mCalculateOrderResponse3 = this.this$0.getMCalculateOrderResponse();
            if (mCalculateOrderResponse3 != null) {
                mCalculateOrderResponse3.setError(null);
            }
            Activity currentActivity = OrderManager.access$getApplication$p(this.this$0).getCurrentActivity();
            if (currentActivity instanceof MainActivity) {
                mainActivity = currentActivity;
            }
            MainActivity mainActivity2 = mainActivity;
            if (mainActivity2 != null) {
                mainActivity2.resetDynamicLink();
            }
        }
    }
}
