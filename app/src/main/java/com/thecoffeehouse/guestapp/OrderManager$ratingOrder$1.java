package com.thecoffeehouse.guestapp;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.DataRatingOrderInfo;
import com.thecoffeehouse.guestapp.services.api.model.orders.Feedback;
import com.thecoffeehouse.guestapp.services.api.model.orders.RatingOrderCategory;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.SharePrefs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\u0014J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0014¨\u0006\t"}, d2 = {"com/thecoffeehouse/guestapp/OrderManager$ratingOrder$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "saveCallResult", "", "item", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderManager.kt */
public final class OrderManager$ratingOrder$1 extends NetworkBoundResource<ServerErrorResponse, ServerErrorResponse> {
    final /* synthetic */ DataRatingOrderInfo $ratingOrderInfoResponse;
    final /* synthetic */ OrderManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderManager$ratingOrder$1(OrderManager orderManager, DataRatingOrderInfo dataRatingOrderInfo, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = orderManager;
        this.$ratingOrderInfoResponse = dataRatingOrderInfo;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public /* bridge */ /* synthetic */ Unit saveCallResult(ServerErrorResponse serverErrorResponse) {
        saveCallResult(serverErrorResponse);
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: protected */
    public void saveCallResult(ServerErrorResponse serverErrorResponse) {
        Feedback feedback;
        ArrayList<RatingOrderCategory> categories;
        RatingOrderCategory ratingOrderCategory;
        Intrinsics.checkNotNullParameter(serverErrorResponse, "item");
        GeneralKt.log("rating order");
        if (!SharePrefs.INSTANCE.getBoolean(OrderManager.access$getApplication$p(this.this$0), OrderManager.access$getORDER_LOCAL$p(this.this$0), OrderManager.access$getRATED_GOOGLE_PLAY$p(this.this$0))) {
            DataRatingOrderInfo dataRatingOrderInfo = this.$ratingOrderInfoResponse;
            Integer starAllow = (dataRatingOrderInfo == null || (feedback = dataRatingOrderInfo.getFeedback()) == null || (categories = feedback.getCategories()) == null || (ratingOrderCategory = (RatingOrderCategory) CollectionsKt.firstOrNull(categories)) == null) ? null : ratingOrderCategory.getStarAllow();
            if (starAllow != null && starAllow.intValue() == 5) {
                OrderManager.access$increaseRatingOrderCountInLocal(this.this$0);
            } else {
                OrderManager.access$resetRatingOrderCount(this.this$0);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<ServerErrorResponse>> createCall() {
        return this.this$0.getOrderAPIService().ratingOrder(this.$ratingOrderInfoResponse);
    }
}
