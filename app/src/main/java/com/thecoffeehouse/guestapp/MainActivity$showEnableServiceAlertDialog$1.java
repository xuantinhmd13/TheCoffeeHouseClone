package com.thecoffeehouse.guestapp;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "resultCallback", "Lcom/google/android/gms/location/LocationSettingsResult;", "onResult"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$showEnableServiceAlertDialog$1<R extends Result> implements ResultCallback<LocationSettingsResult> {
    final /* synthetic */ MainActivity this$0;

    MainActivity$showEnableServiceAlertDialog$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public final void onResult(LocationSettingsResult locationSettingsResult) {
        Intrinsics.checkNotNullParameter(locationSettingsResult, "resultCallback");
        Status status = locationSettingsResult.getStatus();
        Intrinsics.checkNotNullExpressionValue(status, "resultCallback.status");
        if (status.getStatusCode() == 6) {
            try {
                Status status2 = locationSettingsResult.getStatus();
                MainActivity mainActivity = this.this$0;
                status2.startResolutionForResult(mainActivity, mainActivity.LOCATION_REQUEST_CODE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
