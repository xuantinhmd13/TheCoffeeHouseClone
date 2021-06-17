package com.thecoffeehouse.guestapp.screens.base;

import androidx.exifinterface.media.ExifInterface;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.base.BaseActivity;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "run", "com/thecoffeehouse/guestapp/screens/base/BaseActivity$ObserverBaseResource$onChanged$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseActivity.kt */
public final class BaseActivity$ObserverBaseResource$onChanged$$inlined$let$lambda$1 implements Runnable {
    final /* synthetic */ Resource $t$inlined;
    final /* synthetic */ BaseActivity.ObserverBaseResource this$0;

    BaseActivity$ObserverBaseResource$onChanged$$inlined$let$lambda$1(BaseActivity.ObserverBaseResource observerBaseResource, Resource resource) {
        this.this$0 = observerBaseResource;
        this.$t$inlined = resource;
    }

    public final void run() {
        this.this$0.this$0.hideLoading();
    }
}
