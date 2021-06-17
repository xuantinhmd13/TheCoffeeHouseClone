package com.thecoffeehouse.guestapp.views;

import androidx.exifinterface.media.ExifInterface;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseFullScreenDialogFragment.kt */
public final class BaseFullScreenDialogFragment$ObserverBaseResource$onChanged$1 implements Runnable {
    final /* synthetic */ BaseFullScreenDialogFragment.ObserverBaseResource this$0;

    BaseFullScreenDialogFragment$ObserverBaseResource$onChanged$1(BaseFullScreenDialogFragment.ObserverBaseResource observerBaseResource) {
        this.this$0 = observerBaseResource;
    }

    public final void run() {
        this.this$0.this$0.hideLoading();
    }
}
