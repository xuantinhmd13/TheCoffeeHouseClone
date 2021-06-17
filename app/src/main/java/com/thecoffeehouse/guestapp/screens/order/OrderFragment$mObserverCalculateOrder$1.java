package com.thecoffeehouse.guestapp.screens.order;

import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.order.OrderFragment;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Problem;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.List;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "resource", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderResponse;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$mObserverCalculateOrder$1<T> implements Observer<Resource<? extends CalculateOrderResponse>> {
    final /* synthetic */ OrderFragment this$0;

    OrderFragment$mObserverCalculateOrder$1(OrderFragment orderFragment) {
        this.this$0 = orderFragment;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Resource<? extends CalculateOrderResponse> resource) {
        onChanged((Resource<CalculateOrderResponse>) resource);
    }

    public final void onChanged(Resource<CalculateOrderResponse> resource) {
        List<Problem> problems;
        ServerError error;
        if (resource != null) {
            int i = OrderFragment.WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                this.this$0.showLoading();
            } else if (i == 2) {
                this.this$0.hideLoading();
                CalculateOrderResponse data = resource.getData();
                if (!(data == null || (problems = data.getProblems()) == null || !(!problems.isEmpty()))) {
                    this.this$0.showProblem(resource.getData());
                }
                CalculateOrderResponse data2 = resource.getData();
                if (data2 != null) {
                    this.this$0.updateCartToAllDialogFragments(data2);
                }
                OrderFragment orderFragment = this.this$0;
                LiveData liveData = orderFragment.getMenuByLatLng(orderFragment.getMProductAdapter().getSelectedMethod(), this.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.getMProductAdapter().getCurrentAtTableInfo());
                OrderFragment orderFragment2 = this.this$0;
                liveData.observe(orderFragment2, orderFragment2.mObserveGetMenuByLatLng);
            } else if (i == 3) {
                this.this$0.hideLoading();
                ServerErrorResponse serverError = resource.getServerError();
                if ((serverError != null ? serverError.getError() : null) == null) {
                    z = false;
                }
                GeneralKt.log(Boolean.valueOf(z));
                ServerErrorResponse serverError2 = resource.getServerError();
                if (!(serverError2 == null || (error = serverError2.getError()) == null)) {
                    GeneralKt.log("showing now!");
                    new AlertDialog.Builder(this.this$0.requireContext()).setTitle(this.this$0.getString(R.string.str_error)).setMessage(error.getMessage()).setPositiveButton(this.this$0.getString(R.string.str_cancel), OrderFragment$mObserverCalculateOrder$1$1$2$1.INSTANCE).show();
                }
                OrderFragment orderFragment3 = this.this$0;
                LiveData liveData2 = orderFragment3.getMenuByLatLng(orderFragment3.getMProductAdapter().getSelectedMethod(), this.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.getMProductAdapter().getCurrentAtTableInfo());
                OrderFragment orderFragment4 = this.this$0;
                liveData2.observe(orderFragment4, orderFragment4.mObserveGetMenuByLatLng);
            }
        }
    }
}
