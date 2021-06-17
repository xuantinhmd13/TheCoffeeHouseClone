package com.thecoffeehouse.guestapp;

import androidx.lifecycle.Observer;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "metadata", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/GetMetadataResponse;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$availableShippingMethods$1<T> implements Observer<GetMetadataResponse> {
    final /* synthetic */ Function1 $onAvailable;

    MainActivity$availableShippingMethods$1(Function1 function1) {
        this.$onAvailable = function1;
    }

    public final void onChanged(GetMetadataResponse getMetadataResponse) {
        Function1 function1 = this.$onAvailable;
        ArrayList<String> shippingMethods = getMetadataResponse.getShippingMethods();
        if (shippingMethods == null) {
            shippingMethods = new ArrayList<>();
        }
        function1.invoke(shippingMethods);
    }
}
