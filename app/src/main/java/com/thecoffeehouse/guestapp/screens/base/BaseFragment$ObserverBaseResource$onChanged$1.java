package com.thecoffeehouse.guestapp.screens.base;

import androidx.exifinterface.media.ExifInterface;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "VM", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseFragment.kt */
final class BaseFragment$ObserverBaseResource$onChanged$1 implements Runnable {
    final /* synthetic */ BaseFragment.ObserverBaseResource this$0;

    BaseFragment$ObserverBaseResource$onChanged$1(BaseFragment.ObserverBaseResource observerBaseResource) {
        this.this$0 = observerBaseResource;
    }

    public final void run() {
        this.this$0.this$0.hideLoading();
    }
}
