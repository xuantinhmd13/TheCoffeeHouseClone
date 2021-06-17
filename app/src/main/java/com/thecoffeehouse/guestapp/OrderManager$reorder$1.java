package com.thecoffeehouse.guestapp;

import androidx.lifecycle.LiveData;
import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderRequest;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.ReorderRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\u0014J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0014¨\u0006\t"}, d2 = {"com/thecoffeehouse/guestapp/OrderManager$reorder$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderResponse;", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "saveCallResult", "", "item", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderManager.kt */
public final class OrderManager$reorder$1 extends NetworkBoundResource<CalculateOrderResponse, CalculateOrderResponse> {
    final /* synthetic */ ReorderRequest $reorderRequest;
    final /* synthetic */ OrderManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderManager$reorder$1(OrderManager orderManager, ReorderRequest reorderRequest, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = orderManager;
        this.$reorderRequest = reorderRequest;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public /* bridge */ /* synthetic */ Unit saveCallResult(CalculateOrderResponse calculateOrderResponse) {
        saveCallResult(calculateOrderResponse);
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: protected */
    public void saveCallResult(CalculateOrderResponse calculateOrderResponse) {
        Intrinsics.checkNotNullParameter(calculateOrderResponse, "item");
        if (calculateOrderResponse.getError() == null) {
            if (calculateOrderResponse.getOrder() != null) {
                try {
                    OrderManager orderManager = this.this$0;
                    Object fromJson = new Gson().fromJson(new Gson().toJson(calculateOrderResponse.getOrder()), CalculateOrderRequest.class);
                    Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(\n       …                        )");
                    OrderManager.access$setMCalculateOrderRequest$p(orderManager, (CalculateOrderRequest) fromJson);
                    OrderManager.access$getMCalculateOrderRequest$p(this.this$0).setReorder(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            OrderManager.access$updateCalculateOrderResponse(this.this$0, calculateOrderResponse);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<CalculateOrderResponse>> createCall() {
        return this.this$0.getOrderAPIService().reorder(this.$reorderRequest);
    }
}
